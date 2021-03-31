//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

@kotlin.jvm.JvmSynthetic
inline fun receivedMessage(block: com.google.pubsub.v1.ReceivedMessageKt.Dsl.() -> Unit): com.google.pubsub.v1.ReceivedMessage =
  com.google.pubsub.v1.ReceivedMessageKt.Dsl._create(com.google.pubsub.v1.ReceivedMessage.newBuilder()).apply { block() }._build()
object ReceivedMessageKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: com.google.pubsub.v1.ReceivedMessage.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.pubsub.v1.ReceivedMessage.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.pubsub.v1.ReceivedMessage = _builder.build()

    /**
     * <pre>
     * This ID can be used to acknowledge the received message.
     * </pre>
     *
     * <code>string ack_id = 1;</code>
     */
    var ackId: kotlin.String
      @JvmName("getAckId")
      get() = _builder.getAckId()
      @JvmName("setAckId")
      set(value) {
        _builder.setAckId(value)
      }
    /**
     * <pre>
     * This ID can be used to acknowledge the received message.
     * </pre>
     *
     * <code>string ack_id = 1;</code>
     */
    fun clearAckId() {
      _builder.clearAckId()
    }

    /**
     * <pre>
     * The message.
     * </pre>
     *
     * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
     */
    var message: com.google.pubsub.v1.PubsubMessage
      @JvmName("getMessage")
      get() = _builder.getMessage()
      @JvmName("setMessage")
      set(value) {
        _builder.setMessage(value)
      }
    /**
     * <pre>
     * The message.
     * </pre>
     *
     * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
     */
    fun clearMessage() {
      _builder.clearMessage()
    }
    /**
     * <pre>
     * The message.
     * </pre>
     *
     * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
     * @return Whether the message field is set.
     */
    fun hasMessage(): kotlin.Boolean {
      return _builder.hasMessage()
    }

    /**
     * <pre>
     * The approximate number of times that Cloud Pub/Sub has attempted to deliver
     * the associated message to a subscriber.
     * More precisely, this is 1 + (number of NACKs) +
     * (number of ack_deadline exceeds) for this message.
     * A NACK is any call to ModifyAckDeadline with a 0 deadline. An ack_deadline
     * exceeds event is whenever a message is not acknowledged within
     * ack_deadline. Note that ack_deadline is initially
     * Subscription.ackDeadlineSeconds, but may get extended automatically by
     * the client library.
     * Upon the first delivery of a given message, `delivery_attempt` will have a
     * value of 1. The value is calculated at best effort and is approximate.
     * If a DeadLetterPolicy is not set on the subscription, this will be 0.
     * </pre>
     *
     * <code>int32 delivery_attempt = 3;</code>
     */
    var deliveryAttempt: kotlin.Int
      @JvmName("getDeliveryAttempt")
      get() = _builder.getDeliveryAttempt()
      @JvmName("setDeliveryAttempt")
      set(value) {
        _builder.setDeliveryAttempt(value)
      }
    /**
     * <pre>
     * The approximate number of times that Cloud Pub/Sub has attempted to deliver
     * the associated message to a subscriber.
     * More precisely, this is 1 + (number of NACKs) +
     * (number of ack_deadline exceeds) for this message.
     * A NACK is any call to ModifyAckDeadline with a 0 deadline. An ack_deadline
     * exceeds event is whenever a message is not acknowledged within
     * ack_deadline. Note that ack_deadline is initially
     * Subscription.ackDeadlineSeconds, but may get extended automatically by
     * the client library.
     * Upon the first delivery of a given message, `delivery_attempt` will have a
     * value of 1. The value is calculated at best effort and is approximate.
     * If a DeadLetterPolicy is not set on the subscription, this will be 0.
     * </pre>
     *
     * <code>int32 delivery_attempt = 3;</code>
     */
    fun clearDeliveryAttempt() {
      _builder.clearDeliveryAttempt()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun com.google.pubsub.v1.ReceivedMessage.copy(block: com.google.pubsub.v1.ReceivedMessageKt.Dsl.() -> Unit): com.google.pubsub.v1.ReceivedMessage =
  com.google.pubsub.v1.ReceivedMessageKt.Dsl._create(this.toBuilder()).apply { block() }._build()
