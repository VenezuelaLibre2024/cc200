.class public final Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;
    }
.end annotation


# instance fields
.field private final executor:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public constructor <init>(I)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1

    move-object v0, v7

    move v1, p1

    move v2, p1

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v7, p0, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;->executor:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public static synthetic a(Ll7/i;Ljava/util/concurrent/Callable;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;->lambda$runInBackground$1(Ll7/i;Ljava/util/concurrent/Callable;)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;Ll7/f;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;->lambda$runInBackground$0(Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;Ll7/f;)V

    return-void
.end method

.method private static synthetic lambda$runInBackground$0(Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;Ll7/f;)V
    .locals 0

    invoke-interface {p0, p1}, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;->run(Ljava/util/concurrent/Future;)V

    return-void
.end method

.method private static synthetic lambda$runInBackground$1(Ll7/i;Ljava/util/concurrent/Callable;)V
    .locals 1

    invoke-virtual {p0}, Ll7/a$j;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll7/i;->B(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0, p1}, Ll7/i;->C(Ljava/lang/Throwable;)Z

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public runInBackground(Ljava/util/concurrent/Callable;)Ll7/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Ll7/f<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, Ll7/i;->D()Ll7/i;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;->executor:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v2, Lio/flutter/plugins/googlesignin/b;

    invoke-direct {v2, v0, p1}, Lio/flutter/plugins/googlesignin/b;-><init>(Ll7/i;Ljava/util/concurrent/Callable;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public runInBackground(Ljava/util/concurrent/Callable;Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;",
            "Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;->runInBackground(Ljava/util/concurrent/Callable;)Ll7/f;

    move-result-object p1

    new-instance v0, Lio/flutter/plugins/googlesignin/a;

    invoke-direct {v0, p2, p1}, Lio/flutter/plugins/googlesignin/a;-><init>(Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;Ll7/f;)V

    invoke-static {}, Lio/flutter/plugins/googlesignin/Executors;->uiThreadExecutor()Ljava/util/concurrent/Executor;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Ll7/f;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method
