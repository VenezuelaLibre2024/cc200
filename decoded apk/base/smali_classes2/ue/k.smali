.class public final Lue/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lue/k$b;
    }
.end annotation


# instance fields
.field public final a:Lre/y;

.field public final b:Lue/g;

.field public final c:Lre/e;

.field public final d:Lre/s;

.field public final e:Lbf/a;

.field public f:Ljava/lang/Object;

.field public g:Lre/b0;

.field public h:Lue/d;

.field public i:Lue/e;

.field public j:Lue/c;

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lre/y;Lre/e;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lue/k$a;

    invoke-direct {v0, p0}, Lue/k$a;-><init>(Lue/k;)V

    iput-object v0, p0, Lue/k;->e:Lbf/a;

    iput-object p1, p0, Lue/k;->a:Lre/y;

    sget-object v1, Lse/a;->a:Lse/a;

    invoke-virtual {p1}, Lre/y;->g()Lre/k;

    move-result-object v2

    invoke-virtual {v1, v2}, Lse/a;->h(Lre/k;)Lue/g;

    move-result-object v1

    iput-object v1, p0, Lue/k;->b:Lue/g;

    iput-object p2, p0, Lue/k;->c:Lre/e;

    invoke-virtual {p1}, Lre/y;->m()Lre/s$b;

    move-result-object v1

    invoke-interface {v1, p2}, Lre/s$b;->a(Lre/e;)Lre/s;

    move-result-object p2

    iput-object p2, p0, Lue/k;->d:Lre/s;

    invoke-virtual {p1}, Lre/y;->c()I

    move-result p1

    int-to-long p1, p1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2, v1}, Lbf/u;->g(JLjava/util/concurrent/TimeUnit;)Lbf/u;

    return-void
.end method


