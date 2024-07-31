.class public final Lz6/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:Lcom/google/android/gms/internal/maps/zzi;


# direct methods
.method public static a()Lz6/b;
    .locals 2

    :try_start_0
    new-instance v0, Lz6/b;

    invoke-static {}, Lz6/c;->f()Lcom/google/android/gms/internal/maps/zzi;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/maps/zzi;->zzd()Lr6/b;

    move-result-object v1

    invoke-direct {v0, v1}, Lz6/b;-><init>(Lr6/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public static b(F)Lz6/b;
    .locals 2

    :try_start_0
    new-instance v0, Lz6/b;

    invoke-static {}, Lz6/c;->f()Lcom/google/android/gms/internal/maps/zzi;

    move-result-object v1

    invoke-interface {v1, p0}, Lcom/google/android/gms/internal/maps/zzi;->zze(F)Lr6/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lz6/b;-><init>(Lr6/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lz6/v;

    invoke-direct {v0, p0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static c(Ljava/lang/String;)Lz6/b;
    .locals 2

    const-string v0, "assetName must not be null"

    invoke-static {p0, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lz6/b;

    invoke-static {}, Lz6/c;->f()Lcom/google/android/gms/internal/maps/zzi;

    move-result-object v1

    invoke-interface {v1, p0}, Lcom/google/android/gms/internal/maps/zzi;->zzf(Ljava/lang/String;)Lr6/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lz6/b;-><init>(Lr6/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lz6/v;

    invoke-direct {v0, p0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static d(Landroid/graphics/Bitmap;)Lz6/b;
    .locals 2

    const-string v0, "image must not be null"

    invoke-static {p0, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lz6/b;

    invoke-static {}, Lz6/c;->f()Lcom/google/android/gms/internal/maps/zzi;

    move-result-object v1

    invoke-interface {v1, p0}, Lcom/google/android/gms/internal/maps/zzi;->zzg(Landroid/graphics/Bitmap;)Lr6/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lz6/b;-><init>(Lr6/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lz6/v;

    invoke-direct {v0, p0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static e(Lcom/google/android/gms/internal/maps/zzi;)V
    .locals 1

    sget-object v0, Lz6/c;->a:Lcom/google/android/gms/internal/maps/zzi;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "delegate must not be null"

    invoke-static {p0, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/maps/zzi;

    sput-object p0, Lz6/c;->a:Lcom/google/android/gms/internal/maps/zzi;

    return-void
.end method

.method public static f()Lcom/google/android/gms/internal/maps/zzi;
    .locals 2

    sget-object v0, Lz6/c;->a:Lcom/google/android/gms/internal/maps/zzi;

    const-string v1, "IBitmapDescriptorFactory is not initialized"

    invoke-static {v0, v1}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/maps/zzi;

    return-object v0
.end method
