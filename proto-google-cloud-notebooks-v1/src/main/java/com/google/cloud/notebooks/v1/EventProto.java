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
// source: google/cloud/notebooks/v1/event.proto

package com.google.cloud.notebooks.v1;

public final class EventProto {
  private EventProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_Event_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_Event_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_Event_DetailsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_Event_DetailsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/notebooks/v1/event.proto\022"
          + "\031google.cloud.notebooks.v1\032\037google/api/f"
          + "ield_behavior.proto\032\037google/protobuf/tim"
          + "estamp.proto\"\306\002\n\005Event\022/\n\013report_time\030\001 "
          + "\001(\0132\032.google.protobuf.Timestamp\0228\n\004type\030"
          + "\002 \001(\0162*.google.cloud.notebooks.v1.Event."
          + "EventType\022C\n\007details\030\003 \003(\0132-.google.clou"
          + "d.notebooks.v1.Event.DetailsEntryB\003\340A\001\032."
          + "\n\014DetailsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001"
          + "(\t:\0028\001\"]\n\tEventType\022\032\n\026EVENT_TYPE_UNSPEC"
          + "IFIED\020\000\022\010\n\004IDLE\020\001\022\r\n\tHEARTBEAT\020\002\022\n\n\006HEAL"
          + "TH\020\003\022\017\n\013MAINTENANCE\020\004Bj\n\035com.google.clou"
          + "d.notebooks.v1B\nEventProtoP\001Z;cloud.goog"
          + "le.com/go/notebooks/apiv1/notebookspb;no"
          + "tebookspbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_notebooks_v1_Event_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_notebooks_v1_Event_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_Event_descriptor,
            new java.lang.String[] {
              "ReportTime", "Type", "Details",
            });
    internal_static_google_cloud_notebooks_v1_Event_DetailsEntry_descriptor =
        internal_static_google_cloud_notebooks_v1_Event_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_notebooks_v1_Event_DetailsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_Event_DetailsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
