.class public Li7/u$d;
.super Li7/u;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li7/u<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final transient j:I

.field public final transient k:I

.field public final synthetic l:Li7/u;


# direct methods
.method public constructor <init>(Li7/u;II)V
    .locals 0

    iput-object p1, p0, Li7/u$d;->l:Li7/u;

    invoke-direct {p0}, Li7/u;-><init>()V

    iput p2, p0, Li7/u$d;->j:I

    iput p3, p0, Li7/u$d;->k:I

    return-void
.end method


# virtual methods
.method public D(II)Li7/u;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Li7/u<",
            "TE;>;"
        }
    .end annotation

    iget v0, p0, Li7/u$d;->k:I

    invoke-static {p1, p2, v0}, Lh7/o;->n(III)V

    iget-object v0, p0, Li7/u$d;->l:Li7/u;

    iget v1, p0, Li7/u$d;->j:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Li7/u;->D(II)Li7/u;

    move-result-object p1

    return-object p1
.end method

.method public c()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Li7/u$d;->l:Li7/u;

    invoke-virtual {v0}, Li7/s;->c()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 2

    iget-object v0, p0, Li7/u$d;->l:Li7/u;

    invoke-virtual {v0}, Li7/s;->e()I

    move-result v0

    iget v1, p0, Li7/u$d;->j:I

    add-int/2addr v0, v1

    iget v1, p0, Li7/u$d;->k:I

    add-int/2addr v0, v1

    return v0
.end method

.method public e()I
    .locals 2

    iget-object v0, p0, Li7/u$d;->l:Li7/u;

    invoke-virtual {v0}, Li7/s;->e()I

    move-result v0

    iget v1, p0, Li7/u$d;->j:I

    add-int/2addr v0, v1

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget v0, p0, Li7/u$d;->k:I

    invoke-static {p1, v0}, Lh7/o;->h(II)I

    iget-object v0, p0, Li7/u$d;->l:Li7/u;

    iget v1, p0, Li7/u$d;->j:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-super {p0}, Li7/u;->j()Li7/d1;

    move-result-object v0

    return-object v0
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

    iget v0, p0, Li7/u$d;->k:I

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li7/u$d;->D(II)Li7/u;

    move-result-object p1

    return-object p1
.end method
