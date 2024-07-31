.class public final Lu4/g0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo5/e0$e;
.implements Lu4/m$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu4/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final a:J

.field public final b:Landroid/net/Uri;

.field public final c:Lo5/l0;

.field public final d:Lu4/b0;

.field public final e:Lx3/m;

.field public final f:Lp5/g;

.field public final g:Lx3/y;

.field public volatile h:Z

.field public i:Z

.field public j:J

.field public k:Lo5/n;

.field public l:Lx3/b0;

.field public m:Z

.field public final synthetic n:Lu4/g0;


# direct methods
.method public constructor <init>(Lu4/g0;Landroid/net/Uri;Lo5/j;Lu4/b0;Lx3/m;Lp5/g;)V
    .locals 0

    iput-object p1, p0, Lu4/g0$a;->n:Lu4/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lu4/g0$a;->b:Landroid/net/Uri;

    new-instance p1, Lo5/l0;

    invoke-direct {p1, p3}, Lo5/l0;-><init>(Lo5/j;)V

    iput-object p1, p0, Lu4/g0$a;->c:Lo5/l0;

    iput-object p4, p0, Lu4/g0$a;->d:Lu4/b0;

    iput-object p5, p0, Lu4/g0$a;->e:Lx3/m;

    iput-object p6, p0, Lu4/g0$a;->f:Lp5/g;

    new-instance p1, Lx3/y;

    invoke-direct {p1}, Lx3/y;-><init>()V

    iput-object p1, p0, Lu4/g0$a;->g:Lx3/y;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu4/g0$a;->i:Z

    invoke-static {}, Lu4/n;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lu4/g0$a;->a:J

    const-wide/16 p1, 0x0

    invoke-virtual {p0, p1, p2}, Lu4/g0$a;->i(J)Lo5/n;

    move-result-object p1

    iput-object p1, p0, Lu4/g0$a;->k:Lo5/n;

    return-void
.end method

.method public static synthetic d(Lu4/g0$a;)Lo5/l0;
    .locals 0

    iget-object p0, p0, Lu4/g0$a;->c:Lo5/l0;

    return-object p0
.end method

.method public static synthetic e(Lu4/g0$a;)J
    .locals 2

    iget-wide v0, p0, Lu4/g0$a;->a:J

    return-wide v0
.end method

.method public static synthetic f(Lu4/g0$a;)Lo5/n;
    .locals 0

    iget-object p0, p0, Lu4/g0$a;->k:Lo5/n;

    return-object p0
.end method

.method public static synthetic g(Lu4/g0$a;)J
    .locals 2

    iget-wide v0, p0, Lu4/g0$a;->j:J

    return-wide v0
.end method

.method public static synthetic h(Lu4/g0$a;JJ)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lu4/g0$a;->j(JJ)V

    return-void
.end method


# virtual methods
.method public a(Lp5/a0;)V
    .locals 11

    iget-boolean v0, p0, Lu4/g0$a;->m:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-wide v2, p0, Lu4/g0$a;->j:J

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu4/g0$a;->n:Lu4/g0;

    invoke-static {v0, v1}, Lu4/g0;->A(Lu4/g0;Z)J

    move-result-wide v2

    iget-wide v4, p0, Lu4/g0$a;->j:J

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    :goto_0
    move-wide v5, v2

    invoke-virtual {p1}, Lp5/a0;->a()I

    move-result v8

    iget-object v0, p0, Lu4/g0$a;->l:Lx3/b0;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lx3/b0;

    invoke-interface {v4, p1, v8}, Lx3/b0;->e(Lp5/a0;I)V

    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lx3/b0;->a(JIIILx3/b0$a;)V

    iput-boolean v1, p0, Lu4/g0$a;->m:Z

    return-void
.end method

