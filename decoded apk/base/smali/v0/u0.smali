.class public final Lv0/u0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lv0/g1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lv0/g1<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final r:[I

.field public static final s:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Lv0/r0;

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:[I

.field public final k:I

.field public final l:I

.field public final m:Lv0/w0;

.field public final n:Lv0/h0;

.field public final o:Lv0/n1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv0/n1<",
            "**>;"
        }
    .end annotation
.end field

.field public final p:Lv0/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv0/q<",
            "*>;"
        }
    .end annotation
.end field

.field public final q:Lv0/m0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lv0/u0;->r:[I

    invoke-static {}, Lv0/r1;->B()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Lv0/u0;->s:Lsun/misc/Unsafe;

    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILv0/r0;ZZ[IIILv0/w0;Lv0/h0;Lv0/n1;Lv0/q;Lv0/m0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I[",
            "Ljava/lang/Object;",
            "II",
            "Lv0/r0;",
            "ZZ[III",
            "Lv0/w0;",
            "Lv0/h0;",
            "Lv0/n1<",
            "**>;",
            "Lv0/q<",
            "*>;",
            "Lv0/m0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv0/u0;->a:[I

    iput-object p2, p0, Lv0/u0;->b:[Ljava/lang/Object;

    iput p3, p0, Lv0/u0;->c:I

    iput p4, p0, Lv0/u0;->d:I

    instance-of p1, p5, Lv0/y;

    iput-boolean p1, p0, Lv0/u0;->g:Z

    iput-boolean p6, p0, Lv0/u0;->h:Z

    if-eqz p14, :cond_0

    invoke-virtual {p14, p5}, Lv0/q;->e(Lv0/r0;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lv0/u0;->f:Z

    iput-boolean p7, p0, Lv0/u0;->i:Z

    iput-object p8, p0, Lv0/u0;->j:[I

    iput p9, p0, Lv0/u0;->k:I

    iput p10, p0, Lv0/u0;->l:I

    iput-object p11, p0, Lv0/u0;->m:Lv0/w0;

    iput-object p12, p0, Lv0/u0;->n:Lv0/h0;

    iput-object p13, p0, Lv0/u0;->o:Lv0/n1;

    iput-object p14, p0, Lv0/u0;->p:Lv0/q;

    iput-object p5, p0, Lv0/u0;->e:Lv0/r0;

    iput-object p15, p0, Lv0/u0;->q:Lv0/m0;

    return-void
.end method

.method public static A(Ljava/lang/Object;ILv0/g1;)Z
    .locals 2

    invoke-static {p1}, Lv0/u0;->R(I)J

    move-result-wide v0

    invoke-static {p0, v0, v1}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lv0/g1;->c(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static F(I)Z
    .locals 1

    const/high16 v0, 0x10000000

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static G(Ljava/lang/Object;J)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "J)",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static H(Ljava/lang/Object;J)J
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)J"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static N(Ljava/lang/Class;Lv0/p0;Lv0/w0;Lv0/h0;Lv0/n1;Lv0/q;Lv0/m0;)Lv0/u0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lv0/p0;",
            "Lv0/w0;",
            "Lv0/h0;",
            "Lv0/n1<",
            "**>;",
            "Lv0/q<",
            "*>;",
            "Lv0/m0;",
            ")",
            "Lv0/u0<",
            "TT;>;"
        }
    .end annotation

    instance-of p0, p1, Lv0/e1;

    if-eqz p0, :cond_0

    move-object v0, p1

    check-cast v0, Lv0/e1;

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-static/range {v0 .. v5}, Lv0/u0;->P(Lv0/e1;Lv0/w0;Lv0/h0;Lv0/n1;Lv0/q;Lv0/m0;)Lv0/u0;

    move-result-object p0

    return-object p0

    :cond_0
    move-object v0, p1

    check-cast v0, Lv0/k1;

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-static/range {v0 .. v5}, Lv0/u0;->O(Lv0/k1;Lv0/w0;Lv0/h0;Lv0/n1;Lv0/q;Lv0/m0;)Lv0/u0;

    move-result-object p0

    return-object p0
.end method

.method public static O(Lv0/k1;Lv0/w0;Lv0/h0;Lv0/n1;Lv0/q;Lv0/m0;)Lv0/u0;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lv0/k1;",
            "Lv0/w0;",
            "Lv0/h0;",
            "Lv0/n1<",
            "**>;",
            "Lv0/q<",
            "*>;",
            "Lv0/m0;",
            ")",
            "Lv0/u0<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual/range {p0 .. p0}, Lv0/k1;->c()Lv0/b1;

    move-result-object v0

    sget-object v1, Lv0/b1;->i:Lv0/b1;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    move v9, v0

    goto :goto_0

    :cond_0
    move v9, v2

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lv0/k1;->e()[Lv0/t;

    move-result-object v0

    array-length v1, v0

    const/4 v3, 0x0

    if-nez v1, :cond_4

    const/4 v6, 0x0

    const/4 v7, 0x0

    array-length v1, v0

    mul-int/lit8 v4, v1, 0x3

    new-array v4, v4, [I

    mul-int/lit8 v1, v1, 0x2

    new-array v5, v1, [Ljava/lang/Object;

    array-length v1, v0

    if-gtz v1, :cond_3

    invoke-virtual/range {p0 .. p0}, Lv0/k1;->d()[I

    move-result-object v1

    if-nez v1, :cond_1

    sget-object v1, Lv0/u0;->r:[I

    :cond_1
    array-length v8, v0

    if-gtz v8, :cond_2

    sget-object v0, Lv0/u0;->r:[I

    sget-object v3, Lv0/u0;->r:[I

    array-length v8, v1

    array-length v10, v0

    add-int/2addr v8, v10

    array-length v10, v3

    add-int/2addr v8, v10

    new-array v11, v8, [I

    array-length v8, v1

    invoke-static {v1, v2, v11, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v8, v1

    array-length v10, v0

    invoke-static {v0, v2, v11, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v8, v1

    array-length v10, v0

    add-int/2addr v8, v10

    array-length v10, v3

    invoke-static {v3, v2, v11, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v2, Lv0/u0;

    invoke-virtual/range {p0 .. p0}, Lv0/k1;->b()Lv0/r0;

    move-result-object v8

    const/4 v10, 0x1

    array-length v12, v1

    array-length v1, v1

    array-length v0, v0

    add-int v13, v1, v0

    move-object v3, v2

    move-object/from16 v14, p1

    move-object/from16 v15, p2

    move-object/from16 v16, p3

    move-object/from16 v17, p4

    move-object/from16 v18, p5

    invoke-direct/range {v3 .. v18}, Lv0/u0;-><init>([I[Ljava/lang/Object;IILv0/r0;ZZ[IIILv0/w0;Lv0/h0;Lv0/n1;Lv0/q;Lv0/m0;)V

    return-object v2

    :cond_2
    aget-object v0, v0, v2

    throw v3

    :cond_3
    aget-object v0, v0, v2

    throw v3

    :cond_4
    aget-object v0, v0, v2

    throw v3
.end method

.method public static P(Lv0/e1;Lv0/w0;Lv0/h0;Lv0/n1;Lv0/q;Lv0/m0;)Lv0/u0;
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lv0/e1;",
            "Lv0/w0;",
            "Lv0/h0;",
            "Lv0/n1<",
            "**>;",
            "Lv0/q<",
            "*>;",
            "Lv0/m0;",
            ")",
            "Lv0/u0<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual/range {p0 .. p0}, Lv0/e1;->c()Lv0/b1;

    move-result-object v0

    sget-object v1, Lv0/b1;->i:Lv0/b1;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    move v10, v2

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lv0/e1;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const v6, 0xd800

    if-lt v4, v6, :cond_2

    and-int/lit16 v4, v4, 0x1fff

    const/4 v7, 0x1

    const/16 v8, 0xd

    :goto_1
    add-int/lit8 v9, v7, 0x1

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v6, :cond_1

    and-int/lit16 v7, v7, 0x1fff

    shl-int/2addr v7, v8

    or-int/2addr v4, v7

    add-int/lit8 v8, v8, 0xd

    move v7, v9

    goto :goto_1

    :cond_1
    shl-int/2addr v7, v8

    or-int/2addr v4, v7

    goto :goto_2

    :cond_2
    const/4 v9, 0x1

    :goto_2
    add-int/lit8 v7, v9, 0x1

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v6, :cond_4

    and-int/lit16 v8, v8, 0x1fff

    const/16 v9, 0xd

    :goto_3
    add-int/lit8 v11, v7, 0x1

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v6, :cond_3

    and-int/lit16 v7, v7, 0x1fff

    shl-int/2addr v7, v9

    or-int/2addr v8, v7

    add-int/lit8 v9, v9, 0xd

    move v7, v11

    goto :goto_3

    :cond_3
    shl-int/2addr v7, v9

    or-int/2addr v8, v7

    move v7, v11

    :cond_4
    if-nez v8, :cond_5

    sget-object v8, Lv0/u0;->r:[I

    move v9, v2

    move v11, v9

    move v12, v11

    move v14, v12

    move v15, v14

    move-object v13, v8

    move v8, v15

    goto/16 :goto_c

    :cond_5
    add-int/lit8 v8, v7, 0x1

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v6, :cond_7

    and-int/lit16 v7, v7, 0x1fff

    const/16 v9, 0xd

    :goto_4
    add-int/lit8 v11, v8, 0x1

    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v6, :cond_6

    and-int/lit16 v8, v8, 0x1fff

    shl-int/2addr v8, v9

    or-int/2addr v7, v8

    add-int/lit8 v9, v9, 0xd

    move v8, v11

    goto :goto_4

    :cond_6
    shl-int/2addr v8, v9

    or-int/2addr v7, v8

    move v8, v11

    :cond_7
    add-int/lit8 v9, v8, 0x1

    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v6, :cond_9

    and-int/lit16 v8, v8, 0x1fff

    const/16 v11, 0xd

    :goto_5
    add-int/lit8 v12, v9, 0x1

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v6, :cond_8

    and-int/lit16 v9, v9, 0x1fff

    shl-int/2addr v9, v11

    or-int/2addr v8, v9

    add-int/lit8 v11, v11, 0xd

    move v9, v12

    goto :goto_5

    :cond_8
    shl-int/2addr v9, v11

    or-int/2addr v8, v9

    move v9, v12

    :cond_9
    add-int/lit8 v11, v9, 0x1

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v6, :cond_b

    and-int/lit16 v9, v9, 0x1fff

    const/16 v12, 0xd

    :goto_6
    add-int/lit8 v13, v11, 0x1

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v6, :cond_a

    and-int/lit16 v11, v11, 0x1fff

    shl-int/2addr v11, v12

    or-int/2addr v9, v11

    add-int/lit8 v12, v12, 0xd

    move v11, v13

    goto :goto_6

    :cond_a
    shl-int/2addr v11, v12

    or-int/2addr v9, v11

    move v11, v13

    :cond_b
    add-int/lit8 v12, v11, 0x1

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v6, :cond_d

    and-int/lit16 v11, v11, 0x1fff

    const/16 v13, 0xd

    :goto_7
    add-int/lit8 v14, v12, 0x1

    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v6, :cond_c

    and-int/lit16 v12, v12, 0x1fff

    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    add-int/lit8 v13, v13, 0xd

    move v12, v14

    goto :goto_7

    :cond_c
    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    move v12, v14

    :cond_d
    add-int/lit8 v13, v12, 0x1

    invoke-virtual {v0, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v6, :cond_f

    and-int/lit16 v12, v12, 0x1fff

    const/16 v14, 0xd

    :goto_8
    add-int/lit8 v15, v13, 0x1

    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v6, :cond_e

    and-int/lit16 v13, v13, 0x1fff

    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    add-int/lit8 v14, v14, 0xd

    move v13, v15

    goto :goto_8

    :cond_e
    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    move v13, v15

    :cond_f
    add-int/lit8 v14, v13, 0x1

    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v6, :cond_11

    and-int/lit16 v13, v13, 0x1fff

    const/16 v15, 0xd

    :goto_9
    add-int/lit8 v16, v14, 0x1

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v6, :cond_10

    and-int/lit16 v14, v14, 0x1fff

    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    add-int/lit8 v15, v15, 0xd

    move/from16 v14, v16

    goto :goto_9

    :cond_10
    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    move/from16 v14, v16

    :cond_11
    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v6, :cond_13

    and-int/lit16 v14, v14, 0x1fff

    const/16 v16, 0xd

    :goto_a
    add-int/lit8 v17, v15, 0x1

    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v6, :cond_12

    and-int/lit16 v15, v15, 0x1fff

    shl-int v15, v15, v16

    or-int/2addr v14, v15

    add-int/lit8 v16, v16, 0xd

    move/from16 v15, v17

    goto :goto_a

    :cond_12
    shl-int v15, v15, v16

    or-int/2addr v14, v15

    move/from16 v15, v17

    :cond_13
    add-int/lit8 v16, v15, 0x1

    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v6, :cond_15

    and-int/lit16 v15, v15, 0x1fff

    move/from16 v2, v16

    const/16 v16, 0xd

    :goto_b
    add-int/lit8 v18, v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-lt v2, v6, :cond_14

    and-int/lit16 v2, v2, 0x1fff

    shl-int v2, v2, v16

    or-int/2addr v15, v2

    add-int/lit8 v16, v16, 0xd

    move/from16 v2, v18

    goto :goto_b

    :cond_14
    shl-int v2, v2, v16

    or-int/2addr v15, v2

    move/from16 v16, v18

    :cond_15
    add-int v2, v15, v13

    add-int/2addr v2, v14

    new-array v2, v2, [I

    mul-int/lit8 v14, v7, 0x2

    add-int/2addr v14, v8

    move v8, v7

    move/from16 v7, v16

    move/from16 v35, v13

    move-object v13, v2

    move v2, v9

    move/from16 v9, v35

    :goto_c
    sget-object v5, Lv0/u0;->s:Lsun/misc/Unsafe;

    invoke-virtual/range {p0 .. p0}, Lv0/e1;->d()[Ljava/lang/Object;

    move-result-object v18

    invoke-virtual/range {p0 .. p0}, Lv0/e1;->b()Lv0/r0;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    mul-int/lit8 v6, v12, 0x3

    new-array v6, v6, [I

    mul-int/lit8 v12, v12, 0x2

    new-array v12, v12, [Ljava/lang/Object;

    add-int v21, v15, v9

    move/from16 v23, v15

    move/from16 v24, v21

    const/4 v9, 0x0

    const/16 v22, 0x0

    :goto_d
    if-ge v7, v1, :cond_34

    add-int/lit8 v25, v7, 0x1

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    move/from16 v26, v1

    const v1, 0xd800

    if-lt v7, v1, :cond_17

    and-int/lit16 v7, v7, 0x1fff

    move/from16 v1, v25

    const/16 v25, 0xd

    :goto_e
    add-int/lit8 v27, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    move/from16 v28, v15

    const v15, 0xd800

    if-lt v1, v15, :cond_16

    and-int/lit16 v1, v1, 0x1fff

    shl-int v1, v1, v25

    or-int/2addr v7, v1

    add-int/lit8 v25, v25, 0xd

    move/from16 v1, v27

    move/from16 v15, v28

    goto :goto_e

    :cond_16
    shl-int v1, v1, v25

    or-int/2addr v7, v1

    move/from16 v1, v27

    goto :goto_f

    :cond_17
    move/from16 v28, v15

    move/from16 v1, v25

    :goto_f
    add-int/lit8 v15, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    move/from16 v25, v15

    const v15, 0xd800

    if-lt v1, v15, :cond_19

    and-int/lit16 v1, v1, 0x1fff

    move/from16 v15, v25

    const/16 v25, 0xd

    :goto_10
    add-int/lit8 v27, v15, 0x1

    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    move/from16 v29, v10

    const v10, 0xd800

    if-lt v15, v10, :cond_18

    and-int/lit16 v10, v15, 0x1fff

    shl-int v10, v10, v25

    or-int/2addr v1, v10

    add-int/lit8 v25, v25, 0xd

    move/from16 v15, v27

    move/from16 v10, v29

    goto :goto_10

    :cond_18
    shl-int v10, v15, v25

    or-int/2addr v1, v10

    move/from16 v15, v27

    goto :goto_11

    :cond_19
    move/from16 v29, v10

    move/from16 v15, v25

    :goto_11
    and-int/lit16 v10, v1, 0xff

    move/from16 v25, v11

    and-int/lit16 v11, v1, 0x400

    if-eqz v11, :cond_1a

    add-int/lit8 v11, v9, 0x1

    aput v22, v13, v9

    move v9, v11

    :cond_1a
    const/16 v11, 0x33

    move/from16 v31, v9

    if-lt v10, v11, :cond_22

    add-int/lit8 v11, v15, 0x1

    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    const v9, 0xd800

    if-lt v15, v9, :cond_1c

    and-int/lit16 v15, v15, 0x1fff

    const/16 v33, 0xd

    :goto_12
    add-int/lit8 v34, v11, 0x1

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v9, :cond_1b

    and-int/lit16 v9, v11, 0x1fff

    shl-int v9, v9, v33

    or-int/2addr v15, v9

    add-int/lit8 v33, v33, 0xd

    move/from16 v11, v34

    const v9, 0xd800

    goto :goto_12

    :cond_1b
    shl-int v9, v11, v33

    or-int/2addr v15, v9

    move/from16 v11, v34

    :cond_1c
    add-int/lit8 v9, v10, -0x33

    move/from16 v33, v11

    const/16 v11, 0x9

    if-eq v9, v11, :cond_1e

    const/16 v11, 0x11

    if-ne v9, v11, :cond_1d

    goto :goto_13

    :cond_1d
    const/16 v11, 0xc

    if-ne v9, v11, :cond_1f

    and-int/lit8 v9, v4, 0x1

    const/4 v11, 0x1

    if-ne v9, v11, :cond_1f

    div-int/lit8 v9, v22, 0x3

    mul-int/lit8 v9, v9, 0x2

    add-int/2addr v9, v11

    add-int/lit8 v11, v14, 0x1

    aget-object v14, v18, v14

    aput-object v14, v12, v9

    goto :goto_14

    :cond_1e
    :goto_13
    div-int/lit8 v9, v22, 0x3

    mul-int/lit8 v9, v9, 0x2

    const/4 v11, 0x1

    add-int/2addr v9, v11

    add-int/lit8 v11, v14, 0x1

    aget-object v14, v18, v14

    aput-object v14, v12, v9

    :goto_14
    move v14, v11

    :cond_1f
    mul-int/lit8 v15, v15, 0x2

    aget-object v9, v18, v15

    instance-of v11, v9, Ljava/lang/reflect/Field;

    if-eqz v11, :cond_20

    check-cast v9, Ljava/lang/reflect/Field;

    goto :goto_15

    :cond_20
    check-cast v9, Ljava/lang/String;

    invoke-static {v3, v9}, Lv0/u0;->d0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v9

    aput-object v9, v18, v15

    :goto_15
    move-object v11, v6

    move/from16 v34, v7

    invoke-virtual {v5, v9}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v6

    long-to-int v6, v6

    add-int/lit8 v15, v15, 0x1

    aget-object v7, v18, v15

    instance-of v9, v7, Ljava/lang/reflect/Field;

    if-eqz v9, :cond_21

    check-cast v7, Ljava/lang/reflect/Field;

    goto :goto_16

    :cond_21
    check-cast v7, Ljava/lang/String;

    invoke-static {v3, v7}, Lv0/u0;->d0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    aput-object v7, v18, v15

    :goto_16
    move v9, v6

    invoke-virtual {v5, v7}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v6

    long-to-int v6, v6

    move-object/from16 v32, v0

    move-object/from16 v19, v3

    move v0, v4

    move v3, v6

    move v6, v9

    move v9, v10

    move/from16 v7, v33

    const/4 v15, 0x0

    goto/16 :goto_21

    :cond_22
    move-object v11, v6

    move/from16 v34, v7

    add-int/lit8 v6, v14, 0x1

    aget-object v7, v18, v14

    check-cast v7, Ljava/lang/String;

    invoke-static {v3, v7}, Lv0/u0;->d0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    const/16 v9, 0x31

    const/16 v14, 0x9

    if-eq v10, v14, :cond_2a

    const/16 v14, 0x11

    if-ne v10, v14, :cond_23

    goto :goto_1a

    :cond_23
    const/16 v14, 0x1b

    if-eq v10, v14, :cond_29

    if-ne v10, v9, :cond_24

    goto :goto_18

    :cond_24
    const/16 v14, 0xc

    if-eq v10, v14, :cond_28

    const/16 v14, 0x1e

    if-eq v10, v14, :cond_28

    const/16 v14, 0x2c

    if-ne v10, v14, :cond_25

    goto :goto_17

    :cond_25
    const/16 v14, 0x32

    if-ne v10, v14, :cond_27

    add-int/lit8 v14, v23, 0x1

    aput v22, v13, v23

    div-int/lit8 v23, v22, 0x3

    mul-int/lit8 v23, v23, 0x2

    add-int/lit8 v27, v6, 0x1

    aget-object v6, v18, v6

    aput-object v6, v12, v23

    and-int/lit16 v6, v1, 0x800

    if-eqz v6, :cond_26

    add-int/lit8 v23, v23, 0x1

    add-int/lit8 v6, v27, 0x1

    aget-object v27, v18, v27

    aput-object v27, v12, v23

    move/from16 v23, v14

    goto :goto_1b

    :cond_26
    move/from16 v23, v14

    move/from16 v6, v27

    goto :goto_1b

    :cond_27
    const/4 v9, 0x1

    goto :goto_1b

    :cond_28
    :goto_17
    and-int/lit8 v14, v4, 0x1

    const/4 v9, 0x1

    if-ne v14, v9, :cond_2b

    div-int/lit8 v14, v22, 0x3

    mul-int/lit8 v14, v14, 0x2

    add-int/2addr v14, v9

    add-int/lit8 v20, v6, 0x1

    aget-object v6, v18, v6

    aput-object v6, v12, v14

    goto :goto_19

    :cond_29
    :goto_18
    const/4 v9, 0x1

    div-int/lit8 v14, v22, 0x3

    mul-int/lit8 v14, v14, 0x2

    add-int/2addr v14, v9

    add-int/lit8 v20, v6, 0x1

    aget-object v6, v18, v6

    aput-object v6, v12, v14

    :goto_19
    move v14, v10

    move/from16 v6, v20

    goto :goto_1c

    :cond_2a
    :goto_1a
    const/4 v9, 0x1

    div-int/lit8 v14, v22, 0x3

    mul-int/lit8 v14, v14, 0x2

    add-int/2addr v14, v9

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v20

    aput-object v20, v12, v14

    :cond_2b
    :goto_1b
    move v14, v10

    :goto_1c
    invoke-virtual {v5, v7}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v9

    long-to-int v7, v9

    and-int/lit8 v9, v4, 0x1

    const/4 v10, 0x1

    if-ne v9, v10, :cond_30

    move v9, v14

    const/16 v14, 0x11

    if-gt v9, v14, :cond_2f

    add-int/lit8 v14, v15, 0x1

    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    const v10, 0xd800

    if-lt v15, v10, :cond_2d

    and-int/lit16 v15, v15, 0x1fff

    const/16 v19, 0xd

    :goto_1d
    add-int/lit8 v30, v14, 0x1

    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v10, :cond_2c

    and-int/lit16 v14, v14, 0x1fff

    shl-int v14, v14, v19

    or-int/2addr v15, v14

    add-int/lit8 v19, v19, 0xd

    move/from16 v14, v30

    goto :goto_1d

    :cond_2c
    shl-int v14, v14, v19

    or-int/2addr v15, v14

    move/from16 v14, v30

    :cond_2d
    mul-int/lit8 v19, v8, 0x2

    div-int/lit8 v30, v15, 0x20

    add-int v19, v19, v30

    aget-object v10, v18, v19

    move-object/from16 v32, v0

    instance-of v0, v10, Ljava/lang/reflect/Field;

    if-eqz v0, :cond_2e

    check-cast v10, Ljava/lang/reflect/Field;

    goto :goto_1e

    :cond_2e
    check-cast v10, Ljava/lang/String;

    invoke-static {v3, v10}, Lv0/u0;->d0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v10

    aput-object v10, v18, v19

    :goto_1e
    move-object/from16 v19, v3

    move v0, v4

    invoke-virtual {v5, v10}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v3

    long-to-int v3, v3

    rem-int/lit8 v15, v15, 0x20

    goto :goto_20

    :cond_2f
    move-object/from16 v32, v0

    move-object/from16 v19, v3

    move v0, v4

    goto :goto_1f

    :cond_30
    move-object/from16 v32, v0

    move-object/from16 v19, v3

    move v0, v4

    move v9, v14

    :goto_1f
    move v14, v15

    const/4 v3, 0x0

    const/4 v15, 0x0

    :goto_20
    const/16 v4, 0x12

    if-lt v9, v4, :cond_31

    const/16 v4, 0x31

    if-gt v9, v4, :cond_31

    add-int/lit8 v4, v24, 0x1

    aput v7, v13, v24

    move/from16 v24, v4

    :cond_31
    move/from16 v35, v14

    move v14, v6

    move v6, v7

    move/from16 v7, v35

    :goto_21
    add-int/lit8 v4, v22, 0x1

    aput v34, v11, v22

    add-int/lit8 v10, v4, 0x1

    move/from16 v22, v0

    and-int/lit16 v0, v1, 0x200

    if-eqz v0, :cond_32

    const/high16 v0, 0x20000000

    goto :goto_22

    :cond_32
    const/4 v0, 0x0

    :goto_22
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_33

    const/high16 v1, 0x10000000

    goto :goto_23

    :cond_33
    const/4 v1, 0x0

    :goto_23
    or-int/2addr v0, v1

    shl-int/lit8 v1, v9, 0x14

    or-int/2addr v0, v1

    or-int/2addr v0, v6

    aput v0, v11, v4

    add-int/lit8 v0, v10, 0x1

    shl-int/lit8 v1, v15, 0x14

    or-int/2addr v1, v3

    aput v1, v11, v10

    move-object v6, v11

    move-object/from16 v3, v19

    move/from16 v4, v22

    move/from16 v11, v25

    move/from16 v1, v26

    move/from16 v15, v28

    move/from16 v10, v29

    move/from16 v9, v31

    move/from16 v22, v0

    move-object/from16 v0, v32

    goto/16 :goto_d

    :cond_34
    move/from16 v29, v10

    move/from16 v25, v11

    move/from16 v28, v15

    move-object v11, v6

    new-instance v0, Lv0/u0;

    invoke-virtual/range {p0 .. p0}, Lv0/e1;->b()Lv0/r0;

    move-result-object v9

    const/4 v1, 0x0

    move-object v4, v0

    move-object v5, v11

    move-object v6, v12

    move v7, v2

    move/from16 v8, v25

    move v11, v1

    move-object v12, v13

    move/from16 v13, v28

    move/from16 v14, v21

    move-object/from16 v15, p1

    move-object/from16 v16, p2

    move-object/from16 v17, p3

    move-object/from16 v18, p4

    move-object/from16 v19, p5

    invoke-direct/range {v4 .. v19}, Lv0/u0;-><init>([I[Ljava/lang/Object;IILv0/r0;ZZ[IIILv0/w0;Lv0/h0;Lv0/n1;Lv0/q;Lv0/m0;)V

    return-object v0
.end method

.method public static R(I)J
    .locals 2

    const v0, 0xfffff

    and-int/2addr p0, v0

    int-to-long v0, p0

    return-wide v0
.end method

.method public static S(Ljava/lang/Object;J)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)Z"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static T(Ljava/lang/Object;J)D
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)D"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Double;

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    return-wide p0
.end method

.method public static U(Ljava/lang/Object;J)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)F"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    return p0
.end method

.method public static V(Ljava/lang/Object;J)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)I"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static W(Ljava/lang/Object;J)J
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)J"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public static d0(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Field;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Field "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found. Known fields are "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static h0(I)I
    .locals 1

    const/high16 v0, 0xff00000

    and-int/2addr p0, v0

    ushr-int/lit8 p0, p0, 0x14

    return p0
.end method

.method public static k(Ljava/lang/Object;J)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)Z"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lv0/r1;->p(Ljava/lang/Object;J)Z

    move-result p0

    return p0
.end method

.method public static l(Ljava/lang/Object;J)D
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)D"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lv0/r1;->v(Ljava/lang/Object;J)D

    move-result-wide p0

    return-wide p0
.end method

.method public static p(Ljava/lang/Object;J)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)F"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lv0/r1;->w(Ljava/lang/Object;J)F

    move-result p0

    return p0
.end method

.method public static w(Ljava/lang/Object;J)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;J)I"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p0

    return p0
.end method

.method public static x(I)Z
    .locals 1

    const/high16 v0, 0x20000000

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final B(Ljava/lang/Object;II)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<N:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "II)Z"
        }
    .end annotation

    invoke-static {p2}, Lv0/u0;->R(I)J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p3}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object p2

    const/4 p3, 0x0

    move v1, p3

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p2, v2}, Lv0/g1;->c(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    return p3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public final C(Ljava/lang/Object;II)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;II)Z"
        }
    .end annotation

    iget-object v0, p0, Lv0/u0;->q:Lv0/m0;

    invoke-static {p2}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-static {p1, v1, v2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lv0/m0;->h(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p3}, Lv0/u0;->r(I)Ljava/lang/Object;

    move-result-object p2

    iget-object p3, p0, Lv0/u0;->q:Lv0/m0;

    invoke-interface {p3, p2}, Lv0/m0;->c(Ljava/lang/Object;)Lv0/k0$a;

    move-result-object p2

    iget-object p2, p2, Lv0/k0$a;->c:Lv0/t1$b;

    invoke-virtual {p2}, Lv0/t1$b;->b()Lv0/t1$c;

    move-result-object p2

    sget-object p3, Lv0/t1$c;->q:Lv0/t1$c;

    if-eq p2, p3, :cond_1

    return v0

    :cond_1
    const/4 p2, 0x0

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_3

    invoke-static {}, Lv0/c1;->a()Lv0/c1;

    move-result-object p2

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p2, v1}, Lv0/c1;->d(Ljava/lang/Class;)Lv0/g1;

    move-result-object p2

    :cond_3
    invoke-interface {p2, p3}, Lv0/g1;->c(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_4
    return v0
.end method

.method public final D(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)Z"
        }
    .end annotation

    invoke-virtual {p0, p3}, Lv0/u0;->Y(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v0, v1}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final E(Ljava/lang/Object;II)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;II)Z"
        }
    .end annotation

    invoke-virtual {p0, p3}, Lv0/u0;->Y(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final I(Lv0/n1;Lv0/q;Ljava/lang/Object;Lv0/f1;Lv0/p;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            "ET::",
            "Lv0/u$b<",
            "TET;>;>(",
            "Lv0/n1<",
            "TUT;TUB;>;",
            "Lv0/q<",
            "TET;>;TT;",
            "Lv0/f1;",
            "Lv0/p;",
            ")V"
        }
    .end annotation

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move-object/from16 v10, p3

    move-object/from16 v0, p4

    move-object/from16 v11, p5

    const/4 v12, 0x0

    move-object v13, v12

    move-object v14, v13

    :cond_0
    :goto_0
    :try_start_0
    invoke-interface/range {p4 .. p4}, Lv0/f1;->C()I

    move-result v1

    invoke-virtual {v8, v1}, Lv0/u0;->X(I)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gez v3, :cond_c

    const v2, 0x7fffffff

    if-ne v1, v2, :cond_3

    iget v0, v8, Lv0/u0;->k:I

    :goto_1
    iget v1, v8, Lv0/u0;->l:I

    if-ge v0, v1, :cond_1

    iget-object v1, v8, Lv0/u0;->j:[I

    aget v1, v1, v0

    invoke-virtual {v8, v10, v1, v13, v9}, Lv0/u0;->n(Ljava/lang/Object;ILjava/lang/Object;Lv0/n1;)Ljava/lang/Object;

    move-result-object v13

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    if-eqz v13, :cond_2

    invoke-virtual {v9, v10, v13}, Lv0/n1;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-void

    :cond_3
    :try_start_1
    iget-boolean v2, v8, Lv0/u0;->f:Z

    if-nez v2, :cond_4

    move-object/from16 v15, p2

    move-object v3, v12

    goto :goto_2

    :cond_4
    iget-object v2, v8, Lv0/u0;->e:Lv0/r0;

    move-object/from16 v15, p2

    invoke-virtual {v15, v11, v2, v1}, Lv0/q;->b(Lv0/p;Lv0/r0;I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    :goto_2
    if-eqz v3, :cond_6

    if-nez v14, :cond_5

    invoke-virtual/range {p2 .. p3}, Lv0/q;->d(Ljava/lang/Object;)Lv0/u;

    move-result-object v1

    move-object v14, v1

    :cond_5
    move-object/from16 v1, p2

    move-object/from16 v2, p4

    move-object/from16 v4, p5

    move-object v5, v14

    move-object v6, v13

    move-object/from16 v7, p1

    invoke-virtual/range {v1 .. v7}, Lv0/q;->g(Lv0/f1;Ljava/lang/Object;Lv0/p;Lv0/u;Ljava/lang/Object;Lv0/n1;)Ljava/lang/Object;

    move-result-object v13

    goto :goto_0

    :cond_6
    invoke-virtual {v9, v0}, Lv0/n1;->q(Lv0/f1;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface/range {p4 .. p4}, Lv0/f1;->I()Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_0

    :cond_7
    if-nez v13, :cond_8

    invoke-virtual {v9, v10}, Lv0/n1;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    :cond_8
    invoke-virtual {v9, v13, v0}, Lv0/n1;->m(Ljava/lang/Object;Lv0/f1;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_9

    goto :goto_0

    :cond_9
    iget v0, v8, Lv0/u0;->k:I

    :goto_3
    iget v1, v8, Lv0/u0;->l:I

    if-ge v0, v1, :cond_a

    iget-object v1, v8, Lv0/u0;->j:[I

    aget v1, v1, v0

    invoke-virtual {v8, v10, v1, v13, v9}, Lv0/u0;->n(Ljava/lang/Object;ILjava/lang/Object;Lv0/n1;)Ljava/lang/Object;

    move-result-object v13

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_a
    if-eqz v13, :cond_b

    invoke-virtual {v9, v10, v13}, Lv0/n1;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_b
    return-void

    :cond_c
    move-object/from16 v15, p2

    :try_start_2
    invoke-virtual {v8, v3}, Lv0/u0;->i0(I)I

    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {v4}, Lv0/u0;->h0(I)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    if-nez v13, :cond_13

    invoke-virtual/range {p1 .. p1}, Lv0/n1;->n()Ljava/lang/Object;

    move-result-object v1

    goto/16 :goto_16

    :pswitch_0
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-virtual {v8, v3}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v2

    invoke-interface {v0, v2, v11}, Lv0/f1;->q(Lv0/g1;Lv0/p;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_4
    invoke-virtual {v8, v10, v1, v3}, Lv0/u0;->f0(Ljava/lang/Object;II)V

    goto/16 :goto_0

    :pswitch_1
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-interface/range {p4 .. p4}, Lv0/f1;->z()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_4

    :pswitch_2
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-interface/range {p4 .. p4}, Lv0/f1;->y()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_4

    :pswitch_3
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-interface/range {p4 .. p4}, Lv0/f1;->i()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_4

    :pswitch_4
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-interface/range {p4 .. p4}, Lv0/f1;->J()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_4

    :pswitch_5
    invoke-interface/range {p4 .. p4}, Lv0/f1;->u()I

    move-result v2

    invoke-virtual {v8, v3}, Lv0/u0;->q(I)Lv0/a0$e;

    move-result-object v5

    if-eqz v5, :cond_e

    invoke-interface {v5, v2}, Lv0/a0$e;->a(I)Z

    move-result v5

    if-eqz v5, :cond_d

    goto :goto_5

    :cond_d
    invoke-static {v1, v2, v13, v9}, Lv0/i1;->L(IILjava/lang/Object;Lv0/n1;)Ljava/lang/Object;

    move-result-object v13

    goto/16 :goto_0

    :cond_e
    :goto_5
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_4

    :pswitch_6
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-interface/range {p4 .. p4}, Lv0/f1;->l()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_4

    :pswitch_7
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-interface/range {p4 .. p4}, Lv0/f1;->F()Lv0/h;

    move-result-object v2

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_8
    invoke-virtual {v8, v10, v1, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v5

    invoke-static {v10, v5, v6}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v8, v3}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v5

    invoke-interface {v0, v5, v11}, Lv0/f1;->P(Lv0/g1;Lv0/p;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2, v5}, Lv0/a0;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_4

    :cond_f
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-virtual {v8, v3}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v2

    invoke-interface {v0, v2, v11}, Lv0/f1;->P(Lv0/g1;Lv0/p;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v8, v10, v3}, Lv0/u0;->e0(Ljava/lang/Object;I)V

    goto/16 :goto_4

    :pswitch_9
    invoke-virtual {v8, v10, v4, v0}, Lv0/u0;->b0(Ljava/lang/Object;ILv0/f1;)V

    goto/16 :goto_4

    :pswitch_a
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-interface/range {p4 .. p4}, Lv0/f1;->h()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_b
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-interface/range {p4 .. p4}, Lv0/f1;->g()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_c
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-interface/range {p4 .. p4}, Lv0/f1;->c()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_d
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-interface/range {p4 .. p4}, Lv0/f1;->H()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_e
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-interface/range {p4 .. p4}, Lv0/f1;->b()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_f
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-interface/range {p4 .. p4}, Lv0/f1;->M()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_10
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-interface/range {p4 .. p4}, Lv0/f1;->readFloat()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_11
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-interface/range {p4 .. p4}, Lv0/f1;->readDouble()D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_12
    invoke-virtual {v8, v3}, Lv0/u0;->r(I)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p4

    invoke-virtual/range {v1 .. v6}, Lv0/u0;->J(Ljava/lang/Object;ILjava/lang/Object;Lv0/p;Lv0/f1;)V

    goto/16 :goto_0

    :pswitch_13
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-virtual {v8, v3}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v6

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-wide v3, v4

    move-object/from16 v5, p4

    move-object/from16 v7, p5

    invoke-virtual/range {v1 .. v7}, Lv0/u0;->Z(Ljava/lang/Object;JLv0/f1;Lv0/g1;Lv0/p;)V

    goto/16 :goto_0

    :pswitch_14
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_6
    invoke-interface {v0, v1}, Lv0/f1;->e(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_15
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_7
    invoke-interface {v0, v1}, Lv0/f1;->a(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_16
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_8
    invoke-interface {v0, v1}, Lv0/f1;->o(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_17
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_9
    invoke-interface {v0, v1}, Lv0/f1;->d(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_18
    iget-object v2, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-virtual {v2, v10, v4, v5}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Lv0/f1;->s(Ljava/util/List;)V

    invoke-virtual {v8, v3}, Lv0/u0;->q(I)Lv0/a0$e;

    move-result-object v3

    :goto_a
    invoke-static {v1, v2, v3, v13, v9}, Lv0/i1;->A(ILjava/util/List;Lv0/a0$e;Ljava/lang/Object;Lv0/n1;)Ljava/lang/Object;

    move-result-object v13

    goto/16 :goto_0

    :pswitch_19
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_b
    invoke-interface {v0, v1}, Lv0/f1;->f(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1a
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_c
    invoke-interface {v0, v1}, Lv0/f1;->A(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1b
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_d
    invoke-interface {v0, v1}, Lv0/f1;->w(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1c
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_e
    invoke-interface {v0, v1}, Lv0/f1;->O(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1d
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_f
    invoke-interface {v0, v1}, Lv0/f1;->r(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1e
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_10
    invoke-interface {v0, v1}, Lv0/f1;->j(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_1f
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_11
    invoke-interface {v0, v1}, Lv0/f1;->n(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_20
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_12
    invoke-interface {v0, v1}, Lv0/f1;->G(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_21
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    :goto_13
    invoke-interface {v0, v1}, Lv0/f1;->L(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_22
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_6

    :pswitch_23
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_7

    :pswitch_24
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_8

    :pswitch_25
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_9

    :pswitch_26
    iget-object v2, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-virtual {v2, v10, v4, v5}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Lv0/f1;->s(Ljava/util/List;)V

    invoke-virtual {v8, v3}, Lv0/u0;->q(I)Lv0/a0$e;

    move-result-object v3

    goto/16 :goto_a

    :pswitch_27
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_b

    :pswitch_28
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lv0/f1;->K(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_29
    invoke-virtual {v8, v3}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v5

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move v3, v4

    move-object/from16 v4, p4

    move-object/from16 v6, p5

    invoke-virtual/range {v1 .. v6}, Lv0/u0;->a0(Ljava/lang/Object;ILv0/f1;Lv0/g1;Lv0/p;)V

    goto/16 :goto_0

    :pswitch_2a
    invoke-virtual {v8, v10, v4, v0}, Lv0/u0;->c0(Ljava/lang/Object;ILv0/f1;)V

    goto/16 :goto_0

    :pswitch_2b
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_c

    :pswitch_2c
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_d

    :pswitch_2d
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_e

    :pswitch_2e
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_f

    :pswitch_2f
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_10

    :pswitch_30
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_11

    :pswitch_31
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_12

    :pswitch_32
    iget-object v1, v8, Lv0/u0;->n:Lv0/h0;

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {v1, v10, v2, v3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_13

    :pswitch_33
    invoke-virtual {v8, v10, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-static {v10, v1, v2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v8, v3}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v2

    invoke-interface {v0, v2, v11}, Lv0/f1;->q(Lv0/g1;Lv0/p;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lv0/a0;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    :goto_14
    invoke-static {v10, v2, v3, v1}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_0

    :cond_10
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-virtual {v8, v3}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v4

    invoke-interface {v0, v4, v11}, Lv0/f1;->q(Lv0/g1;Lv0/p;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v10, v1, v2, v4}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_15
    invoke-virtual {v8, v10, v3}, Lv0/u0;->e0(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :pswitch_34
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lv0/f1;->z()J

    move-result-wide v4

    invoke-static {v10, v1, v2, v4, v5}, Lv0/r1;->N(Ljava/lang/Object;JJ)V

    goto :goto_15

    :pswitch_35
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lv0/f1;->y()I

    move-result v4

    invoke-static {v10, v1, v2, v4}, Lv0/r1;->M(Ljava/lang/Object;JI)V

    goto :goto_15

    :pswitch_36
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lv0/f1;->i()J

    move-result-wide v4

    invoke-static {v10, v1, v2, v4, v5}, Lv0/r1;->N(Ljava/lang/Object;JJ)V

    goto :goto_15

    :pswitch_37
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lv0/f1;->J()I

    move-result v4

    invoke-static {v10, v1, v2, v4}, Lv0/r1;->M(Ljava/lang/Object;JI)V

    goto :goto_15

    :pswitch_38
    invoke-interface/range {p4 .. p4}, Lv0/f1;->u()I

    move-result v2

    invoke-virtual {v8, v3}, Lv0/u0;->q(I)Lv0/a0$e;

    move-result-object v5

    if-eqz v5, :cond_11

    invoke-interface {v5, v2}, Lv0/a0$e;->a(I)Z

    move-result v5

    if-eqz v5, :cond_d

    :cond_11
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v4

    invoke-static {v10, v4, v5, v2}, Lv0/r1;->M(Ljava/lang/Object;JI)V

    goto :goto_15

    :pswitch_39
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lv0/f1;->l()I

    move-result v4

    invoke-static {v10, v1, v2, v4}, Lv0/r1;->M(Ljava/lang/Object;JI)V

    goto :goto_15

    :pswitch_3a
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lv0/f1;->F()Lv0/h;

    move-result-object v4

    invoke-static {v10, v1, v2, v4}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_15

    :pswitch_3b
    invoke-virtual {v8, v10, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-static {v10, v1, v2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v8, v3}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v2

    invoke-interface {v0, v2, v11}, Lv0/f1;->P(Lv0/g1;Lv0/p;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lv0/a0;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v2

    goto/16 :goto_14

    :cond_12
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-virtual {v8, v3}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v4

    invoke-interface {v0, v4, v11}, Lv0/f1;->P(Lv0/g1;Lv0/p;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v10, v1, v2, v4}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_15

    :pswitch_3c
    invoke-virtual {v8, v10, v4, v0}, Lv0/u0;->b0(Ljava/lang/Object;ILv0/f1;)V

    goto/16 :goto_15

    :pswitch_3d
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lv0/f1;->h()Z

    move-result v4

    invoke-static {v10, v1, v2, v4}, Lv0/r1;->E(Ljava/lang/Object;JZ)V

    goto/16 :goto_15

    :pswitch_3e
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lv0/f1;->g()I

    move-result v4

    invoke-static {v10, v1, v2, v4}, Lv0/r1;->M(Ljava/lang/Object;JI)V

    goto/16 :goto_15

    :pswitch_3f
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lv0/f1;->c()J

    move-result-wide v4

    invoke-static {v10, v1, v2, v4, v5}, Lv0/r1;->N(Ljava/lang/Object;JJ)V

    goto/16 :goto_15

    :pswitch_40
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lv0/f1;->H()I

    move-result v4

    invoke-static {v10, v1, v2, v4}, Lv0/r1;->M(Ljava/lang/Object;JI)V

    goto/16 :goto_15

    :pswitch_41
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lv0/f1;->b()J

    move-result-wide v4

    invoke-static {v10, v1, v2, v4, v5}, Lv0/r1;->N(Ljava/lang/Object;JJ)V

    goto/16 :goto_15

    :pswitch_42
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lv0/f1;->M()J

    move-result-wide v4

    invoke-static {v10, v1, v2, v4, v5}, Lv0/r1;->N(Ljava/lang/Object;JJ)V

    goto/16 :goto_15

    :pswitch_43
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lv0/f1;->readFloat()F

    move-result v4

    invoke-static {v10, v1, v2, v4}, Lv0/r1;->L(Ljava/lang/Object;JF)V

    goto/16 :goto_15

    :pswitch_44
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-interface/range {p4 .. p4}, Lv0/f1;->readDouble()D

    move-result-wide v4

    invoke-static {v10, v1, v2, v4, v5}, Lv0/r1;->K(Ljava/lang/Object;JD)V

    goto/16 :goto_15

    :goto_16
    move-object v13, v1

    :cond_13
    invoke-virtual {v9, v13, v0}, Lv0/n1;->m(Ljava/lang/Object;Lv0/f1;)Z

    move-result v1
    :try_end_3
    .catch Lv0/b0$a; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v1, :cond_0

    iget v0, v8, Lv0/u0;->k:I

    :goto_17
    iget v1, v8, Lv0/u0;->l:I

    if-ge v0, v1, :cond_14

    iget-object v1, v8, Lv0/u0;->j:[I

    aget v1, v1, v0

    invoke-virtual {v8, v10, v1, v13, v9}, Lv0/u0;->n(Ljava/lang/Object;ILjava/lang/Object;Lv0/n1;)Ljava/lang/Object;

    move-result-object v13

    add-int/lit8 v0, v0, 0x1

    goto :goto_17

    :cond_14
    if-eqz v13, :cond_15

    invoke-virtual {v9, v10, v13}, Lv0/n1;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_15
    return-void

    :catch_0
    :try_start_4
    invoke-virtual {v9, v0}, Lv0/n1;->q(Lv0/f1;)Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-interface/range {p4 .. p4}, Lv0/f1;->I()Z

    move-result v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v1, :cond_0

    iget v0, v8, Lv0/u0;->k:I

    :goto_18
    iget v1, v8, Lv0/u0;->l:I

    if-ge v0, v1, :cond_16

    iget-object v1, v8, Lv0/u0;->j:[I

    aget v1, v1, v0

    invoke-virtual {v8, v10, v1, v13, v9}, Lv0/u0;->n(Ljava/lang/Object;ILjava/lang/Object;Lv0/n1;)Ljava/lang/Object;

    move-result-object v13

    add-int/lit8 v0, v0, 0x1

    goto :goto_18

    :cond_16
    if-eqz v13, :cond_17

    invoke-virtual {v9, v10, v13}, Lv0/n1;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_17
    return-void

    :cond_18
    if-nez v13, :cond_19

    :try_start_5
    invoke-virtual {v9, v10}, Lv0/n1;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    :cond_19
    invoke-virtual {v9, v13, v0}, Lv0/n1;->m(Ljava/lang/Object;Lv0/f1;)Z

    move-result v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v1, :cond_0

    iget v0, v8, Lv0/u0;->k:I

    :goto_19
    iget v1, v8, Lv0/u0;->l:I

    if-ge v0, v1, :cond_1a

    iget-object v1, v8, Lv0/u0;->j:[I

    aget v1, v1, v0

    invoke-virtual {v8, v10, v1, v13, v9}, Lv0/u0;->n(Ljava/lang/Object;ILjava/lang/Object;Lv0/n1;)Ljava/lang/Object;

    move-result-object v13

    add-int/lit8 v0, v0, 0x1

    goto :goto_19

    :cond_1a
    if-eqz v13, :cond_1b

    invoke-virtual {v9, v10, v13}, Lv0/n1;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1b
    return-void

    :catchall_0
    move-exception v0

    iget v1, v8, Lv0/u0;->k:I

    :goto_1a
    iget v2, v8, Lv0/u0;->l:I

    if-ge v1, v2, :cond_1c

    iget-object v2, v8, Lv0/u0;->j:[I

    aget v2, v2, v1

    invoke-virtual {v8, v10, v2, v13, v9}, Lv0/u0;->n(Ljava/lang/Object;ILjava/lang/Object;Lv0/n1;)Ljava/lang/Object;

    move-result-object v13

    add-int/lit8 v1, v1, 0x1

    goto :goto_1a

    :cond_1c
    if-eqz v13, :cond_1d

    invoke-virtual {v9, v10, v13}, Lv0/n1;->o(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1d
    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final J(Ljava/lang/Object;ILjava/lang/Object;Lv0/p;Lv0/f1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "I",
            "Ljava/lang/Object;",
            "Lv0/p;",
            "Lv0/f1;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lv0/u0;->i0(I)I

    move-result p2

    invoke-static {p2}, Lv0/u0;->R(I)J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lv0/u0;->q:Lv0/m0;

    invoke-interface {p2, p3}, Lv0/m0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lv0/u0;->q:Lv0/m0;

    invoke-interface {v2, p2}, Lv0/m0;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lv0/u0;->q:Lv0/m0;

    invoke-interface {v2, p3}, Lv0/m0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lv0/u0;->q:Lv0/m0;

    invoke-interface {v3, v2, p2}, Lv0/m0;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p2, v2

    :cond_1
    :goto_0
    iget-object p1, p0, Lv0/u0;->q:Lv0/m0;

    invoke-interface {p1, p2}, Lv0/m0;->d(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    iget-object p2, p0, Lv0/u0;->q:Lv0/m0;

    invoke-interface {p2, p3}, Lv0/m0;->c(Ljava/lang/Object;)Lv0/k0$a;

    move-result-object p2

    invoke-interface {p5, p1, p2, p4}, Lv0/f1;->m(Ljava/util/Map;Lv0/k0$a;Lv0/p;)V

    return-void
.end method

.method public final K(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)V"
        }
    .end annotation

    invoke-virtual {p0, p3}, Lv0/u0;->i0(I)I

    move-result v0

    invoke-static {v0}, Lv0/u0;->R(I)J

    move-result-wide v0

    invoke-virtual {p0, p2, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    invoke-static {p1, v0, v1}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2, v0, v1}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    if-eqz v2, :cond_1

    if-eqz p2, :cond_1

    invoke-static {v2, p2}, Lv0/a0;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    :goto_0
    invoke-static {p1, v0, v1, p2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p3}, Lv0/u0;->e0(Ljava/lang/Object;I)V

    :cond_2
    return-void
.end method

.method public final L(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)V"
        }
    .end annotation

    invoke-virtual {p0, p3}, Lv0/u0;->i0(I)I

    move-result v0

    invoke-virtual {p0, p3}, Lv0/u0;->Q(I)I

    move-result v1

    invoke-static {v0}, Lv0/u0;->R(I)J

    move-result-wide v2

    invoke-virtual {p0, p2, v1, p3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1, v2, v3}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2, v2, v3}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    invoke-static {v0, p2}, Lv0/a0;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    :goto_0
    invoke-static {p1, v2, v3, p2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v1, p3}, Lv0/u0;->f0(Ljava/lang/Object;II)V

    :cond_2
    return-void
.end method

.method public final M(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)V"
        }
    .end annotation

    invoke-virtual {p0, p3}, Lv0/u0;->i0(I)I

    move-result v0

    invoke-static {v0}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-virtual {p0, p3}, Lv0/u0;->Q(I)I

    move-result v3

    invoke-static {v0}, Lv0/u0;->h0(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_6

    :pswitch_0
    invoke-virtual {p0, p2, v3, p3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->L(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_6

    :pswitch_2
    invoke-virtual {p0, p2, v3, p3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    invoke-static {p2, v1, v2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v1, v2, p2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, v3, p3}, Lv0/u0;->f0(Ljava/lang/Object;II)V

    goto/16 :goto_6

    :pswitch_3
    iget-object p3, p0, Lv0/u0;->q:Lv0/m0;

    invoke-static {p3, p1, p2, v1, v2}, Lv0/i1;->F(Lv0/m0;Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_6

    :pswitch_4
    iget-object p3, p0, Lv0/u0;->n:Lv0/h0;

    invoke-virtual {p3, p1, p2, v1, v2}, Lv0/h0;->d(Ljava/lang/Object;Ljava/lang/Object;J)V

    goto/16 :goto_6

    :pswitch_5
    invoke-virtual {p0, p2, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :pswitch_6
    invoke-virtual {p0, p2, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :pswitch_7
    invoke-virtual {p0, p2, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :pswitch_8
    invoke-virtual {p0, p2, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :pswitch_9
    invoke-virtual {p0, p2, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    goto :goto_3

    :pswitch_a
    invoke-virtual {p0, p2, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    :pswitch_b
    invoke-virtual {p0, p2, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :pswitch_c
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->K(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_6

    :pswitch_d
    invoke-virtual {p0, p2, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_2
    invoke-static {p2, v1, v2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v1, v2, p2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_5

    :pswitch_e
    invoke-virtual {p0, p2, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lv0/r1;->p(Ljava/lang/Object;J)Z

    move-result p2

    invoke-static {p1, v1, v2, p2}, Lv0/r1;->E(Ljava/lang/Object;JZ)V

    goto :goto_5

    :pswitch_f
    invoke-virtual {p0, p2, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    :pswitch_10
    invoke-virtual {p0, p2, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_4

    :pswitch_11
    invoke-virtual {p0, p2, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_3
    invoke-static {p2, v1, v2}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p2

    invoke-static {p1, v1, v2, p2}, Lv0/r1;->M(Ljava/lang/Object;JI)V

    goto :goto_5

    :pswitch_12
    invoke-virtual {p0, p2, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_4

    :pswitch_13
    invoke-virtual {p0, p2, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_4
    invoke-static {p2, v1, v2}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {p1, v1, v2, v3, v4}, Lv0/r1;->N(Ljava/lang/Object;JJ)V

    goto :goto_5

    :pswitch_14
    invoke-virtual {p0, p2, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lv0/r1;->w(Ljava/lang/Object;J)F

    move-result p2

    invoke-static {p1, v1, v2, p2}, Lv0/r1;->L(Ljava/lang/Object;JF)V

    goto :goto_5

    :pswitch_15
    invoke-virtual {p0, p2, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2, v1, v2}, Lv0/r1;->v(Ljava/lang/Object;J)D

    move-result-wide v3

    invoke-static {p1, v1, v2, v3, v4}, Lv0/r1;->K(Ljava/lang/Object;JD)V

    :goto_5
    invoke-virtual {p0, p1, p3}, Lv0/u0;->e0(Ljava/lang/Object;I)V

    :cond_0
    :goto_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_c
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final Q(I)I
    .locals 1

    iget-object v0, p0, Lv0/u0;->a:[I

    aget p1, v0, p1

    return p1
.end method

.method public final X(I)I
    .locals 1

    iget v0, p0, Lv0/u0;->c:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Lv0/u0;->d:I

    if-gt p1, v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lv0/u0;->g0(II)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final Y(I)I
    .locals 1

    iget-object v0, p0, Lv0/u0;->a:[I

    add-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method public final Z(Ljava/lang/Object;JLv0/f1;Lv0/g1;Lv0/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "J",
            "Lv0/f1;",
            "Lv0/g1<",
            "TE;>;",
            "Lv0/p;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lv0/u0;->n:Lv0/h0;

    invoke-virtual {v0, p1, p2, p3}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    invoke-interface {p4, p1, p5, p6}, Lv0/f1;->x(Ljava/util/List;Lv0/g1;Lv0/p;)V

    return-void
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)V"
        }
    .end annotation

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lv0/u0;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p0, p1, p2, v0}, Lv0/u0;->M(Ljava/lang/Object;Ljava/lang/Object;I)V

    add-int/lit8 v0, v0, 0x3

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lv0/u0;->h:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lv0/u0;->o:Lv0/n1;

    invoke-static {v0, p1, p2}, Lv0/i1;->G(Lv0/n1;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lv0/u0;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lv0/u0;->p:Lv0/q;

    invoke-static {v0, p1, p2}, Lv0/i1;->E(Lv0/q;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final a0(Ljava/lang/Object;ILv0/f1;Lv0/g1;Lv0/p;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "I",
            "Lv0/f1;",
            "Lv0/g1<",
            "TE;>;",
            "Lv0/p;",
            ")V"
        }
    .end annotation

    invoke-static {p2}, Lv0/u0;->R(I)J

    move-result-wide v0

    iget-object p2, p0, Lv0/u0;->n:Lv0/h0;

    invoke-virtual {p2, p1, v0, v1}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    invoke-interface {p3, p1, p4, p5}, Lv0/f1;->t(Ljava/util/List;Lv0/g1;Lv0/p;)V

    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget v0, p0, Lv0/u0;->k:I

    :goto_0
    iget v1, p0, Lv0/u0;->l:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lv0/u0;->j:[I

    aget v1, v1, v0

    invoke-virtual {p0, v1}, Lv0/u0;->i0(I)I

    move-result v1

    invoke-static {v1}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-static {p1, v1, v2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    iget-object v4, p0, Lv0/u0;->q:Lv0/m0;

    invoke-interface {v4, v3}, Lv0/m0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p1, v1, v2, v3}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lv0/u0;->j:[I

    array-length v0, v0

    :goto_2
    if-ge v1, v0, :cond_2

    iget-object v2, p0, Lv0/u0;->n:Lv0/h0;

    iget-object v3, p0, Lv0/u0;->j:[I

    aget v3, v3, v1

    int-to-long v3, v3

    invoke-virtual {v2, p1, v3, v4}, Lv0/h0;->c(Ljava/lang/Object;J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lv0/u0;->o:Lv0/n1;

    invoke-virtual {v0, p1}, Lv0/n1;->j(Ljava/lang/Object;)V

    iget-boolean v0, p0, Lv0/u0;->f:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lv0/u0;->p:Lv0/q;

    invoke-virtual {v0, p1}, Lv0/q;->f(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public final b0(Ljava/lang/Object;ILv0/f1;)V
    .locals 2

    invoke-static {p2}, Lv0/u0;->x(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Lv0/u0;->R(I)J

    move-result-wide v0

    invoke-interface {p3}, Lv0/f1;->N()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-static {p1, v0, v1, p2}, Lv0/r1;->O(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, Lv0/u0;->g:Z

    if-eqz v0, :cond_1

    invoke-static {p2}, Lv0/u0;->R(I)J

    move-result-wide v0

    invoke-interface {p3}, Lv0/f1;->B()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_1
    invoke-static {p2}, Lv0/u0;->R(I)J

    move-result-wide v0

    invoke-interface {p3}, Lv0/f1;->F()Lv0/h;

    move-result-object p2

    goto :goto_0

    :goto_1
    return-void
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, -0x1

    move v2, v0

    move v3, v2

    :goto_0
    iget v4, p0, Lv0/u0;->k:I

    const/4 v5, 0x1

    if-ge v2, v4, :cond_8

    iget-object v4, p0, Lv0/u0;->j:[I

    aget v4, v4, v2

    invoke-virtual {p0, v4}, Lv0/u0;->Q(I)I

    move-result v6

    invoke-virtual {p0, v4}, Lv0/u0;->i0(I)I

    move-result v7

    iget-boolean v8, p0, Lv0/u0;->h:Z

    if-nez v8, :cond_0

    iget-object v8, p0, Lv0/u0;->a:[I

    add-int/lit8 v9, v4, 0x2

    aget v8, v8, v9

    const v9, 0xfffff

    and-int/2addr v9, v8

    ushr-int/lit8 v8, v8, 0x14

    shl-int/2addr v5, v8

    if-eq v9, v1, :cond_1

    sget-object v1, Lv0/u0;->s:Lsun/misc/Unsafe;

    int-to-long v10, v9

    invoke-virtual {v1, p1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    move v1, v9

    goto :goto_1

    :cond_0
    move v5, v0

    :cond_1
    :goto_1
    invoke-static {v7}, Lv0/u0;->F(I)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {p0, p1, v4, v3, v5}, Lv0/u0;->z(Ljava/lang/Object;III)Z

    move-result v8

    if-nez v8, :cond_2

    return v0

    :cond_2
    invoke-static {v7}, Lv0/u0;->h0(I)I

    move-result v8

    const/16 v9, 0x9

    if-eq v8, v9, :cond_6

    const/16 v9, 0x11

    if-eq v8, v9, :cond_6

    const/16 v5, 0x1b

    if-eq v8, v5, :cond_5

    const/16 v5, 0x3c

    if-eq v8, v5, :cond_4

    const/16 v5, 0x44

    if-eq v8, v5, :cond_4

    const/16 v5, 0x31

    if-eq v8, v5, :cond_5

    const/16 v5, 0x32

    if-eq v8, v5, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p0, p1, v7, v4}, Lv0/u0;->C(Ljava/lang/Object;II)Z

    move-result v4

    if-nez v4, :cond_7

    return v0

    :cond_4
    invoke-virtual {p0, p1, v6, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {p0, v4}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v4

    invoke-static {p1, v7, v4}, Lv0/u0;->A(Ljava/lang/Object;ILv0/g1;)Z

    move-result v4

    if-nez v4, :cond_7

    return v0

    :cond_5
    invoke-virtual {p0, p1, v7, v4}, Lv0/u0;->B(Ljava/lang/Object;II)Z

    move-result v4

    if-nez v4, :cond_7

    return v0

    :cond_6
    invoke-virtual {p0, p1, v4, v3, v5}, Lv0/u0;->z(Ljava/lang/Object;III)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {p0, v4}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v4

    invoke-static {p1, v7, v4}, Lv0/u0;->A(Ljava/lang/Object;ILv0/g1;)Z

    move-result v4

    if-nez v4, :cond_7

    return v0

    :cond_7
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_8
    iget-boolean v1, p0, Lv0/u0;->f:Z

    if-eqz v1, :cond_9

    iget-object v1, p0, Lv0/u0;->p:Lv0/q;

    invoke-virtual {v1, p1}, Lv0/q;->c(Ljava/lang/Object;)Lv0/u;

    move-result-object p1

    invoke-virtual {p1}, Lv0/u;->p()Z

    move-result p1

    if-nez p1, :cond_9

    return v0

    :cond_9
    return v5
.end method

.method public final c0(Ljava/lang/Object;ILv0/f1;)V
    .locals 3

    invoke-static {p2}, Lv0/u0;->x(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv0/u0;->n:Lv0/h0;

    invoke-static {p2}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    invoke-interface {p3, p1}, Lv0/f1;->E(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lv0/u0;->n:Lv0/h0;

    invoke-static {p2}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lv0/h0;->e(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object p1

    invoke-interface {p3, p1}, Lv0/f1;->D(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public d(Ljava/lang/Object;Lv0/u1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lv0/u1;",
            ")V"
        }
    .end annotation

    invoke-interface {p2}, Lv0/u1;->j()Lv0/u1$a;

    move-result-object v0

    sget-object v1, Lv0/u1$a;->i:Lv0/u1$a;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1, p2}, Lv0/u0;->l0(Ljava/lang/Object;Lv0/u1;)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lv0/u0;->h:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1, p2}, Lv0/u0;->k0(Ljava/lang/Object;Lv0/u1;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lv0/u0;->j0(Ljava/lang/Object;Lv0/u1;)V

    :goto_0
    return-void
.end method

.method public e(Ljava/lang/Object;Lv0/f1;Lv0/p;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lv0/f1;",
            "Lv0/p;",
            ")V"
        }
    .end annotation

    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lv0/u0;->o:Lv0/n1;

    iget-object v2, p0, Lv0/u0;->p:Lv0/q;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lv0/u0;->I(Lv0/n1;Lv0/q;Ljava/lang/Object;Lv0/f1;Lv0/p;)V

    return-void
.end method

.method public final e0(Ljava/lang/Object;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation

    iget-boolean v0, p0, Lv0/u0;->h:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p2}, Lv0/u0;->Y(I)I

    move-result p2

    const/4 v0, 0x1

    ushr-int/lit8 v1, p2, 0x14

    shl-int/2addr v0, v1

    const v1, 0xfffff

    and-int/2addr p2, v1

    int-to-long v1, p2

    invoke-static {p1, v1, v2}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p2

    or-int/2addr p2, v0

    invoke-static {p1, v1, v2, p2}, Lv0/r1;->M(Ljava/lang/Object;JI)V

    return-void
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lv0/u0;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, p1, p2, v2}, Lv0/u0;->m(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x3

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lv0/u0;->o:Lv0/n1;

    invoke-virtual {v0, p1}, Lv0/n1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lv0/u0;->o:Lv0/n1;

    invoke-virtual {v2, p2}, Lv0/n1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    iget-boolean v0, p0, Lv0/u0;->f:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lv0/u0;->p:Lv0/q;

    invoke-virtual {v0, p1}, Lv0/q;->c(Ljava/lang/Object;)Lv0/u;

    move-result-object p1

    iget-object v0, p0, Lv0/u0;->p:Lv0/q;

    invoke-virtual {v0, p2}, Lv0/q;->c(Ljava/lang/Object;)Lv0/u;

    move-result-object p2

    invoke-virtual {p1, p2}, Lv0/u;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final f0(Ljava/lang/Object;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;II)V"
        }
    .end annotation

    invoke-virtual {p0, p3}, Lv0/u0;->Y(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1, p2}, Lv0/r1;->M(Ljava/lang/Object;JI)V

    return-void
.end method

.method public g(Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    iget-boolean v0, p0, Lv0/u0;->h:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lv0/u0;->u(Ljava/lang/Object;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lv0/u0;->t(Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final g0(II)I
    .locals 4

    iget-object v0, p0, Lv0/u0;->a:[I

    array-length v0, v0

    div-int/lit8 v0, v0, 0x3

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-gt p2, v0, :cond_2

    add-int v1, v0, p2

    ushr-int/lit8 v1, v1, 0x1

    mul-int/lit8 v2, v1, 0x3

    invoke-virtual {p0, v2}, Lv0/u0;->Q(I)I

    move-result v3

    if-ne p1, v3, :cond_0

    return v2

    :cond_0
    if-ge p1, v3, :cond_1

    add-int/lit8 v1, v1, -0x1

    move v0, v1

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    move p2, v1

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public h()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lv0/u0;->m:Lv0/w0;

    iget-object v1, p0, Lv0/u0;->e:Lv0/r0;

    invoke-interface {v0, v1}, Lv0/w0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public i(Ljava/lang/Object;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    iget-object v0, p0, Lv0/u0;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Lv0/u0;->i0(I)I

    move-result v3

    invoke-virtual {p0, v1}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-static {v3}, Lv0/u0;->R(I)J

    move-result-wide v5

    invoke-static {v3}, Lv0/u0;->h0(I)I

    move-result v3

    const/16 v7, 0x25

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_e

    :pswitch_0
    invoke-virtual {p0, p1, v4, v1}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    :pswitch_1
    invoke-virtual {p0, p1, v4, v1}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :pswitch_2
    invoke-virtual {p0, p1, v4, v1}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0, p1, v4, v1}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :pswitch_4
    invoke-virtual {p0, p1, v4, v1}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :pswitch_5
    invoke-virtual {p0, p1, v4, v1}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_1
    goto :goto_3

    :pswitch_6
    invoke-virtual {p0, p1, v4, v1}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_3

    :pswitch_7
    invoke-virtual {p0, p1, v4, v1}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_5

    :pswitch_8
    invoke-virtual {p0, p1, v4, v1}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_2
    invoke-static {p1, v5, v6}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    mul-int/lit8 v2, v2, 0x35

    goto/16 :goto_6

    :pswitch_9
    invoke-virtual {p0, p1, v4, v1}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_8

    :pswitch_a
    invoke-virtual {p0, p1, v4, v1}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lv0/u0;->S(Ljava/lang/Object;J)Z

    move-result v3

    goto/16 :goto_9

    :pswitch_b
    invoke-virtual {p0, p1, v4, v1}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_3

    :pswitch_c
    invoke-virtual {p0, p1, v4, v1}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_4

    :pswitch_d
    invoke-virtual {p0, p1, v4, v1}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_3
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_d

    :pswitch_e
    invoke-virtual {p0, p1, v4, v1}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_4

    :pswitch_f
    invoke-virtual {p0, p1, v4, v1}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_4
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v3

    goto/16 :goto_c

    :pswitch_10
    invoke-virtual {p0, p1, v4, v1}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lv0/u0;->U(Ljava/lang/Object;J)F

    move-result v3

    goto :goto_a

    :pswitch_11
    invoke-virtual {p0, p1, v4, v1}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_1

    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lv0/u0;->T(Ljava/lang/Object;J)D

    move-result-wide v3

    goto :goto_b

    :pswitch_12
    invoke-static {p1, v5, v6}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_7

    :goto_5
    :pswitch_13
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    :goto_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_d

    :pswitch_14
    invoke-static {p1, v5, v6}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    :goto_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v7

    :cond_0
    mul-int/lit8 v2, v2, 0x35

    add-int/2addr v2, v7

    goto :goto_e

    :goto_8
    :pswitch_15
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_d

    :pswitch_16
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lv0/r1;->p(Ljava/lang/Object;J)Z

    move-result v3

    :goto_9
    invoke-static {v3}, Lv0/a0;->c(Z)I

    move-result v3

    goto :goto_d

    :pswitch_17
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result v3

    goto :goto_d

    :pswitch_18
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide v3

    goto :goto_c

    :pswitch_19
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lv0/r1;->w(Ljava/lang/Object;J)F

    move-result v3

    :goto_a
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    goto :goto_d

    :pswitch_1a
    mul-int/lit8 v2, v2, 0x35

    invoke-static {p1, v5, v6}, Lv0/r1;->v(Ljava/lang/Object;J)D

    move-result-wide v3

    :goto_b
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    :goto_c
    invoke-static {v3, v4}, Lv0/a0;->f(J)I

    move-result v3

    :goto_d
    add-int/2addr v2, v3

    :cond_1
    :goto_e
    add-int/lit8 v1, v1, 0x3

    goto/16 :goto_0

    :cond_2
    mul-int/lit8 v2, v2, 0x35

    iget-object v0, p0, Lv0/u0;->o:Lv0/n1;

    invoke-virtual {v0, p1}, Lv0/n1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    iget-boolean v0, p0, Lv0/u0;->f:Z

    if-eqz v0, :cond_3

    mul-int/lit8 v2, v2, 0x35

    iget-object v0, p0, Lv0/u0;->p:Lv0/q;

    invoke-virtual {v0, p1}, Lv0/q;->c(Ljava/lang/Object;)Lv0/u;

    move-result-object p1

    invoke-virtual {p1}, Lv0/u;->hashCode()I

    move-result p1

    add-int/2addr v2, p1

    :cond_3
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_18
        :pswitch_17
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_18
        :pswitch_17
        :pswitch_18
        :pswitch_12
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i0(I)I
    .locals 1

    iget-object v0, p0, Lv0/u0;->a:[I

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)Z"
        }
    .end annotation

    invoke-virtual {p0, p1, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result p1

    invoke-virtual {p0, p2, p3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final j0(Ljava/lang/Object;Lv0/u1;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lv0/u1;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-boolean v3, v0, Lv0/u0;->f:Z

    if-eqz v3, :cond_0

    iget-object v3, v0, Lv0/u0;->p:Lv0/q;

    invoke-virtual {v3, v1}, Lv0/q;->c(Ljava/lang/Object;)Lv0/u;

    move-result-object v3

    invoke-virtual {v3}, Lv0/u;->n()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v3}, Lv0/u;->s()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_0
    const/4 v6, -0x1

    iget-object v7, v0, Lv0/u0;->a:[I

    array-length v7, v7

    sget-object v8, Lv0/u0;->s:Lsun/misc/Unsafe;

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_1
    if-ge v10, v7, :cond_7

    invoke-virtual {v0, v10}, Lv0/u0;->i0(I)I

    move-result v12

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v13

    invoke-static {v12}, Lv0/u0;->h0(I)I

    move-result v14

    iget-boolean v15, v0, Lv0/u0;->h:Z

    if-nez v15, :cond_2

    const/16 v15, 0x11

    if-gt v14, v15, :cond_2

    iget-object v15, v0, Lv0/u0;->a:[I

    add-int/lit8 v16, v10, 0x2

    aget v15, v15, v16

    const v16, 0xfffff

    and-int v9, v15, v16

    move-object/from16 v16, v5

    if-eq v9, v6, :cond_1

    int-to-long v4, v9

    invoke-virtual {v8, v1, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v11

    move v6, v9

    :cond_1
    ushr-int/lit8 v4, v15, 0x14

    const/4 v5, 0x1

    shl-int v4, v5, v4

    move-object/from16 v5, v16

    goto :goto_2

    :cond_2
    move-object/from16 v16, v5

    move-object/from16 v5, v16

    const/4 v4, 0x0

    :goto_2
    if-eqz v5, :cond_4

    iget-object v9, v0, Lv0/u0;->p:Lv0/q;

    invoke-virtual {v9, v5}, Lv0/q;->a(Ljava/util/Map$Entry;)I

    move-result v9

    if-gt v9, v13, :cond_4

    iget-object v9, v0, Lv0/u0;->p:Lv0/q;

    invoke-virtual {v9, v2, v5}, Lv0/q;->j(Lv0/u1;Ljava/util/Map$Entry;)V

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    goto :goto_2

    :cond_4
    move-object v15, v5

    move v9, v6

    invoke-static {v12}, Lv0/u0;->R(I)J

    move-result-wide v5

    packed-switch v14, :pswitch_data_0

    :cond_5
    :goto_3
    const/4 v12, 0x0

    goto/16 :goto_4

    :pswitch_0
    invoke-virtual {v0, v1, v13, v10}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v10}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v5

    invoke-interface {v2, v13, v4, v5}, Lv0/u1;->l(ILjava/lang/Object;Lv0/g1;)V

    goto :goto_3

    :pswitch_1
    invoke-virtual {v0, v1, v13, v10}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v5, v6}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-interface {v2, v13, v4, v5}, Lv0/u1;->F(IJ)V

    goto :goto_3

    :pswitch_2
    invoke-virtual {v0, v1, v13, v10}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v5, v6}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v13, v4}, Lv0/u1;->N(II)V

    goto :goto_3

    :pswitch_3
    invoke-virtual {v0, v1, v13, v10}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v5, v6}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-interface {v2, v13, v4, v5}, Lv0/u1;->x(IJ)V

    goto :goto_3

    :pswitch_4
    invoke-virtual {v0, v1, v13, v10}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v5, v6}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v13, v4}, Lv0/u1;->s(II)V

    goto :goto_3

    :pswitch_5
    invoke-virtual {v0, v1, v13, v10}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v5, v6}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v13, v4}, Lv0/u1;->J(II)V

    goto :goto_3

    :pswitch_6
    invoke-virtual {v0, v1, v13, v10}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v5, v6}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v13, v4}, Lv0/u1;->b(II)V

    goto :goto_3

    :pswitch_7
    invoke-virtual {v0, v1, v13, v10}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lv0/h;

    invoke-interface {v2, v13, v4}, Lv0/u1;->e(ILv0/h;)V

    goto :goto_3

    :pswitch_8
    invoke-virtual {v0, v1, v13, v10}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v10}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v5

    invoke-interface {v2, v13, v4, v5}, Lv0/u1;->r(ILjava/lang/Object;Lv0/g1;)V

    goto/16 :goto_3

    :pswitch_9
    invoke-virtual {v0, v1, v13, v10}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v13, v4, v2}, Lv0/u0;->n0(ILjava/lang/Object;Lv0/u1;)V

    goto/16 :goto_3

    :pswitch_a
    invoke-virtual {v0, v1, v13, v10}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v5, v6}, Lv0/u0;->S(Ljava/lang/Object;J)Z

    move-result v4

    invoke-interface {v2, v13, v4}, Lv0/u1;->q(IZ)V

    goto/16 :goto_3

    :pswitch_b
    invoke-virtual {v0, v1, v13, v10}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v5, v6}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v13, v4}, Lv0/u1;->d(II)V

    goto/16 :goto_3

    :pswitch_c
    invoke-virtual {v0, v1, v13, v10}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v5, v6}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-interface {v2, v13, v4, v5}, Lv0/u1;->i(IJ)V

    goto/16 :goto_3

    :pswitch_d
    invoke-virtual {v0, v1, v13, v10}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v5, v6}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v13, v4}, Lv0/u1;->u(II)V

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {v0, v1, v13, v10}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v5, v6}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-interface {v2, v13, v4, v5}, Lv0/u1;->n(IJ)V

    goto/16 :goto_3

    :pswitch_f
    invoke-virtual {v0, v1, v13, v10}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v5, v6}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-interface {v2, v13, v4, v5}, Lv0/u1;->p(IJ)V

    goto/16 :goto_3

    :pswitch_10
    invoke-virtual {v0, v1, v13, v10}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v5, v6}, Lv0/u0;->U(Ljava/lang/Object;J)F

    move-result v4

    invoke-interface {v2, v13, v4}, Lv0/u1;->G(IF)V

    goto/16 :goto_3

    :pswitch_11
    invoke-virtual {v0, v1, v13, v10}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1, v5, v6}, Lv0/u0;->T(Ljava/lang/Object;J)D

    move-result-wide v4

    invoke-interface {v2, v13, v4, v5}, Lv0/u1;->f(ID)V

    goto/16 :goto_3

    :pswitch_12
    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v2, v13, v4, v10}, Lv0/u0;->m0(Lv0/u1;ILjava/lang/Object;I)V

    goto/16 :goto_3

    :pswitch_13
    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-virtual {v0, v10}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v6

    invoke-static {v4, v5, v2, v6}, Lv0/i1;->U(ILjava/util/List;Lv0/u1;Lv0/g1;)V

    goto/16 :goto_3

    :pswitch_14
    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const/4 v12, 0x1

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->b0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_3

    :pswitch_15
    const/4 v12, 0x1

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->a0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_3

    :pswitch_16
    const/4 v12, 0x1

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->Z(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_3

    :pswitch_17
    const/4 v12, 0x1

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->Y(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_3

    :pswitch_18
    const/4 v12, 0x1

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->Q(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_3

    :pswitch_19
    const/4 v12, 0x1

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->d0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_3

    :pswitch_1a
    const/4 v12, 0x1

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->N(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_3

    :pswitch_1b
    const/4 v12, 0x1

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->R(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_3

    :pswitch_1c
    const/4 v12, 0x1

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->S(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_3

    :pswitch_1d
    const/4 v12, 0x1

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->V(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_3

    :pswitch_1e
    const/4 v12, 0x1

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->e0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_3

    :pswitch_1f
    const/4 v12, 0x1

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->W(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_3

    :pswitch_20
    const/4 v12, 0x1

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->T(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_3

    :pswitch_21
    const/4 v12, 0x1

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->P(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_3

    :pswitch_22
    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const/4 v12, 0x0

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->b0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_4

    :pswitch_23
    const/4 v12, 0x0

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->a0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_4

    :pswitch_24
    const/4 v12, 0x0

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->Z(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_4

    :pswitch_25
    const/4 v12, 0x0

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->Y(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_4

    :pswitch_26
    const/4 v12, 0x0

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->Q(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_4

    :pswitch_27
    const/4 v12, 0x0

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->d0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_4

    :pswitch_28
    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2}, Lv0/i1;->O(ILjava/util/List;Lv0/u1;)V

    goto/16 :goto_3

    :pswitch_29
    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-virtual {v0, v10}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v6

    invoke-static {v4, v5, v2, v6}, Lv0/i1;->X(ILjava/util/List;Lv0/u1;Lv0/g1;)V

    goto/16 :goto_3

    :pswitch_2a
    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2}, Lv0/i1;->c0(ILjava/util/List;Lv0/u1;)V

    goto/16 :goto_3

    :pswitch_2b
    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const/4 v12, 0x0

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->N(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_4

    :pswitch_2c
    const/4 v12, 0x0

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->R(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_4

    :pswitch_2d
    const/4 v12, 0x0

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->S(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_4

    :pswitch_2e
    const/4 v12, 0x0

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->V(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_4

    :pswitch_2f
    const/4 v12, 0x0

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->e0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_4

    :pswitch_30
    const/4 v12, 0x0

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->W(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_4

    :pswitch_31
    const/4 v12, 0x0

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->T(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_4

    :pswitch_32
    const/4 v12, 0x0

    invoke-virtual {v0, v10}, Lv0/u0;->Q(I)I

    move-result v4

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v4, v5, v2, v12}, Lv0/i1;->P(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_4

    :pswitch_33
    const/4 v12, 0x0

    and-int/2addr v4, v11

    if-eqz v4, :cond_6

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v10}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v5

    invoke-interface {v2, v13, v4, v5}, Lv0/u1;->l(ILjava/lang/Object;Lv0/g1;)V

    goto/16 :goto_4

    :pswitch_34
    const/4 v12, 0x0

    and-int/2addr v4, v11

    if-eqz v4, :cond_6

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-interface {v2, v13, v4, v5}, Lv0/u1;->F(IJ)V

    goto/16 :goto_4

    :pswitch_35
    const/4 v12, 0x0

    and-int/2addr v4, v11

    if-eqz v4, :cond_6

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v13, v4}, Lv0/u1;->N(II)V

    goto/16 :goto_4

    :pswitch_36
    const/4 v12, 0x0

    and-int/2addr v4, v11

    if-eqz v4, :cond_6

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-interface {v2, v13, v4, v5}, Lv0/u1;->x(IJ)V

    goto/16 :goto_4

    :pswitch_37
    const/4 v12, 0x0

    and-int/2addr v4, v11

    if-eqz v4, :cond_6

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v13, v4}, Lv0/u1;->s(II)V

    goto/16 :goto_4

    :pswitch_38
    const/4 v12, 0x0

    and-int/2addr v4, v11

    if-eqz v4, :cond_6

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v13, v4}, Lv0/u1;->J(II)V

    goto/16 :goto_4

    :pswitch_39
    const/4 v12, 0x0

    and-int/2addr v4, v11

    if-eqz v4, :cond_6

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v13, v4}, Lv0/u1;->b(II)V

    goto/16 :goto_4

    :pswitch_3a
    const/4 v12, 0x0

    and-int/2addr v4, v11

    if-eqz v4, :cond_6

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lv0/h;

    invoke-interface {v2, v13, v4}, Lv0/u1;->e(ILv0/h;)V

    goto/16 :goto_4

    :pswitch_3b
    const/4 v12, 0x0

    and-int/2addr v4, v11

    if-eqz v4, :cond_6

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v10}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v5

    invoke-interface {v2, v13, v4, v5}, Lv0/u1;->r(ILjava/lang/Object;Lv0/g1;)V

    goto/16 :goto_4

    :pswitch_3c
    const/4 v12, 0x0

    and-int/2addr v4, v11

    if-eqz v4, :cond_6

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v13, v4, v2}, Lv0/u0;->n0(ILjava/lang/Object;Lv0/u1;)V

    goto :goto_4

    :pswitch_3d
    const/4 v12, 0x0

    and-int/2addr v4, v11

    if-eqz v4, :cond_6

    invoke-static {v1, v5, v6}, Lv0/u0;->k(Ljava/lang/Object;J)Z

    move-result v4

    invoke-interface {v2, v13, v4}, Lv0/u1;->q(IZ)V

    goto :goto_4

    :pswitch_3e
    const/4 v12, 0x0

    and-int/2addr v4, v11

    if-eqz v4, :cond_6

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v13, v4}, Lv0/u1;->d(II)V

    goto :goto_4

    :pswitch_3f
    const/4 v12, 0x0

    and-int/2addr v4, v11

    if-eqz v4, :cond_6

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-interface {v2, v13, v4, v5}, Lv0/u1;->i(IJ)V

    goto :goto_4

    :pswitch_40
    const/4 v12, 0x0

    and-int/2addr v4, v11

    if-eqz v4, :cond_6

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    invoke-interface {v2, v13, v4}, Lv0/u1;->u(II)V

    goto :goto_4

    :pswitch_41
    const/4 v12, 0x0

    and-int/2addr v4, v11

    if-eqz v4, :cond_6

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-interface {v2, v13, v4, v5}, Lv0/u1;->n(IJ)V

    goto :goto_4

    :pswitch_42
    const/4 v12, 0x0

    and-int/2addr v4, v11

    if-eqz v4, :cond_6

    invoke-virtual {v8, v1, v5, v6}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v4

    invoke-interface {v2, v13, v4, v5}, Lv0/u1;->p(IJ)V

    goto :goto_4

    :pswitch_43
    const/4 v12, 0x0

    and-int/2addr v4, v11

    if-eqz v4, :cond_6

    invoke-static {v1, v5, v6}, Lv0/u0;->p(Ljava/lang/Object;J)F

    move-result v4

    invoke-interface {v2, v13, v4}, Lv0/u1;->G(IF)V

    goto :goto_4

    :pswitch_44
    const/4 v12, 0x0

    and-int/2addr v4, v11

    if-eqz v4, :cond_6

    invoke-static {v1, v5, v6}, Lv0/u0;->l(Ljava/lang/Object;J)D

    move-result-wide v4

    invoke-interface {v2, v13, v4, v5}, Lv0/u1;->f(ID)V

    :cond_6
    :goto_4
    add-int/lit8 v10, v10, 0x3

    move v6, v9

    move-object v5, v15

    goto/16 :goto_1

    :cond_7
    move-object/from16 v16, v5

    :goto_5
    if-eqz v5, :cond_9

    iget-object v4, v0, Lv0/u0;->p:Lv0/q;

    invoke-virtual {v4, v2, v5}, Lv0/q;->j(Lv0/u1;Ljava/util/Map$Entry;)V

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    move-object v5, v4

    goto :goto_5

    :cond_8
    const/4 v5, 0x0

    goto :goto_5

    :cond_9
    iget-object v3, v0, Lv0/u0;->o:Lv0/n1;

    invoke-virtual {v0, v3, v1, v2}, Lv0/u0;->o0(Lv0/n1;Ljava/lang/Object;Lv0/u1;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final k0(Ljava/lang/Object;Lv0/u1;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lv0/u1;",
            ")V"
        }
    .end annotation

    iget-boolean v0, p0, Lv0/u0;->f:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv0/u0;->p:Lv0/q;

    invoke-virtual {v0, p1}, Lv0/q;->c(Ljava/lang/Object;)Lv0/u;

    move-result-object v0

    invoke-virtual {v0}, Lv0/u;->n()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lv0/u;->s()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    move-object v0, v1

    move-object v2, v0

    :goto_0
    iget-object v3, p0, Lv0/u0;->a:[I

    array-length v3, v3

    const/4 v4, 0x0

    move v5, v4

    :goto_1
    if-ge v5, v3, :cond_4

    invoke-virtual {p0, v5}, Lv0/u0;->i0(I)I

    move-result v6

    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    :goto_2
    if-eqz v2, :cond_2

    iget-object v8, p0, Lv0/u0;->p:Lv0/q;

    invoke-virtual {v8, v2}, Lv0/q;->a(Ljava/util/Map$Entry;)I

    move-result v8

    if-gt v8, v7, :cond_2

    iget-object v8, p0, Lv0/u0;->p:Lv0/q;

    invoke-virtual {v8, p2, v2}, Lv0/q;->j(Lv0/u1;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_2

    :cond_1
    move-object v2, v1

    goto :goto_2

    :cond_2
    invoke-static {v6}, Lv0/u0;->h0(I)I

    move-result v8

    const/4 v9, 0x1

    packed-switch v8, :pswitch_data_0

    goto/16 :goto_15

    :pswitch_0
    invoke-virtual {p0, p1, v7, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    goto/16 :goto_3

    :pswitch_1
    invoke-virtual {p0, p1, v7, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v8

    goto/16 :goto_4

    :pswitch_2
    invoke-virtual {p0, p1, v7, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_5

    :pswitch_3
    invoke-virtual {p0, p1, v7, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v8

    goto/16 :goto_6

    :pswitch_4
    invoke-virtual {p0, p1, v7, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_7

    :pswitch_5
    invoke-virtual {p0, p1, v7, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_8

    :pswitch_6
    invoke-virtual {p0, p1, v7, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_9

    :pswitch_7
    invoke-virtual {p0, p1, v7, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    goto/16 :goto_a

    :pswitch_8
    invoke-virtual {p0, p1, v7, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    goto/16 :goto_b

    :pswitch_9
    invoke-virtual {p0, p1, v7, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    goto/16 :goto_c

    :pswitch_a
    invoke-virtual {p0, p1, v7, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->S(Ljava/lang/Object;J)Z

    move-result v6

    goto/16 :goto_d

    :pswitch_b
    invoke-virtual {p0, p1, v7, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_e

    :pswitch_c
    invoke-virtual {p0, p1, v7, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v8

    goto/16 :goto_f

    :pswitch_d
    invoke-virtual {p0, p1, v7, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_10

    :pswitch_e
    invoke-virtual {p0, p1, v7, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v8

    goto/16 :goto_11

    :pswitch_f
    invoke-virtual {p0, p1, v7, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v8

    goto/16 :goto_12

    :pswitch_10
    invoke-virtual {p0, p1, v7, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->U(Ljava/lang/Object;J)F

    move-result v6

    goto/16 :goto_13

    :pswitch_11
    invoke-virtual {p0, p1, v7, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->T(Ljava/lang/Object;J)D

    move-result-wide v8

    goto/16 :goto_14

    :pswitch_12
    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, p2, v7, v6, v5}, Lv0/u0;->m0(Lv0/u1;ILjava/lang/Object;I)V

    goto/16 :goto_15

    :pswitch_13
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {p0, v5}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v8

    invoke-static {v7, v6, p2, v8}, Lv0/i1;->U(ILjava/util/List;Lv0/u1;Lv0/g1;)V

    goto/16 :goto_15

    :pswitch_14
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lv0/i1;->b0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_15
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lv0/i1;->a0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_16
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lv0/i1;->Z(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_17
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lv0/i1;->Y(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_18
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lv0/i1;->Q(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_19
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lv0/i1;->d0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_1a
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lv0/i1;->N(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_1b
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lv0/i1;->R(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_1c
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lv0/i1;->S(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_1d
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lv0/i1;->V(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_1e
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lv0/i1;->e0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_1f
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lv0/i1;->W(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_20
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lv0/i1;->T(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_21
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v10

    invoke-static {p1, v10, v11}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v9}, Lv0/i1;->P(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_22
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lv0/i1;->b0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_23
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lv0/i1;->a0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_24
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lv0/i1;->Z(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_25
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lv0/i1;->Y(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_26
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lv0/i1;->Q(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_27
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lv0/i1;->d0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_28
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2}, Lv0/i1;->O(ILjava/util/List;Lv0/u1;)V

    goto/16 :goto_15

    :pswitch_29
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {p0, v5}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v8

    invoke-static {v7, v6, p2, v8}, Lv0/i1;->X(ILjava/util/List;Lv0/u1;Lv0/g1;)V

    goto/16 :goto_15

    :pswitch_2a
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2}, Lv0/i1;->c0(ILjava/util/List;Lv0/u1;)V

    goto/16 :goto_15

    :pswitch_2b
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lv0/i1;->N(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_2c
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lv0/i1;->R(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_2d
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lv0/i1;->S(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_2e
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lv0/i1;->V(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_2f
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lv0/i1;->e0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_30
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lv0/i1;->W(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_31
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lv0/i1;->T(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_32
    invoke-virtual {p0, v5}, Lv0/u0;->Q(I)I

    move-result v7

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v7, v6, p2, v4}, Lv0/i1;->P(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_33
    invoke-virtual {p0, p1, v5}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    :goto_3
    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v5}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v8

    invoke-interface {p2, v7, v6, v8}, Lv0/u1;->l(ILjava/lang/Object;Lv0/g1;)V

    goto/16 :goto_15

    :pswitch_34
    invoke-virtual {p0, p1, v5}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->H(Ljava/lang/Object;J)J

    move-result-wide v8

    :goto_4
    invoke-interface {p2, v7, v8, v9}, Lv0/u1;->F(IJ)V

    goto/16 :goto_15

    :pswitch_35
    invoke-virtual {p0, p1, v5}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->w(Ljava/lang/Object;J)I

    move-result v6

    :goto_5
    invoke-interface {p2, v7, v6}, Lv0/u1;->N(II)V

    goto/16 :goto_15

    :pswitch_36
    invoke-virtual {p0, p1, v5}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->H(Ljava/lang/Object;J)J

    move-result-wide v8

    :goto_6
    invoke-interface {p2, v7, v8, v9}, Lv0/u1;->x(IJ)V

    goto/16 :goto_15

    :pswitch_37
    invoke-virtual {p0, p1, v5}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->w(Ljava/lang/Object;J)I

    move-result v6

    :goto_7
    invoke-interface {p2, v7, v6}, Lv0/u1;->s(II)V

    goto/16 :goto_15

    :pswitch_38
    invoke-virtual {p0, p1, v5}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->w(Ljava/lang/Object;J)I

    move-result v6

    :goto_8
    invoke-interface {p2, v7, v6}, Lv0/u1;->J(II)V

    goto/16 :goto_15

    :pswitch_39
    invoke-virtual {p0, p1, v5}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->w(Ljava/lang/Object;J)I

    move-result v6

    :goto_9
    invoke-interface {p2, v7, v6}, Lv0/u1;->b(II)V

    goto/16 :goto_15

    :pswitch_3a
    invoke-virtual {p0, p1, v5}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    :goto_a
    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lv0/h;

    invoke-interface {p2, v7, v6}, Lv0/u1;->e(ILv0/h;)V

    goto/16 :goto_15

    :pswitch_3b
    invoke-virtual {p0, p1, v5}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    :goto_b
    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v5}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v8

    invoke-interface {p2, v7, v6, v8}, Lv0/u1;->r(ILjava/lang/Object;Lv0/g1;)V

    goto/16 :goto_15

    :pswitch_3c
    invoke-virtual {p0, p1, v5}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    :goto_c
    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v7, v6, p2}, Lv0/u0;->n0(ILjava/lang/Object;Lv0/u1;)V

    goto/16 :goto_15

    :pswitch_3d
    invoke-virtual {p0, p1, v5}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->k(Ljava/lang/Object;J)Z

    move-result v6

    :goto_d
    invoke-interface {p2, v7, v6}, Lv0/u1;->q(IZ)V

    goto/16 :goto_15

    :pswitch_3e
    invoke-virtual {p0, p1, v5}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->w(Ljava/lang/Object;J)I

    move-result v6

    :goto_e
    invoke-interface {p2, v7, v6}, Lv0/u1;->d(II)V

    goto :goto_15

    :pswitch_3f
    invoke-virtual {p0, p1, v5}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->H(Ljava/lang/Object;J)J

    move-result-wide v8

    :goto_f
    invoke-interface {p2, v7, v8, v9}, Lv0/u1;->i(IJ)V

    goto :goto_15

    :pswitch_40
    invoke-virtual {p0, p1, v5}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->w(Ljava/lang/Object;J)I

    move-result v6

    :goto_10
    invoke-interface {p2, v7, v6}, Lv0/u1;->u(II)V

    goto :goto_15

    :pswitch_41
    invoke-virtual {p0, p1, v5}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->H(Ljava/lang/Object;J)J

    move-result-wide v8

    :goto_11
    invoke-interface {p2, v7, v8, v9}, Lv0/u1;->n(IJ)V

    goto :goto_15

    :pswitch_42
    invoke-virtual {p0, p1, v5}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->H(Ljava/lang/Object;J)J

    move-result-wide v8

    :goto_12
    invoke-interface {p2, v7, v8, v9}, Lv0/u1;->p(IJ)V

    goto :goto_15

    :pswitch_43
    invoke-virtual {p0, p1, v5}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->p(Ljava/lang/Object;J)F

    move-result v6

    :goto_13
    invoke-interface {p2, v7, v6}, Lv0/u1;->G(IF)V

    goto :goto_15

    :pswitch_44
    invoke-virtual {p0, p1, v5}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/u0;->l(Ljava/lang/Object;J)D

    move-result-wide v8

    :goto_14
    invoke-interface {p2, v7, v8, v9}, Lv0/u1;->f(ID)V

    :cond_3
    :goto_15
    add-int/lit8 v5, v5, 0x3

    goto/16 :goto_1

    :cond_4
    :goto_16
    if-eqz v2, :cond_6

    iget-object v3, p0, Lv0/u0;->p:Lv0/q;

    invoke-virtual {v3, p2, v2}, Lv0/q;->j(Lv0/u1;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_16

    :cond_5
    move-object v2, v1

    goto :goto_16

    :cond_6
    iget-object v0, p0, Lv0/u0;->o:Lv0/n1;

    invoke-virtual {p0, v0, p1, p2}, Lv0/u0;->o0(Lv0/n1;Ljava/lang/Object;Lv0/u1;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final l0(Ljava/lang/Object;Lv0/u1;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lv0/u1;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lv0/u0;->o:Lv0/n1;

    invoke-virtual {p0, v0, p1, p2}, Lv0/u0;->o0(Lv0/n1;Ljava/lang/Object;Lv0/u1;)V

    iget-boolean v0, p0, Lv0/u0;->f:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv0/u0;->p:Lv0/q;

    invoke-virtual {v0, p1}, Lv0/q;->c(Ljava/lang/Object;)Lv0/u;

    move-result-object v0

    invoke-virtual {v0}, Lv0/u;->n()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lv0/u;->g()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_0

    :cond_0
    move-object v0, v1

    move-object v2, v0

    :goto_0
    iget-object v3, p0, Lv0/u0;->a:[I

    array-length v3, v3

    add-int/lit8 v3, v3, -0x3

    :goto_1
    if-ltz v3, :cond_4

    invoke-virtual {p0, v3}, Lv0/u0;->i0(I)I

    move-result v4

    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    :goto_2
    if-eqz v2, :cond_2

    iget-object v6, p0, Lv0/u0;->p:Lv0/q;

    invoke-virtual {v6, v2}, Lv0/q;->a(Ljava/util/Map$Entry;)I

    move-result v6

    if-le v6, v5, :cond_2

    iget-object v6, p0, Lv0/u0;->p:Lv0/q;

    invoke-virtual {v6, p2, v2}, Lv0/q;->j(Lv0/u1;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_2

    :cond_1
    move-object v2, v1

    goto :goto_2

    :cond_2
    invoke-static {v4}, Lv0/u0;->h0(I)I

    move-result v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    packed-switch v6, :pswitch_data_0

    goto/16 :goto_15

    :pswitch_0
    invoke-virtual {p0, p1, v5, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_3

    :pswitch_1
    invoke-virtual {p0, p1, v5, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v6

    goto/16 :goto_4

    :pswitch_2
    invoke-virtual {p0, p1, v5, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_5

    :pswitch_3
    invoke-virtual {p0, p1, v5, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v6

    goto/16 :goto_6

    :pswitch_4
    invoke-virtual {p0, p1, v5, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_7

    :pswitch_5
    invoke-virtual {p0, p1, v5, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_8

    :pswitch_6
    invoke-virtual {p0, p1, v5, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_9

    :pswitch_7
    invoke-virtual {p0, p1, v5, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_a

    :pswitch_8
    invoke-virtual {p0, p1, v5, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_b

    :pswitch_9
    invoke-virtual {p0, p1, v5, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_c

    :pswitch_a
    invoke-virtual {p0, p1, v5, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->S(Ljava/lang/Object;J)Z

    move-result v4

    goto/16 :goto_d

    :pswitch_b
    invoke-virtual {p0, p1, v5, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_e

    :pswitch_c
    invoke-virtual {p0, p1, v5, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v6

    goto/16 :goto_f

    :pswitch_d
    invoke-virtual {p0, p1, v5, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v4

    goto/16 :goto_10

    :pswitch_e
    invoke-virtual {p0, p1, v5, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v6

    goto/16 :goto_11

    :pswitch_f
    invoke-virtual {p0, p1, v5, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v6

    goto/16 :goto_12

    :pswitch_10
    invoke-virtual {p0, p1, v5, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->U(Ljava/lang/Object;J)F

    move-result v4

    goto/16 :goto_13

    :pswitch_11
    invoke-virtual {p0, p1, v5, v3}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->T(Ljava/lang/Object;J)D

    move-result-wide v6

    goto/16 :goto_14

    :pswitch_12
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, p2, v5, v4, v3}, Lv0/u0;->m0(Lv0/u1;ILjava/lang/Object;I)V

    goto/16 :goto_15

    :pswitch_13
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0, v3}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v6

    invoke-static {v5, v4, p2, v6}, Lv0/i1;->U(ILjava/util/List;Lv0/u1;Lv0/g1;)V

    goto/16 :goto_15

    :pswitch_14
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lv0/i1;->b0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_15
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lv0/i1;->a0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_16
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lv0/i1;->Z(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_17
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lv0/i1;->Y(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_18
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lv0/i1;->Q(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_19
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lv0/i1;->d0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_1a
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lv0/i1;->N(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_1b
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lv0/i1;->R(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_1c
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lv0/i1;->S(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_1d
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lv0/i1;->V(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_1e
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lv0/i1;->e0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_1f
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lv0/i1;->W(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_20
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lv0/i1;->T(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_21
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v8

    invoke-static {p1, v8, v9}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v7}, Lv0/i1;->P(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_22
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lv0/i1;->b0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_23
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lv0/i1;->a0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_24
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lv0/i1;->Z(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_25
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lv0/i1;->Y(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_26
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lv0/i1;->Q(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_27
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lv0/i1;->d0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_28
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2}, Lv0/i1;->O(ILjava/util/List;Lv0/u1;)V

    goto/16 :goto_15

    :pswitch_29
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-virtual {p0, v3}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v6

    invoke-static {v5, v4, p2, v6}, Lv0/i1;->X(ILjava/util/List;Lv0/u1;Lv0/g1;)V

    goto/16 :goto_15

    :pswitch_2a
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2}, Lv0/i1;->c0(ILjava/util/List;Lv0/u1;)V

    goto/16 :goto_15

    :pswitch_2b
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lv0/i1;->N(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_2c
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lv0/i1;->R(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_2d
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lv0/i1;->S(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_2e
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lv0/i1;->V(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_2f
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lv0/i1;->e0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_30
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lv0/i1;->W(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_31
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lv0/i1;->T(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_32
    invoke-virtual {p0, v3}, Lv0/u0;->Q(I)I

    move-result v5

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v5, v4, p2, v8}, Lv0/i1;->P(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_15

    :pswitch_33
    invoke-virtual {p0, p1, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_3
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v3}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v6

    invoke-interface {p2, v5, v4, v6}, Lv0/u1;->l(ILjava/lang/Object;Lv0/g1;)V

    goto/16 :goto_15

    :pswitch_34
    invoke-virtual {p0, p1, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->H(Ljava/lang/Object;J)J

    move-result-wide v6

    :goto_4
    invoke-interface {p2, v5, v6, v7}, Lv0/u1;->F(IJ)V

    goto/16 :goto_15

    :pswitch_35
    invoke-virtual {p0, p1, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->w(Ljava/lang/Object;J)I

    move-result v4

    :goto_5
    invoke-interface {p2, v5, v4}, Lv0/u1;->N(II)V

    goto/16 :goto_15

    :pswitch_36
    invoke-virtual {p0, p1, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->H(Ljava/lang/Object;J)J

    move-result-wide v6

    :goto_6
    invoke-interface {p2, v5, v6, v7}, Lv0/u1;->x(IJ)V

    goto/16 :goto_15

    :pswitch_37
    invoke-virtual {p0, p1, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->w(Ljava/lang/Object;J)I

    move-result v4

    :goto_7
    invoke-interface {p2, v5, v4}, Lv0/u1;->s(II)V

    goto/16 :goto_15

    :pswitch_38
    invoke-virtual {p0, p1, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->w(Ljava/lang/Object;J)I

    move-result v4

    :goto_8
    invoke-interface {p2, v5, v4}, Lv0/u1;->J(II)V

    goto/16 :goto_15

    :pswitch_39
    invoke-virtual {p0, p1, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->w(Ljava/lang/Object;J)I

    move-result v4

    :goto_9
    invoke-interface {p2, v5, v4}, Lv0/u1;->b(II)V

    goto/16 :goto_15

    :pswitch_3a
    invoke-virtual {p0, p1, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_a
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lv0/h;

    invoke-interface {p2, v5, v4}, Lv0/u1;->e(ILv0/h;)V

    goto/16 :goto_15

    :pswitch_3b
    invoke-virtual {p0, p1, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_b
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v3}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v6

    invoke-interface {p2, v5, v4, v6}, Lv0/u1;->r(ILjava/lang/Object;Lv0/g1;)V

    goto/16 :goto_15

    :pswitch_3c
    invoke-virtual {p0, p1, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_c
    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v5, v4, p2}, Lv0/u0;->n0(ILjava/lang/Object;Lv0/u1;)V

    goto/16 :goto_15

    :pswitch_3d
    invoke-virtual {p0, p1, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->k(Ljava/lang/Object;J)Z

    move-result v4

    :goto_d
    invoke-interface {p2, v5, v4}, Lv0/u1;->q(IZ)V

    goto/16 :goto_15

    :pswitch_3e
    invoke-virtual {p0, p1, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->w(Ljava/lang/Object;J)I

    move-result v4

    :goto_e
    invoke-interface {p2, v5, v4}, Lv0/u1;->d(II)V

    goto :goto_15

    :pswitch_3f
    invoke-virtual {p0, p1, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->H(Ljava/lang/Object;J)J

    move-result-wide v6

    :goto_f
    invoke-interface {p2, v5, v6, v7}, Lv0/u1;->i(IJ)V

    goto :goto_15

    :pswitch_40
    invoke-virtual {p0, p1, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->w(Ljava/lang/Object;J)I

    move-result v4

    :goto_10
    invoke-interface {p2, v5, v4}, Lv0/u1;->u(II)V

    goto :goto_15

    :pswitch_41
    invoke-virtual {p0, p1, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->H(Ljava/lang/Object;J)J

    move-result-wide v6

    :goto_11
    invoke-interface {p2, v5, v6, v7}, Lv0/u1;->n(IJ)V

    goto :goto_15

    :pswitch_42
    invoke-virtual {p0, p1, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->H(Ljava/lang/Object;J)J

    move-result-wide v6

    :goto_12
    invoke-interface {p2, v5, v6, v7}, Lv0/u1;->p(IJ)V

    goto :goto_15

    :pswitch_43
    invoke-virtual {p0, p1, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->p(Ljava/lang/Object;J)F

    move-result v4

    :goto_13
    invoke-interface {p2, v5, v4}, Lv0/u1;->G(IF)V

    goto :goto_15

    :pswitch_44
    invoke-virtual {p0, p1, v3}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v4}, Lv0/u0;->R(I)J

    move-result-wide v6

    invoke-static {p1, v6, v7}, Lv0/u0;->l(Ljava/lang/Object;J)D

    move-result-wide v6

    :goto_14
    invoke-interface {p2, v5, v6, v7}, Lv0/u1;->f(ID)V

    :cond_3
    :goto_15
    add-int/lit8 v3, v3, -0x3

    goto/16 :goto_1

    :cond_4
    :goto_16
    if-eqz v2, :cond_6

    iget-object p1, p0, Lv0/u0;->p:Lv0/q;

    invoke-virtual {p1, p2, v2}, Lv0/q;->j(Lv0/u1;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    move-object v2, p1

    goto :goto_16

    :cond_5
    move-object v2, v1

    goto :goto_16

    :cond_6
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;I)Z"
        }
    .end annotation

    invoke-virtual {p0, p3}, Lv0/u0;->i0(I)I

    move-result v0

    invoke-static {v0}, Lv0/u0;->R(I)J

    move-result-wide v1

    invoke-static {v0}, Lv0/u0;->h0(I)I

    move-result v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    return v4

    :pswitch_0
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->D(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-static {p1, v1, v2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lv0/i1;->K(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move v3, v4

    :cond_0
    return v3

    :pswitch_1
    invoke-static {p1, v1, v2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lv0/i1;->K(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_2
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {p1, v1, v2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lv0/i1;->K(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    move v3, v4

    :cond_1
    return v3

    :pswitch_3
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {p1, v1, v2}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-static {p2, v1, v2}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, v5, p1

    if-nez p1, :cond_2

    move v3, v4

    :cond_2
    return v3

    :pswitch_4
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {p1, v1, v2}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v1, v2}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_3

    move v3, v4

    :cond_3
    return v3

    :pswitch_5
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-static {p1, v1, v2}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-static {p2, v1, v2}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, v5, p1

    if-nez p1, :cond_4

    move v3, v4

    :cond_4
    return v3

    :pswitch_6
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-static {p1, v1, v2}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v1, v2}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_5

    move v3, v4

    :cond_5
    return v3

    :pswitch_7
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-static {p1, v1, v2}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v1, v2}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_6

    move v3, v4

    :cond_6
    return v3

    :pswitch_8
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-static {p1, v1, v2}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v1, v2}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_7

    move v3, v4

    :cond_7
    return v3

    :pswitch_9
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-static {p1, v1, v2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lv0/i1;->K(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    move v3, v4

    :cond_8
    return v3

    :pswitch_a
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_9

    invoke-static {p1, v1, v2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lv0/i1;->K(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    move v3, v4

    :cond_9
    return v3

    :pswitch_b
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-static {p1, v1, v2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v1, v2}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lv0/i1;->K(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    move v3, v4

    :cond_a
    return v3

    :pswitch_c
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_b

    invoke-static {p1, v1, v2}, Lv0/r1;->p(Ljava/lang/Object;J)Z

    move-result p1

    invoke-static {p2, v1, v2}, Lv0/r1;->p(Ljava/lang/Object;J)Z

    move-result p2

    if-ne p1, p2, :cond_b

    move v3, v4

    :cond_b
    return v3

    :pswitch_d
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_c

    invoke-static {p1, v1, v2}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v1, v2}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_c

    move v3, v4

    :cond_c
    return v3

    :pswitch_e
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_d

    invoke-static {p1, v1, v2}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-static {p2, v1, v2}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, v5, p1

    if-nez p1, :cond_d

    move v3, v4

    :cond_d
    return v3

    :pswitch_f
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_e

    invoke-static {p1, v1, v2}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p1

    invoke-static {p2, v1, v2}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p2

    if-ne p1, p2, :cond_e

    move v3, v4

    :cond_e
    return v3

    :pswitch_10
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_f

    invoke-static {p1, v1, v2}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-static {p2, v1, v2}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, v5, p1

    if-nez p1, :cond_f

    move v3, v4

    :cond_f
    return v3

    :pswitch_11
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_10

    invoke-static {p1, v1, v2}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide v5

    invoke-static {p2, v1, v2}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, v5, p1

    if-nez p1, :cond_10

    move v3, v4

    :cond_10
    return v3

    :pswitch_12
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_11

    invoke-static {p1, v1, v2}, Lv0/r1;->w(Ljava/lang/Object;J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p1

    invoke-static {p2, v1, v2}, Lv0/r1;->w(Ljava/lang/Object;J)F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p2

    if-ne p1, p2, :cond_11

    move v3, v4

    :cond_11
    return v3

    :pswitch_13
    invoke-virtual {p0, p1, p2, p3}, Lv0/u0;->j(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result p3

    if-eqz p3, :cond_12

    invoke-static {p1, v1, v2}, Lv0/r1;->v(Ljava/lang/Object;J)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    invoke-static {p2, v1, v2}, Lv0/r1;->v(Ljava/lang/Object;J)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p1

    cmp-long p1, v5, p1

    if-nez p1, :cond_12

    move v3, v4

    :cond_12
    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final m0(Lv0/u1;ILjava/lang/Object;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lv0/u1;",
            "I",
            "Ljava/lang/Object;",
            "I)V"
        }
    .end annotation

    if-eqz p3, :cond_0

    iget-object v0, p0, Lv0/u0;->q:Lv0/m0;

    invoke-virtual {p0, p4}, Lv0/u0;->r(I)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {v0, p4}, Lv0/m0;->c(Ljava/lang/Object;)Lv0/k0$a;

    move-result-object p4

    iget-object v0, p0, Lv0/u0;->q:Lv0/m0;

    invoke-interface {v0, p3}, Lv0/m0;->h(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p3

    invoke-interface {p1, p2, p4, p3}, Lv0/u1;->A(ILv0/k0$a;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public final n(Ljava/lang/Object;ILjava/lang/Object;Lv0/n1;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "ITUB;",
            "Lv0/n1<",
            "TUT;TUB;>;)TUB;"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lv0/u0;->Q(I)I

    move-result v2

    invoke-virtual {p0, p2}, Lv0/u0;->i0(I)I

    move-result v0

    invoke-static {v0}, Lv0/u0;->R(I)J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p3

    :cond_0
    invoke-virtual {p0, p2}, Lv0/u0;->q(I)Lv0/a0$e;

    move-result-object v4

    if-nez v4, :cond_1

    return-object p3

    :cond_1
    iget-object v0, p0, Lv0/u0;->q:Lv0/m0;

    invoke-interface {v0, p1}, Lv0/m0;->d(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    move-object v0, p0

    move v1, p2

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v0 .. v6}, Lv0/u0;->o(IILjava/util/Map;Lv0/a0$e;Ljava/lang/Object;Lv0/n1;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final n0(ILjava/lang/Object;Lv0/u1;)V
    .locals 1

    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p2, Ljava/lang/String;

    invoke-interface {p3, p1, p2}, Lv0/u1;->m(ILjava/lang/String;)V

    goto :goto_0

    :cond_0
    check-cast p2, Lv0/h;

    invoke-interface {p3, p1, p2}, Lv0/u1;->e(ILv0/h;)V

    :goto_0
    return-void
.end method

.method public final o(IILjava/util/Map;Lv0/a0$e;Ljava/lang/Object;Lv0/n1;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            "UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(II",
            "Ljava/util/Map<",
            "TK;TV;>;",
            "Lv0/a0$e;",
            "TUB;",
            "Lv0/n1<",
            "TUT;TUB;>;)TUB;"
        }
    .end annotation

    iget-object v0, p0, Lv0/u0;->q:Lv0/m0;

    invoke-virtual {p0, p1}, Lv0/u0;->r(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lv0/m0;->c(Ljava/lang/Object;)Lv0/k0$a;

    move-result-object p1

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p4, v1}, Lv0/a0$e;->a(I)Z

    move-result v1

    if-nez v1, :cond_0

    if-nez p5, :cond_1

    invoke-virtual {p6}, Lv0/n1;->n()Ljava/lang/Object;

    move-result-object p5

    :cond_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {p1, v1, v2}, Lv0/k0;->b(Lv0/k0$a;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Lv0/h;->p(I)Lv0/h$h;

    move-result-object v1

    invoke-virtual {v1}, Lv0/h$h;->b()Lv0/k;

    move-result-object v2

    :try_start_0
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, p1, v3, v0}, Lv0/k0;->e(Lv0/k;Lv0/k0$a;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v1}, Lv0/h$h;->a()Lv0/h;

    move-result-object v0

    invoke-virtual {p6, p5, p2, v0}, Lv0/n1;->d(Ljava/lang/Object;ILv0/h;)V

    invoke-interface {p3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    return-object p5
.end method

.method public final o0(Lv0/n1;Ljava/lang/Object;Lv0/u1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Lv0/n1<",
            "TUT;TUB;>;TT;",
            "Lv0/u1;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lv0/n1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Lv0/n1;->t(Ljava/lang/Object;Lv0/u1;)V

    return-void
.end method

.method public final q(I)Lv0/a0$e;
    .locals 1

    iget-object v0, p0, Lv0/u0;->b:[Ljava/lang/Object;

    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    check-cast p1, Lv0/a0$e;

    return-object p1
.end method

.method public final r(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv0/u0;->b:[Ljava/lang/Object;

    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final s(I)Lv0/g1;
    .locals 3

    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Lv0/u0;->b:[Ljava/lang/Object;

    aget-object v0, v0, p1

    check-cast v0, Lv0/g1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Lv0/c1;->a()Lv0/c1;

    move-result-object v0

    iget-object v1, p0, Lv0/u0;->b:[Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    aget-object v1, v1, v2

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v0, v1}, Lv0/c1;->d(Ljava/lang/Class;)Lv0/g1;

    move-result-object v0

    iget-object v1, p0, Lv0/u0;->b:[Ljava/lang/Object;

    aput-object v0, v1, p1

    return-object v0
.end method

.method public final t(Ljava/lang/Object;)I
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lv0/u0;->s:Lsun/misc/Unsafe;

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    iget-object v8, v0, Lv0/u0;->a:[I

    array-length v8, v8

    if-ge v5, v8, :cond_8

    invoke-virtual {v0, v5}, Lv0/u0;->i0(I)I

    move-result v8

    invoke-virtual {v0, v5}, Lv0/u0;->Q(I)I

    move-result v9

    invoke-static {v8}, Lv0/u0;->h0(I)I

    move-result v10

    const/16 v11, 0x11

    const v12, 0xfffff

    const/4 v13, 0x1

    if-gt v10, v11, :cond_1

    iget-object v11, v0, Lv0/u0;->a:[I

    add-int/lit8 v14, v5, 0x2

    aget v11, v11, v14

    and-int/2addr v12, v11

    ushr-int/lit8 v14, v11, 0x14

    shl-int v14, v13, v14

    move v15, v14

    if-eq v12, v4, :cond_0

    int-to-long v13, v12

    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v7

    move v4, v12

    :cond_0
    move v14, v15

    goto :goto_2

    :cond_1
    iget-boolean v11, v0, Lv0/u0;->i:Z

    if-eqz v11, :cond_2

    sget-object v11, Lv0/v;->V:Lv0/v;

    invoke-virtual {v11}, Lv0/v;->b()I

    move-result v11

    if-lt v10, v11, :cond_2

    sget-object v11, Lv0/v;->i0:Lv0/v;

    invoke-virtual {v11}, Lv0/v;->b()I

    move-result v11

    if-gt v10, v11, :cond_2

    iget-object v11, v0, Lv0/u0;->a:[I

    add-int/lit8 v13, v5, 0x2

    aget v11, v11, v13

    and-int/2addr v11, v12

    goto :goto_1

    :cond_2
    const/4 v11, 0x0

    :goto_1
    const/4 v14, 0x0

    :goto_2
    invoke-static {v8}, Lv0/u0;->R(I)J

    move-result-wide v12

    const/4 v8, 0x0

    move/from16 v16, v4

    const-wide/16 v3, 0x0

    packed-switch v10, :pswitch_data_0

    goto/16 :goto_6

    :pswitch_0
    invoke-virtual {v0, v1, v9, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_7

    :pswitch_1
    invoke-virtual {v0, v1, v9, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v1, v12, v13}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v3

    goto/16 :goto_8

    :pswitch_2
    invoke-virtual {v0, v1, v9, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v1, v12, v13}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_9

    :pswitch_3
    invoke-virtual {v0, v1, v9, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_5

    goto/16 :goto_a

    :pswitch_4
    invoke-virtual {v0, v1, v9, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_b

    :pswitch_5
    invoke-virtual {v0, v1, v9, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v1, v12, v13}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_d

    :pswitch_6
    invoke-virtual {v0, v1, v9, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v1, v12, v13}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v3

    goto/16 :goto_e

    :pswitch_7
    invoke-virtual {v0, v1, v9, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_f

    :pswitch_8
    invoke-virtual {v0, v1, v9, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_10

    :pswitch_9
    invoke-virtual {v0, v1, v9, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lv0/h;

    if-eqz v4, :cond_3

    check-cast v3, Lv0/h;

    invoke-static {v9, v3}, Lv0/k;->g(ILv0/h;)I

    move-result v3

    goto/16 :goto_5

    :cond_3
    check-cast v3, Ljava/lang/String;

    invoke-static {v9, v3}, Lv0/k;->T(ILjava/lang/String;)I

    move-result v3

    goto/16 :goto_5

    :pswitch_a
    invoke-virtual {v0, v1, v9, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_11

    :pswitch_b
    invoke-virtual {v0, v1, v9, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_5

    const/4 v3, 0x0

    invoke-static {v9, v3}, Lv0/k;->m(II)I

    move-result v4

    goto/16 :goto_c

    :pswitch_c
    invoke-virtual {v0, v1, v9, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-static {v9, v3, v4}, Lv0/k;->o(IJ)I

    move-result v3

    goto/16 :goto_5

    :pswitch_d
    invoke-virtual {v0, v1, v9, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v1, v12, v13}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v9, v3}, Lv0/k;->v(II)I

    move-result v3

    goto/16 :goto_5

    :pswitch_e
    invoke-virtual {v0, v1, v9, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v1, v12, v13}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v9, v3, v4}, Lv0/k;->Y(IJ)I

    move-result v3

    goto/16 :goto_5

    :pswitch_f
    invoke-virtual {v0, v1, v9, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v1, v12, v13}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v9, v3, v4}, Lv0/k;->x(IJ)I

    move-result v3

    goto/16 :goto_5

    :pswitch_10
    invoke-virtual {v0, v1, v9, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v9, v8}, Lv0/k;->q(IF)I

    move-result v3

    goto/16 :goto_5

    :pswitch_11
    invoke-virtual {v0, v1, v9, v5}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v3

    if-eqz v3, :cond_5

    const-wide/16 v3, 0x0

    invoke-static {v9, v3, v4}, Lv0/k;->i(ID)I

    move-result v3

    goto/16 :goto_5

    :pswitch_12
    iget-object v3, v0, Lv0/u0;->q:Lv0/m0;

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v5}, Lv0/u0;->r(I)Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v3, v9, v4, v8}, Lv0/m0;->f(ILjava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    goto/16 :goto_5

    :pswitch_13
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v0, v5}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v4

    invoke-static {v9, v3, v4}, Lv0/i1;->j(ILjava/util/List;Lv0/g1;)I

    move-result v3

    goto/16 :goto_5

    :pswitch_14
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lv0/i1;->t(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_5

    iget-boolean v4, v0, Lv0/u0;->i:Z

    if-eqz v4, :cond_4

    goto/16 :goto_3

    :pswitch_15
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lv0/i1;->r(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_5

    iget-boolean v4, v0, Lv0/u0;->i:Z

    if-eqz v4, :cond_4

    goto/16 :goto_3

    :pswitch_16
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lv0/i1;->i(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_5

    iget-boolean v4, v0, Lv0/u0;->i:Z

    if-eqz v4, :cond_4

    goto/16 :goto_3

    :pswitch_17
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lv0/i1;->g(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_5

    iget-boolean v4, v0, Lv0/u0;->i:Z

    if-eqz v4, :cond_4

    goto/16 :goto_3

    :pswitch_18
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lv0/i1;->e(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_5

    iget-boolean v4, v0, Lv0/u0;->i:Z

    if-eqz v4, :cond_4

    goto/16 :goto_3

    :pswitch_19
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lv0/i1;->w(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_5

    iget-boolean v4, v0, Lv0/u0;->i:Z

    if-eqz v4, :cond_4

    goto/16 :goto_3

    :pswitch_1a
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lv0/i1;->b(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_5

    iget-boolean v4, v0, Lv0/u0;->i:Z

    if-eqz v4, :cond_4

    goto/16 :goto_3

    :pswitch_1b
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lv0/i1;->g(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_5

    iget-boolean v4, v0, Lv0/u0;->i:Z

    if-eqz v4, :cond_4

    goto :goto_3

    :pswitch_1c
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lv0/i1;->i(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_5

    iget-boolean v4, v0, Lv0/u0;->i:Z

    if-eqz v4, :cond_4

    goto :goto_3

    :pswitch_1d
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lv0/i1;->l(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_5

    iget-boolean v4, v0, Lv0/u0;->i:Z

    if-eqz v4, :cond_4

    goto :goto_3

    :pswitch_1e
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lv0/i1;->y(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_5

    iget-boolean v4, v0, Lv0/u0;->i:Z

    if-eqz v4, :cond_4

    goto :goto_3

    :pswitch_1f
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lv0/i1;->n(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_5

    iget-boolean v4, v0, Lv0/u0;->i:Z

    if-eqz v4, :cond_4

    goto :goto_3

    :pswitch_20
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lv0/i1;->g(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_5

    iget-boolean v4, v0, Lv0/u0;->i:Z

    if-eqz v4, :cond_4

    goto :goto_3

    :pswitch_21
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Lv0/i1;->i(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_5

    iget-boolean v4, v0, Lv0/u0;->i:Z

    if-eqz v4, :cond_4

    :goto_3
    int-to-long v10, v11

    invoke-virtual {v2, v1, v10, v11, v3}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_4
    invoke-static {v9}, Lv0/k;->V(I)I

    move-result v4

    invoke-static {v3}, Lv0/k;->X(I)I

    move-result v8

    add-int/2addr v4, v8

    add-int/2addr v4, v3

    goto/16 :goto_c

    :pswitch_22
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/4 v4, 0x0

    invoke-static {v9, v3, v4}, Lv0/i1;->s(ILjava/util/List;Z)I

    move-result v3

    goto/16 :goto_4

    :pswitch_23
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v9, v3, v4}, Lv0/i1;->q(ILjava/util/List;Z)I

    move-result v3

    goto/16 :goto_4

    :pswitch_24
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v9, v3, v4}, Lv0/i1;->d(ILjava/util/List;Z)I

    move-result v3

    goto/16 :goto_4

    :pswitch_25
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v9, v3, v4}, Lv0/i1;->v(ILjava/util/List;Z)I

    move-result v3

    goto/16 :goto_5

    :pswitch_26
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v9, v3}, Lv0/i1;->c(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_5

    :pswitch_27
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v0, v5}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v4

    invoke-static {v9, v3, v4}, Lv0/i1;->p(ILjava/util/List;Lv0/g1;)I

    move-result v3

    goto :goto_5

    :pswitch_28
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v9, v3}, Lv0/i1;->u(ILjava/util/List;)I

    move-result v3

    goto :goto_5

    :pswitch_29
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/4 v4, 0x0

    invoke-static {v9, v3, v4}, Lv0/i1;->a(ILjava/util/List;Z)I

    move-result v3

    goto :goto_4

    :pswitch_2a
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v9, v3, v4}, Lv0/i1;->h(ILjava/util/List;Z)I

    move-result v3

    goto :goto_4

    :pswitch_2b
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v9, v3, v4}, Lv0/i1;->k(ILjava/util/List;Z)I

    move-result v3

    goto :goto_4

    :pswitch_2c
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v9, v3, v4}, Lv0/i1;->x(ILjava/util/List;Z)I

    move-result v3

    goto :goto_4

    :pswitch_2d
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v9, v3, v4}, Lv0/i1;->m(ILjava/util/List;Z)I

    move-result v3

    goto :goto_4

    :pswitch_2e
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v9, v3, v4}, Lv0/i1;->f(ILjava/util/List;Z)I

    move-result v3

    :goto_4
    add-int/2addr v6, v3

    move v10, v4

    goto/16 :goto_13

    :pswitch_2f
    const/4 v4, 0x0

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v9, v3, v4}, Lv0/i1;->h(ILjava/util/List;Z)I

    move-result v3

    :goto_5
    add-int/2addr v6, v3

    :cond_5
    :goto_6
    const/4 v10, 0x0

    goto/16 :goto_13

    :pswitch_30
    and-int v3, v7, v14

    if-eqz v3, :cond_5

    :goto_7
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv0/r0;

    invoke-virtual {v0, v5}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v4

    invoke-static {v9, v3, v4}, Lv0/k;->s(ILv0/r0;Lv0/g1;)I

    move-result v3

    goto :goto_5

    :pswitch_31
    and-int v3, v7, v14

    if-eqz v3, :cond_5

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    :goto_8
    invoke-static {v9, v3, v4}, Lv0/k;->R(IJ)I

    move-result v3

    goto :goto_5

    :pswitch_32
    and-int v3, v7, v14

    if-eqz v3, :cond_5

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    :goto_9
    invoke-static {v9, v3}, Lv0/k;->P(II)I

    move-result v3

    goto :goto_5

    :pswitch_33
    and-int v8, v7, v14

    if-eqz v8, :cond_5

    :goto_a
    invoke-static {v9, v3, v4}, Lv0/k;->N(IJ)I

    move-result v3

    goto :goto_5

    :pswitch_34
    and-int v3, v7, v14

    if-eqz v3, :cond_5

    :goto_b
    const/4 v3, 0x0

    invoke-static {v9, v3}, Lv0/k;->L(II)I

    move-result v4

    :goto_c
    add-int/2addr v6, v4

    goto :goto_6

    :pswitch_35
    and-int v3, v7, v14

    if-eqz v3, :cond_5

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    :goto_d
    invoke-static {v9, v3}, Lv0/k;->k(II)I

    move-result v3

    goto :goto_5

    :pswitch_36
    and-int v3, v7, v14

    if-eqz v3, :cond_5

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    :goto_e
    invoke-static {v9, v3}, Lv0/k;->W(II)I

    move-result v3

    goto :goto_5

    :pswitch_37
    and-int v3, v7, v14

    if-eqz v3, :cond_5

    :goto_f
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv0/h;

    invoke-static {v9, v3}, Lv0/k;->g(ILv0/h;)I

    move-result v3

    goto :goto_5

    :pswitch_38
    and-int v3, v7, v14

    if-eqz v3, :cond_5

    :goto_10
    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v5}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v4

    invoke-static {v9, v3, v4}, Lv0/i1;->o(ILjava/lang/Object;Lv0/g1;)I

    move-result v3

    goto :goto_5

    :pswitch_39
    and-int v3, v7, v14

    if-eqz v3, :cond_5

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lv0/h;

    if-eqz v4, :cond_6

    check-cast v3, Lv0/h;

    invoke-static {v9, v3}, Lv0/k;->g(ILv0/h;)I

    move-result v3

    goto/16 :goto_5

    :cond_6
    check-cast v3, Ljava/lang/String;

    invoke-static {v9, v3}, Lv0/k;->T(ILjava/lang/String;)I

    move-result v3

    goto/16 :goto_5

    :pswitch_3a
    and-int v3, v7, v14

    if-eqz v3, :cond_5

    :goto_11
    const/4 v3, 0x1

    invoke-static {v9, v3}, Lv0/k;->d(IZ)I

    move-result v3

    goto/16 :goto_5

    :pswitch_3b
    and-int v3, v7, v14

    if-eqz v3, :cond_5

    const/4 v10, 0x0

    invoke-static {v9, v10}, Lv0/k;->m(II)I

    move-result v3

    goto :goto_12

    :pswitch_3c
    const/4 v10, 0x0

    and-int v8, v7, v14

    if-eqz v8, :cond_7

    invoke-static {v9, v3, v4}, Lv0/k;->o(IJ)I

    move-result v3

    goto :goto_12

    :pswitch_3d
    const/4 v10, 0x0

    and-int v3, v7, v14

    if-eqz v3, :cond_7

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v9, v3}, Lv0/k;->v(II)I

    move-result v3

    goto :goto_12

    :pswitch_3e
    const/4 v10, 0x0

    and-int v3, v7, v14

    if-eqz v3, :cond_7

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v9, v3, v4}, Lv0/k;->Y(IJ)I

    move-result v3

    goto :goto_12

    :pswitch_3f
    const/4 v10, 0x0

    and-int v3, v7, v14

    if-eqz v3, :cond_7

    invoke-virtual {v2, v1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v9, v3, v4}, Lv0/k;->x(IJ)I

    move-result v3

    goto :goto_12

    :pswitch_40
    const/4 v10, 0x0

    and-int v3, v7, v14

    if-eqz v3, :cond_7

    invoke-static {v9, v8}, Lv0/k;->q(IF)I

    move-result v3

    goto :goto_12

    :pswitch_41
    const/4 v10, 0x0

    and-int v3, v7, v14

    if-eqz v3, :cond_7

    const-wide/16 v3, 0x0

    invoke-static {v9, v3, v4}, Lv0/k;->i(ID)I

    move-result v3

    :goto_12
    add-int/2addr v6, v3

    :cond_7
    :goto_13
    add-int/lit8 v5, v5, 0x3

    move/from16 v4, v16

    goto/16 :goto_0

    :cond_8
    iget-object v2, v0, Lv0/u0;->o:Lv0/n1;

    invoke-virtual {v0, v2, v1}, Lv0/u0;->v(Lv0/n1;Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v6, v2

    iget-boolean v2, v0, Lv0/u0;->f:Z

    if-eqz v2, :cond_9

    iget-object v2, v0, Lv0/u0;->p:Lv0/q;

    invoke-virtual {v2, v1}, Lv0/q;->c(Ljava/lang/Object;)Lv0/u;

    move-result-object v1

    invoke-virtual {v1}, Lv0/u;->l()I

    move-result v1

    add-int/2addr v6, v1

    :cond_9
    return v6

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_2e
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_2e
        :pswitch_2a
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final u(Ljava/lang/Object;)I
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lv0/u0;->s:Lsun/misc/Unsafe;

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    iget-object v6, v0, Lv0/u0;->a:[I

    array-length v6, v6

    if-ge v4, v6, :cond_4

    invoke-virtual {p0, v4}, Lv0/u0;->i0(I)I

    move-result v6

    invoke-static {v6}, Lv0/u0;->h0(I)I

    move-result v7

    invoke-virtual {p0, v4}, Lv0/u0;->Q(I)I

    move-result v8

    invoke-static {v6}, Lv0/u0;->R(I)J

    move-result-wide v9

    sget-object v6, Lv0/v;->V:Lv0/v;

    invoke-virtual {v6}, Lv0/v;->b()I

    move-result v6

    if-lt v7, v6, :cond_0

    sget-object v6, Lv0/v;->i0:Lv0/v;

    invoke-virtual {v6}, Lv0/v;->b()I

    move-result v6

    if-gt v7, v6, :cond_0

    iget-object v6, v0, Lv0/u0;->a:[I

    add-int/lit8 v11, v4, 0x2

    aget v6, v6, v11

    const v11, 0xfffff

    and-int/2addr v6, v11

    goto :goto_1

    :cond_0
    move v6, v3

    :goto_1
    const/4 v11, 0x1

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    packed-switch v7, :pswitch_data_0

    goto/16 :goto_17

    :pswitch_0
    invoke-virtual {p0, v1, v8, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_5

    :pswitch_1
    invoke-virtual {p0, v1, v8, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v6

    goto/16 :goto_6

    :pswitch_2
    invoke-virtual {p0, v1, v8, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_7

    :pswitch_3
    invoke-virtual {p0, v1, v8, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_8

    :pswitch_4
    invoke-virtual {p0, v1, v8, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_9

    :pswitch_5
    invoke-virtual {p0, v1, v8, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_a

    :pswitch_6
    invoke-virtual {p0, v1, v8, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_b

    :pswitch_7
    invoke-virtual {p0, v1, v8, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_c

    :pswitch_8
    invoke-virtual {p0, v1, v8, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_e

    :pswitch_9
    invoke-virtual {p0, v1, v8, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lv0/h;

    if-eqz v7, :cond_1

    :goto_2
    goto/16 :goto_d

    :cond_1
    check-cast v6, Ljava/lang/String;

    invoke-static {v8, v6}, Lv0/k;->T(ILjava/lang/String;)I

    move-result v6

    goto/16 :goto_4

    :pswitch_a
    invoke-virtual {p0, v1, v8, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_f

    :pswitch_b
    invoke-virtual {p0, v1, v8, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_10

    :pswitch_c
    invoke-virtual {p0, v1, v8, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_11

    :pswitch_d
    invoke-virtual {p0, v1, v8, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lv0/u0;->V(Ljava/lang/Object;J)I

    move-result v6

    goto/16 :goto_12

    :pswitch_e
    invoke-virtual {p0, v1, v8, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v6

    goto/16 :goto_13

    :pswitch_f
    invoke-virtual {p0, v1, v8, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lv0/u0;->W(Ljava/lang/Object;J)J

    move-result-wide v6

    goto/16 :goto_14

    :pswitch_10
    invoke-virtual {p0, v1, v8, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_15

    :pswitch_11
    invoke-virtual {p0, v1, v8, v4}, Lv0/u0;->E(Ljava/lang/Object;II)Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_16

    :pswitch_12
    iget-object v6, v0, Lv0/u0;->q:Lv0/m0;

    invoke-static {v1, v9, v10}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p0, v4}, Lv0/u0;->r(I)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v6, v8, v7, v9}, Lv0/m0;->f(ILjava/lang/Object;Ljava/lang/Object;)I

    move-result v6

    goto/16 :goto_4

    :pswitch_13
    invoke-static {v1, v9, v10}, Lv0/u0;->G(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0, v4}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lv0/i1;->j(ILjava/util/List;Lv0/g1;)I

    move-result v6

    goto/16 :goto_4

    :pswitch_14
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lv0/i1;->t(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lv0/u0;->i:Z

    if-eqz v9, :cond_2

    goto/16 :goto_3

    :pswitch_15
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lv0/i1;->r(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lv0/u0;->i:Z

    if-eqz v9, :cond_2

    goto/16 :goto_3

    :pswitch_16
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lv0/i1;->i(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lv0/u0;->i:Z

    if-eqz v9, :cond_2

    goto/16 :goto_3

    :pswitch_17
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lv0/i1;->g(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lv0/u0;->i:Z

    if-eqz v9, :cond_2

    goto/16 :goto_3

    :pswitch_18
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lv0/i1;->e(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lv0/u0;->i:Z

    if-eqz v9, :cond_2

    goto/16 :goto_3

    :pswitch_19
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lv0/i1;->w(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lv0/u0;->i:Z

    if-eqz v9, :cond_2

    goto/16 :goto_3

    :pswitch_1a
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lv0/i1;->b(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lv0/u0;->i:Z

    if-eqz v9, :cond_2

    goto/16 :goto_3

    :pswitch_1b
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lv0/i1;->g(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lv0/u0;->i:Z

    if-eqz v9, :cond_2

    goto :goto_3

    :pswitch_1c
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lv0/i1;->i(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lv0/u0;->i:Z

    if-eqz v9, :cond_2

    goto :goto_3

    :pswitch_1d
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lv0/i1;->l(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lv0/u0;->i:Z

    if-eqz v9, :cond_2

    goto :goto_3

    :pswitch_1e
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lv0/i1;->y(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lv0/u0;->i:Z

    if-eqz v9, :cond_2

    goto :goto_3

    :pswitch_1f
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lv0/i1;->n(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lv0/u0;->i:Z

    if-eqz v9, :cond_2

    goto :goto_3

    :pswitch_20
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lv0/i1;->g(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lv0/u0;->i:Z

    if-eqz v9, :cond_2

    goto :goto_3

    :pswitch_21
    invoke-virtual {v2, v1, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v7}, Lv0/i1;->i(Ljava/util/List;)I

    move-result v7

    if-lez v7, :cond_3

    iget-boolean v9, v0, Lv0/u0;->i:Z

    if-eqz v9, :cond_2

    :goto_3
    int-to-long v9, v6

    invoke-virtual {v2, v1, v9, v10, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_2
    invoke-static {v8}, Lv0/k;->V(I)I

    move-result v6

    invoke-static {v7}, Lv0/k;->X(I)I

    move-result v8

    add-int/2addr v6, v8

    add-int/2addr v6, v7

    goto/16 :goto_4

    :pswitch_22
    invoke-static {v1, v9, v10}, Lv0/u0;->G(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lv0/i1;->s(ILjava/util/List;Z)I

    move-result v6

    goto/16 :goto_4

    :pswitch_23
    invoke-static {v1, v9, v10}, Lv0/u0;->G(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lv0/i1;->q(ILjava/util/List;Z)I

    move-result v6

    goto :goto_4

    :pswitch_24
    invoke-static {v1, v9, v10}, Lv0/u0;->G(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lv0/i1;->d(ILjava/util/List;Z)I

    move-result v6

    goto :goto_4

    :pswitch_25
    invoke-static {v1, v9, v10}, Lv0/u0;->G(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lv0/i1;->v(ILjava/util/List;Z)I

    move-result v6

    goto :goto_4

    :pswitch_26
    invoke-static {v1, v9, v10}, Lv0/u0;->G(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6}, Lv0/i1;->c(ILjava/util/List;)I

    move-result v6

    goto :goto_4

    :pswitch_27
    invoke-static {v1, v9, v10}, Lv0/u0;->G(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0, v4}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lv0/i1;->p(ILjava/util/List;Lv0/g1;)I

    move-result v6

    goto :goto_4

    :pswitch_28
    invoke-static {v1, v9, v10}, Lv0/u0;->G(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6}, Lv0/i1;->u(ILjava/util/List;)I

    move-result v6

    goto :goto_4

    :pswitch_29
    invoke-static {v1, v9, v10}, Lv0/u0;->G(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lv0/i1;->a(ILjava/util/List;Z)I

    move-result v6

    goto :goto_4

    :pswitch_2a
    invoke-static {v1, v9, v10}, Lv0/u0;->G(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lv0/i1;->k(ILjava/util/List;Z)I

    move-result v6

    goto :goto_4

    :pswitch_2b
    invoke-static {v1, v9, v10}, Lv0/u0;->G(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lv0/i1;->x(ILjava/util/List;Z)I

    move-result v6

    goto :goto_4

    :pswitch_2c
    invoke-static {v1, v9, v10}, Lv0/u0;->G(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lv0/i1;->m(ILjava/util/List;Z)I

    move-result v6

    goto :goto_4

    :pswitch_2d
    invoke-static {v1, v9, v10}, Lv0/u0;->G(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lv0/i1;->f(ILjava/util/List;Z)I

    move-result v6

    goto :goto_4

    :pswitch_2e
    invoke-static {v1, v9, v10}, Lv0/u0;->G(Ljava/lang/Object;J)Ljava/util/List;

    move-result-object v6

    invoke-static {v8, v6, v3}, Lv0/i1;->h(ILjava/util/List;Z)I

    move-result v6

    :goto_4
    add-int/2addr v5, v6

    goto/16 :goto_17

    :pswitch_2f
    invoke-virtual {p0, v1, v4}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_5
    invoke-static {v1, v9, v10}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lv0/r0;

    invoke-virtual {p0, v4}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lv0/k;->s(ILv0/r0;Lv0/g1;)I

    move-result v6

    goto :goto_4

    :pswitch_30
    invoke-virtual {p0, v1, v4}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide v6

    :goto_6
    invoke-static {v8, v6, v7}, Lv0/k;->R(IJ)I

    move-result v6

    goto :goto_4

    :pswitch_31
    invoke-virtual {p0, v1, v4}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result v6

    :goto_7
    invoke-static {v8, v6}, Lv0/k;->P(II)I

    move-result v6

    goto :goto_4

    :pswitch_32
    invoke-virtual {p0, v1, v4}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_8
    invoke-static {v8, v13, v14}, Lv0/k;->N(IJ)I

    move-result v6

    goto :goto_4

    :pswitch_33
    invoke-virtual {p0, v1, v4}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_9
    invoke-static {v8, v3}, Lv0/k;->L(II)I

    move-result v6

    goto :goto_4

    :pswitch_34
    invoke-virtual {p0, v1, v4}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result v6

    :goto_a
    invoke-static {v8, v6}, Lv0/k;->k(II)I

    move-result v6

    goto :goto_4

    :pswitch_35
    invoke-virtual {p0, v1, v4}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result v6

    :goto_b
    invoke-static {v8, v6}, Lv0/k;->W(II)I

    move-result v6

    goto :goto_4

    :pswitch_36
    invoke-virtual {p0, v1, v4}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_c
    invoke-static {v1, v9, v10}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    :goto_d
    check-cast v6, Lv0/h;

    invoke-static {v8, v6}, Lv0/k;->g(ILv0/h;)I

    move-result v6

    goto :goto_4

    :pswitch_37
    invoke-virtual {p0, v1, v4}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_e
    invoke-static {v1, v9, v10}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v4}, Lv0/u0;->s(I)Lv0/g1;

    move-result-object v7

    invoke-static {v8, v6, v7}, Lv0/i1;->o(ILjava/lang/Object;Lv0/g1;)I

    move-result v6

    goto/16 :goto_4

    :pswitch_38
    invoke-virtual {p0, v1, v4}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lv0/h;

    if-eqz v7, :cond_1

    goto/16 :goto_2

    :pswitch_39
    invoke-virtual {p0, v1, v4}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_f
    invoke-static {v8, v11}, Lv0/k;->d(IZ)I

    move-result v6

    goto/16 :goto_4

    :pswitch_3a
    invoke-virtual {p0, v1, v4}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_10
    invoke-static {v8, v3}, Lv0/k;->m(II)I

    move-result v6

    goto/16 :goto_4

    :pswitch_3b
    invoke-virtual {p0, v1, v4}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_11
    invoke-static {v8, v13, v14}, Lv0/k;->o(IJ)I

    move-result v6

    goto/16 :goto_4

    :pswitch_3c
    invoke-virtual {p0, v1, v4}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result v6

    :goto_12
    invoke-static {v8, v6}, Lv0/k;->v(II)I

    move-result v6

    goto/16 :goto_4

    :pswitch_3d
    invoke-virtual {p0, v1, v4}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide v6

    :goto_13
    invoke-static {v8, v6, v7}, Lv0/k;->Y(IJ)I

    move-result v6

    goto/16 :goto_4

    :pswitch_3e
    invoke-virtual {p0, v1, v4}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v1, v9, v10}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide v6

    :goto_14
    invoke-static {v8, v6, v7}, Lv0/k;->x(IJ)I

    move-result v6

    goto/16 :goto_4

    :pswitch_3f
    invoke-virtual {p0, v1, v4}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_15
    invoke-static {v8, v12}, Lv0/k;->q(IF)I

    move-result v6

    goto/16 :goto_4

    :pswitch_40
    invoke-virtual {p0, v1, v4}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_16
    const-wide/16 v6, 0x0

    invoke-static {v8, v6, v7}, Lv0/k;->i(ID)I

    move-result v6

    goto/16 :goto_4

    :cond_3
    :goto_17
    add-int/lit8 v4, v4, 0x3

    goto/16 :goto_0

    :cond_4
    iget-object v2, v0, Lv0/u0;->o:Lv0/n1;

    invoke-virtual {p0, v2, v1}, Lv0/u0;->v(Lv0/n1;Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v5, v1

    return v5

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_2e
        :pswitch_2d
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_2d
        :pswitch_2e
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final v(Lv0/n1;Ljava/lang/Object;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Lv0/n1<",
            "TUT;TUB;>;TT;)I"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lv0/n1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lv0/n1;->h(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final y(Ljava/lang/Object;I)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)Z"
        }
    .end annotation

    iget-boolean v0, p0, Lv0/u0;->h:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_11

    invoke-virtual {p0, p2}, Lv0/u0;->i0(I)I

    move-result p2

    invoke-static {p2}, Lv0/u0;->R(I)J

    move-result-wide v3

    invoke-static {p2}, Lv0/u0;->h0(I)I

    move-result p2

    const-wide/16 v5, 0x0

    packed-switch p2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {p1, v3, v4}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    move v1, v2

    :cond_0
    return v1

    :pswitch_1
    invoke-static {p1, v3, v4}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v5

    if-eqz p1, :cond_1

    move v1, v2

    :cond_1
    return v1

    :pswitch_2
    invoke-static {p1, v3, v4}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_2

    move v1, v2

    :cond_2
    return v1

    :pswitch_3
    invoke-static {p1, v3, v4}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v5

    if-eqz p1, :cond_3

    move v1, v2

    :cond_3
    return v1

    :pswitch_4
    invoke-static {p1, v3, v4}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_4

    move v1, v2

    :cond_4
    return v1

    :pswitch_5
    invoke-static {p1, v3, v4}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_5

    move v1, v2

    :cond_5
    return v1

    :pswitch_6
    invoke-static {p1, v3, v4}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_6

    move v1, v2

    :cond_6
    return v1

    :pswitch_7
    sget-object p2, Lv0/h;->i:Lv0/h;

    invoke-static {p1, v3, v4}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Lv0/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    :pswitch_8
    invoke-static {p1, v3, v4}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_7

    move v1, v2

    :cond_7
    return v1

    :pswitch_9
    invoke-static {p1, v3, v4}, Lv0/r1;->A(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_8

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    :cond_8
    instance-of p2, p1, Lv0/h;

    if-eqz p2, :cond_9

    sget-object p2, Lv0/h;->i:Lv0/h;

    invoke-virtual {p2, p1}, Lv0/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_a
    invoke-static {p1, v3, v4}, Lv0/r1;->p(Ljava/lang/Object;J)Z

    move-result p1

    return p1

    :pswitch_b
    invoke-static {p1, v3, v4}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_a

    move v1, v2

    :cond_a
    return v1

    :pswitch_c
    invoke-static {p1, v3, v4}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v5

    if-eqz p1, :cond_b

    move v1, v2

    :cond_b
    return v1

    :pswitch_d
    invoke-static {p1, v3, v4}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_c

    move v1, v2

    :cond_c
    return v1

    :pswitch_e
    invoke-static {p1, v3, v4}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v5

    if-eqz p1, :cond_d

    move v1, v2

    :cond_d
    return v1

    :pswitch_f
    invoke-static {p1, v3, v4}, Lv0/r1;->y(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v5

    if-eqz p1, :cond_e

    move v1, v2

    :cond_e
    return v1

    :pswitch_10
    invoke-static {p1, v3, v4}, Lv0/r1;->w(Ljava/lang/Object;J)F

    move-result p1

    const/4 p2, 0x0

    cmpl-float p1, p1, p2

    if-eqz p1, :cond_f

    move v1, v2

    :cond_f
    return v1

    :pswitch_11
    invoke-static {p1, v3, v4}, Lv0/r1;->v(Ljava/lang/Object;J)D

    move-result-wide p1

    const-wide/16 v3, 0x0

    cmpl-double p1, p1, v3

    if-eqz p1, :cond_10

    move v1, v2

    :cond_10
    return v1

    :cond_11
    invoke-virtual {p0, p2}, Lv0/u0;->Y(I)I

    move-result p2

    ushr-int/lit8 v0, p2, 0x14

    shl-int v0, v2, v0

    const v3, 0xfffff

    and-int/2addr p2, v3

    int-to-long v3, p2

    invoke-static {p1, v3, v4}, Lv0/r1;->x(Ljava/lang/Object;J)I

    move-result p1

    and-int/2addr p1, v0

    if-eqz p1, :cond_12

    move v1, v2

    :cond_12
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final z(Ljava/lang/Object;III)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;III)Z"
        }
    .end annotation

    iget-boolean v0, p0, Lv0/u0;->h:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lv0/u0;->y(Ljava/lang/Object;I)Z

    move-result p1

    return p1

    :cond_0
    and-int p1, p3, p4

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
