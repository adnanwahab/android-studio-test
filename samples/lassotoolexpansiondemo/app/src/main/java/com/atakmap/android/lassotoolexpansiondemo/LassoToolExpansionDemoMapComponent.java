
package com.atakmap.android.lassotoolexpansiondemo;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;

import com.atakmap.android.maps.MapView;
import com.atakmap.android.dropdown.DropDownMapComponent;

import com.atakmap.android.missionpackage.lasso.LassoSelectionReceiver;
import com.atakmap.coremap.log.Log;
import com.atakmap.android.lassotoolexpansiondemo.plugin.R;

import java.util.List;
import java.util.UUID;

public class LassoToolExpansionDemoMapComponent extends DropDownMapComponent {

    private static final String TAG = "LassoToolExpansionDemoMapComponent";

    private Context pluginContext;

    private LassoSelectionReceiver.ExternalLassoCapability elc;

    public void onCreate(final Context context, Intent intent,
            final MapView view) {

        context.setTheme(R.style.ATAKPluginTheme);
        super.onCreate(context, intent, view);
        pluginContext = context;

        LassoSelectionReceiver.registerExternalLassoCapability(elc = new LassoSelectionReceiver.ExternalLassoCapability() {
            @Override
            public String getUniqueIdentifier() {
                return UUID.randomUUID().toString();
            }

            @Override
            public Drawable getIcon() {
                return pluginContext.getDrawable(R.drawable.ic_launcher);
            }

            @Override
            public String getTitle() {
                return "Sample";
            }

            @Override
            public void process(List<Object> list) {

                    for (Object o: list) {
                        Log.d(TAG, "object: " + o);
                    }

            }
        });
    }

    @Override
    protected void onDestroyImpl(Context context, MapView view) {
        super.onDestroyImpl(context, view);
        LassoSelectionReceiver.unregisterExternalLassoCapability(elc);
    }

}
