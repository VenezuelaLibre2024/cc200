.class public final Lce/h3;
.super Lhe/h0;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lhe/h0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final l:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lgd/j<",
            "Ljd/g;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private volatile threadLocalIsSet:Z


# direct methods
.method public constructor <init>(Ljd/g;Ljd/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/g;",
            "Ljd/d<",
            "-TT;>;)V"
        }
    .end annotation

    sget-object v0, Lce/i3;->h:Lce/i3;

    invoke-interface {p1, v0}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-interface {p1, v0}, Ljd/g;->e0(Ljd/g;)Ljd/g;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {p0, v0, p2}, Lhe/h0;-><init>(Ljd/g;Ljd/d;)V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lce/h3;->l:Ljava/lang/ThreadLocal;

    invoke-interface {p2}, Ljd/d;->getContext()Ljd/g;

    move-result-object p2

    sget-object v0, Ljd/e;->e:Ljd/e$b;

    invoke-interface {p2, v0}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object p2

    instance-of p2, p2, Lce/k0;

    if-nez p2, :cond_1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lhe/p0;->c(Ljd/g;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lhe/p0;->a(Ljd/g;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lce/h3;->T0(Ljd/g;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public O0(Ljava/lang/Object;)V
    .locals 5

    iget-boolean v0, p0, Lce/h3;->threadLocalIsSet:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lce/h3;->l:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgd/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lgd/j;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljd/g;

    invoke-virtual {v0}, Lgd/j;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Lhe/p0;->a(Ljd/g;Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lce/h3;->l:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    :cond_1
    iget-object v0, p0, Lhe/h0;->k:Ljd/d;

    invoke-static {p1, v0}, Lce/g0;->a(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lhe/h0;->k:Ljd/d;

    invoke-interface {v0}, Ljd/d;->getContext()Ljd/g;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lhe/p0;->c(Ljd/g;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lhe/p0;->a:Lhe/l0;

    if-eq v3, v4, :cond_2

    invoke-static {v0, v1, v3}, Lce/j0;->g(Ljd/d;Ljd/g;Ljava/lang/Object;)Lce/h3;

    move-result-object v2

    :cond_2
    :try_start_0
    iget-object v0, p0, Lhe/h0;->k:Ljd/d;

    invoke-interface {v0, p1}, Ljd/d;->resumeWith(Ljava/lang/Object;)V

    sget-object p1, Lgd/s;->a:Lgd/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lce/h3;->S0()Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    invoke-static {v1, v3}, Lhe/p0;->a(Ljd/g;Ljava/lang/Object;)V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lce/h3;->S0()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    invoke-static {v1, v3}, Lhe/p0;->a(Ljd/g;Ljava/lang/Object;)V

    :cond_6
    throw p1
.end method

.method public final S0()Z
    .locals 3

    iget-boolean v0, p0, Lce/h3;->threadLocalIsSet:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lce/h3;->l:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lce/h3;->l:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    xor-int/2addr v0, v1

    return v0
.end method

.method public final T0(Ljd/g;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lce/h3;->threadLocalIsSet:Z

    iget-object v0, p0, Lce/h3;->l:Ljava/lang/ThreadLocal;

    invoke-static {p1, p2}, Lgd/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lgd/j;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
