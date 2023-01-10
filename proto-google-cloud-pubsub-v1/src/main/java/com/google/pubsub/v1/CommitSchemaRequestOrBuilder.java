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

public interface CommitSchemaRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.CommitSchemaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the schema we are revising.
   * Format is `projects/{project}/schemas/{schema}`.
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
   * Required. The name of the schema we are revising.
   * Format is `projects/{project}/schemas/{schema}`.
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
   * Required. The schema revision to commit.
   * </pre>
   *
   * <code>.google.pubsub.v1.Schema schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the schema field is set.
   */
  boolean hasSchema();
  /**
   *
   *
   * <pre>
   * Required. The schema revision to commit.
   * </pre>
   *
   * <code>.google.pubsub.v1.Schema schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The schema.
   */
  com.google.pubsub.v1.Schema getSchema();
  /**
   *
   *
   * <pre>
   * Required. The schema revision to commit.
   * </pre>
   *
   * <code>.google.pubsub.v1.Schema schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.pubsub.v1.SchemaOrBuilder getSchemaOrBuilder();
}
