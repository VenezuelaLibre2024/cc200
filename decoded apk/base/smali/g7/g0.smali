.class public final Lg7/g0;
.super Lg7/d0;
.source ""


# instance fields
.field public final synthetic h:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic i:Lg7/d0;

.field public final synthetic j:Lg7/d;


# direct methods
.method public constructor <init>(Lg7/d;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Lg7/d0;)V
    .locals 0

    iput-object p1, p0, Lg7/g0;->j:Lg7/d;

    iput-object p3, p0, Lg7/g0;->h:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p4, p0, Lg7/g0;->i:Lg7/d0;

    invoke-direct {p0, p2}, Lg7/d0;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 4

    iget-object v0, p0, Lg7/g0;->j:Lg7/d;

    invoke-static {v0}, Lg7/d;->h(Lg7/d;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg7/g0;->j:Lg7/d;

    iget-object v2, p0, Lg7/g0;->h:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v1, v2}, Lg7/d;->o(Lg7/d;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object v1, p0, Lg7/g0;->j:Lg7/d;

    invoke-static {v1}, Lg7/d;->j(Lg7/d;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lg7/g0;->j:Lg7/d;

    invoke-static {v1}, Lg7/d;->f(Lg7/d;)Lg7/c0;

    move-result-object v1

    const-string v2, "Already connected to the service."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lg7/c0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    :cond_0
    iget-object v1, p0, Lg7/g0;->j:Lg7/d;

    iget-object v2, p0, Lg7/g0;->i:Lg7/d0;

    invoke-static {v1, v2}, Lg7/d;->q(Lg7/d;Lg7/d0;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
