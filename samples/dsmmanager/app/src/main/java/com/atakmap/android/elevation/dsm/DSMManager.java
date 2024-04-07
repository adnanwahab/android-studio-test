
package com.atakmap.android.elevation.dsm;

import androidx.annotation.NonNull;

import com.atakmap.coremap.conversions.Span;
import com.atakmap.coremap.filesystem.FileSystemUtils;
import com.atakmap.coremap.log.Log;
import com.atakmap.map.elevation.ElevationData;
import com.atakmap.map.layer.raster.DatasetDescriptor;
import com.atakmap.map.layer.raster.DatasetDescriptorSpiArgs;
import com.atakmap.map.layer.raster.ImageDatasetDescriptor;
import com.atakmap.map.layer.raster.gdal.GdalLayerInfo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class DSMManager {
    private DSMManager() {
    }

    final static public String TAG = "DSMManager";

    private static File[] dsmDirs;
    private static DSMDatabase db;
    private static int _model = ElevationData.MODEL_SURFACE;
    private static Span _span = Span.METER;
    private static String _reference = "HAE";

    public static void initialize() {
        try {
            File primaryDsmDir = FileSystemUtils.getItem("tools/dsm");
            if (!primaryDsmDir.exists()) {
                if (!primaryDsmDir.mkdir()) {
                    Log.d(TAG, "error creating dsm directory");
                }
            }
        } catch (Exception e) {
            Log.d(TAG, "error creating dsm directory", e);
        }
        dsmDirs = FileSystemUtils.getItems("tools/dsm");
        db = new DSMDatabase(FileSystemUtils.getItem("Databases/dsm.db"));
    }

    public static void teardown() {
        dsmDirs = null;
        if (db != null) {
            db.close();
            db = null;
        }
    }

    public static DSMDatabase getDb() {
        return db;
    }

    /**
     * Sets the defaults used by the DSM Manager when importing a new dataset
     * @param model the model from ElevationData constancts
     * @param span the span (meters or feet)
     * @param reference the reference (HAE or MSL)
     *
     *
     */
    public static void setDefaults(final int model, final Span span, @NonNull final String reference) {
        _model = model;
        _span = span;
        _reference = reference;
    }

    public static void refresh() {
        db.validateCatalog();
        refreshImpl(dsmDirs);
    }

    private static void refreshImpl(File[] files) {
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    File[] children = file.listFiles();
                    if (children != null)
                        refreshImpl(children);
                } else if (!db.contains(file.getAbsolutePath())) {
                    // parse out elevation info
                    final ElevationInfo parsed = parse(file);
                    if (parsed != null)
                        db.insert(parsed);
                }
            }
        }
    }

    private static ElevationInfo parse(File file) {
        try {
            // use the GDAL dataset handler to the parsing
            Set<DatasetDescriptor> descs = GdalLayerInfo.INSTANCE
                    .create(new DatasetDescriptorSpiArgs(file, null));
            if (descs == null || descs.isEmpty())
                return null;

            // XXX - 
            for (DatasetDescriptor desc : descs) {
                if (!(desc instanceof ImageDatasetDescriptor))
                    continue;

                ImageDatasetDescriptor image = (ImageDatasetDescriptor) desc;
                return new ElevationInfo(
                        GdalLayerInfo.getGdalFriendlyUri(image),
                        "geotiff",
                        image.getUpperLeft(),
                        image.getUpperRight(),
                        image.getLowerRight(),
                        image.getLowerLeft(),
                        image.getMinResolution(null),
                        image.getMaxResolution(null),
                        image.getWidth(),
                        image.getHeight(),
                        image.getSpatialReferenceID(),
                        _model,
                        _reference,
                        _span,
                        null);
            }

            return null;
        } catch (Throwable t) {
            // XXX - log error
            return null;
        }
    }

    static Map<String, ElevationCache> caches = null;

    public static ElevationCache getCache(ElevationInfo info) {
        if (caches == null) {
            caches = new HashMap<>();
            File d = FileSystemUtils.getItem("tmp");
            if (d.exists())
                FileSystemUtils.delete(d);
        }

        ElevationCache retval = caches.get(info.path);
        if (retval == null) {
            File d = FileSystemUtils.getItem("tmp");
            d.mkdir();

            try {
                retval = new ElevationCache(
                        File.createTempFile("elevation", ".cache", d)
                                .getAbsolutePath());
                caches.put(info.path, retval);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return retval;
    }
}
