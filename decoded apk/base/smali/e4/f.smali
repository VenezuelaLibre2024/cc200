.class public final Le4/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/k;


# static fields
.field public static final u:Lx3/p;

.field public static final v:Lp4/h$a;


# instance fields
.field public final a:I

.field public final b:J

.field public final c:Lp5/a0;

.field public final d:Lu3/f0$a;

.field public final e:Lx3/v;

.field public final f:Lx3/w;

.field public final g:Lx3/b0;

.field public h:Lx3/m;

.field public i:Lx3/b0;

.field public j:Lx3/b0;

.field public k:I

.field public l:Lk4/a;

.field public m:J

.field public n:J

.field public o:J

.field public p:I

.field public q:Le4/g;

.field public r:Z

.field public s:Z

.field public t:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Le4/e;->b:Le4/e;

    sput-object v0, Le4/f;->u:Lx3/p;

    sget-object v0, Le4/d;->a:Le4/d;

    sput-object v0, Le4/f;->v:Lp4/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Le4/f;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {p0, p1, v0, v1}, Le4/f;-><init>(IJ)V

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 p1, p1, 0x1

    :cond_0
    iput p1, p0, Le4/f;->a:I

    iput-wide p2, p0, Le4/f;->b:J

    new-instance p1, Lp5/a0;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Lp5/a0;-><init>(I)V

    iput-object p1, p0, Le4/f;->c:Lp5/a0;

    new-instance p1, Lu3/f0$a;

    invoke-direct {p1}, Lu3/f0$a;-><init>()V

    iput-object p1, p0, Le4/f;->d:Lu3/f0$a;

    new-instance p1, Lx3/v;

    invoke-direct {p1}, Lx3/v;-><init>()V

    iput-object p1, p0, Le4/f;->e:Lx3/v;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Le4/f;->m:J

    new-instance p1, Lx3/w;

    invoke-direct {p1}, Lx3/w;-><init>()V

    iput-object p1, p0, Le4/f;->f:Lx3/w;

    new-instance p1, Lx3/j;

    invoke-direct {p1}, Lx3/j;-><init>()V

    iput-object p1, p0, Le4/f;->g:Lx3/b0;

    iput-object p1, p0, Le4/f;->j:Lx3/b0;

    return-void
.end method

