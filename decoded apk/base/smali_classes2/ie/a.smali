.class public final Lie/a;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Ljd/d;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    sget-object v0, Lgd/k;->i:Lgd/k$a;

    invoke-static {p1}, Lgd/l;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v0}, Ljd/d;->resumeWith(Ljava/lang/Object;)V

    throw p1
.end method

.method public static final b(Ljd/d;Ljd/d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;",
            "Ljd/d<",
            "*>;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0}, Lkd/b;->b(Ljd/d;)Ljd/d;

    move-result-object p0

    sget-object v0, Lgd/k;->i:Lgd/k$a;

    sget-object v0, Lgd/s;->a:Lgd/s;

    invoke-static {v0}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v0, v2, v1, v2}, Lhe/m;->c(Ljd/d;Ljava/lang/Object;Lsd/l;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p1, p0}, Lie/a;->a(Ljd/d;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static final c(Lsd/p;Ljava/lang/Object;Ljd/d;Lsd/l;)V
    .locals 0
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
            "-TT;>;",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0, p1, p2}, Lkd/b;->a(Lsd/p;Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p0

    invoke-static {p0}, Lkd/b;->b(Ljd/d;)Ljd/d;

    move-result-object p0

    sget-object p1, Lgd/k;->i:Lgd/k$a;

    sget-object p1, Lgd/s;->a:Lgd/s;

    invoke-static {p1}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1, p3}, Lhe/m;->b(Ljd/d;Ljava/lang/Object;Lsd/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p2, p0}, Lie/a;->a(Ljd/d;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static synthetic d(Lsd/p;Ljava/lang/Object;Ljd/d;Lsd/l;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lie/a;->c(Lsd/p;Ljava/lang/Object;Ljd/d;Lsd/l;)V

    return-void
.end method
