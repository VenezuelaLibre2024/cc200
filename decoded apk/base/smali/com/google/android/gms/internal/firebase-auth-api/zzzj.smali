.class final Lcom/google/android/gms/internal/firebase-auth-api/zzzj;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zzadm;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzadm<",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzafc;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadm;

.field private final synthetic zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

.field private final synthetic zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzzg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzzg;Lcom/google/android/gms/internal/firebase-auth-api/zzadm;Lcom/google/android/gms/internal/firebase-auth-api/zzafm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzzj;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadm;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzzj;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzzj;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzzg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;)V
    .locals 6

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzafc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafc;->zza()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;

    new-instance v4, Lcom/google/android/gms/internal/firebase-auth-api/zzagb;

    invoke-direct {v4}, Lcom/google/android/gms/internal/firebase-auth-api/zzagb;-><init>()V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzzj;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzc()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzagb;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzagb;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzzj;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzzg;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzzg;->zza:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagb;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzagb;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzzj;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzzg;

    iget-object v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzzg;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzyl;

    iget-object v1, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzzg;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacf;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzzj;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzafm;

    iget-object v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzzj;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadm;

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzyl;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzyl;Lcom/google/android/gms/internal/firebase-auth-api/zzacf;Lcom/google/android/gms/internal/firebase-auth-api/zzafm;Lcom/google/android/gms/internal/firebase-auth-api/zzafb;Lcom/google/android/gms/internal/firebase-auth-api/zzagb;Lcom/google/android/gms/internal/firebase-auth-api/zzadj;)V

    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzzj;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadm;

    const-string v0, "No users."

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadj;->zza(Ljava/lang/String;)V

    return-void
.end method

.method public final zza(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lx7/r;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzzj;->zzc:Lcom/google/android/gms/internal/firebase-auth-api/zzzg;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzzg;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacf;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacf;->zza(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
