.class public final Lh4/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh4/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh4/q$a;
    }
.end annotation


# instance fields
.field public final a:Lh4/d0;

.field public b:Ljava/lang/String;

.field public c:Lx3/b0;

.field public d:Lh4/q$a;

.field public e:Z

.field public final f:[Z

.field public final g:Lh4/u;

.field public final h:Lh4/u;

.field public final i:Lh4/u;

.field public final j:Lh4/u;

.field public final k:Lh4/u;

.field public l:J

.field public m:J

.field public final n:Lp5/a0;


# direct methods
.method public constructor <init>(Lh4/d0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/q;->a:Lh4/d0;

    const/4 p1, 0x3

    new-array p1, p1, [Z

    iput-object p1, p0, Lh4/q;->f:[Z

    new-instance p1, Lh4/u;

    const/16 v0, 0x20

    const/16 v1, 0x80

    invoke-direct {p1, v0, v1}, Lh4/u;-><init>(II)V

    iput-object p1, p0, Lh4/q;->g:Lh4/u;

    new-instance p1, Lh4/u;

    const/16 v0, 0x21

    invoke-direct {p1, v0, v1}, Lh4/u;-><init>(II)V

    iput-object p1, p0, Lh4/q;->h:Lh4/u;

    new-instance p1, Lh4/u;

    const/16 v0, 0x22

    invoke-direct {p1, v0, v1}, Lh4/u;-><init>(II)V

    iput-object p1, p0, Lh4/q;->i:Lh4/u;

    new-instance p1, Lh4/u;

    const/16 v0, 0x27

    invoke-direct {p1, v0, v1}, Lh4/u;-><init>(II)V

    iput-object p1, p0, Lh4/q;->j:Lh4/u;

    new-instance p1, Lh4/u;

    const/16 v0, 0x28

    invoke-direct {p1, v0, v1}, Lh4/u;-><init>(II)V

    iput-object p1, p0, Lh4/q;->k:Lh4/u;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lh4/q;->m:J

    new-instance p1, Lp5/a0;

    invoke-direct {p1}, Lp5/a0;-><init>()V

    iput-object p1, p0, Lh4/q;->n:Lp5/a0;

    return-void
.end method

.method public static i(Ljava/lang/String;Lh4/u;Lh4/u;Lh4/u;)Ls3/m1;
    .locals 8

    iget v0, p1, Lh4/u;->e:I

    iget v1, p2, Lh4/u;->e:I

    add-int/2addr v1, v0

    iget v2, p3, Lh4/u;->e:I

    add-int/2addr v1, v2

    new-array v1, v1, [B

    iget-object v2, p1, Lh4/u;->d:[B

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p2, Lh4/u;->d:[B

    iget v2, p1, Lh4/u;->e:I

    iget v4, p2, Lh4/u;->e:I

    invoke-static {v0, v3, v1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p3, Lh4/u;->d:[B

    iget p1, p1, Lh4/u;->e:I

    iget v2, p2, Lh4/u;->e:I

    add-int/2addr p1, v2

    iget p3, p3, Lh4/u;->e:I

    invoke-static {v0, v3, v1, p1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p2, Lh4/u;->d:[B

    iget p2, p2, Lh4/u;->e:I

    const/4 p3, 0x3

    invoke-static {p1, p3, p2}, Lp5/w;->h([BII)Lp5/w$a;

    move-result-object p1

    iget v2, p1, Lp5/w$a;->a:I

    iget-boolean v3, p1, Lp5/w$a;->b:Z

    iget v4, p1, Lp5/w$a;->c:I

    iget v5, p1, Lp5/w$a;->d:I

    iget-object v6, p1, Lp5/w$a;->e:[I

    iget v7, p1, Lp5/w$a;->f:I

    invoke-static/range {v2 .. v7}, Lp5/e;->c(IZII[II)Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ls3/m1$b;

    invoke-direct {p3}, Ls3/m1$b;-><init>()V

    invoke-virtual {p3, p0}, Ls3/m1$b;->U(Ljava/lang/String;)Ls3/m1$b;

    move-result-object p0

    const-string p3, "video/hevc"

    invoke-virtual {p0, p3}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object p0

    invoke-virtual {p0, p2}, Ls3/m1$b;->K(Ljava/lang/String;)Ls3/m1$b;

    move-result-object p0

    iget p2, p1, Lp5/w$a;->h:I

    invoke-virtual {p0, p2}, Ls3/m1$b;->n0(I)Ls3/m1$b;

    move-result-object p0

    iget p2, p1, Lp5/w$a;->i:I

    invoke-virtual {p0, p2}, Ls3/m1$b;->S(I)Ls3/m1$b;

    move-result-object p0

    iget p1, p1, Lp5/w$a;->j:F

    invoke-virtual {p0, p1}, Ls3/m1$b;->c0(F)Ls3/m1$b;

    move-result-object p0

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Ls3/m1$b;->V(Ljava/util/List;)Ls3/m1$b;

    move-result-object p0

    invoke-virtual {p0}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lp5/a0;)V
    .locals 16

    move-object/from16 v7, p0

    invoke-virtual/range {p0 .. p0}, Lh4/q;->b()V

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lp5/a0;->a()I

    move-result v0

    if-lez v0, :cond_4

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->f()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->g()I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->e()[B

    move-result-object v9

    iget-wide v1, v7, Lh4/q;->l:J

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->a()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    iput-wide v1, v7, Lh4/q;->l:J

    iget-object v1, v7, Lh4/q;->c:Lx3/b0;

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->a()I

    move-result v2

    move-object/from16 v10, p1

    invoke-interface {v1, v10, v2}, Lx3/b0;->e(Lp5/a0;I)V

    :goto_0
    if-ge v0, v8, :cond_0

    iget-object v1, v7, Lh4/q;->f:[Z

    invoke-static {v9, v0, v8, v1}, Lp5/w;->c([BII[Z)I

    move-result v11

    if-ne v11, v8, :cond_1

    invoke-virtual {v7, v9, v0, v8}, Lh4/q;->h([BII)V

    return-void

    :cond_1
    invoke-static {v9, v11}, Lp5/w;->e([BI)I

    move-result v12

    sub-int v1, v11, v0

    if-lez v1, :cond_2

    invoke-virtual {v7, v9, v0, v11}, Lh4/q;->h([BII)V

    :cond_2
    sub-int v13, v8, v11

    iget-wide v2, v7, Lh4/q;->l:J

    int-to-long v4, v13

    sub-long v14, v2, v4

    if-gez v1, :cond_3

    neg-int v0, v1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    move v4, v0

    iget-wide v5, v7, Lh4/q;->m:J

    move-object/from16 v0, p0

    move-wide v1, v14

    move v3, v13

    invoke-virtual/range {v0 .. v6}, Lh4/q;->g(JIIJ)V

    iget-wide v5, v7, Lh4/q;->m:J

    move v4, v12

    invoke-virtual/range {v0 .. v6}, Lh4/q;->j(JIIJ)V

    add-int/lit8 v0, v11, 0x3

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lh4/q;->c:Lx3/b0;

    invoke-static {v0}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lh4/q;->d:Lh4/q$a;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public c()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lh4/q;->l:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lh4/q;->m:J

    iget-object v0, p0, Lh4/q;->f:[Z

    invoke-static {v0}, Lp5/w;->a([Z)V

    iget-object v0, p0, Lh4/q;->g:Lh4/u;

    invoke-virtual {v0}, Lh4/u;->d()V

    iget-object v0, p0, Lh4/q;->h:Lh4/u;

    invoke-virtual {v0}, Lh4/u;->d()V

    iget-object v0, p0, Lh4/q;->i:Lh4/u;

    invoke-virtual {v0}, Lh4/u;->d()V

    iget-object v0, p0, Lh4/q;->j:Lh4/u;

    invoke-virtual {v0}, Lh4/u;->d()V

    iget-object v0, p0, Lh4/q;->k:Lh4/u;

    invoke-virtual {v0}, Lh4/u;->d()V

    iget-object v0, p0, Lh4/q;->d:Lh4/q$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh4/q$a;->f()V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(Lx3/m;Lh4/i0$d;)V
    .locals 2

    invoke-virtual {p2}, Lh4/i0$d;->a()V

    invoke-virtual {p2}, Lh4/i0$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lh4/q;->b:Ljava/lang/String;

    invoke-virtual {p2}, Lh4/i0$d;->c()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lx3/m;->e(II)Lx3/b0;

    move-result-object v0

    iput-object v0, p0, Lh4/q;->c:Lx3/b0;

    new-instance v1, Lh4/q$a;

    invoke-direct {v1, v0}, Lh4/q$a;-><init>(Lx3/b0;)V

    iput-object v1, p0, Lh4/q;->d:Lh4/q$a;

    iget-object v0, p0, Lh4/q;->a:Lh4/d0;

    invoke-virtual {v0, p1, p2}, Lh4/d0;->b(Lx3/m;Lh4/i0$d;)V

    return-void
.end method

.method public f(JI)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p1, v0

    if-eqz p3, :cond_0

    iput-wide p1, p0, Lh4/q;->m:J

    :cond_0
    return-void
.end method

.method public final g(JIIJ)V
    .locals 2

    iget-object v0, p0, Lh4/q;->d:Lh4/q$a;

    iget-boolean v1, p0, Lh4/q;->e:Z

    invoke-virtual {v0, p1, p2, p3, v1}, Lh4/q$a;->a(JIZ)V

    iget-boolean p1, p0, Lh4/q;->e:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lh4/q;->g:Lh4/u;

    invoke-virtual {p1, p4}, Lh4/u;->b(I)Z

    iget-object p1, p0, Lh4/q;->h:Lh4/u;

    invoke-virtual {p1, p4}, Lh4/u;->b(I)Z

    iget-object p1, p0, Lh4/q;->i:Lh4/u;

    invoke-virtual {p1, p4}, Lh4/u;->b(I)Z

    iget-object p1, p0, Lh4/q;->g:Lh4/u;

    invoke-virtual {p1}, Lh4/u;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lh4/q;->h:Lh4/u;

    invoke-virtual {p1}, Lh4/u;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lh4/q;->i:Lh4/u;

    invoke-virtual {p1}, Lh4/u;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lh4/q;->c:Lx3/b0;

    iget-object p2, p0, Lh4/q;->b:Ljava/lang/String;

    iget-object p3, p0, Lh4/q;->g:Lh4/u;

    iget-object v0, p0, Lh4/q;->h:Lh4/u;

    iget-object v1, p0, Lh4/q;->i:Lh4/u;

    invoke-static {p2, p3, v0, v1}, Lh4/q;->i(Ljava/lang/String;Lh4/u;Lh4/u;Lh4/u;)Ls3/m1;

    move-result-object p2

    invoke-interface {p1, p2}, Lx3/b0;->b(Ls3/m1;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lh4/q;->e:Z

    :cond_0
    iget-object p1, p0, Lh4/q;->j:Lh4/u;

    invoke-virtual {p1, p4}, Lh4/u;->b(I)Z

    move-result p1

    const/4 p2, 0x5

    if-eqz p1, :cond_1

    iget-object p1, p0, Lh4/q;->j:Lh4/u;

    iget-object p3, p1, Lh4/u;->d:[B

    iget p1, p1, Lh4/u;->e:I

    invoke-static {p3, p1}, Lp5/w;->q([BI)I

    move-result p1

    iget-object p3, p0, Lh4/q;->n:Lp5/a0;

    iget-object v0, p0, Lh4/q;->j:Lh4/u;

    iget-object v0, v0, Lh4/u;->d:[B

    invoke-virtual {p3, v0, p1}, Lp5/a0;->R([BI)V

    iget-object p1, p0, Lh4/q;->n:Lp5/a0;

    invoke-virtual {p1, p2}, Lp5/a0;->U(I)V

    iget-object p1, p0, Lh4/q;->a:Lh4/d0;

    iget-object p3, p0, Lh4/q;->n:Lp5/a0;

    invoke-virtual {p1, p5, p6, p3}, Lh4/d0;->a(JLp5/a0;)V

    :cond_1
    iget-object p1, p0, Lh4/q;->k:Lh4/u;

    invoke-virtual {p1, p4}, Lh4/u;->b(I)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lh4/q;->k:Lh4/u;

    iget-object p3, p1, Lh4/u;->d:[B

    iget p1, p1, Lh4/u;->e:I

    invoke-static {p3, p1}, Lp5/w;->q([BI)I

    move-result p1

    iget-object p3, p0, Lh4/q;->n:Lp5/a0;

    iget-object p4, p0, Lh4/q;->k:Lh4/u;

    iget-object p4, p4, Lh4/u;->d:[B

    invoke-virtual {p3, p4, p1}, Lp5/a0;->R([BI)V

    iget-object p1, p0, Lh4/q;->n:Lp5/a0;

    invoke-virtual {p1, p2}, Lp5/a0;->U(I)V

    iget-object p1, p0, Lh4/q;->a:Lh4/d0;

    iget-object p2, p0, Lh4/q;->n:Lp5/a0;

    invoke-virtual {p1, p5, p6, p2}, Lh4/d0;->a(JLp5/a0;)V

    :cond_2
    return-void
.end method

.method public final h([BII)V
    .locals 1

    iget-object v0, p0, Lh4/q;->d:Lh4/q$a;

    invoke-virtual {v0, p1, p2, p3}, Lh4/q$a;->e([BII)V

    iget-boolean v0, p0, Lh4/q;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lh4/q;->g:Lh4/u;

    invoke-virtual {v0, p1, p2, p3}, Lh4/u;->a([BII)V

    iget-object v0, p0, Lh4/q;->h:Lh4/u;

    invoke-virtual {v0, p1, p2, p3}, Lh4/u;->a([BII)V

    iget-object v0, p0, Lh4/q;->i:Lh4/u;

    invoke-virtual {v0, p1, p2, p3}, Lh4/u;->a([BII)V

    :cond_0
    iget-object v0, p0, Lh4/q;->j:Lh4/u;

    invoke-virtual {v0, p1, p2, p3}, Lh4/u;->a([BII)V

    iget-object v0, p0, Lh4/q;->k:Lh4/u;

    invoke-virtual {v0, p1, p2, p3}, Lh4/u;->a([BII)V

    return-void
.end method

.method public final j(JIIJ)V
    .locals 8

    iget-object v0, p0, Lh4/q;->d:Lh4/q$a;

    iget-boolean v7, p0, Lh4/q;->e:Z

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move-wide v5, p5

    invoke-virtual/range {v0 .. v7}, Lh4/q$a;->g(JIIJZ)V

    iget-boolean p1, p0, Lh4/q;->e:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lh4/q;->g:Lh4/u;

    invoke-virtual {p1, p4}, Lh4/u;->e(I)V

    iget-object p1, p0, Lh4/q;->h:Lh4/u;

    invoke-virtual {p1, p4}, Lh4/u;->e(I)V

    iget-object p1, p0, Lh4/q;->i:Lh4/u;

    invoke-virtual {p1, p4}, Lh4/u;->e(I)V

    :cond_0
    iget-object p1, p0, Lh4/q;->j:Lh4/u;

    invoke-virtual {p1, p4}, Lh4/u;->e(I)V

    iget-object p1, p0, Lh4/q;->k:Lh4/u;

    invoke-virtual {p1, p4}, Lh4/u;->e(I)V

    return-void
.end method
