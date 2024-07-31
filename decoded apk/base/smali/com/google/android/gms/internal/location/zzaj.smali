.class final Lcom/google/android/gms/internal/location/zzaj;
.super Lcom/google/android/gms/internal/location/zzat;
.source ""


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/location/zzau;Lf6/f;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/location/zzat;-><init>(Lf6/f;)V

    return-void
.end method


# virtual methods
.method public final synthetic doExecute(Lf6/a$b;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/location/zzda;

    invoke-static {p0}, Lcom/google/android/gms/internal/location/zzau;->zza(Lg6/d;)Lcom/google/android/gms/tasks/TaskCompletionSource;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/location/zzda;->zzr(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
