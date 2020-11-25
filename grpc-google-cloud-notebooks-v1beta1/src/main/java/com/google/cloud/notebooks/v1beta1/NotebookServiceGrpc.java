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
package com.google.cloud.notebooks.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/notebooks/v1beta1/service.proto")
public final class NotebookServiceGrpc {

  private NotebookServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.notebooks.v1beta1.NotebookService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.ListInstancesRequest,
          com.google.cloud.notebooks.v1beta1.ListInstancesResponse>
      getListInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInstances",
      requestType = com.google.cloud.notebooks.v1beta1.ListInstancesRequest.class,
      responseType = com.google.cloud.notebooks.v1beta1.ListInstancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.ListInstancesRequest,
          com.google.cloud.notebooks.v1beta1.ListInstancesResponse>
      getListInstancesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.ListInstancesRequest,
            com.google.cloud.notebooks.v1beta1.ListInstancesResponse>
        getListInstancesMethod;
    if ((getListInstancesMethod = NotebookServiceGrpc.getListInstancesMethod) == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getListInstancesMethod = NotebookServiceGrpc.getListInstancesMethod) == null) {
          NotebookServiceGrpc.getListInstancesMethod =
              getListInstancesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.ListInstancesRequest,
                          com.google.cloud.notebooks.v1beta1.ListInstancesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInstances"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.ListInstancesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.ListInstancesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("ListInstances"))
                      .build();
        }
      }
    }
    return getListInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.GetInstanceRequest,
          com.google.cloud.notebooks.v1beta1.Instance>
      getGetInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInstance",
      requestType = com.google.cloud.notebooks.v1beta1.GetInstanceRequest.class,
      responseType = com.google.cloud.notebooks.v1beta1.Instance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.GetInstanceRequest,
          com.google.cloud.notebooks.v1beta1.Instance>
      getGetInstanceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.GetInstanceRequest,
            com.google.cloud.notebooks.v1beta1.Instance>
        getGetInstanceMethod;
    if ((getGetInstanceMethod = NotebookServiceGrpc.getGetInstanceMethod) == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getGetInstanceMethod = NotebookServiceGrpc.getGetInstanceMethod) == null) {
          NotebookServiceGrpc.getGetInstanceMethod =
              getGetInstanceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.GetInstanceRequest,
                          com.google.cloud.notebooks.v1beta1.Instance>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInstance"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.GetInstanceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.Instance.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("GetInstance"))
                      .build();
        }
      }
    }
    return getGetInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.CreateInstanceRequest,
          com.google.longrunning.Operation>
      getCreateInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInstance",
      requestType = com.google.cloud.notebooks.v1beta1.CreateInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.CreateInstanceRequest,
          com.google.longrunning.Operation>
      getCreateInstanceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.CreateInstanceRequest,
            com.google.longrunning.Operation>
        getCreateInstanceMethod;
    if ((getCreateInstanceMethod = NotebookServiceGrpc.getCreateInstanceMethod) == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getCreateInstanceMethod = NotebookServiceGrpc.getCreateInstanceMethod) == null) {
          NotebookServiceGrpc.getCreateInstanceMethod =
              getCreateInstanceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.CreateInstanceRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInstance"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.CreateInstanceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("CreateInstance"))
                      .build();
        }
      }
    }
    return getCreateInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.RegisterInstanceRequest,
          com.google.longrunning.Operation>
      getRegisterInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterInstance",
      requestType = com.google.cloud.notebooks.v1beta1.RegisterInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.RegisterInstanceRequest,
          com.google.longrunning.Operation>
      getRegisterInstanceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.RegisterInstanceRequest,
            com.google.longrunning.Operation>
        getRegisterInstanceMethod;
    if ((getRegisterInstanceMethod = NotebookServiceGrpc.getRegisterInstanceMethod) == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getRegisterInstanceMethod = NotebookServiceGrpc.getRegisterInstanceMethod) == null) {
          NotebookServiceGrpc.getRegisterInstanceMethod =
              getRegisterInstanceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.RegisterInstanceRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterInstance"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.RegisterInstanceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("RegisterInstance"))
                      .build();
        }
      }
    }
    return getRegisterInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.SetInstanceAcceleratorRequest,
          com.google.longrunning.Operation>
      getSetInstanceAcceleratorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetInstanceAccelerator",
      requestType = com.google.cloud.notebooks.v1beta1.SetInstanceAcceleratorRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.SetInstanceAcceleratorRequest,
          com.google.longrunning.Operation>
      getSetInstanceAcceleratorMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.SetInstanceAcceleratorRequest,
            com.google.longrunning.Operation>
        getSetInstanceAcceleratorMethod;
    if ((getSetInstanceAcceleratorMethod = NotebookServiceGrpc.getSetInstanceAcceleratorMethod)
        == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getSetInstanceAcceleratorMethod = NotebookServiceGrpc.getSetInstanceAcceleratorMethod)
            == null) {
          NotebookServiceGrpc.getSetInstanceAcceleratorMethod =
              getSetInstanceAcceleratorMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.SetInstanceAcceleratorRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "SetInstanceAccelerator"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.SetInstanceAcceleratorRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("SetInstanceAccelerator"))
                      .build();
        }
      }
    }
    return getSetInstanceAcceleratorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.SetInstanceMachineTypeRequest,
          com.google.longrunning.Operation>
      getSetInstanceMachineTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetInstanceMachineType",
      requestType = com.google.cloud.notebooks.v1beta1.SetInstanceMachineTypeRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.SetInstanceMachineTypeRequest,
          com.google.longrunning.Operation>
      getSetInstanceMachineTypeMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.SetInstanceMachineTypeRequest,
            com.google.longrunning.Operation>
        getSetInstanceMachineTypeMethod;
    if ((getSetInstanceMachineTypeMethod = NotebookServiceGrpc.getSetInstanceMachineTypeMethod)
        == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getSetInstanceMachineTypeMethod = NotebookServiceGrpc.getSetInstanceMachineTypeMethod)
            == null) {
          NotebookServiceGrpc.getSetInstanceMachineTypeMethod =
              getSetInstanceMachineTypeMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.SetInstanceMachineTypeRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "SetInstanceMachineType"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.SetInstanceMachineTypeRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("SetInstanceMachineType"))
                      .build();
        }
      }
    }
    return getSetInstanceMachineTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.SetInstanceLabelsRequest,
          com.google.longrunning.Operation>
      getSetInstanceLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetInstanceLabels",
      requestType = com.google.cloud.notebooks.v1beta1.SetInstanceLabelsRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.SetInstanceLabelsRequest,
          com.google.longrunning.Operation>
      getSetInstanceLabelsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.SetInstanceLabelsRequest,
            com.google.longrunning.Operation>
        getSetInstanceLabelsMethod;
    if ((getSetInstanceLabelsMethod = NotebookServiceGrpc.getSetInstanceLabelsMethod) == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getSetInstanceLabelsMethod = NotebookServiceGrpc.getSetInstanceLabelsMethod) == null) {
          NotebookServiceGrpc.getSetInstanceLabelsMethod =
              getSetInstanceLabelsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.SetInstanceLabelsRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetInstanceLabels"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.SetInstanceLabelsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("SetInstanceLabels"))
                      .build();
        }
      }
    }
    return getSetInstanceLabelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.DeleteInstanceRequest,
          com.google.longrunning.Operation>
      getDeleteInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInstance",
      requestType = com.google.cloud.notebooks.v1beta1.DeleteInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.DeleteInstanceRequest,
          com.google.longrunning.Operation>
      getDeleteInstanceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.DeleteInstanceRequest,
            com.google.longrunning.Operation>
        getDeleteInstanceMethod;
    if ((getDeleteInstanceMethod = NotebookServiceGrpc.getDeleteInstanceMethod) == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getDeleteInstanceMethod = NotebookServiceGrpc.getDeleteInstanceMethod) == null) {
          NotebookServiceGrpc.getDeleteInstanceMethod =
              getDeleteInstanceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.DeleteInstanceRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInstance"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.DeleteInstanceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("DeleteInstance"))
                      .build();
        }
      }
    }
    return getDeleteInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.StartInstanceRequest, com.google.longrunning.Operation>
      getStartInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartInstance",
      requestType = com.google.cloud.notebooks.v1beta1.StartInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.StartInstanceRequest, com.google.longrunning.Operation>
      getStartInstanceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.StartInstanceRequest,
            com.google.longrunning.Operation>
        getStartInstanceMethod;
    if ((getStartInstanceMethod = NotebookServiceGrpc.getStartInstanceMethod) == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getStartInstanceMethod = NotebookServiceGrpc.getStartInstanceMethod) == null) {
          NotebookServiceGrpc.getStartInstanceMethod =
              getStartInstanceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.StartInstanceRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartInstance"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.StartInstanceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("StartInstance"))
                      .build();
        }
      }
    }
    return getStartInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.StopInstanceRequest, com.google.longrunning.Operation>
      getStopInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopInstance",
      requestType = com.google.cloud.notebooks.v1beta1.StopInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.StopInstanceRequest, com.google.longrunning.Operation>
      getStopInstanceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.StopInstanceRequest,
            com.google.longrunning.Operation>
        getStopInstanceMethod;
    if ((getStopInstanceMethod = NotebookServiceGrpc.getStopInstanceMethod) == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getStopInstanceMethod = NotebookServiceGrpc.getStopInstanceMethod) == null) {
          NotebookServiceGrpc.getStopInstanceMethod =
              getStopInstanceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.StopInstanceRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopInstance"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.StopInstanceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("StopInstance"))
                      .build();
        }
      }
    }
    return getStopInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.ResetInstanceRequest, com.google.longrunning.Operation>
      getResetInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetInstance",
      requestType = com.google.cloud.notebooks.v1beta1.ResetInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.ResetInstanceRequest, com.google.longrunning.Operation>
      getResetInstanceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.ResetInstanceRequest,
            com.google.longrunning.Operation>
        getResetInstanceMethod;
    if ((getResetInstanceMethod = NotebookServiceGrpc.getResetInstanceMethod) == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getResetInstanceMethod = NotebookServiceGrpc.getResetInstanceMethod) == null) {
          NotebookServiceGrpc.getResetInstanceMethod =
              getResetInstanceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.ResetInstanceRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetInstance"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.ResetInstanceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("ResetInstance"))
                      .build();
        }
      }
    }
    return getResetInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest,
          com.google.longrunning.Operation>
      getReportInstanceInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReportInstanceInfo",
      requestType = com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest,
          com.google.longrunning.Operation>
      getReportInstanceInfoMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest,
            com.google.longrunning.Operation>
        getReportInstanceInfoMethod;
    if ((getReportInstanceInfoMethod = NotebookServiceGrpc.getReportInstanceInfoMethod) == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getReportInstanceInfoMethod = NotebookServiceGrpc.getReportInstanceInfoMethod)
            == null) {
          NotebookServiceGrpc.getReportInstanceInfoMethod =
              getReportInstanceInfoMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReportInstanceInfo"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("ReportInstanceInfo"))
                      .build();
        }
      }
    }
    return getReportInstanceInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableRequest,
          com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse>
      getIsInstanceUpgradeableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsInstanceUpgradeable",
      requestType = com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableRequest.class,
      responseType = com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableRequest,
          com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse>
      getIsInstanceUpgradeableMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableRequest,
            com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse>
        getIsInstanceUpgradeableMethod;
    if ((getIsInstanceUpgradeableMethod = NotebookServiceGrpc.getIsInstanceUpgradeableMethod)
        == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getIsInstanceUpgradeableMethod = NotebookServiceGrpc.getIsInstanceUpgradeableMethod)
            == null) {
          NotebookServiceGrpc.getIsInstanceUpgradeableMethod =
              getIsInstanceUpgradeableMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableRequest,
                          com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "IsInstanceUpgradeable"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("IsInstanceUpgradeable"))
                      .build();
        }
      }
    }
    return getIsInstanceUpgradeableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.UpgradeInstanceRequest,
          com.google.longrunning.Operation>
      getUpgradeInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpgradeInstance",
      requestType = com.google.cloud.notebooks.v1beta1.UpgradeInstanceRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.UpgradeInstanceRequest,
          com.google.longrunning.Operation>
      getUpgradeInstanceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.UpgradeInstanceRequest,
            com.google.longrunning.Operation>
        getUpgradeInstanceMethod;
    if ((getUpgradeInstanceMethod = NotebookServiceGrpc.getUpgradeInstanceMethod) == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getUpgradeInstanceMethod = NotebookServiceGrpc.getUpgradeInstanceMethod) == null) {
          NotebookServiceGrpc.getUpgradeInstanceMethod =
              getUpgradeInstanceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.UpgradeInstanceRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpgradeInstance"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.UpgradeInstanceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("UpgradeInstance"))
                      .build();
        }
      }
    }
    return getUpgradeInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.UpgradeInstanceInternalRequest,
          com.google.longrunning.Operation>
      getUpgradeInstanceInternalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpgradeInstanceInternal",
      requestType = com.google.cloud.notebooks.v1beta1.UpgradeInstanceInternalRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.UpgradeInstanceInternalRequest,
          com.google.longrunning.Operation>
      getUpgradeInstanceInternalMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.UpgradeInstanceInternalRequest,
            com.google.longrunning.Operation>
        getUpgradeInstanceInternalMethod;
    if ((getUpgradeInstanceInternalMethod = NotebookServiceGrpc.getUpgradeInstanceInternalMethod)
        == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getUpgradeInstanceInternalMethod =
                NotebookServiceGrpc.getUpgradeInstanceInternalMethod)
            == null) {
          NotebookServiceGrpc.getUpgradeInstanceInternalMethod =
              getUpgradeInstanceInternalMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.UpgradeInstanceInternalRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "UpgradeInstanceInternal"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.UpgradeInstanceInternalRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("UpgradeInstanceInternal"))
                      .build();
        }
      }
    }
    return getUpgradeInstanceInternalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.ListEnvironmentsRequest,
          com.google.cloud.notebooks.v1beta1.ListEnvironmentsResponse>
      getListEnvironmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEnvironments",
      requestType = com.google.cloud.notebooks.v1beta1.ListEnvironmentsRequest.class,
      responseType = com.google.cloud.notebooks.v1beta1.ListEnvironmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.ListEnvironmentsRequest,
          com.google.cloud.notebooks.v1beta1.ListEnvironmentsResponse>
      getListEnvironmentsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.ListEnvironmentsRequest,
            com.google.cloud.notebooks.v1beta1.ListEnvironmentsResponse>
        getListEnvironmentsMethod;
    if ((getListEnvironmentsMethod = NotebookServiceGrpc.getListEnvironmentsMethod) == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getListEnvironmentsMethod = NotebookServiceGrpc.getListEnvironmentsMethod) == null) {
          NotebookServiceGrpc.getListEnvironmentsMethod =
              getListEnvironmentsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.ListEnvironmentsRequest,
                          com.google.cloud.notebooks.v1beta1.ListEnvironmentsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEnvironments"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.ListEnvironmentsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.ListEnvironmentsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("ListEnvironments"))
                      .build();
        }
      }
    }
    return getListEnvironmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.GetEnvironmentRequest,
          com.google.cloud.notebooks.v1beta1.Environment>
      getGetEnvironmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnvironment",
      requestType = com.google.cloud.notebooks.v1beta1.GetEnvironmentRequest.class,
      responseType = com.google.cloud.notebooks.v1beta1.Environment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.GetEnvironmentRequest,
          com.google.cloud.notebooks.v1beta1.Environment>
      getGetEnvironmentMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.GetEnvironmentRequest,
            com.google.cloud.notebooks.v1beta1.Environment>
        getGetEnvironmentMethod;
    if ((getGetEnvironmentMethod = NotebookServiceGrpc.getGetEnvironmentMethod) == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getGetEnvironmentMethod = NotebookServiceGrpc.getGetEnvironmentMethod) == null) {
          NotebookServiceGrpc.getGetEnvironmentMethod =
              getGetEnvironmentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.GetEnvironmentRequest,
                          com.google.cloud.notebooks.v1beta1.Environment>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnvironment"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.GetEnvironmentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.Environment.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("GetEnvironment"))
                      .build();
        }
      }
    }
    return getGetEnvironmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.CreateEnvironmentRequest,
          com.google.longrunning.Operation>
      getCreateEnvironmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEnvironment",
      requestType = com.google.cloud.notebooks.v1beta1.CreateEnvironmentRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.CreateEnvironmentRequest,
          com.google.longrunning.Operation>
      getCreateEnvironmentMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.CreateEnvironmentRequest,
            com.google.longrunning.Operation>
        getCreateEnvironmentMethod;
    if ((getCreateEnvironmentMethod = NotebookServiceGrpc.getCreateEnvironmentMethod) == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getCreateEnvironmentMethod = NotebookServiceGrpc.getCreateEnvironmentMethod) == null) {
          NotebookServiceGrpc.getCreateEnvironmentMethod =
              getCreateEnvironmentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.CreateEnvironmentRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEnvironment"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.CreateEnvironmentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("CreateEnvironment"))
                      .build();
        }
      }
    }
    return getCreateEnvironmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.DeleteEnvironmentRequest,
          com.google.longrunning.Operation>
      getDeleteEnvironmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEnvironment",
      requestType = com.google.cloud.notebooks.v1beta1.DeleteEnvironmentRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.notebooks.v1beta1.DeleteEnvironmentRequest,
          com.google.longrunning.Operation>
      getDeleteEnvironmentMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.notebooks.v1beta1.DeleteEnvironmentRequest,
            com.google.longrunning.Operation>
        getDeleteEnvironmentMethod;
    if ((getDeleteEnvironmentMethod = NotebookServiceGrpc.getDeleteEnvironmentMethod) == null) {
      synchronized (NotebookServiceGrpc.class) {
        if ((getDeleteEnvironmentMethod = NotebookServiceGrpc.getDeleteEnvironmentMethod) == null) {
          NotebookServiceGrpc.getDeleteEnvironmentMethod =
              getDeleteEnvironmentMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.notebooks.v1beta1.DeleteEnvironmentRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEnvironment"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.notebooks.v1beta1.DeleteEnvironmentRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotebookServiceMethodDescriptorSupplier("DeleteEnvironment"))
                      .build();
        }
      }
    }
    return getDeleteEnvironmentMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static NotebookServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotebookServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<NotebookServiceStub>() {
          @java.lang.Override
          public NotebookServiceStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new NotebookServiceStub(channel, callOptions);
          }
        };
    return NotebookServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotebookServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotebookServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<NotebookServiceBlockingStub>() {
          @java.lang.Override
          public NotebookServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new NotebookServiceBlockingStub(channel, callOptions);
          }
        };
    return NotebookServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static NotebookServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotebookServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<NotebookServiceFutureStub>() {
          @java.lang.Override
          public NotebookServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new NotebookServiceFutureStub(channel, callOptions);
          }
        };
    return NotebookServiceFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class NotebookServiceImplBase implements io.grpc.BindableService {

    /** */
    public void listInstances(
        com.google.cloud.notebooks.v1beta1.ListInstancesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.notebooks.v1beta1.ListInstancesResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListInstancesMethod(), responseObserver);
    }

    /** */
    public void getInstance(
        com.google.cloud.notebooks.v1beta1.GetInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.notebooks.v1beta1.Instance> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInstanceMethod(), responseObserver);
    }

    /** */
    public void createInstance(
        com.google.cloud.notebooks.v1beta1.CreateInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateInstanceMethod(), responseObserver);
    }

    /** */
    public void registerInstance(
        com.google.cloud.notebooks.v1beta1.RegisterInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterInstanceMethod(), responseObserver);
    }

    /** */
    public void setInstanceAccelerator(
        com.google.cloud.notebooks.v1beta1.SetInstanceAcceleratorRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetInstanceAcceleratorMethod(), responseObserver);
    }

    /** */
    public void setInstanceMachineType(
        com.google.cloud.notebooks.v1beta1.SetInstanceMachineTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetInstanceMachineTypeMethod(), responseObserver);
    }

    /** */
    public void setInstanceLabels(
        com.google.cloud.notebooks.v1beta1.SetInstanceLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetInstanceLabelsMethod(), responseObserver);
    }

    /** */
    public void deleteInstance(
        com.google.cloud.notebooks.v1beta1.DeleteInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteInstanceMethod(), responseObserver);
    }

    /** */
    public void startInstance(
        com.google.cloud.notebooks.v1beta1.StartInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getStartInstanceMethod(), responseObserver);
    }

    /** */
    public void stopInstance(
        com.google.cloud.notebooks.v1beta1.StopInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getStopInstanceMethod(), responseObserver);
    }

    /** */
    public void resetInstance(
        com.google.cloud.notebooks.v1beta1.ResetInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getResetInstanceMethod(), responseObserver);
    }

    /** */
    public void reportInstanceInfo(
        com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getReportInstanceInfoMethod(), responseObserver);
    }

    /** */
    public void isInstanceUpgradeable(
        com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getIsInstanceUpgradeableMethod(), responseObserver);
    }

    /** */
    public void upgradeInstance(
        com.google.cloud.notebooks.v1beta1.UpgradeInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpgradeInstanceMethod(), responseObserver);
    }

    /** */
    public void upgradeInstanceInternal(
        com.google.cloud.notebooks.v1beta1.UpgradeInstanceInternalRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpgradeInstanceInternalMethod(), responseObserver);
    }

    /** */
    public void listEnvironments(
        com.google.cloud.notebooks.v1beta1.ListEnvironmentsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.notebooks.v1beta1.ListEnvironmentsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListEnvironmentsMethod(), responseObserver);
    }

    /** */
    public void getEnvironment(
        com.google.cloud.notebooks.v1beta1.GetEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.notebooks.v1beta1.Environment>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetEnvironmentMethod(), responseObserver);
    }

    /** */
    public void createEnvironment(
        com.google.cloud.notebooks.v1beta1.CreateEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateEnvironmentMethod(), responseObserver);
    }

    /** */
    public void deleteEnvironment(
        com.google.cloud.notebooks.v1beta1.DeleteEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteEnvironmentMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getListInstancesMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.ListInstancesRequest,
                      com.google.cloud.notebooks.v1beta1.ListInstancesResponse>(
                      this, METHODID_LIST_INSTANCES)))
          .addMethod(
              getGetInstanceMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.GetInstanceRequest,
                      com.google.cloud.notebooks.v1beta1.Instance>(this, METHODID_GET_INSTANCE)))
          .addMethod(
              getCreateInstanceMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.CreateInstanceRequest,
                      com.google.longrunning.Operation>(this, METHODID_CREATE_INSTANCE)))
          .addMethod(
              getRegisterInstanceMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.RegisterInstanceRequest,
                      com.google.longrunning.Operation>(this, METHODID_REGISTER_INSTANCE)))
          .addMethod(
              getSetInstanceAcceleratorMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.SetInstanceAcceleratorRequest,
                      com.google.longrunning.Operation>(this, METHODID_SET_INSTANCE_ACCELERATOR)))
          .addMethod(
              getSetInstanceMachineTypeMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.SetInstanceMachineTypeRequest,
                      com.google.longrunning.Operation>(this, METHODID_SET_INSTANCE_MACHINE_TYPE)))
          .addMethod(
              getSetInstanceLabelsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.SetInstanceLabelsRequest,
                      com.google.longrunning.Operation>(this, METHODID_SET_INSTANCE_LABELS)))
          .addMethod(
              getDeleteInstanceMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.DeleteInstanceRequest,
                      com.google.longrunning.Operation>(this, METHODID_DELETE_INSTANCE)))
          .addMethod(
              getStartInstanceMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.StartInstanceRequest,
                      com.google.longrunning.Operation>(this, METHODID_START_INSTANCE)))
          .addMethod(
              getStopInstanceMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.StopInstanceRequest,
                      com.google.longrunning.Operation>(this, METHODID_STOP_INSTANCE)))
          .addMethod(
              getResetInstanceMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.ResetInstanceRequest,
                      com.google.longrunning.Operation>(this, METHODID_RESET_INSTANCE)))
          .addMethod(
              getReportInstanceInfoMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest,
                      com.google.longrunning.Operation>(this, METHODID_REPORT_INSTANCE_INFO)))
          .addMethod(
              getIsInstanceUpgradeableMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableRequest,
                      com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse>(
                      this, METHODID_IS_INSTANCE_UPGRADEABLE)))
          .addMethod(
              getUpgradeInstanceMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.UpgradeInstanceRequest,
                      com.google.longrunning.Operation>(this, METHODID_UPGRADE_INSTANCE)))
          .addMethod(
              getUpgradeInstanceInternalMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.UpgradeInstanceInternalRequest,
                      com.google.longrunning.Operation>(this, METHODID_UPGRADE_INSTANCE_INTERNAL)))
          .addMethod(
              getListEnvironmentsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.ListEnvironmentsRequest,
                      com.google.cloud.notebooks.v1beta1.ListEnvironmentsResponse>(
                      this, METHODID_LIST_ENVIRONMENTS)))
          .addMethod(
              getGetEnvironmentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.GetEnvironmentRequest,
                      com.google.cloud.notebooks.v1beta1.Environment>(
                      this, METHODID_GET_ENVIRONMENT)))
          .addMethod(
              getCreateEnvironmentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.CreateEnvironmentRequest,
                      com.google.longrunning.Operation>(this, METHODID_CREATE_ENVIRONMENT)))
          .addMethod(
              getDeleteEnvironmentMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.notebooks.v1beta1.DeleteEnvironmentRequest,
                      com.google.longrunning.Operation>(this, METHODID_DELETE_ENVIRONMENT)))
          .build();
    }
  }

  /** */
  public static final class NotebookServiceStub
      extends io.grpc.stub.AbstractAsyncStub<NotebookServiceStub> {
    private NotebookServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotebookServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotebookServiceStub(channel, callOptions);
    }

    /** */
    public void listInstances(
        com.google.cloud.notebooks.v1beta1.ListInstancesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.notebooks.v1beta1.ListInstancesResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getInstance(
        com.google.cloud.notebooks.v1beta1.GetInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.notebooks.v1beta1.Instance> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInstanceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void createInstance(
        com.google.cloud.notebooks.v1beta1.CreateInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateInstanceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void registerInstance(
        com.google.cloud.notebooks.v1beta1.RegisterInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterInstanceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void setInstanceAccelerator(
        com.google.cloud.notebooks.v1beta1.SetInstanceAcceleratorRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetInstanceAcceleratorMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void setInstanceMachineType(
        com.google.cloud.notebooks.v1beta1.SetInstanceMachineTypeRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetInstanceMachineTypeMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void setInstanceLabels(
        com.google.cloud.notebooks.v1beta1.SetInstanceLabelsRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetInstanceLabelsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void deleteInstance(
        com.google.cloud.notebooks.v1beta1.DeleteInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteInstanceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void startInstance(
        com.google.cloud.notebooks.v1beta1.StartInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartInstanceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void stopInstance(
        com.google.cloud.notebooks.v1beta1.StopInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopInstanceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void resetInstance(
        com.google.cloud.notebooks.v1beta1.ResetInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetInstanceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void reportInstanceInfo(
        com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReportInstanceInfoMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void isInstanceUpgradeable(
        com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsInstanceUpgradeableMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void upgradeInstance(
        com.google.cloud.notebooks.v1beta1.UpgradeInstanceRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpgradeInstanceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void upgradeInstanceInternal(
        com.google.cloud.notebooks.v1beta1.UpgradeInstanceInternalRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpgradeInstanceInternalMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void listEnvironments(
        com.google.cloud.notebooks.v1beta1.ListEnvironmentsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.notebooks.v1beta1.ListEnvironmentsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListEnvironmentsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getEnvironment(
        com.google.cloud.notebooks.v1beta1.GetEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.notebooks.v1beta1.Environment>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEnvironmentMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void createEnvironment(
        com.google.cloud.notebooks.v1beta1.CreateEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateEnvironmentMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void deleteEnvironment(
        com.google.cloud.notebooks.v1beta1.DeleteEnvironmentRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteEnvironmentMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class NotebookServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NotebookServiceBlockingStub> {
    private NotebookServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotebookServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotebookServiceBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.cloud.notebooks.v1beta1.ListInstancesResponse listInstances(
        com.google.cloud.notebooks.v1beta1.ListInstancesRequest request) {
      return blockingUnaryCall(getChannel(), getListInstancesMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.notebooks.v1beta1.Instance getInstance(
        com.google.cloud.notebooks.v1beta1.GetInstanceRequest request) {
      return blockingUnaryCall(getChannel(), getGetInstanceMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation createInstance(
        com.google.cloud.notebooks.v1beta1.CreateInstanceRequest request) {
      return blockingUnaryCall(getChannel(), getCreateInstanceMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation registerInstance(
        com.google.cloud.notebooks.v1beta1.RegisterInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterInstanceMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation setInstanceAccelerator(
        com.google.cloud.notebooks.v1beta1.SetInstanceAcceleratorRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetInstanceAcceleratorMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation setInstanceMachineType(
        com.google.cloud.notebooks.v1beta1.SetInstanceMachineTypeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetInstanceMachineTypeMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation setInstanceLabels(
        com.google.cloud.notebooks.v1beta1.SetInstanceLabelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetInstanceLabelsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation deleteInstance(
        com.google.cloud.notebooks.v1beta1.DeleteInstanceRequest request) {
      return blockingUnaryCall(getChannel(), getDeleteInstanceMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation startInstance(
        com.google.cloud.notebooks.v1beta1.StartInstanceRequest request) {
      return blockingUnaryCall(getChannel(), getStartInstanceMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation stopInstance(
        com.google.cloud.notebooks.v1beta1.StopInstanceRequest request) {
      return blockingUnaryCall(getChannel(), getStopInstanceMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation resetInstance(
        com.google.cloud.notebooks.v1beta1.ResetInstanceRequest request) {
      return blockingUnaryCall(getChannel(), getResetInstanceMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation reportInstanceInfo(
        com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getReportInstanceInfoMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse isInstanceUpgradeable(
        com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableRequest request) {
      return blockingUnaryCall(
          getChannel(), getIsInstanceUpgradeableMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation upgradeInstance(
        com.google.cloud.notebooks.v1beta1.UpgradeInstanceRequest request) {
      return blockingUnaryCall(getChannel(), getUpgradeInstanceMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation upgradeInstanceInternal(
        com.google.cloud.notebooks.v1beta1.UpgradeInstanceInternalRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpgradeInstanceInternalMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.notebooks.v1beta1.ListEnvironmentsResponse listEnvironments(
        com.google.cloud.notebooks.v1beta1.ListEnvironmentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListEnvironmentsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.notebooks.v1beta1.Environment getEnvironment(
        com.google.cloud.notebooks.v1beta1.GetEnvironmentRequest request) {
      return blockingUnaryCall(getChannel(), getGetEnvironmentMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation createEnvironment(
        com.google.cloud.notebooks.v1beta1.CreateEnvironmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateEnvironmentMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.longrunning.Operation deleteEnvironment(
        com.google.cloud.notebooks.v1beta1.DeleteEnvironmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteEnvironmentMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class NotebookServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<NotebookServiceFutureStub> {
    private NotebookServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotebookServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotebookServiceFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.notebooks.v1beta1.ListInstancesResponse>
        listInstances(com.google.cloud.notebooks.v1beta1.ListInstancesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListInstancesMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.notebooks.v1beta1.Instance>
        getInstance(com.google.cloud.notebooks.v1beta1.GetInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInstanceMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createInstance(com.google.cloud.notebooks.v1beta1.CreateInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateInstanceMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        registerInstance(com.google.cloud.notebooks.v1beta1.RegisterInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterInstanceMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        setInstanceAccelerator(
            com.google.cloud.notebooks.v1beta1.SetInstanceAcceleratorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetInstanceAcceleratorMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        setInstanceMachineType(
            com.google.cloud.notebooks.v1beta1.SetInstanceMachineTypeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetInstanceMachineTypeMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        setInstanceLabels(com.google.cloud.notebooks.v1beta1.SetInstanceLabelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetInstanceLabelsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deleteInstance(com.google.cloud.notebooks.v1beta1.DeleteInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteInstanceMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        startInstance(com.google.cloud.notebooks.v1beta1.StartInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartInstanceMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        stopInstance(com.google.cloud.notebooks.v1beta1.StopInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopInstanceMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        resetInstance(com.google.cloud.notebooks.v1beta1.ResetInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResetInstanceMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        reportInstanceInfo(com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReportInstanceInfoMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse>
        isInstanceUpgradeable(
            com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIsInstanceUpgradeableMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        upgradeInstance(com.google.cloud.notebooks.v1beta1.UpgradeInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpgradeInstanceMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        upgradeInstanceInternal(
            com.google.cloud.notebooks.v1beta1.UpgradeInstanceInternalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpgradeInstanceInternalMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.notebooks.v1beta1.ListEnvironmentsResponse>
        listEnvironments(com.google.cloud.notebooks.v1beta1.ListEnvironmentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListEnvironmentsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.notebooks.v1beta1.Environment>
        getEnvironment(com.google.cloud.notebooks.v1beta1.GetEnvironmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEnvironmentMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createEnvironment(com.google.cloud.notebooks.v1beta1.CreateEnvironmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateEnvironmentMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deleteEnvironment(com.google.cloud.notebooks.v1beta1.DeleteEnvironmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteEnvironmentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_INSTANCES = 0;
  private static final int METHODID_GET_INSTANCE = 1;
  private static final int METHODID_CREATE_INSTANCE = 2;
  private static final int METHODID_REGISTER_INSTANCE = 3;
  private static final int METHODID_SET_INSTANCE_ACCELERATOR = 4;
  private static final int METHODID_SET_INSTANCE_MACHINE_TYPE = 5;
  private static final int METHODID_SET_INSTANCE_LABELS = 6;
  private static final int METHODID_DELETE_INSTANCE = 7;
  private static final int METHODID_START_INSTANCE = 8;
  private static final int METHODID_STOP_INSTANCE = 9;
  private static final int METHODID_RESET_INSTANCE = 10;
  private static final int METHODID_REPORT_INSTANCE_INFO = 11;
  private static final int METHODID_IS_INSTANCE_UPGRADEABLE = 12;
  private static final int METHODID_UPGRADE_INSTANCE = 13;
  private static final int METHODID_UPGRADE_INSTANCE_INTERNAL = 14;
  private static final int METHODID_LIST_ENVIRONMENTS = 15;
  private static final int METHODID_GET_ENVIRONMENT = 16;
  private static final int METHODID_CREATE_ENVIRONMENT = 17;
  private static final int METHODID_DELETE_ENVIRONMENT = 18;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NotebookServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NotebookServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_INSTANCES:
          serviceImpl.listInstances(
              (com.google.cloud.notebooks.v1beta1.ListInstancesRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.notebooks.v1beta1.ListInstancesResponse>)
                  responseObserver);
          break;
        case METHODID_GET_INSTANCE:
          serviceImpl.getInstance(
              (com.google.cloud.notebooks.v1beta1.GetInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.notebooks.v1beta1.Instance>)
                  responseObserver);
          break;
        case METHODID_CREATE_INSTANCE:
          serviceImpl.createInstance(
              (com.google.cloud.notebooks.v1beta1.CreateInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_REGISTER_INSTANCE:
          serviceImpl.registerInstance(
              (com.google.cloud.notebooks.v1beta1.RegisterInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_SET_INSTANCE_ACCELERATOR:
          serviceImpl.setInstanceAccelerator(
              (com.google.cloud.notebooks.v1beta1.SetInstanceAcceleratorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_SET_INSTANCE_MACHINE_TYPE:
          serviceImpl.setInstanceMachineType(
              (com.google.cloud.notebooks.v1beta1.SetInstanceMachineTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_SET_INSTANCE_LABELS:
          serviceImpl.setInstanceLabels(
              (com.google.cloud.notebooks.v1beta1.SetInstanceLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_INSTANCE:
          serviceImpl.deleteInstance(
              (com.google.cloud.notebooks.v1beta1.DeleteInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_START_INSTANCE:
          serviceImpl.startInstance(
              (com.google.cloud.notebooks.v1beta1.StartInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_STOP_INSTANCE:
          serviceImpl.stopInstance(
              (com.google.cloud.notebooks.v1beta1.StopInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_RESET_INSTANCE:
          serviceImpl.resetInstance(
              (com.google.cloud.notebooks.v1beta1.ResetInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_REPORT_INSTANCE_INFO:
          serviceImpl.reportInstanceInfo(
              (com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_IS_INSTANCE_UPGRADEABLE:
          serviceImpl.isInstanceUpgradeable(
              (com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse>)
                  responseObserver);
          break;
        case METHODID_UPGRADE_INSTANCE:
          serviceImpl.upgradeInstance(
              (com.google.cloud.notebooks.v1beta1.UpgradeInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UPGRADE_INSTANCE_INTERNAL:
          serviceImpl.upgradeInstanceInternal(
              (com.google.cloud.notebooks.v1beta1.UpgradeInstanceInternalRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_LIST_ENVIRONMENTS:
          serviceImpl.listEnvironments(
              (com.google.cloud.notebooks.v1beta1.ListEnvironmentsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.notebooks.v1beta1.ListEnvironmentsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_ENVIRONMENT:
          serviceImpl.getEnvironment(
              (com.google.cloud.notebooks.v1beta1.GetEnvironmentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.notebooks.v1beta1.Environment>)
                  responseObserver);
          break;
        case METHODID_CREATE_ENVIRONMENT:
          serviceImpl.createEnvironment(
              (com.google.cloud.notebooks.v1beta1.CreateEnvironmentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_DELETE_ENVIRONMENT:
          serviceImpl.deleteEnvironment(
              (com.google.cloud.notebooks.v1beta1.DeleteEnvironmentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class NotebookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotebookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.notebooks.v1beta1.NotebooksProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NotebookService");
    }
  }

  private static final class NotebookServiceFileDescriptorSupplier
      extends NotebookServiceBaseDescriptorSupplier {
    NotebookServiceFileDescriptorSupplier() {}
  }

  private static final class NotebookServiceMethodDescriptorSupplier
      extends NotebookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotebookServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NotebookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new NotebookServiceFileDescriptorSupplier())
                      .addMethod(getListInstancesMethod())
                      .addMethod(getGetInstanceMethod())
                      .addMethod(getCreateInstanceMethod())
                      .addMethod(getRegisterInstanceMethod())
                      .addMethod(getSetInstanceAcceleratorMethod())
                      .addMethod(getSetInstanceMachineTypeMethod())
                      .addMethod(getSetInstanceLabelsMethod())
                      .addMethod(getDeleteInstanceMethod())
                      .addMethod(getStartInstanceMethod())
                      .addMethod(getStopInstanceMethod())
                      .addMethod(getResetInstanceMethod())
                      .addMethod(getReportInstanceInfoMethod())
                      .addMethod(getIsInstanceUpgradeableMethod())
                      .addMethod(getUpgradeInstanceMethod())
                      .addMethod(getUpgradeInstanceInternalMethod())
                      .addMethod(getListEnvironmentsMethod())
                      .addMethod(getGetEnvironmentMethod())
                      .addMethod(getCreateEnvironmentMethod())
                      .addMethod(getDeleteEnvironmentMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
