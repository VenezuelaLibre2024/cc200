.class public final Lc7/ja;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/g0;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lcom/google/android/gms/internal/measurement/zzcv;

.field public final synthetic k:Lc7/y9;


# direct methods
.method public constructor <init>(Lc7/y9;Lc7/g0;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/ja;->h:Lc7/g0;

    iput-object p3, p0, Lc7/ja;->i:Ljava/lang/String;

    iput-object p4, p0, Lc7/ja;->j:Lcom/google/android/gms/internal/measurement/zzcv;

    iput-object p1, p0, Lc7/ja;->k:Lc7/y9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lc7/ja;->k:Lc7/y9;

    invoke-static {v1}, Lc7/y9;->w(Lc7/y9;)Lc7/o4;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lc7/ja;->k:Lc7/y9;

    invoke-virtual {v1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Discarding data. Failed to send event to service to bundle"

    invoke-virtual {v1, v2}, Lc7/x4;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object v1, p0, Lc7/ja;->k:Lc7/y9;

    invoke-virtual {v1}, Lc7/j7;->f()Lc7/qc;

    move-result-object v1

    iget-object v2, p0, Lc7/ja;->j:Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v1, v2, v0}, Lc7/qc;->U(Lcom/google/android/gms/internal/measurement/zzcv;[B)V

    return-void

    :cond_0
    :try_start_1
    iget-object v2, p0, Lc7/ja;->h:Lc7/g0;

    iget-object v3, p0, Lc7/ja;->i:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lc7/o4;->k(Lc7/g0;Ljava/lang/String;)[B

    move-result-object v0

    iget-object v1, p0, Lc7/ja;->k:Lc7/y9;

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
    iget-object v2, p0, Lc7/ja;->k:Lc7/y9;

    invoke-virtual {v2}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    const-string v3, "Failed to send event to the service to bundle"

    invoke-virtual {v2, v3, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :goto_1
    iget-object v2, p0, Lc7/ja;->k:Lc7/y9;

    invoke-virtual {v2}, Lc7/j7;->f()Lc7/qc;

    move-result-object v2

    iget-object v3, p0, Lc7/ja;->j:Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v2, v3, v0}, Lc7/qc;->U(Lcom/google/android/gms/internal/measurement/zzcv;[B)V

    throw v1
.end method
