.class public Lub/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lub/a$c;,
        Lub/a$b;
    }
.end annotation


# static fields
.field public static final b:Ljava/lang/String; = "a"

.field public static final c:Lwb/e;

.field public static volatile d:Lub/a;


# instance fields
.field public a:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lub/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lwb/e;

    invoke-direct {v1, v0}, Lwb/e;-><init>(Ljava/lang/String;)V

    sput-object v1, Lub/a;->c:Lwb/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    add-int/lit8 v3, v0, 0x1

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v8, Lub/a$b;

    const/4 v1, 0x0

    invoke-direct {v8, p0, v1}, Lub/a$b;-><init>(Lub/a;Lub/a$a;)V

    const-wide/16 v4, 0x3c

    move-object v1, v0

    move v2, v3

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v0, p0, Lub/a;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lub/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic b()Lwb/e;
    .locals 1

    sget-object v0, Lub/a;->c:Lwb/e;

    return-object v0
.end method

.method public static c()Lub/a;
    .locals 2

    sget-object v0, Lub/a;->d:Lub/a;

    if-nez v0, :cond_1

    const-class v0, Lub/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lub/a;->d:Lub/a;

    if-nez v1, :cond_0

    new-instance v1, Lub/a;

    invoke-direct {v1}, Lub/a;-><init>()V

    sput-object v1, Lub/a;->d:Lub/a;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lub/a;->d:Lub/a;

    return-object v0
.end method

.method public static d(Ljava/lang/String;)Lub/c$b;
    .locals 1

    new-instance v0, Lub/c$b;

    invoke-direct {v0, p0}, Lub/c$b;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public e(Lub/c;)Ljava/util/concurrent/Future;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/c;",
            ")",
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lub/a$c;

    iget-object v1, p1, Lub/c;->l:Landroid/os/Handler;

    iget-object v2, p1, Lub/c;->k:Lub/b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lub/a$c;-><init>(Landroid/os/Handler;Lub/b;Lub/a$a;)V

    iget-object v1, p0, Lub/a;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v2, Lub/a$a;

    invoke-direct {v2, p0, v0, p1}, Lub/a$a;-><init>(Lub/a;Lub/b;Lub/c;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method
