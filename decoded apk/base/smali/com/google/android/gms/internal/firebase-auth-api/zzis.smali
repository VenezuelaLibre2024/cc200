.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzis;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final zza:Ljava/lang/String; = "type.googleapis.com/google.crypto.tink.AesSivKey"

.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzvv;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzvv;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzvv;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzvv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzis;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzvv;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzvv;->zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzvv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzis;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzvv;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzis;->zza()V
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
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzix;->zzc()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzic;->zzb()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzin;->zza(Z)V

    return-void
.end method
