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
// source: google/cloud/datalabeling/v1beta1/dataset.proto

package com.google.cloud.datalabeling.v1beta1;

public interface AnnotatedDatasetMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.AnnotatedDatasetMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Configuration for image classification task.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.ImageClassificationConfig image_classification_config = 2;
   * </code>
   *
   * @return Whether the imageClassificationConfig field is set.
   */
  boolean hasImageClassificationConfig();
  /**
   *
   *
   * <pre>
   * Configuration for image classification task.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.ImageClassificationConfig image_classification_config = 2;
   * </code>
   *
   * @return The imageClassificationConfig.
   */
  com.google.cloud.datalabeling.v1beta1.ImageClassificationConfig getImageClassificationConfig();
  /**
   *
   *
   * <pre>
   * Configuration for image classification task.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.ImageClassificationConfig image_classification_config = 2;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.ImageClassificationConfigOrBuilder
      getImageClassificationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for image bounding box and bounding poly task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.BoundingPolyConfig bounding_poly_config = 3;</code>
   *
   * @return Whether the boundingPolyConfig field is set.
   */
  boolean hasBoundingPolyConfig();
  /**
   *
   *
   * <pre>
   * Configuration for image bounding box and bounding poly task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.BoundingPolyConfig bounding_poly_config = 3;</code>
   *
   * @return The boundingPolyConfig.
   */
  com.google.cloud.datalabeling.v1beta1.BoundingPolyConfig getBoundingPolyConfig();
  /**
   *
   *
   * <pre>
   * Configuration for image bounding box and bounding poly task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.BoundingPolyConfig bounding_poly_config = 3;</code>
   */
  com.google.cloud.datalabeling.v1beta1.BoundingPolyConfigOrBuilder
      getBoundingPolyConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for image polyline task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.PolylineConfig polyline_config = 4;</code>
   *
   * @return Whether the polylineConfig field is set.
   */
  boolean hasPolylineConfig();
  /**
   *
   *
   * <pre>
   * Configuration for image polyline task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.PolylineConfig polyline_config = 4;</code>
   *
   * @return The polylineConfig.
   */
  com.google.cloud.datalabeling.v1beta1.PolylineConfig getPolylineConfig();
  /**
   *
   *
   * <pre>
   * Configuration for image polyline task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.PolylineConfig polyline_config = 4;</code>
   */
  com.google.cloud.datalabeling.v1beta1.PolylineConfigOrBuilder getPolylineConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for image segmentation task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.SegmentationConfig segmentation_config = 5;</code>
   *
   * @return Whether the segmentationConfig field is set.
   */
  boolean hasSegmentationConfig();
  /**
   *
   *
   * <pre>
   * Configuration for image segmentation task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.SegmentationConfig segmentation_config = 5;</code>
   *
   * @return The segmentationConfig.
   */
  com.google.cloud.datalabeling.v1beta1.SegmentationConfig getSegmentationConfig();
  /**
   *
   *
   * <pre>
   * Configuration for image segmentation task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.SegmentationConfig segmentation_config = 5;</code>
   */
  com.google.cloud.datalabeling.v1beta1.SegmentationConfigOrBuilder
      getSegmentationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for video classification task.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.VideoClassificationConfig video_classification_config = 6;
   * </code>
   *
   * @return Whether the videoClassificationConfig field is set.
   */
  boolean hasVideoClassificationConfig();
  /**
   *
   *
   * <pre>
   * Configuration for video classification task.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.VideoClassificationConfig video_classification_config = 6;
   * </code>
   *
   * @return The videoClassificationConfig.
   */
  com.google.cloud.datalabeling.v1beta1.VideoClassificationConfig getVideoClassificationConfig();
  /**
   *
   *
   * <pre>
   * Configuration for video classification task.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.VideoClassificationConfig video_classification_config = 6;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.VideoClassificationConfigOrBuilder
      getVideoClassificationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for video object detection task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig object_detection_config = 7;
   * </code>
   *
   * @return Whether the objectDetectionConfig field is set.
   */
  boolean hasObjectDetectionConfig();
  /**
   *
   *
   * <pre>
   * Configuration for video object detection task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig object_detection_config = 7;
   * </code>
   *
   * @return The objectDetectionConfig.
   */
  com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig getObjectDetectionConfig();
  /**
   *
   *
   * <pre>
   * Configuration for video object detection task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig object_detection_config = 7;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfigOrBuilder
      getObjectDetectionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for video object tracking task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ObjectTrackingConfig object_tracking_config = 8;
   * </code>
   *
   * @return Whether the objectTrackingConfig field is set.
   */
  boolean hasObjectTrackingConfig();
  /**
   *
   *
   * <pre>
   * Configuration for video object tracking task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ObjectTrackingConfig object_tracking_config = 8;
   * </code>
   *
   * @return The objectTrackingConfig.
   */
  com.google.cloud.datalabeling.v1beta1.ObjectTrackingConfig getObjectTrackingConfig();
  /**
   *
   *
   * <pre>
   * Configuration for video object tracking task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.ObjectTrackingConfig object_tracking_config = 8;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.ObjectTrackingConfigOrBuilder
      getObjectTrackingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for video event labeling task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.EventConfig event_config = 9;</code>
   *
   * @return Whether the eventConfig field is set.
   */
  boolean hasEventConfig();
  /**
   *
   *
   * <pre>
   * Configuration for video event labeling task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.EventConfig event_config = 9;</code>
   *
   * @return The eventConfig.
   */
  com.google.cloud.datalabeling.v1beta1.EventConfig getEventConfig();
  /**
   *
   *
   * <pre>
   * Configuration for video event labeling task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.EventConfig event_config = 9;</code>
   */
  com.google.cloud.datalabeling.v1beta1.EventConfigOrBuilder getEventConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for text classification task.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.TextClassificationConfig text_classification_config = 10;
   * </code>
   *
   * @return Whether the textClassificationConfig field is set.
   */
  boolean hasTextClassificationConfig();
  /**
   *
   *
   * <pre>
   * Configuration for text classification task.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.TextClassificationConfig text_classification_config = 10;
   * </code>
   *
   * @return The textClassificationConfig.
   */
  com.google.cloud.datalabeling.v1beta1.TextClassificationConfig getTextClassificationConfig();
  /**
   *
   *
   * <pre>
   * Configuration for text classification task.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.TextClassificationConfig text_classification_config = 10;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.TextClassificationConfigOrBuilder
      getTextClassificationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for text entity extraction task.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.TextEntityExtractionConfig text_entity_extraction_config = 11;
   * </code>
   *
   * @return Whether the textEntityExtractionConfig field is set.
   */
  boolean hasTextEntityExtractionConfig();
  /**
   *
   *
   * <pre>
   * Configuration for text entity extraction task.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.TextEntityExtractionConfig text_entity_extraction_config = 11;
   * </code>
   *
   * @return The textEntityExtractionConfig.
   */
  com.google.cloud.datalabeling.v1beta1.TextEntityExtractionConfig getTextEntityExtractionConfig();
  /**
   *
   *
   * <pre>
   * Configuration for text entity extraction task.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.TextEntityExtractionConfig text_entity_extraction_config = 11;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.TextEntityExtractionConfigOrBuilder
      getTextEntityExtractionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * HumanAnnotationConfig used when requesting the human labeling task for this
   * AnnotatedDataset.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig human_annotation_config = 1;
   * </code>
   *
   * @return Whether the humanAnnotationConfig field is set.
   */
  boolean hasHumanAnnotationConfig();
  /**
   *
   *
   * <pre>
   * HumanAnnotationConfig used when requesting the human labeling task for this
   * AnnotatedDataset.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig human_annotation_config = 1;
   * </code>
   *
   * @return The humanAnnotationConfig.
   */
  com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig getHumanAnnotationConfig();
  /**
   *
   *
   * <pre>
   * HumanAnnotationConfig used when requesting the human labeling task for this
   * AnnotatedDataset.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig human_annotation_config = 1;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOrBuilder
      getHumanAnnotationConfigOrBuilder();

  public com.google.cloud.datalabeling.v1beta1.AnnotatedDatasetMetadata.AnnotationRequestConfigCase
      getAnnotationRequestConfigCase();
}
