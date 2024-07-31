.class public Lkd/b;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lsd/p;Ljava/lang/Object;Ljd/d;)Ljd/d;
    .locals 2
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
            "-TT;>;)",
            "Ljd/d<",
            "Lgd/s;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lld/h;->a(Ljd/d;)Ljd/d;

    move-result-object p2

    instance-of v0, p0, Lld/a;

    if-eqz v0, :cond_0

    check-cast p0, Lld/a;

    invoke-virtual {p0, p1, p2}, Lld/a;->create(Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljd/d;->getContext()Ljd/g;

    move-result-object v0

    sget-object v1, Ljd/h;->h:Ljd/h;

    if-ne v0, v1, :cond_1

    new-instance v0, Lkd/b$a;

    invoke-direct {v0, p2, p0, p1}, Lkd/b$a;-><init>(Ljd/d;Lsd/p;Ljava/lang/Object;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    new-instance v1, Lkd/b$b;

    invoke-direct {v1, p2, v0, p0, p1}, Lkd/b$b;-><init>(Ljd/d;Ljd/g;Lsd/p;Ljava/lang/Object;)V

    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method public static final b(Ljd/d;)Ljd/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljd/d<",
            "-TT;>;)",
            "Ljd/d<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lld/d;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lld/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lld/d;->intercepted()Ljd/d;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    return-object p0
.end method
