.class public final Ll1/a$a$c;
.super Lld/l;
.source ""

# interfaces
.implements Lsd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll1/a$a;->f(Landroid/net/Uri;Landroid/view/InputEvent;)Ll7/f;
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
    c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1"
    f = "MeasurementManagerFutures.kt"
    l = {
        0x85
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public h:I

.field public final synthetic i:Ll1/a$a;

.field public final synthetic j:Landroid/net/Uri;

.field public final synthetic k:Landroid/view/InputEvent;


# direct methods
.method public constructor <init>(Ll1/a$a;Landroid/net/Uri;Landroid/view/InputEvent;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/a$a;",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            "Ljd/d<",
            "-",
            "Ll1/a$a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ll1/a$a$c;->i:Ll1/a$a;

    iput-object p2, p0, Ll1/a$a$c;->j:Landroid/net/Uri;

    iput-object p3, p0, Ll1/a$a$c;->k:Landroid/view/InputEvent;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lld/l;-><init>(ILjd/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljd/d;)Ljd/d;
    .locals 3
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

    new-instance p1, Ll1/a$a$c;

    iget-object v0, p0, Ll1/a$a$c;->i:Ll1/a$a;

    iget-object v1, p0, Ll1/a$a$c;->j:Landroid/net/Uri;

    iget-object v2, p0, Ll1/a$a$c;->k:Landroid/view/InputEvent;

    invoke-direct {p1, v0, v1, v2, p2}, Ll1/a$a$c;-><init>(Ll1/a$a;Landroid/net/Uri;Landroid/view/InputEvent;Ljd/d;)V

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

    invoke-virtual {p0, p1, p2}, Ll1/a$a$c;->create(Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p1

    check-cast p1, Ll1/a$a$c;

    sget-object p2, Lgd/s;->a:Lgd/s;

    invoke-virtual {p1, p2}, Ll1/a$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lce/p0;

    check-cast p2, Ljd/d;

    invoke-virtual {p0, p1, p2}, Ll1/a$a$c;->invoke(Lce/p0;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ll1/a$a$c;->h:I

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

    iget-object p1, p0, Ll1/a$a$c;->i:Ll1/a$a;

    invoke-static {p1}, Ll1/a$a;->d(Ll1/a$a;)Lm1/b;

    move-result-object p1

    iget-object v1, p0, Ll1/a$a$c;->j:Landroid/net/Uri;

    iget-object v3, p0, Ll1/a$a$c;->k:Landroid/view/InputEvent;

    iput v2, p0, Ll1/a$a$c;->h:I

    invoke-virtual {p1, v1, v3, p0}, Lm1/b;->c(Landroid/net/Uri;Landroid/view/InputEvent;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
