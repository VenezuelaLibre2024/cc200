.class public Lh4/h0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh4/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh4/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final a:Lp5/z;

.field public final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lh4/i0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Landroid/util/SparseIntArray;

.field public final d:I

.field public final synthetic e:Lh4/h0;


# direct methods
.method public constructor <init>(Lh4/h0;I)V
    .locals 1

    iput-object p1, p0, Lh4/h0$b;->e:Lh4/h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lp5/z;

    const/4 v0, 0x5

    new-array v0, v0, [B

    invoke-direct {p1, v0}, Lp5/z;-><init>([B)V

    iput-object p1, p0, Lh4/h0$b;->a:Lp5/z;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lh4/h0$b;->b:Landroid/util/SparseArray;

    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Lh4/h0$b;->c:Landroid/util/SparseIntArray;

    iput p2, p0, Lh4/h0$b;->d:I

    return-void
.end method


# virtual methods
.method public a(Lp5/a0;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->G()I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    return-void

    :cond_0
    iget-object v2, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v2}, Lh4/h0;->l(Lh4/h0;)I

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v2, v5, :cond_2

    iget-object v2, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v2}, Lh4/h0;->l(Lh4/h0;)I

    move-result v2

    if-eq v2, v3, :cond_2

    iget-object v2, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v2}, Lh4/h0;->e(Lh4/h0;)I

    move-result v2

    if-ne v2, v5, :cond_1

    goto :goto_0

    :cond_1
    new-instance v2, Lp5/j0;

    iget-object v6, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v6}, Lh4/h0;->m(Lh4/h0;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lp5/j0;

    invoke-virtual {v6}, Lp5/j0;->c()J

    move-result-wide v6

    invoke-direct {v2, v6, v7}, Lp5/j0;-><init>(J)V

    iget-object v6, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v6}, Lh4/h0;->m(Lh4/h0;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    :goto_0
    iget-object v2, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v2}, Lh4/h0;->m(Lh4/h0;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp5/j0;

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lp5/a0;->G()I

    move-result v6

    and-int/lit16 v6, v6, 0x80

    if-nez v6, :cond_3

    return-void

    :cond_3
    invoke-virtual {v1, v5}, Lp5/a0;->U(I)V

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->M()I

    move-result v6

    const/4 v7, 0x3

    invoke-virtual {v1, v7}, Lp5/a0;->U(I)V

    iget-object v8, v0, Lh4/h0$b;->a:Lp5/z;

    invoke-virtual {v1, v8, v3}, Lp5/a0;->k(Lp5/z;I)V

    iget-object v8, v0, Lh4/h0$b;->a:Lp5/z;

    invoke-virtual {v8, v7}, Lp5/z;->r(I)V

    iget-object v8, v0, Lh4/h0$b;->e:Lh4/h0;

    iget-object v9, v0, Lh4/h0$b;->a:Lp5/z;

    const/16 v10, 0xd

    invoke-virtual {v9, v10}, Lp5/z;->h(I)I

    move-result v9

    invoke-static {v8, v9}, Lh4/h0;->n(Lh4/h0;I)I

    iget-object v8, v0, Lh4/h0$b;->a:Lp5/z;

    invoke-virtual {v1, v8, v3}, Lp5/a0;->k(Lp5/z;I)V

    iget-object v8, v0, Lh4/h0$b;->a:Lp5/z;

    const/4 v9, 0x4

    invoke-virtual {v8, v9}, Lp5/z;->r(I)V

    iget-object v8, v0, Lh4/h0$b;->a:Lp5/z;

    const/16 v11, 0xc

    invoke-virtual {v8, v11}, Lp5/z;->h(I)I

    move-result v8

    invoke-virtual {v1, v8}, Lp5/a0;->U(I)V

    iget-object v8, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v8}, Lh4/h0;->l(Lh4/h0;)I

    move-result v8

    const/16 v12, 0x2000

    const/16 v13, 0x15

    if-ne v8, v3, :cond_4

    iget-object v8, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v8}, Lh4/h0;->o(Lh4/h0;)Lh4/i0;

    move-result-object v8

    if-nez v8, :cond_4

    new-instance v8, Lh4/i0$b;

    sget-object v14, Lp5/n0;->f:[B

    const/4 v15, 0x0

    invoke-direct {v8, v13, v15, v15, v14}, Lh4/i0$b;-><init>(ILjava/lang/String;Ljava/util/List;[B)V

    iget-object v14, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v14}, Lh4/h0;->q(Lh4/h0;)Lh4/i0$c;

    move-result-object v15

    invoke-interface {v15, v13, v8}, Lh4/i0$c;->b(ILh4/i0$b;)Lh4/i0;

    move-result-object v8

    invoke-static {v14, v8}, Lh4/h0;->p(Lh4/h0;Lh4/i0;)Lh4/i0;

    iget-object v8, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v8}, Lh4/h0;->o(Lh4/h0;)Lh4/i0;

    move-result-object v8

    if-eqz v8, :cond_4

    iget-object v8, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v8}, Lh4/h0;->o(Lh4/h0;)Lh4/i0;

    move-result-object v8

    iget-object v14, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v14}, Lh4/h0;->r(Lh4/h0;)Lx3/m;

    move-result-object v14

    new-instance v15, Lh4/i0$d;

    invoke-direct {v15, v6, v13, v12}, Lh4/i0$d;-><init>(III)V

    invoke-interface {v8, v2, v14, v15}, Lh4/i0;->b(Lp5/j0;Lx3/m;Lh4/i0$d;)V

    :cond_4
    iget-object v8, v0, Lh4/h0$b;->b:Landroid/util/SparseArray;

    invoke-virtual {v8}, Landroid/util/SparseArray;->clear()V

    iget-object v8, v0, Lh4/h0$b;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v8}, Landroid/util/SparseIntArray;->clear()V

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->a()I

    move-result v8

    :goto_2
    if-lez v8, :cond_c

    iget-object v14, v0, Lh4/h0$b;->a:Lp5/z;

    const/4 v15, 0x5

    invoke-virtual {v1, v14, v15}, Lp5/a0;->k(Lp5/z;I)V

    iget-object v14, v0, Lh4/h0$b;->a:Lp5/z;

    const/16 v4, 0x8

    invoke-virtual {v14, v4}, Lp5/z;->h(I)I

    move-result v4

    iget-object v14, v0, Lh4/h0$b;->a:Lp5/z;

    invoke-virtual {v14, v7}, Lp5/z;->r(I)V

    iget-object v14, v0, Lh4/h0$b;->a:Lp5/z;

    invoke-virtual {v14, v10}, Lp5/z;->h(I)I

    move-result v14

    iget-object v7, v0, Lh4/h0$b;->a:Lp5/z;

    invoke-virtual {v7, v9}, Lp5/z;->r(I)V

    iget-object v7, v0, Lh4/h0$b;->a:Lp5/z;

    invoke-virtual {v7, v11}, Lp5/z;->h(I)I

    move-result v7

    invoke-virtual {v0, v1, v7}, Lh4/h0$b;->c(Lp5/a0;I)Lh4/i0$b;

    move-result-object v9

    const/4 v10, 0x6

    if-eq v4, v10, :cond_5

    if-ne v4, v15, :cond_6

    :cond_5
    iget v4, v9, Lh4/i0$b;->a:I

    :cond_6
    add-int/lit8 v7, v7, 0x5

    sub-int/2addr v8, v7

    iget-object v7, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v7}, Lh4/h0;->l(Lh4/h0;)I

    move-result v7

    if-ne v7, v3, :cond_7

    move v7, v4

    goto :goto_3

    :cond_7
    move v7, v14

    :goto_3
    iget-object v10, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v10}, Lh4/h0;->s(Lh4/h0;)Landroid/util/SparseBooleanArray;

    move-result-object v10

    invoke-virtual {v10, v7}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v10

    if-eqz v10, :cond_8

    goto :goto_5

    :cond_8
    iget-object v10, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v10}, Lh4/h0;->l(Lh4/h0;)I

    move-result v10

    if-ne v10, v3, :cond_9

    if-ne v4, v13, :cond_9

    iget-object v4, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v4}, Lh4/h0;->o(Lh4/h0;)Lh4/i0;

    move-result-object v4

    goto :goto_4

    :cond_9
    iget-object v10, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v10}, Lh4/h0;->q(Lh4/h0;)Lh4/i0$c;

    move-result-object v10

    invoke-interface {v10, v4, v9}, Lh4/i0$c;->b(ILh4/i0$b;)Lh4/i0;

    move-result-object v4

    :goto_4
    iget-object v9, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v9}, Lh4/h0;->l(Lh4/h0;)I

    move-result v9

    if-ne v9, v3, :cond_a

    iget-object v9, v0, Lh4/h0$b;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v9, v7, v12}, Landroid/util/SparseIntArray;->get(II)I

    move-result v9

    if-ge v14, v9, :cond_b

    :cond_a
    iget-object v9, v0, Lh4/h0$b;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v9, v7, v14}, Landroid/util/SparseIntArray;->put(II)V

    iget-object v9, v0, Lh4/h0$b;->b:Landroid/util/SparseArray;

    invoke-virtual {v9, v7, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_b
    :goto_5
    const/4 v4, 0x0

    const/4 v7, 0x3

    const/4 v9, 0x4

    const/16 v10, 0xd

    goto/16 :goto_2

    :cond_c
    iget-object v1, v0, Lh4/h0$b;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v1}, Landroid/util/SparseIntArray;->size()I

    move-result v1

    const/4 v4, 0x0

    :goto_6
    if-ge v4, v1, :cond_f

    iget-object v7, v0, Lh4/h0$b;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v7, v4}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v7

    iget-object v8, v0, Lh4/h0$b;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v8, v4}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v8

    iget-object v9, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v9}, Lh4/h0;->s(Lh4/h0;)Landroid/util/SparseBooleanArray;

    move-result-object v9

    invoke-virtual {v9, v7, v5}, Landroid/util/SparseBooleanArray;->put(IZ)V

    iget-object v9, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v9}, Lh4/h0;->t(Lh4/h0;)Landroid/util/SparseBooleanArray;

    move-result-object v9

    invoke-virtual {v9, v8, v5}, Landroid/util/SparseBooleanArray;->put(IZ)V

    iget-object v9, v0, Lh4/h0$b;->b:Landroid/util/SparseArray;

    invoke-virtual {v9, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lh4/i0;

    if-eqz v9, :cond_e

    iget-object v10, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v10}, Lh4/h0;->o(Lh4/h0;)Lh4/i0;

    move-result-object v10

    if-eq v9, v10, :cond_d

    iget-object v10, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v10}, Lh4/h0;->r(Lh4/h0;)Lx3/m;

    move-result-object v10

    new-instance v11, Lh4/i0$d;

    invoke-direct {v11, v6, v7, v12}, Lh4/i0$d;-><init>(III)V

    invoke-interface {v9, v2, v10, v11}, Lh4/i0;->b(Lp5/j0;Lx3/m;Lh4/i0$d;)V

    :cond_d
    iget-object v7, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v7}, Lh4/h0;->d(Lh4/h0;)Landroid/util/SparseArray;

    move-result-object v7

    invoke-virtual {v7, v8, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_e
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_f
    iget-object v1, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v1}, Lh4/h0;->l(Lh4/h0;)I

    move-result v1

    if-ne v1, v3, :cond_10

    iget-object v1, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v1}, Lh4/h0;->f(Lh4/h0;)Z

    move-result v1

    if-nez v1, :cond_12

    iget-object v1, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v1}, Lh4/h0;->r(Lh4/h0;)Lx3/m;

    move-result-object v1

    invoke-interface {v1}, Lx3/m;->n()V

    iget-object v1, v0, Lh4/h0$b;->e:Lh4/h0;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lh4/h0;->j(Lh4/h0;I)I

    :goto_7
    iget-object v1, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v1, v5}, Lh4/h0;->i(Lh4/h0;Z)Z

    goto :goto_9

    :cond_10
    const/4 v2, 0x0

    iget-object v1, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v1}, Lh4/h0;->d(Lh4/h0;)Landroid/util/SparseArray;

    move-result-object v1

    iget v3, v0, Lh4/h0$b;->d:I

    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->remove(I)V

    iget-object v1, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v1}, Lh4/h0;->l(Lh4/h0;)I

    move-result v3

    if-ne v3, v5, :cond_11

    move v4, v2

    goto :goto_8

    :cond_11
    iget-object v2, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v2}, Lh4/h0;->e(Lh4/h0;)I

    move-result v2

    add-int/lit8 v4, v2, -0x1

    :goto_8
    invoke-static {v1, v4}, Lh4/h0;->j(Lh4/h0;I)I

    iget-object v1, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v1}, Lh4/h0;->e(Lh4/h0;)I

    move-result v1

    if-nez v1, :cond_12

    iget-object v1, v0, Lh4/h0$b;->e:Lh4/h0;

    invoke-static {v1}, Lh4/h0;->r(Lh4/h0;)Lx3/m;

    move-result-object v1

    invoke-interface {v1}, Lx3/m;->n()V

    goto :goto_7

    :cond_12
    :goto_9
    return-void
