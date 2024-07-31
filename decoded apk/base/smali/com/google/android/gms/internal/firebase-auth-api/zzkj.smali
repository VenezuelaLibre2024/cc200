.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzkj;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final zza:Ljava/lang/String; = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey"

.field private static final zzb:Ljava/lang/String; = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"

.field private static final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzvv;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzvv;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final zze:Lcom/google/android/gms/internal/firebase-auth-api/zzvv;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzvv;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzvv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzkj;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzvv;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzvv;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzvv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzkj;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzvv;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzvv;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzvv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzkj;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzvv;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzkj;->zza()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static zza()V
    .locals 15

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzkm;->zzc()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzko;->zzc()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzcx;->zza()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzis;->zza()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzic;->zzb()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzje;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzje;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzjj;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzjj;-><init>()V

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzcu;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzoq;Lcom/google/android/gms/internal/firebase-auth-api/zznb;Z)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjq;->zza()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zznt;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zznt;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzc;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzc;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzb;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzb;

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    sget-object v6, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zze;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zze;

    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    sget-object v7, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzd;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzd;

    invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzer;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v8

    const/16 v9, 0xc

    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v8

    const/16 v10, 0x10

    invoke-virtual {v8, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v8

    invoke-virtual {v8, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v8

    sget-object v11, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zzb;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzer$zzb;

    invoke-virtual {v8, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzer$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzer;

    move-result-object v8

    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzci;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjl;

    move-result-object v3

    const-string v8, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM"

    invoke-interface {v1, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    sget-object v8, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzd;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzd;

    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzer;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v12

    invoke-virtual {v12, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v12

    invoke-virtual {v12, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v12

    invoke-virtual {v12, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v12

    invoke-virtual {v12, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzer$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v12

    invoke-virtual {v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzer;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzci;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjl;

    move-result-object v3

    const-string v12, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW"

    invoke-interface {v1, v12, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    sget-object v12, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zze;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zze;

    invoke-virtual {v3, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzer;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v13

    invoke-virtual {v13, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v13

    invoke-virtual {v13, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v13

    invoke-virtual {v13, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v13

    invoke-virtual {v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzer$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v13

    invoke-virtual {v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzer;

    move-result-object v13

    invoke-virtual {v3, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzci;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjl;

    move-result-object v3

    const-string v13, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM"

    invoke-interface {v1, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzer;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v13

    invoke-virtual {v13, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v13

    invoke-virtual {v13, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v13

    invoke-virtual {v13, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v13

    invoke-virtual {v13, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzer$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v13

    invoke-virtual {v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzer;

    move-result-object v13

    invoke-virtual {v3, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzci;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjl;

    move-result-object v3

    const-string v13, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW"

    invoke-interface {v1, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzer;->zze()Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v13

    invoke-virtual {v13, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v9

    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v9

    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v9

    invoke-virtual {v9, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzer$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzer$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzer;

    move-result-object v9

    invoke-virtual {v3, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzci;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjl;

    move-result-object v3

    const-string v9, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX"

    invoke-interface {v1, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v9

    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v9

    const/16 v11, 0x20

    invoke-virtual {v9, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v9

    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v9

    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v9

    sget-object v13, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzb;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzb;

    invoke-virtual {v9, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v9

    sget-object v14, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;

    invoke-virtual {v9, v14}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzdm;

    move-result-object v9

    invoke-virtual {v3, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzci;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjl;

    move-result-object v3

    const-string v9, "ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256"

    invoke-interface {v1, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v6

    invoke-virtual {v6, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v6

    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v6

    invoke-virtual {v6, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v6

    invoke-virtual {v6, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v6

    invoke-virtual {v6, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v6

    invoke-virtual {v6, v14}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzdm;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzci;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjl;

    move-result-object v3

    const-string v6, "ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW"

    invoke-interface {v1, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v6

    invoke-virtual {v6, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v6

    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v6

    invoke-virtual {v6, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v6

    invoke-virtual {v6, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v6

    invoke-virtual {v6, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v6

    invoke-virtual {v6, v14}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzdm;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzci;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjl;

    move-result-object v3

    const-string v6, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256"

    invoke-interface {v1, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v12}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm;->zzf()Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v4

    invoke-virtual {v4, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zza(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v4

    invoke-virtual {v4, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zzb(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v4

    invoke-virtual {v4, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zzd(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v4

    invoke-virtual {v4, v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zzc(I)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v4

    invoke-virtual {v4, v13}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzb;)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v4

    invoke-virtual {v4, v14}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zzc;)Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzdm$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzdm;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzci;)Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjl$zza;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjl;

    move-result-object v3

    const-string v4, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zznt;->zza(Ljava/util/Map;)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzlk;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzlo;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzlo;-><init>()V

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzcu;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzoq;Lcom/google/android/gms/internal/firebase-auth-api/zznb;Z)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzkb;->zza()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zznt;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zznt;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    sget-object v6, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v2

    const-string v7, "DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM"

    invoke-interface {v1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    sget-object v7, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v2

    const-string v8, "DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW"

    invoke-interface {v1, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    sget-object v8, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v2

    const-string v9, "DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM"

    invoke-interface {v1, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v2

    const-string v9, "DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW"

    invoke-interface {v1, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    sget-object v9, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;

    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v2

    const-string v10, "DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305"

    invoke-interface {v1, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v2

    const-string v4, "DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW"

    invoke-interface {v1, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v2

    const-string v9, "DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM"

    invoke-interface {v1, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v2

    const-string v9, "DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW"

    invoke-interface {v1, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v2

    const-string v9, "DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM"

    invoke-interface {v1, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v2

    const-string v4, "DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW"

    invoke-interface {v1, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v2

    const-string v9, "DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM"

    invoke-interface {v1, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v2

    const-string v9, "DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW"

    invoke-interface {v1, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v2

    const-string v9, "DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM"

    invoke-interface {v1, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v2

    const-string v4, "DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW"

    invoke-interface {v1, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    sget-object v5, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v2

    const-string v9, "DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM"

    invoke-interface {v1, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v2

    const-string v6, "DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v2

    const-string v3, "DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzf;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzd;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zze;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;)Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzc;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzjx;

    move-result-object v2

    const-string v3, "DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zznt;->zza(Ljava/util/Map;)V

    return-void
.end method
