.class public Lfc/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfc/e;


# instance fields
.field public final a:Lac/b;

.field public final b:Lzb/a;

.field public final c:Lac/b$a;

.field public final d:Lvb/d;

.field public final e:Landroid/media/MediaCodec$BufferInfo;

.field public f:Z

.field public final g:Landroid/media/MediaFormat;

.field public h:Z

.field public i:Lec/b;


# direct methods
.method public constructor <init>(Lac/b;Lzb/a;Lvb/d;Lec/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object v0, p0, Lfc/d;->e:Landroid/media/MediaCodec$BufferInfo;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lfc/d;->h:Z

    iput-object p1, p0, Lfc/d;->a:Lac/b;

    iput-object p2, p0, Lfc/d;->b:Lzb/a;

    iput-object p3, p0, Lfc/d;->d:Lvb/d;

    invoke-interface {p1, p3}, Lac/b;->e(Lvb/d;)Landroid/media/MediaFormat;

    move-result-object p1

    iput-object p1, p0, Lfc/d;->g:Landroid/media/MediaFormat;

    if-eqz p1, :cond_0

    const-string p2, "max-input-size"

    invoke-virtual {p1, p2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p1

    new-instance p2, Lac/b$a;

    invoke-direct {p2}, Lac/b$a;-><init>()V

    iput-object p2, p0, Lfc/d;->c:Lac/b$a;

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p2, Lac/b$a;->a:Ljava/nio/ByteBuffer;

    iput-object p4, p0, Lfc/d;->i:Lec/b;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Output format is null!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lfc/d;->f:Z

    return v0
.end method

.method public b(Landroid/media/MediaFormat;)V
    .locals 0

    return-void
.end method

.method public c(Z)Z
    .locals 11

    iget-boolean v0, p0, Lfc/d;->f:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lfc/d;->h:Z

    const/4 v2, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lfc/d;->b:Lzb/a;

    iget-object v3, p0, Lfc/d;->d:Lvb/d;

    iget-object v4, p0, Lfc/d;->g:Landroid/media/MediaFormat;

    invoke-interface {v0, v3, v4}, Lzb/a;->b(Lvb/d;Landroid/media/MediaFormat;)V

    iput-boolean v2, p0, Lfc/d;->h:Z

    :cond_1
    iget-object v0, p0, Lfc/d;->a:Lac/b;

    invoke-interface {v0}, Lac/b;->h()Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lfc/d;->a:Lac/b;

    iget-object v0, p0, Lfc/d;->d:Lvb/d;

    invoke-interface {p1, v0}, Lac/b;->l(Lvb/d;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    iget-object p1, p0, Lfc/d;->c:Lac/b$a;

    iget-object p1, p1, Lac/b$a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    iget-object p1, p0, Lfc/d;->a:Lac/b;

    iget-object v0, p0, Lfc/d;->c:Lac/b$a;

    invoke-interface {p1, v0}, Lac/b;->j(Lac/b$a;)V

    iget-object p1, p0, Lfc/d;->i:Lec/b;

    iget-object v0, p0, Lfc/d;->d:Lvb/d;

    iget-object v1, p0, Lfc/d;->c:Lac/b$a;

    iget-wide v3, v1, Lac/b$a;->c:J

    invoke-interface {p1, v0, v3, v4}, Lec/b;->a(Lvb/d;J)J

    move-result-wide v8

    iget-object p1, p0, Lfc/d;->c:Lac/b$a;

    iget-boolean v10, p1, Lac/b$a;->b:Z

    iget-object v5, p0, Lfc/d;->e:Landroid/media/MediaCodec$BufferInfo;

    const/4 v6, 0x0

    iget v7, p1, Lac/b$a;->d:I

    invoke-virtual/range {v5 .. v10}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    iget-object p1, p0, Lfc/d;->b:Lzb/a;

    iget-object v0, p0, Lfc/d;->d:Lvb/d;

    iget-object v1, p0, Lfc/d;->c:Lac/b$a;

    iget-object v1, v1, Lac/b$a;->a:Ljava/nio/ByteBuffer;

    iget-object v3, p0, Lfc/d;->e:Landroid/media/MediaCodec$BufferInfo;

    invoke-interface {p1, v0, v1, v3}, Lzb/a;->c(Lvb/d;Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    return v2

    :cond_4
    :goto_0
    iget-object p1, p0, Lfc/d;->c:Lac/b$a;

    iget-object p1, p1, Lac/b$a;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    iget-object v3, p0, Lfc/d;->e:Landroid/media/MediaCodec$BufferInfo;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x4

    invoke-virtual/range {v3 .. v8}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    iget-object p1, p0, Lfc/d;->b:Lzb/a;

    iget-object v0, p0, Lfc/d;->d:Lvb/d;

    iget-object v1, p0, Lfc/d;->c:Lac/b$a;

    iget-object v1, v1, Lac/b$a;->a:Ljava/nio/ByteBuffer;

    iget-object v3, p0, Lfc/d;->e:Landroid/media/MediaCodec$BufferInfo;

    invoke-interface {p1, v0, v1, v3}, Lzb/a;->c(Lvb/d;Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    iput-boolean v2, p0, Lfc/d;->f:Z

    return v2
.end method

.method public release()V
    .locals 0

    return-void
.end method
