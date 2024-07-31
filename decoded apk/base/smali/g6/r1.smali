.class public final Lg6/r1;
.super Lf6/q;
.source ""

# interfaces
.implements Lf6/n;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lf6/m;",
        ">",
        "Lf6/q<",
        "TR;>;",
        "Lf6/n<",
        "TR;>;"
    }
.end annotation


# instance fields
.field public a:Lf6/p;

.field public b:Lg6/r1;

.field public volatile c:Lf6/o;

.field public d:Lf6/h;

.field public final e:Ljava/lang/Object;

.field public f:Lcom/google/android/gms/common/api/Status;

.field public final g:Ljava/lang/ref/WeakReference;

.field public final h:Lg6/p1;

.field public i:Z


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 2

    invoke-direct {p0}, Lf6/q;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lg6/r1;->a:Lf6/p;

    iput-object v0, p0, Lg6/r1;->b:Lg6/r1;

    iput-object v0, p0, Lg6/r1;->c:Lf6/o;

    iput-object v0, p0, Lg6/r1;->d:Lf6/h;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lg6/r1;->e:Ljava/lang/Object;

    iput-object v0, p0, Lg6/r1;->f:Lcom/google/android/gms/common/api/Status;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lg6/r1;->i:Z

    const-string v0, "GoogleApiClient reference must not be null"

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lg6/r1;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf6/f;

    new-instance v0, Lg6/p1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lf6/f;->e()Landroid/os/Looper;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    :goto_0
    invoke-direct {v0, p0, p1}, Lg6/p1;-><init>(Lg6/r1;Landroid/os/Looper;)V

    iput-object v0, p0, Lg6/r1;->h:Lg6/p1;

    return-void
.end method

.method public static bridge synthetic c(Lg6/r1;)Lf6/p;
    .locals 0

    iget-object p0, p0, Lg6/r1;->a:Lf6/p;

    return-object p0
.end method

.method public static bridge synthetic d(Lg6/r1;)Lg6/p1;
    .locals 0

    iget-object p0, p0, Lg6/r1;->h:Lg6/p1;

    return-object p0
.end method

.method public static bridge synthetic e(Lg6/r1;)Lg6/r1;
    .locals 0

    iget-object p0, p0, Lg6/r1;->b:Lg6/r1;

    return-object p0
.end method

.method public static bridge synthetic f(Lg6/r1;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lg6/r1;->e:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic g(Lg6/r1;)Ljava/lang/ref/WeakReference;
    .locals 0

    iget-object p0, p0, Lg6/r1;->g:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public static bridge synthetic h(Lg6/r1;Lf6/m;)V
    .locals 0

    invoke-static {p1}, Lg6/r1;->o(Lf6/m;)V

    return-void
.end method

.method public static bridge synthetic i(Lg6/r1;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    invoke-virtual {p0, p1}, Lg6/r1;->k(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public static final o(Lf6/m;)V
    .locals 2

    instance-of v0, p0, Lf6/j;

    if-eqz v0, :cond_0

    :try_start_0
    move-object v0, p0

    check-cast v0, Lf6/j;

    invoke-interface {v0}, Lf6/j;->release()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Unable to release "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "TransformedResultImpl"

    invoke-static {v1, p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lf6/m;)V
    .locals 3

    iget-object v0, p0, Lg6/r1;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-interface {p1}, Lf6/m;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/Status;->N()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lg6/r1;->a:Lf6/p;

    if-eqz v1, :cond_0

    invoke-static {}, Lg6/g1;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Lg6/o1;

    invoke-direct {v2, p0, p1}, Lg6/o1;-><init>(Lg6/r1;Lf6/m;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lg6/r1;->n()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lg6/r1;->c:Lf6/o;

    invoke-static {v1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf6/o;

    invoke-virtual {v1, p1}, Lf6/o;->c(Lf6/m;)V

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lf6/m;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    invoke-virtual {p0, v1}, Lg6/r1;->k(Lcom/google/android/gms/common/api/Status;)V

    invoke-static {p1}, Lg6/r1;->o(Lf6/m;)V

    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b(Lf6/p;)Lf6/q;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "Lf6/m;",
            ">(",
            "Lf6/p<",
            "-TR;+TS;>;)",
            "Lf6/q<",
            "TS;>;"
        }
    .end annotation

    iget-object v0, p0, Lg6/r1;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg6/r1;->a:Lf6/p;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    const-string v4, "Cannot call then() twice."

    invoke-static {v1, v4}, Lh6/s;->p(ZLjava/lang/Object;)V

    iget-object v1, p0, Lg6/r1;->c:Lf6/o;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    const-string v1, "Cannot call then() and andFinally() on the same TransformedResult."

    invoke-static {v2, v1}, Lh6/s;->p(ZLjava/lang/Object;)V

    iput-object p1, p0, Lg6/r1;->a:Lf6/p;

    new-instance p1, Lg6/r1;

    iget-object v1, p0, Lg6/r1;->g:Ljava/lang/ref/WeakReference;

    invoke-direct {p1, v1}, Lg6/r1;-><init>(Ljava/lang/ref/WeakReference;)V

    iput-object p1, p0, Lg6/r1;->b:Lg6/r1;

    invoke-virtual {p0}, Lg6/r1;->l()V

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final j(Lf6/h;)V
    .locals 1

    iget-object v0, p0, Lg6/r1;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lg6/r1;->d:Lf6/h;

    invoke-virtual {p0}, Lg6/r1;->l()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final k(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lg6/r1;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lg6/r1;->f:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, p1}, Lg6/r1;->m(Lcom/google/android/gms/common/api/Status;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, Lg6/r1;->a:Lf6/p;

    if-nez v0, :cond_1

    iget-object v0, p0, Lg6/r1;->c:Lf6/o;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lg6/r1;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf6/f;

    iget-boolean v1, p0, Lg6/r1;->i:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lg6/r1;->a:Lf6/p;

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {v0, p0}, Lf6/f;->h(Lg6/r1;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg6/r1;->i:Z

    :cond_2
    iget-object v0, p0, Lg6/r1;->f:Lcom/google/android/gms/common/api/Status;

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Lg6/r1;->m(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_3
    iget-object v0, p0, Lg6/r1;->d:Lf6/h;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p0}, Lf6/h;->setResultCallback(Lf6/n;)V

    :cond_4
    return-void
.end method

.method public final m(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Lg6/r1;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg6/r1;->a:Lf6/p;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lf6/p;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    const-string v1, "onFailure must not return null"

    invoke-static {p1, v1}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    iget-object v1, p0, Lg6/r1;->b:Lg6/r1;

    invoke-static {v1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg6/r1;

    invoke-virtual {v1, p1}, Lg6/r1;->k(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lg6/r1;->n()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lg6/r1;->c:Lf6/o;

    invoke-static {v1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf6/o;

    invoke-virtual {v1, p1}, Lf6/o;->b(Lcom/google/android/gms/common/api/Status;)V

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final n()Z
    .locals 2

    iget-object v0, p0, Lg6/r1;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf6/f;

    iget-object v1, p0, Lg6/r1;->c:Lf6/o;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
