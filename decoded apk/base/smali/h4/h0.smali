.class public final Lh4/h0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh4/h0$b;,
        Lh4/h0$a;
    }
.end annotation


# static fields
.field public static final t:Lx3/p;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lp5/j0;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lp5/a0;

.field public final e:Landroid/util/SparseIntArray;

.field public final f:Lh4/i0$c;

.field public final g:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lh4/i0;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Landroid/util/SparseBooleanArray;

.field public final i:Landroid/util/SparseBooleanArray;

.field public final j:Lh4/f0;

.field public k:Lh4/e0;

.field public l:Lx3/m;

.field public m:I

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Lh4/i0;

.field public r:I

.field public s:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lh4/g0;->b:Lh4/g0;

    sput-object v0, Lh4/h0;->t:Lx3/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lh4/h0;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x1

    const v1, 0x1b8a0

    invoke-direct {p0, v0, p1, v1}, Lh4/h0;-><init>(III)V

    return-void
.end method

.method public constructor <init>(III)V
    .locals 3

    new-instance v0, Lp5/j0;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lp5/j0;-><init>(J)V

    new-instance v1, Lh4/j;

    invoke-direct {v1, p2}, Lh4/j;-><init>(I)V

    invoke-direct {p0, p1, v0, v1, p3}, Lh4/h0;-><init>(ILp5/j0;Lh4/i0$c;I)V

    return-void
.end method

.method public constructor <init>(ILp5/j0;Lh4/i0$c;)V
    .locals 1

    const v0, 0x1b8a0

    invoke-direct {p0, p1, p2, p3, v0}, Lh4/h0;-><init>(ILp5/j0;Lh4/i0$c;I)V

    return-void
.end method

