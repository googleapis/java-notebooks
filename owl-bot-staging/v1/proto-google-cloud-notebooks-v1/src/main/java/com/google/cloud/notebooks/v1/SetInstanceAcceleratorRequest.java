// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1/service.proto

package com.google.cloud.notebooks.v1;

/**
 * <pre>
 * Request for setting instance accelerator.
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1.SetInstanceAcceleratorRequest}
 */
public final class SetInstanceAcceleratorRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1.SetInstanceAcceleratorRequest)
    SetInstanceAcceleratorRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetInstanceAcceleratorRequest.newBuilder() to construct.
  private SetInstanceAcceleratorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetInstanceAcceleratorRequest() {
    name_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetInstanceAcceleratorRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetInstanceAcceleratorRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 24: {

            coreCount_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.notebooks.v1.NotebooksProto.internal_static_google_cloud_notebooks_v1_SetInstanceAcceleratorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1.NotebooksProto.internal_static_google_cloud_notebooks_v1_SetInstanceAcceleratorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest.class, com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <pre>
   * Required. Type of this accelerator.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.Instance.AcceleratorType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Required. Type of this accelerator.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.Instance.AcceleratorType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The type.
   */
  @java.lang.Override public com.google.cloud.notebooks.v1.Instance.AcceleratorType getType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.notebooks.v1.Instance.AcceleratorType result = com.google.cloud.notebooks.v1.Instance.AcceleratorType.valueOf(type_);
    return result == null ? com.google.cloud.notebooks.v1.Instance.AcceleratorType.UNRECOGNIZED : result;
  }

  public static final int CORE_COUNT_FIELD_NUMBER = 3;
  private long coreCount_;
  /**
   * <pre>
   * Required. Count of cores of this accelerator. Note that not all combinations
   * of `type` and `core_count` are valid. Check [GPUs on
   * Compute Engine](https://cloud.google.com/compute/docs/gpus/#gpus-list) to
   * find a valid combination. TPUs are not supported.
   * </pre>
   *
   * <code>int64 core_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The coreCount.
   */
  @java.lang.Override
  public long getCoreCount() {
    return coreCount_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (type_ != com.google.cloud.notebooks.v1.Instance.AcceleratorType.ACCELERATOR_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (coreCount_ != 0L) {
      output.writeInt64(3, coreCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (type_ != com.google.cloud.notebooks.v1.Instance.AcceleratorType.ACCELERATOR_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (coreCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, coreCount_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest other = (com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (type_ != other.type_) return false;
    if (getCoreCount()
        != other.getCoreCount()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + CORE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCoreCount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest prototype) {
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
   * Request for setting instance accelerator.
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1.SetInstanceAcceleratorRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1.SetInstanceAcceleratorRequest)
      com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.notebooks.v1.NotebooksProto.internal_static_google_cloud_notebooks_v1_SetInstanceAcceleratorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1.NotebooksProto.internal_static_google_cloud_notebooks_v1_SetInstanceAcceleratorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest.class, com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      type_ = 0;

      coreCount_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.notebooks.v1.NotebooksProto.internal_static_google_cloud_notebooks_v1_SetInstanceAcceleratorRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest build() {
      com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest buildPartial() {
      com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest result = new com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest(this);
      result.name_ = name_;
      result.type_ = type_;
      result.coreCount_ = coreCount_;
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
      if (other instanceof com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest) {
        return mergeFrom((com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest other) {
      if (other == com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getCoreCount() != 0L) {
        setCoreCount(other.getCoreCount());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * Required. Type of this accelerator.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.Instance.AcceleratorType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Required. Type of this accelerator.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.Instance.AcceleratorType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Type of this accelerator.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.Instance.AcceleratorType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.cloud.notebooks.v1.Instance.AcceleratorType getType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.notebooks.v1.Instance.AcceleratorType result = com.google.cloud.notebooks.v1.Instance.AcceleratorType.valueOf(type_);
      return result == null ? com.google.cloud.notebooks.v1.Instance.AcceleratorType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. Type of this accelerator.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.Instance.AcceleratorType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.cloud.notebooks.v1.Instance.AcceleratorType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Type of this accelerator.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.Instance.AcceleratorType type = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private long coreCount_ ;
    /**
     * <pre>
     * Required. Count of cores of this accelerator. Note that not all combinations
     * of `type` and `core_count` are valid. Check [GPUs on
     * Compute Engine](https://cloud.google.com/compute/docs/gpus/#gpus-list) to
     * find a valid combination. TPUs are not supported.
     * </pre>
     *
     * <code>int64 core_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The coreCount.
     */
    @java.lang.Override
    public long getCoreCount() {
      return coreCount_;
    }
    /**
     * <pre>
     * Required. Count of cores of this accelerator. Note that not all combinations
     * of `type` and `core_count` are valid. Check [GPUs on
     * Compute Engine](https://cloud.google.com/compute/docs/gpus/#gpus-list) to
     * find a valid combination. TPUs are not supported.
     * </pre>
     *
     * <code>int64 core_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The coreCount to set.
     * @return This builder for chaining.
     */
    public Builder setCoreCount(long value) {
      
      coreCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Count of cores of this accelerator. Note that not all combinations
     * of `type` and `core_count` are valid. Check [GPUs on
     * Compute Engine](https://cloud.google.com/compute/docs/gpus/#gpus-list) to
     * find a valid combination. TPUs are not supported.
     * </pre>
     *
     * <code>int64 core_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCoreCount() {
      
      coreCount_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1.SetInstanceAcceleratorRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1.SetInstanceAcceleratorRequest)
  private static final com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest();
  }

  public static com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetInstanceAcceleratorRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetInstanceAcceleratorRequest>() {
    @java.lang.Override
    public SetInstanceAcceleratorRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetInstanceAcceleratorRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetInstanceAcceleratorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetInstanceAcceleratorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1.SetInstanceAcceleratorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

