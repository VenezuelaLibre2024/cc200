.class public final Lce/j2$e;
.super Lld/k;
.source ""

# interfaces
.implements Lsd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lce/j2;->w()Lzd/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld/k;",
        "Lsd/p<",
        "Lzd/d<",
        "-",
        "Lce/c2;",
        ">;",
        "Ljd/d<",
        "-",
        "Lgd/s;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lld/f;
    c = "kotlinx.coroutines.JobSupport$children$1"
    f = "JobSupport.kt"
    l = {
        0x3bc,
        0x3be
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lce/j2;


# direct methods
.method public constructor <init>(Lce/j2;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/j2;",
            "Ljd/d<",
            "-",
            "Lce/j2$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lce/j2$e;->m:Lce/j2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lld/k;-><init>(ILjd/d;)V

    return-void
.end method


# virtual methods
.method public final a(Lzd/d;Ljd/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzd/d<",
            "-",
            "Lce/c2;",
            ">;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lce/j2$e;->create(Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p1

    check-cast p1, Lce/j2$e;

    sget-object p2, Lgd/s;->a:Lgd/s;

    invoke-virtual {p1, p2}, Lce/j2$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Ljd/d;)Ljd/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljd/d<",
            "*>;)",
            "Ljd/d<",
            "Lgd/s;",
            ">;"
        }
    .end annotation

    new-instance v0, Lce/j2$e;

    iget-object v1, p0, Lce/j2$e;->m:Lce/j2;

    invoke-direct {v0, v1, p2}, Lce/j2$e;-><init>(Lce/j2;Ljd/d;)V

    iput-object p1, v0, Lce/j2$e;->l:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzd/d;

    check-cast p2, Ljd/d;

    invoke-virtual {p0, p1, p2}, Lce/j2$e;->a(Lzd/d;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lce/j2$e;->k:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lce/j2$e;->j:Ljava/lang/Object;

    check-cast v1, Lhe/w;

    iget-object v3, p0, Lce/j2$e;->i:Ljava/lang/Object;

    check-cast v3, Lhe/u;

    iget-object v4, p0, Lce/j2$e;->l:Ljava/lang/Object;

    check-cast v4, Lzd/d;

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    move-object p1, p0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lce/j2$e;->l:Ljava/lang/Object;

    check-cast p1, Lzd/d;

    iget-object v1, p0, Lce/j2$e;->m:Lce/j2;

    invoke-virtual {v1}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, Lce/v;

    if-eqz v4, :cond_3

    check-cast v1, Lce/v;

    iget-object v1, v1, Lce/v;->l:Lce/w;

    iput v3, p0, Lce/j2$e;->k:I

    invoke-virtual {p1, v1, p0}, Lzd/d;->a(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_3
    instance-of v3, v1, Lce/x1;

    if-eqz v3, :cond_5

    check-cast v1, Lce/x1;

    invoke-interface {v1}, Lce/x1;->e()Lce/o2;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lhe/w;->m()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-static {v3, v4}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lhe/w;

    move-object v4, p1

    move-object p1, p0

    move-object v6, v3

    move-object v3, v1

    move-object v1, v6

    :goto_0
    invoke-static {v1, v3}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    instance-of v5, v1, Lce/v;

    if-eqz v5, :cond_4

    move-object v5, v1

    check-cast v5, Lce/v;

    iget-object v5, v5, Lce/v;->l:Lce/w;

    iput-object v4, p1, Lce/j2$e;->l:Ljava/lang/Object;

    iput-object v3, p1, Lce/j2$e;->i:Ljava/lang/Object;

    iput-object v1, p1, Lce/j2$e;->j:Ljava/lang/Object;

    iput v2, p1, Lce/j2$e;->k:I

    invoke-virtual {v4, v5, p1}, Lzd/d;->a(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    invoke-virtual {v1}, Lhe/w;->n()Lhe/w;

    move-result-object v1

    goto :goto_0

    :cond_5
    :goto_2
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