.method public constructor <init>(ILp5/j0;Lh4/i0$c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p3}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lh4/i0$c;

    iput-object p3, p0, Lh4/h0;->f:Lh4/i0$c;

    iput p4, p0, Lh4/h0;->b:I

    iput p1, p0, Lh4/h0;->a:I

    const/4 p3, 0x1

    if-eq p1, p3, :cond_1

    const/4 p3, 0x2

    if-ne p1, p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lh4/h0;->c:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lh4/h0;->c:Ljava/util/List;

    :goto_1
    new-instance p1, Lp5/a0;

    const/16 p2, 0x24b8

    new-array p2, p2, [B

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Lp5/a0;-><init>([BI)V

    iput-object p1, p0, Lh4/h0;->d:Lp5/a0;

    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Lh4/h0;->h:Landroid/util/SparseBooleanArray;

    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Lh4/h0;->i:Landroid/util/SparseBooleanArray;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lh4/h0;->g:Landroid/util/SparseArray;

    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Lh4/h0;->e:Landroid/util/SparseIntArray;

    new-instance p1, Lh4/f0;

    invoke-direct {p1, p4}, Lh4/f0;-><init>(I)V

    iput-object p1, p0, Lh4/h0;->j:Lh4/f0;

    sget-object p1, Lx3/m;->g:Lx3/m;

    iput-object p1, p0, Lh4/h0;->l:Lx3/m;

    const/4 p1, -0x1

    iput p1, p0, Lh4/h0;->s:I

    invoke-virtual {p0}, Lh4/h0;->y()V

    return-void
.end method

.method public static synthetic a()[Lx3/k;
    .locals 1

    invoke-static {}, Lh4/h0;->w()[Lx3/k;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lh4/h0;)Landroid/util/SparseArray;
    .locals 0

    iget-object p0, p0, Lh4/h0;->g:Landroid/util/SparseArray;

    return-object p0
.end method

.method public static synthetic e(Lh4/h0;)I
    .locals 0

    iget p0, p0, Lh4/h0;->m:I

    return p0
.end method

.method public static synthetic f(Lh4/h0;)Z
    .locals 0

    iget-boolean p0, p0, Lh4/h0;->n:Z

    return p0
.end method

.method public static synthetic i(Lh4/h0;Z)Z
    .locals 0

    iput-boolean p1, p0, Lh4/h0;->n:Z

    return p1
.end method

.method public static synthetic j(Lh4/h0;I)I
    .locals 0

    iput p1, p0, Lh4/h0;->m:I

    return p1
.end method

.method public static synthetic k(Lh4/h0;)I
    .locals 2

    iget v0, p0, Lh4/h0;->m:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lh4/h0;->m:I

    return v0
.end method

.method public static synthetic l(Lh4/h0;)I
    .locals 0

    iget p0, p0, Lh4/h0;->a:I

    return p0
.end method

.method public static synthetic m(Lh4/h0;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lh4/h0;->c:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic n(Lh4/h0;I)I
    .locals 0

    iput p1, p0, Lh4/h0;->s:I

    return p1
.end method

.method public static synthetic o(Lh4/h0;)Lh4/i0;
    .locals 0

    iget-object p0, p0, Lh4/h0;->q:Lh4/i0;

    return-object p0
.end method

.method public static synthetic p(Lh4/h0;Lh4/i0;)Lh4/i0;
    .locals 0

    iput-object p1, p0, Lh4/h0;->q:Lh4/i0;

    return-object p1
.end method

.method public static synthetic q(Lh4/h0;)Lh4/i0$c;
    .locals 0

    iget-object p0, p0, Lh4/h0;->f:Lh4/i0$c;

    return-object p0
.end method

.method public static synthetic r(Lh4/h0;)Lx3/m;
    .locals 0

    iget-object p0, p0, Lh4/h0;->l:Lx3/m;

    return-object p0
.end method

.method public static synthetic s(Lh4/h0;)Landroid/util/SparseBooleanArray;
    .locals 0

    iget-object p0, p0, Lh4/h0;->h:Landroid/util/SparseBooleanArray;

    return-object p0
.end method

.method public static synthetic t(Lh4/h0;)Landroid/util/SparseBooleanArray;
    .locals 0

    iget-object p0, p0, Lh4/h0;->i:Landroid/util/SparseBooleanArray;

    return-object p0
.end method

.method public static synthetic w()[Lx3/k;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lx3/k;

    new-instance v1, Lh4/h0;

    invoke-direct {v1}, Lh4/h0;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public b(Lx3/m;)V
    .locals 0

    iput-object p1, p0, Lh4/h0;->l:Lx3/m;

    return-void
.end method

.method public c(JJ)V
    .locals 9

    iget p1, p0, Lh4/h0;->a:I

    const/4 p2, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    move p1, p2

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    invoke-static {p1}, Lp5/a;->f(Z)V

    iget-object p1, p0, Lh4/h0;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    move v1, v0

    :goto_1
    const-wide/16 v2, 0x0

    if-ge v1, p1, :cond_5

    iget-object v4, p0, Lh4/h0;->c:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp5/j0;

    invoke-virtual {v4}, Lp5/j0;->e()J

    move-result-wide v5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v5, v7

    if-nez v5, :cond_1

    move v5, p2

    goto :goto_2

    :cond_1
    move v5, v0

    :goto_2
    if-nez v5, :cond_3

    invoke-virtual {v4}, Lp5/j0;->c()J

    move-result-wide v5

    cmp-long v7, v5, v7

    if-eqz v7, :cond_2

    cmp-long v2, v5, v2

    if-eqz v2, :cond_2

    cmp-long v2, v5, p3

    if-eqz v2, :cond_2

    move v5, p2

    goto :goto_3

    :cond_2
    move v5, v0

    :cond_3
    :goto_3
    if-eqz v5, :cond_4

    invoke-virtual {v4, p3, p4}, Lp5/j0;->g(J)V

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    cmp-long p1, p3, v2

    if-eqz p1, :cond_6

    iget-object p1, p0, Lh4/h0;->k:Lh4/e0;

    if-eqz p1, :cond_6

    invoke-virtual {p1, p3, p4}, Lx3/a;->h(J)V

    :cond_6
    iget-object p1, p0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {p1, v0}, Lp5/a0;->P(I)V

    iget-object p1, p0, Lh4/h0;->e:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    move p1, v0

    :goto_4
    iget-object p2, p0, Lh4/h0;->g:Landroid/util/SparseArray;

    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result p2

    if-ge p1, p2, :cond_7

    iget-object p2, p0, Lh4/h0;->g:Landroid/util/SparseArray;

    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lh4/i0;

    invoke-interface {p2}, Lh4/i0;->c()V

    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_7
    iput v0, p0, Lh4/h0;->r:I

    return-void
.end method

.method public g(Lx3/l;Lx3/y;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-interface/range {p1 .. p1}, Lx3/l;->b()J

    move-result-wide v3

    iget-boolean v5, v0, Lh4/h0;->n:Z

    const-wide/16 v6, -0x1

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v5, :cond_3

    cmp-long v5, v3, v6

    if-eqz v5, :cond_0

    iget v5, v0, Lh4/h0;->a:I

    if-eq v5, v8, :cond_0

    move v5, v9

    goto :goto_0

    :cond_0
    move v5, v10

    :goto_0
    if-eqz v5, :cond_1

    iget-object v5, v0, Lh4/h0;->j:Lh4/f0;

    invoke-virtual {v5}, Lh4/f0;->d()Z

    move-result v5

    if-nez v5, :cond_1

    iget-object v3, v0, Lh4/h0;->j:Lh4/f0;

    iget v4, v0, Lh4/h0;->s:I

    invoke-virtual {v3, v1, v2, v4}, Lh4/f0;->e(Lx3/l;Lx3/y;I)I

    move-result v1

    return v1

    :cond_1
    invoke-virtual {v0, v3, v4}, Lh4/h0;->x(J)V

    iget-boolean v5, v0, Lh4/h0;->p:Z

    if-eqz v5, :cond_2

    iput-boolean v10, v0, Lh4/h0;->p:Z

    const-wide/16 v11, 0x0

    invoke-virtual {v0, v11, v12, v11, v12}, Lh4/h0;->c(JJ)V

    invoke-interface/range {p1 .. p1}, Lx3/l;->getPosition()J

    move-result-wide v13

    cmp-long v5, v13, v11

    if-eqz v5, :cond_2

    iput-wide v11, v2, Lx3/y;->a:J

    return v9

    :cond_2
    iget-object v5, v0, Lh4/h0;->k:Lh4/e0;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lx3/a;->d()Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v3, v0, Lh4/h0;->k:Lh4/e0;

    invoke-virtual {v3, v1, v2}, Lx3/a;->c(Lx3/l;Lx3/y;)I

    move-result v1

    return v1

    :cond_3
    invoke-virtual/range {p0 .. p1}, Lh4/h0;->u(Lx3/l;)Z

    move-result v1

    if-nez v1, :cond_4

    const/4 v1, -0x1

    return v1

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lh4/h0;->v()I

    move-result v1

    iget-object v2, v0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v2}, Lp5/a0;->g()I

    move-result v2

    if-le v1, v2, :cond_5

    return v10

    :cond_5
    iget-object v5, v0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v5}, Lp5/a0;->p()I

    move-result v5

    const/high16 v11, 0x800000

    and-int/2addr v11, v5

    if-eqz v11, :cond_7

    :cond_6
    :goto_1
    iget-object v2, v0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v2, v1}, Lp5/a0;->T(I)V

    return v10

    :cond_7
    const/high16 v11, 0x400000

    and-int/2addr v11, v5

    if-eqz v11, :cond_8

    move v11, v9

    goto :goto_2

    :cond_8
    move v11, v10

    :goto_2
    or-int/2addr v11, v10

    const v12, 0x1fff00

    and-int/2addr v12, v5

    shr-int/lit8 v12, v12, 0x8

    and-int/lit8 v13, v5, 0x20

    if-eqz v13, :cond_9

    move v13, v9

    goto :goto_3

    :cond_9
    move v13, v10

    :goto_3
    and-int/lit8 v14, v5, 0x10

    if-eqz v14, :cond_a

    move v14, v9

    goto :goto_4

    :cond_a
    move v14, v10

    :goto_4
    if-eqz v14, :cond_b

    iget-object v14, v0, Lh4/h0;->g:Landroid/util/SparseArray;

    invoke-virtual {v14, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lh4/i0;

    goto :goto_5

    :cond_b
    const/4 v14, 0x0

    :goto_5
    if-nez v14, :cond_c

    goto :goto_1

    :cond_c
    iget v15, v0, Lh4/h0;->a:I

    if-eq v15, v8, :cond_e

    and-int/lit8 v5, v5, 0xf

    iget-object v15, v0, Lh4/h0;->e:Landroid/util/SparseIntArray;

    add-int/lit8 v6, v5, -0x1

    invoke-virtual {v15, v12, v6}, Landroid/util/SparseIntArray;->get(II)I

    move-result v6

    iget-object v7, v0, Lh4/h0;->e:Landroid/util/SparseIntArray;

    invoke-virtual {v7, v12, v5}, Landroid/util/SparseIntArray;->put(II)V

    if-ne v6, v5, :cond_d

    goto :goto_1

    :cond_d
    add-int/2addr v6, v9

    and-int/lit8 v6, v6, 0xf

    if-eq v5, v6, :cond_e

    invoke-interface {v14}, Lh4/i0;->c()V

    :cond_e
    if-eqz v13, :cond_10

    iget-object v5, v0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v5}, Lp5/a0;->G()I

    move-result v5

    iget-object v6, v0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v6}, Lp5/a0;->G()I

    move-result v6

    and-int/lit8 v6, v6, 0x40

    if-eqz v6, :cond_f

    move v6, v8

    goto :goto_6

    :cond_f
    move v6, v10

    :goto_6
    or-int/2addr v11, v6

    iget-object v6, v0, Lh4/h0;->d:Lp5/a0;

    sub-int/2addr v5, v9

    invoke-virtual {v6, v5}, Lp5/a0;->U(I)V

    :cond_10
    iget-boolean v5, v0, Lh4/h0;->n:Z

    invoke-virtual {v0, v12}, Lh4/h0;->z(I)Z

    move-result v6

    if-eqz v6, :cond_11

    iget-object v6, v0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v6, v1}, Lp5/a0;->S(I)V

    iget-object v6, v0, Lh4/h0;->d:Lp5/a0;

    invoke-interface {v14, v6, v11}, Lh4/i0;->a(Lp5/a0;I)V

    iget-object v6, v0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v6, v2}, Lp5/a0;->S(I)V

    :cond_11
    iget v2, v0, Lh4/h0;->a:I

    if-eq v2, v8, :cond_6

    if-nez v5, :cond_6

    iget-boolean v2, v0, Lh4/h0;->n:Z

    if-eqz v2, :cond_6

    const-wide/16 v5, -0x1

    cmp-long v2, v3, v5

    if-eqz v2, :cond_6

    iput-boolean v9, v0, Lh4/h0;->p:Z

    goto/16 :goto_1
