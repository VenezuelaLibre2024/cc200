.class public Lg6/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final A:Ljava/lang/Object;

.field public static B:Lg6/f;

.field public static final y:Lcom/google/android/gms/common/api/Status;

.field public static final z:Lcom/google/android/gms/common/api/Status;


# instance fields
.field public h:J

.field public i:J

.field public j:J

.field public k:Z

.field public l:Lh6/w;

.field public m:Lh6/y;

.field public final n:Landroid/content/Context;

.field public final o:Le6/e;

.field public final p:Lh6/l0;

.field public final q:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final r:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final s:Ljava/util/Map;

.field public t:Lg6/b0;

.field public final u:Ljava/util/Set;

.field public final v:Ljava/util/Set;

.field public final w:Landroid/os/Handler;

.field public volatile x:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/4 v1, 0x4

    const-string v2, "Sign-out occurred while this API call was in progress."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    sput-object v0, Lg6/f;->y:Lcom/google/android/gms/common/api/Status;

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const-string v2, "The user must be signed in to make this API call."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    sput-object v0, Lg6/f;->z:Lcom/google/android/gms/common/api/Status;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg6/f;->A:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Le6/e;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x1388

    iput-wide v0, p0, Lg6/f;->h:J

    const-wide/32 v0, 0x1d4c0

    iput-wide v0, p0, Lg6/f;->i:J

    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lg6/f;->j:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lg6/f;->k:Z

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Lg6/f;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Lg6/f;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v3, 0x5

    const/high16 v4, 0x3f400000    # 0.75f

    invoke-direct {v1, v3, v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    iput-object v1, p0, Lg6/f;->s:Ljava/util/Map;

    const/4 v1, 0x0

    iput-object v1, p0, Lg6/f;->t:Lg6/b0;

    new-instance v1, Lu/b;

    invoke-direct {v1}, Lu/b;-><init>()V

    iput-object v1, p0, Lg6/f;->u:Ljava/util/Set;

    new-instance v1, Lu/b;

    invoke-direct {v1}, Lu/b;-><init>()V

    iput-object v1, p0, Lg6/f;->v:Ljava/util/Set;

    iput-boolean v2, p0, Lg6/f;->x:Z

    iput-object p1, p0, Lg6/f;->n:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/internal/base/zau;

    invoke-direct {v1, p2, p0}, Lcom/google/android/gms/internal/base/zau;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v1, p0, Lg6/f;->w:Landroid/os/Handler;

    iput-object p3, p0, Lg6/f;->o:Le6/e;

    new-instance p2, Lh6/l0;

    invoke-direct {p2, p3}, Lh6/l0;-><init>(Le6/f;)V

    iput-object p2, p0, Lg6/f;->p:Lh6/l0;

    invoke-static {p1}, Lo6/h;->a(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    iput-boolean v0, p0, Lg6/f;->x:Z

    :cond_0
    const/4 p1, 0x6

    invoke-virtual {v1, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public static bridge synthetic D()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lg6/f;->A:Ljava/lang/Object;

    return-object v0
.end method

.method public static bridge synthetic E(Lg6/f;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lg6/f;->s:Ljava/util/Map;

    return-object p0
.end method

.method public static bridge synthetic F(Lg6/f;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lg6/f;->u:Ljava/util/Set;

    return-object p0
.end method

.method public static bridge synthetic G(Lg6/f;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lg6/f;->k:Z

    return-void
.end method

.method public static a()V
    .locals 3

    sget-object v0, Lg6/f;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lg6/f;->B:Lg6/f;

    if-eqz v1, :cond_0

    iget-object v2, v1, Lg6/f;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iget-object v1, v1, Lg6/f;->w:Landroid/os/Handler;

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static bridge synthetic f(Lg6/f;)Z
    .locals 0

    iget-boolean p0, p0, Lg6/f;->x:Z

    return p0
.end method

.method public static i(Lg6/b;Le6/b;)Lcom/google/android/gms/common/api/Status;
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0}, Lg6/b;->b()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "API: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " is not available on this device. Connection failed with: "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/common/api/Status;-><init>(Le6/b;Ljava/lang/String;)V

    return-object v0
.end method

.method public static bridge synthetic o(Lg6/f;)J
    .locals 2

    iget-wide v0, p0, Lg6/f;->h:J

    return-wide v0
.end method

.method public static bridge synthetic p(Lg6/f;)J
    .locals 2

    iget-wide v0, p0, Lg6/f;->i:J

    return-wide v0
.end method

.method public static bridge synthetic q(Lg6/f;)J
    .locals 2

    iget-wide v0, p0, Lg6/f;->j:J

    return-wide v0
.end method

.method public static bridge synthetic r(Lg6/f;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lg6/f;->n:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic s(Lg6/f;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lg6/f;->w:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic t(Lg6/f;)Le6/e;
    .locals 0

    iget-object p0, p0, Lg6/f;->o:Le6/e;

    return-object p0
.end method

.method public static bridge synthetic u()Lcom/google/android/gms/common/api/Status;
    .locals 1

    sget-object v0, Lg6/f;->z:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public static bridge synthetic v(Lg6/b;Le6/b;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    invoke-static {p0, p1}, Lg6/f;->i(Lg6/b;Le6/b;)Lcom/google/android/gms/common/api/Status;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic w(Lg6/f;)Lg6/b0;
    .locals 0

    iget-object p0, p0, Lg6/f;->t:Lg6/b0;

    return-object p0
.end method

.method public static y(Landroid/content/Context;)Lg6/f;
    .locals 4

    sget-object v0, Lg6/f;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lg6/f;->B:Lg6/f;

    if-nez v1, :cond_0

    invoke-static {}, Lh6/i;->d()Landroid/os/HandlerThread;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lg6/f;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {}, Le6/e;->m()Le6/e;

    move-result-object v3

    invoke-direct {v2, p0, v1, v3}, Lg6/f;-><init>(Landroid/content/Context;Landroid/os/Looper;Le6/e;)V

    sput-object v2, Lg6/f;->B:Lg6/f;

    :cond_0
    sget-object p0, Lg6/f;->B:Lg6/f;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static bridge synthetic z(Lg6/f;)Lh6/l0;
    .locals 0

    iget-object p0, p0, Lg6/f;->p:Lh6/l0;

    return-object p0
.end method


# virtual methods
.method public final A(Lf6/e;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    new-instance v0, Lg6/c0;

    invoke-virtual {p1}, Lf6/e;->getApiKey()Lg6/b;

    move-result-object p1

    invoke-direct {v0, p1}, Lg6/c0;-><init>(Lg6/b;)V

    iget-object p1, p0, Lg6/f;->w:Landroid/os/Handler;

    const/16 v1, 0xe

    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    invoke-virtual {v0}, Lg6/c0;->b()Lcom/google/android/gms/tasks/TaskCompletionSource;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final B(Lf6/e;Lg6/o;Lg6/x;Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    invoke-virtual {p2}, Lg6/o;->e()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1}, Lg6/f;->m(Lcom/google/android/gms/tasks/TaskCompletionSource;ILf6/e;)V

    new-instance v1, Lg6/u1;

    new-instance v2, Lg6/a1;

    invoke-direct {v2, p2, p3, p4}, Lg6/a1;-><init>(Lg6/o;Lg6/x;Ljava/lang/Runnable;)V

    invoke-direct {v1, v2, v0}, Lg6/u1;-><init>(Lg6/a1;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object p2, p0, Lg6/f;->w:Landroid/os/Handler;

    new-instance p3, Lg6/z0;

    iget-object p4, p0, Lg6/f;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p4

    invoke-direct {p3, v1, p4, p1}, Lg6/z0;-><init>(Lg6/x1;ILf6/e;)V

    const/16 p1, 0x8

    invoke-virtual {p2, p1, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final C(Lf6/e;Lg6/j$a;I)Lcom/google/android/gms/tasks/Task;
    .locals 3

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    invoke-virtual {p0, v0, p3, p1}, Lg6/f;->m(Lcom/google/android/gms/tasks/TaskCompletionSource;ILf6/e;)V

    new-instance p3, Lg6/w1;

    invoke-direct {p3, p2, v0}, Lg6/w1;-><init>(Lg6/j$a;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object p2, p0, Lg6/f;->w:Landroid/os/Handler;

    new-instance v1, Lg6/z0;

    iget-object v2, p0, Lg6/f;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    invoke-direct {v1, p3, v2, p1}, Lg6/z0;-><init>(Lg6/x1;ILf6/e;)V

    const/16 p1, 0xd

    invoke-virtual {p2, p1, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final H(Lf6/e;ILcom/google/android/gms/common/api/internal/a;)V
    .locals 2

    new-instance v0, Lg6/t1;

    invoke-direct {v0, p2, p3}, Lg6/t1;-><init>(ILcom/google/android/gms/common/api/internal/a;)V

    iget-object p2, p0, Lg6/f;->w:Landroid/os/Handler;

    new-instance p3, Lg6/z0;

    iget-object v1, p0, Lg6/f;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    invoke-direct {p3, v0, v1, p1}, Lg6/z0;-><init>(Lg6/x1;ILf6/e;)V

    const/4 p1, 0x4

    invoke-virtual {p2, p1, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final I(Lf6/e;ILg6/v;Lcom/google/android/gms/tasks/TaskCompletionSource;Lg6/t;)V
    .locals 1

    invoke-virtual {p3}, Lg6/v;->d()I

    move-result v0

    invoke-virtual {p0, p4, v0, p1}, Lg6/f;->m(Lcom/google/android/gms/tasks/TaskCompletionSource;ILf6/e;)V

    new-instance v0, Lg6/v1;

    invoke-direct {v0, p2, p3, p4, p5}, Lg6/v1;-><init>(ILg6/v;Lcom/google/android/gms/tasks/TaskCompletionSource;Lg6/t;)V

    iget-object p2, p0, Lg6/f;->w:Landroid/os/Handler;

    new-instance p3, Lg6/z0;

    iget-object p4, p0, Lg6/f;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p4

    invoke-direct {p3, v0, p4, p1}, Lg6/z0;-><init>(Lg6/x1;ILf6/e;)V

    const/4 p1, 0x4

    invoke-virtual {p2, p1, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final J(Lh6/p;IJI)V
    .locals 8

    iget-object v0, p0, Lg6/f;->w:Landroid/os/Handler;

    new-instance v7, Lg6/w0;

    move-object v1, v7

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lg6/w0;-><init>(Lh6/p;IJI)V

    const/16 p1, 0x12

    invoke-virtual {v0, p1, v7}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final K(Le6/b;I)V
    .locals 3

    invoke-virtual {p0, p1, p2}, Lg6/f;->h(Le6/b;I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lg6/f;->w:Landroid/os/Handler;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lg6/f;->w:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final c(Lf6/e;)V
    .locals 2

    iget-object v0, p0, Lg6/f;->w:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final d(Lg6/b0;)V
    .locals 2

    sget-object v0, Lg6/f;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg6/f;->t:Lg6/b0;

    if-eq v1, p1, :cond_0

    iput-object p1, p0, Lg6/f;->t:Lg6/b0;

    iget-object v1, p0, Lg6/f;->u:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    :cond_0
    iget-object v1, p0, Lg6/f;->u:Ljava/util/Set;

    invoke-virtual {p1}, Lg6/b0;->i()Lu/b;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final e(Lg6/b0;)V
    .locals 2

    sget-object v0, Lg6/f;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg6/f;->t:Lg6/b0;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lg6/f;->t:Lg6/b0;

    iget-object p1, p0, Lg6/f;->u:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final g()Z
    .locals 4

    iget-boolean v0, p0, Lg6/f;->k:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-static {}, Lh6/t;->b()Lh6/t;

    move-result-object v0

    invoke-virtual {v0}, Lh6/t;->a()Lh6/u;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lh6/u;->K()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    iget-object v0, p0, Lg6/f;->p:Lh6/l0;

    iget-object v2, p0, Lg6/f;->n:Landroid/content/Context;

    const v3, 0xc1fa340

    invoke-virtual {v0, v2, v3}, Lh6/l0;->a(Landroid/content/Context;I)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_4

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    return v1

    :cond_4
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method public final h(Le6/b;I)Z
    .locals 2

    iget-object v0, p0, Lg6/f;->o:Le6/e;

    iget-object v1, p0, Lg6/f;->n:Landroid/content/Context;

    invoke-virtual {v0, v1, p1, p2}, Le6/e;->w(Landroid/content/Context;Le6/b;I)Z

    move-result p1

    return p1
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 9

    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xd

    const-wide/32 v2, 0x493e0

    const-string v4, "GoogleApiManager"

    const/16 v5, 0x11

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown message id: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v7

    :pswitch_0
    iput-boolean v7, p0, Lg6/f;->k:Z

    goto/16 :goto_8

    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lg6/w0;

    iget-wide v0, p1, Lg6/w0;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    new-instance v0, Lh6/w;

    iget v1, p1, Lg6/w0;->b:I

    new-array v2, v8, [Lh6/p;

    iget-object p1, p1, Lg6/w0;->a:Lh6/p;

    aput-object p1, v2, v7

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lh6/w;-><init>(ILjava/util/List;)V

    invoke-virtual {p0}, Lg6/f;->k()Lh6/y;

    move-result-object p1

    invoke-interface {p1, v0}, Lh6/y;->a(Lh6/w;)Lcom/google/android/gms/tasks/Task;

    goto/16 :goto_8

    :cond_0
    iget-object v0, p0, Lg6/f;->l:Lh6/w;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lh6/w;->J()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lh6/w;->I()I

    move-result v0

    iget v2, p1, Lg6/w0;->b:I

    if-ne v0, v2, :cond_2

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p1, Lg6/w0;->d:I

    if-lt v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lg6/f;->l:Lh6/w;

    iget-object v1, p1, Lg6/w0;->a:Lh6/p;

    invoke-virtual {v0, v1}, Lh6/w;->K(Lh6/p;)V

    goto :goto_1

    :cond_2
    :goto_0
    iget-object v0, p0, Lg6/f;->w:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->removeMessages(I)V

    invoke-virtual {p0}, Lg6/f;->l()V

    :cond_3
    :goto_1
    iget-object v0, p0, Lg6/f;->l:Lh6/w;

    if-nez v0, :cond_11

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p1, Lg6/w0;->a:Lh6/p;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lh6/w;

    iget v2, p1, Lg6/w0;->b:I

    invoke-direct {v1, v2, v0}, Lh6/w;-><init>(ILjava/util/List;)V

    iput-object v1, p0, Lg6/f;->l:Lh6/w;

    iget-object v0, p0, Lg6/f;->w:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    iget-wide v2, p1, Lg6/w0;->c:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto/16 :goto_8

    :pswitch_2
    invoke-virtual {p0}, Lg6/f;->l()V

    goto/16 :goto_8

    :pswitch_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lg6/m0;

    iget-object v0, p0, Lg6/f;->s:Ljava/util/Map;

    invoke-static {p1}, Lg6/m0;->b(Lg6/m0;)Lg6/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lg6/f;->s:Ljava/util/Map;

    invoke-static {p1}, Lg6/m0;->b(Lg6/m0;)Lg6/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/k0;

    invoke-static {v0, p1}, Lg6/k0;->C(Lg6/k0;Lg6/m0;)V

    goto/16 :goto_8

    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lg6/m0;

    iget-object v0, p0, Lg6/f;->s:Ljava/util/Map;

    invoke-static {p1}, Lg6/m0;->b(Lg6/m0;)Lg6/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lg6/f;->s:Ljava/util/Map;

    invoke-static {p1}, Lg6/m0;->b(Lg6/m0;)Lg6/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/k0;

    invoke-static {v0, p1}, Lg6/k0;->B(Lg6/k0;Lg6/m0;)V

    goto/16 :goto_8

    :pswitch_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lg6/c0;

    invoke-virtual {p1}, Lg6/c0;->a()Lg6/b;

    move-result-object v0

    iget-object v1, p0, Lg6/f;->s:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p1}, Lg6/c0;->b()Lcom/google/android/gms/tasks/TaskCompletionSource;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lg6/f;->s:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/k0;

    invoke-static {v0, v7}, Lg6/k0;->N(Lg6/k0;Z)Z

    move-result v0

    invoke-virtual {p1}, Lg6/c0;->b()Lcom/google/android/gms/tasks/TaskCompletionSource;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_2
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_6
    iget-object v0, p0, Lg6/f;->s:Ljava/util/Map;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lg6/f;->s:Ljava/util/Map;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg6/k0;

    invoke-virtual {p1}, Lg6/k0;->a()Z

    goto/16 :goto_8

    :pswitch_7
    iget-object v0, p0, Lg6/f;->s:Ljava/util/Map;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lg6/f;->s:Ljava/util/Map;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg6/k0;

    invoke-virtual {p1}, Lg6/k0;->M()V

    goto/16 :goto_8

    :pswitch_8
    iget-object p1, p0, Lg6/f;->v:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/b;

    iget-object v1, p0, Lg6/f;->s:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/k0;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lg6/k0;->L()V

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lg6/f;->v:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    goto/16 :goto_8

    :pswitch_9
    iget-object v0, p0, Lg6/f;->s:Ljava/util/Map;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lg6/f;->s:Ljava/util/Map;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg6/k0;

    invoke-virtual {p1}, Lg6/k0;->K()V

    goto/16 :goto_8

    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lf6/e;

    invoke-virtual {p0, p1}, Lg6/f;->j(Lf6/e;)Lg6/k0;

    goto/16 :goto_8

    :pswitch_b
    iget-object p1, p0, Lg6/f;->n:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    instance-of p1, p1, Landroid/app/Application;

    if-eqz p1, :cond_11

    iget-object p1, p0, Lg6/f;->n:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-static {p1}, Lg6/c;->c(Landroid/app/Application;)V

    invoke-static {}, Lg6/c;->b()Lg6/c;

    move-result-object p1

    new-instance v0, Lg6/f0;

    invoke-direct {v0, p0}, Lg6/f0;-><init>(Lg6/f;)V

    invoke-virtual {p1, v0}, Lg6/c;->a(Lg6/c$a;)V

    invoke-static {}, Lg6/c;->b()Lg6/c;

    move-result-object p1

    invoke-virtual {p1, v8}, Lg6/c;->e(Z)Z

    move-result p1

    if-nez p1, :cond_11

    iput-wide v2, p0, Lg6/f;->j:J

    goto/16 :goto_8

    :pswitch_c
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Le6/b;

    iget-object v2, p0, Lg6/f;->s:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg6/k0;

    invoke-virtual {v3}, Lg6/k0;->r()I

    move-result v7

    if-ne v7, v0, :cond_7

    move-object v6, v3

    :cond_8
    if-eqz v6, :cond_a

    invoke-virtual {p1}, Le6/b;->I()I

    move-result v0

    if-ne v0, v1, :cond_9

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    iget-object v1, p0, Lg6/f;->o:Le6/e;

    invoke-virtual {p1}, Le6/b;->I()I

    move-result v2

    invoke-virtual {v1, v2}, Le6/e;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Le6/b;->J()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error resolution was canceled by the user, original error message: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v5, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {v6, v0}, Lg6/k0;->y(Lg6/k0;Lcom/google/android/gms/common/api/Status;)V

    goto/16 :goto_8

    :cond_9
    invoke-static {v6}, Lg6/k0;->w(Lg6/k0;)Lg6/b;

    move-result-object v0

    invoke-static {v0, p1}, Lg6/f;->i(Lg6/b;Le6/b;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-static {v6, p1}, Lg6/k0;->y(Lg6/k0;Lcom/google/android/gms/common/api/Status;)V

    goto/16 :goto_8

    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not find API instance "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " while trying to fail enqueued calls."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_8

    :pswitch_d
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lg6/z0;

    iget-object v0, p0, Lg6/f;->s:Ljava/util/Map;

    iget-object v1, p1, Lg6/z0;->c:Lf6/e;

    invoke-virtual {v1}, Lf6/e;->getApiKey()Lg6/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/k0;

    if-nez v0, :cond_b

    iget-object v0, p1, Lg6/z0;->c:Lf6/e;

    invoke-virtual {p0, v0}, Lg6/f;->j(Lf6/e;)Lg6/k0;

    move-result-object v0

    :cond_b
    invoke-virtual {v0}, Lg6/k0;->P()Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v1, p0, Lg6/f;->r:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iget v2, p1, Lg6/z0;->b:I

    if-eq v1, v2, :cond_c

    iget-object p1, p1, Lg6/z0;->a:Lg6/x1;

    sget-object v1, Lg6/f;->y:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1, v1}, Lg6/x1;->a(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0}, Lg6/k0;->L()V

    goto/16 :goto_8

    :cond_c
    iget-object p1, p1, Lg6/z0;->a:Lg6/x1;

    invoke-virtual {v0, p1}, Lg6/k0;->F(Lg6/x1;)V

    goto/16 :goto_8

    :pswitch_e
    iget-object p1, p0, Lg6/f;->s:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/k0;

    invoke-virtual {v0}, Lg6/k0;->D()V

    invoke-virtual {v0}, Lg6/k0;->E()V

    goto :goto_4

    :pswitch_f
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lg6/y1;

    invoke-virtual {p1}, Lg6/y1;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg6/b;

    iget-object v3, p0, Lg6/f;->s:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg6/k0;

    if-nez v3, :cond_d

    new-instance v0, Le6/b;

    invoke-direct {v0, v1}, Le6/b;-><init>(I)V

    invoke-virtual {p1, v2, v0, v6}, Lg6/y1;->b(Lg6/b;Le6/b;Ljava/lang/String;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v3}, Lg6/k0;->O()Z

    move-result v4

    if-eqz v4, :cond_e

    sget-object v4, Le6/b;->l:Le6/b;

    invoke-virtual {v3}, Lg6/k0;->v()Lf6/a$f;

    move-result-object v3

    invoke-interface {v3}, Lf6/a$f;->getEndpointPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v4, v3}, Lg6/y1;->b(Lg6/b;Le6/b;Ljava/lang/String;)V

    goto :goto_5

    :cond_e
    invoke-virtual {v3}, Lg6/k0;->t()Le6/b;

    move-result-object v4

    if-eqz v4, :cond_f

    invoke-virtual {p1, v2, v4, v6}, Lg6/y1;->b(Lg6/b;Le6/b;Ljava/lang/String;)V

    goto :goto_5

    :cond_f
    invoke-virtual {v3, p1}, Lg6/k0;->J(Lg6/y1;)V

    invoke-virtual {v3}, Lg6/k0;->E()V

    goto :goto_5

    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eq v8, p1, :cond_10

    goto :goto_6

    :cond_10
    const-wide/16 v2, 0x2710

    :goto_6
    iput-wide v2, p0, Lg6/f;->j:J

    iget-object p1, p0, Lg6/f;->w:Landroid/os/Handler;

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p1, p0, Lg6/f;->s:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg6/b;

    iget-object v2, p0, Lg6/f;->w:Landroid/os/Handler;

    invoke-virtual {v2, v0, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget-wide v3, p0, Lg6/f;->j:J

    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_7

    :cond_11
    :goto_8
    return v8

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_d
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Lf6/e;)Lg6/k0;
    .locals 2

    invoke-virtual {p1}, Lf6/e;->getApiKey()Lg6/b;

    move-result-object v0

    iget-object v1, p0, Lg6/f;->s:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg6/k0;

    if-nez v1, :cond_0

    new-instance v1, Lg6/k0;

    invoke-direct {v1, p0, p1}, Lg6/k0;-><init>(Lg6/f;Lf6/e;)V

    iget-object p1, p0, Lg6/f;->s:Ljava/util/Map;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v1}, Lg6/k0;->P()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lg6/f;->v:Ljava/util/Set;

    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {v1}, Lg6/k0;->E()V

    return-object v1
.end method

.method public final k()Lh6/y;
    .locals 1

    iget-object v0, p0, Lg6/f;->m:Lh6/y;

    if-nez v0, :cond_0

    iget-object v0, p0, Lg6/f;->n:Landroid/content/Context;

    invoke-static {v0}, Lh6/x;->a(Landroid/content/Context;)Lh6/y;

    move-result-object v0

    iput-object v0, p0, Lg6/f;->m:Lh6/y;

    :cond_0
    iget-object v0, p0, Lg6/f;->m:Lh6/y;

    return-object v0
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, Lg6/f;->l:Lh6/w;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lh6/w;->I()I

    move-result v1

    if-gtz v1, :cond_0

    invoke-virtual {p0}, Lg6/f;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lg6/f;->k()Lh6/y;

    move-result-object v1

    invoke-interface {v1, v0}, Lh6/y;->a(Lh6/w;)Lcom/google/android/gms/tasks/Task;

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lg6/f;->l:Lh6/w;

    :cond_2
    return-void
.end method

.method public final m(Lcom/google/android/gms/tasks/TaskCompletionSource;ILf6/e;)V
    .locals 1

    if-eqz p2, :cond_0

    invoke-virtual {p3}, Lf6/e;->getApiKey()Lg6/b;

    move-result-object p3

    invoke-static {p0, p2, p3}, Lg6/v0;->a(Lg6/f;ILg6/b;)Lg6/v0;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iget-object p3, p0, Lg6/f;->w:Landroid/os/Handler;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lg6/e0;

    invoke-direct {v0, p3}, Lg6/e0;-><init>(Landroid/os/Handler;)V

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    return-void
.end method

.method public final n()I
    .locals 1

    iget-object v0, p0, Lg6/f;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    return v0
.end method

.method public final x(Lg6/b;)Lg6/k0;
    .locals 1

    iget-object v0, p0, Lg6/f;->s:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg6/k0;

    return-object p1
.end method
