.class final Lcom/google/android/gms/internal/firebase-auth-api/zzzd;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzadm;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzafm;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacf;

.field public final synthetic zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzyl;

.field private final synthetic zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzagx;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzyl;Lcom/google/android/gms/internal/firebase-auth-api/zzagx;Lcom/google/android/gms/internal/firebase-auth-api/zzacf;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzzd;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzagx;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzzd;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacf;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzzd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzyl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzzd;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzagx;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzc()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;->zza(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzzd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzyl;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzyl;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzyl;)Lcom/google/android/gms/internal/firebase-auth-api/zzadk;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzzd;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzagx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzzc;

    invoke-direct {v1, p0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzzc;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzzd;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadk;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzagx;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lx7/r;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzzd;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacf;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacf;->zza(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
