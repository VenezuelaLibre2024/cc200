.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zza;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/firebase-auth-api/zzfa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zza"
.end annotation


# instance fields
.field private zza:Ljava/lang/Integer;

.field private zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zzb;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zza;->zza:Ljava/lang/Integer;

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zzb;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zzb;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zza;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zzb;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzfc;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zza;
    .locals 3

    const/16 v0, 0x10

    if-eq p1, v0, :cond_1

    const/16 v0, 0x20

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "Invalid key size %d; only 16-byte and 32-byte AES keys are supported"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zza;->zza:Ljava/lang/Integer;

    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zza;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zza;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zzb;

    return-object p0
.end method

.method public final zza()Lcom/google/android/gms/internal/firebase-auth-api/zzfa;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zza;->zza:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zza;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zzb;

    if-eqz v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzfa;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zza;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzfa$zzb;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzfa;-><init>(ILcom/google/android/gms/internal/firebase-auth-api/zzfa$zzb;Lcom/google/android/gms/internal/firebase-auth-api/zzfd;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method