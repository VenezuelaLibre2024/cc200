.class public final Lu/f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
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
.field public final h:I

.field public i:I

.field public j:I

.field public k:Z

.field public final synthetic l:Lu/f;


# direct methods
.method public constructor <init>(Lu/f;I)V
    .locals 1

    iput-object p1, p0, Lu/f$a;->l:Lu/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu/f$a;->k:Z

    iput p2, p0, Lu/f$a;->h:I

    invoke-virtual {p1}, Lu/f;->d()I

    move-result p1

    iput p1, p0, Lu/f$a;->i:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    iget v0, p0, Lu/f$a;->j:I

    iget v1, p0, Lu/f$a;->i:I

    if-ge v0, v1, :cond_0

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

    invoke-virtual {p0}, Lu/f$a;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu/f$a;->l:Lu/f;

    iget v1, p0, Lu/f$a;->j:I

    iget v2, p0, Lu/f$a;->h:I

    invoke-virtual {v0, v1, v2}, Lu/f;->b(II)Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lu/f$a;->j:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lu/f$a;->j:I

    iput-boolean v2, p0, Lu/f$a;->k:Z

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 2

    iget-boolean v0, p0, Lu/f$a;->k:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lu/f$a;->j:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lu/f$a;->j:I

    iget v1, p0, Lu/f$a;->i:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lu/f$a;->i:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Lu/f$a;->k:Z

    iget-object v1, p0, Lu/f$a;->l:Lu/f;

    invoke-virtual {v1, v0}, Lu/f;->h(I)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
