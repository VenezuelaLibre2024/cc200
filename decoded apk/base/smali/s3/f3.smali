.class public final Ls3/f3;
.super Ls3/a;
.source ""


# instance fields
.field public final p:I

.field public final q:I

.field public final r:[I

.field public final s:[I

.field public final t:[Ls3/u3;

.field public final u:[Ljava/lang/Object;

.field public final v:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Collection;Lu4/o0;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ls3/e2;",
            ">;",
            "Lu4/o0;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p2}, Ls3/a;-><init>(ZLu4/o0;)V

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p2

    new-array v1, p2, [I

    iput-object v1, p0, Ls3/f3;->r:[I

    new-array v1, p2, [I

    iput-object v1, p0, Ls3/f3;->s:[I

    new-array v1, p2, [Ls3/u3;

    iput-object v1, p0, Ls3/f3;->t:[Ls3/u3;

    new-array p2, p2, [Ljava/lang/Object;

    iput-object p2, p0, Ls3/f3;->u:[Ljava/lang/Object;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Ls3/f3;->v:Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move p2, v0

    move v1, p2

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls3/e2;

    iget-object v3, p0, Ls3/f3;->t:[Ls3/u3;

    invoke-interface {v2}, Ls3/e2;->c()Ls3/u3;

    move-result-object v4

    aput-object v4, v3, v1

    iget-object v3, p0, Ls3/f3;->s:[I

    aput v0, v3, v1

    iget-object v3, p0, Ls3/f3;->r:[I

    aput p2, v3, v1

    iget-object v3, p0, Ls3/f3;->t:[Ls3/u3;

    aget-object v3, v3, v1

    invoke-virtual {v3}, Ls3/u3;->t()I

    move-result v3

    add-int/2addr v0, v3

    iget-object v3, p0, Ls3/f3;->t:[Ls3/u3;

    aget-object v3, v3, v1

    invoke-virtual {v3}, Ls3/u3;->m()I

    move-result v3

    add-int/2addr p2, v3

    iget-object v3, p0, Ls3/f3;->u:[Ljava/lang/Object;

    invoke-interface {v2}, Ls3/e2;->b()Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v3, v1

    iget-object v2, p0, Ls3/f3;->v:Ljava/util/HashMap;

    iget-object v3, p0, Ls3/f3;->u:[Ljava/lang/Object;

    aget-object v3, v3, v1

    add-int/lit8 v4, v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v4

    goto :goto_0

    :cond_0
    iput v0, p0, Ls3/f3;->p:I

    iput p2, p0, Ls3/f3;->q:I

    return-void
.end method


# virtual methods
.method public B(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls3/f3;->u:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public D(I)I
    .locals 1

    iget-object v0, p0, Ls3/f3;->r:[I

    aget p1, v0, p1

    return p1
.end method

.method public E(I)I
    .locals 1

    iget-object v0, p0, Ls3/f3;->s:[I

    aget p1, v0, p1

    return p1
.end method

.method public H(I)Ls3/u3;
    .locals 1

    iget-object v0, p0, Ls3/f3;->t:[Ls3/u3;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public I()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ls3/u3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ls3/f3;->t:[Ls3/u3;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public m()I
    .locals 1

    iget v0, p0, Ls3/f3;->q:I

    return v0
.end method

.method public t()I
    .locals 1

    iget v0, p0, Ls3/f3;->p:I

    return v0
.end method

.method public w(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Ls3/f3;->v:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_0
    return p1
.end method

.method public x(I)I
    .locals 2

    iget-object v0, p0, Ls3/f3;->r:[I

    add-int/lit8 p1, p1, 0x1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, v1}, Lp5/n0;->h([IIZZ)I

    move-result p1

    return p1
.end method

.method public y(I)I
    .locals 2

    iget-object v0, p0, Ls3/f3;->s:[I

    add-int/lit8 p1, p1, 0x1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, v1}, Lp5/n0;->h([IIZZ)I

    move-result p1

    return p1
.end method
