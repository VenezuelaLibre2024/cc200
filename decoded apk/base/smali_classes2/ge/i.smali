.class public final Lge/i;
.super Lld/d;
.source ""

# interfaces
.implements Lfe/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lld/d;",
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

.field public final i:Ljd/g;

.field public final j:I

.field public k:Ljd/g;

.field public l:Ljd/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfe/c;Ljd/g;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/c<",
            "-TT;>;",
            "Ljd/g;",
            ")V"
        }
    .end annotation

    sget-object v0, Lge/g;->h:Lge/g;

    sget-object v1, Ljd/h;->h:Ljd/h;

    invoke-direct {p0, v0, v1}, Lld/d;-><init>(Ljd/d;Ljd/g;)V

    iput-object p1, p0, Lge/i;->h:Lfe/c;

    iput-object p2, p0, Lge/i;->i:Ljd/g;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    sget-object v0, Lge/i$a;->h:Lge/i$a;

    invoke-interface {p2, p1, v0}, Ljd/g;->z0(Ljava/lang/Object;Lsd/p;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, p0, Lge/i;->j:I

    return-void
.end method


# virtual methods
.method public final a(Ljd/g;Ljd/g;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/g;",
            "Ljd/g;",
            "TT;)V"
        }
    .end annotation

    instance-of v0, p2, Lge/e;

    if-eqz v0, :cond_0

    check-cast p2, Lge/e;

    invoke-virtual {p0, p2, p3}, Lge/i;->l(Lge/e;Ljava/lang/Object;)V

    :cond_0
    invoke-static {p0, p1}, Lge/k;->a(Lge/i;Ljd/g;)V

    return-void
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

    :try_start_0
    invoke-virtual {p0, p2, p1}, Lge/i;->j(Ljd/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lld/h;->c(Ljd/d;)V

    :cond_0
    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1

    :catchall_0
    move-exception p1

    new-instance v0, Lge/e;

    invoke-interface {p2}, Ljd/d;->getContext()Ljd/g;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lge/e;-><init>(Ljava/lang/Throwable;Ljd/g;)V

    iput-object v0, p0, Lge/i;->k:Ljd/g;

    throw p1
.end method

.method public getCallerFrame()Lld/e;
    .locals 2

    iget-object v0, p0, Lge/i;->l:Ljd/d;

    instance-of v1, v0, Lld/e;

    if-eqz v1, :cond_0

    check-cast v0, Lld/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getContext()Ljd/g;
    .locals 1

    iget-object v0, p0, Lge/i;->k:Ljd/g;

    if-nez v0, :cond_0

    sget-object v0, Ljd/h;->h:Ljd/h;

    :cond_0
    return-object v0
.end method

.method public getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Lgd/k;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lge/e;

    invoke-virtual {p0}, Lge/i;->getContext()Ljd/g;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lge/e;-><init>(Ljava/lang/Throwable;Ljd/g;)V

    iput-object v1, p0, Lge/i;->k:Ljd/g;

    :cond_0
    iget-object v0, p0, Lge/i;->l:Ljd/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Ljd/d;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljd/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;TT;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p1}, Ljd/d;->getContext()Ljd/g;

    move-result-object v0

    invoke-static {v0}, Lce/g2;->i(Ljd/g;)V

    iget-object v1, p0, Lge/i;->k:Ljd/g;

    if-eq v1, v0, :cond_0

    invoke-virtual {p0, v0, v1, p2}, Lge/i;->a(Ljd/g;Ljd/g;Ljava/lang/Object;)V

    iput-object v0, p0, Lge/i;->k:Ljd/g;

    :cond_0
    iput-object p1, p0, Lge/i;->l:Ljd/d;

    invoke-static {}, Lge/j;->a()Lsd/q;

    move-result-object p1

    iget-object v0, p0, Lge/i;->h:Lfe/c;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>"

    invoke-static {v0, v1}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>"

    invoke-static {p0, v1}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0, p2, p0}, Lsd/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput-object p2, p0, Lge/i;->l:Ljd/d;

    :cond_1
    return-object p1
.end method

.method public final l(Lge/e;Ljava/lang/Object;)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\n            Flow exception transparency is violated:\n                Previous \'emit\' call has thrown exception "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lge/e;->h:Ljava/lang/Throwable;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", but then emission attempt of value \'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' has been detected.\n                Emissions from \'catch\' blocks are prohibited in order to avoid unspecified behaviour, \'Flow.catch\' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lae/g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public releaseIntercepted()V
    .locals 0

    invoke-super {p0}, Lld/d;->releaseIntercepted()V

    return-void
.end method
