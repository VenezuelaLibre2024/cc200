.class public final Lt3/n1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt3/n1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ls3/u3$b;

.field public b:Li7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/u<",
            "Lu4/t$b;",
            ">;"
        }
    .end annotation
.end field

.field public c:Li7/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/v<",
            "Lu4/t$b;",
            "Ls3/u3;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lu4/t$b;

.field public e:Lu4/t$b;

.field public f:Lu4/t$b;


# direct methods
.method public constructor <init>(Ls3/u3$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/n1$a;->a:Ls3/u3$b;

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object p1

    iput-object p1, p0, Lt3/n1$a;->b:Li7/u;

    invoke-static {}, Li7/v;->j()Li7/v;

    move-result-object p1

    iput-object p1, p0, Lt3/n1$a;->c:Li7/v;

    return-void
.end method

.method public static synthetic a(Lt3/n1$a;)Li7/u;
    .locals 0

    iget-object p0, p0, Lt3/n1$a;->b:Li7/u;

    return-object p0
.end method

.method public static c(Ls3/b3;Li7/u;Lu4/t$b;Ls3/u3$b;)Lu4/t$b;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/b3;",
            "Li7/u<",
            "Lu4/t$b;",
            ">;",
            "Lu4/t$b;",
            "Ls3/u3$b;",
            ")",
            "Lu4/t$b;"
        }
    .end annotation

    invoke-interface {p0}, Ls3/b3;->F()Ls3/u3;

    move-result-object v0

    invoke-interface {p0}, Ls3/b3;->k()I

    move-result v1

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Ls3/u3;->q(I)Ljava/lang/Object;

    move-result-object v2

    :goto_0
    invoke-interface {p0}, Ls3/b3;->g()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1, p3}, Ls3/u3;->j(ILs3/u3$b;)Ls3/u3$b;

    move-result-object v0

    invoke-interface {p0}, Ls3/b3;->H()J

    move-result-wide v4

    invoke-static {v4, v5}, Lp5/n0;->B0(J)J

    move-result-wide v4

    invoke-virtual {p3}, Ls3/u3$b;->q()J

    move-result-wide v6

    sub-long/2addr v4, v6

    invoke-virtual {v0, v4, v5}, Ls3/u3$b;->g(J)I

    move-result p3

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p3, -0x1

    :goto_2
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu4/t$b;

    invoke-interface {p0}, Ls3/b3;->g()Z

    move-result v6

    invoke-interface {p0}, Ls3/b3;->z()I

    move-result v7

    invoke-interface {p0}, Ls3/b3;->p()I

    move-result v8

    move-object v4, v1

    move-object v5, v2

    move v9, p3

    invoke-static/range {v4 .. v9}, Lt3/n1$a;->i(Lu4/t$b;Ljava/lang/Object;ZIII)Z

    move-result v4

    if-eqz v4, :cond_3

    return-object v1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    if-eqz p2, :cond_5

    invoke-interface {p0}, Ls3/b3;->g()Z

    move-result v6

    invoke-interface {p0}, Ls3/b3;->z()I

    move-result v7

    invoke-interface {p0}, Ls3/b3;->p()I

    move-result v8

    move-object v4, p2

    move-object v5, v2

    move v9, p3

    invoke-static/range {v4 .. v9}, Lt3/n1$a;->i(Lu4/t$b;Ljava/lang/Object;ZIII)Z

    move-result p0

    if-eqz p0, :cond_5

    return-object p2

    :cond_5
    return-object v3
.end method

.method public static i(Lu4/t$b;Ljava/lang/Object;ZIII)Z
    .locals 1

    iget-object v0, p0, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-eqz p2, :cond_1

    iget p1, p0, Lu4/s;->b:I

    if-ne p1, p3, :cond_1

    iget p1, p0, Lu4/s;->c:I

    if-eq p1, p4, :cond_2

    :cond_1
    if-nez p2, :cond_3

    iget p1, p0, Lu4/s;->b:I

    const/4 p2, -0x1

    if-ne p1, p2, :cond_3

    iget p0, p0, Lu4/s;->e:I

    if-ne p0, p5, :cond_3

    :cond_2
    const/4 v0, 0x1

    :cond_3
    return v0
.end method


# virtual methods
.method public final b(Li7/v$a;Lu4/t$b;Ls3/u3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li7/v$a<",
            "Lu4/t$b;",
            "Ls3/u3;",
            ">;",
            "Lu4/t$b;",
            "Ls3/u3;",
            ")V"
        }
    .end annotation

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p2, Lu4/s;->a:Ljava/lang/Object;

    invoke-virtual {p3, v0}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    :goto_0
    invoke-virtual {p1, p2, p3}, Li7/v$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Li7/v$a;

    goto :goto_1

    :cond_1
    iget-object p3, p0, Lt3/n1$a;->c:Li7/v;

    invoke-virtual {p3, p2}, Li7/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ls3/u3;

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public d()Lu4/t$b;
    .locals 1

    iget-object v0, p0, Lt3/n1$a;->d:Lu4/t$b;

    return-object v0
.end method

.method public e()Lu4/t$b;
    .locals 1

    iget-object v0, p0, Lt3/n1$a;->b:Li7/u;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt3/n1$a;->b:Li7/u;

    invoke-static {v0}, Li7/b0;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/t$b;

    :goto_0
    return-object v0
.end method

.method public f(Lu4/t$b;)Ls3/u3;
    .locals 1

    iget-object v0, p0, Lt3/n1$a;->c:Li7/v;

    invoke-virtual {v0, p1}, Li7/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls3/u3;

    return-object p1