.method public b()V
    .locals 17

    move-object/from16 v1, p0

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-nez v2, :cond_9

    iget-boolean v3, v1, Lu4/g0$a;->h:Z

    if-nez v3, :cond_9

    const/4 v3, 0x1

    const-wide/16 v4, -0x1

    :try_start_0
    iget-object v6, v1, Lu4/g0$a;->g:Lx3/y;

    iget-wide v13, v6, Lx3/y;->a:J

    invoke-virtual {v1, v13, v14}, Lu4/g0$a;->i(J)Lo5/n;

    move-result-object v6

    iput-object v6, v1, Lu4/g0$a;->k:Lo5/n;

    iget-object v7, v1, Lu4/g0$a;->c:Lo5/l0;

    invoke-virtual {v7, v6}, Lo5/l0;->k(Lo5/n;)J

    move-result-wide v6

    cmp-long v8, v6, v4

    if-eqz v8, :cond_0

    add-long/2addr v6, v13

    iget-object v8, v1, Lu4/g0$a;->n:Lu4/g0;

    invoke-static {v8}, Lu4/g0;->D(Lu4/g0;)V

    :cond_0
    move-wide v15, v6

    iget-object v6, v1, Lu4/g0$a;->n:Lu4/g0;

    iget-object v7, v1, Lu4/g0$a;->c:Lo5/l0;

    invoke-virtual {v7}, Lo5/l0;->j()Ljava/util/Map;

    move-result-object v7

    invoke-static {v7}, Lo4/b;->a(Ljava/util/Map;)Lo4/b;

    move-result-object v7

    invoke-static {v6, v7}, Lu4/g0;->F(Lu4/g0;Lo4/b;)Lo4/b;

    iget-object v6, v1, Lu4/g0$a;->c:Lo5/l0;

    iget-object v7, v1, Lu4/g0$a;->n:Lu4/g0;

    invoke-static {v7}, Lu4/g0;->E(Lu4/g0;)Lo4/b;

    move-result-object v7

    if-eqz v7, :cond_1

    iget-object v7, v1, Lu4/g0$a;->n:Lu4/g0;

    invoke-static {v7}, Lu4/g0;->E(Lu4/g0;)Lo4/b;

    move-result-object v7

    iget v7, v7, Lo4/b;->m:I

    const/4 v8, -0x1

    if-eq v7, v8, :cond_1

    new-instance v6, Lu4/m;

    iget-object v7, v1, Lu4/g0$a;->c:Lo5/l0;

    iget-object v8, v1, Lu4/g0$a;->n:Lu4/g0;

    invoke-static {v8}, Lu4/g0;->E(Lu4/g0;)Lo4/b;

    move-result-object v8

    iget v8, v8, Lo4/b;->m:I

    invoke-direct {v6, v7, v8, v1}, Lu4/m;-><init>(Lo5/j;ILu4/m$a;)V

    iget-object v7, v1, Lu4/g0$a;->n:Lu4/g0;

    invoke-virtual {v7}, Lu4/g0;->N()Lx3/b0;

    move-result-object v7

    iput-object v7, v1, Lu4/g0$a;->l:Lx3/b0;

    invoke-static {}, Lu4/g0;->G()Ls3/m1;

    move-result-object v8

    invoke-interface {v7, v8}, Lx3/b0;->b(Ls3/m1;)V

    :cond_1
    move-object v8, v6

    iget-object v7, v1, Lu4/g0$a;->d:Lu4/b0;

    iget-object v9, v1, Lu4/g0$a;->b:Landroid/net/Uri;

    iget-object v6, v1, Lu4/g0$a;->c:Lo5/l0;

    invoke-virtual {v6}, Lo5/l0;->j()Ljava/util/Map;

    move-result-object v10

    iget-object v6, v1, Lu4/g0$a;->e:Lx3/m;

    move-wide v11, v13

    move-wide v4, v13

    move-wide v13, v15

    move-object v15, v6

    invoke-interface/range {v7 .. v15}, Lu4/b0;->e(Lo5/h;Landroid/net/Uri;Ljava/util/Map;JJLx3/m;)V

    iget-object v6, v1, Lu4/g0$a;->n:Lu4/g0;

    invoke-static {v6}, Lu4/g0;->E(Lu4/g0;)Lo4/b;

    move-result-object v6

    if-eqz v6, :cond_2

    iget-object v6, v1, Lu4/g0$a;->d:Lu4/b0;

    invoke-interface {v6}, Lu4/b0;->g()V

    :cond_2
    iget-boolean v6, v1, Lu4/g0$a;->i:Z

    if-eqz v6, :cond_3

    iget-object v6, v1, Lu4/g0$a;->d:Lu4/b0;

    iget-wide v7, v1, Lu4/g0$a;->j:J

    invoke-interface {v6, v4, v5, v7, v8}, Lu4/b0;->c(JJ)V

    iput-boolean v0, v1, Lu4/g0$a;->i:Z

    :cond_3
    :goto_1
    move-wide v13, v4

    :cond_4
    if-nez v2, :cond_5

    iget-boolean v4, v1, Lu4/g0$a;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_5

    :try_start_1
    iget-object v4, v1, Lu4/g0$a;->f:Lp5/g;

    invoke-virtual {v4}, Lp5/g;->a()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v4, v1, Lu4/g0$a;->d:Lu4/b0;

    iget-object v5, v1, Lu4/g0$a;->g:Lx3/y;

    invoke-interface {v4, v5}, Lu4/b0;->d(Lx3/y;)I

    move-result v2

    iget-object v4, v1, Lu4/g0$a;->d:Lu4/b0;

    invoke-interface {v4}, Lu4/b0;->f()J

    move-result-wide v4

    iget-object v6, v1, Lu4/g0$a;->n:Lu4/g0;

    invoke-static {v6}, Lu4/g0;->H(Lu4/g0;)J

    move-result-wide v6

    add-long/2addr v6, v13

    cmp-long v6, v4, v6

    if-lez v6, :cond_4

    iget-object v6, v1, Lu4/g0$a;->f:Lp5/g;

    invoke-virtual {v6}, Lp5/g;->c()Z

    iget-object v6, v1, Lu4/g0$a;->n:Lu4/g0;

    invoke-static {v6}, Lu4/g0;->z(Lu4/g0;)Landroid/os/Handler;

    move-result-object v6

    iget-object v7, v1, Lu4/g0$a;->n:Lu4/g0;

    invoke-static {v7}, Lu4/g0;->y(Lu4/g0;)Ljava/lang/Runnable;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :catch_0
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_5
    if-ne v2, v3, :cond_6

    move v2, v0

    goto :goto_2

    :cond_6
    iget-object v3, v1, Lu4/g0$a;->d:Lu4/b0;

    invoke-interface {v3}, Lu4/b0;->f()J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v3, v3, v5

    if-eqz v3, :cond_7

    iget-object v3, v1, Lu4/g0$a;->g:Lx3/y;

    iget-object v4, v1, Lu4/g0$a;->d:Lu4/b0;

    invoke-interface {v4}, Lu4/b0;->f()J

    move-result-wide v4

    iput-wide v4, v3, Lx3/y;->a:J

    :cond_7
    :goto_2
    iget-object v3, v1, Lu4/g0$a;->c:Lo5/l0;

    invoke-static {v3}, Lo5/m;->a(Lo5/j;)V

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    if-eq v2, v3, :cond_8

    iget-object v2, v1, Lu4/g0$a;->d:Lu4/b0;

    invoke-interface {v2}, Lu4/b0;->f()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-eqz v2, :cond_8

    iget-object v2, v1, Lu4/g0$a;->g:Lx3/y;

    iget-object v3, v1, Lu4/g0$a;->d:Lu4/b0;

    invoke-interface {v3}, Lu4/b0;->f()J

    move-result-wide v3

    iput-wide v3, v2, Lx3/y;->a:J

    :cond_8
    iget-object v2, v1, Lu4/g0$a;->c:Lo5/l0;

    invoke-static {v2}, Lo5/m;->a(Lo5/j;)V

    throw v0

    :cond_9
    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu4/g0$a;->h:Z

    return-void
