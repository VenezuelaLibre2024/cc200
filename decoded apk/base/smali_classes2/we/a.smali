.class public final Lwe/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lve/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwe/a$g;,
        Lwe/a$d;,
        Lwe/a$e;,
        Lwe/a$b;,
        Lwe/a$c;,
        Lwe/a$f;
    }
.end annotation


# instance fields
.field public final a:Lre/y;

.field public final b:Lue/e;

.field public final c:Lbf/e;

.field public final d:Lbf/d;

.field public e:I

.field public f:J

.field public g:Lre/u;


# direct methods
.method public constructor <init>(Lre/y;Lue/e;Lbf/e;Lbf/d;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lwe/a;->e:I

    const-wide/32 v0, 0x40000

    iput-wide v0, p0, Lwe/a;->f:J

    iput-object p1, p0, Lwe/a;->a:Lre/y;

    iput-object p2, p0, Lwe/a;->b:Lue/e;

    iput-object p3, p0, Lwe/a;->c:Lbf/e;

    iput-object p4, p0, Lwe/a;->d:Lbf/d;

    return-void
.end method

.method public static synthetic i(Lwe/a;)Lre/y;
    .locals 0

    iget-object p0, p0, Lwe/a;->a:Lre/y;

    return-object p0
.end method

.method public static synthetic j(Lwe/a;)Lbf/d;
    .locals 0

    iget-object p0, p0, Lwe/a;->d:Lbf/d;

    return-object p0
.end method

.method public static synthetic k(Lwe/a;Lbf/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lwe/a;->s(Lbf/i;)V

    return-void
.end method

.method public static synthetic l(Lwe/a;)I
    .locals 0

    iget p0, p0, Lwe/a;->e:I

    return p0
.end method

.method public static synthetic m(Lwe/a;I)I
    .locals 0

    iput p1, p0, Lwe/a;->e:I

    return p1
.end method

.method public static synthetic n(Lwe/a;)Lbf/e;
    .locals 0

    iget-object p0, p0, Lwe/a;->c:Lbf/e;

    return-object p0
.end method

.method public static synthetic o(Lwe/a;)Lue/e;
    .locals 0

    iget-object p0, p0, Lwe/a;->b:Lue/e;

    return-object p0
.end method

.method public static synthetic p(Lwe/a;)Lre/u;
    .locals 0

    iget-object p0, p0, Lwe/a;->g:Lre/u;

    return-object p0
.end method

.method public static synthetic q(Lwe/a;Lre/u;)Lre/u;
    .locals 0

    iput-object p1, p0, Lwe/a;->g:Lre/u;

    return-object p1
.end method

.method public static synthetic r(Lwe/a;)Lre/u;
    .locals 0

    invoke-virtual {p0}, Lwe/a;->z()Lre/u;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A(Lre/d0;)V
    .locals 4

    invoke-static {p1}, Lve/e;->b(Lre/d0;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, v0, v1}, Lwe/a;->v(J)Lbf/t;

    move-result-object p1

    const v0, 0x7fffffff

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, v0, v1}, Lse/e;->E(Lbf/t;ILjava/util/concurrent/TimeUnit;)Z

    invoke-interface {p1}, Lbf/t;->close()V

    return-void
.end method

.method public B(Lre/u;Ljava/lang/String;)V
    .locals 4

    iget v0, p0, Lwe/a;->e:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lwe/a;->d:Lbf/d;

    invoke-interface {v0, p2}, Lbf/d;->S(Ljava/lang/String;)Lbf/d;

    move-result-object p2

    const-string v0, "\r\n"

    invoke-interface {p2, v0}, Lbf/d;->S(Ljava/lang/String;)Lbf/d;

    const/4 p2, 0x0

    invoke-virtual {p1}, Lre/u;->h()I

    move-result v1

    :goto_0
    if-ge p2, v1, :cond_0

    iget-object v2, p0, Lwe/a;->d:Lbf/d;

    invoke-virtual {p1, p2}, Lre/u;->e(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lbf/d;->S(Ljava/lang/String;)Lbf/d;

    move-result-object v2

    const-string v3, ": "

    invoke-interface {v2, v3}, Lbf/d;->S(Ljava/lang/String;)Lbf/d;

    move-result-object v2

    invoke-virtual {p1, p2}, Lre/u;->i(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lbf/d;->S(Ljava/lang/String;)Lbf/d;

    move-result-object v2

    invoke-interface {v2, v0}, Lbf/d;->S(Ljava/lang/String;)Lbf/d;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lwe/a;->d:Lbf/d;

    invoke-interface {p1, v0}, Lbf/d;->S(Ljava/lang/String;)Lbf/d;

    const/4 p1, 0x1

    iput p1, p0, Lwe/a;->e:I

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lwe/a;->e:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a()V
    .locals 1

    iget-object v0, p0, Lwe/a;->d:Lbf/d;

    invoke-interface {v0}, Lbf/d;->flush()V

    return-void
.end method

.method public b(Lre/d0;)Lbf/t;
    .locals 4

    invoke-static {p1}, Lve/e;->c(Lre/d0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lwe/a;->v(J)Lbf/t;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "Transfer-Encoding"

    invoke-virtual {p1, v0}, Lre/d0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "chunked"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lre/d0;->K()Lre/b0;

    move-result-object p1

    invoke-virtual {p1}, Lre/b0;->h()Lre/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lwe/a;->u(Lre/v;)Lbf/t;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1}, Lve/e;->b(Lre/d0;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-eqz p1, :cond_2

    invoke-virtual {p0, v0, v1}, Lwe/a;->v(J)Lbf/t;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p0}, Lwe/a;->x()Lbf/t;

    move-result-object p1

    return-object p1
.end method

.method public c(Lre/b0;)V
    .locals 1

    iget-object v0, p0, Lwe/a;->b:Lue/e;

    invoke-virtual {v0}, Lue/e;->q()Lre/f0;

    move-result-object v0

    invoke-virtual {v0}, Lre/f0;->b()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    invoke-static {p1, v0}, Lve/i;->a(Lre/b0;Ljava/net/Proxy$Type;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lre/b0;->d()Lre/u;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lwe/a;->B(Lre/u;Ljava/lang/String;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lwe/a;->b:Lue/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lue/e;->c()V

    :cond_0
    return-void
.end method

.method public d(Z)Lre/d0$a;
    .locals 4

    iget v0, p0, Lwe/a;->e:I

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lwe/a;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lwe/a;->y()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lve/k;->a(Ljava/lang/String;)Lve/k;

    move-result-object v0

    new-instance v2, Lre/d0$a;

    invoke-direct {v2}, Lre/d0$a;-><init>()V

    iget-object v3, v0, Lve/k;->a:Lre/z;

    invoke-virtual {v2, v3}, Lre/d0$a;->o(Lre/z;)Lre/d0$a;

    move-result-object v2

    iget v3, v0, Lve/k;->b:I

    invoke-virtual {v2, v3}, Lre/d0$a;->g(I)Lre/d0$a;

    move-result-object v2

    iget-object v3, v0, Lve/k;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lre/d0$a;->l(Ljava/lang/String;)Lre/d0$a;

    move-result-object v2

    invoke-virtual {p0}, Lwe/a;->z()Lre/u;

    move-result-object v3

    invoke-virtual {v2, v3}, Lre/d0$a;->j(Lre/u;)Lre/d0$a;

    move-result-object v2

    const/16 v3, 0x64

    if-eqz p1, :cond_2

    iget p1, v0, Lve/k;->b:I

    if-ne p1, v3, :cond_2

    const/4 p1, 0x0

    return-object p1

    :cond_2
    iget p1, v0, Lve/k;->b:I

    if-ne p1, v3, :cond_3

    iput v1, p0, Lwe/a;->e:I

    return-object v2

    :cond_3
    const/4 p1, 0x4

    iput p1, p0, Lwe/a;->e:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception p1

    iget-object v0, p0, Lwe/a;->b:Lue/e;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lue/e;->q()Lre/f0;

    move-result-object v0

    invoke-virtual {v0}, Lre/f0;->a()Lre/a;

    move-result-object v0

    invoke-virtual {v0}, Lre/a;->l()Lre/v;

    move-result-object v0

    invoke-virtual {v0}, Lre/v;->z()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    const-string v0, "unknown"

    :goto_1
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unexpected end of stream on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public e(Lre/b0;J)Lbf/s;
    .locals 2

    invoke-virtual {p1}, Lre/b0;->a()Lre/c0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lre/b0;->a()Lre/c0;

    move-result-object v0

    invoke-virtual {v0}, Lre/c0;->e()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Duplex connections are not supported for HTTP/1"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const-string v0, "Transfer-Encoding"

    invoke-virtual {p1, v0}, Lre/b0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "chunked"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lwe/a;->t()Lbf/s;

    move-result-object p1

    return-object p1

    :cond_2
    const-wide/16 v0, -0x1

    cmp-long p1, p2, v0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lwe/a;->w()Lbf/s;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f()Lue/e;
    .locals 1

    iget-object v0, p0, Lwe/a;->b:Lue/e;

    return-object v0
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Lwe/a;->d:Lbf/d;

    invoke-interface {v0}, Lbf/d;->flush()V

    return-void
.end method

.method public h(Lre/d0;)J
    .locals 2

    invoke-static {p1}, Lve/e;->c(Lre/d0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    const-string v0, "Transfer-Encoding"

    invoke-virtual {p1, v0}, Lre/d0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "chunked"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_1
    invoke-static {p1}, Lve/e;->b(Lre/d0;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final s(Lbf/i;)V
    .locals 2

    invoke-virtual {p1}, Lbf/i;->i()Lbf/u;

    move-result-object v0

    sget-object v1, Lbf/u;->d:Lbf/u;

    invoke-virtual {p1, v1}, Lbf/i;->j(Lbf/u;)Lbf/i;

    invoke-virtual {v0}, Lbf/u;->a()Lbf/u;

    invoke-virtual {v0}, Lbf/u;->b()Lbf/u;

    return-void
.end method

.method public final t()Lbf/s;
    .locals 3

    iget v0, p0, Lwe/a;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    iput v0, p0, Lwe/a;->e:I

    new-instance v0, Lwe/a$c;

    invoke-direct {v0, p0}, Lwe/a$c;-><init>(Lwe/a;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lwe/a;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final u(Lre/v;)Lbf/t;
    .locals 2

    iget v0, p0, Lwe/a;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    iput v0, p0, Lwe/a;->e:I

    new-instance v0, Lwe/a$d;

    invoke-direct {v0, p0, p1}, Lwe/a$d;-><init>(Lwe/a;Lre/v;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lwe/a;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final v(J)Lbf/t;
    .locals 2

    iget v0, p0, Lwe/a;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    iput v0, p0, Lwe/a;->e:I

    new-instance v0, Lwe/a$e;

    invoke-direct {v0, p0, p1, p2}, Lwe/a$e;-><init>(Lwe/a;J)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lwe/a;->e:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final w()Lbf/s;
    .locals 3

    iget v0, p0, Lwe/a;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    iput v0, p0, Lwe/a;->e:I

    new-instance v0, Lwe/a$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lwe/a$f;-><init>(Lwe/a;Lwe/a$a;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lwe/a;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final x()Lbf/t;
    .locals 3

    iget v0, p0, Lwe/a;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    iput v0, p0, Lwe/a;->e:I

    iget-object v0, p0, Lwe/a;->b:Lue/e;

    invoke-virtual {v0}, Lue/e;->p()V

    new-instance v0, Lwe/a$g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lwe/a$g;-><init>(Lwe/a;Lwe/a$a;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lwe/a;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final y()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lwe/a;->c:Lbf/e;

    iget-wide v1, p0, Lwe/a;->f:J

    invoke-interface {v0, v1, v2}, Lbf/e;->L(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Lwe/a;->f:J

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v3, v3

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lwe/a;->f:J

    return-object v0
.end method

.method public final z()Lre/u;
    .locals 3

    new-instance v0, Lre/u$a;

    invoke-direct {v0}, Lre/u$a;-><init>()V

    :goto_0
    invoke-virtual {p0}, Lwe/a;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lse/a;->a:Lse/a;

    invoke-virtual {v2, v0, v1}, Lse/a;->a(Lre/u$a;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lre/u$a;->d()Lre/u;

    move-result-object v0

    return-object v0
.end method
