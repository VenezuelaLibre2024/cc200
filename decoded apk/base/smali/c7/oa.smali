.class public final Lc7/oa;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Z

.field public final synthetic i:Lc7/rc;

.field public final synthetic j:Z

.field public final synthetic k:Lc7/g0;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Lc7/y9;


# direct methods
.method public constructor <init>(Lc7/y9;ZLc7/rc;ZLc7/g0;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-boolean p2, p0, Lc7/oa;->h:Z

    iput-object p3, p0, Lc7/oa;->i:Lc7/rc;

    iput-boolean p4, p0, Lc7/oa;->j:Z

    iput-object p5, p0, Lc7/oa;->k:Lc7/g0;

    iput-object p6, p0, Lc7/oa;->l:Ljava/lang/String;

    iput-object p1, p0, Lc7/oa;->m:Lc7/y9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lc7/oa;->m:Lc7/y9;

    invoke-static {v0}, Lc7/y9;->w(Lc7/y9;)Lc7/o4;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lc7/oa;->m:Lc7/y9;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v1, "Discarding data. Failed to send event to service"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-boolean v1, p0, Lc7/oa;->h:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lc7/oa;->i:Lc7/rc;

    invoke-static {v1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lc7/oa;->m:Lc7/y9;

    iget-boolean v2, p0, Lc7/oa;->j:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lc7/oa;->k:Lc7/g0;

    :goto_0
    iget-object v3, p0, Lc7/oa;->i:Lc7/rc;

    invoke-virtual {v1, v0, v2, v3}, Lc7/y9;->B(Lc7/o4;Li6/a;Lc7/rc;)V

    goto :goto_1

    :cond_2
    :try_start_0
    iget-object v1, p0, Lc7/oa;->l:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lc7/oa;->i:Lc7/rc;

    invoke-static {v1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lc7/oa;->k:Lc7/g0;

    iget-object v2, p0, Lc7/oa;->i:Lc7/rc;

    invoke-interface {v0, v1, v2}, Lc7/o4;->i1(Lc7/g0;Lc7/rc;)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lc7/oa;->k:Lc7/g0;

    iget-object v2, p0, Lc7/oa;->l:Ljava/lang/String;

    iget-object v3, p0, Lc7/oa;->m:Lc7/y9;

    invoke-virtual {v3}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->J()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lc7/o4;->f0(Lc7/g0;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    iget-object v1, p0, Lc7/oa;->m:Lc7/y9;

    invoke-virtual {v1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Failed to send event to the service"

    invoke-virtual {v1, v2, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    iget-object v0, p0, Lc7/oa;->m:Lc7/y9;

    invoke-static {v0}, Lc7/y9;->h0(Lc7/y9;)V

    return-void
.end method
