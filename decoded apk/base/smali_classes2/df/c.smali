.class public final Ldf/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field public static final b:Landroid/os/Handler;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    const-string v1, "newCachedThreadPool()"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Ldf/c;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Ldf/c;->b:Landroid/os/Handler;

    return-void
.end method

.method public static final a()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Ldf/c;->a:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public static final b()Landroid/os/Handler;
    .locals 1

    sget-object v0, Ldf/c;->b:Landroid/os/Handler;

    return-object v0
.end method
