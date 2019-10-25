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
// source: google/cloud/vision/v1p3beta1/product_search.proto

package com.google.cloud.vision.v1p3beta1;

/**
 *
 *
 * <pre>
 * Specifies the fields to include in product search results.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.vision.v1p3beta1.ProductSearchResultsView}
 */
public enum ProductSearchResultsView implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Product search results contain only `product_category` and `product_id`.
   * Default value.
   * </pre>
   *
   * <code>BASIC = 0;</code>
   */
  BASIC(0),
  /**
   *
   *
   * <pre>
   * Product search results contain `product_category`, `product_id`,
   * `image_uri`, and `score`.
   * </pre>
   *
   * <code>FULL = 1;</code>
   */
  FULL(1),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Product search results contain only `product_category` and `product_id`.
   * Default value.
   * </pre>
   *
   * <code>BASIC = 0;</code>
   */
  public static final int BASIC_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Product search results contain `product_category`, `product_id`,
   * `image_uri`, and `score`.
   * </pre>
   *
   * <code>FULL = 1;</code>
   */
  public static final int FULL_VALUE = 1;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /** @deprecated Use {@link #forNumber(int)} instead. */
  @java.lang.Deprecated
  public static ProductSearchResultsView valueOf(int value) {
    return forNumber(value);
  }

  public static ProductSearchResultsView forNumber(int value) {
    switch (value) {
      case 0:
        return BASIC;
      case 1:
        return FULL;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ProductSearchResultsView>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ProductSearchResultsView>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ProductSearchResultsView>() {
            public ProductSearchResultsView findValueByNumber(int number) {
              return ProductSearchResultsView.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.vision.v1p3beta1.ProductSearchProto.getDescriptor()
        .getEnumTypes()
        .get(1);
  }

  private static final ProductSearchResultsView[] VALUES = values();

  public static ProductSearchResultsView valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ProductSearchResultsView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.vision.v1p3beta1.ProductSearchResultsView)
}
