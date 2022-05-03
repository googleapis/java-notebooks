// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1beta1/environment.proto

package com.google.cloud.notebooks.v1beta1;

public final class EnvironmentProto {
  private EnvironmentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1beta1_Environment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1beta1_Environment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1beta1_VmImage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1beta1_VmImage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1beta1_ContainerImage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1beta1_ContainerImage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/notebooks/v1beta1/environ" +
      "ment.proto\022\036google.cloud.notebooks.v1bet" +
      "a1\032\037google/api/field_behavior.proto\032\031goo" +
      "gle/api/resource.proto\032\037google/protobuf/" +
      "timestamp.proto\032\034google/api/annotations." +
      "proto\"\216\003\n\013Environment\022\021\n\004name\030\001 \001(\tB\003\340A\003" +
      "\022\024\n\014display_name\030\002 \001(\t\022\023\n\013description\030\003 " +
      "\001(\t\022;\n\010vm_image\030\006 \001(\0132\'.google.cloud.not" +
      "ebooks.v1beta1.VmImageH\000\022I\n\017container_im" +
      "age\030\007 \001(\0132..google.cloud.notebooks.v1bet" +
      "a1.ContainerImageH\000\022\033\n\023post_startup_scri" +
      "pt\030\010 \001(\t\0224\n\013create_time\030\t \001(\0132\032.google.p" +
      "rotobuf.TimestampB\003\340A\003:X\352AU\n$notebooks.g" +
      "oogleapis.com/Environment\022-projects/{pro" +
      "ject}/environments/{environment}B\014\n\nimag" +
      "e_type\"V\n\007VmImage\022\024\n\007project\030\001 \001(\tB\003\340A\002\022" +
      "\024\n\nimage_name\030\002 \001(\tH\000\022\026\n\014image_family\030\003 " +
      "\001(\tH\000B\007\n\005image\"6\n\016ContainerImage\022\027\n\nrepo" +
      "sitory\030\001 \001(\tB\003\340A\002\022\013\n\003tag\030\002 \001(\tB\347\001\n\"com.g" +
      "oogle.cloud.notebooks.v1beta1B\020Environme" +
      "ntProtoP\001ZGgoogle.golang.org/genproto/go" +
      "ogleapis/cloud/notebooks/v1beta1;noteboo" +
      "ks\252\002\036Google.Cloud.Notebooks.V1Beta1\312\002\036Go" +
      "ogle\\Cloud\\Notebooks\\V1beta1\352\002!Google::C" +
      "loud::Notebooks::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_cloud_notebooks_v1beta1_Environment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_notebooks_v1beta1_Environment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1beta1_Environment_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "VmImage", "ContainerImage", "PostStartupScript", "CreateTime", "ImageType", });
    internal_static_google_cloud_notebooks_v1beta1_VmImage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_notebooks_v1beta1_VmImage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1beta1_VmImage_descriptor,
        new java.lang.String[] { "Project", "ImageName", "ImageFamily", "Image", });
    internal_static_google_cloud_notebooks_v1beta1_ContainerImage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_notebooks_v1beta1_ContainerImage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1beta1_ContainerImage_descriptor,
        new java.lang.String[] { "Repository", "Tag", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}