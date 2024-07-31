.class public final Lce/f3;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(JLce/z0;Lce/c2;)Lce/d3;
    .locals 2

    instance-of v0, p2, Lce/b1;

    if-eqz v0, :cond_0

    check-cast p2, Lce/b1;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    sget-object v0, Lbe/a;->i:Lbe/a$a;

    sget-object v0, Lbe/d;->k:Lbe/d;

    invoke-static {p0, p1, v0}, Lbe/c;->i(JLbe/d;)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Lce/b1;->u0(J)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_2

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Timed out waiting for "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " ms"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_2
    new-instance p0, Lce/d3;

    invoke-direct {p0, p2, p3}, Lce/d3;-><init>(Ljava/lang/String;Lce/c2;)V

    return-object p0
.end method

.method public static final b(Lce/e3;Lsd/p;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            "T::TU;>(",
            "Lce/e3<",
            "TU;-TT;>;",
            "Lsd/p<",
            "-",
            "Lce/p0;",
            "-",
            "Ljd/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lhe/h0;->k:Ljd/d;

    invoke-interface {v0}, Ljd/d;->getContext()Ljd/g;

    move-result-object v0

    invoke-static {v0}, Lce/a1;->a(Ljd/g;)Lce/z0;

    move-result-object v0

    iget-wide v1, p0, Lce/e3;->l:J

    invoke-virtual {p0}, Lce/a;->getContext()Ljd/g;

    move-result-object v3

    invoke-interface {v0, v1, v2, p0, v3}, Lce/z0;->G0(JLjava/lang/Runnable;Ljd/g;)Lce/i1;

    move-result-object v0

    invoke-static {p0, v0}, Lce/g2;->g(Lce/c2;Lce/i1;)Lce/i1;

    invoke-static {p0, p0, p1}, Lie/b;->c(Lhe/h0;Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(JLsd/p;Ljd/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J",
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

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-lez v0, :cond_1

    new-instance v0, Lce/e3;

    invoke-direct {v0, p0, p1, p3}, Lce/e3;-><init>(JLjd/d;)V

    invoke-static {v0, p2}, Lce/f3;->b(Lce/e3;Lsd/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p3}, Lld/h;->c(Ljd/d;)V

    :cond_0
    return-object p0

    :cond_1
    new-instance p0, Lce/d3;

    const-string p1, "Timed out immediately"

    invoke-direct {p0, p1}, Lce/d3;-><init>(Ljava/lang/String;)V

    throw p0
.end method
