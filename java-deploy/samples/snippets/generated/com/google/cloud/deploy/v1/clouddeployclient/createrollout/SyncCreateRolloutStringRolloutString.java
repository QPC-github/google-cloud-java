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

package com.google.cloud.deploy.v1.samples;

// [START clouddeploy_v1_generated_clouddeployclient_createrollout_stringrolloutstring_sync]
import com.google.cloud.deploy.v1.CloudDeployClient;
import com.google.cloud.deploy.v1.ReleaseName;
import com.google.cloud.deploy.v1.Rollout;

public class SyncCreateRolloutStringRolloutString {

  public static void main(String[] args) throws Exception {
    syncCreateRolloutStringRolloutString();
  }

  public static void syncCreateRolloutStringRolloutString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CloudDeployClient cloudDeployClient = CloudDeployClient.create()) {
      String parent =
          ReleaseName.of("[PROJECT]", "[LOCATION]", "[DELIVERY_PIPELINE]", "[RELEASE]").toString();
      Rollout rollout = Rollout.newBuilder().build();
      String rolloutId = "rolloutId551248556";
      Rollout response = cloudDeployClient.createRolloutAsync(parent, rollout, rolloutId).get();
    }
  }
}
// [END clouddeploy_v1_generated_clouddeployclient_createrollout_stringrolloutstring_sync]
