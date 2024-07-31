.class public final Lm9/c0$c;
.super Lld/l;
.source ""

# interfaces
.implements Lsd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm9/c0;->a(Lm9/y;)V
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
    c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1"
    f = "SessionFirelogPublisher.kt"
    l = {
        0x40,
        0x46,
        0x47
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:I

.field public final synthetic o:Lm9/c0;

.field public final synthetic p:Lm9/y;


# direct methods
.method public constructor <init>(Lm9/c0;Lm9/y;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm9/c0;",
            "Lm9/y;",
            "Ljd/d<",
            "-",
            "Lm9/c0$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lm9/c0$c;->o:Lm9/c0;

    iput-object p2, p0, Lm9/c0$c;->p:Lm9/y;

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

    new-instance p1, Lm9/c0$c;

    iget-object v0, p0, Lm9/c0$c;->o:Lm9/c0;

    iget-object v1, p0, Lm9/c0$c;->p:Lm9/y;

    invoke-direct {p1, v0, v1, p2}, Lm9/c0$c;-><init>(Lm9/c0;Lm9/y;Ljd/d;)V

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

    invoke-virtual {p0, p1, p2}, Lm9/c0$c;->create(Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p1

    check-cast p1, Lm9/c0$c;

    sget-object p2, Lgd/s;->a:Lgd/s;

    invoke-virtual {p1, p2}, Lm9/c0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lce/p0;

    check-cast p2, Ljd/d;

    invoke-virtual {p0, p1, p2}, Lm9/c0$c;->invoke(Lce/p0;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lm9/c0$c;->n:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lm9/c0$c;->m:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lm9/c0$c;->l:Ljava/lang/Object;

    check-cast v1, Lo9/f;

    iget-object v2, p0, Lm9/c0$c;->k:Ljava/lang/Object;

    check-cast v2, Lm9/y;

    iget-object v3, p0, Lm9/c0$c;->j:Ljava/lang/Object;

    check-cast v3, Ln7/g;

    iget-object v4, p0, Lm9/c0$c;->i:Ljava/lang/Object;

    check-cast v4, Lm9/a0;

    iget-object v5, p0, Lm9/c0$c;->h:Ljava/lang/Object;

    check-cast v5, Lm9/c0;

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    move-object v6, v5

    move-object v8, v4

    move-object v4, v0

    move-object v0, v8

    move-object v9, v3

    move-object v3, v1

    move-object v1, v9

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lm9/c0$c;->l:Ljava/lang/Object;

    check-cast v1, Lo9/f;

    iget-object v3, p0, Lm9/c0$c;->k:Ljava/lang/Object;

    check-cast v3, Lm9/y;

    iget-object v4, p0, Lm9/c0$c;->j:Ljava/lang/Object;

    check-cast v4, Ln7/g;

    iget-object v5, p0, Lm9/c0$c;->i:Ljava/lang/Object;

    check-cast v5, Lm9/a0;

    iget-object v6, p0, Lm9/c0$c;->h:Ljava/lang/Object;

    check-cast v6, Lm9/c0;

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lm9/c0$c;->o:Lm9/c0;

    iput v4, p0, Lm9/c0$c;->n:I

    invoke-static {p1, p0}, Lm9/c0;->f(Lm9/c0;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lm9/c0$c;->o:Lm9/c0;

    sget-object v1, Lm9/a0;->a:Lm9/a0;

    invoke-static {p1}, Lm9/c0;->c(Lm9/c0;)Ln7/g;

    move-result-object v4

    iget-object v5, p0, Lm9/c0$c;->p:Lm9/y;

    iget-object v6, p0, Lm9/c0$c;->o:Lm9/c0;

    invoke-static {v6}, Lm9/c0;->e(Lm9/c0;)Lo9/f;

    move-result-object v6

    sget-object v7, Ln9/a;->a:Ln9/a;

    iput-object p1, p0, Lm9/c0$c;->h:Ljava/lang/Object;

    iput-object v1, p0, Lm9/c0$c;->i:Ljava/lang/Object;

    iput-object v4, p0, Lm9/c0$c;->j:Ljava/lang/Object;

    iput-object v5, p0, Lm9/c0$c;->k:Ljava/lang/Object;

    iput-object v6, p0, Lm9/c0$c;->l:Ljava/lang/Object;

    iput v3, p0, Lm9/c0$c;->n:I

    invoke-virtual {v7, p0}, Ln9/a;->c(Ljd/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_5

    return-object v0

    :cond_5
    move-object v8, v6

    move-object v6, p1

    move-object p1, v3

    move-object v3, v5

    move-object v5, v1

    move-object v1, v8

    :goto_1
    check-cast p1, Ljava/util/Map;

    iget-object v7, p0, Lm9/c0$c;->o:Lm9/c0;

    iput-object v6, p0, Lm9/c0$c;->h:Ljava/lang/Object;

    iput-object v5, p0, Lm9/c0$c;->i:Ljava/lang/Object;

    iput-object v4, p0, Lm9/c0$c;->j:Ljava/lang/Object;

    iput-object v3, p0, Lm9/c0$c;->k:Ljava/lang/Object;

    iput-object v1, p0, Lm9/c0$c;->l:Ljava/lang/Object;

    iput-object p1, p0, Lm9/c0$c;->m:Ljava/lang/Object;

    iput v2, p0, Lm9/c0$c;->n:I

    invoke-static {v7, p0}, Lm9/c0;->d(Lm9/c0;Ljd/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_6

    return-object v0

    :cond_6
    move-object v0, v5

    move-object v8, v4

    move-object v4, p1

    move-object p1, v2

    move-object v2, v3

    move-object v3, v1

    move-object v1, v8

    :goto_2
    const-string v5, "getFirebaseInstallationId()"

    invoke-static {p1, v5}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lm9/a0;->a(Ln7/g;Lm9/y;Lo9/f;Ljava/util/Map;Ljava/lang/String;)Lm9/z;

    move-result-object p1

    invoke-static {v6, p1}, Lm9/c0;->b(Lm9/c0;Lm9/z;)V

    :cond_7
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
