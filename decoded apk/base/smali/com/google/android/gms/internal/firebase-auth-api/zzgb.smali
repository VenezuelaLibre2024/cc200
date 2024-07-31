.class public Lcom/google/android/gms/internal/firebase-auth-api/zzgb;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzda;
.source ""


# instance fields
.field private final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzge;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzge;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzda;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzgb;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzge;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/firebase-auth-api/zzge;)Lcom/google/android/gms/internal/firebase-auth-api/zzgb;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzgb;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzgb;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzge;)V

    return-object v0
.end method


# virtual methods
.method public final zza()Ljava/lang/Integer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzge;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzgb;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzge;

    return-object v0
.end method
