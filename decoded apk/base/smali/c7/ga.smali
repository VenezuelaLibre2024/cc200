.class public final Lc7/ga;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/rc;

.field public final synthetic i:Landroid/os/Bundle;

.field public final synthetic j:Lc7/y9;


# direct methods
.method public constructor <init>(Lc7/y9;Lc7/rc;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/ga;->h:Lc7/rc;

    iput-object p3, p0, Lc7/ga;->i:Landroid/os/Bundle;

    iput-object p1, p0, Lc7/ga;->j:Lc7/y9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lc7/ga;->j:Lc7/y9;

    invoke-static {v0}, Lc7/y9;->w(Lc7/y9;)Lc7/o4;

    move-result-object v0

    const-string v1, "Failed to send default event parameters to service"

    if-nez v0, :cond_0

    iget-object v0, p0, Lc7/ga;->j:Lc7/y9;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v2, p0, Lc7/ga;->h:Lc7/rc;

    invoke-static {v2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lc7/ga;->i:Landroid/os/Bundle;

    iget-object v3, p0, Lc7/ga;->h:Lc7/rc;

    invoke-interface {v0, v2, v3}, Lc7/o4;->l1(Landroid/os/Bundle;Lc7/rc;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v2, p0, Lc7/ga;->j:Lc7/y9;

    invoke-virtual {v2}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
