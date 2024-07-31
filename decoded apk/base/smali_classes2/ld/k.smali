.class public abstract Lld/k;
.super Lld/j;
.source ""

# interfaces
.implements Ltd/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld/j;",
        "Ltd/i<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final h:I


# direct methods
.method public constructor <init>(ILjd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljd/d<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p2}, Lld/j;-><init>(Ljd/d;)V

    iput p1, p0, Lld/k;->h:I

    return-void
.end method


# virtual methods
.method public getArity()I
    .locals 1

    iget v0, p0, Lld/k;->h:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lld/a;->getCompletion()Ljd/d;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Ltd/x;->f(Ltd/i;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "renderLambdaToString(this)"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lld/a;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
