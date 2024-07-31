.class public final Ljd/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljd/g;
.implements Ljava/io/Serializable;


# instance fields
.field public final h:Ljd/g;

.field public final i:Ljd/g$b;


# direct methods
.method public constructor <init>(Ljd/g;Ljd/g$b;)V
    .locals 1

    const-string v0, "left"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljd/c;->h:Ljd/g;

    iput-object p2, p0, Ljd/c;->i:Ljd/g$b;

    return-void
.end method


# virtual methods
.method public final b(Ljd/g$b;)Z
    .locals 1

    invoke-interface {p1}, Ljd/g$b;->getKey()Ljd/g$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljd/c;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object v0

    invoke-static {v0, p1}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public b0(Ljd/g$c;)Ljd/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/g$c<",
            "*>;)",
            "Ljd/g;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljd/c;->i:Ljd/g$b;

    invoke-interface {v0, p1}, Ljd/g$b;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Ljd/c;->h:Ljd/g;

    return-object p1

    :cond_0
    iget-object v0, p0, Ljd/c;->h:Ljd/g;

    invoke-interface {v0, p1}, Ljd/g;->b0(Ljd/g$c;)Ljd/g;

    move-result-object p1

    iget-object v0, p0, Ljd/c;->h:Ljd/g;

    if-ne p1, v0, :cond_1

    move-object p1, p0

    goto :goto_0

    :cond_1
    sget-object v0, Ljd/h;->h:Ljd/h;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Ljd/c;->i:Ljd/g$b;

    goto :goto_0

    :cond_2
    new-instance v0, Ljd/c;

    iget-object v1, p0, Ljd/c;->i:Ljd/g$b;

    invoke-direct {v0, p1, v1}, Ljd/c;-><init>(Ljd/g;Ljd/g$b;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final c(Ljd/c;)Z
    .locals 1

    :goto_0
    iget-object v0, p1, Ljd/c;->i:Ljd/g$b;

    invoke-virtual {p0, v0}, Ljd/c;->b(Ljd/g$b;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p1, p1, Ljd/c;->h:Ljd/g;

    instance-of v0, p1, Ljd/c;

    if-eqz v0, :cond_1

    check-cast p1, Ljd/c;

    goto :goto_0

    :cond_1
    const-string v0, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"

    invoke-static {p1, v0}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljd/g$b;

    invoke-virtual {p0, p1}, Ljd/c;->b(Ljd/g$b;)Z

    move-result p1

    return p1
.end method

.method public d(Ljd/g$c;)Ljd/g$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Ljd/g$b;",
            ">(",
            "Ljd/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Ljd/c;->i:Ljd/g$b;

    invoke-interface {v1, p1}, Ljd/g$b;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    iget-object v0, v0, Ljd/c;->h:Ljd/g;

    instance-of v1, v0, Ljd/c;

    if-eqz v1, :cond_1

    check-cast v0, Ljd/c;

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object p1

    return-object p1
.end method

.method public final e()I
    .locals 3

    const/4 v0, 0x2

    move-object v1, p0

    :goto_0
    iget-object v1, v1, Ljd/c;->h:Ljd/g;

    instance-of v2, v1, Ljd/c;

    if-eqz v2, :cond_0

    check-cast v1, Ljd/c;

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public e0(Ljd/g;)Ljd/g;
    .locals 0

    invoke-static {p0, p1}, Ljd/g$a;->a(Ljd/g;Ljd/g;)Ljd/g;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Ljd/c;

    if-eqz v0, :cond_0

    check-cast p1, Ljd/c;

    invoke-virtual {p1}, Ljd/c;->e()I

    move-result v0

    invoke-virtual {p0}, Ljd/c;->e()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1, p0}, Ljd/c;->c(Ljd/c;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Ljd/c;->h:Ljd/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Ljd/c;->i:Ljd/g$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v1, Ljd/c$a;->h:Ljd/c$a;

    const-string v2, ""

    invoke-virtual {p0, v2, v1}, Ljd/c;->z0(Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public z0(Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lsd/p<",
            "-TR;-",
            "Ljd/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "operation"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljd/c;->h:Ljd/g;

    invoke-interface {v0, p1, p2}, Ljd/g;->z0(Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Ljd/c;->i:Ljd/g$b;

    invoke-interface {p2, p1, v0}, Lsd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
