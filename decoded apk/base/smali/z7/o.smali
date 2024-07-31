.class public Lz7/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/ScheduledExecutorService;


# instance fields
.field public final h:Ljava/util/concurrent/ExecutorService;

.field public final i:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz7/o;->h:Ljava/util/concurrent/ExecutorService;

    iput-object p2, p0, Lz7/o;->i:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public static synthetic a(Lz7/o;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lz7/p$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lz7/o;->p(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lz7/p$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Runnable;Lz7/p$b;)V
    .locals 0

    invoke-static {p0, p1}, Lz7/o;->n(Ljava/lang/Runnable;Lz7/p$b;)V

    return-void
.end method

.method public static synthetic c(Lz7/o;Ljava/lang/Runnable;Lz7/p$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz7/o;->o(Ljava/lang/Runnable;Lz7/p$b;)V

    return-void
.end method

.method public static synthetic d(Lz7/o;Ljava/util/concurrent/Callable;Lz7/p$b;)Ljava/util/concurrent/Future;
    .locals 0

    invoke-direct {p0, p1, p2}, Lz7/o;->r(Ljava/util/concurrent/Callable;Lz7/p$b;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lz7/o;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;Lz7/p$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    invoke-direct/range {p0 .. p7}, Lz7/o;->v(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;Lz7/p$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lz7/o;Ljava/lang/Runnable;Lz7/p$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz7/o;->u(Ljava/lang/Runnable;Lz7/p$b;)V

    return-void
.end method

.method public static synthetic h(Lz7/o;Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;Lz7/p$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lz7/o;->s(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;Lz7/p$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/Runnable;Lz7/p$b;)V
    .locals 0

    invoke-static {p0, p1}, Lz7/o;->t(Ljava/lang/Runnable;Lz7/p$b;)V

    return-void
.end method

.method public static synthetic j(Lz7/o;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;Lz7/p$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    invoke-direct/range {p0 .. p7}, Lz7/o;->x(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;Lz7/p$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/lang/Runnable;Lz7/p$b;)V
    .locals 0

    invoke-static {p0, p1}, Lz7/o;->y(Ljava/lang/Runnable;Lz7/p$b;)V

    return-void
.end method

.method public static synthetic l(Lz7/o;Ljava/lang/Runnable;Lz7/p$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz7/o;->w(Ljava/lang/Runnable;Lz7/p$b;)V

    return-void
.end method

.method public static synthetic m(Ljava/util/concurrent/Callable;Lz7/p$b;)V
    .locals 0

    invoke-static {p0, p1}, Lz7/o;->q(Ljava/util/concurrent/Callable;Lz7/p$b;)V

    return-void
.end method

.method public static synthetic n(Ljava/lang/Runnable;Lz7/p$b;)V
    .locals 0

    :try_start_0
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    const/4 p0, 0x0

    invoke-interface {p1, p0}, Lz7/p$b;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-interface {p1, p0}, Lz7/p$b;->a(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic o(Ljava/lang/Runnable;Lz7/p$b;)V
    .locals 2

    iget-object v0, p0, Lz7/o;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lz7/c;

    invoke-direct {v1, p1, p2}, Lz7/c;-><init>(Ljava/lang/Runnable;Lz7/p$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic p(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lz7/p$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 2

    iget-object v0, p0, Lz7/o;->i:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lz7/i;

    invoke-direct {v1, p0, p1, p5}, Lz7/i;-><init>(Lz7/o;Ljava/lang/Runnable;Lz7/p$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic q(Ljava/util/concurrent/Callable;Lz7/p$b;)V
    .locals 0

    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lz7/p$b;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-interface {p1, p0}, Lz7/p$b;->a(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private synthetic r(Ljava/util/concurrent/Callable;Lz7/p$b;)Ljava/util/concurrent/Future;
    .locals 2

    iget-object v0, p0, Lz7/o;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lz7/h;

    invoke-direct {v1, p1, p2}, Lz7/h;-><init>(Ljava/util/concurrent/Callable;Lz7/p$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method

.method private synthetic s(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;Lz7/p$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 2

    iget-object v0, p0, Lz7/o;->i:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lz7/l;

    invoke-direct {v1, p0, p1, p5}, Lz7/l;-><init>(Lz7/o;Ljava/util/concurrent/Callable;Lz7/p$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic t(Ljava/lang/Runnable;Lz7/p$b;)V
    .locals 0

    :try_start_0
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    invoke-interface {p1, p0}, Lz7/p$b;->a(Ljava/lang/Throwable;)V

    throw p0
.end method

.method private synthetic u(Ljava/lang/Runnable;Lz7/p$b;)V
    .locals 2

    iget-object v0, p0, Lz7/o;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lz7/f;

    invoke-direct {v1, p1, p2}, Lz7/f;-><init>(Ljava/lang/Runnable;Lz7/p$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic v(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;Lz7/p$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 7

    iget-object v0, p0, Lz7/o;->i:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lz7/j;

    invoke-direct {v1, p0, p1, p7}, Lz7/j;-><init>(Lz7/o;Ljava/lang/Runnable;Lz7/p$b;)V

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method

.method private synthetic w(Ljava/lang/Runnable;Lz7/p$b;)V
    .locals 2

    iget-object v0, p0, Lz7/o;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lz7/g;

    invoke-direct {v1, p1, p2}, Lz7/g;-><init>(Ljava/lang/Runnable;Lz7/p$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic x(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;Lz7/p$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 7

    iget-object v0, p0, Lz7/o;->i:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lz7/k;

    invoke-direct {v1, p0, p1, p7}, Lz7/k;-><init>(Lz7/o;Ljava/lang/Runnable;Lz7/p$b;)V

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic y(Ljava/lang/Runnable;Lz7/p$b;)V
    .locals 0

    :try_start_0
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-interface {p1, p0}, Lz7/p$b;->a(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    .locals 1

    iget-object v0, p0, Lz7/o;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1, p2, p3}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    return p1
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lz7/o;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public invokeAll(Ljava/util/Collection;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/concurrent/Callable<",
            "TT;>;>;)",
            "Ljava/util/List<",
            "Ljava/util/concurrent/Future<",
            "TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lz7/o;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->invokeAll(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public invokeAll(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/concurrent/Callable<",
            "TT;>;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/concurrent/Future<",
            "TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lz7/o;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1, p2, p3, p4}, Ljava/util/concurrent/ExecutorService;->invokeAll(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public invokeAny(Ljava/util/Collection;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/concurrent/Callable<",
            "TT;>;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lz7/o;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->invokeAny(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invokeAny(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/concurrent/Callable<",
            "TT;>;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lz7/o;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1, p2, p3, p4}, Ljava/util/concurrent/ExecutorService;->invokeAny(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isShutdown()Z
    .locals 1

    iget-object v0, p0, Lz7/o;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    return v0
.end method

.method public isTerminated()Z
    .locals 1

    iget-object v0, p0, Lz7/o;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    move-result v0

    return v0
.end method

.method public schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lz7/p;

    new-instance v7, Lz7/d;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lz7/d;-><init>(Lz7/o;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V

    invoke-direct {v0, v7}, Lz7/p;-><init>(Lz7/p$c;)V

    return-object v0
.end method

.method public schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TV;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Ljava/util/concurrent/ScheduledFuture<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lz7/p;

    new-instance v7, Lz7/e;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lz7/e;-><init>(Lz7/o;Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)V

    invoke-direct {v0, v7}, Lz7/p;-><init>(Lz7/p$c;)V

    return-object v0
.end method

.method public scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "JJ",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lz7/p;

    new-instance v9, Lz7/m;

    move-object v1, v9

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    move-object/from16 v8, p6

    invoke-direct/range {v1 .. v8}, Lz7/m;-><init>(Lz7/o;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)V

    invoke-direct {v0, v9}, Lz7/p;-><init>(Lz7/p$c;)V

    return-object v0
.end method

.method public scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "JJ",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lz7/p;

    new-instance v9, Lz7/n;

    move-object v1, v9

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    move-object/from16 v8, p6

    invoke-direct/range {v1 .. v8}, Lz7/n;-><init>(Lz7/o;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)V

    invoke-direct {v0, v9}, Lz7/p;-><init>(Lz7/p$c;)V

    return-object v0
.end method

.method public shutdown()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Shutting down is not allowed."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public shutdownNow()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Shutting down is not allowed."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")",
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lz7/o;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method

.method public submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Runnable;",
            "TT;)",
            "Ljava/util/concurrent/Future<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lz7/o;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method

.method public submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Ljava/util/concurrent/Future<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lz7/o;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method
