/*
 * Copyright 2019 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/secrets/v1beta1/service.proto

package com.google.cloud.secrets.v1beta1;

public interface UpdateSecretRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.secrets.v1beta1.UpdateSecretRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. [Secret][google.cloud.secrets.v1beta1.Secret] with updated field values.
   * </pre>
   *
   * <code>
   * .google.cloud.secrets.v1beta1.Secret secret = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the secret field is set.
   */
  boolean hasSecret();
  /**
   *
   *
   * <pre>
   * Required. [Secret][google.cloud.secrets.v1beta1.Secret] with updated field values.
   * </pre>
   *
   * <code>
   * .google.cloud.secrets.v1beta1.Secret secret = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The secret.
   */
  com.google.cloud.secrets.v1beta1.Secret getSecret();
  /**
   *
   *
   * <pre>
   * Required. [Secret][google.cloud.secrets.v1beta1.Secret] with updated field values.
   * </pre>
   *
   * <code>
   * .google.cloud.secrets.v1beta1.Secret secret = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.secrets.v1beta1.SecretOrBuilder getSecretOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Specifies the fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Specifies the fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Specifies the fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
