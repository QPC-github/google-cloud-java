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

/**
 *
 *
 * <pre>
 * A value of a field, including its frequency.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.ValueFrequency}
 */
public final class ValueFrequency extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.ValueFrequency)
    ValueFrequencyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ValueFrequency.newBuilder() to construct.
  private ValueFrequency(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ValueFrequency() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ValueFrequency();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ValueFrequency(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
              com.google.privacy.dlp.v2.Value.Builder subBuilder = null;
              if (value_ != null) {
                subBuilder = value_.toBuilder();
              }
              value_ =
                  input.readMessage(com.google.privacy.dlp.v2.Value.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(value_);
                value_ = subBuilder.buildPartial();
              }

              break;
            }
          case 16:
            {
              count_ = input.readInt64();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_ValueFrequency_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_ValueFrequency_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.ValueFrequency.class,
            com.google.privacy.dlp.v2.ValueFrequency.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2.Value value_;
  /**
   *
   *
   * <pre>
   * A value contained in the field in question.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Value value = 1;</code>
   *
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return value_ != null;
  }
  /**
   *
   *
   * <pre>
   * A value contained in the field in question.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Value value = 1;</code>
   *
   * @return The value.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.Value getValue() {
    return value_ == null ? com.google.privacy.dlp.v2.Value.getDefaultInstance() : value_;
  }
  /**
   *
   *
   * <pre>
   * A value contained in the field in question.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Value value = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.ValueOrBuilder getValueOrBuilder() {
    return getValue();
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private long count_;
  /**
   *
   *
   * <pre>
   * How many times the value is contained in the field.
   * </pre>
   *
   * <code>int64 count = 2;</code>
   *
   * @return The count.
   */
  @java.lang.Override
  public long getCount() {
    return count_;
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
    if (value_ != null) {
      output.writeMessage(1, getValue());
    }
    if (count_ != 0L) {
      output.writeInt64(2, count_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (value_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getValue());
    }
    if (count_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, count_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.ValueFrequency)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.ValueFrequency other = (com.google.privacy.dlp.v2.ValueFrequency) obj;

    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue().equals(other.getValue())) return false;
    }
    if (getCount() != other.getCount()) return false;
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
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getCount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.ValueFrequency parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ValueFrequency parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ValueFrequency parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ValueFrequency parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ValueFrequency parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ValueFrequency parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ValueFrequency parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ValueFrequency parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ValueFrequency parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ValueFrequency parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ValueFrequency parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ValueFrequency parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.ValueFrequency prototype) {
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
   * A value of a field, including its frequency.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.ValueFrequency}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.ValueFrequency)
      com.google.privacy.dlp.v2.ValueFrequencyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ValueFrequency_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ValueFrequency_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.ValueFrequency.class,
              com.google.privacy.dlp.v2.ValueFrequency.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.ValueFrequency.newBuilder()
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
      if (valueBuilder_ == null) {
        value_ = null;
      } else {
        value_ = null;
        valueBuilder_ = null;
      }
      count_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ValueFrequency_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ValueFrequency getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.ValueFrequency.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ValueFrequency build() {
      com.google.privacy.dlp.v2.ValueFrequency result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ValueFrequency buildPartial() {
      com.google.privacy.dlp.v2.ValueFrequency result =
          new com.google.privacy.dlp.v2.ValueFrequency(this);
      if (valueBuilder_ == null) {
        result.value_ = value_;
      } else {
        result.value_ = valueBuilder_.build();
      }
      result.count_ = count_;
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
      if (other instanceof com.google.privacy.dlp.v2.ValueFrequency) {
        return mergeFrom((com.google.privacy.dlp.v2.ValueFrequency) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.ValueFrequency other) {
      if (other == com.google.privacy.dlp.v2.ValueFrequency.getDefaultInstance()) return this;
      if (other.hasValue()) {
        mergeValue(other.getValue());
      }
      if (other.getCount() != 0L) {
        setCount(other.getCount());
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
      com.google.privacy.dlp.v2.ValueFrequency parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.ValueFrequency) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.privacy.dlp.v2.Value value_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.Value,
            com.google.privacy.dlp.v2.Value.Builder,
            com.google.privacy.dlp.v2.ValueOrBuilder>
        valueBuilder_;
    /**
     *
     *
     * <pre>
     * A value contained in the field in question.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value value = 1;</code>
     *
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return valueBuilder_ != null || value_ != null;
    }
    /**
     *
     *
     * <pre>
     * A value contained in the field in question.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value value = 1;</code>
     *
     * @return The value.
     */
    public com.google.privacy.dlp.v2.Value getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? com.google.privacy.dlp.v2.Value.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A value contained in the field in question.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value value = 1;</code>
     */
    public Builder setValue(com.google.privacy.dlp.v2.Value value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        valueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A value contained in the field in question.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value value = 1;</code>
     */
    public Builder setValue(com.google.privacy.dlp.v2.Value.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A value contained in the field in question.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value value = 1;</code>
     */
    public Builder mergeValue(com.google.privacy.dlp.v2.Value value) {
      if (valueBuilder_ == null) {
        if (value_ != null) {
          value_ =
              com.google.privacy.dlp.v2.Value.newBuilder(value_).mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        valueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A value contained in the field in question.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value value = 1;</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = null;
        onChanged();
      } else {
        value_ = null;
        valueBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A value contained in the field in question.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value value = 1;</code>
     */
    public com.google.privacy.dlp.v2.Value.Builder getValueBuilder() {

      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A value contained in the field in question.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value value = 1;</code>
     */
    public com.google.privacy.dlp.v2.ValueOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ? com.google.privacy.dlp.v2.Value.getDefaultInstance() : value_;
      }
    }
    /**
     *
     *
     * <pre>
     * A value contained in the field in question.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value value = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.Value,
            com.google.privacy.dlp.v2.Value.Builder,
            com.google.privacy.dlp.v2.ValueOrBuilder>
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.Value,
                com.google.privacy.dlp.v2.Value.Builder,
                com.google.privacy.dlp.v2.ValueOrBuilder>(
                getValue(), getParentForChildren(), isClean());
        value_ = null;
      }
      return valueBuilder_;
    }

    private long count_;
    /**
     *
     *
     * <pre>
     * How many times the value is contained in the field.
     * </pre>
     *
     * <code>int64 count = 2;</code>
     *
     * @return The count.
     */
    @java.lang.Override
    public long getCount() {
      return count_;
    }
    /**
     *
     *
     * <pre>
     * How many times the value is contained in the field.
     * </pre>
     *
     * <code>int64 count = 2;</code>
     *
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(long value) {

      count_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * How many times the value is contained in the field.
     * </pre>
     *
     * <code>int64 count = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCount() {

      count_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.ValueFrequency)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.ValueFrequency)
  private static final com.google.privacy.dlp.v2.ValueFrequency DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.ValueFrequency();
  }

  public static com.google.privacy.dlp.v2.ValueFrequency getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValueFrequency> PARSER =
      new com.google.protobuf.AbstractParser<ValueFrequency>() {
        @java.lang.Override
        public ValueFrequency parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ValueFrequency(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ValueFrequency> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValueFrequency> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.ValueFrequency getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
