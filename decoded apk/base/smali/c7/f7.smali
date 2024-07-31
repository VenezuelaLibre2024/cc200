.class public final Lc7/f7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/util/List<",
        "Lc7/nc;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lc7/o6;


# direct methods
.method public constructor <init>(Lc7/o6;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/f7;->a:Ljava/lang/String;

    iput-object p1, p0, Lc7/f7;->b:Lc7/o6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lc7/f7;->b:Lc7/o6;

    invoke-static {v0}, Lc7/o6;->c(Lc7/o6;)Lc7/yb;

    move-result-object v0

    invoke-virtual {v0}, Lc7/yb;->k0()V

    iget-object v0, p0, Lc7/f7;->b:Lc7/o6;

    invoke-static {v0}, Lc7/o6;->c(Lc7/o6;)Lc7/yb;

    move-result-object v0

    invoke-virtual {v0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    iget-object v1, p0, Lc7/f7;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lc7/m;->H0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
