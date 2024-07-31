.class final Lcom/google/android/gms/internal/location/zzcz;
.super Lw6/t0;
.source ""


# instance fields
.field private final zza:Lcom/google/android/gms/internal/location/zzcs;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/location/zzcs;)V
    .locals 0

    invoke-direct {p0}, Lw6/t0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/location/zzcz;->zza:Lcom/google/android/gms/internal/location/zzcs;

    return-void
.end method

.method public static bridge synthetic zzc(Lcom/google/android/gms/internal/location/zzcz;)Lcom/google/android/gms/internal/location/zzcs;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/location/zzcz;->zza:Lcom/google/android/gms/internal/location/zzcs;

    return-object p0
.end method


# virtual methods
.method public final zzd(Landroid/location/Location;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzcz;->zza:Lcom/google/android/gms/internal/location/zzcs;

    invoke-interface {v0}, Lcom/google/android/gms/internal/location/zzcs;->zza()Lg6/j;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/location/zzcx;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/location/zzcx;-><init>(Lcom/google/android/gms/internal/location/zzcz;Landroid/location/Location;)V

    invoke-virtual {v0, v1}, Lg6/j;->c(Lg6/j$b;)V

    return-void
.end method

.method public final zze()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzcz;->zza:Lcom/google/android/gms/internal/location/zzcs;

    invoke-interface {v0}, Lcom/google/android/gms/internal/location/zzcs;->zza()Lg6/j;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/location/zzcy;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/location/zzcy;-><init>(Lcom/google/android/gms/internal/location/zzcz;)V

    invoke-virtual {v0, v1}, Lg6/j;->c(Lg6/j$b;)V

    return-void
.end method

.method public final zzf(Lg6/j;)Lcom/google/android/gms/internal/location/zzcz;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzcz;->zza:Lcom/google/android/gms/internal/location/zzcs;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/location/zzcs;->zzc(Lg6/j;)V

    return-object p0
.end method

.method public final zzg()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzcz;->zza:Lcom/google/android/gms/internal/location/zzcs;

    invoke-interface {v0}, Lcom/google/android/gms/internal/location/zzcs;->zza()Lg6/j;

    move-result-object v0

    invoke-virtual {v0}, Lg6/j;->a()V

    return-void
.end method
