.class public abstract Lg1/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg1/c$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static l:Landroid/os/Handler;


# instance fields
.field public final h:Ljava/util/concurrent/FutureTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/FutureTask<",
            "TResult;>;"
        }
    .end annotation
.end field

.field public volatile i:Lg1/c$e;

.field public final j:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final k:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lg1/c$e;->h:Lg1/c$e;

    iput-object v0, p0, Lg1/c;->i:Lg1/c$e;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lg1/c;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lg1/c;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Lg1/c$a;

    invoke-direct {v0, p0}, Lg1/c$a;-><init>(Lg1/c;)V

    new-instance v1, Lg1/c$b;

    invoke-direct {v1, p0, v0}, Lg1/c$b;-><init>(Lg1/c;Ljava/util/concurrent/Callable;)V

    iput-object v1, p0, Lg1/c;->h:Ljava/util/concurrent/FutureTask;

    return-void
.end method

.method public static e()Landroid/os/Handler;
    .locals 3

    const-class v0, Lg1/c;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lg1/c;->l:Landroid/os/Handler;

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v1, Lg1/c;->l:Landroid/os/Handler;

    :cond_0
    sget-object v1, Lg1/c;->l:Landroid/os/Handler;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final a(Z)Z
    .locals 2

    iget-object v0, p0, Lg1/c;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lg1/c;->h:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    move-result p1

    return p1
.end method

.method public abstract b()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation
.end method

.method public final c(Ljava/util/concurrent/Executor;)V
    .locals 2

    iget-object v0, p0, Lg1/c;->i:Lg1/c$e;

    sget-object v1, Lg1/c$e;->h:Lg1/c$e;

    if-eq v0, v1, :cond_2

    sget-object p1, Lg1/c$d;->a:[I

    iget-object v0, p0, Lg1/c;->i:Lg1/c$e;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p1, p1, v0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "We should never reach this state"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot execute task: the task has already been executed (a task can be executed only once)"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot execute task: the task is already running."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    sget-object v0, Lg1/c$e;->i:Lg1/c$e;

    iput-object v0, p0, Lg1/c;->i:Lg1/c$e;

    iget-object v0, p0, Lg1/c;->h:Ljava/util/concurrent/FutureTask;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lg1/c;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lg1/c;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lg1/c;->h(Ljava/lang/Object;)V

    :goto_0
    sget-object p1, Lg1/c$e;->j:Lg1/c$e;

    iput-object p1, p0, Lg1/c;->i:Lg1/c$e;

    return-void
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Lg1/c;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public g(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    return-void
.end method

.method public i(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    invoke-static {}, Lg1/c;->e()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lg1/c$c;

    invoke-direct {v1, p0, p1}, Lg1/c$c;-><init>(Lg1/c;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public j(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lg1/c;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lg1/c;->i(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
