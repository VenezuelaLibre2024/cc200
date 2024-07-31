.class public final Lp5/q;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp5/q$c;,
        Lp5/q$b;,
        Lp5/q$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lp5/d;

.field public final b:Lp5/n;

.field public final c:Lp5/q$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp5/q$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lp5/q$c<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/lang/Object;

.field public h:Z

.field public i:Z


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lp5/d;Lp5/q$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Looper;",
            "Lp5/d;",
            "Lp5/q$b<",
            "TT;>;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    invoke-direct {p0, v0, p1, p2, p3}, Lp5/q;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Lp5/d;Lp5/q$b;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Lp5/d;Lp5/q$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lp5/q$c<",
            "TT;>;>;",
            "Landroid/os/Looper;",
            "Lp5/d;",
            "Lp5/q$b<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lp5/q;->a:Lp5/d;

    iput-object p1, p0, Lp5/q;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    iput-object p4, p0, Lp5/q;->c:Lp5/q$b;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/q;->g:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lp5/q;->e:Ljava/util/ArrayDeque;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lp5/q;->f:Ljava/util/ArrayDeque;

    new-instance p1, Lp5/o;

    invoke-direct {p1, p0}, Lp5/o;-><init>(Lp5/q;)V

    invoke-interface {p3, p2, p1}, Lp5/d;->c(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lp5/n;

    move-result-object p1

    iput-object p1, p0, Lp5/q;->b:Lp5/n;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lp5/q;->i:Z

    return-void
.end method

.method public static synthetic a(Ljava/util/concurrent/CopyOnWriteArraySet;ILp5/q$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lp5/q;->h(Ljava/util/concurrent/CopyOnWriteArraySet;ILp5/q$a;)V

    return-void
.end method

.method public static synthetic b(Lp5/q;Landroid/os/Message;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lp5/q;->g(Landroid/os/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic h(Ljava/util/concurrent/CopyOnWriteArraySet;ILp5/q$a;)V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp5/q$c;

    invoke-virtual {v0, p1, p2}, Lp5/q$c;->a(ILp5/q$a;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lp5/q;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lp5/q;->h:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Lp5/q;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v2, Lp5/q$c;

    invoke-direct {v2, p1}, Lp5/q$c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public d(Landroid/os/Looper;Lp5/d;Lp5/q$b;)Lp5/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Looper;",
            "Lp5/d;",
            "Lp5/q$b<",
            "TT;>;)",
            "Lp5/q<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lp5/q;

    iget-object v1, p0, Lp5/q;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0, v1, p1, p2, p3}, Lp5/q;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Lp5/d;Lp5/q$b;)V

    return-object v0
.end method

.method public e(Landroid/os/Looper;Lp5/q$b;)Lp5/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Looper;",
            "Lp5/q$b<",
            "TT;>;)",
            "Lp5/q<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lp5/q;->a:Lp5/d;

    invoke-virtual {p0, p1, v0, p2}, Lp5/q;->d(Landroid/os/Looper;Lp5/d;Lp5/q$b;)Lp5/q;

    move-result-object p1

    return-object p1
.end method

.method public f()V
    .locals 3

    invoke-virtual {p0}, Lp5/q;->l()V

    iget-object v0, p0, Lp5/q;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lp5/q;->b:Lp5/n;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lp5/n;->d(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lp5/q;->b:Lp5/n;

    invoke-interface {v0, v1}, Lp5/n;->c(I)Lp5/n$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lp5/n;->e(Lp5/n$a;)Z

    :cond_1
    iget-object v0, p0, Lp5/q;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lp5/q;->e:Ljava/util/ArrayDeque;

    iget-object v2, p0, Lp5/q;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lp5/q;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    if-eqz v0, :cond_2

    return-void

    :cond_2
    :goto_0
    iget-object v0, p0, Lp5/q;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lp5/q;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    iget-object v0, p0, Lp5/q;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final g(Landroid/os/Message;)Z
    .locals 2

    iget-object p1, p0, Lp5/q;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp5/q$c;

    iget-object v1, p0, Lp5/q;->c:Lp5/q$b;

    invoke-virtual {v0, v1}, Lp5/q$c;->b(Lp5/q$b;)V

    iget-object v0, p0, Lp5/q;->b:Lp5/n;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lp5/n;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public i(ILp5/q$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lp5/q$a<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lp5/q;->l()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-object v1, p0, Lp5/q;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>(Ljava/util/Collection;)V

    iget-object v1, p0, Lp5/q;->f:Ljava/util/ArrayDeque;

    new-instance v2, Lp5/p;

    invoke-direct {v2, v0, p1, p2}, Lp5/p;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;ILp5/q$a;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public j()V
    .locals 3

    invoke-virtual {p0}, Lp5/q;->l()V

    iget-object v0, p0, Lp5/q;->g:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lp5/q;->h:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lp5/q;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp5/q$c;

    iget-object v2, p0, Lp5/q;->c:Lp5/q$b;

    invoke-virtual {v1, v2}, Lp5/q$c;->c(Lp5/q$b;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp5/q;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public k(ILp5/q$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lp5/q$a<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lp5/q;->i(ILp5/q$a;)V

    invoke-virtual {p0}, Lp5/q;->f()V

    return-void
.end method

.method public final l()V
    .locals 2

    iget-boolean v0, p0, Lp5/q;->i:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lp5/q;->b:Lp5/n;

    invoke-interface {v1}, Lp5/n;->l()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp5/a;->f(Z)V

    return-void
.end method
