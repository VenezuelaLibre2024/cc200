.class public final Lc7/x8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lcom/google/android/gms/internal/measurement/zzcv;

.field public final synthetic i:Lc7/w7;


# direct methods
.method public constructor <init>(Lc7/w7;Lcom/google/android/gms/internal/measurement/zzcv;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/x8;->h:Lcom/google/android/gms/internal/measurement/zzcv;

    iput-object p1, p0, Lc7/x8;->i:Lc7/w7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lc7/x8;->i:Lc7/w7;

    invoke-virtual {v0}, Lc7/f4;->p()Lc7/gb;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpo;->zza()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lc7/j7;->a()Lc7/h;

    move-result-object v1

    sget-object v3, Lc7/i0;->z0:Lc7/m4;

    invoke-virtual {v1, v3}, Lc7/h;->o(Lc7/m4;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v1

    invoke-virtual {v1}, Lc7/i5;->G()Lc7/n7;

    move-result-object v1

    invoke-virtual {v1}, Lc7/n7;->y()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->H()Lc7/x4;

    move-result-object v0

    const-string v1, "Analytics storage consent denied; will not get session id"

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v1

    invoke-virtual {v0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v3

    invoke-interface {v3}, Lo6/d;->a()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lc7/i5;->t(J)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v1

    iget-object v1, v1, Lc7/i5;->s:Lc7/n5;

    invoke-virtual {v1}, Lc7/n5;->a()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->s:Lc7/n5;

    invoke-virtual {v0}, Lc7/n5;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->H()Lc7/x4;

    move-result-object v0

    const-string v1, "getSessionId has been disabled."

    :goto_0
    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_3
    :goto_1
    move-object v0, v2

    :goto_2
    if-eqz v0, :cond_4

    iget-object v1, p0, Lc7/x8;->i:Lc7/w7;

    iget-object v1, v1, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->G()Lc7/qc;

    move-result-object v1

    iget-object v2, p0, Lc7/x8;->h:Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lc7/qc;->P(Lcom/google/android/gms/internal/measurement/zzcv;J)V

    return-void

    :cond_4
    :try_start_0
    iget-object v0, p0, Lc7/x8;->h:Lcom/google/android/gms/internal/measurement/zzcv;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/measurement/zzcv;->zza(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lc7/x8;->i:Lc7/w7;

    iget-object v1, v1, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "getSessionId failed with exception"

    invoke-virtual {v1, v2, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
