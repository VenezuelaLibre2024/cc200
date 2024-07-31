.class public final Lr0/m$f;
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
        "Lr0/m$b<",
        "TT;>;",
        "Ljd/d<",
        "-",
        "Lgd/s;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lld/f;
    c = "androidx.datastore.core.SingleProcessDataStore$actor$3"
    f = "SingleProcessDataStore.kt"
    l = {
        0xef,
        0xf2
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
            "Lr0/m$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lr0/m$f;->j:Lr0/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lld/l;-><init>(ILjd/d;)V

    return-void
.end method


# virtual methods
.method public final a(Lr0/m$b;Ljd/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/m$b<",
            "TT;>;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lr0/m$f;->create(Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p1

    check-cast p1, Lr0/m$f;

    sget-object p2, Lgd/s;->a:Lgd/s;

    invoke-virtual {p1, p2}, Lr0/m$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    new-instance v0, Lr0/m$f;

    iget-object v1, p0, Lr0/m$f;->j:Lr0/m;

    invoke-direct {v0, v1, p2}, Lr0/m$f;-><init>(Lr0/m;Ljd/d;)V

    iput-object p1, v0, Lr0/m$f;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr0/m$b;

    check-cast p2, Ljd/d;

    invoke-virtual {p0, p1, p2}, Lr0/m$f;->a(Lr0/m$b;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lr0/m$f;->h:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lr0/m$f;->i:Ljava/lang/Object;

    check-cast p1, Lr0/m$b;

    instance-of v1, p1, Lr0/m$b$a;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lr0/m$f;->j:Lr0/m;

    check-cast p1, Lr0/m$b$a;

    iput v3, p0, Lr0/m$f;->h:I

    invoke-static {v1, p1, p0}, Lr0/m;->h(Lr0/m;Lr0/m$b$a;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_3
    instance-of v1, p1, Lr0/m$b$b;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lr0/m$f;->j:Lr0/m;

    check-cast p1, Lr0/m$b$b;

    iput v2, p0, Lr0/m$f;->h:I

    invoke-static {v1, p1, p0}, Lr0/m;->i(Lr0/m;Lr0/m$b$b;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
