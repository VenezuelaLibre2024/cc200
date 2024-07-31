.class public Lu3/e0;
.super Lj4/o;
.source ""

# interfaces
.implements Lp5/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu3/e0$b;,
        Lu3/e0$c;
    }
.end annotation


# instance fields
.field public final K0:Landroid/content/Context;

.field public final L0:Lu3/s$a;

.field public final M0:Lu3/t;

.field public N0:I

.field public O0:Z

.field public P0:Ls3/m1;

.field public Q0:Ls3/m1;

.field public R0:J

.field public S0:Z

.field public T0:Z

.field public U0:Z

.field public V0:Z

.field public W0:Ls3/i3$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lj4/l$b;Lj4/q;ZLandroid/os/Handler;Lu3/s;Lu3/t;)V
    .locals 6

    const/4 v1, 0x1

    const v5, 0x472c4400    # 44100.0f

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lj4/o;-><init>(ILj4/l$b;Lj4/q;ZF)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lu3/e0;->K0:Landroid/content/Context;

    iput-object p7, p0, Lu3/e0;->M0:Lu3/t;

    new-instance p1, Lu3/s$a;

    invoke-direct {p1, p5, p6}, Lu3/s$a;-><init>(Landroid/os/Handler;Lu3/s;)V

    iput-object p1, p0, Lu3/e0;->L0:Lu3/s$a;

    new-instance p1, Lu3/e0$c;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lu3/e0$c;-><init>(Lu3/e0;Lu3/e0$a;)V

    invoke-interface {p7, p1}, Lu3/t;->q(Lu3/t$c;)V

    return-void
.end method

.method public static synthetic A1(Lu3/e0;)Ls3/i3$a;
    .locals 0

    iget-object p0, p0, Lu3/e0;->W0:Ls3/i3$a;

    return-object p0
.end method

