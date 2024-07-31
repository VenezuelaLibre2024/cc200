.class public final Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;
.super Lu4/a;
.source ""

# interfaces
.implements La5/l$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;
    }
.end annotation


# instance fields
.field public A:Ls3/u1$g;

.field public B:Lo5/m0;

.field public final o:Lz4/h;

.field public final p:Ls3/u1$h;

.field public final q:Lz4/g;

.field public final r:Lu4/h;

.field public final s:Lw3/v;

.field public final t:Lo5/d0;

.field public final u:Z

.field public final v:I

.field public final w:Z

.field public final x:La5/l;

.field public final y:J

.field public final z:Ls3/u1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.hls"

    invoke-static {v0}, Ls3/j1;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ls3/u1;Lz4/g;Lz4/h;Lu4/h;Lw3/v;Lo5/d0;La5/l;JZIZ)V
    .locals 1

    invoke-direct {p0}, Lu4/a;-><init>()V

    iget-object v0, p1, Ls3/u1;->i:Ls3/u1$h;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/u1$h;

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->p:Ls3/u1$h;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:Ls3/u1;

    iget-object p1, p1, Ls3/u1;->k:Ls3/u1$g;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:Ls3/u1$g;

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->q:Lz4/g;

    iput-object p3, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->o:Lz4/h;

    iput-object p4, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->r:Lu4/h;

    iput-object p5, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:Lw3/v;

    iput-object p6, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->t:Lo5/d0;

    iput-object p7, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x:La5/l;

    iput-wide p8, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:J

    iput-boolean p10, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->u:Z

    iput p11, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->v:I

    iput-boolean p12, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->w:Z

    return-void
.end method

.method public synthetic constructor <init>(Ls3/u1;Lz4/g;Lz4/h;Lu4/h;Lw3/v;Lo5/d0;La5/l;JZIZLcom/google/android/exoplayer2/source/hls/HlsMediaSource$a;)V
    .locals 0

    invoke-direct/range {p0 .. p12}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;-><init>(Ls3/u1;Lz4/g;Lz4/h;Lu4/h;Lw3/v;Lo5/d0;La5/l;JZIZ)V

    return-void
.end method

.method public static H(Ljava/util/List;J)La5/g$b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La5/g$b;",
            ">;J)",
            "La5/g$b;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La5/g$b;

    iget-wide v3, v2, La5/g$e;->l:J

    cmp-long v5, v3, p1

    if-gtz v5, :cond_0

    iget-boolean v5, v2, La5/g$b;->s:Z

    if-eqz v5, :cond_0

    move-object v0, v2

    goto :goto_1

    :cond_0
    cmp-long v2, v3, p1

    if-lez v2, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-object v0
.end method

.method public static I(Ljava/util/List;J)La5/g$d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La5/g$d;",
            ">;J)",
            "La5/g$d;"
        }
    .end annotation

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p0, p1, p2, p2}, Lp5/n0;->f(Ljava/util/List;Ljava/lang/Comparable;ZZ)I

    move-result p1

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La5/g$d;

    return-object p0
.end method

.method public static L(La5/g;J)J
    .locals 7

    iget-object v0, p0, La5/g;->v:La5/g$f;

    iget-wide v1, p0, La5/g;->e:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    iget-wide v3, p0, La5/g;->u:J

    sub-long/2addr v3, v1

    goto :goto_0

    :cond_0
    iget-wide v1, v0, La5/g$f;->d:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    iget-wide v5, p0, La5/g;->n:J

    cmp-long v5, v5, v3

    if-eqz v5, :cond_1

    move-wide v3, v1

    goto :goto_0

    :cond_1
    iget-wide v0, v0, La5/g$f;->c:J

    cmp-long v2, v0, v3

    if-eqz v2, :cond_2

    move-wide v3, v0

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x3

    iget-wide v2, p0, La5/g;->m:J

    mul-long v3, v2, v0

    :goto_0
    add-long/2addr v3, p1

    return-wide v3
