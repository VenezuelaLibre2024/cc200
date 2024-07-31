.class public final Lc4/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/k;


# instance fields
.field public final a:Lp5/a0;

.field public b:Lx3/m;

.field public c:I

.field public d:I

.field public e:I

.field public f:J

.field public g:Lq4/b;

.field public h:Lx3/l;

.field public i:Lc4/c;

.field public j:Lf4/k;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp5/a0;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lp5/a0;-><init>(I)V

    iput-object v0, p0, Lc4/a;->a:Lp5/a0;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lc4/a;->f:J

    return-void
.end method

.method public static e(Ljava/lang/String;J)Lq4/b;
    .locals 2

    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {p0}, Lc4/e;->a(Ljava/lang/String;)Lc4/b;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p0, p1, p2}, Lc4/b;->a(J)Lq4/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lx3/l;)V
    .locals 3

    iget-object v0, p0, Lc4/a;->a:Lp5/a0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lp5/a0;->P(I)V

    iget-object v0, p0, Lc4/a;->a:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lx3/l;->p([BII)V

    iget-object v0, p0, Lc4/a;->a:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->M()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-interface {p1, v0}, Lx3/l;->h(I)V

    return-void
.end method

.method public b(Lx3/m;)V
    .locals 0

    iput-object p1, p0, Lc4/a;->b:Lx3/m;

    return-void
.end method

.method public c(JJ)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    iput p1, p0, Lc4/a;->c:I

    const/4 p1, 0x0

    iput-object p1, p0, Lc4/a;->j:Lf4/k;

    goto :goto_0

    :cond_0
    iget v0, p0, Lc4/a;->c:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lc4/a;->j:Lf4/k;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/k;

    invoke-virtual {v0, p1, p2, p3, p4}, Lf4/k;->c(JJ)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final d()V
    .locals 4

    const/4 v0, 0x0

    new-array v0, v0, [Lk4/a$b;

    invoke-virtual {p0, v0}, Lc4/a;->f([Lk4/a$b;)V

    iget-object v0, p0, Lc4/a;->b:Lx3/m;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx3/m;

    invoke-interface {v0}, Lx3/m;->n()V

    iget-object v0, p0, Lc4/a;->b:Lx3/m;

    new-instance v1, Lx3/z$b;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v1, v2, v3}, Lx3/z$b;-><init>(J)V

    invoke-interface {v0, v1}, Lx3/m;->j(Lx3/z;)V

    const/4 v0, 0x6

    iput v0, p0, Lc4/a;->c:I

    return-void
.end method

.method public final varargs f([Lk4/a$b;)V
    .locals 3

    iget-object v0, p0, Lc4/a;->b:Lx3/m;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx3/m;

    const/16 v1, 0x400

    const/4 v2, 0x4

    invoke-interface {v0, v1, v2}, Lx3/m;->e(II)Lx3/b0;

    move-result-object v0

    new-instance v1, Ls3/m1$b;

    invoke-direct {v1}, Ls3/m1$b;-><init>()V

    const-string v2, "image/jpeg"

    invoke-virtual {v1, v2}, Ls3/m1$b;->M(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v1

    new-instance v2, Lk4/a;

    invoke-direct {v2, p1}, Lk4/a;-><init>([Lk4/a$b;)V

    invoke-virtual {v1, v2}, Ls3/m1$b;->Z(Lk4/a;)Ls3/m1$b;

    move-result-object p1

    invoke-virtual {p1}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object p1

    invoke-interface {v0, p1}, Lx3/b0;->b(Ls3/m1;)V

    return-void
.end method

.method public g(Lx3/l;Lx3/y;)I
    .locals 7

    iget v0, p0, Lc4/a;->c:I

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    const/4 v2, 0x1

    if-eq v0, v2, :cond_8

    const/4 v3, 0x2

    if-eq v0, v3, :cond_7

    const/4 v3, 0x4

    if-eq v0, v3, :cond_5

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 p1, 0x6

    if-ne v0, p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    iget-object v0, p0, Lc4/a;->i:Lc4/c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lc4/a;->h:Lx3/l;

    if-eq p1, v0, :cond_3

    :cond_2
    iput-object p1, p0, Lc4/a;->h:Lx3/l;

    new-instance v0, Lc4/c;

    iget-wide v3, p0, Lc4/a;->f:J

    invoke-direct {v0, p1, v3, v4}, Lc4/c;-><init>(Lx3/l;J)V

    iput-object v0, p0, Lc4/a;->i:Lc4/c;

    :cond_3
    iget-object p1, p0, Lc4/a;->j:Lf4/k;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf4/k;

    iget-object v0, p0, Lc4/a;->i:Lc4/c;

    invoke-virtual {p1, v0, p2}, Lf4/k;->g(Lx3/l;Lx3/y;)I

    move-result p1

    if-ne p1, v2, :cond_4

    iget-wide v0, p2, Lx3/y;->a:J

    iget-wide v2, p0, Lc4/a;->f:J

    add-long/2addr v0, v2

    iput-wide v0, p2, Lx3/y;->a:J

    :cond_4
    return p1

    :cond_5
    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v3

    iget-wide v5, p0, Lc4/a;->f:J

    cmp-long v0, v3, v5

    if-eqz v0, :cond_6

    iput-wide v5, p2, Lx3/y;->a:J

    return v2

    :cond_6
    invoke-virtual {p0, p1}, Lc4/a;->m(Lx3/l;)V

    return v1

    :cond_7
    invoke-virtual {p0, p1}, Lc4/a;->k(Lx3/l;)V

    return v1

    :cond_8
    invoke-virtual {p0, p1}, Lc4/a;->l(Lx3/l;)V

    return v1

    :cond_9
    invoke-virtual {p0, p1}, Lc4/a;->j(Lx3/l;)V

    return v1
.end method

.method public h(Lx3/l;)Z
    .locals 6

    invoke-virtual {p0, p1}, Lc4/a;->i(Lx3/l;)I

    move-result v0

    const/4 v1, 0x0

    const v2, 0xffd8

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, Lc4/a;->i(Lx3/l;)I

    move-result v0

    iput v0, p0, Lc4/a;->d:I

    const v2, 0xffe0

    if-ne v0, v2, :cond_1

    invoke-virtual {p0, p1}, Lc4/a;->a(Lx3/l;)V

    invoke-virtual {p0, p1}, Lc4/a;->i(Lx3/l;)I

    move-result v0

    iput v0, p0, Lc4/a;->d:I

    :cond_1
    iget v0, p0, Lc4/a;->d:I

    const v2, 0xffe1

    if-eq v0, v2, :cond_2

    return v1

    :cond_2
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Lx3/l;->h(I)V

    iget-object v0, p0, Lc4/a;->a:Lp5/a0;

    const/4 v2, 0x6

    invoke-virtual {v0, v2}, Lp5/a0;->P(I)V

    iget-object v0, p0, Lc4/a;->a:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    invoke-interface {p1, v0, v1, v2}, Lx3/l;->p([BII)V

    iget-object p1, p0, Lc4/a;->a:Lp5/a0;

    invoke-virtual {p1}, Lp5/a0;->I()J

    move-result-wide v2

    const-wide/32 v4, 0x45786966    # 5.758429993E-315

    cmp-long p1, v2, v4

    if-nez p1, :cond_3

    iget-object p1, p0, Lc4/a;->a:Lp5/a0;

    invoke-virtual {p1}, Lp5/a0;->M()I

    move-result p1

    if-nez p1, :cond_3

    const/4 v1, 0x1

    :cond_3
    return v1
.end method

.method public final i(Lx3/l;)I
    .locals 3

    iget-object v0, p0, Lc4/a;->a:Lp5/a0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lp5/a0;->P(I)V

    iget-object v0, p0, Lc4/a;->a:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lx3/l;->p([BII)V

    iget-object p1, p0, Lc4/a;->a:Lp5/a0;

    invoke-virtual {p1}, Lp5/a0;->M()I

    move-result p1

    return p1
.end method

.method public final j(Lx3/l;)V
    .locals 4

    iget-object v0, p0, Lc4/a;->a:Lp5/a0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lp5/a0;->P(I)V

    iget-object v0, p0, Lc4/a;->a:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lx3/l;->readFully([BII)V

    iget-object p1, p0, Lc4/a;->a:Lp5/a0;

    invoke-virtual {p1}, Lp5/a0;->M()I

    move-result p1

    iput p1, p0, Lc4/a;->d:I

    const v0, 0xffda

    if-ne p1, v0, :cond_1

    iget-wide v0, p0, Lc4/a;->f:J

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    :goto_0
    iput p1, p0, Lc4/a;->c:I

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lc4/a;->d()V

    goto :goto_1

    :cond_1
    const v0, 0xffd0

    if-lt p1, v0, :cond_2

    const v0, 0xffd9

    if-le p1, v0, :cond_3

    :cond_2
    const v0, 0xff01

    if-eq p1, v0, :cond_3

    const/4 p1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public final k(Lx3/l;)V
    .locals 4

    iget v0, p0, Lc4/a;->d:I

    const/4 v1, 0x0

    const v2, 0xffe1

    if-ne v0, v2, :cond_0

    new-instance v0, Lp5/a0;

    iget v2, p0, Lc4/a;->e:I

    invoke-direct {v0, v2}, Lp5/a0;-><init>(I)V

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v2

    iget v3, p0, Lc4/a;->e:I

    invoke-interface {p1, v2, v1, v3}, Lx3/l;->readFully([BII)V

    iget-object v2, p0, Lc4/a;->g:Lq4/b;

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lp5/a0;->A()Ljava/lang/String;

    move-result-object v2

    const-string v3, "http://ns.adobe.com/xap/1.0/"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lp5/a0;->A()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lx3/l;->b()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lc4/a;->e(Ljava/lang/String;J)Lq4/b;

    move-result-object p1

    iput-object p1, p0, Lc4/a;->g:Lq4/b;

    if-eqz p1, :cond_1

    iget-wide v2, p1, Lq4/b;->k:J

    iput-wide v2, p0, Lc4/a;->f:J

    goto :goto_0

    :cond_0
    iget v0, p0, Lc4/a;->e:I

    invoke-interface {p1, v0}, Lx3/l;->m(I)V

    :cond_1
    :goto_0
    iput v1, p0, Lc4/a;->c:I

    return-void
.end method

.method public final l(Lx3/l;)V
    .locals 3

    iget-object v0, p0, Lc4/a;->a:Lp5/a0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lp5/a0;->P(I)V

    iget-object v0, p0, Lc4/a;->a:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lx3/l;->readFully([BII)V

    iget-object p1, p0, Lc4/a;->a:Lp5/a0;

    invoke-virtual {p1}, Lp5/a0;->M()I

    move-result p1

    sub-int/2addr p1, v1

    iput p1, p0, Lc4/a;->e:I

    iput v1, p0, Lc4/a;->c:I

    return-void
.end method

.method public final m(Lx3/l;)V
    .locals 4

    iget-object v0, p0, Lc4/a;->a:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {p1, v0, v1, v2, v2}, Lx3/l;->e([BIIZ)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lc4/a;->d()V

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lx3/l;->l()V

    iget-object v0, p0, Lc4/a;->j:Lf4/k;

    if-nez v0, :cond_2

    new-instance v0, Lf4/k;

    invoke-direct {v0}, Lf4/k;-><init>()V

    iput-object v0, p0, Lc4/a;->j:Lf4/k;

    :cond_2
    new-instance v0, Lc4/c;

    iget-wide v1, p0, Lc4/a;->f:J

    invoke-direct {v0, p1, v1, v2}, Lc4/c;-><init>(Lx3/l;J)V

    iput-object v0, p0, Lc4/a;->i:Lc4/c;

    iget-object p1, p0, Lc4/a;->j:Lf4/k;

    invoke-virtual {p1, v0}, Lf4/k;->h(Lx3/l;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc4/a;->j:Lf4/k;

    new-instance v0, Lc4/d;

    iget-wide v1, p0, Lc4/a;->f:J

    iget-object v3, p0, Lc4/a;->b:Lx3/m;

    invoke-static {v3}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx3/m;

    invoke-direct {v0, v1, v2, v3}, Lc4/d;-><init>(JLx3/m;)V

    invoke-virtual {p1, v0}, Lf4/k;->b(Lx3/m;)V

    invoke-virtual {p0}, Lc4/a;->n()V

    :goto_0
    return-void
.end method

.method public final n()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lk4/a$b;

    iget-object v1, p0, Lc4/a;->g:Lq4/b;

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk4/a$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lc4/a;->f([Lk4/a$b;)V

    const/4 v0, 0x5

    iput v0, p0, Lc4/a;->c:I

    return-void
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lc4/a;->j:Lf4/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf4/k;->release()V

    :cond_0
    return-void
.end method