.end method

.method public h(Lx3/l;)Z
    .locals 7

    iget-object v0, p0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x3ac

    invoke-interface {p1, v0, v1, v2}, Lx3/l;->p([BII)V

    move v2, v1

    :goto_0
    const/16 v3, 0xbc

    if-ge v2, v3, :cond_3

    move v3, v1

    :goto_1
    const/4 v4, 0x5

    const/4 v5, 0x1

    if-ge v3, v4, :cond_1

    mul-int/lit16 v4, v3, 0xbc

    add-int/2addr v4, v2

    aget-byte v4, v0, v4

    const/16 v6, 0x47

    if-eq v4, v6, :cond_0

    move v3, v1

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_2
    if-eqz v3, :cond_2

    invoke-interface {p1, v2}, Lx3/l;->m(I)V

    return v5

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method public release()V
    .locals 0

    return-void
.end method

.method public final u(Lx3/l;)Z
    .locals 6

    iget-object v0, p0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->e()[B

    move-result-object v0

    iget-object v1, p0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v1}, Lp5/a0;->f()I

    move-result v1

    rsub-int v1, v1, 0x24b8

    const/4 v2, 0x0

    const/16 v3, 0xbc

    if-ge v1, v3, :cond_1

    iget-object v1, p0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v1}, Lp5/a0;->a()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v4, p0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v4}, Lp5/a0;->f()I

    move-result v4

    invoke-static {v0, v4, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    iget-object v4, p0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v4, v0, v1}, Lp5/a0;->R([BI)V

    :cond_1
    :goto_0
    iget-object v1, p0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v1}, Lp5/a0;->a()I

    move-result v1

    if-ge v1, v3, :cond_3

    iget-object v1, p0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v1}, Lp5/a0;->g()I

    move-result v1

    rsub-int v4, v1, 0x24b8

    invoke-interface {p1, v0, v1, v4}, Lx3/l;->c([BII)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_2

    return v2

    :cond_2
    iget-object v5, p0, Lh4/h0;->d:Lp5/a0;

    add-int/2addr v1, v4

    invoke-virtual {v5, v1}, Lp5/a0;->S(I)V

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final v()I
    .locals 4

    iget-object v0, p0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->f()I

    move-result v0

    iget-object v1, p0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v1}, Lp5/a0;->g()I

    move-result v1

    iget-object v2, p0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v2}, Lp5/a0;->e()[B

    move-result-object v2

    invoke-static {v2, v0, v1}, Lh4/j0;->a([BII)I

    move-result v2

    iget-object v3, p0, Lh4/h0;->d:Lp5/a0;

    invoke-virtual {v3, v2}, Lp5/a0;->T(I)V

    add-int/lit16 v3, v2, 0xbc

    if-le v3, v1, :cond_1

    iget v1, p0, Lh4/h0;->r:I

    sub-int/2addr v2, v0

    add-int/2addr v1, v2

    iput v1, p0, Lh4/h0;->r:I

    iget v0, p0, Lh4/h0;->a:I

    const/4 v2, 0x2

    if-ne v0, v2, :cond_2

    const/16 v0, 0x178

    if-gt v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const-string v1, "Cannot find sync byte. Most likely not a Transport Stream."

    invoke-static {v1, v0}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object v0

    throw v0

    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lh4/h0;->r:I

    :cond_2
    :goto_0
    return v3
.end method

.method public final x(J)V
    .locals 9

    iget-boolean v0, p0, Lh4/h0;->o:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh4/h0;->o:Z

    iget-object v0, p0, Lh4/h0;->j:Lh4/f0;

    invoke-virtual {v0}, Lh4/f0;->b()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    new-instance v0, Lh4/e0;

    iget-object v1, p0, Lh4/h0;->j:Lh4/f0;

    invoke-virtual {v1}, Lh4/f0;->c()Lp5/j0;

    move-result-object v2

    iget-object v1, p0, Lh4/h0;->j:Lh4/f0;

    invoke-virtual {v1}, Lh4/f0;->b()J

    move-result-wide v3

    iget v7, p0, Lh4/h0;->s:I

    iget v8, p0, Lh4/h0;->b:I

    move-object v1, v0

    move-wide v5, p1

    invoke-direct/range {v1 .. v8}, Lh4/e0;-><init>(Lp5/j0;JJII)V

    iput-object v0, p0, Lh4/h0;->k:Lh4/e0;

    iget-object p1, p0, Lh4/h0;->l:Lx3/m;

    invoke-virtual {v0}, Lx3/a;->b()Lx3/z;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lh4/h0;->l:Lx3/m;

    new-instance p2, Lx3/z$b;

    iget-object v0, p0, Lh4/h0;->j:Lh4/f0;

    invoke-virtual {v0}, Lh4/f0;->b()J

    move-result-wide v0

    invoke-direct {p2, v0, v1}, Lx3/z$b;-><init>(J)V

    :goto_0
    invoke-interface {p1, p2}, Lx3/m;->j(Lx3/z;)V

    :cond_1
    return-void
.end method

.method public final y()V
    .locals 7

    iget-object v0, p0, Lh4/h0;->h:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0}, Landroid/util/SparseBooleanArray;->clear()V

    iget-object v0, p0, Lh4/h0;->g:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    iget-object v0, p0, Lh4/h0;->f:Lh4/i0$c;

    invoke-interface {v0}, Lh4/i0$c;->a()Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    iget-object v4, p0, Lh4/h0;->g:Landroid/util/SparseArray;

    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v5

    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lh4/i0;

    invoke-virtual {v4, v5, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lh4/h0;->g:Landroid/util/SparseArray;

    new-instance v1, Lh4/c0;

    new-instance v3, Lh4/h0$a;

    invoke-direct {v3, p0}, Lh4/h0$a;-><init>(Lh4/h0;)V

    invoke-direct {v1, v3}, Lh4/c0;-><init>(Lh4/b0;)V

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lh4/h0;->q:Lh4/i0;

    return-void
.end method

.method public final z(I)Z
    .locals 3

    iget v0, p0, Lh4/h0;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    iget-boolean v0, p0, Lh4/h0;->n:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lh4/h0;->i:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    return v1
.end method