.end method


# virtual methods
.method public C(Lo5/m0;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lo5/m0;

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:Lw3/v;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Looper;

    invoke-virtual {p0}, Lu4/a;->A()Lt3/s1;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lw3/v;->d(Landroid/os/Looper;Lt3/s1;)V

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:Lw3/v;

    invoke-interface {p1}, Lw3/v;->a()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lu4/a;->w(Lu4/t$b;)Lu4/a0$a;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x:La5/l;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->p:Ls3/u1$h;

    iget-object v1, v1, Ls3/u1$h;->a:Landroid/net/Uri;

    invoke-interface {v0, v1, p1, p0}, La5/l;->l(Landroid/net/Uri;Lu4/a0$a;La5/l$e;)V

    return-void
.end method

.method public E()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x:La5/l;

    invoke-interface {v0}, La5/l;->stop()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:Lw3/v;

    invoke-interface {v0}, Lw3/v;->release()V

    return-void
.end method

.method public final F(La5/g;JJLz4/i;)Lu4/p0;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-wide v2, v1, La5/g;->h:J

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x:La5/l;

    invoke-interface {v4}, La5/l;->d()J

    move-result-wide v4

    sub-long v17, v2, v4

    iget-boolean v2, v1, La5/g;->o:Z

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_0

    iget-wide v5, v1, La5/g;->u:J

    add-long v5, v17, v5

    move-wide v13, v5

    goto :goto_0

    :cond_0
    move-wide v13, v3

    :goto_0
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->J(La5/g;)J

    move-result-wide v11

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:Ls3/u1$g;

    iget-wide v5, v2, Ls3/u1$g;->h:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_1

    invoke-static {v5, v6}, Lp5/n0;->B0(J)J

    move-result-wide v2

    goto :goto_1

    :cond_1
    invoke-static {v1, v11, v12}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->L(La5/g;J)J

    move-result-wide v2

    :goto_1
    move-wide v5, v2

    iget-wide v2, v1, La5/g;->u:J

    add-long v9, v2, v11

    move-wide v7, v11

    invoke-static/range {v5 .. v10}, Lp5/n0;->r(JJJ)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->M(La5/g;J)V

    invoke-virtual {v0, v1, v11, v12}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->K(La5/g;J)J

    move-result-wide v19

    iget v2, v1, La5/g;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ne v2, v3, :cond_2

    iget-boolean v2, v1, La5/g;->f:Z

    if-eqz v2, :cond_2

    move/from16 v23, v4

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    move/from16 v23, v2

    :goto_2
    new-instance v2, Lu4/p0;

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    iget-wide v9, v1, La5/g;->u:J

    const/16 v21, 0x1

    iget-boolean v1, v1, La5/g;->o:Z

    xor-int/lit8 v22, v1, 0x1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:Ls3/u1;

    move-object/from16 v25, v1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:Ls3/u1$g;

    move-object/from16 v26, v1

    move-object v6, v2

    move-wide/from16 v7, p2

    move-wide v3, v9

    move-wide/from16 v9, p4

    move-wide v15, v3

    move-object/from16 v24, p6

    invoke-direct/range {v6 .. v26}, Lu4/p0;-><init>(JJJJJJJZZZLjava/lang/Object;Ls3/u1;Ls3/u1$g;)V

    return-object v2
.end method

.method public final G(La5/g;JJLz4/i;)Lu4/p0;
    .locals 24

    move-object/from16 v0, p1

    iget-wide v1, v0, La5/g;->e:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    if-eqz v1, :cond_3

    iget-object v1, v0, La5/g;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v1, v0, La5/g;->g:Z

    if-nez v1, :cond_2

    iget-wide v1, v0, La5/g;->e:J

    iget-wide v3, v0, La5/g;->u:J

    cmp-long v3, v1, v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v3, v0, La5/g;->r:Ljava/util/List;

    invoke-static {v3, v1, v2}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->I(Ljava/util/List;J)La5/g$d;

    move-result-object v1

    iget-wide v1, v1, La5/g$e;->l:J

    goto :goto_2

    :cond_2
    :goto_0
    iget-wide v1, v0, La5/g;->e:J

    goto :goto_2

    :cond_3
    :goto_1
    const-wide/16 v1, 0x0

    :goto_2
    move-wide/from16 v16, v1

    new-instance v1, Lu4/p0;

    move-object v3, v1

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    iget-wide v10, v0, La5/g;->u:J

    move-wide v12, v10

    const-wide/16 v14, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:Ls3/u1;

    move-object/from16 v22, v2

    const/16 v23, 0x0

    move-wide/from16 v4, p2

    move-wide/from16 v6, p4

    move-object/from16 v21, p6

    invoke-direct/range {v3 .. v23}, Lu4/p0;-><init>(JJJJJJJZZZLjava/lang/Object;Ls3/u1;Ls3/u1$g;)V

    return-object v1
.end method

.method public final J(La5/g;)J
    .locals 4

    iget-boolean v0, p1, La5/g;->p:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:J

    invoke-static {v0, v1}, Lp5/n0;->a0(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lp5/n0;->B0(J)J

    move-result-wide v0

    invoke-virtual {p1}, La5/g;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public final K(La5/g;J)J
    .locals 4

    iget-wide v0, p1, La5/g;->e:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p1, La5/g;->u:J

    add-long/2addr v0, p2

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:Ls3/u1$g;

    iget-wide p2, p2, Ls3/u1$g;->h:J

    invoke-static {p2, p3}, Lp5/n0;->B0(J)J

    move-result-wide p2

    sub-long/2addr v0, p2

    :goto_0
    iget-boolean p2, p1, La5/g;->g:Z

    if-eqz p2, :cond_1

    return-wide v0

    :cond_1
    iget-object p2, p1, La5/g;->s:Ljava/util/List;

    invoke-static {p2, v0, v1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->H(Ljava/util/List;J)La5/g$b;

    move-result-object p2

    if-eqz p2, :cond_2

    iget-wide p1, p2, La5/g$e;->l:J

    return-wide p1

    :cond_2
    iget-object p2, p1, La5/g;->r:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_3
    iget-object p1, p1, La5/g;->r:Ljava/util/List;

    invoke-static {p1, v0, v1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->I(Ljava/util/List;J)La5/g$d;

    move-result-object p1

    iget-object p2, p1, La5/g$d;->t:Ljava/util/List;

    invoke-static {p2, v0, v1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->H(Ljava/util/List;J)La5/g$b;

    move-result-object p2

    if-eqz p2, :cond_4

    iget-wide p1, p2, La5/g$e;->l:J

    return-wide p1

    :cond_4
    iget-wide p1, p1, La5/g$e;->l:J

    return-wide p1
.end method

.method public final M(La5/g;J)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:Ls3/u1;

    iget-object v0, v0, Ls3/u1;->k:Ls3/u1$g;

    iget v1, v0, Ls3/u1$g;->k:F

    const v2, -0x800001

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    iget v0, v0, Ls3/u1$g;->l:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_0

    iget-object p1, p1, La5/g;->v:La5/g$f;

    iget-wide v0, p1, La5/g$f;->c:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p1, La5/g$f;->d:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    new-instance v0, Ls3/u1$g$a;

    invoke-direct {v0}, Ls3/u1$g$a;-><init>()V

    invoke-static {p2, p3}, Lp5/n0;->Y0(J)J

    move-result-wide p2

    invoke-virtual {v0, p2, p3}, Ls3/u1$g$a;->k(J)Ls3/u1$g$a;

    move-result-object p2

    const/high16 p3, 0x3f800000    # 1.0f

    if-eqz p1, :cond_1

    move v0, p3

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:Ls3/u1$g;

    iget v0, v0, Ls3/u1$g;->k:F

    :goto_1
    invoke-virtual {p2, v0}, Ls3/u1$g$a;->j(F)Ls3/u1$g$a;

    move-result-object p2

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:Ls3/u1$g;

    iget p3, p1, Ls3/u1$g;->l:F

    :goto_2
    invoke-virtual {p2, p3}, Ls3/u1$g$a;->h(F)Ls3/u1$g$a;

    move-result-object p1

    invoke-virtual {p1}, Ls3/u1$g$a;->f()Ls3/u1$g;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:Ls3/u1$g;

    return-void
.end method

.method public a(Lu4/r;)V
    .locals 0

    check-cast p1, Lz4/l;

    invoke-virtual {p1}, Lz4/l;->A()V

    return-void
.end method

.method public b(Lu4/t$b;Lo5/b;J)Lu4/r;
    .locals 17

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p1}, Lu4/a;->w(Lu4/t$b;)Lu4/a0$a;

    move-result-object v9

    invoke-virtual/range {p0 .. p1}, Lu4/a;->u(Lu4/t$b;)Lw3/u$a;

    move-result-object v7

    new-instance v16, Lz4/l;

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->o:Lz4/h;

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x:La5/l;

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->q:Lz4/g;

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lo5/m0;

    iget-object v6, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:Lw3/v;

    iget-object v8, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->t:Lo5/d0;

    iget-object v11, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->r:Lu4/h;

    iget-boolean v12, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->u:Z

    iget v13, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->v:I

    iget-boolean v14, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->w:Z

    invoke-virtual/range {p0 .. p0}, Lu4/a;->A()Lt3/s1;

    move-result-object v15

    move-object/from16 v1, v16

    move-object/from16 v10, p2

    invoke-direct/range {v1 .. v15}, Lz4/l;-><init>(Lz4/h;La5/l;Lz4/g;Lo5/m0;Lw3/v;Lw3/u$a;Lo5/d0;Lu4/a0$a;Lo5/b;Lu4/h;ZIZLt3/s1;)V

    return-object v16
.end method

.method public g()Ls3/u1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:Ls3/u1;

    return-object v0
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x:La5/l;

    invoke-interface {v0}, La5/l;->i()V

    return-void
.end method

.method public p(La5/g;)V
    .locals 12

    iget-boolean v0, p1, La5/g;->p:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_0

    iget-wide v3, p1, La5/g;->h:J

    invoke-static {v3, v4}, Lp5/n0;->Y0(J)J

    move-result-wide v3

    move-wide v9, v3

    goto :goto_0

    :cond_0
    move-wide v9, v1

    :goto_0
    iget v0, p1, La5/g;->d:I

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1

    goto :goto_1

    :cond_1
    move-wide v7, v1

    goto :goto_2

    :cond_2
    :goto_1
    move-wide v7, v9

    :goto_2
    new-instance v11, Lz4/i;

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x:La5/l;

    invoke-interface {v0}, La5/l;->f()La5/h;

    move-result-object v0

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La5/h;

    invoke-direct {v11, v0, p1}, Lz4/i;-><init>(La5/h;La5/g;)V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x:La5/l;

    invoke-interface {v0}, La5/l;->e()Z

    move-result v0

    move-object v5, p0

    move-object v6, p1

    if-eqz v0, :cond_3

    invoke-virtual/range {v5 .. v11}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->F(La5/g;JJLz4/i;)Lu4/p0;

    move-result-object p1

    goto :goto_3

    :cond_3
    invoke-virtual/range {v5 .. v11}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->G(La5/g;JJLz4/i;)Lu4/p0;

    move-result-object p1

    :goto_3
    invoke-virtual {p0, p1}, Lu4/a;->D(Ls3/u3;)V

    return-void
.end method
