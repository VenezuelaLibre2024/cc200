.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzqb;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzqp;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/firebase-auth-api/zzqb$zza;
    }
.end annotation


# instance fields
.field private final zza:Lcom/google/android/gms/internal/firebase-auth-api/zzqm;

.field private final zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzxt;

.field private final zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzxr;

.field private final zzd:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzqm;Lcom/google/android/gms/internal/firebase-auth-api/zzxt;Lcom/google/android/gms/internal/firebase-auth-api/zzxr;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzqp;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqb;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzqm;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzxt;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqb;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzxr;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqb;->zzd:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzqm;Lcom/google/android/gms/internal/firebase-auth-api/zzxt;Lcom/google/android/gms/internal/firebase-auth-api/zzxr;Ljava/lang/Integer;Lcom/google/android/gms/internal/firebase-auth-api/zzqf;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzqb;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzqm;Lcom/google/android/gms/internal/firebase-auth-api/zzxt;Lcom/google/android/gms/internal/firebase-auth-api/zzxr;Ljava/lang/Integer;)V

    return-void
.end method

.method public static zzb()Lcom/google/android/gms/internal/firebase-auth-api/zzqb$zza;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzqb$zza;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzqb$zza;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzqd;)V

    return-object v0
.end method


# virtual methods
.method public final zza()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqb;->zzd:Ljava/lang/Integer;

    return-object v0
.end method

.method public final synthetic zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzqs;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqb;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzqm;

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzxr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqb;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzxr;

    return-object v0
.end method

.method public final zze()Lcom/google/android/gms/internal/firebase-auth-api/zzxt;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzqb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzxt;

    return-object v0
.end method
