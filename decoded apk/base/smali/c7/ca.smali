.class public final Lc7/ca;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic i:Lc7/rc;

.field public final synthetic j:Lc7/y9;


# direct methods
.method public constructor <init>(Lc7/y9;Ljava/util/concurrent/atomic/AtomicReference;Lc7/rc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/ca;->h:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lc7/ca;->i:Lc7/rc;

    iput-object p1, p0, Lc7/ca;->j:Lc7/y9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lc7/ca;->h:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lc7/ca;->j:Lc7/y9;

    invoke-virtual {v1}, Lc7/j7;->e()Lc7/i5;

    move-result-object v1

    invoke-virtual {v1}, Lc7/i5;->G()Lc7/n7;

    move-result-object v1

    invoke-virtual {v1}, Lc7/n7;->y()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lc7/ca;->j:Lc7/y9;

    invoke-virtual {v1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->H()Lc7/x4;

    move-result-object v1

    const-string v2, "Analytics storage consent denied; will not get app instance id"

    invoke-virtual {v1, v2}, Lc7/x4;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lc7/ca;->j:Lc7/y9;

    invoke-virtual {v1}, Lc7/f4;->m()Lc7/w7;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lc7/w7;->P(Ljava/lang/String;)V

    iget-object v1, p0, Lc7/ca;->j:Lc7/y9;

    invoke-virtual {v1}, Lc7/j7;->e()Lc7/i5;

    move-result-object v1

    iget-object v1, v1, Lc7/i5;->i:Lc7/o5;

    invoke-virtual {v1, v2}, Lc7/o5;->b(Ljava/lang/String;)V

    iget-object v1, p0, Lc7/ca;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lc7/ca;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :cond_0
    :try_start_2
    iget-object v1, p0, Lc7/ca;->j:Lc7/y9;

    invoke-static {v1}, Lc7/y9;->w(Lc7/y9;)Lc7/o4;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lc7/ca;->j:Lc7/y9;

    invoke-virtual {v1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Failed to get app instance id"

    invoke-virtual {v1, v2}, Lc7/x4;->a(Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v1, p0, Lc7/ca;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-void

    :cond_1
    :try_start_4
    iget-object v2, p0, Lc7/ca;->i:Lc7/rc;

    invoke-static {v2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lc7/ca;->h:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Lc7/ca;->i:Lc7/rc;

    invoke-interface {v1, v3}, Lc7/o4;->y(Lc7/rc;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v1, p0, Lc7/ca;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v2, p0, Lc7/ca;->j:Lc7/y9;

    invoke-virtual {v2}, Lc7/f4;->m()Lc7/w7;

    move-result-object v2

    invoke-virtual {v2, v1}, Lc7/w7;->P(Ljava/lang/String;)V

    iget-object v2, p0, Lc7/ca;->j:Lc7/y9;

    invoke-virtual {v2}, Lc7/j7;->e()Lc7/i5;

    move-result-object v2

    iget-object v2, v2, Lc7/i5;->i:Lc7/o5;

    invoke-virtual {v2, v1}, Lc7/o5;->b(Ljava/lang/String;)V

    :cond_2
    iget-object v1, p0, Lc7/ca;->j:Lc7/y9;

    invoke-static {v1}, Lc7/y9;->h0(Lc7/y9;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v1, p0, Lc7/ca;->h:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v1

    :try_start_6
    iget-object v2, p0, Lc7/ca;->j:Lc7/y9;

    invoke-virtual {v2}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    const-string v3, "Failed to get app instance id"

    invoke-virtual {v2, v3, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    iget-object v1, p0, Lc7/ca;->h:Ljava/util/concurrent/atomic/AtomicReference;

    goto :goto_0

    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    iget-object v2, p0, Lc7/ca;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    throw v1
.end method
