.class final Lcom/google/android/gms/internal/measurement/zzgi;
.super Landroid/database/ContentObserver;
.source ""


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/measurement/zzgg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzgg;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzgi;->zza:Lcom/google/android/gms/internal/measurement/zzgg;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final onChange(Z)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzgi;->zza:Lcom/google/android/gms/internal/measurement/zzgg;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzgg;->zzd()V

    return-void
.end method