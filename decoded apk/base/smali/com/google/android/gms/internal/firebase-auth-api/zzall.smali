.class final Lcom/google/android/gms/internal/firebase-auth-api/zzall;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzalt;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/firebase-auth-api/zzalt;"
    }
.end annotation


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/firebase-auth-api/zzalh;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzalh;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzall;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzalh;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzalt;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzalh;Lcom/google/android/gms/internal/firebase-auth-api/zzals;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzalh;Lcom/google/android/gms/internal/firebase-auth-api/zzalk;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzall;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzalh;)V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzalj;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzall;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzalh;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzalj;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzalh;Lcom/google/android/gms/internal/firebase-auth-api/zzali;)V

    return-object v0
.end method
