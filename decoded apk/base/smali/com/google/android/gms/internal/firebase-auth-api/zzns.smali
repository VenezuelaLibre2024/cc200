.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzns;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static zza:Lcom/google/android/gms/internal/firebase-auth-api/zzns;


# instance fields
.field private final zzb:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzol;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzns;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzns;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzns;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzok;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/zzok;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzon;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzok;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzol;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static zza()Lcom/google/android/gms/internal/firebase-auth-api/zzns;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzns;

    return-object v0
.end method


# virtual methods
.method public final zza(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<WrapperPrimitiveT:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TWrapperPrimitiveT;>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzol;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzol;->zza(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzbu;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<KeyT:",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbu;",
            "PrimitiveT:",
            "Ljava/lang/Object;",
            ">(TKeyT;",
            "Ljava/lang/Class<",
            "TPrimitiveT;>;)TPrimitiveT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzol;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzol;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzbu;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Lcom/google/android/gms/internal/firebase-auth-api/zzch;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<InputPrimitiveT:",
            "Ljava/lang/Object;",
            "WrapperPrimitiveT:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzch<",
            "TInputPrimitiveT;>;",
            "Ljava/lang/Class<",
            "TWrapperPrimitiveT;>;)TWrapperPrimitiveT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzol;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzol;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzch;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized zza(Lcom/google/android/gms/internal/firebase-auth-api/zzcq;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<InputPrimitiveT:",
            "Ljava/lang/Object;",
            "WrapperPrimitiveT:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzcq<",
            "TInputPrimitiveT;TWrapperPrimitiveT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzol;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzol;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzol;)Lcom/google/android/gms/internal/firebase-auth-api/zzok;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzok;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzcq;)Lcom/google/android/gms/internal/firebase-auth-api/zzok;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzok;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzol;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zza(Lcom/google/android/gms/internal/firebase-auth-api/zzoe;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<KeyT:",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzbu;",
            "PrimitiveT:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzoe<",
            "TKeyT;TPrimitiveT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/zzol;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzol;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzol;)Lcom/google/android/gms/internal/firebase-auth-api/zzok;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzok;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzoe;)Lcom/google/android/gms/internal/firebase-auth-api/zzok;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzok;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzol;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzns;->zzb:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
