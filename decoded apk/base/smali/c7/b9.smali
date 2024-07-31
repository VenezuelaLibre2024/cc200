.class public final Lc7/b9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic i:Lc7/w7;


# direct methods
.method public constructor <init>(Lc7/w7;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/b9;->h:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p1, p0, Lc7/b9;->i:Lc7/w7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lc7/b9;->h:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lc7/b9;->h:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, p0, Lc7/b9;->i:Lc7/w7;

    invoke-virtual {v2}, Lc7/j7;->a()Lc7/h;

    move-result-object v2

    iget-object v3, p0, Lc7/b9;->i:Lc7/w7;

    invoke-virtual {v3}, Lc7/f4;->k()Lc7/p4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/p4;->A()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lc7/i0;->Q:Lc7/m4;

    invoke-virtual {v2, v3, v4}, Lc7/h;->j(Ljava/lang/String;Lc7/m4;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lc7/b9;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lc7/b9;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v1
.end method
