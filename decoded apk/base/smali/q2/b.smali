.class public abstract Lq2/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq2/x;


# static fields
.field public static final n:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field public final a:J

.field public final b:Lq2/o;

.field public final c:Ljava/util/Date;

.field public d:Ljava/util/Date;

.field public e:Ljava/util/Date;

.field public final f:[Ljava/lang/String;

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lq2/n;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/lang/Object;

.field public i:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field public j:Lq2/y;

.field public k:Lq2/w;

.field public l:Ljava/lang/String;

.field public final m:Lq2/p;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lq2/b;->n:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public constructor <init>([Ljava/lang/String;Lq2/o;Lq2/p;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lq2/b;->n:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, Lq2/b;->a:J

    iput-object p2, p0, Lq2/b;->b:Lq2/o;

    new-instance p2, Ljava/util/Date;

    invoke-direct {p2}, Ljava/util/Date;-><init>()V

    iput-object p2, p0, Lq2/b;->c:Ljava/util/Date;

    const/4 p2, 0x0

    iput-object p2, p0, Lq2/b;->d:Ljava/util/Date;

    iput-object p2, p0, Lq2/b;->e:Ljava/util/Date;

    iput-object p1, p0, Lq2/b;->f:[Ljava/lang/String;

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lq2/b;->g:Ljava/util/List;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq2/b;->h:Ljava/lang/Object;

    iput-object p2, p0, Lq2/b;->i:Ljava/util/concurrent/Future;

    sget-object p1, Lq2/y;->h:Lq2/y;

    iput-object p1, p0, Lq2/b;->j:Lq2/y;

    iput-object p2, p0, Lq2/b;->k:Lq2/w;

    iput-object p2, p0, Lq2/b;->l:Ljava/lang/String;

    iput-object p3, p0, Lq2/b;->m:Lq2/p;

    invoke-static {p0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->b(Lq2/x;)V

    return-void
.end method


# virtual methods
.method public a(Lq2/w;)V
    .locals 0

    iput-object p1, p0, Lq2/b;->k:Lq2/w;

    sget-object p1, Lq2/y;->k:Lq2/y;

    iput-object p1, p0, Lq2/b;->j:Lq2/y;

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    iput-object p1, p0, Lq2/b;->e:Ljava/util/Date;

    return-void
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p1}, Lt2/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lq2/b;->l:Ljava/lang/String;

    sget-object p1, Lq2/y;->j:Lq2/y;

    iput-object p1, p0, Lq2/b;->j:Lq2/y;

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    iput-object p1, p0, Lq2/b;->e:Ljava/util/Date;

    return-void
.end method

.method public c()J
    .locals 5

    iget-object v0, p0, Lq2/b;->d:Ljava/util/Date;

    iget-object v1, p0, Lq2/b;->e:Ljava/util/Date;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    return-wide v1

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public e(I)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0, p1}, Lq2/b;->y(I)V

    invoke-virtual {p0}, Lq2/b;->h()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-wide v1, p0, Lq2/b;->a:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, p1, v0

    const-string v0, "getAllLogsAsString was called to return all logs but there are still logs being transmitted for session id %d."

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "ffmpeg-kit"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0}, Lq2/b;->v()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public f()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lq2/b;->d:Ljava/util/Date;

    return-object v0
.end method

.method public g(Lq2/n;)V
    .locals 2

    iget-object v0, p0, Lq2/b;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lq2/b;->g:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getState()Lq2/y;
    .locals 1

    iget-object v0, p0, Lq2/b;->j:Lq2/y;

    return-object v0
.end method

.method public h()Z
    .locals 2

    iget-wide v0, p0, Lq2/b;->a:J

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->messagesInTransmit(J)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public i(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lq2/n;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lq2/b;->y(I)V

    invoke-virtual {p0}, Lq2/b;->h()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-wide v1, p0, Lq2/b;->a:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, p1, v0

    const-string v0, "getAllLogs was called to return all logs but there are still logs being transmitted for session id %d."

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "ffmpeg-kit"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0}, Lq2/b;->o()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lq2/b;->f:[Ljava/lang/String;

    invoke-static {v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->c([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public k()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lq2/b;->c:Ljava/util/Date;

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lq2/b;->l:Ljava/lang/String;

    return-object v0
.end method

.method public m()Lq2/p;
    .locals 1

    iget-object v0, p0, Lq2/b;->m:Lq2/p;

    return-object v0
.end method

.method public n()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lq2/b;->e:Ljava/util/Date;

    return-object v0
.end method

.method public o()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lq2/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lq2/b;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/LinkedList;

    iget-object v2, p0, Lq2/b;->g:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public p()Lq2/o;
    .locals 1

    iget-object v0, p0, Lq2/b;->b:Lq2/o;

    return-object v0
.end method

.method public q()J
    .locals 2

    iget-wide v0, p0, Lq2/b;->a:J

    return-wide v0
.end method

.method public t()Lq2/w;
    .locals 1

    iget-object v0, p0, Lq2/b;->k:Lq2/w;

    return-object v0
.end method

.method public u()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lq2/b;->f:[Ljava/lang/String;

    return-object v0
.end method

.method public v()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lq2/b;->h:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lq2/b;->g:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq2/n;

    invoke-virtual {v3}, Lq2/n;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public w(Ljava/util/concurrent/Future;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, Lq2/b;->i:Ljava/util/concurrent/Future;

    return-void
.end method

.method public x()V
    .locals 1

    sget-object v0, Lq2/y;->i:Lq2/y;

    iput-object v0, p0, Lq2/b;->j:Lq2/y;

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lq2/b;->d:Ljava/util/Date;

    return-void
.end method

.method public y(I)V
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    :goto_0
    invoke-virtual {p0}, Lq2/b;->h()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    int-to-long v4, p1

    add-long/2addr v4, v0

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    monitor-enter p0

    const-wide/16 v2, 0x64

    :try_start_0
    invoke-virtual {p0, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    :goto_1
    :try_start_1
    monitor-exit p0

    goto :goto_0

    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    return-void
.end method
