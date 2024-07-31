.class public final Lh4/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh4/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh4/p$b;
    }
.end annotation


# instance fields
.field public final a:Lh4/d0;

.field public final b:Z

.field public final c:Z

.field public final d:Lh4/u;

.field public final e:Lh4/u;

.field public final f:Lh4/u;

.field public g:J

.field public final h:[Z

.field public i:Ljava/lang/String;

.field public j:Lx3/b0;

.field public k:Lh4/p$b;

.field public l:Z

.field public m:J

.field public n:Z

.field public final o:Lp5/a0;


# direct methods
.method public constructor <init>(Lh4/d0;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/p;->a:Lh4/d0;

    iput-boolean p2, p0, Lh4/p;->b:Z

    iput-boolean p3, p0, Lh4/p;->c:Z

    const/4 p1, 0x3

    new-array p1, p1, [Z

    iput-object p1, p0, Lh4/p;->h:[Z

    new-instance p1, Lh4/u;

    const/4 p2, 0x7

    const/16 p3, 0x80

    invoke-direct {p1, p2, p3}, Lh4/u;-><init>(II)V

    iput-object p1, p0, Lh4/p;->d:Lh4/u;

    new-instance p1, Lh4/u;

    const/16 p2, 0x8

    invoke-direct {p1, p2, p3}, Lh4/u;-><init>(II)V

    iput-object p1, p0, Lh4/p;->e:Lh4/u;

    new-instance p1, Lh4/u;

    const/4 p2, 0x6

    invoke-direct {p1, p2, p3}, Lh4/u;-><init>(II)V

    iput-object p1, p0, Lh4/p;->f:Lh4/u;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lh4/p;->m:J

    new-instance p1, Lp5/a0;

    invoke-direct {p1}, Lp5/a0;-><init>()V

    iput-object p1, p0, Lh4/p;->o:Lp5/a0;

    return-void
.end method


# virtual methods
.method public a(Lp5/a0;)V
    .locals 14

    invoke-virtual {p0}, Lh4/p;->b()V

    invoke-virtual {p1}, Lp5/a0;->f()I

    move-result v0

    invoke-virtual {p1}, Lp5/a0;->g()I

    move-result v1

    invoke-virtual {p1}, Lp5/a0;->e()[B

    move-result-object v2

    iget-wide v3, p0, Lh4/p;->g:J

    invoke-virtual {p1}, Lp5/a0;->a()I

    move-result v5

    int-to-long v5, v5

    add-long/2addr v3, v5

    iput-wide v3, p0, Lh4/p;->g:J

    iget-object v3, p0, Lh4/p;->j:Lx3/b0;

    invoke-virtual {p1}, Lp5/a0;->a()I

    move-result v4

    invoke-interface {v3, p1, v4}, Lx3/b0;->e(Lp5/a0;I)V

    :goto_0
    iget-object p1, p0, Lh4/p;->h:[Z

    invoke-static {v2, v0, v1, p1}, Lp5/w;->c([BII[Z)I

    move-result p1

    if-ne p1, v1, :cond_0

    invoke-virtual {p0, v2, v0, v1}, Lh4/p;->h([BII)V

    return-void

    :cond_0
    invoke-static {v2, p1}, Lp5/w;->f([BI)I

    move-result v6

    sub-int v3, p1, v0

    if-lez v3, :cond_1

    invoke-virtual {p0, v2, v0, p1}, Lh4/p;->h([BII)V

    :cond_1
    sub-int v10, v1, p1

    iget-wide v4, p0, Lh4/p;->g:J

    int-to-long v7, v10

    sub-long/2addr v4, v7

    if-gez v3, :cond_2

    neg-int v0, v3

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    move v11, v0

    iget-wide v12, p0, Lh4/p;->m:J

    move-object v7, p0

    move-wide v8, v4

    invoke-virtual/range {v7 .. v13}, Lh4/p;->g(JIIJ)V

    iget-wide v7, p0, Lh4/p;->m:J

    move-object v3, p0

    invoke-virtual/range {v3 .. v8}, Lh4/p;->i(JIJ)V

    add-int/lit8 v0, p1, 0x3

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lh4/p;->j:Lx3/b0;

    invoke-static {v0}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lh4/p;->k:Lh4/p$b;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public c()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lh4/p;->g:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lh4/p;->n:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lh4/p;->m:J

    iget-object v0, p0, Lh4/p;->h:[Z

    invoke-static {v0}, Lp5/w;->a([Z)V

    iget-object v0, p0, Lh4/p;->d:Lh4/u;

    invoke-virtual {v0}, Lh4/u;->d()V

    iget-object v0, p0, Lh4/p;->e:Lh4/u;

    invoke-virtual {v0}, Lh4/u;->d()V

    iget-object v0, p0, Lh4/p;->f:Lh4/u;

    invoke-virtual {v0}, Lh4/u;->d()V

    iget-object v0, p0, Lh4/p;->k:Lh4/p$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh4/p$b;->g()V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(Lx3/m;Lh4/i0$d;)V
    .locals 4

    invoke-virtual {p2}, Lh4/i0$d;->a()V

    invoke-virtual {p2}, Lh4/i0$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lh4/p;->i:Ljava/lang/String;

    invoke-virtual {p2}, Lh4/i0$d;->c()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lx3/m;->e(II)Lx3/b0;

    move-result-object v0

    iput-object v0, p0, Lh4/p;->j:Lx3/b0;

    new-instance v1, Lh4/p$b;

    iget-boolean v2, p0, Lh4/p;->b:Z

    iget-boolean v3, p0, Lh4/p;->c:Z

    invoke-direct {v1, v0, v2, v3}, Lh4/p$b;-><init>(Lx3/b0;ZZ)V

    iput-object v1, p0, Lh4/p;->k:Lh4/p$b;

    iget-object v0, p0, Lh4/p;->a:Lh4/d0;

    invoke-virtual {v0, p1, p2}, Lh4/d0;->b(Lx3/m;Lh4/i0$d;)V

    return-void
.end method

.method public f(JI)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lh4/p;->m:J

    :cond_0
    iget-boolean p1, p0, Lh4/p;->n:Z

    and-int/lit8 p2, p3, 0x2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    or-int/2addr p1, p2

    iput-boolean p1, p0, Lh4/p;->n:Z

    return-void
.end method

.method public final g(JIIJ)V
    .locals 7

    iget-boolean v0, p0, Lh4/p;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh4/p;->k:Lh4/p$b;

    invoke-virtual {v0}, Lh4/p$b;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    iget-object v0, p0, Lh4/p;->d:Lh4/u;

    invoke-virtual {v0, p4}, Lh4/u;->b(I)Z

    iget-object v0, p0, Lh4/p;->e:Lh4/u;

    invoke-virtual {v0, p4}, Lh4/u;->b(I)Z

    iget-boolean v0, p0, Lh4/p;->l:Z

    const/4 v1, 0x3

    if-nez v0, :cond_1

    iget-object v0, p0, Lh4/p;->d:Lh4/u;

    invoke-virtual {v0}, Lh4/u;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lh4/p;->e:Lh4/u;

    invoke-virtual {v0}, Lh4/u;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lh4/p;->d:Lh4/u;

    iget-object v3, v2, Lh4/u;->d:[B

    iget v2, v2, Lh4/u;->e:I

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lh4/p;->e:Lh4/u;

    iget-object v3, v2, Lh4/u;->d:[B

    iget v2, v2, Lh4/u;->e:I

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lh4/p;->d:Lh4/u;

    iget-object v3, v2, Lh4/u;->d:[B

    iget v2, v2, Lh4/u;->e:I

    invoke-static {v3, v1, v2}, Lp5/w;->l([BII)Lp5/w$c;

    move-result-object v2

    iget-object v3, p0, Lh4/p;->e:Lh4/u;

    iget-object v4, v3, Lh4/u;->d:[B

    iget v3, v3, Lh4/u;->e:I

    invoke-static {v4, v1, v3}, Lp5/w;->j([BII)Lp5/w$b;

    move-result-object v1

    iget v3, v2, Lp5/w$c;->a:I

    iget v4, v2, Lp5/w$c;->b:I

    iget v5, v2, Lp5/w$c;->c:I

    invoke-static {v3, v4, v5}, Lp5/e;->a(III)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lh4/p;->j:Lx3/b0;

    new-instance v5, Ls3/m1$b;

    invoke-direct {v5}, Ls3/m1$b;-><init>()V

    iget-object v6, p0, Lh4/p;->i:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ls3/m1$b;->U(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v5

    const-string v6, "video/avc"

    invoke-virtual {v5, v6}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v5

    invoke-virtual {v5, v3}, Ls3/m1$b;->K(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v3

    iget v5, v2, Lp5/w$c;->f:I

    invoke-virtual {v3, v5}, Ls3/m1$b;->n0(I)Ls3/m1$b;

    move-result-object v3

    iget v5, v2, Lp5/w$c;->g:I

    invoke-virtual {v3, v5}, Ls3/m1$b;->S(I)Ls3/m1$b;

    move-result-object v3

    iget v5, v2, Lp5/w$c;->h:F

    invoke-virtual {v3, v5}, Ls3/m1$b;->c0(F)Ls3/m1$b;

    move-result-object v3

    invoke-virtual {v3, v0}, Ls3/m1$b;->V(Ljava/util/List;)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v0

    invoke-interface {v4, v0}, Lx3/b0;->b(Ls3/m1;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh4/p;->l:Z

    iget-object v0, p0, Lh4/p;->k:Lh4/p$b;

    invoke-virtual {v0, v2}, Lh4/p$b;->f(Lp5/w$c;)V

    iget-object v0, p0, Lh4/p;->k:Lh4/p$b;

    invoke-virtual {v0, v1}, Lh4/p$b;->e(Lp5/w$b;)V

    iget-object v0, p0, Lh4/p;->d:Lh4/u;

    invoke-virtual {v0}, Lh4/u;->d()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lh4/p;->d:Lh4/u;

    invoke-virtual {v0}, Lh4/u;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lh4/p;->d:Lh4/u;

    iget-object v2, v0, Lh4/u;->d:[B

    iget v0, v0, Lh4/u;->e:I

    invoke-static {v2, v1, v0}, Lp5/w;->l([BII)Lp5/w$c;

    move-result-object v0

    iget-object v1, p0, Lh4/p;->k:Lh4/p$b;

    invoke-virtual {v1, v0}, Lh4/p$b;->f(Lp5/w$c;)V

    iget-object v0, p0, Lh4/p;->d:Lh4/u;

    :goto_0
    invoke-virtual {v0}, Lh4/u;->d()V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lh4/p;->e:Lh4/u;

    invoke-virtual {v0}, Lh4/u;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lh4/p;->e:Lh4/u;

    iget-object v2, v0, Lh4/u;->d:[B

    iget v0, v0, Lh4/u;->e:I

    invoke-static {v2, v1, v0}, Lp5/w;->j([BII)Lp5/w$b;

    move-result-object v0

    iget-object v1, p0, Lh4/p;->k:Lh4/p$b;

    invoke-virtual {v1, v0}, Lh4/p$b;->e(Lp5/w$b;)V

    :goto_1
    iget-object v0, p0, Lh4/p;->e:Lh4/u;

    goto :goto_0

    :cond_3
    :goto_2
    iget-object v0, p0, Lh4/p;->f:Lh4/u;

    invoke-virtual {v0, p4}, Lh4/u;->b(I)Z

    move-result p4

    if-eqz p4, :cond_4

    iget-object p4, p0, Lh4/p;->f:Lh4/u;

    iget-object v0, p4, Lh4/u;->d:[B

    iget p4, p4, Lh4/u;->e:I

    invoke-static {v0, p4}, Lp5/w;->q([BI)I

    move-result p4

    iget-object v0, p0, Lh4/p;->o:Lp5/a0;

    iget-object v1, p0, Lh4/p;->f:Lh4/u;

    iget-object v1, v1, Lh4/u;->d:[B

    invoke-virtual {v0, v1, p4}, Lp5/a0;->R([BI)V

    iget-object p4, p0, Lh4/p;->o:Lp5/a0;

    const/4 v0, 0x4

    invoke-virtual {p4, v0}, Lp5/a0;->T(I)V

    iget-object p4, p0, Lh4/p;->a:Lh4/d0;

    iget-object v0, p0, Lh4/p;->o:Lp5/a0;

    invoke-virtual {p4, p5, p6, v0}, Lh4/d0;->a(JLp5/a0;)V

    :cond_4
    iget-object v1, p0, Lh4/p;->k:Lh4/p$b;

    iget-boolean v5, p0, Lh4/p;->l:Z

    iget-boolean v6, p0, Lh4/p;->n:Z

    move-wide v2, p1

    move v4, p3

    invoke-virtual/range {v1 .. v6}, Lh4/p$b;->b(JIZZ)Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x0

    iput-boolean p1, p0, Lh4/p;->n:Z

    :cond_5
    return-void
.end method

.method public final h([BII)V
    .locals 1

    iget-boolean v0, p0, Lh4/p;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh4/p;->k:Lh4/p$b;

    invoke-virtual {v0}, Lh4/p$b;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lh4/p;->d:Lh4/u;

    invoke-virtual {v0, p1, p2, p3}, Lh4/u;->a([BII)V

    iget-object v0, p0, Lh4/p;->e:Lh4/u;

    invoke-virtual {v0, p1, p2, p3}, Lh4/u;->a([BII)V

    :cond_1
    iget-object v0, p0, Lh4/p;->f:Lh4/u;

    invoke-virtual {v0, p1, p2, p3}, Lh4/u;->a([BII)V

    iget-object v0, p0, Lh4/p;->k:Lh4/p$b;

    invoke-virtual {v0, p1, p2, p3}, Lh4/p$b;->a([BII)V

    return-void
.end method

.method public final i(JIJ)V
    .locals 7

    iget-boolean v0, p0, Lh4/p;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh4/p;->k:Lh4/p$b;

    invoke-virtual {v0}, Lh4/p$b;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lh4/p;->d:Lh4/u;

    invoke-virtual {v0, p3}, Lh4/u;->e(I)V

    iget-object v0, p0, Lh4/p;->e:Lh4/u;

    invoke-virtual {v0, p3}, Lh4/u;->e(I)V

    :cond_1
    iget-object v0, p0, Lh4/p;->f:Lh4/u;

    invoke-virtual {v0, p3}, Lh4/u;->e(I)V

    iget-object v1, p0, Lh4/p;->k:Lh4/p$b;

    move-wide v2, p1

    move v4, p3

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lh4/p$b;->h(JIJ)V

    return-void
.end method
