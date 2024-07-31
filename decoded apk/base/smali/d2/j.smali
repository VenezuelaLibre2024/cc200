.class public Ld2/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld2/j$c;
    }
.end annotation


# static fields
.field public static final A:Ljava/lang/String;


# instance fields
.field public h:Landroid/content/Context;

.field public i:Ljava/lang/String;

.field public j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld2/e;",
            ">;"
        }
    .end annotation
.end field

.field public k:Landroidx/work/WorkerParameters$a;

.field public l:Ll2/p;

.field public m:Landroidx/work/ListenableWorker;

.field public n:Lo2/a;

.field public o:Landroidx/work/ListenableWorker$a;

.field public p:Landroidx/work/a;

.field public q:Lk2/a;

.field public r:Landroidx/work/impl/WorkDatabase;

.field public s:Ll2/q;

.field public t:Ll2/b;

.field public u:Ll2/t;

.field public v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public w:Ljava/lang/String;

.field public x:Ln2/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln2/c<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public y:Ll7/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll7/f<",
            "Landroidx/work/ListenableWorker$a;",
            ">;"
        }
    .end annotation
.end field

.field public volatile z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkerWrapper"

    invoke-static {v0}, Lc2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ld2/j;->A:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ld2/j$c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/work/ListenableWorker$a;->a()Landroidx/work/ListenableWorker$a;

    move-result-object v0

    iput-object v0, p0, Ld2/j;->o:Landroidx/work/ListenableWorker$a;

    invoke-static {}, Ln2/c;->t()Ln2/c;

    move-result-object v0

    iput-object v0, p0, Ld2/j;->x:Ln2/c;

    const/4 v0, 0x0

    iput-object v0, p0, Ld2/j;->y:Ll7/f;

    iget-object v0, p1, Ld2/j$c;->a:Landroid/content/Context;

    iput-object v0, p0, Ld2/j;->h:Landroid/content/Context;

    iget-object v0, p1, Ld2/j$c;->d:Lo2/a;

    iput-object v0, p0, Ld2/j;->n:Lo2/a;

    iget-object v0, p1, Ld2/j$c;->c:Lk2/a;

    iput-object v0, p0, Ld2/j;->q:Lk2/a;

    iget-object v0, p1, Ld2/j$c;->g:Ljava/lang/String;

    iput-object v0, p0, Ld2/j;->i:Ljava/lang/String;

    iget-object v0, p1, Ld2/j$c;->h:Ljava/util/List;

    iput-object v0, p0, Ld2/j;->j:Ljava/util/List;

    iget-object v0, p1, Ld2/j$c;->i:Landroidx/work/WorkerParameters$a;

    iput-object v0, p0, Ld2/j;->k:Landroidx/work/WorkerParameters$a;

    iget-object v0, p1, Ld2/j$c;->b:Landroidx/work/ListenableWorker;

    iput-object v0, p0, Ld2/j;->m:Landroidx/work/ListenableWorker;

    iget-object v0, p1, Ld2/j$c;->e:Landroidx/work/a;

    iput-object v0, p0, Ld2/j;->p:Landroidx/work/a;

    iget-object p1, p1, Ld2/j$c;->f:Landroidx/work/impl/WorkDatabase;

    iput-object p1, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->B()Ll2/q;

    move-result-object p1

    iput-object p1, p0, Ld2/j;->s:Ll2/q;

    iget-object p1, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->t()Ll2/b;

    move-result-object p1

    iput-object p1, p0, Ld2/j;->t:Ll2/b;

    iget-object p1, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->C()Ll2/t;

    move-result-object p1

    iput-object p1, p0, Ld2/j;->u:Ll2/t;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Work [ id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ld2/j;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tags={ "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    const-string v3, ", "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string p1, " } ]"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b()Ll7/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll7/f<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ld2/j;->x:Ln2/c;

    return-object v0
.end method

