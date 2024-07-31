.class public abstract Ls3/a;
.super Ls3/u3;
.source ""


# instance fields
.field public final m:I

.field public final n:Lu4/o0;

.field public final o:Z


# direct methods
.method public constructor <init>(ZLu4/o0;)V
    .locals 0

    invoke-direct {p0}, Ls3/u3;-><init>()V

    iput-boolean p1, p0, Ls3/a;->o:Z

    iput-object p2, p0, Ls3/a;->n:Lu4/o0;

    invoke-interface {p2}, Lu4/o0;->b()I

    move-result p1

    iput p1, p0, Ls3/a;->m:I

    return-void
.end method

.method public static A(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p0, Landroid/util/Pair;

    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    return-object p0
.end method

.method public static C(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static z(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p0, Landroid/util/Pair;

    iget-object p0, p0, Landroid/util/Pair;->second:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public abstract B(I)Ljava/lang/Object;
.end method

.method public abstract D(I)I
.end method

.method public abstract E(I)I
.end method

.method public final F(IZ)I
    .locals 0

    if-eqz p2, :cond_0

    iget-object p2, p0, Ls3/a;->n:Lu4/o0;

    invoke-interface {p2, p1}, Lu4/o0;->f(I)I

    move-result p1

    goto :goto_0

    :cond_0
    iget p2, p0, Ls3/a;->m:I

    add-int/lit8 p2, p2, -0x1

    if-ge p1, p2, :cond_1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public final G(IZ)I
    .locals 0

    if-eqz p2, :cond_0

    iget-object p2, p0, Ls3/a;->n:Lu4/o0;

    invoke-interface {p2, p1}, Lu4/o0;->e(I)I

    move-result p1

    goto :goto_0

    :cond_0
    if-lez p1, :cond_1

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public abstract H(I)Ls3/u3;
.end method

.method public e(Z)I
    .locals 3

    iget v0, p0, Ls3/a;->m:I

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Ls3/a;->o:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    move p1, v2

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Ls3/a;->n:Lu4/o0;

    invoke-interface {v0}, Lu4/o0;->d()I

    move-result v2

    :cond_2
    invoke-virtual {p0, v2}, Ls3/a;->H(I)Ls3/u3;

    move-result-object v0

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v2, p1}, Ls3/a;->F(IZ)I

    move-result v2

    if-ne v2, v1, :cond_2

    return v1

    :cond_3
    invoke-virtual {p0, v2}, Ls3/a;->E(I)I

    move-result v0

    invoke-virtual {p0, v2}, Ls3/a;->H(I)Ls3/u3;

    move-result-object v1

    invoke-virtual {v1, p1}, Ls3/u3;->e(Z)I

    move-result p1

    add-int/2addr v0, p1

    return v0
.end method

.method public final f(Ljava/lang/Object;)I
    .locals 3

    instance-of v0, p1, Landroid/util/Pair;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {p1}, Ls3/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1}, Ls3/a;->z(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v0}, Ls3/a;->w(Ljava/lang/Object;)I

    move-result v0

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0, v0}, Ls3/a;->H(I)Ls3/u3;

    move-result-object v2

    invoke-virtual {v2, p1}, Ls3/u3;->f(Ljava/lang/Object;)I

    move-result p1

    if-ne p1, v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0}, Ls3/a;->D(I)I

    move-result v0

    add-int v1, v0, p1

    :goto_0
    return v1
.end method

.method public g(Z)I
    .locals 3

    iget v0, p0, Ls3/a;->m:I

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v2, p0, Ls3/a;->o:Z

    if-eqz v2, :cond_1

    const/4 p1, 0x0

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Ls3/a;->n:Lu4/o0;

    invoke-interface {v0}, Lu4/o0;->h()I

    move-result v0

    goto :goto_0

    :cond_2
    add-int/lit8 v0, v0, -0x1

    :cond_3
    :goto_0
    invoke-virtual {p0, v0}, Ls3/a;->H(I)Ls3/u3;

    move-result-object v2

    invoke-virtual {v2}, Ls3/u3;->u()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v0, p1}, Ls3/a;->G(IZ)I

    move-result v0

    if-ne v0, v1, :cond_3

    return v1

    :cond_4
    invoke-virtual {p0, v0}, Ls3/a;->E(I)I

    move-result v1

    invoke-virtual {p0, v0}, Ls3/a;->H(I)Ls3/u3;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls3/u3;->g(Z)I

    move-result p1

    add-int/2addr v1, p1

    return v1
