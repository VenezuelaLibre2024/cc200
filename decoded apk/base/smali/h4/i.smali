.class public final Lh4/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh4/m;


# static fields
.field public static final v:[B


# instance fields
.field public final a:Z

.field public final b:Lp5/z;

.field public final c:Lp5/a0;

.field public final d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Lx3/b0;

.field public g:Lx3/b0;

.field public h:I

.field public i:I

.field public j:I

.field public k:Z

.field public l:Z

.field public m:I

.field public n:I

.field public o:I

.field public p:Z

.field public q:J

.field public r:I

.field public s:J

.field public t:Lx3/b0;

.field public u:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lh4/i;->v:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x49t
        0x44t
        0x33t
    .end array-data
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lh4/i;-><init>(ZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp5/z;

    const/4 v1, 0x7

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lp5/z;-><init>([B)V

    iput-object v0, p0, Lh4/i;->b:Lp5/z;

    new-instance v0, Lp5/a0;

    sget-object v1, Lh4/i;->v:[B

    const/16 v2, 0xa

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lp5/a0;-><init>([B)V

    iput-object v0, p0, Lh4/i;->c:Lp5/a0;

    invoke-virtual {p0}, Lh4/i;->s()V

    const/4 v0, -0x1

    iput v0, p0, Lh4/i;->m:I

    iput v0, p0, Lh4/i;->n:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lh4/i;->q:J

    iput-wide v0, p0, Lh4/i;->s:J

    iput-boolean p1, p0, Lh4/i;->a:Z

    iput-object p2, p0, Lh4/i;->d:Ljava/lang/String;

    return-void
.end method

.method public static m(I)Z
    .locals 1

    const v0, 0xfff6

    and-int/2addr p0, v0

    const v0, 0xfff0

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public a(Lp5/a0;)V
    .locals 2

    invoke-virtual {p0}, Lh4/i;->b()V

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lp5/a0;->a()I

    move-result v0

    if-lez v0, :cond_7

    iget v0, p0, Lh4/i;->h:I

    if-eqz v0, :cond_6

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    invoke-virtual {p0, p1}, Lh4/i;->p(Lp5/a0;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    iget-boolean v0, p0, Lh4/i;->k:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x7

    goto :goto_1

    :cond_3
    const/4 v0, 0x5

    :goto_1
    iget-object v1, p0, Lh4/i;->b:Lp5/z;

    iget-object v1, v1, Lp5/z;->a:[B

    invoke-virtual {p0, p1, v1, v0}, Lh4/i;->i(Lp5/a0;[BI)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh4/i;->n()V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lh4/i;->c:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {p0, p1, v0, v1}, Lh4/i;->i(Lp5/a0;[BI)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh4/i;->o()V

    goto :goto_0

    :cond_5
    invoke-virtual {p0, p1}, Lh4/i;->g(Lp5/a0;)V

    goto :goto_0

    :cond_6
    invoke-virtual {p0, p1}, Lh4/i;->j(Lp5/a0;)V

    goto :goto_0

    :cond_7
    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lh4/i;->f:Lx3/b0;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lh4/i;->t:Lx3/b0;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lh4/i;->g:Lx3/b0;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public c()V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lh4/i;->s:J

    invoke-virtual {p0}, Lh4/i;->q()V

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

    iput-object v0, p0, Lh4/i;->e:Ljava/lang/String;

    invoke-virtual {p2}, Lh4/i0$d;->c()I

    move-result v0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lx3/m;->e(II)Lx3/b0;

    move-result-object v0

    iput-object v0, p0, Lh4/i;->f:Lx3/b0;

    iput-object v0, p0, Lh4/i;->t:Lx3/b0;

    iget-boolean v0, p0, Lh4/i;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lh4/i0$d;->a()V

    invoke-virtual {p2}, Lh4/i0$d;->c()I

    move-result v0

    const/4 v1, 0x5

    invoke-interface {p1, v0, v1}, Lx3/m;->e(II)Lx3/b0;

    move-result-object p1

    iput-object p1, p0, Lh4/i;->g:Lx3/b0;

    new-instance v0, Ls3/m1$b;

    invoke-direct {v0}, Ls3/m1$b;-><init>()V

    invoke-virtual {p2}, Lh4/i0$d;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ls3/m1$b;->U(Ljava/lang/String;)Ls3/m1$b;

    move-result-object p2

    const-string v0, "application/id3"

    invoke-virtual {p2, v0}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object p2

    invoke-virtual {p2}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object p2

    invoke-interface {p1, p2}, Lx3/b0;->b(Ls3/m1;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lx3/j;

    invoke-direct {p1}, Lx3/j;-><init>()V

    iput-object p1, p0, Lh4/i;->g:Lx3/b0;

    :goto_0
    return-void
.end method

.method public f(JI)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p1, v0

    if-eqz p3, :cond_0

    iput-wide p1, p0, Lh4/i;->s:J

    :cond_0
    return-void
.end method

.method public final g(Lp5/a0;)V
    .locals 3

    invoke-virtual {p1}, Lp5/a0;->a()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh4/i;->b:Lp5/z;

    iget-object v0, v0, Lp5/z;->a:[B

    const/4 v1, 0x0

    invoke-virtual {p1}, Lp5/a0;->e()[B

    move-result-object v2

    invoke-virtual {p1}, Lp5/a0;->f()I

    move-result p1

    aget-byte p1, v2, p1

    aput-byte p1, v0, v1

    iget-object p1, p0, Lh4/i;->b:Lp5/z;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lp5/z;->p(I)V

    iget-object p1, p0, Lh4/i;->b:Lp5/z;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lp5/z;->h(I)I

    move-result p1

    iget v0, p0, Lh4/i;->n:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    if-eq p1, v0, :cond_1

    invoke-virtual {p0}, Lh4/i;->q()V

    return-void

    :cond_1
    iget-boolean v0, p0, Lh4/i;->l:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh4/i;->l:Z

    iget v0, p0, Lh4/i;->o:I

    iput v0, p0, Lh4/i;->m:I

    iput p1, p0, Lh4/i;->n:I

    :cond_2
    invoke-virtual {p0}, Lh4/i;->t()V

    return-void
.end method

.method public final h(Lp5/a0;I)Z
    .locals 8

    add-int/lit8 v0, p2, 0x1

    invoke-virtual {p1, v0}, Lp5/a0;->T(I)V

    iget-object v0, p0, Lh4/i;->b:Lp5/z;

    iget-object v0, v0, Lp5/z;->a:[B

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lh4/i;->w(Lp5/a0;[BI)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return v2

    :cond_0
    iget-object v0, p0, Lh4/i;->b:Lp5/z;

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Lp5/z;->p(I)V

    iget-object v0, p0, Lh4/i;->b:Lp5/z;

    invoke-virtual {v0, v1}, Lp5/z;->h(I)I

    move-result v0

    iget v4, p0, Lh4/i;->m:I

    const/4 v5, -0x1

    if-eq v4, v5, :cond_1

    if-eq v0, v4, :cond_1

    return v2

    :cond_1
    iget v4, p0, Lh4/i;->n:I

    const/4 v6, 0x2

    if-eq v4, v5, :cond_4

    iget-object v4, p0, Lh4/i;->b:Lp5/z;

    iget-object v4, v4, Lp5/z;->a:[B

    invoke-virtual {p0, p1, v4, v1}, Lh4/i;->w(Lp5/a0;[BI)Z

    move-result v4

    if-nez v4, :cond_2

    return v1

    :cond_2
    iget-object v4, p0, Lh4/i;->b:Lp5/z;

    invoke-virtual {v4, v6}, Lp5/z;->p(I)V

    iget-object v4, p0, Lh4/i;->b:Lp5/z;

    invoke-virtual {v4, v3}, Lp5/z;->h(I)I

    move-result v4

    iget v7, p0, Lh4/i;->n:I

    if-eq v4, v7, :cond_3

    return v2

    :cond_3
    add-int/lit8 v4, p2, 0x2

    invoke-virtual {p1, v4}, Lp5/a0;->T(I)V

    :cond_4
    iget-object v4, p0, Lh4/i;->b:Lp5/z;

    iget-object v4, v4, Lp5/z;->a:[B

    invoke-virtual {p0, p1, v4, v3}, Lh4/i;->w(Lp5/a0;[BI)Z

    move-result v3

    if-nez v3, :cond_5

    return v1

    :cond_5
    iget-object v3, p0, Lh4/i;->b:Lp5/z;

    const/16 v4, 0xe

    invoke-virtual {v3, v4}, Lp5/z;->p(I)V

    iget-object v3, p0, Lh4/i;->b:Lp5/z;

    const/16 v4, 0xd

    invoke-virtual {v3, v4}, Lp5/z;->h(I)I

    move-result v3

    const/4 v4, 0x7

    if-ge v3, v4, :cond_6

    return v2

    :cond_6
    invoke-virtual {p1}, Lp5/a0;->e()[B

    move-result-object v4

    invoke-virtual {p1}, Lp5/a0;->g()I

    move-result p1

    add-int/2addr p2, v3

    if-lt p2, p1, :cond_7

    return v1

    :cond_7
    aget-byte v3, v4, p2

    if-ne v3, v5, :cond_a

    add-int/2addr p2, v1

    if-ne p2, p1, :cond_8

    return v1

    :cond_8
    aget-byte p1, v4, p2

    invoke-virtual {p0, v5, p1}, Lh4/i;->l(BB)Z

    move-result p1

    if-eqz p1, :cond_9

    aget-byte p1, v4, p2

    and-int/lit8 p1, p1, 0x8

    shr-int/lit8 p1, p1, 0x3

    if-ne p1, v0, :cond_9

    goto :goto_0

    :cond_9
    move v1, v2

    :goto_0
    return v1

    :cond_a
    aget-byte v0, v4, p2

    const/16 v3, 0x49

    if-eq v0, v3, :cond_b

    return v2

    :cond_b
    add-int/lit8 v0, p2, 0x1

    if-ne v0, p1, :cond_c

    return v1

    :cond_c
    aget-byte v0, v4, v0

    const/16 v3, 0x44

    if-eq v0, v3, :cond_d

    return v2

    :cond_d
    add-int/2addr p2, v6

    if-ne p2, p1, :cond_e

    return v1

    :cond_e
    aget-byte p1, v4, p2

    const/16 p2, 0x33

    if-ne p1, p2, :cond_f

    goto :goto_1

    :cond_f
    move v1, v2

    :goto_1
    return v1
.end method

.method public final i(Lp5/a0;[BI)Z
    .locals 2

    invoke-virtual {p1}, Lp5/a0;->a()I

    move-result v0

    iget v1, p0, Lh4/i;->i:I

    sub-int v1, p3, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget v1, p0, Lh4/i;->i:I

    invoke-virtual {p1, p2, v1, v0}, Lp5/a0;->l([BII)V

    iget p1, p0, Lh4/i;->i:I

    add-int/2addr p1, v0

    iput p1, p0, Lh4/i;->i:I

    if-ne p1, p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final j(Lp5/a0;)V
    .locals 7

    invoke-virtual {p1}, Lp5/a0;->e()[B

    move-result-object v0

    invoke-virtual {p1}, Lp5/a0;->f()I

    move-result v1

    invoke-virtual {p1}, Lp5/a0;->g()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_9

    add-int/lit8 v3, v1, 0x1

    aget-byte v1, v0, v1

    and-int/lit16 v1, v1, 0xff

    iget v4, p0, Lh4/i;->j:I

    const/16 v5, 0x200

    if-ne v4, v5, :cond_3

    int-to-byte v4, v1

    const/4 v6, -0x1

    invoke-virtual {p0, v6, v4}, Lh4/i;->l(BB)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-boolean v4, p0, Lh4/i;->l:Z

    if-nez v4, :cond_0

    add-int/lit8 v4, v3, -0x2

    invoke-virtual {p0, p1, v4}, Lh4/i;->h(Lp5/a0;I)Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_0
    and-int/lit8 v0, v1, 0x8

    shr-int/lit8 v0, v0, 0x3

    iput v0, p0, Lh4/i;->o:I

    const/4 v0, 0x1

    and-int/2addr v1, v0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lh4/i;->k:Z

    iget-boolean v0, p0, Lh4/i;->l:Z

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lh4/i;->r()V

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lh4/i;->t()V

    :goto_2
    invoke-virtual {p1, v3}, Lp5/a0;->T(I)V

    return-void

    :cond_3
    iget v4, p0, Lh4/i;->j:I

    or-int/2addr v1, v4

    const/16 v6, 0x149

    if-eq v1, v6, :cond_7

    const/16 v6, 0x1ff

    if-eq v1, v6, :cond_6

    const/16 v5, 0x344

    if-eq v1, v5, :cond_5

    const/16 v5, 0x433

    if-eq v1, v5, :cond_4

    const/16 v1, 0x100

    if-eq v4, v1, :cond_8

    iput v1, p0, Lh4/i;->j:I

    add-int/lit8 v3, v3, -0x1

    goto :goto_4

    :cond_4
    invoke-virtual {p0}, Lh4/i;->u()V

    invoke-virtual {p1, v3}, Lp5/a0;->T(I)V

    return-void

    :cond_5
    const/16 v1, 0x400

    goto :goto_3

    :cond_6
    iput v5, p0, Lh4/i;->j:I

    goto :goto_4

    :cond_7
    const/16 v1, 0x300

    :goto_3
    iput v1, p0, Lh4/i;->j:I

    :cond_8
    :goto_4
    move v1, v3

    goto :goto_0

    :cond_9
    invoke-virtual {p1, v1}, Lp5/a0;->T(I)V

    return-void
.end method

.method public k()J
    .locals 2

    iget-wide v0, p0, Lh4/i;->q:J

    return-wide v0
.end method

.method public final l(BB)Z
    .locals 0

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x8

    and-int/lit16 p2, p2, 0xff

    or-int/2addr p1, p2

    invoke-static {p1}, Lh4/i;->m(I)Z

    move-result p1

    return p1
.end method

.method public final n()V
    .locals 8

    iget-object v0, p0, Lh4/i;->b:Lp5/z;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lp5/z;->p(I)V

    iget-boolean v0, p0, Lh4/i;->p:Z

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-nez v0, :cond_1

    iget-object v0, p0, Lh4/i;->b:Lp5/z;

    invoke-virtual {v0, v2}, Lp5/z;->h(I)I

    move-result v0

    const/4 v3, 0x1

    add-int/2addr v0, v3

    if-eq v0, v2, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Detected audio object type: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", but assuming AAC LC."

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "AdtsReader"

    invoke-static {v4, v0}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v2

    :cond_0
    iget-object v4, p0, Lh4/i;->b:Lp5/z;

    invoke-virtual {v4, v1}, Lp5/z;->r(I)V

    iget-object v4, p0, Lh4/i;->b:Lp5/z;

    const/4 v5, 0x3

    invoke-virtual {v4, v5}, Lp5/z;->h(I)I

    move-result v4

    iget v5, p0, Lh4/i;->n:I

    invoke-static {v0, v5, v4}, Lu3/a;->b(III)[B

    move-result-object v0

    invoke-static {v0}, Lu3/a;->f([B)Lu3/a$b;

    move-result-object v4

    new-instance v5, Ls3/m1$b;

    invoke-direct {v5}, Ls3/m1$b;-><init>()V

    iget-object v6, p0, Lh4/i;->e:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ls3/m1$b;->U(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v5

    const-string v6, "audio/mp4a-latm"

    invoke-virtual {v5, v6}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v5

    iget-object v6, v4, Lu3/a$b;->c:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ls3/m1$b;->K(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v5

    iget v6, v4, Lu3/a$b;->b:I

    invoke-virtual {v5, v6}, Ls3/m1$b;->J(I)Ls3/m1$b;

    move-result-object v5

    iget v4, v4, Lu3/a$b;->a:I

    invoke-virtual {v5, v4}, Ls3/m1$b;->h0(I)Ls3/m1$b;

    move-result-object v4

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Ls3/m1$b;->V(Ljava/util/List;)Ls3/m1$b;

    move-result-object v0

    iget-object v4, p0, Lh4/i;->d:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ls3/m1$b;->X(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v0

    const-wide/32 v4, 0x3d090000

    iget v6, v0, Ls3/m1;->G:I

    int-to-long v6, v6

    div-long/2addr v4, v6

    iput-wide v4, p0, Lh4/i;->q:J

    iget-object v4, p0, Lh4/i;->f:Lx3/b0;

    invoke-interface {v4, v0}, Lx3/b0;->b(Ls3/m1;)V

    iput-boolean v3, p0, Lh4/i;->p:Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lh4/i;->b:Lp5/z;

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Lp5/z;->r(I)V

    :goto_0
    iget-object v0, p0, Lh4/i;->b:Lp5/z;

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Lp5/z;->r(I)V

    iget-object v0, p0, Lh4/i;->b:Lp5/z;

    const/16 v3, 0xd

    invoke-virtual {v0, v3}, Lp5/z;->h(I)I

    move-result v0

    sub-int/2addr v0, v2

    sub-int/2addr v0, v1

    iget-boolean v1, p0, Lh4/i;->k:Z

    if-eqz v1, :cond_2

    add-int/lit8 v0, v0, -0x2

    :cond_2
    move v6, v0

    iget-object v2, p0, Lh4/i;->f:Lx3/b0;

    iget-wide v3, p0, Lh4/i;->q:J

    const/4 v5, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lh4/i;->v(Lx3/b0;JII)V

    return-void
.end method

.method public final o()V
    .locals 9

    iget-object v0, p0, Lh4/i;->g:Lx3/b0;

    iget-object v1, p0, Lh4/i;->c:Lp5/a0;

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2}, Lx3/b0;->e(Lp5/a0;I)V

    iget-object v0, p0, Lh4/i;->c:Lp5/a0;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lp5/a0;->T(I)V

    iget-object v4, p0, Lh4/i;->g:Lx3/b0;

    iget-object v0, p0, Lh4/i;->c:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->F()I

    move-result v0

    add-int/lit8 v8, v0, 0xa

    const-wide/16 v5, 0x0

    const/16 v7, 0xa

    move-object v3, p0

    invoke-virtual/range {v3 .. v8}, Lh4/i;->v(Lx3/b0;JII)V

    return-void
.end method

.method public final p(Lp5/a0;)V
    .locals 7

    invoke-virtual {p1}, Lp5/a0;->a()I

    move-result v0

    iget v1, p0, Lh4/i;->r:I

    iget v2, p0, Lh4/i;->i:I

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lh4/i;->t:Lx3/b0;

    invoke-interface {v1, p1, v0}, Lx3/b0;->e(Lp5/a0;I)V

    iget p1, p0, Lh4/i;->i:I

    add-int/2addr p1, v0

    iput p1, p0, Lh4/i;->i:I

    iget v4, p0, Lh4/i;->r:I

    if-ne p1, v4, :cond_1

    iget-wide v1, p0, Lh4/i;->s:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v1, v5

    if-eqz p1, :cond_0

    iget-object v0, p0, Lh4/i;->t:Lx3/b0;

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-interface/range {v0 .. v6}, Lx3/b0;->a(JIIILx3/b0$a;)V

    iget-wide v0, p0, Lh4/i;->s:J

    iget-wide v2, p0, Lh4/i;->u:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lh4/i;->s:J

    :cond_0
    invoke-virtual {p0}, Lh4/i;->s()V

    :cond_1
    return-void
.end method

.method public final q()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lh4/i;->l:Z

    invoke-virtual {p0}, Lh4/i;->s()V

    return-void
.end method

.method public final r()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh4/i;->h:I

    const/4 v0, 0x0

    iput v0, p0, Lh4/i;->i:I

    return-void
.end method

.method public final s()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh4/i;->h:I

    iput v0, p0, Lh4/i;->i:I

    const/16 v0, 0x100

    iput v0, p0, Lh4/i;->j:I

    return-void
.end method

.method public final t()V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lh4/i;->h:I

    const/4 v0, 0x0

    iput v0, p0, Lh4/i;->i:I

    return-void
.end method

.method public final u()V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Lh4/i;->h:I

    sget-object v0, Lh4/i;->v:[B

    array-length v0, v0

    iput v0, p0, Lh4/i;->i:I

    const/4 v0, 0x0

    iput v0, p0, Lh4/i;->r:I

    iget-object v1, p0, Lh4/i;->c:Lp5/a0;

    invoke-virtual {v1, v0}, Lp5/a0;->T(I)V

    return-void
.end method

.method public final v(Lx3/b0;JII)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lh4/i;->h:I

    iput p4, p0, Lh4/i;->i:I

    iput-object p1, p0, Lh4/i;->t:Lx3/b0;

    iput-wide p2, p0, Lh4/i;->u:J

    iput p5, p0, Lh4/i;->r:I

    return-void
.end method

.method public final w(Lp5/a0;[BI)Z
    .locals 2

    invoke-virtual {p1}, Lp5/a0;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ge v0, p3, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1, p2, v1, p3}, Lp5/a0;->l([BII)V

    const/4 p1, 0x1

    return p1
.end method
