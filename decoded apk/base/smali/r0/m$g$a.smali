.class public final Lr0/m$g$a;
.super Lld/l;
.source ""

# interfaces
.implements Lsd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr0/m$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld/l;",
        "Lsd/p<",
        "Lr0/n<",
        "TT;>;",
        "Ljd/d<",
        "-",
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lld/f;
    c = "androidx.datastore.core.SingleProcessDataStore$data$1$1"
    f = "SingleProcessDataStore.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lr0/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/n<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lr0/n;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/n<",
            "TT;>;",
            "Ljd/d<",
            "-",
            "Lr0/m$g$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lr0/m$g$a;->j:Lr0/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lld/l;-><init>(ILjd/d;)V

    return-void
.end method


# virtual methods
.method public final a(Lr0/n;Ljd/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/n<",
            "TT;>;",
            "Ljd/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lr0/m$g$a;->create(Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p1

    check-cast p1, Lr0/m$g$a;

    sget-object p2, Lgd/s;->a:Lgd/s;

    invoke-virtual {p1, p2}, Lr0/m$g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    new-instance v0, Lr0/m$g$a;

    iget-object v1, p0, Lr0/m$g$a;->j:Lr0/n;

    invoke-direct {v0, v1, p2}, Lr0/m$g$a;-><init>(Lr0/n;Ljd/d;)V

    iput-object p1, v0, Lr0/m$g$a;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr0/n;

    check-cast p2, Ljd/d;

    invoke-virtual {p0, p1, p2}, Lr0/m$g$a;->a(Lr0/n;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    iget v0, p0, Lr0/m$g$a;->h:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lr0/m$g$a;->i:Ljava/lang/Object;

    check-cast p1, Lr0/n;

    iget-object v0, p0, Lr0/m$g$a;->j:Lr0/n;

    instance-of v1, v0, Lr0/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    instance-of v1, v0, Lr0/h;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    if-ne p1, v0, :cond_1

    const/4 v2, 0x1

    :cond_1
    :goto_0
    invoke-static {v2}, Lld/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
