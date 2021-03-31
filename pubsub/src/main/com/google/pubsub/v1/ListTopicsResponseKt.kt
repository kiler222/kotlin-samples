//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

@kotlin.jvm.JvmSynthetic
inline fun listTopicsResponse(block: com.google.pubsub.v1.ListTopicsResponseKt.Dsl.() -> Unit): com.google.pubsub.v1.ListTopicsResponse =
  com.google.pubsub.v1.ListTopicsResponseKt.Dsl._create(com.google.pubsub.v1.ListTopicsResponse.newBuilder()).apply { block() }._build()
object ListTopicsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: com.google.pubsub.v1.ListTopicsResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.pubsub.v1.ListTopicsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.pubsub.v1.ListTopicsResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class TopicsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
     val topics: com.google.protobuf.kotlin.DslList<com.google.pubsub.v1.Topic, TopicsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getTopicsList()
      )
    /**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     * @param value The topics to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addTopics")
    fun com.google.protobuf.kotlin.DslList<com.google.pubsub.v1.Topic, TopicsProxy>.add(value: com.google.pubsub.v1.Topic) {
      _builder.addTopics(value)
    }/**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     * @param value The topics to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignTopics")
    inline operator fun com.google.protobuf.kotlin.DslList<com.google.pubsub.v1.Topic, TopicsProxy>.plusAssign(value: com.google.pubsub.v1.Topic) {
      add(value)
    }/**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     * @param values The topics to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllTopics")
    fun com.google.protobuf.kotlin.DslList<com.google.pubsub.v1.Topic, TopicsProxy>.addAll(values: kotlin.collections.Iterable<com.google.pubsub.v1.Topic>) {
      _builder.addAllTopics(values)
    }/**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     * @param values The topics to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllTopics")
    inline operator fun com.google.protobuf.kotlin.DslList<com.google.pubsub.v1.Topic, TopicsProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.pubsub.v1.Topic>) {
      addAll(values)
    }/**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     * @param index The index to set the value at.
     * @param value The topics to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setTopics")
    operator fun com.google.protobuf.kotlin.DslList<com.google.pubsub.v1.Topic, TopicsProxy>.set(index: kotlin.Int, value: com.google.pubsub.v1.Topic) {
      _builder.setTopics(index, value)
    }/**
     * <pre>
     * The resulting topics.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Topic topics = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearTopics")
    fun com.google.protobuf.kotlin.DslList<com.google.pubsub.v1.Topic, TopicsProxy>.clear() {
      _builder.clearTopics()
    }
    /**
     * <pre>
     * If not empty, indicates that there may be more topics that match the
     * request; this value should be passed in a new `ListTopicsRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    var nextPageToken: kotlin.String
      @JvmName("getNextPageToken")
      get() = _builder.getNextPageToken()
      @JvmName("setNextPageToken")
      set(value) {
        _builder.setNextPageToken(value)
      }
    /**
     * <pre>
     * If not empty, indicates that there may be more topics that match the
     * request; this value should be passed in a new `ListTopicsRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    fun clearNextPageToken() {
      _builder.clearNextPageToken()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun com.google.pubsub.v1.ListTopicsResponse.copy(block: com.google.pubsub.v1.ListTopicsResponseKt.Dsl.() -> Unit): com.google.pubsub.v1.ListTopicsResponse =
  com.google.pubsub.v1.ListTopicsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()