.class public final Lie/b;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lsd/p;Ljava/lang/Object;Ljd/d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lsd/p<",
            "-TR;-",
            "Ljd/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Ljd/d<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-static {p2}, Lld/h;->a(Ljd/d;)Ljd/d;

    move-result-object v0

    :try_start_0
    invoke-interface {p2}, Ljd/d;->getContext()Ljd/g;

    move-result-object p2

    const/4 v1, 0x0

    invoke-static {p2, v1}, Lhe/p0;->c(Ljd/g;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x2

    :try_start_1
    invoke-static {p0, v2}, Ltd/a0;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsd/p;

    invoke-interface {p0, p1, v0}, Lsd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {p2, v1}, Lhe/p0;->a(Ljd/g;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p1

    if-eq p0, p1, :cond_0

    sget-object p1, Lgd/k;->i:Lgd/k$a;

    goto :goto_0

    :catchall_0
    move-exception p0

    :try_start_3
    invoke-static {p2, v1}, Lhe/p0;->a(Ljd/g;Ljava/lang/Object;)V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p0

    sget-object p1, Lgd/k;->i:Lgd/k$a;

    invoke-static {p0}, Lgd/l;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v0, p0}, Ljd/d;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static final b(Lhe/h0;Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lhe/h0<",
            "-TT;>;TR;",
            "Lsd/p<",
            "-TR;-",
            "Ljd/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x2

    :try_start_0
    invoke-static {p2, v0}, Ltd/a0;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lsd/p;

    invoke-interface {p2, p1, p0}, Lsd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-instance p2, Lce/c0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p2, p1, v1, v0, v2}, Lce/c0;-><init>(Ljava/lang/Throwable;ZILtd/g;)V

    move-object p1, p2

    :goto_0
    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    :goto_1
    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p0

    goto :goto_3

    :cond_0
    invoke-virtual {p0, p1}, Lce/j2;->j0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lce/k2;->b:Lhe/l0;

    if-ne p1, p2, :cond_1

    goto :goto_1

    :cond_1
    instance-of p2, p1, Lce/c0;

    if-eqz p2, :cond_4

    check-cast p1, Lce/c0;

    iget-object p1, p1, Lce/c0;->a:Ljava/lang/Throwable;

    iget-object p0, p0, Lhe/h0;->k:Ljd/d;

    invoke-static {}, Lce/t0;->d()Z

    move-result p2

    if-eqz p2, :cond_3

    instance-of p2, p0, Lld/e;

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    check-cast p0, Lld/e;

    invoke-static {p1, p0}, Lhe/k0;->a(Ljava/lang/Throwable;Lld/e;)Ljava/lang/Throwable;

    move-result-object p1

    :cond_3
    :goto_2
    throw p1

    :cond_4
    invoke-static {p1}, Lce/k2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_3
    return-object p0
.end method

.method public static final c(Lhe/h0;Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lhe/h0<",
            "-TT;>;TR;",
            "Lsd/p<",
            "-TR;-",
            "Ljd/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x2

    :try_start_0
    invoke-static {p2, v1}, Ltd/a0;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lsd/p;

    invoke-interface {p2, p1, p0}, Lsd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-instance p2, Lce/c0;

    const/4 v2, 0x0

    invoke-direct {p2, p1, v0, v1, v2}, Lce/c0;-><init>(Ljava/lang/Throwable;ZILtd/g;)V

    move-object p1, p2

    :goto_0
    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    :goto_1
    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p0

    goto :goto_4

    :cond_0
    invoke-virtual {p0, p1}, Lce/j2;->j0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    sget-object v1, Lce/k2;->b:Lhe/l0;

    if-ne p2, v1, :cond_1

    goto :goto_1

    :cond_1
    instance-of v1, p2, Lce/c0;

    if-eqz v1, :cond_9

    check-cast p2, Lce/c0;

    iget-object p2, p2, Lce/c0;->a:Ljava/lang/Throwable;

    instance-of v1, p2, Lce/d3;

    if-eqz v1, :cond_2

    move-object v1, p2

    check-cast v1, Lce/d3;

    iget-object v1, v1, Lce/d3;->h:Lce/c2;

    if-eq v1, p0, :cond_3

    :cond_2
    const/4 v0, 0x1

    :cond_3
    if-eqz v0, :cond_6

    iget-object p0, p0, Lhe/h0;->k:Ljd/d;

    invoke-static {}, Lce/t0;->d()Z

    move-result p1

    if-eqz p1, :cond_5

    instance-of p1, p0, Lld/e;

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    check-cast p0, Lld/e;

    invoke-static {p2, p0}, Lhe/k0;->a(Ljava/lang/Throwable;Lld/e;)Ljava/lang/Throwable;

    move-result-object p2

    :cond_5
    :goto_2
    throw p2

    :cond_6
    instance-of p2, p1, Lce/c0;

    if-eqz p2, :cond_a

    check-cast p1, Lce/c0;

    iget-object p1, p1, Lce/c0;->a:Ljava/lang/Throwable;

    iget-object p0, p0, Lhe/h0;->k:Ljd/d;

    invoke-static {}, Lce/t0;->d()Z

    move-result p2

    if-eqz p2, :cond_8

    instance-of p2, p0, Lld/e;

    if-nez p2, :cond_7

    goto :goto_3

    :cond_7
    check-cast p0, Lld/e;

    invoke-static {p1, p0}, Lhe/k0;->a(Ljava/lang/Throwable;Lld/e;)Ljava/lang/Throwable;

    move-result-object p1

    :cond_8
    :goto_3
    throw p1

    :cond_9
    invoke-static {p2}, Lce/k2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :cond_a
    move-object p0, p1

    :goto_4
    return-object p0
.end method
