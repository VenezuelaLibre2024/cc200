.class public interface abstract Ly7/d;
.super Ljava/lang/Object;
.source ""


# virtual methods
.method public a(Ly7/e0;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ly7/e0<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-interface {p0, p1}, Ly7/d;->b(Ly7/e0;)Ly8/b;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1}, Ly8/b;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract b(Ly7/e0;)Ly8/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ly7/e0<",
            "TT;>;)",
            "Ly8/b<",
            "TT;>;"
        }
    .end annotation
.end method

.method public c(Ljava/lang/Class;)Ly8/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ly8/b<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Ly7/e0;->b(Ljava/lang/Class;)Ly7/e0;

    move-result-object p1

    invoke-interface {p0, p1}, Ly7/d;->b(Ly7/e0;)Ly8/b;

    move-result-object p1

    return-object p1
.end method

.method public d(Ly7/e0;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ly7/e0<",
            "TT;>;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    invoke-interface {p0, p1}, Ly7/d;->e(Ly7/e0;)Ly8/b;

    move-result-object p1

    invoke-interface {p1}, Ly8/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    return-object p1
.end method

.method public abstract e(Ly7/e0;)Ly8/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ly7/e0<",
            "TT;>;)",
            "Ly8/b<",
            "Ljava/util/Set<",
            "TT;>;>;"
        }
    .end annotation
.end method

.method public f(Ljava/lang/Class;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Ly7/e0;->b(Ljava/lang/Class;)Ly7/e0;

    move-result-object p1

    invoke-interface {p0, p1}, Ly7/d;->d(Ly7/e0;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/Class;)Ly8/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ly8/a<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Ly7/e0;->b(Ljava/lang/Class;)Ly7/e0;

    move-result-object p1

    invoke-interface {p0, p1}, Ly7/d;->h(Ly7/e0;)Ly8/a;

    move-result-object p1

    return-object p1
.end method

.method public get(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-static {p1}, Ly7/e0;->b(Ljava/lang/Class;)Ly7/e0;

    move-result-object p1

    invoke-interface {p0, p1}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract h(Ly7/e0;)Ly8/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ly7/e0<",
            "TT;>;)",
            "Ly8/a<",
            "TT;>;"
        }
    .end annotation
.end method
