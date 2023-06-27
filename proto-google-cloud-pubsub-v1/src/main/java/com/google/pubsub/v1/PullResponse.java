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

/**
 *
 *
 * <pre>
 * Response for the `Pull` method.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.PullResponse}
 */
public final class PullResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.PullResponse)
    PullResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PullResponse.newBuilder() to construct.
  private PullResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PullResponse() {
    receivedMessages_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PullResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_PullResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_PullResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.PullResponse.class,
            com.google.pubsub.v1.PullResponse.Builder.class);
  }

  public static final int RECEIVED_MESSAGES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.pubsub.v1.ReceivedMessage> receivedMessages_;
  /**
   *
   *
   * <pre>
   * Received Pub/Sub messages. The list will be empty if there are no more
   * messages available in the backlog, or if no messages could be returned
   * before the request timeout. For JSON, the response can be entirely
   * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
   * even if there are more messages available in the backlog.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.pubsub.v1.ReceivedMessage> getReceivedMessagesList() {
    return receivedMessages_;
  }
  /**
   *
   *
   * <pre>
   * Received Pub/Sub messages. The list will be empty if there are no more
   * messages available in the backlog, or if no messages could be returned
   * before the request timeout. For JSON, the response can be entirely
   * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
   * even if there are more messages available in the backlog.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.pubsub.v1.ReceivedMessageOrBuilder>
      getReceivedMessagesOrBuilderList() {
    return receivedMessages_;
  }
  /**
   *
   *
   * <pre>
   * Received Pub/Sub messages. The list will be empty if there are no more
   * messages available in the backlog, or if no messages could be returned
   * before the request timeout. For JSON, the response can be entirely
   * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
   * even if there are more messages available in the backlog.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
   */
  @java.lang.Override
  public int getReceivedMessagesCount() {
    return receivedMessages_.size();
  }
  /**
   *
   *
   * <pre>
   * Received Pub/Sub messages. The list will be empty if there are no more
   * messages available in the backlog, or if no messages could be returned
   * before the request timeout. For JSON, the response can be entirely
   * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
   * even if there are more messages available in the backlog.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
   */
  @java.lang.Override
  public com.google.pubsub.v1.ReceivedMessage getReceivedMessages(int index) {
    return receivedMessages_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Received Pub/Sub messages. The list will be empty if there are no more
   * messages available in the backlog, or if no messages could be returned
   * before the request timeout. For JSON, the response can be entirely
   * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
   * even if there are more messages available in the backlog.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
   */
  @java.lang.Override
  public com.google.pubsub.v1.ReceivedMessageOrBuilder getReceivedMessagesOrBuilder(int index) {
    return receivedMessages_.get(index);
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
    for (int i = 0; i < receivedMessages_.size(); i++) {
      output.writeMessage(1, receivedMessages_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < receivedMessages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, receivedMessages_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.pubsub.v1.PullResponse)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.PullResponse other = (com.google.pubsub.v1.PullResponse) obj;

    if (!getReceivedMessagesList().equals(other.getReceivedMessagesList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getReceivedMessagesCount() > 0) {
      hash = (37 * hash) + RECEIVED_MESSAGES_FIELD_NUMBER;
      hash = (53 * hash) + getReceivedMessagesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.PullResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.PullResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.PullResponse parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.PullResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.PullResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.PullResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.PullResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.PullResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.PullResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.PullResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.PullResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.PullResponse parseFrom(
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

  public static Builder newBuilder(com.google.pubsub.v1.PullResponse prototype) {
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
   * Response for the `Pull` method.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.PullResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.PullResponse)
      com.google.pubsub.v1.PullResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_PullResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_PullResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.PullResponse.class,
              com.google.pubsub.v1.PullResponse.Builder.class);
    }

    // Construct using com.google.pubsub.v1.PullResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (receivedMessagesBuilder_ == null) {
        receivedMessages_ = java.util.Collections.emptyList();
      } else {
        receivedMessages_ = null;
        receivedMessagesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_PullResponse_descriptor;
    }

    @java.lang.Override
    public com.google.pubsub.v1.PullResponse getDefaultInstanceForType() {
      return com.google.pubsub.v1.PullResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.pubsub.v1.PullResponse build() {
      com.google.pubsub.v1.PullResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.pubsub.v1.PullResponse buildPartial() {
      com.google.pubsub.v1.PullResponse result = new com.google.pubsub.v1.PullResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.pubsub.v1.PullResponse result) {
      if (receivedMessagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          receivedMessages_ = java.util.Collections.unmodifiableList(receivedMessages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.receivedMessages_ = receivedMessages_;
      } else {
        result.receivedMessages_ = receivedMessagesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.pubsub.v1.PullResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.pubsub.v1.PullResponse) {
        return mergeFrom((com.google.pubsub.v1.PullResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.PullResponse other) {
      if (other == com.google.pubsub.v1.PullResponse.getDefaultInstance()) return this;
      if (receivedMessagesBuilder_ == null) {
        if (!other.receivedMessages_.isEmpty()) {
          if (receivedMessages_.isEmpty()) {
            receivedMessages_ = other.receivedMessages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureReceivedMessagesIsMutable();
            receivedMessages_.addAll(other.receivedMessages_);
          }
          onChanged();
        }
      } else {
        if (!other.receivedMessages_.isEmpty()) {
          if (receivedMessagesBuilder_.isEmpty()) {
            receivedMessagesBuilder_.dispose();
            receivedMessagesBuilder_ = null;
            receivedMessages_ = other.receivedMessages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            receivedMessagesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getReceivedMessagesFieldBuilder()
                    : null;
          } else {
            receivedMessagesBuilder_.addAllMessages(other.receivedMessages_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
                com.google.pubsub.v1.ReceivedMessage m =
                    input.readMessage(
                        com.google.pubsub.v1.ReceivedMessage.parser(), extensionRegistry);
                if (receivedMessagesBuilder_ == null) {
                  ensureReceivedMessagesIsMutable();
                  receivedMessages_.add(m);
                } else {
                  receivedMessagesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.pubsub.v1.ReceivedMessage> receivedMessages_ =
        java.util.Collections.emptyList();

    private void ensureReceivedMessagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        receivedMessages_ =
            new java.util.ArrayList<com.google.pubsub.v1.ReceivedMessage>(receivedMessages_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.pubsub.v1.ReceivedMessage,
            com.google.pubsub.v1.ReceivedMessage.Builder,
            com.google.pubsub.v1.ReceivedMessageOrBuilder>
        receivedMessagesBuilder_;

    /**
     *
     *
     * <pre>
     * Received Pub/Sub messages. The list will be empty if there are no more
     * messages available in the backlog, or if no messages could be returned
     * before the request timeout. For JSON, the response can be entirely
     * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
     * even if there are more messages available in the backlog.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
     */
    public java.util.List<com.google.pubsub.v1.ReceivedMessage> getReceivedMessagesList() {
      if (receivedMessagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(receivedMessages_);
      } else {
        return receivedMessagesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Received Pub/Sub messages. The list will be empty if there are no more
     * messages available in the backlog, or if no messages could be returned
     * before the request timeout. For JSON, the response can be entirely
     * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
     * even if there are more messages available in the backlog.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
     */
    public int getReceivedMessagesCount() {
      if (receivedMessagesBuilder_ == null) {
        return receivedMessages_.size();
      } else {
        return receivedMessagesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Received Pub/Sub messages. The list will be empty if there are no more
     * messages available in the backlog, or if no messages could be returned
     * before the request timeout. For JSON, the response can be entirely
     * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
     * even if there are more messages available in the backlog.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
     */
    public com.google.pubsub.v1.ReceivedMessage getReceivedMessages(int index) {
      if (receivedMessagesBuilder_ == null) {
        return receivedMessages_.get(index);
      } else {
        return receivedMessagesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Received Pub/Sub messages. The list will be empty if there are no more
     * messages available in the backlog, or if no messages could be returned
     * before the request timeout. For JSON, the response can be entirely
     * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
     * even if there are more messages available in the backlog.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
     */
    public Builder setReceivedMessages(int index, com.google.pubsub.v1.ReceivedMessage value) {
      if (receivedMessagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReceivedMessagesIsMutable();
        receivedMessages_.set(index, value);
        onChanged();
      } else {
        receivedMessagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Received Pub/Sub messages. The list will be empty if there are no more
     * messages available in the backlog, or if no messages could be returned
     * before the request timeout. For JSON, the response can be entirely
     * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
     * even if there are more messages available in the backlog.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
     */
    public Builder setReceivedMessages(
        int index, com.google.pubsub.v1.ReceivedMessage.Builder builderForValue) {
      if (receivedMessagesBuilder_ == null) {
        ensureReceivedMessagesIsMutable();
        receivedMessages_.set(index, builderForValue.build());
        onChanged();
      } else {
        receivedMessagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Received Pub/Sub messages. The list will be empty if there are no more
     * messages available in the backlog, or if no messages could be returned
     * before the request timeout. For JSON, the response can be entirely
     * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
     * even if there are more messages available in the backlog.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
     */
    public Builder addReceivedMessages(com.google.pubsub.v1.ReceivedMessage value) {
      if (receivedMessagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReceivedMessagesIsMutable();
        receivedMessages_.add(value);
        onChanged();
      } else {
        receivedMessagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Received Pub/Sub messages. The list will be empty if there are no more
     * messages available in the backlog, or if no messages could be returned
     * before the request timeout. For JSON, the response can be entirely
     * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
     * even if there are more messages available in the backlog.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
     */
    public Builder addReceivedMessages(int index, com.google.pubsub.v1.ReceivedMessage value) {
      if (receivedMessagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReceivedMessagesIsMutable();
        receivedMessages_.add(index, value);
        onChanged();
      } else {
        receivedMessagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Received Pub/Sub messages. The list will be empty if there are no more
     * messages available in the backlog, or if no messages could be returned
     * before the request timeout. For JSON, the response can be entirely
     * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
     * even if there are more messages available in the backlog.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
     */
    public Builder addReceivedMessages(
        com.google.pubsub.v1.ReceivedMessage.Builder builderForValue) {
      if (receivedMessagesBuilder_ == null) {
        ensureReceivedMessagesIsMutable();
        receivedMessages_.add(builderForValue.build());
        onChanged();
      } else {
        receivedMessagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Received Pub/Sub messages. The list will be empty if there are no more
     * messages available in the backlog, or if no messages could be returned
     * before the request timeout. For JSON, the response can be entirely
     * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
     * even if there are more messages available in the backlog.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
     */
    public Builder addReceivedMessages(
        int index, com.google.pubsub.v1.ReceivedMessage.Builder builderForValue) {
      if (receivedMessagesBuilder_ == null) {
        ensureReceivedMessagesIsMutable();
        receivedMessages_.add(index, builderForValue.build());
        onChanged();
      } else {
        receivedMessagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Received Pub/Sub messages. The list will be empty if there are no more
     * messages available in the backlog, or if no messages could be returned
     * before the request timeout. For JSON, the response can be entirely
     * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
     * even if there are more messages available in the backlog.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
     */
    public Builder addAllReceivedMessages(
        java.lang.Iterable<? extends com.google.pubsub.v1.ReceivedMessage> values) {
      if (receivedMessagesBuilder_ == null) {
        ensureReceivedMessagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, receivedMessages_);
        onChanged();
      } else {
        receivedMessagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Received Pub/Sub messages. The list will be empty if there are no more
     * messages available in the backlog, or if no messages could be returned
     * before the request timeout. For JSON, the response can be entirely
     * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
     * even if there are more messages available in the backlog.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
     */
    public Builder clearReceivedMessages() {
      if (receivedMessagesBuilder_ == null) {
        receivedMessages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        receivedMessagesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Received Pub/Sub messages. The list will be empty if there are no more
     * messages available in the backlog, or if no messages could be returned
     * before the request timeout. For JSON, the response can be entirely
     * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
     * even if there are more messages available in the backlog.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
     */
    public Builder removeReceivedMessages(int index) {
      if (receivedMessagesBuilder_ == null) {
        ensureReceivedMessagesIsMutable();
        receivedMessages_.remove(index);
        onChanged();
      } else {
        receivedMessagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Received Pub/Sub messages. The list will be empty if there are no more
     * messages available in the backlog, or if no messages could be returned
     * before the request timeout. For JSON, the response can be entirely
     * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
     * even if there are more messages available in the backlog.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
     */
    public com.google.pubsub.v1.ReceivedMessage.Builder getReceivedMessagesBuilder(int index) {
      return getReceivedMessagesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Received Pub/Sub messages. The list will be empty if there are no more
     * messages available in the backlog, or if no messages could be returned
     * before the request timeout. For JSON, the response can be entirely
     * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
     * even if there are more messages available in the backlog.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
     */
    public com.google.pubsub.v1.ReceivedMessageOrBuilder getReceivedMessagesOrBuilder(int index) {
      if (receivedMessagesBuilder_ == null) {
        return receivedMessages_.get(index);
      } else {
        return receivedMessagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Received Pub/Sub messages. The list will be empty if there are no more
     * messages available in the backlog, or if no messages could be returned
     * before the request timeout. For JSON, the response can be entirely
     * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
     * even if there are more messages available in the backlog.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
     */
    public java.util.List<? extends com.google.pubsub.v1.ReceivedMessageOrBuilder>
        getReceivedMessagesOrBuilderList() {
      if (receivedMessagesBuilder_ != null) {
        return receivedMessagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(receivedMessages_);
      }
    }
    /**
     *
     *
     * <pre>
     * Received Pub/Sub messages. The list will be empty if there are no more
     * messages available in the backlog, or if no messages could be returned
     * before the request timeout. For JSON, the response can be entirely
     * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
     * even if there are more messages available in the backlog.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
     */
    public com.google.pubsub.v1.ReceivedMessage.Builder addReceivedMessagesBuilder() {
      return getReceivedMessagesFieldBuilder()
          .addBuilder(com.google.pubsub.v1.ReceivedMessage.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Received Pub/Sub messages. The list will be empty if there are no more
     * messages available in the backlog, or if no messages could be returned
     * before the request timeout. For JSON, the response can be entirely
     * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
     * even if there are more messages available in the backlog.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
     */
    public com.google.pubsub.v1.ReceivedMessage.Builder addReceivedMessagesBuilder(int index) {
      return getReceivedMessagesFieldBuilder()
          .addBuilder(index, com.google.pubsub.v1.ReceivedMessage.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Received Pub/Sub messages. The list will be empty if there are no more
     * messages available in the backlog, or if no messages could be returned
     * before the request timeout. For JSON, the response can be entirely
     * empty. The Pub/Sub system may return fewer than the `maxMessages` requested
     * even if there are more messages available in the backlog.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
     */
    public java.util.List<com.google.pubsub.v1.ReceivedMessage.Builder>
        getReceivedMessagesBuilderList() {
      return getReceivedMessagesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.pubsub.v1.ReceivedMessage,
            com.google.pubsub.v1.ReceivedMessage.Builder,
            com.google.pubsub.v1.ReceivedMessageOrBuilder>
        getReceivedMessagesFieldBuilder() {
      if (receivedMessagesBuilder_ == null) {
        receivedMessagesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.pubsub.v1.ReceivedMessage,
                com.google.pubsub.v1.ReceivedMessage.Builder,
                com.google.pubsub.v1.ReceivedMessageOrBuilder>(
                receivedMessages_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        receivedMessages_ = null;
      }
      return receivedMessagesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.PullResponse)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.PullResponse)
  private static final com.google.pubsub.v1.PullResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.PullResponse();
  }

  public static com.google.pubsub.v1.PullResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PullResponse> PARSER =
      new com.google.protobuf.AbstractParser<PullResponse>() {
        @java.lang.Override
        public PullResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<PullResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PullResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.pubsub.v1.PullResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
