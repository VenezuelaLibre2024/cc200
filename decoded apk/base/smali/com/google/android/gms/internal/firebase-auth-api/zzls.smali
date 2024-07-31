.class final Lcom/google/android/gms/internal/firebase-auth-api/zzls;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzlg;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwq;

.field private final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzkx;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzkx;Lcom/google/android/gms/internal/firebase-auth-api/zzwq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzls;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzkx;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzls;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwq;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwq;)Lcom/google/android/gms/internal/firebase-auth-api/zzls;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzlr;->zza:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/zzls;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzkx;

    const-string v1, "HmacSha512"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzkx;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzwq;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzwq;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzls;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzkx;Lcom/google/android/gms/internal/firebase-auth-api/zzwq;)V

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid curve type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/zzls;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzkx;

    const-string v1, "HmacSha384"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzkx;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzwq;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzwq;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzls;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzkx;Lcom/google/android/gms/internal/firebase-auth-api/zzwq;)V

    return-object p0

    :cond_2
    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/zzls;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzkx;

    const-string v1, "HmacSha256"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzkx;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zzwq;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwq;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzls;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzkx;Lcom/google/android/gms/internal/firebase-auth-api/zzwq;)V

    return-object p0
.end method


# virtual methods
.method public final zza()[B
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzlr;->zza:[I

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzls;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwq;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzlq;->zze:[B

    return-object v0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Could not determine HPKE KEM ID"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzlq;->zzd:[B

    return-object v0

    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzlq;->zzc:[B

    return-object v0
.end method

.method public final zza([BLcom/google/android/gms/internal/firebase-auth-api/zzli;)[B
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzls;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwq;

    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzli;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzxr;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzxr;->zzb()[B

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzwn;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwq;[B)Ljava/security/interfaces/ECPrivateKey;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzls;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwq;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/zzwp;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzwp;

    invoke-static {v1, v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzwn;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzwq;Lcom/google/android/gms/internal/firebase-auth-api/zzwp;[B)Ljava/security/interfaces/ECPublicKey;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzwn;->zza(Ljava/security/interfaces/ECPrivateKey;Ljava/security/interfaces/ECPublicKey;)[B

    move-result-object v4

    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzli;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzxr;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzxr;->zzb()[B

    move-result-object p2

    const/4 v0, 0x2

    new-array v0, v0, [[B

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzwi;->zza([[B)[B

    move-result-object v6

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzls;->zza()[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzlq;->zza([B)[B

    move-result-object v8

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzls;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzkx;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzkx;->zza()I

    move-result v9

    const/4 v3, 0x0

    const-string v5, "eae_prk"

    const-string v7, "shared_secret"

    invoke-virtual/range {v2 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzkx;->zza([B[BLjava/lang/String;[BLjava/lang/String;[BI)[B

    move-result-object p1

    return-object p1
.end method
