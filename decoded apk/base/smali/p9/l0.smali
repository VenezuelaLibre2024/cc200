.class public Lp9/l0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp9/l0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<",
        "ListenerTypeT:Ljava/lang/Object;",
        "ResultT::",
        "Lp9/e0$a;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "T",
            "ListenerTypeT;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "T",
            "ListenerTypeT;",
            "Lq9/g;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lp9/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp9/e0<",
            "TResultT;>;"
        }
    .end annotation
.end field

.field public d:I

.field public e:Lp9/l0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp9/l0$a<",
            "T",
            "ListenerTypeT;",
            "TResultT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp9/e0;ILp9/l0$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp9/e0<",
            "TResultT;>;I",
            "Lp9/l0$a<",
            "T",
            "ListenerTypeT;",
            "TResultT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lp9/l0;->a:Ljava/util/Queue;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lp9/l0;->b:Ljava/util/HashMap;

    iput-object p1, p0, Lp9/l0;->c:Lp9/e0;

    iput p2, p0, Lp9/l0;->d:I

    iput-object p3, p0, Lp9/l0;->e:Lp9/l0$a;

    return-void
.end method

.method public static synthetic a(Lp9/l0;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lp9/l0;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lp9/l0;Ljava/lang/Object;Lp9/e0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lp9/l0;->g(Ljava/lang/Object;Lp9/e0$a;)V

    return-void
.end method

.method public static synthetic c(Lp9/l0;Ljava/lang/Object;Lp9/e0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lp9/l0;->f(Ljava/lang/Object;Lp9/e0$a;)V

    return-void
.end method

.method private synthetic e(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lp9/l0;->i(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic f(Ljava/lang/Object;Lp9/e0$a;)V
    .locals 1

    iget-object v0, p0, Lp9/l0;->e:Lp9/l0$a;

    invoke-interface {v0, p1, p2}, Lp9/l0$a;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic g(Ljava/lang/Object;Lp9/e0$a;)V
    .locals 1

    iget-object v0, p0, Lp9/l0;->e:Lp9/l0$a;

    invoke-interface {v0, p1, p2}, Lp9/l0$a;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public d(Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/concurrent/Executor;",
            "T",
            "ListenerTypeT;",
            ")V"
        }
    .end annotation

    invoke-static {p3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lp9/l0;->c:Lp9/e0;

    invoke-virtual {v0}, Lp9/e0;->J()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lp9/l0;->c:Lp9/e0;

    invoke-virtual {v1}, Lp9/e0;->B()I

    move-result v1

    iget v2, p0, Lp9/l0;->d:I

    and-int/2addr v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    iget-object v4, p0, Lp9/l0;->a:Ljava/util/Queue;

    invoke-interface {v4, p3}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    new-instance v4, Lq9/g;

    invoke-direct {v4, p2}, Lq9/g;-><init>(Ljava/util/concurrent/Executor;)V

    iget-object p2, p0, Lp9/l0;->b:Ljava/util/HashMap;

    invoke-virtual {p2, p3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_3

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x11

    if-lt p2, v5, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    const-string p2, "Activity is already destroyed!"

    invoke-static {v2, p2}, Lh6/s;->b(ZLjava/lang/Object;)V

    :cond_2
    invoke-static {}, Lq9/a;->a()Lq9/a;

    move-result-object p2

    new-instance v2, Lp9/i0;

    invoke-direct {v2, p0, p3}, Lp9/i0;-><init>(Lp9/l0;Ljava/lang/Object;)V

    invoke-virtual {p2, p1, p3, v2}, Lq9/a;->c(Landroid/app/Activity;Ljava/lang/Object;Ljava/lang/Runnable;)V

    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_4

    iget-object p1, p0, Lp9/l0;->c:Lp9/e0;

    invoke-virtual {p1}, Lp9/e0;->g0()Lp9/e0$a;

    move-result-object p1

    new-instance p2, Lp9/k0;

    invoke-direct {p2, p0, p3, p1}, Lp9/k0;-><init>(Lp9/l0;Ljava/lang/Object;Lp9/e0$a;)V

    invoke-virtual {v4, p2}, Lq9/g;->a(Ljava/lang/Runnable;)V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public h()V
    .locals 5

    iget-object v0, p0, Lp9/l0;->c:Lp9/e0;

    invoke-virtual {v0}, Lp9/e0;->B()I

    move-result v0

    iget v1, p0, Lp9/l0;->d:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lp9/l0;->c:Lp9/e0;

    invoke-virtual {v0}, Lp9/e0;->g0()Lp9/e0$a;

    move-result-object v0

    iget-object v1, p0, Lp9/l0;->a:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lp9/l0;->b:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq9/g;

    if-eqz v3, :cond_0

    new-instance v4, Lp9/j0;

    invoke-direct {v4, p0, v2, v0}, Lp9/j0;-><init>(Lp9/l0;Ljava/lang/Object;Lp9/e0$a;)V

    invoke-virtual {v3, v4}, Lq9/g;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public i(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(T",
            "ListenerTypeT;",
            ")V"
        }
    .end annotation

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lp9/l0;->c:Lp9/e0;

    invoke-virtual {v0}, Lp9/e0;->J()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lp9/l0;->b:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lp9/l0;->a:Ljava/util/Queue;

    invoke-interface {v1, p1}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    invoke-static {}, Lq9/a;->a()Lq9/a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lq9/a;->b(Ljava/lang/Object;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
