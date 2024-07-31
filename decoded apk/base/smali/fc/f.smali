.class public Lfc/f;
.super Lfc/b;
.source ""


# static fields
.field public static final w:Lwb/e;


# instance fields
.field public p:Lgc/d;

.field public q:Lgc/e;

.field public r:Landroid/media/MediaCodec;

.field public s:Lgc/f;

.field public final t:Lec/b;

.field public final u:I

.field public final v:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lfc/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lwb/e;

    invoke-direct {v1, v0}, Lwb/e;-><init>(Ljava/lang/String;)V

    sput-object v1, Lfc/f;->w:Lwb/e;

    return-void
.end method

.method public constructor <init>(Lac/b;Lzb/a;Lec/b;I)V
    .locals 1

    sget-object v0, Lvb/d;->h:Lvb/d;

    invoke-direct {p0, p1, p2, v0}, Lfc/b;-><init>(Lac/b;Lzb/a;Lvb/d;)V

    iput-object p3, p0, Lfc/f;->t:Lec/b;

    invoke-interface {p1}, Lac/b;->getOrientation()I

    move-result p1

    iput p1, p0, Lfc/f;->u:I

    iput p4, p0, Lfc/f;->v:I

    return-void
.end method


# virtual methods
.method public h(Landroid/media/MediaFormat;Landroid/media/MediaFormat;Landroid/media/MediaCodec;Landroid/media/MediaCodec;)V
    .locals 2

    invoke-super {p0, p1, p2, p3, p4}, Lfc/b;->h(Landroid/media/MediaFormat;Landroid/media/MediaFormat;Landroid/media/MediaCodec;Landroid/media/MediaCodec;)V

    const-string p3, "frame-rate"

    invoke-virtual {p1, p3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, p3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p3

    invoke-static {v0, p3}, Lgc/f;->b(II)Lgc/f;

    move-result-object p3

    iput-object p3, p0, Lfc/f;->s:Lgc/f;

    iput-object p4, p0, Lfc/f;->r:Landroid/media/MediaCodec;

    iget p3, p0, Lfc/f;->u:I

    iget p4, p0, Lfc/f;->v:I

    add-int/2addr p3, p4

    rem-int/lit16 p3, p3, 0x168

    rem-int/lit16 p3, p3, 0xb4

    if-eqz p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    const-string p4, "width"

    invoke-virtual {p1, p4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    const-string v1, "height"

    invoke-virtual {p1, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v0, p1

    if-eqz p3, :cond_1

    invoke-virtual {p2, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p1

    goto :goto_1

    :cond_1
    invoke-virtual {p2, p4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p1

    :goto_1
    int-to-float p1, p1

    if-eqz p3, :cond_2

    invoke-virtual {p2, p4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p2

    goto :goto_2

    :cond_2
    invoke-virtual {p2, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p2

    :goto_2
    int-to-float p2, p2

    div-float/2addr p1, p2

    cmpl-float p2, v0, p1

    const/high16 p3, 0x3f800000    # 1.0f

    if-lez p2, :cond_3

    div-float/2addr v0, p1

    move p1, p3

    move p3, v0

    goto :goto_3

    :cond_3
    cmpg-float p2, v0, p1

    if-gez p2, :cond_4

    div-float/2addr p1, v0

    goto :goto_3

    :cond_4
    move p1, p3

    :goto_3
    iget-object p2, p0, Lfc/f;->p:Lgc/d;

    invoke-virtual {p2, p3, p1}, Lgc/d;->k(FF)V

    return-void
.end method

.method public i(Landroid/media/MediaFormat;Landroid/media/MediaCodec;)V
    .locals 4

    const-string v0, "rotation-degrees"

    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iget v3, p0, Lfc/f;->u:I

    if-ne v1, v3, :cond_1

    invoke-virtual {p1, v0, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    new-instance v0, Lgc/d;

    invoke-direct {v0}, Lgc/d;-><init>()V

    iput-object v0, p0, Lfc/f;->p:Lgc/d;

    iget v1, p0, Lfc/f;->u:I

    iget v3, p0, Lfc/f;->v:I

    add-int/2addr v1, v3

    rem-int/lit16 v1, v1, 0x168

    invoke-virtual {v0, v1}, Lgc/d;->j(I)V

    iget-object v0, p0, Lfc/f;->p:Lgc/d;

    invoke-virtual {v0}, Lgc/d;->h()Landroid/view/Surface;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v0, v1, v2}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unexpected difference in rotation. DataSource:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lfc/f;->u:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " MediaFormat:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j(Landroid/media/MediaFormat;Landroid/media/MediaCodec;)V
    .locals 6

    const-string v0, "width"

    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    const-string v2, "height"

    invoke-virtual {p1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v3

    iget v4, p0, Lfc/f;->v:I

    rem-int/lit16 v4, v4, 0xb4

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    move v5, v3

    goto :goto_1

    :cond_1
    move v5, v1

    :goto_1
    invoke-virtual {p1, v0, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    move v1, v3

    :goto_2
    invoke-virtual {p1, v2, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    invoke-super {p0, p1, p2}, Lfc/b;->j(Landroid/media/MediaFormat;Landroid/media/MediaCodec;)V

    return-void
.end method

.method public l(Landroid/media/MediaCodec;ILjava/nio/ByteBuffer;JZ)V
    .locals 1

    const/4 p3, 0x0

    if-eqz p6, :cond_1

    iget-object p4, p0, Lfc/f;->r:Landroid/media/MediaCodec;

    invoke-virtual {p4}, Landroid/media/MediaCodec;->signalEndOfInputStream()V

    :cond_0
    invoke-virtual {p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    goto :goto_0

    :cond_1
    iget-object p6, p0, Lfc/f;->t:Lec/b;

    sget-object v0, Lvb/d;->h:Lvb/d;

    invoke-interface {p6, v0, p4, p5}, Lec/b;->a(Lvb/d;J)J

    move-result-wide p4

    iget-object p6, p0, Lfc/f;->s:Lgc/f;

    invoke-virtual {p6, p4, p5}, Lgc/f;->c(J)Z

    move-result p6

    if-eqz p6, :cond_0

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    iget-object p1, p0, Lfc/f;->p:Lgc/d;

    invoke-virtual {p1}, Lgc/d;->f()V

    iget-object p1, p0, Lfc/f;->q:Lgc/e;

    invoke-virtual {p1, p4, p5}, Lgc/e;->a(J)V

    :goto_0
    return-void
.end method

.method public n(Landroid/media/MediaCodec;Lwb/f;J)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public p(Landroid/media/MediaFormat;Landroid/media/MediaCodec;)V
    .locals 2

    new-instance v0, Lgc/e;

    invoke-virtual {p2}, Landroid/media/MediaCodec;->createInputSurface()Landroid/view/Surface;

    move-result-object v1

    invoke-direct {v0, v1}, Lgc/e;-><init>(Landroid/view/Surface;)V

    iput-object v0, p0, Lfc/f;->q:Lgc/e;

    invoke-super {p0, p1, p2}, Lfc/b;->p(Landroid/media/MediaFormat;Landroid/media/MediaCodec;)V

    return-void
.end method

.method public release()V
    .locals 2

    iget-object v0, p0, Lfc/f;->p:Lgc/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lgc/d;->i()V

    iput-object v1, p0, Lfc/f;->p:Lgc/d;

    :cond_0
    iget-object v0, p0, Lfc/f;->q:Lgc/e;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lgc/e;->b()V

    iput-object v1, p0, Lfc/f;->q:Lgc/e;

    :cond_1
    invoke-super {p0}, Lfc/b;->release()V

    iput-object v1, p0, Lfc/f;->r:Landroid/media/MediaCodec;

    return-void
.end method
