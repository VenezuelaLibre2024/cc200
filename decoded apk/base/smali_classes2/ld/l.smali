.class public abstract Lld/l;
.super Lld/d;
.source ""

# interfaces
.implements Ltd/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld/d;",
        "Ltd/i<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private final arity:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lld/l;-><init>(ILjd/d;)V

    return-void
.end method

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

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    iput p1, p0, Lld/l;->arity:I

    return-void
.end method


# virtual methods
.method public getArity()I
    .locals 1

    iget v0, p0, Lld/l;->arity:I

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
