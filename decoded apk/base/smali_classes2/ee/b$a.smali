.class public final Lee/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lee/e;
.implements Lce/j3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lee/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lee/e<",
        "TE;>;",
        "Lce/j3;"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Lce/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lce/p<",
            "-",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:Lee/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/b<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lee/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lee/b$a;->j:Lee/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lee/c;->m()Lhe/l0;

    move-result-object p1

    iput-object p1, p0, Lee/b$a;->h:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic b(Lee/b$a;)V
    .locals 0

    invoke-virtual {p0}, Lee/b$a;->g()V

    return-void
.end method

.method public static final synthetic c(Lee/b$a;Lce/p;)V
    .locals 0

    iput-object p1, p0, Lee/b$a;->i:Lce/p;

    return-void
.end method

.method public static final synthetic d(Lee/b$a;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lee/b$a;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljd/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v6, p0, Lee/b$a;->j:Lee/b;

    invoke-static {}, Lee/b;->h()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lee/h;

    :goto_0
    invoke-virtual {v6}, Lee/b;->P()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lee/b$a;->f()Z

    move-result p1

    :goto_1
    invoke-static {p1}, Lld/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_3

    :cond_0
    invoke-static {}, Lee/b;->i()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v10

    sget v1, Lee/c;->b:I

    int-to-long v2, v1

    div-long v2, v10, v2

    int-to-long v4, v1

    rem-long v4, v10, v4

    long-to-int v9, v4

    iget-wide v4, v0, Lhe/i0;->j:J

    cmp-long v1, v4, v2

    if-eqz v1, :cond_2

    invoke-static {v6, v2, v3, v0}, Lee/b;->e(Lee/b;JLee/h;)Lee/h;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v8, v1

    goto :goto_2

    :cond_2
    move-object v8, v0

    :goto_2
    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, v8

    move v2, v9

    move-wide v3, v10

    invoke-static/range {v0 .. v5}, Lee/b;->p(Lee/b;Lee/h;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lee/c;->r()Lhe/l0;

    move-result-object v1

    if-eq v0, v1, :cond_6

    invoke-static {}, Lee/c;->h()Lhe/l0;

    move-result-object v1

    if-ne v0, v1, :cond_4

    invoke-virtual {v6}, Lee/b;->I()J

    move-result-wide v0

    cmp-long v0, v10, v0

    if-gez v0, :cond_3

    invoke-virtual {v8}, Lhe/f;->b()V

    :cond_3
    move-object v0, v8

    goto :goto_0

    :cond_4
    invoke-static {}, Lee/c;->s()Lhe/l0;

    move-result-object v1

    if-ne v0, v1, :cond_5

    move-object v7, p0

    move-object v12, p1

    invoke-virtual/range {v7 .. v12}, Lee/b$a;->e(Lee/h;IJLjd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-virtual {v8}, Lhe/f;->b()V

    iput-object v0, p0, Lee/b$a;->h:Ljava/lang/Object;

    const/4 p1, 0x1

    goto :goto_1

    :goto_3
    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unreachable"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Lee/h;IJLjd/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lee/h<",
            "TE;>;IJ",
            "Ljd/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v6, p0, Lee/b$a;->j:Lee/b;

    invoke-static {p5}, Lkd/b;->b(Ljd/d;)Ljd/d;

    move-result-object v0

    invoke-static {v0}, Lce/r;->b(Ljd/d;)Lce/p;

    move-result-object v7

    :try_start_0
    invoke-static {p0, v7}, Lee/b$a;->c(Lee/b$a;Lce/p;)V

    move-object v0, v6

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lee/b;->p(Lee/b;Lee/h;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lee/c;->r()Lhe/l0;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {v6, p0, p1, p2}, Lee/b;->n(Lee/b;Lce/j3;Lee/h;I)V

    goto/16 :goto_2

    :cond_0
    invoke-static {}, Lee/c;->h()Lhe/l0;

    move-result-object p2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-ne v0, p2, :cond_a

    invoke-virtual {v6}, Lee/b;->I()J

    move-result-wide v0

    cmp-long p2, p3, v0

    if-gez p2, :cond_1

    invoke-virtual {p1}, Lhe/f;->b()V

    :cond_1
    invoke-static {}, Lee/b;->h()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lee/h;

    :cond_2
    :goto_0
    invoke-virtual {v6}, Lee/b;->P()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {p0}, Lee/b$a;->b(Lee/b$a;)V

    goto/16 :goto_2

    :cond_3
    invoke-static {}, Lee/b;->i()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p2

    invoke-virtual {p2, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide p2

    sget p4, Lee/c;->b:I

    int-to-long v0, p4

    div-long v0, p2, v0

    int-to-long v2, p4

    rem-long v2, p2, v2

    long-to-int p4, v2

    iget-wide v2, p1, Lhe/i0;->j:J

    cmp-long v2, v2, v0

    if-eqz v2, :cond_5

    invoke-static {v6, v0, v1, p1}, Lee/b;->e(Lee/b;JLee/h;)Lee/h;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    move-object p1, v0

    :cond_5
    move-object v0, v6

    move-object v1, p1

    move v2, p4

    move-wide v3, p2

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lee/b;->p(Lee/b;Lee/h;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lee/c;->r()Lhe/l0;

    move-result-object v1

    if-ne v0, v1, :cond_6

    invoke-static {v6, p0, p1, p4}, Lee/b;->n(Lee/b;Lce/j3;Lee/h;I)V

    goto :goto_2

    :cond_6
    invoke-static {}, Lee/c;->h()Lhe/l0;

    move-result-object p4

    if-ne v0, p4, :cond_7

    invoke-virtual {v6}, Lee/b;->I()J

    move-result-wide v0

    cmp-long p2, p2, v0

    if-gez p2, :cond_2

    invoke-virtual {p1}, Lhe/f;->b()V

    goto :goto_0

    :cond_7
    invoke-static {}, Lee/c;->s()Lhe/l0;

    move-result-object p2

    if-eq v0, p2, :cond_9

    invoke-virtual {p1}, Lhe/f;->b()V

    invoke-static {p0, v0}, Lee/b$a;->d(Lee/b$a;Ljava/lang/Object;)V

    invoke-static {p0, v9}, Lee/b$a;->c(Lee/b$a;Lce/p;)V

    invoke-static {v8}, Lld/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object p2, v6, Lee/b;->c:Lsd/l;

    if-eqz p2, :cond_8

    invoke-virtual {v7}, Lce/p;->getContext()Ljd/g;

    move-result-object p3

    invoke-static {p2, v0, p3}, Lhe/d0;->a(Lsd/l;Ljava/lang/Object;Ljd/g;)Lsd/l;

    move-result-object v9

    :cond_8
    :goto_1
    invoke-virtual {v7, p1, v9}, Lce/p;->g(Ljava/lang/Object;Lsd/l;)V

    goto :goto_2

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "unexpected"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-virtual {p1}, Lhe/f;->b()V

    invoke-static {p0, v0}, Lee/b$a;->d(Lee/b$a;Ljava/lang/Object;)V

    invoke-static {p0, v9}, Lee/b$a;->c(Lee/b$a;Lce/p;)V

    invoke-static {v8}, Lld/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object p2, v6, Lee/b;->c:Lsd/l;

    if-eqz p2, :cond_8

    invoke-virtual {v7}, Lce/p;->getContext()Ljd/g;

    move-result-object p3

    invoke-static {p2, v0, p3}, Lhe/d0;->a(Lsd/l;Ljava/lang/Object;Ljd/g;)Lsd/l;

    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_2
    invoke-virtual {v7}, Lce/p;->y()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_b

    invoke-static {p5}, Lld/h;->c(Ljd/d;)V

    :cond_b
    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v7}, Lce/p;->J()V

    throw p1
.end method

.method public final f()Z
    .locals 1

    invoke-static {}, Lee/c;->z()Lhe/l0;

    move-result-object v0

    iput-object v0, p0, Lee/b$a;->h:Ljava/lang/Object;

    iget-object v0, p0, Lee/b$a;->j:Lee/b;

    invoke-virtual {v0}, Lee/b;->E()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {v0}, Lhe/k0;->j(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    throw v0
.end method

.method public final g()V
    .locals 3

    iget-object v0, p0, Lee/b$a;->i:Lce/p;

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lee/b$a;->i:Lce/p;

    invoke-static {}, Lee/c;->z()Lhe/l0;

    move-result-object v1

    iput-object v1, p0, Lee/b$a;->h:Ljava/lang/Object;

    iget-object v1, p0, Lee/b$a;->j:Lee/b;

    invoke-virtual {v1}, Lee/b;->E()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Lgd/k;->i:Lgd/k$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    invoke-static {v1}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljd/d;->resumeWith(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    invoke-static {}, Lce/t0;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    instance-of v2, v0, Lld/e;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v1, v0}, Lhe/k0;->a(Ljava/lang/Throwable;Lld/e;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_2
    :goto_1
    sget-object v2, Lgd/k;->i:Lgd/k$a;

    invoke-static {v1}, Lgd/l;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :goto_2
    return-void
.end method

.method public final h(Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    iget-object v0, p0, Lee/b$a;->i:Lce/p;

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lee/b$a;->i:Lce/p;

    iput-object p1, p0, Lee/b$a;->h:Ljava/lang/Object;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v3, p0, Lee/b$a;->j:Lee/b;

    iget-object v3, v3, Lee/b;->c:Lsd/l;

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lce/p;->getContext()Ljd/g;

    move-result-object v1

    invoke-static {v3, p1, v1}, Lhe/d0;->a(Lsd/l;Ljava/lang/Object;Ljd/g;)Lsd/l;

    move-result-object v1

    :cond_0
    invoke-static {v0, v2, v1}, Lee/c;->u(Lce/n;Ljava/lang/Object;Lsd/l;)Z

    move-result p1

    return p1
.end method

.method public final i()V
    .locals 3

    iget-object v0, p0, Lee/b$a;->i:Lce/p;

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lee/b$a;->i:Lce/p;

    invoke-static {}, Lee/c;->z()Lhe/l0;

    move-result-object v1

    iput-object v1, p0, Lee/b$a;->h:Ljava/lang/Object;

    iget-object v1, p0, Lee/b$a;->j:Lee/b;

    invoke-virtual {v1}, Lee/b;->E()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Lgd/k;->i:Lgd/k$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    invoke-static {v1}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljd/d;->resumeWith(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    invoke-static {}, Lce/t0;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    instance-of v2, v0, Lld/e;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v1, v0}, Lhe/k0;->a(Ljava/lang/Throwable;Lld/e;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_2
    :goto_1
    sget-object v2, Lgd/k;->i:Lgd/k$a;

    invoke-static {v1}, Lgd/l;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :goto_2
    return-void
.end method

.method public j(Lhe/i0;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhe/i0<",
            "*>;I)V"
        }
    .end annotation

    iget-object v0, p0, Lee/b$a;->i:Lce/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lce/p;->j(Lhe/i0;I)V

    :cond_0
    return-void
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    iget-object v0, p0, Lee/b$a;->h:Ljava/lang/Object;

    invoke-static {}, Lee/c;->m()Lhe/l0;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    invoke-static {}, Lee/c;->m()Lhe/l0;

    move-result-object v1

    iput-object v1, p0, Lee/b$a;->h:Ljava/lang/Object;

    invoke-static {}, Lee/c;->z()Lhe/l0;

    move-result-object v1

    if-eq v0, v1, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lee/b$a;->j:Lee/b;

    invoke-static {v0}, Lee/b;->g(Lee/b;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Lhe/k0;->j(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "`hasNext()` has not been invoked"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
