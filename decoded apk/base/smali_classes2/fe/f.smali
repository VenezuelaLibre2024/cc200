.class public final synthetic Lfe/f;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lfe/c;Lfe/b;Ljd/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lfe/c<",
            "-TT;>;",
            "Lfe/b<",
            "+TT;>;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0}, Lfe/d;->e(Lfe/c;)V

    invoke-interface {p1, p0, p2}, Lfe/b;->a(Lfe/c;Ljd/d;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lgd/s;->a:Lgd/s;

    return-object p0
.end method
