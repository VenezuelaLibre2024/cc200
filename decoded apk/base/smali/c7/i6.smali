.class public final Lc7/i6;
.super Ljava/util/concurrent/FutureTask;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/FutureTask<",
        "TV;>;",
        "Ljava/lang/Comparable<",
        "Lc7/i6<",
        "TV;>;>;"
    }
.end annotation


# instance fields
.field public final h:J

.field public final i:Z

.field public final j:Ljava/lang/String;

.field public final synthetic k:Lc7/d6;


# direct methods
.method public constructor <init>(Lc7/d6;Ljava/lang/Runnable;ZLjava/lang/String;)V
    .locals 2

    iput-object p1, p0, Lc7/i6;->k:Lc7/d6;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzcl;->zza()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/measurement/zzcm;->zza(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p2

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    invoke-static {p4}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lc7/d6;->A()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, Lc7/i6;->h:J

    iput-object p4, p0, Lc7/i6;->j:Ljava/lang/String;

    iput-boolean p3, p0, Lc7/i6;->i:Z

    const-wide p2, 0x7fffffffffffffffL

    cmp-long p2, v0, p2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string p2, "Tasks index overflow"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Lc7/d6;Ljava/util/concurrent/Callable;ZLjava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "TV;>;Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lc7/i6;->k:Lc7/d6;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzcl;->zza()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/measurement/zzcm;->zza(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Callable;

    move-result-object p2

    invoke-direct {p0, p2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {p4}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lc7/d6;->A()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, Lc7/i6;->h:J

    iput-object p4, p0, Lc7/i6;->j:Ljava/lang/String;

    iput-boolean p3, p0, Lc7/i6;->i:Z

    const-wide p2, 0x7fffffffffffffffL

    cmp-long p2, v0, p2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string p2, "Tasks index overflow"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final synthetic compareTo(Ljava/lang/Object;)I
    .locals 6

    check-cast p1, Lc7/i6;

    iget-boolean v0, p0, Lc7/i6;->i:Z

    iget-boolean v1, p1, Lc7/i6;->i:Z

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-eq v0, v1, :cond_1

    if-eqz v0, :cond_0

    return v3

    :cond_0
    return v2

    :cond_1
    iget-wide v0, p0, Lc7/i6;->h:J

    iget-wide v4, p1, Lc7/i6;->h:J

    cmp-long p1, v0, v4

    if-gez p1, :cond_2

    return v3

    :cond_2
    cmp-long p1, v0, v4

    if-lez p1, :cond_3

    return v2

    :cond_3
    iget-object p1, p0, Lc7/i6;->k:Lc7/d6;

    invoke-virtual {p1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->D()Lc7/x4;

    move-result-object p1

    iget-wide v0, p0, Lc7/i6;->h:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "Two tasks share the same index. index"

    invoke-virtual {p1, v1, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final setException(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lc7/i6;->k:Lc7/d6;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    iget-object v1, p0, Lc7/i6;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-super {p0, p1}, Ljava/util/concurrent/FutureTask;->setException(Ljava/lang/Throwable;)V

    return-void
.end method