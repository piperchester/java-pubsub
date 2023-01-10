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
// source: google/pubsub/v1/schema.proto

package com.google.pubsub.v1;

public interface DeleteSchemaRevisionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.DeleteSchemaRevisionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the schema revision to be deleted, with a revision ID
   * explicitly included.
   * Example: projects/123/schemas/my-schema&#64;c7cfa2a8
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the schema revision to be deleted, with a revision ID
   * explicitly included.
   * Example: projects/123/schemas/my-schema&#64;c7cfa2a8
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The revision ID to roll back to.
   * It must be a revision of the same schema.
   *   Example: c7cfa2a8
   * </pre>
   *
   * <code>string revision_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The revisionId.
   */
  java.lang.String getRevisionId();
  /**
   *
   *
   * <pre>
   * Required. The revision ID to roll back to.
   * It must be a revision of the same schema.
   *   Example: c7cfa2a8
   * </pre>
   *
   * <code>string revision_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for revisionId.
   */
  com.google.protobuf.ByteString getRevisionIdBytes();
}
