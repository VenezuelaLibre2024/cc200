.class final Lcom/google/android/gms/internal/auth/zzbu;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf6/m;


# instance fields
.field private final zza:Lcom/google/android/gms/common/api/Status;

.field private zzb:Lz5/c;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/zzbu;->zza:Lcom/google/android/gms/common/api/Status;

    return-void
.end method

.method public constructor <init>(Lz5/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/zzbu;->zzb:Lz5/c;

    sget-object p1, Lcom/google/android/gms/common/api/Status;->m:Lcom/google/android/gms/common/api/Status;

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/zzbu;->zza:Lcom/google/android/gms/common/api/Status;

    return-void
.end method


# virtual methods
.method public final getResponse()Lz5/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzbu;->zzb:Lz5/c;

    return-object v0
.end method

.method public final getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/zzbu;->zza:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
