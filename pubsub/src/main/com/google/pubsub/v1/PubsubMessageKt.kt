//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

@kotlin.jvm.JvmSynthetic
inline fun pubsubMessage(block: com.google.pubsub.v1.PubsubMessageKt.Dsl.() -> Unit): com.google.pubsub.v1.PubsubMessage =
  com.google.pubsub.v1.PubsubMessageKt.Dsl._create(com.google.pubsub.v1.PubsubMessage.newBuilder()).apply { block() }._build()
object PubsubMessageKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: com.google.pubsub.v1.PubsubMessage.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.pubsub.v1.PubsubMessage.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.pubsub.v1.PubsubMessage = _builder.build()

    /**
     * <pre>
     * The message data field. If this field is empty, the message must contain
     * at least one attribute.
     * </pre>
     *
     * <code>bytes data = 1;</code>
     */
    var data: com.google.protobuf.ByteString
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <pre>
     * The message data field. If this field is empty, the message must contain
     * at least one attribute.
     * </pre>
     *
     * <code>bytes data = 1;</code>
     */
    fun clearData() {
      _builder.clearData()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class AttributesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * Attributes for this message. If this field is empty, the message must
     * contain non-empty data. This can be used to filter messages on the
     * subscription.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */
     val attributes: com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, AttributesProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getAttributesMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getAttributesMap()
      )
    /**
     * <pre>
     * Attributes for this message. If this field is empty, the message must
     * contain non-empty data. This can be used to filter messages on the
     * subscription.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */
    @JvmName("putAttributes")
    fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, AttributesProxy>
      .put(key: kotlin.String, value: kotlin.String) {
         _builder.putAttributes(key, value)
       }
    /**
     * <pre>
     * Attributes for this message. If this field is empty, the message must
     * contain non-empty data. This can be used to filter messages on the
     * subscription.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setAttributes")
    inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, AttributesProxy>
      .set(key: kotlin.String, value: kotlin.String) {
         put(key, value)
       }
    /**
     * <pre>
     * Attributes for this message. If this field is empty, the message must
     * contain non-empty data. This can be used to filter messages on the
     * subscription.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeAttributes")
    fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, AttributesProxy>
      .remove(key: kotlin.String) {
         _builder.removeAttributes(key)
       }
    /**
     * <pre>
     * Attributes for this message. If this field is empty, the message must
     * contain non-empty data. This can be used to filter messages on the
     * subscription.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllAttributes")
    fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, AttributesProxy>
      .putAll(map: kotlin.collections.Map<kotlin.String, kotlin.String>) {
         _builder.putAllAttributes(map)
       }
    /**
     * <pre>
     * Attributes for this message. If this field is empty, the message must
     * contain non-empty data. This can be used to filter messages on the
     * subscription.
     * </pre>
     *
     * <code>map&lt;string, string&gt; attributes = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearAttributes")
    fun com.google.protobuf.kotlin.DslMap<kotlin.String, kotlin.String, AttributesProxy>
      .clear() {
         _builder.clearAttributes()
       }

    /**
     * <pre>
     * ID of this message, assigned by the server when the message is published.
     * Guaranteed to be unique within the topic. This value may be read by a
     * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
     * delivery. It must not be populated by the publisher in a `Publish` call.
     * </pre>
     *
     * <code>string message_id = 3;</code>
     */
    var messageId: kotlin.String
      @JvmName("getMessageId")
      get() = _builder.getMessageId()
      @JvmName("setMessageId")
      set(value) {
        _builder.setMessageId(value)
      }
    /**
     * <pre>
     * ID of this message, assigned by the server when the message is published.
     * Guaranteed to be unique within the topic. This value may be read by a
     * subscriber that receives a `PubsubMessage` via a `Pull` call or a push
     * delivery. It must not be populated by the publisher in a `Publish` call.
     * </pre>
     *
     * <code>string message_id = 3;</code>
     */
    fun clearMessageId() {
      _builder.clearMessageId()
    }

    /**
     * <pre>
     * The time at which the message was published, populated by the server when
     * it receives the `Publish` call. It must not be populated by the
     * publisher in a `Publish` call.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 4;</code>
     */
    var publishTime: com.google.protobuf.Timestamp
      @JvmName("getPublishTime")
      get() = _builder.getPublishTime()
      @JvmName("setPublishTime")
      set(value) {
        _builder.setPublishTime(value)
      }
    /**
     * <pre>
     * The time at which the message was published, populated by the server when
     * it receives the `Publish` call. It must not be populated by the
     * publisher in a `Publish` call.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 4;</code>
     */
    fun clearPublishTime() {
      _builder.clearPublishTime()
    }
    /**
     * <pre>
     * The time at which the message was published, populated by the server when
     * it receives the `Publish` call. It must not be populated by the
     * publisher in a `Publish` call.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp publish_time = 4;</code>
     * @return Whether the publishTime field is set.
     */
    fun hasPublishTime(): kotlin.Boolean {
      return _builder.hasPublishTime()
    }

    /**
     * <pre>
     * If non-empty, identifies related messages for which publish order should be
     * respected. If a `Subscription` has `enable_message_ordering` set to `true`,
     * messages published with the same non-empty `ordering_key` value will be
     * delivered to subscribers in the order in which they are received by the
     * Pub/Sub system. All `PubsubMessage`s published in a given `PublishRequest`
     * must specify the same `ordering_key` value.
     * </pre>
     *
     * <code>string ordering_key = 5;</code>
     */
    var orderingKey: kotlin.String
      @JvmName("getOrderingKey")
      get() = _builder.getOrderingKey()
      @JvmName("setOrderingKey")
      set(value) {
        _builder.setOrderingKey(value)
      }
    /**
     * <pre>
     * If non-empty, identifies related messages for which publish order should be
     * respected. If a `Subscription` has `enable_message_ordering` set to `true`,
     * messages published with the same non-empty `ordering_key` value will be
     * delivered to subscribers in the order in which they are received by the
     * Pub/Sub system. All `PubsubMessage`s published in a given `PublishRequest`
     * must specify the same `ordering_key` value.
     * </pre>
     *
     * <code>string ordering_key = 5;</code>
     */
    fun clearOrderingKey() {
      _builder.clearOrderingKey()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun com.google.pubsub.v1.PubsubMessage.copy(block: com.google.pubsub.v1.PubsubMessageKt.Dsl.() -> Unit): com.google.pubsub.v1.PubsubMessage =
  com.google.pubsub.v1.PubsubMessageKt.Dsl._create(this.toBuilder()).apply { block() }._build()
