.class public final Lu4/p;
.super Lu4/w0;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu4/p$b;,
        Lu4/p$a;
    }
.end annotation


# instance fields
.field public A:Z

.field public final t:Z

.field public final u:Ls3/u3$d;

.field public final v:Ls3/u3$b;

.field public w:Lu4/p$a;

.field public x:Lu4/o;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Lu4/t;Z)V
    .locals 1

    invoke-direct {p0, p1}, Lu4/w0;-><init>(Lu4/t;)V

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lu4/t;->j()Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Lu4/p;->t:Z

    new-instance p2, Ls3/u3$d;

    invoke-direct {p2}, Ls3/u3$d;-><init>()V

    iput-object p2, p0, Lu4/p;->u:Ls3/u3$d;

    new-instance p2, Ls3/u3$b;

    invoke-direct {p2}, Ls3/u3$b;-><init>()V

    iput-object p2, p0, Lu4/p;->v:Ls3/u3$b;

    invoke-interface {p1}, Lu4/t;->l()Ls3/u3;

    move-result-object p2

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    invoke-static {p2, p1, p1}, Lu4/p$a;->z(Ls3/u3;Ljava/lang/Object;Ljava/lang/Object;)Lu4/p$a;

    move-result-object p1

    iput-object p1, p0, Lu4/p;->w:Lu4/p$a;

    iput-boolean v0, p0, Lu4/p;->A:Z

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Lu4/t;->g()Ls3/u1;

    move-result-object p1

    invoke-static {p1}, Lu4/p$a;->y(Ls3/u1;)Lu4/p$a;

    move-result-object p1

    iput-object p1, p0, Lu4/p;->w:Lu4/p$a;

    :goto_1
    return-void
.end method


# virtual methods
.method public E()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu4/p;->z:Z

    iput-boolean v0, p0, Lu4/p;->y:Z

    invoke-super {p0}, Lu4/f;->E()V

    return-void
.end method

.method public N(Lu4/t$b;)Lu4/t$b;
    .locals 1

    iget-object v0, p1, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lu4/p;->X(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lu4/t$b;->c(Ljava/lang/Object;)Lu4/t$b;

    move-result-object p1

    return-object p1
.end method

.method public T(Ls3/u3;)V
    .locals 14

    iget-boolean v0, p0, Lu4/p;->z:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu4/p;->w:Lu4/p$a;

    invoke-virtual {v0, p1}, Lu4/p$a;->x(Ls3/u3;)Lu4/p$a;

    move-result-object p1

    iput-object p1, p0, Lu4/p;->w:Lu4/p$a;

    iget-object p1, p0, Lu4/p;->x:Lu4/o;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lu4/o;->n()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lu4/p;->a0(J)V

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p1}, Ls3/u3;->u()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lu4/p;->A:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu4/p;->w:Lu4/p$a;

    invoke-virtual {v0, p1}, Lu4/p$a;->x(Ls3/u3;)Lu4/p$a;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object v0, Ls3/u3$d;->y:Ljava/lang/Object;

    sget-object v1, Lu4/p$a;->p:Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lu4/p$a;->z(Ls3/u3;Ljava/lang/Object;Ljava/lang/Object;)Lu4/p$a;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lu4/p;->w:Lu4/p$a;

    goto/16 :goto_3

    :cond_2
    iget-object v0, p0, Lu4/p;->u:Ls3/u3$d;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    iget-object v0, p0, Lu4/p;->u:Ls3/u3$d;

    invoke-virtual {v0}, Ls3/u3$d;->e()J

    move-result-wide v2

    iget-object v0, p0, Lu4/p;->u:Ls3/u3$d;

    iget-object v0, v0, Ls3/u3$d;->h:Ljava/lang/Object;

    iget-object v4, p0, Lu4/p;->x:Lu4/o;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lu4/o;->o()J

    move-result-wide v4

    iget-object v6, p0, Lu4/p;->w:Lu4/p$a;

    iget-object v7, p0, Lu4/p;->x:Lu4/o;

    iget-object v7, v7, Lu4/o;->h:Lu4/t$b;

    iget-object v7, v7, Lu4/s;->a:Ljava/lang/Object;

    iget-object v8, p0, Lu4/p;->v:Ls3/u3$b;

    invoke-virtual {v6, v7, v8}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    iget-object v6, p0, Lu4/p;->v:Ls3/u3$b;

    invoke-virtual {v6}, Ls3/u3$b;->q()J

    move-result-wide v6

    add-long/2addr v6, v4

    iget-object v4, p0, Lu4/p;->w:Lu4/p$a;

    iget-object v5, p0, Lu4/p;->u:Ls3/u3$d;

    invoke-virtual {v4, v1, v5}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object v1

    invoke-virtual {v1}, Ls3/u3$d;->e()J

    move-result-wide v4

    cmp-long v1, v6, v4

    if-eqz v1, :cond_3

    move-wide v12, v6

    goto :goto_1

    :cond_3
    move-wide v12, v2

    :goto_1
    iget-object v9, p0, Lu4/p;->u:Ls3/u3$d;

    iget-object v10, p0, Lu4/p;->v:Ls3/u3$b;

    const/4 v11, 0x0

    move-object v8, p1

    invoke-virtual/range {v8 .. v13}, Ls3/u3;->n(Ls3/u3$d;Ls3/u3$b;IJ)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-boolean v1, p0, Lu4/p;->A:Z

    if-eqz v1, :cond_4

    iget-object v0, p0, Lu4/p;->w:Lu4/p$a;

    invoke-virtual {v0, p1}, Lu4/p$a;->x(Ls3/u3;)Lu4/p$a;

    move-result-object p1

    goto :goto_2

    :cond_4
    invoke-static {p1, v0, v2}, Lu4/p$a;->z(Ls3/u3;Ljava/lang/Object;Ljava/lang/Object;)Lu4/p$a;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Lu4/p;->w:Lu4/p$a;

    iget-object p1, p0, Lu4/p;->x:Lu4/o;

    if-eqz p1, :cond_5

    invoke-virtual {p0, v3, v4}, Lu4/p;->a0(J)V

    iget-object p1, p1, Lu4/o;->h:Lu4/t$b;

    iget-object v0, p1, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lu4/p;->Y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lu4/t$b;->c(Ljava/lang/Object;)Lu4/t$b;

    move-result-object p1

    goto :goto_4

    :cond_5
    :goto_3
    const/4 p1, 0x0

    :goto_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lu4/p;->A:Z

    iput-boolean v0, p0, Lu4/p;->z:Z

    iget-object v0, p0, Lu4/p;->w:Lu4/p$a;

    invoke-virtual {p0, v0}, Lu4/a;->D(Ls3/u3;)V

    if-eqz p1, :cond_6

    iget-object v0, p0, Lu4/p;->x:Lu4/o;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/o;

    invoke-virtual {v0, p1}, Lu4/o;->h(Lu4/t$b;)V

    :cond_6
    return-void
