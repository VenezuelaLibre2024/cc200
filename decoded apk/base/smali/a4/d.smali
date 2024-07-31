.class public final La4/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/k;


# static fields
.field public static final o:Lx3/p;


# instance fields
.field public final a:[B

.field public final b:Lp5/a0;

.field public final c:Z

.field public final d:Lx3/q$a;

.field public e:Lx3/m;

.field public f:Lx3/b0;

.field public g:I

.field public h:Lk4/a;

.field public i:Lx3/t;

.field public j:I

.field public k:I

.field public l:La4/b;

.field public m:I

.field public n:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, La4/c;->b:La4/c;

    sput-object v0, La4/d;->o:Lx3/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, La4/d;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2a

    new-array v0, v0, [B

    iput-object v0, p0, La4/d;->a:[B

    new-instance v0, Lp5/a0;

    const v1, 0x8000

    new-array v1, v1, [B

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lp5/a0;-><init>([BI)V

    iput-object v0, p0, La4/d;->b:Lp5/a0;

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, La4/d;->c:Z

    new-instance p1, Lx3/q$a;

    invoke-direct {p1}, Lx3/q$a;-><init>()V

    iput-object p1, p0, La4/d;->d:Lx3/q$a;

    iput v2, p0, La4/d;->g:I

    return-void
.end method

.method public static synthetic a()[Lx3/k;
    .locals 1

    invoke-static {}, La4/d;->j()[Lx3/k;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic j()[Lx3/k;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lx3/k;

    new-instance v1, La4/d;

    invoke-direct {v1}, La4/d;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public b(Lx3/m;)V
    .locals 2

    iput-object p1, p0, La4/d;->e:Lx3/m;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lx3/m;->e(II)Lx3/b0;

    move-result-object v0

    iput-object v0, p0, La4/d;->f:Lx3/b0;

    invoke-interface {p1}, Lx3/m;->n()V

    return-void
.end method

.method public c(JJ)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    const/4 p2, 0x0

    if-nez p1, :cond_0

    iput p2, p0, La4/d;->g:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, La4/d;->l:La4/b;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p3, p4}, Lx3/a;->h(J)V

    :cond_1
    :goto_0
    cmp-long p1, p3, v0

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const-wide/16 v0, -0x1

    :goto_1
    iput-wide v0, p0, La4/d;->n:J

    iput p2, p0, La4/d;->m:I

    iget-object p1, p0, La4/d;->b:Lp5/a0;

    invoke-virtual {p1, p2}, Lp5/a0;->P(I)V

    return-void
.end method

.method public final d(Lp5/a0;Z)J
    .locals 4

    iget-object v0, p0, La4/d;->i:Lx3/t;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lp5/a0;->f()I

    move-result v0

    :goto_0
    invoke-virtual {p1}, Lp5/a0;->g()I

    move-result v1

    add-int/lit8 v1, v1, -0x10

    if-gt v0, v1, :cond_1

    invoke-virtual {p1, v0}, Lp5/a0;->T(I)V

    iget-object v1, p0, La4/d;->i:Lx3/t;

    iget v2, p0, La4/d;->k:I

    iget-object v3, p0, La4/d;->d:Lx3/q$a;

    invoke-static {p1, v1, v2, v3}, Lx3/q;->d(Lp5/a0;Lx3/t;ILx3/q$a;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_1
    invoke-virtual {p1, v0}, Lp5/a0;->T(I)V

    iget-object p1, p0, La4/d;->d:Lx3/q$a;

    iget-wide p1, p1, Lx3/q$a;->a:J

    return-wide p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_5

    :goto_2
    invoke-virtual {p1}, Lp5/a0;->g()I

    move-result p2

    iget v1, p0, La4/d;->j:I

    sub-int/2addr p2, v1

    if-gt v0, p2, :cond_4

    invoke-virtual {p1, v0}, Lp5/a0;->T(I)V

    const/4 p2, 0x0

    :try_start_0
    iget-object v1, p0, La4/d;->i:Lx3/t;

    iget v2, p0, La4/d;->k:I

    iget-object v3, p0, La4/d;->d:Lx3/q$a;

    invoke-static {p1, v1, v2, v3}, Lx3/q;->d(Lp5/a0;Lx3/t;ILx3/q$a;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move v1, p2

    :goto_3
    invoke-virtual {p1}, Lp5/a0;->f()I

    move-result v2

    invoke-virtual {p1}, Lp5/a0;->g()I

    move-result v3

    if-le v2, v3, :cond_2

    goto :goto_4

    :cond_2
    move p2, v1

    :goto_4
    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lp5/a0;->g()I

    move-result p2

    invoke-virtual {p1, p2}, Lp5/a0;->T(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p1, v0}, Lp5/a0;->T(I)V

    :goto_5
    const-wide/16 p1, -0x1

    return-wide p1
.end method

.method public final e(Lx3/l;)V
    .locals 5

    invoke-static {p1}, Lx3/r;->b(Lx3/l;)I

    move-result v0

    iput v0, p0, La4/d;->k:I

    iget-object v0, p0, La4/d;->e:Lx3/m;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx3/m;

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v1

    invoke-interface {p1}, Lx3/l;->b()J

    move-result-wide v3

    invoke-virtual {p0, v1, v2, v3, v4}, La4/d;->f(JJ)Lx3/z;

    move-result-object p1

    invoke-interface {v0, p1}, Lx3/m;->j(Lx3/z;)V

    const/4 p1, 0x5

    iput p1, p0, La4/d;->g:I

    return-void
.end method

.method public final f(JJ)Lx3/z;
    .locals 8

    iget-object v0, p0, La4/d;->i:Lx3/t;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, La4/d;->i:Lx3/t;

    iget-object v0, v2, Lx3/t;->k:Lx3/t$a;

    if-eqz v0, :cond_0

    new-instance p3, Lx3/s;

    invoke-direct {p3, v2, p1, p2}, Lx3/s;-><init>(Lx3/t;J)V

    return-object p3

    :cond_0
    const-wide/16 v0, -0x1

    cmp-long v0, p3, v0

    if-eqz v0, :cond_1

    iget-wide v0, v2, Lx3/t;->j:J

    const-wide/16 v3, 0x0

    cmp-long v0, v0, v3

    if-lez v0, :cond_1

    new-instance v0, La4/b;

    iget v3, p0, La4/d;->k:I

    move-object v1, v0

    move-wide v4, p1

    move-wide v6, p3

    invoke-direct/range {v1 .. v7}, La4/b;-><init>(Lx3/t;IJJ)V

    iput-object v0, p0, La4/d;->l:La4/b;

    invoke-virtual {v0}, Lx3/a;->b()Lx3/z;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lx3/z$b;

    invoke-virtual {v2}, Lx3/t;->f()J

    move-result-wide p2

    invoke-direct {p1, p2, p3}, Lx3/z$b;-><init>(J)V

    return-object p1
.end method

.method public g(Lx3/l;Lx3/y;)I
    .locals 3

    iget v0, p0, La4/d;->g:I

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    const/4 v2, 0x1

    if-eq v0, v2, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1, p2}, La4/d;->l(Lx3/l;Lx3/y;)I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p0, p1}, La4/d;->e(Lx3/l;)V

    return v1

    :cond_2
    invoke-virtual {p0, p1}, La4/d;->n(Lx3/l;)V

    return v1

    :cond_3
    invoke-virtual {p0, p1}, La4/d;->o(Lx3/l;)V

    return v1

    :cond_4
    invoke-virtual {p0, p1}, La4/d;->i(Lx3/l;)V

    return v1

    :cond_5
    invoke-virtual {p0, p1}, La4/d;->m(Lx3/l;)V

    return v1
.end method

.method public h(Lx3/l;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lx3/r;->c(Lx3/l;Z)Lk4/a;

    invoke-static {p1}, Lx3/r;->a(Lx3/l;)Z

    move-result p1

    return p1
.end method

.method public final i(Lx3/l;)V
    .locals 3

    iget-object v0, p0, La4/d;->a:[B

    array-length v1, v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lx3/l;->p([BII)V

    invoke-interface {p1}, Lx3/l;->l()V

    const/4 p1, 0x2

    iput p1, p0, La4/d;->g:I

    return-void
.end method

.method public final k()V
    .locals 11

    iget-wide v0, p0, La4/d;->n:J

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    iget-object v2, p0, La4/d;->i:Lx3/t;

    invoke-static {v2}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx3/t;

    iget v2, v2, Lx3/t;->e:I

    int-to-long v2, v2

    div-long v5, v0, v2

    iget-object v0, p0, La4/d;->f:Lx3/b0;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lx3/b0;

    iget v8, p0, La4/d;->m:I

    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lx3/b0;->a(JIIILx3/b0$a;)V

    return-void
.end method

.method public final l(Lx3/l;Lx3/y;)I
    .locals 6

    iget-object v0, p0, La4/d;->f:Lx3/b0;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La4/d;->i:Lx3/t;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La4/d;->l:La4/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx3/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La4/d;->l:La4/b;

    invoke-virtual {v0, p1, p2}, Lx3/a;->c(Lx3/l;Lx3/y;)I

    move-result p1

    return p1

    :cond_0
    iget-wide v0, p0, La4/d;->n:J

    const-wide/16 v2, -0x1

    cmp-long p2, v0, v2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    iget-object p2, p0, La4/d;->i:Lx3/t;

    invoke-static {p1, p2}, Lx3/q;->i(Lx3/l;Lx3/t;)J

    move-result-wide p1

    iput-wide p1, p0, La4/d;->n:J

    return v0

    :cond_1
    iget-object p2, p0, La4/d;->b:Lp5/a0;

    invoke-virtual {p2}, Lp5/a0;->g()I

    move-result p2

    const v1, 0x8000

    if-ge p2, v1, :cond_4

    iget-object v4, p0, La4/d;->b:Lp5/a0;

    invoke-virtual {v4}, Lp5/a0;->e()[B

    move-result-object v4

    sub-int/2addr v1, p2

    invoke-interface {p1, v4, p2, v1}, Lx3/l;->c([BII)I

    move-result p1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_2

    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    move v4, v0

    :goto_0
    if-nez v4, :cond_3

    iget-object v1, p0, La4/d;->b:Lp5/a0;

    add-int/2addr p2, p1

    invoke-virtual {v1, p2}, Lp5/a0;->S(I)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, La4/d;->b:Lp5/a0;

    invoke-virtual {p1}, Lp5/a0;->a()I

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {p0}, La4/d;->k()V

    return v1

    :cond_4
    move v4, v0

    :cond_5
    :goto_1
    iget-object p1, p0, La4/d;->b:Lp5/a0;

    invoke-virtual {p1}, Lp5/a0;->f()I

    move-result p1

    iget p2, p0, La4/d;->m:I

    iget v1, p0, La4/d;->j:I

    if-ge p2, v1, :cond_6

    iget-object v5, p0, La4/d;->b:Lp5/a0;

    sub-int/2addr v1, p2

    invoke-virtual {v5}, Lp5/a0;->a()I

    move-result p2

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-virtual {v5, p2}, Lp5/a0;->U(I)V

    :cond_6
    iget-object p2, p0, La4/d;->b:Lp5/a0;

    invoke-virtual {p0, p2, v4}, La4/d;->d(Lp5/a0;Z)J

    move-result-wide v4

    iget-object p2, p0, La4/d;->b:Lp5/a0;

    invoke-virtual {p2}, Lp5/a0;->f()I

    move-result p2

    sub-int/2addr p2, p1

    iget-object v1, p0, La4/d;->b:Lp5/a0;

    invoke-virtual {v1, p1}, Lp5/a0;->T(I)V

    iget-object p1, p0, La4/d;->f:Lx3/b0;

    iget-object v1, p0, La4/d;->b:Lp5/a0;

    invoke-interface {p1, v1, p2}, Lx3/b0;->e(Lp5/a0;I)V

    iget p1, p0, La4/d;->m:I

    add-int/2addr p1, p2

    iput p1, p0, La4/d;->m:I

    cmp-long p1, v4, v2

    if-eqz p1, :cond_7

    invoke-virtual {p0}, La4/d;->k()V

    iput v0, p0, La4/d;->m:I

    iput-wide v4, p0, La4/d;->n:J

    :cond_7
    iget-object p1, p0, La4/d;->b:Lp5/a0;

    invoke-virtual {p1}, Lp5/a0;->a()I

    move-result p1

    const/16 p2, 0x10

    if-ge p1, p2, :cond_8

    iget-object p1, p0, La4/d;->b:Lp5/a0;

    invoke-virtual {p1}, Lp5/a0;->a()I

    move-result p1

    iget-object p2, p0, La4/d;->b:Lp5/a0;

    invoke-virtual {p2}, Lp5/a0;->e()[B

    move-result-object p2

    iget-object v1, p0, La4/d;->b:Lp5/a0;

    invoke-virtual {v1}, Lp5/a0;->f()I

    move-result v1

    iget-object v2, p0, La4/d;->b:Lp5/a0;

    invoke-virtual {v2}, Lp5/a0;->e()[B

    move-result-object v2

    invoke-static {p2, v1, v2, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p2, p0, La4/d;->b:Lp5/a0;

    invoke-virtual {p2, v0}, Lp5/a0;->T(I)V

    iget-object p2, p0, La4/d;->b:Lp5/a0;

    invoke-virtual {p2, p1}, Lp5/a0;->S(I)V

    :cond_8
    return v0
.end method

.method public final m(Lx3/l;)V
    .locals 2

    iget-boolean v0, p0, La4/d;->c:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {p1, v0}, Lx3/r;->d(Lx3/l;Z)Lk4/a;

    move-result-object p1

    iput-object p1, p0, La4/d;->h:Lk4/a;

    iput v1, p0, La4/d;->g:I

    return-void
.end method

.method public final n(Lx3/l;)V
    .locals 3

    new-instance v0, Lx3/r$a;

    iget-object v1, p0, La4/d;->i:Lx3/t;

    invoke-direct {v0, v1}, Lx3/r$a;-><init>(Lx3/t;)V

    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_0

    invoke-static {p1, v0}, Lx3/r;->e(Lx3/l;Lx3/r$a;)Z

    move-result v1

    iget-object v2, v0, Lx3/r$a;->a:Lx3/t;

    invoke-static {v2}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx3/t;

    iput-object v2, p0, La4/d;->i:Lx3/t;

    goto :goto_0

    :cond_0
    iget-object p1, p0, La4/d;->i:Lx3/t;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, La4/d;->i:Lx3/t;

    iget p1, p1, Lx3/t;->c:I

    const/4 v0, 0x6

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, La4/d;->j:I

    iget-object p1, p0, La4/d;->f:Lx3/b0;

    invoke-static {p1}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx3/b0;

    iget-object v0, p0, La4/d;->i:Lx3/t;

    iget-object v1, p0, La4/d;->a:[B

    iget-object v2, p0, La4/d;->h:Lk4/a;

    invoke-virtual {v0, v1, v2}, Lx3/t;->g([BLk4/a;)Ls3/m1;

    move-result-object v0

    invoke-interface {p1, v0}, Lx3/b0;->b(Ls3/m1;)V

    const/4 p1, 0x4

    iput p1, p0, La4/d;->g:I

    return-void
.end method

.method public final o(Lx3/l;)V
    .locals 0

    invoke-static {p1}, Lx3/r;->i(Lx3/l;)V

    const/4 p1, 0x3

    iput p1, p0, La4/d;->g:I

    return-void
.end method

.method public release()V
    .locals 0

    return-void
.end method
