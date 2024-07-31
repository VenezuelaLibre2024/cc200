.class public final Lc7/o6;
.super Lc7/n4;
.source ""


# instance fields
.field public final a:Lc7/yb;

.field public b:Ljava/lang/Boolean;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lc7/yb;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lc7/o6;-><init>(Lc7/yb;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lc7/yb;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lc7/n4;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lc7/o6;->a:Lc7/yb;

    const/4 p1, 0x0

    iput-object p1, p0, Lc7/o6;->c:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic c(Lc7/o6;)Lc7/yb;
    .locals 0

    iget-object p0, p0, Lc7/o6;->a:Lc7/yb;

    return-object p0
.end method


# virtual methods
.method public final C0(Lc7/f;Lc7/rc;)V
    .locals 1

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lc7/f;->j:Lc7/lc;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lc7/o6;->O1(Lc7/rc;Z)V

    new-instance v0, Lc7/f;

    invoke-direct {v0, p1}, Lc7/f;-><init>(Lc7/f;)V

    iget-object p1, p2, Lc7/rc;->h:Ljava/lang/String;

    iput-object p1, v0, Lc7/f;->h:Ljava/lang/String;

    new-instance p1, Lc7/r6;

    invoke-direct {p1, p0, v0, p2}, Lc7/r6;-><init>(Lc7/o6;Lc7/f;Lc7/rc;)V

    invoke-virtual {p0, p1}, Lc7/o6;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final E1(Lc7/rc;Z)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc7/rc;",
            "Z)",
            "Ljava/util/List<",
            "Lc7/lc;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lc7/o6;->O1(Lc7/rc;Z)V

    iget-object v0, p1, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v1}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v1

    new-instance v2, Lc7/f7;

    invoke-direct {v2, p0, v0}, Lc7/f7;-><init>(Lc7/o6;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lc7/d6;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc7/nc;

    if-nez p2, :cond_1

    iget-object v3, v2, Lc7/nc;->c:Ljava/lang/String;

    invoke-static {v3}, Lc7/qc;->C0(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    :cond_1
    new-instance v3, Lc7/lc;

    invoke-direct {v3, v2}, Lc7/lc;-><init>(Lc7/nc;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    return-object v1

    :catch_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p2

    :goto_1
    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    iget-object p1, p1, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Failed to get user properties. appId"

    invoke-virtual {v0, v1, p1, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final M0(Lc7/rc;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lc7/o6;->O1(Lc7/rc;Z)V

    new-instance v0, Lc7/q6;

    invoke-direct {v0, p0, p1}, Lc7/q6;-><init>(Lc7/o6;Lc7/rc;)V

    invoke-virtual {p0, v0}, Lc7/o6;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final M1(Ljava/lang/String;Z)V
    .locals 3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_3

    :try_start_0
    iget-object p2, p0, Lc7/o6;->b:Ljava/lang/Boolean;

    if-nez p2, :cond_2

    const-string p2, "com.google.android.gms"

    iget-object v2, p0, Lc7/o6;->c:Ljava/lang/String;

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {p2}, Lc7/yb;->zza()Landroid/content/Context;

    move-result-object p2

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v2

    invoke-static {p2, v2}, Lo6/p;->a(Landroid/content/Context;I)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {p2}, Lc7/yb;->zza()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Le6/k;->a(Landroid/content/Context;)Le6/k;

    move-result-object p2

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v2

    invoke-virtual {p2, v2}, Le6/k;->c(I)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    move p2, v0

    goto :goto_1

    :cond_1
    :goto_0
    move p2, v1

    :goto_1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lc7/o6;->b:Ljava/lang/Boolean;

    :cond_2
    iget-object p2, p0, Lc7/o6;->b:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_5

    :cond_3
    iget-object p2, p0, Lc7/o6;->c:Ljava/lang/String;

    if-nez p2, :cond_4

    iget-object p2, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {p2}, Lc7/yb;->zza()Landroid/content/Context;

    move-result-object p2

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v2

    invoke-static {p2, v2, p1}, Le6/j;->k(Landroid/content/Context;ILjava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    iput-object p1, p0, Lc7/o6;->c:Ljava/lang/String;

    :cond_4
    iget-object p2, p0, Lc7/o6;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    :cond_5
    return-void

    :cond_6
    new-instance p2, Ljava/lang/SecurityException;

    const-string v2, "Unknown calling package name \'%s\'."

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p2

    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Measurement Service called with invalid calling package. appId"

    invoke-virtual {v0, v1, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    throw p2

    :cond_7
    iget-object p1, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {p1}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string p2, "Measurement Service called without app package"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/SecurityException;

    invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final N1(Lc7/g0;Lc7/rc;)Lc7/g0;
    .locals 8

    iget-object p2, p1, Lc7/g0;->h:Ljava/lang/String;

    const-string v0, "_cmp"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    iget-object p2, p1, Lc7/g0;->i:Lc7/a0;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lc7/a0;->I()I

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p1, Lc7/g0;->i:Lc7/a0;

    const-string v1, "_cis"

    invoke-virtual {p2, v1}, Lc7/a0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "referrer broadcast"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "referrer API"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    iget-object p2, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {p2}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->E()Lc7/x4;

    move-result-object p2

    invoke-virtual {p1}, Lc7/g0;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Event has been filtered "

    invoke-virtual {p2, v1, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance p2, Lc7/g0;

    iget-object v4, p1, Lc7/g0;->i:Lc7/a0;

    iget-object v5, p1, Lc7/g0;->j:Ljava/lang/String;

    iget-wide v6, p1, Lc7/g0;->k:J

    const-string v3, "_cmpx"

    move-object v2, p2

    invoke-direct/range {v2 .. v7}, Lc7/g0;-><init>(Ljava/lang/String;Lc7/a0;Ljava/lang/String;J)V

    return-object p2

    :cond_3
    return-object p1
.end method

.method public final O1(Lc7/rc;Z)V
    .locals 1

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p1, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {p2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object p2, p1, Lc7/rc;->h:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lc7/o6;->M1(Ljava/lang/String;Z)V

    iget-object p2, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {p2}, Lc7/yb;->j0()Lc7/qc;

    move-result-object p2

    iget-object v0, p1, Lc7/rc;->i:Ljava/lang/String;

    iget-object p1, p1, Lc7/rc;->x:Ljava/lang/String;

    invoke-virtual {p2, v0, p1}, Lc7/qc;->f0(Ljava/lang/String;Ljava/lang/String;)Z

    return-void
.end method

.method public final P1(Lc7/g0;Lc7/rc;)V
    .locals 7

    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v0

    iget-object v1, p2, Lc7/rc;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lc7/u5;->R(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lc7/o6;->Q1(Lc7/g0;Lc7/rc;)V

    return-void

    :cond_0
    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    iget-object v1, p2, Lc7/rc;->h:Ljava/lang/String;

    const-string v2, "EES config found for"

    invoke-virtual {v0, v2, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->d0()Lc7/u5;

    move-result-object v0

    iget-object v1, p2, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lc7/u5;->j:Lu/e;

    invoke-virtual {v0, v1}, Lu/e;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzb;

    :goto_0
    if-nez v0, :cond_2

    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    iget-object v1, p2, Lc7/rc;->h:Ljava/lang/String;

    const-string v2, "EES not loaded for"

    :goto_1
    invoke-virtual {v0, v2, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lc7/o6;->Q1(Lc7/g0;Lc7/rc;)V

    return-void

    :cond_2
    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v2}, Lc7/yb;->i0()Lc7/ic;

    move-result-object v2

    iget-object v3, p1, Lc7/g0;->i:Lc7/a0;

    invoke-virtual {v3}, Lc7/a0;->L()Landroid/os/Bundle;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Lc7/ic;->L(Landroid/os/Bundle;Z)Ljava/util/Map;

    move-result-object v2

    iget-object v3, p1, Lc7/g0;->h:Ljava/lang/String;

    invoke-static {v3}, Lc7/o7;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    iget-object v3, p1, Lc7/g0;->h:Ljava/lang/String;

    :cond_3
    new-instance v4, Lcom/google/android/gms/internal/measurement/zzad;

    iget-wide v5, p1, Lc7/g0;->k:J

    invoke-direct {v4, v3, v5, v6, v2}, Lcom/google/android/gms/internal/measurement/zzad;-><init>(Ljava/lang/String;JLjava/util/Map;)V

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/measurement/zzb;->zza(Lcom/google/android/gms/internal/measurement/zzad;)Z

    move-result v1
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/zzc; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    iget-object v2, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v2}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    iget-object v3, p2, Lc7/rc;->i:Ljava/lang/String;

    iget-object v4, p1, Lc7/g0;->h:Ljava/lang/String;

    const-string v5, "EES error. appId, eventName"

    invoke-virtual {v2, v5, v3, v4}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2
    if-nez v1, :cond_4

    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    iget-object v1, p1, Lc7/g0;->h:Ljava/lang/String;

    const-string v2, "EES was not applied to event"

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzb;->zzd()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v1}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->F()Lc7/x4;

    move-result-object v1

    iget-object p1, p1, Lc7/g0;->h:Ljava/lang/String;

    const-string v2, "EES edited event"

    invoke-virtual {v1, v2, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {p1}, Lc7/yb;->i0()Lc7/ic;

    move-result-object p1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzb;->zza()Lcom/google/android/gms/internal/measurement/zzac;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzac;->zzb()Lcom/google/android/gms/internal/measurement/zzad;

    move-result-object v1

    invoke-virtual {p1, v1}, Lc7/ic;->z(Lcom/google/android/gms/internal/measurement/zzad;)Lc7/g0;

    move-result-object p1

    :cond_5
    invoke-virtual {p0, p1, p2}, Lc7/o6;->Q1(Lc7/g0;Lc7/rc;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzb;->zzc()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzb;->zza()Lcom/google/android/gms/internal/measurement/zzac;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzac;->zzc()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzad;

    iget-object v1, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v1}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->F()Lc7/x4;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzad;->zzb()Ljava/lang/String;

    move-result-object v2

    const-string v3, "EES logging created event"

    invoke-virtual {v1, v3, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v1}, Lc7/yb;->i0()Lc7/ic;

    move-result-object v1

    invoke-virtual {v1, v0}, Lc7/ic;->z(Lcom/google/android/gms/internal/measurement/zzad;)Lc7/g0;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lc7/o6;->Q1(Lc7/g0;Lc7/rc;)V

    goto :goto_3

    :cond_6
    return-void
.end method

.method public final Q1(Lc7/g0;Lc7/rc;)V
    .locals 1

    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->k0()V

    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0, p1, p2}, Lc7/yb;->l(Lc7/g0;Lc7/rc;)V

    return-void
.end method

.method public final Y(Lc7/rc;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lc7/o6;->O1(Lc7/rc;Z)V

    new-instance v0, Lc7/p6;

    invoke-direct {v0, p0, p1}, Lc7/p6;-><init>(Lc7/o6;Lc7/rc;)V

    invoke-virtual {p0, v0}, Lc7/o6;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/d6;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e0(Ljava/lang/String;Ljava/lang/String;Lc7/rc;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lc7/rc;",
            ")",
            "Ljava/util/List<",
            "Lc7/f;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p3, v0}, Lc7/o6;->O1(Lc7/rc;Z)V

    iget-object p3, p3, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {p3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v1, Lc7/v6;

    invoke-direct {v1, p0, p3, p1, p2}, Lc7/v6;-><init>(Lc7/o6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lc7/d6;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    iget-object p2, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {p2}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->B()Lc7/x4;

    move-result-object p2

    const-string p3, "Failed to get conditional user properties"

    invoke-virtual {p2, p3, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final f0(Lc7/g0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    const/4 p3, 0x1

    invoke-virtual {p0, p2, p3}, Lc7/o6;->M1(Ljava/lang/String;Z)V

    new-instance p3, Lc7/b7;

    invoke-direct {p3, p0, p1, p2}, Lc7/b7;-><init>(Lc7/o6;Lc7/g0;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lc7/o6;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic g(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->a0()Lc7/m;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc7/m;->c0(Ljava/lang/String;Landroid/os/Bundle;)Z

    return-void
.end method

.method public final g0(Lc7/f;)V
    .locals 2

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lc7/f;->j:Lc7/lc;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lc7/f;->h:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lc7/f;->h:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lc7/o6;->M1(Ljava/lang/String;Z)V

    new-instance v0, Lc7/f;

    invoke-direct {v0, p1}, Lc7/f;-><init>(Lc7/f;)V

    new-instance p1, Lc7/u6;

    invoke-direct {p1, p0, v0}, Lc7/u6;-><init>(Lc7/o6;Lc7/f;)V

    invoke-virtual {p0, p1}, Lc7/o6;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final i(Lc7/rc;)Lc7/k;
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lc7/o6;->O1(Lc7/rc;Z)V

    iget-object v0, p1, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v2, Lc7/z6;

    invoke-direct {v2, p0, p1}, Lc7/z6;-><init>(Lc7/o6;Lc7/rc;)V

    invoke-virtual {v0, v2}, Lc7/d6;->w(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    const-wide/16 v2, 0x2710

    :try_start_0
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v4}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc7/k;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    iget-object v2, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v2}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    iget-object p1, p1, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v3, "Failed to get consent. appId"

    invoke-virtual {v2, v3, p1, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Lc7/k;

    invoke-direct {p1, v1}, Lc7/k;-><init>(Landroid/os/Bundle;)V

    return-object p1

    :cond_0
    new-instance p1, Lc7/k;

    invoke-direct {p1, v1}, Lc7/k;-><init>(Landroid/os/Bundle;)V

    return-object p1
.end method

.method public final i0(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    new-instance v7, Lc7/s6;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p4

    move-object v3, p5

    move-object v4, p3

    move-wide v5, p1

    invoke-direct/range {v0 .. v6}, Lc7/s6;-><init>(Lc7/o6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    invoke-virtual {p0, v7}, Lc7/o6;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final i1(Lc7/g0;Lc7/rc;)V
    .locals 1

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lc7/o6;->O1(Lc7/rc;Z)V

    new-instance v0, Lc7/c7;

    invoke-direct {v0, p0, p1, p2}, Lc7/c7;-><init>(Lc7/o6;Lc7/g0;Lc7/rc;)V

    invoke-virtual {p0, v0}, Lc7/o6;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final j(Lc7/rc;Landroid/os/Bundle;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc7/rc;",
            "Landroid/os/Bundle;",
            ")",
            "Ljava/util/List<",
            "Lc7/qb;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lc7/o6;->O1(Lc7/rc;Z)V

    iget-object v0, p1, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v1, Lc7/g7;

    invoke-direct {v1, p0, p1, p2}, Lc7/g7;-><init>(Lc7/o6;Lc7/rc;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Lc7/d6;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p2

    :try_start_0
    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p2

    goto :goto_0

    :catch_1
    move-exception p2

    :goto_0
    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    iget-object p1, p1, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Failed to get trigger URIs. appId"

    invoke-virtual {v0, v1, p1, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final k(Lc7/g0;Ljava/lang/String;)[B
    .locals 9

    invoke-static {p2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Lc7/o6;->M1(Ljava/lang/String;Z)V

    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    iget-object v1, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v1}, Lc7/yb;->b0()Lc7/u4;

    move-result-object v1

    iget-object v2, p1, Lc7/g0;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lc7/u4;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Log and bundle. event"

    invoke-virtual {v0, v2, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->c()J

    move-result-wide v0

    const-wide/32 v2, 0xf4240

    div-long/2addr v0, v2

    iget-object v4, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v4}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v4

    new-instance v5, Lc7/e7;

    invoke-direct {v5, p0, p1, p2}, Lc7/e7;-><init>(Lc7/o6;Lc7/g0;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lc7/d6;->w(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v4

    :try_start_0
    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    if-nez v4, :cond_0

    iget-object v4, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v4}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v4

    invoke-virtual {v4}, Lc7/v4;->B()Lc7/x4;

    move-result-object v4

    const-string v5, "Log and bundle returned null. appId"

    invoke-static {p2}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v4, 0x0

    new-array v4, v4, [B

    :cond_0
    iget-object v5, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v5}, Lc7/yb;->zzb()Lo6/d;

    move-result-object v5

    invoke-interface {v5}, Lo6/d;->c()J

    move-result-wide v5

    div-long/2addr v5, v2

    iget-object v2, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v2}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->A()Lc7/x4;

    move-result-object v2

    const-string v3, "Log and bundle processed. event, size, time_ms"

    iget-object v7, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v7}, Lc7/yb;->b0()Lc7/u4;

    move-result-object v7

    iget-object v8, p1, Lc7/g0;->h:Ljava/lang/String;

    invoke-virtual {v7, v8}, Lc7/u4;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    array-length v8, v4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    sub-long/2addr v5, v0

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v3, v7, v8, v0}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v4

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    iget-object v1, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v1}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    invoke-static {p2}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    iget-object v2, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v2}, Lc7/yb;->b0()Lc7/u4;

    move-result-object v2

    iget-object p1, p1, Lc7/g0;->h:Ljava/lang/String;

    invoke-virtual {v2, p1}, Lc7/u4;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "Failed to log and bundle. appId, event, error"

    invoke-virtual {v1, v2, p2, p1, v0}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final l1(Landroid/os/Bundle;Lc7/rc;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lc7/o6;->O1(Lc7/rc;Z)V

    iget-object p2, p2, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lc7/n6;

    invoke-direct {v0, p0, p2, p1}, Lc7/n6;-><init>(Lc7/o6;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Lc7/o6;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lc7/f;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lc7/o6;->M1(Ljava/lang/String;Z)V

    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v1, Lc7/y6;

    invoke-direct {v1, p0, p1, p2, p3}, Lc7/y6;-><init>(Lc7/o6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lc7/d6;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    iget-object p2, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {p2}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->B()Lc7/x4;

    move-result-object p2

    const-string p3, "Failed to get conditional user properties as"

    invoke-virtual {p2, p3, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final p0(Lc7/rc;)V
    .locals 2

    iget-object v0, p1, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lc7/rc;->h:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lc7/o6;->M1(Ljava/lang/String;Z)V

    new-instance v0, Lc7/x6;

    invoke-direct {v0, p0, p1}, Lc7/x6;-><init>(Lc7/o6;Lc7/rc;)V

    invoke-virtual {p0, v0}, Lc7/o6;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final q(Ljava/lang/String;Ljava/lang/String;ZLc7/rc;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lc7/rc;",
            ")",
            "Ljava/util/List<",
            "Lc7/lc;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p4, v0}, Lc7/o6;->O1(Lc7/rc;Z)V

    iget-object v0, p4, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v1}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v1

    new-instance v2, Lc7/t6;

    invoke-direct {v2, p0, v0, p1, p2}, Lc7/t6;-><init>(Lc7/o6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lc7/d6;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc7/nc;

    if-nez p3, :cond_1

    iget-object v1, v0, Lc7/nc;->c:Ljava/lang/String;

    invoke-static {v1}, Lc7/qc;->C0(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_1
    new-instance v1, Lc7/lc;

    invoke-direct {v1, v0}, Lc7/lc;-><init>(Lc7/nc;)V

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    return-object p2

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :goto_1
    iget-object p2, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {p2}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->B()Lc7/x4;

    move-result-object p2

    iget-object p3, p4, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {p3}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    const-string p4, "Failed to query user properties. appId"

    invoke-virtual {p2, p4, p3, p1}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final q0(Lc7/rc;)V
    .locals 1

    iget-object v0, p1, Lc7/rc;->h:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p1, Lc7/rc;->C:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lc7/a7;

    invoke-direct {v0, p0, p1}, Lc7/a7;-><init>(Lc7/o6;Lc7/rc;)V

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {p1}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object p1

    invoke-virtual {p1}, Lc7/d6;->E()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    iget-object p1, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {p1}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object p1

    invoke-virtual {p1, v0}, Lc7/d6;->B(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/List<",
            "Lc7/lc;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lc7/o6;->M1(Ljava/lang/String;Z)V

    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v1, Lc7/w6;

    invoke-direct {v1, p0, p1, p2, p3}, Lc7/w6;-><init>(Lc7/o6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lc7/d6;->r(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p2

    :try_start_0
    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    new-instance p3, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc7/nc;

    if-nez p4, :cond_1

    iget-object v1, v0, Lc7/nc;->c:Ljava/lang/String;

    invoke-static {v1}, Lc7/qc;->C0(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_1
    new-instance v1, Lc7/lc;

    invoke-direct {v1, v0}, Lc7/lc;-><init>(Lc7/nc;)V

    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    return-object p3

    :catch_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p2

    :goto_1
    iget-object p3, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {p3}, Lc7/yb;->zzj()Lc7/v4;

    move-result-object p3

    invoke-virtual {p3}, Lc7/v4;->B()Lc7/x4;

    move-result-object p3

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p4, "Failed to get user properties as. appId"

    invoke-virtual {p3, p4, p1, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final x1(Lc7/lc;Lc7/rc;)V
    .locals 1

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lc7/o6;->O1(Lc7/rc;Z)V

    new-instance v0, Lc7/d7;

    invoke-direct {v0, p0, p1, p2}, Lc7/d7;-><init>(Lc7/o6;Lc7/lc;Lc7/rc;)V

    invoke-virtual {p0, v0}, Lc7/o6;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final y(Lc7/rc;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lc7/o6;->O1(Lc7/rc;Z)V

    iget-object v0, p0, Lc7/o6;->a:Lc7/yb;

    invoke-virtual {v0, p1}, Lc7/yb;->N(Lc7/rc;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
