.class public final Lc7/qa;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Lc7/rc;

.field public final synthetic m:Lc7/y9;


# direct methods
.method public constructor <init>(Lc7/y9;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc7/rc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/qa;->h:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lc7/qa;->i:Ljava/lang/String;

    iput-object p4, p0, Lc7/qa;->j:Ljava/lang/String;

    iput-object p5, p0, Lc7/qa;->k:Ljava/lang/String;

    iput-object p6, p0, Lc7/qa;->l:Lc7/rc;

    iput-object p1, p0, Lc7/qa;->m:Lc7/y9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lc7/qa;->h:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lc7/qa;->m:Lc7/y9;

    invoke-static {v1}, Lc7/y9;->w(Lc7/y9;)Lc7/o4;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lc7/qa;->m:Lc7/y9;

    invoke-virtual {v1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "(legacy) Failed to get conditional properties; not connected to service"

    iget-object v3, p0, Lc7/qa;->i:Ljava/lang/String;

    invoke-static {v3}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lc7/qa;->j:Ljava/lang/String;

    iget-object v5, p0, Lc7/qa;->k:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v4, v5}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lc7/qa;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lc7/qa;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :cond_0
    :try_start_2
    iget-object v2, p0, Lc7/qa;->i:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lc7/qa;->l:Lc7/rc;

    invoke-static {v2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lc7/qa;->h:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Lc7/qa;->j:Ljava/lang/String;

    iget-object v4, p0, Lc7/qa;->k:Ljava/lang/String;

    iget-object v5, p0, Lc7/qa;->l:Lc7/rc;

    invoke-interface {v1, v3, v4, v5}, Lc7/o4;->e0(Ljava/lang/String;Ljava/lang/String;Lc7/rc;)Ljava/util/List;

    move-result-object v1

    :goto_0
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lc7/qa;->h:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Lc7/qa;->i:Ljava/lang/String;

    iget-object v4, p0, Lc7/qa;->j:Ljava/lang/String;

    iget-object v5, p0, Lc7/qa;->k:Ljava/lang/String;

    invoke-interface {v1, v3, v4, v5}, Lc7/o4;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :goto_1
    iget-object v1, p0, Lc7/qa;->m:Lc7/y9;

    invoke-static {v1}, Lc7/y9;->h0(Lc7/y9;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v1, p0, Lc7/qa;->h:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_0
    move-exception v1

    goto :goto_4

    :catch_0
    move-exception v1

    :try_start_4
    iget-object v2, p0, Lc7/qa;->m:Lc7/y9;

    invoke-virtual {v2}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    const-string v3, "(legacy) Failed to get conditional properties; remote exception"

    iget-object v4, p0, Lc7/qa;->i:Ljava/lang/String;

    invoke-static {v4}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Lc7/qa;->j:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v5, v1}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lc7/qa;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v1, p0, Lc7/qa;->h:Ljava/util/concurrent/atomic/AtomicReference;

    goto :goto_2

    :goto_3
    monitor-exit v0

    return-void

    :goto_4
    iget-object v2, p0, Lc7/qa;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1
.end method
