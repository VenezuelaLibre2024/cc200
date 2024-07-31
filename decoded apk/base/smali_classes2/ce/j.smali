.class public final synthetic Lce/j;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Ljd/g;Lsd/p;)Ljava/lang/Object;
    .locals 4
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
            ">;)TT;"
        }
    .end annotation

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    sget-object v1, Ljd/e;->e:Ljd/e$b;

    invoke-interface {p0, v1}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object v1

    check-cast v1, Ljd/e;

    if-nez v1, :cond_0

    sget-object v1, Lce/y2;->a:Lce/y2;

    invoke-virtual {v1}, Lce/y2;->b()Lce/m1;

    move-result-object v1

    sget-object v2, Lce/v1;->h:Lce/v1;

    invoke-interface {p0, v1}, Ljd/g;->e0(Ljd/g;)Ljd/g;

    move-result-object p0

    :goto_0
    invoke-static {v2, p0}, Lce/j0;->d(Lce/p0;Ljd/g;)Ljd/g;

    move-result-object p0

    goto :goto_4

    :cond_0
    instance-of v2, v1, Lce/m1;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast v1, Lce/m1;

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lce/m1;->V0()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v3, v1

    :cond_2
    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    move-object v1, v3

    goto :goto_3

    :cond_4
    :goto_2
    sget-object v1, Lce/y2;->a:Lce/y2;

    invoke-virtual {v1}, Lce/y2;->a()Lce/m1;

    move-result-object v1

    :goto_3
    sget-object v2, Lce/v1;->h:Lce/v1;

    goto :goto_0

    :goto_4
    new-instance v2, Lce/g;

    invoke-direct {v2, p0, v0, v1}, Lce/g;-><init>(Ljd/g;Ljava/lang/Thread;Lce/m1;)V

    sget-object p0, Lce/r0;->h:Lce/r0;

    invoke-virtual {v2, p0, v2, p1}, Lce/a;->R0(Lce/r0;Ljava/lang/Object;Lsd/p;)V

    invoke-virtual {v2}, Lce/g;->S0()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljd/g;Lsd/p;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p0, Ljd/h;->h:Ljd/h;

    :cond_0
    invoke-static {p0, p1}, Lce/i;->e(Ljd/g;Lsd/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
