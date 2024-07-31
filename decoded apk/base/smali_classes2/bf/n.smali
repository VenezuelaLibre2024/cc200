.class public final Lbf/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lbf/d;


# instance fields
.field public final h:Lbf/c;

.field public final i:Lbf/s;

.field public j:Z


# direct methods
.method public constructor <init>(Lbf/s;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lbf/c;

    invoke-direct {v0}, Lbf/c;-><init>()V

    iput-object v0, p0, Lbf/n;->h:Lbf/c;

    const-string v0, "sink == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lbf/n;->i:Lbf/s;

    return-void
.end method


# virtual methods
.method public C(I)Lbf/d;
    .locals 1

    iget-boolean v0, p0, Lbf/n;->j:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lbf/n;->h:Lbf/c;

    invoke-virtual {v0, p1}, Lbf/c;->v0(I)Lbf/c;

    invoke-virtual {p0}, Lbf/n;->J()Lbf/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public C0(Lbf/c;J)V
    .locals 1

    iget-boolean v0, p0, Lbf/n;->j:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lbf/n;->h:Lbf/c;

    invoke-virtual {v0, p1, p2, p3}, Lbf/c;->C0(Lbf/c;J)V

    invoke-virtual {p0}, Lbf/n;->J()Lbf/d;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public J()Lbf/d;
    .locals 4

    iget-boolean v0, p0, Lbf/n;->j:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lbf/n;->h:Lbf/c;

    invoke-virtual {v0}, Lbf/c;->n()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    iget-object v2, p0, Lbf/n;->i:Lbf/s;

    iget-object v3, p0, Lbf/n;->h:Lbf/c;

    invoke-interface {v2, v3, v0, v1}, Lbf/s;->C0(Lbf/c;J)V

    :cond_0
    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public S(Ljava/lang/String;)Lbf/d;
    .locals 1

    iget-boolean v0, p0, Lbf/n;->j:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lbf/n;->h:Lbf/c;

    invoke-virtual {v0, p1}, Lbf/c;->H0(Ljava/lang/String;)Lbf/c;

    invoke-virtual {p0}, Lbf/n;->J()Lbf/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public Y([BII)Lbf/d;
    .locals 1

    iget-boolean v0, p0, Lbf/n;->j:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lbf/n;->h:Lbf/c;

    invoke-virtual {v0, p1, p2, p3}, Lbf/c;->s0([BII)Lbf/c;

    invoke-virtual {p0}, Lbf/n;->J()Lbf/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b()Lbf/c;
    .locals 1

    iget-object v0, p0, Lbf/n;->h:Lbf/c;

    return-object v0
.end method

.method public c()Lbf/u;
    .locals 1

    iget-object v0, p0, Lbf/n;->i:Lbf/s;

    invoke-interface {v0}, Lbf/s;->c()Lbf/u;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 6

    iget-boolean v0, p0, Lbf/n;->j:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lbf/n;->h:Lbf/c;

    iget-wide v2, v1, Lbf/c;->i:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_1

    iget-object v4, p0, Lbf/n;->i:Lbf/s;

    invoke-interface {v4, v1, v2, v3}, Lbf/s;->C0(Lbf/c;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :cond_1
    :goto_0
    :try_start_1
    iget-object v1, p0, Lbf/n;->i:Lbf/s;

    invoke-interface {v1}, Lbf/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    if-nez v0, :cond_2

    move-object v0, v1

    :cond_2
    :goto_1
    const/4 v1, 0x1

    iput-boolean v1, p0, Lbf/n;->j:Z

    if-eqz v0, :cond_3

    invoke-static {v0}, Lbf/v;->e(Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method public d0(J)Lbf/d;
    .locals 1

    iget-boolean v0, p0, Lbf/n;->j:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lbf/n;->h:Lbf/c;

    invoke-virtual {v0, p1, p2}, Lbf/c;->x0(J)Lbf/c;

    invoke-virtual {p0}, Lbf/n;->J()Lbf/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public flush()V
    .locals 5

    iget-boolean v0, p0, Lbf/n;->j:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lbf/n;->h:Lbf/c;

    iget-wide v1, v0, Lbf/c;->i:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-lez v3, :cond_0

    iget-object v3, p0, Lbf/n;->i:Lbf/s;

    invoke-interface {v3, v0, v1, v2}, Lbf/s;->C0(Lbf/c;J)V

    :cond_0
    iget-object v0, p0, Lbf/n;->i:Lbf/s;

    invoke-interface {v0}, Lbf/s;->flush()V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isOpen()Z
    .locals 1

    iget-boolean v0, p0, Lbf/n;->j:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public r(I)Lbf/d;
    .locals 1

    iget-boolean v0, p0, Lbf/n;->j:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lbf/n;->h:Lbf/c;

    invoke-virtual {v0, p1}, Lbf/c;->z0(I)Lbf/c;

    invoke-virtual {p0}, Lbf/n;->J()Lbf/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public t0([B)Lbf/d;
    .locals 1

    iget-boolean v0, p0, Lbf/n;->j:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lbf/n;->h:Lbf/c;

    invoke-virtual {v0, p1}, Lbf/c;->r0([B)Lbf/c;

    invoke-virtual {p0}, Lbf/n;->J()Lbf/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "buffer("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lbf/n;->i:Lbf/s;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(I)Lbf/d;
    .locals 1

    iget-boolean v0, p0, Lbf/n;->j:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lbf/n;->h:Lbf/c;

    invoke-virtual {v0, p1}, Lbf/c;->y0(I)Lbf/c;

    invoke-virtual {p0}, Lbf/n;->J()Lbf/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 1

    iget-boolean v0, p0, Lbf/n;->j:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lbf/n;->h:Lbf/c;

    invoke-virtual {v0, p1}, Lbf/c;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    invoke-virtual {p0}, Lbf/n;->J()Lbf/d;

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
