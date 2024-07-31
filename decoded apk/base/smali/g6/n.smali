.class public final Lg6/n;
.super Lf6/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lf6/m;",
        ">",
        "Lf6/g<",
        "TR;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/google/android/gms/common/api/internal/BasePendingResult;


# direct methods
.method public constructor <init>(Lf6/h;)V
    .locals 0

    invoke-direct {p0}, Lf6/g;-><init>()V

    check-cast p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;

    iput-object p1, p0, Lg6/n;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    return-void
.end method


# virtual methods
.method public final addStatusListener(Lf6/h$a;)V
    .locals 1

    iget-object v0, p0, Lg6/n;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    invoke-virtual {v0, p1}, Lf6/h;->addStatusListener(Lf6/h$a;)V

    return-void
.end method

.method public final await()Lf6/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    iget-object v0, p0, Lg6/n;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->await()Lf6/m;

    move-result-object v0

    return-object v0
.end method

.method public final await(JLjava/util/concurrent/TimeUnit;)Lf6/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TR;"
        }
    .end annotation

    iget-object v0, p0, Lg6/n;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->await(JLjava/util/concurrent/TimeUnit;)Lf6/m;

    move-result-object p1

    return-object p1
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lg6/n;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->cancel()V

    return-void
.end method

.method public final isCanceled()Z
    .locals 1

    iget-object v0, p0, Lg6/n;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->isCanceled()Z

    move-result v0

    return v0
.end method

.method public final setResultCallback(Lf6/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/n<",
            "-TR;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lg6/n;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResultCallback(Lf6/n;)V

    return-void
.end method

.method public final setResultCallback(Lf6/n;JLjava/util/concurrent/TimeUnit;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/n<",
            "-TR;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lg6/n;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResultCallback(Lf6/n;JLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public final then(Lf6/p;)Lf6/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "Lf6/m;",
            ">(",
            "Lf6/p<",
            "-TR;+TS;>;)",
            "Lf6/q<",
            "TS;>;"
        }
    .end annotation

    iget-object v0, p0, Lg6/n;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    invoke-virtual {v0, p1}, Lf6/h;->then(Lf6/p;)Lf6/q;

    move-result-object p1

    return-object p1
.end method
