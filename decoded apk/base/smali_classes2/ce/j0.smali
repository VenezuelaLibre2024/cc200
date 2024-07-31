.class public final Lce/j0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Ljd/g;Ljd/g;Z)Ljd/g;
    .locals 3

    invoke-static {p0}, Lce/j0;->c(Ljd/g;)Z

    move-result v0

    invoke-static {p1}, Lce/j0;->c(Ljd/g;)Z

    move-result v1

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    invoke-interface {p0, p1}, Ljd/g;->e0(Ljd/g;)Ljd/g;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ltd/w;

    invoke-direct {v0}, Ltd/w;-><init>()V

    iput-object p1, v0, Ltd/w;->h:Ljava/lang/Object;

    sget-object p1, Ljd/h;->h:Ljd/h;

    new-instance v2, Lce/j0$b;

    invoke-direct {v2, v0, p2}, Lce/j0$b;-><init>(Ltd/w;Z)V

    invoke-interface {p0, p1, v2}, Ljd/g;->z0(Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljd/g;

    if-eqz v1, :cond_1

    iget-object p2, v0, Ltd/w;->h:Ljava/lang/Object;

    check-cast p2, Ljd/g;

    sget-object v1, Lce/j0$a;->h:Lce/j0$a;

    invoke-interface {p2, p1, v1}, Ljd/g;->z0(Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Ltd/w;->h:Ljava/lang/Object;

    :cond_1
    iget-object p1, v0, Ltd/w;->h:Ljava/lang/Object;

    check-cast p1, Ljd/g;

    invoke-interface {p0, p1}, Ljd/g;->e0(Ljd/g;)Ljd/g;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljd/g;)Ljava/lang/String;
    .locals 4

    invoke-static {}, Lce/t0;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lce/n0;->j:Lce/n0$a;

    invoke-interface {p0, v0}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object v0

    check-cast v0, Lce/n0;

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    sget-object v1, Lce/o0;->j:Lce/o0$a;

    invoke-interface {p0, v1}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object p0

    check-cast p0, Lce/o0;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lce/o0;->H0()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    :cond_2
    const-string p0, "coroutine"

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x23

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lce/n0;->H0()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljd/g;)Z
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v1, Lce/j0$c;->h:Lce/j0$c;

    invoke-interface {p0, v0, v1}, Ljd/g;->z0(Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final d(Lce/p0;Ljd/g;)Ljd/g;
    .locals 2

    invoke-interface {p0}, Lce/p0;->b()Ljd/g;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lce/j0;->a(Ljd/g;Ljd/g;Z)Ljd/g;

    move-result-object p0

    invoke-static {}, Lce/t0;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lce/n0;

    invoke-static {}, Lce/t0;->b()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v0

    invoke-direct {p1, v0, v1}, Lce/n0;-><init>(J)V

    invoke-interface {p0, p1}, Ljd/g;->e0(Ljd/g;)Ljd/g;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    invoke-static {}, Lce/g1;->a()Lce/k0;

    move-result-object v0

    if-eq p0, v0, :cond_1

    sget-object v0, Ljd/e;->e:Ljd/e$b;

    invoke-interface {p0, v0}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object p0

    if-nez p0, :cond_1

    invoke-static {}, Lce/g1;->a()Lce/k0;

    move-result-object p0

    invoke-interface {p1, p0}, Ljd/g;->e0(Ljd/g;)Ljd/g;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public static final e(Ljd/g;Ljd/g;)Ljd/g;
    .locals 1

    invoke-static {p1}, Lce/j0;->c(Ljd/g;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, Ljd/g;->e0(Ljd/g;)Ljd/g;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lce/j0;->a(Ljd/g;Ljd/g;Z)Ljd/g;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lld/e;)Lce/h3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lld/e;",
            ")",
            "Lce/h3<",
            "*>;"
        }
    .end annotation

    :cond_0
    instance-of v0, p0, Lce/c1;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    invoke-interface {p0}, Lld/e;->getCallerFrame()Lld/e;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v1

    :cond_2
    instance-of v0, p0, Lce/h3;

    if-eqz v0, :cond_0

    check-cast p0, Lce/h3;

    return-object p0
.end method

.method public static final g(Ljd/d;Ljd/g;Ljava/lang/Object;)Lce/h3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "*>;",
            "Ljd/g;",
            "Ljava/lang/Object;",
            ")",
            "Lce/h3<",
            "*>;"
        }
    .end annotation

    instance-of v0, p0, Lld/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lce/i3;->h:Lce/i3;

    invoke-interface {p1, v0}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    return-object v1

    :cond_2
    check-cast p0, Lld/e;

    invoke-static {p0}, Lce/j0;->f(Lld/e;)Lce/h3;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0, p1, p2}, Lce/h3;->T0(Ljd/g;Ljava/lang/Object;)V

    :cond_3
    return-object p0
.end method
