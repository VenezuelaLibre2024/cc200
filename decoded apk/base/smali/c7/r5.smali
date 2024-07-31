.class public final Lc7/r5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lc7/k6;


# direct methods
.method public constructor <init>(Lc7/yb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lc7/yb;->e0()Lc7/k6;

    move-result-object p1

    iput-object p1, p0, Lc7/r5;->a:Lc7/k6;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzby;)Landroid/os/Bundle;
    .locals 3

    iget-object v0, p0, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    const/4 v0, 0x0

    if-nez p2, :cond_0

    iget-object p1, p0, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->G()Lc7/x4;

    move-result-object p1

    const-string p2, "Attempting to use Install Referrer Service while it is not initialized"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "package_name"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/measurement/zzby;->zza(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string p2, "Install Referrer Service returned a null response"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :cond_1
    return-object p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->B()Lc7/x4;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Exception occurred while retrieving the Install Referrer"

    invoke-virtual {p2, v1, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final b()Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->zza()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lq6/c;->a(Landroid/content/Context;)Lq6/b;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->F()Lc7/x4;

    move-result-object v1

    const-string v2, "Failed to get PackageManager for Install Referrer Play Store compatibility check"

    invoke-virtual {v1, v2}, Lc7/x4;->a(Ljava/lang/String;)V

    return v0

    :cond_0
    const-string v2, "com.android.vending"

    const/16 v3, 0x80

    invoke-virtual {v1, v2, v3}, Lq6/b;->e(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v2, 0x4d17ab4

    if-lt v1, v2, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0

    :catch_0
    move-exception v1

    iget-object v2, p0, Lc7/r5;->a:Lc7/k6;

    invoke-virtual {v2}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->F()Lc7/x4;

    move-result-object v2

    const-string v3, "Failed to retrieve Play Store version for Install Referrer"

    invoke-virtual {v2, v3, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return v0
.end method
