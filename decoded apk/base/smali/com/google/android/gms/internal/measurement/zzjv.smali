.class public Lcom/google/android/gms/internal/measurement/zzjv;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final zza:Lcom/google/android/gms/internal/measurement/zzis;


# instance fields
.field private zzb:Lcom/google/android/gms/internal/measurement/zzhu;

.field private volatile zzc:Lcom/google/android/gms/internal/measurement/zzkr;

.field private volatile zzd:Lcom/google/android/gms/internal/measurement/zzhu;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzis;->zza:Lcom/google/android/gms/internal/measurement/zzis;

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzjv;->zza:Lcom/google/android/gms/internal/measurement/zzis;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final zzb(Lcom/google/android/gms/internal/measurement/zzkr;)Lcom/google/android/gms/internal/measurement/zzkr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzc:Lcom/google/android/gms/internal/measurement/zzkr;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzc:Lcom/google/android/gms/internal/measurement/zzkr;

    if-eqz v0, :cond_0

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_0
    :try_start_1
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzc:Lcom/google/android/gms/internal/measurement/zzkr;

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzhu;->zza:Lcom/google/android/gms/internal/measurement/zzhu;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzd:Lcom/google/android/gms/internal/measurement/zzhu;
    :try_end_1
    .catch Lcom/google/android/gms/internal/measurement/zzjq; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzc:Lcom/google/android/gms/internal/measurement/zzkr;

    sget-object p1, Lcom/google/android/gms/internal/measurement/zzhu;->zza:Lcom/google/android/gms/internal/measurement/zzhu;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzd:Lcom/google/android/gms/internal/measurement/zzhu;

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_1
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzc:Lcom/google/android/gms/internal/measurement/zzkr;

    return-object p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/zzjv;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzjv;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzc:Lcom/google/android/gms/internal/measurement/zzkr;

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzjv;->zzc:Lcom/google/android/gms/internal/measurement/zzkr;

    if-nez v0, :cond_2

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzjv;->zzc()Lcom/google/android/gms/internal/measurement/zzhu;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzjv;->zzc()Lcom/google/android/gms/internal/measurement/zzhu;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzhu;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    if-eqz v0, :cond_4

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzkt;->zzcf()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/google/android/gms/internal/measurement/zzjv;->zzb(Lcom/google/android/gms/internal/measurement/zzkr;)Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/zzkt;->zzcf()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzjv;->zzb(Lcom/google/android/gms/internal/measurement/zzkr;)Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzkr;)Lcom/google/android/gms/internal/measurement/zzkr;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzc:Lcom/google/android/gms/internal/measurement/zzkr;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzb:Lcom/google/android/gms/internal/measurement/zzhu;

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzd:Lcom/google/android/gms/internal/measurement/zzhu;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzc:Lcom/google/android/gms/internal/measurement/zzkr;

    return-object v0
.end method

.method public final zzb()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzd:Lcom/google/android/gms/internal/measurement/zzhu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzd:Lcom/google/android/gms/internal/measurement/zzhu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhu;->zzb()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzc:Lcom/google/android/gms/internal/measurement/zzkr;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzc:Lcom/google/android/gms/internal/measurement/zzkr;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzkr;->zzbw()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/measurement/zzhu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzd:Lcom/google/android/gms/internal/measurement/zzhu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzd:Lcom/google/android/gms/internal/measurement/zzhu;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzd:Lcom/google/android/gms/internal/measurement/zzhu;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzd:Lcom/google/android/gms/internal/measurement/zzhu;

    monitor-exit p0

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzc:Lcom/google/android/gms/internal/measurement/zzkr;

    if-nez v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzhu;->zza:Lcom/google/android/gms/internal/measurement/zzhu;

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzd:Lcom/google/android/gms/internal/measurement/zzhu;

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzc:Lcom/google/android/gms/internal/measurement/zzkr;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzkr;->zzbu()Lcom/google/android/gms/internal/measurement/zzhu;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjv;->zzd:Lcom/google/android/gms/internal/measurement/zzhu;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method