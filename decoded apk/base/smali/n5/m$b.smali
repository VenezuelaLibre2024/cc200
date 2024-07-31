.class public final Ln5/m$b;
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
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln5/m$h<",
        "Ln5/m$b;",
        ">;",
        "Ljava/lang/Comparable<",
        "Ln5/m$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final A:I

.field public final B:Z

.field public final C:Z

.field public final l:I

.field public final m:Z

.field public final n:Ljava/lang/String;

.field public final o:Ln5/m$d;

.field public final p:Z

.field public final q:I

.field public final r:I

.field public final s:I

.field public final t:Z

.field public final u:I

.field public final v:I

.field public final w:Z

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method public constructor <init>(ILu4/s0;ILn5/m$d;IZLh7/p;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lu4/s0;",
            "I",
            "Ln5/m$d;",
            "IZ",
            "Lh7/p<",
            "Ls3/m1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Ln5/m$h;-><init>(ILu4/s0;I)V

    iput-object p4, p0, Ln5/m$b;->o:Ln5/m$d;

    iget-object p1, p0, Ln5/m$h;->k:Ls3/m1;

    iget-object p1, p1, Ls3/m1;->j:Ljava/lang/String;

    invoke-static {p1}, Ln5/m;->Q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ln5/m$b;->n:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-static {p5, p1}, Ln5/m;->I(IZ)Z

    move-result p2

    iput-boolean p2, p0, Ln5/m$b;->p:Z

    move p2, p1

    :goto_0
    iget-object p3, p4, Ln5/z;->u:Li7/u;

    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    const v0, 0x7fffffff

    if-ge p2, p3, :cond_1

    iget-object p3, p0, Ln5/m$h;->k:Ls3/m1;

    iget-object v1, p4, Ln5/z;->u:Li7/u;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p3, v1, p1}, Ln5/m;->B(Ls3/m1;Ljava/lang/String;Z)I

    move-result p3

    if-lez p3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    move p3, p1

    move p2, v0

    :goto_1
    iput p2, p0, Ln5/m$b;->r:I

    iput p3, p0, Ln5/m$b;->q:I

    iget-object p2, p0, Ln5/m$h;->k:Ls3/m1;

    iget p2, p2, Ls3/m1;->l:I

    iget p3, p4, Ln5/z;->v:I

    invoke-static {p2, p3}, Ln5/m;->t(II)I

    move-result p2

    iput p2, p0, Ln5/m$b;->s:I

    iget-object p2, p0, Ln5/m$h;->k:Ls3/m1;

    iget p3, p2, Ls3/m1;->l:I

    const/4 v1, 0x1

    if-eqz p3, :cond_3

    and-int/2addr p3, v1

    if-eqz p3, :cond_2

    goto :goto_2

    :cond_2
    move p3, p1

    goto :goto_3

    :cond_3
    :goto_2
    move p3, v1

    :goto_3
    iput-boolean p3, p0, Ln5/m$b;->t:Z

    iget p3, p2, Ls3/m1;->k:I

    and-int/2addr p3, v1

    if-eqz p3, :cond_4

    move p3, v1

    goto :goto_4

    :cond_4
    move p3, p1

    :goto_4
    iput-boolean p3, p0, Ln5/m$b;->w:Z

    iget p3, p2, Ls3/m1;->F:I

    iput p3, p0, Ln5/m$b;->x:I

    iget v2, p2, Ls3/m1;->G:I

    iput v2, p0, Ln5/m$b;->y:I

    iget v2, p2, Ls3/m1;->o:I

    iput v2, p0, Ln5/m$b;->z:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_5

    iget v4, p4, Ln5/z;->x:I

    if-gt v2, v4, :cond_7

    :cond_5
    if-eq p3, v3, :cond_6

    iget v2, p4, Ln5/z;->w:I

    if-gt p3, v2, :cond_7

    :cond_6
    invoke-interface {p7, p2}, Lh7/p;->apply(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    move p2, v1

    goto :goto_5

    :cond_7
    move p2, p1

    :goto_5
    iput-boolean p2, p0, Ln5/m$b;->m:Z

    invoke-static {}, Lp5/n0;->g0()[Ljava/lang/String;

    move-result-object p2

    move p3, p1

    :goto_6
    array-length p7, p2

    if-ge p3, p7, :cond_9

    iget-object p7, p0, Ln5/m$h;->k:Ls3/m1;

    aget-object v2, p2, p3

    invoke-static {p7, v2, p1}, Ln5/m;->B(Ls3/m1;Ljava/lang/String;Z)I

    move-result p7

    if-lez p7, :cond_8

    goto :goto_7

    :cond_8
    add-int/lit8 p3, p3, 0x1

    goto :goto_6

    :cond_9
    move p7, p1

    move p3, v0

    :goto_7
    iput p3, p0, Ln5/m$b;->u:I

    iput p7, p0, Ln5/m$b;->v:I

    move p2, p1

    :goto_8
    iget-object p3, p4, Ln5/z;->y:Li7/u;

    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    if-ge p2, p3, :cond_b

    iget-object p3, p0, Ln5/m$h;->k:Ls3/m1;

    iget-object p3, p3, Ls3/m1;->s:Ljava/lang/String;

    if-eqz p3, :cond_a

    iget-object p7, p4, Ln5/z;->y:Li7/u;

    invoke-interface {p7, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p7

    invoke-virtual {p3, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_a

    move v0, p2

    goto :goto_9

    :cond_a
    add-int/lit8 p2, p2, 0x1

    goto :goto_8

    :cond_b
    :goto_9
    iput v0, p0, Ln5/m$b;->A:I

    invoke-static {p5}, Ls3/j3;->k(I)I

    move-result p2

    const/16 p3, 0x80

    if-ne p2, p3, :cond_c

    move p2, v1

    goto :goto_a

    :cond_c
    move p2, p1

    :goto_a
    iput-boolean p2, p0, Ln5/m$b;->B:Z

    invoke-static {p5}, Ls3/j3;->o(I)I

    move-result p2

    const/16 p3, 0x40

    if-ne p2, p3, :cond_d

    move p1, v1

    :cond_d
    iput-boolean p1, p0, Ln5/m$b;->C:Z

    invoke-virtual {p0, p5, p6}, Ln5/m$b;->l(IZ)I

    move-result p1

    iput p1, p0, Ln5/m$b;->l:I

    return-void
.end method

.method public static f(Ljava/util/List;Ljava/util/List;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln5/m$b;",
            ">;",
            "Ljava/util/List<",
            "Ln5/m$b;",
            ">;)I"
        }
    .end annotation

    invoke-static {p0}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln5/m$b;

    invoke-static {p1}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln5/m$b;

    invoke-virtual {p0, p1}, Ln5/m$b;->h(Ln5/m$b;)I

    move-result p0

    return p0
.end method

.method public static i(ILu4/s0;Ln5/m$d;[IZLh7/p;)Li7/u;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lu4/s0;",
            "Ln5/m$d;",
            "[IZ",
            "Lh7/p<",
            "Ls3/m1;",
            ">;)",
            "Li7/u<",
            "Ln5/m$b;",
            ">;"
        }
    .end annotation

    invoke-static {}, Li7/u;->n()Li7/u$a;

    move-result-object v0

    const/4 v1, 0x0

    move-object v10, p1

    :goto_0
    iget v2, v10, Lu4/s0;->h:I

    if-ge v1, v2, :cond_0

    new-instance v11, Ln5/m$b;

    aget v7, p3, v1

    move-object v2, v11

    move v3, p0

    move-object v4, p1

    move v5, v1

    move-object v6, p2

    move/from16 v8, p4

    move-object/from16 v9, p5

    invoke-direct/range {v2 .. v9}, Ln5/m$b;-><init>(ILu4/s0;ILn5/m$d;IZLh7/p;)V

    invoke-virtual {v0, v11}, Li7/u$a;->h(Ljava/lang/Object;)Li7/u$a;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Li7/u$a;->k()Li7/u;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Ln5/m$b;->l:I

    return v0
.end method

.method public bridge synthetic c(Ln5/m$h;)Z
    .locals 0

    check-cast p1, Ln5/m$b;

    invoke-virtual {p0, p1}, Ln5/m$b;->m(Ln5/m$b;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ln5/m$b;

    invoke-virtual {p0, p1}, Ln5/m$b;->h(Ln5/m$b;)I

    move-result p1

    return p1
.end method

.method public h(Ln5/m$b;)I
    .locals 5

    iget-boolean v0, p0, Ln5/m$b;->m:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ln5/m$b;->p:Z

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

    iget-boolean v2, p0, Ln5/m$b;->p:Z

    iget-boolean v3, p1, Ln5/m$b;->p:Z

    invoke-virtual {v1, v2, v3}, Li7/n;->g(ZZ)Li7/n;

    move-result-object v1

    iget v2, p0, Ln5/m$b;->r:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln5/m$b;->r:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Li7/p0;->c()Li7/p0;

    move-result-object v4

    invoke-virtual {v4}, Li7/p0;->f()Li7/p0;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Li7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Li7/n;

    move-result-object v1

    iget v2, p0, Ln5/m$b;->q:I

    iget v3, p1, Ln5/m$b;->q:I

    invoke-virtual {v1, v2, v3}, Li7/n;->d(II)Li7/n;

    move-result-object v1

    iget v2, p0, Ln5/m$b;->s:I

    iget v3, p1, Ln5/m$b;->s:I

    invoke-virtual {v1, v2, v3}, Li7/n;->d(II)Li7/n;

    move-result-object v1

    iget-boolean v2, p0, Ln5/m$b;->w:Z

    iget-boolean v3, p1, Ln5/m$b;->w:Z

    invoke-virtual {v1, v2, v3}, Li7/n;->g(ZZ)Li7/n;

    move-result-object v1

    iget-boolean v2, p0, Ln5/m$b;->t:Z

    iget-boolean v3, p1, Ln5/m$b;->t:Z

    invoke-virtual {v1, v2, v3}, Li7/n;->g(ZZ)Li7/n;

    move-result-object v1

    iget v2, p0, Ln5/m$b;->u:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln5/m$b;->u:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Li7/p0;->c()Li7/p0;

    move-result-object v4

    invoke-virtual {v4}, Li7/p0;->f()Li7/p0;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Li7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Li7/n;

    move-result-object v1

    iget v2, p0, Ln5/m$b;->v:I

    iget v3, p1, Ln5/m$b;->v:I

    invoke-virtual {v1, v2, v3}, Li7/n;->d(II)Li7/n;

    move-result-object v1

    iget-boolean v2, p0, Ln5/m$b;->m:Z

    iget-boolean v3, p1, Ln5/m$b;->m:Z

    invoke-virtual {v1, v2, v3}, Li7/n;->g(ZZ)Li7/n;

    move-result-object v1

    iget v2, p0, Ln5/m$b;->A:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln5/m$b;->A:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Li7/p0;->c()Li7/p0;

    move-result-object v4

    invoke-virtual {v4}, Li7/p0;->f()Li7/p0;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Li7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Li7/n;

    move-result-object v1

    iget v2, p0, Ln5/m$b;->z:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln5/m$b;->z:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Ln5/m$b;->o:Ln5/m$d;

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

    iget-boolean v2, p0, Ln5/m$b;->B:Z

    iget-boolean v3, p1, Ln5/m$b;->B:Z

    invoke-virtual {v1, v2, v3}, Li7/n;->g(ZZ)Li7/n;

    move-result-object v1

    iget-boolean v2, p0, Ln5/m$b;->C:Z

    iget-boolean v3, p1, Ln5/m$b;->C:Z

    invoke-virtual {v1, v2, v3}, Li7/n;->g(ZZ)Li7/n;

    move-result-object v1

    iget v2, p0, Ln5/m$b;->x:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln5/m$b;->x:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Li7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Li7/n;

    move-result-object v1

    iget v2, p0, Ln5/m$b;->y:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln5/m$b;->y:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Li7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Li7/n;

    move-result-object v1

    iget v2, p0, Ln5/m$b;->z:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln5/m$b;->z:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Ln5/m$b;->n:Ljava/lang/String;

    iget-object p1, p1, Ln5/m$b;->n:Ljava/lang/String;

    invoke-static {v4, p1}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {}, Ln5/m;->w()Li7/p0;

    move-result-object v0

    :goto_2
    invoke-virtual {v1, v2, v3, v0}, Li7/n;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Li7/n;

    move-result-object p1

    invoke-virtual {p1}, Li7/n;->i()I

    move-result p1

    return p1
.end method

.method public final l(IZ)I
    .locals 2

    iget-object v0, p0, Ln5/m$b;->o:Ln5/m$d;

    iget-boolean v0, v0, Ln5/m$d;->u0:Z

    invoke-static {p1, v0}, Ln5/m;->I(IZ)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Ln5/m$b;->m:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ln5/m$b;->o:Ln5/m$d;

    iget-boolean v0, v0, Ln5/m$d;->o0:Z

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-static {p1, v1}, Ln5/m;->I(IZ)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Ln5/m$b;->m:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Ln5/m$h;->k:Ls3/m1;

    iget p1, p1, Ls3/m1;->o:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_3

    iget-object p1, p0, Ln5/m$b;->o:Ln5/m$d;

    iget-boolean v0, p1, Ln5/z;->E:Z

    if-nez v0, :cond_3

    iget-boolean v0, p1, Ln5/z;->D:Z

    if-nez v0, :cond_3

    iget-boolean p1, p1, Ln5/m$d;->w0:Z

    if-nez p1, :cond_2

    if-nez p2, :cond_3

    :cond_2
    const/4 p1, 0x2

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method public m(Ln5/m$b;)Z
    .locals 4

    iget-object v0, p0, Ln5/m$b;->o:Ln5/m$d;

    iget-boolean v1, v0, Ln5/m$d;->r0:Z

    const/4 v2, -0x1

    if-nez v1, :cond_0

    iget-object v1, p0, Ln5/m$h;->k:Ls3/m1;

    iget v1, v1, Ls3/m1;->F:I

    if-eq v1, v2, :cond_3

    iget-object v3, p1, Ln5/m$h;->k:Ls3/m1;

    iget v3, v3, Ls3/m1;->F:I

    if-ne v1, v3, :cond_3

    :cond_0
    iget-boolean v0, v0, Ln5/m$d;->p0:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ln5/m$h;->k:Ls3/m1;

    iget-object v0, v0, Ls3/m1;->s:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v1, p1, Ln5/m$h;->k:Ls3/m1;

    iget-object v1, v1, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Ln5/m$b;->o:Ln5/m$d;

    iget-boolean v1, v0, Ln5/m$d;->q0:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Ln5/m$h;->k:Ls3/m1;

    iget v1, v1, Ls3/m1;->G:I

    if-eq v1, v2, :cond_3

    iget-object v2, p1, Ln5/m$h;->k:Ls3/m1;

    iget v2, v2, Ls3/m1;->G:I

    if-ne v1, v2, :cond_3

    :cond_2
    iget-boolean v0, v0, Ln5/m$d;->s0:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ln5/m$b;->B:Z

    iget-boolean v1, p1, Ln5/m$b;->B:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Ln5/m$b;->C:Z

    iget-boolean p1, p1, Ln5/m$b;->C:Z

    if-ne v0, p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
