.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzdm;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzdc;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;,
        Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzb;,
        Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;
    }
.end annotation


# instance fields
.field private final zza:I

.field private final zzb:I

.field private final zzc:I

.field private final zzd:I

.field private final zze:Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;

.field private final zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzb;


# direct methods
.method private constructor <init>(IIIILcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzb;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzdc;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zza:I

    iput p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzb:I

    iput p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzc:I

    iput p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzd:I

    iput-object p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;

    iput-object p6, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzb;

    return-void
.end method

.method public synthetic constructor <init>(IIIILcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzb;Lcom/google/android/gms/internal/firebase-auth-api/zzdo;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;-><init>(IIIILcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzb;)V

    return-void
.end method

.method public static zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzdn;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;

    iget v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zza:I

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zza:I

    if-ne v0, v2, :cond_1

    iget v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzb:I

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzb:I

    if-ne v0, v2, :cond_1

    iget v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzc:I

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzc:I

    if-ne v0, v2, :cond_1

    iget v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzd:I

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzd:I

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;

    if-ne v0, v2, :cond_1

    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzb;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzb;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;

    aput-object v2, v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zza:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzb:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzc:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzd:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzb;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzb;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzc:I

    iget v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzd:I

    iget v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zza:I

    iget v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzb:I

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "AesCtrHmacAead Parameters (variant: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", hashType: "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-byte IV, and "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-byte tags, and "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-byte AES key, and "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-byte HMAC key)"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzb()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zza:I

    return v0
.end method

.method public final zzc()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzb:I

    return v0
.end method

.method public final zzd()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzc:I

    return v0
.end method

.method public final zze()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzd:I

    return v0
.end method

.method public final zzg()Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzb;

    return-object v0
.end method

.method public final zzh()Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;

    return-object v0
.end method
