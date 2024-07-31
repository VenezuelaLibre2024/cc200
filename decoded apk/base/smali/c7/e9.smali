.class public final Lc7/e9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final synthetic h:Lc7/w7;


# direct methods
.method public constructor <init>(Lc7/w7;)V
    .locals 0

    iput-object p1, p0, Lc7/e9;->h:Lc7/w7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lc7/e9;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    move-object/from16 v2, p4

    iget-object v3, v1, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v3}, Lc7/j7;->i()V

    :try_start_0
    iget-object v3, v1, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v3}, Lc7/j7;->f()Lc7/qc;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpz;->zza()Z

    move-result v4

    const/4 v6, 0x1

    if-eqz v4, :cond_0

    iget-object v4, v1, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v4}, Lc7/j7;->a()Lc7/h;

    move-result-object v4

    sget-object v7, Lc7/i0;->A0:Lc7/m4;

    invoke-virtual {v4, v7}, Lc7/h;->o(Lc7/m4;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzok;->zza()Z

    move-result v7

    if-eqz v7, :cond_1

    iget-object v7, v1, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v7}, Lc7/j7;->a()Lc7/h;

    move-result-object v7

    sget-object v8, Lc7/i0;->W0:Lc7/m4;

    invoke-virtual {v7, v8}, Lc7/h;->o(Lc7/m4;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v6

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    :goto_1
    invoke-static/range {p4 .. p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v9, "Activity created with data \'referrer\' without required params"

    const-string v10, "_cis"

    const-string v11, "utm_medium"

    const-string v12, "utm_source"

    const-string v13, "utm_campaign"

    const-string v15, "gclid"

    if-eqz v8, :cond_2

    :goto_2
    const/4 v3, 0x0

    goto :goto_3

    :cond_2
    :try_start_1
    invoke-virtual {v2, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    if-eqz v7, :cond_3

    const-string v8, "gbraid"

    invoke-virtual {v2, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    :cond_3
    invoke-virtual {v2, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    invoke-virtual {v2, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    invoke-virtual {v2, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    const-string v8, "utm_id"

    invoke-virtual {v2, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    const-string v8, "dclid"

    invoke-virtual {v2, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    const-string v8, "srsltid"

    invoke-virtual {v2, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    if-eqz v4, :cond_4

    const-string v8, "sfmc_id"

    invoke-virtual {v2, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    :cond_4
    invoke-virtual {v3}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->A()Lc7/x4;

    move-result-object v3

    invoke-virtual {v3, v9}, Lc7/x4;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v14, "https://google.com/search?"

    invoke-direct {v8, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    invoke-virtual {v3, v8, v4, v7}, Lc7/qc;->x(Landroid/net/Uri;ZZ)Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_6

    const-string v4, "referrer"

    invoke-virtual {v3, v10, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_6
    :goto_3
    const-string v4, "_cmp"

    if-eqz p1, :cond_a

    :try_start_2
    iget-object v7, v1, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v7}, Lc7/j7;->f()Lc7/qc;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpz;->zza()Z

    move-result v8

    if-eqz v8, :cond_7

    iget-object v8, v1, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v8}, Lc7/j7;->a()Lc7/h;

    move-result-object v8

    sget-object v14, Lc7/i0;->A0:Lc7/m4;

    invoke-virtual {v8, v14}, Lc7/h;->o(Lc7/m4;)Z

    move-result v8

    if-eqz v8, :cond_7

    move v8, v6

    goto :goto_4

    :cond_7
    const/4 v8, 0x0

    :goto_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzok;->zza()Z

    move-result v14

    if-eqz v14, :cond_8

    iget-object v14, v1, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v14}, Lc7/j7;->a()Lc7/h;

    move-result-object v14

    sget-object v5, Lc7/i0;->W0:Lc7/m4;

    invoke-virtual {v14, v5}, Lc7/h;->o(Lc7/m4;)Z

    move-result v5

    if-eqz v5, :cond_8

    move-object/from16 v5, p2

    move v14, v6

    goto :goto_5

    :cond_8
    move-object/from16 v5, p2

    const/4 v14, 0x0

    :goto_5
    invoke-virtual {v7, v5, v8, v14}, Lc7/qc;->x(Landroid/net/Uri;ZZ)Landroid/os/Bundle;

    move-result-object v5

    if-eqz v5, :cond_a

    const-string v7, "intent"

    invoke-virtual {v5, v10, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v15}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_9

    if-eqz v3, :cond_9

    invoke-virtual {v3, v15}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_9

    const-string v7, "_cer"

    const-string v8, "gclid=%s"

    new-array v10, v6, [Ljava/lang/Object;

    invoke-virtual {v3, v15}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const/16 v16, 0x0

    aput-object v14, v10, v16

    invoke-static {v8, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v7, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :cond_9
    const/16 v16, 0x0

    :goto_6
    iget-object v7, v1, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v7, v0, v4, v5}, Lc7/w7;->x0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v7, v1, Lc7/e9;->h:Lc7/w7;

    iget-object v7, v7, Lc7/w7;->n:Lc7/uc;

    invoke-virtual {v7, v0, v5}, Lc7/uc;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_7

    :cond_a
    const/16 v16, 0x0

    :goto_7
    invoke-static/range {p4 .. p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_b

    return-void

    :cond_b
    iget-object v5, v1, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v5}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v5

    invoke-virtual {v5}, Lc7/v4;->A()Lc7/x4;

    move-result-object v5

    const-string v7, "Activity created with referrer"

    invoke-virtual {v5, v7, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v5, v1, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v5}, Lc7/j7;->a()Lc7/h;

    move-result-object v5

    sget-object v7, Lc7/i0;->k0:Lc7/m4;

    invoke-virtual {v5, v7}, Lc7/h;->o(Lc7/m4;)Z

    move-result v5
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    const-string v7, "_ldl"

    const-string v8, "auto"

    if-eqz v5, :cond_d

    if-eqz v3, :cond_c

    :try_start_3
    iget-object v2, v1, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v2, v0, v4, v3}, Lc7/w7;->x0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v2, v1, Lc7/e9;->h:Lc7/w7;

    iget-object v2, v2, Lc7/w7;->n:Lc7/uc;

    invoke-virtual {v2, v0, v3}, Lc7/uc;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_8

    :cond_c
    iget-object v0, v1, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    const-string v3, "Referrer does not contain valid parameters"

    invoke-virtual {v0, v3, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_8
    iget-object v0, v1, Lc7/e9;->h:Lc7/w7;

    const/4 v2, 0x0

    invoke-virtual {v0, v8, v7, v2, v6}, Lc7/w7;->X(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    return-void

    :cond_d
    invoke-virtual {v2, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {v2, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    invoke-virtual {v2, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    invoke-virtual {v2, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    const-string v0, "utm_term"

    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    const-string v0, "utm_content"

    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_f

    :cond_e
    move v5, v6

    goto :goto_9

    :cond_f
    move/from16 v5, v16

    :goto_9
    if-nez v5, :cond_10

    iget-object v0, v1, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    invoke-virtual {v0, v9}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_10
    invoke-static/range {p4 .. p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, v1, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v0, v8, v7, v2, v6}, Lc7/w7;->X(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    :cond_11
    return-void

    :catch_0
    move-exception v0

    iget-object v1, v1, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Throwable caught in handleReferrerForOnActivityCreated"

    invoke-virtual {v1, v2, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    const-string v1, "onActivityCreated"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v0}, Lc7/f4;->n()Lc7/p9;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc7/p9;->A(Landroid/app/Activity;Landroid/os/Bundle;)V

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/net/Uri;->isHierarchical()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v2, "com.android.vending.referral_url"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    move-object v5, v1

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Landroid/net/Uri;->isHierarchical()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v1}, Lc7/j7;->f()Lc7/qc;

    invoke-static {v0}, Lc7/qc;->a0(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "gs"

    goto :goto_2

    :cond_5
    const-string v0, "auto"

    :goto_2
    move-object v6, v0

    const-string v0, "referrer"

    invoke-virtual {v5, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez p2, :cond_6

    const/4 v0, 0x1

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    :goto_3
    move v4, v0

    iget-object v0, p0, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v1, Lc7/i9;

    move-object v2, v1

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lc7/i9;-><init>(Lc7/e9;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lc7/d6;->y(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_4

    :catch_0
    move-exception v0

    :try_start_2
    iget-object v1, p0, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Throwable caught in onActivityCreated"

    invoke-virtual {v1, v2, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :goto_4
    iget-object v1, p0, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v1}, Lc7/f4;->n()Lc7/p9;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Lc7/p9;->A(Landroid/app/Activity;Landroid/os/Bundle;)V

    throw v0
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v0}, Lc7/f4;->n()Lc7/p9;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/p9;->z(Landroid/app/Activity;)V

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 4

    iget-object v0, p0, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v0}, Lc7/f4;->n()Lc7/p9;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/p9;->L(Landroid/app/Activity;)V

    iget-object p1, p0, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {p1}, Lc7/f4;->p()Lc7/gb;

    move-result-object p1

    invoke-virtual {p1}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->b()J

    move-result-wide v0

    invoke-virtual {p1}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v2

    new-instance v3, Lc7/jb;

    invoke-direct {v3, p1, v0, v1}, Lc7/jb;-><init>(Lc7/gb;J)V

    invoke-virtual {v2, v3}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 5

    iget-object v0, p0, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v0}, Lc7/f4;->p()Lc7/gb;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v1

    invoke-interface {v1}, Lo6/d;->b()J

    move-result-wide v1

    invoke-virtual {v0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v3

    new-instance v4, Lc7/fb;

    invoke-direct {v4, v0, v1, v2}, Lc7/fb;-><init>(Lc7/gb;J)V

    invoke-virtual {v3, v4}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v0}, Lc7/f4;->n()Lc7/p9;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/p9;->N(Landroid/app/Activity;)V

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lc7/e9;->h:Lc7/w7;

    invoke-virtual {v0}, Lc7/f4;->n()Lc7/p9;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc7/p9;->M(Landroid/app/Activity;Landroid/os/Bundle;)V

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
