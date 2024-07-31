.class public final synthetic Lcom/google/android/gms/internal/firebase-auth-api/zznu;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzph;


# static fields
.field public static final synthetic zza:Lcom/google/android/gms/internal/firebase-auth-api/zznu;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zznu;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zznu;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zznu;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zznv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zznv;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/zznx;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zznx;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zznc;

    const-class v3, Lcom/google/android/gms/internal/firebase-auth-api/zzot;

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzmx;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzmz;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzmx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zznv;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzmx;)V

    return-object v0
.end method
