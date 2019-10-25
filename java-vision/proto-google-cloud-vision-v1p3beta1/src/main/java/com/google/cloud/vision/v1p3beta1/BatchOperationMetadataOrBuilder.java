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
// source: google/cloud/vision/v1p3beta1/product_search_service.proto

package com.google.cloud.vision.v1p3beta1;

public interface BatchOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.BatchOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The current state of the batch operation.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.BatchOperationMetadata.State state = 1;</code>
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The current state of the batch operation.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p3beta1.BatchOperationMetadata.State state = 1;</code>
   */
  com.google.cloud.vision.v1p3beta1.BatchOperationMetadata.State getState();

  /**
   *
   *
   * <pre>
   * The time when the batch request was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 2;</code>
   */
  boolean hasSubmitTime();
  /**
   *
   *
   * <pre>
   * The time when the batch request was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 2;</code>
   */
  com.google.protobuf.Timestamp getSubmitTime();
  /**
   *
   *
   * <pre>
   * The time when the batch request was submitted to the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSubmitTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time when the batch request is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
   * set to true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * The time when the batch request is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
   * set to true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * The time when the batch request is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
   * set to true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