.end method

.method public i(IIZ)I
    .locals 5

    iget-boolean v0, p0, Ls3/a;->o:Z

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_1

    const/4 p3, 0x1

    if-ne p2, p3, :cond_0

    move p2, v2

    :cond_0
    move p3, v1

    :cond_1
    invoke-virtual {p0, p1}, Ls3/a;->y(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ls3/a;->E(I)I

    move-result v3

    invoke-virtual {p0, v0}, Ls3/a;->H(I)Ls3/u3;

    move-result-object v4

    sub-int/2addr p1, v3

    if-ne p2, v2, :cond_2

    goto :goto_0

    :cond_2
    move v1, p2

    :goto_0
    invoke-virtual {v4, p1, v1, p3}, Ls3/u3;->i(IIZ)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    add-int/2addr v3, p1

    return v3

    :cond_3
    invoke-virtual {p0, v0, p3}, Ls3/a;->F(IZ)I

    move-result p1

    :goto_1
    if-eq p1, v1, :cond_4

    invoke-virtual {p0, p1}, Ls3/a;->H(I)Ls3/u3;

    move-result-object v0

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0, p1, p3}, Ls3/a;->F(IZ)I

    move-result p1

    goto :goto_1

    :cond_4
    if-eq p1, v1, :cond_5

    invoke-virtual {p0, p1}, Ls3/a;->E(I)I

    move-result p2

    invoke-virtual {p0, p1}, Ls3/a;->H(I)Ls3/u3;

    move-result-object p1

    invoke-virtual {p1, p3}, Ls3/u3;->e(Z)I

    move-result p1

    add-int/2addr p2, p1

    return p2

    :cond_5
    if-ne p2, v2, :cond_6

    invoke-virtual {p0, p3}, Ls3/a;->e(Z)I

    move-result p1

    return p1

    :cond_6
    return v1
.end method

