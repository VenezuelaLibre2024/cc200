.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzvl$zza;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zzb;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzakm;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/firebase-auth-api/zzvl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zzb<",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzvl;",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzvl$zza;",
        ">;",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzakm;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzvl;->zzc()Lcom/google/android/gms/internal/firebase-auth-api/zzvl;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zzb;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzaja;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzvk;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzvl$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzvm;)Lcom/google/android/gms/internal/firebase-auth-api/zzvl$zza;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zzb;->zzh()V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzaja$zzb;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzaja;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzvl;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzvl;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzvl;Lcom/google/android/gms/internal/firebase-auth-api/zzvm;)V

    return-object p0
.end method
