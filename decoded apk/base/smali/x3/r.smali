.class public final Lx3/r;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx3/r$a;
    }
.end annotation


# direct methods
.method public static a(Lx3/l;)Z
    .locals 6

    new-instance v0, Lp5/a0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lp5/a0;-><init>(I)V

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p0, v2, v3, v1}, Lx3/l;->p([BII)V

    invoke-virtual {v0}, Lp5/a0;->I()J

    move-result-wide v0

    const-wide/32 v4, 0x664c6143

    cmp-long p0, v0, v4

    if-nez p0, :cond_0

    const/4 v3, 0x1

    :cond_0
    return v3
.end method

.method public static b(Lx3/l;)I
    .locals 4

    invoke-interface {p0}, Lx3/l;->l()V

    new-instance v0, Lp5/a0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lp5/a0;-><init>(I)V

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p0, v2, v3, v1}, Lx3/l;->p([BII)V

    invoke-virtual {v0}, Lp5/a0;->M()I

    move-result v0

    shr-int/lit8 v1, v0, 0x2

    const/16 v2, 0x3ffe

    invoke-interface {p0}, Lx3/l;->l()V

    if-ne v1, v2, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    const-string v0, "First frame does not start with sync code."

    invoke-static {v0, p0}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p0

    throw p0
.end method

.method public static c(Lx3/l;Z)Lk4/a;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    sget-object p1, Lp4/h;->b:Lp4/h$a;

    :goto_0
    new-instance v1, Lx3/w;

    invoke-direct {v1}, Lx3/w;-><init>()V

    invoke-virtual {v1, p0, p1}, Lx3/w;->a(Lx3/l;Lp4/h$a;)Lk4/a;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lk4/a;->f()I

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, p0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static d(Lx3/l;Z)Lk4/a;
    .locals 4

    invoke-interface {p0}, Lx3/l;->l()V

    invoke-interface {p0}, Lx3/l;->f()J

    move-result-wide v0

    invoke-static {p0, p1}, Lx3/r;->c(Lx3/l;Z)Lk4/a;

    move-result-object p1

    invoke-interface {p0}, Lx3/l;->f()J

    move-result-wide v2

    sub-long/2addr v2, v0

    long-to-int v0, v2

    invoke-interface {p0, v0}, Lx3/l;->m(I)V

    return-object p1
.end method

.method public static e(Lx3/l;Lx3/r$a;)Z
    .locals 7

    invoke-interface {p0}, Lx3/l;->l()V

    new-instance v0, Lp5/z;

    const/4 v1, 0x4

    new-array v2, v1, [B

    invoke-direct {v0, v2}, Lp5/z;-><init>([B)V

    iget-object v2, v0, Lp5/z;->a:[B

    const/4 v3, 0x0

    invoke-interface {p0, v2, v3, v1}, Lx3/l;->p([BII)V

    invoke-virtual {v0}, Lp5/z;->g()Z

    move-result v2

    const/4 v4, 0x7

    invoke-virtual {v0, v4}, Lp5/z;->h(I)I

    move-result v4

    const/16 v5, 0x18

    invoke-virtual {v0, v5}, Lp5/z;->h(I)I

    move-result v0

    add-int/2addr v0, v1

    if-nez v4, :cond_0

    invoke-static {p0}, Lx3/r;->h(Lx3/l;)Lx3/t;

    move-result-object p0

    :goto_0
    iput-object p0, p1, Lx3/r$a;->a:Lx3/t;

    goto :goto_1

    :cond_0
    iget-object v5, p1, Lx3/r$a;->a:Lx3/t;

    if-eqz v5, :cond_4

    const/4 v6, 0x3

    if-ne v4, v6, :cond_1

    invoke-static {p0, v0}, Lx3/r;->g(Lx3/l;I)Lx3/t$a;

    move-result-object p0

    invoke-virtual {v5, p0}, Lx3/t;->b(Lx3/t$a;)Lx3/t;

    move-result-object p0

    goto :goto_0

    :cond_1
    if-ne v4, v1, :cond_2

    invoke-static {p0, v0}, Lx3/r;->j(Lx3/l;I)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v5, p0}, Lx3/t;->c(Ljava/util/List;)Lx3/t;

    move-result-object p0

    goto :goto_0

    :cond_2
    const/4 v6, 0x6

    if-ne v4, v6, :cond_3

    new-instance v4, Lp5/a0;

    invoke-direct {v4, v0}, Lp5/a0;-><init>(I)V

    invoke-virtual {v4}, Lp5/a0;->e()[B

    move-result-object v6

    invoke-interface {p0, v6, v3, v0}, Lx3/l;->readFully([BII)V

    invoke-virtual {v4, v1}, Lp5/a0;->U(I)V

    invoke-static {v4}, Ln4/a;->a(Lp5/a0;)Ln4/a;

    move-result-object p0

    invoke-static {p0}, Li7/u;->v(Ljava/lang/Object;)Li7/u;

    move-result-object p0

    invoke-virtual {v5, p0}, Lx3/t;->a(Ljava/util/List;)Lx3/t;

    move-result-object p0

    goto :goto_0

    :cond_3
    invoke-interface {p0, v0}, Lx3/l;->m(I)V

    :goto_1
    return v2

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static f(Lp5/a0;)Lx3/t$a;
    .locals 10

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lp5/a0;->U(I)V

    invoke-virtual {p0}, Lp5/a0;->J()I

    move-result v0

    invoke-virtual {p0}, Lp5/a0;->f()I

    move-result v1

    int-to-long v1, v1

    int-to-long v3, v0

    add-long/2addr v1, v3

    div-int/lit8 v0, v0, 0x12

    new-array v3, v0, [J

    new-array v4, v0, [J

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_1

    invoke-virtual {p0}, Lp5/a0;->z()J

    move-result-wide v6

    const-wide/16 v8, -0x1

    cmp-long v8, v6, v8

    if-nez v8, :cond_0

    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v3

    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v4

    goto :goto_1

    :cond_0
    aput-wide v6, v3, v5

    invoke-virtual {p0}, Lp5/a0;->z()J

    move-result-wide v6

    aput-wide v6, v4, v5

    const/4 v6, 0x2

    invoke-virtual {p0, v6}, Lp5/a0;->U(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lp5/a0;->f()I

    move-result v0

    int-to-long v5, v0

    sub-long/2addr v1, v5

    long-to-int v0, v1

    invoke-virtual {p0, v0}, Lp5/a0;->U(I)V

    new-instance p0, Lx3/t$a;

    invoke-direct {p0, v3, v4}, Lx3/t$a;-><init>([J[J)V

    return-object p0
.end method

.method public static g(Lx3/l;I)Lx3/t$a;
    .locals 3

    new-instance v0, Lp5/a0;

    invoke-direct {v0, p1}, Lp5/a0;-><init>(I)V

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2, p1}, Lx3/l;->readFully([BII)V

    invoke-static {v0}, Lx3/r;->f(Lp5/a0;)Lx3/t$a;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lx3/l;)Lx3/t;
    .locals 3

    const/16 v0, 0x26

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2, v0}, Lx3/l;->readFully([BII)V

    new-instance p0, Lx3/t;

    const/4 v0, 0x4

    invoke-direct {p0, v1, v0}, Lx3/t;-><init>([BI)V

    return-object p0
.end method

.method public static i(Lx3/l;)V
    .locals 4

    new-instance v0, Lp5/a0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lp5/a0;-><init>(I)V

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p0, v2, v3, v1}, Lx3/l;->readFully([BII)V

    invoke-virtual {v0}, Lp5/a0;->I()J

    move-result-wide v0

    const-wide/32 v2, 0x664c6143

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    const-string v0, "Failed to read FLAC stream marker."

    invoke-static {v0, p0}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p0

    throw p0
.end method

.method public static j(Lx3/l;I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx3/l;",
            "I)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lp5/a0;

    invoke-direct {v0, p1}, Lp5/a0;-><init>(I)V

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2, p1}, Lx3/l;->readFully([BII)V

    const/4 p0, 0x4

    invoke-virtual {v0, p0}, Lp5/a0;->U(I)V

    invoke-static {v0, v2, v2}, Lx3/e0;->j(Lp5/a0;ZZ)Lx3/e0$b;

    move-result-object p0

    iget-object p0, p0, Lx3/e0$b;->b:[Ljava/lang/String;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method