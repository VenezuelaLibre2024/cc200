.class public final Lc7/cc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lc7/rc;

.field public final synthetic b:Lc7/yb;


# direct methods
.method public constructor <init>(Lc7/yb;Lc7/rc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/cc;->a:Lc7/rc;

    iput-object p1, p0, Lc7/cc;->b:Lc7/yb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lc7/cc;->b:Lc7/yb;

    iget-object v1, p0, Lc7/cc;->a:Lc7/rc;

    iget-object v1, v1, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lc7/yb;->M(Ljava/lang/String;)Lc7/n7;

    move-result-object v0

    invoke-virtual {v0}, Lc7/n7;->y()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lc7/cc;->a:Lc7/rc;

    iget-object v0, v0, Lc7/rc;->C:Ljava/lang/String;

    invoke-static {v0}, Lc7/n7;->e(Ljava/lang/String;)Lc7/n7;

    move-result-object v0

    invoke-virtual {v0}, Lc7/n7;->y()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lc7/cc;->b:Lc7/yb;

    iget-object v2, p0, Lc7/cc;->a:Lc7/rc;

    invoke-virtual {v0, v2}, Lc7/yb;->d(Lc7/rc;)Lc7/g5;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lc7/cc;->b:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->G()Lc7/x4;

    move-result-object v0

    const-string v2, "App info was null when attempting to get app instance id"

    :goto_0
    invoke-virtual {v0, v2}, Lc7/x4;->a(Ljava/lang/String;)V

    return-object v1

    :cond_1
    invoke-virtual {v0}, Lc7/g5;->w0()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    :goto_1
    iget-object v0, p0, Lc7/cc;->b:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    const-string v2, "Analytics storage consent denied. Returning null app instance id"

    goto :goto_0
.end method
