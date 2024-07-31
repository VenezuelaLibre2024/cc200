.class public final Ljd/e$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljd/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Ljd/e;Ljd/g$c;)Ljd/g$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Ljd/g$b;",
            ">(",
            "Ljd/e;",
            "Ljd/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ljd/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Ljd/b;

    invoke-interface {p0}, Ljd/g$b;->getKey()Ljd/g$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljd/b;->a(Ljd/g$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, Ljd/b;->b(Ljd/g$b;)Ljd/g$b;

    move-result-object p0

    instance-of p1, p0, Ljd/g$b;

    if-eqz p1, :cond_0

    move-object v1, p0

    :cond_0
    return-object v1

    :cond_1
    sget-object v0, Ljd/e;->e:Ljd/e$b;

    if-ne v0, p1, :cond_2

    const-string p1, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get"

    invoke-static {p0, p1}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method public static b(Ljd/e;Ljd/g$c;)Ljd/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/e;",
            "Ljd/g$c<",
            "*>;)",
            "Ljd/g;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ljd/b;

    if-eqz v0, :cond_1

    check-cast p1, Ljd/b;

    invoke-interface {p0}, Ljd/g$b;->getKey()Ljd/g$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljd/b;->a(Ljd/g$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, Ljd/b;->b(Ljd/g$b;)Ljd/g$b;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object p0, Ljd/h;->h:Ljd/h;

    :cond_0
    return-object p0

    :cond_1
    sget-object v0, Ljd/e;->e:Ljd/e$b;

    if-ne v0, p1, :cond_2

    sget-object p0, Ljd/h;->h:Ljd/h;

    :cond_2
    return-object p0
.end method
