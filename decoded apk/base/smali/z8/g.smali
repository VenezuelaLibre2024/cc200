.class public Lz8/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz8/h;


# static fields
.field public static final m:Ljava/lang/Object;

.field public static final n:Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final a:Ln7/g;

.field public final b:Lc9/c;

.field public final c:Lb9/c;

.field public final d:Lz8/p;

.field public final e:Ly7/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly7/w<",
            "Lb9/b;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lz8/n;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/util/concurrent/ExecutorService;

.field public final i:Ljava/util/concurrent/Executor;

.field public j:Ljava/lang/String;

.field public k:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "La9/a;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lz8/o;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lz8/g;->m:Ljava/lang/Object;

    new-instance v0, Lz8/g$a;

    invoke-direct {v0}, Lz8/g$a;-><init>()V

    sput-object v0, Lz8/g;->n:Ljava/util/concurrent/ThreadFactory;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Executor;Ln7/g;Lc9/c;Lb9/c;Lz8/p;Ly7/w;Lz8/n;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ThreadPoolCreation"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ExecutorService;",
            "Ljava/util/concurrent/Executor;",
            "Ln7/g;",
            "Lc9/c;",
            "Lb9/c;",
            "Lz8/p;",
            "Ly7/w<",
            "Lb9/b;",
            ">;",
            "Lz8/n;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lz8/g;->g:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lz8/g;->k:Ljava/util/Set;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz8/g;->l:Ljava/util/List;

    iput-object p3, p0, Lz8/g;->a:Ln7/g;

    iput-object p4, p0, Lz8/g;->b:Lc9/c;

    iput-object p5, p0, Lz8/g;->c:Lb9/c;

    iput-object p6, p0, Lz8/g;->d:Lz8/p;

    iput-object p7, p0, Lz8/g;->e:Ly7/w;

    iput-object p8, p0, Lz8/g;->f:Lz8/n;

    iput-object p1, p0, Lz8/g;->h:Ljava/util/concurrent/ExecutorService;

    iput-object p2, p0, Lz8/g;->i:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(Ln7/g;Ly8/b;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Executor;)V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ThreadPoolCreation"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Ly8/b<",
            "Lv8/i;",
            ">;",
            "Ljava/util/concurrent/ExecutorService;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    new-instance v4, Lc9/c;

    invoke-virtual {p1}, Ln7/g;->m()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v4, v0, p2}, Lc9/c;-><init>(Landroid/content/Context;Ly8/b;)V

    new-instance v5, Lb9/c;

    invoke-direct {v5, p1}, Lb9/c;-><init>(Ln7/g;)V

    invoke-static {}, Lz8/p;->c()Lz8/p;

    move-result-object v6

    new-instance v7, Ly7/w;

    new-instance p2, Lz8/f;

    invoke-direct {p2, p1}, Lz8/f;-><init>(Ln7/g;)V

    invoke-direct {v7, p2}, Ly7/w;-><init>(Ly8/b;)V

    new-instance v8, Lz8/n;

    invoke-direct {v8}, Lz8/n;-><init>()V

    move-object v0, p0

    move-object v1, p3

    move-object v2, p4

    move-object v3, p1

    invoke-direct/range {v0 .. v8}, Lz8/g;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Executor;Ln7/g;Lc9/c;Lb9/c;Lz8/p;Ly7/w;Lz8/n;)V

    return-void
.end method

.method public static synthetic b(Ln7/g;)Lb9/b;
    .locals 0

    invoke-static {p0}, Lz8/g;->y(Ln7/g;)Lb9/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lz8/g;)V
    .locals 0

    invoke-direct {p0}, Lz8/g;->w()V

    return-void
.end method

