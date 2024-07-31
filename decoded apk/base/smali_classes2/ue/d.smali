.class public final Lue/d;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lue/k;

.field public final b:Lre/a;

.field public final c:Lue/g;

.field public final d:Lre/e;

.field public final e:Lre/s;

.field public f:Lue/j$a;

.field public final g:Lue/j;

.field public h:Lue/e;

.field public i:Z

.field public j:Lre/f0;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lue/k;Lue/g;Lre/a;Lre/e;Lre/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lue/d;->a:Lue/k;

    iput-object p2, p0, Lue/d;->c:Lue/g;

    iput-object p3, p0, Lue/d;->b:Lre/a;

    iput-object p4, p0, Lue/d;->d:Lre/e;

    iput-object p5, p0, Lue/d;->e:Lre/s;

    new-instance p1, Lue/j;

    iget-object p2, p2, Lue/g;->e:Lue/h;

    invoke-direct {p1, p3, p2, p4, p5}, Lue/j;-><init>(Lre/a;Lue/h;Lre/e;Lre/s;)V

    iput-object p1, p0, Lue/d;->g:Lue/j;

    return-void
.end method


# virtual methods
.method public a()Lue/e;
    .locals 1

    iget-object v0, p0, Lue/d;->h:Lue/e;

    return-object v0
.end method

.method public b(Lre/y;Lre/w$a;Z)Lve/c;
    .locals 7

    invoke-interface {p2}, Lre/w$a;->d()I

    move-result v1

    invoke-interface {p2}, Lre/w$a;->a()I

    move-result v2

    invoke-interface {p2}, Lre/w$a;->b()I

    move-result v3

    invoke-virtual {p1}, Lre/y;->v()I

    move-result v4

    invoke-virtual {p1}, Lre/y;->B()Z

    move-result v5

    move-object v0, p0

    move v6, p3

    :try_start_0
    invoke-virtual/range {v0 .. v6}, Lue/d;->d(IIIIZZ)Lue/e;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lue/e;->o(Lre/y;Lre/w$a;)Lve/c;

    move-result-object p1
    :try_end_0
    .catch Lue/i; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lue/d;->h()V

    new-instance p2, Lue/i;

    invoke-direct {p2, p1}, Lue/i;-><init>(Ljava/io/IOException;)V

    throw p2

    :catch_1
    move-exception p1

    invoke-virtual {p0}, Lue/d;->h()V

    throw p1
.end method

