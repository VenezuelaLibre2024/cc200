.class public final Lk8/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk8/e$b;
    }
.end annotation


# instance fields
.field public final a:D

.field public final b:D

.field public final c:J

.field public final d:J

.field public final e:I

.field public final f:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final h:Ld3/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld3/h<",
            "Lg8/f0;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Le8/g0;

.field public j:I

.field public k:J


# direct methods
.method public constructor <init>(DDJLd3/h;Le8/g0;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ThreadPoolCreation"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDJ",
            "Ld3/h<",
            "Lg8/f0;",
            ">;",
            "Le8/g0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lk8/e;->a:D

    iput-wide p3, p0, Lk8/e;->b:D

    iput-wide p5, p0, Lk8/e;->c:J

    iput-object p7, p0, Lk8/e;->h:Ld3/h;

    iput-object p8, p0, Lk8/e;->i:Le8/g0;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p3

    iput-wide p3, p0, Lk8/e;->d:J

    double-to-int p1, p1

    iput p1, p0, Lk8/e;->e:I

    new-instance p8, Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-direct {p8, p1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object p8, p0, Lk8/e;->f:Ljava/util/concurrent/BlockingQueue;

    new-instance p1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object p7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 p3, 0x1

    const/4 p4, 0x1

    const-wide/16 p5, 0x0

    move-object p2, p1

    invoke-direct/range {p2 .. p8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object p1, p0, Lk8/e;->g:Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 p1, 0x0

    iput p1, p0, Lk8/e;->j:I

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lk8/e;->k:J

    return-void
.end method

.method public constructor <init>(Ld3/h;Ll8/d;Le8/g0;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld3/h<",
            "Lg8/f0;",
            ">;",
            "Ll8/d;",
            "Le8/g0;",
            ")V"
        }
    .end annotation

    iget-wide v1, p2, Ll8/d;->f:D

    iget-wide v3, p2, Ll8/d;->g:D

    iget p2, p2, Ll8/d;->h:I

    int-to-long v5, p2

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    move-object v0, p0

    move-object v7, p1

    move-object v8, p3

    invoke-direct/range {v0 .. v8}, Lk8/e;-><init>(DDJLd3/h;Le8/g0;)V

    return-void
.end method

.method public static synthetic a(Lk8/e;Lcom/google/android/gms/tasks/TaskCompletionSource;ZLe8/u;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lk8/e;->n(Lcom/google/android/gms/tasks/TaskCompletionSource;ZLe8/u;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic b(Lk8/e;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-direct {p0, p1}, Lk8/e;->m(Ljava/util/concurrent/CountDownLatch;)V

    return-void
.end method

.method public static synthetic c(Lk8/e;Le8/u;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lk8/e;->p(Le8/u;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public static synthetic d(Lk8/e;)Le8/g0;
    .locals 0

    iget-object p0, p0, Lk8/e;->i:Le8/g0;

    return-object p0
.end method

.method public static synthetic e(Lk8/e;)D
    .locals 2

    invoke-virtual {p0}, Lk8/e;->g()D

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic f(D)V
    .locals 0

    invoke-static {p0, p1}, Lk8/e;->q(D)V

    return-void
.end method

.method private synthetic m(Ljava/util/concurrent/CountDownLatch;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lk8/e;->h:Ld3/h;

    sget-object v1, Ld3/e;->j:Ld3/e;

    invoke-static {v0, v1}, Lg3/l;->a(Ld3/h;Ld3/e;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method private synthetic n(Lcom/google/android/gms/tasks/TaskCompletionSource;ZLe8/u;Ljava/lang/Exception;)V
    .locals 0

    if-eqz p4, :cond_0

    invoke-virtual {p1, p4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    return-void

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lk8/e;->j()V

    :cond_1
    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    return-void
.end method

.method public static q(D)V
    .locals 0

    double-to-long p0, p0

    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public final g()D
    .locals 6

    iget-wide v0, p0, Lk8/e;->a:D

    const-wide v2, 0x40ed4c0000000000L    # 60000.0

    div-double/2addr v2, v0

    iget-wide v0, p0, Lk8/e;->b:D

    invoke-virtual {p0}, Lk8/e;->h()I

    move-result v4

    int-to-double v4, v4

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    mul-double/2addr v2, v0

    const-wide v0, 0x414b774000000000L    # 3600000.0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    return-wide v0
.end method

.method public final h()I
    .locals 4

    iget-wide v0, p0, Lk8/e;->k:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lk8/e;->o()J

    move-result-wide v0

    iput-wide v0, p0, Lk8/e;->k:J

    :cond_0
    invoke-virtual {p0}, Lk8/e;->o()J

    move-result-wide v0

    iget-wide v2, p0, Lk8/e;->k:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lk8/e;->c:J

    div-long/2addr v0, v2

    long-to-int v0, v0

    invoke-virtual {p0}, Lk8/e;->l()Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x64

    iget v2, p0, Lk8/e;->j:I

    add-int/2addr v2, v0

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    iget v2, p0, Lk8/e;->j:I

    sub-int/2addr v2, v0

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    :goto_0
    iget v1, p0, Lk8/e;->j:I

    if-eq v1, v0, :cond_2

    iput v0, p0, Lk8/e;->j:I

    invoke-virtual {p0}, Lk8/e;->o()J

    move-result-wide v1

    iput-wide v1, p0, Lk8/e;->k:J

    :cond_2
    return v0
.end method

.method public i(Le8/u;Z)Lcom/google/android/gms/tasks/TaskCompletionSource;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le8/u;",
            "Z)",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Le8/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk8/e;->f:Ljava/util/concurrent/BlockingQueue;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    if-eqz p2, :cond_1

    iget-object p2, p0, Lk8/e;->i:Le8/g0;

    invoke-virtual {p2}, Le8/g0;->d()V

    invoke-virtual {p0}, Lk8/e;->k()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enqueueing report: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Le8/u;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Lb8/g;->b(Ljava/lang/String;)V

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Queue size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lk8/e;->f:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v3}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Lb8/g;->b(Ljava/lang/String;)V

    iget-object p2, p0, Lk8/e;->g:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v2, Lk8/e$b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v1, v3}, Lk8/e$b;-><init>(Lk8/e;Le8/u;Lcom/google/android/gms/tasks/TaskCompletionSource;Lk8/e$a;)V

    invoke-virtual {p2, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Closing task for report: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Le8/u;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Lb8/g;->b(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    monitor-exit v0

    return-object v1

    :cond_0
    invoke-virtual {p0}, Lk8/e;->h()I

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Dropping report due to queue being full: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Le8/u;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Lb8/g;->b(Ljava/lang/String;)V

    iget-object p2, p0, Lk8/e;->i:Le8/g0;

    invoke-virtual {p2}, Le8/g0;->c()V

    invoke-virtual {v1, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    monitor-exit v0

    return-object v1

    :cond_1
    invoke-virtual {p0, p1, v1}, Lk8/e;->p(Le8/u;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public j()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DiscouragedApi",
            "ThreadPoolCreation"
        }
    .end annotation

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lk8/d;

    invoke-direct {v2, p0, v0}, Lk8/d;-><init>(Lk8/e;Ljava/util/concurrent/CountDownLatch;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2

    invoke-static {v0, v2, v3, v1}, Le8/q0;->g(Ljava/util/concurrent/CountDownLatch;JLjava/util/concurrent/TimeUnit;)Z

    return-void
.end method

.method public final k()Z
    .locals 2

    iget-object v0, p0, Lk8/e;->f:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v0

    iget v1, p0, Lk8/e;->e:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final l()Z
    .locals 2

    iget-object v0, p0, Lk8/e;->f:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v0

    iget v1, p0, Lk8/e;->e:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final o()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final p(Le8/u;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le8/u;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Le8/u;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sending report through Google DataTransport: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Le8/u;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb8/g;->b(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lk8/e;->d:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lk8/e;->h:Ld3/h;

    invoke-virtual {p1}, Le8/u;->b()Lg8/f0;

    move-result-object v2

    invoke-static {v2}, Ld3/d;->g(Ljava/lang/Object;)Ld3/d;

    move-result-object v2

    new-instance v3, Lk8/c;

    invoke-direct {v3, p0, p2, v0, p1}, Lk8/c;-><init>(Lk8/e;Lcom/google/android/gms/tasks/TaskCompletionSource;ZLe8/u;)V

    invoke-interface {v1, v2, v3}, Ld3/h;->b(Ld3/d;Ld3/j;)V

    return-void
.end method
