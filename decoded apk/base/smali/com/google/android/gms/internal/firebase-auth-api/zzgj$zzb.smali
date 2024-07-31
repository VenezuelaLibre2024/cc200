.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/firebase-auth-api/zzgj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zzb"
.end annotation


# static fields
.field public static final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;

.field public static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;

.field public static final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;

.field public static final zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;

.field public static final zze:Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;

.field public static final zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;


# instance fields
.field private final zzg:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;

    const-string v1, "ASSUME_AES_GCM"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;

    const-string v1, "ASSUME_XCHACHA20POLY1305"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;

    const-string v1, "ASSUME_CHACHA20POLY1305"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;

    const-string v1, "ASSUME_AES_CTR_HMAC"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;

    const-string v1, "ASSUME_AES_EAX"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;->zze:Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;

    const-string v1, "ASSUME_AES_GCM_SIV"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;->zzg:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzgj$zzb;->zzg:Ljava/lang/String;

    return-object v0
.end method
