.class public abstract Li7/k$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public h:I

.field public i:I

.field public j:I

.field public final synthetic k:Li7/k;


# direct methods
.method public constructor <init>(Li7/k;)V
    .locals 1

    iput-object p1, p0, Li7/k$e;->k:Li7/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Li7/k;->a(Li7/k;)I

    move-result v0

    iput v0, p0, Li7/k$e;->h:I

    invoke-virtual {p1}, Li7/k;->z()I

    move-result p1

    iput p1, p0, Li7/k$e;->i:I

    const/4 p1, -0x1

    iput p1, p0, Li7/k$e;->j:I

    return-void
.end method

.method public synthetic constructor <init>(Li7/k;Li7/k$a;)V
    .locals 0

    invoke-direct {p0, p1}, Li7/k$e;-><init>(Li7/k;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Li7/k$e;->k:Li7/k;

    invoke-static {v0}, Li7/k;->a(Li7/k;)I

    move-result v0

    iget v1, p0, Li7/k$e;->h:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public abstract c(I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation
.end method

.method public d()V
    .locals 1

    iget v0, p0, Li7/k$e;->h:I

    add-int/lit8 v0, v0, 0x20

    iput v0, p0, Li7/k$e;->h:I

    return-void
.end method

.method public hasNext()Z
    .locals 1

    iget v0, p0, Li7/k$e;->i:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Li7/k$e;->a()V

    invoke-virtual {p0}, Li7/k$e;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Li7/k$e;->i:I

    iput v0, p0, Li7/k$e;->j:I

    invoke-virtual {p0, v0}, Li7/k$e;->c(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Li7/k$e;->k:Li7/k;

    iget v2, p0, Li7/k$e;->i:I

    invoke-virtual {v1, v2}, Li7/k;->A(I)I

    move-result v1

    iput v1, p0, Li7/k$e;->i:I

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 3

    invoke-virtual {p0}, Li7/k$e;->a()V

    iget v0, p0, Li7/k$e;->j:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Li7/i;->c(Z)V

    invoke-virtual {p0}, Li7/k$e;->d()V

    iget-object v0, p0, Li7/k$e;->k:Li7/k;

    iget v1, p0, Li7/k$e;->j:I

    invoke-static {v0, v1}, Li7/k;->b(Li7/k;I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Li7/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Li7/k$e;->k:Li7/k;

    iget v1, p0, Li7/k$e;->i:I

    iget v2, p0, Li7/k$e;->j:I

    invoke-virtual {v0, v1, v2}, Li7/k;->o(II)I

    move-result v0

    iput v0, p0, Li7/k$e;->i:I

    const/4 v0, -0x1

    iput v0, p0, Li7/k$e;->j:I

    return-void
.end method