.end method

.method public b(Lp5/j0;Lx3/m;Lh4/i0$d;)V
    .locals 0

    return-void
.end method

.method public final c(Lp5/a0;I)Lh4/i0$b;
    .locals 13

    invoke-virtual {p1}, Lp5/a0;->f()I

    move-result v0

    add-int/2addr p2, v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    move v3, v2

    move-object v2, v1

    :goto_0
    invoke-virtual {p1}, Lp5/a0;->f()I

    move-result v4

    if-ge v4, p2, :cond_d

    invoke-virtual {p1}, Lp5/a0;->G()I

    move-result v4

    invoke-virtual {p1}, Lp5/a0;->G()I

    move-result v5

    invoke-virtual {p1}, Lp5/a0;->f()I

    move-result v6

    add-int/2addr v6, v5

    if-le v6, p2, :cond_0

    goto/16 :goto_6

    :cond_0
    const/4 v5, 0x5

    const/16 v7, 0x59

    const/16 v8, 0xac

    const/16 v9, 0x87

    const/16 v10, 0x81

    if-ne v4, v5, :cond_4

    invoke-virtual {p1}, Lp5/a0;->I()J

    move-result-wide v4

    const-wide/32 v11, 0x41432d33

    cmp-long v7, v4, v11

    if-nez v7, :cond_1

    goto :goto_2

    :cond_1
    const-wide/32 v10, 0x45414333

    cmp-long v7, v4, v10

    if-nez v7, :cond_2

    goto :goto_3

    :cond_2
    const-wide/32 v9, 0x41432d34

    cmp-long v7, v4, v9

    if-nez v7, :cond_3

    :goto_1
    move v3, v8

    goto/16 :goto_5

    :cond_3
    const-wide/32 v7, 0x48455643

    cmp-long v4, v4, v7

    if-nez v4, :cond_c

    const/16 v3, 0x24

    goto :goto_5

    :cond_4
    const/16 v5, 0x6a

    if-ne v4, v5, :cond_5

    :goto_2
    move v3, v10

    goto :goto_5

    :cond_5
    const/16 v5, 0x7a

    if-ne v4, v5, :cond_6

    :goto_3
    move v3, v9

    goto :goto_5

    :cond_6
    const/16 v5, 0x7f

    if-ne v4, v5, :cond_7

    invoke-virtual {p1}, Lp5/a0;->G()I

    move-result v4

    const/16 v5, 0x15

    if-ne v4, v5, :cond_c

    goto :goto_1

    :cond_7
    const/16 v5, 0x7b

    if-ne v4, v5, :cond_8

    const/16 v3, 0x8a

    goto :goto_5

    :cond_8
    const/16 v5, 0xa

    const/4 v8, 0x3

    if-ne v4, v5, :cond_9

    invoke-virtual {p1, v8}, Lp5/a0;->D(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_9
    if-ne v4, v7, :cond_b

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_4
    invoke-virtual {p1}, Lp5/a0;->f()I

    move-result v3

    if-ge v3, v6, :cond_a

    invoke-virtual {p1, v8}, Lp5/a0;->D(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lp5/a0;->G()I

    move-result v4

    const/4 v5, 0x4

    new-array v9, v5, [B

    const/4 v10, 0x0

    invoke-virtual {p1, v9, v10, v5}, Lp5/a0;->l([BII)V

    new-instance v5, Lh4/i0$a;

    invoke-direct {v5, v3, v4, v9}, Lh4/i0$a;-><init>(Ljava/lang/String;I[B)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    move v3, v7

    goto :goto_5

    :cond_b
    const/16 v5, 0x6f

    if-ne v4, v5, :cond_c

    const/16 v3, 0x101

    :cond_c
    :goto_5
    invoke-virtual {p1}, Lp5/a0;->f()I

    move-result v4

    sub-int/2addr v6, v4

    invoke-virtual {p1, v6}, Lp5/a0;->U(I)V

    goto/16 :goto_0

    :cond_d
    :goto_6
    invoke-virtual {p1, p2}, Lp5/a0;->T(I)V

    new-instance v4, Lh4/i0$b;

    invoke-virtual {p1}, Lp5/a0;->e()[B

    move-result-object p1

    invoke-static {p1, v0, p2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-direct {v4, v3, v1, v2, p1}, Lh4/i0$b;-><init>(ILjava/lang/String;Ljava/util/List;[B)V

    return-object v4
.end method
