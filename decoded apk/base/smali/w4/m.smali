.class public final Lw4/m;
.super Lw4/f;
.source ""


# instance fields
.field public final j:Lw4/g;

.field public k:Lw4/g$b;

.field public l:J

.field public volatile m:Z


# direct methods
.method public constructor <init>(Lo5/j;Lo5/n;Ls3/m1;ILjava/lang/Object;Lw4/g;)V
    .locals 11

    const/4 v3, 0x2

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move v5, p4

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v10}, Lw4/f;-><init>(Lo5/j;Lo5/n;ILs3/m1;ILjava/lang/Object;JJ)V

    move-object/from16 v1, p6

    iput-object v1, v0, Lw4/m;->j:Lw4/g;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 8

    iget-wide v0, p0, Lw4/m;->l:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v1, p0, Lw4/m;->j:Lw4/g;

    iget-object v2, p0, Lw4/m;->k:Lw4/g$b;

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    invoke-interface/range {v1 .. v6}, Lw4/g;->b(Lw4/g$b;JJ)V

    :cond_0
    :try_start_0
    iget-object v0, p0, Lw4/f;->b:Lo5/n;

    iget-wide v1, p0, Lw4/m;->l:J

    invoke-virtual {v0, v1, v2}, Lo5/n;->e(J)Lo5/n;

    move-result-object v0

    new-instance v7, Lx3/e;

    iget-object v2, p0, Lw4/f;->i:Lo5/l0;

    iget-wide v3, v0, Lo5/n;->g:J

    invoke-virtual {v2, v0}, Lo5/l0;->k(Lo5/n;)J

    move-result-wide v5

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lx3/e;-><init>(Lo5/h;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    iget-boolean v0, p0, Lw4/m;->m:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lw4/m;->j:Lw4/g;

    invoke-interface {v0, v7}, Lw4/g;->a(Lx3/l;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    :try_start_2
    invoke-interface {v7}, Lx3/l;->getPosition()J

    move-result-wide v0

    iget-object v2, p0, Lw4/f;->b:Lo5/n;

    iget-wide v2, v2, Lo5/n;->g:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lw4/m;->l:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v0, p0, Lw4/f;->i:Lo5/l0;

    invoke-static {v0}, Lo5/m;->a(Lo5/j;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_3
    invoke-interface {v7}, Lx3/l;->getPosition()J

    move-result-wide v1

    iget-object v3, p0, Lw4/f;->b:Lo5/n;

    iget-wide v3, v3, Lo5/n;->g:J

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lw4/m;->l:J

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    iget-object v1, p0, Lw4/f;->i:Lo5/l0;

    invoke-static {v1}, Lo5/m;->a(Lo5/j;)V

    throw v0
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw4/m;->m:Z

    return-void
.end method

.method public g(Lw4/g$b;)V
    .locals 0

    iput-object p1, p0, Lw4/m;->k:Lw4/g$b;

    return-void
.end method
