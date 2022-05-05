/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1beta1/instance.proto

package com.google.cloud.notebooks.v1beta1;

public final class InstanceProto {
  private InstanceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1beta1_Instance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1beta1_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1beta1_Instance_AcceleratorConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1beta1_Instance_AcceleratorConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1beta1_Instance_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1beta1_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1beta1_Instance_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1beta1_Instance_MetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/notebooks/v1beta1/instanc"
          + "e.proto\022\036google.cloud.notebooks.v1beta1\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\0320google/cloud/notebo"
          + "oks/v1beta1/environment.proto\032\037google/pr"
          + "otobuf/timestamp.proto\032\034google/api/annot"
          + "ations.proto\"\274\020\n\010Instance\022\021\n\004name\030\001 \001(\tB"
          + "\003\340A\003\022;\n\010vm_image\030\002 \001(\0132\'.google.cloud.no"
          + "tebooks.v1beta1.VmImageH\000\022I\n\017container_i"
          + "mage\030\003 \001(\0132..google.cloud.notebooks.v1be"
          + "ta1.ContainerImageH\000\022\033\n\023post_startup_scr"
          + "ipt\030\004 \001(\t\022\026\n\tproxy_uri\030\005 \001(\tB\003\340A\003\022\034\n\017ins"
          + "tance_owners\030\006 \003(\tB\003\340A\004\022\027\n\017service_accou"
          + "nt\030\007 \001(\t\022\031\n\014machine_type\030\010 \001(\tB\003\340A\002\022V\n\022a"
          + "ccelerator_config\030\t \001(\0132:.google.cloud.n"
          + "otebooks.v1beta1.Instance.AcceleratorCon"
          + "fig\022B\n\005state\030\n \001(\0162..google.cloud.notebo"
          + "oks.v1beta1.Instance.StateB\003\340A\003\022\032\n\022insta"
          + "ll_gpu_driver\030\013 \001(\010\022\036\n\026custom_gpu_driver"
          + "_path\030\014 \001(\t\022N\n\016boot_disk_type\030\r \001(\01621.go"
          + "ogle.cloud.notebooks.v1beta1.Instance.Di"
          + "skTypeB\003\340A\004\022\036\n\021boot_disk_size_gb\030\016 \001(\003B\003"
          + "\340A\004\022N\n\016data_disk_type\030\031 \001(\01621.google.clo"
          + "ud.notebooks.v1beta1.Instance.DiskTypeB\003"
          + "\340A\004\022\036\n\021data_disk_size_gb\030\032 \001(\003B\003\340A\004\022 \n\023n"
          + "o_remove_data_disk\030\033 \001(\010B\003\340A\004\022U\n\017disk_en"
          + "cryption\030\017 \001(\01627.google.cloud.notebooks."
          + "v1beta1.Instance.DiskEncryptionB\003\340A\004\022\024\n\007"
          + "kms_key\030\020 \001(\tB\003\340A\004\022\024\n\014no_public_ip\030\021 \001(\010"
          + "\022\027\n\017no_proxy_access\030\022 \001(\010\022\017\n\007network\030\023 \001"
          + "(\t\022\016\n\006subnet\030\024 \001(\t\022D\n\006labels\030\025 \003(\01324.goo"
          + "gle.cloud.notebooks.v1beta1.Instance.Lab"
          + "elsEntry\022H\n\010metadata\030\026 \003(\01326.google.clou"
          + "d.notebooks.v1beta1.Instance.MetadataEnt"
          + "ry\0224\n\013create_time\030\027 \001(\0132\032.google.protobu"
          + "f.TimestampB\003\340A\003\0224\n\013update_time\030\030 \001(\0132\032."
          + "google.protobuf.TimestampB\003\340A\003\032o\n\021Accele"
          + "ratorConfig\022F\n\004type\030\001 \001(\01628.google.cloud"
          + ".notebooks.v1beta1.Instance.AcceleratorT"
          + "ype\022\022\n\ncore_count\030\002 \001(\003\032-\n\013LabelsEntry\022\013"
          + "\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032/\n\rMetada"
          + "taEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\""
          + "\206\002\n\017AcceleratorType\022 \n\034ACCELERATOR_TYPE_"
          + "UNSPECIFIED\020\000\022\024\n\020NVIDIA_TESLA_K80\020\001\022\025\n\021N"
          + "VIDIA_TESLA_P100\020\002\022\025\n\021NVIDIA_TESLA_V100\020"
          + "\003\022\023\n\017NVIDIA_TESLA_P4\020\004\022\023\n\017NVIDIA_TESLA_T"
          + "4\020\005\022\027\n\023NVIDIA_TESLA_T4_VWS\020\010\022\031\n\025NVIDIA_T"
          + "ESLA_P100_VWS\020\t\022\027\n\023NVIDIA_TESLA_P4_VWS\020\n"
          + "\022\n\n\006TPU_V2\020\006\022\n\n\006TPU_V3\020\007\"\244\001\n\005State\022\025\n\021ST"
          + "ATE_UNSPECIFIED\020\000\022\014\n\010STARTING\020\001\022\020\n\014PROVI"
          + "SIONING\020\002\022\n\n\006ACTIVE\020\003\022\014\n\010STOPPING\020\004\022\013\n\007S"
          + "TOPPED\020\005\022\013\n\007DELETED\020\006\022\r\n\tUPGRADING\020\007\022\020\n\014"
          + "INITIALIZING\020\010\022\017\n\013REGISTERING\020\t\"S\n\010DiskT"
          + "ype\022\031\n\025DISK_TYPE_UNSPECIFIED\020\000\022\017\n\013PD_STA"
          + "NDARD\020\001\022\n\n\006PD_SSD\020\002\022\017\n\013PD_BALANCED\020\003\"E\n\016"
          + "DiskEncryption\022\037\n\033DISK_ENCRYPTION_UNSPEC"
          + "IFIED\020\000\022\010\n\004GMEK\020\001\022\010\n\004CMEK\020\002:O\352AL\n!notebo"
          + "oks.googleapis.com/Instance\022\'projects/{p"
          + "roject}/instances/{instance}B\r\n\013environm"
          + "entB\344\001\n\"com.google.cloud.notebooks.v1bet"
          + "a1B\rInstanceProtoP\001ZGgoogle.golang.org/g"
          + "enproto/googleapis/cloud/notebooks/v1bet"
          + "a1;notebooks\252\002\036Google.Cloud.Notebooks.V1"
          + "Beta1\312\002\036Google\\Cloud\\Notebooks\\V1beta1\352\002"
          + "!Google::Cloud::Notebooks::V1beta1b\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.notebooks.v1beta1.EnvironmentProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_notebooks_v1beta1_Instance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_notebooks_v1beta1_Instance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1beta1_Instance_descriptor,
            new java.lang.String[] {
              "Name",
              "VmImage",
              "ContainerImage",
              "PostStartupScript",
              "ProxyUri",
              "InstanceOwners",
              "ServiceAccount",
              "MachineType",
              "AcceleratorConfig",
              "State",
              "InstallGpuDriver",
              "CustomGpuDriverPath",
              "BootDiskType",
              "BootDiskSizeGb",
              "DataDiskType",
              "DataDiskSizeGb",
              "NoRemoveDataDisk",
              "DiskEncryption",
              "KmsKey",
              "NoPublicIp",
              "NoProxyAccess",
              "Network",
              "Subnet",
              "Labels",
              "Metadata",
              "CreateTime",
              "UpdateTime",
              "Environment",
            });
    internal_static_google_cloud_notebooks_v1beta1_Instance_AcceleratorConfig_descriptor =
        internal_static_google_cloud_notebooks_v1beta1_Instance_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_notebooks_v1beta1_Instance_AcceleratorConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1beta1_Instance_AcceleratorConfig_descriptor,
            new java.lang.String[] {
              "Type", "CoreCount",
            });
    internal_static_google_cloud_notebooks_v1beta1_Instance_LabelsEntry_descriptor =
        internal_static_google_cloud_notebooks_v1beta1_Instance_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_notebooks_v1beta1_Instance_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1beta1_Instance_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_notebooks_v1beta1_Instance_MetadataEntry_descriptor =
        internal_static_google_cloud_notebooks_v1beta1_Instance_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_notebooks_v1beta1_Instance_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1beta1_Instance_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.notebooks.v1beta1.EnvironmentProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