.end method

.method public V()V
    .locals 1

    iget-boolean v0, p0, Lu4/p;->t:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu4/p;->y:Z

    invoke-virtual {p0}, Lu4/w0;->U()V

    :cond_0
    return-void
.end method

.method public W(Lu4/t$b;Lo5/b;J)Lu4/o;
    .locals 1

    new-instance v0, Lu4/o;

    invoke-direct {v0, p1, p2, p3, p4}, Lu4/o;-><init>(Lu4/t$b;Lo5/b;J)V

    iget-object p2, p0, Lu4/w0;->r:Lu4/t;

    invoke-virtual {v0, p2}, Lu4/o;->x(Lu4/t;)V

    iget-boolean p2, p0, Lu4/p;->z:Z

    if-eqz p2, :cond_0

    iget-object p2, p1, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {p0, p2}, Lu4/p;->Y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lu4/t$b;->c(Ljava/lang/Object;)Lu4/t$b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lu4/o;->h(Lu4/t$b;)V

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lu4/p;->x:Lu4/o;

    iget-boolean p1, p0, Lu4/p;->y:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu4/p;->y:Z

    invoke-virtual {p0}, Lu4/w0;->U()V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public final X(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu4/p;->w:Lu4/p$a;

    invoke-static {v0}, Lu4/p$a;->w(Lu4/p$a;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu4/p;->w:Lu4/p$a;

    invoke-static {v0}, Lu4/p$a;->w(Lu4/p$a;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lu4/p$a;->p:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public final Y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu4/p;->w:Lu4/p$a;

    invoke-static {v0}, Lu4/p$a;->w(Lu4/p$a;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lu4/p$a;->p:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lu4/p;->w:Lu4/p$a;

    invoke-static {p1}, Lu4/p$a;->w(Lu4/p$a;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public Z()Ls3/u3;
    .locals 1

    iget-object v0, p0, Lu4/p;->w:Lu4/p$a;

    return-object v0
.end method

.method public a(Lu4/r;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lu4/o;

    invoke-virtual {v0}, Lu4/o;->w()V

    iget-object v0, p0, Lu4/p;->x:Lu4/o;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lu4/p;->x:Lu4/o;

    :cond_0
    return-void
.end method

.method public final a0(J)V
    .locals 5

    iget-object v0, p0, Lu4/p;->x:Lu4/o;

    iget-object v1, p0, Lu4/p;->w:Lu4/p$a;

    iget-object v2, v0, Lu4/o;->h:Lu4/t$b;

    iget-object v2, v2, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lu4/p$a;->f(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Lu4/p;->w:Lu4/p$a;

    iget-object v3, p0, Lu4/p;->v:Ls3/u3$b;

    invoke-virtual {v2, v1, v3}, Ls3/u3;->j(ILs3/u3$b;)Ls3/u3$b;

    move-result-object v1

    iget-wide v1, v1, Ls3/u3$b;->k:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    if-eqz v3, :cond_1

    cmp-long v3, p1, v1

    if-ltz v3, :cond_1

    const-wide/16 p1, 0x0

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    :cond_1
    invoke-virtual {v0, p1, p2}, Lu4/o;->v(J)V

    return-void
.end method

.method public bridge synthetic b(Lu4/t$b;Lo5/b;J)Lu4/r;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lu4/p;->W(Lu4/t$b;Lo5/b;J)Lu4/o;

    move-result-object p1

    return-object p1
.end method

.method public h()V
    .locals 0

    return-void
.end method
