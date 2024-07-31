.class public final Lg7/d;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final o:Ljava/util/Map;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lg7/c0;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/Set;

.field public final f:Ljava/lang/Object;

.field public g:Z

.field public final h:Landroid/content/Intent;

.field public final i:Lg7/j0;

.field public final j:Ljava/lang/ref/WeakReference;

.field public final k:Landroid/os/IBinder$DeathRecipient;

.field public final l:Ljava/util/concurrent/atomic/AtomicInteger;

.field public m:Landroid/content/ServiceConnection;

.field public n:Landroid/os/IInterface;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lg7/d;->o:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lg7/c0;Ljava/lang/String;Landroid/content/Intent;Lg7/j0;Lg7/i0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p6, Ljava/util/ArrayList;

    invoke-direct {p6}, Ljava/util/ArrayList;-><init>()V

    iput-object p6, p0, Lg7/d;->d:Ljava/util/List;

    new-instance p6, Ljava/util/HashSet;

    invoke-direct {p6}, Ljava/util/HashSet;-><init>()V

    iput-object p6, p0, Lg7/d;->e:Ljava/util/Set;

    new-instance p6, Ljava/lang/Object;

    invoke-direct {p6}, Ljava/lang/Object;-><init>()V

    iput-object p6, p0, Lg7/d;->f:Ljava/lang/Object;

    new-instance p6, Lg7/f0;

    invoke-direct {p6, p0}, Lg7/f0;-><init>(Lg7/d;)V

    iput-object p6, p0, Lg7/d;->k:Landroid/os/IBinder$DeathRecipient;

    new-instance p6, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {p6, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p6, p0, Lg7/d;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Lg7/d;->a:Landroid/content/Context;

    iput-object p2, p0, Lg7/d;->b:Lg7/c0;

    iput-object p3, p0, Lg7/d;->c:Ljava/lang/String;

    iput-object p4, p0, Lg7/d;->h:Landroid/content/Intent;

    iput-object p5, p0, Lg7/d;->i:Lg7/j0;

    new-instance p1, Ljava/lang/ref/WeakReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lg7/d;->j:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static bridge synthetic a(Lg7/d;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lg7/d;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic b(Lg7/d;)Landroid/content/ServiceConnection;
    .locals 0

    iget-object p0, p0, Lg7/d;->m:Landroid/content/ServiceConnection;

    return-object p0
.end method

.method public static bridge synthetic d(Lg7/d;)Landroid/os/IInterface;
    .locals 0

    iget-object p0, p0, Lg7/d;->n:Landroid/os/IInterface;

    return-object p0
.end method

.method public static bridge synthetic f(Lg7/d;)Lg7/c0;
    .locals 0

    iget-object p0, p0, Lg7/d;->b:Lg7/c0;

    return-object p0
.end method

.method public static bridge synthetic g(Lg7/d;)Lg7/j0;
    .locals 0

    iget-object p0, p0, Lg7/d;->i:Lg7/j0;

    return-object p0
.end method

.method public static bridge synthetic h(Lg7/d;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lg7/d;->f:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic i(Lg7/d;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lg7/d;->d:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic j(Lg7/d;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Lg7/d;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static synthetic k(Lg7/d;)V
    .locals 4

    iget-object v0, p0, Lg7/d;->b:Lg7/c0;

    const-string v1, "reportBinderDeath"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3}, Lg7/c0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lg7/d;->j:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg7/i0;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lg7/d;->b:Lg7/c0;

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "calling onBinderDied"

    invoke-virtual {v1, v3, v2}, Lg7/c0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    invoke-interface {v0}, Lg7/i0;->a()V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lg7/d;->b:Lg7/c0;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lg7/d;->c:Ljava/lang/String;

    aput-object v3, v1, v2

    const-string v2, "%s : Binder has died."

    invoke-virtual {v0, v2, v1}, Lg7/c0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lg7/d;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg7/d0;

    invoke-virtual {p0}, Lg7/d;->w()Landroid/os/RemoteException;

    move-result-object v2

    invoke-virtual {v1, v2}, Lg7/d0;->a(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lg7/d;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :goto_1
    iget-object v0, p0, Lg7/d;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lg7/d;->x()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static bridge synthetic l(Lg7/d;Landroid/content/ServiceConnection;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lg7/d;->m:Landroid/content/ServiceConnection;

    return-void
.end method

.method public static bridge synthetic m(Lg7/d;Z)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lg7/d;->g:Z

    return-void
.end method

.method public static bridge synthetic n(Lg7/d;Landroid/os/IInterface;)V
    .locals 0

    iput-object p1, p0, Lg7/d;->n:Landroid/os/IInterface;

    return-void
.end method

.method public static bridge synthetic o(Lg7/d;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2

    iget-object v0, p0, Lg7/d;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lg7/e0;

    invoke-direct {v1, p0, p1}, Lg7/e0;-><init>(Lg7/d;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public static bridge synthetic p(Lg7/d;)V
    .locals 0

    invoke-virtual {p0}, Lg7/d;->x()V

    return-void
.end method

.method public static bridge synthetic q(Lg7/d;Lg7/d0;)V
    .locals 4

    iget-object v0, p0, Lg7/d;->n:Landroid/os/IInterface;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lg7/d;->g:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lg7/d;->b:Lg7/c0;

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Initiate binding to the service."

    invoke-virtual {v0, v3, v2}, Lg7/c0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lg7/d;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lg7/c;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lg7/c;-><init>(Lg7/d;Lg7/b;)V

    iput-object p1, p0, Lg7/d;->m:Landroid/content/ServiceConnection;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg7/d;->g:Z

    iget-object v2, p0, Lg7/d;->a:Landroid/content/Context;

    iget-object v3, p0, Lg7/d;->h:Landroid/content/Intent;

    invoke-virtual {v2, v3, p1, v0}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lg7/d;->b:Lg7/c0;

    new-array v0, v1, [Ljava/lang/Object;

    const-string v2, "Failed to bind to the service."

    invoke-virtual {p1, v2, v0}, Lg7/c0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iput-boolean v1, p0, Lg7/d;->g:Z

    iget-object p1, p0, Lg7/d;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg7/d0;

    new-instance v1, Lg7/e;

    invoke-direct {v1}, Lg7/e;-><init>()V

    invoke-virtual {v0, v1}, Lg7/d0;->a(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lg7/d;->d:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    :cond_1
    return-void

    :cond_2
    iget-boolean v0, p0, Lg7/d;->g:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lg7/d;->b:Lg7/c0;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Waiting to bind to the service."

    invoke-virtual {v0, v2, v1}, Lg7/c0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object p0, p0, Lg7/d;->d:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_3
    invoke-virtual {p1}, Lg7/d0;->run()V

    return-void
.end method

.method public static bridge synthetic r(Lg7/d;)V
    .locals 4

    iget-object v0, p0, Lg7/d;->b:Lg7/c0;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "linkToDeath"

    invoke-virtual {v0, v3, v2}, Lg7/c0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    :try_start_0
    iget-object v0, p0, Lg7/d;->n:Landroid/os/IInterface;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object v2, p0, Lg7/d;->k:Landroid/os/IBinder$DeathRecipient;

    invoke-interface {v0, v2, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object p0, p0, Lg7/d;->b:Lg7/c0;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "linkToDeath failed"

    invoke-virtual {p0, v0, v2, v1}, Lg7/c0;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public static bridge synthetic s(Lg7/d;)V
    .locals 4

    iget-object v0, p0, Lg7/d;->b:Lg7/c0;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "unlinkToDeath"

    invoke-virtual {v0, v3, v2}, Lg7/c0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lg7/d;->n:Landroid/os/IInterface;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object p0, p0, Lg7/d;->k:Landroid/os/IBinder$DeathRecipient;

    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    return-void
.end method


# virtual methods
.method public final c()Landroid/os/Handler;
    .locals 4

    sget-object v0, Lg7/d;->o:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg7/d;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/HandlerThread;

    iget-object v2, p0, Lg7/d;->c:Ljava/lang/String;

    const/16 v3, 0xa

    invoke-direct {v1, v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V

    iget-object v2, p0, Lg7/d;->c:Ljava/lang/String;

    new-instance v3, Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v3, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lg7/d;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final e()Landroid/os/IInterface;
    .locals 1

    iget-object v0, p0, Lg7/d;->n:Landroid/os/IInterface;

    return-object v0
.end method

.method public final t(Lg7/d0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2

    new-instance v0, Lg7/g0;

    invoke-virtual {p1}, Lg7/d0;->c()Lcom/google/android/gms/tasks/TaskCompletionSource;

    move-result-object v1

    invoke-direct {v0, p0, v1, p2, p1}, Lg7/g0;-><init>(Lg7/d;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;Lg7/d0;)V

    invoke-virtual {p0}, Lg7/d;->c()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final synthetic u(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object p2, p0, Lg7/d;->f:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Lg7/d;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final v(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2

    iget-object v0, p0, Lg7/d;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg7/d;->e:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance p1, Lg7/h0;

    invoke-direct {p1, p0}, Lg7/h0;-><init>(Lg7/d;)V

    invoke-virtual {p0}, Lg7/d;->c()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final w()Landroid/os/RemoteException;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xf

    if-ge v0, v1, :cond_0

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/RemoteException;

    iget-object v1, p0, Lg7/d;->c:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, " : Binder has died."

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method public final x()V
    .locals 3

    iget-object v0, p0, Lg7/d;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p0}, Lg7/d;->w()Landroid/os/RemoteException;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg7/d;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method
