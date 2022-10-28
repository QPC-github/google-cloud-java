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

package com.google.cloud.channel.v1.samples;

// [START cloudchannel_v1_generated_cloudchannelreportsserviceclient_listreports_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.channel.v1.CloudChannelReportsServiceClient;
import com.google.cloud.channel.v1.ListReportsRequest;
import com.google.cloud.channel.v1.Report;

public class AsyncListReports {

  public static void main(String[] args) throws Exception {
    asyncListReports();
  }

  public static void asyncListReports() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CloudChannelReportsServiceClient cloudChannelReportsServiceClient =
        CloudChannelReportsServiceClient.create()) {
      ListReportsRequest request =
          ListReportsRequest.newBuilder()
              .setParent("parent-995424086")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setLanguageCode("languageCode-2092349083")
              .build();
      ApiFuture<Report> future =
          cloudChannelReportsServiceClient.listReportsPagedCallable().futureCall(request);
      // Do something.
      for (Report element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END cloudchannel_v1_generated_cloudchannelreportsserviceclient_listreports_async]
