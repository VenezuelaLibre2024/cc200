.class public final Lh6/s1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic h:Lh6/t1;


# direct methods
.method public synthetic constructor <init>(Lh6/t1;Lh6/r1;)V
    .locals 0

    iput-object p1, p0, Lh6/s1;->h:Lh6/t1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 7

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lh6/s1;->h:Lh6/t1;

    invoke-static {v0}, Lh6/t1;->m(Lh6/t1;)Ljava/util/HashMap;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lh6/p1;

    iget-object v2, p0, Lh6/s1;->h:Lh6/t1;

    invoke-static {v2}, Lh6/t1;->m(Lh6/t1;)Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh6/q1;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lh6/q1;->a()I

    move-result v3

    const/4 v4, 0x3

    if-ne v3, v4, :cond_3

    const-string v3, "GmsClientSupervisor"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Timeout waiting for ServiceConnection callback "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/Exception;

    invoke-direct {v5}, Ljava/lang/Exception;-><init>()V

    invoke-static {v3, v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-virtual {v2}, Lh6/q1;->b()Landroid/content/ComponentName;

    move-result-object v3

    if-nez v3, :cond_1

    invoke-virtual {p1}, Lh6/p1;->a()Landroid/content/ComponentName;

    move-result-object v3

    :cond_1
    if-nez v3, :cond_2

    new-instance v3, Landroid/content/ComponentName;

    invoke-virtual {p1}, Lh6/p1;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "unknown"

    invoke-direct {v3, p1, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v2, v3}, Lh6/q1;->onServiceDisconnected(Landroid/content/ComponentName;)V

    :cond_3
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_4
    iget-object v0, p0, Lh6/s1;->h:Lh6/t1;

    invoke-static {v0}, Lh6/t1;->m(Lh6/t1;)Ljava/util/HashMap;

    move-result-object v0

    monitor-enter v0

    :try_start_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lh6/p1;

    iget-object v2, p0, Lh6/s1;->h:Lh6/t1;

    invoke-static {v2}, Lh6/t1;->m(Lh6/t1;)Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh6/q1;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lh6/q1;->i()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v2}, Lh6/q1;->j()Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v3, "GmsClientSupervisor"

    invoke-virtual {v2, v3}, Lh6/q1;->g(Ljava/lang/String;)V

    :cond_5
    iget-object v2, p0, Lh6/s1;->h:Lh6/t1;

    invoke-static {v2}, Lh6/t1;->m(Lh6/t1;)Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    monitor-exit v0

    return v1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1
.end method
