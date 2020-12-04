/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.notebooks.v1beta1.stub;

import static com.google.cloud.notebooks.v1beta1.NotebookServiceClient.ListEnvironmentsPagedResponse;
import static com.google.cloud.notebooks.v1beta1.NotebookServiceClient.ListInstancesPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsExtractor;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.notebooks.v1beta1.CreateEnvironmentRequest;
import com.google.cloud.notebooks.v1beta1.CreateInstanceRequest;
import com.google.cloud.notebooks.v1beta1.DeleteEnvironmentRequest;
import com.google.cloud.notebooks.v1beta1.DeleteInstanceRequest;
import com.google.cloud.notebooks.v1beta1.Environment;
import com.google.cloud.notebooks.v1beta1.GetEnvironmentRequest;
import com.google.cloud.notebooks.v1beta1.GetInstanceRequest;
import com.google.cloud.notebooks.v1beta1.Instance;
import com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableRequest;
import com.google.cloud.notebooks.v1beta1.IsInstanceUpgradeableResponse;
import com.google.cloud.notebooks.v1beta1.ListEnvironmentsRequest;
import com.google.cloud.notebooks.v1beta1.ListEnvironmentsResponse;
import com.google.cloud.notebooks.v1beta1.ListInstancesRequest;
import com.google.cloud.notebooks.v1beta1.ListInstancesResponse;
import com.google.cloud.notebooks.v1beta1.OperationMetadata;
import com.google.cloud.notebooks.v1beta1.RegisterInstanceRequest;
import com.google.cloud.notebooks.v1beta1.ReportInstanceInfoRequest;
import com.google.cloud.notebooks.v1beta1.ResetInstanceRequest;
import com.google.cloud.notebooks.v1beta1.SetInstanceAcceleratorRequest;
import com.google.cloud.notebooks.v1beta1.SetInstanceLabelsRequest;
import com.google.cloud.notebooks.v1beta1.SetInstanceMachineTypeRequest;
import com.google.cloud.notebooks.v1beta1.StartInstanceRequest;
import com.google.cloud.notebooks.v1beta1.StopInstanceRequest;
import com.google.cloud.notebooks.v1beta1.UpgradeInstanceInternalRequest;
import com.google.cloud.notebooks.v1beta1.UpgradeInstanceRequest;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the NotebookService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcNotebookServiceStub extends NotebookServiceStub {
  private static final MethodDescriptor<ListInstancesRequest, ListInstancesResponse>
      listInstancesMethodDescriptor =
          MethodDescriptor.<ListInstancesRequest, ListInstancesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.notebooks.v1beta1.NotebookService/ListInstances")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListInstancesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListInstancesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetInstanceRequest, Instance> getInstanceMethodDescriptor =
      MethodDescriptor.<GetInstanceRequest, Instance>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.notebooks.v1beta1.NotebookService/GetInstance")
          .setRequestMarshaller(ProtoUtils.marshaller(GetInstanceRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Instance.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<CreateInstanceRequest, Operation>
      createInstanceMethodDescriptor =
          MethodDescriptor.<CreateInstanceRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.notebooks.v1beta1.NotebookService/CreateInstance")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<RegisterInstanceRequest, Operation>
      registerInstanceMethodDescriptor =
          MethodDescriptor.<RegisterInstanceRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.notebooks.v1beta1.NotebookService/RegisterInstance")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(RegisterInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<SetInstanceAcceleratorRequest, Operation>
      setInstanceAcceleratorMethodDescriptor =
          MethodDescriptor.<SetInstanceAcceleratorRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.notebooks.v1beta1.NotebookService/SetInstanceAccelerator")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SetInstanceAcceleratorRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<SetInstanceMachineTypeRequest, Operation>
      setInstanceMachineTypeMethodDescriptor =
          MethodDescriptor.<SetInstanceMachineTypeRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.notebooks.v1beta1.NotebookService/SetInstanceMachineType")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SetInstanceMachineTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<SetInstanceLabelsRequest, Operation>
      setInstanceLabelsMethodDescriptor =
          MethodDescriptor.<SetInstanceLabelsRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.notebooks.v1beta1.NotebookService/SetInstanceLabels")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SetInstanceLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteInstanceRequest, Operation>
      deleteInstanceMethodDescriptor =
          MethodDescriptor.<DeleteInstanceRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.notebooks.v1beta1.NotebookService/DeleteInstance")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<StartInstanceRequest, Operation>
      startInstanceMethodDescriptor =
          MethodDescriptor.<StartInstanceRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.notebooks.v1beta1.NotebookService/StartInstance")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(StartInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<StopInstanceRequest, Operation>
      stopInstanceMethodDescriptor =
          MethodDescriptor.<StopInstanceRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.notebooks.v1beta1.NotebookService/StopInstance")
              .setRequestMarshaller(ProtoUtils.marshaller(StopInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ResetInstanceRequest, Operation>
      resetInstanceMethodDescriptor =
          MethodDescriptor.<ResetInstanceRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.notebooks.v1beta1.NotebookService/ResetInstance")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ResetInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ReportInstanceInfoRequest, Operation>
      reportInstanceInfoMethodDescriptor =
          MethodDescriptor.<ReportInstanceInfoRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.notebooks.v1beta1.NotebookService/ReportInstanceInfo")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ReportInstanceInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<IsInstanceUpgradeableRequest, IsInstanceUpgradeableResponse>
      isInstanceUpgradeableMethodDescriptor =
          MethodDescriptor.<IsInstanceUpgradeableRequest, IsInstanceUpgradeableResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.notebooks.v1beta1.NotebookService/IsInstanceUpgradeable")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(IsInstanceUpgradeableRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(IsInstanceUpgradeableResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpgradeInstanceRequest, Operation>
      upgradeInstanceMethodDescriptor =
          MethodDescriptor.<UpgradeInstanceRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.notebooks.v1beta1.NotebookService/UpgradeInstance")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpgradeInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpgradeInstanceInternalRequest, Operation>
      upgradeInstanceInternalMethodDescriptor =
          MethodDescriptor.<UpgradeInstanceInternalRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.notebooks.v1beta1.NotebookService/UpgradeInstanceInternal")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpgradeInstanceInternalRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListEnvironmentsRequest, ListEnvironmentsResponse>
      listEnvironmentsMethodDescriptor =
          MethodDescriptor.<ListEnvironmentsRequest, ListEnvironmentsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.notebooks.v1beta1.NotebookService/ListEnvironments")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListEnvironmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListEnvironmentsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetEnvironmentRequest, Environment>
      getEnvironmentMethodDescriptor =
          MethodDescriptor.<GetEnvironmentRequest, Environment>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.notebooks.v1beta1.NotebookService/GetEnvironment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetEnvironmentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Environment.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreateEnvironmentRequest, Operation>
      createEnvironmentMethodDescriptor =
          MethodDescriptor.<CreateEnvironmentRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.notebooks.v1beta1.NotebookService/CreateEnvironment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateEnvironmentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteEnvironmentRequest, Operation>
      deleteEnvironmentMethodDescriptor =
          MethodDescriptor.<DeleteEnvironmentRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.notebooks.v1beta1.NotebookService/DeleteEnvironment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteEnvironmentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private final UnaryCallable<ListInstancesRequest, ListInstancesResponse> listInstancesCallable;
  private final UnaryCallable<ListInstancesRequest, ListInstancesPagedResponse>
      listInstancesPagedCallable;
  private final UnaryCallable<GetInstanceRequest, Instance> getInstanceCallable;
  private final UnaryCallable<CreateInstanceRequest, Operation> createInstanceCallable;
  private final OperationCallable<CreateInstanceRequest, Instance, OperationMetadata>
      createInstanceOperationCallable;
  private final UnaryCallable<RegisterInstanceRequest, Operation> registerInstanceCallable;
  private final OperationCallable<RegisterInstanceRequest, Instance, OperationMetadata>
      registerInstanceOperationCallable;
  private final UnaryCallable<SetInstanceAcceleratorRequest, Operation>
      setInstanceAcceleratorCallable;
  private final OperationCallable<SetInstanceAcceleratorRequest, Instance, OperationMetadata>
      setInstanceAcceleratorOperationCallable;
  private final UnaryCallable<SetInstanceMachineTypeRequest, Operation>
      setInstanceMachineTypeCallable;
  private final OperationCallable<SetInstanceMachineTypeRequest, Instance, OperationMetadata>
      setInstanceMachineTypeOperationCallable;
  private final UnaryCallable<SetInstanceLabelsRequest, Operation> setInstanceLabelsCallable;
  private final OperationCallable<SetInstanceLabelsRequest, Instance, OperationMetadata>
      setInstanceLabelsOperationCallable;
  private final UnaryCallable<DeleteInstanceRequest, Operation> deleteInstanceCallable;
  private final OperationCallable<DeleteInstanceRequest, Empty, OperationMetadata>
      deleteInstanceOperationCallable;
  private final UnaryCallable<StartInstanceRequest, Operation> startInstanceCallable;
  private final OperationCallable<StartInstanceRequest, Instance, OperationMetadata>
      startInstanceOperationCallable;
  private final UnaryCallable<StopInstanceRequest, Operation> stopInstanceCallable;
  private final OperationCallable<StopInstanceRequest, Instance, OperationMetadata>
      stopInstanceOperationCallable;
  private final UnaryCallable<ResetInstanceRequest, Operation> resetInstanceCallable;
  private final OperationCallable<ResetInstanceRequest, Instance, OperationMetadata>
      resetInstanceOperationCallable;
  private final UnaryCallable<ReportInstanceInfoRequest, Operation> reportInstanceInfoCallable;
  private final OperationCallable<ReportInstanceInfoRequest, Instance, OperationMetadata>
      reportInstanceInfoOperationCallable;
  private final UnaryCallable<IsInstanceUpgradeableRequest, IsInstanceUpgradeableResponse>
      isInstanceUpgradeableCallable;
  private final UnaryCallable<UpgradeInstanceRequest, Operation> upgradeInstanceCallable;
  private final OperationCallable<UpgradeInstanceRequest, Instance, OperationMetadata>
      upgradeInstanceOperationCallable;
  private final UnaryCallable<UpgradeInstanceInternalRequest, Operation>
      upgradeInstanceInternalCallable;
  private final OperationCallable<UpgradeInstanceInternalRequest, Instance, OperationMetadata>
      upgradeInstanceInternalOperationCallable;
  private final UnaryCallable<ListEnvironmentsRequest, ListEnvironmentsResponse>
      listEnvironmentsCallable;
  private final UnaryCallable<ListEnvironmentsRequest, ListEnvironmentsPagedResponse>
      listEnvironmentsPagedCallable;
  private final UnaryCallable<GetEnvironmentRequest, Environment> getEnvironmentCallable;
  private final UnaryCallable<CreateEnvironmentRequest, Operation> createEnvironmentCallable;
  private final OperationCallable<CreateEnvironmentRequest, Environment, OperationMetadata>
      createEnvironmentOperationCallable;
  private final UnaryCallable<DeleteEnvironmentRequest, Operation> deleteEnvironmentCallable;
  private final OperationCallable<DeleteEnvironmentRequest, Empty, OperationMetadata>
      deleteEnvironmentOperationCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcNotebookServiceStub create(NotebookServiceStubSettings settings)
      throws IOException {
    return new GrpcNotebookServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcNotebookServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcNotebookServiceStub(
        NotebookServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcNotebookServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcNotebookServiceStub(
        NotebookServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  protected GrpcNotebookServiceStub(
      NotebookServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcNotebookServiceCallableFactory());
  }

  protected GrpcNotebookServiceStub(
      NotebookServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<ListInstancesRequest, ListInstancesResponse> listInstancesTransportSettings =
        GrpcCallSettings.<ListInstancesRequest, ListInstancesResponse>newBuilder()
            .setMethodDescriptor(listInstancesMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<ListInstancesRequest>() {
                  @Override
                  public Map<String, String> extract(ListInstancesRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<GetInstanceRequest, Instance> getInstanceTransportSettings =
        GrpcCallSettings.<GetInstanceRequest, Instance>newBuilder()
            .setMethodDescriptor(getInstanceMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetInstanceRequest>() {
                  @Override
                  public Map<String, String> extract(GetInstanceRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<CreateInstanceRequest, Operation> createInstanceTransportSettings =
        GrpcCallSettings.<CreateInstanceRequest, Operation>newBuilder()
            .setMethodDescriptor(createInstanceMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<CreateInstanceRequest>() {
                  @Override
                  public Map<String, String> extract(CreateInstanceRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<RegisterInstanceRequest, Operation> registerInstanceTransportSettings =
        GrpcCallSettings.<RegisterInstanceRequest, Operation>newBuilder()
            .setMethodDescriptor(registerInstanceMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<RegisterInstanceRequest>() {
                  @Override
                  public Map<String, String> extract(RegisterInstanceRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<SetInstanceAcceleratorRequest, Operation>
        setInstanceAcceleratorTransportSettings =
            GrpcCallSettings.<SetInstanceAcceleratorRequest, Operation>newBuilder()
                .setMethodDescriptor(setInstanceAcceleratorMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<SetInstanceAcceleratorRequest>() {
                      @Override
                      public Map<String, String> extract(SetInstanceAcceleratorRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("name", String.valueOf(request.getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<SetInstanceMachineTypeRequest, Operation>
        setInstanceMachineTypeTransportSettings =
            GrpcCallSettings.<SetInstanceMachineTypeRequest, Operation>newBuilder()
                .setMethodDescriptor(setInstanceMachineTypeMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<SetInstanceMachineTypeRequest>() {
                      @Override
                      public Map<String, String> extract(SetInstanceMachineTypeRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("name", String.valueOf(request.getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<SetInstanceLabelsRequest, Operation> setInstanceLabelsTransportSettings =
        GrpcCallSettings.<SetInstanceLabelsRequest, Operation>newBuilder()
            .setMethodDescriptor(setInstanceLabelsMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<SetInstanceLabelsRequest>() {
                  @Override
                  public Map<String, String> extract(SetInstanceLabelsRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<DeleteInstanceRequest, Operation> deleteInstanceTransportSettings =
        GrpcCallSettings.<DeleteInstanceRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteInstanceMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<DeleteInstanceRequest>() {
                  @Override
                  public Map<String, String> extract(DeleteInstanceRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<StartInstanceRequest, Operation> startInstanceTransportSettings =
        GrpcCallSettings.<StartInstanceRequest, Operation>newBuilder()
            .setMethodDescriptor(startInstanceMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<StartInstanceRequest>() {
                  @Override
                  public Map<String, String> extract(StartInstanceRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<StopInstanceRequest, Operation> stopInstanceTransportSettings =
        GrpcCallSettings.<StopInstanceRequest, Operation>newBuilder()
            .setMethodDescriptor(stopInstanceMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<StopInstanceRequest>() {
                  @Override
                  public Map<String, String> extract(StopInstanceRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ResetInstanceRequest, Operation> resetInstanceTransportSettings =
        GrpcCallSettings.<ResetInstanceRequest, Operation>newBuilder()
            .setMethodDescriptor(resetInstanceMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<ResetInstanceRequest>() {
                  @Override
                  public Map<String, String> extract(ResetInstanceRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<ReportInstanceInfoRequest, Operation> reportInstanceInfoTransportSettings =
        GrpcCallSettings.<ReportInstanceInfoRequest, Operation>newBuilder()
            .setMethodDescriptor(reportInstanceInfoMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<ReportInstanceInfoRequest>() {
                  @Override
                  public Map<String, String> extract(ReportInstanceInfoRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<IsInstanceUpgradeableRequest, IsInstanceUpgradeableResponse>
        isInstanceUpgradeableTransportSettings =
            GrpcCallSettings
                .<IsInstanceUpgradeableRequest, IsInstanceUpgradeableResponse>newBuilder()
                .setMethodDescriptor(isInstanceUpgradeableMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<IsInstanceUpgradeableRequest>() {
                      @Override
                      public Map<String, String> extract(IsInstanceUpgradeableRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put(
                            "notebook_instance", String.valueOf(request.getNotebookInstance()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<UpgradeInstanceRequest, Operation> upgradeInstanceTransportSettings =
        GrpcCallSettings.<UpgradeInstanceRequest, Operation>newBuilder()
            .setMethodDescriptor(upgradeInstanceMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<UpgradeInstanceRequest>() {
                  @Override
                  public Map<String, String> extract(UpgradeInstanceRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<UpgradeInstanceInternalRequest, Operation>
        upgradeInstanceInternalTransportSettings =
            GrpcCallSettings.<UpgradeInstanceInternalRequest, Operation>newBuilder()
                .setMethodDescriptor(upgradeInstanceInternalMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<UpgradeInstanceInternalRequest>() {
                      @Override
                      public Map<String, String> extract(UpgradeInstanceInternalRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("name", String.valueOf(request.getName()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<ListEnvironmentsRequest, ListEnvironmentsResponse>
        listEnvironmentsTransportSettings =
            GrpcCallSettings.<ListEnvironmentsRequest, ListEnvironmentsResponse>newBuilder()
                .setMethodDescriptor(listEnvironmentsMethodDescriptor)
                .setParamsExtractor(
                    new RequestParamsExtractor<ListEnvironmentsRequest>() {
                      @Override
                      public Map<String, String> extract(ListEnvironmentsRequest request) {
                        ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                        params.put("parent", String.valueOf(request.getParent()));
                        return params.build();
                      }
                    })
                .build();
    GrpcCallSettings<GetEnvironmentRequest, Environment> getEnvironmentTransportSettings =
        GrpcCallSettings.<GetEnvironmentRequest, Environment>newBuilder()
            .setMethodDescriptor(getEnvironmentMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<GetEnvironmentRequest>() {
                  @Override
                  public Map<String, String> extract(GetEnvironmentRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<CreateEnvironmentRequest, Operation> createEnvironmentTransportSettings =
        GrpcCallSettings.<CreateEnvironmentRequest, Operation>newBuilder()
            .setMethodDescriptor(createEnvironmentMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<CreateEnvironmentRequest>() {
                  @Override
                  public Map<String, String> extract(CreateEnvironmentRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("parent", String.valueOf(request.getParent()));
                    return params.build();
                  }
                })
            .build();
    GrpcCallSettings<DeleteEnvironmentRequest, Operation> deleteEnvironmentTransportSettings =
        GrpcCallSettings.<DeleteEnvironmentRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteEnvironmentMethodDescriptor)
            .setParamsExtractor(
                new RequestParamsExtractor<DeleteEnvironmentRequest>() {
                  @Override
                  public Map<String, String> extract(DeleteEnvironmentRequest request) {
                    ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                    params.put("name", String.valueOf(request.getName()));
                    return params.build();
                  }
                })
            .build();

    this.listInstancesCallable =
        callableFactory.createUnaryCallable(
            listInstancesTransportSettings, settings.listInstancesSettings(), clientContext);
    this.listInstancesPagedCallable =
        callableFactory.createPagedCallable(
            listInstancesTransportSettings, settings.listInstancesSettings(), clientContext);
    this.getInstanceCallable =
        callableFactory.createUnaryCallable(
            getInstanceTransportSettings, settings.getInstanceSettings(), clientContext);
    this.createInstanceCallable =
        callableFactory.createUnaryCallable(
            createInstanceTransportSettings, settings.createInstanceSettings(), clientContext);
    this.createInstanceOperationCallable =
        callableFactory.createOperationCallable(
            createInstanceTransportSettings,
            settings.createInstanceOperationSettings(),
            clientContext,
            operationsStub);
    this.registerInstanceCallable =
        callableFactory.createUnaryCallable(
            registerInstanceTransportSettings, settings.registerInstanceSettings(), clientContext);
    this.registerInstanceOperationCallable =
        callableFactory.createOperationCallable(
            registerInstanceTransportSettings,
            settings.registerInstanceOperationSettings(),
            clientContext,
            operationsStub);
    this.setInstanceAcceleratorCallable =
        callableFactory.createUnaryCallable(
            setInstanceAcceleratorTransportSettings,
            settings.setInstanceAcceleratorSettings(),
            clientContext);
    this.setInstanceAcceleratorOperationCallable =
        callableFactory.createOperationCallable(
            setInstanceAcceleratorTransportSettings,
            settings.setInstanceAcceleratorOperationSettings(),
            clientContext,
            operationsStub);
    this.setInstanceMachineTypeCallable =
        callableFactory.createUnaryCallable(
            setInstanceMachineTypeTransportSettings,
            settings.setInstanceMachineTypeSettings(),
            clientContext);
    this.setInstanceMachineTypeOperationCallable =
        callableFactory.createOperationCallable(
            setInstanceMachineTypeTransportSettings,
            settings.setInstanceMachineTypeOperationSettings(),
            clientContext,
            operationsStub);
    this.setInstanceLabelsCallable =
        callableFactory.createUnaryCallable(
            setInstanceLabelsTransportSettings,
            settings.setInstanceLabelsSettings(),
            clientContext);
    this.setInstanceLabelsOperationCallable =
        callableFactory.createOperationCallable(
            setInstanceLabelsTransportSettings,
            settings.setInstanceLabelsOperationSettings(),
            clientContext,
            operationsStub);
    this.deleteInstanceCallable =
        callableFactory.createUnaryCallable(
            deleteInstanceTransportSettings, settings.deleteInstanceSettings(), clientContext);
    this.deleteInstanceOperationCallable =
        callableFactory.createOperationCallable(
            deleteInstanceTransportSettings,
            settings.deleteInstanceOperationSettings(),
            clientContext,
            operationsStub);
    this.startInstanceCallable =
        callableFactory.createUnaryCallable(
            startInstanceTransportSettings, settings.startInstanceSettings(), clientContext);
    this.startInstanceOperationCallable =
        callableFactory.createOperationCallable(
            startInstanceTransportSettings,
            settings.startInstanceOperationSettings(),
            clientContext,
            operationsStub);
    this.stopInstanceCallable =
        callableFactory.createUnaryCallable(
            stopInstanceTransportSettings, settings.stopInstanceSettings(), clientContext);
    this.stopInstanceOperationCallable =
        callableFactory.createOperationCallable(
            stopInstanceTransportSettings,
            settings.stopInstanceOperationSettings(),
            clientContext,
            operationsStub);
    this.resetInstanceCallable =
        callableFactory.createUnaryCallable(
            resetInstanceTransportSettings, settings.resetInstanceSettings(), clientContext);
    this.resetInstanceOperationCallable =
        callableFactory.createOperationCallable(
            resetInstanceTransportSettings,
            settings.resetInstanceOperationSettings(),
            clientContext,
            operationsStub);
    this.reportInstanceInfoCallable =
        callableFactory.createUnaryCallable(
            reportInstanceInfoTransportSettings,
            settings.reportInstanceInfoSettings(),
            clientContext);
    this.reportInstanceInfoOperationCallable =
        callableFactory.createOperationCallable(
            reportInstanceInfoTransportSettings,
            settings.reportInstanceInfoOperationSettings(),
            clientContext,
            operationsStub);
    this.isInstanceUpgradeableCallable =
        callableFactory.createUnaryCallable(
            isInstanceUpgradeableTransportSettings,
            settings.isInstanceUpgradeableSettings(),
            clientContext);
    this.upgradeInstanceCallable =
        callableFactory.createUnaryCallable(
            upgradeInstanceTransportSettings, settings.upgradeInstanceSettings(), clientContext);
    this.upgradeInstanceOperationCallable =
        callableFactory.createOperationCallable(
            upgradeInstanceTransportSettings,
            settings.upgradeInstanceOperationSettings(),
            clientContext,
            operationsStub);
    this.upgradeInstanceInternalCallable =
        callableFactory.createUnaryCallable(
            upgradeInstanceInternalTransportSettings,
            settings.upgradeInstanceInternalSettings(),
            clientContext);
    this.upgradeInstanceInternalOperationCallable =
        callableFactory.createOperationCallable(
            upgradeInstanceInternalTransportSettings,
            settings.upgradeInstanceInternalOperationSettings(),
            clientContext,
            operationsStub);
    this.listEnvironmentsCallable =
        callableFactory.createUnaryCallable(
            listEnvironmentsTransportSettings, settings.listEnvironmentsSettings(), clientContext);
    this.listEnvironmentsPagedCallable =
        callableFactory.createPagedCallable(
            listEnvironmentsTransportSettings, settings.listEnvironmentsSettings(), clientContext);
    this.getEnvironmentCallable =
        callableFactory.createUnaryCallable(
            getEnvironmentTransportSettings, settings.getEnvironmentSettings(), clientContext);
    this.createEnvironmentCallable =
        callableFactory.createUnaryCallable(
            createEnvironmentTransportSettings,
            settings.createEnvironmentSettings(),
            clientContext);
    this.createEnvironmentOperationCallable =
        callableFactory.createOperationCallable(
            createEnvironmentTransportSettings,
            settings.createEnvironmentOperationSettings(),
            clientContext,
            operationsStub);
    this.deleteEnvironmentCallable =
        callableFactory.createUnaryCallable(
            deleteEnvironmentTransportSettings,
            settings.deleteEnvironmentSettings(),
            clientContext);
    this.deleteEnvironmentOperationCallable =
        callableFactory.createOperationCallable(
            deleteEnvironmentTransportSettings,
            settings.deleteEnvironmentOperationSettings(),
            clientContext,
            operationsStub);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<ListInstancesRequest, ListInstancesResponse> listInstancesCallable() {
    return listInstancesCallable;
  }

  public UnaryCallable<ListInstancesRequest, ListInstancesPagedResponse>
      listInstancesPagedCallable() {
    return listInstancesPagedCallable;
  }

  public UnaryCallable<GetInstanceRequest, Instance> getInstanceCallable() {
    return getInstanceCallable;
  }

  public UnaryCallable<CreateInstanceRequest, Operation> createInstanceCallable() {
    return createInstanceCallable;
  }

  public OperationCallable<CreateInstanceRequest, Instance, OperationMetadata>
      createInstanceOperationCallable() {
    return createInstanceOperationCallable;
  }

  public UnaryCallable<RegisterInstanceRequest, Operation> registerInstanceCallable() {
    return registerInstanceCallable;
  }

  public OperationCallable<RegisterInstanceRequest, Instance, OperationMetadata>
      registerInstanceOperationCallable() {
    return registerInstanceOperationCallable;
  }

  public UnaryCallable<SetInstanceAcceleratorRequest, Operation> setInstanceAcceleratorCallable() {
    return setInstanceAcceleratorCallable;
  }

  public OperationCallable<SetInstanceAcceleratorRequest, Instance, OperationMetadata>
      setInstanceAcceleratorOperationCallable() {
    return setInstanceAcceleratorOperationCallable;
  }

  public UnaryCallable<SetInstanceMachineTypeRequest, Operation> setInstanceMachineTypeCallable() {
    return setInstanceMachineTypeCallable;
  }

  public OperationCallable<SetInstanceMachineTypeRequest, Instance, OperationMetadata>
      setInstanceMachineTypeOperationCallable() {
    return setInstanceMachineTypeOperationCallable;
  }

  public UnaryCallable<SetInstanceLabelsRequest, Operation> setInstanceLabelsCallable() {
    return setInstanceLabelsCallable;
  }

  public OperationCallable<SetInstanceLabelsRequest, Instance, OperationMetadata>
      setInstanceLabelsOperationCallable() {
    return setInstanceLabelsOperationCallable;
  }

  public UnaryCallable<DeleteInstanceRequest, Operation> deleteInstanceCallable() {
    return deleteInstanceCallable;
  }

  public OperationCallable<DeleteInstanceRequest, Empty, OperationMetadata>
      deleteInstanceOperationCallable() {
    return deleteInstanceOperationCallable;
  }

  public UnaryCallable<StartInstanceRequest, Operation> startInstanceCallable() {
    return startInstanceCallable;
  }

  public OperationCallable<StartInstanceRequest, Instance, OperationMetadata>
      startInstanceOperationCallable() {
    return startInstanceOperationCallable;
  }

  public UnaryCallable<StopInstanceRequest, Operation> stopInstanceCallable() {
    return stopInstanceCallable;
  }

  public OperationCallable<StopInstanceRequest, Instance, OperationMetadata>
      stopInstanceOperationCallable() {
    return stopInstanceOperationCallable;
  }

  public UnaryCallable<ResetInstanceRequest, Operation> resetInstanceCallable() {
    return resetInstanceCallable;
  }

  public OperationCallable<ResetInstanceRequest, Instance, OperationMetadata>
      resetInstanceOperationCallable() {
    return resetInstanceOperationCallable;
  }

  public UnaryCallable<ReportInstanceInfoRequest, Operation> reportInstanceInfoCallable() {
    return reportInstanceInfoCallable;
  }

  public OperationCallable<ReportInstanceInfoRequest, Instance, OperationMetadata>
      reportInstanceInfoOperationCallable() {
    return reportInstanceInfoOperationCallable;
  }

  public UnaryCallable<IsInstanceUpgradeableRequest, IsInstanceUpgradeableResponse>
      isInstanceUpgradeableCallable() {
    return isInstanceUpgradeableCallable;
  }

  public UnaryCallable<UpgradeInstanceRequest, Operation> upgradeInstanceCallable() {
    return upgradeInstanceCallable;
  }

  public OperationCallable<UpgradeInstanceRequest, Instance, OperationMetadata>
      upgradeInstanceOperationCallable() {
    return upgradeInstanceOperationCallable;
  }

  public UnaryCallable<UpgradeInstanceInternalRequest, Operation>
      upgradeInstanceInternalCallable() {
    return upgradeInstanceInternalCallable;
  }

  public OperationCallable<UpgradeInstanceInternalRequest, Instance, OperationMetadata>
      upgradeInstanceInternalOperationCallable() {
    return upgradeInstanceInternalOperationCallable;
  }

  public UnaryCallable<ListEnvironmentsRequest, ListEnvironmentsResponse>
      listEnvironmentsCallable() {
    return listEnvironmentsCallable;
  }

  public UnaryCallable<ListEnvironmentsRequest, ListEnvironmentsPagedResponse>
      listEnvironmentsPagedCallable() {
    return listEnvironmentsPagedCallable;
  }

  public UnaryCallable<GetEnvironmentRequest, Environment> getEnvironmentCallable() {
    return getEnvironmentCallable;
  }

  public UnaryCallable<CreateEnvironmentRequest, Operation> createEnvironmentCallable() {
    return createEnvironmentCallable;
  }

  public OperationCallable<CreateEnvironmentRequest, Environment, OperationMetadata>
      createEnvironmentOperationCallable() {
    return createEnvironmentOperationCallable;
  }

  public UnaryCallable<DeleteEnvironmentRequest, Operation> deleteEnvironmentCallable() {
    return deleteEnvironmentCallable;
  }

  public OperationCallable<DeleteEnvironmentRequest, Empty, OperationMetadata>
      deleteEnvironmentOperationCallable() {
    return deleteEnvironmentOperationCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
