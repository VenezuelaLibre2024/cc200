.class final Lcom/google/android/gms/internal/firebase-auth-api/zzahv;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaii;

.field private final zzb:[B


# direct methods
.method private constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzahv;->zzb:[B

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaii;->zzb([B)Lcom/google/android/gms/internal/firebase-auth-api/zzaii;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzahv;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaii;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/google/android/gms/internal/firebase-auth-api/zzahu;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahv;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/firebase-auth-api/zzahm;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzahv;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaii;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaii;->zzb()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzahw;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzahv;->zzb:[B

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzahw;-><init>([B)V

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzaii;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzahv;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaii;

    return-object v0
.end method
