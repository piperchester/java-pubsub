/*
 * Copyright 2023 Google LLC
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
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface PubsubMessageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.PubsubMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The message data field. If this field is empty, the message must contain
   * at least one attribute.
   * </pre>
   *
   * <code>bytes data = 1;</code>
   *
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   *
   *
   * <pre>
   * Attributes for this message. If this field is empty, the message must
   * contain non-empty data. This can be used to filter messages on the
   * subscription.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */
  int getAttributesCount();
  /**
   *
   *
   * <pre>
   * Attributes for this message. If this field is empty, the message must
   * contain non-empty data. This can be used to filter messages on the
   * subscription.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */
  boolean containsAttributes(java.lang.String key);
  /** Use {@link #getAttributesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAttributes();
  /**
   *
   *
   * <pre>
   * Attributes for this message. If this field is empty, the message must
   * contain non-empty data. This can be used to filter messages on the
   * subscription.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAttributesMap();
  /**
   *
   *
   * <pre>
   * Attributes for this message. If this field is empty, the message must
   * contain non-empty data. This can be used to filter messages on the
   * subscription.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */
  /* nullable */
  java.lang.String getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Attributes for this message. If this field is empty, the message must
   * contain non-empty data. This can be used to filter messages on the
   * subscription.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */
  java.lang.String getAttributesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * ID of this message, assigned by the server when the message is published.
   * Guaranteed to be unique within the topic. This value may be read by a
   * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
   * delivery. It must not be populated by the publisher in a `Publish` call.
   * </pre>
   *
   * <code>string message_id = 3;</code>
   *
   * @return The messageId.
   */
  java.lang.String getMessageId();
  /**
   *
   *
   * <pre>
   * ID of this message, assigned by the server when the message is published.
   * Guaranteed to be unique within the topic. This value may be read by a
   * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
   * delivery. It must not be populated by the publisher in a `Publish` call.
   * </pre>
   *
   * <code>string message_id = 3;</code>
   *
   * @return The bytes for messageId.
   */
  com.google.protobuf.ByteString getMessageIdBytes();

  /**
   *
   *
   * <pre>
   * The time at which the message was published, populated by the server when
   * it receives the `Publish` call. It must not be populated by the
   * publisher in a `Publish` call.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp publish_time = 4;</code>
   *
   * @return Whether the publishTime field is set.
   */
  boolean hasPublishTime();
  /**
   *
   *
   * <pre>
   * The time at which the message was published, populated by the server when
   * it receives the `Publish` call. It must not be populated by the
   * publisher in a `Publish` call.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp publish_time = 4;</code>
   *
   * @return The publishTime.
   */
  com.google.protobuf.Timestamp getPublishTime();
  /**
   *
   *
   * <pre>
   * The time at which the message was published, populated by the server when
   * it receives the `Publish` call. It must not be populated by the
   * publisher in a `Publish` call.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp publish_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getPublishTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * If non-empty, identifies related messages for which publish order should be
   * respected. If a `Subscription` has `enable_message_ordering` set to `true`,
   * messages published with the same non-empty `ordering_key` value will be
   * delivered to subscribers in the order in which they are received by the
   * Pub/Sub system. All `PubsubMessage`s published in a given `PublishRequest`
   * must specify the same `ordering_key` value.
   * For more information, see [ordering
   * messages](https://cloud.google.com/pubsub/docs/ordering).
   * </pre>
   *
   * <code>string ordering_key = 5;</code>
   *
   * @return The orderingKey.
   */
  java.lang.String getOrderingKey();
  /**
   *
   *
   * <pre>
   * If non-empty, identifies related messages for which publish order should be
   * respected. If a `Subscription` has `enable_message_ordering` set to `true`,
   * messages published with the same non-empty `ordering_key` value will be
   * delivered to subscribers in the order in which they are received by the
   * Pub/Sub system. All `PubsubMessage`s published in a given `PublishRequest`
   * must specify the same `ordering_key` value.
   * For more information, see [ordering
   * messages](https://cloud.google.com/pubsub/docs/ordering).
   * </pre>
   *
   * <code>string ordering_key = 5;</code>
   *
   * @return The bytes for orderingKey.
   */
  com.google.protobuf.ByteString getOrderingKeyBytes();
}
