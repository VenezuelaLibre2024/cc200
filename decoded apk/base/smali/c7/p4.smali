.class public final Lc7/p4;
.super Lc7/e3;
.source ""


# instance fields
.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:J

.field public i:J

.field public j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public k:Ljava/lang/String;

.field public l:I

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:J

.field public q:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lc7/k6;J)V
    .locals 2

    invoke-direct {p0, p1}, Lc7/e3;-><init>(Lc7/k6;)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lc7/p4;->p:J

    const/4 p1, 0x0

    iput-object p1, p0, Lc7/p4;->q:Ljava/lang/String;

    iput-wide p2, p0, Lc7/p4;->i:J

    return-void
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lc7/e3;->q()V

    iget-object v0, p0, Lc7/p4;->c:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lc7/p4;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final B()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/e3;->q()V

    iget-object v0, p0, Lc7/p4;->m:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lc7/p4;->m:Ljava/lang/String;

    return-object v0
.end method

.method public final C()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc7/p4;->j:Ljava/util/List;

    return-object v0
.end method

.method public final D()V
    .locals 6

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    invoke-virtual {v0}, Lc7/i5;->G()Lc7/n7;

    move-result-object v0

    sget-object v1, Lc7/n7$a;->j:Lc7/n7$a;

    invoke-virtual {v0, v1}, Lc7/n7;->l(Lc7/n7$a;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    const-string v3, "Analytics Storage consent is not granted"

    invoke-virtual {v0, v3}, Lc7/x4;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    new-array v0, v0, [B

    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v3

    invoke-virtual {v3}, Lc7/qc;->P0()Ljava/security/SecureRandom;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v4, v2, [Ljava/lang/Object;

    new-instance v5, Ljava/math/BigInteger;

    invoke-direct {v5, v2, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    aput-object v5, v4, v1

    const-string v0, "%032x"

    invoke-static {v3, v0, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->A()Lc7/x4;

    move-result-object v3

    new-array v2, v2, [Ljava/lang/Object;

    if-nez v0, :cond_1

    const-string v4, "null"

    goto :goto_1

    :cond_1
    const-string v4, "not null"

    :goto_1
    aput-object v4, v2, v1

    const-string v1, "Resetting session stitching token to %s"

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    iput-object v0, p0, Lc7/p4;->o:Ljava/lang/String;

    invoke-virtual {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lc7/p4;->p:J

    return-void
.end method

.method public final E()Ljava/lang/String;
    .locals 7

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzqg;->zza()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    sget-object v2, Lc7/i0;->l0:Lc7/m4;

    invoke-virtual {v0, v2}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    const-string v2, "Disabled IID for tests."

    :goto_0
    invoke-virtual {v0, v2}, Lc7/x4;->a(Ljava/lang/String;)V

    return-object v1

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v2, "com.google.firebase.analytics.FirebaseAnalytics"

    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    :try_start_1
    const-string v2, "getInstance"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    const-class v5, Landroid/content/Context;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-nez v2, :cond_2

    return-object v1

    :cond_2
    :try_start_2
    const-string v3, "getFirebaseInstanceId"

    new-array v4, v6, [Ljava/lang/Class;

    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v3, v6, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :catch_0
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->H()Lc7/x4;

    move-result-object v0

    const-string v2, "Failed to retrieve Firebase Instance Id"

    goto :goto_0

    :catch_1
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->I()Lc7/x4;

    move-result-object v0

    const-string v2, "Failed to obtain Firebase Analytics instance"

    goto :goto_0

    :catch_2
    return-object v1
.end method

.method public final F(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lc7/p4;->q:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object p1, p0, Lc7/p4;->q:Ljava/lang/String;

    return v0
.end method

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

    invoke-super {p0}, Lc7/f4;->g()V

    return-void
.end method

.method public final bridge synthetic h()V
    .locals 0

    invoke-super {p0}, Lc7/f4;->h()V

    return-void
.end method

.method public final bridge synthetic i()V
    .locals 0

    invoke-super {p0}, Lc7/f4;->i()V

    return-void
.end method

.method public final bridge synthetic j()Lc7/b0;
    .locals 1

    invoke-super {p0}, Lc7/f4;->j()Lc7/b0;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic k()Lc7/p4;
    .locals 1

    invoke-super {p0}, Lc7/f4;->k()Lc7/p4;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic l()Lc7/s4;
    .locals 1

    invoke-super {p0}, Lc7/f4;->l()Lc7/s4;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic m()Lc7/w7;
    .locals 1

    invoke-super {p0}, Lc7/f4;->m()Lc7/w7;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic n()Lc7/p9;
    .locals 1

    invoke-super {p0}, Lc7/f4;->n()Lc7/p9;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic o()Lc7/y9;
    .locals 1

    invoke-super {p0}, Lc7/f4;->o()Lc7/y9;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic p()Lc7/gb;
    .locals 1

    invoke-super {p0}, Lc7/f4;->p()Lc7/gb;

    move-result-object v0

    return-object v0
.end method

.method public final t()V
    .locals 11

    invoke-virtual {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "Unknown"

    const-string v3, ""

    const/4 v4, 0x0

    const-string v5, "unknown"

    const/high16 v6, -0x80000000

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v7

    invoke-virtual {v7}, Lc7/v4;->B()Lc7/x4;

    move-result-object v7

    invoke-static {v0}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "PackageManager is null, app identity information might be inaccurate. appId"

    invoke-virtual {v7, v9, v8}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    move-object v8, v2

    goto :goto_4

    :cond_1
    :try_start_0
    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v7

    invoke-virtual {v7}, Lc7/v4;->B()Lc7/x4;

    move-result-object v7

    invoke-static {v0}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "Error retrieving app installer package name. appId"

    invoke-virtual {v7, v9, v8}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    if-nez v5, :cond_2

    const-string v5, "manual_install"

    goto :goto_1

    :cond_2
    const-string v7, "com.android.vending"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    move-object v5, v3

    :cond_3
    :goto_1
    :try_start_1
    invoke-virtual {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v7

    if-eqz v7, :cond_0

    iget-object v8, v7, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v1, v8}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_4

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_2

    :cond_4
    move-object v8, v2

    :goto_2
    :try_start_2
    iget-object v2, v7, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iget v6, v7, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :catch_1
    move-object v7, v2

    move-object v2, v8

    goto :goto_3

    :catch_2
    move-object v7, v2

    :goto_3
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v8

    invoke-virtual {v8}, Lc7/v4;->B()Lc7/x4;

    move-result-object v8

    invoke-static {v0}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    const-string v10, "Error retrieving package info. appId, appName"

    invoke-virtual {v8, v10, v9, v2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v8, v2

    move-object v2, v7

    :goto_4
    iput-object v0, p0, Lc7/p4;->c:Ljava/lang/String;

    iput-object v5, p0, Lc7/p4;->f:Ljava/lang/String;

    iput-object v2, p0, Lc7/p4;->d:Ljava/lang/String;

    iput v6, p0, Lc7/p4;->e:I

    iput-object v8, p0, Lc7/p4;->g:Ljava/lang/String;

    const-wide/16 v5, 0x0

    iput-wide v5, p0, Lc7/p4;->h:J

    iget-object v2, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v2}, Lc7/k6;->H()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v5, 0x1

    if-nez v2, :cond_5

    iget-object v2, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v2}, Lc7/k6;->I()Ljava/lang/String;

    move-result-object v2

    const-string v6, "am"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    move v2, v5

    goto :goto_5

    :cond_5
    move v2, v4

    :goto_5
    iget-object v6, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v6}, Lc7/k6;->s()I

    move-result v6

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v7

    packed-switch v6, :pswitch_data_0

    invoke-virtual {v7}, Lc7/v4;->E()Lc7/x4;

    move-result-object v7

    const-string v8, "App measurement disabled"

    invoke-virtual {v7, v8}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v7

    invoke-virtual {v7}, Lc7/v4;->D()Lc7/x4;

    move-result-object v7

    const-string v8, "Invalid scion state in identity"

    goto :goto_6

    :pswitch_0
    invoke-virtual {v7}, Lc7/v4;->E()Lc7/x4;

    move-result-object v7

    const-string v8, "App measurement disabled due to denied storage consent"

    goto :goto_6

    :pswitch_1
    invoke-virtual {v7}, Lc7/v4;->E()Lc7/x4;

    move-result-object v7

    const-string v8, "App measurement disabled via the global data collection setting"

    goto :goto_6

    :pswitch_2
    invoke-virtual {v7}, Lc7/v4;->H()Lc7/x4;

    move-result-object v7

    const-string v8, "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"

    goto :goto_6

    :pswitch_3
    invoke-virtual {v7}, Lc7/v4;->F()Lc7/x4;

    move-result-object v7

    const-string v8, "App measurement disabled via the init parameters"

    goto :goto_6

    :pswitch_4
    invoke-virtual {v7}, Lc7/v4;->E()Lc7/x4;

    move-result-object v7

    const-string v8, "App measurement disabled via the manifest"

    goto :goto_6

    :pswitch_5
    invoke-virtual {v7}, Lc7/v4;->E()Lc7/x4;

    move-result-object v7

    const-string v8, "App measurement disabled by setAnalyticsCollectionEnabled(false)"

    goto :goto_6

    :pswitch_6
    invoke-virtual {v7}, Lc7/v4;->F()Lc7/x4;

    move-result-object v7

    const-string v8, "App measurement deactivated via the init parameters"

    goto :goto_6

    :pswitch_7
    invoke-virtual {v7}, Lc7/v4;->E()Lc7/x4;

    move-result-object v7

    const-string v8, "App measurement deactivated via the manifest"

    goto :goto_6

    :pswitch_8
    invoke-virtual {v7}, Lc7/v4;->F()Lc7/x4;

    move-result-object v7

    const-string v8, "App measurement collection enabled"

    :goto_6
    invoke-virtual {v7, v8}, Lc7/x4;->a(Ljava/lang/String;)V

    if-nez v6, :cond_6

    move v6, v5

    goto :goto_7

    :cond_6
    move v6, v4

    :goto_7
    iput-object v3, p0, Lc7/p4;->m:Ljava/lang/String;

    iput-object v3, p0, Lc7/p4;->n:Ljava/lang/String;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v2}, Lc7/k6;->H()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lc7/p4;->n:Ljava/lang/String;

    :cond_7
    :try_start_3
    invoke-virtual {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v2

    iget-object v7, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v7}, Lc7/k6;->K()Ljava/lang/String;

    move-result-object v7

    const-string v8, "google_app_id"

    new-instance v9, Lc7/e6;

    invoke-direct {v9, v2, v7}, Lc7/e6;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Lc7/e6;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_8

    goto :goto_8

    :cond_8
    move-object v3, v2

    :goto_8
    iput-object v3, p0, Lc7/p4;->m:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_9

    new-instance v2, Lc7/e6;

    invoke-virtual {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v3

    iget-object v7, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v7}, Lc7/k6;->K()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v2, v3, v7}, Lc7/e6;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const-string v3, "admob_app_id"

    invoke-virtual {v2, v3}, Lc7/e6;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lc7/p4;->n:Ljava/lang/String;

    :cond_9
    if-eqz v6, :cond_b

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->F()Lc7/x4;

    move-result-object v2

    const-string v3, "App measurement enabled for app package, google app id"

    iget-object v6, p0, Lc7/p4;->c:Ljava/lang/String;

    iget-object v7, p0, Lc7/p4;->m:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_a

    iget-object v7, p0, Lc7/p4;->n:Ljava/lang/String;

    goto :goto_9

    :cond_a
    iget-object v7, p0, Lc7/p4;->m:Ljava/lang/String;

    :goto_9
    invoke-virtual {v2, v3, v6, v7}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_a

    :catch_3
    move-exception v2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->B()Lc7/x4;

    move-result-object v3

    invoke-static {v0}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v6, "Fetching Google App Id failed with exception. appId"

    invoke-virtual {v3, v6, v0, v2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_b
    :goto_a
    const/4 v0, 0x0

    iput-object v0, p0, Lc7/p4;->j:Ljava/util/List;

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    const-string v2, "analytics.safelisted_events"

    invoke-virtual {v0, v2}, Lc7/h;->C(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->H()Lc7/x4;

    move-result-object v2

    const-string v3, "Safelisted event list is empty. Ignoring"

    invoke-virtual {v2, v3}, Lc7/x4;->a(Ljava/lang/String;)V

    :goto_b
    move v5, v4

    goto :goto_c

    :cond_c
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v6

    const-string v7, "safelisted event"

    invoke-virtual {v6, v7, v3}, Lc7/qc;->r0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_d

    goto :goto_b

    :cond_e
    :goto_c
    if-eqz v5, :cond_f

    iput-object v0, p0, Lc7/p4;->j:Ljava/util/List;

    :cond_f
    if-eqz v1, :cond_10

    invoke-virtual {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lq6/a;->a(Landroid/content/Context;)Z

    move-result v0

    iput v0, p0, Lc7/p4;->l:I

    return-void

    :cond_10
    iput v4, p0, Lc7/p4;->l:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final v()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final w(Ljava/lang/String;)Lc7/rc;
    .locals 47

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->i()V

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v1

    invoke-virtual {v1}, Lc7/i5;->G()Lc7/n7;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v2

    sget-object v3, Lc7/i0;->P0:Lc7/m4;

    invoke-virtual {v2, v3}, Lc7/h;->o(Lc7/m4;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v2

    invoke-virtual {v2}, Lc7/i5;->F()Lc7/w;

    move-result-object v2

    invoke-virtual {v2}, Lc7/w;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lc7/n7;->b()I

    move-result v3

    goto :goto_0

    :cond_0
    const-string v2, ""

    const/16 v3, 0x64

    :goto_0
    move-object/from16 v39, v2

    move/from16 v38, v3

    new-instance v2, Lc7/rc;

    invoke-virtual/range {p0 .. p0}, Lc7/p4;->A()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lc7/p4;->B()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lc7/e3;->q()V

    iget-object v7, v0, Lc7/p4;->d:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lc7/p4;->y()I

    move-result v3

    int-to-long v8, v3

    invoke-virtual/range {p0 .. p0}, Lc7/e3;->q()V

    iget-object v3, v0, Lc7/p4;->f:Ljava/lang/String;

    invoke-static {v3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v10, v0, Lc7/p4;->f:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lc7/e3;->q()V

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->i()V

    iget-wide v3, v0, Lc7/p4;->h:J

    const-wide/16 v13, 0x0

    cmp-long v3, v3, v13

    if-nez v3, :cond_1

    iget-object v3, v0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v3}, Lc7/k6;->G()Lc7/qc;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v15

    invoke-virtual {v15}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v3, v4, v15}, Lc7/qc;->u(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v3

    iput-wide v3, v0, Lc7/p4;->h:J

    :cond_1
    iget-wide v3, v0, Lc7/p4;->h:J

    iget-object v15, v0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v15}, Lc7/k6;->k()Z

    move-result v16

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v15

    iget-boolean v15, v15, Lc7/i5;->t:Z

    xor-int/lit8 v17, v15, 0x1

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->i()V

    iget-object v15, v0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v15}, Lc7/k6;->k()Z

    move-result v15

    const/16 v18, 0x0

    if-nez v15, :cond_2

    move-object/from16 v19, v18

    goto :goto_1

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lc7/p4;->E()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v19, v15

    :goto_1
    const-wide/16 v20, 0x0

    iget-object v15, v0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v15}, Lc7/k6;->A()Lc7/i5;

    move-result-object v11

    iget-object v11, v11, Lc7/i5;->g:Lc7/n5;

    invoke-virtual {v11}, Lc7/n5;->a()J

    move-result-wide v11

    cmp-long v24, v11, v13

    if-nez v24, :cond_3

    iget-wide v11, v15, Lc7/k6;->H:J

    goto :goto_2

    :cond_3
    iget-wide v13, v15, Lc7/k6;->H:J

    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v11

    :goto_2
    move-wide/from16 v26, v11

    invoke-virtual/range {p0 .. p0}, Lc7/p4;->x()I

    move-result v28

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v11

    invoke-virtual {v11}, Lc7/h;->L()Z

    move-result v29

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v11

    invoke-virtual {v11}, Lc7/j7;->i()V

    invoke-virtual {v11}, Lc7/i5;->D()Landroid/content/SharedPreferences;

    move-result-object v11

    const-string v12, "deferred_analytics_collection"

    const/4 v13, 0x0

    invoke-interface {v11, v12, v13}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v30

    invoke-virtual/range {p0 .. p0}, Lc7/p4;->z()Ljava/lang/String;

    move-result-object v31

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v11

    const-string v12, "google_analytics_default_allow_ad_personalization_signals"

    invoke-virtual {v11, v12}, Lc7/h;->x(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v11

    if-nez v11, :cond_4

    move-object/from16 v32, v18

    goto :goto_3

    :cond_4
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    xor-int/lit8 v11, v11, 0x1

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    move-object/from16 v32, v11

    :goto_3
    iget-wide v14, v0, Lc7/p4;->i:J

    iget-object v11, v0, Lc7/p4;->j:Ljava/util/List;

    const/16 v33, 0x0

    invoke-virtual {v1}, Lc7/n7;->v()Ljava/lang/String;

    move-result-object v1

    iget-object v12, v0, Lc7/p4;->k:Ljava/lang/String;

    if-nez v12, :cond_5

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v12

    invoke-virtual {v12}, Lc7/qc;->N0()Ljava/lang/String;

    move-result-object v12

    iput-object v12, v0, Lc7/p4;->k:Ljava/lang/String;

    :cond_5
    iget-object v12, v0, Lc7/p4;->k:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpt;->zza()Z

    move-result v34

    if-eqz v34, :cond_9

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v13

    move-wide/from16 v35, v3

    sget-object v3, Lc7/i0;->s0:Lc7/m4;

    invoke-virtual {v13, v3}, Lc7/h;->o(Lc7/m4;)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->i()V

    iget-wide v3, v0, Lc7/p4;->p:J

    const-wide/16 v24, 0x0

    cmp-long v3, v3, v24

    if-eqz v3, :cond_6

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v3

    invoke-interface {v3}, Lo6/d;->a()J

    move-result-wide v3

    move-object v13, v11

    move-object/from16 v37, v12

    iget-wide v11, v0, Lc7/p4;->p:J

    sub-long/2addr v3, v11

    iget-object v11, v0, Lc7/p4;->o:Ljava/lang/String;

    if-eqz v11, :cond_7

    const-wide/32 v11, 0x5265c00

    cmp-long v3, v3, v11

    if-lez v3, :cond_7

    iget-object v3, v0, Lc7/p4;->q:Ljava/lang/String;

    if-nez v3, :cond_7

    invoke-virtual/range {p0 .. p0}, Lc7/p4;->D()V

    goto :goto_4

    :cond_6
    move-object v13, v11

    move-object/from16 v37, v12

    :cond_7
    :goto_4
    iget-object v3, v0, Lc7/p4;->o:Ljava/lang/String;

    if-nez v3, :cond_8

    invoke-virtual/range {p0 .. p0}, Lc7/p4;->D()V

    :cond_8
    iget-object v3, v0, Lc7/p4;->o:Ljava/lang/String;

    goto :goto_5

    :cond_9
    move-wide/from16 v35, v3

    :cond_a
    move-object v13, v11

    move-object/from16 v37, v12

    const-wide/16 v24, 0x0

    move-object/from16 v3, v18

    :goto_5
    invoke-virtual/range {p0 .. p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v4

    const-string v11, "google_analytics_sgtm_upload_enabled"

    invoke-virtual {v4, v11}, Lc7/h;->x(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    if-nez v4, :cond_b

    const/16 v40, 0x0

    goto :goto_6

    :cond_b
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move/from16 v40, v4

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lc7/p4;->A()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4, v11}, Lc7/qc;->u0(Ljava/lang/String;)J

    move-result-wide v41

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzph;->zza()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v4

    sget-object v11, Lc7/i0;->I0:Lc7/m4;

    invoke-virtual {v4, v11}, Lc7/h;->o(Lc7/m4;)Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->f()Lc7/qc;

    invoke-static {}, Lc7/qc;->t0()I

    move-result v4

    move/from16 v44, v4

    goto :goto_7

    :cond_c
    const/16 v44, 0x0

    :goto_7
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzph;->zza()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v4

    sget-object v11, Lc7/i0;->I0:Lc7/m4;

    invoke-virtual {v4, v11}, Lc7/h;->o(Lc7/m4;)Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v4

    invoke-virtual {v4}, Lc7/qc;->D0()J

    move-result-wide v11

    move-wide/from16 v45, v11

    goto :goto_8

    :cond_d
    move-wide/from16 v45, v24

    :goto_8
    invoke-virtual/range {p0 .. p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v4

    invoke-virtual {v4}, Lc7/h;->K()Ljava/lang/String;

    move-result-object v43

    move-wide/from16 v24, v35

    move-object v4, v2

    move-object/from16 v34, v13

    move-object/from16 v35, v37

    const-wide/32 v11, 0x14822

    move-wide/from16 v36, v14

    move-wide/from16 v13, v24

    move-object/from16 v15, p1

    move-object/from16 v18, v19

    move-wide/from16 v19, v20

    move-wide/from16 v21, v26

    move/from16 v23, v28

    move/from16 v24, v29

    move/from16 v25, v30

    move-object/from16 v26, v31

    move-object/from16 v27, v32

    move-wide/from16 v28, v36

    move-object/from16 v30, v34

    move-object/from16 v31, v33

    move-object/from16 v32, v1

    move-object/from16 v33, v35

    move-object/from16 v34, v3

    move/from16 v35, v40

    move-wide/from16 v36, v41

    move/from16 v40, v44

    move-wide/from16 v41, v45

    invoke-direct/range {v4 .. v43}, Lc7/rc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;)V

    return-object v2
.end method

.method public final x()I
    .locals 1

    invoke-virtual {p0}, Lc7/e3;->q()V

    iget v0, p0, Lc7/p4;->l:I

    return v0
.end method

.method public final y()I
    .locals 1

    invoke-virtual {p0}, Lc7/e3;->q()V

    iget v0, p0, Lc7/p4;->e:I

    return v0
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lc7/e3;->q()V

    iget-object v0, p0, Lc7/p4;->n:Ljava/lang/String;

    return-object v0
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
