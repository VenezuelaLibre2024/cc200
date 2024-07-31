.class public Lzd/e;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lsd/p;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lsd/p<",
            "-",
            "Lzd/d<",
            "-TT;>;-",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzd/c;

    invoke-direct {v0}, Lzd/c;-><init>()V

    invoke-static {p0, v0, v0}, Lkd/b;->a(Lsd/p;Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p0

    invoke-virtual {v0, p0}, Lzd/c;->j(Ljd/d;)V

    return-object v0
.end method

.method public static final b(Lsd/p;)Lzd/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lsd/p<",
            "-",
            "Lzd/d<",
            "-TT;>;-",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzd/b<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzd/e$a;

    invoke-direct {v0, p0}, Lzd/e$a;-><init>(Lsd/p;)V

    return-object v0
.end method
