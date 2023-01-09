// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1/runtime.proto

package com.google.cloud.notebooks.v1;

public interface RuntimeMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.RuntimeMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The system metrics.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_metrics = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getSystemMetricsCount();
  /**
   * <pre>
   * Output only. The system metrics.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_metrics = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  boolean containsSystemMetrics(
      java.lang.String key);
  /**
   * Use {@link #getSystemMetricsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getSystemMetrics();
  /**
   * <pre>
   * Output only. The system metrics.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_metrics = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getSystemMetricsMap();
  /**
   * <pre>
   * Output only. The system metrics.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_metrics = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */

  /* nullable */
java.lang.String getSystemMetricsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Output only. The system metrics.
   * </pre>
   *
   * <code>map&lt;string, string&gt; system_metrics = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */

  java.lang.String getSystemMetricsOrThrow(
      java.lang.String key);
}
