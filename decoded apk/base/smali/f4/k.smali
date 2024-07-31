.class public final Lf4/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/k;
.implements Lx3/z;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf4/k$a;
    }
.end annotation


# static fields
.field public static final y:Lx3/p;


# instance fields
.field public final a:I

.field public final b:Lp5/a0;

.field public final c:Lp5/a0;

.field public final d:Lp5/a0;

.field public final e:Lp5/a0;

.field public final f:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lf4/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lf4/m;

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk4/a$b;",
            ">;"
        }
    .end annotation
.end field

.field public i:I

.field public j:I

.field public k:J

.field public l:I

.field public m:Lp5/a0;

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:Lx3/m;

.field public s:[Lf4/k$a;

.field public t:[[J

.field public u:I

.field public v:J

.field public w:I

.field public x:Lq4/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lf4/j;->b:Lf4/j;

    sput-object v0, Lf4/k;->y:Lx3/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lf4/k;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lf4/k;->a:I

    const/4 v0, 0x4

    and-int/2addr p1, v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    iput p1, p0, Lf4/k;->i:I

    new-instance p1, Lf4/m;

    invoke-direct {p1}, Lf4/m;-><init>()V

    iput-object p1, p0, Lf4/k;->g:Lf4/m;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lf4/k;->h:Ljava/util/List;

    new-instance p1, Lp5/a0;

    const/16 v2, 0x10

    invoke-direct {p1, v2}, Lp5/a0;-><init>(I)V

    iput-object p1, p0, Lf4/k;->e:Lp5/a0;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lf4/k;->f:Ljava/util/ArrayDeque;

    new-instance p1, Lp5/a0;

    sget-object v2, Lp5/w;->a:[B

    invoke-direct {p1, v2}, Lp5/a0;-><init>([B)V

    iput-object p1, p0, Lf4/k;->b:Lp5/a0;

    new-instance p1, Lp5/a0;

    invoke-direct {p1, v0}, Lp5/a0;-><init>(I)V

    iput-object p1, p0, Lf4/k;->c:Lp5/a0;

    new-instance p1, Lp5/a0;

    invoke-direct {p1}, Lp5/a0;-><init>()V

    iput-object p1, p0, Lf4/k;->d:Lp5/a0;

    const/4 p1, -0x1

    iput p1, p0, Lf4/k;->n:I

    sget-object p1, Lx3/m;->g:Lx3/m;

    iput-object p1, p0, Lf4/k;->r:Lx3/m;

    new-array p1, v1, [Lf4/k$a;

    iput-object p1, p0, Lf4/k;->s:[Lf4/k$a;

    return-void
.end method

.method public static E(I)Z
    .locals 1

    const v0, 0x6d6f6f76

    if-eq p0, v0, :cond_1

    const v0, 0x7472616b

    if-eq p0, v0, :cond_1

    const v0, 0x6d646961

    if-eq p0, v0, :cond_1

    const v0, 0x6d696e66

    if-eq p0, v0, :cond_1

    const v0, 0x7374626c

    if-eq p0, v0, :cond_1

    const v0, 0x65647473

    if-eq p0, v0, :cond_1

    const v0, 0x6d657461

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static F(I)Z
    .locals 1

    const v0, 0x6d646864

    if-eq p0, v0, :cond_1

    const v0, 0x6d766864

    if-eq p0, v0, :cond_1

    const v0, 0x68646c72    # 4.3148E24f

    if-eq p0, v0, :cond_1

    const v0, 0x73747364

    if-eq p0, v0, :cond_1

    const v0, 0x73747473

    if-eq p0, v0, :cond_1

    const v0, 0x73747373

    if-eq p0, v0, :cond_1

    const v0, 0x63747473

    if-eq p0, v0, :cond_1

    const v0, 0x656c7374

    if-eq p0, v0, :cond_1

    const v0, 0x73747363

    if-eq p0, v0, :cond_1

    const v0, 0x7374737a

    if-eq p0, v0, :cond_1

    const v0, 0x73747a32

    if-eq p0, v0, :cond_1

    const v0, 0x7374636f

    if-eq p0, v0, :cond_1

    const v0, 0x636f3634

    if-eq p0, v0, :cond_1

    const v0, 0x746b6864

    if-eq p0, v0, :cond_1

    const v0, 0x66747970

    if-eq p0, v0, :cond_1

    const v0, 0x75647461

    if-eq p0, v0, :cond_1

    const v0, 0x6b657973

    if-eq p0, v0, :cond_1

    const v0, 0x696c7374

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static synthetic j(Lf4/o;)Lf4/o;
    .locals 0

    invoke-static {p0}, Lf4/k;->r(Lf4/o;)Lf4/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k()[Lx3/k;
    .locals 1

    invoke-static {}, Lf4/k;->s()[Lx3/k;

    move-result-object v0

    return-object v0
.end method

.method public static l(I)I
    .locals 1

    const v0, 0x68656963

    if-eq p0, v0, :cond_1

    const v0, 0x71742020

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x2

    return p0
.end method

.method public static m([Lf4/k$a;)[[J
    .locals 14

    array-length v0, p0

    new-array v0, v0, [[J

    array-length v1, p0

    new-array v1, v1, [I

    array-length v2, p0

    new-array v2, v2, [J

    array-length v3, p0

    new-array v3, v3, [Z

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    array-length v6, p0

    if-ge v5, v6, :cond_0

    aget-object v6, p0, v5

    iget-object v6, v6, Lf4/k$a;->b:Lf4/r;

    iget v6, v6, Lf4/r;->b:I

    new-array v6, v6, [J

    aput-object v6, v0, v5

    aget-object v6, p0, v5

    iget-object v6, v6, Lf4/k$a;->b:Lf4/r;

    iget-object v6, v6, Lf4/r;->f:[J

    aget-wide v7, v6, v4

    aput-wide v7, v2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v5, 0x0

    move v7, v4

    :goto_1
    array-length v8, p0

    if-ge v7, v8, :cond_4

    const-wide v8, 0x7fffffffffffffffL

    const/4 v10, -0x1

    move v11, v4

    :goto_2
    array-length v12, p0

    if-ge v11, v12, :cond_2

    aget-boolean v12, v3, v11

    if-nez v12, :cond_1

    aget-wide v12, v2, v11

    cmp-long v12, v12, v8

    if-gtz v12, :cond_1

    aget-wide v8, v2, v11

    move v10, v11

    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_2
    aget v8, v1, v10

    aget-object v9, v0, v10

    aput-wide v5, v9, v8

    aget-object v9, p0, v10

    iget-object v9, v9, Lf4/k$a;->b:Lf4/r;

    iget-object v9, v9, Lf4/r;->d:[I

    aget v9, v9, v8

    int-to-long v11, v9

    add-long/2addr v5, v11

    const/4 v9, 0x1

    add-int/2addr v8, v9

    aput v8, v1, v10

    aget-object v11, v0, v10

    array-length v11, v11

    if-ge v8, v11, :cond_3

    aget-object v9, p0, v10

    iget-object v9, v9, Lf4/k$a;->b:Lf4/r;

    iget-object v9, v9, Lf4/r;->f:[J

    aget-wide v8, v9, v8

    aput-wide v8, v2, v10

    goto :goto_1

    :cond_3
    aput-boolean v9, v3, v10

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_4
    return-object v0
.end method

.method public static p(Lf4/r;J)I
    .locals 2

    invoke-virtual {p0, p1, p2}, Lf4/r;->a(J)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1, p2}, Lf4/r;->b(J)I

    move-result v0

    :cond_0
    return v0
.end method

.method public static synthetic r(Lf4/o;)Lf4/o;
    .locals 0

    return-object p0
.end method

.method public static synthetic s()[Lx3/k;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lx3/k;

    new-instance v1, Lf4/k;

    invoke-direct {v1}, Lf4/k;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static t(Lf4/r;JJ)J
    .locals 0

    invoke-static {p0, p1, p2}, Lf4/k;->p(Lf4/r;J)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return-wide p3

    :cond_0
    iget-object p0, p0, Lf4/r;->c:[J

    aget-wide p1, p0, p1

    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static x(Lp5/a0;)I
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v0

    invoke-static {v0}, Lf4/k;->l(I)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lp5/a0;->U(I)V

    :cond_1
    invoke-virtual {p0}, Lp5/a0;->a()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v0

    invoke-static {v0}, Lf4/k;->l(I)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final A(Lx3/l;)Z
    .locals 8

    iget v0, p0, Lf4/k;->l:I

    const/4 v1, 0x1

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lf4/k;->e:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    invoke-interface {p1, v0, v3, v2, v1}, Lx3/l;->d([BIIZ)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lf4/k;->w()V

    return v3

    :cond_0
    iput v2, p0, Lf4/k;->l:I

    iget-object v0, p0, Lf4/k;->e:Lp5/a0;

    invoke-virtual {v0, v3}, Lp5/a0;->T(I)V

    iget-object v0, p0, Lf4/k;->e:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->I()J

    move-result-wide v4

    iput-wide v4, p0, Lf4/k;->k:J

    iget-object v0, p0, Lf4/k;->e:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->p()I

    move-result v0

    iput v0, p0, Lf4/k;->j:I

    :cond_1
    iget-wide v4, p0, Lf4/k;->k:J

    const-wide/16 v6, 0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    iget-object v0, p0, Lf4/k;->e:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    invoke-interface {p1, v0, v2, v2}, Lx3/l;->readFully([BII)V

    iget v0, p0, Lf4/k;->l:I

    add-int/2addr v0, v2

    iput v0, p0, Lf4/k;->l:I

    iget-object v0, p0, Lf4/k;->e:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->L()J

    move-result-wide v4

    :goto_0
    iput-wide v4, p0, Lf4/k;->k:J

    goto :goto_1

    :cond_2
    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-nez v0, :cond_4

    invoke-interface {p1}, Lx3/l;->b()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_3

    iget-object v0, p0, Lf4/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/a$a;

    if-eqz v0, :cond_3

    iget-wide v4, v0, Lf4/a$a;->b:J

    :cond_3
    cmp-long v0, v4, v6

    if-eqz v0, :cond_4

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v6

    sub-long/2addr v4, v6

    iget v0, p0, Lf4/k;->l:I

    int-to-long v6, v0

    add-long/2addr v4, v6

    goto :goto_0

    :cond_4
    :goto_1
    iget-wide v4, p0, Lf4/k;->k:J

    iget v0, p0, Lf4/k;->l:I

    int-to-long v6, v0

    cmp-long v0, v4, v6

    if-ltz v0, :cond_b

    iget v0, p0, Lf4/k;->j:I

    invoke-static {v0}, Lf4/k;->E(I)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v2

    iget-wide v4, p0, Lf4/k;->k:J

    add-long/2addr v2, v4

    iget v0, p0, Lf4/k;->l:I

    int-to-long v6, v0

    sub-long/2addr v2, v6

    int-to-long v6, v0

    cmp-long v0, v4, v6

    if-eqz v0, :cond_5

    iget v0, p0, Lf4/k;->j:I

    const v4, 0x6d657461

    if-ne v0, v4, :cond_5

    invoke-virtual {p0, p1}, Lf4/k;->u(Lx3/l;)V

    :cond_5
    iget-object p1, p0, Lf4/k;->f:Ljava/util/ArrayDeque;

    new-instance v0, Lf4/a$a;

    iget v4, p0, Lf4/k;->j:I

    invoke-direct {v0, v4, v2, v3}, Lf4/a$a;-><init>(IJ)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    iget-wide v4, p0, Lf4/k;->k:J

    iget p1, p0, Lf4/k;->l:I

    int-to-long v6, p1

    cmp-long p1, v4, v6

    if-nez p1, :cond_6

    invoke-virtual {p0, v2, v3}, Lf4/k;->v(J)V

    goto :goto_5

    :cond_6
    invoke-virtual {p0}, Lf4/k;->n()V

    goto :goto_5

    :cond_7
    iget v0, p0, Lf4/k;->j:I

    invoke-static {v0}, Lf4/k;->F(I)Z

    move-result v0

    if-eqz v0, :cond_a

    iget p1, p0, Lf4/k;->l:I

    if-ne p1, v2, :cond_8

    move p1, v1

    goto :goto_2

    :cond_8
    move p1, v3

    :goto_2
    invoke-static {p1}, Lp5/a;->f(Z)V

    iget-wide v4, p0, Lf4/k;->k:J

    const-wide/32 v6, 0x7fffffff

    cmp-long p1, v4, v6

    if-gtz p1, :cond_9

    move p1, v1

    goto :goto_3

    :cond_9
    move p1, v3

    :goto_3
    invoke-static {p1}, Lp5/a;->f(Z)V

    new-instance p1, Lp5/a0;

    iget-wide v4, p0, Lf4/k;->k:J

    long-to-int v0, v4

    invoke-direct {p1, v0}, Lp5/a0;-><init>(I)V

    iget-object v0, p0, Lf4/k;->e:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    invoke-virtual {p1}, Lp5/a0;->e()[B

    move-result-object v4

    invoke-static {v0, v3, v4, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_4

    :cond_a
    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v2

    iget p1, p0, Lf4/k;->l:I

    int-to-long v4, p1

    sub-long/2addr v2, v4

    invoke-virtual {p0, v2, v3}, Lf4/k;->z(J)V

    const/4 p1, 0x0

    :goto_4
    iput-object p1, p0, Lf4/k;->m:Lp5/a0;

    iput v1, p0, Lf4/k;->i:I

    :goto_5
    return v1

    :cond_b
    const-string p1, "Atom size less than header length (unsupported)."

    invoke-static {p1}, Ls3/t2;->d(Ljava/lang/String;)Ls3/t2;

    move-result-object p1

    throw p1
.end method

.method public final B(Lx3/l;Lx3/y;)Z
    .locals 9

    iget-wide v0, p0, Lf4/k;->k:J

    iget v2, p0, Lf4/k;->l:I

    int-to-long v2, v2

    sub-long/2addr v0, v2

    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v2

    add-long/2addr v2, v0

    iget-object v4, p0, Lf4/k;->m:Lp5/a0;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lp5/a0;->e()[B

    move-result-object p2

    iget v7, p0, Lf4/k;->l:I

    long-to-int v0, v0

    invoke-interface {p1, p2, v7, v0}, Lx3/l;->readFully([BII)V

    iget p1, p0, Lf4/k;->j:I

    const p2, 0x66747970

    if-ne p1, p2, :cond_0

    invoke-static {v4}, Lf4/k;->x(Lp5/a0;)I

    move-result p1

    iput p1, p0, Lf4/k;->w:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lf4/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lf4/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf4/a$a;

    new-instance p2, Lf4/a$b;

    iget v0, p0, Lf4/k;->j:I

    invoke-direct {p2, v0, v4}, Lf4/a$b;-><init>(ILp5/a0;)V

    invoke-virtual {p1, p2}, Lf4/a$a;->e(Lf4/a$b;)V

    goto :goto_0

    :cond_1
    const-wide/32 v7, 0x40000

    cmp-long v4, v0, v7

    if-gez v4, :cond_3

    long-to-int p2, v0

    invoke-interface {p1, p2}, Lx3/l;->m(I)V

    :cond_2
    :goto_0
    move p1, v6

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v7

    add-long/2addr v7, v0

    iput-wide v7, p2, Lx3/y;->a:J

    move p1, v5

    :goto_1
    invoke-virtual {p0, v2, v3}, Lf4/k;->v(J)V

    if-eqz p1, :cond_4

    iget p1, p0, Lf4/k;->i:I

    const/4 p2, 0x2

    if-eq p1, p2, :cond_4

    goto :goto_2

    :cond_4
    move v5, v6

    :goto_2
    return v5
.end method

.method public final C(Lx3/l;Lx3/y;)I
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-interface/range {p1 .. p1}, Lx3/l;->getPosition()J

    move-result-wide v2

    iget v4, v0, Lf4/k;->n:I

    const/4 v5, -0x1

    if-ne v4, v5, :cond_0

    invoke-virtual {v0, v2, v3}, Lf4/k;->q(J)I

    move-result v4

    iput v4, v0, Lf4/k;->n:I

    if-ne v4, v5, :cond_0

    return v5

    :cond_0
    iget-object v4, v0, Lf4/k;->s:[Lf4/k$a;

    iget v6, v0, Lf4/k;->n:I

    aget-object v4, v4, v6

    iget-object v14, v4, Lf4/k$a;->c:Lx3/b0;

    iget v15, v4, Lf4/k$a;->e:I

    iget-object v6, v4, Lf4/k$a;->b:Lf4/r;

    iget-object v7, v6, Lf4/r;->c:[J

    aget-wide v8, v7, v15

    iget-object v6, v6, Lf4/r;->d:[I

    aget v6, v6, v15

    iget-object v13, v4, Lf4/k$a;->d:Lx3/c0;

    sub-long v2, v8, v2

    iget v7, v0, Lf4/k;->o:I

    int-to-long v10, v7

    add-long/2addr v2, v10

    const-wide/16 v10, 0x0

    cmp-long v7, v2, v10

    const/4 v12, 0x1

    if-ltz v7, :cond_c

    const-wide/32 v10, 0x40000

    cmp-long v7, v2, v10

    if-ltz v7, :cond_1

    move-object/from16 v1, p2

    move/from16 v17, v12

    goto/16 :goto_3

    :cond_1
    iget-object v7, v4, Lf4/k$a;->a:Lf4/o;

    iget v7, v7, Lf4/o;->g:I

    if-ne v7, v12, :cond_2

    const-wide/16 v7, 0x8

    add-long/2addr v2, v7

    add-int/lit8 v6, v6, -0x8

    :cond_2
    long-to-int v2, v2

    invoke-interface {v1, v2}, Lx3/l;->m(I)V

    iget-object v2, v4, Lf4/k$a;->a:Lf4/o;

    iget v3, v2, Lf4/o;->j:I

    const/4 v11, 0x0

    const/4 v10, 0x0

    if-eqz v3, :cond_5

    iget-object v2, v0, Lf4/k;->c:Lp5/a0;

    invoke-virtual {v2}, Lp5/a0;->e()[B

    move-result-object v2

    aput-byte v10, v2, v10

    aput-byte v10, v2, v12

    const/4 v3, 0x2

    aput-byte v10, v2, v3

    iget-object v3, v4, Lf4/k$a;->a:Lf4/o;

    iget v3, v3, Lf4/o;->j:I

    rsub-int/lit8 v7, v3, 0x4

    :goto_0
    iget v8, v0, Lf4/k;->p:I

    if-ge v8, v6, :cond_9

    iget v8, v0, Lf4/k;->q:I

    if-nez v8, :cond_4

    invoke-interface {v1, v2, v7, v3}, Lx3/l;->readFully([BII)V

    iget v8, v0, Lf4/k;->o:I

    add-int/2addr v8, v3

    iput v8, v0, Lf4/k;->o:I

    iget-object v8, v0, Lf4/k;->c:Lp5/a0;

    invoke-virtual {v8, v10}, Lp5/a0;->T(I)V

    iget-object v8, v0, Lf4/k;->c:Lp5/a0;

    invoke-virtual {v8}, Lp5/a0;->p()I

    move-result v8

    if-ltz v8, :cond_3

    iput v8, v0, Lf4/k;->q:I

    iget-object v8, v0, Lf4/k;->b:Lp5/a0;

    invoke-virtual {v8, v10}, Lp5/a0;->T(I)V

    iget-object v8, v0, Lf4/k;->b:Lp5/a0;

    const/4 v9, 0x4

    invoke-interface {v14, v8, v9}, Lx3/b0;->e(Lp5/a0;I)V

    iget v8, v0, Lf4/k;->p:I

    add-int/2addr v8, v9

    iput v8, v0, Lf4/k;->p:I

    add-int/2addr v6, v7

    goto :goto_0

    :cond_3
    const-string v1, "Invalid NAL length"

    invoke-static {v1, v11}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object v1

    throw v1

    :cond_4
    invoke-interface {v14, v1, v8, v10}, Lx3/b0;->c(Lo5/h;IZ)I

    move-result v8

    iget v9, v0, Lf4/k;->o:I

    add-int/2addr v9, v8

    iput v9, v0, Lf4/k;->o:I

    iget v9, v0, Lf4/k;->p:I

    add-int/2addr v9, v8

    iput v9, v0, Lf4/k;->p:I

    iget v9, v0, Lf4/k;->q:I

    sub-int/2addr v9, v8

    iput v9, v0, Lf4/k;->q:I

    goto :goto_0

    :cond_5
    iget-object v2, v2, Lf4/o;->f:Ls3/m1;

    iget-object v2, v2, Ls3/m1;->s:Ljava/lang/String;

    const-string v3, "audio/ac4"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget v2, v0, Lf4/k;->p:I

    if-nez v2, :cond_6

    iget-object v2, v0, Lf4/k;->d:Lp5/a0;

    invoke-static {v6, v2}, Lu3/c;->a(ILp5/a0;)V

    iget-object v2, v0, Lf4/k;->d:Lp5/a0;

    const/4 v3, 0x7

    invoke-interface {v14, v2, v3}, Lx3/b0;->e(Lp5/a0;I)V

    iget v2, v0, Lf4/k;->p:I

    add-int/2addr v2, v3

    iput v2, v0, Lf4/k;->p:I

    :cond_6
    add-int/lit8 v6, v6, 0x7

    goto :goto_1

    :cond_7
    if-eqz v13, :cond_8

    invoke-virtual {v13, v1}, Lx3/c0;->d(Lx3/l;)V

    :cond_8
    :goto_1
    iget v2, v0, Lf4/k;->p:I

    if-ge v2, v6, :cond_9

    sub-int v2, v6, v2

    invoke-interface {v14, v1, v2, v10}, Lx3/b0;->c(Lo5/h;IZ)I

    move-result v2

    iget v3, v0, Lf4/k;->o:I

    add-int/2addr v3, v2

    iput v3, v0, Lf4/k;->o:I

    iget v3, v0, Lf4/k;->p:I

    add-int/2addr v3, v2

    iput v3, v0, Lf4/k;->p:I

    iget v3, v0, Lf4/k;->q:I

    sub-int/2addr v3, v2

    iput v3, v0, Lf4/k;->q:I

    goto :goto_1

    :cond_9
    move v1, v6

    iget-object v2, v4, Lf4/k$a;->b:Lf4/r;

    iget-object v3, v2, Lf4/r;->f:[J

    aget-wide v8, v3, v15

    iget-object v2, v2, Lf4/r;->g:[I

    aget v2, v2, v15

    if-eqz v13, :cond_a

    const/4 v3, 0x0

    const/16 v16, 0x0

    move-object v6, v13

    move-object v7, v14

    move v10, v2

    move-object v2, v11

    move v11, v1

    move/from16 v17, v12

    move v12, v3

    move-object v1, v13

    move-object/from16 v13, v16

    invoke-virtual/range {v6 .. v13}, Lx3/c0;->c(Lx3/b0;JIIILx3/b0$a;)V

    add-int/lit8 v15, v15, 0x1

    iget-object v3, v4, Lf4/k$a;->b:Lf4/r;

    iget v3, v3, Lf4/r;->b:I

    if-ne v15, v3, :cond_b

    invoke-virtual {v1, v14, v2}, Lx3/c0;->a(Lx3/b0;Lx3/b0$a;)V

    goto :goto_2

    :cond_a
    move/from16 v17, v12

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v6, v14

    move-wide v7, v8

    move v9, v2

    move v10, v1

    invoke-interface/range {v6 .. v12}, Lx3/b0;->a(JIIILx3/b0$a;)V

    :cond_b
    :goto_2
    iget v1, v4, Lf4/k$a;->e:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v4, Lf4/k$a;->e:I

    iput v5, v0, Lf4/k;->n:I

    const/4 v1, 0x0

    iput v1, v0, Lf4/k;->o:I

    iput v1, v0, Lf4/k;->p:I

    iput v1, v0, Lf4/k;->q:I

    return v1

    :cond_c
    move/from16 v17, v12

    move-object/from16 v1, p2

    :goto_3
    iput-wide v8, v1, Lx3/y;->a:J

    return v17
.end method

.method public final D(Lx3/l;Lx3/y;)I
    .locals 4

    iget-object v0, p0, Lf4/k;->g:Lf4/m;

    iget-object v1, p0, Lf4/k;->h:Ljava/util/List;

    invoke-virtual {v0, p1, p2, v1}, Lf4/m;->c(Lx3/l;Lx3/y;Ljava/util/List;)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-wide v0, p2, Lx3/y;->a:J

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lf4/k;->n()V

    :cond_0
    return p1
.end method

.method public final G(Lf4/k$a;J)V
    .locals 3

    iget-object v0, p1, Lf4/k$a;->b:Lf4/r;

    invoke-virtual {v0, p2, p3}, Lf4/r;->a(J)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {v0, p2, p3}, Lf4/r;->b(J)I

    move-result v1

    :cond_0
    iput v1, p1, Lf4/k$a;->e:I

    return-void
.end method

.method public b(Lx3/m;)V
    .locals 0

    iput-object p1, p0, Lf4/k;->r:Lx3/m;

    return-void
.end method

.method public c(JJ)V
    .locals 3

    iget-object v0, p0, Lf4/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    const/4 v0, 0x0

    iput v0, p0, Lf4/k;->l:I

    const/4 v1, -0x1

    iput v1, p0, Lf4/k;->n:I

    iput v0, p0, Lf4/k;->o:I

    iput v0, p0, Lf4/k;->p:I

    iput v0, p0, Lf4/k;->q:I

    const-wide/16 v1, 0x0

    cmp-long p1, p1, v1

    if-nez p1, :cond_1

    iget p1, p0, Lf4/k;->i:I

    const/4 p2, 0x3

    if-eq p1, p2, :cond_0

    invoke-virtual {p0}, Lf4/k;->n()V

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lf4/k;->g:Lf4/m;

    invoke-virtual {p1}, Lf4/m;->g()V

    iget-object p1, p0, Lf4/k;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lf4/k;->s:[Lf4/k$a;

    array-length p2, p1

    :goto_0
    if-ge v0, p2, :cond_3

    aget-object v1, p1, v0

    invoke-virtual {p0, v1, p3, p4}, Lf4/k;->G(Lf4/k$a;J)V

    iget-object v1, v1, Lf4/k$a;->d:Lx3/c0;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lx3/c0;->b()V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lf4/k;->v:J

    return-wide v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g(Lx3/l;Lx3/y;)I
    .locals 2

    :cond_0
    iget v0, p0, Lf4/k;->i:I

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    invoke-virtual {p0, p1, p2}, Lf4/k;->D(Lx3/l;Lx3/y;)I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {p0, p1, p2}, Lf4/k;->C(Lx3/l;Lx3/y;)I

    move-result p1

    return p1

    :cond_3
    invoke-virtual {p0, p1, p2}, Lf4/k;->B(Lx3/l;Lx3/y;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_4
    invoke-virtual {p0, p1}, Lf4/k;->A(Lx3/l;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1
.end method

.method public h(Lx3/l;)Z
    .locals 1

    iget v0, p0, Lf4/k;->a:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1, v0}, Lf4/n;->d(Lx3/l;Z)Z

    move-result p1

    return p1
.end method

.method public i(J)Lx3/z$a;
    .locals 1

    const/4 v0, -0x1

    invoke-virtual {p0, p1, p2, v0}, Lf4/k;->o(JI)Lx3/z$a;

    move-result-object p1

    return-object p1
.end method

.method public final n()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lf4/k;->i:I

    iput v0, p0, Lf4/k;->l:I

    return-void
.end method

.method public o(JI)Lx3/z$a;
    .locals 16

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move/from16 v3, p3

    iget-object v4, v0, Lf4/k;->s:[Lf4/k$a;

    array-length v5, v4

    if-nez v5, :cond_0

    new-instance v1, Lx3/z$a;

    sget-object v2, Lx3/a0;->c:Lx3/a0;

    invoke-direct {v1, v2}, Lx3/z$a;-><init>(Lx3/a0;)V

    return-object v1

    :cond_0
    const-wide/16 v5, -0x1

    const/4 v7, -0x1

    if-eq v3, v7, :cond_1

    move v8, v3

    goto :goto_0

    :cond_1
    iget v8, v0, Lf4/k;->u:I

    :goto_0
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    if-eq v8, v7, :cond_3

    aget-object v4, v4, v8

    iget-object v4, v4, Lf4/k$a;->b:Lf4/r;

    invoke-static {v4, v1, v2}, Lf4/k;->p(Lf4/r;J)I

    move-result v8

    if-ne v8, v7, :cond_2

    new-instance v1, Lx3/z$a;

    sget-object v2, Lx3/a0;->c:Lx3/a0;

    invoke-direct {v1, v2}, Lx3/z$a;-><init>(Lx3/a0;)V

    return-object v1

    :cond_2
    iget-object v11, v4, Lf4/r;->f:[J

    aget-wide v12, v11, v8

    iget-object v11, v4, Lf4/r;->c:[J

    aget-wide v14, v11, v8

    cmp-long v11, v12, v1

    if-gez v11, :cond_4

    iget v11, v4, Lf4/r;->b:I

    add-int/lit8 v11, v11, -0x1

    if-ge v8, v11, :cond_4

    invoke-virtual {v4, v1, v2}, Lf4/r;->b(J)I

    move-result v1

    if-eq v1, v7, :cond_4

    if-eq v1, v8, :cond_4

    iget-object v2, v4, Lf4/r;->f:[J

    aget-wide v5, v2, v1

    iget-object v2, v4, Lf4/r;->c:[J

    aget-wide v1, v2, v1

    goto :goto_1

    :cond_3
    const-wide v14, 0x7fffffffffffffffL

    move-wide v12, v1

    :cond_4
    move-wide v1, v5

    move-wide v5, v9

    :goto_1
    if-ne v3, v7, :cond_6

    const/4 v3, 0x0

    :goto_2
    iget-object v4, v0, Lf4/k;->s:[Lf4/k$a;

    array-length v7, v4

    if-ge v3, v7, :cond_6

    iget v7, v0, Lf4/k;->u:I

    if-eq v3, v7, :cond_5

    aget-object v4, v4, v3

    iget-object v4, v4, Lf4/k$a;->b:Lf4/r;

    invoke-static {v4, v12, v13, v14, v15}, Lf4/k;->t(Lf4/r;JJ)J

    move-result-wide v14

    cmp-long v7, v5, v9

    if-eqz v7, :cond_5

    invoke-static {v4, v5, v6, v1, v2}, Lf4/k;->t(Lf4/r;JJ)J

    move-result-wide v1

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    new-instance v3, Lx3/a0;

    invoke-direct {v3, v12, v13, v14, v15}, Lx3/a0;-><init>(JJ)V

    cmp-long v4, v5, v9

    if-nez v4, :cond_7

    new-instance v1, Lx3/z$a;

    invoke-direct {v1, v3}, Lx3/z$a;-><init>(Lx3/a0;)V

    return-object v1

    :cond_7
    new-instance v4, Lx3/a0;

    invoke-direct {v4, v5, v6, v1, v2}, Lx3/a0;-><init>(JJ)V

    new-instance v1, Lx3/z$a;

    invoke-direct {v1, v3, v4}, Lx3/z$a;-><init>(Lx3/a0;Lx3/a0;)V

    return-object v1
.end method

.method public final q(J)I
    .locals 20

    move-object/from16 v0, p0

    const/4 v2, -0x1

    move v6, v2

    const/4 v7, 0x0

    const-wide v8, 0x7fffffffffffffffL

    const/4 v10, 0x1

    const-wide v11, 0x7fffffffffffffffL

    const/4 v13, 0x1

    const-wide v14, 0x7fffffffffffffffL

    :goto_0
    iget-object v1, v0, Lf4/k;->s:[Lf4/k$a;

    array-length v3, v1

    if-ge v7, v3, :cond_7

    aget-object v1, v1, v7

    iget v3, v1, Lf4/k$a;->e:I

    iget-object v1, v1, Lf4/k$a;->b:Lf4/r;

    iget v4, v1, Lf4/r;->b:I

    if-ne v3, v4, :cond_0

    goto :goto_3

    :cond_0
    iget-object v1, v1, Lf4/r;->c:[J

    aget-wide v4, v1, v3

    iget-object v1, v0, Lf4/k;->t:[[J

    invoke-static {v1}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[J

    aget-object v1, v1, v7

    aget-wide v16, v1, v3

    sub-long v4, v4, p1

    const-wide/16 v18, 0x0

    cmp-long v1, v4, v18

    if-ltz v1, :cond_2

    const-wide/32 v18, 0x40000

    cmp-long v1, v4, v18

    if-ltz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v1, 0x1

    :goto_2
    if-nez v1, :cond_3

    if-nez v13, :cond_4

    :cond_3
    if-ne v1, v13, :cond_5

    cmp-long v3, v4, v14

    if-gez v3, :cond_5

    :cond_4
    move v13, v1

    move-wide v14, v4

    move v6, v7

    move-wide/from16 v11, v16

    :cond_5
    cmp-long v3, v16, v8

    if-gez v3, :cond_6

    move v10, v1

    move v2, v7

    move-wide/from16 v8, v16

    :cond_6
    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_7
    const-wide v3, 0x7fffffffffffffffL

    cmp-long v1, v8, v3

    if-eqz v1, :cond_8

    if-eqz v10, :cond_8

    const-wide/32 v3, 0xa00000

    add-long/2addr v8, v3

    cmp-long v1, v11, v8

    if-gez v1, :cond_9

    :cond_8
    move v2, v6

    :cond_9
    return v2
.end method

.method public release()V
    .locals 0

    return-void
.end method

.method public final u(Lx3/l;)V
    .locals 3

    iget-object v0, p0, Lf4/k;->d:Lp5/a0;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lp5/a0;->P(I)V

    iget-object v0, p0, Lf4/k;->d:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lx3/l;->p([BII)V

    iget-object v0, p0, Lf4/k;->d:Lp5/a0;

    invoke-static {v0}, Lf4/b;->e(Lp5/a0;)V

    iget-object v0, p0, Lf4/k;->d:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->f()I

    move-result v0

    invoke-interface {p1, v0}, Lx3/l;->m(I)V

    invoke-interface {p1}, Lx3/l;->l()V

    return-void
.end method

.method public final v(J)V
    .locals 4

    :cond_0
    :goto_0
    iget-object v0, p0, Lf4/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    const/4 v1, 0x2

    if-nez v0, :cond_2

    iget-object v0, p0, Lf4/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/a$a;

    iget-wide v2, v0, Lf4/a$a;->b:J

    cmp-long v0, v2, p1

    if-nez v0, :cond_2

    iget-object v0, p0, Lf4/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/a$a;

    iget v2, v0, Lf4/a;->a:I

    const v3, 0x6d6f6f76

    if-ne v2, v3, :cond_1

    invoke-virtual {p0, v0}, Lf4/k;->y(Lf4/a$a;)V

    iget-object v0, p0, Lf4/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    iput v1, p0, Lf4/k;->i:I

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lf4/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lf4/k;->f:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf4/a$a;

    invoke-virtual {v1, v0}, Lf4/a$a;->d(Lf4/a$a;)V

    goto :goto_0

    :cond_2
    iget p1, p0, Lf4/k;->i:I

    if-eq p1, v1, :cond_3

    invoke-virtual {p0}, Lf4/k;->n()V

    :cond_3
    return-void
.end method

.method public final w()V
    .locals 5

    iget v0, p0, Lf4/k;->w:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget v0, p0, Lf4/k;->a:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lf4/k;->r:Lx3/m;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lx3/m;->e(II)Lx3/b0;

    move-result-object v0

    iget-object v1, p0, Lf4/k;->x:Lq4/b;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lk4/a;

    const/4 v3, 0x1

    new-array v3, v3, [Lk4/a$b;

    iget-object v4, p0, Lf4/k;->x:Lq4/b;

    aput-object v4, v3, v2

    invoke-direct {v1, v3}, Lk4/a;-><init>([Lk4/a$b;)V

    :goto_0
    new-instance v2, Ls3/m1$b;

    invoke-direct {v2}, Ls3/m1$b;-><init>()V

    invoke-virtual {v2, v1}, Ls3/m1$b;->Z(Lk4/a;)Ls3/m1$b;

    move-result-object v1

    invoke-virtual {v1}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v1

    invoke-interface {v0, v1}, Lx3/b0;->b(Ls3/m1;)V

    iget-object v0, p0, Lf4/k;->r:Lx3/m;

    invoke-interface {v0}, Lx3/m;->n()V

    iget-object v0, p0, Lf4/k;->r:Lx3/m;

    new-instance v1, Lx3/z$b;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v1, v2, v3}, Lx3/z$b;-><init>(J)V

    invoke-interface {v0, v1}, Lx3/m;->j(Lx3/z;)V

    :cond_1
    return-void
.end method

.method public final y(Lf4/a$a;)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iget v2, v0, Lf4/k;->w:I

    const/4 v11, 0x1

    if-ne v2, v11, :cond_0

    move v7, v11

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    new-instance v12, Lx3/v;

    invoke-direct {v12}, Lx3/v;-><init>()V

    const v2, 0x75647461

    invoke-virtual {v1, v2}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, Lf4/b;->B(Lf4/a$b;)Landroid/util/Pair;

    move-result-object v2

    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Lk4/a;

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Lk4/a;

    if-eqz v3, :cond_1

    invoke-virtual {v12, v3}, Lx3/v;->c(Lk4/a;)Z

    :cond_1
    move-object v14, v2

    move-object v15, v3

    goto :goto_1

    :cond_2
    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_1
    const v2, 0x6d657461

    invoke-virtual {v1, v2}, Lf4/a$a;->f(I)Lf4/a$a;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v2}, Lf4/b;->n(Lf4/a$a;)Lk4/a;

    move-result-object v2

    move-object v8, v2

    goto :goto_2

    :cond_3
    const/4 v8, 0x0

    :goto_2
    iget v2, v0, Lf4/k;->a:I

    and-int/2addr v2, v11

    if-eqz v2, :cond_4

    move v6, v11

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    :goto_3
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, 0x0

    sget-object v16, Lf4/i;->h:Lf4/i;

    move-object/from16 v1, p1

    move-object v2, v12

    move-object v13, v8

    move-object/from16 v8, v16

    invoke-static/range {v1 .. v8}, Lf4/b;->A(Lf4/a$a;Lx3/v;JLw3/m;ZZLh7/g;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    move-wide v10, v3

    const/4 v6, 0x0

    const/4 v7, -0x1

    :goto_4
    if-ge v6, v2, :cond_c

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v8, v17

    check-cast v8, Lf4/r;

    iget v5, v8, Lf4/r;->b:I

    if-nez v5, :cond_5

    move-object/from16 v18, v1

    move/from16 v19, v2

    const/4 v1, -0x1

    const/4 v8, 0x1

    goto/16 :goto_9

    :cond_5
    iget-object v5, v8, Lf4/r;->a:Lf4/o;

    move-object/from16 v18, v1

    move/from16 v19, v2

    iget-wide v1, v5, Lf4/o;->e:J

    cmp-long v20, v1, v3

    if-eqz v20, :cond_6

    goto :goto_5

    :cond_6
    iget-wide v1, v8, Lf4/r;->h:J

    :goto_5
    invoke-static {v10, v11, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    new-instance v3, Lf4/k$a;

    iget-object v4, v0, Lf4/k;->r:Lx3/m;

    move-wide/from16 v21, v10

    iget v10, v5, Lf4/o;->b:I

    invoke-interface {v4, v6, v10}, Lx3/m;->e(II)Lx3/b0;

    move-result-object v4

    invoke-direct {v3, v5, v8, v4}, Lf4/k$a;-><init>(Lf4/o;Lf4/r;Lx3/b0;)V

    iget-object v4, v5, Lf4/o;->f:Ls3/m1;

    iget-object v4, v4, Ls3/m1;->s:Ljava/lang/String;

    const-string v10, "audio/true-hd"

    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    iget v4, v8, Lf4/r;->e:I

    mul-int/lit8 v4, v4, 0x10

    goto :goto_6

    :cond_7
    iget v4, v8, Lf4/r;->e:I

    add-int/lit8 v4, v4, 0x1e

    :goto_6
    iget-object v10, v5, Lf4/o;->f:Ls3/m1;

    invoke-virtual {v10}, Ls3/m1;->b()Ls3/m1$b;

    move-result-object v10

    invoke-virtual {v10, v4}, Ls3/m1$b;->Y(I)Ls3/m1$b;

    iget v4, v5, Lf4/o;->b:I

    const/4 v11, 0x2

    if-ne v4, v11, :cond_8

    const-wide/16 v23, 0x0

    cmp-long v4, v1, v23

    if-lez v4, :cond_8

    iget v4, v8, Lf4/r;->b:I

    const/4 v8, 0x1

    if-le v4, v8, :cond_8

    int-to-float v4, v4

    long-to-float v1, v1

    const v2, 0x49742400    # 1000000.0f

    div-float/2addr v1, v2

    div-float/2addr v4, v1

    invoke-virtual {v10, v4}, Ls3/m1$b;->R(F)Ls3/m1$b;

    :cond_8
    iget v1, v5, Lf4/o;->b:I

    invoke-static {v1, v12, v10}, Lf4/h;->k(ILx3/v;Ls3/m1$b;)V

    iget v1, v5, Lf4/o;->b:I

    new-array v2, v11, [Lk4/a;

    const/4 v4, 0x0

    aput-object v14, v2, v4

    iget-object v4, v0, Lf4/k;->h:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, 0x0

    goto :goto_7

    :cond_9
    new-instance v4, Lk4/a;

    iget-object v8, v0, Lf4/k;->h:Ljava/util/List;

    invoke-direct {v4, v8}, Lk4/a;-><init>(Ljava/util/List;)V

    :goto_7
    const/4 v8, 0x1

    aput-object v4, v2, v8

    invoke-static {v1, v15, v13, v10, v2}, Lf4/h;->l(ILk4/a;Lk4/a;Ls3/m1$b;[Lk4/a;)V

    iget-object v1, v3, Lf4/k$a;->c:Lx3/b0;

    invoke-virtual {v10}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v2

    invoke-interface {v1, v2}, Lx3/b0;->b(Ls3/m1;)V

    iget v1, v5, Lf4/o;->b:I

    if-ne v1, v11, :cond_a

    const/4 v1, -0x1

    if-ne v7, v1, :cond_b

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v2

    move v7, v2

    goto :goto_8

    :cond_a
    const/4 v1, -0x1

    :cond_b
    :goto_8
    invoke-interface {v9, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-wide/from16 v10, v21

    :goto_9
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v1, v18

    move/from16 v2, v19

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    goto/16 :goto_4

    :cond_c
    iput v7, v0, Lf4/k;->u:I

    iput-wide v10, v0, Lf4/k;->v:J

    const/4 v1, 0x0

    new-array v1, v1, [Lf4/k$a;

    invoke-interface {v9, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lf4/k$a;

    iput-object v1, v0, Lf4/k;->s:[Lf4/k$a;

    invoke-static {v1}, Lf4/k;->m([Lf4/k$a;)[[J

    move-result-object v1

    iput-object v1, v0, Lf4/k;->t:[[J

    iget-object v1, v0, Lf4/k;->r:Lx3/m;

    invoke-interface {v1}, Lx3/m;->n()V

    iget-object v1, v0, Lf4/k;->r:Lx3/m;

    invoke-interface {v1, v0}, Lx3/m;->j(Lx3/z;)V

    return-void
.end method

.method public final z(J)V
    .locals 13

    iget v0, p0, Lf4/k;->j:I

    const v1, 0x6d707664

    if-ne v0, v1, :cond_0

    new-instance v0, Lq4/b;

    const-wide/16 v3, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    iget v1, p0, Lf4/k;->l:I

    int-to-long v5, v1

    add-long v9, p1, v5

    iget-wide v5, p0, Lf4/k;->k:J

    int-to-long v1, v1

    sub-long v11, v5, v1

    move-object v2, v0

    move-wide v5, p1

    invoke-direct/range {v2 .. v12}, Lq4/b;-><init>(JJJJJ)V

    iput-object v0, p0, Lf4/k;->x:Lq4/b;

    :cond_0
    return-void
.end method
