.class public Lcom/google/android/gms/internal/measurement/zzgr$zza;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzgr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zza"
.end annotation


# static fields
.field private static volatile zza:Lh7/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/l<",
            "Lcom/google/android/gms/internal/measurement/zzgp;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zza(Landroid/content/Context;)Lh7/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lh7/l<",
            "Lcom/google/android/gms/internal/measurement/zzgp;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/google/android/gms/internal/measurement/zzgr$zza;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzgr$zza;->zza:Lh7/l;

    if-nez v1, :cond_3

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzgr;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zzgr;-><init>()V

    sget-object v1, Landroid/os/Build;->TYPE:Ljava/lang/String;

    sget-object v2, Landroid/os/Build;->TAGS:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/zzgs;->zza(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lh7/l;->a()Lh7/l;

    move-result-object p0

    :goto_0
    move-object v1, p0

    goto :goto_2

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzge;->zza()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->isDeviceProtectedStorage()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->createDeviceProtectedStorageContext()Landroid/content/Context;

    move-result-object p0

    :cond_2
    :goto_1
    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/zzgr;->zza(Landroid/content/Context;)Lh7/l;

    move-result-object p0

    goto :goto_0

    :goto_2
    sput-object v1, Lcom/google/android/gms/internal/measurement/zzgr$zza;->zza:Lh7/l;

    :cond_3
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
