.class public final Lce/c2$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lce/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(Lce/c2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p0, p1}, Lce/c2;->y0(Ljava/util/concurrent/CancellationException;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: cancel"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lce/c2;Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lce/c2;",
            "TR;",
            "Lsd/p<",
            "-TR;-",
            "Ljd/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Ljd/g$b$a;->a(Ljd/g$b;Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lce/c2;Ljd/g$c;)Ljd/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Ljd/g$b;",
            ">(",
            "Lce/c2;",
            "Ljd/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljd/g$b$a;->b(Ljd/g$b;Ljd/g$c;)Ljd/g$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lce/c2;ZZLsd/l;ILjava/lang/Object;)Lce/i1;
    .locals 0

    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x1

    :cond_1
    invoke-interface {p0, p1, p2, p3}, Lce/c2;->l(ZZLsd/l;)Lce/i1;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: invokeOnCompletion"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Lce/c2;Ljd/g$c;)Ljd/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/c2;",
            "Ljd/g$c<",
            "*>;)",
            "Ljd/g;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljd/g$b$a;->c(Ljd/g$b;Ljd/g$c;)Ljd/g;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lce/c2;Ljd/g;)Ljd/g;
    .locals 0

    invoke-static {p0, p1}, Ljd/g$b$a;->d(Ljd/g$b;Ljd/g;)Ljd/g;

    move-result-object p0

    return-object p0
.end method
