.class public final Lu0/g;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lr0/f;Lsd/p;Ljd/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/f<",
            "Lu0/d;",
            ">;",
            "Lsd/p<",
            "-",
            "Lu0/a;",
            "-",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Ljd/d<",
            "-",
            "Lu0/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lu0/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lu0/g$a;-><init>(Lsd/p;Ljd/d;)V

    invoke-interface {p0, v0, p2}, Lr0/f;->a(Lsd/p;Ljd/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
