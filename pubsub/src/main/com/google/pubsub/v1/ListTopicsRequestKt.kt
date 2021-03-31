//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

@kotlin.jvm.JvmSynthetic
inline fun listTopicsRequest(block: com.google.pubsub.v1.ListTopicsRequestKt.Dsl.() -> Unit): com.google.pubsub.v1.ListTopicsRequest =
  com.google.pubsub.v1.ListTopicsRequestKt.Dsl._create(com.google.pubsub.v1.ListTopicsRequest.newBuilder()).apply { block() }._build()
object ListTopicsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: com.google.pubsub.v1.ListTopicsRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.pubsub.v1.ListTopicsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.pubsub.v1.ListTopicsRequest = _builder.build()

    /**
     * <pre>
     * Required. The name of the project in which to list topics.
     * Format is `projects/{project-id}`.
     * </pre>
     *
     * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     */
    var project: kotlin.String
      @JvmName("getProject")
      get() = _builder.getProject()
      @JvmName("setProject")
      set(value) {
        _builder.setProject(value)
      }
    /**
     * <pre>
     * Required. The name of the project in which to list topics.
     * Format is `projects/{project-id}`.
     * </pre>
     *
     * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     */
    fun clearProject() {
      _builder.clearProject()
    }

    /**
     * <pre>
     * Maximum number of topics to return.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     */
    var pageSize: kotlin.Int
      @JvmName("getPageSize")
      get() = _builder.getPageSize()
      @JvmName("setPageSize")
      set(value) {
        _builder.setPageSize(value)
      }
    /**
     * <pre>
     * Maximum number of topics to return.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     */
    fun clearPageSize() {
      _builder.clearPageSize()
    }

    /**
     * <pre>
     * The value returned by the last `ListTopicsResponse`; indicates that this is
     * a continuation of a prior `ListTopics` call, and that the system should
     * return the next page of data.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    var pageToken: kotlin.String
      @JvmName("getPageToken")
      get() = _builder.getPageToken()
      @JvmName("setPageToken")
      set(value) {
        _builder.setPageToken(value)
      }
    /**
     * <pre>
     * The value returned by the last `ListTopicsResponse`; indicates that this is
     * a continuation of a prior `ListTopics` call, and that the system should
     * return the next page of data.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     */
    fun clearPageToken() {
      _builder.clearPageToken()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun com.google.pubsub.v1.ListTopicsRequest.copy(block: com.google.pubsub.v1.ListTopicsRequestKt.Dsl.() -> Unit): com.google.pubsub.v1.ListTopicsRequest =
  com.google.pubsub.v1.ListTopicsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()