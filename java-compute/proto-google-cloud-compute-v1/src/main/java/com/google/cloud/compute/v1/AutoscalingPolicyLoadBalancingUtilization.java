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
 * Configuration parameters of autoscaling based on load balancing.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization}
 */
public final class AutoscalingPolicyLoadBalancingUtilization
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization)
    AutoscalingPolicyLoadBalancingUtilizationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AutoscalingPolicyLoadBalancingUtilization.newBuilder() to construct.
  private AutoscalingPolicyLoadBalancingUtilization(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AutoscalingPolicyLoadBalancingUtilization() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AutoscalingPolicyLoadBalancingUtilization();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AutoscalingPolicyLoadBalancingUtilization(
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
          case 1727246961:
            {
              bitField0_ |= 0x00000001;
              utilizationTarget_ = input.readDouble();
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
        .internal_static_google_cloud_compute_v1_AutoscalingPolicyLoadBalancingUtilization_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_AutoscalingPolicyLoadBalancingUtilization_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization.class,
            com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization.Builder.class);
  }

  private int bitField0_;
  public static final int UTILIZATION_TARGET_FIELD_NUMBER = 215905870;
  private double utilizationTarget_;
  /**
   *
   *
   * <pre>
   * Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that the autoscaler maintains. Must be a positive float value. If not defined, the default is 0.8.
   * </pre>
   *
   * <code>optional double utilization_target = 215905870;</code>
   *
   * @return Whether the utilizationTarget field is set.
   */
  @java.lang.Override
  public boolean hasUtilizationTarget() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that the autoscaler maintains. Must be a positive float value. If not defined, the default is 0.8.
   * </pre>
   *
   * <code>optional double utilization_target = 215905870;</code>
   *
   * @return The utilizationTarget.
   */
  @java.lang.Override
  public double getUtilizationTarget() {
    return utilizationTarget_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeDouble(215905870, utilizationTarget_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeDoubleSize(215905870, utilizationTarget_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization other =
        (com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization) obj;

    if (hasUtilizationTarget() != other.hasUtilizationTarget()) return false;
    if (hasUtilizationTarget()) {
      if (java.lang.Double.doubleToLongBits(getUtilizationTarget())
          != java.lang.Double.doubleToLongBits(other.getUtilizationTarget())) return false;
    }
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
    if (hasUtilizationTarget()) {
      hash = (37 * hash) + UTILIZATION_TARGET_FIELD_NUMBER;
      hash =
          (53 * hash)
              + com.google.protobuf.Internal.hashLong(
                  java.lang.Double.doubleToLongBits(getUtilizationTarget()));
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization parseFrom(
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
      com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization prototype) {
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
   * Configuration parameters of autoscaling based on load balancing.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization)
      com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilizationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AutoscalingPolicyLoadBalancingUtilization_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AutoscalingPolicyLoadBalancingUtilization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization.class,
              com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization.Builder.class);
    }

    // Construct using
    // com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization.newBuilder()
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
      utilizationTarget_ = 0D;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AutoscalingPolicyLoadBalancingUtilization_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization build() {
      com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization buildPartial() {
      com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization result =
          new com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.utilizationTarget_ = utilizationTarget_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization) {
        return mergeFrom(
            (com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization other) {
      if (other
          == com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization
              .getDefaultInstance()) return this;
      if (other.hasUtilizationTarget()) {
        setUtilizationTarget(other.getUtilizationTarget());
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
      com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization)
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

    private double utilizationTarget_;
    /**
     *
     *
     * <pre>
     * Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that the autoscaler maintains. Must be a positive float value. If not defined, the default is 0.8.
     * </pre>
     *
     * <code>optional double utilization_target = 215905870;</code>
     *
     * @return Whether the utilizationTarget field is set.
     */
    @java.lang.Override
    public boolean hasUtilizationTarget() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that the autoscaler maintains. Must be a positive float value. If not defined, the default is 0.8.
     * </pre>
     *
     * <code>optional double utilization_target = 215905870;</code>
     *
     * @return The utilizationTarget.
     */
    @java.lang.Override
    public double getUtilizationTarget() {
      return utilizationTarget_;
    }
    /**
     *
     *
     * <pre>
     * Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that the autoscaler maintains. Must be a positive float value. If not defined, the default is 0.8.
     * </pre>
     *
     * <code>optional double utilization_target = 215905870;</code>
     *
     * @param value The utilizationTarget to set.
     * @return This builder for chaining.
     */
    public Builder setUtilizationTarget(double value) {
      bitField0_ |= 0x00000001;
      utilizationTarget_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that the autoscaler maintains. Must be a positive float value. If not defined, the default is 0.8.
     * </pre>
     *
     * <code>optional double utilization_target = 215905870;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUtilizationTarget() {
      bitField0_ = (bitField0_ & ~0x00000001);
      utilizationTarget_ = 0D;
      onChanged();
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization)
  private static final com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization();
  }

  public static com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoscalingPolicyLoadBalancingUtilization>
      PARSER =
          new com.google.protobuf.AbstractParser<AutoscalingPolicyLoadBalancingUtilization>() {
            @java.lang.Override
            public AutoscalingPolicyLoadBalancingUtilization parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return new AutoscalingPolicyLoadBalancingUtilization(input, extensionRegistry);
            }
          };

  public static com.google.protobuf.Parser<AutoscalingPolicyLoadBalancingUtilization> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoscalingPolicyLoadBalancingUtilization> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
