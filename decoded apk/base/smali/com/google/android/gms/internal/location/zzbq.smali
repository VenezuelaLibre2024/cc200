.class public final synthetic Lcom/google/android/gms/internal/location/zzbq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic zza:Lg6/d;


# direct methods
.method public synthetic constructor <init>(Lg6/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/location/zzbq;->zza:Lg6/d;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzbq;->zza:Lg6/d;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->m:Lcom/google/android/gms/common/api/Status;

    invoke-interface {v0, p1}, Lg6/d;->setResult(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p1, Lcom/google/android/gms/common/api/Status;->q:Lcom/google/android/gms/common/api/Status;

    invoke-interface {v0, p1}, Lg6/d;->setFailedResult(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    instance-of v1, p1, Lf6/b;

    if-eqz v1, :cond_2

    check-cast p1, Lf6/b;

    invoke-virtual {p1}, Lf6/b;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-interface {v0, p1}, Lg6/d;->setFailedResult(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_2
    sget-object p1, Lcom/google/android/gms/common/api/Status;->o:Lcom/google/android/gms/common/api/Status;

    invoke-interface {v0, p1}, Lg6/d;->setFailedResult(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
