.class public abstract Lcom/google/android/gms/internal/firebase-auth-api/zzmt;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<SerializationT::",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzow;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzxr;

.field private final zzb:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TSerializationT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzxr;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzxr;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzmt;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzxr;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzmt;->zzb:Ljava/lang/Class;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzxr;Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzmu;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzmt;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzxr;Ljava/lang/Class;)V

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/firebase-auth-api/zzmv;Lcom/google/android/gms/internal/firebase-auth-api/zzxr;Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/zzmt;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzow;",
            ">(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzmv<",
            "TSerializationT;>;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzxr;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzmt<",
            "TSerializationT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzms;

    invoke-direct {v0, p1, p2, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzms;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzxr;Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/zzmv;)V

    return-object v0
.end method


# virtual methods
.method public abstract zza(Lcom/google/android/gms/internal/firebase-auth-api/zzow;Lcom/google/android/gms/internal/firebase-auth-api/zzct;)Lcom/google/android/gms/internal/firebase-auth-api/zzbu;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TSerializationT;",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzct;",
            ")",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbu;"
        }
    .end annotation
.end method

.method public final zza()Lcom/google/android/gms/internal/firebase-auth-api/zzxr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzmt;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzxr;

    return-object v0
.end method

.method public final zzb()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TSerializationT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzmt;->zzb:Ljava/lang/Class;

    return-object v0
.end method