.method public static synthetic a()[Lx3/k;
    .locals 1

    invoke-static {}, Le4/f;->o()[Lx3/k;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(IIIII)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Le4/f;->p(IIIII)Z

    move-result p0

    return p0
.end method

.method public static l(Lk4/a;)J
    .locals 6

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lk4/a;->f()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Lk4/a;->e(I)Lk4/a$b;

    move-result-object v3

    instance-of v4, v3, Lp4/m;

    if-eqz v4, :cond_0

    check-cast v3, Lp4/m;

    iget-object v4, v3, Lp4/i;->h:Ljava/lang/String;

    const-string v5, "TLEN"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object p0, v3, Lp4/m;->k:Li7/u;

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lp5/n0;->B0(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public static m(Lp5/a0;I)I
    .locals 2

    invoke-virtual {p0}, Lp5/a0;->g()I

    move-result v0

    add-int/lit8 v1, p1, 0x4

    if-lt v0, v1, :cond_1

    invoke-virtual {p0, p1}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result p1

    const v0, 0x58696e67

    if-eq p1, v0, :cond_0

    const v0, 0x496e666f

    if-ne p1, v0, :cond_1

    :cond_0
    return p1

    :cond_1
    invoke-virtual {p0}, Lp5/a0;->g()I

    move-result p1

    const/16 v0, 0x28

    if-lt p1, v0, :cond_2

    const/16 p1, 0x24

    invoke-virtual {p0, p1}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result p0

    const p1, 0x56425249

    if-ne p0, p1, :cond_2

    return p1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static n(IJ)Z
    .locals 4

    const v0, -0x1f400

    and-int/2addr p0, v0

    int-to-long v0, p0

    const-wide/32 v2, -0x1f400

    and-long p0, p1, v2

    cmp-long p0, v0, p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic o()[Lx3/k;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lx3/k;

    new-instance v1, Le4/f;

    invoke-direct {v1}, Le4/f;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static synthetic p(IIIII)Z
    .locals 3

    const/4 v0, 0x2

    const/16 v1, 0x4d

    const/16 v2, 0x43

    if-ne p1, v2, :cond_0

    const/16 v2, 0x4f

    if-ne p2, v2, :cond_0

    if-ne p3, v1, :cond_0

    if-eq p4, v1, :cond_1

    if-eq p0, v0, :cond_1

    :cond_0
    if-ne p1, v1, :cond_2

    const/16 p1, 0x4c

    if-ne p2, p1, :cond_2

    if-ne p3, p1, :cond_2

    const/16 p1, 0x54

    if-eq p4, p1, :cond_1

    if-ne p0, v0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static q(Lk4/a;J)Le4/c;
    .locals 4

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lk4/a;->f()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Lk4/a;->e(I)Lk4/a$b;

    move-result-object v2

    instance-of v3, v2, Lp4/k;

    if-eqz v3, :cond_0

    check-cast v2, Lp4/k;

    invoke-static {p0}, Le4/f;->l(Lk4/a;)J

    move-result-wide v0

    invoke-static {p1, p2, v2, v0, v1}, Le4/c;->b(JLp4/k;J)Le4/c;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public b(Lx3/m;)V
    .locals 2

    iput-object p1, p0, Le4/f;->h:Lx3/m;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lx3/m;->e(II)Lx3/b0;

    move-result-object p1

    iput-object p1, p0, Le4/f;->i:Lx3/b0;

    iput-object p1, p0, Le4/f;->j:Lx3/b0;

    iget-object p1, p0, Le4/f;->h:Lx3/m;

    invoke-interface {p1}, Lx3/m;->n()V

    return-void
.end method

.method public c(JJ)V
    .locals 2

    const/4 p1, 0x0

    iput p1, p0, Le4/f;->k:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Le4/f;->m:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Le4/f;->n:J

    iput p1, p0, Le4/f;->p:I

    iput-wide p3, p0, Le4/f;->t:J

    iget-object p1, p0, Le4/f;->q:Le4/g;

    instance-of p2, p1, Le4/b;

    if-eqz p2, :cond_0

    check-cast p1, Le4/b;

    invoke-virtual {p1, p3, p4}, Le4/b;->b(J)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Le4/f;->s:Z

    iget-object p1, p0, Le4/f;->g:Lx3/b0;

    iput-object p1, p0, Le4/f;->j:Lx3/b0;

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Le4/f;->i:Lx3/b0;

    invoke-static {v0}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Le4/f;->h:Lx3/m;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final f(Lx3/l;)Le4/g;
    .locals 11

    invoke-virtual {p0, p1}, Le4/f;->r(Lx3/l;)Le4/g;

    move-result-object v0

    iget-object v1, p0, Le4/f;->l:Lk4/a;

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Le4/f;->q(Lk4/a;J)Le4/c;

    move-result-object v1

    iget-boolean v2, p0, Le4/f;->r:Z

    if-eqz v2, :cond_0

    new-instance p1, Le4/g$a;

    invoke-direct {p1}, Le4/g$a;-><init>()V

    return-object p1

    :cond_0
    const/4 v2, 0x0

    iget v3, p0, Le4/f;->a:I

    and-int/lit8 v3, v3, 0x4

    if-eqz v3, :cond_3

    const-wide/16 v2, -0x1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lx3/z;->d()J

    move-result-wide v2

    invoke-interface {v1}, Le4/g;->e()J

    move-result-wide v0

    :goto_0
    move-wide v9, v0

    move-wide v5, v2

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    invoke-interface {v0}, Lx3/z;->d()J

    move-result-wide v2

    invoke-interface {v0}, Le4/g;->e()J

    move-result-wide v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Le4/f;->l:Lk4/a;

    invoke-static {v0}, Le4/f;->l(Lk4/a;)J

    move-result-wide v0

    move-wide v5, v0

    move-wide v9, v2

    :goto_1
    new-instance v0, Le4/b;

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v7

    move-object v4, v0

    invoke-direct/range {v4 .. v10}, Le4/b;-><init>(JJJ)V

    goto :goto_2

    :cond_3
    if-eqz v1, :cond_4

    move-object v0, v1

    goto :goto_2

    :cond_4
    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    move-object v0, v2

    :goto_2
    const/4 v1, 0x1

    if-eqz v0, :cond_6

    invoke-interface {v0}, Lx3/z;->f()Z

    move-result v2

    if-nez v2, :cond_8

    iget v2, p0, Le4/f;->a:I

    and-int/2addr v2, v1

    if-eqz v2, :cond_8

    :cond_6
    iget v0, p0, Le4/f;->a:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    const/4 v1, 0x0

    :goto_3
    invoke-virtual {p0, p1, v1}, Le4/f;->k(Lx3/l;Z)Le4/g;

    move-result-object v0

    :cond_8
    return-object v0
.end method

.method public g(Lx3/l;Lx3/y;)I
    .locals 4

    invoke-virtual {p0}, Le4/f;->e()V

    invoke-virtual {p0, p1}, Le4/f;->t(Lx3/l;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    iget-object p2, p0, Le4/f;->q:Le4/g;

    instance-of p2, p2, Le4/b;

    if-eqz p2, :cond_0

    iget-wide v0, p0, Le4/f;->n:J

    invoke-virtual {p0, v0, v1}, Le4/f;->i(J)J

    move-result-wide v0

    iget-object p2, p0, Le4/f;->q:Le4/g;

    invoke-interface {p2}, Lx3/z;->d()J

    move-result-wide v2

    cmp-long p2, v2, v0

    if-eqz p2, :cond_0

    iget-object p2, p0, Le4/f;->q:Le4/g;

    check-cast p2, Le4/b;

    invoke-virtual {p2, v0, v1}, Le4/b;->g(J)V

    iget-object p2, p0, Le4/f;->h:Lx3/m;

    iget-object v0, p0, Le4/f;->q:Le4/g;

    invoke-interface {p2, v0}, Lx3/m;->j(Lx3/z;)V

    :cond_0
    return p1
.end method

.method public h(Lx3/l;)Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Le4/f;->v(Lx3/l;Z)Z

    move-result p1

    return p1
.end method

.method public final i(J)J
    .locals 4

    iget-wide v0, p0, Le4/f;->m:J

    const-wide/32 v2, 0xf4240

    mul-long/2addr p1, v2

    iget-object v2, p0, Le4/f;->d:Lu3/f0$a;

    iget v2, v2, Lu3/f0$a;->d:I

    int-to-long v2, v2

    div-long/2addr p1, v2

    add-long/2addr v0, p1

    return-wide v0
.end method

.method public j()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Le4/f;->r:Z

    return-void
.end method

.method public final k(Lx3/l;Z)Le4/g;
    .locals 9

    iget-object v0, p0, Le4/f;->c:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-interface {p1, v0, v1, v2}, Lx3/l;->p([BII)V

    iget-object v0, p0, Le4/f;->c:Lp5/a0;

    invoke-virtual {v0, v1}, Lp5/a0;->T(I)V

    iget-object v0, p0, Le4/f;->d:Lu3/f0$a;

    iget-object v1, p0, Le4/f;->c:Lp5/a0;

    invoke-virtual {v1}, Lp5/a0;->p()I

    move-result v1

    invoke-virtual {v0, v1}, Lu3/f0$a;->a(I)Z

    new-instance v0, Le4/a;

    invoke-interface {p1}, Lx3/l;->b()J

    move-result-wide v3

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v5

    iget-object v7, p0, Le4/f;->d:Lu3/f0$a;

    move-object v2, v0

    move v8, p2

    invoke-direct/range {v2 .. v8}, Le4/a;-><init>(JJLu3/f0$a;Z)V

    return-object v0
.end method

.method public final r(Lx3/l;)Le4/g;
    .locals 10

    new-instance v5, Lp5/a0;

    iget-object v0, p0, Le4/f;->d:Lu3/f0$a;

    iget v0, v0, Lu3/f0$a;->c:I

    invoke-direct {v5, v0}, Lp5/a0;-><init>(I)V

    invoke-virtual {v5}, Lp5/a0;->e()[B

    move-result-object v0

    iget-object v1, p0, Le4/f;->d:Lu3/f0$a;

    iget v1, v1, Lu3/f0$a;->c:I

    const/4 v6, 0x0

    invoke-interface {p1, v0, v6, v1}, Lx3/l;->p([BII)V

    iget-object v0, p0, Le4/f;->d:Lu3/f0$a;

    iget v1, v0, Lu3/f0$a;->a:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    const/16 v3, 0x15

    iget v0, v0, Lu3/f0$a;->e:I

    if-eqz v1, :cond_0

    if-eq v0, v2, :cond_2

    const/16 v3, 0x24

    goto :goto_0

    :cond_0
    if-eq v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/16 v3, 0xd

    :cond_2
    :goto_0
    move v7, v3

    invoke-static {v5, v7}, Le4/f;->m(Lp5/a0;I)I

    move-result v8

    const v0, 0x58696e67

    const v9, 0x496e666f

    if-eq v8, v0, :cond_5

    if-ne v8, v9, :cond_3

    goto :goto_1

    :cond_3
    const v0, 0x56425249

    if-ne v8, v0, :cond_4

    invoke-interface {p1}, Lx3/l;->b()J

    move-result-wide v0

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v2

    iget-object v4, p0, Le4/f;->d:Lu3/f0$a;

    invoke-static/range {v0 .. v5}, Le4/h;->b(JJLu3/f0$a;Lp5/a0;)Le4/h;

    move-result-object v0

    iget-object v1, p0, Le4/f;->d:Lu3/f0$a;

    iget v1, v1, Lu3/f0$a;->c:I

    invoke-interface {p1, v1}, Lx3/l;->m(I)V

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    invoke-interface {p1}, Lx3/l;->l()V

    goto :goto_2

    :cond_5
    :goto_1
    invoke-interface {p1}, Lx3/l;->b()J

    move-result-wide v0

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v2

    iget-object v4, p0, Le4/f;->d:Lu3/f0$a;

    invoke-static/range {v0 .. v5}, Le4/i;->b(JJLu3/f0$a;Lp5/a0;)Le4/i;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v1, p0, Le4/f;->e:Lx3/v;

    invoke-virtual {v1}, Lx3/v;->a()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-interface {p1}, Lx3/l;->l()V

    add-int/lit16 v7, v7, 0x8d

    invoke-interface {p1, v7}, Lx3/l;->h(I)V

    iget-object v1, p0, Le4/f;->c:Lp5/a0;

    invoke-virtual {v1}, Lp5/a0;->e()[B

    move-result-object v1

    const/4 v2, 0x3

    invoke-interface {p1, v1, v6, v2}, Lx3/l;->p([BII)V

    iget-object v1, p0, Le4/f;->c:Lp5/a0;

    invoke-virtual {v1, v6}, Lp5/a0;->T(I)V

    iget-object v1, p0, Le4/f;->e:Lx3/v;

    iget-object v2, p0, Le4/f;->c:Lp5/a0;

    invoke-virtual {v2}, Lp5/a0;->J()I

    move-result v2

    invoke-virtual {v1, v2}, Lx3/v;->d(I)Z

    :cond_6
    iget-object v1, p0, Le4/f;->d:Lu3/f0$a;

    iget v1, v1, Lu3/f0$a;->c:I

    invoke-interface {p1, v1}, Lx3/l;->m(I)V

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lx3/z;->f()Z

    move-result v1

    if-nez v1, :cond_7

    if-ne v8, v9, :cond_7

    invoke-virtual {p0, p1, v6}, Le4/f;->k(Lx3/l;Z)Le4/g;

    move-result-object p1

    return-object p1

    :cond_7
    :goto_2
    return-object v0
.end method

.method public release()V
    .locals 0

    return-void
.end method

.method public final s(Lx3/l;)Z
    .locals 8

    iget-object v0, p0, Le4/f;->q:Le4/g;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Le4/g;->e()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lx3/l;->f()J

    move-result-wide v4

    const-wide/16 v6, 0x4

    sub-long/2addr v2, v6

    cmp-long v0, v4, v2

    if-lez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    iget-object v0, p0, Le4/f;->c:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-interface {p1, v0, v2, v3, v1}, Lx3/l;->e([BIIZ)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    xor-int/2addr p1, v1

    return p1

    :catch_0
    return v1
.end method

.method public final t(Lx3/l;)I
    .locals 5

    iget v0, p0, Le4/f;->k:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v0}, Le4/f;->v(Lx3/l;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, -0x1

    return p1

    :cond_0
    :goto_0
    iget-object v0, p0, Le4/f;->q:Le4/g;

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, Le4/f;->f(Lx3/l;)Le4/g;

    move-result-object v0

    iput-object v0, p0, Le4/f;->q:Le4/g;

    iget-object v1, p0, Le4/f;->h:Lx3/m;

    invoke-interface {v1, v0}, Lx3/m;->j(Lx3/z;)V

    iget-object v0, p0, Le4/f;->j:Lx3/b0;

    new-instance v1, Ls3/m1$b;

    invoke-direct {v1}, Ls3/m1$b;-><init>()V

    iget-object v2, p0, Le4/f;->d:Lu3/f0$a;

    iget-object v2, v2, Lu3/f0$a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v1

    const/16 v2, 0x1000

    invoke-virtual {v1, v2}, Ls3/m1$b;->Y(I)Ls3/m1$b;

    move-result-object v1

    iget-object v2, p0, Le4/f;->d:Lu3/f0$a;

    iget v2, v2, Lu3/f0$a;->e:I

    invoke-virtual {v1, v2}, Ls3/m1$b;->J(I)Ls3/m1$b;

    move-result-object v1

    iget-object v2, p0, Le4/f;->d:Lu3/f0$a;

    iget v2, v2, Lu3/f0$a;->d:I

    invoke-virtual {v1, v2}, Ls3/m1$b;->h0(I)Ls3/m1$b;

    move-result-object v1

    iget-object v2, p0, Le4/f;->e:Lx3/v;

    iget v2, v2, Lx3/v;->a:I

    invoke-virtual {v1, v2}, Ls3/m1$b;->P(I)Ls3/m1$b;

    move-result-object v1

    iget-object v2, p0, Le4/f;->e:Lx3/v;

    iget v2, v2, Lx3/v;->b:I

    invoke-virtual {v1, v2}, Ls3/m1$b;->Q(I)Ls3/m1$b;

    move-result-object v1

    iget v2, p0, Le4/f;->a:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    iget-object v2, p0, Le4/f;->l:Lk4/a;

    :goto_1
    invoke-virtual {v1, v2}, Ls3/m1$b;->Z(Lk4/a;)Ls3/m1$b;

    move-result-object v1

    invoke-virtual {v1}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v1

    invoke-interface {v0, v1}, Lx3/b0;->b(Ls3/m1;)V

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v0

    iput-wide v0, p0, Le4/f;->o:J

    goto :goto_2

    :cond_2
    iget-wide v0, p0, Le4/f;->o:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_3

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v0

    iget-wide v2, p0, Le4/f;->o:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_3

    sub-long/2addr v2, v0

    long-to-int v0, v2

    invoke-interface {p1, v0}, Lx3/l;->m(I)V

    :cond_3
    :goto_2
    invoke-virtual {p0, p1}, Le4/f;->u(Lx3/l;)I

    move-result p1

    return p1
.end method

.method public final u(Lx3/l;)I
    .locals 11

    iget v0, p0, Le4/f;->p:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-nez v0, :cond_4

    invoke-interface {p1}, Lx3/l;->l()V

    invoke-virtual {p0, p1}, Le4/f;->s(Lx3/l;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    iget-object v0, p0, Le4/f;->c:Lp5/a0;

    invoke-virtual {v0, v3}, Lp5/a0;->T(I)V

    iget-object v0, p0, Le4/f;->c:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->p()I

    move-result v0

    iget v4, p0, Le4/f;->k:I

    int-to-long v4, v4

    invoke-static {v0, v4, v5}, Le4/f;->n(IJ)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v0}, Lu3/f0;->j(I)I

    move-result v4

    if-ne v4, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v4, p0, Le4/f;->d:Lu3/f0$a;

    invoke-virtual {v4, v0}, Lu3/f0$a;->a(I)Z

    iget-wide v4, p0, Le4/f;->m:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    iget-object v0, p0, Le4/f;->q:Le4/g;

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v4

    invoke-interface {v0, v4, v5}, Le4/g;->a(J)J

    move-result-wide v4

    iput-wide v4, p0, Le4/f;->m:J

    iget-wide v4, p0, Le4/f;->b:J

    cmp-long v0, v4, v6

    if-eqz v0, :cond_2

    iget-object v0, p0, Le4/f;->q:Le4/g;

    const-wide/16 v4, 0x0

    invoke-interface {v0, v4, v5}, Le4/g;->a(J)J

    move-result-wide v4

    iget-wide v6, p0, Le4/f;->m:J

    iget-wide v8, p0, Le4/f;->b:J

    sub-long/2addr v8, v4

    add-long/2addr v6, v8

    iput-wide v6, p0, Le4/f;->m:J

    :cond_2
    iget-object v0, p0, Le4/f;->d:Lu3/f0$a;

    iget v4, v0, Lu3/f0$a;->c:I

    iput v4, p0, Le4/f;->p:I

    iget-object v4, p0, Le4/f;->q:Le4/g;

    instance-of v5, v4, Le4/b;

    if-eqz v5, :cond_4

    check-cast v4, Le4/b;

    iget-wide v5, p0, Le4/f;->n:J

    iget v0, v0, Lu3/f0$a;->g:I

    int-to-long v7, v0

    add-long/2addr v5, v7

    invoke-virtual {p0, v5, v6}, Le4/f;->i(J)J

    move-result-wide v5

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v7

    iget-object v0, p0, Le4/f;->d:Lu3/f0$a;

    iget v0, v0, Lu3/f0$a;->c:I

    int-to-long v9, v0

    add-long/2addr v7, v9

    invoke-virtual {v4, v5, v6, v7, v8}, Le4/b;->c(JJ)V

    iget-boolean v0, p0, Le4/f;->s:Z

    if-eqz v0, :cond_4

    iget-wide v5, p0, Le4/f;->t:J

    invoke-virtual {v4, v5, v6}, Le4/b;->b(J)Z

    move-result v0

    if-eqz v0, :cond_4

    iput-boolean v3, p0, Le4/f;->s:Z

    iget-object v0, p0, Le4/f;->i:Lx3/b0;

    iput-object v0, p0, Le4/f;->j:Lx3/b0;

    goto :goto_1

    :cond_3
    :goto_0
    invoke-interface {p1, v1}, Lx3/l;->m(I)V

    iput v3, p0, Le4/f;->k:I

    return v3

    :cond_4
    :goto_1
    iget-object v0, p0, Le4/f;->j:Lx3/b0;

    iget v4, p0, Le4/f;->p:I

    invoke-interface {v0, p1, v4, v1}, Lx3/b0;->c(Lo5/h;IZ)I

    move-result p1

    if-ne p1, v2, :cond_5

    return v2

    :cond_5
    iget v0, p0, Le4/f;->p:I

    sub-int/2addr v0, p1

    iput v0, p0, Le4/f;->p:I

    if-lez v0, :cond_6

    return v3

    :cond_6
    iget-object v4, p0, Le4/f;->j:Lx3/b0;

    iget-wide v0, p0, Le4/f;->n:J

    invoke-virtual {p0, v0, v1}, Le4/f;->i(J)J

    move-result-wide v5

    const/4 v7, 0x1

    iget-object p1, p0, Le4/f;->d:Lu3/f0$a;

    iget v8, p1, Lu3/f0$a;->c:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lx3/b0;->a(JIIILx3/b0$a;)V

    iget-wide v0, p0, Le4/f;->n:J

    iget-object p1, p0, Le4/f;->d:Lu3/f0$a;

    iget p1, p1, Lu3/f0$a;->g:I

    int-to-long v4, p1

    add-long/2addr v0, v4

    iput-wide v0, p0, Le4/f;->n:J

    iput v3, p0, Le4/f;->p:I

    return v3
.end method

.method public final v(Lx3/l;Z)Z
    .locals 11

    if-eqz p2, :cond_0

    const v0, 0x8000

    goto :goto_0

    :cond_0
    const/high16 v0, 0x20000

    :goto_0
    invoke-interface {p1}, Lx3/l;->l()V

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v1, :cond_5

    iget v1, p0, Le4/f;->a:I

    and-int/lit8 v1, v1, 0x8

    if-nez v1, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    if-eqz v1, :cond_2

    move-object v1, v2

    goto :goto_2

    :cond_2
    sget-object v1, Le4/f;->v:Lp4/h$a;

    :goto_2
    iget-object v5, p0, Le4/f;->f:Lx3/w;

    invoke-virtual {v5, p1, v1}, Lx3/w;->a(Lx3/l;Lp4/h$a;)Lk4/a;

    move-result-object v1

    iput-object v1, p0, Le4/f;->l:Lk4/a;

    if-eqz v1, :cond_3

    iget-object v5, p0, Le4/f;->e:Lx3/v;

    invoke-virtual {v5, v1}, Lx3/v;->c(Lk4/a;)Z

    :cond_3
    invoke-interface {p1}, Lx3/l;->f()J

    move-result-wide v5

    long-to-int v1, v5

    if-nez p2, :cond_4

    invoke-interface {p1, v1}, Lx3/l;->m(I)V

    :cond_4
    move v5, v4

    goto :goto_3

    :cond_5
    move v1, v4

    move v5, v1

    :goto_3
    move v6, v5

    move v7, v6

    :goto_4
    invoke-virtual {p0, p1}, Le4/f;->s(Lx3/l;)Z

    move-result v8

    if-eqz v8, :cond_7

    if-lez v6, :cond_6

    goto :goto_6

    :cond_6
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_7
    iget-object v8, p0, Le4/f;->c:Lp5/a0;

    invoke-virtual {v8, v4}, Lp5/a0;->T(I)V

    iget-object v8, p0, Le4/f;->c:Lp5/a0;

    invoke-virtual {v8}, Lp5/a0;->p()I

    move-result v8

    if-eqz v5, :cond_8

    int-to-long v9, v5

    invoke-static {v8, v9, v10}, Le4/f;->n(IJ)Z

    move-result v9

    if-eqz v9, :cond_9

    :cond_8
    invoke-static {v8}, Lu3/f0;->j(I)I

    move-result v9

    const/4 v10, -0x1

    if-ne v9, v10, :cond_d

    :cond_9
    add-int/lit8 v5, v7, 0x1

    if-ne v7, v0, :cond_b

    if-eqz p2, :cond_a

    return v4

    :cond_a
    const-string p1, "Searched too many bytes."

    invoke-static {p1, v2}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p1

    throw p1

    :cond_b
    if-eqz p2, :cond_c

    invoke-interface {p1}, Lx3/l;->l()V

    add-int v6, v1, v5

    invoke-interface {p1, v6}, Lx3/l;->h(I)V

    goto :goto_5

    :cond_c
    invoke-interface {p1, v3}, Lx3/l;->m(I)V

    :goto_5
    move v6, v4

    move v7, v5

    move v5, v6

    goto :goto_4

    :cond_d
    add-int/lit8 v6, v6, 0x1

    if-ne v6, v3, :cond_e

    iget-object v5, p0, Le4/f;->d:Lu3/f0$a;

    invoke-virtual {v5, v8}, Lu3/f0$a;->a(I)Z

    move v5, v8

    goto :goto_8

    :cond_e
    const/4 v8, 0x4

    if-ne v6, v8, :cond_10

    :goto_6
    if-eqz p2, :cond_f

    add-int/2addr v1, v7

    invoke-interface {p1, v1}, Lx3/l;->m(I)V

    goto :goto_7

    :cond_f
    invoke-interface {p1}, Lx3/l;->l()V

    :goto_7
    iput v5, p0, Le4/f;->k:I

    return v3

    :cond_10
    :goto_8
    add-int/lit8 v9, v9, -0x4

    invoke-interface {p1, v9}, Lx3/l;->h(I)V

    goto :goto_4
.end method
