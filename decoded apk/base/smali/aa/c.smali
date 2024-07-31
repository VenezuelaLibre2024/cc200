.class public Laa/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx6/c$b;
.implements Lx6/c$j;
.implements Lx6/c$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laa/c$b;,
        Laa/c$c;,
        Laa/c$f;,
        Laa/c$d;,
        Laa/c$e;,
        Laa/c$g;,
        Laa/c$h;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Laa/b;",
        ">",
        "Ljava/lang/Object;",
        "Lx6/c$b;",
        "Lx6/c$j;",
        "Lx6/c$f;"
    }
.end annotation


# instance fields
.field public final h:Lda/b;

.field public final i:Lda/b$a;

.field public final j:Lda/b$a;

.field public k:Lba/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lba/e<",
            "TT;>;"
        }
    .end annotation
.end field

.field public l:Lca/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lca/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public m:Lx6/c;

.field public n:Lcom/google/android/gms/maps/model/CameraPosition;

.field public o:Laa/c$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Laa/c<",
            "TT;>.b;"
        }
    .end annotation
.end field

.field public final p:Ljava/util/concurrent/locks/ReadWriteLock;

.field public q:Laa/c$f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Laa/c$f<",
            "TT;>;"
        }
    .end annotation
.end field

.field public r:Laa/c$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Laa/c$d<",
            "TT;>;"
        }
    .end annotation
.end field

.field public s:Laa/c$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Laa/c$e<",
            "TT;>;"
        }
    .end annotation
.end field

.field public t:Laa/c$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Laa/c$g<",
            "TT;>;"
        }
    .end annotation
.end field

.field public u:Laa/c$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Laa/c$h<",
            "TT;>;"
        }
    .end annotation
.end field

.field public v:Laa/c$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Laa/c$c<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lx6/c;Lda/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Laa/c;->p:Ljava/util/concurrent/locks/ReadWriteLock;

    iput-object p2, p0, Laa/c;->m:Lx6/c;

    iput-object p3, p0, Laa/c;->h:Lda/b;

    invoke-virtual {p3}, Lda/b;->g()Lda/b$a;

    move-result-object v0

    iput-object v0, p0, Laa/c;->j:Lda/b$a;

    invoke-virtual {p3}, Lda/b;->g()Lda/b$a;

    move-result-object p3

    iput-object p3, p0, Laa/c;->i:Lda/b$a;

    new-instance p3, Lca/f;

    invoke-direct {p3, p1, p2, p0}, Lca/f;-><init>(Landroid/content/Context;Lx6/c;Laa/c;)V

    iput-object p3, p0, Laa/c;->l:Lca/a;

    new-instance p1, Lba/f;

    new-instance p2, Lba/d;

    new-instance p3, Lba/c;

    invoke-direct {p3}, Lba/c;-><init>()V

    invoke-direct {p2, p3}, Lba/d;-><init>(Lba/b;)V

    invoke-direct {p1, p2}, Lba/f;-><init>(Lba/b;)V

    iput-object p1, p0, Laa/c;->k:Lba/e;

    new-instance p1, Laa/c$b;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Laa/c$b;-><init>(Laa/c;Laa/c$a;)V

    iput-object p1, p0, Laa/c;->o:Laa/c$b;

    iget-object p1, p0, Laa/c;->l:Lca/a;

    invoke-interface {p1}, Lca/a;->onAdd()V

    return-void
.end method

.method public static synthetic a(Laa/c;)Lca/a;
    .locals 0

    iget-object p0, p0, Laa/c;->l:Lca/a;

    return-object p0
.end method


