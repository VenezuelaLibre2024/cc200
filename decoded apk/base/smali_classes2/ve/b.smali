.class public final Lve/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lre/w;


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lve/b;->a:Z

    return-void
.end method


# virtual methods
.method public a(Lre/w$a;)Lre/d0;
    .locals 8

    check-cast p1, Lve/g;

    invoke-virtual {p1}, Lve/g;->f()Lue/c;

    move-result-object v0

    invoke-virtual {p1}, Lve/g;->e()Lre/b0;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, p1}, Lue/c;->p(Lre/b0;)V

    invoke-virtual {p1}, Lre/b0;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lve/f;->b(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    invoke-virtual {p1}, Lre/b0;->a()Lre/c0;

    move-result-object v3

    if-eqz v3, :cond_3

    const-string v3, "Expect"

    invoke-virtual {p1, v3}, Lre/b0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "100-continue"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    const/4 v6, 0x1

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lue/c;->g()V

    invoke-virtual {v0}, Lue/c;->n()V

    invoke-virtual {v0, v6}, Lue/c;->l(Z)Lre/d0$a;

    move-result-object v5

    move v3, v6

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    if-nez v5, :cond_2

    invoke-virtual {p1}, Lre/b0;->a()Lre/c0;

    move-result-object v7

    invoke-virtual {v7}, Lre/c0;->e()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v0}, Lue/c;->g()V

    invoke-virtual {v0, p1, v6}, Lue/c;->d(Lre/b0;Z)Lbf/s;

    move-result-object v6

    invoke-static {v6}, Lbf/l;->a(Lbf/s;)Lbf/d;

    move-result-object v6

    invoke-virtual {p1}, Lre/b0;->a()Lre/c0;

    move-result-object v7

    invoke-virtual {v7, v6}, Lre/c0;->g(Lbf/d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p1, v4}, Lue/c;->d(Lre/b0;Z)Lbf/s;

    move-result-object v6

    invoke-static {v6}, Lbf/l;->a(Lbf/s;)Lbf/d;

    move-result-object v6

    invoke-virtual {p1}, Lre/b0;->a()Lre/c0;

    move-result-object v7

    invoke-virtual {v7, v6}, Lre/c0;->g(Lbf/d;)V

    invoke-interface {v6}, Lbf/s;->close()V

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lue/c;->j()V

    invoke-virtual {v0}, Lue/c;->c()Lue/e;

    move-result-object v6

    invoke-virtual {v6}, Lue/e;->n()Z

    move-result v6

    if-nez v6, :cond_4

    invoke-virtual {v0}, Lue/c;->i()V

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Lue/c;->j()V

    move v3, v4

    :cond_4
    :goto_1
    invoke-virtual {p1}, Lre/b0;->a()Lre/c0;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-virtual {p1}, Lre/b0;->a()Lre/c0;

    move-result-object v6

    invoke-virtual {v6}, Lre/c0;->e()Z

    move-result v6

    if-nez v6, :cond_6

    :cond_5
    invoke-virtual {v0}, Lue/c;->f()V

    :cond_6
    if-nez v3, :cond_7

    invoke-virtual {v0}, Lue/c;->n()V

    :cond_7
    if-nez v5, :cond_8

    invoke-virtual {v0, v4}, Lue/c;->l(Z)Lre/d0$a;

    move-result-object v5

    :cond_8
    invoke-virtual {v5, p1}, Lre/d0$a;->q(Lre/b0;)Lre/d0$a;

    move-result-object v3

    invoke-virtual {v0}, Lue/c;->c()Lue/e;

    move-result-object v5

    invoke-virtual {v5}, Lue/e;->k()Lre/t;

    move-result-object v5

    invoke-virtual {v3, v5}, Lre/d0$a;->h(Lre/t;)Lre/d0$a;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Lre/d0$a;->r(J)Lre/d0$a;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v3, v5, v6}, Lre/d0$a;->p(J)Lre/d0$a;

    move-result-object v3

    invoke-virtual {v3}, Lre/d0$a;->c()Lre/d0;

    move-result-object v3

    invoke-virtual {v3}, Lre/d0;->f()I

    move-result v5

    const/16 v6, 0x64

    if-ne v5, v6, :cond_9

    invoke-virtual {v0, v4}, Lue/c;->l(Z)Lre/d0$a;

    move-result-object v3

    invoke-virtual {v3, p1}, Lre/d0$a;->q(Lre/b0;)Lre/d0$a;

    move-result-object p1

    invoke-virtual {v0}, Lue/c;->c()Lue/e;

    move-result-object v3

    invoke-virtual {v3}, Lue/e;->k()Lre/t;

    move-result-object v3

    invoke-virtual {p1, v3}, Lre/d0$a;->h(Lre/t;)Lre/d0$a;

    move-result-object p1

    invoke-virtual {p1, v1, v2}, Lre/d0$a;->r(J)Lre/d0$a;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lre/d0$a;->p(J)Lre/d0$a;

    move-result-object p1

    invoke-virtual {p1}, Lre/d0$a;->c()Lre/d0;

    move-result-object v3

    invoke-virtual {v3}, Lre/d0;->f()I

    move-result v5

    :cond_9
    invoke-virtual {v0, v3}, Lue/c;->m(Lre/d0;)V

    iget-boolean p1, p0, Lve/b;->a:Z

    if-eqz p1, :cond_a

    const/16 p1, 0x65

    if-ne v5, p1, :cond_a

    invoke-virtual {v3}, Lre/d0;->x()Lre/d0$a;

    move-result-object p1

    sget-object v1, Lse/e;->d:Lre/e0;

    goto :goto_2

    :cond_a
    invoke-virtual {v3}, Lre/d0;->x()Lre/d0$a;

    move-result-object p1

    invoke-virtual {v0, v3}, Lue/c;->k(Lre/d0;)Lre/e0;

    move-result-object v1

    :goto_2
    invoke-virtual {p1, v1}, Lre/d0$a;->b(Lre/e0;)Lre/d0$a;

    move-result-object p1

    invoke-virtual {p1}, Lre/d0$a;->c()Lre/d0;

    move-result-object p1

    invoke-virtual {p1}, Lre/d0;->K()Lre/b0;

    move-result-object v1

    const-string v2, "Connection"

    invoke-virtual {v1, v2}, Lre/b0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "close"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_b

    invoke-virtual {p1, v2}, Lre/d0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    :cond_b
    invoke-virtual {v0}, Lue/c;->i()V

    :cond_c
    const/16 v0, 0xcc

    if-eq v5, v0, :cond_d

    const/16 v0, 0xcd

    if-ne v5, v0, :cond_e

    :cond_d
    invoke-virtual {p1}, Lre/d0;->a()Lre/e0;

    move-result-object v0

    invoke-virtual {v0}, Lre/e0;->f()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_f

    :cond_e
    return-object p1

    :cond_f
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HTTP "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " had non-zero Content-Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lre/d0;->a()Lre/e0;

    move-result-object p1

    invoke-virtual {p1}, Lre/e0;->f()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
