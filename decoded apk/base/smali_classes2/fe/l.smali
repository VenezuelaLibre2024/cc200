.class public final Lfe/l;
.super Lfe/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lfe/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final h:Lsd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/p<",
            "Lfe/c<",
            "-TT;>;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsd/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/p<",
            "-",
            "Lfe/c<",
            "-TT;>;-",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lfe/a;-><init>()V

    iput-object p1, p0, Lfe/l;->h:Lsd/p;

    return-void
.end method


# virtual methods
.method public b(Lfe/c;Ljd/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lfe/l;->h:Lsd/p;

    invoke-interface {v0, p1, p2}, Lsd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
