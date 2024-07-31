.class public final Lc7/fa;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/rc;

.field public final synthetic i:Lcom/google/android/gms/internal/measurement/zzcv;

.field public final synthetic j:Lc7/y9;


# direct methods
.method public constructor <init>(Lc7/y9;Lc7/rc;Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/fa;->h:Lc7/rc;

    iput-object p3, p0, Lc7/fa;->i:Lcom/google/android/gms/internal/measurement/zzcv;

    iput-object p1, p0, Lc7/fa;->j:Lc7/y9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const-string v0, "Failed to get app instance id"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lc7/fa;->j:Lc7/y9;

    invoke-virtual {v2}, Lc7/j7;->e()Lc7/i5;

    move-result-object v2

    invoke-virtual {v2}, Lc7/i5;->G()Lc7/n7;

    move-result-object v2

    invoke-virtual {v2}, Lc7/n7;->y()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lc7/fa;->j:Lc7/y9;

    invoke-virtual {v2}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->H()Lc7/x4;

    move-result-object v2

    const-string v3, "Analytics storage consent denied; will not get app instance id"

    invoke-virtual {v2, v3}, Lc7/x4;->a(Ljava/lang/String;)V

    iget-object v2, p0, Lc7/fa;->j:Lc7/y9;

    invoke-virtual {v2}, Lc7/f4;->m()Lc7/w7;

    move-result-object v2

    invoke-virtual {v2, v1}, Lc7/w7;->P(Ljava/lang/String;)V

    iget-object v2, p0, Lc7/fa;->j:Lc7/y9;

    invoke-virtual {v2}, Lc7/j7;->e()Lc7/i5;

    move-result-object v2

    iget-object v2, v2, Lc7/i5;->i:Lc7/o5;

    invoke-virtual {v2, v1}, Lc7/o5;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object v0, p0, Lc7/fa;->j:Lc7/y9;

    invoke-virtual {v0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v0

    iget-object v2, p0, Lc7/fa;->i:Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v0, v2, v1}, Lc7/qc;->R(Lcom/google/android/gms/internal/measurement/zzcv;Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_1
    iget-object v2, p0, Lc7/fa;->j:Lc7/y9;

    invoke-static {v2}, Lc7/y9;->w(Lc7/y9;)Lc7/o4;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lc7/fa;->j:Lc7/y9;

    invoke-virtual {v2}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    invoke-virtual {v2, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lc7/fa;->h:Lc7/rc;

    invoke-static {v3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lc7/fa;->h:Lc7/rc;

    invoke-interface {v2, v3}, Lc7/o4;->y(Lc7/rc;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, p0, Lc7/fa;->j:Lc7/y9;

    invoke-virtual {v2}, Lc7/f4;->m()Lc7/w7;

    move-result-object v2

    invoke-virtual {v2, v1}, Lc7/w7;->P(Ljava/lang/String;)V

    iget-object v2, p0, Lc7/fa;->j:Lc7/y9;

    invoke-virtual {v2}, Lc7/j7;->e()Lc7/i5;

    move-result-object v2

    iget-object v2, v2, Lc7/i5;->i:Lc7/o5;

    invoke-virtual {v2, v1}, Lc7/o5;->b(Ljava/lang/String;)V

    :cond_2
    iget-object v2, p0, Lc7/fa;->j:Lc7/y9;

    invoke-static {v2}, Lc7/y9;->h0(Lc7/y9;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v2

    :try_start_2
    iget-object v3, p0, Lc7/fa;->j:Lc7/y9;

    invoke-virtual {v3}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->B()Lc7/x4;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :goto_1
    iget-object v2, p0, Lc7/fa;->j:Lc7/y9;

    invoke-virtual {v2}, Lc7/j7;->f()Lc7/qc;

    move-result-object v2

    iget-object v3, p0, Lc7/fa;->i:Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v2, v3, v1}, Lc7/qc;->R(Lcom/google/android/gms/internal/measurement/zzcv;Ljava/lang/String;)V

    throw v0
.end method
