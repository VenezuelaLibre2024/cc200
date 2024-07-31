.class public final Ln5/m$i;
.super Ln5/m$h;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln5/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln5/m$h<",
        "Ln5/m$i;",
        ">;"
    }
.end annotation


# instance fields
.field public final l:Z

.field public final m:Ln5/m$d;

.field public final n:Z

.field public final o:Z

.field public final p:I

.field public final q:I

.field public final r:I

.field public final s:I

.field public final t:Z

.field public final u:Z

.field public final v:I

.field public final w:Z

.field public final x:Z

.field public final y:I


# direct methods
.method public constructor <init>(ILu4/s0;ILn5/m$d;IIZ)V
    .locals 4

    invoke-direct {p0, p1, p2, p3}, Ln5/m$h;-><init>(ILu4/s0;I)V

    iput-object p4, p0, Ln5/m$i;->m:Ln5/m$d;

    iget-boolean p1, p4, Ln5/m$d;->m0:Z

    if-eqz p1, :cond_0

    const/16 p1, 0x18

    goto :goto_0

    :cond_0
    const/16 p1, 0x10

    :goto_0
    iget-boolean p2, p4, Ln5/m$d;->l0:Z

    const/4 p3, 0x1

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    and-int p2, p6, p1

    if-eqz p2, :cond_1

    move p2, p3

    goto :goto_1

    :cond_1
    move p2, v0

    :goto_1
    iput-boolean p2, p0, Ln5/m$i;->u:Z

    const/high16 p2, -0x40800000    # -1.0f

    const/4 p6, -0x1

    if-eqz p7, :cond_6

    iget-object v1, p0, Ln5/m$h;->k:Ls3/m1;

    iget v2, v1, Ls3/m1;->x:I

    if-eq v2, p6, :cond_2

    iget v3, p4, Ln5/z;->h:I

    if-gt v2, v3, :cond_6

    :cond_2
    iget v2, v1, Ls3/m1;->y:I

    if-eq v2, p6, :cond_3

    iget v3, p4, Ln5/z;->i:I

    if-gt v2, v3, :cond_6

    :cond_3
    iget v2, v1, Ls3/m1;->z:F

    cmpl-float v3, v2, p2

    if-eqz v3, :cond_4

    iget v3, p4, Ln5/z;->j:I

    int-to-float v3, v3

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_6

    :cond_4
    iget v1, v1, Ls3/m1;->o:I

    if-eq v1, p6, :cond_5

    iget v2, p4, Ln5/z;->k:I

    if-gt v1, v2, :cond_6

    :cond_5
    move v1, p3

    goto :goto_2

    :cond_6
    move v1, v0

    :goto_2
    iput-boolean v1, p0, Ln5/m$i;->l:Z

    if-eqz p7, :cond_b

    iget-object p7, p0, Ln5/m$h;->k:Ls3/m1;

    iget v1, p7, Ls3/m1;->x:I

    if-eq v1, p6, :cond_7

    iget v2, p4, Ln5/z;->l:I

    if-lt v1, v2, :cond_b

    :cond_7
    iget v1, p7, Ls3/m1;->y:I

    if-eq v1, p6, :cond_8

    iget v2, p4, Ln5/z;->m:I

    if-lt v1, v2, :cond_b

    :cond_8
    iget v1, p7, Ls3/m1;->z:F

    cmpl-float p2, v1, p2

    if-eqz p2, :cond_9

    iget p2, p4, Ln5/z;->n:I

    int-to-float p2, p2

    cmpl-float p2, v1, p2

    if-ltz p2, :cond_b

    :cond_9
    iget p2, p7, Ls3/m1;->o:I

    if-eq p2, p6, :cond_a

    iget p6, p4, Ln5/z;->o:I

    if-lt p2, p6, :cond_b

    :cond_a
    move p2, p3

    goto :goto_3

    :cond_b
    move p2, v0

    :goto_3
    iput-boolean p2, p0, Ln5/m$i;->n:Z

    invoke-static {p5, v0}, Ln5/m;->I(IZ)Z

    move-result p2

    iput-boolean p2, p0, Ln5/m$i;->o:Z

    iget-object p2, p0, Ln5/m$h;->k:Ls3/m1;

    iget p6, p2, Ls3/m1;->o:I

    iput p6, p0, Ln5/m$i;->p:I

    invoke-virtual {p2}, Ls3/m1;->f()I

    move-result p2

    iput p2, p0, Ln5/m$i;->q:I

    iget-object p2, p0, Ln5/m$h;->k:Ls3/m1;

    iget p2, p2, Ls3/m1;->l:I

    iget p6, p4, Ln5/z;->t:I

    invoke-static {p2, p6}, Ln5/m;->t(II)I

    move-result p2

    iput p2, p0, Ln5/m$i;->s:I

    iget-object p2, p0, Ln5/m$h;->k:Ls3/m1;

    iget p2, p2, Ls3/m1;->l:I

    if-eqz p2, :cond_d

    and-int/2addr p2, p3

    if-eqz p2, :cond_c

    goto :goto_4

    :cond_c
    move p2, v0

    goto :goto_5

    :cond_d
    :goto_4
    move p2, p3

    :goto_5
    iput-boolean p2, p0, Ln5/m$i;->t:Z

    const p2, 0x7fffffff

    move p6, v0

    :goto_6
    iget-object p7, p4, Ln5/z;->s:Li7/u;

    invoke-virtual {p7}, Ljava/util/AbstractCollection;->size()I

    move-result p7

    if-ge p6, p7, :cond_f

    iget-object p7, p0, Ln5/m$h;->k:Ls3/m1;

    iget-object p7, p7, Ls3/m1;->s:Ljava/lang/String;

    if-eqz p7, :cond_e

    iget-object v1, p4, Ln5/z;->s:Li7/u;

    invoke-interface {v1, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p7

    if-eqz p7, :cond_e

    move p2, p6

    goto :goto_7

    :cond_e
    add-int/lit8 p6, p6, 0x1

    goto :goto_6

    :cond_f
    :goto_7
    iput p2, p0, Ln5/m$i;->r:I

    invoke-static {p5}, Ls3/j3;->k(I)I

    move-result p2

    const/16 p4, 0x80

    if-ne p2, p4, :cond_10

    move p2, p3

    goto :goto_8

    :cond_10
    move p2, v0

    :goto_8
    iput-boolean p2, p0, Ln5/m$i;->w:Z

    invoke-static {p5}, Ls3/j3;->o(I)I

    move-result p2

    const/16 p4, 0x40

    if-ne p2, p4, :cond_11

    goto :goto_9

    :cond_11
    move p3, v0

    :goto_9
    iput-boolean p3, p0, Ln5/m$i;->x:Z

    iget-object p2, p0, Ln5/m$h;->k:Ls3/m1;

    iget-object p2, p2, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {p2}, Ln5/m;->u(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Ln5/m$i;->y:I

    invoke-virtual {p0, p5, p1}, Ln5/m$i;->o(II)I

    move-result p1

    iput p1, p0, Ln5/m$i;->v:I

    return-void
.end method

.method public static synthetic f(Ln5/m$i;Ln5/m$i;)I
    .locals 0

    invoke-static {p0, p1}, Ln5/m$i;->i(Ln5/m$i;Ln5/m$i;)I

    move-result p0

    return p0
.end method

.method public static synthetic h(Ln5/m$i;Ln5/m$i;)I
    .locals 0

    invoke-static {p0, p1}, Ln5/m$i;->l(Ln5/m$i;Ln5/m$i;)I

    move-result p0

    return p0
.end method

.method public static i(Ln5/m$i;Ln5/m$i;)I
    .locals 4

    invoke-static {}, Li7/n;->j()Li7/n;

    move-result-object v0

    iget-boolean v1, p0, Ln5/m$i;->o:Z

    iget-boolean v2, p1, Ln5/m$i;->o:Z

    invoke-virtual {v0, v1, v2}, Li7/n;->g(ZZ)Li7/n;

    move-result-object v0

    iget v1, p0, Ln5/m$i;->s:I

    iget v2, p1, Ln5/m$i;->s:I

    invoke-virtual {v0, v1, v2}, Li7/n;->d(II)Li7/n;

    move-result-object v0

    iget-boolean v1, p0, Ln5/m$i;->t:Z

    iget-boolean v2, p1, Ln5/m$i;->t:Z

    invoke-virtual {v0, v1, v2}, Li7/n;->g(ZZ)Li7/n;

    move-result-object v0

    iget-boolean v1, p0, Ln5/m$i;->l:Z

    iget-boolean v2, p1, Ln5/m$i;->l:Z

    invoke-virtual {v0, v1, v2}, Li7/n;->g(ZZ)Li7/n;

    move-result-object v0

    iget-boolean v1, p0, Ln5/m$i;->n:Z

    iget-boolean v2, p1, Ln5/m$i;->n:Z

    invoke-virtual {v0, v1, v2}, Li7/n;->g(ZZ)Li7/n;

    move-result-object v0

    iget v1, p0, Ln5/m$i;->r:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p1, Ln5/m$i;->r:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {}, Li7/p0;->c()Li7/p0;

    move-result-object v3

    invoke-virtual {v3}, Li7/p0;->f()Li7/p0;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Li7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Li7/n;

    move-result-object v0

    iget-boolean v1, p0, Ln5/m$i;->w:Z

    iget-boolean v2, p1, Ln5/m$i;->w:Z

    invoke-virtual {v0, v1, v2}, Li7/n;->g(ZZ)Li7/n;

    move-result-object v0

    iget-boolean v1, p0, Ln5/m$i;->x:Z

    iget-boolean v2, p1, Ln5/m$i;->x:Z

    invoke-virtual {v0, v1, v2}, Li7/n;->g(ZZ)Li7/n;

    move-result-object v0

    iget-boolean v1, p0, Ln5/m$i;->w:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Ln5/m$i;->x:Z

    if-eqz v1, :cond_0

    iget p0, p0, Ln5/m$i;->y:I

    iget p1, p1, Ln5/m$i;->y:I

    invoke-virtual {v0, p0, p1}, Li7/n;->d(II)Li7/n;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Li7/n;->i()I

    move-result p0

    return p0
.end method

.method public static l(Ln5/m$i;Ln5/m$i;)I
    .locals 5

    iget-boolean v0, p0, Ln5/m$i;->l:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ln5/m$i;->o:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ln5/m;->v()Li7/p0;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ln5/m;->v()Li7/p0;

    move-result-object v0

    invoke-virtual {v0}, Li7/p0;->f()Li7/p0;

    move-result-object v0

    :goto_0
    invoke-static {}, Li7/n;->j()Li7/n;

    move-result-object v1

    iget v2, p0, Ln5/m$i;->p:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln5/m$i;->p:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Ln5/m$i;->m:Ln5/m$d;

    iget-boolean v4, v4, Ln5/z;->D:Z

    if-eqz v4, :cond_1

    invoke-static {}, Ln5/m;->v()Li7/p0;

    move-result-object v4

    invoke-virtual {v4}, Li7/p0;->f()Li7/p0;

    move-result-object v4

    goto :goto_1

    :cond_1
    invoke-static {}, Ln5/m;->w()Li7/p0;

    move-result-object v4

    :goto_1
    invoke-virtual {v1, v2, v3, v4}, Li7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Li7/n;

    move-result-object v1

    iget v2, p0, Ln5/m$i;->q:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln5/m$i;->q:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Li7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Li7/n;

    move-result-object v1

    iget p0, p0, Ln5/m$i;->p:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    iget p1, p1, Ln5/m$i;->p:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p0, p1, v0}, Li7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Li7/n;

    move-result-object p0

    invoke-virtual {p0}, Li7/n;->i()I

    move-result p0

    return p0
.end method

.method public static m(Ljava/util/List;Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln5/m$i;",
            ">;",
            "Ljava/util/List<",
            "Ln5/m$i;",
            ">;)I"
        }
    .end annotation

    invoke-static {}, Li7/n;->j()Li7/n;

    move-result-object v0

    sget-object v1, Ln5/q;->h:Ln5/q;

    invoke-static {p0, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln5/m$i;

    sget-object v2, Ln5/q;->h:Ln5/q;

    invoke-static {p1, v2}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln5/m$i;

    sget-object v3, Ln5/q;->h:Ln5/q;

    invoke-virtual {v0, v1, v2, v3}, Li7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Li7/n;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Li7/n;->d(II)Li7/n;

    move-result-object v0

    sget-object v1, Ln5/r;->h:Ln5/r;

    invoke-static {p0, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln5/m$i;

    sget-object v1, Ln5/r;->h:Ln5/r;

    invoke-static {p1, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln5/m$i;

    sget-object v1, Ln5/r;->h:Ln5/r;

    invoke-virtual {v0, p0, p1, v1}, Li7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Li7/n;

    move-result-object p0

    invoke-virtual {p0}, Li7/n;->i()I

    move-result p0

    return p0
.end method

.method public static n(ILu4/s0;Ln5/m$d;[II)Li7/u;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lu4/s0;",
            "Ln5/m$d;",
            "[II)",
            "Li7/u<",
            "Ln5/m$i;",
            ">;"
        }
    .end annotation

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    iget v0, v9, Ln5/z;->p:I

    iget v1, v9, Ln5/z;->q:I

    iget-boolean v2, v9, Ln5/z;->r:Z

    invoke-static {v8, v0, v1, v2}, Ln5/m;->s(Lu4/s0;IIZ)I

    move-result v10

    invoke-static {}, Li7/u;->n()Li7/u$a;

    move-result-object v11

    const/4 v12, 0x0

    move v13, v12

    :goto_0
    iget v0, v8, Lu4/s0;->h:I

    if-ge v13, v0, :cond_2

    invoke-virtual {v8, v13}, Lu4/s0;->b(I)Ls3/m1;

    move-result-object v0

    invoke-virtual {v0}, Ls3/m1;->f()I

    move-result v0

    const v1, 0x7fffffff

    if-eq v10, v1, :cond_1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    if-gt v0, v10, :cond_0

    goto :goto_1

    :cond_0
    move v7, v12

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v0, 0x1

    move v7, v0

    :goto_2
    new-instance v14, Ln5/m$i;

    aget v5, p3, v13

    move-object v0, v14

    move v1, p0

    move-object/from16 v2, p1

    move v3, v13

    move-object/from16 v4, p2

    move/from16 v6, p4

    invoke-direct/range {v0 .. v7}, Ln5/m$i;-><init>(ILu4/s0;ILn5/m$d;IIZ)V

    invoke-virtual {v11, v14}, Li7/u$a;->h(Ljava/lang/Object;)Li7/u$a;

    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v11}, Li7/u$a;->k()Li7/u;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Ln5/m$i;->v:I

    return v0
.end method

.method public bridge synthetic c(Ln5/m$h;)Z
    .locals 0

    check-cast p1, Ln5/m$i;

    invoke-virtual {p0, p1}, Ln5/m$i;->p(Ln5/m$i;)Z

    move-result p1

    return p1
.end method

.method public final o(II)I
    .locals 2

    iget-object v0, p0, Ln5/m$h;->k:Ls3/m1;

    iget v0, v0, Ls3/m1;->l:I

    and-int/lit16 v0, v0, 0x4000

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Ln5/m$i;->m:Ln5/m$d;

    iget-boolean v0, v0, Ln5/m$d;->u0:Z

    invoke-static {p1, v0}, Ln5/m;->I(IZ)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-boolean v0, p0, Ln5/m$i;->l:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Ln5/m$i;->m:Ln5/m$d;

    iget-boolean v0, v0, Ln5/m$d;->k0:Z

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-static {p1, v1}, Ln5/m;->I(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Ln5/m$i;->n:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Ln5/m$i;->l:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Ln5/m$h;->k:Ls3/m1;

    iget v0, v0, Ls3/m1;->o:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Ln5/m$i;->m:Ln5/m$d;

    iget-boolean v1, v0, Ln5/z;->E:Z

    if-nez v1, :cond_3

    iget-boolean v0, v0, Ln5/z;->D:Z

    if-nez v0, :cond_3

    and-int/2addr p1, p2

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method public p(Ln5/m$i;)Z
    .locals 2

    iget-boolean v0, p0, Ln5/m$i;->u:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ln5/m$h;->k:Ls3/m1;

    iget-object v0, v0, Ls3/m1;->s:Ljava/lang/String;

    iget-object v1, p1, Ln5/m$h;->k:Ls3/m1;

    iget-object v1, v1, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {v0, v1}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Ln5/m$i;->m:Ln5/m$d;

    iget-boolean v0, v0, Ln5/m$d;->n0:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ln5/m$i;->w:Z

    iget-boolean v1, p1, Ln5/m$i;->w:Z

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Ln5/m$i;->x:Z

    iget-boolean p1, p1, Ln5/m$i;->x:Z

    if-ne v0, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
