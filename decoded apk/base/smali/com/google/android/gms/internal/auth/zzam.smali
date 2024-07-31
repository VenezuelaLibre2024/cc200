.class public final Lcom/google/android/gms/internal/auth/zzam;
.super Lh6/h;
.source ""


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lh6/e;Lf6/f$a;Lf6/f$b;)V
    .locals 7

    const/16 v3, 0x78

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lh6/h;-><init>(Landroid/content/Context;Landroid/os/Looper;ILh6/e;Lf6/f$a;Lf6/f$b;)V

    return-void
.end method


# virtual methods
.method public final synthetic createServiceInterface(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 0

    invoke-static {p1}, Lu5/f;->c(Landroid/os/IBinder;)Lu5/g;

    move-result-object p1

    return-object p1
.end method

.method public final getApiFeatures()[Le6/d;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Le6/d;

    sget-object v1, Lt5/k;->n:Le6/d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public final getMinApkVersion()I
    .locals 1

    const v0, 0xbdfcb8

    return v0
.end method

.method public final getServiceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.account.IWorkAccountService"

    return-object v0
.end method

.method public final getStartServiceAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.account.workaccount.START"

    return-object v0
.end method

.method public final usesClientTelemetry()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
