.class public final Lqb/a;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(I)Ljava/nio/FloatBuffer;
    .locals 1

    mul-int/lit8 p0, p0, 0x4

    invoke-static {p0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/FloatBuffer;->capacity()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/nio/FloatBuffer;->limit(I)Ljava/nio/Buffer;

    const-string v0, "ByteBuffer\n            .\u2026capacity())\n            }"

    invoke-static {p0, v0}, Ltd/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final varargs b([F)Ljava/nio/FloatBuffer;
    .locals 1

    const-string v0, "elements"

    invoke-static {p0, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object p0

    invoke-static {p0}, Lqb/a;->c([F)Ljava/nio/FloatBuffer;

    move-result-object p0

    return-object p0
.end method

.method public static final c([F)Ljava/nio/FloatBuffer;
    .locals 2

    const-string v0, "$this$toBuffer"

    invoke-static {p0, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/FloatBuffer;->flip()Ljava/nio/Buffer;

    const-string v0, "buffer"

    invoke-static {p0, v0}, Ltd/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
