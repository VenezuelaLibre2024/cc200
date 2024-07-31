.class public final Lce/z;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lce/c2;)Lce/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lce/c2;",
            ")",
            "Lce/x<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lce/y;

    invoke-direct {v0, p0}, Lce/y;-><init>(Lce/c2;)V

    return-object v0
.end method

.method public static synthetic b(Lce/c2;ILjava/lang/Object;)Lce/x;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lce/z;->a(Lce/c2;)Lce/x;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lce/x;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lce/x<",
            "TT;>;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    invoke-static {p1}, Lgd/k;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, Lce/x;->n0(Ljava/lang/Object;)Z

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p0, v0}, Lce/x;->l0(Ljava/lang/Throwable;)Z

    move-result p0

    :goto_0
    return p0
.end method
