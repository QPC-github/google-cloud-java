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
// source: google/cloud/vision/v1p4beta1/image_annotator.proto

package com.google.cloud.vision.v1p4beta1;

/**
 *
 *
 * <pre>
 * Response to an async batch file annotation request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse}
 */
public final class AsyncBatchAnnotateFilesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse)
    AsyncBatchAnnotateFilesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AsyncBatchAnnotateFilesResponse.newBuilder() to construct.
  private AsyncBatchAnnotateFilesResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AsyncBatchAnnotateFilesResponse() {
    responses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AsyncBatchAnnotateFilesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                responses_ =
                    new java.util.ArrayList<
                        com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse>();
                mutable_bitField0_ |= 0x00000001;
              }
              responses_.add(
                  input.readMessage(
                      com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse.parser(),
                      extensionRegistry));
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        responses_ = java.util.Collections.unmodifiableList(responses_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p4beta1_AsyncBatchAnnotateFilesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p4beta1_AsyncBatchAnnotateFilesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse.class,
            com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse.Builder.class);
  }

  public static final int RESPONSES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse> responses_;
  /**
   *
   *
   * <pre>
   * The list of file annotation responses, one for each request in
   * AsyncBatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
   */
  public java.util.List<com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse>
      getResponsesList() {
    return responses_;
  }
  /**
   *
   *
   * <pre>
   * The list of file annotation responses, one for each request in
   * AsyncBatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
   */
  public java.util.List<
          ? extends com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponseOrBuilder>
      getResponsesOrBuilderList() {
    return responses_;
  }
  /**
   *
   *
   * <pre>
   * The list of file annotation responses, one for each request in
   * AsyncBatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
   */
  public int getResponsesCount() {
    return responses_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of file annotation responses, one for each request in
   * AsyncBatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
   */
  public com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse getResponses(int index) {
    return responses_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of file annotation responses, one for each request in
   * AsyncBatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
   */
  public com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponseOrBuilder getResponsesOrBuilder(
      int index) {
    return responses_.get(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < responses_.size(); i++) {
      output.writeMessage(1, responses_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < responses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, responses_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse other =
        (com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse) obj;

    if (!getResponsesList().equals(other.getResponsesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getResponsesCount() > 0) {
      hash = (37 * hash) + RESPONSES_FIELD_NUMBER;
      hash = (53 * hash) + getResponsesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response to an async batch file annotation request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse)
      com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p4beta1_AsyncBatchAnnotateFilesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p4beta1_AsyncBatchAnnotateFilesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse.class,
              com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getResponsesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (responsesBuilder_ == null) {
        responses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        responsesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p4beta1_AsyncBatchAnnotateFilesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse build() {
      com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse buildPartial() {
      com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse result =
          new com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse(this);
      int from_bitField0_ = bitField0_;
      if (responsesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          responses_ = java.util.Collections.unmodifiableList(responses_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.responses_ = responses_;
      } else {
        result.responses_ = responsesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse) {
        return mergeFrom((com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse other) {
      if (other
          == com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse.getDefaultInstance())
        return this;
      if (responsesBuilder_ == null) {
        if (!other.responses_.isEmpty()) {
          if (responses_.isEmpty()) {
            responses_ = other.responses_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResponsesIsMutable();
            responses_.addAll(other.responses_);
          }
          onChanged();
        }
      } else {
        if (!other.responses_.isEmpty()) {
          if (responsesBuilder_.isEmpty()) {
            responsesBuilder_.dispose();
            responsesBuilder_ = null;
            responses_ = other.responses_;
            bitField0_ = (bitField0_ & ~0x00000001);
            responsesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getResponsesFieldBuilder()
                    : null;
          } else {
            responsesBuilder_.addAllMessages(other.responses_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse> responses_ =
        java.util.Collections.emptyList();

    private void ensureResponsesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        responses_ =
            new java.util.ArrayList<com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse>(
                responses_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse,
            com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse.Builder,
            com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponseOrBuilder>
        responsesBuilder_;

    /**
     *
     *
     * <pre>
     * The list of file annotation responses, one for each request in
     * AsyncBatchAnnotateFilesRequest.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
     */
    public java.util.List<com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse>
        getResponsesList() {
      if (responsesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(responses_);
      } else {
        return responsesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of file annotation responses, one for each request in
     * AsyncBatchAnnotateFilesRequest.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
     */
    public int getResponsesCount() {
      if (responsesBuilder_ == null) {
        return responses_.size();
      } else {
        return responsesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of file annotation responses, one for each request in
     * AsyncBatchAnnotateFilesRequest.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
     */
    public com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse getResponses(int index) {
      if (responsesBuilder_ == null) {
        return responses_.get(index);
      } else {
        return responsesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of file annotation responses, one for each request in
     * AsyncBatchAnnotateFilesRequest.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
     */
    public Builder setResponses(
        int index, com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.set(index, value);
        onChanged();
      } else {
        responsesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of file annotation responses, one for each request in
     * AsyncBatchAnnotateFilesRequest.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
     */
    public Builder setResponses(
        int index,
        com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.set(index, builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of file annotation responses, one for each request in
     * AsyncBatchAnnotateFilesRequest.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
     */
    public Builder addResponses(com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.add(value);
        onChanged();
      } else {
        responsesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of file annotation responses, one for each request in
     * AsyncBatchAnnotateFilesRequest.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
     */
    public Builder addResponses(
        int index, com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.add(index, value);
        onChanged();
      } else {
        responsesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of file annotation responses, one for each request in
     * AsyncBatchAnnotateFilesRequest.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
     */
    public Builder addResponses(
        com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.add(builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of file annotation responses, one for each request in
     * AsyncBatchAnnotateFilesRequest.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
     */
    public Builder addResponses(
        int index,
        com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.add(index, builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of file annotation responses, one for each request in
     * AsyncBatchAnnotateFilesRequest.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
     */
    public Builder addAllResponses(
        java.lang.Iterable<? extends com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse>
            values) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, responses_);
        onChanged();
      } else {
        responsesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of file annotation responses, one for each request in
     * AsyncBatchAnnotateFilesRequest.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
     */
    public Builder clearResponses() {
      if (responsesBuilder_ == null) {
        responses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        responsesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of file annotation responses, one for each request in
     * AsyncBatchAnnotateFilesRequest.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
     */
    public Builder removeResponses(int index) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.remove(index);
        onChanged();
      } else {
        responsesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of file annotation responses, one for each request in
     * AsyncBatchAnnotateFilesRequest.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
     */
    public com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse.Builder getResponsesBuilder(
        int index) {
      return getResponsesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of file annotation responses, one for each request in
     * AsyncBatchAnnotateFilesRequest.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
     */
    public com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponseOrBuilder
        getResponsesOrBuilder(int index) {
      if (responsesBuilder_ == null) {
        return responses_.get(index);
      } else {
        return responsesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of file annotation responses, one for each request in
     * AsyncBatchAnnotateFilesRequest.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
     */
    public java.util.List<
            ? extends com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponseOrBuilder>
        getResponsesOrBuilderList() {
      if (responsesBuilder_ != null) {
        return responsesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(responses_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of file annotation responses, one for each request in
     * AsyncBatchAnnotateFilesRequest.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
     */
    public com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse.Builder
        addResponsesBuilder() {
      return getResponsesFieldBuilder()
          .addBuilder(
              com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of file annotation responses, one for each request in
     * AsyncBatchAnnotateFilesRequest.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
     */
    public com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse.Builder addResponsesBuilder(
        int index) {
      return getResponsesFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of file annotation responses, one for each request in
     * AsyncBatchAnnotateFilesRequest.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse responses = 1;</code>
     */
    public java.util.List<com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse.Builder>
        getResponsesBuilderList() {
      return getResponsesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse,
            com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse.Builder,
            com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponseOrBuilder>
        getResponsesFieldBuilder() {
      if (responsesBuilder_ == null) {
        responsesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse,
                com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponse.Builder,
                com.google.cloud.vision.v1p4beta1.AsyncAnnotateFileResponseOrBuilder>(
                responses_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        responses_ = null;
      }
      return responsesBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse)
  private static final com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse();
  }

  public static com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AsyncBatchAnnotateFilesResponse> PARSER =
      new com.google.protobuf.AbstractParser<AsyncBatchAnnotateFilesResponse>() {
        @java.lang.Override
        public AsyncBatchAnnotateFilesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AsyncBatchAnnotateFilesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AsyncBatchAnnotateFilesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AsyncBatchAnnotateFilesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.AsyncBatchAnnotateFilesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
