.class public abstract Lu4/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu4/t;


# instance fields
.field public final h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lu4/t$c;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lu4/t$c;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Lu4/a0$a;

.field public final k:Lw3/u$a;

.field public l:Landroid/os/Looper;

.field public m:Ls3/u3;

.field public n:Lt3/s1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lu4/a;->h:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Lu4/a;->i:Ljava/util/HashSet;

    new-instance v0, Lu4/a0$a;

    invoke-direct {v0}, Lu4/a0$a;-><init>()V

    iput-object v0, p0, Lu4/a;->j:Lu4/a0$a;

    new-instance v0, Lw3/u$a;

    invoke-direct {v0}, Lw3/u$a;-><init>()V

    iput-object v0, p0, Lu4/a;->k:Lw3/u$a;

    return-void
.end method


# virtual methods
.method public final A()Lt3/s1;
    .locals 1

    iget-object v0, p0, Lu4/a;->n:Lt3/s1;

    invoke-static {v0}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt3/s1;

    return-object v0
.end method

.method public final B()Z
    .locals 1

    iget-object v0, p0, Lu4/a;->i:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public abstract C(Lo5/m0;)V
.end method

.method public final D(Ls3/u3;)V
    .locals 2

    iput-object p1, p0, Lu4/a;->m:Ls3/u3;

    iget-object v0, p0, Lu4/a;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu4/t$c;

    invoke-interface {v1, p0, p1}, Lu4/t$c;->a(Lu4/t;Ls3/u3;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abstract E()V
.end method

.method public final c(Landroid/os/Handler;Lw3/u;)V
    .locals 1

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lu4/a;->k:Lw3/u$a;

    invoke-virtual {v0, p1, p2}, Lw3/u$a;->g(Landroid/os/Handler;Lw3/u;)V

    return-void
.end method

.method public final d(Lu4/t$c;Lo5/m0;Lt3/s1;)V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lu4/a;->l:Landroid/os/Looper;

    if-eqz v1, :cond_1

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Lp5/a;->a(Z)V

    iput-object p3, p0, Lu4/a;->n:Lt3/s1;

    iget-object p3, p0, Lu4/a;->m:Ls3/u3;

    iget-object v1, p0, Lu4/a;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lu4/a;->l:Landroid/os/Looper;

    if-nez v1, :cond_2

    iput-object v0, p0, Lu4/a;->l:Landroid/os/Looper;

    iget-object p3, p0, Lu4/a;->i:Ljava/util/HashSet;

    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p2}, Lu4/a;->C(Lo5/m0;)V

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p0, p1}, Lu4/a;->e(Lu4/t$c;)V

    invoke-interface {p1, p0, p3}, Lu4/t$c;->a(Lu4/t;Ls3/u3;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public final e(Lu4/t$c;)V
    .locals 2

    iget-object v0, p0, Lu4/a;->l:Landroid/os/Looper;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lu4/a;->i:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    iget-object v1, p0, Lu4/a;->i:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lu4/a;->z()V

    :cond_0
    return-void
.end method

.method public final i(Landroid/os/Handler;Lu4/a0;)V
    .locals 1

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lu4/a;->j:Lu4/a0$a;

    invoke-virtual {v0, p1, p2}, Lu4/a0$a;->g(Landroid/os/Handler;Lu4/a0;)V

    return-void
.end method

.method public final m(Lu4/a0;)V
    .locals 1

    iget-object v0, p0, Lu4/a;->j:Lu4/a0$a;

    invoke-virtual {v0, p1}, Lu4/a0$a;->C(Lu4/a0;)V

    return-void
.end method

.method public final n(Lw3/u;)V
    .locals 1

    iget-object v0, p0, Lu4/a;->k:Lw3/u$a;

    invoke-virtual {v0, p1}, Lw3/u$a;->t(Lw3/u;)V

    return-void
.end method

.method public final q(Lu4/t$c;)V
    .locals 1

    iget-object v0, p0, Lu4/a;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lu4/a;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lu4/a;->l:Landroid/os/Looper;

    iput-object p1, p0, Lu4/a;->m:Ls3/u3;

    iput-object p1, p0, Lu4/a;->n:Lt3/s1;

    iget-object p1, p0, Lu4/a;->i:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    invoke-virtual {p0}, Lu4/a;->E()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lu4/a;->s(Lu4/t$c;)V

    :goto_0
    return-void
.end method

.method public final s(Lu4/t$c;)V
    .locals 2

    iget-object v0, p0, Lu4/a;->i:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lu4/a;->i:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Lu4/a;->i:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lu4/a;->y()V

    :cond_0
    return-void
.end method

.method public final t(ILu4/t$b;)Lw3/u$a;
    .locals 1

    iget-object v0, p0, Lu4/a;->k:Lw3/u$a;

    invoke-virtual {v0, p1, p2}, Lw3/u$a;->u(ILu4/t$b;)Lw3/u$a;

    move-result-object p1

    return-object p1
.end method

.method public final u(Lu4/t$b;)Lw3/u$a;
    .locals 2

    iget-object v0, p0, Lu4/a;->k:Lw3/u$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lw3/u$a;->u(ILu4/t$b;)Lw3/u$a;

    move-result-object p1

    return-object p1
.end method

.method public final v(ILu4/t$b;J)Lu4/a0$a;
    .locals 1

    iget-object v0, p0, Lu4/a;->j:Lu4/a0$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lu4/a0$a;->F(ILu4/t$b;J)Lu4/a0$a;

    move-result-object p1

    return-object p1
.end method

.method public final w(Lu4/t$b;)Lu4/a0$a;
    .locals 4

    iget-object v0, p0, Lu4/a;->j:Lu4/a0$a;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, p1, v2, v3}, Lu4/a0$a;->F(ILu4/t$b;J)Lu4/a0$a;

    move-result-object p1

    return-object p1
.end method

.method public final x(Lu4/t$b;J)Lu4/a0$a;
    .locals 2

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lu4/a;->j:Lu4/a0$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2, p3}, Lu4/a0$a;->F(ILu4/t$b;J)Lu4/a0$a;

    move-result-object p1

    return-object p1
.end method

.method public y()V
    .locals 0

    return-void
.end method

.method public z()V
    .locals 0

    return-void
.end method
