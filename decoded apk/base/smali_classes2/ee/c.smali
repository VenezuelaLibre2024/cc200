.class public final Lee/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lee/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:I

.field public static final c:I

.field public static final d:Lhe/l0;

.field public static final e:Lhe/l0;

.field public static final f:Lhe/l0;

.field public static final g:Lhe/l0;

.field public static final h:Lhe/l0;

.field public static final i:Lhe/l0;

.field public static final j:Lhe/l0;

.field public static final k:Lhe/l0;

.field public static final l:Lhe/l0;

.field public static final m:Lhe/l0;

.field public static final n:Lhe/l0;

.field public static final o:Lhe/l0;

.field public static final p:Lhe/l0;

.field public static final q:Lhe/l0;

.field public static final r:Lhe/l0;

.field public static final s:Lhe/l0;


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    new-instance v6, Lee/h;

    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lee/h;-><init>(JLee/h;Lee/b;I)V

    sput-object v6, Lee/c;->a:Lee/h;

    const-string v7, "kotlinx.coroutines.bufferedChannel.segmentSize"

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xc

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, Lhe/m0;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, Lee/c;->b:I

    const-string v1, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"

    const/16 v2, 0x2710

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lhe/m0;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, Lee/c;->c:I

    new-instance v0, Lhe/l0;

    const-string v1, "BUFFERED"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lee/c;->d:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "SHOULD_BUFFER"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lee/c;->e:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "S_RESUMING_BY_RCV"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lee/c;->f:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "RESUMING_BY_EB"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lee/c;->g:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "POISONED"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lee/c;->h:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "DONE_RCV"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lee/c;->i:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "INTERRUPTED_SEND"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lee/c;->j:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "INTERRUPTED_RCV"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lee/c;->k:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "CHANNEL_CLOSED"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lee/c;->l:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "SUSPEND"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lee/c;->m:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "SUSPEND_NO_WAITER"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lee/c;->n:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "FAILED"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lee/c;->o:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "NO_RECEIVE_RESULT"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lee/c;->p:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "CLOSE_HANDLER_CLOSED"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lee/c;->q:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "CLOSE_HANDLER_INVOKED"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lee/c;->r:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "NO_CLOSE_CAUSE"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lee/c;->s:Lhe/l0;

    return-void
.end method

.method public static final A(I)J
    .locals 2

    if-eqz p0, :cond_1

    const v0, 0x7fffffff

    if-eq p0, v0, :cond_0

    int-to-long v0, p0

    goto :goto_0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public static final B(Lce/n;Ljava/lang/Object;Lsd/l;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lce/n<",
            "-TT;>;TT;",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0, p2}, Lce/n;->e(Ljava/lang/Object;Ljava/lang/Object;Lsd/l;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lce/n;->m(Ljava/lang/Object;)V

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic C(Lce/n;Ljava/lang/Object;Lsd/l;ILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lee/c;->B(Lce/n;Ljava/lang/Object;Lsd/l;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic a(JZ)J
    .locals 0

    invoke-static {p0, p1, p2}, Lee/c;->v(JZ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic b(JI)J
    .locals 0

    invoke-static {p0, p1, p2}, Lee/c;->w(JI)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic c(JLee/h;)Lee/h;
    .locals 0

    invoke-static {p0, p1, p2}, Lee/c;->x(JLee/h;)Lee/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d()Lhe/l0;
    .locals 1

    sget-object v0, Lee/c;->q:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic e()Lhe/l0;
    .locals 1

    sget-object v0, Lee/c;->r:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic f()Lhe/l0;
    .locals 1

    sget-object v0, Lee/c;->i:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic g()I
    .locals 1

    sget v0, Lee/c;->c:I

    return v0
.end method

.method public static final synthetic h()Lhe/l0;
    .locals 1

    sget-object v0, Lee/c;->o:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic i()Lhe/l0;
    .locals 1

    sget-object v0, Lee/c;->k:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic j()Lhe/l0;
    .locals 1

    sget-object v0, Lee/c;->j:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic k()Lhe/l0;
    .locals 1

    sget-object v0, Lee/c;->e:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic l()Lhe/l0;
    .locals 1

    sget-object v0, Lee/c;->s:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic m()Lhe/l0;
    .locals 1

    sget-object v0, Lee/c;->p:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic n()Lee/h;
    .locals 1

    sget-object v0, Lee/c;->a:Lee/h;

    return-object v0
.end method

.method public static final synthetic o()Lhe/l0;
    .locals 1

    sget-object v0, Lee/c;->h:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic p()Lhe/l0;
    .locals 1

    sget-object v0, Lee/c;->g:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic q()Lhe/l0;
    .locals 1

    sget-object v0, Lee/c;->f:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic r()Lhe/l0;
    .locals 1

    sget-object v0, Lee/c;->m:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic s()Lhe/l0;
    .locals 1

    sget-object v0, Lee/c;->n:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic t(I)J
    .locals 2

    invoke-static {p0}, Lee/c;->A(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic u(Lce/n;Ljava/lang/Object;Lsd/l;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lee/c;->B(Lce/n;Ljava/lang/Object;Lsd/l;)Z

    move-result p0

    return p0
.end method

.method public static final v(JZ)J
    .locals 2

    if-eqz p2, :cond_0

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    add-long/2addr v0, p0

    return-wide v0
.end method

.method public static final w(JI)J
    .locals 2

    int-to-long v0, p2

    const/16 p2, 0x3c

    shl-long/2addr v0, p2

    add-long/2addr v0, p0

    return-wide v0
.end method

.method public static final x(JLee/h;)Lee/h;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(J",
            "Lee/h<",
            "TE;>;)",
            "Lee/h<",
            "TE;>;"
        }
    .end annotation

    new-instance v6, Lee/h;

    invoke-virtual {p2}, Lee/h;->u()Lee/b;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, v6

    move-wide v1, p0

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lee/h;-><init>(JLee/h;Lee/b;I)V

    return-object v6
.end method

.method public static final y()Lyd/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lyd/e<",
            "Lee/h<",
            "TE;>;>;"
        }
    .end annotation

    sget-object v0, Lee/c$a;->h:Lee/c$a;

    return-object v0
.end method

.method public static final z()Lhe/l0;
    .locals 1

    sget-object v0, Lee/c;->l:Lhe/l0;

    return-object v0
.end method