.method public final c(IIIIZ)Lue/e;
    .locals 18

    move-object/from16 v1, p0

    iget-object v2, v1, Lue/d;->c:Lue/g;

    monitor-enter v2

    :try_start_0
    iget-object v0, v1, Lue/d;->a:Lue/k;

    invoke-virtual {v0}, Lue/k;->i()Z

    move-result v0

    if-nez v0, :cond_11

    const/4 v0, 0x0

    iput-boolean v0, v1, Lue/d;->i:Z

    iget-object v3, v1, Lue/d;->a:Lue/k;

    iget-object v4, v3, Lue/k;->i:Lue/e;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    iget-boolean v6, v4, Lue/e;->k:Z

    if-eqz v6, :cond_0

    invoke-virtual {v3}, Lue/k;->n()Ljava/net/Socket;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v5

    :goto_0
    iget-object v6, v1, Lue/d;->a:Lue/k;

    iget-object v7, v6, Lue/k;->i:Lue/e;

    if-eqz v7, :cond_1

    move-object v4, v5

    goto :goto_1

    :cond_1
    move-object v7, v5

    :goto_1
    const/4 v8, 0x1

    if-nez v7, :cond_4

    iget-object v9, v1, Lue/d;->c:Lue/g;

    iget-object v10, v1, Lue/d;->b:Lre/a;

    invoke-virtual {v9, v10, v6, v5, v0}, Lue/g;->h(Lre/a;Lue/k;Ljava/util/List;Z)Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v6, v1, Lue/d;->a:Lue/k;

    iget-object v7, v6, Lue/k;->i:Lue/e;

    move-object v6, v5

    move v9, v8

    goto :goto_3

    :cond_2
    iget-object v6, v1, Lue/d;->j:Lre/f0;

    if-eqz v6, :cond_3

    iput-object v5, v1, Lue/d;->j:Lre/f0;

    :goto_2
    move v9, v0

    goto :goto_3

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lue/d;->g()Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object v6, v1, Lue/d;->a:Lue/k;

    iget-object v6, v6, Lue/k;->i:Lue/e;

    invoke-virtual {v6}, Lue/e;->q()Lre/f0;

    move-result-object v6

    goto :goto_2

    :cond_4
    move v9, v0

    move-object v6, v5

    :goto_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    invoke-static {v3}, Lse/e;->g(Ljava/net/Socket;)V

    if-eqz v4, :cond_5

    iget-object v2, v1, Lue/d;->e:Lre/s;

    iget-object v3, v1, Lue/d;->d:Lre/e;

    invoke-virtual {v2, v3, v4}, Lre/s;->i(Lre/e;Lre/j;)V

    :cond_5
    if-eqz v9, :cond_6

    iget-object v2, v1, Lue/d;->e:Lre/s;

    iget-object v3, v1, Lue/d;->d:Lre/e;

    invoke-virtual {v2, v3, v7}, Lre/s;->h(Lre/e;Lre/j;)V

    :cond_6
    if-eqz v7, :cond_7

    return-object v7

    :cond_7
    if-nez v6, :cond_9

    iget-object v2, v1, Lue/d;->f:Lue/j$a;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lue/j$a;->b()Z

    move-result v2

    if-nez v2, :cond_9

    :cond_8
    iget-object v2, v1, Lue/d;->g:Lue/j;

    invoke-virtual {v2}, Lue/j;->d()Lue/j$a;

    move-result-object v2

    iput-object v2, v1, Lue/d;->f:Lue/j$a;

    move v2, v8

    goto :goto_4

    :cond_9
    move v2, v0

    :goto_4
    iget-object v3, v1, Lue/d;->c:Lue/g;

    monitor-enter v3

    :try_start_1
    iget-object v4, v1, Lue/d;->a:Lue/k;

    invoke-virtual {v4}, Lue/k;->i()Z

    move-result v4

    if-nez v4, :cond_10

    if-eqz v2, :cond_a

    iget-object v2, v1, Lue/d;->f:Lue/j$a;

    invoke-virtual {v2}, Lue/j$a;->a()Ljava/util/List;

    move-result-object v2

    iget-object v4, v1, Lue/d;->c:Lue/g;

    iget-object v10, v1, Lue/d;->b:Lre/a;

    iget-object v11, v1, Lue/d;->a:Lue/k;

    invoke-virtual {v4, v10, v11, v2, v0}, Lue/g;->h(Lre/a;Lue/k;Ljava/util/List;Z)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, v1, Lue/d;->a:Lue/k;

    iget-object v7, v0, Lue/k;->i:Lue/e;

    move v9, v8

    goto :goto_5

    :cond_a
    move-object v2, v5

    :cond_b
    :goto_5
    if-nez v9, :cond_d

    if-nez v6, :cond_c

    iget-object v0, v1, Lue/d;->f:Lue/j$a;

    invoke-virtual {v0}, Lue/j$a;->c()Lre/f0;

    move-result-object v0

    move-object v6, v0

    :cond_c
    new-instance v7, Lue/e;

    iget-object v0, v1, Lue/d;->c:Lue/g;

    invoke-direct {v7, v0, v6}, Lue/e;-><init>(Lue/g;Lre/f0;)V

    iput-object v7, v1, Lue/d;->h:Lue/e;

    :cond_d
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v9, :cond_e

    :goto_6
    iget-object v0, v1, Lue/d;->e:Lre/s;

    iget-object v2, v1, Lue/d;->d:Lre/e;

    invoke-virtual {v0, v2, v7}, Lre/s;->h(Lre/e;Lre/j;)V

    return-object v7

    :cond_e
    iget-object v0, v1, Lue/d;->d:Lre/e;

    iget-object v3, v1, Lue/d;->e:Lre/s;

    move-object v10, v7

    move/from16 v11, p1

    move/from16 v12, p2

    move/from16 v13, p3

    move/from16 v14, p4

    move/from16 v15, p5

    move-object/from16 v16, v0

    move-object/from16 v17, v3

    invoke-virtual/range {v10 .. v17}, Lue/e;->d(IIIIZLre/e;Lre/s;)V

    iget-object v0, v1, Lue/d;->c:Lue/g;

    iget-object v0, v0, Lue/g;->e:Lue/h;

    invoke-virtual {v7}, Lue/e;->q()Lre/f0;

    move-result-object v3

    invoke-virtual {v0, v3}, Lue/h;->a(Lre/f0;)V

    iget-object v4, v1, Lue/d;->c:Lue/g;

    monitor-enter v4

    :try_start_2
    iput-object v5, v1, Lue/d;->h:Lue/e;

    iget-object v0, v1, Lue/d;->c:Lue/g;

    iget-object v3, v1, Lue/d;->b:Lre/a;

    iget-object v9, v1, Lue/d;->a:Lue/k;

    invoke-virtual {v0, v3, v9, v2, v8}, Lue/g;->h(Lre/a;Lue/k;Ljava/util/List;Z)Z

    move-result v0

    if-eqz v0, :cond_f

    iput-boolean v8, v7, Lue/e;->k:Z

    invoke-virtual {v7}, Lue/e;->s()Ljava/net/Socket;

    move-result-object v5

    iget-object v0, v1, Lue/d;->a:Lue/k;

    iget-object v7, v0, Lue/k;->i:Lue/e;

    iput-object v6, v1, Lue/d;->j:Lre/f0;

    goto :goto_7

    :cond_f
    iget-object v0, v1, Lue/d;->c:Lue/g;

    invoke-virtual {v0, v7}, Lue/g;->g(Lue/e;)V

    iget-object v0, v1, Lue/d;->a:Lue/k;

    invoke-virtual {v0, v7}, Lue/k;->a(Lue/e;)V

    :goto_7
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v5}, Lse/e;->g(Ljava/net/Socket;)V

    goto :goto_6

    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_10
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    :cond_11
    :try_start_5
    new-instance v0, Ljava/io/IOException;

    const-string v3, "Canceled"

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_2
    move-exception v0

    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v0
