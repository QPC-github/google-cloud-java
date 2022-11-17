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

/**
 * A client to BeyondCorp API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= ClientGatewaysServiceClient =======================
 *
 * <p>Service Description: API Overview:
 *
 * <p>The `beyondcorp.googleapis.com` service implements the Google Cloud BeyondCorp API.
 *
 * <p>Data Model:
 *
 * <p>The ClientGatewaysService exposes the following resources:
 *
 * <ul>
 *   <li>Client Gateways, named as follows:
 *       `projects/{project_id}/locations/{location_id}/clientGateways/{client_gateway_id}`.
 * </ul>
 *
 * <p>Sample for ClientGatewaysServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (ClientGatewaysServiceClient clientGatewaysServiceClient =
 *     ClientGatewaysServiceClient.create()) {
 *   ClientGatewayName name = ClientGatewayName.of("[PROJECT]", "[LOCATION]", "[CLIENT_GATEWAY]");
 *   ClientGateway response = clientGatewaysServiceClient.getClientGateway(name);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.beyondcorp.clientgateways.v1;

import javax.annotation.Generated;
