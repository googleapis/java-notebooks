// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1/managed_service.proto

package com.google.cloud.notebooks.v1;

/**
 * <pre>
 * Request for switching a Managed Notebook Runtime.
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1.SwitchRuntimeRequest}
 */
public final class SwitchRuntimeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1.SwitchRuntimeRequest)
    SwitchRuntimeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SwitchRuntimeRequest.newBuilder() to construct.
  private SwitchRuntimeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SwitchRuntimeRequest() {
    name_ = "";
    machineType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SwitchRuntimeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SwitchRuntimeRequest(
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            machineType_ = s;
            break;
          }
          case 26: {
            com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.Builder subBuilder = null;
            if (acceleratorConfig_ != null) {
              subBuilder = acceleratorConfig_.toBuilder();
            }
            acceleratorConfig_ = input.readMessage(com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(acceleratorConfig_);
              acceleratorConfig_ = subBuilder.buildPartial();
            }

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
    return com.google.cloud.notebooks.v1.ManagedNotebooksProto.internal_static_google_cloud_notebooks_v1_SwitchRuntimeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1.ManagedNotebooksProto.internal_static_google_cloud_notebooks_v1_SwitchRuntimeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1.SwitchRuntimeRequest.class, com.google.cloud.notebooks.v1.SwitchRuntimeRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/runtimes/{runtime_id}`
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
   * `projects/{project_id}/locations/{location}/runtimes/{runtime_id}`
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

  public static final int MACHINE_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object machineType_;
  /**
   * <pre>
   * machine type.
   * </pre>
   *
   * <code>string machine_type = 2;</code>
   * @return The machineType.
   */
  @java.lang.Override
  public java.lang.String getMachineType() {
    java.lang.Object ref = machineType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      machineType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * machine type.
   * </pre>
   *
   * <code>string machine_type = 2;</code>
   * @return The bytes for machineType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMachineTypeBytes() {
    java.lang.Object ref = machineType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      machineType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCELERATOR_CONFIG_FIELD_NUMBER = 3;
  private com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig acceleratorConfig_;
  /**
   * <pre>
   * accelerator config.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig accelerator_config = 3;</code>
   * @return Whether the acceleratorConfig field is set.
   */
  @java.lang.Override
  public boolean hasAcceleratorConfig() {
    return acceleratorConfig_ != null;
  }
  /**
   * <pre>
   * accelerator config.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig accelerator_config = 3;</code>
   * @return The acceleratorConfig.
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig getAcceleratorConfig() {
    return acceleratorConfig_ == null ? com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.getDefaultInstance() : acceleratorConfig_;
  }
  /**
   * <pre>
   * accelerator config.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig accelerator_config = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v1.RuntimeAcceleratorConfigOrBuilder getAcceleratorConfigOrBuilder() {
    return getAcceleratorConfig();
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
    if (!getMachineTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, machineType_);
    }
    if (acceleratorConfig_ != null) {
      output.writeMessage(3, getAcceleratorConfig());
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
    if (!getMachineTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, machineType_);
    }
    if (acceleratorConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAcceleratorConfig());
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
    if (!(obj instanceof com.google.cloud.notebooks.v1.SwitchRuntimeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1.SwitchRuntimeRequest other = (com.google.cloud.notebooks.v1.SwitchRuntimeRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getMachineType()
        .equals(other.getMachineType())) return false;
    if (hasAcceleratorConfig() != other.hasAcceleratorConfig()) return false;
    if (hasAcceleratorConfig()) {
      if (!getAcceleratorConfig()
          .equals(other.getAcceleratorConfig())) return false;
    }
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
    hash = (37 * hash) + MACHINE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMachineType().hashCode();
    if (hasAcceleratorConfig()) {
      hash = (37 * hash) + ACCELERATOR_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getAcceleratorConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1.SwitchRuntimeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.notebooks.v1.SwitchRuntimeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.SwitchRuntimeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.notebooks.v1.SwitchRuntimeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.SwitchRuntimeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.notebooks.v1.SwitchRuntimeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.SwitchRuntimeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.notebooks.v1.SwitchRuntimeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.SwitchRuntimeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.notebooks.v1.SwitchRuntimeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.notebooks.v1.SwitchRuntimeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.notebooks.v1.SwitchRuntimeRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.notebooks.v1.SwitchRuntimeRequest prototype) {
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
   * Request for switching a Managed Notebook Runtime.
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1.SwitchRuntimeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1.SwitchRuntimeRequest)
      com.google.cloud.notebooks.v1.SwitchRuntimeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.notebooks.v1.ManagedNotebooksProto.internal_static_google_cloud_notebooks_v1_SwitchRuntimeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1.ManagedNotebooksProto.internal_static_google_cloud_notebooks_v1_SwitchRuntimeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1.SwitchRuntimeRequest.class, com.google.cloud.notebooks.v1.SwitchRuntimeRequest.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1.SwitchRuntimeRequest.newBuilder()
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

      machineType_ = "";

      if (acceleratorConfigBuilder_ == null) {
        acceleratorConfig_ = null;
      } else {
        acceleratorConfig_ = null;
        acceleratorConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.notebooks.v1.ManagedNotebooksProto.internal_static_google_cloud_notebooks_v1_SwitchRuntimeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.SwitchRuntimeRequest getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1.SwitchRuntimeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.SwitchRuntimeRequest build() {
      com.google.cloud.notebooks.v1.SwitchRuntimeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.SwitchRuntimeRequest buildPartial() {
      com.google.cloud.notebooks.v1.SwitchRuntimeRequest result = new com.google.cloud.notebooks.v1.SwitchRuntimeRequest(this);
      result.name_ = name_;
      result.machineType_ = machineType_;
      if (acceleratorConfigBuilder_ == null) {
        result.acceleratorConfig_ = acceleratorConfig_;
      } else {
        result.acceleratorConfig_ = acceleratorConfigBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.notebooks.v1.SwitchRuntimeRequest) {
        return mergeFrom((com.google.cloud.notebooks.v1.SwitchRuntimeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v1.SwitchRuntimeRequest other) {
      if (other == com.google.cloud.notebooks.v1.SwitchRuntimeRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getMachineType().isEmpty()) {
        machineType_ = other.machineType_;
        onChanged();
      }
      if (other.hasAcceleratorConfig()) {
        mergeAcceleratorConfig(other.getAcceleratorConfig());
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
      com.google.cloud.notebooks.v1.SwitchRuntimeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.notebooks.v1.SwitchRuntimeRequest) e.getUnfinishedMessage();
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
     * `projects/{project_id}/locations/{location}/runtimes/{runtime_id}`
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
     * `projects/{project_id}/locations/{location}/runtimes/{runtime_id}`
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
     * `projects/{project_id}/locations/{location}/runtimes/{runtime_id}`
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
     * `projects/{project_id}/locations/{location}/runtimes/{runtime_id}`
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
     * `projects/{project_id}/locations/{location}/runtimes/{runtime_id}`
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

    private java.lang.Object machineType_ = "";
    /**
     * <pre>
     * machine type.
     * </pre>
     *
     * <code>string machine_type = 2;</code>
     * @return The machineType.
     */
    public java.lang.String getMachineType() {
      java.lang.Object ref = machineType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        machineType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * machine type.
     * </pre>
     *
     * <code>string machine_type = 2;</code>
     * @return The bytes for machineType.
     */
    public com.google.protobuf.ByteString
        getMachineTypeBytes() {
      java.lang.Object ref = machineType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        machineType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * machine type.
     * </pre>
     *
     * <code>string machine_type = 2;</code>
     * @param value The machineType to set.
     * @return This builder for chaining.
     */
    public Builder setMachineType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      machineType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * machine type.
     * </pre>
     *
     * <code>string machine_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMachineType() {
      
      machineType_ = getDefaultInstance().getMachineType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * machine type.
     * </pre>
     *
     * <code>string machine_type = 2;</code>
     * @param value The bytes for machineType to set.
     * @return This builder for chaining.
     */
    public Builder setMachineTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      machineType_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig acceleratorConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig, com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.Builder, com.google.cloud.notebooks.v1.RuntimeAcceleratorConfigOrBuilder> acceleratorConfigBuilder_;
    /**
     * <pre>
     * accelerator config.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig accelerator_config = 3;</code>
     * @return Whether the acceleratorConfig field is set.
     */
    public boolean hasAcceleratorConfig() {
      return acceleratorConfigBuilder_ != null || acceleratorConfig_ != null;
    }
    /**
     * <pre>
     * accelerator config.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig accelerator_config = 3;</code>
     * @return The acceleratorConfig.
     */
    public com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig getAcceleratorConfig() {
      if (acceleratorConfigBuilder_ == null) {
        return acceleratorConfig_ == null ? com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.getDefaultInstance() : acceleratorConfig_;
      } else {
        return acceleratorConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * accelerator config.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig accelerator_config = 3;</code>
     */
    public Builder setAcceleratorConfig(com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig value) {
      if (acceleratorConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        acceleratorConfig_ = value;
        onChanged();
      } else {
        acceleratorConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * accelerator config.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig accelerator_config = 3;</code>
     */
    public Builder setAcceleratorConfig(
        com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.Builder builderForValue) {
      if (acceleratorConfigBuilder_ == null) {
        acceleratorConfig_ = builderForValue.build();
        onChanged();
      } else {
        acceleratorConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * accelerator config.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig accelerator_config = 3;</code>
     */
    public Builder mergeAcceleratorConfig(com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig value) {
      if (acceleratorConfigBuilder_ == null) {
        if (acceleratorConfig_ != null) {
          acceleratorConfig_ =
            com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.newBuilder(acceleratorConfig_).mergeFrom(value).buildPartial();
        } else {
          acceleratorConfig_ = value;
        }
        onChanged();
      } else {
        acceleratorConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * accelerator config.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig accelerator_config = 3;</code>
     */
    public Builder clearAcceleratorConfig() {
      if (acceleratorConfigBuilder_ == null) {
        acceleratorConfig_ = null;
        onChanged();
      } else {
        acceleratorConfig_ = null;
        acceleratorConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * accelerator config.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig accelerator_config = 3;</code>
     */
    public com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.Builder getAcceleratorConfigBuilder() {
      
      onChanged();
      return getAcceleratorConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * accelerator config.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig accelerator_config = 3;</code>
     */
    public com.google.cloud.notebooks.v1.RuntimeAcceleratorConfigOrBuilder getAcceleratorConfigOrBuilder() {
      if (acceleratorConfigBuilder_ != null) {
        return acceleratorConfigBuilder_.getMessageOrBuilder();
      } else {
        return acceleratorConfig_ == null ?
            com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.getDefaultInstance() : acceleratorConfig_;
      }
    }
    /**
     * <pre>
     * accelerator config.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAcceleratorConfig accelerator_config = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig, com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.Builder, com.google.cloud.notebooks.v1.RuntimeAcceleratorConfigOrBuilder> 
        getAcceleratorConfigFieldBuilder() {
      if (acceleratorConfigBuilder_ == null) {
        acceleratorConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig, com.google.cloud.notebooks.v1.RuntimeAcceleratorConfig.Builder, com.google.cloud.notebooks.v1.RuntimeAcceleratorConfigOrBuilder>(
                getAcceleratorConfig(),
                getParentForChildren(),
                isClean());
        acceleratorConfig_ = null;
      }
      return acceleratorConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1.SwitchRuntimeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1.SwitchRuntimeRequest)
  private static final com.google.cloud.notebooks.v1.SwitchRuntimeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1.SwitchRuntimeRequest();
  }

  public static com.google.cloud.notebooks.v1.SwitchRuntimeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SwitchRuntimeRequest>
      PARSER = new com.google.protobuf.AbstractParser<SwitchRuntimeRequest>() {
    @java.lang.Override
    public SwitchRuntimeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SwitchRuntimeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SwitchRuntimeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SwitchRuntimeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1.SwitchRuntimeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

