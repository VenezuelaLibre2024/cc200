.class public Lba/d;
.super Lba/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lba/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Laa/b;",
        ">",
        "Lba/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final b:Lba/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lba/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Lu/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu/e<",
            "Ljava/lang/Integer;",
            "Ljava/util/Set<",
            "+",
            "Laa/a<",
            "TT;>;>;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/concurrent/locks/ReadWriteLock;

.field public final e:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lba/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lba/b<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lba/a;-><init>()V

    new-instance v0, Lu/e;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lu/e;-><init>(I)V

    iput-object v0, p0, Lba/d;->c:Lu/e;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Lba/d;->d:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lba/d;->e:Ljava/util/concurrent/Executor;

    iput-object p1, p0, Lba/d;->b:Lba/b;

    return-void
.end method

.method public static synthetic j(Lba/d;I)Ljava/util/Set;
    .locals 0

    invoke-virtual {p0, p1}, Lba/d;->l(I)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b(F)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Ljava/util/Set<",
            "+",
            "Laa/a<",
            "TT;>;>;"
        }
    .end annotation

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Lba/d;->l(I)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lba/d;->c:Lu/e;

    add-int/lit8 v2, p1, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lu/e;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lba/d;->e:Ljava/util/concurrent/Executor;

    new-instance v3, Lba/d$a;

    invoke-direct {v3, p0, v2}, Lba/d$a;-><init>(Lba/d;I)V

    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    iget-object v1, p0, Lba/d;->c:Lu/e;

    add-int/lit8 p1, p1, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lu/e;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lba/d;->e:Ljava/util/concurrent/Executor;

    new-instance v2, Lba/d$a;

    invoke-direct {v2, p0, p1}, Lba/d$a;-><init>(Lba/d;I)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-object v0
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lba/d;->b:Lba/b;

    invoke-interface {v0}, Lba/b;->c()V

    invoke-virtual {p0}, Lba/d;->k()V

    return-void
.end method

.method public d(Laa/b;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lba/d;->b:Lba/b;

    invoke-interface {v0, p1}, Lba/b;->d(Laa/b;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lba/d;->k()V

    :cond_0
    return p1
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, Lba/d;->b:Lba/b;

    invoke-interface {v0}, Lba/b;->g()I

    move-result v0

    return v0
.end method

.method public i(Laa/b;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lba/d;->b:Lba/b;

    invoke-interface {v0, p1}, Lba/b;->i(Laa/b;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lba/d;->k()V

    :cond_0
    return p1
.end method

.method public final k()V
    .locals 1

    iget-object v0, p0, Lba/d;->c:Lu/e;

    invoke-virtual {v0}, Lu/e;->evictAll()V

    return-void
.end method

.method public final l(I)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Set<",
            "+",
            "Laa/a<",
            "TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lba/d;->d:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    iget-object v0, p0, Lba/d;->c:Lu/e;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lu/e;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    iget-object v1, p0, Lba/d;->d:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/ReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    if-nez v0, :cond_1

    iget-object v0, p0, Lba/d;->d:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    iget-object v0, p0, Lba/d;->c:Lu/e;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lu/e;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_0

    iget-object v0, p0, Lba/d;->b:Lba/b;

    int-to-float v1, p1

    invoke-interface {v0, v1}, Lba/b;->b(F)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lba/d;->c:Lu/e;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Lu/e;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p1, p0, Lba/d;->d:Ljava/util/concurrent/locks/ReadWriteLock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/ReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    :cond_1
    return-object v0
.end method
