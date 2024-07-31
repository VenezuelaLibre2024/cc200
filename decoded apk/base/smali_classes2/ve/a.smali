.class public final Lve/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lre/w;


# instance fields
.field public final a:Lre/n;


# direct methods
.method public constructor <init>(Lre/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lve/a;->a:Lre/n;

    return-void
.end method


# virtual methods
.method public a(Lre/w$a;)Lre/d0;
    .locals 9

    invoke-interface {p1}, Lre/w$a;->e()Lre/b0;

    move-result-object v0

    invoke-virtual {v0}, Lre/b0;->g()Lre/b0$a;

    move-result-object v1

    invoke-virtual {v0}, Lre/b0;->a()Lre/c0;

    move-result-object v2

    const-wide/16 v3, -0x1

    const-string v5, "Content-Length"

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lre/c0;->b()Lre/x;

    invoke-virtual {v2}, Lre/c0;->a()J

    move-result-wide v6

    cmp-long v2, v6, v3

    const-string v8, "Transfer-Encoding"

    if-eqz v2, :cond_0

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Lre/b0$a;->c(Ljava/lang/String;Ljava/lang/String;)Lre/b0$a;

    invoke-virtual {v1, v8}, Lre/b0$a;->f(Ljava/lang/String;)Lre/b0$a;

    goto :goto_0

    :cond_0
    const-string v2, "chunked"

    invoke-virtual {v1, v8, v2}, Lre/b0$a;->c(Ljava/lang/String;Ljava/lang/String;)Lre/b0$a;

    invoke-virtual {v1, v5}, Lre/b0$a;->f(Ljava/lang/String;)Lre/b0$a;

    :cond_1
    :goto_0
    const-string v2, "Host"

    invoke-virtual {v0, v2}, Lre/b0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    if-nez v6, :cond_2

    invoke-virtual {v0}, Lre/b0;->h()Lre/v;

    move-result-object v6

    invoke-static {v6, v7}, Lse/e;->r(Lre/v;Z)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Lre/b0$a;->c(Ljava/lang/String;Ljava/lang/String;)Lre/b0$a;

    :cond_2
    const-string v2, "Connection"

    invoke-virtual {v0, v2}, Lre/b0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_3

    const-string v6, "Keep-Alive"

    invoke-virtual {v1, v2, v6}, Lre/b0$a;->c(Ljava/lang/String;Ljava/lang/String;)Lre/b0$a;

    :cond_3
    const-string v2, "Accept-Encoding"

    invoke-virtual {v0, v2}, Lre/b0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "gzip"

    if-nez v6, :cond_4

    const-string v6, "Range"

    invoke-virtual {v0, v6}, Lre/b0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_4

    const/4 v7, 0x1

    invoke-virtual {v1, v2, v8}, Lre/b0$a;->c(Ljava/lang/String;Ljava/lang/String;)Lre/b0$a;

    :cond_4
    iget-object v2, p0, Lve/a;->a:Lre/n;

    invoke-virtual {v0}, Lre/b0;->h()Lre/v;

    move-result-object v6

    invoke-interface {v2, v6}, Lre/n;->a(Lre/v;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-virtual {p0, v2}, Lve/a;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    const-string v6, "Cookie"

    invoke-virtual {v1, v6, v2}, Lre/b0$a;->c(Ljava/lang/String;Ljava/lang/String;)Lre/b0$a;

    :cond_5
    const-string v2, "User-Agent"

    invoke-virtual {v0, v2}, Lre/b0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_6

    invoke-static {}, Lse/f;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Lre/b0$a;->c(Ljava/lang/String;Ljava/lang/String;)Lre/b0$a;

    :cond_6
    invoke-virtual {v1}, Lre/b0$a;->a()Lre/b0;

    move-result-object v1

    invoke-interface {p1, v1}, Lre/w$a;->c(Lre/b0;)Lre/d0;

    move-result-object p1

    iget-object v1, p0, Lve/a;->a:Lre/n;

    invoke-virtual {v0}, Lre/b0;->h()Lre/v;

    move-result-object v2

    invoke-virtual {p1}, Lre/d0;->w()Lre/u;

    move-result-object v6

    invoke-static {v1, v2, v6}, Lve/e;->e(Lre/n;Lre/v;Lre/u;)V

    invoke-virtual {p1}, Lre/d0;->x()Lre/d0$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lre/d0$a;->q(Lre/b0;)Lre/d0$a;

    move-result-object v0

    if-eqz v7, :cond_7

    const-string v1, "Content-Encoding"

    invoke-virtual {p1, v1}, Lre/d0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {p1}, Lve/e;->c(Lre/d0;)Z

    move-result v2

    if-eqz v2, :cond_7

    new-instance v2, Lbf/j;

    invoke-virtual {p1}, Lre/d0;->a()Lre/e0;

    move-result-object v6

    invoke-virtual {v6}, Lre/e0;->n()Lbf/e;

    move-result-object v6

    invoke-direct {v2, v6}, Lbf/j;-><init>(Lbf/t;)V

    invoke-virtual {p1}, Lre/d0;->w()Lre/u;

    move-result-object v6

    invoke-virtual {v6}, Lre/u;->f()Lre/u$a;

    move-result-object v6

    invoke-virtual {v6, v1}, Lre/u$a;->e(Ljava/lang/String;)Lre/u$a;

    move-result-object v1

    invoke-virtual {v1, v5}, Lre/u$a;->e(Ljava/lang/String;)Lre/u$a;

    move-result-object v1

    invoke-virtual {v1}, Lre/u$a;->d()Lre/u;

    move-result-object v1

    invoke-virtual {v0, v1}, Lre/d0$a;->j(Lre/u;)Lre/d0$a;

    const-string v1, "Content-Type"

    invoke-virtual {p1, v1}, Lre/d0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lve/h;

    invoke-static {v2}, Lbf/l;->b(Lbf/t;)Lbf/e;

    move-result-object v2

    invoke-direct {v1, p1, v3, v4, v2}, Lve/h;-><init>(Ljava/lang/String;JLbf/e;)V

    invoke-virtual {v0, v1}, Lre/d0$a;->b(Lre/e0;)Lre/d0$a;

    :cond_7
    invoke-virtual {v0}, Lre/d0$a;->c()Lre/d0;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/List;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lre/m;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    if-lez v2, :cond_0

    const-string v3, "; "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lre/m;

    invoke-virtual {v3}, Lre/m;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3d

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lre/m;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
