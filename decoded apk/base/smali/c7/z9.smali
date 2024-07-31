.class public final Lc7/z9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lc7/rc;

.field public final synthetic k:Z

.field public final synthetic l:Lcom/google/android/gms/internal/measurement/zzcv;

.field public final synthetic m:Lc7/y9;


# direct methods
.method public constructor <init>(Lc7/y9;Ljava/lang/String;Ljava/lang/String;Lc7/rc;ZLcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/z9;->h:Ljava/lang/String;

    iput-object p3, p0, Lc7/z9;->i:Ljava/lang/String;

    iput-object p4, p0, Lc7/z9;->j:Lc7/rc;

    iput-boolean p5, p0, Lc7/z9;->k:Z

    iput-object p6, p0, Lc7/z9;->l:Lcom/google/android/gms/internal/measurement/zzcv;

    iput-object p1, p0, Lc7/z9;->m:Lc7/y9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :try_start_0
    iget-object v1, p0, Lc7/z9;->m:Lc7/y9;

    invoke-static {v1}, Lc7/y9;->w(Lc7/y9;)Lc7/o4;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lc7/z9;->m:Lc7/y9;

    invoke-virtual {v1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Failed to get user properties; not connected to service"

    iget-object v3, p0, Lc7/z9;->h:Ljava/lang/String;

    iget-object v4, p0, Lc7/z9;->i:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v4}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object v1, p0, Lc7/z9;->m:Lc7/y9;

    invoke-virtual {v1}, Lc7/j7;->f()Lc7/qc;

    move-result-object v1

    iget-object v2, p0, Lc7/z9;->l:Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v1, v2, v0}, Lc7/qc;->Q(Lcom/google/android/gms/internal/measurement/zzcv;Landroid/os/Bundle;)V

    return-void

    :cond_0
    :try_start_1
    iget-object v2, p0, Lc7/z9;->j:Lc7/rc;

    invoke-static {v2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lc7/z9;->h:Ljava/lang/String;

    iget-object v3, p0, Lc7/z9;->i:Ljava/lang/String;

    iget-boolean v4, p0, Lc7/z9;->k:Z

    iget-object v5, p0, Lc7/z9;->j:Lc7/rc;

    invoke-interface {v1, v2, v3, v4, v5}, Lc7/o4;->q(Ljava/lang/String;Ljava/lang/String;ZLc7/rc;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lc7/qc;->B(Ljava/util/List;)Landroid/os/Bundle;

    move-result-object v0

    iget-object v1, p0, Lc7/z9;->m:Lc7/y9;

    invoke-static {v1}, Lc7/y9;->h0(Lc7/y9;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_2
    iget-object v2, p0, Lc7/z9;->m:Lc7/y9;

    invoke-virtual {v2}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    const-string v3, "Failed to get user properties; remote exception"

    iget-object v4, p0, Lc7/z9;->h:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v1}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :goto_1
    iget-object v2, p0, Lc7/z9;->m:Lc7/y9;

    invoke-virtual {v2}, Lc7/j7;->f()Lc7/qc;

    move-result-object v2

    iget-object v3, p0, Lc7/z9;->l:Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v2, v3, v0}, Lc7/qc;->Q(Lcom/google/android/gms/internal/measurement/zzcv;Landroid/os/Bundle;)V

    throw v1
.end method
