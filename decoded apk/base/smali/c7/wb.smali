.class public final Lc7/wb;
.super Lc7/ub;
.source ""


# direct methods
.method public constructor <init>(Lc7/yb;)V
    .locals 0

    invoke-direct {p0, p1}, Lc7/ub;-><init>(Lc7/yb;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Lc7/h;
    .locals 1

    invoke-super {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic c()Lc7/z;
    .locals 1

    invoke-super {p0}, Lc7/j7;->c()Lc7/z;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d()Lc7/u4;
    .locals 1

    invoke-super {p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic e()Lc7/i5;
    .locals 1

    invoke-super {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic f()Lc7/qc;
    .locals 1

    invoke-super {p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic g()V
    .locals 0

    invoke-super {p0}, Lc7/j7;->g()V

    return-void
.end method

.method public final bridge synthetic h()V
    .locals 0

    invoke-super {p0}, Lc7/j7;->h()V

    return-void
.end method

.method public final bridge synthetic i()V
    .locals 0

    invoke-super {p0}, Lc7/j7;->i()V

    return-void
.end method

.method public final bridge synthetic j()Lc7/ic;
    .locals 1

    invoke-super {p0}, Lc7/ub;->j()Lc7/ic;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic k()Lc7/xc;
    .locals 1

    invoke-super {p0}, Lc7/ub;->k()Lc7/xc;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic l()Lc7/m;
    .locals 1

    invoke-super {p0}, Lc7/ub;->l()Lc7/m;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic m()Lc7/u5;
    .locals 1

    invoke-super {p0}, Lc7/ub;->m()Lc7/u5;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic n()Lc7/xa;
    .locals 1

    invoke-super {p0}, Lc7/ub;->n()Lc7/xa;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic o()Lc7/wb;
    .locals 1

    invoke-super {p0}, Lc7/ub;->o()Lc7/wb;

    move-result-object v0

    return-object v0
.end method

.method public final p(Ljava/lang/String;)Landroid/net/Uri$Builder;
    .locals 4

    invoke-virtual {p0}, Lc7/ub;->m()Lc7/u5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/u5;->L(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/net/Uri$Builder;

    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v2

    sget-object v3, Lc7/i0;->Y:Lc7/m4;

    invoke-virtual {v2, p1, v3}, Lc7/h;->w(Ljava/lang/String;Lc7/m4;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v2

    sget-object v3, Lc7/i0;->Z:Lc7/m4;

    invoke-virtual {v2, p1, v3}, Lc7/h;->w(Ljava/lang/String;Lc7/m4;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    sget-object v2, Lc7/i0;->Z:Lc7/m4;

    invoke-virtual {v0, p1, v2}, Lc7/h;->w(Ljava/lang/String;Lc7/m4;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    sget-object v2, Lc7/i0;->a0:Lc7/m4;

    invoke-virtual {v0, p1, v2}, Lc7/h;->w(Ljava/lang/String;Lc7/m4;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    return-object v1
.end method

.method public final q(Ljava/lang/String;)Lc7/zb;
    .locals 5

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzqa;->zza()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    sget-object v1, Lc7/i0;->v0:Lc7/m4;

    invoke-virtual {v0, v1}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    const-string v1, "sgtm feature flag enabled."

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/ub;->l()Lc7/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/m;->y0(Ljava/lang/String;)Lc7/g5;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lc7/zb;

    invoke-virtual {p0, p1}, Lc7/wb;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lc7/zb;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lc7/g5;->u()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->F()Lc7/x4;

    move-result-object v1

    const-string v3, "sgtm upload enabled in manifest."

    invoke-virtual {v1, v3}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/ub;->m()Lc7/u5;

    move-result-object v1

    invoke-virtual {v0}, Lc7/g5;->v0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lc7/u5;->G(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfc$zzd;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzr()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzh()Lcom/google/android/gms/internal/measurement/zzfc$zzh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfc$zzh;->zzd()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfc$zzd;->zzh()Lcom/google/android/gms/internal/measurement/zzfc$zzh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfc$zzh;->zzc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->F()Lc7/x4;

    move-result-object v2

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v3, "Y"

    goto :goto_0

    :cond_4
    const-string v3, "N"

    :goto_0
    const-string v4, "sgtm configured with upload_url, server_info"

    invoke-virtual {v2, v4, v1, v3}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    new-instance v2, Lc7/zb;

    invoke-direct {v2, v1}, Lc7/zb;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "x-google-sgtm-server-info"

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lc7/zb;

    invoke-direct {v0, v1, v2}, Lc7/zb;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    move-object v2, v0

    :cond_6
    :goto_1
    if-eqz v2, :cond_7

    return-object v2

    :cond_7
    new-instance v0, Lc7/zb;

    invoke-virtual {p0, p1}, Lc7/wb;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lc7/zb;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final r(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lc7/ub;->m()Lc7/u5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/u5;->L(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object v0, Lc7/i0;->s:Lc7/m4;

    invoke-virtual {v0, v1}, Lc7/m4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lc7/i0;->s:Lc7/m4;

    invoke-virtual {p1, v1}, Lc7/m4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final bridge synthetic zza()Landroid/content/Context;
    .locals 1

    invoke-super {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzb()Lo6/d;
    .locals 1

    invoke-super {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzd()Lc7/c;
    .locals 1

    invoke-super {p0}, Lc7/j7;->zzd()Lc7/c;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzj()Lc7/v4;
    .locals 1

    invoke-super {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzl()Lc7/d6;
    .locals 1

    invoke-super {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    return-object v0
.end method
