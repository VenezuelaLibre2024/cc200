.class public Lgc/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final q:Lwb/e;


# instance fields
.field public final a:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lgc/a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lgc/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Landroid/media/MediaCodec;

.field public final d:Landroid/media/MediaCodec;

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Lxb/a;

.field public final j:Lyb/a;

.field public final k:Ldc/a;

.field public final l:Lec/b;

.field public m:J

.field public n:J

.field public o:Ljava/nio/ShortBuffer;

.field public p:Ljava/nio/ShortBuffer;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lgc/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lwb/e;

    invoke-direct {v1, v0}, Lwb/e;-><init>(Ljava/lang/String;)V

    sput-object v1, Lgc/c;->q:Lwb/e;

    return-void
.end method

.method public constructor <init>(Landroid/media/MediaCodec;Landroid/media/MediaFormat;Landroid/media/MediaCodec;Landroid/media/MediaFormat;Lec/b;Ldc/a;Lyb/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lgc/c;->a:Ljava/util/Queue;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lgc/c;->b:Ljava/util/Queue;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lgc/c;->m:J

    iput-wide v0, p0, Lgc/c;->n:J

    iput-object p1, p0, Lgc/c;->c:Landroid/media/MediaCodec;

    iput-object p3, p0, Lgc/c;->d:Landroid/media/MediaCodec;

    iput-object p5, p0, Lgc/c;->l:Lec/b;

    const-string p1, "sample-rate"

    invoke-virtual {p4, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p3

    iput p3, p0, Lgc/c;->f:I

    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lgc/c;->e:I

    const-string p1, "channel-count"

    invoke-virtual {p4, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p3

    iput p3, p0, Lgc/c;->h:I

    invoke-virtual {p2, p1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lgc/c;->g:I

    const-string p2, ") not supported."

    const/4 p4, 0x2

    const/4 p5, 0x1

    if-eq p3, p5, :cond_1

    if-ne p3, p4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "Output channel count ("

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eq p1, p5, :cond_3

    if-ne p1, p4, :cond_2

    goto :goto_1

    :cond_2
    new-instance p3, Ljava/lang/UnsupportedOperationException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "Input channel count ("

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_3
    :goto_1
    if-le p1, p3, :cond_4

    sget-object p1, Lxb/a;->a:Lxb/a;

    :goto_2
    iput-object p1, p0, Lgc/c;->i:Lxb/a;

    goto :goto_3

    :cond_4
    if-ge p1, p3, :cond_5

    sget-object p1, Lxb/a;->b:Lxb/a;

    goto :goto_2

    :cond_5
    sget-object p1, Lxb/a;->c:Lxb/a;

    goto :goto_2

    :goto_3
    iput-object p6, p0, Lgc/c;->k:Ldc/a;

    iput-object p7, p0, Lgc/c;->j:Lyb/a;

    return-void
.end method


# virtual methods
.method public a(ILjava/nio/ByteBuffer;JZ)V
    .locals 1

    iget-object v0, p0, Lgc/c;->i:Lxb/a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lgc/c;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgc/a;

    if-nez v0, :cond_0

    new-instance v0, Lgc/a;

    invoke-direct {v0}, Lgc/a;-><init>()V

    :cond_0
    iput p1, v0, Lgc/a;->a:I

    if-eqz p5, :cond_1

    const-wide/16 p3, 0x0

    :cond_1
    iput-wide p3, v0, Lgc/a;->b:J

    if-eqz p5, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object p1

    :goto_0
    iput-object p1, v0, Lgc/a;->c:Ljava/nio/ShortBuffer;

    iput-boolean p5, v0, Lgc/a;->d:Z

    iget-object p1, p0, Lgc/c;->b:Ljava/util/Queue;

    invoke-interface {p1, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void

    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Buffer received before format!"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(I)V
    .locals 3

    sget-object v0, Lgc/c;->q:Lwb/e;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ensureTempBuffer1 - desiredSize:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwb/e;->i(Ljava/lang/String;)V

    iget-object v1, p0, Lgc/c;->o:Ljava/nio/ShortBuffer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/nio/ShortBuffer;->capacity()I

    move-result v1

    if-ge v1, p1, :cond_1

    :cond_0
    const-string v1, "ensureTempBuffer1 - creating new buffer."

    invoke-virtual {v0, v1}, Lwb/e;->i(Ljava/lang/String;)V

    mul-int/lit8 v0, p1, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v0

    iput-object v0, p0, Lgc/c;->o:Ljava/nio/ShortBuffer;

    :cond_1
    iget-object v0, p0, Lgc/c;->o:Ljava/nio/ShortBuffer;

    invoke-virtual {v0}, Ljava/nio/ShortBuffer;->clear()Ljava/nio/Buffer;

    iget-object v0, p0, Lgc/c;->o:Ljava/nio/ShortBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ShortBuffer;->limit(I)Ljava/nio/Buffer;

    return-void
.end method

.method public final c(I)V
    .locals 3

    sget-object v0, Lgc/c;->q:Lwb/e;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ensureTempBuffer2 - desiredSize:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwb/e;->i(Ljava/lang/String;)V

    iget-object v1, p0, Lgc/c;->p:Ljava/nio/ShortBuffer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/nio/ShortBuffer;->capacity()I

    move-result v1

    if-ge v1, p1, :cond_1

    :cond_0
    const-string v1, "ensureTempBuffer2 - creating new buffer."

    invoke-virtual {v0, v1}, Lwb/e;->i(Ljava/lang/String;)V

    mul-int/lit8 v0, p1, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v0

    iput-object v0, p0, Lgc/c;->p:Ljava/nio/ShortBuffer;

    :cond_1
    iget-object v0, p0, Lgc/c;->p:Ljava/nio/ShortBuffer;

    invoke-virtual {v0}, Ljava/nio/ShortBuffer;->clear()Ljava/nio/Buffer;

    iget-object v0, p0, Lgc/c;->p:Ljava/nio/ShortBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ShortBuffer;->limit(I)Ljava/nio/Buffer;

    return-void
.end method

.method public d(Lwb/f;J)Z
    .locals 9

    invoke-virtual {p0}, Lgc/c;->e()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lgc/c;->d:Landroid/media/MediaCodec;

    invoke-virtual {v0, p2, p3}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result v3

    if-gez v3, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1, v3}, Lwb/f;->a(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ShortBuffer;->clear()Ljava/nio/Buffer;

    iget-object p2, p0, Lgc/c;->b:Ljava/util/Queue;

    invoke-interface {p2}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lgc/a;

    iget-boolean p3, p2, Lgc/a;->d:Z

    if-eqz p3, :cond_2

    iget-object v2, p0, Lgc/c;->d:Landroid/media/MediaCodec;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x4

    invoke-virtual/range {v2 .. v8}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    return v1

    :cond_2
    invoke-virtual {p0, p2, p1, v3}, Lgc/c;->f(Lgc/a;Ljava/nio/ShortBuffer;I)Z

    move-result p1

    const/4 p3, 0x1

    if-eqz p1, :cond_3

    return p3

    :cond_3
    iget-object p1, p0, Lgc/c;->b:Ljava/util/Queue;

    invoke-interface {p1}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    iget-object p1, p0, Lgc/c;->a:Ljava/util/Queue;

    invoke-interface {p1, p2}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lgc/c;->c:Landroid/media/MediaCodec;

    iget p2, p2, Lgc/a;->a:I

    invoke-virtual {p1, p2, v1}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    return p3
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lgc/c;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final f(Lgc/a;Ljava/nio/ShortBuffer;I)Z
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ShortBuffer;->remaining()I

    move-result v2

    iget-object v3, v1, Lgc/a;->c:Ljava/nio/ShortBuffer;

    invoke-virtual {v3}, Ljava/nio/ShortBuffer;->remaining()I

    move-result v3

    iget-object v4, v0, Lgc/c;->l:Lec/b;

    sget-object v5, Lvb/d;->i:Lvb/d;

    iget-wide v6, v1, Lgc/a;->b:J

    invoke-interface {v4, v5, v6, v7}, Lec/b;->a(Lvb/d;J)J

    move-result-wide v12

    iget-wide v4, v0, Lgc/c;->m:J

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long v4, v4, v6

    if-nez v4, :cond_0

    iget-wide v4, v1, Lgc/a;->b:J

    iput-wide v4, v0, Lgc/c;->m:J

    iput-wide v12, v0, Lgc/c;->n:J

    :cond_0
    iget-wide v4, v1, Lgc/a;->b:J

    iget-wide v6, v0, Lgc/c;->m:J

    sub-long v6, v4, v6

    iget-wide v8, v0, Lgc/c;->n:J

    sub-long v8, v12, v8

    iput-wide v4, v0, Lgc/c;->m:J

    iput-wide v12, v0, Lgc/c;->n:J

    long-to-double v4, v8

    long-to-double v10, v6

    div-double/2addr v4, v10

    sget-object v10, Lgc/c;->q:Lwb/e;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "process - time stretching - decoderDurationUs:"

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " encoderDeltaUs:"

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " stretchFactor:"

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v10, v6}, Lwb/e;->b(Ljava/lang/String;)V

    int-to-double v6, v3

    mul-double v8, v6, v4

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-int v8, v8

    iget-object v9, v0, Lgc/c;->i:Lxb/a;

    invoke-interface {v9, v8}, Lxb/a;->b(I)I

    move-result v8

    int-to-double v8, v8

    iget v11, v0, Lgc/c;->f:I

    int-to-double v14, v11

    mul-double/2addr v8, v14

    iget v11, v0, Lgc/c;->e:I

    int-to-double v14, v11

    div-double/2addr v8, v14

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-int v8, v8

    const/4 v9, 0x0

    if-le v8, v2, :cond_1

    const/4 v11, 0x1

    move v15, v11

    goto :goto_0

    :cond_1
    move v15, v9

    :goto_0
    move-wide/from16 v16, v12

    if-eqz v15, :cond_2

    int-to-double v11, v8

    div-double/2addr v11, v6

    int-to-double v6, v2

    div-double/2addr v6, v11

    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    move-result-wide v6

    double-to-int v6, v6

    sub-int v9, v3, v6

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "process - overflowing! Reduction:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v10, v6}, Lwb/e;->i(Ljava/lang/String;)V

    iget-object v6, v1, Lgc/a;->c:Ljava/nio/ShortBuffer;

    invoke-virtual {v6}, Ljava/nio/ShortBuffer;->limit()I

    move-result v7

    sub-int/2addr v7, v9

    invoke-virtual {v6, v7}, Ljava/nio/ShortBuffer;->limit(I)Ljava/nio/Buffer;

    :cond_2
    iget-object v6, v1, Lgc/a;->c:Ljava/nio/ShortBuffer;

    invoke-virtual {v6}, Ljava/nio/ShortBuffer;->remaining()I

    move-result v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "process - totalInputSize:"

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " processedTotalInputSize:"

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " outputSize:"

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " inputSize:"

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v2}, Lwb/e;->b(Ljava/lang/String;)V

    int-to-double v2, v6

    mul-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    invoke-virtual {v0, v4}, Lgc/c;->b(I)V

    iget-object v4, v0, Lgc/c;->k:Ldc/a;

    iget-object v5, v1, Lgc/a;->c:Ljava/nio/ShortBuffer;

    iget-object v7, v0, Lgc/c;->o:Ljava/nio/ShortBuffer;

    iget v8, v0, Lgc/c;->g:I

    invoke-interface {v4, v5, v7, v8}, Ldc/a;->a(Ljava/nio/ShortBuffer;Ljava/nio/ShortBuffer;I)V

    iget-object v4, v0, Lgc/c;->o:Ljava/nio/ShortBuffer;

    invoke-virtual {v4}, Ljava/nio/ShortBuffer;->rewind()Ljava/nio/Buffer;

    iget-object v4, v0, Lgc/c;->i:Lxb/a;

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-interface {v4, v2}, Lxb/a;->b(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lgc/c;->c(I)V

    iget-object v2, v0, Lgc/c;->i:Lxb/a;

    iget-object v3, v0, Lgc/c;->o:Ljava/nio/ShortBuffer;

    iget-object v4, v0, Lgc/c;->p:Ljava/nio/ShortBuffer;

    invoke-interface {v2, v3, v4}, Lxb/a;->a(Ljava/nio/ShortBuffer;Ljava/nio/ShortBuffer;)V

    iget-object v2, v0, Lgc/c;->p:Ljava/nio/ShortBuffer;

    invoke-virtual {v2}, Ljava/nio/ShortBuffer;->rewind()Ljava/nio/Buffer;

    iget-object v2, v0, Lgc/c;->j:Lyb/a;

    iget-object v3, v0, Lgc/c;->p:Ljava/nio/ShortBuffer;

    iget v4, v0, Lgc/c;->e:I

    iget v5, v0, Lgc/c;->f:I

    iget v7, v0, Lgc/c;->g:I

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    move/from16 v20, v4

    move-object/from16 v21, p2

    move/from16 v22, v5

    move/from16 v23, v7

    invoke-interface/range {v18 .. v23}, Lyb/a;->a(Ljava/nio/ShortBuffer;ILjava/nio/ShortBuffer;II)V

    if-eqz v15, :cond_3

    iget-wide v2, v1, Lgc/a;->b:J

    iget v4, v0, Lgc/c;->e:I

    iget v5, v0, Lgc/c;->g:I

    invoke-static {v6, v4, v5}, Lgc/b;->b(III)J

    move-result-wide v4

    add-long/2addr v2, v4

    iput-wide v2, v1, Lgc/a;->b:J

    iget-object v1, v1, Lgc/a;->c:Ljava/nio/ShortBuffer;

    invoke-virtual {v1}, Ljava/nio/ShortBuffer;->limit()I

    move-result v2

    add-int/2addr v2, v9

    invoke-virtual {v1, v2}, Ljava/nio/ShortBuffer;->limit(I)Ljava/nio/Buffer;

    :cond_3
    iget-object v8, v0, Lgc/c;->d:Landroid/media/MediaCodec;

    const/4 v10, 0x0

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ShortBuffer;->position()I

    move-result v1

    mul-int/lit8 v11, v1, 0x2

    const/4 v14, 0x0

    move/from16 v9, p3

    move-wide/from16 v12, v16

    invoke-virtual/range {v8 .. v14}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    return v15
.end method
