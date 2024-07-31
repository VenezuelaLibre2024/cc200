.class public abstract Lfc/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfc/e;


# instance fields
.field public final a:Lac/b;

.field public final b:Lac/b$a;

.field public final c:Lzb/a;

.field public final d:Lvb/d;

.field public final e:Landroid/media/MediaCodec$BufferInfo;

.field public f:Landroid/media/MediaCodec;

.field public g:Landroid/media/MediaCodec;

.field public h:Lwb/f;

.field public i:Lwb/f;

.field public j:Z

.field public k:Z

.field public l:Landroid/media/MediaFormat;

.field public m:Z

.field public n:Z

.field public o:Z


# direct methods
.method public constructor <init>(Lac/b;Lzb/a;Lvb/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object v0, p0, Lfc/b;->e:Landroid/media/MediaCodec$BufferInfo;

    iput-object p1, p0, Lfc/b;->a:Lac/b;

    iput-object p2, p0, Lfc/b;->c:Lzb/a;

    iput-object p3, p0, Lfc/b;->d:Lvb/d;

    new-instance p1, Lac/b$a;

    invoke-direct {p1}, Lac/b$a;-><init>()V

    iput-object p1, p0, Lfc/b;->b:Lac/b$a;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lfc/b;->n:Z

    return v0
.end method

.method public final b(Landroid/media/MediaFormat;)V
    .locals 3

    const-string v0, "mime"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v1

    iput-object v1, p0, Lfc/b;->g:Landroid/media/MediaCodec;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    invoke-virtual {p0, p1, v1}, Lfc/b;->j(Landroid/media/MediaFormat;Landroid/media/MediaCodec;)V

    iget-object v1, p0, Lfc/b;->g:Landroid/media/MediaCodec;

    invoke-virtual {p0, p1, v1}, Lfc/b;->p(Landroid/media/MediaFormat;Landroid/media/MediaCodec;)V

    iget-object v1, p0, Lfc/b;->a:Lac/b;

    iget-object v2, p0, Lfc/b;->d:Lvb/d;

    invoke-interface {v1, v2}, Lac/b;->e(Lvb/d;)Landroid/media/MediaFormat;

    move-result-object v1

    if-eqz v1, :cond_0

    :try_start_1
    invoke-virtual {v1, v0}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/media/MediaCodec;->createDecoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v0

    iput-object v0, p0, Lfc/b;->f:Landroid/media/MediaCodec;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {p0, v1, v0}, Lfc/b;->i(Landroid/media/MediaFormat;Landroid/media/MediaCodec;)V

    iget-object v0, p0, Lfc/b;->f:Landroid/media/MediaCodec;

    invoke-virtual {p0, v1, v0}, Lfc/b;->o(Landroid/media/MediaFormat;Landroid/media/MediaCodec;)V

    iget-object v0, p0, Lfc/b;->f:Landroid/media/MediaCodec;

    iget-object v2, p0, Lfc/b;->g:Landroid/media/MediaCodec;

    invoke-virtual {p0, v1, p1, v0, v2}, Lfc/b;->h(Landroid/media/MediaFormat;Landroid/media/MediaFormat;Landroid/media/MediaCodec;Landroid/media/MediaCodec;)V

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Input format is null!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_1
    move-exception p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final c(Z)Z
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    :goto_0
    const-wide/16 v2, 0x0

    invoke-virtual {p0, v2, v3}, Lfc/b;->e(J)I

    move-result v4

    if-eqz v4, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v2, v3}, Lfc/b;->d(J)I

    move-result v4

    if-eqz v4, :cond_1

    move v1, v0

    :cond_1
    if-eq v4, v0, :cond_0

    :goto_1
    invoke-virtual {p0, v2, v3}, Lfc/b;->g(J)Z

    move-result v4

    if-eqz v4, :cond_2

    move v1, v0

    goto :goto_1

    :cond_2
    :goto_2
    invoke-virtual {p0, v2, v3, p1}, Lfc/b;->f(JZ)I

    move-result v4

    if-eqz v4, :cond_3

    move v1, v0

    goto :goto_2

    :cond_3
    return v1
.end method

