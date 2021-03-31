//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

@kotlin.jvm.JvmSynthetic
inline fun retryPolicy(block: com.google.pubsub.v1.RetryPolicyKt.Dsl.() -> Unit): com.google.pubsub.v1.RetryPolicy =
  com.google.pubsub.v1.RetryPolicyKt.Dsl._create(com.google.pubsub.v1.RetryPolicy.newBuilder()).apply { block() }._build()
object RetryPolicyKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: com.google.pubsub.v1.RetryPolicy.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.pubsub.v1.RetryPolicy.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.pubsub.v1.RetryPolicy = _builder.build()

    /**
     * <pre>
     * The minimum delay between consecutive deliveries of a given message.
     * Value should be between 0 and 600 seconds. Defaults to 10 seconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration minimum_backoff = 1;</code>
     */
    var minimumBackoff: com.google.protobuf.Duration
      @JvmName("getMinimumBackoff")
      get() = _builder.getMinimumBackoff()
      @JvmName("setMinimumBackoff")
      set(value) {
        _builder.setMinimumBackoff(value)
      }
    /**
     * <pre>
     * The minimum delay between consecutive deliveries of a given message.
     * Value should be between 0 and 600 seconds. Defaults to 10 seconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration minimum_backoff = 1;</code>
     */
    fun clearMinimumBackoff() {
      _builder.clearMinimumBackoff()
    }
    /**
     * <pre>
     * The minimum delay between consecutive deliveries of a given message.
     * Value should be between 0 and 600 seconds. Defaults to 10 seconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration minimum_backoff = 1;</code>
     * @return Whether the minimumBackoff field is set.
     */
    fun hasMinimumBackoff(): kotlin.Boolean {
      return _builder.hasMinimumBackoff()
    }

    /**
     * <pre>
     * The maximum delay between consecutive deliveries of a given message.
     * Value should be between 0 and 600 seconds. Defaults to 600 seconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration maximum_backoff = 2;</code>
     */
    var maximumBackoff: com.google.protobuf.Duration
      @JvmName("getMaximumBackoff")
      get() = _builder.getMaximumBackoff()
      @JvmName("setMaximumBackoff")
      set(value) {
        _builder.setMaximumBackoff(value)
      }
    /**
     * <pre>
     * The maximum delay between consecutive deliveries of a given message.
     * Value should be between 0 and 600 seconds. Defaults to 600 seconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration maximum_backoff = 2;</code>
     */
    fun clearMaximumBackoff() {
      _builder.clearMaximumBackoff()
    }
    /**
     * <pre>
     * The maximum delay between consecutive deliveries of a given message.
     * Value should be between 0 and 600 seconds. Defaults to 600 seconds.
     * </pre>
     *
     * <code>.google.protobuf.Duration maximum_backoff = 2;</code>
     * @return Whether the maximumBackoff field is set.
     */
    fun hasMaximumBackoff(): kotlin.Boolean {
      return _builder.hasMaximumBackoff()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun com.google.pubsub.v1.RetryPolicy.copy(block: com.google.pubsub.v1.RetryPolicyKt.Dsl.() -> Unit): com.google.pubsub.v1.RetryPolicy =
  com.google.pubsub.v1.RetryPolicyKt.Dsl._create(this.toBuilder()).apply { block() }._build()