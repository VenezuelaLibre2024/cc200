.class public final Lg9/u0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lg9/u0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/SharedPreferences;

.field public b:Lg9/r0;

.field public final c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lg9/u0;->c:Ljava/util/concurrent/Executor;

    iput-object p1, p0, Lg9/u0;->a:Landroid/content/SharedPreferences;

    return-void
.end method

.method public static declared-synchronized b(Landroid/content/Context;Ljava/util/concurrent/Executor;)Lg9/u0;
    .locals 3

    const-class v0, Lg9/u0;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lg9/u0;->d:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg9/u0;

    :cond_0
    if-nez v1, :cond_1

    const-string v1, "com.google.android.gms.appid"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    new-instance v1, Lg9/u0;

    invoke-direct {v1, p0, p1}, Lg9/u0;-><init>(Landroid/content/SharedPreferences;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v1}, Lg9/u0;->d()V

    new-instance p0, Ljava/lang/ref/WeakReference;

    invoke-direct {p0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object p0, Lg9/u0;->d:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public declared-synchronized a(Lg9/t0;)Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg9/u0;->b:Lg9/r0;

    invoke-virtual {p1}, Lg9/t0;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg9/r0;->b(Ljava/lang/String;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized c()Lg9/t0;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg9/u0;->b:Lg9/r0;

    invoke-virtual {v0}, Lg9/r0;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lg9/t0;->a(Ljava/lang/String;)Lg9/t0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized d()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg9/u0;->a:Landroid/content/SharedPreferences;

    const-string v1, "topic_operation_queue"

    const-string v2, ","

    iget-object v3, p0, Lg9/u0;->c:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2, v3}, Lg9/r0;->d(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/concurrent/Executor;)Lg9/r0;

    move-result-object v0

    iput-object v0, p0, Lg9/u0;->b:Lg9/r0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized e(Lg9/t0;)Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg9/u0;->b:Lg9/r0;

    invoke-virtual {p1}, Lg9/t0;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg9/r0;->g(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
