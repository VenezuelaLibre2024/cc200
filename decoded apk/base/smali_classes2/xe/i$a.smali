.class public final Lxe/i$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lbf/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final h:Lbf/c;

.field public i:Lre/u;

.field public j:Z

.field public k:Z

.field public final synthetic l:Lxe/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lxe/i;)V
    .locals 0

    iput-object p1, p0, Lxe/i$a;->l:Lxe/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lbf/c;

    invoke-direct {p1}, Lbf/c;-><init>()V

    iput-object p1, p0, Lxe/i$a;->h:Lbf/c;

    return-void
.end method


# virtual methods
.method public C0(Lbf/c;J)V
    .locals 2

    iget-object v0, p0, Lxe/i$a;->h:Lbf/c;

    invoke-virtual {v0, p1, p2, p3}, Lbf/c;->C0(Lbf/c;J)V

    :goto_0
    iget-object p1, p0, Lxe/i$a;->h:Lbf/c;

    invoke-virtual {p1}, Lbf/c;->g0()J

    move-result-wide p1

    const-wide/16 v0, 0x4000

    cmp-long p1, p1, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lxe/i$a;->a(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a(Z)V
    .locals 11

    iget-object v0, p0, Lxe/i$a;->l:Lxe/i;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lxe/i$a;->l:Lxe/i;

    iget-object v1, v1, Lxe/i;->j:Lxe/i$c;

    invoke-virtual {v1}, Lbf/a;->k()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :goto_0
    :try_start_1
    iget-object v1, p0, Lxe/i$a;->l:Lxe/i;

    iget-wide v2, v1, Lxe/i;->b:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    iget-boolean v2, p0, Lxe/i$a;->k:Z

    if-nez v2, :cond_0

    iget-boolean v2, p0, Lxe/i$a;->j:Z

    if-nez v2, :cond_0

    iget-object v2, v1, Lxe/i;->k:Lxe/b;

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lxe/i;->q()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :cond_0
    :try_start_2
    iget-object v1, v1, Lxe/i;->j:Lxe/i$c;

    invoke-virtual {v1}, Lxe/i$c;->u()V

    iget-object v1, p0, Lxe/i$a;->l:Lxe/i;

    invoke-virtual {v1}, Lxe/i;->c()V

    iget-object v1, p0, Lxe/i$a;->l:Lxe/i;

    iget-wide v1, v1, Lxe/i;->b:J

    iget-object v3, p0, Lxe/i$a;->h:Lbf/c;

    invoke-virtual {v3}, Lbf/c;->g0()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    iget-object v1, p0, Lxe/i$a;->l:Lxe/i;

    iget-wide v2, v1, Lxe/i;->b:J

    sub-long/2addr v2, v9

    iput-wide v2, v1, Lxe/i;->b:J

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    iget-object v0, v1, Lxe/i;->j:Lxe/i$c;

    invoke-virtual {v0}, Lbf/a;->k()V

    if-eqz p1, :cond_1

    :try_start_3
    iget-object p1, p0, Lxe/i$a;->h:Lbf/c;

    invoke-virtual {p1}, Lbf/c;->g0()J

    move-result-wide v0

    cmp-long p1, v9, v0

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    const/4 p1, 0x0

    :goto_1
    move v7, p1

    iget-object p1, p0, Lxe/i$a;->l:Lxe/i;

    iget-object v5, p1, Lxe/i;->d:Lxe/f;

    iget v6, p1, Lxe/i;->c:I

    iget-object v8, p0, Lxe/i$a;->h:Lbf/c;

    invoke-virtual/range {v5 .. v10}, Lxe/f;->H0(IZLbf/c;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object p1, p0, Lxe/i$a;->l:Lxe/i;

    iget-object p1, p1, Lxe/i;->j:Lxe/i$c;

    invoke-virtual {p1}, Lxe/i$c;->u()V

    return-void

    :goto_2
    iget-object v0, p0, Lxe/i$a;->l:Lxe/i;

    iget-object v0, v0, Lxe/i;->j:Lxe/i$c;

    invoke-virtual {v0}, Lxe/i$c;->u()V

    throw p1

    :catchall_1
    move-exception p1

    :try_start_4
    iget-object v1, p0, Lxe/i$a;->l:Lxe/i;

    iget-object v1, v1, Lxe/i;->j:Lxe/i$c;

    invoke-virtual {v1}, Lxe/i$c;->u()V

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1
.end method

.method public c()Lbf/u;
    .locals 1

    iget-object v0, p0, Lxe/i$a;->l:Lxe/i;

    iget-object v0, v0, Lxe/i;->j:Lxe/i$c;

    return-object v0
.end method

.method public close()V
    .locals 8

    iget-object v0, p0, Lxe/i$a;->l:Lxe/i;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lxe/i$a;->j:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v0, p0, Lxe/i$a;->l:Lxe/i;

    iget-object v0, v0, Lxe/i;->h:Lxe/i$a;

    iget-boolean v0, v0, Lxe/i$a;->k:Z

    const/4 v1, 0x1

    if-nez v0, :cond_6

    iget-object v0, p0, Lxe/i$a;->h:Lbf/c;

    invoke-virtual {v0}, Lbf/c;->g0()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    const/4 v2, 0x0

    if-lez v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget-object v3, p0, Lxe/i$a;->i:Lre/u;

    if-eqz v3, :cond_2

    move v3, v1

    goto :goto_1

    :cond_2
    move v3, v2

    :goto_1
    if-eqz v3, :cond_4

    :goto_2
    iget-object v0, p0, Lxe/i$a;->h:Lbf/c;

    invoke-virtual {v0}, Lbf/c;->g0()J

    move-result-wide v6

    cmp-long v0, v6, v4

    if-lez v0, :cond_3

    invoke-virtual {p0, v2}, Lxe/i$a;->a(Z)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lxe/i$a;->l:Lxe/i;

    iget-object v2, v0, Lxe/i;->d:Lxe/f;

    iget v0, v0, Lxe/i;->c:I

    iget-object v3, p0, Lxe/i$a;->i:Lre/u;

    invoke-static {v3}, Lse/e;->I(Lre/u;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v0, v1, v3}, Lxe/f;->I0(IZLjava/util/List;)V

    goto :goto_4

    :cond_4
    if-eqz v0, :cond_5

    :goto_3
    iget-object v0, p0, Lxe/i$a;->h:Lbf/c;

    invoke-virtual {v0}, Lbf/c;->g0()J

    move-result-wide v2

    cmp-long v0, v2, v4

    if-lez v0, :cond_6

    invoke-virtual {p0, v1}, Lxe/i$a;->a(Z)V

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lxe/i$a;->l:Lxe/i;

    iget-object v2, v0, Lxe/i;->d:Lxe/f;

    iget v3, v0, Lxe/i;->c:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    invoke-virtual/range {v2 .. v7}, Lxe/f;->H0(IZLbf/c;J)V

    :cond_6
    :goto_4
    iget-object v2, p0, Lxe/i$a;->l:Lxe/i;

    monitor-enter v2

    :try_start_1
    iput-boolean v1, p0, Lxe/i$a;->j:Z

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lxe/i$a;->l:Lxe/i;

    iget-object v0, v0, Lxe/i;->d:Lxe/f;

    invoke-virtual {v0}, Lxe/f;->flush()V

    iget-object v0, p0, Lxe/i$a;->l:Lxe/i;

    invoke-virtual {v0}, Lxe/i;->b()V

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public flush()V
    .locals 4

    iget-object v0, p0, Lxe/i$a;->l:Lxe/i;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lxe/i$a;->l:Lxe/i;

    invoke-virtual {v1}, Lxe/i;->c()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object v0, p0, Lxe/i$a;->h:Lbf/c;

    invoke-virtual {v0}, Lbf/c;->g0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lxe/i$a;->a(Z)V

    iget-object v0, p0, Lxe/i$a;->l:Lxe/i;

    iget-object v0, v0, Lxe/i;->d:Lxe/f;

    invoke-virtual {v0}, Lxe/f;->flush()V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
