// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1/service.proto

package com.google.cloud.notebooks.v1;

public interface SetInstanceLabelsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.SetInstanceLabelsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Labels to apply to this instance.
   * These can be later modified by the setLabels method
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Labels to apply to this instance.
   * These can be later modified by the setLabels method
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Labels to apply to this instance.
   * These can be later modified by the setLabels method
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Labels to apply to this instance.
   * These can be later modified by the setLabels method
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Labels to apply to this instance.
   * These can be later modified by the setLabels method
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);
}
