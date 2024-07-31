.class public final Lfe/h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfe/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfe/h;->a(Lfe/b;Lsd/q;)Lfe/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfe/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic h:Lfe/b;

.field public final synthetic i:Lsd/q;


# direct methods
.method public constructor <init>(Lfe/b;Lsd/q;)V
    .locals 0

    iput-object p1, p0, Lfe/h$a;->h:Lfe/b;

    iput-object p2, p0, Lfe/h$a;->i:Lsd/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lfe/c;Ljd/d;)Ljava/lang/Object;
    .locals 5
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

    instance-of v0, p2, Lfe/h$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lfe/h$a$a;

    iget v1, v0, Lfe/h$a$a;->i:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfe/h$a$a;->i:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfe/h$a$a;

    invoke-direct {v0, p0, p2}, Lfe/h$a$a;-><init>(Lfe/h$a;Ljd/d;)V

    :goto_0
    iget-object p2, v0, Lfe/h$a$a;->h:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lfe/h$a$a;->i:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lfe/h$a$a;->l:Ljava/lang/Object;

    check-cast p1, Lfe/c;

    iget-object v2, v0, Lfe/h$a$a;->k:Ljava/lang/Object;

    check-cast v2, Lfe/h$a;

    invoke-static {p2}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lgd/l;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lfe/h$a;->h:Lfe/b;

    iput-object p0, v0, Lfe/h$a$a;->k:Ljava/lang/Object;

    iput-object p1, v0, Lfe/h$a$a;->l:Ljava/lang/Object;

    iput v4, v0, Lfe/h$a$a;->i:I

    invoke-static {p2, p1, v0}, Lfe/d;->b(Lfe/b;Lfe/c;Ljd/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p2, Ljava/lang/Throwable;

    if-eqz p2, :cond_5

    iget-object v2, v2, Lfe/h$a;->i:Lsd/q;

    const/4 v4, 0x0

    iput-object v4, v0, Lfe/h$a$a;->k:Ljava/lang/Object;

    iput-object v4, v0, Lfe/h$a$a;->l:Ljava/lang/Object;

    iput v3, v0, Lfe/h$a$a;->i:I

    const/4 v3, 0x6

    invoke-static {v3}, Ltd/l;->a(I)V

    invoke-interface {v2, p1, p2, v0}, Lsd/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x7

    invoke-static {p2}, Ltd/l;->a(I)V

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
