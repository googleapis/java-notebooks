// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1/diagnostic_config.proto

package com.google.cloud.notebooks.v1;

/**
 * <pre>
 * Defines flags that are used to run the diagnostic tool
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1.DiagnosticConfig}
 */
public final class DiagnosticConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1.DiagnosticConfig)
    DiagnosticConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DiagnosticConfig.newBuilder() to construct.
  private DiagnosticConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DiagnosticConfig() {
    gcsBucket_ = "";
    relativePath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DiagnosticConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.notebooks.v1.DiagnosticConfigProto.internal_static_google_cloud_notebooks_v1_DiagnosticConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1.DiagnosticConfigProto.internal_static_google_cloud_notebooks_v1_DiagnosticConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1.DiagnosticConfig.class, com.google.cloud.notebooks.v1.DiagnosticConfig.Builder.class);
  }

  public static final int GCS_BUCKET_FIELD_NUMBER = 1;
  private volatile java.lang.Object gcsBucket_;
  /**
   * <pre>
   * Required. User Cloud Storage bucket location (REQUIRED)
   * ## Must be formatted with path prefix (gs://$GCS_BUCKET)
   * Permissions:
   * User Managed Notebooks:
   * - storage.buckets.writer: Must be given to the project's service account
   * attached to VM.
   * Google Managed Notebooks:
   * - storage.buckets.writer: Must be given to the project's service account or
   * ## user credentials attached to VM depending on authentication mode.
   * Cloud Storage bucket Log file will be written to
   * gs://$GCS_BUCKET/$RELATIVE_PATH/$VM_DATE_$TIME.tar.gz
   * </pre>
   *
   * <code>string gcs_bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The gcsBucket.
   */
  @java.lang.Override
  public java.lang.String getGcsBucket() {
    java.lang.Object ref = gcsBucket_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gcsBucket_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. User Cloud Storage bucket location (REQUIRED)
   * ## Must be formatted with path prefix (gs://$GCS_BUCKET)
   * Permissions:
   * User Managed Notebooks:
   * - storage.buckets.writer: Must be given to the project's service account
   * attached to VM.
   * Google Managed Notebooks:
   * - storage.buckets.writer: Must be given to the project's service account or
   * ## user credentials attached to VM depending on authentication mode.
   * Cloud Storage bucket Log file will be written to
   * gs://$GCS_BUCKET/$RELATIVE_PATH/$VM_DATE_$TIME.tar.gz
   * </pre>
   *
   * <code>string gcs_bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for gcsBucket.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGcsBucketBytes() {
    java.lang.Object ref = gcsBucket_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gcsBucket_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RELATIVE_PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object relativePath_;
  /**
   * <pre>
   * Optional. Defines the relative storage path in the Cloud Storage bucket where the
   * diagnostic logs will be written: Default path will be the root directory of
   * the Cloud Storage bucket (gs://$GCS_BUCKET/$DATE_$TIME.tar.gz) Example of
   * full path where Log file will be written: gs://$GCS_BUCKET/$RELATIVE_PATH/
   * </pre>
   *
   * <code>string relative_path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The relativePath.
   */
  @java.lang.Override
  public java.lang.String getRelativePath() {
    java.lang.Object ref = relativePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      relativePath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. Defines the relative storage path in the Cloud Storage bucket where the
   * diagnostic logs will be written: Default path will be the root directory of
   * the Cloud Storage bucket (gs://$GCS_BUCKET/$DATE_$TIME.tar.gz) Example of
   * full path where Log file will be written: gs://$GCS_BUCKET/$RELATIVE_PATH/
   * </pre>
   *
   * <code>string relative_path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for relativePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRelativePathBytes() {
    java.lang.Object ref = relativePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      relativePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REPAIR_FLAG_ENABLED_FIELD_NUMBER = 3;
  private boolean repairFlagEnabled_;
  /**
   * <pre>
   * Optional. Enables flag to repair service for instance
   * </pre>
   *
   * <code>bool repair_flag_enabled = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The repairFlagEnabled.
   */
  @java.lang.Override
  public boolean getRepairFlagEnabled() {
    return repairFlagEnabled_;
  }

  public static final int PACKET_CAPTURE_FLAG_ENABLED_FIELD_NUMBER = 4;
  private boolean packetCaptureFlagEnabled_;
  /**
   * <pre>
   * Optional. Enables flag to capture packets from the instance for 30 seconds
   * </pre>
   *
   * <code>bool packet_capture_flag_enabled = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The packetCaptureFlagEnabled.
   */
  @java.lang.Override
  public boolean getPacketCaptureFlagEnabled() {
    return packetCaptureFlagEnabled_;
  }

  public static final int COPY_HOME_FILES_FLAG_ENABLED_FIELD_NUMBER = 5;
  private boolean copyHomeFilesFlagEnabled_;
  /**
   * <pre>
   * Optional. Enables flag to copy all `/home/jupyter` folder contents
   * </pre>
   *
   * <code>bool copy_home_files_flag_enabled = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The copyHomeFilesFlagEnabled.
   */
  @java.lang.Override
  public boolean getCopyHomeFilesFlagEnabled() {
    return copyHomeFilesFlagEnabled_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gcsBucket_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, gcsBucket_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(relativePath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, relativePath_);
    }
    if (repairFlagEnabled_ != false) {
      output.writeBool(3, repairFlagEnabled_);
    }
    if (packetCaptureFlagEnabled_ != false) {
      output.writeBool(4, packetCaptureFlagEnabled_);
    }
    if (copyHomeFilesFlagEnabled_ != false) {
      output.writeBool(5, copyHomeFilesFlagEnabled_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gcsBucket_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, gcsBucket_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(relativePath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, relativePath_);
    }
    if (repairFlagEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, repairFlagEnabled_);
    }
    if (packetCaptureFlagEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, packetCaptureFlagEnabled_);
    }
    if (copyHomeFilesFlagEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, copyHomeFilesFlagEnabled_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.notebooks.v1.DiagnosticConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1.DiagnosticConfig other = (com.google.cloud.notebooks.v1.DiagnosticConfig) obj;

    if (!getGcsBucket()
        .equals(other.getGcsBucket())) return false;
    if (!getRelativePath()
        .equals(other.getRelativePath())) return false;
    if (getRepairFlagEnabled()
        != other.getRepairFlagEnabled()) return false;
    if (getPacketCaptureFlagEnabled()
        != other.getPacketCaptureFlagEnabled()) return false;
    if (getCopyHomeFilesFlagEnabled()
        != other.getCopyHomeFilesFlagEnabled()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GCS_BUCKET_FIELD_NUMBER;
    hash = (53 * hash) + getGcsBucket().hashCode();
    hash = (37 * hash) + RELATIVE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getRelativePath().hashCode();
    hash = (37 * hash) + REPAIR_FLAG_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRepairFlagEnabled());
    hash = (37 * hash) + PACKET_CAPTURE_FLAG_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPacketCaptureFlagEnabled());
    hash = (37 * hash) + COPY_HOME_FILES_FLAG_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCopyHomeFilesFlagEnabled());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1.DiagnosticConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.notebooks.v1.DiagnosticConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.DiagnosticConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.notebooks.v1.DiagnosticConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.DiagnosticConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.notebooks.v1.DiagnosticConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.DiagnosticConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.notebooks.v1.DiagnosticConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.DiagnosticConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.notebooks.v1.DiagnosticConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.DiagnosticConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.notebooks.v1.DiagnosticConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.notebooks.v1.DiagnosticConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Defines flags that are used to run the diagnostic tool
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1.DiagnosticConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1.DiagnosticConfig)
      com.google.cloud.notebooks.v1.DiagnosticConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.notebooks.v1.DiagnosticConfigProto.internal_static_google_cloud_notebooks_v1_DiagnosticConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1.DiagnosticConfigProto.internal_static_google_cloud_notebooks_v1_DiagnosticConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1.DiagnosticConfig.class, com.google.cloud.notebooks.v1.DiagnosticConfig.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1.DiagnosticConfig.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      gcsBucket_ = "";

      relativePath_ = "";

      repairFlagEnabled_ = false;

      packetCaptureFlagEnabled_ = false;

      copyHomeFilesFlagEnabled_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.notebooks.v1.DiagnosticConfigProto.internal_static_google_cloud_notebooks_v1_DiagnosticConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.DiagnosticConfig getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1.DiagnosticConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.DiagnosticConfig build() {
      com.google.cloud.notebooks.v1.DiagnosticConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.DiagnosticConfig buildPartial() {
      com.google.cloud.notebooks.v1.DiagnosticConfig result = new com.google.cloud.notebooks.v1.DiagnosticConfig(this);
      result.gcsBucket_ = gcsBucket_;
      result.relativePath_ = relativePath_;
      result.repairFlagEnabled_ = repairFlagEnabled_;
      result.packetCaptureFlagEnabled_ = packetCaptureFlagEnabled_;
      result.copyHomeFilesFlagEnabled_ = copyHomeFilesFlagEnabled_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.notebooks.v1.DiagnosticConfig) {
        return mergeFrom((com.google.cloud.notebooks.v1.DiagnosticConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v1.DiagnosticConfig other) {
      if (other == com.google.cloud.notebooks.v1.DiagnosticConfig.getDefaultInstance()) return this;
      if (!other.getGcsBucket().isEmpty()) {
        gcsBucket_ = other.gcsBucket_;
        onChanged();
      }
      if (!other.getRelativePath().isEmpty()) {
        relativePath_ = other.relativePath_;
        onChanged();
      }
      if (other.getRepairFlagEnabled() != false) {
        setRepairFlagEnabled(other.getRepairFlagEnabled());
      }
      if (other.getPacketCaptureFlagEnabled() != false) {
        setPacketCaptureFlagEnabled(other.getPacketCaptureFlagEnabled());
      }
      if (other.getCopyHomeFilesFlagEnabled() != false) {
        setCopyHomeFilesFlagEnabled(other.getCopyHomeFilesFlagEnabled());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
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
            case 10: {
              gcsBucket_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              relativePath_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 24: {
              repairFlagEnabled_ = input.readBool();

              break;
            } // case 24
            case 32: {
              packetCaptureFlagEnabled_ = input.readBool();

              break;
            } // case 32
            case 40: {
              copyHomeFilesFlagEnabled_ = input.readBool();

              break;
            } // case 40
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object gcsBucket_ = "";
    /**
     * <pre>
     * Required. User Cloud Storage bucket location (REQUIRED)
     * ## Must be formatted with path prefix (gs://$GCS_BUCKET)
     * Permissions:
     * User Managed Notebooks:
     * - storage.buckets.writer: Must be given to the project's service account
     * attached to VM.
     * Google Managed Notebooks:
     * - storage.buckets.writer: Must be given to the project's service account or
     * ## user credentials attached to VM depending on authentication mode.
     * Cloud Storage bucket Log file will be written to
     * gs://$GCS_BUCKET/$RELATIVE_PATH/$VM_DATE_$TIME.tar.gz
     * </pre>
     *
     * <code>string gcs_bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The gcsBucket.
     */
    public java.lang.String getGcsBucket() {
      java.lang.Object ref = gcsBucket_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gcsBucket_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. User Cloud Storage bucket location (REQUIRED)
     * ## Must be formatted with path prefix (gs://$GCS_BUCKET)
     * Permissions:
     * User Managed Notebooks:
     * - storage.buckets.writer: Must be given to the project's service account
     * attached to VM.
     * Google Managed Notebooks:
     * - storage.buckets.writer: Must be given to the project's service account or
     * ## user credentials attached to VM depending on authentication mode.
     * Cloud Storage bucket Log file will be written to
     * gs://$GCS_BUCKET/$RELATIVE_PATH/$VM_DATE_$TIME.tar.gz
     * </pre>
     *
     * <code>string gcs_bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for gcsBucket.
     */
    public com.google.protobuf.ByteString
        getGcsBucketBytes() {
      java.lang.Object ref = gcsBucket_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gcsBucket_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. User Cloud Storage bucket location (REQUIRED)
     * ## Must be formatted with path prefix (gs://$GCS_BUCKET)
     * Permissions:
     * User Managed Notebooks:
     * - storage.buckets.writer: Must be given to the project's service account
     * attached to VM.
     * Google Managed Notebooks:
     * - storage.buckets.writer: Must be given to the project's service account or
     * ## user credentials attached to VM depending on authentication mode.
     * Cloud Storage bucket Log file will be written to
     * gs://$GCS_BUCKET/$RELATIVE_PATH/$VM_DATE_$TIME.tar.gz
     * </pre>
     *
     * <code>string gcs_bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The gcsBucket to set.
     * @return This builder for chaining.
     */
    public Builder setGcsBucket(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gcsBucket_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. User Cloud Storage bucket location (REQUIRED)
     * ## Must be formatted with path prefix (gs://$GCS_BUCKET)
     * Permissions:
     * User Managed Notebooks:
     * - storage.buckets.writer: Must be given to the project's service account
     * attached to VM.
     * Google Managed Notebooks:
     * - storage.buckets.writer: Must be given to the project's service account or
     * ## user credentials attached to VM depending on authentication mode.
     * Cloud Storage bucket Log file will be written to
     * gs://$GCS_BUCKET/$RELATIVE_PATH/$VM_DATE_$TIME.tar.gz
     * </pre>
     *
     * <code>string gcs_bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearGcsBucket() {
      
      gcsBucket_ = getDefaultInstance().getGcsBucket();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. User Cloud Storage bucket location (REQUIRED)
     * ## Must be formatted with path prefix (gs://$GCS_BUCKET)
     * Permissions:
     * User Managed Notebooks:
     * - storage.buckets.writer: Must be given to the project's service account
     * attached to VM.
     * Google Managed Notebooks:
     * - storage.buckets.writer: Must be given to the project's service account or
     * ## user credentials attached to VM depending on authentication mode.
     * Cloud Storage bucket Log file will be written to
     * gs://$GCS_BUCKET/$RELATIVE_PATH/$VM_DATE_$TIME.tar.gz
     * </pre>
     *
     * <code>string gcs_bucket = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for gcsBucket to set.
     * @return This builder for chaining.
     */
    public Builder setGcsBucketBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gcsBucket_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object relativePath_ = "";
    /**
     * <pre>
     * Optional. Defines the relative storage path in the Cloud Storage bucket where the
     * diagnostic logs will be written: Default path will be the root directory of
     * the Cloud Storage bucket (gs://$GCS_BUCKET/$DATE_$TIME.tar.gz) Example of
     * full path where Log file will be written: gs://$GCS_BUCKET/$RELATIVE_PATH/
     * </pre>
     *
     * <code>string relative_path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The relativePath.
     */
    public java.lang.String getRelativePath() {
      java.lang.Object ref = relativePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        relativePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. Defines the relative storage path in the Cloud Storage bucket where the
     * diagnostic logs will be written: Default path will be the root directory of
     * the Cloud Storage bucket (gs://$GCS_BUCKET/$DATE_$TIME.tar.gz) Example of
     * full path where Log file will be written: gs://$GCS_BUCKET/$RELATIVE_PATH/
     * </pre>
     *
     * <code>string relative_path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for relativePath.
     */
    public com.google.protobuf.ByteString
        getRelativePathBytes() {
      java.lang.Object ref = relativePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        relativePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. Defines the relative storage path in the Cloud Storage bucket where the
     * diagnostic logs will be written: Default path will be the root directory of
     * the Cloud Storage bucket (gs://$GCS_BUCKET/$DATE_$TIME.tar.gz) Example of
     * full path where Log file will be written: gs://$GCS_BUCKET/$RELATIVE_PATH/
     * </pre>
     *
     * <code>string relative_path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The relativePath to set.
     * @return This builder for chaining.
     */
    public Builder setRelativePath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      relativePath_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Defines the relative storage path in the Cloud Storage bucket where the
     * diagnostic logs will be written: Default path will be the root directory of
     * the Cloud Storage bucket (gs://$GCS_BUCKET/$DATE_$TIME.tar.gz) Example of
     * full path where Log file will be written: gs://$GCS_BUCKET/$RELATIVE_PATH/
     * </pre>
     *
     * <code>string relative_path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearRelativePath() {
      
      relativePath_ = getDefaultInstance().getRelativePath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Defines the relative storage path in the Cloud Storage bucket where the
     * diagnostic logs will be written: Default path will be the root directory of
     * the Cloud Storage bucket (gs://$GCS_BUCKET/$DATE_$TIME.tar.gz) Example of
     * full path where Log file will be written: gs://$GCS_BUCKET/$RELATIVE_PATH/
     * </pre>
     *
     * <code>string relative_path = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for relativePath to set.
     * @return This builder for chaining.
     */
    public Builder setRelativePathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      relativePath_ = value;
      onChanged();
      return this;
    }

    private boolean repairFlagEnabled_ ;
    /**
     * <pre>
     * Optional. Enables flag to repair service for instance
     * </pre>
     *
     * <code>bool repair_flag_enabled = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The repairFlagEnabled.
     */
    @java.lang.Override
    public boolean getRepairFlagEnabled() {
      return repairFlagEnabled_;
    }
    /**
     * <pre>
     * Optional. Enables flag to repair service for instance
     * </pre>
     *
     * <code>bool repair_flag_enabled = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The repairFlagEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setRepairFlagEnabled(boolean value) {
      
      repairFlagEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Enables flag to repair service for instance
     * </pre>
     *
     * <code>bool repair_flag_enabled = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearRepairFlagEnabled() {
      
      repairFlagEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean packetCaptureFlagEnabled_ ;
    /**
     * <pre>
     * Optional. Enables flag to capture packets from the instance for 30 seconds
     * </pre>
     *
     * <code>bool packet_capture_flag_enabled = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The packetCaptureFlagEnabled.
     */
    @java.lang.Override
    public boolean getPacketCaptureFlagEnabled() {
      return packetCaptureFlagEnabled_;
    }
    /**
     * <pre>
     * Optional. Enables flag to capture packets from the instance for 30 seconds
     * </pre>
     *
     * <code>bool packet_capture_flag_enabled = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The packetCaptureFlagEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setPacketCaptureFlagEnabled(boolean value) {
      
      packetCaptureFlagEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Enables flag to capture packets from the instance for 30 seconds
     * </pre>
     *
     * <code>bool packet_capture_flag_enabled = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearPacketCaptureFlagEnabled() {
      
      packetCaptureFlagEnabled_ = false;
      onChanged();
      return this;
    }

    private boolean copyHomeFilesFlagEnabled_ ;
    /**
     * <pre>
     * Optional. Enables flag to copy all `/home/jupyter` folder contents
     * </pre>
     *
     * <code>bool copy_home_files_flag_enabled = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The copyHomeFilesFlagEnabled.
     */
    @java.lang.Override
    public boolean getCopyHomeFilesFlagEnabled() {
      return copyHomeFilesFlagEnabled_;
    }
    /**
     * <pre>
     * Optional. Enables flag to copy all `/home/jupyter` folder contents
     * </pre>
     *
     * <code>bool copy_home_files_flag_enabled = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The copyHomeFilesFlagEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setCopyHomeFilesFlagEnabled(boolean value) {
      
      copyHomeFilesFlagEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Enables flag to copy all `/home/jupyter` folder contents
     * </pre>
     *
     * <code>bool copy_home_files_flag_enabled = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearCopyHomeFilesFlagEnabled() {
      
      copyHomeFilesFlagEnabled_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1.DiagnosticConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1.DiagnosticConfig)
  private static final com.google.cloud.notebooks.v1.DiagnosticConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1.DiagnosticConfig();
  }

  public static com.google.cloud.notebooks.v1.DiagnosticConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiagnosticConfig>
      PARSER = new com.google.protobuf.AbstractParser<DiagnosticConfig>() {
    @java.lang.Override
    public DiagnosticConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<DiagnosticConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiagnosticConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1.DiagnosticConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