.method public final d(J)I
    .locals 10

    iget-boolean v0, p0, Lfc/b;->m:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lfc/b;->f:Landroid/media/MediaCodec;

    iget-object v2, p0, Lfc/b;->e:Landroid/media/MediaCodec$BufferInfo;

    invoke-virtual {v0, v2, p1, p2}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v5

    const/4 p1, -0x3

    const/4 p2, 0x1

    if-eq v5, p1, :cond_8

    const/4 p1, -0x2

    if-eq v5, p1, :cond_7

    const/4 p1, -0x1

    if-eq v5, p1, :cond_6

    iget-object p1, p0, Lfc/b;->e:Landroid/media/MediaCodec$BufferInfo;

    iget v0, p1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_1

    move v9, p2

    goto :goto_0

    :cond_1
    move v9, v1

    :goto_0
    iget p1, p1, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-lez p1, :cond_2

    move v1, p2

    :cond_2
    if-eqz v9, :cond_3

    iput-boolean p2, p0, Lfc/b;->m:Z

    :cond_3
    if-nez v9, :cond_4

    if-eqz v1, :cond_5

    :cond_4
    iget-object v4, p0, Lfc/b;->f:Landroid/media/MediaCodec;

    iget-object p1, p0, Lfc/b;->h:Lwb/f;

    invoke-virtual {p1, v5}, Lwb/f;->b(I)Ljava/nio/ByteBuffer;

    move-result-object v6

    iget-object p1, p0, Lfc/b;->e:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v7, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    move-object v3, p0

    invoke-virtual/range {v3 .. v9}, Lfc/b;->l(Landroid/media/MediaCodec;ILjava/nio/ByteBuffer;JZ)V

    :cond_5
    const/4 p1, 0x2

    return p1

    :cond_6
    return v1

    :cond_7
    iget-object p1, p0, Lfc/b;->f:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lfc/b;->k(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V

    :cond_8
    return p2
.end method

.method public final e(J)I
    .locals 8

    iget-boolean v0, p0, Lfc/b;->n:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lfc/b;->g:Landroid/media/MediaCodec;

    iget-object v2, p0, Lfc/b;->e:Landroid/media/MediaCodec$BufferInfo;

    invoke-virtual {v0, v2, p1, p2}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result p1

    const/4 p2, -0x3

    const/4 v0, 0x1

    if-eq p1, p2, :cond_6

    const/4 p2, -0x2

    if-eq p1, p2, :cond_5

    const/4 p2, -0x1

    if-eq p1, p2, :cond_4

    iget-object p2, p0, Lfc/b;->l:Landroid/media/MediaFormat;

    if-eqz p2, :cond_3

    iget-object v2, p0, Lfc/b;->e:Landroid/media/MediaCodec$BufferInfo;

    iget v7, v2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 p2, v7, 0x4

    if-eqz p2, :cond_1

    iput-boolean v0, p0, Lfc/b;->n:Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    invoke-virtual/range {v2 .. v7}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    :cond_1
    iget-object p2, p0, Lfc/b;->e:Landroid/media/MediaCodec$BufferInfo;

    iget p2, p2, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/4 v2, 0x2

    and-int/2addr p2, v2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lfc/b;->g:Landroid/media/MediaCodec;

    invoke-virtual {p2, p1, v1}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    return v0

    :cond_2
    iget-object p2, p0, Lfc/b;->c:Lzb/a;

    iget-object v0, p0, Lfc/b;->d:Lvb/d;

    iget-object v3, p0, Lfc/b;->i:Lwb/f;

    invoke-virtual {v3, p1}, Lwb/f;->b(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-object v4, p0, Lfc/b;->e:Landroid/media/MediaCodec$BufferInfo;

    invoke-interface {p2, v0, v3, v4}, Lzb/a;->c(Lvb/d;Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    iget-object p2, p0, Lfc/b;->g:Landroid/media/MediaCodec;

    invoke-virtual {p2, p1, v1}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    return v2

    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Could not determine actual output format."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return v1

    :cond_5
    iget-object p1, p0, Lfc/b;->g:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lfc/b;->m(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V

    return v0

    :cond_6
    iget-object p1, p0, Lfc/b;->i:Lwb/f;

    invoke-virtual {p1}, Lwb/f;->c()V

    return v0
.end method

.method public final f(JZ)I
    .locals 9

    iget-boolean v0, p0, Lfc/b;->o:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lfc/b;->a:Lac/b;

    invoke-interface {v0}, Lac/b;->h()Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    iget-object p3, p0, Lfc/b;->a:Lac/b;

    iget-object v0, p0, Lfc/b;->d:Lvb/d;

    invoke-interface {p3, v0}, Lac/b;->l(Lvb/d;)Z

    move-result p3

    if-nez p3, :cond_2

    return v1

    :cond_2
    iget-object p3, p0, Lfc/b;->f:Landroid/media/MediaCodec;

    invoke-virtual {p3, p1, p2}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result v3

    if-gez v3, :cond_3

    return v1

    :cond_3
    iget-object p1, p0, Lfc/b;->b:Lac/b$a;

    iget-object p2, p0, Lfc/b;->h:Lwb/f;

    invoke-virtual {p2, v3}, Lwb/f;->a(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    iput-object p2, p1, Lac/b$a;->a:Ljava/nio/ByteBuffer;

    iget-object p1, p0, Lfc/b;->a:Lac/b;

    iget-object p2, p0, Lfc/b;->b:Lac/b$a;

    invoke-interface {p1, p2}, Lac/b;->j(Lac/b$a;)V

    iget-object v2, p0, Lfc/b;->f:Landroid/media/MediaCodec;

    const/4 v4, 0x0

    iget-object p1, p0, Lfc/b;->b:Lac/b$a;

    iget v5, p1, Lac/b$a;->d:I

    iget-wide v6, p1, Lac/b$a;->c:J

    iget-boolean v8, p1, Lac/b$a;->b:Z

    invoke-virtual/range {v2 .. v8}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    const/4 p1, 0x2

    return p1

    :cond_4
    :goto_0
    iget-object p3, p0, Lfc/b;->f:Landroid/media/MediaCodec;

    invoke-virtual {p3, p1, p2}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result v3

    if-gez v3, :cond_5

    return v1

    :cond_5
    const/4 p1, 0x1

    iput-boolean p1, p0, Lfc/b;->o:Z

    iget-object v2, p0, Lfc/b;->f:Landroid/media/MediaCodec;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x4

    invoke-virtual/range {v2 .. v8}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    return v1
.end method

.method public final g(J)Z
    .locals 2

    iget-object v0, p0, Lfc/b;->g:Landroid/media/MediaCodec;

    iget-object v1, p0, Lfc/b;->i:Lwb/f;

    invoke-virtual {p0, v0, v1, p1, p2}, Lfc/b;->n(Landroid/media/MediaCodec;Lwb/f;J)Z

    move-result p1

    return p1
.end method

.method public h(Landroid/media/MediaFormat;Landroid/media/MediaFormat;Landroid/media/MediaCodec;Landroid/media/MediaCodec;)V
    .locals 0

    return-void
.end method

.method public i(Landroid/media/MediaFormat;Landroid/media/MediaCodec;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v0, v0, v1}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    return-void
.end method

.method public j(Landroid/media/MediaFormat;Landroid/media/MediaCodec;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p2, p1, v0, v0, v1}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    return-void
.end method

.method public k(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V
    .locals 0

    return-void
.end method

.method public abstract l(Landroid/media/MediaCodec;ILjava/nio/ByteBuffer;JZ)V
.end method

.method public m(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V
    .locals 1

    iget-object p1, p0, Lfc/b;->l:Landroid/media/MediaFormat;

    if-nez p1, :cond_0

    iput-object p2, p0, Lfc/b;->l:Landroid/media/MediaFormat;

    iget-object p1, p0, Lfc/b;->c:Lzb/a;

    iget-object v0, p0, Lfc/b;->d:Lvb/d;

    invoke-interface {p1, v0, p2}, Lzb/a;->b(Lvb/d;Landroid/media/MediaFormat;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Audio output format changed twice."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract n(Landroid/media/MediaCodec;Lwb/f;J)Z
.end method

.method public o(Landroid/media/MediaFormat;Landroid/media/MediaCodec;)V
    .locals 0

    invoke-virtual {p2}, Landroid/media/MediaCodec;->start()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lfc/b;->j:Z

    new-instance p1, Lwb/f;

    invoke-direct {p1, p2}, Lwb/f;-><init>(Landroid/media/MediaCodec;)V

    iput-object p1, p0, Lfc/b;->h:Lwb/f;

    return-void
.end method

.method public p(Landroid/media/MediaFormat;Landroid/media/MediaCodec;)V
    .locals 0

    invoke-virtual {p2}, Landroid/media/MediaCodec;->start()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lfc/b;->k:Z

    new-instance p1, Lwb/f;

    invoke-direct {p1, p2}, Lwb/f;-><init>(Landroid/media/MediaCodec;)V

    iput-object p1, p0, Lfc/b;->i:Lwb/f;

    return-void
.end method

.method public release()V
    .locals 4

    iget-object v0, p0, Lfc/b;->f:Landroid/media/MediaCodec;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-boolean v3, p0, Lfc/b;->j:Z

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    iput-boolean v1, p0, Lfc/b;->j:Z

    :cond_0
    iget-object v0, p0, Lfc/b;->f:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    iput-object v2, p0, Lfc/b;->f:Landroid/media/MediaCodec;

    :cond_1
    iget-object v0, p0, Lfc/b;->g:Landroid/media/MediaCodec;

    if-eqz v0, :cond_3

    iget-boolean v3, p0, Lfc/b;->k:Z

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    iput-boolean v1, p0, Lfc/b;->k:Z

    :cond_2
    iget-object v0, p0, Lfc/b;->g:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    iput-object v2, p0, Lfc/b;->g:Landroid/media/MediaCodec;

    :cond_3
    return-void
.end method
