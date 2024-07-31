.class public final Lce/g0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljd/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p0, Lce/c0;

    if-eqz v0, :cond_2

    sget-object v0, Lgd/k;->i:Lgd/k$a;

    check-cast p0, Lce/c0;

    iget-object p0, p0, Lce/c0;->a:Ljava/lang/Throwable;

    invoke-static {}, Lce/t0;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p1, Lld/e;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lld/e;

    invoke-static {p0, p1}, Lhe/k0;->a(Ljava/lang/Throwable;Lld/e;)Ljava/lang/Throwable;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-static {p0}, Lgd/l;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_1

    :cond_2
    sget-object p1, Lgd/k;->i:Lgd/k$a;

    :goto_1
    invoke-static {p0}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/Object;Lce/n;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lce/n<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0}, Lgd/k;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance p0, Lce/c0;

    invoke-static {}, Lce/t0;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    instance-of v1, p1, Lld/e;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lld/e;

    invoke-static {v0, p1}, Lhe/k0;->a(Ljava/lang/Throwable;Lld/e;)Ljava/lang/Throwable;

    move-result-object v0

    :cond_2
    :goto_0
    const/4 p1, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lce/c0;-><init>(Ljava/lang/Throwable;ZILtd/g;)V

    :goto_1
    return-object p0
.end method

.method public static final c(Ljava/lang/Object;Lsd/l;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0}, Lgd/k;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_1

    new-instance v0, Lce/d0;

    invoke-direct {v0, p0, p1}, Lce/d0;-><init>(Ljava/lang/Object;Lsd/l;)V

    move-object p0, v0

    goto :goto_0

    :cond_0
    new-instance p0, Lce/c0;

    const/4 p1, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lce/c0;-><init>(Ljava/lang/Throwable;ZILtd/g;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;Lsd/l;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lce/g0;->c(Ljava/lang/Object;Lsd/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
