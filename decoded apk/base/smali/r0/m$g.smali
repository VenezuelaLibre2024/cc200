.class public final Lr0/m$g;
.super Lld/l;
.source ""

# interfaces
.implements Lsd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr0/m;-><init>(Lsd/a;Lr0/k;Ljava/util/List;Lr0/b;Lce/p0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld/l;",
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

.annotation runtime Lld/f;
    c = "androidx.datastore.core.SingleProcessDataStore$data$1"
    f = "SingleProcessDataStore.kt"
    l = {
        0x75
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lr0/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/m<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lr0/m;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/m<",
            "TT;>;",
            "Ljd/d<",
            "-",
            "Lr0/m$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lr0/m$g;->j:Lr0/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lld/l;-><init>(ILjd/d;)V

    return-void
.end method


# virtual methods
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

    new-instance v0, Lr0/m$g;

    iget-object v1, p0, Lr0/m$g;->j:Lr0/m;

    invoke-direct {v0, v1, p2}, Lr0/m$g;-><init>(Lr0/m;Ljd/d;)V

    iput-object p1, v0, Lr0/m$g;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lfe/c;Ljd/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/c<",
            "-TT;>;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lr0/m$g;->create(Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p1

    check-cast p1, Lr0/m$g;

    sget-object p2, Lgd/s;->a:Lgd/s;

    invoke-virtual {p1, p2}, Lr0/m$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfe/c;

    check-cast p2, Ljd/d;

    invoke-virtual {p0, p1, p2}, Lr0/m$g;->invoke(Lfe/c;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lr0/m$g;->h:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lr0/m$g;->i:Ljava/lang/Object;

    check-cast p1, Lfe/c;

    iget-object v1, p0, Lr0/m$g;->j:Lr0/m;

    invoke-static {v1}, Lr0/m;->e(Lr0/m;)Lfe/k;

    move-result-object v1

    invoke-interface {v1}, Lfe/k;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr0/n;

    instance-of v3, v1, Lr0/c;

    if-nez v3, :cond_2

    iget-object v3, p0, Lr0/m$g;->j:Lr0/m;

    invoke-static {v3}, Lr0/m;->d(Lr0/m;)Lr0/l;

    move-result-object v3

    new-instance v4, Lr0/m$b$a;

    invoke-direct {v4, v1}, Lr0/m$b$a;-><init>(Lr0/n;)V

    invoke-virtual {v3, v4}, Lr0/l;->e(Ljava/lang/Object;)V

    :cond_2
    iget-object v3, p0, Lr0/m$g;->j:Lr0/m;

    invoke-static {v3}, Lr0/m;->e(Lr0/m;)Lfe/k;

    move-result-object v3

    new-instance v4, Lr0/m$g$a;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v5}, Lr0/m$g$a;-><init>(Lr0/n;Ljd/d;)V

    invoke-static {v3, v4}, Lfe/d;->c(Lfe/b;Lsd/p;)Lfe/b;

    move-result-object v1

    new-instance v3, Lr0/m$g$b;

    invoke-direct {v3, v1}, Lr0/m$g$b;-><init>(Lfe/b;)V

    iput v2, p0, Lr0/m$g;->h:I

    invoke-static {p1, v3, p0}, Lfe/d;->d(Lfe/c;Lfe/b;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
