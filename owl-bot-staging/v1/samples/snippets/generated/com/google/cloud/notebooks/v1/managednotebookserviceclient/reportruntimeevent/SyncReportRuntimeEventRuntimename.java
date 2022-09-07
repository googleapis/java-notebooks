/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.notebooks.v1.samples;

// [START notebooks_v1_generated_managednotebookserviceclient_reportruntimeevent_runtimename_sync]
import com.google.cloud.notebooks.v1.ManagedNotebookServiceClient;
import com.google.cloud.notebooks.v1.Runtime;
import com.google.cloud.notebooks.v1.RuntimeName;

public class SyncReportRuntimeEventRuntimename {

  public static void main(String[] args) throws Exception {
    syncReportRuntimeEventRuntimename();
  }

  public static void syncReportRuntimeEventRuntimename() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ManagedNotebookServiceClient managedNotebookServiceClient =
        ManagedNotebookServiceClient.create()) {
      RuntimeName name = RuntimeName.of("[PROJECT]", "[LOCATION]", "[RUNTIME]");
      Runtime response = managedNotebookServiceClient.reportRuntimeEventAsync(name).get();
    }
  }
}
// [END notebooks_v1_generated_managednotebookserviceclient_reportruntimeevent_runtimename_sync]
