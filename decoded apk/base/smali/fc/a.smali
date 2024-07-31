.class public Lfc/a;
.super Lfc/b;
.source ""


# instance fields
.field public p:Lec/b;

.field public q:Ldc/a;

.field public r:Lyb/a;

.field public s:Lgc/c;

.field public t:Landroid/media/MediaCodec;

.field public u:Landroid/media/MediaFormat;


# direct methods
.method public constructor <init>(Lac/b;Lzb/a;Lec/b;Ldc/a;Lyb/a;)V
    .locals 1

    sget-object v0, Lvb/d;->i:Lvb/d;

    invoke-direct {p0, p1, p2, v0}, Lfc/b;-><init>(Lac/b;Lzb/a;Lvb/d;)V

    iput-object p3, p0, Lfc/a;->p:Lec/b;

    iput-object p4, p0, Lfc/a;->q:Ldc/a;

    iput-object p5, p0, Lfc/a;->r:Lyb/a;

    return-void
.end method


# virtual methods
.method public h(Landroid/media/MediaFormat;Landroid/media/MediaFormat;Landroid/media/MediaCodec;Landroid/media/MediaCodec;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lfc/b;->h(Landroid/media/MediaFormat;Landroid/media/MediaFormat;Landroid/media/MediaCodec;Landroid/media/MediaCodec;)V

    iput-object p4, p0, Lfc/a;->t:Landroid/media/MediaCodec;

    iput-object p2, p0, Lfc/a;->u:Landroid/media/MediaFormat;

    return-void
.end method

.method public k(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V
    .locals 9

    invoke-super {p0, p1, p2}, Lfc/b;->k(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V

    new-instance v8, Lgc/c;

    iget-object v3, p0, Lfc/a;->t:Landroid/media/MediaCodec;

    iget-object v4, p0, Lfc/a;->u:Landroid/media/MediaFormat;

    iget-object v5, p0, Lfc/a;->p:Lec/b;

    iget-object v6, p0, Lfc/a;->q:Ldc/a;

    iget-object v7, p0, Lfc/a;->r:Lyb/a;

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v7}, Lgc/c;-><init>(Landroid/media/MediaCodec;Landroid/media/MediaFormat;Landroid/media/MediaCodec;Landroid/media/MediaFormat;Lec/b;Ldc/a;Lyb/a;)V

    iput-object v8, p0, Lfc/a;->s:Lgc/c;

    const/4 p1, 0x0

    iput-object p1, p0, Lfc/a;->t:Landroid/media/MediaCodec;

    iput-object p1, p0, Lfc/a;->u:Landroid/media/MediaFormat;

    iput-object p1, p0, Lfc/a;->p:Lec/b;

    iput-object p1, p0, Lfc/a;->q:Ldc/a;

    iput-object p1, p0, Lfc/a;->r:Lyb/a;

    return-void
.end method

.method public l(Landroid/media/MediaCodec;ILjava/nio/ByteBuffer;JZ)V
    .locals 6

    iget-object v0, p0, Lfc/a;->s:Lgc/c;

    move v1, p2

    move-object v2, p3

    move-wide v3, p4

    move v5, p6

    invoke-virtual/range {v0 .. v5}, Lgc/c;->a(ILjava/nio/ByteBuffer;JZ)V

    return-void
.end method

.method public n(Landroid/media/MediaCodec;Lwb/f;J)Z
    .locals 0

    iget-object p1, p0, Lfc/a;->s:Lgc/c;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1, p2, p3, p4}, Lgc/c;->d(Lwb/f;J)Z

    move-result p1

    return p1
.end method