.method public final c(Landroidx/work/ListenableWorker$a;)V
    .locals 4

    instance-of v0, p1, Landroidx/work/ListenableWorker$a$c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object p1

    sget-object v0, Ld2/j;->A:Ljava/lang/String;

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v3, p0, Ld2/j;->w:Ljava/lang/String;

    aput-object v3, v1, v2

    const-string v3, "Worker result SUCCESS for %s"

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Throwable;

    invoke-virtual {p1, v0, v1, v2}, Lc2/j;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object p1, p0, Ld2/j;->l:Ll2/p;

    invoke-virtual {p1}, Ll2/p;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    :goto_0
    invoke-virtual {p0}, Ld2/j;->h()V

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Ld2/j;->m()V

    goto :goto_1

    :cond_1
    instance-of p1, p1, Landroidx/work/ListenableWorker$a$b;

    if-eqz p1, :cond_2

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object p1

    sget-object v0, Ld2/j;->A:Ljava/lang/String;

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v3, p0, Ld2/j;->w:Ljava/lang/String;

    aput-object v3, v1, v2

    const-string v3, "Worker result RETRY for %s"

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Throwable;

    invoke-virtual {p1, v0, v1, v2}, Lc2/j;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Ld2/j;->g()V

    goto :goto_1

    :cond_2
    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object p1

    sget-object v0, Ld2/j;->A:Ljava/lang/String;

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v3, p0, Ld2/j;->w:Ljava/lang/String;

    aput-object v3, v1, v2

    const-string v3, "Worker result FAILURE for %s"

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Throwable;

    invoke-virtual {p1, v0, v1, v2}, Lc2/j;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object p1, p0, Ld2/j;->l:Ll2/p;

    invoke-virtual {p1}, Ll2/p;->d()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Ld2/j;->l()V

    :goto_1
    return-void
.end method

