.class public final Lle/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lce/n;
.implements Lce/j3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lle/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lce/n<",
        "Lgd/s;",
        ">;",
        "Lce/j3;"
    }
.end annotation


# instance fields
.field public final h:Lce/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lce/p<",
            "Lgd/s;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/lang/Object;

.field public final synthetic j:Lle/b;


# direct methods
.method public constructor <init>(Lle/b;Lce/p;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/p<",
            "-",
            "Lgd/s;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lle/b$a;->j:Lle/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lle/b$a;->h:Lce/p;

    iput-object p3, p0, Lle/b$a;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lgd/s;Lsd/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgd/s;",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)V"
        }
    .end annotation

    iget-object p2, p0, Lle/b$a;->j:Lle/b;

    invoke-static {}, Lce/t0;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lle/b;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {}, Lle/c;->c()Lhe/l0;

    move-result-object v0

    if-ne p2, v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    :goto_1
    invoke-static {}, Lle/b;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    iget-object v0, p0, Lle/b$a;->j:Lle/b;

    iget-object v1, p0, Lle/b$a;->i:Ljava/lang/Object;

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, p0, Lle/b$a;->h:Lce/p;

    new-instance v0, Lle/b$a$a;

    iget-object v1, p0, Lle/b$a;->j:Lle/b;

    invoke-direct {v0, v1, p0}, Lle/b$a$a;-><init>(Lle/b;Lle/b$a;)V

    invoke-virtual {p2, p1, v0}, Lce/p;->g(Ljava/lang/Object;Lsd/l;)V

    return-void
.end method

.method public b(Lgd/s;Ljava/lang/Object;Lsd/l;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgd/s;",
            "Ljava/lang/Object;",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p3, p0, Lle/b$a;->j:Lle/b;

    invoke-static {}, Lce/t0;->a()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-static {}, Lle/b;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {}, Lle/c;->c()Lhe/l0;

    move-result-object v0

    if-ne p3, v0, :cond_0

    move p3, v1

    goto :goto_0

    :cond_0
    move p3, v2

    :goto_0
    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    :goto_1
    iget-object p3, p0, Lle/b$a;->h:Lce/p;

    new-instance v0, Lle/b$a$b;

    iget-object v3, p0, Lle/b$a;->j:Lle/b;

    invoke-direct {v0, v3, p0}, Lle/b$a$b;-><init>(Lle/b;Lle/b$a;)V

    invoke-virtual {p3, p1, p2, v0}, Lce/p;->e(Ljava/lang/Object;Ljava/lang/Object;Lsd/l;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object p2, p0, Lle/b$a;->j:Lle/b;

    invoke-static {}, Lce/t0;->a()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-static {}, Lle/b;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p3

    invoke-virtual {p3, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {}, Lle/c;->c()Lhe/l0;

    move-result-object p3

    if-ne p2, p3, :cond_3

    goto :goto_2

    :cond_3
    move v1, v2

    :goto_2
    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_5
    :goto_3
    invoke-static {}, Lle/b;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p2

    iget-object p3, p0, Lle/b$a;->j:Lle/b;

    iget-object v0, p0, Lle/b$a;->i:Ljava/lang/Object;

    invoke-virtual {p2, p3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_6
    return-object p1
.end method

.method public c(Lsd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lle/b$a;->h:Lce/p;

    invoke-virtual {v0, p1}, Lce/p;->c(Lsd/l;)V

    return-void
.end method

.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Lsd/l;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgd/s;

    invoke-virtual {p0, p1, p2, p3}, Lle/b$a;->b(Lgd/s;Ljava/lang/Object;Lsd/l;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lle/b$a;->h:Lce/p;

    invoke-virtual {v0, p1}, Lce/p;->f(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(Ljava/lang/Object;Lsd/l;)V
    .locals 0

    check-cast p1, Lgd/s;

    invoke-virtual {p0, p1, p2}, Lle/b$a;->a(Lgd/s;Lsd/l;)V

    return-void
.end method

.method public getContext()Ljd/g;
    .locals 1

    iget-object v0, p0, Lle/b$a;->h:Lce/p;

    invoke-virtual {v0}, Lce/p;->getContext()Ljd/g;

    move-result-object v0

    return-object v0
.end method

.method public h(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lle/b$a;->h:Lce/p;

    invoke-virtual {v0, p1}, Lce/p;->h(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
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

    iget-object v0, p0, Lle/b$a;->h:Lce/p;

    invoke-virtual {v0, p1, p2}, Lce/p;->j(Lhe/i0;I)V

    return-void
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, Lle/b$a;->h:Lce/p;

    invoke-virtual {v0}, Lce/p;->k()Z

    move-result v0

    return v0
.end method

.method public m(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lle/b$a;->h:Lce/p;

    invoke-virtual {v0, p1}, Lce/p;->m(Ljava/lang/Object;)V

    return-void
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lle/b$a;->h:Lce/p;

    invoke-virtual {v0, p1}, Lce/p;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
