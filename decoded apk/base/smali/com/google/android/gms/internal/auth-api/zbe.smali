.class public final Lcom/google/android/gms/internal/auth-api/zbe;
.super Lh6/h;
.source ""


# instance fields
.field private final zba:Lv5/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lh6/e;Lv5/g;Lf6/f$a;Lf6/f$b;)V
    .locals 7

    const/16 v3, 0x44

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lh6/h;-><init>(Landroid/content/Context;Landroid/os/Looper;ILh6/e;Lf6/f$a;Lf6/f$b;)V

    new-instance p1, Lv5/f;

    if-nez p4, :cond_0

    sget-object p4, Lv5/g;->k:Lv5/g;

    :cond_0
    invoke-direct {p1, p4}, Lv5/f;-><init>(Lv5/g;)V

    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbat;->zba()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lv5/f;->a(Ljava/lang/String;)Lv5/f;

    new-instance p2, Lv5/g;

    invoke-direct {p2, p1}, Lv5/g;-><init>(Lv5/f;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/auth-api/zbe;->zba:Lv5/g;

    return-void
.end method


# virtual methods
.method public final synthetic createServiceInterface(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/auth-api/zbf;

    if-eqz v1, :cond_1

    move-object p1, v0

    check-cast p1, Lcom/google/android/gms/internal/auth-api/zbf;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/auth-api/zbf;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/auth-api/zbf;-><init>(Landroid/os/IBinder;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final getGetServiceRequestExtraArgs()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth-api/zbe;->zba:Lv5/g;

    invoke-virtual {v0}, Lv5/g;->a()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final getMinApkVersion()I
    .locals 1

    const v0, 0xc35000

    return v0
.end method

.method public final getServiceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"

    return-object v0
.end method

.method public final getStartServiceAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.service.START"

    return-object v0
.end method
