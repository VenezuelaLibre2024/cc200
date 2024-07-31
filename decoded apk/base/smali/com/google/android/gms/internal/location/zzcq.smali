.class final Lcom/google/android/gms/internal/location/zzcq;
.super Lcom/google/android/gms/internal/location/zzr;
.source ""


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/location/zzcq;->zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p0}, Lcom/google/android/gms/internal/location/zzr;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(Lw6/r;)V
    .locals 2

    invoke-virtual {p1}, Lw6/r;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    new-instance v1, Lw6/q;

    invoke-direct {v1, p1}, Lw6/q;-><init>(Lw6/r;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/location/zzcq;->zza:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, p1}, Lg6/w;->b(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
