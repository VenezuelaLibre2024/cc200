.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzjx;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzkp;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;,
        Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;,
        Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;,
        Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;,
        Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;,
        Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzb;
    }
.end annotation


# instance fields
.field private final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;

.field private final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;

.field private final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;

.field private final zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzkp;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;Lcom/google/android/gms/internal/firebase-auth-api/zzka;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)V

    return-void
.end method

.method public static zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzjz;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;

    iget-object v2, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;

    iget-object v2, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;

    iget-object v2, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;

    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    aput-object v2, v0, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final zza()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;

    return-object v0
.end method

.method public final zze()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;

    return-object v0
.end method

.method public final zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;

    return-object v0
.end method
