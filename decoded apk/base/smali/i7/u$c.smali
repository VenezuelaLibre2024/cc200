.class public Li7/u$c;
.super Li7/u;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Li7/u<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final transient j:Li7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/u<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Li7/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li7/u<",
            "TE;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Li7/u;-><init>()V

    iput-object p1, p0, Li7/u$c;->j:Li7/u;

    return-void
.end method


# virtual methods
.method public B()Li7/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/u<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Li7/u$c;->j:Li7/u;

    return-object v0
.end method

.method public D(II)Li7/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Li7/u<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, Li7/u$c;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, Lh7/o;->n(III)V

    iget-object v0, p0, Li7/u$c;->j:Li7/u;

    invoke-virtual {p0, p2}, Li7/u$c;->I(I)I

    move-result p2

    invoke-virtual {p0, p1}, Li7/u$c;->I(I)I

    move-result p1

    invoke-virtual {v0, p2, p1}, Li7/u;->D(II)Li7/u;

    move-result-object p1

    invoke-virtual {p1}, Li7/u;->B()Li7/u;

    move-result-object p1

    return-object p1
.end method

.method public final G(I)I
    .locals 1

    invoke-virtual {p0}, Li7/u$c;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p1

    return v0
.end method

.method public final I(I)I
    .locals 1

    invoke-virtual {p0}, Li7/u$c;->size()I

    move-result v0

    sub-int/2addr v0, p1

    return v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Li7/u$c;->j:Li7/u;

    invoke-virtual {v0, p1}, Li7/u;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    invoke-virtual {p0}, Li7/u$c;->size()I

    move-result v0

    invoke-static {p1, v0}, Lh7/o;->h(II)I

    iget-object v0, p0, Li7/u$c;->j:Li7/u;

    invoke-virtual {p0, p1}, Li7/u$c;->G(I)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Li7/u$c;->j:Li7/u;

    invoke-virtual {v0}, Li7/s;->h()Z

    move-result v0

    return v0
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Li7/u$c;->j:Li7/u;

    invoke-virtual {v0, p1}, Li7/u;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Li7/u$c;->G(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-super {p0}, Li7/u;->j()Li7/d1;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Li7/u$c;->j:Li7/u;

    invoke-virtual {v0, p1}, Li7/u;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Li7/u$c;->G(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    invoke-super {p0}, Li7/u;->s()Li7/e1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    invoke-super {p0, p1}, Li7/u;->t(I)Li7/e1;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Li7/u$c;->j:Li7/u;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li7/u$c;->D(II)Li7/u;

    move-result-object p1

    return-object p1
.end method
