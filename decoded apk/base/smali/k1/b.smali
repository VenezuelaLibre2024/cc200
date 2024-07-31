.class public final Lk1/b;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static synthetic a(Lce/x0;Ljava/lang/Object;Lv/b$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lk1/b;->d(Lce/x0;Ljava/lang/Object;Lv/b$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lce/x0;Ljava/lang/Object;)Ll7/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lce/x0<",
            "+TT;>;",
            "Ljava/lang/Object;",
            ")",
            "Ll7/f<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk1/a;

    invoke-direct {v0, p0, p1}, Lk1/a;-><init>(Lce/x0;Ljava/lang/Object;)V

    invoke-static {v0}, Lv/b;->a(Lv/b$c;)Ll7/f;

    move-result-object p0

    const-string p1, "getFuture { completer ->\u2026        }\n    }\n    tag\n}"

    invoke-static {p0, p1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic c(Lce/x0;Ljava/lang/Object;ILjava/lang/Object;)Ll7/f;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p1, "Deferred.asListenableFuture"

    :cond_0
    invoke-static {p0, p1}, Lk1/b;->b(Lce/x0;Ljava/lang/Object;)Ll7/f;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lce/x0;Ljava/lang/Object;Lv/b$a;)Ljava/lang/Object;
    .locals 1

    const-string v0, "$this_asListenableFuture"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completer"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk1/b$a;

    invoke-direct {v0, p2, p0}, Lk1/b$a;-><init>(Lv/b$a;Lce/x0;)V

    invoke-interface {p0, v0}, Lce/c2;->x0(Lsd/l;)Lce/i1;

    return-object p1
.end method
