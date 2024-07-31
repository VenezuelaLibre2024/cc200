.class public final Ly3/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/k;


# static fields
.field public static final p:Lx3/p;

.field public static final q:[I

.field public static final r:[I

.field public static final s:[B

.field public static final t:[B

.field public static final u:I


# instance fields
.field public final a:[B

.field public final b:I

.field public c:Z

.field public d:J

.field public e:I

.field public f:I

.field public g:Z

.field public h:J

.field public i:I

.field public j:I

.field public k:J

.field public l:Lx3/m;

.field public m:Lx3/b0;

.field public n:Lx3/z;

.field public o:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Ly3/a;->b:Ly3/a;

    sput-object v0, Ly3/b;->p:Lx3/p;

    const/16 v0, 0x10

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, Ly3/b;->q:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Ly3/b;->r:[I

    const-string v1, "#!AMR\n"

    invoke-static {v1}, Lp5/n0;->l0(Ljava/lang/String;)[B

    move-result-object v1

    sput-object v1, Ly3/b;->s:[B

    const-string v1, "#!AMR-WB\n"

    invoke-static {v1}, Lp5/n0;->l0(Ljava/lang/String;)[B

    move-result-object v1

    sput-object v1, Ly3/b;->t:[B

    const/16 v1, 0x8

    aget v0, v0, v1

    sput v0, Ly3/b;->u:I

    return-void

    nop

    :array_0
    .array-data 4
        0xd
        0xe
        0x10
        0x12
        0x14
        0x15
        0x1b
        0x20
        0x6
        0x7
        0x6
        0x6
        0x1
        0x1
        0x1
        0x1
    .end array-data

    :array_1
    .array-data 4
        0x12
        0x18
        0x21
        0x25
        0x29
        0x2f
        0x33
        0x3b
        0x3d
        0x6
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly3/b;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 p1, p1, 0x1

    :cond_0
    iput p1, p0, Ly3/b;->b:I

    const/4 p1, 0x1

    new-array p1, p1, [B

    iput-object p1, p0, Ly3/b;->a:[B

    const/4 p1, -0x1

    iput p1, p0, Ly3/b;->i:I

    return-void
.end method

.method public static synthetic a()[Lx3/k;
    .locals 1

    invoke-static {}, Ly3/b;->m()[Lx3/k;

    move-result-object v0

    return-object v0
.end method

.method public static e(IJ)I
    .locals 4

    int-to-long v0, p0

    const-wide/16 v2, 0x8

    mul-long/2addr v0, v2

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    div-long/2addr v0, p1

    long-to-int p0, v0

    return p0
.end method

.method public static synthetic m()[Lx3/k;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lx3/k;

    new-instance v1, Ly3/b;

    invoke-direct {v1}, Ly3/b;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static p(Lx3/l;[B)Z
    .locals 3

    invoke-interface {p0}, Lx3/l;->l()V

    array-length v0, p1

    new-array v0, v0, [B

    array-length v1, p1

    const/4 v2, 0x0

    invoke-interface {p0, v0, v2, v1}, Lx3/l;->p([BII)V

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public b(Lx3/m;)V
    .locals 2

    iput-object p1, p0, Ly3/b;->l:Lx3/m;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lx3/m;->e(II)Lx3/b0;

    move-result-object v0

    iput-object v0, p0, Ly3/b;->m:Lx3/b0;

    invoke-interface {p1}, Lx3/m;->n()V

    return-void
.end method

.method public c(JJ)V
    .locals 2

    const-wide/16 p3, 0x0

    iput-wide p3, p0, Ly3/b;->d:J

    const/4 v0, 0x0

    iput v0, p0, Ly3/b;->e:I

    iput v0, p0, Ly3/b;->f:I

    cmp-long v0, p1, p3

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly3/b;->n:Lx3/z;

    instance-of v1, v0, Lx3/d;

    if-eqz v1, :cond_0

    check-cast v0, Lx3/d;

    invoke-virtual {v0, p1, p2}, Lx3/d;->c(J)J

    move-result-wide p1

    iput-wide p1, p0, Ly3/b;->k:J

    goto :goto_0

    :cond_0
    iput-wide p3, p0, Ly3/b;->k:J

    :goto_0
    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Ly3/b;->m:Lx3/b0;

    invoke-static {v0}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ly3/b;->l:Lx3/m;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final f(JZ)Lx3/z;
    .locals 11

    iget v0, p0, Ly3/b;->i:I

    const-wide/16 v1, 0x4e20

    invoke-static {v0, v1, v2}, Ly3/b;->e(IJ)I

    move-result v8

    new-instance v0, Lx3/d;

    iget-wide v6, p0, Ly3/b;->h:J

    iget v9, p0, Ly3/b;->i:I

    move-object v3, v0

    move-wide v4, p1

    move v10, p3

    invoke-direct/range {v3 .. v10}, Lx3/d;-><init>(JJIIZ)V

    return-object v0
.end method

.method public g(Lx3/l;Lx3/y;)I
    .locals 4

    invoke-virtual {p0}, Ly3/b;->d()V

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, Ly3/b;->r(Lx3/l;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const-string p2, "Could not find AMR header."

    invoke-static {p2, p1}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Ly3/b;->n()V

    invoke-virtual {p0, p1}, Ly3/b;->s(Lx3/l;)I

    move-result p2

    invoke-interface {p1}, Lx3/l;->b()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p2}, Ly3/b;->o(JI)V

    return p2
.end method

.method public h(Lx3/l;)Z
    .locals 0

    invoke-virtual {p0, p1}, Ly3/b;->r(Lx3/l;)Z

    move-result p1

    return p1
.end method

.method public final i(I)I
    .locals 2

    invoke-virtual {p0, p1}, Ly3/b;->k(I)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Illegal AMR "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ly3/b;->c:Z

    if-eqz v1, :cond_0

    const-string v1, "WB"

    goto :goto_0

    :cond_0
    const-string v1, "NB"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " frame type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p1

    throw p1

    :cond_1
    iget-boolean v0, p0, Ly3/b;->c:Z

    if-eqz v0, :cond_2

    sget-object v0, Ly3/b;->r:[I

    aget p1, v0, p1

    goto :goto_1

    :cond_2
    sget-object v0, Ly3/b;->q:[I

    aget p1, v0, p1

    :goto_1
    return p1
.end method

.method public final j(I)Z
    .locals 1

    iget-boolean v0, p0, Ly3/b;->c:Z

    if-nez v0, :cond_1

    const/16 v0, 0xc

    if-lt p1, v0, :cond_0

    const/16 v0, 0xe

    if-le p1, v0, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final k(I)Z
    .locals 1

    if-ltz p1, :cond_1

    const/16 v0, 0xf

    if-gt p1, v0, :cond_1

    invoke-virtual {p0, p1}, Ly3/b;->l(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Ly3/b;->j(I)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final l(I)Z
    .locals 1

    iget-boolean v0, p0, Ly3/b;->c:Z

    if-eqz v0, :cond_1

    const/16 v0, 0xa

    if-lt p1, v0, :cond_0

    const/16 v0, 0xd

    if-le p1, v0, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final n()V
    .locals 5

    iget-boolean v0, p0, Ly3/b;->o:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly3/b;->o:Z

    iget-boolean v1, p0, Ly3/b;->c:Z

    if-eqz v1, :cond_0

    const-string v2, "audio/amr-wb"

    goto :goto_0

    :cond_0
    const-string v2, "audio/3gpp"

    :goto_0
    if-eqz v1, :cond_1

    const/16 v1, 0x3e80

    goto :goto_1

    :cond_1
    const/16 v1, 0x1f40

    :goto_1
    iget-object v3, p0, Ly3/b;->m:Lx3/b0;

    new-instance v4, Ls3/m1$b;

    invoke-direct {v4}, Ls3/m1$b;-><init>()V

    invoke-virtual {v4, v2}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v2

    sget v4, Ly3/b;->u:I

    invoke-virtual {v2, v4}, Ls3/m1$b;->Y(I)Ls3/m1$b;

    move-result-object v2

    invoke-virtual {v2, v0}, Ls3/m1$b;->J(I)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Ls3/m1$b;->h0(I)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v0

    invoke-interface {v3, v0}, Lx3/b0;->b(Ls3/m1;)V

    :cond_2
    return-void
.end method

.method public final o(JI)V
    .locals 5

    iget-boolean v0, p0, Ly3/b;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Ly3/b;->b:I

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    const-wide/16 v3, -0x1

    cmp-long v1, p1, v3

    if-eqz v1, :cond_4

    iget v1, p0, Ly3/b;->i:I

    const/4 v3, -0x1

    if-eq v1, v3, :cond_1

    iget v4, p0, Ly3/b;->e:I

    if-eq v1, v4, :cond_1

    goto :goto_1

    :cond_1
    iget v1, p0, Ly3/b;->j:I

    const/16 v4, 0x14

    if-ge v1, v4, :cond_2

    if-ne p3, v3, :cond_5

    :cond_2
    and-int/lit8 p3, v0, 0x2

    if-eqz p3, :cond_3

    move p3, v2

    goto :goto_0

    :cond_3
    const/4 p3, 0x0

    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Ly3/b;->f(JZ)Lx3/z;

    move-result-object p1

    goto :goto_2

    :cond_4
    :goto_1
    new-instance p1, Lx3/z$b;

    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {p1, p2, p3}, Lx3/z$b;-><init>(J)V

    :goto_2
    iput-object p1, p0, Ly3/b;->n:Lx3/z;

    iget-object p2, p0, Ly3/b;->l:Lx3/m;

    invoke-interface {p2, p1}, Lx3/m;->j(Lx3/z;)V

    iput-boolean v2, p0, Ly3/b;->g:Z

    :cond_5
    return-void
.end method

.method public final q(Lx3/l;)I
    .locals 3

    invoke-interface {p1}, Lx3/l;->l()V

    iget-object v0, p0, Ly3/b;->a:[B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {p1, v0, v1, v2}, Lx3/l;->p([BII)V

    iget-object p1, p0, Ly3/b;->a:[B

    aget-byte p1, p1, v1

    and-int/lit16 v0, p1, 0x83

    if-gtz v0, :cond_0

    shr-int/lit8 p1, p1, 0x3

    and-int/lit8 p1, p1, 0xf

    invoke-virtual {p0, p1}, Ly3/b;->i(I)I

    move-result p1

    return p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid padding bits for frame header "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p1

    throw p1
.end method

.method public final r(Lx3/l;)Z
    .locals 4

    sget-object v0, Ly3/b;->s:[B

    invoke-static {p1, v0}, Ly3/b;->p(Lx3/l;[B)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    iput-boolean v2, p0, Ly3/b;->c:Z

    array-length v0, v0

    :goto_0
    invoke-interface {p1, v0}, Lx3/l;->m(I)V

    return v3

    :cond_0
    sget-object v0, Ly3/b;->t:[B

    invoke-static {p1, v0}, Ly3/b;->p(Lx3/l;[B)Z

    move-result v1

    if-eqz v1, :cond_1

    iput-boolean v3, p0, Ly3/b;->c:Z

    array-length v0, v0

    goto :goto_0

    :cond_1
    return v2
.end method

.method public release()V
    .locals 0

    return-void
.end method

.method public final s(Lx3/l;)I
    .locals 8

    iget v0, p0, Ly3/b;->f:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-nez v0, :cond_1

    :try_start_0
    invoke-virtual {p0, p1}, Ly3/b;->q(Lx3/l;)I

    move-result v0

    iput v0, p0, Ly3/b;->e:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iput v0, p0, Ly3/b;->f:I

    iget v0, p0, Ly3/b;->i:I

    if-ne v0, v2, :cond_0

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v3

    iput-wide v3, p0, Ly3/b;->h:J

    iget v0, p0, Ly3/b;->e:I

    iput v0, p0, Ly3/b;->i:I

    :cond_0
    iget v0, p0, Ly3/b;->i:I

    iget v3, p0, Ly3/b;->e:I

    if-ne v0, v3, :cond_1

    iget v0, p0, Ly3/b;->j:I

    add-int/2addr v0, v1

    iput v0, p0, Ly3/b;->j:I

    goto :goto_0

    :catch_0
    return v2

    :cond_1
    :goto_0
    iget-object v0, p0, Ly3/b;->m:Lx3/b0;

    iget v3, p0, Ly3/b;->f:I

    invoke-interface {v0, p1, v3, v1}, Lx3/b0;->c(Lo5/h;IZ)I

    move-result p1

    if-ne p1, v2, :cond_2

    return v2

    :cond_2
    iget v0, p0, Ly3/b;->f:I

    sub-int/2addr v0, p1

    iput v0, p0, Ly3/b;->f:I

    const/4 p1, 0x0

    if-lez v0, :cond_3

    return p1

    :cond_3
    iget-object v1, p0, Ly3/b;->m:Lx3/b0;

    iget-wide v2, p0, Ly3/b;->k:J

    iget-wide v4, p0, Ly3/b;->d:J

    add-long/2addr v2, v4

    const/4 v4, 0x1

    iget v5, p0, Ly3/b;->e:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v1 .. v7}, Lx3/b0;->a(JIIILx3/b0$a;)V

    iget-wide v0, p0, Ly3/b;->d:J

    const-wide/16 v2, 0x4e20

    add-long/2addr v0, v2

    iput-wide v0, p0, Ly3/b;->d:J

    return p1
.end method
