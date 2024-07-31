.class public Lt7/h;
.super Ls7/d;
.source ""


# instance fields
.field public final a:Ln7/g;

.field public final b:Ly8/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly8/b<",
            "Lv8/i;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv7/a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls7/d$a;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lt7/m;

.field public final f:Lt7/n;

.field public final g:Ljava/util/concurrent/Executor;

.field public final h:Ljava/util/concurrent/Executor;

.field public final i:Ljava/util/concurrent/Executor;

.field public final j:Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Lu7/a;

.field public l:Ls7/a;

.field public m:Ls7/b;

.field public n:Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/Task<",
            "Ls7/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln7/g;Ly8/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 2
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build Lr7/d;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/Executor;
        .annotation build Lr7/c;
        .end annotation
    .end param
    .param p5    # Ljava/util/concurrent/Executor;
        .annotation build Lr7/a;
        .end annotation
    .end param
    .param p6    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation build Lr7/b;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Ly8/b<",
            "Lv8/i;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ls7/d;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lt7/h;->a:Ln7/g;

    iput-object p2, p0, Lt7/h;->b:Ly8/b;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lt7/h;->c:Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lt7/h;->d:Ljava/util/List;

    new-instance p2, Lt7/m;

    invoke-virtual {p1}, Ln7/g;->m()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Ln7/g;->s()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v0, v1}, Lt7/m;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object p2, p0, Lt7/h;->e:Lt7/m;

    new-instance p2, Lt7/n;

    invoke-virtual {p1}, Ln7/g;->m()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1, p0, p4, p6}, Lt7/n;-><init>(Landroid/content/Context;Lt7/h;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object p2, p0, Lt7/h;->f:Lt7/n;

    iput-object p3, p0, Lt7/h;->g:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lt7/h;->h:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Lt7/h;->i:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, p5}, Lt7/h;->o(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iput-object p1, p0, Lt7/h;->j:Lcom/google/android/gms/tasks/Task;

    new-instance p1, Lu7/a$a;

    invoke-direct {p1}, Lu7/a$a;-><init>()V

    iput-object p1, p0, Lt7/h;->k:Lu7/a;

    return-void
.end method

.method public static synthetic c(Lt7/h;ZLcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-direct {p0, p1, p2}, Lt7/h;->l(ZLcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lt7/h;Ls7/b;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-direct {p0, p1}, Lt7/h;->j(Ls7/b;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-static {p0}, Lt7/h;->k(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lt7/h;Ls7/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lt7/h;->n(Ls7/b;)V

    return-void
.end method

.method public static synthetic g(Lt7/h;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0, p1}, Lt7/h;->m(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method private synthetic j(Ls7/b;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    invoke-virtual {p0, p1}, Lt7/h;->q(Ls7/b;)V

    iget-object v0, p0, Lt7/h;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls7/d$a;

    invoke-interface {v1, p1}, Ls7/d$a;->a(Ls7/b;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lt7/b;->c(Ls7/b;)Lt7/b;

    move-result-object v0

    iget-object v1, p0, Lt7/h;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv7/a;

    invoke-interface {v2, v0}, Lv7/a;->a(Ls7/c;)V

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic k(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ls7/b;

    invoke-static {p0}, Lt7/b;->c(Ls7/b;)Lt7/b;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ln7/m;

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ln7/m;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0}, Lt7/b;->d(Ln7/m;)Lt7/b;

    move-result-object p0

    goto :goto_0
.end method

.method private synthetic l(ZLcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lt7/h;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lt7/h;->m:Ls7/b;

    invoke-static {p1}, Lt7/b;->c(Ls7/b;)Lt7/b;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lt7/h;->l:Ls7/a;

    if-nez p1, :cond_1

    new-instance p1, Ln7/m;

    const-string p2, "No AppCheckProvider installed."

    invoke-direct {p1, p2}, Ln7/m;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lt7/b;->d(Ln7/m;)Lt7/b;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, Lt7/h;->n:Lcom/google/android/gms/tasks/Task;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isComplete()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lt7/h;->n:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    invoke-virtual {p0}, Lt7/h;->h()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iput-object p1, p0, Lt7/h;->n:Lcom/google/android/gms/tasks/Task;

    :cond_3
    iget-object p1, p0, Lt7/h;->n:Lcom/google/android/gms/tasks/Task;

    iget-object p2, p0, Lt7/h;->h:Ljava/util/concurrent/Executor;

    sget-object v0, Lt7/d;->a:Lt7/d;

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method private synthetic m(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    iget-object v0, p0, Lt7/h;->e:Lt7/m;

    invoke-virtual {v0}, Lt7/m;->d()Ls7/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lt7/h;->p(Ls7/b;)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic n(Ls7/b;)V
    .locals 1

    iget-object v0, p0, Lt7/h;->e:Lt7/m;

    invoke-virtual {v0, p1}, Lt7/m;->e(Ls7/b;)V

    return-void
.end method


# virtual methods
.method public a(Z)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ls7/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lt7/h;->j:Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, Lt7/h;->h:Ljava/util/concurrent/Executor;

    new-instance v2, Lt7/c;

    invoke-direct {v2, p0, p1}, Lt7/c;-><init>(Lt7/h;Z)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public b(Lv7/a;)V
    .locals 3

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lt7/h;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lt7/h;->f:Lt7/n;

    iget-object v1, p0, Lt7/h;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Lt7/h;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lt7/n;->e(I)V

    invoke-virtual {p0}, Lt7/h;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt7/h;->m:Ls7/b;

    invoke-static {v0}, Lt7/b;->c(Ls7/b;)Lt7/b;

    move-result-object v0

    invoke-interface {p1, v0}, Lv7/a;->a(Ls7/c;)V

    :cond_0
    return-void
.end method

.method public h()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ls7/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lt7/h;->l:Ls7/a;

    invoke-interface {v0}, Ls7/a;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lt7/h;->g:Ljava/util/concurrent/Executor;

    new-instance v2, Lt7/e;

    invoke-direct {v2, p0}, Lt7/e;-><init>(Lt7/h;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final i()Z
    .locals 4

    iget-object v0, p0, Lt7/h;->m:Ls7/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ls7/b;->a()J

    move-result-wide v0

    iget-object v2, p0, Lt7/h;->k:Lu7/a;

    invoke-interface {v2}, Lu7/a;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x493e0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final o(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    new-instance v1, Lt7/f;

    invoke-direct {v1, p0, v0}, Lt7/f;-><init>(Lt7/h;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public p(Ls7/b;)V
    .locals 0

    iput-object p1, p0, Lt7/h;->m:Ls7/b;

    return-void
.end method

.method public final q(Ls7/b;)V
    .locals 2

    iget-object v0, p0, Lt7/h;->i:Ljava/util/concurrent/Executor;

    new-instance v1, Lt7/g;

    invoke-direct {v1, p0, p1}, Lt7/g;-><init>(Lt7/h;Ls7/b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {p0, p1}, Lt7/h;->p(Ls7/b;)V

    iget-object v0, p0, Lt7/h;->f:Lt7/n;

    invoke-virtual {v0, p1}, Lt7/n;->d(Ls7/b;)V

    return-void
.end method
