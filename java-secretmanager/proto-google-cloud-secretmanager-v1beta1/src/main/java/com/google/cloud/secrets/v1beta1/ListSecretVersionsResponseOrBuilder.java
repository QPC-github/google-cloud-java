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

public interface ListSecretVersionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.secrets.v1beta1.ListSecretVersionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of [SecretVersions][google.cloud.secrets.v1beta1.SecretVersion] sorted in reverse by
   * create_time (newest first).
   * </pre>
   *
   * <code>repeated .google.cloud.secrets.v1beta1.SecretVersion versions = 1;</code>
   */
  java.util.List<com.google.cloud.secrets.v1beta1.SecretVersion> getVersionsList();
  /**
   *
   *
   * <pre>
   * The list of [SecretVersions][google.cloud.secrets.v1beta1.SecretVersion] sorted in reverse by
   * create_time (newest first).
   * </pre>
   *
   * <code>repeated .google.cloud.secrets.v1beta1.SecretVersion versions = 1;</code>
   */
  com.google.cloud.secrets.v1beta1.SecretVersion getVersions(int index);
  /**
   *
   *
   * <pre>
   * The list of [SecretVersions][google.cloud.secrets.v1beta1.SecretVersion] sorted in reverse by
   * create_time (newest first).
   * </pre>
   *
   * <code>repeated .google.cloud.secrets.v1beta1.SecretVersion versions = 1;</code>
   */
  int getVersionsCount();
  /**
   *
   *
   * <pre>
   * The list of [SecretVersions][google.cloud.secrets.v1beta1.SecretVersion] sorted in reverse by
   * create_time (newest first).
   * </pre>
   *
   * <code>repeated .google.cloud.secrets.v1beta1.SecretVersion versions = 1;</code>
   */
  java.util.List<? extends com.google.cloud.secrets.v1beta1.SecretVersionOrBuilder>
      getVersionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of [SecretVersions][google.cloud.secrets.v1beta1.SecretVersion] sorted in reverse by
   * create_time (newest first).
   * </pre>
   *
   * <code>repeated .google.cloud.secrets.v1beta1.SecretVersion versions = 1;</code>
   */
  com.google.cloud.secrets.v1beta1.SecretVersionOrBuilder getVersionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results. Pass this value in
   * [ListSecretVersionsRequest.page_token][google.cloud.secrets.v1beta1.ListSecretVersionsRequest.page_token] to retrieve the next page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results. Pass this value in
   * [ListSecretVersionsRequest.page_token][google.cloud.secrets.v1beta1.ListSecretVersionsRequest.page_token] to retrieve the next page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The total number of [SecretVersions][google.cloud.secrets.v1beta1.SecretVersion].
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   *
   * @return The totalSize.
   */
  int getTotalSize();
}