# virtual methods
.method public b(Laa/b;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Laa/c;->e()Lba/b;

    move-result-object v0

    invoke-interface {v0}, Lba/b;->f()V

    :try_start_0
    invoke-interface {v0, p1}, Lba/b;->i(Laa/b;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lba/b;->e()V

    return p1

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Lba/b;->e()V

    throw p1
.end method

.method public c()V
    .locals 2

    invoke-virtual {p0}, Laa/c;->e()Lba/b;

    move-result-object v0

    invoke-interface {v0}, Lba/b;->f()V

    :try_start_0
    invoke-interface {v0}, Lba/b;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lba/b;->e()V

    return-void

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Lba/b;->e()V

    throw v1
.end method

.method public d()V
    .locals 5

    iget-object v0, p0, Laa/c;->p:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Laa/c;->o:Laa/c$b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    new-instance v0, Laa/c$b;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Laa/c$b;-><init>(Laa/c;Laa/c$a;)V

    iput-object v0, p0, Laa/c;->o:Laa/c$b;

    sget-object v2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v1, v1, [Ljava/lang/Float;

    const/4 v3, 0x0

    iget-object v4, p0, Laa/c;->m:Lx6/c;

    invoke-virtual {v4}, Lx6/c;->g()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v4

    iget v4, v4, Lcom/google/android/gms/maps/model/CameraPosition;->i:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v1, v3

    invoke-virtual {v0, v2, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Laa/c;->p:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Laa/c;->p:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public e()Lba/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lba/b<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Laa/c;->k:Lba/e;

    return-object v0
.end method

.method public f()Lda/b$a;
    .locals 1

    iget-object v0, p0, Laa/c;->j:Lda/b$a;

    return-object v0
.end method

.method public g()Lda/b$a;
    .locals 1

    iget-object v0, p0, Laa/c;->i:Lda/b$a;

    return-object v0
.end method

.method public h()Lda/b;
    .locals 1

    iget-object v0, p0, Laa/c;->h:Lda/b;

    return-object v0
.end method

.method public i(Laa/b;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Laa/c;->e()Lba/b;

    move-result-object v0

    invoke-interface {v0}, Lba/b;->f()V

    :try_start_0
    invoke-interface {v0, p1}, Lba/b;->d(Laa/b;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lba/b;->e()V

    return p1

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Lba/b;->e()V

    throw p1
.end method

.method public j(Laa/c$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/c$c<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Laa/c;->v:Laa/c$c;

    iget-object v0, p0, Laa/c;->l:Lca/a;

    invoke-interface {v0, p1}, Lca/a;->setOnClusterClickListener(Laa/c$c;)V

    return-void
.end method

.method public k(Laa/c$f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/c$f<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Laa/c;->q:Laa/c$f;

    iget-object v0, p0, Laa/c;->l:Lca/a;

    invoke-interface {v0, p1}, Lca/a;->setOnClusterItemClickListener(Laa/c$f;)V

    return-void
.end method

.method public l(Lca/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lca/a<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Laa/c;->l:Lca/a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lca/a;->setOnClusterClickListener(Laa/c$c;)V

    iget-object v0, p0, Laa/c;->l:Lca/a;

    invoke-interface {v0, v1}, Lca/a;->setOnClusterItemClickListener(Laa/c$f;)V

    iget-object v0, p0, Laa/c;->j:Lda/b$a;

    invoke-virtual {v0}, Lda/a$b;->b()V

    iget-object v0, p0, Laa/c;->i:Lda/b$a;

    invoke-virtual {v0}, Lda/a$b;->b()V

    iget-object v0, p0, Laa/c;->l:Lca/a;

    invoke-interface {v0}, Lca/a;->onRemove()V

    iput-object p1, p0, Laa/c;->l:Lca/a;

    invoke-interface {p1}, Lca/a;->onAdd()V

    iget-object p1, p0, Laa/c;->l:Lca/a;

    iget-object v0, p0, Laa/c;->v:Laa/c$c;

    invoke-interface {p1, v0}, Lca/a;->setOnClusterClickListener(Laa/c$c;)V

    iget-object p1, p0, Laa/c;->l:Lca/a;

    iget-object v0, p0, Laa/c;->r:Laa/c$d;

    invoke-interface {p1, v0}, Lca/a;->setOnClusterInfoWindowClickListener(Laa/c$d;)V

    iget-object p1, p0, Laa/c;->l:Lca/a;

    iget-object v0, p0, Laa/c;->s:Laa/c$e;

    invoke-interface {p1, v0}, Lca/a;->setOnClusterInfoWindowLongClickListener(Laa/c$e;)V

    iget-object p1, p0, Laa/c;->l:Lca/a;

    iget-object v0, p0, Laa/c;->q:Laa/c$f;

    invoke-interface {p1, v0}, Lca/a;->setOnClusterItemClickListener(Laa/c$f;)V

    iget-object p1, p0, Laa/c;->l:Lca/a;

    iget-object v0, p0, Laa/c;->t:Laa/c$g;

    invoke-interface {p1, v0}, Lca/a;->setOnClusterItemInfoWindowClickListener(Laa/c$g;)V

    iget-object p1, p0, Laa/c;->l:Lca/a;

    iget-object v0, p0, Laa/c;->u:Laa/c$h;

    invoke-interface {p1, v0}, Lca/a;->setOnClusterItemInfoWindowLongClickListener(Laa/c$h;)V

    invoke-virtual {p0}, Laa/c;->d()V

    return-void
.end method

.method public onCameraIdle()V
    .locals 2

    iget-object v0, p0, Laa/c;->l:Lca/a;

    instance-of v1, v0, Lx6/c$b;

    if-eqz v1, :cond_0

    check-cast v0, Lx6/c$b;

    invoke-interface {v0}, Lx6/c$b;->onCameraIdle()V

    :cond_0
    iget-object v0, p0, Laa/c;->k:Lba/e;

    iget-object v1, p0, Laa/c;->m:Lx6/c;

    invoke-virtual {v1}, Lx6/c;->g()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v1

    invoke-interface {v0, v1}, Lba/e;->a(Lcom/google/android/gms/maps/model/CameraPosition;)V

    iget-object v0, p0, Laa/c;->k:Lba/e;

    invoke-interface {v0}, Lba/e;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    invoke-virtual {p0}, Laa/c;->d()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Laa/c;->n:Lcom/google/android/gms/maps/model/CameraPosition;

    if-eqz v0, :cond_2

    iget v0, v0, Lcom/google/android/gms/maps/model/CameraPosition;->i:F

    iget-object v1, p0, Laa/c;->m:Lx6/c;

    invoke-virtual {v1}, Lx6/c;->g()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v1

    iget v1, v1, Lcom/google/android/gms/maps/model/CameraPosition;->i:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Laa/c;->m:Lx6/c;

    invoke-virtual {v0}, Lx6/c;->g()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    iput-object v0, p0, Laa/c;->n:Lcom/google/android/gms/maps/model/CameraPosition;

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public onInfoWindowClick(Lz6/m;)V
    .locals 1

    invoke-virtual {p0}, Laa/c;->h()Lda/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lda/b;->onInfoWindowClick(Lz6/m;)V

    return-void
.end method

.method public onMarkerClick(Lz6/m;)Z
    .locals 1

    invoke-virtual {p0}, Laa/c;->h()Lda/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lda/b;->onMarkerClick(Lz6/m;)Z

    move-result p1

    return p1
.end method
