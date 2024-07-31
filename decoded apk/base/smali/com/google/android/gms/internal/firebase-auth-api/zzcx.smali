.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzcx;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final zza:Ljava/lang/String; = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

.field public static final zzb:Ljava/lang/String; = "type.googleapis.com/google.crypto.tink.AesGcmKey"

.field private static final zzc:Ljava/lang/String; = "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

.field private static final zzd:Ljava/lang/String; = "type.googleapis.com/google.crypto.tink.AesEaxKey"

.field private static final zze:Ljava/lang/String; = "type.googleapis.com/google.crypto.tink.KmsAeadKey"

.field private static final zzf:Ljava/lang/String; = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

.field private static final zzg:Ljava/lang/String; = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

.field private static final zzh:Ljava/lang/String; = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

.field private static final zzi:Lcom/google/android/gms/internal/firebase-auth-api/zzvv;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final zzj:Lcom/google/android/gms/internal/firebase-auth-api/zzvv;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final zzk:Lcom/google/android/gms/internal/firebase-auth-api/zzvv;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzvv;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzvv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzcx;->zzi:Lcom/google/android/gms/internal/firebase-auth-api/zzvv;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzcx;->zzj:Lcom/google/android/gms/internal/firebase-auth-api/zzvv;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzcx;->zzk:Lcom/google/android/gms/internal/firebase-auth-api/zzvv;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzcx;->zza()V
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
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzdb;->zzc()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzqq;->zza()V

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzdj;->zza(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzeo;->zza(Z)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzic;->zzb()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzdz;->zza(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzew;->zza(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzfk;->zza(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzfw;->zza(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzga;->zza(Z)V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzgz;->zza(Z)V

    return-void
.end method