.end method

.method public final d(IIIIZZ)Lue/e;
    .locals 3

    :goto_0
    invoke-virtual/range {p0 .. p5}, Lue/d;->c(IIIIZ)Lue/e;

    move-result-object v0

    iget-object v1, p0, Lue/d;->c:Lue/g;

    monitor-enter v1

    :try_start_0
    iget v2, v0, Lue/e;->m:I

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lue/e;->n()Z

    move-result v2

    if-nez v2, :cond_0

    monitor-exit v1

    return-object v0

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, p6}, Lue/e;->m(Z)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lue/e;->p()V

    goto :goto_0

    :cond_1
    return-object v0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public e()Z
    .locals 3

    iget-object v0, p0, Lue/d;->c:Lue/g;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lue/d;->j:Lre/f0;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    monitor-exit v0

    return v2

    :cond_0
    invoke-virtual {p0}, Lue/d;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lue/d;->a:Lue/k;

    iget-object v1, v1, Lue/k;->i:Lue/e;

    invoke-virtual {v1}, Lue/e;->q()Lre/f0;

    move-result-object v1

    iput-object v1, p0, Lue/d;->j:Lre/f0;

    monitor-exit v0

    return v2

    :cond_1
    iget-object v1, p0, Lue/d;->f:Lue/j$a;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lue/j$a;->b()Z

    move-result v1

    if-nez v1, :cond_4

    :cond_2
    iget-object v1, p0, Lue/d;->g:Lue/j;

    invoke-virtual {v1}, Lue/j;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :cond_4
    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public f()Z
    .locals 2

    iget-object v0, p0, Lue/d;->c:Lue/g;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lue/d;->i:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final g()Z
    .locals 2

    iget-object v0, p0, Lue/d;->a:Lue/k;

    iget-object v0, v0, Lue/k;->i:Lue/e;

    if-eqz v0, :cond_0

    iget v1, v0, Lue/e;->l:I

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lue/e;->q()Lre/f0;

    move-result-object v0

    invoke-virtual {v0}, Lre/f0;->a()Lre/a;

    move-result-object v0

    invoke-virtual {v0}, Lre/a;->l()Lre/v;

    move-result-object v0

    iget-object v1, p0, Lue/d;->b:Lre/a;

    invoke-virtual {v1}, Lre/a;->l()Lre/v;

    move-result-object v1

    invoke-static {v0, v1}, Lse/e;->D(Lre/v;Lre/v;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public h()V
    .locals 2

    iget-object v0, p0, Lue/d;->c:Lue/g;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lue/d;->i:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
