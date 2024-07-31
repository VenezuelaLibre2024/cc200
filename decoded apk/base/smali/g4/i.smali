.class public abstract Lg4/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg4/i$c;,
        Lg4/i$b;
    }
.end annotation


# instance fields
.field public final a:Lg4/e;

.field public b:Lx3/b0;

.field public c:Lx3/m;

.field public d:Lg4/g;

.field public e:J

.field public f:J

.field public g:J

.field public h:I

.field public i:I

.field public j:Lg4/i$b;

.field public k:J

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lg4/e;

    invoke-direct {v0}, Lg4/e;-><init>()V

    iput-object v0, p0, Lg4/i;->a:Lg4/e;

    new-instance v0, Lg4/i$b;

    invoke-direct {v0}, Lg4/i$b;-><init>()V

    iput-object v0, p0, Lg4/i;->j:Lg4/i$b;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lg4/i;->b:Lx3/b0;

    invoke-static {v0}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lg4/i;->c:Lx3/m;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b(J)J
    .locals 2

    const-wide/32 v0, 0xf4240

    mul-long/2addr p1, v0

    iget v0, p0, Lg4/i;->i:I

    int-to-long v0, v0

    div-long/2addr p1, v0

    return-wide p1
.end method

.method public c(J)J
    .locals 2

    iget v0, p0, Lg4/i;->i:I

    int-to-long v0, v0

    mul-long/2addr v0, p1

    const-wide/32 p1, 0xf4240

    div-long/2addr v0, p1

    return-wide v0
.end method

.method public d(Lx3/m;Lx3/b0;)V
    .locals 0

    iput-object p1, p0, Lg4/i;->c:Lx3/m;

    iput-object p2, p0, Lg4/i;->b:Lx3/b0;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lg4/i;->l(Z)V

    return-void
.end method

.method public e(J)V
    .locals 0

    iput-wide p1, p0, Lg4/i;->g:J

    return-void
.end method

.method public abstract f(Lp5/a0;)J
.end method

.method public final g(Lx3/l;Lx3/y;)I
    .locals 3

    invoke-virtual {p0}, Lg4/i;->a()V

    iget v0, p0, Lg4/i;->h:I

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v1, :cond_2

    if-eq v0, v2, :cond_1

    const/4 p1, 0x3

    if-ne v0, p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    iget-object v0, p0, Lg4/i;->d:Lg4/g;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1, p2}, Lg4/i;->k(Lx3/l;Lx3/y;)I

    move-result p1

    return p1

    :cond_2
    iget-wide v0, p0, Lg4/i;->f:J

    long-to-int p2, v0

    invoke-interface {p1, p2}, Lx3/l;->m(I)V

    iput v2, p0, Lg4/i;->h:I

    const/4 p1, 0x0

    return p1

    :cond_3
    invoke-virtual {p0, p1}, Lg4/i;->j(Lx3/l;)I

    move-result p1

    return p1
.end method

.method public abstract h(Lp5/a0;JLg4/i$b;)Z
.end method