.method public final k(ILs3/u3$b;Z)Ls3/u3$b;
    .locals 4

    invoke-virtual {p0, p1}, Ls3/a;->x(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ls3/a;->E(I)I

    move-result v1

    invoke-virtual {p0, v0}, Ls3/a;->D(I)I

    move-result v2

    invoke-virtual {p0, v0}, Ls3/a;->H(I)Ls3/u3;

    move-result-object v3

    sub-int/2addr p1, v2

    invoke-virtual {v3, p1, p2, p3}, Ls3/u3;->k(ILs3/u3$b;Z)Ls3/u3$b;

    iget p1, p2, Ls3/u3$b;->j:I

    add-int/2addr p1, v1

    iput p1, p2, Ls3/u3$b;->j:I

    if-eqz p3, :cond_0

    invoke-virtual {p0, v0}, Ls3/a;->B(I)Ljava/lang/Object;

    move-result-object p1

    iget-object p3, p2, Ls3/u3$b;->i:Ljava/lang/Object;

    invoke-static {p3}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p1, p3}, Ls3/a;->C(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p2, Ls3/u3$b;->i:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public final l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;
    .locals 3

    invoke-static {p1}, Ls3/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1}, Ls3/a;->z(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0}, Ls3/a;->w(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Ls3/a;->E(I)I

    move-result v2

    invoke-virtual {p0, v0}, Ls3/a;->H(I)Ls3/u3;

    move-result-object v0

    invoke-virtual {v0, v1, p2}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    iget v0, p2, Ls3/u3$b;->j:I

    add-int/2addr v0, v2

    iput v0, p2, Ls3/u3$b;->j:I

    iput-object p1, p2, Ls3/u3$b;->i:Ljava/lang/Object;

    return-object p2
.end method

.method public p(IIZ)I
    .locals 5

    iget-boolean v0, p0, Ls3/a;->o:Z

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_1

    const/4 p3, 0x1

    if-ne p2, p3, :cond_0

    move p2, v2

    :cond_0
    move p3, v1

    :cond_1
    invoke-virtual {p0, p1}, Ls3/a;->y(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ls3/a;->E(I)I

    move-result v3

    invoke-virtual {p0, v0}, Ls3/a;->H(I)Ls3/u3;

    move-result-object v4

    sub-int/2addr p1, v3

    if-ne p2, v2, :cond_2

    goto :goto_0

    :cond_2
    move v1, p2

    :goto_0
    invoke-virtual {v4, p1, v1, p3}, Ls3/u3;->p(IIZ)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    add-int/2addr v3, p1

    return v3

    :cond_3
    invoke-virtual {p0, v0, p3}, Ls3/a;->G(IZ)I

    move-result p1

    :goto_1
    if-eq p1, v1, :cond_4

    invoke-virtual {p0, p1}, Ls3/a;->H(I)Ls3/u3;

    move-result-object v0

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0, p1, p3}, Ls3/a;->G(IZ)I

    move-result p1

    goto :goto_1

    :cond_4
    if-eq p1, v1, :cond_5

    invoke-virtual {p0, p1}, Ls3/a;->E(I)I

    move-result p2

    invoke-virtual {p0, p1}, Ls3/a;->H(I)Ls3/u3;

    move-result-object p1

    invoke-virtual {p1, p3}, Ls3/u3;->g(Z)I

    move-result p1

    add-int/2addr p2, p1

    return p2

    :cond_5
    if-ne p2, v2, :cond_6

    invoke-virtual {p0, p3}, Ls3/a;->g(Z)I

    move-result p1

    return p1

    :cond_6
    return v1
.end method

.method public final q(I)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p1}, Ls3/a;->x(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ls3/a;->D(I)I

    move-result v1

    invoke-virtual {p0, v0}, Ls3/a;->H(I)Ls3/u3;

    move-result-object v2

    sub-int/2addr p1, v1

    invoke-virtual {v2, p1}, Ls3/u3;->q(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v0}, Ls3/a;->B(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Ls3/a;->C(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final s(ILs3/u3$d;J)Ls3/u3$d;
    .locals 4

    invoke-virtual {p0, p1}, Ls3/a;->y(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ls3/a;->E(I)I

    move-result v1

    invoke-virtual {p0, v0}, Ls3/a;->D(I)I

    move-result v2

    invoke-virtual {p0, v0}, Ls3/a;->H(I)Ls3/u3;

    move-result-object v3

    sub-int/2addr p1, v1

    invoke-virtual {v3, p1, p2, p3, p4}, Ls3/u3;->s(ILs3/u3$d;J)Ls3/u3$d;

    invoke-virtual {p0, v0}, Ls3/a;->B(I)Ljava/lang/Object;

    move-result-object p1

    sget-object p3, Ls3/u3$d;->y:Ljava/lang/Object;

    iget-object p4, p2, Ls3/u3$d;->h:Ljava/lang/Object;

    invoke-virtual {p3, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object p3, p2, Ls3/u3$d;->h:Ljava/lang/Object;

    invoke-static {p1, p3}, Ls3/a;->C(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    iput-object p1, p2, Ls3/u3$d;->h:Ljava/lang/Object;

    iget p1, p2, Ls3/u3$d;->v:I

    add-int/2addr p1, v2

    iput p1, p2, Ls3/u3$d;->v:I

    iget p1, p2, Ls3/u3$d;->w:I

    add-int/2addr p1, v2

    iput p1, p2, Ls3/u3$d;->w:I

    return-object p2
.end method

.method public abstract w(Ljava/lang/Object;)I
.end method

.method public abstract x(I)I
.end method

.method public abstract y(I)I
.end method