.method public d()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld2/j;->z:Z

    invoke-virtual {p0}, Ld2/j;->n()Z

    iget-object v1, p0, Ld2/j;->y:Ll7/f;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v1

    iget-object v3, p0, Ld2/j;->y:Ll7/f;

    invoke-interface {v3, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iget-object v3, p0, Ld2/j;->m:Landroidx/work/ListenableWorker;

    if-eqz v3, :cond_1

    if-nez v1, :cond_1

    invoke-virtual {v3}, Landroidx/work/ListenableWorker;->p()V

    goto :goto_1

    :cond_1
    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Ld2/j;->l:Ll2/p;

    aput-object v1, v0, v2

    const-string v1, "WorkSpec %s is already done. Not interrupting."

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v1

    sget-object v3, Ld2/j;->A:Ljava/lang/String;

    new-array v2, v2, [Ljava/lang/Throwable;

    invoke-virtual {v1, v3, v0, v2}, Lc2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 5

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v0}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Ld2/j;->s:Ll2/q;

    invoke-interface {v1, p1}, Ll2/q;->m(Ljava/lang/String;)Lc2/s$a;

    move-result-object v1

    sget-object v2, Lc2/s$a;->m:Lc2/s$a;

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Ld2/j;->s:Ll2/q;

    sget-object v2, Lc2/s$a;->k:Lc2/s$a;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-interface {v1, v2, v3}, Ll2/q;->i(Lc2/s$a;[Ljava/lang/String;)I

    :cond_0
    iget-object v1, p0, Ld2/j;->t:Ll2/b;

    invoke-interface {v1, p1}, Ll2/b;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public f()V
    .locals 3

    invoke-virtual {p0}, Ld2/j;->n()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->c()V

    :try_start_0
    iget-object v0, p0, Ld2/j;->s:Ll2/q;

    iget-object v1, p0, Ld2/j;->i:Ljava/lang/String;

    invoke-interface {v0, v1}, Ll2/q;->m(Ljava/lang/String;)Lc2/s$a;

    move-result-object v0

    iget-object v1, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->A()Ll2/n;

    move-result-object v1

    iget-object v2, p0, Ld2/j;->i:Ljava/lang/String;

    invoke-interface {v1, v2}, Ll2/n;->a(Ljava/lang/String;)V

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ld2/j;->i(Z)V

    goto :goto_0

    :cond_0
    sget-object v1, Lc2/s$a;->i:Lc2/s$a;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ld2/j;->o:Landroidx/work/ListenableWorker$a;

    invoke-virtual {p0, v0}, Ld2/j;->c(Landroidx/work/ListenableWorker$a;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lc2/s$a;->b()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ld2/j;->g()V

    :cond_2
    :goto_0
    iget-object v0, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->g()V

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo1/e;->g()V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Ld2/j;->j:Ljava/util/List;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld2/e;

    iget-object v2, p0, Ld2/j;->i:Ljava/lang/String;

    invoke-interface {v1, v2}, Ld2/e;->d(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Ld2/j;->p:Landroidx/work/a;

    iget-object v1, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    iget-object v2, p0, Ld2/j;->j:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ld2/f;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    :cond_5
    return-void
.end method

.method public final g()V
    .locals 6

    iget-object v0, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->c()V

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Ld2/j;->s:Ll2/q;

    sget-object v2, Lc2/s$a;->h:Lc2/s$a;

    new-array v3, v0, [Ljava/lang/String;

    const/4 v4, 0x0

    iget-object v5, p0, Ld2/j;->i:Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-interface {v1, v2, v3}, Ll2/q;->i(Lc2/s$a;[Ljava/lang/String;)I

    iget-object v1, p0, Ld2/j;->s:Ll2/q;

    iget-object v2, p0, Ld2/j;->i:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-interface {v1, v2, v3, v4}, Ll2/q;->s(Ljava/lang/String;J)V

    iget-object v1, p0, Ld2/j;->s:Ll2/q;

    iget-object v2, p0, Ld2/j;->i:Ljava/lang/String;

    const-wide/16 v3, -0x1

    invoke-interface {v1, v2, v3, v4}, Ll2/q;->b(Ljava/lang/String;J)I

    iget-object v1, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo1/e;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo1/e;->g()V

    invoke-virtual {p0, v0}, Ld2/j;->i(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lo1/e;->g()V

    invoke-virtual {p0, v0}, Ld2/j;->i(Z)V

    throw v1
.end method

.method public final h()V
    .locals 5

    iget-object v0, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->c()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Ld2/j;->s:Ll2/q;

    iget-object v2, p0, Ld2/j;->i:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-interface {v1, v2, v3, v4}, Ll2/q;->s(Ljava/lang/String;J)V

    iget-object v1, p0, Ld2/j;->s:Ll2/q;

    sget-object v2, Lc2/s$a;->h:Lc2/s$a;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    iget-object v4, p0, Ld2/j;->i:Ljava/lang/String;

    aput-object v4, v3, v0

    invoke-interface {v1, v2, v3}, Ll2/q;->i(Lc2/s$a;[Ljava/lang/String;)I

    iget-object v1, p0, Ld2/j;->s:Ll2/q;

    iget-object v2, p0, Ld2/j;->i:Ljava/lang/String;

    invoke-interface {v1, v2}, Ll2/q;->o(Ljava/lang/String;)I

    iget-object v1, p0, Ld2/j;->s:Ll2/q;

    iget-object v2, p0, Ld2/j;->i:Ljava/lang/String;

    const-wide/16 v3, -0x1

    invoke-interface {v1, v2, v3, v4}, Ll2/q;->b(Ljava/lang/String;J)I

    iget-object v1, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo1/e;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo1/e;->g()V

    invoke-virtual {p0, v0}, Ld2/j;->i(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lo1/e;->g()V

    invoke-virtual {p0, v0}, Ld2/j;->i(Z)V

    throw v1
.end method

.method public final i(Z)V
    .locals 5

    iget-object v0, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->c()V

    :try_start_0
    iget-object v0, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->B()Ll2/q;

    move-result-object v0

    invoke-interface {v0}, Ll2/q;->k()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Ld2/j;->h:Landroid/content/Context;

    const-class v2, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    invoke-static {v0, v2, v1}, Lm2/d;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Ld2/j;->s:Ll2/q;

    sget-object v2, Lc2/s$a;->h:Lc2/s$a;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    iget-object v4, p0, Ld2/j;->i:Ljava/lang/String;

    aput-object v4, v3, v1

    invoke-interface {v0, v2, v3}, Ll2/q;->i(Lc2/s$a;[Ljava/lang/String;)I

    iget-object v0, p0, Ld2/j;->s:Ll2/q;

    iget-object v1, p0, Ld2/j;->i:Ljava/lang/String;

    const-wide/16 v2, -0x1

    invoke-interface {v0, v1, v2, v3}, Ll2/q;->b(Ljava/lang/String;J)I

    :cond_1
    iget-object v0, p0, Ld2/j;->l:Ll2/p;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ld2/j;->m:Landroidx/work/ListenableWorker;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ld2/j;->q:Lk2/a;

    iget-object v1, p0, Ld2/j;->i:Ljava/lang/String;

    invoke-interface {v0, v1}, Lk2/a;->a(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->g()V

    iget-object v0, p0, Ld2/j;->x:Ln2/c;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln2/c;->p(Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->g()V

    throw p1
.end method

.method public final j()V
    .locals 7

    iget-object v0, p0, Ld2/j;->s:Ll2/q;

    iget-object v1, p0, Ld2/j;->i:Ljava/lang/String;

    invoke-interface {v0, v1}, Ll2/q;->m(Ljava/lang/String;)Lc2/s$a;

    move-result-object v0

    sget-object v1, Lc2/s$a;->i:Lc2/s$a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v0

    sget-object v1, Ld2/j;->A:Ljava/lang/String;

    new-array v4, v2, [Ljava/lang/Object;

    iget-object v5, p0, Ld2/j;->i:Ljava/lang/String;

    aput-object v5, v4, v3

    const-string v5, "Status for %s is RUNNING;not doing any work and rescheduling for later execution"

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-array v3, v3, [Ljava/lang/Throwable;

    invoke-virtual {v0, v1, v4, v3}, Lc2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual {p0, v2}, Ld2/j;->i(Z)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v1

    sget-object v4, Ld2/j;->A:Ljava/lang/String;

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, p0, Ld2/j;->i:Ljava/lang/String;

    aput-object v6, v5, v3

    aput-object v0, v5, v2

    const-string v0, "Status for %s is %s; not doing any work"

    invoke-static {v0, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Throwable;

    invoke-virtual {v1, v4, v0, v2}, Lc2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual {p0, v3}, Ld2/j;->i(Z)V

    :goto_0
    return-void
.end method

.method public final k()V
    .locals 16

    move-object/from16 v1, p0

    invoke-virtual/range {p0 .. p0}, Ld2/j;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v1, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->c()V

    :try_start_0
    iget-object v0, v1, Ld2/j;->s:Ll2/q;

    iget-object v2, v1, Ld2/j;->i:Ljava/lang/String;

    invoke-interface {v0, v2}, Ll2/q;->n(Ljava/lang/String;)Ll2/p;

    move-result-object v0

    iput-object v0, v1, Ld2/j;->l:Ll2/p;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_1

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v0

    sget-object v4, Ld2/j;->A:Ljava/lang/String;

    const-string v5, "Didn\'t find WorkSpec for id %s"

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v6, v1, Ld2/j;->i:Ljava/lang/String;

    aput-object v6, v2, v3

    invoke-static {v5, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v5, v3, [Ljava/lang/Throwable;

    invoke-virtual {v0, v4, v2, v5}, Lc2/j;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual {v1, v3}, Ld2/j;->i(Z)V

    iget-object v0, v1, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v1, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->g()V

    return-void

    :cond_1
    :try_start_1
    iget-object v4, v0, Ll2/p;->b:Lc2/s$a;

    sget-object v5, Lc2/s$a;->h:Lc2/s$a;

    if-eq v4, v5, :cond_2

    invoke-virtual/range {p0 .. p0}, Ld2/j;->j()V

    iget-object v0, v1, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->r()V

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v0

    sget-object v4, Ld2/j;->A:Ljava/lang/String;

    const-string v5, "%s is not in ENQUEUED state. Nothing more to do."

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v6, v1, Ld2/j;->l:Ll2/p;

    iget-object v6, v6, Ll2/p;->c:Ljava/lang/String;

    aput-object v6, v2, v3

    invoke-static {v5, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Throwable;

    invoke-virtual {v0, v4, v2, v3}, Lc2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, v1, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->g()V

    return-void

    :cond_2
    :try_start_2
    invoke-virtual {v0}, Ll2/p;->d()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, v1, Ld2/j;->l:Ll2/p;

    invoke-virtual {v0}, Ll2/p;->c()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v0, v1, Ld2/j;->l:Ll2/p;

    iget-wide v6, v0, Ll2/p;->n:J

    const-wide/16 v8, 0x0

    cmp-long v6, v6, v8

    if-nez v6, :cond_4

    move v6, v2

    goto :goto_0

    :cond_4
    move v6, v3

    :goto_0
    if-nez v6, :cond_5

    invoke-virtual {v0}, Ll2/p;->a()J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-gez v0, :cond_5

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v0

    sget-object v4, Ld2/j;->A:Ljava/lang/String;

    const-string v5, "Delaying execution for %s because it is being executed before schedule."

    new-array v6, v2, [Ljava/lang/Object;

    iget-object v7, v1, Ld2/j;->l:Ll2/p;

    iget-object v7, v7, Ll2/p;->c:Ljava/lang/String;

    aput-object v7, v6, v3

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-array v3, v3, [Ljava/lang/Throwable;

    invoke-virtual {v0, v4, v5, v3}, Lc2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Ld2/j;->i(Z)V

    iget-object v0, v1, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->r()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, v1, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->g()V

    return-void

    :cond_5
    :try_start_3
    iget-object v0, v1, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->r()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v0, v1, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->g()V

    iget-object v0, v1, Ld2/j;->l:Ll2/p;

    invoke-virtual {v0}, Ll2/p;->d()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, v1, Ld2/j;->l:Ll2/p;

    iget-object v0, v0, Ll2/p;->e:Landroidx/work/b;

    :goto_1
    move-object v6, v0

    goto :goto_2

    :cond_6
    iget-object v0, v1, Ld2/j;->p:Landroidx/work/a;

    invoke-virtual {v0}, Landroidx/work/a;->f()Lc2/i;

    move-result-object v0

    iget-object v4, v1, Ld2/j;->l:Ll2/p;

    iget-object v4, v4, Ll2/p;->d:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lc2/i;->b(Ljava/lang/String;)Lc2/h;

    move-result-object v0

    if-nez v0, :cond_7

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v0

    sget-object v4, Ld2/j;->A:Ljava/lang/String;

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v5, v1, Ld2/j;->l:Ll2/p;

    iget-object v5, v5, Ll2/p;->d:Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v5, "Could not create Input Merger %s"

    invoke-static {v5, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Throwable;

    invoke-virtual {v0, v4, v2, v3}, Lc2/j;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual/range {p0 .. p0}, Ld2/j;->l()V

    return-void

    :cond_7
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v5, v1, Ld2/j;->l:Ll2/p;

    iget-object v5, v5, Ll2/p;->e:Landroidx/work/b;

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v5, v1, Ld2/j;->s:Ll2/q;

    iget-object v6, v1, Ld2/j;->i:Ljava/lang/String;

    invoke-interface {v5, v6}, Ll2/q;->q(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0, v4}, Lc2/h;->b(Ljava/util/List;)Landroidx/work/b;

    move-result-object v0

    goto :goto_1

    :goto_2
    new-instance v0, Landroidx/work/WorkerParameters;

    iget-object v4, v1, Ld2/j;->i:Ljava/lang/String;

    invoke-static {v4}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v5

    iget-object v7, v1, Ld2/j;->v:Ljava/util/List;

    iget-object v8, v1, Ld2/j;->k:Landroidx/work/WorkerParameters$a;

    iget-object v4, v1, Ld2/j;->l:Ll2/p;

    iget v9, v4, Ll2/p;->k:I

    iget-object v4, v1, Ld2/j;->p:Landroidx/work/a;

    invoke-virtual {v4}, Landroidx/work/a;->e()Ljava/util/concurrent/Executor;

    move-result-object v10

    iget-object v11, v1, Ld2/j;->n:Lo2/a;

    iget-object v4, v1, Ld2/j;->p:Landroidx/work/a;

    invoke-virtual {v4}, Landroidx/work/a;->m()Lc2/v;

    move-result-object v12

    new-instance v13, Lm2/m;

    iget-object v4, v1, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    iget-object v14, v1, Ld2/j;->n:Lo2/a;

    invoke-direct {v13, v4, v14}, Lm2/m;-><init>(Landroidx/work/impl/WorkDatabase;Lo2/a;)V

    new-instance v14, Lm2/l;

    iget-object v4, v1, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    iget-object v15, v1, Ld2/j;->q:Lk2/a;

    iget-object v3, v1, Ld2/j;->n:Lo2/a;

    invoke-direct {v14, v4, v15, v3}, Lm2/l;-><init>(Landroidx/work/impl/WorkDatabase;Lk2/a;Lo2/a;)V

    move-object v4, v0

    invoke-direct/range {v4 .. v14}, Landroidx/work/WorkerParameters;-><init>(Ljava/util/UUID;Landroidx/work/b;Ljava/util/Collection;Landroidx/work/WorkerParameters$a;ILjava/util/concurrent/Executor;Lo2/a;Lc2/v;Lc2/o;Lc2/f;)V

    iget-object v3, v1, Ld2/j;->m:Landroidx/work/ListenableWorker;

    if-nez v3, :cond_8

    iget-object v3, v1, Ld2/j;->p:Landroidx/work/a;

    invoke-virtual {v3}, Landroidx/work/a;->m()Lc2/v;

    move-result-object v3

    iget-object v4, v1, Ld2/j;->h:Landroid/content/Context;

    iget-object v5, v1, Ld2/j;->l:Ll2/p;

    iget-object v5, v5, Ll2/p;->c:Ljava/lang/String;

    invoke-virtual {v3, v4, v5, v0}, Lc2/v;->b(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;

    move-result-object v3

    iput-object v3, v1, Ld2/j;->m:Landroidx/work/ListenableWorker;

    :cond_8
    iget-object v3, v1, Ld2/j;->m:Landroidx/work/ListenableWorker;

    if-nez v3, :cond_9

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v0

    sget-object v3, Ld2/j;->A:Ljava/lang/String;

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v4, v1, Ld2/j;->l:Ll2/p;

    iget-object v4, v4, Ll2/p;->c:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v2, v5

    const-string v4, "Could not create Worker %s"

    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v4, v5, [Ljava/lang/Throwable;

    invoke-virtual {v0, v3, v2, v4}, Lc2/j;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual/range {p0 .. p0}, Ld2/j;->l()V

    return-void

    :cond_9
    const/4 v5, 0x0

    invoke-virtual {v3}, Landroidx/work/ListenableWorker;->k()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v0

    sget-object v3, Ld2/j;->A:Ljava/lang/String;

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v4, v1, Ld2/j;->l:Ll2/p;

    iget-object v4, v4, Ll2/p;->c:Ljava/lang/String;

    aput-object v4, v2, v5

    const-string v4, "Received an already-used Worker %s; WorkerFactory should return new instances"

    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v4, v5, [Ljava/lang/Throwable;

    invoke-virtual {v0, v3, v2, v4}, Lc2/j;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual/range {p0 .. p0}, Ld2/j;->l()V

    return-void

    :cond_a
    iget-object v2, v1, Ld2/j;->m:Landroidx/work/ListenableWorker;

    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->n()V

    invoke-virtual/range {p0 .. p0}, Ld2/j;->o()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual/range {p0 .. p0}, Ld2/j;->n()Z

    move-result v2

    if-eqz v2, :cond_b

    return-void

    :cond_b
    invoke-static {}, Ln2/c;->t()Ln2/c;

    move-result-object v2

    new-instance v9, Lm2/k;

    iget-object v4, v1, Ld2/j;->h:Landroid/content/Context;

    iget-object v5, v1, Ld2/j;->l:Ll2/p;

    iget-object v6, v1, Ld2/j;->m:Landroidx/work/ListenableWorker;

    invoke-virtual {v0}, Landroidx/work/WorkerParameters;->b()Lc2/f;

    move-result-object v7

    iget-object v8, v1, Ld2/j;->n:Lo2/a;

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Lm2/k;-><init>(Landroid/content/Context;Ll2/p;Landroidx/work/ListenableWorker;Lc2/f;Lo2/a;)V

    iget-object v0, v1, Ld2/j;->n:Lo2/a;

    invoke-interface {v0}, Lo2/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-interface {v0, v9}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v9}, Lm2/k;->a()Ll7/f;

    move-result-object v0

    new-instance v3, Ld2/j$a;

    invoke-direct {v3, v1, v0, v2}, Ld2/j$a;-><init>(Ld2/j;Ll7/f;Ln2/c;)V

    iget-object v4, v1, Ld2/j;->n:Lo2/a;

    invoke-interface {v4}, Lo2/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ll7/f;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object v0, v1, Ld2/j;->w:Ljava/lang/String;

    new-instance v3, Ld2/j$b;

    invoke-direct {v3, v1, v2, v0}, Ld2/j$b;-><init>(Ld2/j;Ln2/c;Ljava/lang/String;)V

    iget-object v0, v1, Ld2/j;->n:Lo2/a;

    invoke-interface {v0}, Lo2/a;->c()Lm2/g;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Ln2/a;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_3

    :cond_c
    invoke-virtual/range {p0 .. p0}, Ld2/j;->j()V

    :goto_3
    return-void

    :catchall_0
    move-exception v0

    iget-object v2, v1, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lo1/e;->g()V

    throw v0
.end method

.method public l()V
    .locals 4

    iget-object v0, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->c()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Ld2/j;->i:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ld2/j;->e(Ljava/lang/String;)V

    iget-object v1, p0, Ld2/j;->o:Landroidx/work/ListenableWorker$a;

    check-cast v1, Landroidx/work/ListenableWorker$a$a;

    invoke-virtual {v1}, Landroidx/work/ListenableWorker$a$a;->e()Landroidx/work/b;

    move-result-object v1

    iget-object v2, p0, Ld2/j;->s:Ll2/q;

    iget-object v3, p0, Ld2/j;->i:Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Ll2/q;->g(Ljava/lang/String;Landroidx/work/b;)V

    iget-object v1, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo1/e;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo1/e;->g()V

    invoke-virtual {p0, v0}, Ld2/j;->i(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lo1/e;->g()V

    invoke-virtual {p0, v0}, Ld2/j;->i(Z)V

    throw v1
.end method

.method public final m()V
    .locals 10

    iget-object v0, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->c()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Ld2/j;->s:Ll2/q;

    sget-object v2, Lc2/s$a;->j:Lc2/s$a;

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/String;

    iget-object v5, p0, Ld2/j;->i:Ljava/lang/String;

    aput-object v5, v4, v0

    invoke-interface {v1, v2, v4}, Ll2/q;->i(Lc2/s$a;[Ljava/lang/String;)I

    iget-object v1, p0, Ld2/j;->o:Landroidx/work/ListenableWorker$a;

    check-cast v1, Landroidx/work/ListenableWorker$a$c;

    invoke-virtual {v1}, Landroidx/work/ListenableWorker$a$c;->e()Landroidx/work/b;

    move-result-object v1

    iget-object v2, p0, Ld2/j;->s:Ll2/q;

    iget-object v4, p0, Ld2/j;->i:Ljava/lang/String;

    invoke-interface {v2, v4, v1}, Ll2/q;->g(Ljava/lang/String;Landroidx/work/b;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-object v4, p0, Ld2/j;->t:Ll2/b;

    iget-object v5, p0, Ld2/j;->i:Ljava/lang/String;

    invoke-interface {v4, v5}, Ll2/b;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iget-object v6, p0, Ld2/j;->s:Ll2/q;

    invoke-interface {v6, v5}, Ll2/q;->m(Ljava/lang/String;)Lc2/s$a;

    move-result-object v6

    sget-object v7, Lc2/s$a;->l:Lc2/s$a;

    if-ne v6, v7, :cond_0

    iget-object v6, p0, Ld2/j;->t:Ll2/b;

    invoke-interface {v6, v5}, Ll2/b;->c(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v6

    sget-object v7, Ld2/j;->A:Ljava/lang/String;

    const-string v8, "Setting status to enqueued for %s"

    new-array v9, v3, [Ljava/lang/Object;

    aput-object v5, v9, v0

    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    new-array v9, v0, [Ljava/lang/Throwable;

    invoke-virtual {v6, v7, v8, v9}, Lc2/j;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v6, p0, Ld2/j;->s:Ll2/q;

    sget-object v7, Lc2/s$a;->h:Lc2/s$a;

    new-array v8, v3, [Ljava/lang/String;

    aput-object v5, v8, v0

    invoke-interface {v6, v7, v8}, Ll2/q;->i(Lc2/s$a;[Ljava/lang/String;)I

    iget-object v6, p0, Ld2/j;->s:Ll2/q;

    invoke-interface {v6, v5, v1, v2}, Ll2/q;->s(Ljava/lang/String;J)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo1/e;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo1/e;->g()V

    invoke-virtual {p0, v0}, Ld2/j;->i(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lo1/e;->g()V

    invoke-virtual {p0, v0}, Ld2/j;->i(Z)V

    throw v1
.end method

.method public final n()Z
    .locals 6

    iget-boolean v0, p0, Ld2/j;->z:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v0

    sget-object v2, Ld2/j;->A:Ljava/lang/String;

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    iget-object v5, p0, Ld2/j;->w:Ljava/lang/String;

    aput-object v5, v4, v1

    const-string v5, "Work interrupted for %s"

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-array v5, v1, [Ljava/lang/Throwable;

    invoke-virtual {v0, v2, v4, v5}, Lc2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v0, p0, Ld2/j;->s:Ll2/q;

    iget-object v2, p0, Ld2/j;->i:Ljava/lang/String;

    invoke-interface {v0, v2}, Ll2/q;->m(Ljava/lang/String;)Lc2/s$a;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0, v1}, Ld2/j;->i(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lc2/s$a;->b()Z

    move-result v0

    xor-int/2addr v0, v3

    invoke-virtual {p0, v0}, Ld2/j;->i(Z)V

    :goto_0
    return v3

    :cond_1
    return v1
.end method

.method public final o()Z
    .locals 6

    iget-object v0, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->c()V

    :try_start_0
    iget-object v0, p0, Ld2/j;->s:Ll2/q;

    iget-object v1, p0, Ld2/j;->i:Ljava/lang/String;

    invoke-interface {v0, v1}, Ll2/q;->m(Ljava/lang/String;)Lc2/s$a;

    move-result-object v0

    sget-object v1, Lc2/s$a;->h:Lc2/s$a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld2/j;->s:Ll2/q;

    sget-object v1, Lc2/s$a;->i:Lc2/s$a;

    new-array v4, v2, [Ljava/lang/String;

    iget-object v5, p0, Ld2/j;->i:Ljava/lang/String;

    aput-object v5, v4, v3

    invoke-interface {v0, v1, v4}, Ll2/q;->i(Lc2/s$a;[Ljava/lang/String;)I

    iget-object v0, p0, Ld2/j;->s:Ll2/q;

    iget-object v1, p0, Ld2/j;->i:Ljava/lang/String;

    invoke-interface {v0, v1}, Ll2/q;->r(Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    iget-object v0, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lo1/e;->g()V

    return v2

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ld2/j;->r:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lo1/e;->g()V

    throw v0
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Ld2/j;->u:Ll2/t;

    iget-object v1, p0, Ld2/j;->i:Ljava/lang/String;

    invoke-interface {v0, v1}, Ll2/t;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ld2/j;->v:Ljava/util/List;

    invoke-virtual {p0, v0}, Ld2/j;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ld2/j;->w:Ljava/lang/String;

    invoke-virtual {p0}, Ld2/j;->k()V

    return-void
.end method