.end method

.method public final i(J)Lo5/n;
    .locals 2

    new-instance v0, Lo5/n$b;

    invoke-direct {v0}, Lo5/n$b;-><init>()V

    iget-object v1, p0, Lu4/g0$a;->b:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Lo5/n$b;->i(Landroid/net/Uri;)Lo5/n$b;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo5/n$b;->h(J)Lo5/n$b;

    move-result-object p1

    iget-object p2, p0, Lu4/g0$a;->n:Lu4/g0;

    invoke-static {p2}, Lu4/g0;->C(Lu4/g0;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lo5/n$b;->f(Ljava/lang/String;)Lo5/n$b;

    move-result-object p1

    const/4 p2, 0x6

    invoke-virtual {p1, p2}, Lo5/n$b;->b(I)Lo5/n$b;

    move-result-object p1

    invoke-static {}, Lu4/g0;->B()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p1, p2}, Lo5/n$b;->e(Ljava/util/Map;)Lo5/n$b;

    move-result-object p1

    invoke-virtual {p1}, Lo5/n$b;->a()Lo5/n;

    move-result-object p1

    return-object p1
.end method

.method public final j(JJ)V
    .locals 1

    iget-object v0, p0, Lu4/g0$a;->g:Lx3/y;

    iput-wide p1, v0, Lx3/y;->a:J

    iput-wide p3, p0, Lu4/g0$a;->j:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu4/g0$a;->i:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lu4/g0$a;->m:Z

    return-void
.end method
