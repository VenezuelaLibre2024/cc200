.class public Lzd/g;
.super Lzd/f;
.source ""


# direct methods
.method public static final c(Ljava/util/Iterator;)Lzd/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator<",
            "+TT;>;)",
            "Lzd/b<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzd/g$a;

    invoke-direct {v0, p0}, Lzd/g$a;-><init>(Ljava/util/Iterator;)V

    invoke-static {v0}, Lzd/g;->d(Lzd/b;)Lzd/b;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lzd/b;)Lzd/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lzd/b<",
            "+TT;>;)",
            "Lzd/b<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lzd/a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lzd/a;

    invoke-direct {v0, p0}, Lzd/a;-><init>(Lzd/b;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
