.class public final Lfe/i$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfe/b;


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
        "Ljava/lang/Object;",
        "Lfe/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic h:Lfe/b;

.field public final synthetic i:Lsd/p;


# direct methods
.method public constructor <init>(Lfe/b;Lsd/p;)V
    .locals 0

    iput-object p1, p0, Lfe/i$a;->h:Lfe/b;

    iput-object p2, p0, Lfe/i$a;->i:Lsd/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lfe/c;Ljd/d;)Ljava/lang/Object;
    .locals 4
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

    new-instance v0, Ltd/u;

    invoke-direct {v0}, Ltd/u;-><init>()V

    iget-object v1, p0, Lfe/i$a;->h:Lfe/b;

    new-instance v2, Lfe/i$b;

    iget-object v3, p0, Lfe/i$a;->i:Lsd/p;

    invoke-direct {v2, v0, p1, v3}, Lfe/i$b;-><init>(Ltd/u;Lfe/c;Lsd/p;)V

    invoke-interface {v1, v2, p2}, Lfe/b;->a(Lfe/c;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
