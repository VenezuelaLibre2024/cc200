.class public final Lce/f;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a([Lce/x0;Ljd/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Lce/x0<",
            "+TT;>;",
            "Ljd/d<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    array-length v0, p0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {}, Lhd/n;->e()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Lce/e;

    invoke-direct {v0, p0}, Lce/e;-><init>([Lce/x0;)V

    invoke-virtual {v0, p1}, Lce/e;->c(Ljd/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/util/Collection;Ljd/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lce/c2;",
            ">;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lce/f$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lce/f$a;

    iget v1, v0, Lce/f$a;->j:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lce/f$a;->j:I

    goto :goto_0

    :cond_0
    new-instance v0, Lce/f$a;

    invoke-direct {v0, p1}, Lce/f$a;-><init>(Ljd/d;)V

    :goto_0
    iget-object p1, v0, Lce/f$a;->i:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lce/f$a;->j:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lce/f$a;->h:Ljava/lang/Object;

    check-cast p0, Ljava/util/Iterator;

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lce/c2;

    iput-object p0, v0, Lce/f$a;->h:Ljava/lang/Object;

    iput v3, v0, Lce/f$a;->j:I

    invoke-interface {p1, v0}, Lce/c2;->P(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_4
    sget-object p0, Lgd/s;->a:Lgd/s;

    return-object p0
.end method
