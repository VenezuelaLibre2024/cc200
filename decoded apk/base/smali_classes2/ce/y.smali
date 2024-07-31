.class public final Lce/y;
.super Lce/j2;
.source ""

# interfaces
.implements Lce/x;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lce/j2;",
        "Lce/x<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lce/c2;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lce/j2;-><init>(Z)V

    invoke-virtual {p0, p1}, Lce/j2;->X(Lce/c2;)V

    return-void
.end method


# virtual methods
.method public Q()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f0(Ljd/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lce/j2;->s(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    return-object p1
.end method

.method public j()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lce/j2;->L()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public l0(Ljava/lang/Throwable;)Z
    .locals 4

    new-instance v0, Lce/c0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p1, v1, v2, v3}, Lce/c0;-><init>(Ljava/lang/Throwable;ZILtd/g;)V

    invoke-virtual {p0, v0}, Lce/j2;->i0(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public n0(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lce/j2;->i0(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
