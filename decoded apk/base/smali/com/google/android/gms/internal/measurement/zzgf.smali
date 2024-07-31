.class public final synthetic Lcom/google/android/gms/internal/measurement/zzgf;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzgl;


# instance fields
.field private synthetic zza:Lcom/google/android/gms/internal/measurement/zzgg;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/zzgg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzgf;->zza:Lcom/google/android/gms/internal/measurement/zzgg;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgf;->zza:Lcom/google/android/gms/internal/measurement/zzgg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgg;->zzb()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
