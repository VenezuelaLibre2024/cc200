.class public final synthetic Lce/k;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lce/p0;Ljd/g;Lce/r0;Lsd/p;)Lce/x0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lce/p0;",
            "Ljd/g;",
            "Lce/r0;",
            "Lsd/p<",
            "-",
            "Lce/p0;",
            "-",
            "Ljd/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lce/x0<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lce/j0;->d(Lce/p0;Ljd/g;)Ljd/g;

    move-result-object p0

    invoke-virtual {p2}, Lce/r0;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lce/l2;

    invoke-direct {p1, p0, p3}, Lce/l2;-><init>(Ljd/g;Lsd/p;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lce/y0;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lce/y0;-><init>(Ljd/g;Z)V

    :goto_0
    invoke-virtual {p1, p2, p1, p3}, Lce/a;->R0(Lce/r0;Ljava/lang/Object;Lsd/p;)V

    return-object p1
.end method

.method public static synthetic b(Lce/p0;Ljd/g;Lce/r0;Lsd/p;ILjava/lang/Object;)Lce/x0;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Ljd/h;->h:Ljd/h;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    sget-object p2, Lce/r0;->h:Lce/r0;

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lce/i;->a(Lce/p0;Ljd/g;Lce/r0;Lsd/p;)Lce/x0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lce/p0;Ljd/g;Lce/r0;Lsd/p;)Lce/c2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/p0;",
            "Ljd/g;",
            "Lce/r0;",
            "Lsd/p<",
            "-",
            "Lce/p0;",
            "-",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lce/c2;"
        }
    .end annotation

    invoke-static {p0, p1}, Lce/j0;->d(Lce/p0;Ljd/g;)Ljd/g;

    move-result-object p0

    invoke-virtual {p2}, Lce/r0;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lce/m2;

    invoke-direct {p1, p0, p3}, Lce/m2;-><init>(Ljd/g;Lsd/p;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lce/u2;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lce/u2;-><init>(Ljd/g;Z)V

    :goto_0
    invoke-virtual {p1, p2, p1, p3}, Lce/a;->R0(Lce/r0;Ljava/lang/Object;Lsd/p;)V

    return-object p1
.end method

.method public static synthetic d(Lce/p0;Ljd/g;Lce/r0;Lsd/p;ILjava/lang/Object;)Lce/c2;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Ljd/h;->h:Ljd/h;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    sget-object p2, Lce/r0;->h:Lce/r0;

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lce/i;->c(Lce/p0;Ljd/g;Lce/r0;Lsd/p;)Lce/c2;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljd/g;Lsd/p;Ljd/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljd/g;",
            "Lsd/p<",
            "-",
            "Lce/p0;",
            "-",
            "Ljd/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Ljd/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p2}, Ljd/d;->getContext()Ljd/g;

    move-result-object v0

    invoke-static {v0, p0}, Lce/j0;->e(Ljd/g;Ljd/g;)Ljd/g;

    move-result-object p0

    invoke-static {p0}, Lce/g2;->i(Ljd/g;)V

    if-ne p0, v0, :cond_0

    new-instance v0, Lhe/h0;

    invoke-direct {v0, p0, p2}, Lhe/h0;-><init>(Ljd/g;Ljd/d;)V

    invoke-static {v0, v0, p1}, Lie/b;->b(Lhe/h0;Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object v1, Ljd/e;->e:Ljd/e$b;

    invoke-interface {p0, v1}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object v2

    invoke-interface {v0, v1}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object v0

    invoke-static {v2, v0}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lce/h3;

    invoke-direct {v0, p0, p2}, Lce/h3;-><init>(Ljd/g;Ljd/d;)V

    invoke-virtual {v0}, Lce/a;->getContext()Ljd/g;

    move-result-object p0

    const/4 v1, 0x0

    invoke-static {p0, v1}, Lhe/p0;->c(Ljd/g;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :try_start_0
    invoke-static {v0, v0, p1}, Lie/b;->b(Lhe/h0;Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p0, v1}, Lhe/p0;->a(Ljd/g;Ljava/lang/Object;)V

    move-object p0, p1

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p0, v1}, Lhe/p0;->a(Ljd/g;Ljava/lang/Object;)V

    throw p1

    :cond_1
    new-instance v0, Lce/c1;

    invoke-direct {v0, p0, p2}, Lce/c1;-><init>(Ljd/g;Ljd/d;)V

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, p1

    move-object v3, v0

    move-object v4, v0

    invoke-static/range {v2 .. v7}, Lie/a;->d(Lsd/p;Ljava/lang/Object;Ljd/d;Lsd/l;ILjava/lang/Object;)V

    invoke-virtual {v0}, Lce/c1;->S0()Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    invoke-static {p2}, Lld/h;->c(Ljd/d;)V

    :cond_2
    return-object p0
.end method
