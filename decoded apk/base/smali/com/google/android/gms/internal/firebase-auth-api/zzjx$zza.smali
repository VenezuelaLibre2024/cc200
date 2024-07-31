.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzb;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/firebase-auth-api/zzjx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zza"
.end annotation


# static fields
.field public static final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;

.field public static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;

.field public static final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;

    const-string v1, "AES_128_GCM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;

    const-string v1, "AES_256_GCM"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;

    const-string v1, "CHACHA20_POLY1305"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zza;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzb;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/firebase-auth-api/zzjy;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzjx$zzb;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
