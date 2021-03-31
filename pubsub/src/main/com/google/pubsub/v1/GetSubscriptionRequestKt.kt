//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

@kotlin.jvm.JvmSynthetic
inline fun getSubscriptionRequest(block: com.google.pubsub.v1.GetSubscriptionRequestKt.Dsl.() -> Unit): com.google.pubsub.v1.GetSubscriptionRequest =
  com.google.pubsub.v1.GetSubscriptionRequestKt.Dsl._create(com.google.pubsub.v1.GetSubscriptionRequest.newBuilder()).apply { block() }._build()
object GetSubscriptionRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: com.google.pubsub.v1.GetSubscriptionRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.pubsub.v1.GetSubscriptionRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.pubsub.v1.GetSubscriptionRequest = _builder.build()

    /**
     * <pre>
     * Required. The name of the subscription to get.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     */
    var subscription: kotlin.String
      @JvmName("getSubscription")
      get() = _builder.getSubscription()
      @JvmName("setSubscription")
      set(value) {
        _builder.setSubscription(value)
      }
    /**
     * <pre>
     * Required. The name of the subscription to get.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     */
    fun clearSubscription() {
      _builder.clearSubscription()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun com.google.pubsub.v1.GetSubscriptionRequest.copy(block: com.google.pubsub.v1.GetSubscriptionRequestKt.Dsl.() -> Unit): com.google.pubsub.v1.GetSubscriptionRequest =
  com.google.pubsub.v1.GetSubscriptionRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()