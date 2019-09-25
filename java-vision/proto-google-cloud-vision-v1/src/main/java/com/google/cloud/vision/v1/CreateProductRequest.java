// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/product_search_service.proto

package com.google.cloud.vision.v1;

/**
 *
 *
 * <pre>
 * Request message for the `CreateProduct` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1.CreateProductRequest}
 */
public final class CreateProductRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1.CreateProductRequest)
    CreateProductRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateProductRequest.newBuilder() to construct.
  private CreateProductRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateProductRequest() {
    parent_ = "";
    productId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateProductRequest(
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
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.vision.v1.Product.Builder subBuilder = null;
              if (product_ != null) {
                subBuilder = product_.toBuilder();
              }
              product_ =
                  input.readMessage(com.google.cloud.vision.v1.Product.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(product_);
                product_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              productId_ = s;
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
    return com.google.cloud.vision.v1.ProductSearchServiceProto
        .internal_static_google_cloud_vision_v1_CreateProductRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1.ProductSearchServiceProto
        .internal_static_google_cloud_vision_v1_CreateProductRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1.CreateProductRequest.class,
            com.google.cloud.vision.v1.CreateProductRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The project in which the Product should be created.
   * Format is
   * `projects/PROJECT_ID/locations/LOC_ID`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The project in which the Product should be created.
   * Format is
   * `projects/PROJECT_ID/locations/LOC_ID`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRODUCT_FIELD_NUMBER = 2;
  private com.google.cloud.vision.v1.Product product_;
  /**
   *
   *
   * <pre>
   * Required. The product to create.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public boolean hasProduct() {
    return product_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The product to create.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.vision.v1.Product getProduct() {
    return product_ == null ? com.google.cloud.vision.v1.Product.getDefaultInstance() : product_;
  }
  /**
   *
   *
   * <pre>
   * Required. The product to create.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.vision.v1.ProductOrBuilder getProductOrBuilder() {
    return getProduct();
  }

  public static final int PRODUCT_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object productId_;
  /**
   *
   *
   * <pre>
   * A user-supplied resource id for this Product. If set, the server will
   * attempt to use this value as the resource id. If it is already in use, an
   * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
   * long. It cannot contain the character `/`.
   * </pre>
   *
   * <code>string product_id = 3;</code>
   */
  public java.lang.String getProductId() {
    java.lang.Object ref = productId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A user-supplied resource id for this Product. If set, the server will
   * attempt to use this value as the resource id. If it is already in use, an
   * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
   * long. It cannot contain the character `/`.
   * </pre>
   *
   * <code>string product_id = 3;</code>
   */
  public com.google.protobuf.ByteString getProductIdBytes() {
    java.lang.Object ref = productId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      productId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (product_ != null) {
      output.writeMessage(2, getProduct());
    }
    if (!getProductIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, productId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (product_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getProduct());
    }
    if (!getProductIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, productId_);
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
    if (!(obj instanceof com.google.cloud.vision.v1.CreateProductRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1.CreateProductRequest other =
        (com.google.cloud.vision.v1.CreateProductRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasProduct() != other.hasProduct()) return false;
    if (hasProduct()) {
      if (!getProduct().equals(other.getProduct())) return false;
    }
    if (!getProductId().equals(other.getProductId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasProduct()) {
      hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
      hash = (53 * hash) + getProduct().hashCode();
    }
    hash = (37 * hash) + PRODUCT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProductId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1.CreateProductRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.CreateProductRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.CreateProductRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.CreateProductRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.CreateProductRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.CreateProductRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.CreateProductRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.CreateProductRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.CreateProductRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.CreateProductRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.CreateProductRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.CreateProductRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vision.v1.CreateProductRequest prototype) {
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
   * Request message for the `CreateProduct` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1.CreateProductRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1.CreateProductRequest)
      com.google.cloud.vision.v1.CreateProductRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1_CreateProductRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1_CreateProductRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1.CreateProductRequest.class,
              com.google.cloud.vision.v1.CreateProductRequest.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1.CreateProductRequest.newBuilder()
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
      parent_ = "";

      if (productBuilder_ == null) {
        product_ = null;
      } else {
        product_ = null;
        productBuilder_ = null;
      }
      productId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1.ProductSearchServiceProto
          .internal_static_google_cloud_vision_v1_CreateProductRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.CreateProductRequest getDefaultInstanceForType() {
      return com.google.cloud.vision.v1.CreateProductRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.CreateProductRequest build() {
      com.google.cloud.vision.v1.CreateProductRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.CreateProductRequest buildPartial() {
      com.google.cloud.vision.v1.CreateProductRequest result =
          new com.google.cloud.vision.v1.CreateProductRequest(this);
      result.parent_ = parent_;
      if (productBuilder_ == null) {
        result.product_ = product_;
      } else {
        result.product_ = productBuilder_.build();
      }
      result.productId_ = productId_;
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
      if (other instanceof com.google.cloud.vision.v1.CreateProductRequest) {
        return mergeFrom((com.google.cloud.vision.v1.CreateProductRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1.CreateProductRequest other) {
      if (other == com.google.cloud.vision.v1.CreateProductRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasProduct()) {
        mergeProduct(other.getProduct());
      }
      if (!other.getProductId().isEmpty()) {
        productId_ = other.productId_;
        onChanged();
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
      com.google.cloud.vision.v1.CreateProductRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.vision.v1.CreateProductRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The project in which the Product should be created.
     * Format is
     * `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The project in which the Product should be created.
     * Format is
     * `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The project in which the Product should be created.
     * Format is
     * `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project in which the Product should be created.
     * Format is
     * `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project in which the Product should be created.
     * Format is
     * `projects/PROJECT_ID/locations/LOC_ID`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.vision.v1.Product product_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1.Product,
            com.google.cloud.vision.v1.Product.Builder,
            com.google.cloud.vision.v1.ProductOrBuilder>
        productBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The product to create.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public boolean hasProduct() {
      return productBuilder_ != null || product_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The product to create.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vision.v1.Product getProduct() {
      if (productBuilder_ == null) {
        return product_ == null
            ? com.google.cloud.vision.v1.Product.getDefaultInstance()
            : product_;
      } else {
        return productBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The product to create.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setProduct(com.google.cloud.vision.v1.Product value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        product_ = value;
        onChanged();
      } else {
        productBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The product to create.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setProduct(com.google.cloud.vision.v1.Product.Builder builderForValue) {
      if (productBuilder_ == null) {
        product_ = builderForValue.build();
        onChanged();
      } else {
        productBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The product to create.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeProduct(com.google.cloud.vision.v1.Product value) {
      if (productBuilder_ == null) {
        if (product_ != null) {
          product_ =
              com.google.cloud.vision.v1.Product.newBuilder(product_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          product_ = value;
        }
        onChanged();
      } else {
        productBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The product to create.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearProduct() {
      if (productBuilder_ == null) {
        product_ = null;
        onChanged();
      } else {
        product_ = null;
        productBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The product to create.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vision.v1.Product.Builder getProductBuilder() {

      onChanged();
      return getProductFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The product to create.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.vision.v1.ProductOrBuilder getProductOrBuilder() {
      if (productBuilder_ != null) {
        return productBuilder_.getMessageOrBuilder();
      } else {
        return product_ == null
            ? com.google.cloud.vision.v1.Product.getDefaultInstance()
            : product_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The product to create.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.Product product = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1.Product,
            com.google.cloud.vision.v1.Product.Builder,
            com.google.cloud.vision.v1.ProductOrBuilder>
        getProductFieldBuilder() {
      if (productBuilder_ == null) {
        productBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.vision.v1.Product,
                com.google.cloud.vision.v1.Product.Builder,
                com.google.cloud.vision.v1.ProductOrBuilder>(
                getProduct(), getParentForChildren(), isClean());
        product_ = null;
      }
      return productBuilder_;
    }

    private java.lang.Object productId_ = "";
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for this Product. If set, the server will
     * attempt to use this value as the resource id. If it is already in use, an
     * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
     * long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string product_id = 3;</code>
     */
    public java.lang.String getProductId() {
      java.lang.Object ref = productId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for this Product. If set, the server will
     * attempt to use this value as the resource id. If it is already in use, an
     * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
     * long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string product_id = 3;</code>
     */
    public com.google.protobuf.ByteString getProductIdBytes() {
      java.lang.Object ref = productId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        productId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for this Product. If set, the server will
     * attempt to use this value as the resource id. If it is already in use, an
     * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
     * long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string product_id = 3;</code>
     */
    public Builder setProductId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      productId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for this Product. If set, the server will
     * attempt to use this value as the resource id. If it is already in use, an
     * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
     * long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string product_id = 3;</code>
     */
    public Builder clearProductId() {

      productId_ = getDefaultInstance().getProductId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A user-supplied resource id for this Product. If set, the server will
     * attempt to use this value as the resource id. If it is already in use, an
     * error is returned with code ALREADY_EXISTS. Must be at most 128 characters
     * long. It cannot contain the character `/`.
     * </pre>
     *
     * <code>string product_id = 3;</code>
     */
    public Builder setProductIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      productId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1.CreateProductRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1.CreateProductRequest)
  private static final com.google.cloud.vision.v1.CreateProductRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1.CreateProductRequest();
  }

  public static com.google.cloud.vision.v1.CreateProductRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateProductRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateProductRequest>() {
        @java.lang.Override
        public CreateProductRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateProductRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateProductRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateProductRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1.CreateProductRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
