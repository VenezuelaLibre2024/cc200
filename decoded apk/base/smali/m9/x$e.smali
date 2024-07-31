.class public final Lm9/x$e;
.super Lld/l;
.source ""

# interfaces
.implements Lsd/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm9/x;-><init>(Landroid/content/Context;Ljd/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld/l;",
        "Lsd/q<",
        "Lfe/c<",
        "-",
        "Lu0/d;",
        ">;",
        "Ljava/lang/Throwable;",
        "Ljd/d<",
        "-",
        "Lgd/s;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lld/f;
    c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1"
    f = "SessionDatastore.kt"
    l = {
        0x4b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public synthetic j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljd/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-",
            "Lm9/x$e;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lld/l;-><init>(ILjd/d;)V

    return-void
.end method


# virtual methods
.method public final a(Lfe/c;Ljava/lang/Throwable;Ljd/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/c<",
            "-",
            "Lu0/d;",
            ">;",
            "Ljava/lang/Throwable;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lm9/x$e;

    invoke-direct {v0, p3}, Lm9/x$e;-><init>(Ljd/d;)V

    iput-object p1, v0, Lm9/x$e;->i:Ljava/lang/Object;

    iput-object p2, v0, Lm9/x$e;->j:Ljava/lang/Object;

    sget-object p1, Lgd/s;->a:Lgd/s;

    invoke-virtual {v0, p1}, Lm9/x$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfe/c;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Ljd/d;

    invoke-virtual {p0, p1, p2, p3}, Lm9/x$e;->a(Lfe/c;Ljava/lang/Throwable;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lm9/x$e;->h:I

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

    iget-object p1, p0, Lm9/x$e;->i:Ljava/lang/Object;

    check-cast p1, Lfe/c;

    iget-object v1, p0, Lm9/x$e;->j:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    const-string v3, "FirebaseSessionsRepo"

    const-string v4, "Error reading stored session data."

    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {}, Lu0/e;->a()Lu0/d;

    move-result-object v1

    const/4 v3, 0x0

    iput-object v3, p0, Lm9/x$e;->i:Ljava/lang/Object;

    iput v2, p0, Lm9/x$e;->h:I

    invoke-interface {p1, v1, p0}, Lfe/c;->emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
