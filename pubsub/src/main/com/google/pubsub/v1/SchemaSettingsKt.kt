//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

@kotlin.jvm.JvmSynthetic
inline fun schemaSettings(block: com.google.pubsub.v1.SchemaSettingsKt.Dsl.() -> Unit): com.google.pubsub.v1.SchemaSettings =
  com.google.pubsub.v1.SchemaSettingsKt.Dsl._create(com.google.pubsub.v1.SchemaSettings.newBuilder()).apply { block() }._build()
object SchemaSettingsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: com.google.pubsub.v1.SchemaSettings.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.pubsub.v1.SchemaSettings.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.pubsub.v1.SchemaSettings = _builder.build()

    /**
     * <pre>
     * Required. The name of the schema that messages published should be
     * validated against. Format is `projects/{project}/schemas/{schema}`. The
     * value of this field will be `_deleted-schema_` if the schema has been
     * deleted.
     * </pre>
     *
     * <code>string schema = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     */
    var schema: kotlin.String
      @JvmName("getSchema")
      get() = _builder.getSchema()
      @JvmName("setSchema")
      set(value) {
        _builder.setSchema(value)
      }
    /**
     * <pre>
     * Required. The name of the schema that messages published should be
     * validated against. Format is `projects/{project}/schemas/{schema}`. The
     * value of this field will be `_deleted-schema_` if the schema has been
     * deleted.
     * </pre>
     *
     * <code>string schema = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     */
    fun clearSchema() {
      _builder.clearSchema()
    }

    /**
     * <pre>
     * The encoding of messages validated against `schema`.
     * </pre>
     *
     * <code>.google.pubsub.v1.Encoding encoding = 2;</code>
     */
    var encoding: com.google.pubsub.v1.Encoding
      @JvmName("getEncoding")
      get() = _builder.getEncoding()
      @JvmName("setEncoding")
      set(value) {
        _builder.setEncoding(value)
      }
    /**
     * <pre>
     * The encoding of messages validated against `schema`.
     * </pre>
     *
     * <code>.google.pubsub.v1.Encoding encoding = 2;</code>
     */
    fun clearEncoding() {
      _builder.clearEncoding()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun com.google.pubsub.v1.SchemaSettings.copy(block: com.google.pubsub.v1.SchemaSettingsKt.Dsl.() -> Unit): com.google.pubsub.v1.SchemaSettings =
  com.google.pubsub.v1.SchemaSettingsKt.Dsl._create(this.toBuilder()).apply { block() }._build()
