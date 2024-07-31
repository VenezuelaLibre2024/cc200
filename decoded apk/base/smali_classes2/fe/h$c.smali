.class public final Lfe/h$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfe/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfe/h;->b(Lfe/b;Lfe/c;Ljd/d;)Ljava/lang/Object;
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
.field public final synthetic h:Lfe/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfe/c<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic i:Ltd/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltd/w<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfe/c;Ltd/w;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/c<",
            "-TT;>;",
            "Ltd/w<",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfe/h$c;->h:Lfe/c;

    iput-object p2, p0, Lfe/h$c;->i:Ltd/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;
    .locals 4
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

    instance-of v0, p2, Lfe/h$c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lfe/h$c$a;

    iget v1, v0, Lfe/h$c$a;->k:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfe/h$c$a;->k:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfe/h$c$a;

    invoke-direct {v0, p0, p2}, Lfe/h$c$a;-><init>(Lfe/h$c;Ljd/d;)V

    :goto_0
    iget-object p2, v0, Lfe/h$c$a;->i:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lfe/h$c$a;->k:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lfe/h$c$a;->h:Ljava/lang/Object;

    check-cast p1, Lfe/h$c;

    :try_start_0
    invoke-static {p2}, Lgd/l;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lgd/l;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lfe/h$c;->h:Lfe/c;

    iput-object p0, v0, Lfe/h$c$a;->h:Ljava/lang/Object;

    iput v3, v0, Lfe/h$c$a;->k:I

    invoke-interface {p2, p1, v0}, Lfe/c;->emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1

    :catchall_1
    move-exception p2

    move-object p1, p0

    :goto_2
    iget-object p1, p1, Lfe/h$c;->i:Ltd/w;

    iput-object p2, p1, Ltd/w;->h:Ljava/lang/Object;

    throw p2
.end method
