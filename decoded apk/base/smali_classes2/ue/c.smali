.class public final Lue/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lue/c$b;,
        Lue/c$a;
    }
.end annotation


# instance fields
.field public final a:Lue/k;

.field public final b:Lre/e;

.field public final c:Lre/s;

.field public final d:Lue/d;

.field public final e:Lve/c;

.field public f:Z


# direct methods
.method public constructor <init>(Lue/k;Lre/e;Lre/s;Lue/d;Lve/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lue/c;->a:Lue/k;

    iput-object p2, p0, Lue/c;->b:Lre/e;

    iput-object p3, p0, Lue/c;->c:Lre/s;

    iput-object p4, p0, Lue/c;->d:Lue/d;

    iput-object p5, p0, Lue/c;->e:Lve/c;

    return-void
.end method


# virtual methods
.method public a(JZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 2

    if-eqz p5, :cond_0

    invoke-virtual {p0, p5}, Lue/c;->o(Ljava/io/IOException;)V

    :cond_0
    if-eqz p4, :cond_2

    iget-object v0, p0, Lue/c;->c:Lre/s;

    iget-object v1, p0, Lue/c;->b:Lre/e;

    if-eqz p5, :cond_1

    invoke-virtual {v0, v1, p5}, Lre/s;->p(Lre/e;Ljava/io/IOException;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1, p1, p2}, Lre/s;->n(Lre/e;J)V

    :cond_2
    :goto_0
    if-eqz p3, :cond_4

    if-eqz p5, :cond_3

    iget-object p1, p0, Lue/c;->c:Lre/s;

    iget-object p2, p0, Lue/c;->b:Lre/e;

    invoke-virtual {p1, p2, p5}, Lre/s;->u(Lre/e;Ljava/io/IOException;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lue/c;->c:Lre/s;

    iget-object v1, p0, Lue/c;->b:Lre/e;

    invoke-virtual {v0, v1, p1, p2}, Lre/s;->s(Lre/e;J)V

    :cond_4
    :goto_1
    iget-object p1, p0, Lue/c;->a:Lue/k;

    invoke-virtual {p1, p0, p4, p3, p5}, Lue/k;->g(Lue/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lue/c;->e:Lve/c;

    invoke-interface {v0}, Lve/c;->cancel()V

    return-void
.end method

.method public c()Lue/e;
    .locals 1

    iget-object v0, p0, Lue/c;->e:Lve/c;

    invoke-interface {v0}, Lve/c;->f()Lue/e;

    move-result-object v0

    return-object v0
.end method

.method public d(Lre/b0;Z)Lbf/s;
    .locals 3

    iput-boolean p2, p0, Lue/c;->f:Z

    invoke-virtual {p1}, Lre/b0;->a()Lre/c0;

    move-result-object p2

    invoke-virtual {p2}, Lre/c0;->a()J

    move-result-wide v0

    iget-object p2, p0, Lue/c;->c:Lre/s;

    iget-object v2, p0, Lue/c;->b:Lre/e;

    invoke-virtual {p2, v2}, Lre/s;->o(Lre/e;)V

    iget-object p2, p0, Lue/c;->e:Lve/c;

    invoke-interface {p2, p1, v0, v1}, Lve/c;->e(Lre/b0;J)Lbf/s;

    move-result-object p1

    new-instance p2, Lue/c$a;

    invoke-direct {p2, p0, p1, v0, v1}, Lue/c$a;-><init>(Lue/c;Lbf/s;J)V

    return-object p2
.end method

.method public e()V
    .locals 3

    iget-object v0, p0, Lue/c;->e:Lve/c;

    invoke-interface {v0}, Lve/c;->cancel()V

    iget-object v0, p0, Lue/c;->a:Lue/k;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v1, v2}, Lue/k;->g(Lue/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method

.method public f()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lue/c;->e:Lve/c;

    invoke-interface {v0}, Lve/c;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lue/c;->c:Lre/s;

    iget-object v2, p0, Lue/c;->b:Lre/e;

    invoke-virtual {v1, v2, v0}, Lre/s;->p(Lre/e;Ljava/io/IOException;)V

    invoke-virtual {p0, v0}, Lue/c;->o(Ljava/io/IOException;)V

    throw v0
.end method

.method public g()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lue/c;->e:Lve/c;

    invoke-interface {v0}, Lve/c;->g()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lue/c;->c:Lre/s;

    iget-object v2, p0, Lue/c;->b:Lre/e;

    invoke-virtual {v1, v2, v0}, Lre/s;->p(Lre/e;Ljava/io/IOException;)V

    invoke-virtual {p0, v0}, Lue/c;->o(Ljava/io/IOException;)V

    throw v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lue/c;->f:Z

    return v0
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Lue/c;->e:Lve/c;

    invoke-interface {v0}, Lve/c;->f()Lue/e;

    move-result-object v0

    invoke-virtual {v0}, Lue/e;->p()V

    return-void
.end method

.method public j()V
    .locals 4

    iget-object v0, p0, Lue/c;->a:Lue/k;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, p0, v1, v2, v3}, Lue/k;->g(Lue/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method

.method public k(Lre/d0;)Lre/e0;
    .locals 4

    :try_start_0
    iget-object v0, p0, Lue/c;->c:Lre/s;

    iget-object v1, p0, Lue/c;->b:Lre/e;

    invoke-virtual {v0, v1}, Lre/s;->t(Lre/e;)V

    const-string v0, "Content-Type"

    invoke-virtual {p1, v0}, Lre/d0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lue/c;->e:Lve/c;

    invoke-interface {v1, p1}, Lve/c;->h(Lre/d0;)J

    move-result-wide v1

    iget-object v3, p0, Lue/c;->e:Lve/c;

    invoke-interface {v3, p1}, Lve/c;->b(Lre/d0;)Lbf/t;

    move-result-object p1

    new-instance v3, Lue/c$b;

    invoke-direct {v3, p0, p1, v1, v2}, Lue/c$b;-><init>(Lue/c;Lbf/t;J)V

    new-instance p1, Lve/h;

    invoke-static {v3}, Lbf/l;->b(Lbf/t;)Lbf/e;

    move-result-object v3

    invoke-direct {p1, v0, v1, v2, v3}, Lve/h;-><init>(Ljava/lang/String;JLbf/e;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lue/c;->c:Lre/s;

    iget-object v1, p0, Lue/c;->b:Lre/e;

    invoke-virtual {v0, v1, p1}, Lre/s;->u(Lre/e;Ljava/io/IOException;)V

    invoke-virtual {p0, p1}, Lue/c;->o(Ljava/io/IOException;)V

    throw p1
.end method

.method public l(Z)Lre/d0$a;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lue/c;->e:Lve/c;

    invoke-interface {v0, p1}, Lve/c;->d(Z)Lre/d0$a;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Lse/a;->a:Lse/a;

    invoke-virtual {v0, p1, p0}, Lse/a;->g(Lre/d0$a;Lue/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lue/c;->c:Lre/s;

    iget-object v1, p0, Lue/c;->b:Lre/e;

    invoke-virtual {v0, v1, p1}, Lre/s;->u(Lre/e;Ljava/io/IOException;)V

    invoke-virtual {p0, p1}, Lue/c;->o(Ljava/io/IOException;)V

    throw p1
.end method

.method public m(Lre/d0;)V
    .locals 2

    iget-object v0, p0, Lue/c;->c:Lre/s;

    iget-object v1, p0, Lue/c;->b:Lre/e;

    invoke-virtual {v0, v1, p1}, Lre/s;->v(Lre/e;Lre/d0;)V

    return-void
.end method

.method public n()V
    .locals 2

    iget-object v0, p0, Lue/c;->c:Lre/s;

    iget-object v1, p0, Lue/c;->b:Lre/e;

    invoke-virtual {v0, v1}, Lre/s;->w(Lre/e;)V

    return-void
.end method

.method public o(Ljava/io/IOException;)V
    .locals 1

    iget-object v0, p0, Lue/c;->d:Lue/d;

    invoke-virtual {v0}, Lue/d;->h()V

    iget-object v0, p0, Lue/c;->e:Lve/c;

    invoke-interface {v0}, Lve/c;->f()Lue/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lue/e;->v(Ljava/io/IOException;)V

    return-void
.end method

.method public p(Lre/b0;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lue/c;->c:Lre/s;

    iget-object v1, p0, Lue/c;->b:Lre/e;

    invoke-virtual {v0, v1}, Lre/s;->r(Lre/e;)V

    iget-object v0, p0, Lue/c;->e:Lve/c;

    invoke-interface {v0, p1}, Lve/c;->c(Lre/b0;)V

    iget-object v0, p0, Lue/c;->c:Lre/s;

    iget-object v1, p0, Lue/c;->b:Lre/e;

    invoke-virtual {v0, v1, p1}, Lre/s;->q(Lre/e;Lre/b0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, Lue/c;->c:Lre/s;

    iget-object v1, p0, Lue/c;->b:Lre/e;

    invoke-virtual {v0, v1, p1}, Lre/s;->p(Lre/e;Ljava/io/IOException;)V

    invoke-virtual {p0, p1}, Lue/c;->o(Ljava/io/IOException;)V

    throw p1
.end method
