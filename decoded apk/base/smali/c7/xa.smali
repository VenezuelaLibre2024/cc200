.class public final Lc7/xa;
.super Lc7/xb;
.source ""


# instance fields
.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc7/ab;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lc7/n5;

.field public final f:Lc7/n5;

.field public final g:Lc7/n5;

.field public final h:Lc7/n5;

.field public final i:Lc7/n5;


# direct methods
.method public constructor <init>(Lc7/yb;)V
    .locals 4

    invoke-direct {p0, p1}, Lc7/xb;-><init>(Lc7/yb;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lc7/xa;->d:Ljava/util/Map;

    new-instance p1, Lc7/n5;

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "last_delete_stale"

    const-wide/16 v2, 0x0

    invoke-direct {p1, v0, v1, v2, v3}, Lc7/n5;-><init>(Lc7/i5;Ljava/lang/String;J)V

    iput-object p1, p0, Lc7/xa;->e:Lc7/n5;

    new-instance p1, Lc7/n5;

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "backoff"

    invoke-direct {p1, v0, v1, v2, v3}, Lc7/n5;-><init>(Lc7/i5;Ljava/lang/String;J)V

    iput-object p1, p0, Lc7/xa;->f:Lc7/n5;

    new-instance p1, Lc7/n5;

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "last_upload"

    invoke-direct {p1, v0, v1, v2, v3}, Lc7/n5;-><init>(Lc7/i5;Ljava/lang/String;J)V

    iput-object p1, p0, Lc7/xa;->g:Lc7/n5;

    new-instance p1, Lc7/n5;

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "last_upload_attempt"

    invoke-direct {p1, v0, v1, v2, v3}, Lc7/n5;-><init>(Lc7/i5;Ljava/lang/String;J)V

    iput-object p1, p0, Lc7/xa;->h:Lc7/n5;

    new-instance p1, Lc7/n5;

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "midnight_offset"

    invoke-direct {p1, v0, v1, v2, v3}, Lc7/n5;-><init>(Lc7/i5;Ljava/lang/String;J)V

    iput-object p1, p0, Lc7/xa;->i:Lc7/n5;

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

.method public final s()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final t(Ljava/lang/String;)Landroid/util/Pair;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, ""

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v1

    invoke-interface {v1}, Lo6/d;->b()J

    move-result-wide v1

    iget-object v3, p0, Lc7/xa;->d:Ljava/util/Map;

    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc7/ab;

    if-eqz v3, :cond_0

    iget-wide v4, v3, Lc7/ab;->c:J

    cmp-long v4, v1, v4

    if-gez v4, :cond_0

    new-instance p1, Landroid/util/Pair;

    iget-object v0, v3, Lc7/ab;->a:Ljava/lang/String;

    iget-boolean v1, v3, Lc7/ab;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_0
    const/4 v4, 0x1

    invoke-static {v4}, Ls5/a;->b(Z)V

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v4

    invoke-virtual {v4, p1}, Lc7/h;->v(Ljava/lang/String;)J

    move-result-wide v4

    add-long/2addr v4, v1

    const/4 v6, 0x0

    const/4 v7, 0x0

    :try_start_0
    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v8

    sget-object v9, Lc7/i0;->d:Lc7/m4;

    invoke-virtual {v8, p1, v9}, Lc7/h;->u(Ljava/lang/String;Lc7/m4;)J

    move-result-wide v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const-wide/16 v10, 0x0

    cmp-long v10, v8, v10

    if-lez v10, :cond_1

    :try_start_1
    invoke-virtual {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10}, Ls5/a;->a(Landroid/content/Context;)Ls5/a$a;

    move-result-object v6
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    if-eqz v3, :cond_2

    :try_start_2
    iget-wide v10, v3, Lc7/ab;->c:J

    add-long/2addr v10, v8

    cmp-long v1, v1, v10

    if-gez v1, :cond_2

    new-instance v1, Landroid/util/Pair;

    iget-object v2, v3, Lc7/ab;->a:Ljava/lang/String;

    iget-boolean v3, v3, Lc7/ab;->b:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_1
    invoke-virtual {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Ls5/a;->a(Landroid/content/Context;)Ls5/a$a;

    move-result-object v6

    :cond_2
    :goto_0
    if-nez v6, :cond_3

    new-instance v1, Landroid/util/Pair;

    const-string v2, "00000000-0000-0000-0000-000000000000"

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_3
    invoke-virtual {v6}, Ls5/a$a;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v2, Lc7/ab;

    invoke-virtual {v6}, Ls5/a$a;->b()Z

    move-result v3

    invoke-direct {v2, v1, v3, v4, v5}, Lc7/ab;-><init>(Ljava/lang/String;ZJ)V

    goto :goto_1

    :cond_4
    new-instance v2, Lc7/ab;

    invoke-virtual {v6}, Ls5/a$a;->b()Z

    move-result v1

    invoke-direct {v2, v0, v1, v4, v5}, Lc7/ab;-><init>(Ljava/lang/String;ZJ)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->A()Lc7/x4;

    move-result-object v2

    const-string v3, "Unable to get advertising id"

    invoke-virtual {v2, v3, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v2, Lc7/ab;

    invoke-direct {v2, v0, v7, v4, v5}, Lc7/ab;-><init>(Ljava/lang/String;ZJ)V

    :goto_1
    iget-object v0, p0, Lc7/xa;->d:Ljava/util/Map;

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v7}, Ls5/a;->b(Z)V

    new-instance p1, Landroid/util/Pair;

    iget-object v0, v2, Lc7/ab;->a:Ljava/lang/String;

    iget-boolean v1, v2, Lc7/ab;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public final u(Ljava/lang/String;Lc7/n7;)Landroid/util/Pair;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lc7/n7;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-virtual {p2}, Lc7/n7;->x()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lc7/xa;->t(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v0, ""

    invoke-direct {p1, v0, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public final v(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lc7/j7;->i()V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lc7/xa;->t(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object p1

    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string p1, "00000000-0000-0000-0000-000000000000"

    :goto_0
    invoke-static {}, Lc7/qc;->O0()Ljava/security/MessageDigest;

    move-result-object p2

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    new-instance v4, Ljava/math/BigInteger;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    invoke-direct {v4, v1, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    aput-object v4, v2, v3

    const-string p1, "%032X"

    invoke-static {v0, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

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
