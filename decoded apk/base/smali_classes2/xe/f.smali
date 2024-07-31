.class public final Lxe/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/f$j;,
        Lxe/f$l;,
        Lxe/f$h;,
        Lxe/f$i;,
        Lxe/f$k;
    }
.end annotation


# static fields
.field public static final G:Ljava/util/concurrent/ExecutorService;


# instance fields
.field public A:Lxe/m;

.field public final B:Lxe/m;

.field public final C:Ljava/net/Socket;

.field public final D:Lxe/j;

.field public final E:Lxe/f$l;

.field public final F:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Z

.field public final i:Lxe/f$j;

.field public final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lxe/i;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Ljava/lang/String;

.field public l:I

.field public m:I

.field public n:Z

.field public final o:Ljava/util/concurrent/ScheduledExecutorService;

.field public final p:Ljava/util/concurrent/ExecutorService;

.field public final q:Lxe/l;

.field public r:J

.field public s:J

.field public t:J

.field public u:J

.field public v:J

.field public w:J

.field public x:J

.field public y:J

.field public z:J


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    const-class v0, Lxe/f;

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v2, 0x0

    const v3, 0x7fffffff

    const-wide/16 v4, 0x3c

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v7}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const/4 v1, 0x1

    const-string v8, "OkHttp Http2Connection"

    invoke-static {v8, v1}, Lse/e;->H(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v8

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v0, Lxe/f;->G:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>(Lxe/f$h;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v2, v0, Lxe/f;->j:Ljava/util/Map;

    const-wide/16 v2, 0x0

    iput-wide v2, v0, Lxe/f;->r:J

    iput-wide v2, v0, Lxe/f;->s:J

    iput-wide v2, v0, Lxe/f;->t:J

    iput-wide v2, v0, Lxe/f;->u:J

    iput-wide v2, v0, Lxe/f;->v:J

    iput-wide v2, v0, Lxe/f;->w:J

    iput-wide v2, v0, Lxe/f;->x:J

    iput-wide v2, v0, Lxe/f;->y:J

    new-instance v2, Lxe/m;

    invoke-direct {v2}, Lxe/m;-><init>()V

    iput-object v2, v0, Lxe/f;->A:Lxe/m;

    new-instance v2, Lxe/m;

    invoke-direct {v2}, Lxe/m;-><init>()V

    iput-object v2, v0, Lxe/f;->B:Lxe/m;

    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v3, v0, Lxe/f;->F:Ljava/util/Set;

    iget-object v3, v1, Lxe/f$h;->f:Lxe/l;

    iput-object v3, v0, Lxe/f;->q:Lxe/l;

    iget-boolean v3, v1, Lxe/f$h;->g:Z

    iput-boolean v3, v0, Lxe/f;->h:Z

    iget-object v4, v1, Lxe/f$h;->e:Lxe/f$j;

    iput-object v4, v0, Lxe/f;->i:Lxe/f$j;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_0

    move v6, v5

    goto :goto_0

    :cond_0
    move v6, v4

    :goto_0
    iput v6, v0, Lxe/f;->m:I

    if-eqz v3, :cond_1

    add-int/2addr v6, v4

    iput v6, v0, Lxe/f;->m:I

    :cond_1
    const/4 v4, 0x7

    if-eqz v3, :cond_2

    iget-object v6, v0, Lxe/f;->A:Lxe/m;

    const/high16 v7, 0x1000000

    invoke-virtual {v6, v4, v7}, Lxe/m;->i(II)Lxe/m;

    :cond_2
    iget-object v6, v1, Lxe/f$h;->b:Ljava/lang/String;

    iput-object v6, v0, Lxe/f;->k:Ljava/lang/String;

    new-instance v7, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-array v8, v5, [Ljava/lang/Object;

    const/4 v14, 0x0

    aput-object v6, v8, v14

    const-string v9, "OkHttp %s Writer"

    invoke-static {v9, v8}, Lse/e;->p(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v14}, Lse/e;->H(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v8

    invoke-direct {v7, v5, v8}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    iput-object v7, v0, Lxe/f;->o:Ljava/util/concurrent/ScheduledExecutorService;

    iget v8, v1, Lxe/f$h;->h:I

    if-eqz v8, :cond_3

    new-instance v8, Lxe/f$i;

    invoke-direct {v8, v0}, Lxe/f$i;-><init>(Lxe/f;)V

    iget v9, v1, Lxe/f$h;->h:I

    int-to-long v10, v9

    int-to-long v12, v9

    sget-object v15, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v9, v10

    move-wide v11, v12

    move-object v13, v15

    invoke-interface/range {v7 .. v13}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    :cond_3
    new-instance v7, Ljava/util/concurrent/ThreadPoolExecutor;

    const/16 v17, 0x0

    const/16 v18, 0x1

    const-wide/16 v19, 0x3c

    sget-object v21, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v22, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct/range {v22 .. v22}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-array v8, v5, [Ljava/lang/Object;

    aput-object v6, v8, v14

    const-string v6, "OkHttp %s Push Observer"

    invoke-static {v6, v8}, Lse/e;->p(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, Lse/e;->H(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v23

    move-object/from16 v16, v7

    invoke-direct/range {v16 .. v23}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v7, v0, Lxe/f;->p:Ljava/util/concurrent/ExecutorService;

    const v5, 0xffff

    invoke-virtual {v2, v4, v5}, Lxe/m;->i(II)Lxe/m;

    const/4 v4, 0x5

    const/16 v5, 0x4000

    invoke-virtual {v2, v4, v5}, Lxe/m;->i(II)Lxe/m;

    invoke-virtual {v2}, Lxe/m;->d()I

    move-result v2

    int-to-long v4, v2

    iput-wide v4, v0, Lxe/f;->z:J

    iget-object v2, v1, Lxe/f$h;->a:Ljava/net/Socket;

    iput-object v2, v0, Lxe/f;->C:Ljava/net/Socket;

    new-instance v2, Lxe/j;

    iget-object v4, v1, Lxe/f$h;->d:Lbf/d;

    invoke-direct {v2, v4, v3}, Lxe/j;-><init>(Lbf/d;Z)V

    iput-object v2, v0, Lxe/f;->D:Lxe/j;

    new-instance v2, Lxe/f$l;

    new-instance v4, Lxe/h;

    iget-object v1, v1, Lxe/f$h;->c:Lbf/e;

    invoke-direct {v4, v1, v3}, Lxe/h;-><init>(Lbf/e;Z)V

    invoke-direct {v2, v0, v4}, Lxe/f$l;-><init>(Lxe/f;Lxe/h;)V

    iput-object v2, v0, Lxe/f;->E:Lxe/f$l;

    return-void
.end method

.method public static synthetic E(Lxe/f;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    iget-object p0, p0, Lxe/f;->o:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method public static synthetic I(Lxe/f;)J
    .locals 4

    iget-wide v0, p0, Lxe/f;->u:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lxe/f;->u:J

    return-wide v0
.end method

.method public static synthetic K(Lxe/f;)J
    .locals 4

    iget-wide v0, p0, Lxe/f;->w:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lxe/f;->w:J

    return-wide v0
.end method

.method public static synthetic a(Lxe/f;Ljava/io/IOException;)V
    .locals 0

    invoke-virtual {p0, p1}, Lxe/f;->W(Ljava/io/IOException;)V

    return-void
.end method

.method public static synthetic d(Lxe/f;)J
    .locals 2

    iget-wide v0, p0, Lxe/f;->s:J

    return-wide v0
.end method

.method public static synthetic f(Lxe/f;)J
    .locals 4

    iget-wide v0, p0, Lxe/f;->s:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lxe/f;->s:J

    return-wide v0
.end method

.method public static synthetic j(Lxe/f;)J
    .locals 2

    iget-wide v0, p0, Lxe/f;->r:J

    return-wide v0
.end method

.method public static synthetic l(Lxe/f;)J
    .locals 4

    iget-wide v0, p0, Lxe/f;->r:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lxe/f;->r:J

    return-wide v0
.end method

.method public static synthetic n(Lxe/f;)Z
    .locals 0

    iget-boolean p0, p0, Lxe/f;->n:Z

    return p0
.end method

.method public static synthetic w(Lxe/f;Z)Z
    .locals 0

    iput-boolean p1, p0, Lxe/f;->n:Z

    return p1
.end method

.method public static synthetic x()Ljava/util/concurrent/ExecutorService;
    .locals 1

    sget-object v0, Lxe/f;->G:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized G0(J)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lxe/f;->y:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lxe/f;->y:J

    iget-object p1, p0, Lxe/f;->A:Lxe/m;

    invoke-virtual {p1}, Lxe/m;->d()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-long p1, p1

    cmp-long p1, v0, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x0

    iget-wide v0, p0, Lxe/f;->y:J

    invoke-virtual {p0, p1, v0, v1}, Lxe/f;->M0(IJ)V

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lxe/f;->y:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public H0(IZLbf/c;J)V
    .locals 8

    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget-object p4, p0, Lxe/f;->D:Lxe/j;

    invoke-virtual {p4, p2, p1, p3, v3}, Lxe/j;->f(ZILbf/c;I)V

    return-void

    :cond_0
    :goto_0
    cmp-long v2, p4, v0

    if-lez v2, :cond_4

    monitor-enter p0

    :goto_1
    :try_start_0
    iget-wide v4, p0, Lxe/f;->z:J

    cmp-long v2, v4, v0

    if-gtz v2, :cond_2

    iget-object v2, p0, Lxe/f;->j:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :try_start_1
    invoke-static {p4, p5, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v2, v4

    iget-object v4, p0, Lxe/f;->D:Lxe/j;

    invoke-virtual {v4}, Lxe/j;->x()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-wide v4, p0, Lxe/f;->z:J

    int-to-long v6, v2

    sub-long/2addr v4, v6

    iput-wide v4, p0, Lxe/f;->z:J

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sub-long/2addr p4, v6

    iget-object v4, p0, Lxe/f;->D:Lxe/j;

    if-eqz p2, :cond_3

    cmp-long v5, p4, v0

    if-nez v5, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    move v5, v3

    :goto_2
    invoke-virtual {v4, v5, p1, p3, v2}, Lxe/j;->f(ZILbf/c;I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1

    :goto_3
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_4
    return-void
.end method

.method public I0(IZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Ljava/util/List<",
            "Lxe/c;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lxe/f;->D:Lxe/j;

    invoke-virtual {v0, p2, p1, p3}, Lxe/j;->w(ZILjava/util/List;)V

    return-void
.end method

.method public J0(ZII)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lxe/f;->D:Lxe/j;

    invoke-virtual {v0, p1, p2, p3}, Lxe/j;->E(ZII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Lxe/f;->W(Ljava/io/IOException;)V

    :goto_0
    return-void
.end method

.method public K0(ILxe/b;)V
    .locals 1

    iget-object v0, p0, Lxe/f;->D:Lxe/j;

    invoke-virtual {v0, p1, p2}, Lxe/j;->K(ILxe/b;)V

    return-void
.end method

.method public L0(ILxe/b;)V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lxe/f;->o:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v7, Lxe/f$a;

    const-string v3, "OkHttp %s stream %d"

    const/4 v1, 0x2

    new-array v4, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lxe/f;->k:Ljava/lang/String;

    aput-object v2, v4, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v1

    move-object v1, v7

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lxe/f$a;-><init>(Lxe/f;Ljava/lang/String;[Ljava/lang/Object;ILxe/b;)V

    invoke-interface {v0, v7}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public M0(IJ)V
    .locals 9

    :try_start_0
    iget-object v0, p0, Lxe/f;->o:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v8, Lxe/f$b;

    const-string v3, "OkHttp Window Update %s stream %d"

    const/4 v1, 0x2

    new-array v4, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lxe/f;->k:Ljava/lang/String;

    aput-object v2, v4, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v1

    move-object v1, v8

    move-object v2, p0

    move v5, p1

    move-wide v6, p2

    invoke-direct/range {v1 .. v7}, Lxe/f$b;-><init>(Lxe/f;Ljava/lang/String;[Ljava/lang/Object;IJ)V

    invoke-interface {v0, v8}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public P(Lxe/b;Lxe/b;Ljava/io/IOException;)V
    .locals 3

    :try_start_0
    invoke-virtual {p0, p1}, Lxe/f;->x0(Lxe/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 p1, 0x0

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lxe/f;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lxe/f;->j:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    iget-object v0, p0, Lxe/f;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    new-array v0, v0, [Lxe/i;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lxe/i;

    iget-object v0, p0, Lxe/f;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    :cond_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    :try_start_2
    invoke-virtual {v2, p2, p3}, Lxe/i;->d(Lxe/b;Ljava/io/IOException;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :try_start_3
    iget-object p1, p0, Lxe/f;->D:Lxe/j;

    invoke-virtual {p1}, Lxe/j;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :try_start_4
    iget-object p1, p0, Lxe/f;->C:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    iget-object p1, p0, Lxe/f;->o:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    iget-object p1, p0, Lxe/f;->p:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public final W(Ljava/io/IOException;)V
    .locals 1

    sget-object v0, Lxe/b;->j:Lxe/b;

    invoke-virtual {p0, v0, v0, p1}, Lxe/f;->P(Lxe/b;Lxe/b;Ljava/io/IOException;)V

    return-void
.end method

.method public declared-synchronized b0(I)Lxe/i;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lxe/f;->j:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxe/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized c0(J)Z
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lxe/f;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-wide v2, p0, Lxe/f;->u:J

    iget-wide v4, p0, Lxe/f;->t:J

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    iget-wide v2, p0, Lxe/f;->x:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long p1, p1, v2

    if-ltz p1, :cond_1

    monitor-exit p0

    return v1

    :cond_1
    const/4 p1, 0x1

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public close()V
    .locals 3

    sget-object v0, Lxe/b;->i:Lxe/b;

    sget-object v1, Lxe/b;->n:Lxe/b;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lxe/f;->P(Lxe/b;Lxe/b;Ljava/io/IOException;)V

    return-void
.end method

.method public declared-synchronized e0()I
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lxe/f;->B:Lxe/m;

    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Lxe/m;->e(I)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final f0(ILjava/util/List;Z)Lxe/i;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lxe/c;",
            ">;Z)",
            "Lxe/i;"
        }
    .end annotation

    xor-int/lit8 v6, p3, 0x1

    const/4 v4, 0x0

    iget-object v7, p0, Lxe/f;->D:Lxe/j;

    monitor-enter v7

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget v0, p0, Lxe/f;->m:I

    const v1, 0x3fffffff    # 1.9999999f

    if-le v0, v1, :cond_0

    sget-object v0, Lxe/b;->m:Lxe/b;

    invoke-virtual {p0, v0}, Lxe/f;->x0(Lxe/b;)V

    :cond_0
    iget-boolean v0, p0, Lxe/f;->n:Z

    if-nez v0, :cond_7

    iget v8, p0, Lxe/f;->m:I

    add-int/lit8 v0, v8, 0x2

    iput v0, p0, Lxe/f;->m:I

    new-instance v9, Lxe/i;

    const/4 v5, 0x0

    move-object v0, v9

    move v1, v8

    move-object v2, p0

    move v3, v6

    invoke-direct/range {v0 .. v5}, Lxe/i;-><init>(ILxe/f;ZZLre/u;)V

    if-eqz p3, :cond_2

    iget-wide v0, p0, Lxe/f;->z:J

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-eqz p3, :cond_2

    iget-wide v0, v9, Lxe/i;->b:J

    cmp-long p3, v0, v2

    if-nez p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p3, 0x1

    :goto_1
    invoke-virtual {v9}, Lxe/i;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lxe/f;->j:Ljava/util/Map;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p1, :cond_4

    :try_start_2
    iget-object p1, p0, Lxe/f;->D:Lxe/j;

    invoke-virtual {p1, v6, v8, p2}, Lxe/j;->w(ZILjava/util/List;)V

    goto :goto_2

    :cond_4
    iget-boolean v0, p0, Lxe/f;->h:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Lxe/f;->D:Lxe/j;

    invoke-virtual {v0, p1, v8, p2}, Lxe/j;->I(IILjava/util/List;)V

    :goto_2
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz p3, :cond_5

    iget-object p1, p0, Lxe/f;->D:Lxe/j;

    invoke-virtual {p1}, Lxe/j;->flush()V

    :cond_5
    return-object v9

    :cond_6
    :try_start_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "client streams shouldn\'t have associated stream IDs"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_7
    :try_start_4
    new-instance p1, Lxe/a;

    invoke-direct {p1}, Lxe/a;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, Lxe/f;->D:Lxe/j;

    invoke-virtual {v0}, Lxe/j;->flush()V

    return-void
.end method

.method public g0(Ljava/util/List;Z)Lxe/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lxe/c;",
            ">;Z)",
            "Lxe/i;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2}, Lxe/f;->f0(ILjava/util/List;Z)Lxe/i;

    move-result-object p1

    return-object p1
.end method

.method public h0(ILbf/e;IZ)V
    .locals 8

    new-instance v5, Lbf/c;

    invoke-direct {v5}, Lbf/c;-><init>()V

    int-to-long v0, p3

    invoke-interface {p2, v0, v1}, Lbf/e;->B0(J)V

    invoke-interface {p2, v5, v0, v1}, Lbf/t;->T(Lbf/c;J)J

    invoke-virtual {v5}, Lbf/c;->g0()J

    move-result-wide v2

    cmp-long p2, v2, v0

    if-nez p2, :cond_0

    new-instance p2, Lxe/f$f;

    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-object v1, p0, Lxe/f;->k:Ljava/lang/String;

    aput-object v1, v3, v0

    const/4 v0, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v0

    const-string v2, "OkHttp %s Push Data[%s]"

    move-object v0, p2

    move-object v1, p0

    move v4, p1

    move v6, p3

    move v7, p4

    invoke-direct/range {v0 .. v7}, Lxe/f$f;-><init>(Lxe/f;Ljava/lang/String;[Ljava/lang/Object;ILbf/c;IZ)V

    invoke-virtual {p0, p2}, Lxe/f;->i0(Lse/b;)V

    return-void

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lbf/c;->g0()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p4, " != "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized i0(Lse/b;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lxe/f;->n:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lxe/f;->p:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public l0(ILjava/util/List;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lxe/c;",
            ">;Z)V"
        }
    .end annotation

    :try_start_0
    new-instance v7, Lxe/f$e;

    const-string v2, "OkHttp %s Push Headers[%s]"

    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-object v1, p0, Lxe/f;->k:Ljava/lang/String;

    aput-object v1, v3, v0

    const/4 v0, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v0

    move-object v0, v7

    move-object v1, p0

    move v4, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v0 .. v6}, Lxe/f$e;-><init>(Lxe/f;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;Z)V

    invoke-virtual {p0, v7}, Lxe/f;->i0(Lse/b;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public n0(ILjava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lxe/c;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lxe/f;->F:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lxe/b;->j:Lxe/b;

    invoke-virtual {p0, p1, p2}, Lxe/f;->L0(ILxe/b;)V

    monitor-exit p0

    return-void

    :cond_0
    iget-object v0, p0, Lxe/f;->F:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v0, Lxe/f$d;

    const-string v4, "OkHttp %s Push Request[%s]"

    const/4 v1, 0x2

    new-array v5, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lxe/f;->k:Ljava/lang/String;

    aput-object v2, v5, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v5, v1

    move-object v2, v0

    move-object v3, p0

    move v6, p1

    move-object v7, p2

    invoke-direct/range {v2 .. v7}, Lxe/f$d;-><init>(Lxe/f;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;)V

    invoke-virtual {p0, v0}, Lxe/f;->i0(Lse/b;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public r0(ILxe/b;)V
    .locals 7

    new-instance v6, Lxe/f$g;

    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/Object;

    iget-object v0, p0, Lxe/f;->k:Ljava/lang/String;

    const/4 v1, 0x0

    aput-object v0, v3, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const-string v2, "OkHttp %s Push Reset[%s]"

    move-object v0, v6

    move-object v1, p0

    move v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lxe/f$g;-><init>(Lxe/f;Ljava/lang/String;[Ljava/lang/Object;ILxe/b;)V

    invoke-virtual {p0, v6}, Lxe/f;->i0(Lse/b;)V

    return-void
.end method

.method public s0(I)Z
    .locals 1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    and-int/2addr p1, v0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public declared-synchronized u0(I)Lxe/i;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lxe/f;->j:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxe/i;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public v0()V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lxe/f;->u:J

    iget-wide v2, p0, Lxe/f;->t:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const-wide/16 v0, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lxe/f;->t:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    const-wide/32 v2, 0x3b9aca00

    add-long/2addr v0, v2

    iput-wide v0, p0, Lxe/f;->x:J

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Lxe/f;->o:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lxe/f$c;

    const-string v2, "OkHttp %s ping"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lxe/f;->k:Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-direct {v1, p0, v2, v3}, Lxe/f$c;-><init>(Lxe/f;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public x0(Lxe/b;)V
    .locals 4

    iget-object v0, p0, Lxe/f;->D:Lxe/j;

    monitor-enter v0

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-boolean v1, p0, Lxe/f;->n:Z

    if-eqz v1, :cond_0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_3
    iput-boolean v1, p0, Lxe/f;->n:Z

    iget v1, p0, Lxe/f;->l:I

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget-object v2, p0, Lxe/f;->D:Lxe/j;

    sget-object v3, Lse/e;->a:[B

    invoke-virtual {v2, v1, p1, v3}, Lxe/j;->n(ILxe/b;[B)V

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    return-void

    :catchall_0
    move-exception p1

    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1
.end method

.method public y0()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lxe/f;->z0(Z)V

    return-void
.end method

.method public z0(Z)V
    .locals 5

    if-eqz p1, :cond_0

    iget-object p1, p0, Lxe/f;->D:Lxe/j;

    invoke-virtual {p1}, Lxe/j;->d()V

    iget-object p1, p0, Lxe/f;->D:Lxe/j;

    iget-object v0, p0, Lxe/f;->A:Lxe/m;

    invoke-virtual {p1, v0}, Lxe/j;->P(Lxe/m;)V

    iget-object p1, p0, Lxe/f;->A:Lxe/m;

    invoke-virtual {p1}, Lxe/m;->d()I

    move-result p1

    const v0, 0xffff

    if-eq p1, v0, :cond_0

    iget-object v1, p0, Lxe/f;->D:Lxe/j;

    const/4 v2, 0x0

    sub-int/2addr p1, v0

    int-to-long v3, p1

    invoke-virtual {v1, v2, v3, v4}, Lxe/j;->W(IJ)V

    :cond_0
    new-instance p1, Ljava/lang/Thread;

    iget-object v0, p0, Lxe/f;->E:Lxe/f$l;

    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void
.end method
