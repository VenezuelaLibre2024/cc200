.class public Lxe/f$l;
.super Lse/b;
.source ""

# interfaces
.implements Lxe/h$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "l"
.end annotation


# instance fields
.field public final i:Lxe/h;

.field public final synthetic j:Lxe/f;


# direct methods
.method public constructor <init>(Lxe/f;Lxe/h;)V
    .locals 2

    iput-object p1, p0, Lxe/f$l;->j:Lxe/f;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object p1, p1, Lxe/f;->k:Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "OkHttp %s"

    invoke-direct {p0, p1, v0}, Lse/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object p2, p0, Lxe/f$l;->i:Lxe/h;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(ZIILjava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZII",
            "Ljava/util/List<",
            "Lxe/c;",
            ">;)V"
        }
    .end annotation

    iget-object p3, p0, Lxe/f$l;->j:Lxe/f;

    invoke-virtual {p3, p2}, Lxe/f;->s0(I)Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, Lxe/f$l;->j:Lxe/f;

    invoke-virtual {p3, p2, p4, p1}, Lxe/f;->l0(ILjava/util/List;Z)V

    return-void

    :cond_0
    iget-object p3, p0, Lxe/f$l;->j:Lxe/f;

    monitor-enter p3

    :try_start_0
    iget-object v0, p0, Lxe/f$l;->j:Lxe/f;

    invoke-virtual {v0, p2}, Lxe/f;->b0(I)Lxe/i;

    move-result-object v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lxe/f$l;->j:Lxe/f;

    invoke-static {v0}, Lxe/f;->n(Lxe/f;)Z

    move-result v0

    if-eqz v0, :cond_1

    monitor-exit p3

    return-void

    :cond_1
    iget-object v0, p0, Lxe/f$l;->j:Lxe/f;

    iget v1, v0, Lxe/f;->l:I

    if-gt p2, v1, :cond_2

    monitor-exit p3

    return-void

    :cond_2
    rem-int/lit8 v1, p2, 0x2

    iget v0, v0, Lxe/f;->m:I

    const/4 v2, 0x2

    rem-int/2addr v0, v2

    if-ne v1, v0, :cond_3

    monitor-exit p3

    return-void

    :cond_3
    invoke-static {p4}, Lse/e;->J(Ljava/util/List;)Lre/u;

    move-result-object v8

    new-instance p4, Lxe/i;

    iget-object v5, p0, Lxe/f$l;->j:Lxe/f;

    const/4 v6, 0x0

    move-object v3, p4

    move v4, p2

    move v7, p1

    invoke-direct/range {v3 .. v8}, Lxe/i;-><init>(ILxe/f;ZZLre/u;)V

    iget-object p1, p0, Lxe/f$l;->j:Lxe/f;

    iput p2, p1, Lxe/f;->l:I

    iget-object p1, p1, Lxe/f;->j:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lxe/f;->x()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance v0, Lxe/f$l$a;

    const-string v1, "OkHttp %s stream %d"

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lxe/f$l;->j:Lxe/f;

    iget-object v4, v4, Lxe/f;->k:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v2, v3

    invoke-direct {v0, p0, v1, v2, p4}, Lxe/f$l$a;-><init>(Lxe/f$l;Ljava/lang/String;[Ljava/lang/Object;Lxe/i;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    monitor-exit p3

    return-void

    :cond_4
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p4}, Lse/e;->J(Ljava/util/List;)Lre/u;

    move-result-object p2

    invoke-virtual {v0, p2, p1}, Lxe/i;->n(Lre/u;Z)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public c(ILxe/b;Lbf/f;)V
    .locals 3

    invoke-virtual {p3}, Lbf/f;->u()I

    iget-object p2, p0, Lxe/f$l;->j:Lxe/f;

    monitor-enter p2

    :try_start_0
    iget-object p3, p0, Lxe/f$l;->j:Lxe/f;

    iget-object p3, p3, Lxe/f;->j:Ljava/util/Map;

    invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p3

    iget-object v0, p0, Lxe/f$l;->j:Lxe/f;

    iget-object v0, v0, Lxe/f;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    new-array v0, v0, [Lxe/i;

    invoke-interface {p3, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Lxe/i;

    iget-object v0, p0, Lxe/f$l;->j:Lxe/f;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lxe/f;->w(Lxe/f;Z)Z

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    array-length p2, p3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_1

    aget-object v1, p3, v0

    invoke-virtual {v1}, Lxe/i;->g()I

    move-result v2

    if-le v2, p1, :cond_0

    invoke-virtual {v1}, Lxe/i;->j()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lxe/b;->m:Lxe/b;

    invoke-virtual {v1, v2}, Lxe/i;->o(Lxe/b;)V

    iget-object v2, p0, Lxe/f$l;->j:Lxe/f;

    invoke-virtual {v1}, Lxe/i;->g()I

    move-result v1

    invoke-virtual {v2, v1}, Lxe/f;->u0(I)Lxe/i;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public d(IJ)V
    .locals 3

    iget-object v0, p0, Lxe/f$l;->j:Lxe/f;

    if-nez p1, :cond_0

    monitor-enter v0

    :try_start_0
    iget-object p1, p0, Lxe/f$l;->j:Lxe/f;

    iget-wide v1, p1, Lxe/f;->z:J

    add-long/2addr v1, p2

    iput-wide v1, p1, Lxe/f;->z:J

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    invoke-virtual {v0, p1}, Lxe/f;->b0(I)Lxe/i;

    move-result-object p1

    if-eqz p1, :cond_1

    monitor-enter p1

    :try_start_1
    invoke-virtual {p1, p2, p3}, Lxe/i;->a(J)V

    monitor-exit p1

    goto :goto_0

    :catchall_1
    move-exception p2

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p2

    :cond_1
    :goto_0
    return-void
.end method

.method public e(ILxe/b;)V
    .locals 1

    iget-object v0, p0, Lxe/f$l;->j:Lxe/f;

    invoke-virtual {v0, p1}, Lxe/f;->s0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxe/f$l;->j:Lxe/f;

    invoke-virtual {v0, p1, p2}, Lxe/f;->r0(ILxe/b;)V

    return-void

    :cond_0
    iget-object v0, p0, Lxe/f$l;->j:Lxe/f;

    invoke-virtual {v0, p1}, Lxe/f;->u0(I)Lxe/i;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, p2}, Lxe/i;->o(Lxe/b;)V

    :cond_1
    return-void
.end method

.method public f(ZILbf/e;I)V
    .locals 2

    iget-object v0, p0, Lxe/f$l;->j:Lxe/f;

    invoke-virtual {v0, p2}, Lxe/f;->s0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxe/f$l;->j:Lxe/f;

    invoke-virtual {v0, p2, p3, p4, p1}, Lxe/f;->h0(ILbf/e;IZ)V

    return-void

    :cond_0
    iget-object v0, p0, Lxe/f$l;->j:Lxe/f;

    invoke-virtual {v0, p2}, Lxe/f;->b0(I)Lxe/i;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lxe/f$l;->j:Lxe/f;

    sget-object v0, Lxe/b;->j:Lxe/b;

    invoke-virtual {p1, p2, v0}, Lxe/f;->L0(ILxe/b;)V

    iget-object p1, p0, Lxe/f$l;->j:Lxe/f;

    int-to-long v0, p4

    invoke-virtual {p1, v0, v1}, Lxe/f;->G0(J)V

    invoke-interface {p3, v0, v1}, Lbf/e;->e(J)V

    return-void

    :cond_1
    invoke-virtual {v0, p3, p4}, Lxe/i;->m(Lbf/e;I)V

    if-eqz p1, :cond_2

    sget-object p1, Lse/e;->c:Lre/u;

    const/4 p2, 0x1

    invoke-virtual {v0, p1, p2}, Lxe/i;->n(Lre/u;Z)V

    :cond_2
    return-void
.end method

.method public g(ZII)V
    .locals 3

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lxe/f$l;->j:Lxe/f;

    monitor-enter p1

    if-ne p2, v0, :cond_0

    :try_start_0
    iget-object p2, p0, Lxe/f$l;->j:Lxe/f;

    invoke-static {p2}, Lxe/f;->f(Lxe/f;)J

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    const/4 p3, 0x2

    if-ne p2, p3, :cond_1

    iget-object p2, p0, Lxe/f$l;->j:Lxe/f;

    invoke-static {p2}, Lxe/f;->I(Lxe/f;)J

    goto :goto_0

    :cond_1
    const/4 p3, 0x3

    if-ne p2, p3, :cond_2

    iget-object p2, p0, Lxe/f$l;->j:Lxe/f;

    invoke-static {p2}, Lxe/f;->K(Lxe/f;)J

    iget-object p2, p0, Lxe/f$l;->j:Lxe/f;

    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    :cond_2
    :goto_0
    monitor-exit p1

    goto :goto_2

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    :cond_3
    :try_start_1
    iget-object p1, p0, Lxe/f$l;->j:Lxe/f;

    invoke-static {p1}, Lxe/f;->E(Lxe/f;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    new-instance v1, Lxe/f$k;

    iget-object v2, p0, Lxe/f$l;->j:Lxe/f;

    invoke-direct {v1, v2, v0, p2, p3}, Lxe/f$k;-><init>(Lxe/f;ZII)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :goto_2
    return-void
.end method

.method public h(IIIZ)V
    .locals 0

    return-void
.end method

.method public i(ZLxe/m;)V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lxe/f$l;->j:Lxe/f;

    invoke-static {v0}, Lxe/f;->E(Lxe/f;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v7, Lxe/f$l$b;

    const-string v3, "OkHttp %s ACK Settings"

    const/4 v1, 0x1

    new-array v4, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lxe/f$l;->j:Lxe/f;

    iget-object v2, v2, Lxe/f;->k:Ljava/lang/String;

    aput-object v2, v4, v1

    move-object v1, v7

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lxe/f$l$b;-><init>(Lxe/f$l;Ljava/lang/String;[Ljava/lang/Object;ZLxe/m;)V

    invoke-interface {v0, v7}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public j(IILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lxe/c;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lxe/f$l;->j:Lxe/f;

    invoke-virtual {p1, p2, p3}, Lxe/f;->n0(ILjava/util/List;)V

    return-void
.end method

.method public k()V
    .locals 5

    sget-object v0, Lxe/b;->k:Lxe/b;

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lxe/f$l;->i:Lxe/h;

    invoke-virtual {v2, p0}, Lxe/h;->f(Lxe/h$b;)V

    :goto_0
    iget-object v2, p0, Lxe/f$l;->i:Lxe/h;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, p0}, Lxe/h;->d(ZLxe/h$b;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, Lxe/b;->i:Lxe/b;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v0, Lxe/b;->n:Lxe/b;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object v3, p0, Lxe/f$l;->j:Lxe/f;

    invoke-virtual {v3, v2, v0, v1}, Lxe/f;->P(Lxe/b;Lxe/b;Ljava/io/IOException;)V

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_1

    :catchall_0
    move-exception v3

    move-object v2, v0

    goto :goto_3

    :catch_1
    move-exception v1

    move-object v2, v0

    :goto_1
    :try_start_2
    sget-object v0, Lxe/b;->j:Lxe/b;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v2, p0, Lxe/f$l;->j:Lxe/f;

    invoke-virtual {v2, v0, v0, v1}, Lxe/f;->P(Lxe/b;Lxe/b;Ljava/io/IOException;)V

    :goto_2
    iget-object v0, p0, Lxe/f$l;->i:Lxe/h;

    invoke-static {v0}, Lse/e;->f(Ljava/io/Closeable;)V

    return-void

    :catchall_1
    move-exception v3

    :goto_3
    iget-object v4, p0, Lxe/f$l;->j:Lxe/f;

    invoke-virtual {v4, v2, v0, v1}, Lxe/f;->P(Lxe/b;Lxe/b;Ljava/io/IOException;)V

    iget-object v0, p0, Lxe/f$l;->i:Lxe/h;

    invoke-static {v0}, Lse/e;->f(Ljava/io/Closeable;)V

    throw v3
.end method

.method public l(ZLxe/m;)V
    .locals 5

    iget-object v0, p0, Lxe/f$l;->j:Lxe/f;

    iget-object v0, v0, Lxe/f;->D:Lxe/j;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lxe/f$l;->j:Lxe/f;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget-object v2, p0, Lxe/f$l;->j:Lxe/f;

    iget-object v2, v2, Lxe/f;->B:Lxe/m;

    invoke-virtual {v2}, Lxe/m;->d()I

    move-result v2

    if-eqz p1, :cond_0

    iget-object p1, p0, Lxe/f$l;->j:Lxe/f;

    iget-object p1, p1, Lxe/f;->B:Lxe/m;

    invoke-virtual {p1}, Lxe/m;->a()V

    :cond_0
    iget-object p1, p0, Lxe/f$l;->j:Lxe/f;

    iget-object p1, p1, Lxe/f;->B:Lxe/m;

    invoke-virtual {p1, p2}, Lxe/m;->h(Lxe/m;)V

    iget-object p1, p0, Lxe/f$l;->j:Lxe/f;

    iget-object p1, p1, Lxe/f;->B:Lxe/m;

    invoke-virtual {p1}, Lxe/m;->d()I

    move-result p1

    const/4 p2, -0x1

    const/4 v3, 0x0

    if-eq p1, p2, :cond_1

    if-eq p1, v2, :cond_1

    sub-int/2addr p1, v2

    int-to-long p1, p1

    iget-object v2, p0, Lxe/f$l;->j:Lxe/f;

    iget-object v2, v2, Lxe/f;->j:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lxe/f$l;->j:Lxe/f;

    iget-object v2, v2, Lxe/f;->j:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    iget-object v3, p0, Lxe/f$l;->j:Lxe/f;

    iget-object v3, v3, Lxe/f;->j:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    new-array v3, v3, [Lxe/i;

    invoke-interface {v2, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lxe/i;

    move-object v3, v2

    goto :goto_0

    :cond_1
    const-wide/16 p1, 0x0

    :cond_2
    :goto_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v1, p0, Lxe/f$l;->j:Lxe/f;

    iget-object v2, v1, Lxe/f;->D:Lxe/j;

    iget-object v1, v1, Lxe/f;->B:Lxe/m;

    invoke-virtual {v2, v1}, Lxe/j;->a(Lxe/m;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_3
    iget-object v2, p0, Lxe/f$l;->j:Lxe/f;

    invoke-static {v2, v1}, Lxe/f;->a(Lxe/f;Ljava/io/IOException;)V

    :goto_1
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const/4 v0, 0x0

    if-eqz v3, :cond_3

    array-length v1, v3

    move v2, v0

    :goto_2
    if-ge v2, v1, :cond_3

    aget-object v4, v3, v2

    monitor-enter v4

    :try_start_4
    invoke-virtual {v4, p1, p2}, Lxe/i;->a(J)V

    monitor-exit v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :catchall_0
    move-exception p1

    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1

    :cond_3
    invoke-static {}, Lxe/f;->x()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance p2, Lxe/f$l$c;

    const-string v1, "OkHttp %s settings"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lxe/f$l;->j:Lxe/f;

    iget-object v3, v3, Lxe/f;->k:Ljava/lang/String;

    aput-object v3, v2, v0

    invoke-direct {p2, p0, v1, v2}, Lxe/f$l$c;-><init>(Lxe/f$l;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_1
    move-exception p1

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw p1
.end method
