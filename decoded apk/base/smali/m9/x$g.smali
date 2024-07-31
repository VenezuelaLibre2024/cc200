.class public final Lm9/x$g;
.super Lld/l;
.source ""

# interfaces
.implements Lsd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm9/x;->b(Ljava/lang/String;)V
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
    c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1"
    f = "SessionDatastore.kt"
    l = {
        0x57
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public h:I

.field public final synthetic i:Lm9/x;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lm9/x;Ljava/lang/String;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm9/x;",
            "Ljava/lang/String;",
            "Ljd/d<",
            "-",
            "Lm9/x$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lm9/x$g;->i:Lm9/x;

    iput-object p2, p0, Lm9/x$g;->j:Ljava/lang/String;

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

    new-instance p1, Lm9/x$g;

    iget-object v0, p0, Lm9/x$g;->i:Lm9/x;

    iget-object v1, p0, Lm9/x$g;->j:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lm9/x$g;-><init>(Lm9/x;Ljava/lang/String;Ljd/d;)V

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

    invoke-virtual {p0, p1, p2}, Lm9/x$g;->create(Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p1

    check-cast p1, Lm9/x$g;

    sget-object p2, Lgd/s;->a:Lgd/s;

    invoke-virtual {p1, p2}, Lm9/x$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lce/p0;

    check-cast p2, Ljd/d;

    invoke-virtual {p0, p1, p2}, Lm9/x$g;->invoke(Lce/p0;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lm9/x$g;->h:I

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

    invoke-static {}, Lm9/x;->c()Lm9/x$c;

    move-result-object p1

    iget-object v1, p0, Lm9/x$g;->i:Lm9/x;

    invoke-static {v1}, Lm9/x;->d(Lm9/x;)Landroid/content/Context;

    move-result-object v1

    invoke-static {p1, v1}, Lm9/x$c;->a(Lm9/x$c;Landroid/content/Context;)Lr0/f;

    move-result-object p1

    new-instance v1, Lm9/x$g$a;

    iget-object v3, p0, Lm9/x$g;->j:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, Lm9/x$g$a;-><init>(Ljava/lang/String;Ljd/d;)V

    iput v2, p0, Lm9/x$g;->h:I

    invoke-static {p1, v1, p0}, Lu0/g;->a(Lr0/f;Lsd/p;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
