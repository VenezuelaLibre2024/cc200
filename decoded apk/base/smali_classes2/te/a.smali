.class public final Lte/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lre/w;


# instance fields
.field public final a:Lte/d;


# direct methods
.method public constructor <init>(Lte/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lte/a;->a:Lte/d;

    return-void
.end method

.method public static c(Lre/u;Lre/u;)Lre/u;
    .locals 7

    new-instance v0, Lre/u$a;

    invoke-direct {v0}, Lre/u$a;-><init>()V

    invoke-virtual {p0}, Lre/u;->h()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    invoke-virtual {p0, v3}, Lre/u;->e(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v3}, Lre/u;->i(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Warning"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v6, "1"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v4}, Lte/a;->d(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-static {v4}, Lte/a;->e(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {p1, v4}, Lre/u;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    :cond_1
    sget-object v6, Lse/a;->a:Lse/a;

    invoke-virtual {v6, v0, v4, v5}, Lse/a;->b(Lre/u$a;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lre/u;->h()I

    move-result p0

    :goto_2
    if-ge v2, p0, :cond_5

    invoke-virtual {p1, v2}, Lre/u;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lte/a;->d(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v1}, Lte/a;->e(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, Lse/a;->a:Lse/a;

    invoke-virtual {p1, v2}, Lre/u;->i(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v0, v1, v4}, Lse/a;->b(Lre/u$a;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Lre/u$a;->d()Lre/u;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Content-Length"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Content-Encoding"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Content-Type"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Connection"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Keep-Alive"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authenticate"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authorization"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "TE"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Trailers"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Transfer-Encoding"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Upgrade"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static f(Lre/d0;)Lre/d0;
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lre/d0;->a()Lre/e0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lre/d0;->x()Lre/d0$a;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lre/d0$a;->b(Lre/e0;)Lre/d0$a;

    move-result-object p0

    invoke-virtual {p0}, Lre/d0$a;->c()Lre/d0;

    move-result-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public a(Lre/w$a;)Lre/d0;
    .locals 5

    iget-object v0, p0, Lte/a;->a:Lte/d;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lre/w$a;->e()Lre/b0;

    move-result-object v1

    invoke-interface {v0, v1}, Lte/d;->f(Lre/b0;)Lre/d0;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    new-instance v3, Lte/c$a;

    invoke-interface {p1}, Lre/w$a;->e()Lre/b0;

    move-result-object v4

    invoke-direct {v3, v1, v2, v4, v0}, Lte/c$a;-><init>(JLre/b0;Lre/d0;)V

    invoke-virtual {v3}, Lte/c$a;->c()Lte/c;

    move-result-object v1

    iget-object v2, v1, Lte/c;->a:Lre/b0;

    iget-object v3, v1, Lte/c;->b:Lre/d0;

    iget-object v4, p0, Lte/a;->a:Lte/d;

    if-eqz v4, :cond_1

    invoke-interface {v4, v1}, Lte/d;->b(Lte/c;)V

    :cond_1
    if-eqz v0, :cond_2

    if-nez v3, :cond_2

    invoke-virtual {v0}, Lre/d0;->a()Lre/e0;

    move-result-object v1

    invoke-static {v1}, Lse/e;->f(Ljava/io/Closeable;)V

    :cond_2
    if-nez v2, :cond_3

    if-nez v3, :cond_3

    new-instance v0, Lre/d0$a;

    invoke-direct {v0}, Lre/d0$a;-><init>()V

    invoke-interface {p1}, Lre/w$a;->e()Lre/b0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lre/d0$a;->q(Lre/b0;)Lre/d0$a;

    move-result-object p1

    sget-object v0, Lre/z;->j:Lre/z;

    invoke-virtual {p1, v0}, Lre/d0$a;->o(Lre/z;)Lre/d0$a;

    move-result-object p1

    const/16 v0, 0x1f8

    invoke-virtual {p1, v0}, Lre/d0$a;->g(I)Lre/d0$a;

    move-result-object p1

    const-string v0, "Unsatisfiable Request (only-if-cached)"

    invoke-virtual {p1, v0}, Lre/d0$a;->l(Ljava/lang/String;)Lre/d0$a;

    move-result-object p1

    sget-object v0, Lse/e;->d:Lre/e0;

    invoke-virtual {p1, v0}, Lre/d0$a;->b(Lre/e0;)Lre/d0$a;

    move-result-object p1

    const-wide/16 v0, -0x1

    invoke-virtual {p1, v0, v1}, Lre/d0$a;->r(J)Lre/d0$a;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lre/d0$a;->p(J)Lre/d0$a;

    move-result-object p1

    invoke-virtual {p1}, Lre/d0$a;->c()Lre/d0;

    move-result-object p1

    return-object p1

    :cond_3
    if-nez v2, :cond_4

    invoke-virtual {v3}, Lre/d0;->x()Lre/d0$a;

    move-result-object p1

    invoke-static {v3}, Lte/a;->f(Lre/d0;)Lre/d0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lre/d0$a;->d(Lre/d0;)Lre/d0$a;

    move-result-object p1

    invoke-virtual {p1}, Lre/d0$a;->c()Lre/d0;

    move-result-object p1

    return-object p1

    :cond_4
    :try_start_0
    invoke-interface {p1, v2}, Lre/w$a;->c(Lre/b0;)Lre/d0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_5

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lre/d0;->a()Lre/e0;

    move-result-object v0

    invoke-static {v0}, Lse/e;->f(Ljava/io/Closeable;)V

    :cond_5
    if-eqz v3, :cond_7

    invoke-virtual {p1}, Lre/d0;->f()I

    move-result v0

    const/16 v1, 0x130

    if-ne v0, v1, :cond_6

    invoke-virtual {v3}, Lre/d0;->x()Lre/d0$a;

    move-result-object v0

    invoke-virtual {v3}, Lre/d0;->w()Lre/u;

    move-result-object v1

    invoke-virtual {p1}, Lre/d0;->w()Lre/u;

    move-result-object v2

    invoke-static {v1, v2}, Lte/a;->c(Lre/u;Lre/u;)Lre/u;

    move-result-object v1

    invoke-virtual {v0, v1}, Lre/d0$a;->j(Lre/u;)Lre/d0$a;

    move-result-object v0

    invoke-virtual {p1}, Lre/d0;->P()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lre/d0$a;->r(J)Lre/d0$a;

    move-result-object v0

    invoke-virtual {p1}, Lre/d0;->I()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lre/d0$a;->p(J)Lre/d0$a;

    move-result-object v0

    invoke-static {v3}, Lte/a;->f(Lre/d0;)Lre/d0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lre/d0$a;->d(Lre/d0;)Lre/d0$a;

    move-result-object v0

    invoke-static {p1}, Lte/a;->f(Lre/d0;)Lre/d0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lre/d0$a;->m(Lre/d0;)Lre/d0$a;

    move-result-object v0

    invoke-virtual {v0}, Lre/d0$a;->c()Lre/d0;

    move-result-object v0

    invoke-virtual {p1}, Lre/d0;->a()Lre/e0;

    move-result-object p1

    invoke-virtual {p1}, Lre/e0;->close()V

    iget-object p1, p0, Lte/a;->a:Lte/d;

    invoke-interface {p1}, Lte/d;->a()V

    iget-object p1, p0, Lte/a;->a:Lte/d;

    invoke-interface {p1, v3, v0}, Lte/d;->d(Lre/d0;Lre/d0;)V

    return-object v0

    :cond_6
    invoke-virtual {v3}, Lre/d0;->a()Lre/e0;

    move-result-object v0

    invoke-static {v0}, Lse/e;->f(Ljava/io/Closeable;)V

    :cond_7
    invoke-virtual {p1}, Lre/d0;->x()Lre/d0$a;

    move-result-object v0

    invoke-static {v3}, Lte/a;->f(Lre/d0;)Lre/d0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lre/d0$a;->d(Lre/d0;)Lre/d0$a;

    move-result-object v0

    invoke-static {p1}, Lte/a;->f(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lre/d0$a;->m(Lre/d0;)Lre/d0$a;

    move-result-object p1

    invoke-virtual {p1}, Lre/d0$a;->c()Lre/d0;

    move-result-object p1

    iget-object v0, p0, Lte/a;->a:Lte/d;

    if-eqz v0, :cond_9

    invoke-static {p1}, Lve/e;->c(Lre/d0;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {p1, v2}, Lte/c;->a(Lre/d0;Lre/b0;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lte/a;->a:Lte/d;

    invoke-interface {v0, p1}, Lte/d;->e(Lre/d0;)Lte/b;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lte/a;->b(Lte/b;Lre/d0;)Lre/d0;

    move-result-object p1

    return-object p1

    :cond_8
    invoke-virtual {v2}, Lre/b0;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lve/f;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    :try_start_1
    iget-object v0, p0, Lte/a;->a:Lte/d;

    invoke-interface {v0, v2}, Lte/d;->c(Lre/b0;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_9
    return-object p1

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lre/d0;->a()Lre/e0;

    move-result-object v0

    invoke-static {v0}, Lse/e;->f(Ljava/io/Closeable;)V

    :cond_a
    throw p1
.end method

.method public final b(Lte/b;Lre/d0;)Lre/d0;
    .locals 4

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    invoke-interface {p1}, Lte/b;->b()Lbf/s;

    move-result-object v0

    if-nez v0, :cond_1

    return-object p2

    :cond_1
    invoke-virtual {p2}, Lre/d0;->a()Lre/e0;

    move-result-object v1

    invoke-virtual {v1}, Lre/e0;->n()Lbf/e;

    move-result-object v1

    invoke-static {v0}, Lbf/l;->a(Lbf/s;)Lbf/d;

    move-result-object v0

    new-instance v2, Lte/a$a;

    invoke-direct {v2, p0, v1, p1, v0}, Lte/a$a;-><init>(Lte/a;Lbf/e;Lte/b;Lbf/d;)V

    const-string p1, "Content-Type"

    invoke-virtual {p2, p1}, Lre/d0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lre/d0;->a()Lre/e0;

    move-result-object v0

    invoke-virtual {v0}, Lre/e0;->f()J

    move-result-wide v0

    invoke-virtual {p2}, Lre/d0;->x()Lre/d0$a;

    move-result-object p2

    new-instance v3, Lve/h;

    invoke-static {v2}, Lbf/l;->b(Lbf/t;)Lbf/e;

    move-result-object v2

    invoke-direct {v3, p1, v0, v1, v2}, Lve/h;-><init>(Ljava/lang/String;JLbf/e;)V

    invoke-virtual {p2, v3}, Lre/d0$a;->b(Lre/e0;)Lre/d0$a;

    move-result-object p1

    invoke-virtual {p1}, Lre/d0$a;->c()Lre/d0;

    move-result-object p1

    return-object p1
.end method
