.class public final Lu3/v;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu3/v$a;
    }
.end annotation


# instance fields
.field public A:J

.field public B:J

.field public C:J

.field public D:J

.field public E:Z

.field public F:J

.field public G:J

.field public final a:Lu3/v$a;

.field public final b:[J

.field public c:Landroid/media/AudioTrack;

.field public d:I

.field public e:I

.field public f:Lu3/u;

.field public g:I

.field public h:Z

.field public i:J

.field public j:F

.field public k:Z

.field public l:J

.field public m:J

.field public n:Ljava/lang/reflect/Method;

.field public o:J

.field public p:Z

.field public q:Z

.field public r:J

.field public s:J

.field public t:J

.field public u:J

.field public v:J

.field public w:I

.field public x:I

.field public y:J

.field public z:J


# direct methods
.method public constructor <init>(Lu3/v$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu3/v$a;

    iput-object p1, p0, Lu3/v;->a:Lu3/v$a;

    sget p1, Lp5/n0;->a:I

    const/16 v0, 0x12

    if-lt p1, v0, :cond_0

    :try_start_0
    const-class p1, Landroid/media/AudioTrack;

    const-string v0, "getLatency"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Lu3/v;->n:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    const/16 p1, 0xa

    new-array p1, p1, [J

    iput-object p1, p0, Lu3/v;->b:[J

    return-void
.end method

.method public static o(I)Z
    .locals 2

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 v0, 0x6

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final a()Z
    .locals 4

    iget-boolean v0, p0, Lu3/v;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu3/v;->c:Landroid/media/AudioTrack;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lu3/v;->e()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b(J)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long/2addr p1, v0

    iget v0, p0, Lu3/v;->g:I

    int-to-long v0, v0

    div-long/2addr p1, v0

    return-wide p1
.end method

.method public c(J)I
    .locals 4

    invoke-virtual {p0}, Lu3/v;->e()J

    move-result-wide v0

    iget v2, p0, Lu3/v;->d:I

    int-to-long v2, v2

    mul-long/2addr v0, v2

    sub-long/2addr p1, v0

    long-to-int p1, p1

    iget p2, p0, Lu3/v;->e:I

    sub-int/2addr p2, p1

    return p2
.end method

.method public d(Z)J
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lu3/v;->c:Landroid/media/AudioTrack;

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    invoke-virtual/range {p0 .. p0}, Lu3/v;->m()V

    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    iget-object v5, v0, Lu3/v;->f:Lu3/u;

    invoke-static {v5}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu3/u;

    invoke-virtual {v5}, Lu3/u;->d()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v5}, Lu3/u;->b()J

    move-result-wide v7

    invoke-virtual {v0, v7, v8}, Lu3/v;->b(J)J

    move-result-wide v7

    invoke-virtual {v5}, Lu3/u;->c()J

    move-result-wide v9

    sub-long v9, v1, v9

    iget v5, v0, Lu3/v;->j:F

    invoke-static {v9, v10, v5}, Lp5/n0;->Z(JF)J

    move-result-wide v9

    add-long/2addr v7, v9

    goto :goto_1

    :cond_1
    iget v5, v0, Lu3/v;->x:I

    if-nez v5, :cond_2

    invoke-virtual/range {p0 .. p0}, Lu3/v;->f()J

    move-result-wide v7

    goto :goto_0

    :cond_2
    iget-wide v7, v0, Lu3/v;->l:J

    add-long/2addr v7, v1

    iget v5, v0, Lu3/v;->j:F

    invoke-static {v7, v8, v5}, Lp5/n0;->Z(JF)J

    move-result-wide v7

    :goto_0
    if-nez p1, :cond_3

    const-wide/16 v9, 0x0

    iget-wide v11, v0, Lu3/v;->o:J

    sub-long/2addr v7, v11

    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    :cond_3
    :goto_1
    iget-boolean v5, v0, Lu3/v;->E:Z

    if-eq v5, v6, :cond_4

    iget-wide v9, v0, Lu3/v;->D:J

    iput-wide v9, v0, Lu3/v;->G:J

    iget-wide v9, v0, Lu3/v;->C:J

    iput-wide v9, v0, Lu3/v;->F:J

    :cond_4
    iget-wide v9, v0, Lu3/v;->G:J

    sub-long v9, v1, v9

    const-wide/32 v11, 0xf4240

    cmp-long v5, v9, v11

    if-gez v5, :cond_5

    iget-wide v13, v0, Lu3/v;->F:J

    iget v5, v0, Lu3/v;->j:F

    invoke-static {v9, v10, v5}, Lp5/n0;->Z(JF)J

    move-result-wide v15

    add-long/2addr v13, v15

    mul-long/2addr v9, v3

    div-long/2addr v9, v11

    mul-long/2addr v7, v9

    sub-long v9, v3, v9

    mul-long/2addr v9, v13

    add-long/2addr v7, v9

    div-long/2addr v7, v3

    :cond_5
    iget-boolean v3, v0, Lu3/v;->k:Z

    if-nez v3, :cond_6

    iget-wide v3, v0, Lu3/v;->C:J

    cmp-long v5, v7, v3

    if-lez v5, :cond_6

    const/4 v5, 0x1

    iput-boolean v5, v0, Lu3/v;->k:Z

    sub-long v3, v7, v3

    invoke-static {v3, v4}, Lp5/n0;->Y0(J)J

    move-result-wide v3

    iget v5, v0, Lu3/v;->j:F

    invoke-static {v3, v4, v5}, Lp5/n0;->e0(JF)J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-static {v3, v4}, Lp5/n0;->Y0(J)J

    move-result-wide v3

    sub-long/2addr v9, v3

    iget-object v3, v0, Lu3/v;->a:Lu3/v$a;

    invoke-interface {v3, v9, v10}, Lu3/v$a;->b(J)V

    :cond_6
    iput-wide v1, v0, Lu3/v;->D:J

    iput-wide v7, v0, Lu3/v;->C:J

    iput-boolean v6, v0, Lu3/v;->E:Z

    return-wide v7
.end method

.method public final e()J
    .locals 6

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lu3/v;->y:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v4

    if-eqz v4, :cond_0

    const-wide/16 v4, 0x3e8

    mul-long/2addr v0, v4

    sub-long/2addr v0, v2

    iget v2, p0, Lu3/v;->j:F

    invoke-static {v0, v1, v2}, Lp5/n0;->Z(JF)J

    move-result-wide v0

    iget v2, p0, Lu3/v;->g:I

    int-to-long v2, v2

    mul-long/2addr v0, v2

    const-wide/32 v2, 0xf4240

    div-long/2addr v0, v2

    iget-wide v2, p0, Lu3/v;->B:J

    iget-wide v4, p0, Lu3/v;->A:J

    add-long/2addr v4, v0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-wide v2, p0, Lu3/v;->s:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x5

    cmp-long v2, v2, v4

    if-ltz v2, :cond_1

    invoke-virtual {p0, v0, v1}, Lu3/v;->v(J)V

    iput-wide v0, p0, Lu3/v;->s:J

    :cond_1
    iget-wide v0, p0, Lu3/v;->t:J

    iget-wide v2, p0, Lu3/v;->u:J

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final f()J
    .locals 2

    invoke-virtual {p0}, Lu3/v;->e()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lu3/v;->b(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public g(J)V
    .locals 4

    invoke-virtual {p0}, Lu3/v;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lu3/v;->A:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    iput-wide v0, p0, Lu3/v;->y:J

    iput-wide p1, p0, Lu3/v;->B:J

    return-void
.end method

.method public h(J)Z
    .locals 2

    invoke-virtual {p0}, Lu3/v;->e()J

    move-result-wide v0

    cmp-long p1, p1, v0

    if-gtz p1, :cond_1

    invoke-virtual {p0}, Lu3/v;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public i()Z
    .locals 2

    iget-object v0, p0, Lu3/v;->c:Landroid/media/AudioTrack;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j(J)Z
    .locals 4

    iget-wide v0, p0, Lu3/v;->z:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iget-wide v0, p0, Lu3/v;->z:J

    sub-long/2addr p1, v0

    const-wide/16 v0, 0xc8

    cmp-long p1, p1, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public k(J)Z
    .locals 8

    iget-object v0, p0, Lu3/v;->c:Landroid/media/AudioTrack;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    iget-boolean v1, p0, Lu3/v;->h:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    iput-boolean v3, p0, Lu3/v;->p:Z

    return v3

    :cond_0
    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, Lu3/v;->e()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-nez v1, :cond_1

    return v3

    :cond_1
    iget-boolean v1, p0, Lu3/v;->p:Z

    invoke-virtual {p0, p1, p2}, Lu3/v;->h(J)Z

    move-result p1

    iput-boolean p1, p0, Lu3/v;->p:Z

    if-eqz v1, :cond_2

    if-nez p1, :cond_2

    if-eq v0, v2, :cond_2

    iget-object p1, p0, Lu3/v;->a:Lu3/v$a;

    iget p2, p0, Lu3/v;->e:I

    iget-wide v0, p0, Lu3/v;->i:J

    invoke-static {v0, v1}, Lp5/n0;->Y0(J)J

    move-result-wide v0

    invoke-interface {p1, p2, v0, v1}, Lu3/v$a;->a(IJ)V

    :cond_2
    return v2
.end method

.method public final l(J)V
    .locals 11

    iget-object v0, p0, Lu3/v;->f:Lu3/u;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/u;

    invoke-virtual {v0, p1, p2}, Lu3/u;->e(J)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lu3/u;->c()J

    move-result-wide v5

    invoke-virtual {v0}, Lu3/u;->b()J

    move-result-wide v3

    invoke-virtual {p0}, Lu3/v;->f()J

    move-result-wide v9

    sub-long v1, v5, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    const-wide/32 v7, 0x4c4b40

    cmp-long v1, v1, v7

    if-lez v1, :cond_1

    iget-object v2, p0, Lu3/v;->a:Lu3/v$a;

    move-wide v7, p1

    invoke-interface/range {v2 .. v10}, Lu3/v$a;->e(JJJJ)V

    :goto_0
    invoke-virtual {v0}, Lu3/u;->f()V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v3, v4}, Lu3/v;->b(J)J

    move-result-wide v1

    sub-long/2addr v1, v9

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    cmp-long v1, v1, v7

    if-lez v1, :cond_2

    iget-object v2, p0, Lu3/v;->a:Lu3/v$a;

    move-wide v7, p1

    invoke-interface/range {v2 .. v10}, Lu3/v$a;->d(JJJJ)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lu3/u;->a()V

    :goto_1
    return-void
.end method

.method public final m()V
    .locals 11

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    iget-wide v2, p0, Lu3/v;->m:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x7530

    cmp-long v2, v2, v4

    if-ltz v2, :cond_2

    invoke-virtual {p0}, Lu3/v;->f()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    return-void

    :cond_0
    iget-object v6, p0, Lu3/v;->b:[J

    iget v7, p0, Lu3/v;->w:I

    iget v8, p0, Lu3/v;->j:F

    invoke-static {v2, v3, v8}, Lp5/n0;->e0(JF)J

    move-result-wide v2

    sub-long/2addr v2, v0

    aput-wide v2, v6, v7

    iget v2, p0, Lu3/v;->w:I

    add-int/lit8 v2, v2, 0x1

    const/16 v3, 0xa

    rem-int/2addr v2, v3

    iput v2, p0, Lu3/v;->w:I

    iget v2, p0, Lu3/v;->x:I

    if-ge v2, v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lu3/v;->x:I

    :cond_1
    iput-wide v0, p0, Lu3/v;->m:J

    iput-wide v4, p0, Lu3/v;->l:J

    const/4 v2, 0x0

    :goto_0
    iget v3, p0, Lu3/v;->x:I

    if-ge v2, v3, :cond_2

    iget-wide v4, p0, Lu3/v;->l:J

    iget-object v6, p0, Lu3/v;->b:[J

    aget-wide v7, v6, v2

    int-to-long v9, v3

    div-long/2addr v7, v9

    add-long/2addr v4, v7

    iput-wide v4, p0, Lu3/v;->l:J

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-boolean v2, p0, Lu3/v;->h:Z

    if-eqz v2, :cond_3

    return-void

    :cond_3
    invoke-virtual {p0, v0, v1}, Lu3/v;->l(J)V

    invoke-virtual {p0, v0, v1}, Lu3/v;->n(J)V

    return-void
.end method

.method public final n(J)V
    .locals 6

    iget-boolean v0, p0, Lu3/v;->q:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu3/v;->n:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1

    iget-wide v1, p0, Lu3/v;->r:J

    sub-long v1, p1, v1

    const-wide/32 v3, 0x7a120

    cmp-long v1, v1, v3

    if-ltz v1, :cond_1

    :try_start_0
    iget-object v1, p0, Lu3/v;->c:Landroid/media/AudioTrack;

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    iget-wide v2, p0, Lu3/v;->i:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lu3/v;->o:J

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lu3/v;->o:J

    const-wide/32 v4, 0x4c4b40

    cmp-long v4, v0, v4

    if-lez v4, :cond_0

    iget-object v4, p0, Lu3/v;->a:Lu3/v$a;

    invoke-interface {v4, v0, v1}, Lu3/v$a;->c(J)V

    iput-wide v2, p0, Lu3/v;->o:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    iput-object v0, p0, Lu3/v;->n:Ljava/lang/reflect/Method;

    :cond_0
    :goto_0
    iput-wide p1, p0, Lu3/v;->r:J

    :cond_1
    return-void
.end method

.method public p()Z
    .locals 4

    invoke-virtual {p0}, Lu3/v;->r()V

    iget-wide v0, p0, Lu3/v;->y:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lu3/v;->f:Lu3/u;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/u;

    invoke-virtual {v0}, Lu3/u;->g()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public q()V
    .locals 1

    invoke-virtual {p0}, Lu3/v;->r()V

    const/4 v0, 0x0

    iput-object v0, p0, Lu3/v;->c:Landroid/media/AudioTrack;

    iput-object v0, p0, Lu3/v;->f:Lu3/u;

    return-void
.end method

.method public final r()V
    .locals 3

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lu3/v;->l:J

    const/4 v2, 0x0

    iput v2, p0, Lu3/v;->x:I

    iput v2, p0, Lu3/v;->w:I

    iput-wide v0, p0, Lu3/v;->m:J

    iput-wide v0, p0, Lu3/v;->D:J

    iput-wide v0, p0, Lu3/v;->G:J

    iput-boolean v2, p0, Lu3/v;->k:Z

    return-void
.end method

.method public s(Landroid/media/AudioTrack;ZIII)V
    .locals 2

    iput-object p1, p0, Lu3/v;->c:Landroid/media/AudioTrack;

    iput p4, p0, Lu3/v;->d:I

    iput p5, p0, Lu3/v;->e:I

    new-instance v0, Lu3/u;

    invoke-direct {v0, p1}, Lu3/u;-><init>(Landroid/media/AudioTrack;)V

    iput-object v0, p0, Lu3/v;->f:Lu3/u;

    invoke-virtual {p1}, Landroid/media/AudioTrack;->getSampleRate()I

    move-result p1

    iput p1, p0, Lu3/v;->g:I

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    invoke-static {p3}, Lu3/v;->o(I)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    move p2, p1

    :goto_0
    iput-boolean p2, p0, Lu3/v;->h:Z

    invoke-static {p3}, Lp5/n0;->t0(I)Z

    move-result p2

    iput-boolean p2, p0, Lu3/v;->q:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz p2, :cond_1

    div-int/2addr p5, p4

    int-to-long p2, p5

    invoke-virtual {p0, p2, p3}, Lu3/v;->b(J)J

    move-result-wide p2

    goto :goto_1

    :cond_1
    move-wide p2, v0

    :goto_1
    iput-wide p2, p0, Lu3/v;->i:J

    const-wide/16 p2, 0x0

    iput-wide p2, p0, Lu3/v;->t:J

    iput-wide p2, p0, Lu3/v;->u:J

    iput-wide p2, p0, Lu3/v;->v:J

    iput-boolean p1, p0, Lu3/v;->p:Z

    iput-wide v0, p0, Lu3/v;->y:J

    iput-wide v0, p0, Lu3/v;->z:J

    iput-wide p2, p0, Lu3/v;->r:J

    iput-wide p2, p0, Lu3/v;->o:J

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lu3/v;->j:F

    return-void
.end method

.method public t(F)V
    .locals 0

    iput p1, p0, Lu3/v;->j:F

    iget-object p1, p0, Lu3/v;->f:Lu3/u;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lu3/u;->g()V

    :cond_0
    invoke-virtual {p0}, Lu3/v;->r()V

    return-void
.end method

.method public u()V
    .locals 1

    iget-object v0, p0, Lu3/v;->f:Lu3/u;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/u;

    invoke-virtual {v0}, Lu3/u;->g()V

    return-void
.end method

.method public final v(J)V
    .locals 10

    iget-object v0, p0, Lu3/v;->c:Landroid/media/AudioTrack;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    const-wide v2, 0xffffffffL

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlaybackHeadPosition()I

    move-result v0

    int-to-long v4, v0

    and-long/2addr v2, v4

    iget-boolean v0, p0, Lu3/v;->h:Z

    const-wide/16 v4, 0x0

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    if-ne v1, v0, :cond_1

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget-wide v6, p0, Lu3/v;->t:J

    iput-wide v6, p0, Lu3/v;->v:J

    :cond_1
    iget-wide v6, p0, Lu3/v;->v:J

    add-long/2addr v2, v6

    :cond_2
    sget v0, Lp5/n0;->a:I

    const/16 v6, 0x1d

    if-gt v0, v6, :cond_5

    cmp-long v0, v2, v4

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_4

    iget-wide v8, p0, Lu3/v;->t:J

    cmp-long v0, v8, v4

    if-lez v0, :cond_4

    const/4 v0, 0x3

    if-ne v1, v0, :cond_4

    iget-wide v0, p0, Lu3/v;->z:J

    cmp-long v0, v0, v6

    if-nez v0, :cond_3

    iput-wide p1, p0, Lu3/v;->z:J

    :cond_3
    return-void

    :cond_4
    iput-wide v6, p0, Lu3/v;->z:J

    :cond_5
    iget-wide p1, p0, Lu3/v;->t:J

    cmp-long p1, p1, v2

    if-lez p1, :cond_6

    iget-wide p1, p0, Lu3/v;->u:J

    const-wide/16 v0, 0x1

    add-long/2addr p1, v0

    iput-wide p1, p0, Lu3/v;->u:J

    :cond_6
    iput-wide v2, p0, Lu3/v;->t:J

    return-void
.end method
