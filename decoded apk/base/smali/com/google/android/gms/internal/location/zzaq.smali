.class final Lcom/google/android/gms/internal/location/zzaq;
.super Lcom/google/android/gms/internal/location/zzat;
.source ""


# instance fields
.field public final synthetic zza:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/location/zzau;Lf6/f;Z)V
    .locals 0

    iput-boolean p3, p0, Lcom/google/android/gms/internal/location/zzaq;->zza:Z

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/location/zzat;-><init>(Lf6/f;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic doExecute(Lf6/a$b;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/location/zzda;

    iget-boolean v0, p0, Lcom/google/android/gms/internal/location/zzaq;->zza:Z

    invoke-static {p0}, Lcom/google/android/gms/internal/location/zzau;->zza(Lg6/d;)Lcom/google/android/gms/tasks/TaskCompletionSource;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/location/zzda;->zzA(ZLcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
