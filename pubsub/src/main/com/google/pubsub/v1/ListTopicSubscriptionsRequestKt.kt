//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

@kotlin.jvm.JvmSynthetic
inline fun listTopicSubscriptionsRequest(block: com.google.pubsub.v1.ListTopicSubscriptionsRequestKt.Dsl.() -> Unit): com.google.pubsub.v1.ListTopicSubscriptionsRequest =
  com.google.pubsub.v1.ListTopicSubscriptionsRequestKt.Dsl._create(com.google.pubsub.v1.ListTopicSubscriptionsRequest.newBuilder()).apply { block() }._build()
object ListTopicSubscriptionsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: com.google.pubsub.v1.ListTopicSubscriptionsRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.pubsub.v1.ListTopicSubscriptionsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.pubsub.v1.ListTopicSubscriptionsRequest = _builder.build()

    /**
     * <pre>
     * Required. The name of the topic that subscriptions are attached to.
     * Format is `projects/{project}/topics/{topic}`.
     * </pre>
     *
     * <code>string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     */
    var topic: kotlin.String
      @JvmName("getTopic")
      get() = _builder.getTopic()
      @JvmName("setTopic")
      set(value) {
        _builder.setTopic(value)
      }
    /**
     * <pre>
     * Required. The name of the topic that subscriptions are attached to.
     * Format is `projects/{project}/topics/{topic}`.
     * </pre>
     *
     * <code>string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     */
    fun clearTopic() {
      _builder.clearTopic()
    }

    /**
     * <pre>
     * Maximum number of subscription names to return.
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
     * Maximum number of subscription names to return.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     */
    fun clearPageSize() {
      _builder.clearPageSize()
    }

    /**
     * <pre>
     * The value returned by the last `ListTopicSubscriptionsResponse`; indicates
     * that this is a continuation of a prior `ListTopicSubscriptions` call, and
     * that the system should return the next page of data.
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
     * The value returned by the last `ListTopicSubscriptionsResponse`; indicates
     * that this is a continuation of a prior `ListTopicSubscriptions` call, and
     * that the system should return the next page of data.
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
inline fun com.google.pubsub.v1.ListTopicSubscriptionsRequest.copy(block: com.google.pubsub.v1.ListTopicSubscriptionsRequestKt.Dsl.() -> Unit): com.google.pubsub.v1.ListTopicSubscriptionsRequest =
  com.google.pubsub.v1.ListTopicSubscriptionsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()