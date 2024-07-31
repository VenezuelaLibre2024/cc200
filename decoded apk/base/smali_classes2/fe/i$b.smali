.class public final Lfe/i$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfe/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfe/i;->a(Lfe/b;Lsd/p;)Lfe/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lfe/c;"
    }
.end annotation


# instance fields
.field public final synthetic h:Ltd/u;

.field public final synthetic i:Lfe/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfe/c<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic j:Lsd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/p<",
            "TT;",
            "Ljd/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ltd/u;Lfe/c;Lsd/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltd/u;",
            "Lfe/c<",
            "-TT;>;",
            "Lsd/p<",
            "-TT;-",
            "Ljd/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfe/i$b;->h:Ltd/u;

    iput-object p2, p0, Lfe/i$b;->i:Lfe/c;

    iput-object p3, p0, Lfe/i$b;->j:Lsd/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lfe/i$b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lfe/i$b$a;

    iget v1, v0, Lfe/i$b$a;->l:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfe/i$b$a;->l:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfe/i$b$a;

    invoke-direct {v0, p0, p2}, Lfe/i$b$a;-><init>(Lfe/i$b;Ljd/d;)V

    :goto_0
    iget-object p2, v0, Lfe/i$b$a;->j:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lfe/i$b$a;->l:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lfe/i$b$a;->i:Ljava/lang/Object;

    iget-object v2, v0, Lfe/i$b$a;->h:Ljava/lang/Object;

    check-cast v2, Lfe/i$b;

    invoke-static {p2}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lgd/l;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lfe/i$b;->h:Ltd/u;

    iget-boolean p2, p2, Ltd/u;->h:Z

    if-eqz p2, :cond_6

    iget-object p2, p0, Lfe/i$b;->i:Lfe/c;

    iput v5, v0, Lfe/i$b$a;->l:I

    invoke-interface {p2, p1, v0}, Lfe/c;->emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1

    :cond_6
    iget-object p2, p0, Lfe/i$b;->j:Lsd/p;

    iput-object p0, v0, Lfe/i$b$a;->h:Ljava/lang/Object;

    iput-object p1, v0, Lfe/i$b$a;->i:Ljava/lang/Object;

    iput v4, v0, Lfe/i$b$a;->l:I

    invoke-interface {p2, p1, v0}, Lsd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    return-object v1

    :cond_7
    move-object v2, p0

    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_9

    iget-object p2, v2, Lfe/i$b;->h:Ltd/u;

    iput-boolean v5, p2, Ltd/u;->h:Z

    iget-object p2, v2, Lfe/i$b;->i:Lfe/c;

    const/4 v2, 0x0

    iput-object v2, v0, Lfe/i$b$a;->h:Ljava/lang/Object;

    iput-object v2, v0, Lfe/i$b$a;->i:Ljava/lang/Object;

    iput v3, v0, Lfe/i$b$a;->l:I

    invoke-interface {p2, p1, v0}, Lfe/c;->emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_3
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1

    :cond_9
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
