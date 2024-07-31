.class final Lcom/google/android/gms/internal/location/zzal;
.super Lcom/google/android/gms/internal/location/zzat;
.source ""


# instance fields
.field public final synthetic zza:Lg6/j;

.field public final synthetic zzb:Lcom/google/android/gms/location/LocationRequest;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/location/zzau;Lf6/f;Lg6/j;Lcom/google/android/gms/location/LocationRequest;)V
    .locals 0

    iput-object p3, p0, Lcom/google/android/gms/internal/location/zzal;->zza:Lg6/j;

    iput-object p4, p0, Lcom/google/android/gms/internal/location/zzal;->zzb:Lcom/google/android/gms/location/LocationRequest;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/location/zzat;-><init>(Lf6/f;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic doExecute(Lf6/a$b;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/location/zzda;

    new-instance v0, Lcom/google/android/gms/internal/location/zzas;

    iget-object v1, p0, Lcom/google/android/gms/internal/location/zzal;->zza:Lg6/j;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/location/zzas;-><init>(Lg6/j;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/location/zzal;->zzb:Lcom/google/android/gms/location/LocationRequest;

    invoke-static {p0}, Lcom/google/android/gms/internal/location/zzau;->zza(Lg6/d;)Lcom/google/android/gms/tasks/TaskCompletionSource;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/location/zzda;->zzu(Lcom/google/android/gms/internal/location/zzcs;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
