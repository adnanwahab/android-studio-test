// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student.proto

package com.atakmap.android.sampledetailtester.proto;

/**
 * Protobuf type {@code com.atakmap.android.sampledetailtester.proto.Period}
 */
public  final class Period extends
    com.google.protobuf.GeneratedMessageLite<
        Period, Period.Builder> implements
    // @@protoc_insertion_point(message_implements:com.atakmap.android.sampledetailtester.proto.Period)
    PeriodOrBuilder {
  private Period() {
    teacher_ = "";
    room_ = "";
  }
  public static final int NUMBER_FIELD_NUMBER = 1;
  private int number_;
  /**
   * <code>int32 number = 1;</code>
   */
  public int getNumber() {
    return number_;
  }
  /**
   * <code>int32 number = 1;</code>
   */
  private void setNumber(int value) {
    
    number_ = value;
  }
  /**
   * <code>int32 number = 1;</code>
   */
  private void clearNumber() {
    
    number_ = 0;
  }

  public static final int ABSENCES_FIELD_NUMBER = 2;
  private int absences_;
  /**
   * <code>int32 absences = 2;</code>
   */
  public int getAbsences() {
    return absences_;
  }
  /**
   * <code>int32 absences = 2;</code>
   */
  private void setAbsences(int value) {
    
    absences_ = value;
  }
  /**
   * <code>int32 absences = 2;</code>
   */
  private void clearAbsences() {
    
    absences_ = 0;
  }

  public static final int TEACHER_FIELD_NUMBER = 3;
  private java.lang.String teacher_;
  /**
   * <code>string teacher = 3;</code>
   */
  public java.lang.String getTeacher() {
    return teacher_;
  }
  /**
   * <code>string teacher = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTeacherBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(teacher_);
  }
  /**
   * <code>string teacher = 3;</code>
   */
  private void setTeacher(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    teacher_ = value;
  }
  /**
   * <code>string teacher = 3;</code>
   */
  private void clearTeacher() {
    
    teacher_ = getDefaultInstance().getTeacher();
  }
  /**
   * <code>string teacher = 3;</code>
   */
  private void setTeacherBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    teacher_ = value.toStringUtf8();
  }

  public static final int GPS_FIELD_NUMBER = 4;
  private double gps_;
  /**
   * <code>double gps = 4;</code>
   */
  public double getGps() {
    return gps_;
  }
  /**
   * <code>double gps = 4;</code>
   */
  private void setGps(double value) {
    
    gps_ = value;
  }
  /**
   * <code>double gps = 4;</code>
   */
  private void clearGps() {
    
    gps_ = 0D;
  }

  public static final int ROOM_FIELD_NUMBER = 5;
  private java.lang.String room_;
  /**
   * <code>string room = 5;</code>
   */
  public java.lang.String getRoom() {
    return room_;
  }
  /**
   * <code>string room = 5;</code>
   */
  public com.google.protobuf.ByteString
      getRoomBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(room_);
  }
  /**
   * <code>string room = 5;</code>
   */
  private void setRoom(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    room_ = value;
  }
  /**
   * <code>string room = 5;</code>
   */
  private void clearRoom() {
    
    room_ = getDefaultInstance().getRoom();
  }
  /**
   * <code>string room = 5;</code>
   */
  private void setRoomBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    room_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (number_ != 0) {
      output.writeInt32(1, number_);
    }
    if (absences_ != 0) {
      output.writeInt32(2, absences_);
    }
    if (!teacher_.isEmpty()) {
      output.writeString(3, getTeacher());
    }
    if (gps_ != 0D) {
      output.writeDouble(4, gps_);
    }
    if (!room_.isEmpty()) {
      output.writeString(5, getRoom());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (number_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, number_);
    }
    if (absences_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, absences_);
    }
    if (!teacher_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getTeacher());
    }
    if (gps_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, gps_);
    }
    if (!room_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(5, getRoom());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.atakmap.android.sampledetailtester.proto.Period parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.atakmap.android.sampledetailtester.proto.Period parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.atakmap.android.sampledetailtester.proto.Period parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.atakmap.android.sampledetailtester.proto.Period parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.atakmap.android.sampledetailtester.proto.Period parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.atakmap.android.sampledetailtester.proto.Period parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.atakmap.android.sampledetailtester.proto.Period parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.atakmap.android.sampledetailtester.proto.Period parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.atakmap.android.sampledetailtester.proto.Period parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.atakmap.android.sampledetailtester.proto.Period parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.atakmap.android.sampledetailtester.proto.Period parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.atakmap.android.sampledetailtester.proto.Period parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.atakmap.android.sampledetailtester.proto.Period prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code com.atakmap.android.sampledetailtester.proto.Period}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.atakmap.android.sampledetailtester.proto.Period, Builder> implements
      // @@protoc_insertion_point(builder_implements:com.atakmap.android.sampledetailtester.proto.Period)
      com.atakmap.android.sampledetailtester.proto.PeriodOrBuilder {
    // Construct using com.atakmap.android.sampledetailtester.proto.Period.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>int32 number = 1;</code>
     */
    public int getNumber() {
      return instance.getNumber();
    }
    /**
     * <code>int32 number = 1;</code>
     */
    public Builder setNumber(int value) {
      copyOnWrite();
      instance.setNumber(value);
      return this;
    }
    /**
     * <code>int32 number = 1;</code>
     */
    public Builder clearNumber() {
      copyOnWrite();
      instance.clearNumber();
      return this;
    }

    /**
     * <code>int32 absences = 2;</code>
     */
    public int getAbsences() {
      return instance.getAbsences();
    }
    /**
     * <code>int32 absences = 2;</code>
     */
    public Builder setAbsences(int value) {
      copyOnWrite();
      instance.setAbsences(value);
      return this;
    }
    /**
     * <code>int32 absences = 2;</code>
     */
    public Builder clearAbsences() {
      copyOnWrite();
      instance.clearAbsences();
      return this;
    }

    /**
     * <code>string teacher = 3;</code>
     */
    public java.lang.String getTeacher() {
      return instance.getTeacher();
    }
    /**
     * <code>string teacher = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTeacherBytes() {
      return instance.getTeacherBytes();
    }
    /**
     * <code>string teacher = 3;</code>
     */
    public Builder setTeacher(
        java.lang.String value) {
      copyOnWrite();
      instance.setTeacher(value);
      return this;
    }
    /**
     * <code>string teacher = 3;</code>
     */
    public Builder clearTeacher() {
      copyOnWrite();
      instance.clearTeacher();
      return this;
    }
    /**
     * <code>string teacher = 3;</code>
     */
    public Builder setTeacherBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTeacherBytes(value);
      return this;
    }

    /**
     * <code>double gps = 4;</code>
     */
    public double getGps() {
      return instance.getGps();
    }
    /**
     * <code>double gps = 4;</code>
     */
    public Builder setGps(double value) {
      copyOnWrite();
      instance.setGps(value);
      return this;
    }
    /**
     * <code>double gps = 4;</code>
     */
    public Builder clearGps() {
      copyOnWrite();
      instance.clearGps();
      return this;
    }

    /**
     * <code>string room = 5;</code>
     */
    public java.lang.String getRoom() {
      return instance.getRoom();
    }
    /**
     * <code>string room = 5;</code>
     */
    public com.google.protobuf.ByteString
        getRoomBytes() {
      return instance.getRoomBytes();
    }
    /**
     * <code>string room = 5;</code>
     */
    public Builder setRoom(
        java.lang.String value) {
      copyOnWrite();
      instance.setRoom(value);
      return this;
    }
    /**
     * <code>string room = 5;</code>
     */
    public Builder clearRoom() {
      copyOnWrite();
      instance.clearRoom();
      return this;
    }
    /**
     * <code>string room = 5;</code>
     */
    public Builder setRoomBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setRoomBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:com.atakmap.android.sampledetailtester.proto.Period)
  }
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.atakmap.android.sampledetailtester.proto.Period();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.atakmap.android.sampledetailtester.proto.Period other = (com.atakmap.android.sampledetailtester.proto.Period) arg1;
        number_ = visitor.visitInt(number_ != 0, number_,
            other.number_ != 0, other.number_);
        absences_ = visitor.visitInt(absences_ != 0, absences_,
            other.absences_ != 0, other.absences_);
        teacher_ = visitor.visitString(!teacher_.isEmpty(), teacher_,
            !other.teacher_.isEmpty(), other.teacher_);
        gps_ = visitor.visitDouble(gps_ != 0D, gps_,
            other.gps_ != 0D, other.gps_);
        room_ = visitor.visitString(!room_.isEmpty(), room_,
            !other.room_.isEmpty(), other.room_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(tag, input)) {
                  done = true;
                }
                break;
              }
              case 8: {

                number_ = input.readInt32();
                break;
              }
              case 16: {

                absences_ = input.readInt32();
                break;
              }
              case 26: {
                java.lang.String s = input.readStringRequireUtf8();

                teacher_ = s;
                break;
              }
              case 33: {

                gps_ = input.readDouble();
                break;
              }
              case 42: {
                java.lang.String s = input.readStringRequireUtf8();

                room_ = s;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.atakmap.android.sampledetailtester.proto.Period.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:com.atakmap.android.sampledetailtester.proto.Period)
  private static final com.atakmap.android.sampledetailtester.proto.Period DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Period();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.atakmap.android.sampledetailtester.proto.Period getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Period> PARSER;

  public static com.google.protobuf.Parser<Period> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
