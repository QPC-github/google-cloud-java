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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface CreateJobTriggerRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.CreateJobTriggerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The JobTrigger to create.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.JobTrigger job_trigger = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the jobTrigger field is set.
   */
  boolean hasJobTrigger();
  /**
   *
   *
   * <pre>
   * Required. The JobTrigger to create.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.JobTrigger job_trigger = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The jobTrigger.
   */
  com.google.privacy.dlp.v2.JobTrigger getJobTrigger();
  /**
   *
   *
   * <pre>
   * Required. The JobTrigger to create.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.JobTrigger job_trigger = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.privacy.dlp.v2.JobTriggerOrBuilder getJobTriggerOrBuilder();

  /**
   *
   *
   * <pre>
   * The trigger id can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string trigger_id = 3;</code>
   *
   * @return The triggerId.
   */
  java.lang.String getTriggerId();
  /**
   *
   *
   * <pre>
   * The trigger id can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string trigger_id = 3;</code>
   *
   * @return The bytes for triggerId.
   */
  com.google.protobuf.ByteString getTriggerIdBytes();

  /**
   *
   *
   * <pre>
   * The geographic location to store the job trigger. Reserved for
   * future extensions.
   * </pre>
   *
   * <code>string location_id = 4;</code>
   *
   * @return The locationId.
   */
  java.lang.String getLocationId();
  /**
   *
   *
   * <pre>
   * The geographic location to store the job trigger. Reserved for
   * future extensions.
   * </pre>
   *
   * <code>string location_id = 4;</code>
   *
   * @return The bytes for locationId.
   */
  com.google.protobuf.ByteString getLocationIdBytes();
}
