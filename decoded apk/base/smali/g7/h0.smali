.class public final Lg7/h0;
.super Lg7/d0;
.source ""


# instance fields
.field public final synthetic h:Lg7/d;


# direct methods
.method public constructor <init>(Lg7/d;)V
    .locals 0

    iput-object p1, p0, Lg7/h0;->h:Lg7/d;

    invoke-direct {p0}, Lg7/d0;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 5

    iget-object v0, p0, Lg7/h0;->h:Lg7/d;

    invoke-static {v0}, Lg7/d;->h(Lg7/d;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg7/h0;->h:Lg7/d;

    invoke-static {v1}, Lg7/d;->j(Lg7/d;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_1

    iget-object v1, p0, Lg7/h0;->h:Lg7/d;

    invoke-static {v1}, Lg7/d;->j(Lg7/d;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lg7/h0;->h:Lg7/d;

    invoke-static {v1}, Lg7/d;->f(Lg7/d;)Lg7/c0;

    move-result-object v1

    const-string v3, "Leaving the connection open for other ongoing calls."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v2}, Lg7/c0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    monitor-exit v0

    return-void

    :cond_1
    :goto_0
    iget-object v1, p0, Lg7/h0;->h:Lg7/d;

    invoke-static {v1}, Lg7/d;->d(Lg7/d;)Landroid/os/IInterface;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v1}, Lg7/d;->f(Lg7/d;)Lg7/c0;

    move-result-object v1

    const-string v3, "Unbind from service."

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v4}, Lg7/c0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lg7/h0;->h:Lg7/d;

    invoke-static {v1}, Lg7/d;->a(Lg7/d;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v1}, Lg7/d;->b(Lg7/d;)Landroid/content/ServiceConnection;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v1, p0, Lg7/h0;->h:Lg7/d;

    invoke-static {v1, v2}, Lg7/d;->m(Lg7/d;Z)V

    iget-object v1, p0, Lg7/h0;->h:Lg7/d;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lg7/d;->n(Lg7/d;Landroid/os/IInterface;)V

    iget-object v1, p0, Lg7/h0;->h:Lg7/d;

    invoke-static {v1, v2}, Lg7/d;->l(Lg7/d;Landroid/content/ServiceConnection;)V

    :cond_2
    iget-object v1, p0, Lg7/h0;->h:Lg7/d;

    invoke-static {v1}, Lg7/d;->p(Lg7/d;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
