.class public final Lc7/c5;
.super Lc7/xb;
.source ""


# direct methods
.method public constructor <init>(Lc7/yb;)V
    .locals 0

    invoke-direct {p0, p1}, Lc7/xb;-><init>(Lc7/yb;)V

    return-void
.end method

.method public static bridge synthetic t(Lc7/c5;Ljava/net/HttpURLConnection;)[B
    .locals 0

    invoke-static {p1}, Lc7/c5;->u(Ljava/net/HttpURLConnection;)[B

    move-result-object p0

    return-object p0
.end method

.method public static u(Ljava/net/HttpURLConnection;)[B
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    const/16 p0, 0x400

    new-array p0, p0, [B

    :goto_0
    invoke-virtual {v0, p0}, Ljava/io/InputStream;->read([B)I

    move-result v2

    if-lez v2, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v1, p0, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_1
    throw p0
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

.method public final s()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final v()Z
    .locals 2

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-virtual {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v0

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
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
