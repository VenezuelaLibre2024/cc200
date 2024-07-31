.class public final synthetic Lfe/j;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lfe/b;Ljd/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lfe/b<",
            "+TT;>;",
            "Ljd/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lfe/j$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lfe/j$b;

    iget v1, v0, Lfe/j$b;->k:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfe/j$b;->k:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfe/j$b;

    invoke-direct {v0, p1}, Lfe/j$b;-><init>(Ljd/d;)V

    :goto_0
    iget-object p1, v0, Lfe/j$b;->j:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lfe/j$b;->k:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lfe/j$b;->i:Ljava/lang/Object;

    check-cast p0, Lfe/j$a;

    iget-object v0, v0, Lfe/j$b;->h:Ljava/lang/Object;

    check-cast v0, Ltd/w;

    :try_start_0
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lge/a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    new-instance p1, Ltd/w;

    invoke-direct {p1}, Ltd/w;-><init>()V

    sget-object v2, Lge/h;->a:Lhe/l0;

    iput-object v2, p1, Ltd/w;->h:Ljava/lang/Object;

    new-instance v2, Lfe/j$a;

    invoke-direct {v2, p1}, Lfe/j$a;-><init>(Ltd/w;)V

    :try_start_1
    iput-object p1, v0, Lfe/j$b;->h:Ljava/lang/Object;

    iput-object v2, v0, Lfe/j$b;->i:Ljava/lang/Object;

    iput v3, v0, Lfe/j$b;->k:I

    invoke-interface {p0, v2, v0}, Lfe/b;->a(Lfe/c;Ljd/d;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Lge/a; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v0, p1

    move-object p1, p0

    move-object p0, v2

    :goto_1
    invoke-static {p1, p0}, Lge/f;->a(Lge/a;Lfe/c;)V

    :goto_2
    iget-object p0, v0, Ltd/w;->h:Ljava/lang/Object;

    sget-object p1, Lge/h;->a:Lhe/l0;

    if-eq p0, p1, :cond_4

    return-object p0

    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Expected at least one element"

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
