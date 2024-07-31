.class public abstract Lu4/f;
.super Lu4/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu4/f$a;,
        Lu4/f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lu4/a;"
    }
.end annotation


# instance fields
.field public final o:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "TT;",
            "Lu4/f$b<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public p:Landroid/os/Handler;

.field public q:Lo5/m0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lu4/a;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lu4/f;->o:Ljava/util/HashMap;

    return-void
.end method

.method public static synthetic F(Lu4/f;Ljava/lang/Object;Lu4/t;Ls3/u3;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu4/f;->J(Ljava/lang/Object;Lu4/t;Ls3/u3;)V

    return-void
.end method

.method private synthetic J(Ljava/lang/Object;Lu4/t;Ls3/u3;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lu4/f;->K(Ljava/lang/Object;Lu4/t;Ls3/u3;)V

    return-void
.end method


# virtual methods
.method public C(Lo5/m0;)V
    .locals 0

    iput-object p1, p0, Lu4/f;->q:Lo5/m0;

    invoke-static {}, Lp5/n0;->w()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lu4/f;->p:Landroid/os/Handler;

    return-void
.end method

.method public E()V
    .locals 4

    iget-object v0, p0, Lu4/f;->o:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu4/f$b;

    iget-object v2, v1, Lu4/f$b;->a:Lu4/t;

    iget-object v3, v1, Lu4/f$b;->b:Lu4/t$c;

    invoke-interface {v2, v3}, Lu4/t;->q(Lu4/t$c;)V

    iget-object v2, v1, Lu4/f$b;->a:Lu4/t;

    iget-object v3, v1, Lu4/f$b;->c:Lu4/f$a;

    invoke-interface {v2, v3}, Lu4/t;->m(Lu4/a0;)V

    iget-object v2, v1, Lu4/f$b;->a:Lu4/t;

    iget-object v1, v1, Lu4/f$b;->c:Lu4/f$a;

    invoke-interface {v2, v1}, Lu4/t;->n(Lw3/u;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu4/f;->o:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public abstract G(Ljava/lang/Object;Lu4/t$b;)Lu4/t$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lu4/t$b;",
            ")",
            "Lu4/t$b;"
        }
    .end annotation
.end method

.method public abstract H(Ljava/lang/Object;J)J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;J)J"
        }
    .end annotation
.end method

.method public abstract I(Ljava/lang/Object;I)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)I"
        }
    .end annotation
.end method

.method public abstract K(Ljava/lang/Object;Lu4/t;Ls3/u3;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lu4/t;",
            "Ls3/u3;",
            ")V"
        }
    .end annotation
.end method

.method public final L(Ljava/lang/Object;Lu4/t;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lu4/t;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lu4/f;->o:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lp5/a;->a(Z)V

    new-instance v0, Lu4/e;

    invoke-direct {v0, p0, p1}, Lu4/e;-><init>(Lu4/f;Ljava/lang/Object;)V

    new-instance v1, Lu4/f$a;

    invoke-direct {v1, p0, p1}, Lu4/f$a;-><init>(Lu4/f;Ljava/lang/Object;)V

    iget-object v2, p0, Lu4/f;->o:Ljava/util/HashMap;

    new-instance v3, Lu4/f$b;

    invoke-direct {v3, p2, v0, v1}, Lu4/f$b;-><init>(Lu4/t;Lu4/t$c;Lu4/f$a;)V

    invoke-virtual {v2, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lu4/f;->p:Landroid/os/Handler;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    invoke-interface {p2, p1, v1}, Lu4/t;->i(Landroid/os/Handler;Lu4/a0;)V

    iget-object p1, p0, Lu4/f;->p:Landroid/os/Handler;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    invoke-interface {p2, p1, v1}, Lu4/t;->c(Landroid/os/Handler;Lw3/u;)V

    iget-object p1, p0, Lu4/f;->q:Lo5/m0;

    invoke-virtual {p0}, Lu4/a;->A()Lt3/s1;

    move-result-object v1

    invoke-interface {p2, v0, p1, v1}, Lu4/t;->d(Lu4/t$c;Lo5/m0;Lt3/s1;)V

    invoke-virtual {p0}, Lu4/a;->B()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {p2, v0}, Lu4/t;->s(Lu4/t$c;)V

    :cond_0
    return-void
.end method

.method public y()V
    .locals 3

    iget-object v0, p0, Lu4/f;->o:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu4/f$b;

    iget-object v2, v1, Lu4/f$b;->a:Lu4/t;

    iget-object v1, v1, Lu4/f$b;->b:Lu4/t$c;

    invoke-interface {v2, v1}, Lu4/t;->s(Lu4/t$c;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public z()V
    .locals 3

    iget-object v0, p0, Lu4/f;->o:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu4/f$b;

    iget-object v2, v1, Lu4/f$b;->a:Lu4/t;

    iget-object v1, v1, Lu4/f$b;->b:Lu4/t$c;

    invoke-interface {v2, v1}, Lu4/t;->e(Lu4/t$c;)V

    goto :goto_0

    :cond_0
    return-void
.end method
