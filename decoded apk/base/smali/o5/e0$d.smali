.class public final Lo5/e0$d;
.super Landroid/os/Handler;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "HandlerLeak"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lo5/e0$e;",
        ">",
        "Landroid/os/Handler;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final h:I

.field public final i:Lo5/e0$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final j:J

.field public k:Lo5/e0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo5/e0$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public l:Ljava/io/IOException;

.field public m:I

.field public n:Ljava/lang/Thread;

.field public o:Z

.field public volatile p:Z

.field public final synthetic q:Lo5/e0;


# direct methods
.method public constructor <init>(Lo5/e0;Landroid/os/Looper;Lo5/e0$e;Lo5/e0$b;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Looper;",
            "TT;",
            "Lo5/e0$b<",
            "TT;>;IJ)V"
        }
    .end annotation

    iput-object p1, p0, Lo5/e0$d;->q:Lo5/e0;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p3, p0, Lo5/e0$d;->i:Lo5/e0$e;

    iput-object p4, p0, Lo5/e0$d;->k:Lo5/e0$b;

    iput p5, p0, Lo5/e0$d;->h:I

    iput-wide p6, p0, Lo5/e0$d;->j:J

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 8

    iput-boolean p1, p0, Lo5/e0$d;->p:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lo5/e0$d;->l:Ljava/io/IOException;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    iput-boolean v3, p0, Lo5/e0$d;->o:Z

    invoke-virtual {p0, v1}, Landroid/os/Handler;->removeMessages(I)V

    if-nez p1, :cond_2

    invoke-virtual {p0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    :cond_0
    monitor-enter p0

    :try_start_0
    iput-boolean v3, p0, Lo5/e0$d;->o:Z

    iget-object v1, p0, Lo5/e0$d;->i:Lo5/e0$e;

    invoke-interface {v1}, Lo5/e0$e;->c()V

    iget-object v1, p0, Lo5/e0$d;->n:Ljava/lang/Thread;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lo5/e0$d;->c()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iget-object p1, p0, Lo5/e0$d;->k:Lo5/e0$b;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lo5/e0$b;

    iget-object v2, p0, Lo5/e0$d;->i:Lo5/e0$e;

    iget-wide v5, p0, Lo5/e0$d;->j:J

    sub-long v5, v3, v5

    const/4 v7, 0x1

    invoke-interface/range {v1 .. v7}, Lo5/e0$b;->r(Lo5/e0$e;JJZ)V

    iput-object v0, p0, Lo5/e0$d;->k:Lo5/e0$b;

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final b()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lo5/e0$d;->l:Ljava/io/IOException;

    iget-object v0, p0, Lo5/e0$d;->q:Lo5/e0;

    invoke-static {v0}, Lo5/e0;->e(Lo5/e0;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iget-object v1, p0, Lo5/e0$d;->q:Lo5/e0;

    invoke-static {v1}, Lo5/e0;->b(Lo5/e0;)Lo5/e0$d;

    move-result-object v1

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lo5/e0$d;->q:Lo5/e0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo5/e0;->c(Lo5/e0;Lo5/e0$d;)Lo5/e0$d;

    return-void
.end method

.method public final d()J
    .locals 2

    iget v0, p0, Lo5/e0$d;->m:I

    add-int/lit8 v0, v0, -0x1

    mul-int/lit16 v0, v0, 0x3e8

    const/16 v1, 0x1388

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public e(I)V
    .locals 2

    iget-object v0, p0, Lo5/e0$d;->l:Ljava/io/IOException;

    if-eqz v0, :cond_1

    iget v1, p0, Lo5/e0$d;->m:I

    if-gt v1, p1, :cond_0

    goto :goto_0

    :cond_0
    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public f(J)V
    .locals 4

    iget-object v0, p0, Lo5/e0$d;->q:Lo5/e0;

    invoke-static {v0}, Lo5/e0;->b(Lo5/e0;)Lo5/e0$d;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Lp5/a;->f(Z)V

    iget-object v0, p0, Lo5/e0$d;->q:Lo5/e0;

    invoke-static {v0, p0}, Lo5/e0;->c(Lo5/e0;Lo5/e0$d;)Lo5/e0$d;

    const-wide/16 v2, 0x0

    cmp-long v0, p1, v2

    if-lez v0, :cond_1

    invoke-virtual {p0, v1, p1, p2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lo5/e0$d;->b()V

    :goto_1
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 12

    iget-boolean v0, p0, Lo5/e0$d;->p:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lo5/e0$d;->b()V

    return-void

    :cond_1
    const/4 v1, 0x3

    if-eq v0, v1, :cond_9

    invoke-virtual {p0}, Lo5/e0$d;->c()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-wide v2, p0, Lo5/e0$d;->j:J

    sub-long v6, v4, v2

    iget-object v0, p0, Lo5/e0$d;->k:Lo5/e0$b;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo5/e0$b;

    iget-boolean v0, p0, Lo5/e0$d;->o:Z

    if-eqz v0, :cond_2

    iget-object v3, p0, Lo5/e0$d;->i:Lo5/e0$e;

    const/4 v8, 0x0

    invoke-interface/range {v2 .. v8}, Lo5/e0$b;->r(Lo5/e0$e;JJZ)V

    return-void

    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v10, 0x1

    if-eq v0, v10, :cond_7

    const/4 v11, 0x2

    if-eq v0, v11, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Ljava/io/IOException;

    iput-object v8, p0, Lo5/e0$d;->l:Ljava/io/IOException;

    iget p1, p0, Lo5/e0$d;->m:I

    add-int/lit8 v9, p1, 0x1

    iput v9, p0, Lo5/e0$d;->m:I

    iget-object v3, p0, Lo5/e0$d;->i:Lo5/e0$e;

    invoke-interface/range {v2 .. v9}, Lo5/e0$b;->k(Lo5/e0$e;JJLjava/io/IOException;I)Lo5/e0$c;

    move-result-object p1

    invoke-static {p1}, Lo5/e0$c;->a(Lo5/e0$c;)I

    move-result v0

    if-ne v0, v1, :cond_4

    iget-object p1, p0, Lo5/e0$d;->q:Lo5/e0;

    iget-object v0, p0, Lo5/e0$d;->l:Ljava/io/IOException;

    invoke-static {p1, v0}, Lo5/e0;->d(Lo5/e0;Ljava/io/IOException;)Ljava/io/IOException;

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lo5/e0$c;->a(Lo5/e0$c;)I

    move-result v0

    if-eq v0, v11, :cond_8

    invoke-static {p1}, Lo5/e0$c;->a(Lo5/e0$c;)I

    move-result v0

    if-ne v0, v10, :cond_5

    iput v10, p0, Lo5/e0$d;->m:I

    :cond_5
    invoke-static {p1}, Lo5/e0$c;->b(Lo5/e0$c;)J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_6

    invoke-static {p1}, Lo5/e0$c;->b(Lo5/e0$c;)J

    move-result-wide v0

    goto :goto_0

    :cond_6
    invoke-virtual {p0}, Lo5/e0$d;->d()J

    move-result-wide v0

    :goto_0
    invoke-virtual {p0, v0, v1}, Lo5/e0$d;->f(J)V

    goto :goto_1

    :cond_7
    :try_start_0
    iget-object v3, p0, Lo5/e0$d;->i:Lo5/e0$e;

    invoke-interface/range {v2 .. v7}, Lo5/e0$b;->o(Lo5/e0$e;JJ)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const-string v0, "LoadTask"

    const-string v1, "Unexpected exception handling load completed"

    invoke-static {v0, v1, p1}, Lp5/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lo5/e0$d;->q:Lo5/e0;

    new-instance v1, Lo5/e0$h;

    invoke-direct {v1, p1}, Lo5/e0$h;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0, v1}, Lo5/e0;->d(Lo5/e0;Ljava/io/IOException;)Ljava/io/IOException;

    :cond_8
    :goto_1
    return-void

    :cond_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Error;

    throw p1
.end method

.method public run()V
    .locals 4

    const/4 v0, 0x2

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-boolean v1, p0, Lo5/e0$d;->o:Z

    const/4 v2, 0x1

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    iput-object v3, p0, Lo5/e0$d;->n:Ljava/lang/Thread;

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-eqz v1, :cond_1

    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "load:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lo5/e0$d;->i:Lo5/e0$e;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lp5/k0;->a(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    iget-object v1, p0, Lo5/e0$d;->i:Lo5/e0$e;

    invoke-interface {v1}, Lo5/e0$e;->b()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-static {}, Lp5/k0;->c()V

    goto :goto_1

    :catchall_0
    move-exception v1

    invoke-static {}, Lp5/k0;->c()V

    throw v1

    :cond_1
    :goto_1
    monitor-enter p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0

    const/4 v1, 0x0

    :try_start_5
    iput-object v1, p0, Lo5/e0$d;->n:Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    iget-boolean v1, p0, Lo5/e0$d;->p:Z

    if-nez v1, :cond_3

    invoke-virtual {p0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_0

    goto :goto_4

    :catchall_1
    move-exception v1

    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :try_start_8
    throw v1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_0

    :catchall_2
    move-exception v1

    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :try_start_a
    throw v1
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/Error; {:try_start_a .. :try_end_a} :catch_0

    :catch_0
    move-exception v0

    iget-boolean v1, p0, Lo5/e0$d;->p:Z

    if-nez v1, :cond_2

    const-string v1, "LoadTask"

    const-string v2, "Unexpected error loading stream"

    invoke-static {v1, v2, v0}, Lp5/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v1, 0x3

    invoke-virtual {p0, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    :cond_2
    throw v0

    :catch_1
    move-exception v1

    iget-boolean v2, p0, Lo5/e0$d;->p:Z

    if-nez v2, :cond_3

    const-string v2, "LoadTask"

    const-string v3, "OutOfMemory error loading stream"

    invoke-static {v2, v3, v1}, Lp5/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v2, Lo5/e0$h;

    invoke-direct {v2, v1}, Lo5/e0$h;-><init>(Ljava/lang/Throwable;)V

    :goto_2
    invoke-virtual {p0, v0, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    :goto_3
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_4

    :catch_2
    move-exception v1

    iget-boolean v2, p0, Lo5/e0$d;->p:Z

    if-nez v2, :cond_3

    const-string v2, "LoadTask"

    const-string v3, "Unexpected exception loading stream"

    invoke-static {v2, v3, v1}, Lp5/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v2, Lo5/e0$h;

    invoke-direct {v2, v1}, Lo5/e0$h;-><init>(Ljava/lang/Throwable;)V

    goto :goto_2

    :catch_3
    move-exception v1

    iget-boolean v2, p0, Lo5/e0$d;->p:Z

    if-nez v2, :cond_3

    invoke-virtual {p0, v0, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    goto :goto_3

    :cond_3
    :goto_4
    return-void
.end method
