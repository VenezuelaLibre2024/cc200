.class public final Lu4/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu4/r;
.implements Lu4/r$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu4/o$a;
    }
.end annotation


# instance fields
.field public final h:Lu4/t$b;

.field public final i:J

.field public final j:Lo5/b;

.field public k:Lu4/t;

.field public l:Lu4/r;

.field public m:Lu4/r$a;

.field public n:Lu4/o$a;

.field public o:Z

.field public p:J


# direct methods
.method public constructor <init>(Lu4/t$b;Lo5/b;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/o;->h:Lu4/t$b;

    iput-object p2, p0, Lu4/o;->j:Lo5/b;

    iput-wide p3, p0, Lu4/o;->i:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lu4/o;->p:J

    return-void
.end method


# virtual methods
.method public b()J
    .locals 2

    iget-object v0, p0, Lu4/o;->l:Lu4/r;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/r;

    invoke-interface {v0}, Lu4/r;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public c(J)Z
    .locals 1

    iget-object v0, p0, Lu4/o;->l:Lu4/r;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lu4/r;->c(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d(JLs3/m3;)J
    .locals 1

    iget-object v0, p0, Lu4/o;->l:Lu4/r;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/r;

    invoke-interface {v0, p1, p2, p3}, Lu4/r;->d(JLs3/m3;)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic e(Lu4/n0;)V
    .locals 0

    check-cast p1, Lu4/r;

    invoke-virtual {p0, p1}, Lu4/o;->u(Lu4/r;)V

    return-void
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lu4/o;->l:Lu4/r;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/r;

    invoke-interface {v0}, Lu4/r;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public g(J)V
    .locals 1

    iget-object v0, p0, Lu4/o;->l:Lu4/r;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/r;

    invoke-interface {v0, p1, p2}, Lu4/r;->g(J)V

    return-void
.end method

.method public h(Lu4/t$b;)V
    .locals 4

    iget-wide v0, p0, Lu4/o;->i:J

    invoke-virtual {p0, v0, v1}, Lu4/o;->r(J)J

    move-result-wide v0

    iget-object v2, p0, Lu4/o;->k:Lu4/t;

    invoke-static {v2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu4/t;

    iget-object v3, p0, Lu4/o;->j:Lo5/b;

    invoke-interface {v2, p1, v3, v0, v1}, Lu4/t;->b(Lu4/t$b;Lo5/b;J)Lu4/r;

    move-result-object p1

    iput-object p1, p0, Lu4/o;->l:Lu4/r;

    iget-object v2, p0, Lu4/o;->m:Lu4/r$a;

    if-eqz v2, :cond_0

    invoke-interface {p1, p0, v0, v1}, Lu4/r;->i(Lu4/r$a;J)V

    :cond_0
    return-void
.end method

.method public i(Lu4/r$a;J)V
    .locals 0

    iput-object p1, p0, Lu4/o;->m:Lu4/r$a;

    iget-object p1, p0, Lu4/o;->l:Lu4/r;

    if-eqz p1, :cond_0

    iget-wide p2, p0, Lu4/o;->i:J

    invoke-virtual {p0, p2, p3}, Lu4/o;->r(J)J

    move-result-wide p2

    invoke-interface {p1, p0, p2, p3}, Lu4/r;->i(Lu4/r$a;J)V

    :cond_0
    return-void
.end method

.method public isLoading()Z
    .locals 1

    iget-object v0, p0, Lu4/o;->l:Lu4/r;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lu4/r;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k(Lu4/r;)V
    .locals 1

    iget-object p1, p0, Lu4/o;->m:Lu4/r$a;

    invoke-static {p1}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu4/r$a;

    invoke-interface {p1, p0}, Lu4/r$a;->k(Lu4/r;)V

    iget-object p1, p0, Lu4/o;->n:Lu4/o$a;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lu4/o;->h:Lu4/t$b;

    invoke-interface {p1, v0}, Lu4/o$a;->b(Lu4/t$b;)V

    :cond_0
    return-void
.end method

.method public l()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lu4/o;->l:Lu4/r;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lu4/r;->l()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu4/o;->k:Lu4/t;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lu4/t;->h()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lu4/o;->n:Lu4/o$a;

    if-eqz v1, :cond_2

    iget-boolean v2, p0, Lu4/o;->o:Z

    if-nez v2, :cond_1

    const/4 v2, 0x1

    iput-boolean v2, p0, Lu4/o;->o:Z

    iget-object v2, p0, Lu4/o;->h:Lu4/t$b;

    invoke-interface {v1, v2, v0}, Lu4/o$a;->a(Lu4/t$b;Ljava/io/IOException;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    throw v0
.end method

.method public m(J)J
    .locals 1

    iget-object v0, p0, Lu4/o;->l:Lu4/r;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/r;

    invoke-interface {v0, p1, p2}, Lu4/r;->m(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public n()J
    .locals 2

    iget-wide v0, p0, Lu4/o;->p:J

    return-wide v0
.end method

.method public o()J
    .locals 2

    iget-wide v0, p0, Lu4/o;->i:J

    return-wide v0
.end method

.method public p()J
    .locals 2

    iget-object v0, p0, Lu4/o;->l:Lu4/r;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/r;

    invoke-interface {v0}, Lu4/r;->p()J

    move-result-wide v0

    return-wide v0
.end method

.method public q([Ln5/s;[Z[Lu4/m0;[ZJ)J
    .locals 13

    move-object v0, p0

    iget-wide v1, v0, Lu4/o;->p:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    iget-wide v5, v0, Lu4/o;->i:J

    cmp-long v5, p5, v5

    if-nez v5, :cond_0

    iput-wide v3, v0, Lu4/o;->p:J

    move-wide v11, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v11, p5

    :goto_0
    iget-object v1, v0, Lu4/o;->l:Lu4/r;

    invoke-static {v1}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lu4/r;

    move-object v7, p1

    move-object v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    invoke-interface/range {v6 .. v12}, Lu4/r;->q([Ln5/s;[Z[Lu4/m0;[ZJ)J

    move-result-wide v1

    return-wide v1
.end method

.method public final r(J)J
    .locals 4

    iget-wide v0, p0, Lu4/o;->p:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    move-wide p1, v0

    :cond_0
    return-wide p1
.end method

.method public s()Lu4/u0;
    .locals 1

    iget-object v0, p0, Lu4/o;->l:Lu4/r;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/r;

    invoke-interface {v0}, Lu4/r;->s()Lu4/u0;

    move-result-object v0

    return-object v0
.end method

.method public t(JZ)V
    .locals 1

    iget-object v0, p0, Lu4/o;->l:Lu4/r;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/r;

    invoke-interface {v0, p1, p2, p3}, Lu4/r;->t(JZ)V

    return-void
.end method

.method public u(Lu4/r;)V
    .locals 0

    iget-object p1, p0, Lu4/o;->m:Lu4/r$a;

    invoke-static {p1}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu4/r$a;

    invoke-interface {p1, p0}, Lu4/n0$a;->e(Lu4/n0;)V

    return-void
.end method

.method public v(J)V
    .locals 0

    iput-wide p1, p0, Lu4/o;->p:J

    return-void
.end method

.method public w()V
    .locals 2

    iget-object v0, p0, Lu4/o;->l:Lu4/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu4/o;->k:Lu4/t;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/t;

    iget-object v1, p0, Lu4/o;->l:Lu4/r;

    invoke-interface {v0, v1}, Lu4/t;->a(Lu4/r;)V

    :cond_0
    return-void
.end method

.method public x(Lu4/t;)V
    .locals 1

    iget-object v0, p0, Lu4/o;->k:Lu4/t;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp5/a;->f(Z)V

    iput-object p1, p0, Lu4/o;->k:Lu4/t;

    return-void
.end method
