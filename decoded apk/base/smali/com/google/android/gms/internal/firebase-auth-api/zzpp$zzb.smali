.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/firebase-auth-api/zzpp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zzb"
.end annotation


# static fields
.field public static final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;

.field public static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;

.field public static final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;

.field public static final zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;


# instance fields
.field private final zze:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;

    const-string v1, "LEGACY"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;->zzd:Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;->zze:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzpp$zzb;->zze:Ljava/lang/String;

    return-object v0
.end method
