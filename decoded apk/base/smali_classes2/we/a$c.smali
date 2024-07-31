.class public final Lwe/a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lbf/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwe/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final h:Lbf/i;

.field public i:Z

.field public final synthetic j:Lwe/a;


# direct methods
.method public constructor <init>(Lwe/a;)V
    .locals 1

    iput-object p1, p0, Lwe/a$c;->j:Lwe/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lbf/i;

    invoke-static {p1}, Lwe/a;->j(Lwe/a;)Lbf/d;

    move-result-object p1

    invoke-interface {p1}, Lbf/s;->c()Lbf/u;

    move-result-object p1

    invoke-direct {v0, p1}, Lbf/i;-><init>(Lbf/u;)V

    iput-object v0, p0, Lwe/a$c;->h:Lbf/i;

    return-void
.end method


# virtual methods
.method public C0(Lbf/c;J)V
    .locals 2

    iget-boolean v0, p0, Lwe/a$c;->i:Z

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lwe/a$c;->j:Lwe/a;

    invoke-static {v0}, Lwe/a;->j(Lwe/a;)Lbf/d;

    move-result-object v0

    invoke-interface {v0, p2, p3}, Lbf/d;->d0(J)Lbf/d;

    iget-object v0, p0, Lwe/a$c;->j:Lwe/a;

    invoke-static {v0}, Lwe/a;->j(Lwe/a;)Lbf/d;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Lbf/d;->S(Ljava/lang/String;)Lbf/d;

    iget-object v0, p0, Lwe/a$c;->j:Lwe/a;

    invoke-static {v0}, Lwe/a;->j(Lwe/a;)Lbf/d;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lbf/s;->C0(Lbf/c;J)V

    iget-object p1, p0, Lwe/a$c;->j:Lwe/a;

    invoke-static {p1}, Lwe/a;->j(Lwe/a;)Lbf/d;

    move-result-object p1

    invoke-interface {p1, v1}, Lbf/d;->S(Ljava/lang/String;)Lbf/d;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()Lbf/u;
    .locals 1

    iget-object v0, p0, Lwe/a$c;->h:Lbf/i;

    return-object v0
.end method

.method public declared-synchronized close()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lwe/a$c;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lwe/a$c;->i:Z

    iget-object v0, p0, Lwe/a$c;->j:Lwe/a;

    invoke-static {v0}, Lwe/a;->j(Lwe/a;)Lbf/d;

    move-result-object v0

    const-string v1, "0\r\n\r\n"

    invoke-interface {v0, v1}, Lbf/d;->S(Ljava/lang/String;)Lbf/d;

    iget-object v0, p0, Lwe/a$c;->j:Lwe/a;

    iget-object v1, p0, Lwe/a$c;->h:Lbf/i;

    invoke-static {v0, v1}, Lwe/a;->k(Lwe/a;Lbf/i;)V

    iget-object v0, p0, Lwe/a$c;->j:Lwe/a;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lwe/a;->m(Lwe/a;I)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized flush()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lwe/a$c;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lwe/a$c;->j:Lwe/a;

    invoke-static {v0}, Lwe/a;->j(Lwe/a;)Lbf/d;

    move-result-object v0

    invoke-interface {v0}, Lbf/d;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
