.class final Lcom/google/android/gms/internal/measurement/zzid;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final zza:Lcom/google/android/gms/internal/measurement/zzio;

.field private final zzb:[B


# direct methods
.method private constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzid;->zzb:[B

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzio;->zzb([B)Lcom/google/android/gms/internal/measurement/zzio;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzid;->zza:Lcom/google/android/gms/internal/measurement/zzio;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/google/android/gms/internal/measurement/zzic;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzid;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/measurement/zzhu;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzid;->zza:Lcom/google/android/gms/internal/measurement/zzio;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzio;->zzb()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzie;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzid;->zzb:[B

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzie;-><init>([B)V

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/measurement/zzio;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzid;->zza:Lcom/google/android/gms/internal/measurement/zzio;

    return-object v0
.end method
