.class public final Lm9/f0$c;
.super Lld/l;
.source ""

# interfaces
.implements Lsd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm9/f0;->o(Ljava/util/List;)Lce/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld/l;",
        "Lsd/p<",
        "Lce/p0;",
        "Ljd/d<",
        "-",
        "Lgd/s;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lld/f;
    c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1"
    f = "SessionLifecycleClient.kt"
    l = {
        0x97
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public h:I

.field public final synthetic i:Lm9/f0;

.field public final synthetic j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/os/Message;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lm9/f0;Ljava/util/List;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm9/f0;",
            "Ljava/util/List<",
            "Landroid/os/Message;",
            ">;",
            "Ljd/d<",
            "-",
            "Lm9/f0$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lm9/f0$c;->i:Lm9/f0;

    iput-object p2, p0, Lm9/f0$c;->j:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lld/l;-><init>(ILjd/d;)V

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

    new-instance p1, Lm9/f0$c;

    iget-object v0, p0, Lm9/f0$c;->i:Lm9/f0;

    iget-object v1, p0, Lm9/f0$c;->j:Ljava/util/List;

    invoke-direct {p1, v0, v1, p2}, Lm9/f0$c;-><init>(Lm9/f0;Ljava/util/List;Ljd/d;)V

    return-object p1
.end method

.method public final invoke(Lce/p0;Ljd/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/p0;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lm9/f0$c;->create(Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p1

    check-cast p1, Lm9/f0$c;

    sget-object p2, Lgd/s;->a:Lgd/s;

    invoke-virtual {p1, p2}, Lm9/f0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lce/p0;

    check-cast p2, Ljd/d;

    invoke-virtual {p0, p1, p2}, Lm9/f0$c;->invoke(Lce/p0;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lm9/f0$c;->h:I

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

    sget-object p1, Ln9/a;->a:Ln9/a;

    iput v2, p0, Lm9/f0$c;->h:I

    invoke-virtual {p1, p0}, Ln9/a;->c(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const-string v1, "SessionLifecycleClient"

    if-eqz v0, :cond_3

    const-string p1, "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent."

    :goto_1
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_3
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    move p1, v2

    goto :goto_2

    :cond_5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln9/b;

    invoke-interface {v0}, Ln9/b;->b()Z

    move-result v0

    if-eqz v0, :cond_6

    move p1, v3

    :goto_2
    if-eqz p1, :cond_7

    const-string p1, "Data Collection is disabled for all subscribers. Skipping this Event"

    goto :goto_1

    :cond_7
    const/4 p1, 0x2

    new-array v0, p1, [Landroid/os/Message;

    iget-object v1, p0, Lm9/f0$c;->i:Lm9/f0;

    iget-object v4, p0, Lm9/f0$c;->j:Ljava/util/List;

    invoke-static {v1, v4, p1}, Lm9/f0;->b(Lm9/f0;Ljava/util/List;I)Landroid/os/Message;

    move-result-object p1

    aput-object p1, v0, v3

    iget-object p1, p0, Lm9/f0$c;->i:Lm9/f0;

    iget-object v1, p0, Lm9/f0$c;->j:Ljava/util/List;

    invoke-static {p1, v1, v2}, Lm9/f0;->b(Lm9/f0;Ljava/util/List;I)Landroid/os/Message;

    move-result-object p1

    aput-object p1, v0, v2

    invoke-static {v0}, Lhd/n;->h([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lhd/v;->o(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Lm9/f0$c$a;

    invoke-direct {v0}, Lm9/f0$c$a;-><init>()V

    invoke-static {p1, v0}, Lhd/v;->F(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lm9/f0$c;->i:Lm9/f0;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Message;

    invoke-static {v0, v1}, Lm9/f0;->e(Lm9/f0;Landroid/os/Message;)V

    goto :goto_3

    :cond_8
    :goto_4
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
