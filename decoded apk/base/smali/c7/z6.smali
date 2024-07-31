.class public final Lc7/z6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lc7/k;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lc7/rc;

.field public final synthetic b:Lc7/o6;


# direct methods
.method public constructor <init>(Lc7/o6;Lc7/rc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/z6;->a:Lc7/rc;

    iput-object p1, p0, Lc7/z6;->b:Lc7/o6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lc7/z6;->b:Lc7/o6;

    invoke-static {v0}, Lc7/o6;->c(Lc7/o6;)Lc7/yb;

    move-result-object v0

    invoke-virtual {v0}, Lc7/yb;->k0()V

    new-instance v0, Lc7/k;

    iget-object v1, p0, Lc7/z6;->b:Lc7/o6;

    invoke-static {v1}, Lc7/o6;->c(Lc7/o6;)Lc7/yb;

    move-result-object v1

    iget-object v2, p0, Lc7/z6;->a:Lc7/rc;

    iget-object v2, v2, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lc7/yb;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    invoke-direct {v0, v1}, Lc7/k;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method
