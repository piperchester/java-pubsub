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
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

/**
 *
 *
 * <pre>
 * Request for the Publish method.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.PublishRequest}
 */
public final class PublishRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.PublishRequest)
    PublishRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PublishRequest.newBuilder() to construct.
  private PublishRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PublishRequest() {
    topic_ = "";
    messages_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PublishRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PublishRequest(
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

              topic_ = s;
              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                messages_ = new java.util.ArrayList<com.google.pubsub.v1.PubsubMessage>();
                mutable_bitField0_ |= 0x00000001;
              }
              messages_.add(
                  input.readMessage(
                      com.google.pubsub.v1.PubsubMessage.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        messages_ = java.util.Collections.unmodifiableList(messages_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_PublishRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_PublishRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.PublishRequest.class,
            com.google.pubsub.v1.PublishRequest.Builder.class);
  }

  public static final int TOPIC_FIELD_NUMBER = 1;
  private volatile java.lang.Object topic_;
  /**
   *
   *
   * <pre>
   * Required. The messages in the request will be published on this topic.
   * Format is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>
   * string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The topic.
   */
  @java.lang.Override
  public java.lang.String getTopic() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topic_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The messages in the request will be published on this topic.
   * Format is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>
   * string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for topic.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTopicBytes() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      topic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGES_FIELD_NUMBER = 2;
  private java.util.List<com.google.pubsub.v1.PubsubMessage> messages_;
  /**
   *
   *
   * <pre>
   * Required. The messages to publish.
   * </pre>
   *
   * <code>
   * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.pubsub.v1.PubsubMessage> getMessagesList() {
    return messages_;
  }
  /**
   *
   *
   * <pre>
   * Required. The messages to publish.
   * </pre>
   *
   * <code>
   * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.pubsub.v1.PubsubMessageOrBuilder>
      getMessagesOrBuilderList() {
    return messages_;
  }
  /**
   *
   *
   * <pre>
   * Required. The messages to publish.
   * </pre>
   *
   * <code>
   * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public int getMessagesCount() {
    return messages_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. The messages to publish.
   * </pre>
   *
   * <code>
   * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.pubsub.v1.PubsubMessage getMessages(int index) {
    return messages_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. The messages to publish.
   * </pre>
   *
   * <code>
   * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.pubsub.v1.PubsubMessageOrBuilder getMessagesOrBuilder(int index) {
    return messages_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topic_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topic_);
    }
    for (int i = 0; i < messages_.size(); i++) {
      output.writeMessage(2, messages_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topic_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, topic_);
    }
    for (int i = 0; i < messages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, messages_.get(i));
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
    if (!(obj instanceof com.google.pubsub.v1.PublishRequest)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.PublishRequest other = (com.google.pubsub.v1.PublishRequest) obj;

    if (!getTopic().equals(other.getTopic())) return false;
    if (!getMessagesList().equals(other.getMessagesList())) return false;
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
    hash = (37 * hash) + TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getTopic().hashCode();
    if (getMessagesCount() > 0) {
      hash = (37 * hash) + MESSAGES_FIELD_NUMBER;
      hash = (53 * hash) + getMessagesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.PublishRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.PublishRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.PublishRequest parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.PublishRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.PublishRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.PublishRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.PublishRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.PublishRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.PublishRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.PublishRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.PublishRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.PublishRequest parseFrom(
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

  public static Builder newBuilder(com.google.pubsub.v1.PublishRequest prototype) {
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
   * Request for the Publish method.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.PublishRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.PublishRequest)
      com.google.pubsub.v1.PublishRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_PublishRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_PublishRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.PublishRequest.class,
              com.google.pubsub.v1.PublishRequest.Builder.class);
    }

    // Construct using com.google.pubsub.v1.PublishRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMessagesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      topic_ = "";

      if (messagesBuilder_ == null) {
        messages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        messagesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_PublishRequest_descriptor;
    }

    @java.lang.Override
    public com.google.pubsub.v1.PublishRequest getDefaultInstanceForType() {
      return com.google.pubsub.v1.PublishRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.pubsub.v1.PublishRequest build() {
      com.google.pubsub.v1.PublishRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.pubsub.v1.PublishRequest buildPartial() {
      com.google.pubsub.v1.PublishRequest result = new com.google.pubsub.v1.PublishRequest(this);
      int from_bitField0_ = bitField0_;
      result.topic_ = topic_;
      if (messagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          messages_ = java.util.Collections.unmodifiableList(messages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.messages_ = messages_;
      } else {
        result.messages_ = messagesBuilder_.build();
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
      if (other instanceof com.google.pubsub.v1.PublishRequest) {
        return mergeFrom((com.google.pubsub.v1.PublishRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.PublishRequest other) {
      if (other == com.google.pubsub.v1.PublishRequest.getDefaultInstance()) return this;
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        onChanged();
      }
      if (messagesBuilder_ == null) {
        if (!other.messages_.isEmpty()) {
          if (messages_.isEmpty()) {
            messages_ = other.messages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMessagesIsMutable();
            messages_.addAll(other.messages_);
          }
          onChanged();
        }
      } else {
        if (!other.messages_.isEmpty()) {
          if (messagesBuilder_.isEmpty()) {
            messagesBuilder_.dispose();
            messagesBuilder_ = null;
            messages_ = other.messages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            messagesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMessagesFieldBuilder()
                    : null;
          } else {
            messagesBuilder_.addAllMessages(other.messages_);
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
      com.google.pubsub.v1.PublishRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.pubsub.v1.PublishRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object topic_ = "";
    /**
     *
     *
     * <pre>
     * Required. The messages in the request will be published on this topic.
     * Format is `projects/{project}/topics/{topic}`.
     * </pre>
     *
     * <code>
     * string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The topic.
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The messages in the request will be published on this topic.
     * Format is `projects/{project}/topics/{topic}`.
     * </pre>
     *
     * <code>
     * string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for topic.
     */
    public com.google.protobuf.ByteString getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The messages in the request will be published on this topic.
     * Format is `projects/{project}/topics/{topic}`.
     * </pre>
     *
     * <code>
     * string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopic(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      topic_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The messages in the request will be published on this topic.
     * Format is `projects/{project}/topics/{topic}`.
     * </pre>
     *
     * <code>
     * string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTopic() {

      topic_ = getDefaultInstance().getTopic();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The messages in the request will be published on this topic.
     * Format is `projects/{project}/topics/{topic}`.
     * </pre>
     *
     * <code>
     * string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopicBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      topic_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.pubsub.v1.PubsubMessage> messages_ =
        java.util.Collections.emptyList();

    private void ensureMessagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        messages_ = new java.util.ArrayList<com.google.pubsub.v1.PubsubMessage>(messages_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.pubsub.v1.PubsubMessage,
            com.google.pubsub.v1.PubsubMessage.Builder,
            com.google.pubsub.v1.PubsubMessageOrBuilder>
        messagesBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The messages to publish.
     * </pre>
     *
     * <code>
     * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.pubsub.v1.PubsubMessage> getMessagesList() {
      if (messagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(messages_);
      } else {
        return messagesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The messages to publish.
     * </pre>
     *
     * <code>
     * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public int getMessagesCount() {
      if (messagesBuilder_ == null) {
        return messages_.size();
      } else {
        return messagesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The messages to publish.
     * </pre>
     *
     * <code>
     * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.pubsub.v1.PubsubMessage getMessages(int index) {
      if (messagesBuilder_ == null) {
        return messages_.get(index);
      } else {
        return messagesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The messages to publish.
     * </pre>
     *
     * <code>
     * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMessages(int index, com.google.pubsub.v1.PubsubMessage value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.set(index, value);
        onChanged();
      } else {
        messagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The messages to publish.
     * </pre>
     *
     * <code>
     * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMessages(
        int index, com.google.pubsub.v1.PubsubMessage.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.set(index, builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The messages to publish.
     * </pre>
     *
     * <code>
     * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addMessages(com.google.pubsub.v1.PubsubMessage value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.add(value);
        onChanged();
      } else {
        messagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The messages to publish.
     * </pre>
     *
     * <code>
     * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addMessages(int index, com.google.pubsub.v1.PubsubMessage value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.add(index, value);
        onChanged();
      } else {
        messagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The messages to publish.
     * </pre>
     *
     * <code>
     * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addMessages(com.google.pubsub.v1.PubsubMessage.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.add(builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The messages to publish.
     * </pre>
     *
     * <code>
     * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addMessages(
        int index, com.google.pubsub.v1.PubsubMessage.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.add(index, builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The messages to publish.
     * </pre>
     *
     * <code>
     * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addAllMessages(
        java.lang.Iterable<? extends com.google.pubsub.v1.PubsubMessage> values) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, messages_);
        onChanged();
      } else {
        messagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The messages to publish.
     * </pre>
     *
     * <code>
     * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearMessages() {
      if (messagesBuilder_ == null) {
        messages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        messagesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The messages to publish.
     * </pre>
     *
     * <code>
     * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder removeMessages(int index) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.remove(index);
        onChanged();
      } else {
        messagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The messages to publish.
     * </pre>
     *
     * <code>
     * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.pubsub.v1.PubsubMessage.Builder getMessagesBuilder(int index) {
      return getMessagesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The messages to publish.
     * </pre>
     *
     * <code>
     * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.pubsub.v1.PubsubMessageOrBuilder getMessagesOrBuilder(int index) {
      if (messagesBuilder_ == null) {
        return messages_.get(index);
      } else {
        return messagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The messages to publish.
     * </pre>
     *
     * <code>
     * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<? extends com.google.pubsub.v1.PubsubMessageOrBuilder>
        getMessagesOrBuilderList() {
      if (messagesBuilder_ != null) {
        return messagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(messages_);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The messages to publish.
     * </pre>
     *
     * <code>
     * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.pubsub.v1.PubsubMessage.Builder addMessagesBuilder() {
      return getMessagesFieldBuilder()
          .addBuilder(com.google.pubsub.v1.PubsubMessage.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. The messages to publish.
     * </pre>
     *
     * <code>
     * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.pubsub.v1.PubsubMessage.Builder addMessagesBuilder(int index) {
      return getMessagesFieldBuilder()
          .addBuilder(index, com.google.pubsub.v1.PubsubMessage.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. The messages to publish.
     * </pre>
     *
     * <code>
     * repeated .google.pubsub.v1.PubsubMessage messages = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.pubsub.v1.PubsubMessage.Builder> getMessagesBuilderList() {
      return getMessagesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.pubsub.v1.PubsubMessage,
            com.google.pubsub.v1.PubsubMessage.Builder,
            com.google.pubsub.v1.PubsubMessageOrBuilder>
        getMessagesFieldBuilder() {
      if (messagesBuilder_ == null) {
        messagesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.pubsub.v1.PubsubMessage,
                com.google.pubsub.v1.PubsubMessage.Builder,
                com.google.pubsub.v1.PubsubMessageOrBuilder>(
                messages_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        messages_ = null;
      }
      return messagesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.PublishRequest)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.PublishRequest)
  private static final com.google.pubsub.v1.PublishRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.PublishRequest();
  }

  public static com.google.pubsub.v1.PublishRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublishRequest> PARSER =
      new com.google.protobuf.AbstractParser<PublishRequest>() {
        @java.lang.Override
        public PublishRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PublishRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PublishRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublishRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.pubsub.v1.PublishRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
