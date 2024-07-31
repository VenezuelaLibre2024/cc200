.class public final Lc7/t5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lcom/google/android/gms/internal/measurement/zzby;

.field public final synthetic i:Landroid/content/ServiceConnection;

.field public final synthetic j:Lc7/q5;


# direct methods
.method public constructor <init>(Lc7/q5;Lcom/google/android/gms/internal/measurement/zzby;Landroid/content/ServiceConnection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/t5;->h:Lcom/google/android/gms/internal/measurement/zzby;

    iput-object p3, p0, Lc7/t5;->i:Landroid/content/ServiceConnection;

    iput-object p1, p0, Lc7/t5;->j:Lc7/q5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lc7/t5;->j:Lc7/q5;

    iget-object v2, v1, Lc7/q5;->i:Lc7/r5;

    invoke-static {v1}, Lc7/q5;->a(Lc7/q5;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, v0, Lc7/t5;->h:Lcom/google/android/gms/internal/measurement/zzby;

    iget-object v4, v0, Lc7/t5;->i:Landroid/content/ServiceConnection;

    invoke-virtual {v2, v1, v3}, Lc7/r5;->a(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzby;)Landroid/os/Bundle;

    move-result-object v3

    iget-object v5, v2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v5}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v5

    invoke-virtual {v5}, Lc7/j7;->i()V

    iget-object v5, v2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v5}, Lc7/k6;->L()V

    if-eqz v3, :cond_a

    const-string v5, "install_begin_timestamp_seconds"

    const-wide/16 v6, 0x0

    invoke-virtual {v3, v5, v6, v7}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    const-wide/16 v10, 0x3e8

    mul-long/2addr v8, v10

    cmp-long v5, v8, v6

    if-nez v5, :cond_0

    iget-object v1, v2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->G()Lc7/x4;

    move-result-object v1

    const-string v3, "Service response is missing Install Referrer install timestamp"

    :goto_0
    invoke-virtual {v1, v3}, Lc7/x4;->a(Ljava/lang/String;)V

    goto/16 :goto_5

    :cond_0
    const-string v5, "install_referrer"

    invoke-virtual {v3, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_9

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_1

    goto/16 :goto_4

    :cond_1
    iget-object v12, v2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v12}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v12

    invoke-virtual {v12}, Lc7/v4;->F()Lc7/x4;

    move-result-object v12

    const-string v13, "InstallReferrer API result"

    invoke-virtual {v12, v13, v5}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v12, v2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v12}, Lc7/k6;->G()Lc7/qc;

    move-result-object v12

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "?"

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpz;->zza()Z

    move-result v13

    if-eqz v13, :cond_2

    iget-object v13, v2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v13}, Lc7/k6;->u()Lc7/h;

    move-result-object v13

    sget-object v14, Lc7/i0;->B0:Lc7/m4;

    invoke-virtual {v13, v14}, Lc7/h;->o(Lc7/m4;)Z

    move-result v13

    if-eqz v13, :cond_2

    const/4 v13, 0x1

    goto :goto_1

    :cond_2
    const/4 v13, 0x0

    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzok;->zza()Z

    move-result v14

    if-eqz v14, :cond_3

    iget-object v14, v2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v14}, Lc7/k6;->u()Lc7/h;

    move-result-object v14

    sget-object v15, Lc7/i0;->X0:Lc7/m4;

    invoke-virtual {v14, v15}, Lc7/h;->o(Lc7/m4;)Z

    move-result v14

    if-eqz v14, :cond_3

    const/4 v14, 0x1

    goto :goto_2

    :cond_3
    const/4 v14, 0x0

    :goto_2
    invoke-virtual {v12, v5, v13, v14}, Lc7/qc;->x(Landroid/net/Uri;ZZ)Landroid/os/Bundle;

    move-result-object v5

    if-nez v5, :cond_4

    iget-object v1, v2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v3, "No campaign params defined in Install Referrer result"

    goto :goto_0

    :cond_4
    const-string v12, "medium"

    invoke-virtual {v5, v12}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_5

    const-string v13, "(not set)"

    invoke-virtual {v13, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_5

    const-string v13, "organic"

    invoke-virtual {v13, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_5

    const/4 v14, 0x1

    goto :goto_3

    :cond_5
    const/4 v14, 0x0

    :goto_3
    if-eqz v14, :cond_7

    const-string v12, "referrer_click_timestamp_seconds"

    invoke-virtual {v3, v12, v6, v7}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v12

    mul-long/2addr v12, v10

    cmp-long v3, v12, v6

    if-nez v3, :cond_6

    iget-object v1, v2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v3, "Install Referrer is missing click timestamp for ad campaign"

    goto/16 :goto_0

    :cond_6
    const-string v3, "click_timestamp"

    invoke-virtual {v5, v3, v12, v13}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_7
    iget-object v3, v2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v3}, Lc7/k6;->A()Lc7/i5;

    move-result-object v3

    iget-object v3, v3, Lc7/i5;->h:Lc7/n5;

    invoke-virtual {v3}, Lc7/n5;->a()J

    move-result-wide v6

    cmp-long v3, v8, v6

    if-nez v3, :cond_8

    iget-object v3, v2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v3}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->F()Lc7/x4;

    move-result-object v3

    const-string v6, "Logging Install Referrer campaign from module while it may have already been logged."

    invoke-virtual {v3, v6}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_8
    iget-object v3, v2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v3}, Lc7/k6;->k()Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v3, v2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v3}, Lc7/k6;->A()Lc7/i5;

    move-result-object v3

    iget-object v3, v3, Lc7/i5;->h:Lc7/n5;

    invoke-virtual {v3, v8, v9}, Lc7/n5;->b(J)V

    iget-object v3, v2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v3}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->F()Lc7/x4;

    move-result-object v3

    const-string v6, "Logging Install Referrer campaign from gmscore with "

    const-string v7, "referrer API v2"

    invoke-virtual {v3, v6, v7}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "_cis"

    invoke-virtual {v5, v3, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v3}, Lc7/k6;->C()Lc7/w7;

    move-result-object v3

    const-string v6, "auto"

    const-string v7, "_cmp"

    invoke-virtual {v3, v6, v7, v5, v1}, Lc7/w7;->U(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    goto :goto_5

    :cond_9
    :goto_4
    iget-object v1, v2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v3, "No referrer defined in Install Referrer response"

    goto/16 :goto_0

    :cond_a
    :goto_5
    if-eqz v4, :cond_b

    invoke-static {}, Ln6/a;->b()Ln6/a;

    move-result-object v1

    iget-object v2, v2, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v2}, Lc7/k6;->zza()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, v4}, Ln6/a;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    :cond_b
    return-void
.end method
