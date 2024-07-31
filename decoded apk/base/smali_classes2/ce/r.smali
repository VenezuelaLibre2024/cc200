.class public final Lce/r;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lce/n;Lce/i1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/n<",
            "*>;",
            "Lce/i1;",
            ")V"
        }
    .end annotation

    new-instance v0, Lce/j1;

    invoke-direct {v0, p1}, Lce/j1;-><init>(Lce/i1;)V

    invoke-interface {p0, v0}, Lce/n;->c(Lsd/l;)V

    return-void
.end method

.method public static final b(Ljd/d;)Lce/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljd/d<",
            "-TT;>;)",
            "Lce/p<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lhe/l;

    if-nez v0, :cond_0

    new-instance v0, Lce/p;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lce/p;-><init>(Ljd/d;I)V

    return-object v0

    :cond_0
    move-object v0, p0

    check-cast v0, Lhe/l;

    invoke-virtual {v0}, Lhe/l;->p()Lce/p;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lce/p;->K()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    new-instance v0, Lce/p;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lce/p;-><init>(Ljd/d;I)V

    return-object v0
.end method
