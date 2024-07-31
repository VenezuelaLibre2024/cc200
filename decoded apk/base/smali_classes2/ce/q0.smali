.class public final Lce/q0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Ljd/g;)Lce/p0;
    .locals 3

    new-instance v0, Lhe/g;

    sget-object v1, Lce/c2;->c:Lce/c2$b;

    invoke-interface {p0, v1}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v1, v2}, Lce/g2;->b(Lce/c2;ILjava/lang/Object;)Lce/a0;

    move-result-object v1

    invoke-interface {p0, v1}, Ljd/g;->e0(Ljd/g;)Ljd/g;

    move-result-object p0

    :goto_0
    invoke-direct {v0, p0}, Lhe/g;-><init>(Ljd/g;)V

    return-object v0
.end method

.method public static final b()Lce/p0;
    .locals 3

    new-instance v0, Lhe/g;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, Lce/w2;->b(Lce/c2;ILjava/lang/Object;)Lce/a0;

    move-result-object v1

    invoke-static {}, Lce/g1;->c()Lce/n2;

    move-result-object v2

    invoke-interface {v1, v2}, Ljd/g;->e0(Ljd/g;)Ljd/g;

    move-result-object v1

    invoke-direct {v0, v1}, Lhe/g;-><init>(Ljd/g;)V

    return-object v0
.end method

.method public static final c(Lsd/p;Ljd/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lsd/p<",
            "-",
            "Lce/p0;",
            "-",
            "Ljd/d<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Ljd/d<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lhe/h0;

    invoke-interface {p1}, Ljd/d;->getContext()Ljd/g;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lhe/h0;-><init>(Ljd/g;Ljd/d;)V

    invoke-static {v0, v0, p0}, Lie/b;->b(Lhe/h0;Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lld/h;->c(Ljd/d;)V

    :cond_0
    return-object p0
.end method

.method public static final d(Lce/p0;)V
    .locals 0

    invoke-interface {p0}, Lce/p0;->b()Ljd/g;

    move-result-object p0

    invoke-static {p0}, Lce/g2;->i(Ljd/g;)V

    return-void
.end method

.method public static final e(Lce/p0;)Z
    .locals 1

    invoke-interface {p0}, Lce/p0;->b()Ljd/g;

    move-result-object p0

    sget-object v0, Lce/c2;->c:Lce/c2$b;

    invoke-interface {p0, v0}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object p0

    check-cast p0, Lce/c2;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lce/c2;->a()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method
