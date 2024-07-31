.class public final Lm9/k$a;
.super Lld/l;
.source ""

# interfaces
.implements Lsd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm9/k;-><init>(Ln7/g;Lo9/f;Ljd/g;)V
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
    c = "com.google.firebase.sessions.FirebaseSessions$1"
    f = "FirebaseSessions.kt"
    l = {
        0x2c,
        0x30
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public h:I

.field public final synthetic i:Lm9/k;

.field public final synthetic j:Ljd/g;


# direct methods
.method public constructor <init>(Lm9/k;Ljd/g;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm9/k;",
            "Ljd/g;",
            "Ljd/d<",
            "-",
            "Lm9/k$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lm9/k$a;->i:Lm9/k;

    iput-object p2, p0, Lm9/k$a;->j:Ljd/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lld/l;-><init>(ILjd/d;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Ln7/p;)V
    .locals 0

    invoke-static {p0, p1}, Lm9/k$a;->j(Ljava/lang/String;Ln7/p;)V

    return-void
.end method

.method public static final j(Ljava/lang/String;Ln7/p;)V
    .locals 0

    const-string p0, "FirebaseSessions"

    const-string p1, "FirebaseApp instance deleted. Sessions library will stop collecting data."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lm9/i0;->h:Lm9/i0;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lm9/i0;->a(Lm9/f0;)V

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

    new-instance p1, Lm9/k$a;

    iget-object v0, p0, Lm9/k$a;->i:Lm9/k;

    iget-object v1, p0, Lm9/k$a;->j:Ljd/g;

    invoke-direct {p1, v0, v1, p2}, Lm9/k$a;-><init>(Lm9/k;Ljd/g;Ljd/d;)V

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

    invoke-virtual {p0, p1, p2}, Lm9/k$a;->create(Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p1

    check-cast p1, Lm9/k$a;

    sget-object p2, Lgd/s;->a:Lgd/s;

    invoke-virtual {p1, p2}, Lm9/k$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lce/p0;

    check-cast p2, Ljd/d;

    invoke-virtual {p0, p1, p2}, Lm9/k$a;->invoke(Lce/p0;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lm9/k$a;->h:I

    const-string v2, "FirebaseSessions"

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    sget-object p1, Ln9/a;->a:Ln9/a;

    iput v4, p0, Lm9/k$a;->h:I

    invoke-virtual {p1, p0}, Ln9/a;->c(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    instance-of v1, p1, Ljava/util/Collection;

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln9/b;

    invoke-interface {v1}, Ln9/b;->b()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v4, 0x0

    :cond_6
    :goto_1
    if-eqz v4, :cond_7

    const-string p1, "No Sessions subscribers. Not listening to lifecycle events."

    goto :goto_3

    :cond_7
    iget-object p1, p0, Lm9/k$a;->i:Lm9/k;

    invoke-static {p1}, Lm9/k;->b(Lm9/k;)Lo9/f;

    move-result-object p1

    iput v3, p0, Lm9/k$a;->h:I

    invoke-virtual {p1, p0}, Lo9/f;->g(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_2
    iget-object p1, p0, Lm9/k$a;->i:Lm9/k;

    invoke-static {p1}, Lm9/k;->b(Lm9/k;)Lo9/f;

    move-result-object p1

    invoke-virtual {p1}, Lo9/f;->d()Z

    move-result p1

    if-nez p1, :cond_9

    const-string p1, "Sessions SDK disabled. Not listening to lifecycle events."

    :goto_3
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_9
    new-instance p1, Lm9/f0;

    iget-object v0, p0, Lm9/k$a;->j:Ljd/g;

    invoke-direct {p1, v0}, Lm9/f0;-><init>(Ljd/g;)V

    invoke-virtual {p1}, Lm9/f0;->i()V

    sget-object v0, Lm9/i0;->h:Lm9/i0;

    invoke-virtual {v0, p1}, Lm9/i0;->a(Lm9/f0;)V

    iget-object p1, p0, Lm9/k$a;->i:Lm9/k;

    invoke-static {p1}, Lm9/k;->a(Lm9/k;)Ln7/g;

    move-result-object p1

    sget-object v0, Lm9/j;->a:Lm9/j;

    invoke-virtual {p1, v0}, Ln7/g;->h(Ln7/h;)V

    :goto_4
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
