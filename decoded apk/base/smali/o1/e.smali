.class public abstract Lo1/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo1/e$b;,
        Lo1/e$d;,
        Lo1/e$a;,
        Lo1/e$c;
    }
.end annotation


# instance fields
.field public volatile a:Ls1/b;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public b:Ljava/util/concurrent/Executor;

.field public c:Ljava/util/concurrent/Executor;

.field public d:Ls1/c;

.field public final e:Landroidx/room/c;

.field public f:Z

.field public g:Z

.field public h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo1/e$b;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public final j:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Lo1/e;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lo1/e;->j:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lo1/e;->k:Ljava/util/Map;

    invoke-virtual {p0}, Lo1/e;->e()Landroidx/room/c;

    move-result-object v0

    iput-object v0, p0, Lo1/e;->e:Landroidx/room/c;

    return-void
.end method

.method public static n()Z
    .locals 2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-boolean v0, p0, Lo1/e;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lo1/e;->n()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot access database on the main thread since it may potentially lock the UI for a long period of time."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()V
    .locals 2

    invoke-virtual {p0}, Lo1/e;->k()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo1/e;->j:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot access database on a different coroutine context inherited from a suspending transaction."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public c()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lo1/e;->a()V

    iget-object v0, p0, Lo1/e;->d:Ls1/c;

    invoke-interface {v0}, Ls1/c;->U()Ls1/b;

    move-result-object v0

    iget-object v1, p0, Lo1/e;->e:Landroidx/room/c;

    invoke-virtual {v1, v0}, Landroidx/room/c;->m(Ls1/b;)V

    invoke-interface {v0}, Ls1/b;->g()V

    return-void
.end method

.method public d(Ljava/lang/String;)Ls1/f;
    .locals 1

    invoke-virtual {p0}, Lo1/e;->a()V

    invoke-virtual {p0}, Lo1/e;->b()V

    iget-object v0, p0, Lo1/e;->d:Ls1/c;

    invoke-interface {v0}, Ls1/c;->U()Ls1/b;

    move-result-object v0

    invoke-interface {v0, p1}, Ls1/b;->t(Ljava/lang/String;)Ls1/f;

    move-result-object p1

    return-object p1
.end method

.method public abstract e()Landroidx/room/c;
.end method

.method public abstract f(Lo1/a;)Ls1/c;
.end method

.method public g()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lo1/e;->d:Ls1/c;

    invoke-interface {v0}, Ls1/c;->U()Ls1/b;

    move-result-object v0

    invoke-interface {v0}, Ls1/b;->Z()V

    invoke-virtual {p0}, Lo1/e;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo1/e;->e:Landroidx/room/c;

    invoke-virtual {v0}, Landroidx/room/c;->f()V

    :cond_0
    return-void
.end method

.method public h()Ljava/util/concurrent/locks/Lock;
    .locals 1

    iget-object v0, p0, Lo1/e;->i:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    return-object v0
.end method

.method public i()Ls1/c;
    .locals 1

    iget-object v0, p0, Lo1/e;->d:Ls1/c;

    return-object v0
.end method

.method public j()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lo1/e;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, Lo1/e;->d:Ls1/c;

    invoke-interface {v0}, Ls1/c;->U()Ls1/b;

    move-result-object v0

    invoke-interface {v0}, Ls1/b;->q0()Z

    move-result v0

    return v0
.end method

.method public l(Lo1/a;)V
    .locals 3

    invoke-virtual {p0, p1}, Lo1/e;->f(Lo1/a;)Ls1/c;

    move-result-object v0

    iput-object v0, p0, Lo1/e;->d:Ls1/c;

    instance-of v1, v0, Lo1/i;

    if-eqz v1, :cond_0

    check-cast v0, Lo1/i;

    invoke-virtual {v0, p1}, Lo1/i;->d(Lo1/a;)V

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    const/4 v2, 0x0

    if-lt v0, v1, :cond_2

    iget-object v0, p1, Lo1/a;->g:Lo1/e$c;

    sget-object v1, Lo1/e$c;->j:Lo1/e$c;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    move v2, v0

    :cond_1
    iget-object v0, p0, Lo1/e;->d:Ls1/c;

    invoke-interface {v0, v2}, Ls1/c;->setWriteAheadLoggingEnabled(Z)V

    :cond_2
    iget-object v0, p1, Lo1/a;->e:Ljava/util/List;

    iput-object v0, p0, Lo1/e;->h:Ljava/util/List;

    iget-object v0, p1, Lo1/a;->h:Ljava/util/concurrent/Executor;

    iput-object v0, p0, Lo1/e;->b:Ljava/util/concurrent/Executor;

    new-instance v0, Lo1/l;

    iget-object v1, p1, Lo1/a;->i:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1}, Lo1/l;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v0, p0, Lo1/e;->c:Ljava/util/concurrent/Executor;

    iget-boolean v0, p1, Lo1/a;->f:Z

    iput-boolean v0, p0, Lo1/e;->f:Z

    iput-boolean v2, p0, Lo1/e;->g:Z

    iget-boolean v0, p1, Lo1/a;->j:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo1/e;->e:Landroidx/room/c;

    iget-object v1, p1, Lo1/a;->b:Landroid/content/Context;

    iget-object p1, p1, Lo1/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Landroidx/room/c;->i(Landroid/content/Context;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public m(Ls1/b;)V
    .locals 1

    iget-object v0, p0, Lo1/e;->e:Landroidx/room/c;

    invoke-virtual {v0, p1}, Landroidx/room/c;->d(Ls1/b;)V

    return-void
.end method

.method public o()Z
    .locals 1

    iget-object v0, p0, Lo1/e;->a:Ls1/b;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ls1/b;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p(Ls1/e;)Landroid/database/Cursor;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo1/e;->q(Ls1/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public q(Ls1/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 2

    invoke-virtual {p0}, Lo1/e;->a()V

    invoke-virtual {p0}, Lo1/e;->b()V

    if-eqz p2, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lo1/e;->d:Ls1/c;

    invoke-interface {v0}, Ls1/c;->U()Ls1/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ls1/b;->o(Ls1/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p2, p0, Lo1/e;->d:Ls1/c;

    invoke-interface {p2}, Ls1/c;->U()Ls1/b;

    move-result-object p2

    invoke-interface {p2, p1}, Ls1/b;->G(Ls1/e;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public r()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lo1/e;->d:Ls1/c;

    invoke-interface {v0}, Ls1/c;->U()Ls1/b;

    move-result-object v0

    invoke-interface {v0}, Ls1/b;->N()V

    return-void
.end method
