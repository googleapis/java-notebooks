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

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/notebooks/v1/event.proto\022"
          + "\031google.cloud.notebooks.v1\032\037google/proto"
          + "buf/timestamp.proto\"\245\001\n\005Event\022/\n\013report_"
          + "time\030\001 \001(\0132\032.google.protobuf.Timestamp\0228"
          + "\n\004type\030\002 \001(\0162*.google.cloud.notebooks.v1"
          + ".Event.EventType\"1\n\tEventType\022\032\n\026EVENT_T"
          + "YPE_UNSPECIFIED\020\000\022\010\n\004IDLE\020\001Bq\n\035com.googl"
          + "e.cloud.notebooks.v1B\nEventProtoP\001ZBgoog"
          + "le.golang.org/genproto/googleapis/cloud/"
          + "notebooks/v1;notebooksb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_notebooks_v1_Event_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_notebooks_v1_Event_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_Event_descriptor,
            new java.lang.String[] {
              "ReportTime", "Type",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
