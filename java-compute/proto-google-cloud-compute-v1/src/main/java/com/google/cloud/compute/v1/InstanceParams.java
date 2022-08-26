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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * Additional instance params.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InstanceParams}
 */
public final class InstanceParams extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstanceParams)
    InstanceParamsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstanceParams.newBuilder() to construct.
  private InstanceParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceParams() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceParams();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private InstanceParams(
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
          case -1273597982:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                resourceManagerTags_ =
                    com.google.protobuf.MapField.newMapField(
                        ResourceManagerTagsDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
                  resourceManagerTags__ =
                      input.readMessage(
                          ResourceManagerTagsDefaultEntryHolder.defaultEntry.getParserForType(),
                          extensionRegistry);
              resourceManagerTags_
                  .getMutableMap()
                  .put(resourceManagerTags__.getKey(), resourceManagerTags__.getValue());
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceParams_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 377671164:
        return internalGetResourceManagerTags();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstanceParams.class,
            com.google.cloud.compute.v1.InstanceParams.Builder.class);
  }

  public static final int RESOURCE_MANAGER_TAGS_FIELD_NUMBER = 377671164;

  private static final class ResourceManagerTagsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.compute.v1.Compute
                .internal_static_google_cloud_compute_v1_InstanceParams_ResourceManagerTagsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> resourceManagerTags_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
      internalGetResourceManagerTags() {
    if (resourceManagerTags_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ResourceManagerTagsDefaultEntryHolder.defaultEntry);
    }
    return resourceManagerTags_;
  }

  public int getResourceManagerTagsCount() {
    return internalGetResourceManagerTags().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */
  @java.lang.Override
  public boolean containsResourceManagerTags(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetResourceManagerTags().getMap().containsKey(key);
  }
  /** Use {@link #getResourceManagerTagsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getResourceManagerTags() {
    return getResourceManagerTagsMap();
  }
  /**
   *
   *
   * <pre>
   * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getResourceManagerTagsMap() {
    return internalGetResourceManagerTags().getMap();
  }
  /**
   *
   *
   * <pre>
   * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */
  @java.lang.Override
  public java.lang.String getResourceManagerTagsOrDefault(
      java.lang.String key, java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetResourceManagerTags().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */
  @java.lang.Override
  public java.lang.String getResourceManagerTagsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetResourceManagerTags().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output,
        internalGetResourceManagerTags(),
        ResourceManagerTagsDefaultEntryHolder.defaultEntry,
        377671164);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetResourceManagerTags().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> resourceManagerTags__ =
          ResourceManagerTagsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              377671164, resourceManagerTags__);
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
    if (!(obj instanceof com.google.cloud.compute.v1.InstanceParams)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstanceParams other =
        (com.google.cloud.compute.v1.InstanceParams) obj;

    if (!internalGetResourceManagerTags().equals(other.internalGetResourceManagerTags()))
      return false;
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
    if (!internalGetResourceManagerTags().getMap().isEmpty()) {
      hash = (37 * hash) + RESOURCE_MANAGER_TAGS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetResourceManagerTags().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstanceParams parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceParams parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceParams parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceParams parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceParams parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceParams parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceParams parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceParams parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.InstanceParams prototype) {
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
   * Additional instance params.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InstanceParams}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstanceParams)
      com.google.cloud.compute.v1.InstanceParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceParams_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 377671164:
          return internalGetResourceManagerTags();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 377671164:
          return internalGetMutableResourceManagerTags();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstanceParams.class,
              com.google.cloud.compute.v1.InstanceParams.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InstanceParams.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableResourceManagerTags().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceParams_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceParams getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstanceParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceParams build() {
      com.google.cloud.compute.v1.InstanceParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceParams buildPartial() {
      com.google.cloud.compute.v1.InstanceParams result =
          new com.google.cloud.compute.v1.InstanceParams(this);
      int from_bitField0_ = bitField0_;
      result.resourceManagerTags_ = internalGetResourceManagerTags();
      result.resourceManagerTags_.makeImmutable();
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
      if (other instanceof com.google.cloud.compute.v1.InstanceParams) {
        return mergeFrom((com.google.cloud.compute.v1.InstanceParams) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.InstanceParams other) {
      if (other == com.google.cloud.compute.v1.InstanceParams.getDefaultInstance()) return this;
      internalGetMutableResourceManagerTags().mergeFrom(other.internalGetResourceManagerTags());
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
      com.google.cloud.compute.v1.InstanceParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.InstanceParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> resourceManagerTags_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetResourceManagerTags() {
      if (resourceManagerTags_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ResourceManagerTagsDefaultEntryHolder.defaultEntry);
      }
      return resourceManagerTags_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableResourceManagerTags() {
      onChanged();
      ;
      if (resourceManagerTags_ == null) {
        resourceManagerTags_ =
            com.google.protobuf.MapField.newMapField(
                ResourceManagerTagsDefaultEntryHolder.defaultEntry);
      }
      if (!resourceManagerTags_.isMutable()) {
        resourceManagerTags_ = resourceManagerTags_.copy();
      }
      return resourceManagerTags_;
    }

    public int getResourceManagerTagsCount() {
      return internalGetResourceManagerTags().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
     * </pre>
     *
     * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
     */
    @java.lang.Override
    public boolean containsResourceManagerTags(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetResourceManagerTags().getMap().containsKey(key);
    }
    /** Use {@link #getResourceManagerTagsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getResourceManagerTags() {
      return getResourceManagerTagsMap();
    }
    /**
     *
     *
     * <pre>
     * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
     * </pre>
     *
     * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getResourceManagerTagsMap() {
      return internalGetResourceManagerTags().getMap();
    }
    /**
     *
     *
     * <pre>
     * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
     * </pre>
     *
     * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
     */
    @java.lang.Override
    public java.lang.String getResourceManagerTagsOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetResourceManagerTags().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
     * </pre>
     *
     * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
     */
    @java.lang.Override
    public java.lang.String getResourceManagerTagsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetResourceManagerTags().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearResourceManagerTags() {
      internalGetMutableResourceManagerTags().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
     * </pre>
     *
     * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
     */
    public Builder removeResourceManagerTags(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableResourceManagerTags().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableResourceManagerTags() {
      return internalGetMutableResourceManagerTags().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
     * </pre>
     *
     * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
     */
    public Builder putResourceManagerTags(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }

      internalGetMutableResourceManagerTags().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT &amp; PATCH) when empty.
     * </pre>
     *
     * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
     */
    public Builder putAllResourceManagerTags(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableResourceManagerTags().getMutableMap().putAll(values);
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstanceParams)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstanceParams)
  private static final com.google.cloud.compute.v1.InstanceParams DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InstanceParams();
  }

  public static com.google.cloud.compute.v1.InstanceParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceParams> PARSER =
      new com.google.protobuf.AbstractParser<InstanceParams>() {
        @java.lang.Override
        public InstanceParams parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new InstanceParams(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<InstanceParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
