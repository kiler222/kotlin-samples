//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

@kotlin.jvm.JvmSynthetic
inline fun updateSnapshotRequest(block: com.google.pubsub.v1.UpdateSnapshotRequestKt.Dsl.() -> Unit): com.google.pubsub.v1.UpdateSnapshotRequest =
  com.google.pubsub.v1.UpdateSnapshotRequestKt.Dsl._create(com.google.pubsub.v1.UpdateSnapshotRequest.newBuilder()).apply { block() }._build()
object UpdateSnapshotRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: com.google.pubsub.v1.UpdateSnapshotRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.pubsub.v1.UpdateSnapshotRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.pubsub.v1.UpdateSnapshotRequest = _builder.build()

    /**
     * <pre>
     * Required. The updated snapshot object.
     * </pre>
     *
     * <code>.google.pubsub.v1.Snapshot snapshot = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    var snapshot: com.google.pubsub.v1.Snapshot
      @JvmName("getSnapshot")
      get() = _builder.getSnapshot()
      @JvmName("setSnapshot")
      set(value) {
        _builder.setSnapshot(value)
      }
    /**
     * <pre>
     * Required. The updated snapshot object.
     * </pre>
     *
     * <code>.google.pubsub.v1.Snapshot snapshot = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    fun clearSnapshot() {
      _builder.clearSnapshot()
    }
    /**
     * <pre>
     * Required. The updated snapshot object.
     * </pre>
     *
     * <code>.google.pubsub.v1.Snapshot snapshot = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the snapshot field is set.
     */
    fun hasSnapshot(): kotlin.Boolean {
      return _builder.hasSnapshot()
    }

    /**
     * <pre>
     * Required. Indicates which fields in the provided snapshot to update.
     * Must be specified and non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    var updateMask: com.google.protobuf.FieldMask
      @JvmName("getUpdateMask")
      get() = _builder.getUpdateMask()
      @JvmName("setUpdateMask")
      set(value) {
        _builder.setUpdateMask(value)
      }
    /**
     * <pre>
     * Required. Indicates which fields in the provided snapshot to update.
     * Must be specified and non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    fun clearUpdateMask() {
      _builder.clearUpdateMask()
    }
    /**
     * <pre>
     * Required. Indicates which fields in the provided snapshot to update.
     * Must be specified and non-empty.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    fun hasUpdateMask(): kotlin.Boolean {
      return _builder.hasUpdateMask()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun com.google.pubsub.v1.UpdateSnapshotRequest.copy(block: com.google.pubsub.v1.UpdateSnapshotRequestKt.Dsl.() -> Unit): com.google.pubsub.v1.UpdateSnapshotRequest =
  com.google.pubsub.v1.UpdateSnapshotRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
