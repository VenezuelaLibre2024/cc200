.class public final synthetic Lce/h2;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lce/c2;)Lce/a0;
    .locals 1

    new-instance v0, Lce/f2;

    invoke-direct {v0, p0}, Lce/f2;-><init>(Lce/c2;)V

    return-object v0
.end method

.method public static synthetic b(Lce/c2;ILjava/lang/Object;)Lce/a0;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lce/g2;->a(Lce/c2;)Lce/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljd/g;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    sget-object v0, Lce/c2;->c:Lce/c2$b;

    invoke-interface {p0, v0}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object p0

    check-cast p0, Lce/c2;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lce/c2;->y0(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public static synthetic d(Ljd/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lce/g2;->c(Ljd/g;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final e(Ljd/g;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    sget-object v0, Lce/c2;->c:Lce/c2$b;

    invoke-interface {p0, v0}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object p0

    check-cast p0, Lce/c2;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lce/c2;->w()Lzd/b;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lzd/b;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lce/c2;

    invoke-interface {v0, p1}, Lce/c2;->y0(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic f(Ljd/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lce/g2;->e(Ljd/g;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final g(Lce/c2;Lce/i1;)Lce/i1;
    .locals 1

    new-instance v0, Lce/k1;

    invoke-direct {v0, p1}, Lce/k1;-><init>(Lce/i1;)V

    invoke-interface {p0, v0}, Lce/c2;->x0(Lsd/l;)Lce/i1;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lce/c2;)V
    .locals 1

    invoke-interface {p0}, Lce/c2;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, Lce/c2;->K()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    throw p0
.end method

.method public static final i(Ljd/g;)V
    .locals 1

    sget-object v0, Lce/c2;->c:Lce/c2$b;

    invoke-interface {p0, v0}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object p0

    check-cast p0, Lce/c2;

    if-eqz p0, :cond_0

    invoke-static {p0}, Lce/g2;->h(Lce/c2;)V

    :cond_0
    return-void
.end method

.method public static final j(Ljd/g;)Lce/c2;
    .locals 3

    sget-object v0, Lce/c2;->c:Lce/c2$b;

    invoke-interface {p0, v0}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object v0

    check-cast v0, Lce/c2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Current context doesn\'t contain Job in it: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