.end method

.method public g()Lu4/t$b;
    .locals 1

    iget-object v0, p0, Lt3/n1$a;->e:Lu4/t$b;

    return-object v0
.end method

.method public h()Lu4/t$b;
    .locals 1

    iget-object v0, p0, Lt3/n1$a;->f:Lu4/t$b;

    return-object v0
.end method

.method public j(Ls3/b3;)V
    .locals 3

    iget-object v0, p0, Lt3/n1$a;->b:Li7/u;

    iget-object v1, p0, Lt3/n1$a;->e:Lu4/t$b;

    iget-object v2, p0, Lt3/n1$a;->a:Ls3/u3$b;

    invoke-static {p1, v0, v1, v2}, Lt3/n1$a;->c(Ls3/b3;Li7/u;Lu4/t$b;Ls3/u3$b;)Lu4/t$b;

    move-result-object p1

    iput-object p1, p0, Lt3/n1$a;->d:Lu4/t$b;

    return-void
.end method

.method public k(Ljava/util/List;Lu4/t$b;Ls3/b3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lu4/t$b;",
            ">;",
            "Lu4/t$b;",
            "Ls3/b3;",
            ")V"
        }
    .end annotation

    invoke-static {p1}, Li7/u;->p(Ljava/util/Collection;)Li7/u;

    move-result-object v0

    iput-object v0, p0, Lt3/n1$a;->b:Li7/u;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu4/t$b;

    iput-object p1, p0, Lt3/n1$a;->e:Lu4/t$b;

    invoke-static {p2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu4/t$b;

    iput-object p1, p0, Lt3/n1$a;->f:Lu4/t$b;

    :cond_0
    iget-object p1, p0, Lt3/n1$a;->d:Lu4/t$b;

    if-nez p1, :cond_1

    iget-object p1, p0, Lt3/n1$a;->b:Li7/u;

    iget-object p2, p0, Lt3/n1$a;->e:Lu4/t$b;

    iget-object v0, p0, Lt3/n1$a;->a:Ls3/u3$b;

    invoke-static {p3, p1, p2, v0}, Lt3/n1$a;->c(Ls3/b3;Li7/u;Lu4/t$b;Ls3/u3$b;)Lu4/t$b;

    move-result-object p1

    iput-object p1, p0, Lt3/n1$a;->d:Lu4/t$b;

    :cond_1
    invoke-interface {p3}, Ls3/b3;->F()Ls3/u3;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt3/n1$a;->m(Ls3/u3;)V

    return-void
.end method

.method public l(Ls3/b3;)V
    .locals 3

    iget-object v0, p0, Lt3/n1$a;->b:Li7/u;

    iget-object v1, p0, Lt3/n1$a;->e:Lu4/t$b;

    iget-object v2, p0, Lt3/n1$a;->a:Ls3/u3$b;

    invoke-static {p1, v0, v1, v2}, Lt3/n1$a;->c(Ls3/b3;Li7/u;Lu4/t$b;Ls3/u3$b;)Lu4/t$b;

    move-result-object v0

    iput-object v0, p0, Lt3/n1$a;->d:Lu4/t$b;

    invoke-interface {p1}, Ls3/b3;->F()Ls3/u3;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt3/n1$a;->m(Ls3/u3;)V

    return-void
.end method

.method public final m(Ls3/u3;)V
    .locals 3

    invoke-static {}, Li7/v;->a()Li7/v$a;

    move-result-object v0

    iget-object v1, p0, Lt3/n1$a;->b:Li7/u;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lt3/n1$a;->e:Lu4/t$b;

    invoke-virtual {p0, v0, v1, p1}, Lt3/n1$a;->b(Li7/v$a;Lu4/t$b;Ls3/u3;)V

    iget-object v1, p0, Lt3/n1$a;->f:Lu4/t$b;

    iget-object v2, p0, Lt3/n1$a;->e:Lu4/t$b;

    invoke-static {v1, v2}, Lh7/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lt3/n1$a;->f:Lu4/t$b;

    invoke-virtual {p0, v0, v1, p1}, Lt3/n1$a;->b(Li7/v$a;Lu4/t$b;Ls3/u3;)V

    :cond_0
    iget-object v1, p0, Lt3/n1$a;->d:Lu4/t$b;

    iget-object v2, p0, Lt3/n1$a;->e:Lu4/t$b;

    invoke-static {v1, v2}, Lh7/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lt3/n1$a;->d:Lu4/t$b;

    iget-object v2, p0, Lt3/n1$a;->f:Lu4/t$b;

    invoke-static {v1, v2}, Lh7/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lt3/n1$a;->b:Li7/u;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lt3/n1$a;->b:Li7/u;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu4/t$b;

    invoke-virtual {p0, v0, v2, p1}, Lt3/n1$a;->b(Li7/v$a;Lu4/t$b;Ls3/u3;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lt3/n1$a;->b:Li7/u;

    iget-object v2, p0, Lt3/n1$a;->d:Lu4/t$b;

    invoke-virtual {v1, v2}, Li7/u;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    iget-object v1, p0, Lt3/n1$a;->d:Lu4/t$b;

    invoke-virtual {p0, v0, v1, p1}, Lt3/n1$a;->b(Li7/v$a;Lu4/t$b;Ls3/u3;)V

    :cond_3
    invoke-virtual {v0}, Li7/v$a;->c()Li7/v;

    move-result-object p1

    iput-object p1, p0, Lt3/n1$a;->c:Li7/v;

    return-void
.end method
