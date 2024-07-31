.class public Lgd/h;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lsd/a;)Lgd/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lsd/a<",
            "+TT;>;)",
            "Lgd/g<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "initializer"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lgd/m;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, Lgd/m;-><init>(Lsd/a;Ljava/lang/Object;ILtd/g;)V

    return-object v0
.end method
