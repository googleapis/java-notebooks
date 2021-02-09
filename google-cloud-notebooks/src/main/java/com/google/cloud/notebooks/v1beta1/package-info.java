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

/**
 * The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= NotebookServiceClient =======================
 *
 * <p>Service Description: API v1beta1 service for Cloud AI Platform Notebooks.
 *
 * <p>Sample for NotebookServiceClient:
 *
 * <pre>{@code
 * try (NotebookServiceClient notebookServiceClient = NotebookServiceClient.create()) {
 *   GetInstanceRequest request = GetInstanceRequest.newBuilder().setName("name3373707").build();
 *   Instance response = notebookServiceClient.getInstance(request);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.notebooks.v1beta1;

import javax.annotation.Generated;
