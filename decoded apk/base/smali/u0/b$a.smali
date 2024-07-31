.class public final Lu0/b$a;
.super Lld/l;
.source ""

# interfaces
.implements Lsd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu0/b;->a(Lsd/p;Ljd/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld/l;",
        "Lsd/p<",
        "Lu0/d;",
        "Ljd/d<",
        "-",
        "Lu0/d;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lld/f;
    c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2"
    f = "PreferenceDataStoreFactory.kt"
    l = {
        0x55
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lsd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/p<",
            "Lu0/d;",
            "Ljd/d<",
            "-",
            "Lu0/d;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsd/p;Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/p<",
            "-",
            "Lu0/d;",
            "-",
            "Ljd/d<",
            "-",
            "Lu0/d;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Ljd/d<",
            "-",
            "Lu0/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lu0/b$a;->j:Lsd/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lld/l;-><init>(ILjd/d;)V

    return-void
.end method


# virtual methods
.method public final a(Lu0/d;Ljd/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu0/d;",
            "Ljd/d<",
            "-",
            "Lu0/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lu0/b$a;->create(Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p1

    check-cast p1, Lu0/b$a;

    sget-object p2, Lgd/s;->a:Lgd/s;

    invoke-virtual {p1, p2}, Lu0/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    new-instance v0, Lu0/b$a;

    iget-object v1, p0, Lu0/b$a;->j:Lsd/p;

    invoke-direct {v0, v1, p2}, Lu0/b$a;-><init>(Lsd/p;Ljd/d;)V

    iput-object p1, v0, Lu0/b$a;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu0/d;

    check-cast p2, Ljd/d;

    invoke-virtual {p0, p1, p2}, Lu0/b$a;->a(Lu0/d;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lu0/b$a;->h:I

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

    iget-object p1, p0, Lu0/b$a;->i:Ljava/lang/Object;

    check-cast p1, Lu0/d;

    iget-object v1, p0, Lu0/b$a;->j:Lsd/p;

    iput v2, p0, Lu0/b$a;->h:I

    invoke-interface {v1, p1, p0}, Lsd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lu0/d;

    move-object v0, p1

    check-cast v0, Lu0/a;

    invoke-virtual {v0}, Lu0/a;->f()V

    return-object p1
.end method