.method public static B1(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_1

    const-string v0, "OMX.SEC.aac.dec"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lp5/n0;->c:Ljava/lang/String;

    const-string v0, "samsung"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lp5/n0;->b:Ljava/lang/String;

    const-string v0, "zeroflte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "herolte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "heroqlte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static C1()Z
    .locals 2

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x17

    if-ne v0, v1, :cond_1

    sget-object v0, Lp5/n0;->d:Ljava/lang/String;

    const-string v1, "ZTE B2017G"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "AXON 7 mini"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static F1(Lj4/q;Ls3/m1;ZLu3/t;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj4/q;",
            "Ls3/m1;",
            "Z",
            "Lu3/t;",
            ")",
            "Ljava/util/List<",
            "Lj4/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p1, Ls3/m1;->s:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p3, p1}, Lu3/t;->a(Ls3/m1;)Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {}, Lj4/v;->v()Lj4/n;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-static {p3}, Li7/u;->v(Ljava/lang/Object;)Li7/u;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p3, 0x0

    invoke-interface {p0, v0, p2, p3}, Lj4/q;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Lj4/v;->m(Ls3/m1;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-static {v0}, Li7/u;->p(Ljava/util/Collection;)Li7/u;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-interface {p0, p1, p2, p3}, Lj4/q;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p0

    invoke-static {}, Li7/u;->n()Li7/u$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Li7/u$a;->j(Ljava/lang/Iterable;)Li7/u$a;

    move-result-object p1

    invoke-virtual {p1, p0}, Li7/u$a;->j(Ljava/lang/Iterable;)Li7/u$a;

    move-result-object p0

    invoke-virtual {p0}, Li7/u$a;->k()Li7/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z1(Lu3/e0;)Lu3/s$a;
    .locals 0

    iget-object p0, p0, Lu3/e0;->L0:Lu3/s$a;

    return-object p0
.end method


# virtual methods
.method public A0(FLs3/m1;[Ls3/m1;)F
    .locals 4

    array-length p2, p3

    const/4 v0, -0x1

    const/4 v1, 0x0

    move v2, v0

    :goto_0
    if-ge v1, p2, :cond_1

    aget-object v3, p3, v1

    iget v3, v3, Ls3/m1;->G:I

    if-eq v3, v0, :cond_0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-ne v2, v0, :cond_2

    const/high16 p1, -0x40800000    # -1.0f

    goto :goto_1

    :cond_2
    int-to-float p2, v2

    mul-float/2addr p1, p2

    :goto_1
    return p1
.end method

.method public C0(Lj4/q;Ls3/m1;Z)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj4/q;",
            "Ls3/m1;",
            "Z)",
            "Ljava/util/List<",
            "Lj4/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lu3/e0;->M0:Lu3/t;

    invoke-static {p1, p2, p3, v0}, Lu3/e0;->F1(Lj4/q;Ls3/m1;ZLu3/t;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1, p2}, Lj4/v;->u(Ljava/util/List;Ls3/m1;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final D1(Lj4/n;Ls3/m1;)I
    .locals 1

    iget-object p1, p1, Lj4/n;->a:Ljava/lang/String;

    const-string v0, "OMX.google.raw.decoder"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget p1, Lp5/n0;->a:I

    const/16 v0, 0x18

    if-ge p1, v0, :cond_1

    const/16 v0, 0x17

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lu3/e0;->K0:Landroid/content/Context;

    invoke-static {p1}, Lp5/n0;->w0(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, -0x1

    return p1

    :cond_1
    iget p1, p2, Ls3/m1;->t:I

    return p1
.end method

.method public E()Lp5/t;
    .locals 0

    return-object p0
.end method

.method public E0(Lj4/n;Ls3/m1;Landroid/media/MediaCrypto;F)Lj4/l$a;
    .locals 2

    invoke-virtual {p0}, Ls3/f;->N()[Ls3/m1;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lu3/e0;->E1(Lj4/n;Ls3/m1;[Ls3/m1;)I

    move-result v0

    iput v0, p0, Lu3/e0;->N0:I

    iget-object v0, p1, Lj4/n;->a:Ljava/lang/String;

    invoke-static {v0}, Lu3/e0;->B1(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lu3/e0;->O0:Z

    iget-object v0, p1, Lj4/n;->c:Ljava/lang/String;

    iget v1, p0, Lu3/e0;->N0:I

    invoke-virtual {p0, p2, v0, v1, p4}, Lu3/e0;->G1(Ls3/m1;Ljava/lang/String;IF)Landroid/media/MediaFormat;

    move-result-object p4

    iget-object v0, p1, Lj4/n;->b:Ljava/lang/String;

    const-string v1, "audio/raw"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p2, Ls3/m1;->s:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    move-object v0, p2

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lu3/e0;->Q0:Ls3/m1;

    invoke-static {p1, p4, p2, p3}, Lj4/l$a;->a(Lj4/n;Landroid/media/MediaFormat;Ls3/m1;Landroid/media/MediaCrypto;)Lj4/l$a;

    move-result-object p1

    return-object p1
.end method

.method public E1(Lj4/n;Ls3/m1;[Ls3/m1;)I
    .locals 5

    invoke-virtual {p0, p1, p2}, Lu3/e0;->D1(Lj4/n;Ls3/m1;)I

    move-result v0

    array-length v1, p3

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    return v0

    :cond_0
    array-length v1, p3

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p3, v2

    invoke-virtual {p1, p2, v3}, Lj4/n;->f(Ls3/m1;Ls3/m1;)Lv3/i;

    move-result-object v4

    iget v4, v4, Lv3/i;->d:I

    if-eqz v4, :cond_1

    invoke-virtual {p0, p1, v3}, Lu3/e0;->D1(Lj4/n;Ls3/m1;)I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public G1(Ls3/m1;Ljava/lang/String;IF)Landroid/media/MediaFormat;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    new-instance v0, Landroid/media/MediaFormat;

    invoke-direct {v0}, Landroid/media/MediaFormat;-><init>()V

    const-string v1, "mime"

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    iget p2, p1, Ls3/m1;->F:I

    const-string v1, "channel-count"

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget p2, p1, Ls3/m1;->G:I

    const-string v1, "sample-rate"

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget-object p2, p1, Ls3/m1;->u:Ljava/util/List;

    invoke-static {v0, p2}, Lp5/u;->e(Landroid/media/MediaFormat;Ljava/util/List;)V

    const-string p2, "max-input-size"

    invoke-static {v0, p2, p3}, Lp5/u;->d(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    sget p2, Lp5/n0;->a:I

    const/16 p3, 0x17

    if-lt p2, p3, :cond_0

    const/4 p3, 0x0

    const-string v1, "priority"

    invoke-virtual {v0, v1, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const/high16 p3, -0x40800000    # -1.0f

    cmpl-float p3, p4, p3

    if-eqz p3, :cond_0

    invoke-static {}, Lu3/e0;->C1()Z

    move-result p3

    if-nez p3, :cond_0

    const-string p3, "operating-rate"

    invoke-virtual {v0, p3, p4}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    :cond_0
    const/16 p3, 0x1c

    if-gt p2, p3, :cond_1

    iget-object p3, p1, Ls3/m1;->s:Ljava/lang/String;

    const-string p4, "audio/ac4"

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, 0x1

    const-string p4, "ac4-is-sync"

    invoke-virtual {v0, p4, p3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_1
    const/16 p3, 0x18

    if-lt p2, p3, :cond_2

    iget-object p3, p0, Lu3/e0;->M0:Lu3/t;

    iget p4, p1, Ls3/m1;->F:I

    iget p1, p1, Ls3/m1;->G:I

    const/4 v1, 0x4

    invoke-static {v1, p4, p1}, Lp5/n0;->c0(III)Ls3/m1;

    move-result-object p1

    invoke-interface {p3, p1}, Lu3/t;->s(Ls3/m1;)I

    move-result p1

    const/4 p3, 0x2

    if-ne p1, p3, :cond_2

    const-string p1, "pcm-encoding"

    invoke-virtual {v0, p1, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_2
    const/16 p1, 0x20

    if-lt p2, p1, :cond_3

    const/16 p1, 0x63

    const-string p2, "max-output-channel-count"

    invoke-virtual {v0, p2, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_3
    return-object v0
.end method

.method public H1()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu3/e0;->T0:Z

    return-void
.end method

.method public final I1()V
    .locals 4

    iget-object v0, p0, Lu3/e0;->M0:Lu3/t;

    invoke-virtual {p0}, Lu3/e0;->c()Z

    move-result v1

    invoke-interface {v0, v1}, Lu3/t;->m(Z)J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Lu3/e0;->T0:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lu3/e0;->R0:J

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :goto_0
    iput-wide v0, p0, Lu3/e0;->R0:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu3/e0;->T0:Z

    :cond_1
    return-void
.end method

.method public P()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu3/e0;->U0:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lu3/e0;->P0:Ls3/m1;

    :try_start_0
    iget-object v0, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {v0}, Lu3/t;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-super {p0}, Lj4/o;->P()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lu3/e0;->L0:Lu3/s$a;

    iget-object v1, p0, Lj4/o;->F0:Lv3/e;

    invoke-virtual {v0, v1}, Lu3/s$a;->o(Lv3/e;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lu3/e0;->L0:Lu3/s$a;

    iget-object v2, p0, Lj4/o;->F0:Lv3/e;

    invoke-virtual {v1, v2}, Lu3/s$a;->o(Lv3/e;)V

    throw v0

    :catchall_1
    move-exception v0

    :try_start_2
    invoke-super {p0}, Lj4/o;->P()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    iget-object v1, p0, Lu3/e0;->L0:Lu3/s$a;

    iget-object v2, p0, Lj4/o;->F0:Lv3/e;

    invoke-virtual {v1, v2}, Lu3/s$a;->o(Lv3/e;)V

    throw v0

    :catchall_2
    move-exception v0

    iget-object v1, p0, Lu3/e0;->L0:Lu3/s$a;

    iget-object v2, p0, Lj4/o;->F0:Lv3/e;

    invoke-virtual {v1, v2}, Lu3/s$a;->o(Lv3/e;)V

    throw v0
.end method

.method public Q(ZZ)V
    .locals 0

    invoke-super {p0, p1, p2}, Lj4/o;->Q(ZZ)V

    iget-object p1, p0, Lu3/e0;->L0:Lu3/s$a;

    iget-object p2, p0, Lj4/o;->F0:Lv3/e;

    invoke-virtual {p1, p2}, Lu3/s$a;->p(Lv3/e;)V

    invoke-virtual {p0}, Ls3/f;->J()Ls3/k3;

    move-result-object p1

    iget-boolean p1, p1, Ls3/k3;->a:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {p1}, Lu3/t;->r()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {p1}, Lu3/t;->n()V

    :goto_0
    iget-object p1, p0, Lu3/e0;->M0:Lu3/t;

    invoke-virtual {p0}, Ls3/f;->M()Lt3/s1;

    move-result-object p2

    invoke-interface {p1, p2}, Lu3/t;->b(Lt3/s1;)V

    return-void
.end method

.method public R(JZ)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lj4/o;->R(JZ)V

    iget-boolean p3, p0, Lu3/e0;->V0:Z

    if-eqz p3, :cond_0

    iget-object p3, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {p3}, Lu3/t;->w()V

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {p3}, Lu3/t;->flush()V

    :goto_0
    iput-wide p1, p0, Lu3/e0;->R0:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu3/e0;->S0:Z

    iput-boolean p1, p0, Lu3/e0;->T0:Z

    return-void
.end method

.method public R0(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "MediaCodecAudioRenderer"

    const-string v1, "Audio codec error"

    invoke-static {v0, v1, p1}, Lp5/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lu3/e0;->L0:Lu3/s$a;

    invoke-virtual {v0, p1}, Lu3/s$a;->k(Ljava/lang/Exception;)V

    return-void
.end method

.method public S()V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0}, Lj4/o;->S()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v1, p0, Lu3/e0;->U0:Z

    if-eqz v1, :cond_0

    iput-boolean v0, p0, Lu3/e0;->U0:Z

    iget-object v0, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {v0}, Lu3/t;->reset()V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    iget-boolean v2, p0, Lu3/e0;->U0:Z

    if-eqz v2, :cond_1

    iput-boolean v0, p0, Lu3/e0;->U0:Z

    iget-object v0, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {v0}, Lu3/t;->reset()V

    :cond_1
    throw v1
.end method

.method public S0(Ljava/lang/String;Lj4/l$a;JJ)V
    .locals 6

    iget-object v0, p0, Lu3/e0;->L0:Lu3/s$a;

    move-object v1, p1

    move-wide v2, p3

    move-wide v4, p5

    invoke-virtual/range {v0 .. v5}, Lu3/s$a;->m(Ljava/lang/String;JJ)V

    return-void
.end method

.method public T()V
    .locals 1

    invoke-super {p0}, Lj4/o;->T()V

    iget-object v0, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {v0}, Lu3/t;->t()V

    return-void
.end method

.method public T0(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lu3/e0;->L0:Lu3/s$a;

    invoke-virtual {v0, p1}, Lu3/s$a;->n(Ljava/lang/String;)V

    return-void
.end method

.method public U()V
    .locals 1

    invoke-virtual {p0}, Lu3/e0;->I1()V

    iget-object v0, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {v0}, Lu3/t;->pause()V

    invoke-super {p0}, Lj4/o;->U()V

    return-void
.end method

.method public U0(Ls3/n1;)Lv3/i;
    .locals 2

    iget-object v0, p1, Ls3/n1;->b:Ls3/m1;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/m1;

    iput-object v0, p0, Lu3/e0;->P0:Ls3/m1;

    invoke-super {p0, p1}, Lj4/o;->U0(Ls3/n1;)Lv3/i;

    move-result-object p1

    iget-object v0, p0, Lu3/e0;->L0:Lu3/s$a;

    iget-object v1, p0, Lu3/e0;->P0:Ls3/m1;

    invoke-virtual {v0, v1, p1}, Lu3/s$a;->q(Ls3/m1;Lv3/i;)V

    return-object p1
.end method

.method public V0(Ls3/m1;Landroid/media/MediaFormat;)V
    .locals 5

    iget-object v0, p0, Lu3/e0;->Q0:Ls3/m1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move-object p1, v0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p0}, Lj4/o;->x0()Lj4/l;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    iget-object v0, p1, Ls3/m1;->s:Ljava/lang/String;

    const-string v3, "audio/raw"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p1, Ls3/m1;->H:I

    goto :goto_0

    :cond_2
    sget v0, Lp5/n0;->a:I

    const/16 v4, 0x18

    if-lt v0, v4, :cond_3

    const-string v0, "pcm-encoding"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "v-bits-per-sample"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lp5/n0;->b0(I)I

    move-result v0

    goto :goto_0

    :cond_4
    const/4 v0, 0x2

    :goto_0
    new-instance v4, Ls3/m1$b;

    invoke-direct {v4}, Ls3/m1$b;-><init>()V

    invoke-virtual {v4, v3}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v3

    invoke-virtual {v3, v0}, Ls3/m1$b;->a0(I)Ls3/m1$b;

    move-result-object v0

    iget v3, p1, Ls3/m1;->I:I

    invoke-virtual {v0, v3}, Ls3/m1$b;->P(I)Ls3/m1$b;

    move-result-object v0

    iget v3, p1, Ls3/m1;->J:I

    invoke-virtual {v0, v3}, Ls3/m1$b;->Q(I)Ls3/m1$b;

    move-result-object v0

    const-string v3, "channel-count"

    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v3}, Ls3/m1$b;->J(I)Ls3/m1$b;

    move-result-object v0

    const-string v3, "sample-rate"

    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {v0, p2}, Ls3/m1$b;->h0(I)Ls3/m1$b;

    move-result-object p2

    invoke-virtual {p2}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object p2

    iget-boolean v0, p0, Lu3/e0;->O0:Z

    if-eqz v0, :cond_5

    iget v0, p2, Ls3/m1;->F:I

    const/4 v3, 0x6

    if-ne v0, v3, :cond_5

    iget v0, p1, Ls3/m1;->F:I

    if-ge v0, v3, :cond_5

    new-array v2, v0, [I

    move v0, v1

    :goto_1
    iget v3, p1, Ls3/m1;->F:I

    if-ge v0, v3, :cond_5

    aput v0, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    move-object p1, p2

    :goto_2
    :try_start_0
    iget-object p2, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {p2, p1, v1, v2}, Lu3/t;->v(Ls3/m1;I[I)V
    :try_end_0
    .catch Lu3/t$a; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p1, Lu3/t$a;->h:Ls3/m1;

    const/16 v0, 0x1389

    invoke-virtual {p0, p1, p2, v0}, Ls3/f;->H(Ljava/lang/Throwable;Ls3/m1;I)Ls3/q;

    move-result-object p1

    throw p1
.end method

.method public W0(J)V
    .locals 1

    iget-object v0, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {v0, p1, p2}, Lu3/t;->o(J)V

    return-void
.end method

.method public Y0()V
    .locals 1

    invoke-super {p0}, Lj4/o;->Y0()V

    iget-object v0, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {v0}, Lu3/t;->p()V

    return-void
.end method

.method public Z0(Lv3/g;)V
    .locals 4

    iget-boolean v0, p0, Lu3/e0;->S0:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lv3/a;->p()Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v0, p1, Lv3/g;->l:J

    iget-wide v2, p0, Lu3/e0;->R0:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0x7a120

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p1, Lv3/g;->l:J

    iput-wide v0, p0, Lu3/e0;->R0:J

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lu3/e0;->S0:Z

    :cond_1
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "MediaCodecAudioRenderer"

    return-object v0
.end method

.method public b0(Lj4/n;Ls3/m1;Ls3/m1;)Lv3/i;
    .locals 8

    invoke-virtual {p1, p2, p3}, Lj4/n;->f(Ls3/m1;Ls3/m1;)Lv3/i;

    move-result-object v0

    iget v1, v0, Lv3/i;->e:I

    invoke-virtual {p0, p1, p3}, Lu3/e0;->D1(Lj4/n;Ls3/m1;)I

    move-result v2

    iget v3, p0, Lu3/e0;->N0:I

    if-le v2, v3, :cond_0

    or-int/lit8 v1, v1, 0x40

    :cond_0
    move v7, v1

    new-instance v1, Lv3/i;

    iget-object v3, p1, Lj4/n;->a:Ljava/lang/String;

    if-eqz v7, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    iget p1, v0, Lv3/i;->d:I

    :goto_0
    move v6, p1

    move-object v2, v1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v2 .. v7}, Lv3/i;-><init>(Ljava/lang/String;Ls3/m1;Ls3/m1;II)V

    return-object v1
.end method

.method public b1(JJLj4/l;Ljava/nio/ByteBuffer;IIIJZZLs3/m1;)Z
    .locals 0

    invoke-static {p6}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lu3/e0;->Q0:Ls3/m1;

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_0

    invoke-static {p5}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj4/l;

    invoke-interface {p1, p7, p3}, Lj4/l;->h(IZ)V

    return p2

    :cond_0
    if-eqz p12, :cond_2

    if-eqz p5, :cond_1

    invoke-interface {p5, p7, p3}, Lj4/l;->h(IZ)V

    :cond_1
    iget-object p1, p0, Lj4/o;->F0:Lv3/e;

    iget p3, p1, Lv3/e;->f:I

    add-int/2addr p3, p9

    iput p3, p1, Lv3/e;->f:I

    iget-object p1, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {p1}, Lu3/t;->p()V

    return p2

    :cond_2
    :try_start_0
    iget-object p1, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {p1, p6, p10, p11, p9}, Lu3/t;->u(Ljava/nio/ByteBuffer;JI)Z

    move-result p1
    :try_end_0
    .catch Lu3/t$b; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lu3/t$e; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_4

    if-eqz p5, :cond_3

    invoke-interface {p5, p7, p3}, Lj4/l;->h(IZ)V

    :cond_3
    iget-object p1, p0, Lj4/o;->F0:Lv3/e;

    iget p3, p1, Lv3/e;->e:I

    add-int/2addr p3, p9

    iput p3, p1, Lv3/e;->e:I

    return p2

    :cond_4
    return p3

    :catch_0
    move-exception p1

    iget-boolean p2, p1, Lu3/t$e;->i:Z

    const/16 p3, 0x138a

    invoke-virtual {p0, p1, p14, p2, p3}, Ls3/f;->I(Ljava/lang/Throwable;Ls3/m1;ZI)Ls3/q;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    iget-object p2, p0, Lu3/e0;->P0:Ls3/m1;

    iget-boolean p3, p1, Lu3/t$b;->i:Z

    const/16 p4, 0x1389

    invoke-virtual {p0, p1, p2, p3, p4}, Ls3/f;->I(Ljava/lang/Throwable;Ls3/m1;ZI)Ls3/q;

    move-result-object p1

    throw p1
.end method

.method public c()Z
    .locals 1

    invoke-super {p0}, Lj4/o;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {v0}, Lu3/t;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d(Ls3/a3;)V
    .locals 1

    iget-object v0, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {v0, p1}, Lu3/t;->d(Ls3/a3;)V

    return-void
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {v0}, Lu3/t;->k()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0}, Lj4/o;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public g1()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {v0}, Lu3/t;->j()V
    :try_end_0
    .catch Lu3/t$e; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, v0, Lu3/t$e;->j:Ls3/m1;

    iget-boolean v2, v0, Lu3/t$e;->i:Z

    const/16 v3, 0x138a

    invoke-virtual {p0, v0, v1, v2, v3}, Ls3/f;->I(Ljava/lang/Throwable;Ls3/m1;ZI)Ls3/q;

    move-result-object v0

    throw v0
.end method

.method public h()Ls3/a3;
    .locals 1

    iget-object v0, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {v0}, Lu3/t;->h()Ls3/a3;

    move-result-object v0

    return-object v0
.end method

.method public s()J
    .locals 2

    invoke-virtual {p0}, Ls3/f;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lu3/e0;->I1()V

    :cond_0
    iget-wide v0, p0, Lu3/e0;->R0:J

    return-wide v0
.end method

.method public t1(Ls3/m1;)Z
    .locals 1

    iget-object v0, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {v0, p1}, Lu3/t;->a(Ls3/m1;)Z

    move-result p1

    return p1
.end method

.method public u1(Lj4/q;Ls3/m1;)I
    .locals 10

    iget-object v0, p2, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {v0}, Lp5/v;->o(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Ls3/j3;->v(I)I

    move-result p1

    return p1

    :cond_0
    sget v0, Lp5/n0;->a:I

    const/16 v2, 0x15

    if-lt v0, v2, :cond_1

    const/16 v0, 0x20

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    iget v2, p2, Ls3/m1;->N:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    invoke-static {p2}, Lj4/o;->v1(Ls3/m1;)Z

    move-result v4

    const/16 v5, 0x8

    const/4 v6, 0x4

    if-eqz v4, :cond_4

    iget-object v7, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {v7, p2}, Lu3/t;->a(Ls3/m1;)Z

    move-result v7

    if-eqz v7, :cond_4

    if-eqz v2, :cond_3

    invoke-static {}, Lj4/v;->v()Lj4/n;

    move-result-object v2

    if-eqz v2, :cond_4

    :cond_3
    invoke-static {v6, v5, v0}, Ls3/j3;->r(III)I

    move-result p1

    return p1

    :cond_4
    iget-object v2, p2, Ls3/m1;->s:Ljava/lang/String;

    const-string v7, "audio/raw"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {v2, p2}, Lu3/t;->a(Ls3/m1;)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-static {v3}, Ls3/j3;->v(I)I

    move-result p1

    return p1

    :cond_5
    iget-object v2, p0, Lu3/e0;->M0:Lu3/t;

    iget v7, p2, Ls3/m1;->F:I

    iget v8, p2, Ls3/m1;->G:I

    const/4 v9, 0x2

    invoke-static {v9, v7, v8}, Lp5/n0;->c0(III)Ls3/m1;

    move-result-object v7

    invoke-interface {v2, v7}, Lu3/t;->a(Ls3/m1;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-static {v3}, Ls3/j3;->v(I)I

    move-result p1

    return p1

    :cond_6
    iget-object v2, p0, Lu3/e0;->M0:Lu3/t;

    invoke-static {p1, p2, v1, v2}, Lu3/e0;->F1(Lj4/q;Ls3/m1;ZLu3/t;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {v3}, Ls3/j3;->v(I)I

    move-result p1

    return p1

    :cond_7
    if-nez v4, :cond_8

    invoke-static {v9}, Ls3/j3;->v(I)I

    move-result p1

    return p1

    :cond_8
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj4/n;

    invoke-virtual {v2, p2}, Lj4/n;->o(Ls3/m1;)Z

    move-result v4

    if-nez v4, :cond_a

    move v7, v3

    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_a

    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lj4/n;

    invoke-virtual {v8, p2}, Lj4/n;->o(Ls3/m1;)Z

    move-result v9

    if-eqz v9, :cond_9

    move p1, v1

    move-object v2, v8

    goto :goto_3

    :cond_9
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_a
    move p1, v3

    move v3, v4

    :goto_3
    if-eqz v3, :cond_b

    goto :goto_4

    :cond_b
    const/4 v6, 0x3

    :goto_4
    if-eqz v3, :cond_c

    invoke-virtual {v2, p2}, Lj4/n;->r(Ls3/m1;)Z

    move-result p2

    if-eqz p2, :cond_c

    const/16 v5, 0x10

    :cond_c
    iget-boolean p2, v2, Lj4/n;->h:Z

    if-eqz p2, :cond_d

    const/16 p2, 0x40

    goto :goto_5

    :cond_d
    move p2, v1

    :goto_5
    if-eqz p1, :cond_e

    const/16 v1, 0x80

    :cond_e
    invoke-static {v6, v5, v0, p2, v1}, Ls3/j3;->n(IIIII)I

    move-result p1

    return p1
.end method

.method public y(ILjava/lang/Object;)V
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    invoke-super {p0, p1, p2}, Ls3/f;->y(ILjava/lang/Object;)V

    goto :goto_0

    :pswitch_0
    sget p1, Lp5/n0;->a:I

    const/16 v0, 0x17

    if-lt p1, v0, :cond_3

    iget-object p1, p0, Lu3/e0;->M0:Lu3/t;

    invoke-static {p1, p2}, Lu3/e0$b;->a(Lu3/t;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    check-cast p2, Ls3/i3$a;

    iput-object p2, p0, Lu3/e0;->W0:Ls3/i3$a;

    goto :goto_0

    :pswitch_2
    iget-object p1, p0, Lu3/e0;->M0:Lu3/t;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, p2}, Lu3/t;->l(I)V

    goto :goto_0

    :pswitch_3
    iget-object p1, p0, Lu3/e0;->M0:Lu3/t;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, p2}, Lu3/t;->x(Z)V

    goto :goto_0

    :cond_0
    check-cast p2, Lu3/w;

    iget-object p1, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {p1, p2}, Lu3/t;->g(Lu3/w;)V

    goto :goto_0

    :cond_1
    check-cast p2, Lu3/e;

    iget-object p1, p0, Lu3/e0;->M0:Lu3/t;

    invoke-interface {p1, p2}, Lu3/t;->i(Lu3/e;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lu3/e0;->M0:Lu3/t;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p1, p2}, Lu3/t;->e(F)V

    :cond_3
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
