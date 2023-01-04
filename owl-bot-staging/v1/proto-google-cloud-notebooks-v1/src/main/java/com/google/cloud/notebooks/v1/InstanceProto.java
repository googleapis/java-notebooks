// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1/instance.proto

package com.google.cloud.notebooks.v1;

public final class InstanceProto {
  private InstanceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_ReservationAffinity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_ReservationAffinity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_Instance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_Instance_AcceleratorConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_Instance_AcceleratorConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_Instance_Disk_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_Instance_Disk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_Instance_Disk_GuestOsFeature_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_Instance_Disk_GuestOsFeature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_Instance_ShieldedInstanceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_Instance_ShieldedInstanceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_Instance_UpgradeHistoryEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_Instance_UpgradeHistoryEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_Instance_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_notebooks_v1_Instance_MetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_Instance_MetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/notebooks/v1/instance.pro" +
      "to\022\031google.cloud.notebooks.v1\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\032+google/cloud/notebooks/v1/env" +
      "ironment.proto\032\037google/protobuf/timestam" +
      "p.proto\"\371\001\n\023ReservationAffinity\022Z\n\030consu" +
      "me_reservation_type\030\001 \001(\01623.google.cloud" +
      ".notebooks.v1.ReservationAffinity.TypeB\003" +
      "\340A\001\022\020\n\003key\030\002 \001(\tB\003\340A\001\022\023\n\006values\030\003 \003(\tB\003\340" +
      "A\001\"_\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\022\n\016NO_R" +
      "ESERVATION\020\001\022\023\n\017ANY_RESERVATION\020\002\022\030\n\024SPE" +
      "CIFIC_RESERVATION\020\003\"\255\034\n\010Instance\022\021\n\004name" +
      "\030\001 \001(\tB\003\340A\003\0226\n\010vm_image\030\002 \001(\0132\".google.c" +
      "loud.notebooks.v1.VmImageH\000\022D\n\017container" +
      "_image\030\003 \001(\0132).google.cloud.notebooks.v1" +
      ".ContainerImageH\000\022\033\n\023post_startup_script" +
      "\030\004 \001(\t\022\026\n\tproxy_uri\030\005 \001(\tB\003\340A\003\022\034\n\017instan" +
      "ce_owners\030\006 \003(\tB\003\340A\004\022\027\n\017service_account\030" +
      "\007 \001(\t\022#\n\026service_account_scopes\030\037 \003(\tB\003\340" +
      "A\001\022\031\n\014machine_type\030\010 \001(\tB\003\340A\002\022Q\n\022acceler" +
      "ator_config\030\t \001(\01325.google.cloud.noteboo" +
      "ks.v1.Instance.AcceleratorConfig\022=\n\005stat" +
      "e\030\n \001(\0162).google.cloud.notebooks.v1.Inst" +
      "ance.StateB\003\340A\003\022\032\n\022install_gpu_driver\030\013 " +
      "\001(\010\022\036\n\026custom_gpu_driver_path\030\014 \001(\t\022I\n\016b" +
      "oot_disk_type\030\r \001(\0162,.google.cloud.noteb" +
      "ooks.v1.Instance.DiskTypeB\003\340A\004\022\036\n\021boot_d" +
      "isk_size_gb\030\016 \001(\003B\003\340A\004\022I\n\016data_disk_type" +
      "\030\031 \001(\0162,.google.cloud.notebooks.v1.Insta" +
      "nce.DiskTypeB\003\340A\004\022\036\n\021data_disk_size_gb\030\032" +
      " \001(\003B\003\340A\004\022 \n\023no_remove_data_disk\030\033 \001(\010B\003" +
      "\340A\004\022P\n\017disk_encryption\030\017 \001(\01622.google.cl" +
      "oud.notebooks.v1.Instance.DiskEncryption" +
      "B\003\340A\004\022\024\n\007kms_key\030\020 \001(\tB\003\340A\004\022<\n\005disks\030\034 \003" +
      "(\0132(.google.cloud.notebooks.v1.Instance." +
      "DiskB\003\340A\003\022a\n\030shielded_instance_config\030\036 " +
      "\001(\0132:.google.cloud.notebooks.v1.Instance" +
      ".ShieldedInstanceConfigB\003\340A\001\022\024\n\014no_publi" +
      "c_ip\030\021 \001(\010\022\027\n\017no_proxy_access\030\022 \001(\010\022\017\n\007n" +
      "etwork\030\023 \001(\t\022\016\n\006subnet\030\024 \001(\t\022?\n\006labels\030\025" +
      " \003(\0132/.google.cloud.notebooks.v1.Instanc" +
      "e.LabelsEntry\022C\n\010metadata\030\026 \003(\01321.google" +
      ".cloud.notebooks.v1.Instance.MetadataEnt" +
      "ry\022\021\n\004tags\030  \003(\tB\003\340A\001\022P\n\017upgrade_history" +
      "\030\035 \003(\01327.google.cloud.notebooks.v1.Insta" +
      "nce.UpgradeHistoryEntry\022B\n\010nic_type\030! \001(" +
      "\0162+.google.cloud.notebooks.v1.Instance.N" +
      "icTypeB\003\340A\001\022Q\n\024reservation_affinity\030\" \001(" +
      "\0132..google.cloud.notebooks.v1.Reservatio" +
      "nAffinityB\003\340A\001\022\024\n\007creator\030$ \001(\tB\003\340A\003\022\033\n\016" +
      "can_ip_forward\030\' \001(\010B\003\340A\001\0224\n\013create_time" +
      "\030\027 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022" +
      "4\n\013update_time\030\030 \001(\0132\032.google.protobuf.T" +
      "imestampB\003\340A\003\032j\n\021AcceleratorConfig\022A\n\004ty" +
      "pe\030\001 \001(\01623.google.cloud.notebooks.v1.Ins" +
      "tance.AcceleratorType\022\022\n\ncore_count\030\002 \001(" +
      "\003\032\266\002\n\004Disk\022\023\n\013auto_delete\030\001 \001(\010\022\014\n\004boot\030" +
      "\002 \001(\010\022\023\n\013device_name\030\003 \001(\t\022\024\n\014disk_size_" +
      "gb\030\004 \001(\003\022R\n\021guest_os_features\030\005 \003(\01327.go" +
      "ogle.cloud.notebooks.v1.Instance.Disk.Gu" +
      "estOsFeature\022\r\n\005index\030\006 \001(\003\022\021\n\tinterface" +
      "\030\007 \001(\t\022\014\n\004kind\030\010 \001(\t\022\020\n\010licenses\030\t \003(\t\022\014" +
      "\n\004mode\030\n \001(\t\022\016\n\006source\030\013 \001(\t\022\014\n\004type\030\014 \001" +
      "(\t\032\036\n\016GuestOsFeature\022\014\n\004type\030\001 \001(\t\032n\n\026Sh" +
      "ieldedInstanceConfig\022\032\n\022enable_secure_bo" +
      "ot\030\001 \001(\010\022\023\n\013enable_vtpm\030\002 \001(\010\022#\n\033enable_" +
      "integrity_monitoring\030\003 \001(\010\032\374\003\n\023UpgradeHi" +
      "storyEntry\022\020\n\010snapshot\030\001 \001(\t\022\020\n\010vm_image" +
      "\030\002 \001(\t\022\027\n\017container_image\030\003 \001(\t\022\021\n\tframe" +
      "work\030\004 \001(\t\022\017\n\007version\030\005 \001(\t\022L\n\005state\030\006 \001" +
      "(\0162=.google.cloud.notebooks.v1.Instance." +
      "UpgradeHistoryEntry.State\022/\n\013create_time" +
      "\030\007 \001(\0132\032.google.protobuf.Timestamp\022\030\n\014ta" +
      "rget_image\030\010 \001(\tB\002\030\001\022N\n\006action\030\t \001(\0162>.g" +
      "oogle.cloud.notebooks.v1.Instance.Upgrad" +
      "eHistoryEntry.Action\022\026\n\016target_version\030\n" +
      " \001(\t\"F\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007" +
      "STARTED\020\001\022\r\n\tSUCCEEDED\020\002\022\n\n\006FAILED\020\003\";\n\006" +
      "Action\022\026\n\022ACTION_UNSPECIFIED\020\000\022\013\n\007UPGRAD" +
      "E\020\001\022\014\n\010ROLLBACK\020\002\032-\n\013LabelsEntry\022\013\n\003key\030" +
      "\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032/\n\rMetadataEntr" +
      "y\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\235\002\n\017Ac" +
      "celeratorType\022 \n\034ACCELERATOR_TYPE_UNSPEC" +
      "IFIED\020\000\022\024\n\020NVIDIA_TESLA_K80\020\001\022\025\n\021NVIDIA_" +
      "TESLA_P100\020\002\022\025\n\021NVIDIA_TESLA_V100\020\003\022\023\n\017N" +
      "VIDIA_TESLA_P4\020\004\022\023\n\017NVIDIA_TESLA_T4\020\005\022\025\n" +
      "\021NVIDIA_TESLA_A100\020\013\022\027\n\023NVIDIA_TESLA_T4_" +
      "VWS\020\010\022\031\n\025NVIDIA_TESLA_P100_VWS\020\t\022\027\n\023NVID" +
      "IA_TESLA_P4_VWS\020\n\022\n\n\006TPU_V2\020\006\022\n\n\006TPU_V3\020" +
      "\007\"\303\001\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010ST" +
      "ARTING\020\001\022\020\n\014PROVISIONING\020\002\022\n\n\006ACTIVE\020\003\022\014" +
      "\n\010STOPPING\020\004\022\013\n\007STOPPED\020\005\022\013\n\007DELETED\020\006\022\r" +
      "\n\tUPGRADING\020\007\022\020\n\014INITIALIZING\020\010\022\017\n\013REGIS" +
      "TERING\020\t\022\016\n\nSUSPENDING\020\n\022\r\n\tSUSPENDED\020\013\"" +
      "c\n\010DiskType\022\031\n\025DISK_TYPE_UNSPECIFIED\020\000\022\017" +
      "\n\013PD_STANDARD\020\001\022\n\n\006PD_SSD\020\002\022\017\n\013PD_BALANC" +
      "ED\020\003\022\016\n\nPD_EXTREME\020\004\"E\n\016DiskEncryption\022\037" +
      "\n\033DISK_ENCRYPTION_UNSPECIFIED\020\000\022\010\n\004GMEK\020" +
      "\001\022\010\n\004CMEK\020\002\">\n\007NicType\022\030\n\024UNSPECIFIED_NI" +
      "C_TYPE\020\000\022\016\n\nVIRTIO_NET\020\001\022\t\n\005GVNIC\020\002:O\352AL" +
      "\n!notebooks.googleapis.com/Instance\022\'pro" +
      "jects/{project}/instances/{instance}B\r\n\013" +
      "environmentB\313\001\n\035com.google.cloud.noteboo" +
      "ks.v1B\rInstanceProtoP\001ZBgoogle.golang.or" +
      "g/genproto/googleapis/cloud/notebooks/v1" +
      ";notebooks\252\002\031Google.Cloud.Notebooks.V1\312\002" +
      "\031Google\\Cloud\\Notebooks\\V1\352\002\034Google::Clo" +
      "ud::Notebooks::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.notebooks.v1.EnvironmentProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_notebooks_v1_ReservationAffinity_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_notebooks_v1_ReservationAffinity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_ReservationAffinity_descriptor,
        new java.lang.String[] { "ConsumeReservationType", "Key", "Values", });
    internal_static_google_cloud_notebooks_v1_Instance_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_notebooks_v1_Instance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_Instance_descriptor,
        new java.lang.String[] { "Name", "VmImage", "ContainerImage", "PostStartupScript", "ProxyUri", "InstanceOwners", "ServiceAccount", "ServiceAccountScopes", "MachineType", "AcceleratorConfig", "State", "InstallGpuDriver", "CustomGpuDriverPath", "BootDiskType", "BootDiskSizeGb", "DataDiskType", "DataDiskSizeGb", "NoRemoveDataDisk", "DiskEncryption", "KmsKey", "Disks", "ShieldedInstanceConfig", "NoPublicIp", "NoProxyAccess", "Network", "Subnet", "Labels", "Metadata", "Tags", "UpgradeHistory", "NicType", "ReservationAffinity", "Creator", "CanIpForward", "CreateTime", "UpdateTime", "Environment", });
    internal_static_google_cloud_notebooks_v1_Instance_AcceleratorConfig_descriptor =
      internal_static_google_cloud_notebooks_v1_Instance_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_notebooks_v1_Instance_AcceleratorConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_Instance_AcceleratorConfig_descriptor,
        new java.lang.String[] { "Type", "CoreCount", });
    internal_static_google_cloud_notebooks_v1_Instance_Disk_descriptor =
      internal_static_google_cloud_notebooks_v1_Instance_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_notebooks_v1_Instance_Disk_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_Instance_Disk_descriptor,
        new java.lang.String[] { "AutoDelete", "Boot", "DeviceName", "DiskSizeGb", "GuestOsFeatures", "Index", "Interface", "Kind", "Licenses", "Mode", "Source", "Type", });
    internal_static_google_cloud_notebooks_v1_Instance_Disk_GuestOsFeature_descriptor =
      internal_static_google_cloud_notebooks_v1_Instance_Disk_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_notebooks_v1_Instance_Disk_GuestOsFeature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_Instance_Disk_GuestOsFeature_descriptor,
        new java.lang.String[] { "Type", });
    internal_static_google_cloud_notebooks_v1_Instance_ShieldedInstanceConfig_descriptor =
      internal_static_google_cloud_notebooks_v1_Instance_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_notebooks_v1_Instance_ShieldedInstanceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_Instance_ShieldedInstanceConfig_descriptor,
        new java.lang.String[] { "EnableSecureBoot", "EnableVtpm", "EnableIntegrityMonitoring", });
    internal_static_google_cloud_notebooks_v1_Instance_UpgradeHistoryEntry_descriptor =
      internal_static_google_cloud_notebooks_v1_Instance_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_notebooks_v1_Instance_UpgradeHistoryEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_Instance_UpgradeHistoryEntry_descriptor,
        new java.lang.String[] { "Snapshot", "VmImage", "ContainerImage", "Framework", "Version", "State", "CreateTime", "TargetImage", "Action", "TargetVersion", });
    internal_static_google_cloud_notebooks_v1_Instance_LabelsEntry_descriptor =
      internal_static_google_cloud_notebooks_v1_Instance_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_notebooks_v1_Instance_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_Instance_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_notebooks_v1_Instance_MetadataEntry_descriptor =
      internal_static_google_cloud_notebooks_v1_Instance_descriptor.getNestedTypes().get(5);
    internal_static_google_cloud_notebooks_v1_Instance_MetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_notebooks_v1_Instance_MetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.notebooks.v1.EnvironmentProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
