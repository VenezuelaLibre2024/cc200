.class public final Lfe/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfe/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lfe/c<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final h:Lfe/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfe/c<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final i:Lsd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/p<",
            "Lfe/c<",
            "-TT;>;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# virtual methods
.method public final a(Ljd/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lfe/p$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lfe/p$a;

    iget v1, v0, Lfe/p$a;->l:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfe/p$a;->l:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfe/p$a;

    invoke-direct {v0, p0, p1}, Lfe/p$a;-><init>(Lfe/p;Ljd/d;)V

    :goto_0
    iget-object p1, v0, Lfe/p$a;->j:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lfe/p$a;->l:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lfe/p$a;->i:Ljava/lang/Object;

    check-cast v2, Lge/i;

    iget-object v4, v0, Lfe/p$a;->h:Ljava/lang/Object;

    check-cast v4, Lfe/p;

    :try_start_0
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    new-instance v2, Lge/i;

    iget-object p1, p0, Lfe/p;->h:Lfe/c;

    invoke-interface {v0}, Ljd/d;->getContext()Ljd/g;

    move-result-object v5

    invoke-direct {v2, p1, v5}, Lge/i;-><init>(Lfe/c;Ljd/g;)V

    :try_start_1
    iget-object p1, p0, Lfe/p;->i:Lsd/p;

    iput-object p0, v0, Lfe/p$a;->h:Ljava/lang/Object;

    iput-object v2, v0, Lfe/p$a;->i:Ljava/lang/Object;

    iput v4, v0, Lfe/p$a;->l:I

    invoke-interface {p1, v2, v0}, Lsd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v4, p0

    :goto_1
    invoke-virtual {v2}, Lge/i;->releaseIntercepted()V

    iget-object p1, v4, Lfe/p;->h:Lfe/c;

    instance-of v2, p1, Lfe/p;

    if-eqz v2, :cond_6

    check-cast p1, Lfe/p;

    const/4 v2, 0x0

    iput-object v2, v0, Lfe/p$a;->h:Ljava/lang/Object;

    iput-object v2, v0, Lfe/p$a;->i:Ljava/lang/Object;

    iput v3, v0, Lfe/p$a;->l:I

    invoke-virtual {p1, v0}, Lfe/p;->a(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1

    :cond_6
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v2}, Lge/i;->releaseIntercepted()V

    throw p1
.end method

.method public emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lfe/p;->h:Lfe/c;

    invoke-interface {v0, p1, p2}, Lfe/c;->emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