# virtual methods
.method public a(Lue/e;)V
    .locals 2

    iget-object v0, p0, Lue/k;->i:Lue/e;

    if-nez v0, :cond_0

    iput-object p1, p0, Lue/k;->i:Lue/e;

    iget-object p1, p1, Lue/e;->p:Ljava/util/List;

    new-instance v0, Lue/k$b;

    iget-object v1, p0, Lue/k;->f:Ljava/lang/Object;

    invoke-direct {v0, p0, v1}, Lue/k$b;-><init>(Lue/k;Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public b()V
    .locals 2

    invoke-static {}, Lye/f;->l()Lye/f;

    move-result-object v0

    const-string v1, "response.body().close()"

    invoke-virtual {v0, v1}, Lye/f;->o(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lue/k;->f:Ljava/lang/Object;

    iget-object v0, p0, Lue/k;->d:Lre/s;

    iget-object v1, p0, Lue/k;->c:Lre/e;

    invoke-virtual {v0, v1}, Lre/s;->d(Lre/e;)V

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lue/k;->h:Lue/d;

    invoke-virtual {v0}, Lue/d;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lue/k;->h:Lue/d;

    invoke-virtual {v0}, Lue/d;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, Lue/k;->b:Lue/g;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lue/k;->m:Z

    iget-object v1, p0, Lue/k;->j:Lue/c;

    iget-object v2, p0, Lue/k;->h:Lue/d;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lue/d;->a()Lue/e;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lue/k;->h:Lue/d;

    invoke-virtual {v2}, Lue/d;->a()Lue/e;

    move-result-object v2

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lue/k;->i:Lue/e;

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lue/c;->b()V

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lue/e;->c()V

    :cond_2
    :goto_1
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final e(Lre/v;)Lre/a;
    .locals 17

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lre/v;->m()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v0, Lue/k;->a:Lre/y;

    invoke-virtual {v1}, Lre/y;->D()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v2

    iget-object v1, v0, Lue/k;->a:Lre/y;

    invoke-virtual {v1}, Lre/y;->p()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v1

    iget-object v3, v0, Lue/k;->a:Lre/y;

    invoke-virtual {v3}, Lre/y;->e()Lre/g;

    move-result-object v3

    move-object v10, v1

    move-object v9, v2

    move-object v11, v3

    goto :goto_0

    :cond_0
    move-object v9, v2

    move-object v10, v9

    move-object v11, v10

    :goto_0
    new-instance v1, Lre/a;

    invoke-virtual/range {p1 .. p1}, Lre/v;->l()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lre/v;->w()I

    move-result v6

    iget-object v2, v0, Lue/k;->a:Lre/y;

    invoke-virtual {v2}, Lre/y;->l()Lre/q;

    move-result-object v7

    iget-object v2, v0, Lue/k;->a:Lre/y;

    invoke-virtual {v2}, Lre/y;->C()Ljavax/net/SocketFactory;

    move-result-object v8

    iget-object v2, v0, Lue/k;->a:Lre/y;

    invoke-virtual {v2}, Lre/y;->y()Lre/c;

    move-result-object v12

    iget-object v2, v0, Lue/k;->a:Lre/y;

    invoke-virtual {v2}, Lre/y;->x()Ljava/net/Proxy;

    move-result-object v13

    iget-object v2, v0, Lue/k;->a:Lre/y;

    invoke-virtual {v2}, Lre/y;->w()Ljava/util/List;

    move-result-object v14

    iget-object v2, v0, Lue/k;->a:Lre/y;

    invoke-virtual {v2}, Lre/y;->h()Ljava/util/List;

    move-result-object v15

    iget-object v2, v0, Lue/k;->a:Lre/y;

    invoke-virtual {v2}, Lre/y;->z()Ljava/net/ProxySelector;

    move-result-object v16

    move-object v4, v1

    invoke-direct/range {v4 .. v16}, Lre/a;-><init>(Ljava/lang/String;ILre/q;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lre/g;Lre/c;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    return-object v1
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Lue/k;->b:Lue/g;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lue/k;->o:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lue/k;->j:Lue/c;

    monitor-exit v0

    return-void

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public g(Lue/c;ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 3

    iget-object v0, p0, Lue/k;->b:Lue/g;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lue/k;->j:Lue/c;

    if-eq p1, v1, :cond_0

    monitor-exit v0

    return-object p4

    :cond_0
    const/4 p1, 0x0

    const/4 v2, 0x1

    if-eqz p2, :cond_1

    iget-boolean p2, p0, Lue/k;->k:Z

    xor-int/2addr p2, v2

    iput-boolean v2, p0, Lue/k;->k:Z

    goto :goto_0

    :cond_1
    move p2, p1

    :goto_0
    if-eqz p3, :cond_3

    iget-boolean p3, p0, Lue/k;->l:Z

    if-nez p3, :cond_2

    move p2, v2

    :cond_2
    iput-boolean v2, p0, Lue/k;->l:Z

    :cond_3
    iget-boolean p3, p0, Lue/k;->k:Z

    if-eqz p3, :cond_4

    iget-boolean p3, p0, Lue/k;->l:Z

    if-eqz p3, :cond_4

    if-eqz p2, :cond_4

    invoke-virtual {v1}, Lue/c;->c()Lue/e;

    move-result-object p2

    iget p3, p2, Lue/e;->m:I

    add-int/2addr p3, v2

    iput p3, p2, Lue/e;->m:I

    const/4 p2, 0x0

    iput-object p2, p0, Lue/k;->j:Lue/c;

    goto :goto_1

    :cond_4
    move v2, p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_5

    invoke-virtual {p0, p4, p1}, Lue/k;->j(Ljava/io/IOException;Z)Ljava/io/IOException;

    move-result-object p4

    :cond_5
    return-object p4

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public h()Z
    .locals 2

    iget-object v0, p0, Lue/k;->b:Lue/g;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lue/k;->j:Lue/c;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public i()Z
    .locals 2

    iget-object v0, p0, Lue/k;->b:Lue/g;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lue/k;->m:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j(Ljava/io/IOException;Z)Ljava/io/IOException;
    .locals 5

    iget-object v0, p0, Lue/k;->b:Lue/g;

    monitor-enter v0

    if-eqz p2, :cond_1

    :try_start_0
    iget-object v1, p0, Lue/k;->j:Lue/c;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "cannot release connection while it is in use"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v1, p0, Lue/k;->i:Lue/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    iget-object v3, p0, Lue/k;->j:Lue/c;

    if-nez v3, :cond_3

    if-nez p2, :cond_2

    iget-boolean p2, p0, Lue/k;->o:Z

    if-eqz p2, :cond_3

    :cond_2
    invoke-virtual {p0}, Lue/k;->n()Ljava/net/Socket;

    move-result-object p2

    goto :goto_1

    :cond_3
    move-object p2, v2

    :goto_1
    iget-object v3, p0, Lue/k;->i:Lue/e;

    if-eqz v3, :cond_4

    move-object v1, v2

    :cond_4
    iget-boolean v2, p0, Lue/k;->o:Z

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_5

    iget-object v2, p0, Lue/k;->j:Lue/c;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_2

    :cond_5
    move v2, v4

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p2}, Lse/e;->g(Ljava/net/Socket;)V

    if-eqz v1, :cond_6

    iget-object p2, p0, Lue/k;->d:Lre/s;

    iget-object v0, p0, Lue/k;->c:Lre/e;

    invoke-virtual {p2, v0, v1}, Lre/s;->i(Lre/e;Lre/j;)V

    :cond_6
    if-eqz v2, :cond_9

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    move v3, v4

    :goto_3
    invoke-virtual {p0, p1}, Lue/k;->q(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    iget-object p2, p0, Lue/k;->d:Lre/s;

    iget-object v0, p0, Lue/k;->c:Lre/e;

    if-eqz v3, :cond_8

    invoke-virtual {p2, v0, p1}, Lre/s;->c(Lre/e;Ljava/io/IOException;)V

    goto :goto_4

    :cond_8
    invoke-virtual {p2, v0}, Lre/s;->b(Lre/e;)V

    :cond_9
    :goto_4
    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public k(Lre/w$a;Z)Lue/c;
    .locals 8

    iget-object v0, p0, Lue/k;->b:Lue/g;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lue/k;->o:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lue/k;->j:Lue/c;

    if-nez v1, :cond_0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v0, p0, Lue/k;->h:Lue/d;

    iget-object v1, p0, Lue/k;->a:Lre/y;

    invoke-virtual {v0, v1, p1, p2}, Lue/d;->b(Lre/y;Lre/w$a;Z)Lve/c;

    move-result-object v7

    new-instance p1, Lue/c;

    iget-object v4, p0, Lue/k;->c:Lre/e;

    iget-object v5, p0, Lue/k;->d:Lre/s;

    iget-object v6, p0, Lue/k;->h:Lue/d;

    move-object v2, p1

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lue/c;-><init>(Lue/k;Lre/e;Lre/s;Lue/d;Lve/c;)V

    iget-object p2, p0, Lue/k;->b:Lue/g;

    monitor-enter p2

    :try_start_1
    iput-object p1, p0, Lue/k;->j:Lue/c;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lue/k;->k:Z

    iput-boolean v0, p0, Lue/k;->l:Z

    monitor-exit p2

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "cannot make a new request because the previous response is still open: please call response.close()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "released"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public l(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    iget-object v0, p0, Lue/k;->b:Lue/g;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lue/k;->o:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lue/k;->j(Ljava/io/IOException;Z)Ljava/io/IOException;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public m(Lre/b0;)V
    .locals 7

    iget-object v0, p0, Lue/k;->g:Lre/b0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lre/b0;->h()Lre/v;

    move-result-object v0

    invoke-virtual {p1}, Lre/b0;->h()Lre/v;

    move-result-object v1

    invoke-static {v0, v1}, Lse/e;->D(Lre/v;Lre/v;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lue/k;->h:Lue/d;

    invoke-virtual {v0}, Lue/d;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lue/k;->j:Lue/c;

    if-nez v0, :cond_1

    iget-object v0, p0, Lue/k;->h:Lue/d;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lue/k;->j(Ljava/io/IOException;Z)Ljava/io/IOException;

    iput-object v1, p0, Lue/k;->h:Lue/d;

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    iput-object p1, p0, Lue/k;->g:Lre/b0;

    new-instance v6, Lue/d;

    iget-object v2, p0, Lue/k;->b:Lue/g;

    invoke-virtual {p1}, Lre/b0;->h()Lre/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lue/k;->e(Lre/v;)Lre/a;

    move-result-object v3

    iget-object v4, p0, Lue/k;->c:Lre/e;

    iget-object v5, p0, Lue/k;->d:Lre/s;

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lue/d;-><init>(Lue/k;Lue/g;Lre/a;Lre/e;Lre/s;)V

    iput-object v6, p0, Lue/k;->h:Lue/d;

    return-void
.end method

.method public n()Ljava/net/Socket;
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lue/k;->i:Lue/e;

    iget-object v1, v1, Lue/e;->p:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    const/4 v2, -0x1

    if-ge v0, v1, :cond_1

    iget-object v3, p0, Lue/k;->i:Lue/e;

    iget-object v3, v3, Lue/e;->p:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/Reference;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, p0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_1
    if-eq v0, v2, :cond_3

    iget-object v1, p0, Lue/k;->i:Lue/e;

    iget-object v2, v1, Lue/e;->p:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lue/k;->i:Lue/e;

    iget-object v2, v1, Lue/e;->p:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    iput-wide v2, v1, Lue/e;->q:J

    iget-object v2, p0, Lue/k;->b:Lue/g;

    invoke-virtual {v2, v1}, Lue/g;->d(Lue/e;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lue/e;->s()Ljava/net/Socket;

    move-result-object v0

    :cond_2
    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public o()V
    .locals 1

    iget-boolean v0, p0, Lue/k;->n:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lue/k;->n:Z

    iget-object v0, p0, Lue/k;->e:Lbf/a;

    invoke-virtual {v0}, Lbf/a;->n()Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Lue/k;->e:Lbf/a;

    invoke-virtual {v0}, Lbf/a;->k()V

    return-void
.end method

.method public final q(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    iget-boolean v0, p0, Lue/k;->n:Z

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lue/k;->e:Lbf/a;

    invoke-virtual {v0}, Lbf/a;->n()Z

    move-result v0

    if-nez v0, :cond_1

    return-object p1

    :cond_1
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1}, Ljava/io/InterruptedIOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_2
    return-object v0
.end method
