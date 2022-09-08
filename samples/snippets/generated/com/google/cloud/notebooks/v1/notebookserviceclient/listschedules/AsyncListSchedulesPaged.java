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

// [START notebooks_v1_generated_notebookserviceclient_listschedules_paged_async]
import com.google.cloud.notebooks.v1.ListSchedulesRequest;
import com.google.cloud.notebooks.v1.ListSchedulesResponse;
import com.google.cloud.notebooks.v1.NotebookServiceClient;
import com.google.cloud.notebooks.v1.Schedule;
import com.google.cloud.notebooks.v1.ScheduleName;
import com.google.common.base.Strings;

public class AsyncListSchedulesPaged {

  public static void main(String[] args) throws Exception {
    asyncListSchedulesPaged();
  }

  public static void asyncListSchedulesPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (NotebookServiceClient notebookServiceClient = NotebookServiceClient.create()) {
      ListSchedulesRequest request =
          ListSchedulesRequest.newBuilder()
              .setParent(ScheduleName.of("[PROJECT]", "[LOCATION]", "[SCHEDULE]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      while (true) {
        ListSchedulesResponse response =
            notebookServiceClient.listSchedulesCallable().call(request);
        for (Schedule element : response.getSchedulesList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END notebooks_v1_generated_notebookserviceclient_listschedules_paged_async]
