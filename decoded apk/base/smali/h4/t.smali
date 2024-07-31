.class public final Lh4/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh4/m;


# instance fields
.field public final a:Lp5/a0;

.field public final b:Lu3/f0$a;

.field public final c:Ljava/lang/String;

.field public d:Lx3/b0;

.field public e:Ljava/lang/String;

.field public f:I

.field public g:I

.field public h:Z

.field public i:Z

.field public j:J

.field public k:I

.field public l:J


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lh4/t;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lh4/t;->f:I

    new-instance v1, Lp5/a0;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lp5/a0;-><init>(I)V

    iput-object v1, p0, Lh4/t;->a:Lp5/a0;

    invoke-virtual {v1}, Lp5/a0;->e()[B

    move-result-object v1

    const/4 v2, -0x1

    aput-byte v2, v1, v0

    new-instance v0, Lu3/f0$a;

    invoke-direct {v0}, Lu3/f0$a;-><init>()V

    iput-object v0, p0, Lh4/t;->b:Lu3/f0$a;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lh4/t;->l:J

    iput-object p1, p0, Lh4/t;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lp5/a0;)V
    .locals 2

    iget-object v0, p0, Lh4/t;->d:Lx3/b0;

    invoke-static {v0}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    invoke-virtual {p1}, Lp5/a0;->a()I

    move-result v0

    if-lez v0, :cond_3

    iget v0, p0, Lh4/t;->f:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1}, Lh4/t;->g(Lp5/a0;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p0, p1}, Lh4/t;->h(Lp5/a0;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, Lh4/t;->b(Lp5/a0;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final b(Lp5/a0;)V
    .locals 8

    invoke-virtual {p1}, Lp5/a0;->e()[B

    move-result-object v0

    invoke-virtual {p1}, Lp5/a0;->f()I

    move-result v1

    invoke-virtual {p1}, Lp5/a0;->g()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_3

    aget-byte v3, v0, v1

    const/16 v4, 0xff

    and-int/2addr v3, v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v3, v4, :cond_0

    move v3, v6

    goto :goto_1

    :cond_0
    move v3, v5

    :goto_1
    iget-boolean v4, p0, Lh4/t;->i:Z

    if-eqz v4, :cond_1

    aget-byte v4, v0, v1

    const/16 v7, 0xe0

    and-int/2addr v4, v7

    if-ne v4, v7, :cond_1

    move v4, v6

    goto :goto_2

    :cond_1
    move v4, v5

    :goto_2
    iput-boolean v3, p0, Lh4/t;->i:Z

    if-eqz v4, :cond_2

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p1, v2}, Lp5/a0;->T(I)V

    iput-boolean v5, p0, Lh4/t;->i:Z

    iget-object p1, p0, Lh4/t;->a:Lp5/a0;

    invoke-virtual {p1}, Lp5/a0;->e()[B

    move-result-object p1

    aget-byte v0, v0, v1

    aput-byte v0, p1, v6

    const/4 p1, 0x2

    iput p1, p0, Lh4/t;->g:I

    iput v6, p0, Lh4/t;->f:I

    return-void

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p1, v2}, Lp5/a0;->T(I)V

    return-void
.end method

.method public c()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lh4/t;->f:I

    iput v0, p0, Lh4/t;->g:I

    iput-boolean v0, p0, Lh4/t;->i:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lh4/t;->l:J

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(Lx3/m;Lh4/i0$d;)V
    .locals 1

    invoke-virtual {p2}, Lh4/i0$d;->a()V

    invoke-virtual {p2}, Lh4/i0$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lh4/t;->e:Ljava/lang/String;

    invoke-virtual {p2}, Lh4/i0$d;->c()I

    move-result p2

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lx3/m;->e(II)Lx3/b0;

    move-result-object p1

    iput-object p1, p0, Lh4/t;->d:Lx3/b0;

    return-void
.end method

.method public f(JI)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p1, v0

    if-eqz p3, :cond_0

    iput-wide p1, p0, Lh4/t;->l:J

    :cond_0
    return-void
.end method

.method public final g(Lp5/a0;)V
    .locals 7

    invoke-virtual {p1}, Lp5/a0;->a()I

    move-result v0

    iget v1, p0, Lh4/t;->k:I

    iget v2, p0, Lh4/t;->g:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lh4/t;->d:Lx3/b0;

    invoke-interface {v1, p1, v0}, Lx3/b0;->e(Lp5/a0;I)V

    iget p1, p0, Lh4/t;->g:I

    add-int/2addr p1, v0

    iput p1, p0, Lh4/t;->g:I

    iget v4, p0, Lh4/t;->k:I

    if-ge p1, v4, :cond_0

    return-void

    :cond_0
    iget-wide v1, p0, Lh4/t;->l:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v1, v5

    if-eqz p1, :cond_1

    iget-object v0, p0, Lh4/t;->d:Lx3/b0;

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-interface/range {v0 .. v6}, Lx3/b0;->a(JIIILx3/b0$a;)V

    iget-wide v0, p0, Lh4/t;->l:J

    iget-wide v2, p0, Lh4/t;->j:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lh4/t;->l:J

    :cond_1
    const/4 p1, 0x0

    iput p1, p0, Lh4/t;->g:I

    iput p1, p0, Lh4/t;->f:I

    return-void
.end method

.method public final h(Lp5/a0;)V
    .locals 7

    invoke-virtual {p1}, Lp5/a0;->a()I

    move-result v0

    iget v1, p0, Lh4/t;->g:I

    const/4 v2, 0x4

    rsub-int/lit8 v1, v1, 0x4

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lh4/t;->a:Lp5/a0;

    invoke-virtual {v1}, Lp5/a0;->e()[B

    move-result-object v1

    iget v3, p0, Lh4/t;->g:I

    invoke-virtual {p1, v1, v3, v0}, Lp5/a0;->l([BII)V

    iget p1, p0, Lh4/t;->g:I

    add-int/2addr p1, v0

    iput p1, p0, Lh4/t;->g:I

    if-ge p1, v2, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lh4/t;->a:Lp5/a0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lp5/a0;->T(I)V

    iget-object p1, p0, Lh4/t;->b:Lu3/f0$a;

    iget-object v1, p0, Lh4/t;->a:Lp5/a0;

    invoke-virtual {v1}, Lp5/a0;->p()I

    move-result v1

    invoke-virtual {p1, v1}, Lu3/f0$a;->a(I)Z

    move-result p1

    const/4 v1, 0x1

    if-nez p1, :cond_1

    iput v0, p0, Lh4/t;->g:I

    iput v1, p0, Lh4/t;->f:I

    return-void

    :cond_1
    iget-object p1, p0, Lh4/t;->b:Lu3/f0$a;

    iget v3, p1, Lu3/f0$a;->c:I

    iput v3, p0, Lh4/t;->k:I

    iget-boolean v3, p0, Lh4/t;->h:Z

    if-nez v3, :cond_2

    const-wide/32 v3, 0xf4240

    iget v5, p1, Lu3/f0$a;->g:I

    int-to-long v5, v5

    mul-long/2addr v5, v3

    iget p1, p1, Lu3/f0$a;->d:I

    int-to-long v3, p1

    div-long/2addr v5, v3

    iput-wide v5, p0, Lh4/t;->j:J

    new-instance p1, Ls3/m1$b;

    invoke-direct {p1}, Ls3/m1$b;-><init>()V

    iget-object v3, p0, Lh4/t;->e:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ls3/m1$b;->U(Ljava/lang/String;)Ls3/m1$b;

    move-result-object p1

    iget-object v3, p0, Lh4/t;->b:Lu3/f0$a;

    iget-object v3, v3, Lu3/f0$a;->b:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object p1

    const/16 v3, 0x1000

    invoke-virtual {p1, v3}, Ls3/m1$b;->Y(I)Ls3/m1$b;

    move-result-object p1

    iget-object v3, p0, Lh4/t;->b:Lu3/f0$a;

    iget v3, v3, Lu3/f0$a;->e:I

    invoke-virtual {p1, v3}, Ls3/m1$b;->J(I)Ls3/m1$b;

    move-result-object p1

    iget-object v3, p0, Lh4/t;->b:Lu3/f0$a;

    iget v3, v3, Lu3/f0$a;->d:I

    invoke-virtual {p1, v3}, Ls3/m1$b;->h0(I)Ls3/m1$b;

    move-result-object p1

    iget-object v3, p0, Lh4/t;->c:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ls3/m1$b;->X(Ljava/lang/String;)Ls3/m1$b;

    move-result-object p1

    invoke-virtual {p1}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object p1

    iget-object v3, p0, Lh4/t;->d:Lx3/b0;

    invoke-interface {v3, p1}, Lx3/b0;->b(Ls3/m1;)V

    iput-boolean v1, p0, Lh4/t;->h:Z

    :cond_2
    iget-object p1, p0, Lh4/t;->a:Lp5/a0;

    invoke-virtual {p1, v0}, Lp5/a0;->T(I)V

    iget-object p1, p0, Lh4/t;->d:Lx3/b0;

    iget-object v0, p0, Lh4/t;->a:Lp5/a0;

    invoke-interface {p1, v0, v2}, Lx3/b0;->e(Lp5/a0;I)V

    const/4 p1, 0x2

    iput p1, p0, Lh4/t;->f:I

    return-void
.end method
