.class final Lcom/google/android/gms/internal/location/zzas;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/location/zzcs;


# instance fields
.field private zza:Lg6/j;


# direct methods
.method public constructor <init>(Lg6/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/location/zzas;->zza:Lg6/j;

    return-void
.end method


# virtual methods
.method public final declared-synchronized zza()Lg6/j;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzas;->zza:Lg6/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final zzb()V
    .locals 0

    return-void
.end method

.method public final declared-synchronized zzc(Lg6/j;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzas;->zza:Lg6/j;

    if-eq v0, p1, :cond_0

    invoke-virtual {v0}, Lg6/j;->a()V

    iput-object p1, p0, Lcom/google/android/gms/internal/location/zzas;->zza:Lg6/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
