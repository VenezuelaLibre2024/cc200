.class public abstract Ls3/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/i3;
.implements Ls3/j3;


# instance fields
.field public final h:I

.field public final i:Ls3/n1;

.field public j:Ls3/k3;

.field public k:I

.field public l:Lt3/s1;

.field public m:I

.field public n:Lu4/m0;

.field public o:[Ls3/m1;

.field public p:J

.field public q:J

.field public r:J

.field public s:Z

.field public t:Z


# direct methods
.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ls3/f;->h:I

    new-instance p1, Ls3/n1;

    invoke-direct {p1}, Ls3/n1;-><init>()V

    iput-object p1, p0, Ls3/f;->i:Ls3/n1;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Ls3/f;->r:J

    return-void
.end method


# virtual methods
.method public final A([Ls3/m1;Lu4/m0;JJ)V
    .locals 6

    iget-boolean v0, p0, Ls3/f;->s:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lp5/a;->f(Z)V

    iput-object p2, p0, Ls3/f;->n:Lu4/m0;

    iget-wide v0, p0, Ls3/f;->r:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    iput-wide p3, p0, Ls3/f;->r:J

    :cond_0
    iput-object p1, p0, Ls3/f;->o:[Ls3/m1;

    iput-wide p5, p0, Ls3/f;->p:J

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p3

    move-wide v4, p5

    invoke-virtual/range {v0 .. v5}, Ls3/f;->V([Ls3/m1;JJ)V

    return-void
.end method

.method public final B()J
    .locals 2

    iget-wide v0, p0, Ls3/f;->r:J

    return-wide v0
.end method

.method public final C(J)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Ls3/f;->X(JZ)V

    return-void
.end method

.method public final D()Z
    .locals 1

    iget-boolean v0, p0, Ls3/f;->s:Z

    return v0
.end method

.method public E()Lp5/t;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final F(Ls3/k3;[Ls3/m1;Lu4/m0;JZZJJ)V
    .locals 9

    move-object v7, p0

    move v8, p6

    iget v0, v7, Ls3/f;->m:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp5/a;->f(Z)V

    move-object v0, p1

    iput-object v0, v7, Ls3/f;->j:Ls3/k3;

    iput v1, v7, Ls3/f;->m:I

    move/from16 v0, p7

    invoke-virtual {p0, p6, v0}, Ls3/f;->Q(ZZ)V

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-wide/from16 v3, p8

    move-wide/from16 v5, p10

    invoke-virtual/range {v0 .. v6}, Ls3/f;->A([Ls3/m1;Lu4/m0;JJ)V

    move-wide v0, p4

    invoke-virtual {p0, p4, p5, p6}, Ls3/f;->X(JZ)V

    return-void
.end method

.method public final H(Ljava/lang/Throwable;Ls3/m1;I)Ls3/q;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, p3}, Ls3/f;->I(Ljava/lang/Throwable;Ls3/m1;ZI)Ls3/q;

    move-result-object p1

    return-object p1
.end method

.method public final I(Ljava/lang/Throwable;Ls3/m1;ZI)Ls3/q;
    .locals 9

    if-eqz p2, :cond_0

    iget-boolean v0, p0, Ls3/f;->t:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls3/f;->t:Z

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p0, p2}, Ls3/j3;->a(Ls3/m1;)I

    move-result v1

    invoke-static {v1}, Ls3/j3;->G(I)I

    move-result v1
    :try_end_0
    .catch Ls3/q; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, Ls3/f;->t:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, Ls3/f;->t:Z

    throw p1

    :catch_0
    iput-boolean v0, p0, Ls3/f;->t:Z

    :cond_0
    const/4 v1, 0x4

    :goto_0
    move v6, v1

    invoke-interface {p0}, Ls3/i3;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Ls3/f;->L()I

    move-result v4

    move-object v2, p1

    move-object v5, p2

    move v7, p3

    move v8, p4

    invoke-static/range {v2 .. v8}, Ls3/q;->f(Ljava/lang/Throwable;Ljava/lang/String;ILs3/m1;IZI)Ls3/q;

    move-result-object p1

    return-object p1
.end method

.method public final J()Ls3/k3;
    .locals 1

    iget-object v0, p0, Ls3/f;->j:Ls3/k3;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/k3;

    return-object v0
.end method

.method public final K()Ls3/n1;
    .locals 1

    iget-object v0, p0, Ls3/f;->i:Ls3/n1;

    invoke-virtual {v0}, Ls3/n1;->a()V

    iget-object v0, p0, Ls3/f;->i:Ls3/n1;

    return-object v0
.end method

.method public final L()I
    .locals 1

    iget v0, p0, Ls3/f;->k:I

    return v0
.end method

.method public final M()Lt3/s1;
    .locals 1

    iget-object v0, p0, Ls3/f;->l:Lt3/s1;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt3/s1;

    return-object v0
.end method

.method public final N()[Ls3/m1;
    .locals 1

    iget-object v0, p0, Ls3/f;->o:[Ls3/m1;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls3/m1;

    return-object v0
.end method

.method public final O()Z
    .locals 1

    invoke-virtual {p0}, Ls3/f;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ls3/f;->s:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls3/f;->n:Lu4/m0;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/m0;

    invoke-interface {v0}, Lu4/m0;->e()Z

    move-result v0

    :goto_0
    return v0
.end method

.method public abstract P()V
.end method

.method public Q(ZZ)V
    .locals 0

    return-void
.end method

.method public abstract R(JZ)V
.end method

.method public S()V
    .locals 0

    return-void
.end method

.method public T()V
    .locals 0

    return-void
.end method

.method public U()V
    .locals 0

    return-void
.end method

.method public abstract V([Ls3/m1;JJ)V
.end method

.method public final W(Ls3/n1;Lv3/g;I)I
    .locals 5

    iget-object v0, p0, Ls3/f;->n:Lu4/m0;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/m0;

    invoke-interface {v0, p1, p2, p3}, Lu4/m0;->j(Ls3/n1;Lv3/g;I)I

    move-result p3

    const/4 v0, -0x4

    if-ne p3, v0, :cond_2

    invoke-virtual {p2}, Lv3/a;->q()Z

    move-result p1

    if-eqz p1, :cond_1

    const-wide/high16 p1, -0x8000000000000000L

    iput-wide p1, p0, Ls3/f;->r:J

    iget-boolean p1, p0, Ls3/f;->s:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x3

    :goto_0
    return v0

    :cond_1
    iget-wide v0, p2, Lv3/g;->l:J

    iget-wide v2, p0, Ls3/f;->p:J

    add-long/2addr v0, v2

    iput-wide v0, p2, Lv3/g;->l:J

    iget-wide p1, p0, Ls3/f;->r:J

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ls3/f;->r:J

    goto :goto_1

    :cond_2
    const/4 p2, -0x5

    if-ne p3, p2, :cond_3

    iget-object p2, p1, Ls3/n1;->b:Ls3/m1;

    invoke-static {p2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ls3/m1;

    iget-wide v0, p2, Ls3/m1;->w:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v0, v0, v2

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Ls3/m1;->b()Ls3/m1$b;

    move-result-object v0

    iget-wide v1, p2, Ls3/m1;->w:J

    iget-wide v3, p0, Ls3/f;->p:J

    add-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ls3/m1$b;->k0(J)Ls3/m1$b;

    move-result-object p2

    invoke-virtual {p2}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object p2

    iput-object p2, p1, Ls3/n1;->b:Ls3/m1;

    :cond_3
    :goto_1
    return p3
.end method

.method public final X(JZ)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls3/f;->s:Z

    iput-wide p1, p0, Ls3/f;->q:J

    iput-wide p1, p0, Ls3/f;->r:J

    invoke-virtual {p0, p1, p2, p3}, Ls3/f;->R(JZ)V

    return-void
.end method

.method public Y(J)I
    .locals 3

    iget-object v0, p0, Ls3/f;->n:Lu4/m0;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/m0;

    iget-wide v1, p0, Ls3/f;->p:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lu4/m0;->n(J)I

    move-result p1

    return p1
.end method

.method public final f()V
    .locals 3

    iget v0, p0, Ls3/f;->m:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-static {v1}, Lp5/a;->f(Z)V

    iget-object v0, p0, Ls3/f;->i:Ls3/n1;

    invoke-virtual {v0}, Ls3/n1;->a()V

    iput v2, p0, Ls3/f;->m:I

    const/4 v0, 0x0

    iput-object v0, p0, Ls3/f;->n:Lu4/m0;

    iput-object v0, p0, Ls3/f;->o:[Ls3/m1;

    iput-boolean v2, p0, Ls3/f;->s:Z

    invoke-virtual {p0}, Ls3/f;->P()V

    return-void
.end method

.method public final g()Lu4/m0;
    .locals 1

    iget-object v0, p0, Ls3/f;->n:Lu4/m0;

    return-object v0
.end method

.method public final getState()I
    .locals 1

    iget v0, p0, Ls3/f;->m:I

    return v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Ls3/f;->h:I

    return v0
.end method

.method public final j()Z
    .locals 4

    iget-wide v0, p0, Ls3/f;->r:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final l()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls3/f;->s:Z

    return-void
.end method

.method public final m(ILt3/s1;)V
    .locals 0

    iput p1, p0, Ls3/f;->k:I

    iput-object p2, p0, Ls3/f;->l:Lt3/s1;

    return-void
.end method

.method public final q()Ls3/j3;
    .locals 0

    return-object p0
.end method

.method public final reset()V
    .locals 1

    iget v0, p0, Ls3/f;->m:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp5/a;->f(Z)V

    iget-object v0, p0, Ls3/f;->i:Ls3/n1;

    invoke-virtual {v0}, Ls3/n1;->a()V

    invoke-virtual {p0}, Ls3/f;->S()V

    return-void
.end method

.method public final start()V
    .locals 2

    iget v0, p0, Ls3/f;->m:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lp5/a;->f(Z)V

    const/4 v0, 0x2

    iput v0, p0, Ls3/f;->m:I

    invoke-virtual {p0}, Ls3/f;->T()V

    return-void
.end method

.method public final stop()V
    .locals 3

    iget v0, p0, Ls3/f;->m:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp5/a;->f(Z)V

    iput v1, p0, Ls3/f;->m:I

    invoke-virtual {p0}, Ls3/f;->U()V

    return-void
.end method

.method public w()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public y(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final z()V
    .locals 1

    iget-object v0, p0, Ls3/f;->n:Lu4/m0;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/m0;

    invoke-interface {v0}, Lu4/m0;->a()V

    return-void
.end method