.method public final i(Lx3/l;)Z
    .locals 4

    :goto_0
    iget-object v0, p0, Lg4/i;->a:Lg4/e;

    invoke-virtual {v0, p1}, Lg4/e;->d(Lx3/l;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x3

    iput p1, p0, Lg4/i;->h:I

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v0

    iget-wide v2, p0, Lg4/i;->f:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lg4/i;->k:J

    iget-object v0, p0, Lg4/i;->a:Lg4/e;

    invoke-virtual {v0}, Lg4/e;->c()Lp5/a0;

    move-result-object v0

    iget-wide v1, p0, Lg4/i;->f:J

    iget-object v3, p0, Lg4/i;->j:Lg4/i$b;

    invoke-virtual {p0, v0, v1, v2, v3}, Lg4/i;->h(Lp5/a0;JLg4/i$b;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v0

    iput-wide v0, p0, Lg4/i;->f:J

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final j(Lx3/l;)I
    .locals 13

    invoke-virtual {p0, p1}, Lg4/i;->i(Lx3/l;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget-object v0, p0, Lg4/i;->j:Lg4/i$b;

    iget-object v0, v0, Lg4/i$b;->a:Ls3/m1;

    iget v1, v0, Ls3/m1;->G:I

    iput v1, p0, Lg4/i;->i:I

    iget-boolean v1, p0, Lg4/i;->m:Z

    const/4 v2, 0x1

    if-nez v1, :cond_1

    iget-object v1, p0, Lg4/i;->b:Lx3/b0;

    invoke-interface {v1, v0}, Lx3/b0;->b(Ls3/m1;)V

    iput-boolean v2, p0, Lg4/i;->m:Z

    :cond_1
    iget-object v0, p0, Lg4/i;->j:Lg4/i$b;

    iget-object v0, v0, Lg4/i$b;->b:Lg4/g;

    const/4 v11, 0x0

    if-eqz v0, :cond_2

    :goto_0
    iput-object v0, p0, Lg4/i;->d:Lg4/g;

    goto :goto_2

    :cond_2
    invoke-interface {p1}, Lx3/l;->b()J

    move-result-wide v0

    const-wide/16 v3, -0x1

    cmp-long v0, v0, v3

    if-nez v0, :cond_3

    new-instance v0, Lg4/i$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg4/i$c;-><init>(Lg4/i$a;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lg4/i;->a:Lg4/e;

    invoke-virtual {v0}, Lg4/e;->b()Lg4/f;

    move-result-object v0

    iget v1, v0, Lg4/f;->b:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_4

    move v10, v2

    goto :goto_1

    :cond_4
    move v10, v11

    :goto_1
    new-instance v12, Lg4/a;

    iget-wide v2, p0, Lg4/i;->f:J

    invoke-interface {p1}, Lx3/l;->b()J

    move-result-wide v4

    iget v1, v0, Lg4/f;->h:I

    iget v6, v0, Lg4/f;->i:I

    add-int/2addr v1, v6

    int-to-long v6, v1

    iget-wide v8, v0, Lg4/f;->c:J

    move-object v0, v12

    move-object v1, p0

    invoke-direct/range {v0 .. v10}, Lg4/a;-><init>(Lg4/i;JJJJZ)V

    iput-object v12, p0, Lg4/i;->d:Lg4/g;

    :goto_2
    const/4 v0, 0x2

    iput v0, p0, Lg4/i;->h:I

    iget-object v0, p0, Lg4/i;->a:Lg4/e;

    invoke-virtual {v0}, Lg4/e;->f()V

    return v11
.end method

.method public final k(Lx3/l;Lx3/y;)I
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lg4/i;->d:Lg4/g;

    invoke-interface {v2, v1}, Lg4/g;->a(Lx3/l;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    const/4 v7, 0x1

    if-ltz v6, :cond_0

    move-object/from16 v6, p2

    iput-wide v2, v6, Lx3/y;->a:J

    return v7

    :cond_0
    const-wide/16 v8, -0x1

    cmp-long v6, v2, v8

    if-gez v6, :cond_1

    const-wide/16 v10, 0x2

    add-long/2addr v2, v10

    neg-long v2, v2

    invoke-virtual {v0, v2, v3}, Lg4/i;->e(J)V

    :cond_1
    iget-boolean v2, v0, Lg4/i;->l:Z

    if-nez v2, :cond_2

    iget-object v2, v0, Lg4/i;->d:Lg4/g;

    invoke-interface {v2}, Lg4/g;->b()Lx3/z;

    move-result-object v2

    invoke-static {v2}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx3/z;

    iget-object v3, v0, Lg4/i;->c:Lx3/m;

    invoke-interface {v3, v2}, Lx3/m;->j(Lx3/z;)V

    iput-boolean v7, v0, Lg4/i;->l:Z

    :cond_2
    iget-wide v2, v0, Lg4/i;->k:J

    cmp-long v2, v2, v4

    if-gtz v2, :cond_4

    iget-object v2, v0, Lg4/i;->a:Lg4/e;

    invoke-virtual {v2, v1}, Lg4/e;->d(Lx3/l;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x3

    iput v1, v0, Lg4/i;->h:I

    const/4 v1, -0x1

    return v1

    :cond_4
    :goto_0
    iput-wide v4, v0, Lg4/i;->k:J

    iget-object v1, v0, Lg4/i;->a:Lg4/e;

    invoke-virtual {v1}, Lg4/e;->c()Lp5/a0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg4/i;->f(Lp5/a0;)J

    move-result-wide v2

    cmp-long v4, v2, v4

    if-ltz v4, :cond_5

    iget-wide v4, v0, Lg4/i;->g:J

    add-long v6, v4, v2

    iget-wide v10, v0, Lg4/i;->e:J

    cmp-long v6, v6, v10

    if-ltz v6, :cond_5

    invoke-virtual {v0, v4, v5}, Lg4/i;->b(J)J

    move-result-wide v11

    iget-object v4, v0, Lg4/i;->b:Lx3/b0;

    invoke-virtual {v1}, Lp5/a0;->g()I

    move-result v5

    invoke-interface {v4, v1, v5}, Lx3/b0;->e(Lp5/a0;I)V

    iget-object v10, v0, Lg4/i;->b:Lx3/b0;

    const/4 v13, 0x1

    invoke-virtual {v1}, Lp5/a0;->g()I

    move-result v14

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-interface/range {v10 .. v16}, Lx3/b0;->a(JIIILx3/b0$a;)V

    iput-wide v8, v0, Lg4/i;->e:J

    :cond_5
    iget-wide v4, v0, Lg4/i;->g:J

    add-long/2addr v4, v2

    iput-wide v4, v0, Lg4/i;->g:J

    const/4 v1, 0x0

    return v1
.end method

.method public l(Z)V
    .locals 4

    const-wide/16 v0, 0x0

    if-eqz p1, :cond_0

    new-instance p1, Lg4/i$b;

    invoke-direct {p1}, Lg4/i$b;-><init>()V

    iput-object p1, p0, Lg4/i;->j:Lg4/i$b;

    iput-wide v0, p0, Lg4/i;->f:J

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    iput p1, p0, Lg4/i;->h:I

    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lg4/i;->e:J

    iput-wide v0, p0, Lg4/i;->g:J

    return-void
.end method

.method public final m(JJ)V
    .locals 2

    iget-object v0, p0, Lg4/i;->a:Lg4/e;

    invoke-virtual {v0}, Lg4/e;->e()V

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lg4/i;->l:Z

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lg4/i;->l(Z)V

    goto :goto_0

    :cond_0
    iget p1, p0, Lg4/i;->h:I

    if-eqz p1, :cond_1

    invoke-virtual {p0, p3, p4}, Lg4/i;->c(J)J

    move-result-wide p1

    iput-wide p1, p0, Lg4/i;->e:J

    iget-object p1, p0, Lg4/i;->d:Lg4/g;

    invoke-static {p1}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg4/g;

    iget-wide p2, p0, Lg4/i;->e:J

    invoke-interface {p1, p2, p3}, Lg4/g;->c(J)V

    const/4 p1, 0x2

    iput p1, p0, Lg4/i;->h:I

    :cond_1
    :goto_0
    return-void
.end method