.method public static synthetic d(Lz8/g;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lz8/g;->v(Z)V

    return-void
.end method

.method public static synthetic e(Lz8/g;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lz8/g;->x(Z)V

    return-void
.end method

.method public static p()Lz8/g;
    .locals 1

    invoke-static {}, Ln7/g;->o()Ln7/g;

    move-result-object v0

    invoke-static {v0}, Lz8/g;->q(Ln7/g;)Lz8/g;

    move-result-object v0

    return-object v0
.end method

.method public static q(Ln7/g;)Lz8/g;
    .locals 2

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Null is not a valid value of FirebaseApp."

    invoke-static {v0, v1}, Lh6/s;->b(ZLjava/lang/Object;)V

    const-class v0, Lz8/h;

    invoke-virtual {p0, v0}, Ln7/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lz8/g;

    return-object p0
.end method

.method private synthetic v(Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lz8/g;->i(Z)V

    return-void
.end method

.method private synthetic w()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lz8/g;->j(Z)V

    return-void
.end method

.method private synthetic x(Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lz8/g;->j(Z)V

    return-void
.end method

.method public static synthetic y(Ln7/g;)Lb9/b;
    .locals 1

    new-instance v0, Lb9/b;

    invoke-direct {v0, p0}, Lb9/b;-><init>(Ln7/g;)V

    return-object v0
.end method


# virtual methods
.method public final A(Lb9/d;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lz8/g;->a:Ln7/g;

    invoke-virtual {v0}, Ln7/g;->q()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CHIME_ANDROID_SDK"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lz8/g;->a:Ln7/g;

    invoke-virtual {v0}, Ln7/g;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p1}, Lb9/d;->m()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    iget-object p1, p0, Lz8/g;->f:Lz8/n;

    invoke-virtual {p1}, Lz8/n;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p0}, Lz8/g;->o()Lb9/b;

    move-result-object p1

    invoke-virtual {p1}, Lb9/b;->f()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p0, Lz8/g;->f:Lz8/n;

    invoke-virtual {p1}, Lz8/n;->a()Ljava/lang/String;

    move-result-object p1

    :cond_3
    return-object p1
.end method

.method public final B(Lb9/d;)Lb9/d;
    .locals 10

    invoke-virtual {p1}, Lb9/d;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lb9/d;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lz8/g;->o()Lb9/b;

    move-result-object v0

    invoke-virtual {v0}, Lb9/b;->i()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v6, v0

    iget-object v1, p0, Lz8/g;->b:Lc9/c;

    invoke-virtual {p0}, Lz8/g;->l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lb9/d;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lz8/g;->t()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lz8/g;->m()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v1 .. v6}, Lc9/c;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lc9/d;

    move-result-object v0

    sget-object v1, Lz8/g$b;->a:[I

    invoke-virtual {v0}, Lc9/d;->e()Lc9/d$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v0, 0x2

    if-ne v1, v0, :cond_1

    const-string v0, "BAD CONFIG"

    invoke-virtual {p1, v0}, Lb9/d;->q(Ljava/lang/String;)Lb9/d;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lz8/i;

    sget-object v0, Lz8/i$a;->i:Lz8/i$a;

    const-string v1, "Firebase Installations Service is unavailable. Please try again later."

    invoke-direct {p1, v1, v0}, Lz8/i;-><init>(Ljava/lang/String;Lz8/i$a;)V

    throw p1

    :cond_2
    invoke-virtual {v0}, Lc9/d;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lc9/d;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Lz8/g;->d:Lz8/p;

    invoke-virtual {v1}, Lz8/p;->b()J

    move-result-wide v5

    invoke-virtual {v0}, Lc9/d;->b()Lc9/f;

    move-result-object v1

    invoke-virtual {v1}, Lc9/f;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lc9/d;->b()Lc9/f;

    move-result-object v0

    invoke-virtual {v0}, Lc9/f;->d()J

    move-result-wide v8

    move-object v2, p1

    invoke-virtual/range {v2 .. v9}, Lb9/d;->s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Lb9/d;

    move-result-object p1

    return-object p1
.end method

.method public final C(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lz8/g;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz8/g;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz8/o;

    invoke-interface {v2, p1}, Lz8/o;->b(Ljava/lang/Exception;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final D(Lb9/d;)V
    .locals 3

    iget-object v0, p0, Lz8/g;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz8/g;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz8/o;

    invoke-interface {v2, p1}, Lz8/o;->a(Lb9/d;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final declared-synchronized E(Ljava/lang/String;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lz8/g;->j:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized F(Lb9/d;Lb9/d;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lz8/g;->k:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lb9/d;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lb9/d;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lz8/g;->k:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La9/a;

    invoke-virtual {p2}, Lb9/d;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, La9/a;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Z)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lz8/m;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lz8/g;->z()V

    invoke-virtual {p0}, Lz8/g;->f()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lz8/g;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lz8/e;

    invoke-direct {v2, p0, p1}, Lz8/e;-><init>(Lz8/g;Z)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public final f()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lz8/m;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    new-instance v1, Lz8/k;

    iget-object v2, p0, Lz8/g;->d:Lz8/p;

    invoke-direct {v1, v2, v0}, Lz8/k;-><init>(Lz8/p;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p0, v1}, Lz8/g;->h(Lz8/o;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    new-instance v1, Lz8/l;

    invoke-direct {v1, v0}, Lz8/l;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p0, v1}, Lz8/g;->h(Lz8/o;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public getId()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lz8/g;->z()V

    invoke-virtual {p0}, Lz8/g;->n()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lz8/g;->g()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lz8/g;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lz8/c;

    invoke-direct {v2, p0}, Lz8/c;-><init>(Lz8/g;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public final h(Lz8/o;)V
    .locals 2

    iget-object v0, p0, Lz8/g;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz8/g;->l:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final i(Z)V
    .locals 2

    invoke-virtual {p0}, Lz8/g;->r()Lb9/d;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0}, Lb9/d;->i()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Lb9/d;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    if-nez p1, :cond_2

    iget-object p1, p0, Lz8/g;->d:Lz8/p;

    invoke-virtual {p1, v0}, Lz8/p;->f(Lb9/d;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Lz8/g;->k(Lb9/d;)Lb9/d;

    move-result-object p1

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {p0, v0}, Lz8/g;->B(Lb9/d;)Lb9/d;

    move-result-object p1
    :try_end_0
    .catch Lz8/i; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    invoke-virtual {p0, p1}, Lz8/g;->u(Lb9/d;)V

    invoke-virtual {p0, v0, p1}, Lz8/g;->F(Lb9/d;Lb9/d;)V

    invoke-virtual {p1}, Lb9/d;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lb9/d;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz8/g;->E(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {p1}, Lb9/d;->i()Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance p1, Lz8/i;

    sget-object v0, Lz8/i$a;->h:Lz8/i$a;

    invoke-direct {p1, v0}, Lz8/i;-><init>(Lz8/i$a;)V

    :goto_3
    invoke-virtual {p0, p1}, Lz8/g;->C(Ljava/lang/Exception;)V

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Lb9/d;->j()Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance p1, Ljava/io/IOException;

    const-string v0, "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    invoke-virtual {p0, p1}, Lz8/g;->D(Lb9/d;)V

    :goto_4
    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Lz8/g;->C(Ljava/lang/Exception;)V

    return-void
.end method

.method public final j(Z)V
    .locals 2

    invoke-virtual {p0}, Lz8/g;->s()Lb9/d;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lb9/d;->p()Lb9/d;

    move-result-object v0

    :cond_0
    invoke-virtual {p0, v0}, Lz8/g;->D(Lb9/d;)V

    iget-object v0, p0, Lz8/g;->i:Ljava/util/concurrent/Executor;

    new-instance v1, Lz8/d;

    invoke-direct {v1, p0, p1}, Lz8/d;-><init>(Lz8/g;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final k(Lb9/d;)Lb9/d;
    .locals 6

    iget-object v0, p0, Lz8/g;->b:Lc9/c;

    invoke-virtual {p0}, Lz8/g;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lb9/d;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lz8/g;->t()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lb9/d;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lc9/c;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lc9/f;

    move-result-object v0

    sget-object v1, Lz8/g$b;->b:[I

    invoke-virtual {v0}, Lc9/f;->b()Lc9/f$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v0, 0x2

    if-eq v1, v0, :cond_1

    const/4 v0, 0x3

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lz8/g;->E(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb9/d;->r()Lb9/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lz8/i;

    sget-object v0, Lz8/i$a;->i:Lz8/i$a;

    const-string v1, "Firebase Installations Service is unavailable. Please try again later."

    invoke-direct {p1, v1, v0}, Lz8/i;-><init>(Ljava/lang/String;Lz8/i$a;)V

    throw p1

    :cond_1
    const-string v0, "BAD CONFIG"

    invoke-virtual {p1, v0}, Lb9/d;->q(Ljava/lang/String;)Lb9/d;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {v0}, Lc9/f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lc9/f;->d()J

    move-result-wide v2

    iget-object v0, p0, Lz8/g;->d:Lz8/p;

    invoke-virtual {v0}, Lz8/p;->b()J

    move-result-wide v4

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lb9/d;->o(Ljava/lang/String;JJ)Lb9/d;

    move-result-object p1

    return-object p1
.end method

.method public l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz8/g;->a:Ln7/g;

    invoke-virtual {v0}, Ln7/g;->r()Ln7/p;

    move-result-object v0

    invoke-virtual {v0}, Ln7/p;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz8/g;->a:Ln7/g;

    invoke-virtual {v0}, Ln7/g;->r()Ln7/p;

    move-result-object v0

    invoke-virtual {v0}, Ln7/p;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized n()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lz8/g;->j:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final o()Lb9/b;
    .locals 1

    iget-object v0, p0, Lz8/g;->e:Ly7/w;

    invoke-virtual {v0}, Ly7/w;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb9/b;

    return-object v0
.end method

.method public final r()Lb9/d;
    .locals 3

    sget-object v0, Lz8/g;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz8/g;->a:Ln7/g;

    invoke-virtual {v1}, Ln7/g;->m()Landroid/content/Context;

    move-result-object v1

    const-string v2, "generatefid.lock"

    invoke-static {v1, v2}, Lz8/b;->a(Landroid/content/Context;Ljava/lang/String;)Lz8/b;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Lz8/g;->c:Lb9/c;

    invoke-virtual {v2}, Lb9/c;->d()Lb9/d;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_0

    :try_start_2
    invoke-virtual {v1}, Lz8/b;->b()V

    :cond_0
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lz8/b;->b()V

    :cond_1
    throw v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public final s()Lb9/d;
    .locals 5

    sget-object v0, Lz8/g;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz8/g;->a:Ln7/g;

    invoke-virtual {v1}, Ln7/g;->m()Landroid/content/Context;

    move-result-object v1

    const-string v2, "generatefid.lock"

    invoke-static {v1, v2}, Lz8/b;->a(Landroid/content/Context;Ljava/lang/String;)Lz8/b;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Lz8/g;->c:Lb9/c;

    invoke-virtual {v2}, Lb9/c;->d()Lb9/d;

    move-result-object v2

    invoke-virtual {v2}, Lb9/d;->j()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, v2}, Lz8/g;->A(Lb9/d;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lz8/g;->c:Lb9/c;

    invoke-virtual {v2, v3}, Lb9/d;->t(Ljava/lang/String;)Lb9/d;

    move-result-object v2

    invoke-virtual {v4, v2}, Lb9/c;->b(Lb9/d;)Lb9/d;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    if-eqz v1, :cond_1

    :try_start_2
    invoke-virtual {v1}, Lz8/b;->b()V

    :cond_1
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lz8/b;->b()V

    :cond_2
    throw v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public t()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz8/g;->a:Ln7/g;

    invoke-virtual {v0}, Ln7/g;->r()Ln7/p;

    move-result-object v0

    invoke-virtual {v0}, Ln7/p;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Lb9/d;)V
    .locals 3

    sget-object v0, Lz8/g;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz8/g;->a:Ln7/g;

    invoke-virtual {v1}, Ln7/g;->m()Landroid/content/Context;

    move-result-object v1

    const-string v2, "generatefid.lock"

    invoke-static {v1, v2}, Lz8/b;->a(Landroid/content/Context;Ljava/lang/String;)Lz8/b;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Lz8/g;->c:Lb9/c;

    invoke-virtual {v2, p1}, Lb9/c;->b(Lb9/d;)Lb9/d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_0

    :try_start_2
    invoke-virtual {v1}, Lz8/b;->b()V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lz8/b;->b()V

    :cond_1
    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public final z()V
    .locals 3

    invoke-virtual {p0}, Lz8/g;->m()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."

    invoke-static {v0, v1}, Lh6/s;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p0}, Lz8/g;->t()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."

    invoke-static {v0, v2}, Lh6/s;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p0}, Lz8/g;->l()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options."

    invoke-static {v0, v2}, Lh6/s;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p0}, Lz8/g;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lz8/p;->h(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0, v1}, Lh6/s;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lz8/g;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lz8/p;->g(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0, v2}, Lh6/s;->b(ZLjava/lang/Object;)V

    return-void
.end method
