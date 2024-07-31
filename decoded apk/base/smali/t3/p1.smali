.class public final Lt3/p1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt3/r1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt3/p1$a;
    }
.end annotation


# static fields
.field public static final h:Lh7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/u<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Ljava/util/Random;


# instance fields
.field public final a:Ls3/u3$d;

.field public final b:Ls3/u3$b;

.field public final c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lt3/p1$a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lh7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/u<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lt3/r1$a;

.field public f:Ls3/u3;

.field public g:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lt3/o1;->h:Lt3/o1;

    sput-object v0, Lt3/p1;->h:Lh7/u;

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lt3/p1;->i:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lt3/p1;->h:Lh7/u;

    invoke-direct {p0, v0}, Lt3/p1;-><init>(Lh7/u;)V

    return-void
.end method

.method public constructor <init>(Lh7/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh7/u<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/p1;->d:Lh7/u;

    new-instance p1, Ls3/u3$d;

    invoke-direct {p1}, Ls3/u3$d;-><init>()V

    iput-object p1, p0, Lt3/p1;->a:Ls3/u3$d;

    new-instance p1, Ls3/u3$b;

    invoke-direct {p1}, Ls3/u3$b;-><init>()V

    iput-object p1, p0, Lt3/p1;->b:Ls3/u3$b;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lt3/p1;->c:Ljava/util/HashMap;

    sget-object p1, Ls3/u3;->h:Ls3/u3;

    iput-object p1, p0, Lt3/p1;->f:Ls3/u3;

    return-void
.end method

.method public static synthetic h()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lt3/p1;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i(Lt3/p1;)Ls3/u3$d;
    .locals 0

    iget-object p0, p0, Lt3/p1;->a:Ls3/u3$d;

    return-object p0
.end method

.method public static synthetic j(Lt3/p1;)Ls3/u3$b;
    .locals 0

    iget-object p0, p0, Lt3/p1;->b:Ls3/u3$b;

    return-object p0
.end method

.method public static k()Ljava/lang/String;
    .locals 2

    const/16 v0, 0xc

    new-array v0, v0, [B

    sget-object v1, Lt3/p1;->i:Ljava/util/Random;

    invoke-virtual {v1, v0}, Ljava/util/Random;->nextBytes([B)V

    const/16 v1, 0xa

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(Lt3/b$a;I)V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lt3/p1;->e:Lt3/r1$a;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    iget-object v2, p0, Lt3/p1;->c:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt3/p1$a;

    invoke-virtual {v3, p1}, Lt3/p1$a;->j(Lt3/b$a;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    invoke-static {v3}, Lt3/p1$a;->d(Lt3/p1$a;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v3}, Lt3/p1$a;->a(Lt3/p1$a;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lt3/p1;->g:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz p2, :cond_2

    if-eqz v4, :cond_2

    invoke-static {v3}, Lt3/p1$a;->f(Lt3/p1$a;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v0

    goto :goto_2

    :cond_2
    move v5, v1

    :goto_2
    if-eqz v4, :cond_3

    const/4 v4, 0x0

    iput-object v4, p0, Lt3/p1;->g:Ljava/lang/String;

    :cond_3
    iget-object v4, p0, Lt3/p1;->e:Lt3/r1$a;

    invoke-static {v3}, Lt3/p1$a;->a(Lt3/p1$a;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, p1, v3, v5}, Lt3/r1$a;->m0(Lt3/b$a;Ljava/lang/String;Z)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0, p1}, Lt3/p1;->m(Lt3/b$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lt3/p1;->g:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c(Lt3/b$a;)V
    .locals 4

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lt3/p1;->g:Ljava/lang/String;

    iget-object v0, p0, Lt3/p1;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt3/p1$a;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    invoke-static {v1}, Lt3/p1$a;->d(Lt3/p1$a;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lt3/p1;->e:Lt3/r1$a;

    if-eqz v2, :cond_0

    invoke-static {v1}, Lt3/p1$a;->a(Lt3/p1$a;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-interface {v2, p1, v1, v3}, Lt3/r1$a;->m0(Lt3/b$a;Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized d(Lt3/b$a;)V
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    monitor-enter p0

    :try_start_0
    iget-object v2, v1, Lt3/p1;->e:Lt3/r1$a;

    invoke-static {v2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lt3/b$a;->b:Ls3/u3;

    invoke-virtual {v2}, Ls3/u3;->u()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v2, v1, Lt3/p1;->c:Ljava/util/HashMap;

    iget-object v3, v1, Lt3/p1;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt3/p1$a;

    iget-object v3, v0, Lt3/b$a;->d:Lu4/t$b;

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    if-eqz v2, :cond_3

    invoke-static {v2}, Lt3/p1$a;->b(Lt3/p1$a;)J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v3, v5, v7

    const/4 v5, 0x0

    if-nez v3, :cond_1

    invoke-static {v2}, Lt3/p1$a;->c(Lt3/p1$a;)I

    move-result v2

    iget v3, v0, Lt3/b$a;->c:I

    if-eq v2, v3, :cond_2

    :goto_0
    move v5, v4

    goto :goto_1

    :cond_1
    iget-object v3, v0, Lt3/b$a;->d:Lu4/t$b;

    iget-wide v6, v3, Lu4/s;->d:J

    invoke-static {v2}, Lt3/p1$a;->b(Lt3/p1$a;)J

    move-result-wide v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v2, v6, v2

    if-gez v2, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v5, :cond_3

    monitor-exit p0

    return-void

    :cond_3
    :try_start_2
    iget v2, v0, Lt3/b$a;->c:I

    iget-object v3, v0, Lt3/b$a;->d:Lu4/t$b;

    invoke-virtual {v1, v2, v3}, Lt3/p1;->l(ILu4/t$b;)Lt3/p1$a;

    move-result-object v2

    iget-object v3, v1, Lt3/p1;->g:Ljava/lang/String;

    if-nez v3, :cond_4

    invoke-static {v2}, Lt3/p1$a;->a(Lt3/p1$a;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lt3/p1;->g:Ljava/lang/String;

    :cond_4
    iget-object v3, v0, Lt3/b$a;->d:Lu4/t$b;

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lu4/s;->b()Z

    move-result v3

    if-eqz v3, :cond_5

    new-instance v10, Lu4/t$b;

    iget-object v3, v0, Lt3/b$a;->d:Lu4/t$b;

    iget-object v5, v3, Lu4/s;->a:Ljava/lang/Object;

    iget-wide v6, v3, Lu4/s;->d:J

    iget v3, v3, Lu4/s;->b:I

    invoke-direct {v10, v5, v6, v7, v3}, Lu4/t$b;-><init>(Ljava/lang/Object;JI)V

    iget v3, v0, Lt3/b$a;->c:I

    invoke-virtual {v1, v3, v10}, Lt3/p1;->l(ILu4/t$b;)Lt3/p1$a;

    move-result-object v3

    invoke-static {v3}, Lt3/p1$a;->d(Lt3/p1$a;)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-static {v3, v4}, Lt3/p1$a;->e(Lt3/p1$a;Z)Z

    iget-object v5, v0, Lt3/b$a;->b:Ls3/u3;

    iget-object v6, v0, Lt3/b$a;->d:Lu4/t$b;

    iget-object v6, v6, Lu4/s;->a:Ljava/lang/Object;

    iget-object v7, v1, Lt3/p1;->b:Ls3/u3$b;

    invoke-virtual {v5, v6, v7}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    iget-object v5, v1, Lt3/p1;->b:Ls3/u3$b;

    iget-object v6, v0, Lt3/b$a;->d:Lu4/t$b;

    iget v6, v6, Lu4/s;->b:I

    invoke-virtual {v5, v6}, Ls3/u3$b;->i(I)J

    move-result-wide v5

    invoke-static {v5, v6}, Lp5/n0;->Y0(J)J

    move-result-wide v5

    iget-object v7, v1, Lt3/p1;->b:Ls3/u3$b;

    invoke-virtual {v7}, Ls3/u3$b;->p()J

    move-result-wide v7

    add-long/2addr v5, v7

    const-wide/16 v7, 0x0

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    new-instance v15, Lt3/b$a;

    iget-wide v6, v0, Lt3/b$a;->a:J

    iget-object v8, v0, Lt3/b$a;->b:Ls3/u3;

    iget v9, v0, Lt3/b$a;->c:I

    iget-object v13, v0, Lt3/b$a;->f:Ls3/u3;

    iget v14, v0, Lt3/b$a;->g:I

    iget-object v5, v0, Lt3/b$a;->h:Lu4/t$b;

    move-object/from16 v16, v5

    iget-wide v4, v0, Lt3/b$a;->i:J

    move-object/from16 v20, v2

    move-object/from16 v21, v3

    iget-wide v2, v0, Lt3/b$a;->j:J

    move-wide/from16 v22, v4

    move-object/from16 v4, v16

    move-wide/from16 v16, v22

    move-object v5, v15

    move-object v0, v15

    move-object v15, v4

    move-wide/from16 v18, v2

    invoke-direct/range {v5 .. v19}, Lt3/b$a;-><init>(JLs3/u3;ILu4/t$b;JLs3/u3;ILu4/t$b;JJ)V

    iget-object v2, v1, Lt3/p1;->e:Lt3/r1$a;

    invoke-static/range {v21 .. v21}, Lt3/p1$a;->a(Lt3/p1$a;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v0, v3}, Lt3/r1$a;->x(Lt3/b$a;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    move-object/from16 v20, v2

    :goto_2
    invoke-static/range {v20 .. v20}, Lt3/p1$a;->d(Lt3/p1$a;)Z

    move-result v0

    if-nez v0, :cond_6

    move-object/from16 v0, v20

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lt3/p1$a;->e(Lt3/p1$a;Z)Z

    iget-object v2, v1, Lt3/p1;->e:Lt3/r1$a;

    invoke-static {v0}, Lt3/p1$a;->a(Lt3/p1$a;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p1

    invoke-interface {v2, v4, v3}, Lt3/r1$a;->x(Lt3/b$a;Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    move-object/from16 v4, p1

    move-object/from16 v0, v20

    :goto_3
    invoke-static {v0}, Lt3/p1$a;->a(Lt3/p1$a;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Lt3/p1;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {v0}, Lt3/p1$a;->f(Lt3/p1$a;)Z

    move-result v2

    if-nez v2, :cond_7

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lt3/p1$a;->g(Lt3/p1$a;Z)Z

    iget-object v2, v1, Lt3/p1;->e:Lt3/r1$a;

    invoke-static {v0}, Lt3/p1$a;->a(Lt3/p1$a;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v4, v0}, Lt3/r1$a;->g0(Lt3/b$a;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_7
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized e(Ls3/u3;Lu4/t$b;)Ljava/lang/String;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p2, Lu4/s;->a:Ljava/lang/Object;

    iget-object v1, p0, Lt3/p1;->b:Ls3/u3$b;

    invoke-virtual {p1, v0, v1}, Ls3/u3;->l(Ljava/lang/Object;Ls3/u3$b;)Ls3/u3$b;

    move-result-object p1

    iget p1, p1, Ls3/u3$b;->j:I

    invoke-virtual {p0, p1, p2}, Lt3/p1;->l(ILu4/t$b;)Lt3/p1$a;

    move-result-object p1

    invoke-static {p1}, Lt3/p1$a;->a(Lt3/p1$a;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized f(Lt3/b$a;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lt3/p1;->e:Lt3/r1$a;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lt3/p1;->f:Ls3/u3;

    iget-object v1, p1, Lt3/b$a;->b:Ls3/u3;

    iput-object v1, p0, Lt3/p1;->f:Ls3/u3;

    iget-object v1, p0, Lt3/p1;->c:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt3/p1$a;

    iget-object v3, p0, Lt3/p1;->f:Ls3/u3;

    invoke-virtual {v2, v0, v3}, Lt3/p1$a;->m(Ls3/u3;Ls3/u3;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, p1}, Lt3/p1$a;->j(Lt3/b$a;)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    invoke-static {v2}, Lt3/p1$a;->d(Lt3/p1$a;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v2}, Lt3/p1$a;->a(Lt3/p1$a;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lt3/p1;->g:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    iput-object v3, p0, Lt3/p1;->g:Ljava/lang/String;

    :cond_2
    iget-object v3, p0, Lt3/p1;->e:Lt3/r1$a;

    invoke-static {v2}, Lt3/p1$a;->a(Lt3/p1$a;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-interface {v3, p1, v2, v4}, Lt3/r1$a;->m0(Lt3/b$a;Ljava/lang/String;Z)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1}, Lt3/p1;->m(Lt3/b$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public g(Lt3/r1$a;)V
    .locals 0

    iput-object p1, p0, Lt3/p1;->e:Lt3/r1$a;

    return-void
.end method

.method public final l(ILu4/t$b;)Lt3/p1$a;
    .locals 9

    iget-object v0, p0, Lt3/p1;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const-wide v2, 0x7fffffffffffffffL

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lt3/p1$a;

    invoke-virtual {v4, p1, p2}, Lt3/p1$a;->k(ILu4/t$b;)V

    invoke-virtual {v4, p1, p2}, Lt3/p1$a;->i(ILu4/t$b;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v4}, Lt3/p1$a;->b(Lt3/p1$a;)J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v7, v5, v7

    if-eqz v7, :cond_2

    cmp-long v7, v5, v2

    if-gez v7, :cond_1

    goto :goto_1

    :cond_1
    if-nez v7, :cond_0

    invoke-static {v1}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lt3/p1$a;

    invoke-static {v5}, Lt3/p1$a;->h(Lt3/p1$a;)Lu4/t$b;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-static {v4}, Lt3/p1$a;->h(Lt3/p1$a;)Lu4/t$b;

    move-result-object v5

    if-eqz v5, :cond_0

    move-object v1, v4

    goto :goto_0

    :cond_2
    :goto_1
    move-object v1, v4

    move-wide v2, v5

    goto :goto_0

    :cond_3
    if-nez v1, :cond_4

    iget-object v0, p0, Lt3/p1;->d:Lh7/u;

    invoke-interface {v0}, Lh7/u;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Lt3/p1$a;

    invoke-direct {v1, p0, v0, p1, p2}, Lt3/p1$a;-><init>(Lt3/p1;Ljava/lang/String;ILu4/t$b;)V

    iget-object p1, p0, Lt3/p1;->c:Ljava/util/HashMap;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-object v1
.end method

.method public final m(Lt3/b$a;)V
    .locals 6

    iget-object v0, p1, Lt3/b$a;->b:Ls3/u3;

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lt3/p1;->g:Ljava/lang/String;

    return-void

    :cond_0
    iget-object v0, p0, Lt3/p1;->c:Ljava/util/HashMap;

    iget-object v1, p0, Lt3/p1;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt3/p1$a;

    iget v1, p1, Lt3/b$a;->c:I

    iget-object v2, p1, Lt3/b$a;->d:Lu4/t$b;

    invoke-virtual {p0, v1, v2}, Lt3/p1;->l(ILu4/t$b;)Lt3/p1$a;

    move-result-object v1

    invoke-static {v1}, Lt3/p1$a;->a(Lt3/p1$a;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lt3/p1;->g:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lt3/p1;->d(Lt3/b$a;)V

    iget-object v2, p1, Lt3/b$a;->d:Lu4/t$b;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lu4/s;->b()Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v0, :cond_1

    invoke-static {v0}, Lt3/p1$a;->b(Lt3/p1$a;)J

    move-result-wide v2

    iget-object v4, p1, Lt3/b$a;->d:Lu4/t$b;

    iget-wide v4, v4, Lu4/s;->d:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    invoke-static {v0}, Lt3/p1$a;->h(Lt3/p1$a;)Lu4/t$b;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v0}, Lt3/p1$a;->h(Lt3/p1$a;)Lu4/t$b;

    move-result-object v2

    iget v2, v2, Lu4/s;->b:I

    iget-object v3, p1, Lt3/b$a;->d:Lu4/t$b;

    iget v3, v3, Lu4/s;->b:I

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lt3/p1$a;->h(Lt3/p1$a;)Lu4/t$b;

    move-result-object v0

    iget v0, v0, Lu4/s;->c:I

    iget-object v2, p1, Lt3/b$a;->d:Lu4/t$b;

    iget v2, v2, Lu4/s;->c:I

    if-eq v0, v2, :cond_2

    :cond_1
    new-instance v0, Lu4/t$b;

    iget-object v2, p1, Lt3/b$a;->d:Lu4/t$b;

    iget-object v3, v2, Lu4/s;->a:Ljava/lang/Object;

    iget-wide v4, v2, Lu4/s;->d:J

    invoke-direct {v0, v3, v4, v5}, Lu4/t$b;-><init>(Ljava/lang/Object;J)V

    iget v2, p1, Lt3/b$a;->c:I

    invoke-virtual {p0, v2, v0}, Lt3/p1;->l(ILu4/t$b;)Lt3/p1$a;

    move-result-object v0

    iget-object v2, p0, Lt3/p1;->e:Lt3/r1$a;

    invoke-static {v0}, Lt3/p1$a;->a(Lt3/p1$a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Lt3/p1$a;->a(Lt3/p1$a;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, p1, v0, v1}, Lt3/r1$a;->R(Lt3/b$a;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method
