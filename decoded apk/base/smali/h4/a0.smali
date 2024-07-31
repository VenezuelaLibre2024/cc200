.class public final Lh4/a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh4/a0$a;
    }
.end annotation


# static fields
.field public static final l:Lx3/p;


# instance fields
.field public final a:Lp5/j0;

.field public final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lh4/a0$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lp5/a0;

.field public final d:Lh4/y;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:J

.field public i:Lh4/x;

.field public j:Lx3/m;

.field public k:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lh4/z;->b:Lh4/z;

    sput-object v0, Lh4/a0;->l:Lx3/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    new-instance v0, Lp5/j0;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lp5/j0;-><init>(J)V

    invoke-direct {p0, v0}, Lh4/a0;-><init>(Lp5/j0;)V

    return-void
.end method

.method public constructor <init>(Lp5/j0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/a0;->a:Lp5/j0;

    new-instance p1, Lp5/a0;

    const/16 v0, 0x1000

    invoke-direct {p1, v0}, Lp5/a0;-><init>(I)V

    iput-object p1, p0, Lh4/a0;->c:Lp5/a0;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lh4/a0;->b:Landroid/util/SparseArray;

    new-instance p1, Lh4/y;

    invoke-direct {p1}, Lh4/y;-><init>()V

    iput-object p1, p0, Lh4/a0;->d:Lh4/y;

    return-void
.end method

.method public static synthetic a()[Lx3/k;
    .locals 1

    invoke-static {}, Lh4/a0;->d()[Lx3/k;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()[Lx3/k;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lx3/k;

    new-instance v1, Lh4/a0;

    invoke-direct {v1}, Lh4/a0;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public b(Lx3/m;)V
    .locals 0

    iput-object p1, p0, Lh4/a0;->j:Lx3/m;

    return-void
.end method

.method public c(JJ)V
    .locals 5

    iget-object p1, p0, Lh4/a0;->a:Lp5/j0;

    invoke-virtual {p1}, Lp5/j0;->e()J

    move-result-wide p1

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p1, v0

    const/4 p2, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    move p1, p2

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    if-nez p1, :cond_2

    iget-object p1, p0, Lh4/a0;->a:Lp5/j0;

    invoke-virtual {p1}, Lp5/j0;->c()J

    move-result-wide v3

    cmp-long p1, v3, v0

    if-eqz p1, :cond_1

    const-wide/16 v0, 0x0

    cmp-long p1, v3, v0

    if-eqz p1, :cond_1

    cmp-long p1, v3, p3

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move p2, v2

    :goto_1
    move p1, p2

    :cond_2
    if-eqz p1, :cond_3

    iget-object p1, p0, Lh4/a0;->a:Lp5/j0;

    invoke-virtual {p1, p3, p4}, Lp5/j0;->g(J)V

    :cond_3
    iget-object p1, p0, Lh4/a0;->i:Lh4/x;

    if-eqz p1, :cond_4

    invoke-virtual {p1, p3, p4}, Lx3/a;->h(J)V

    :cond_4
    :goto_2
    iget-object p1, p0, Lh4/a0;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    iget-object p1, p0, Lh4/a0;->b:Landroid/util/SparseArray;

    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh4/a0$a;

    invoke-virtual {p1}, Lh4/a0$a;->d()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    return-void
.end method

.method public final e(J)V
    .locals 7

    iget-boolean v0, p0, Lh4/a0;->k:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh4/a0;->k:Z

    iget-object v0, p0, Lh4/a0;->d:Lh4/y;

    invoke-virtual {v0}, Lh4/y;->c()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    new-instance v0, Lh4/x;

    iget-object v1, p0, Lh4/a0;->d:Lh4/y;

    invoke-virtual {v1}, Lh4/y;->d()Lp5/j0;

    move-result-object v2

    iget-object v1, p0, Lh4/a0;->d:Lh4/y;

    invoke-virtual {v1}, Lh4/y;->c()J

    move-result-wide v3

    move-object v1, v0

    move-wide v5, p1

    invoke-direct/range {v1 .. v6}, Lh4/x;-><init>(Lp5/j0;JJ)V

    iput-object v0, p0, Lh4/a0;->i:Lh4/x;

    iget-object p1, p0, Lh4/a0;->j:Lx3/m;

    invoke-virtual {v0}, Lx3/a;->b()Lx3/z;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lh4/a0;->j:Lx3/m;

    new-instance p2, Lx3/z$b;

    iget-object v0, p0, Lh4/a0;->d:Lh4/y;

    invoke-virtual {v0}, Lh4/y;->c()J

    move-result-wide v0

    invoke-direct {p2, v0, v1}, Lx3/z$b;-><init>(J)V

    :goto_0
    invoke-interface {p1, p2}, Lx3/m;->j(Lx3/z;)V

    :cond_1
    return-void
.end method

.method public g(Lx3/l;Lx3/y;)I
    .locals 9

    iget-object v0, p0, Lh4/a0;->j:Lx3/m;

    invoke-static {v0}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lx3/l;->b()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_0

    move v7, v5

    goto :goto_0

    :cond_0
    move v7, v6

    :goto_0
    if-eqz v7, :cond_1

    iget-object v7, p0, Lh4/a0;->d:Lh4/y;

    invoke-virtual {v7}, Lh4/y;->e()Z

    move-result v7

    if-nez v7, :cond_1

    iget-object v0, p0, Lh4/a0;->d:Lh4/y;

    invoke-virtual {v0, p1, p2}, Lh4/y;->g(Lx3/l;Lx3/y;)I

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p0, v0, v1}, Lh4/a0;->e(J)V

    iget-object v7, p0, Lh4/a0;->i:Lh4/x;

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Lx3/a;->d()Z

    move-result v7

    if-eqz v7, :cond_2

    iget-object v0, p0, Lh4/a0;->i:Lh4/x;

    invoke-virtual {v0, p1, p2}, Lx3/a;->c(Lx3/l;Lx3/y;)I

    move-result p1

    return p1

    :cond_2
    invoke-interface {p1}, Lx3/l;->l()V

    if-eqz v4, :cond_3

    invoke-interface {p1}, Lx3/l;->f()J

    move-result-wide v7

    sub-long/2addr v0, v7

    goto :goto_1

    :cond_3
    move-wide v0, v2

    :goto_1
    cmp-long p2, v0, v2

    const/4 v2, -0x1

    if-eqz p2, :cond_4

    const-wide/16 v3, 0x4

    cmp-long p2, v0, v3

    if-gez p2, :cond_4

    return v2

    :cond_4
    iget-object p2, p0, Lh4/a0;->c:Lp5/a0;

    invoke-virtual {p2}, Lp5/a0;->e()[B

    move-result-object p2

    const/4 v0, 0x4

    invoke-interface {p1, p2, v6, v0, v5}, Lx3/l;->e([BIIZ)Z

    move-result p2

    if-nez p2, :cond_5

    return v2

    :cond_5
    iget-object p2, p0, Lh4/a0;->c:Lp5/a0;

    invoke-virtual {p2, v6}, Lp5/a0;->T(I)V

    iget-object p2, p0, Lh4/a0;->c:Lp5/a0;

    invoke-virtual {p2}, Lp5/a0;->p()I

    move-result p2

    const/16 v0, 0x1b9

    if-ne p2, v0, :cond_6

    return v2

    :cond_6
    const/16 v0, 0x1ba

    if-ne p2, v0, :cond_7

    iget-object p2, p0, Lh4/a0;->c:Lp5/a0;

    invoke-virtual {p2}, Lp5/a0;->e()[B

    move-result-object p2

    const/16 v0, 0xa

    invoke-interface {p1, p2, v6, v0}, Lx3/l;->p([BII)V

    iget-object p2, p0, Lh4/a0;->c:Lp5/a0;

    const/16 v0, 0x9

    invoke-virtual {p2, v0}, Lp5/a0;->T(I)V

    iget-object p2, p0, Lh4/a0;->c:Lp5/a0;

    invoke-virtual {p2}, Lp5/a0;->G()I

    move-result p2

    and-int/lit8 p2, p2, 0x7

    add-int/lit8 p2, p2, 0xe

    :goto_2
    invoke-interface {p1, p2}, Lx3/l;->m(I)V

    return v6

    :cond_7
    const/16 v0, 0x1bb

    const/4 v1, 0x2

    const/4 v2, 0x6

    if-ne p2, v0, :cond_8

    iget-object p2, p0, Lh4/a0;->c:Lp5/a0;

    invoke-virtual {p2}, Lp5/a0;->e()[B

    move-result-object p2

    invoke-interface {p1, p2, v6, v1}, Lx3/l;->p([BII)V

    iget-object p2, p0, Lh4/a0;->c:Lp5/a0;

    invoke-virtual {p2, v6}, Lp5/a0;->T(I)V

    iget-object p2, p0, Lh4/a0;->c:Lp5/a0;

    invoke-virtual {p2}, Lp5/a0;->M()I

    move-result p2

    add-int/2addr p2, v2

    goto :goto_2

    :cond_8
    and-int/lit16 v0, p2, -0x100

    shr-int/lit8 v0, v0, 0x8

    if-eq v0, v5, :cond_9

    invoke-interface {p1, v5}, Lx3/l;->m(I)V

    return v6

    :cond_9
    and-int/lit16 p2, p2, 0xff

    iget-object v0, p0, Lh4/a0;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh4/a0$a;

    iget-boolean v3, p0, Lh4/a0;->e:Z

    if-nez v3, :cond_f

    if-nez v0, :cond_d

    const/4 v3, 0x0

    const/16 v4, 0xbd

    if-ne p2, v4, :cond_a

    new-instance v3, Lh4/c;

    invoke-direct {v3}, Lh4/c;-><init>()V

    :goto_3
    iput-boolean v5, p0, Lh4/a0;->f:Z

    :goto_4
    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v7

    iput-wide v7, p0, Lh4/a0;->h:J

    goto :goto_5

    :cond_a
    and-int/lit16 v4, p2, 0xe0

    const/16 v7, 0xc0

    if-ne v4, v7, :cond_b

    new-instance v3, Lh4/t;

    invoke-direct {v3}, Lh4/t;-><init>()V

    goto :goto_3

    :cond_b
    and-int/lit16 v4, p2, 0xf0

    const/16 v7, 0xe0

    if-ne v4, v7, :cond_c

    new-instance v3, Lh4/n;

    invoke-direct {v3}, Lh4/n;-><init>()V

    iput-boolean v5, p0, Lh4/a0;->g:Z

    goto :goto_4

    :cond_c
    :goto_5
    if-eqz v3, :cond_d

    new-instance v0, Lh4/i0$d;

    const/16 v4, 0x100

    invoke-direct {v0, p2, v4}, Lh4/i0$d;-><init>(II)V

    iget-object v4, p0, Lh4/a0;->j:Lx3/m;

    invoke-interface {v3, v4, v0}, Lh4/m;->e(Lx3/m;Lh4/i0$d;)V

    new-instance v0, Lh4/a0$a;

    iget-object v4, p0, Lh4/a0;->a:Lp5/j0;

    invoke-direct {v0, v3, v4}, Lh4/a0$a;-><init>(Lh4/m;Lp5/j0;)V

    iget-object v3, p0, Lh4/a0;->b:Landroid/util/SparseArray;

    invoke-virtual {v3, p2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_d
    iget-boolean p2, p0, Lh4/a0;->f:Z

    if-eqz p2, :cond_e

    iget-boolean p2, p0, Lh4/a0;->g:Z

    if-eqz p2, :cond_e

    iget-wide v3, p0, Lh4/a0;->h:J

    const-wide/16 v7, 0x2000

    add-long/2addr v3, v7

    goto :goto_6

    :cond_e
    const-wide/32 v3, 0x100000

    :goto_6
    invoke-interface {p1}, Lx3/l;->getPosition()J

    move-result-wide v7

    cmp-long p2, v7, v3

    if-lez p2, :cond_f

    iput-boolean v5, p0, Lh4/a0;->e:Z

    iget-object p2, p0, Lh4/a0;->j:Lx3/m;

    invoke-interface {p2}, Lx3/m;->n()V

    :cond_f
    iget-object p2, p0, Lh4/a0;->c:Lp5/a0;

    invoke-virtual {p2}, Lp5/a0;->e()[B

    move-result-object p2

    invoke-interface {p1, p2, v6, v1}, Lx3/l;->p([BII)V

    iget-object p2, p0, Lh4/a0;->c:Lp5/a0;

    invoke-virtual {p2, v6}, Lp5/a0;->T(I)V

    iget-object p2, p0, Lh4/a0;->c:Lp5/a0;

    invoke-virtual {p2}, Lp5/a0;->M()I

    move-result p2

    add-int/2addr p2, v2

    if-nez v0, :cond_10

    invoke-interface {p1, p2}, Lx3/l;->m(I)V

    goto :goto_7

    :cond_10
    iget-object v1, p0, Lh4/a0;->c:Lp5/a0;

    invoke-virtual {v1, p2}, Lp5/a0;->P(I)V

    iget-object v1, p0, Lh4/a0;->c:Lp5/a0;

    invoke-virtual {v1}, Lp5/a0;->e()[B

    move-result-object v1

    invoke-interface {p1, v1, v6, p2}, Lx3/l;->readFully([BII)V

    iget-object p1, p0, Lh4/a0;->c:Lp5/a0;

    invoke-virtual {p1, v2}, Lp5/a0;->T(I)V

    iget-object p1, p0, Lh4/a0;->c:Lp5/a0;

    invoke-virtual {v0, p1}, Lh4/a0$a;->a(Lp5/a0;)V

    iget-object p1, p0, Lh4/a0;->c:Lp5/a0;

    invoke-virtual {p1}, Lp5/a0;->b()I

    move-result p2

    invoke-virtual {p1, p2}, Lp5/a0;->S(I)V

    :goto_7
    return v6
.end method

.method public h(Lx3/l;)Z
    .locals 9

    const/16 v0, 0xe

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-interface {p1, v1, v2, v0}, Lx3/l;->p([BII)V

    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    const/4 v3, 0x1

    aget-byte v4, v1, v3

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v0, v4

    const/4 v4, 0x2

    aget-byte v5, v1, v4

    and-int/lit16 v5, v5, 0xff

    const/16 v6, 0x8

    shl-int/2addr v5, v6

    or-int/2addr v0, v5

    const/4 v5, 0x3

    aget-byte v7, v1, v5

    and-int/lit16 v7, v7, 0xff

    or-int/2addr v0, v7

    const/16 v7, 0x1ba

    if-eq v7, v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x4

    aget-byte v7, v1, v0

    and-int/lit16 v7, v7, 0xc4

    const/16 v8, 0x44

    if-eq v7, v8, :cond_1

    return v2

    :cond_1
    const/4 v7, 0x6

    aget-byte v7, v1, v7

    and-int/2addr v7, v0

    if-eq v7, v0, :cond_2

    return v2

    :cond_2
    aget-byte v7, v1, v6

    and-int/2addr v7, v0

    if-eq v7, v0, :cond_3

    return v2

    :cond_3
    const/16 v0, 0x9

    aget-byte v0, v1, v0

    and-int/2addr v0, v3

    if-eq v0, v3, :cond_4

    return v2

    :cond_4
    const/16 v0, 0xc

    aget-byte v0, v1, v0

    and-int/2addr v0, v5

    if-eq v0, v5, :cond_5

    return v2

    :cond_5
    const/16 v0, 0xd

    aget-byte v0, v1, v0

    and-int/lit8 v0, v0, 0x7

    invoke-interface {p1, v0}, Lx3/l;->h(I)V

    invoke-interface {p1, v1, v2, v5}, Lx3/l;->p([BII)V

    aget-byte p1, v1, v2

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x10

    aget-byte v0, v1, v3

    and-int/lit16 v0, v0, 0xff

    shl-int/2addr v0, v6

    or-int/2addr p1, v0

    aget-byte v0, v1, v4

    and-int/lit16 v0, v0, 0xff

    or-int/2addr p1, v0

    if-ne v3, p1, :cond_6

    move v2, v3

    :cond_6
    return v2
.end method

.method public release()V
    .locals 0

    return-void
.end method
