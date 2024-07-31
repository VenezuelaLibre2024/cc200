.class public final Ljd/f;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lsd/p;Ljava/lang/Object;Ljd/d;)V
    .locals 1
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
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lkd/b;->a(Lsd/p;Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p0

    invoke-static {p0}, Lkd/b;->b(Ljd/d;)Ljd/d;

    move-result-object p0

    sget-object p1, Lgd/k;->i:Lgd/k$a;

    sget-object p1, Lgd/s;->a:Lgd/s;

    invoke-static {p1}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Ljd/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
