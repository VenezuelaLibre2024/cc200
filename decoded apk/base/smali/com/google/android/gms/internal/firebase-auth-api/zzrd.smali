.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzrd;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzpx;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzic$zza;


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzqb;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzic$zza;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzic$zza;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzrd;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzic$zza;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzqb;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzrd;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzic$zza;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzic$zza;->zza()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzrd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzqb;

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
