.class final Lcom/google/android/gms/internal/firebase-auth-api/zzade;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadd;

.field private final synthetic zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacy;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzacy;Lcom/google/android/gms/internal/firebase-auth-api/zzadd;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzade;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadd;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzade;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzade;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacy;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacy;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zzh:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzade;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacy;

    iget-object v1, v1, Lcom/google/android/gms/internal/firebase-auth-api/zzacy;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    iget-object v1, v1, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zzh:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzade;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadd;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzade;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzacy;

    iget-object v2, v2, Lcom/google/android/gms/internal/firebase-auth-api/zzacy;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    iget-object v2, v2, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zzh:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/auth/b$b;

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v1, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzadd;->zza(Lcom/google/firebase/auth/b$b;[Ljava/lang/Object;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
