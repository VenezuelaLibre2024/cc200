.class public final Ln5/m$g;
.super Ln5/m$h;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln5/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln5/m$h<",
        "Ln5/m$g;",
        ">;",
        "Ljava/lang/Comparable<",
        "Ln5/m$g;",
        ">;"
    }
.end annotation


# instance fields
.field public final l:I

.field public final m:Z

.field public final n:Z

.field public final o:Z

.field public final p:I

.field public final q:I

.field public final r:I

.field public final s:I

.field public final t:Z


# direct methods
.method public constructor <init>(ILu4/s0;ILn5/m$d;ILjava/lang/String;)V
    .locals 5

    invoke-direct {p0, p1, p2, p3}, Ln5/m$h;-><init>(ILu4/s0;I)V

    const/4 p1, 0x0

    invoke-static {p5, p1}, Ln5/m;->I(IZ)Z

    move-result p2

    iput-boolean p2, p0, Ln5/m$g;->m:Z

    iget-object p2, p0, Ln5/m$h;->k:Ls3/m1;

    iget p2, p2, Ls3/m1;->k:I

    iget p3, p4, Ln5/z;->B:I

    not-int p3, p3

    and-int/2addr p2, p3

    and-int/lit8 p3, p2, 0x1

    const/4 v0, 0x1

    if-eqz p3, :cond_0

    move p3, v0

    goto :goto_0

    :cond_0
    move p3, p1

    :goto_0
    iput-boolean p3, p0, Ln5/m$g;->n:Z

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    move p2, v0

    goto :goto_1

    :cond_1
    move p2, p1

    :goto_1
    iput-boolean p2, p0, Ln5/m$g;->o:Z

    const p2, 0x7fffffff

    iget-object p3, p4, Ln5/z;->z:Li7/u;

    invoke-virtual {p3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_2

    const-string p3, ""

    invoke-static {p3}, Li7/u;->v(Ljava/lang/Object;)Li7/u;

    move-result-object p3

    goto :goto_2

    :cond_2
    iget-object p3, p4, Ln5/z;->z:Li7/u;

    :goto_2
    move v1, p1

    :goto_3
    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    iget-object v2, p0, Ln5/m$h;->k:Ls3/m1;

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-boolean v4, p4, Ln5/z;->C:Z

    invoke-static {v2, v3, v4}, Ln5/m;->B(Ls3/m1;Ljava/lang/String;Z)I

    move-result v2

    if-lez v2, :cond_3

    move p2, v1

    goto :goto_4

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_4
    move v2, p1

    :goto_4
    iput p2, p0, Ln5/m$g;->p:I

    iput v2, p0, Ln5/m$g;->q:I

    iget-object p2, p0, Ln5/m$h;->k:Ls3/m1;

    iget p2, p2, Ls3/m1;->l:I

    iget p3, p4, Ln5/z;->A:I

    invoke-static {p2, p3}, Ln5/m;->t(II)I

    move-result p2

    iput p2, p0, Ln5/m$g;->r:I

    iget-object p3, p0, Ln5/m$h;->k:Ls3/m1;

    iget p3, p3, Ls3/m1;->l:I

    and-int/lit16 p3, p3, 0x440

    if-eqz p3, :cond_5

    move p3, v0

    goto :goto_5

    :cond_5
    move p3, p1

    :goto_5
    iput-boolean p3, p0, Ln5/m$g;->t:Z

    invoke-static {p6}, Ln5/m;->Q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_6

    move p3, v0

    goto :goto_6

    :cond_6
    move p3, p1

    :goto_6
    iget-object v1, p0, Ln5/m$h;->k:Ls3/m1;

    invoke-static {v1, p6, p3}, Ln5/m;->B(Ls3/m1;Ljava/lang/String;Z)I

    move-result p3

    iput p3, p0, Ln5/m$g;->s:I

    if-gtz v2, :cond_9

    iget-object p6, p4, Ln5/z;->z:Li7/u;

    invoke-virtual {p6}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p6

    if-eqz p6, :cond_7

    if-gtz p2, :cond_9

    :cond_7
    iget-boolean p2, p0, Ln5/m$g;->n:Z

    if-nez p2, :cond_9

    iget-boolean p2, p0, Ln5/m$g;->o:Z

    if-eqz p2, :cond_8

    if-lez p3, :cond_8

    goto :goto_7

    :cond_8
    move p2, p1

    goto :goto_8

    :cond_9
    :goto_7
    move p2, v0

    :goto_8
    iget-boolean p3, p4, Ln5/m$d;->u0:Z

    invoke-static {p5, p3}, Ln5/m;->I(IZ)Z

    move-result p3

    if-eqz p3, :cond_a

    if-eqz p2, :cond_a

    move p1, v0

    :cond_a
    iput p1, p0, Ln5/m$g;->l:I

    return-void
.end method

.method public static f(Ljava/util/List;Ljava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln5/m$g;",
            ">;",
            "Ljava/util/List<",
            "Ln5/m$g;",
            ">;)I"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln5/m$g;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln5/m$g;

    invoke-virtual {p0, p1}, Ln5/m$g;->h(Ln5/m$g;)I

    move-result p0

    return p0
.end method

.method public static i(ILu4/s0;Ln5/m$d;[ILjava/lang/String;)Li7/u;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lu4/s0;",
            "Ln5/m$d;",
            "[I",
            "Ljava/lang/String;",
            ")",
            "Li7/u<",
            "Ln5/m$g;",
            ">;"
        }
    .end annotation

    invoke-static {}, Li7/u;->n()Li7/u$a;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget v2, p1, Lu4/s0;->h:I

    if-ge v1, v2, :cond_0

    new-instance v9, Ln5/m$g;

    aget v7, p3, v1

    move-object v2, v9

    move v3, p0

    move-object v4, p1

    move v5, v1

    move-object v6, p2

    move-object v8, p4

    invoke-direct/range {v2 .. v8}, Ln5/m$g;-><init>(ILu4/s0;ILn5/m$d;ILjava/lang/String;)V

    invoke-virtual {v0, v9}, Li7/u$a;->h(Ljava/lang/Object;)Li7/u$a;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Li7/u$a;->k()Li7/u;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Ln5/m$g;->l:I

    return v0
.end method

.method public bridge synthetic c(Ln5/m$h;)Z
    .locals 0

    check-cast p1, Ln5/m$g;

    invoke-virtual {p0, p1}, Ln5/m$g;->l(Ln5/m$g;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ln5/m$g;

    invoke-virtual {p0, p1}, Ln5/m$g;->h(Ln5/m$g;)I

    move-result p1

    return p1
.end method

.method public h(Ln5/m$g;)I
    .locals 4

    invoke-static {}, Li7/n;->j()Li7/n;

    move-result-object v0

    iget-boolean v1, p0, Ln5/m$g;->m:Z

    iget-boolean v2, p1, Ln5/m$g;->m:Z

    invoke-virtual {v0, v1, v2}, Li7/n;->g(ZZ)Li7/n;

    move-result-object v0

    iget v1, p0, Ln5/m$g;->p:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p1, Ln5/m$g;->p:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {}, Li7/p0;->c()Li7/p0;

    move-result-object v3

    invoke-virtual {v3}, Li7/p0;->f()Li7/p0;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Li7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Li7/n;

    move-result-object v0

    iget v1, p0, Ln5/m$g;->q:I

    iget v2, p1, Ln5/m$g;->q:I

    invoke-virtual {v0, v1, v2}, Li7/n;->d(II)Li7/n;

    move-result-object v0

    iget v1, p0, Ln5/m$g;->r:I

    iget v2, p1, Ln5/m$g;->r:I

    invoke-virtual {v0, v1, v2}, Li7/n;->d(II)Li7/n;

    move-result-object v0

    iget-boolean v1, p0, Ln5/m$g;->n:Z

    iget-boolean v2, p1, Ln5/m$g;->n:Z

    invoke-virtual {v0, v1, v2}, Li7/n;->g(ZZ)Li7/n;

    move-result-object v0

    iget-boolean v1, p0, Ln5/m$g;->o:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v2, p1, Ln5/m$g;->o:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget v3, p0, Ln5/m$g;->q:I

    if-nez v3, :cond_0

    invoke-static {}, Li7/p0;->c()Li7/p0;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-static {}, Li7/p0;->c()Li7/p0;

    move-result-object v3

    invoke-virtual {v3}, Li7/p0;->f()Li7/p0;

    move-result-object v3

    :goto_0
    invoke-virtual {v0, v1, v2, v3}, Li7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Li7/n;

    move-result-object v0

    iget v1, p0, Ln5/m$g;->s:I

    iget v2, p1, Ln5/m$g;->s:I

    invoke-virtual {v0, v1, v2}, Li7/n;->d(II)Li7/n;

    move-result-object v0

    iget v1, p0, Ln5/m$g;->r:I

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ln5/m$g;->t:Z

    iget-boolean p1, p1, Ln5/m$g;->t:Z

    invoke-virtual {v0, v1, p1}, Li7/n;->h(ZZ)Li7/n;

    move-result-object v0

    :cond_1
    invoke-virtual {v0}, Li7/n;->i()I

    move-result p1

    return p1
.end method

.method public l(Ln5/m$g;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
