.class public final Lp4/h;
.super Lk4/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp4/h$b;,
        Lp4/h$a;
    }
.end annotation


# static fields
.field public static final b:Lp4/h$a;


# instance fields
.field public final a:Lp4/h$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lp4/g;->a:Lp4/g;

    sput-object v0, Lp4/h;->b:Lp4/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lp4/h;-><init>(Lp4/h$a;)V

    return-void
.end method

.method public constructor <init>(Lp4/h$a;)V
    .locals 0

    invoke-direct {p0}, Lk4/g;-><init>()V

    iput-object p1, p0, Lp4/h;->a:Lp4/h$a;

    return-void
.end method

.method public static synthetic A(IIIII)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public static B(Lp5/a0;I)I
    .locals 5

    invoke-virtual {p0}, Lp5/a0;->e()[B

    move-result-object v0

    invoke-virtual {p0}, Lp5/a0;->f()I

    move-result p0

    move v1, p0

    :goto_0
    add-int/lit8 v2, v1, 0x1

    add-int v3, p0, p1

    if-ge v2, v3, :cond_1

    aget-byte v3, v0, v1

    const/16 v4, 0xff

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_0

    aget-byte v3, v0, v2

    if-nez v3, :cond_0

    sub-int v3, v1, p0

    add-int/lit8 v1, v1, 0x2

    sub-int v3, p1, v3

    add-int/lit8 v3, v3, -0x2

    invoke-static {v0, v1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 p1, p1, -0x1

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    return p1
.end method

.method public static C(Lp5/a0;IIZ)Z
    .locals 18

    move-object/from16 v1, p0

    move/from16 v0, p1

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->f()I

    move-result v2

    :goto_0
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lp5/a0;->a()I

    move-result v3

    const/4 v4, 0x1

    move/from16 v5, p2

    if-lt v3, v5, :cond_c

    const/4 v3, 0x3

    const/4 v6, 0x0

    if-lt v0, v3, :cond_0

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->p()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->I()J

    move-result-wide v8

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->M()I

    move-result v10

    goto :goto_1

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lp5/a0;->J()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->J()I

    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long v8, v8

    move v10, v6

    :goto_1
    const-wide/16 v11, 0x0

    if-nez v7, :cond_1

    cmp-long v7, v8, v11

    if-nez v7, :cond_1

    if-nez v10, :cond_1

    invoke-virtual {v1, v2}, Lp5/a0;->T(I)V

    return v4

    :cond_1
    const/4 v7, 0x4

    if-ne v0, v7, :cond_3

    if-nez p3, :cond_3

    const-wide/32 v13, 0x808080

    and-long/2addr v13, v8

    cmp-long v11, v13, v11

    if-eqz v11, :cond_2

    invoke-virtual {v1, v2}, Lp5/a0;->T(I)V

    return v6

    :cond_2
    const-wide/16 v11, 0xff

    and-long v13, v8, v11

    const/16 v15, 0x8

    shr-long v15, v8, v15

    and-long/2addr v15, v11

    const/16 v17, 0x7

    shl-long v15, v15, v17

    or-long/2addr v13, v15

    const/16 v15, 0x10

    shr-long v15, v8, v15

    and-long/2addr v15, v11

    const/16 v17, 0xe

    shl-long v15, v15, v17

    or-long/2addr v13, v15

    const/16 v15, 0x18

    shr-long/2addr v8, v15

    and-long/2addr v8, v11

    const/16 v11, 0x15

    shl-long/2addr v8, v11

    or-long/2addr v8, v13

    :cond_3
    if-ne v0, v7, :cond_6

    and-int/lit8 v3, v10, 0x40

    if-eqz v3, :cond_4

    move v3, v4

    goto :goto_2

    :cond_4
    move v3, v6

    :goto_2
    and-int/lit8 v7, v10, 0x1

    if-eqz v7, :cond_5

    goto :goto_4

    :cond_5
    move v4, v6

    goto :goto_4

    :cond_6
    if-ne v0, v3, :cond_8

    and-int/lit8 v3, v10, 0x20

    if-eqz v3, :cond_7

    move v3, v4

    goto :goto_3

    :cond_7
    move v3, v6

    :goto_3
    and-int/lit16 v7, v10, 0x80

    if-eqz v7, :cond_5

    goto :goto_4

    :cond_8
    move v3, v6

    move v4, v3

    :goto_4
    if-eqz v4, :cond_9

    add-int/lit8 v3, v3, 0x4

    :cond_9
    int-to-long v3, v3

    cmp-long v3, v8, v3

    if-gez v3, :cond_a

    invoke-virtual {v1, v2}, Lp5/a0;->T(I)V

    return v6

    :cond_a
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Lp5/a0;->a()I

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    int-to-long v3, v3

    cmp-long v3, v3, v8

    if-gez v3, :cond_b

    invoke-virtual {v1, v2}, Lp5/a0;->T(I)V

    return v6

    :cond_b
    long-to-int v3, v8

    :try_start_2
    invoke-virtual {v1, v3}, Lp5/a0;->U(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    :cond_c
    invoke-virtual {v1, v2}, Lp5/a0;->T(I)V

    return v4

    :catchall_0
    move-exception v0

    invoke-virtual {v1, v2}, Lp5/a0;->T(I)V

    throw v0
.end method

.method public static synthetic c(IIIII)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lp4/h;->A(IIIII)Z

    move-result p0

    return p0
.end method

.method public static d([BII)[B
    .locals 0

    if-gt p2, p1, :cond_0

    sget-object p0, Lp5/n0;->f:[B

    return-object p0

    :cond_0
    invoke-static {p0, p1, p2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    return-object p0
.end method

.method public static f(Lp5/a0;II)Lp4/a;
    .locals 7

    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result v0

    invoke-static {v0}, Lp4/h;->w(I)Ljava/nio/charset/Charset;

    move-result-object v1

    add-int/lit8 p1, p1, -0x1

    new-array v2, p1, [B

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3, p1}, Lp5/a0;->l([BII)V

    const-string p0, "image/"

    const/4 v4, 0x2

    if-ne p2, v4, :cond_1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p0, Ljava/lang/String;

    const/4 v5, 0x3

    sget-object v6, Lh7/e;->b:Ljava/nio/charset/Charset;

    invoke-direct {p0, v2, v3, v5, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-static {p0}, Lh7/c;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p2, "image/jpg"

    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p0, "image/jpeg"

    :cond_0
    move p2, v4

    goto :goto_0

    :cond_1
    invoke-static {v2, v3}, Lp4/h;->z([BI)I

    move-result p2

    new-instance v5, Ljava/lang/String;

    sget-object v6, Lh7/e;->b:Ljava/nio/charset/Charset;

    invoke-direct {v5, v2, v3, p2, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-static {v5}, Lh7/c;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v5, 0x2f

    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    move-object p0, v3

    :goto_0
    add-int/lit8 v3, p2, 0x1

    aget-byte v3, v2, v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr p2, v4

    invoke-static {v2, p2, v0}, Lp4/h;->y([BII)I

    move-result v4

    new-instance v5, Ljava/lang/String;

    sub-int v6, v4, p2

    invoke-direct {v5, v2, p2, v6, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-static {v0}, Lp4/h;->v(I)I

    move-result p2

    add-int/2addr v4, p2

    invoke-static {v2, v4, p1}, Lp4/h;->d([BII)[B

    move-result-object p1

    new-instance p2, Lp4/a;

    invoke-direct {p2, p0, v5, v3, p1}, Lp4/a;-><init>(Ljava/lang/String;Ljava/lang/String;I[B)V

    return-object p2
.end method

.method public static g(Lp5/a0;ILjava/lang/String;)Lp4/b;
    .locals 2

    new-array v0, p1, [B

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1}, Lp5/a0;->l([BII)V

    new-instance p0, Lp4/b;

    invoke-direct {p0, p2, v0}, Lp4/b;-><init>(Ljava/lang/String;[B)V

    return-object p0
.end method

.method public static h(Lp5/a0;IIZILp4/h$a;)Lp4/c;
    .locals 15

    move-object v0, p0

    invoke-virtual {p0}, Lp5/a0;->f()I

    move-result v1

    invoke-virtual {p0}, Lp5/a0;->e()[B

    move-result-object v2

    invoke-static {v2, v1}, Lp4/h;->z([BI)I

    move-result v2

    new-instance v4, Ljava/lang/String;

    invoke-virtual {p0}, Lp5/a0;->e()[B

    move-result-object v3

    sub-int v5, v2, v1

    sget-object v6, Lh7/e;->b:Ljava/nio/charset/Charset;

    invoke-direct {v4, v3, v1, v5, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p0, v2}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v5

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v6

    invoke-virtual {p0}, Lp5/a0;->I()J

    move-result-wide v2

    const-wide v7, 0xffffffffL

    cmp-long v9, v2, v7

    const-wide/16 v10, -0x1

    if-nez v9, :cond_0

    move-wide v12, v10

    goto :goto_0

    :cond_0
    move-wide v12, v2

    :goto_0
    invoke-virtual {p0}, Lp5/a0;->I()J

    move-result-wide v2

    cmp-long v7, v2, v7

    if-nez v7, :cond_1

    move-wide v9, v10

    goto :goto_1

    :cond_1
    move-wide v9, v2

    :goto_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    add-int v1, v1, p1

    :cond_2
    :goto_2
    invoke-virtual {p0}, Lp5/a0;->f()I

    move-result v3

    if-ge v3, v1, :cond_3

    move/from16 v3, p2

    move/from16 v7, p3

    move/from16 v8, p4

    move-object/from16 v11, p5

    invoke-static {v3, p0, v7, v8, v11}, Lp4/h;->k(ILp5/a0;ZILp4/h$a;)Lp4/i;

    move-result-object v14

    if-eqz v14, :cond_2

    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    new-array v0, v0, [Lp4/i;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, [Lp4/i;

    new-instance v0, Lp4/c;

    move-object v3, v0

    move-wide v7, v12

    invoke-direct/range {v3 .. v11}, Lp4/c;-><init>(Ljava/lang/String;IIJJ[Lp4/i;)V

    return-object v0
.end method

.method public static i(Lp5/a0;IIZILp4/h$a;)Lp4/d;
    .locals 16

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->f()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->e()[B

    move-result-object v2

    invoke-static {v2, v1}, Lp4/h;->z([BI)I

    move-result v2

    new-instance v3, Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->e()[B

    move-result-object v4

    sub-int v5, v2, v1

    sget-object v6, Lh7/e;->b:Ljava/nio/charset/Charset;

    invoke-direct {v3, v4, v1, v5, v6}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    const/4 v4, 0x1

    add-int/2addr v2, v4

    invoke-virtual {v0, v2}, Lp5/a0;->T(I)V

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->G()I

    move-result v2

    and-int/lit8 v5, v2, 0x2

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    move v5, v4

    goto :goto_0

    :cond_0
    move v5, v6

    :goto_0
    and-int/2addr v2, v4

    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v6

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lp5/a0;->G()I

    move-result v7

    new-array v8, v7, [Ljava/lang/String;

    move v9, v6

    :goto_2
    if-ge v9, v7, :cond_2

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->f()I

    move-result v10

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->e()[B

    move-result-object v11

    invoke-static {v11, v10}, Lp4/h;->z([BI)I

    move-result v11

    new-instance v12, Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->e()[B

    move-result-object v13

    sub-int v14, v11, v10

    sget-object v15, Lh7/e;->b:Ljava/nio/charset/Charset;

    invoke-direct {v12, v13, v10, v14, v15}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    aput-object v12, v8, v9

    add-int/2addr v11, v4

    invoke-virtual {v0, v11}, Lp5/a0;->T(I)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    add-int v1, v1, p1

    :cond_3
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lp5/a0;->f()I

    move-result v7

    if-ge v7, v1, :cond_4

    move/from16 v7, p2

    move/from16 v9, p3

    move/from16 v10, p4

    move-object/from16 v11, p5

    invoke-static {v7, v0, v9, v10, v11}, Lp4/h;->k(ILp5/a0;ZILp4/h$a;)Lp4/i;

    move-result-object v12

    if-eqz v12, :cond_3

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    new-array v0, v6, [Lp4/i;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp4/i;

    new-instance v1, Lp4/d;

    move-object/from16 p0, v1

    move-object/from16 p1, v3

    move/from16 p2, v5

    move/from16 p3, v2

    move-object/from16 p4, v8

    move-object/from16 p5, v0

    invoke-direct/range {p0 .. p5}, Lp4/d;-><init>(Ljava/lang/String;ZZ[Ljava/lang/String;[Lp4/i;)V

    return-object v1
.end method

.method public static j(Lp5/a0;I)Lp4/e;
    .locals 7

    const/4 v0, 0x4

    if-ge p1, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result v1

    invoke-static {v1}, Lp4/h;->w(I)Ljava/nio/charset/Charset;

    move-result-object v2

    const/4 v3, 0x3

    new-array v4, v3, [B

    const/4 v5, 0x0

    invoke-virtual {p0, v4, v5, v3}, Lp5/a0;->l([BII)V

    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v4, v5, v3}, Ljava/lang/String;-><init>([BII)V

    sub-int/2addr p1, v0

    new-array v0, p1, [B

    invoke-virtual {p0, v0, v5, p1}, Lp5/a0;->l([BII)V

    invoke-static {v0, v5, v1}, Lp4/h;->y([BII)I

    move-result p0

    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0, v5, p0, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-static {v1}, Lp4/h;->v(I)I

    move-result v3

    add-int/2addr p0, v3

    invoke-static {v0, p0, v1}, Lp4/h;->y([BII)I

    move-result v1

    invoke-static {v0, p0, v1, v2}, Lp4/h;->p([BIILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lp4/e;

    invoke-direct {v0, v6, p1, p0}, Lp4/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static k(ILp5/a0;ZILp4/h$a;)Lp4/i;
    .locals 19

    move/from16 v0, p0

    move-object/from16 v7, p1

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->G()I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->G()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->G()I

    move-result v10

    const/4 v11, 0x3

    if-lt v0, v11, :cond_0

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->G()I

    move-result v1

    move v13, v1

    goto :goto_0

    :cond_0
    const/4 v13, 0x0

    :goto_0
    const/4 v14, 0x4

    if-ne v0, v14, :cond_2

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->K()I

    move-result v1

    if-nez p2, :cond_1

    and-int/lit16 v2, v1, 0xff

    shr-int/lit8 v3, v1, 0x8

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x7

    or-int/2addr v2, v3

    shr-int/lit8 v3, v1, 0x10

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0xe

    or-int/2addr v2, v3

    shr-int/lit8 v1, v1, 0x18

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr v1, v2

    :cond_1
    :goto_1
    move v15, v1

    goto :goto_2

    :cond_2
    if-ne v0, v11, :cond_3

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->K()I

    move-result v1

    goto :goto_1

    :cond_3
    invoke-virtual/range {p1 .. p1}, Lp5/a0;->J()I

    move-result v1

    goto :goto_1

    :goto_2
    if-lt v0, v11, :cond_4

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->M()I

    move-result v1

    move v6, v1

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    :goto_3
    const/16 v16, 0x0

    if-nez v8, :cond_5

    if-nez v9, :cond_5

    if-nez v10, :cond_5

    if-nez v13, :cond_5

    if-nez v15, :cond_5

    if-nez v6, :cond_5

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->g()I

    move-result v0

    invoke-virtual {v7, v0}, Lp5/a0;->T(I)V

    return-object v16

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lp5/a0;->f()I

    move-result v1

    add-int v5, v1, v15

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->g()I

    move-result v1

    const-string v4, "Id3Decoder"

    if-le v5, v1, :cond_6

    const-string v0, "Frame size exceeds remaining tag data"

    invoke-static {v4, v0}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lp5/a0;->g()I

    move-result v0

    invoke-virtual {v7, v0}, Lp5/a0;->T(I)V

    return-object v16

    :cond_6
    if-eqz p4, :cond_7

    move-object/from16 v1, p4

    move/from16 v2, p0

    move v3, v8

    move-object v12, v4

    move v4, v9

    move v14, v5

    move v5, v10

    move/from16 v18, v6

    move v6, v13

    invoke-interface/range {v1 .. v6}, Lp4/h$a;->a(IIIII)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v7, v14}, Lp5/a0;->T(I)V

    return-object v16

    :cond_7
    move-object v12, v4

    move v14, v5

    move/from16 v18, v6

    :cond_8
    const/4 v1, 0x1

    if-ne v0, v11, :cond_c

    move/from16 v2, v18

    and-int/lit16 v3, v2, 0x80

    if-eqz v3, :cond_9

    move v3, v1

    goto :goto_4

    :cond_9
    const/4 v3, 0x0

    :goto_4
    and-int/lit8 v4, v2, 0x40

    if-eqz v4, :cond_a

    move v4, v1

    goto :goto_5

    :cond_a
    const/4 v4, 0x0

    :goto_5
    and-int/lit8 v2, v2, 0x20

    if-eqz v2, :cond_b

    move v2, v1

    goto :goto_6

    :cond_b
    const/4 v2, 0x0

    :goto_6
    move/from16 v17, v3

    const/4 v6, 0x0

    goto :goto_c

    :cond_c
    move/from16 v2, v18

    const/4 v3, 0x4

    if-ne v0, v3, :cond_12

    and-int/lit8 v3, v2, 0x40

    if-eqz v3, :cond_d

    move v3, v1

    goto :goto_7

    :cond_d
    const/4 v3, 0x0

    :goto_7
    and-int/lit8 v4, v2, 0x8

    if-eqz v4, :cond_e

    move v4, v1

    goto :goto_8

    :cond_e
    const/4 v4, 0x0

    :goto_8
    and-int/lit8 v5, v2, 0x4

    if-eqz v5, :cond_f

    move v5, v1

    goto :goto_9

    :cond_f
    const/4 v5, 0x0

    :goto_9
    and-int/lit8 v6, v2, 0x2

    if-eqz v6, :cond_10

    move v6, v1

    goto :goto_a

    :cond_10
    const/4 v6, 0x0

    :goto_a
    and-int/2addr v2, v1

    if-eqz v2, :cond_11

    move/from16 v17, v1

    goto :goto_b

    :cond_11
    const/16 v17, 0x0

    :goto_b
    move v2, v3

    move/from16 v3, v17

    move/from16 v17, v4

    move v4, v5

    goto :goto_c

    :cond_12
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/16 v17, 0x0

    :goto_c
    if-nez v17, :cond_28

    if-eqz v4, :cond_13

    goto/16 :goto_10

    :cond_13
    if-eqz v2, :cond_14

    add-int/lit8 v15, v15, -0x1

    invoke-virtual {v7, v1}, Lp5/a0;->U(I)V

    :cond_14
    if-eqz v3, :cond_15

    add-int/lit8 v15, v15, -0x4

    const/4 v1, 0x4

    invoke-virtual {v7, v1}, Lp5/a0;->U(I)V

    :cond_15
    if-eqz v6, :cond_16

    invoke-static {v7, v15}, Lp4/h;->B(Lp5/a0;I)I

    move-result v15

    :cond_16
    const/16 v1, 0x54

    const/4 v2, 0x2

    const/16 v3, 0x58

    if-ne v8, v1, :cond_18

    if-ne v9, v3, :cond_18

    if-ne v10, v3, :cond_18

    if-eq v0, v2, :cond_17

    if-ne v13, v3, :cond_18

    :cond_17
    :try_start_0
    invoke-static {v7, v15}, Lp4/h;->s(Lp5/a0;I)Lp4/m;

    move-result-object v1

    goto/16 :goto_e

    :cond_18
    if-ne v8, v1, :cond_19

    invoke-static {v0, v8, v9, v10, v13}, Lp4/h;->x(IIIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v15, v1}, Lp4/h;->q(Lp5/a0;ILjava/lang/String;)Lp4/m;

    move-result-object v1

    goto/16 :goto_e

    :catchall_0
    move-exception v0

    goto/16 :goto_f

    :cond_19
    const/16 v4, 0x57

    if-ne v8, v4, :cond_1b

    if-ne v9, v3, :cond_1b

    if-ne v10, v3, :cond_1b

    if-eq v0, v2, :cond_1a

    if-ne v13, v3, :cond_1b

    :cond_1a
    invoke-static {v7, v15}, Lp4/h;->u(Lp5/a0;I)Lp4/n;

    move-result-object v1

    goto/16 :goto_e

    :cond_1b
    if-ne v8, v4, :cond_1c

    invoke-static {v0, v8, v9, v10, v13}, Lp4/h;->x(IIIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v15, v1}, Lp4/h;->t(Lp5/a0;ILjava/lang/String;)Lp4/n;

    move-result-object v1

    goto/16 :goto_e

    :cond_1c
    const/16 v3, 0x49

    const/16 v4, 0x50

    if-ne v8, v4, :cond_1d

    const/16 v5, 0x52

    if-ne v9, v5, :cond_1d

    if-ne v10, v3, :cond_1d

    const/16 v5, 0x56

    if-ne v13, v5, :cond_1d

    invoke-static {v7, v15}, Lp4/h;->o(Lp5/a0;I)Lp4/l;

    move-result-object v1

    goto/16 :goto_e

    :cond_1d
    const/16 v5, 0x47

    const/16 v6, 0x4f

    if-ne v8, v5, :cond_1f

    const/16 v5, 0x45

    if-ne v9, v5, :cond_1f

    if-ne v10, v6, :cond_1f

    const/16 v5, 0x42

    if-eq v13, v5, :cond_1e

    if-ne v0, v2, :cond_1f

    :cond_1e
    invoke-static {v7, v15}, Lp4/h;->l(Lp5/a0;I)Lp4/f;

    move-result-object v1

    goto/16 :goto_e

    :cond_1f
    const/16 v5, 0x41

    const/16 v11, 0x43

    if-ne v0, v2, :cond_20

    if-ne v8, v4, :cond_21

    if-ne v9, v3, :cond_21

    if-ne v10, v11, :cond_21

    goto :goto_d

    :cond_20
    if-ne v8, v5, :cond_21

    if-ne v9, v4, :cond_21

    if-ne v10, v3, :cond_21

    if-ne v13, v11, :cond_21

    :goto_d
    invoke-static {v7, v15, v0}, Lp4/h;->f(Lp5/a0;II)Lp4/a;

    move-result-object v1

    goto/16 :goto_e

    :cond_21
    const/16 v3, 0x4d

    if-ne v8, v11, :cond_23

    if-ne v9, v6, :cond_23

    if-ne v10, v3, :cond_23

    if-eq v13, v3, :cond_22

    if-ne v0, v2, :cond_23

    :cond_22
    invoke-static {v7, v15}, Lp4/h;->j(Lp5/a0;I)Lp4/e;

    move-result-object v1

    goto :goto_e

    :cond_23
    if-ne v8, v11, :cond_24

    const/16 v2, 0x48

    if-ne v9, v2, :cond_24

    if-ne v10, v5, :cond_24

    if-ne v13, v4, :cond_24

    move-object/from16 v1, p1

    move v2, v15

    move/from16 v3, p0

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    invoke-static/range {v1 .. v6}, Lp4/h;->h(Lp5/a0;IIZILp4/h$a;)Lp4/c;

    move-result-object v1

    goto :goto_e

    :cond_24
    if-ne v8, v11, :cond_25

    if-ne v9, v1, :cond_25

    if-ne v10, v6, :cond_25

    if-ne v13, v11, :cond_25

    move-object/from16 v1, p1

    move v2, v15

    move/from16 v3, p0

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    invoke-static/range {v1 .. v6}, Lp4/h;->i(Lp5/a0;IIZILp4/h$a;)Lp4/d;

    move-result-object v1

    goto :goto_e

    :cond_25
    if-ne v8, v3, :cond_26

    const/16 v2, 0x4c

    if-ne v9, v2, :cond_26

    if-ne v10, v2, :cond_26

    if-ne v13, v1, :cond_26

    invoke-static {v7, v15}, Lp4/h;->n(Lp5/a0;I)Lp4/k;

    move-result-object v1

    goto :goto_e

    :cond_26
    invoke-static {v0, v8, v9, v10, v13}, Lp4/h;->x(IIIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v15, v1}, Lp4/h;->g(Lp5/a0;ILjava/lang/String;)Lp4/b;

    move-result-object v1

    :goto_e
    if-nez v1, :cond_27

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to decode frame: id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0, v8, v9, v10, v13}, Lp4/h;->x(IIIII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", frameSize="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_27
    invoke-virtual {v7, v14}, Lp5/a0;->T(I)V

    return-object v1

    :goto_f
    invoke-virtual {v7, v14}, Lp5/a0;->T(I)V

    throw v0

    :cond_28
    :goto_10
    const-string v0, "Skipping unsupported compressed or encrypted frame"

    invoke-static {v12, v0}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v14}, Lp5/a0;->T(I)V

    return-object v16
.end method

.method public static l(Lp5/a0;I)Lp4/f;
    .locals 6

    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result v0

    invoke-static {v0}, Lp4/h;->w(I)Ljava/nio/charset/Charset;

    move-result-object v1

    add-int/lit8 p1, p1, -0x1

    new-array v2, p1, [B

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3, p1}, Lp5/a0;->l([BII)V

    invoke-static {v2, v3}, Lp4/h;->z([BI)I

    move-result p0

    new-instance v4, Ljava/lang/String;

    sget-object v5, Lh7/e;->b:Ljava/nio/charset/Charset;

    invoke-direct {v4, v2, v3, p0, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    add-int/lit8 p0, p0, 0x1

    invoke-static {v2, p0, v0}, Lp4/h;->y([BII)I

    move-result v3

    invoke-static {v2, p0, v3, v1}, Lp4/h;->p([BIILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0}, Lp4/h;->v(I)I

    move-result v5

    add-int/2addr v3, v5

    invoke-static {v2, v3, v0}, Lp4/h;->y([BII)I

    move-result v5

    invoke-static {v2, v3, v5, v1}, Lp4/h;->p([BIILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lp4/h;->v(I)I

    move-result v0

    add-int/2addr v5, v0

    invoke-static {v2, v5, p1}, Lp4/h;->d([BII)[B

    move-result-object p1

    new-instance v0, Lp4/f;

    invoke-direct {v0, v4, p0, v1, p1}, Lp4/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V

    return-object v0
.end method

.method public static m(Lp5/a0;)Lp4/h$b;
    .locals 9

    invoke-virtual {p0}, Lp5/a0;->a()I

    move-result v0

    const/4 v1, 0x0

    const-string v2, "Id3Decoder"

    const/16 v3, 0xa

    if-ge v0, v3, :cond_0

    const-string p0, "Data too short to be an ID3 tag"

    :goto_0
    invoke-static {v2, p0}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    invoke-virtual {p0}, Lp5/a0;->J()I

    move-result v0

    const v3, 0x494433

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v0, v3, :cond_1

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected first three bytes of ID3 tag header: 0x"

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-array v3, v5, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v4

    const-string v0, "%06X"

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result v0

    invoke-virtual {p0, v5}, Lp5/a0;->U(I)V

    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result v3

    invoke-virtual {p0}, Lp5/a0;->F()I

    move-result v6

    const/4 v7, 0x2

    const/4 v8, 0x4

    if-ne v0, v7, :cond_3

    and-int/lit8 p0, v3, 0x40

    if-eqz p0, :cond_2

    move p0, v5

    goto :goto_2

    :cond_2
    move p0, v4

    :goto_2
    if-eqz p0, :cond_9

    const-string p0, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"

    goto :goto_0

    :cond_3
    const/4 v7, 0x3

    if-ne v0, v7, :cond_5

    and-int/lit8 v1, v3, 0x40

    if-eqz v1, :cond_4

    move v1, v5

    goto :goto_3

    :cond_4
    move v1, v4

    :goto_3
    if-eqz v1, :cond_9

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v1

    invoke-virtual {p0, v1}, Lp5/a0;->U(I)V

    add-int/2addr v1, v8

    sub-int/2addr v6, v1

    goto :goto_6

    :cond_5
    if-ne v0, v8, :cond_b

    and-int/lit8 v1, v3, 0x40

    if-eqz v1, :cond_6

    move v1, v5

    goto :goto_4

    :cond_6
    move v1, v4

    :goto_4
    if-eqz v1, :cond_7

    invoke-virtual {p0}, Lp5/a0;->F()I

    move-result v1

    add-int/lit8 v2, v1, -0x4

    invoke-virtual {p0, v2}, Lp5/a0;->U(I)V

    sub-int/2addr v6, v1

    :cond_7
    and-int/lit8 p0, v3, 0x10

    if-eqz p0, :cond_8

    move p0, v5

    goto :goto_5

    :cond_8
    move p0, v4

    :goto_5
    if-eqz p0, :cond_9

    add-int/lit8 v6, v6, -0xa

    :cond_9
    :goto_6
    if-ge v0, v8, :cond_a

    and-int/lit16 p0, v3, 0x80

    if-eqz p0, :cond_a

    move v4, v5

    :cond_a
    new-instance p0, Lp4/h$b;

    invoke-direct {p0, v0, v4, v6}, Lp4/h$b;-><init>(IZI)V

    return-object p0

    :cond_b
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Skipped ID3 tag with unsupported majorVersion="

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_1
.end method

.method public static n(Lp5/a0;I)Lp4/k;
    .locals 10

    invoke-virtual {p0}, Lp5/a0;->M()I

    move-result v1

    invoke-virtual {p0}, Lp5/a0;->J()I

    move-result v2

    invoke-virtual {p0}, Lp5/a0;->J()I

    move-result v3

    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result v0

    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result v4

    new-instance v5, Lp5/z;

    invoke-direct {v5}, Lp5/z;-><init>()V

    invoke-virtual {v5, p0}, Lp5/z;->m(Lp5/a0;)V

    add-int/lit8 p1, p1, -0xa

    mul-int/lit8 p1, p1, 0x8

    add-int p0, v0, v4

    div-int/2addr p1, p0

    new-array p0, p1, [I

    new-array v6, p1, [I

    const/4 v7, 0x0

    :goto_0
    if-ge v7, p1, :cond_0

    invoke-virtual {v5, v0}, Lp5/z;->h(I)I

    move-result v8

    invoke-virtual {v5, v4}, Lp5/z;->h(I)I

    move-result v9

    aput v8, p0, v7

    aput v9, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lp4/k;

    move-object v0, p1

    move-object v4, p0

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lp4/k;-><init>(III[I[I)V

    return-object p1
.end method

.method public static o(Lp5/a0;I)Lp4/l;
    .locals 4

    new-array v0, p1, [B

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1}, Lp5/a0;->l([BII)V

    invoke-static {v0, v1}, Lp4/h;->z([BI)I

    move-result p0

    new-instance v2, Ljava/lang/String;

    sget-object v3, Lh7/e;->b:Ljava/nio/charset/Charset;

    invoke-direct {v2, v0, v1, p0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    add-int/lit8 p0, p0, 0x1

    invoke-static {v0, p0, p1}, Lp4/h;->d([BII)[B

    move-result-object p0

    new-instance p1, Lp4/l;

    invoke-direct {p1, v2, p0}, Lp4/l;-><init>(Ljava/lang/String;[B)V

    return-object p1
.end method

.method public static p([BIILjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1

    if-le p2, p1, :cond_1

    array-length v0, p0

    if-le p2, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    sub-int/2addr p2, p1

    invoke-direct {v0, p0, p1, p2, p3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v0

    :cond_1
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static q(Lp5/a0;ILjava/lang/String;)Lp4/m;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ge p1, v1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result v2

    sub-int/2addr p1, v1

    new-array v1, p1, [B

    const/4 v3, 0x0

    invoke-virtual {p0, v1, v3, p1}, Lp5/a0;->l([BII)V

    invoke-static {v1, v2, v3}, Lp4/h;->r([BII)Li7/u;

    move-result-object p0

    new-instance p1, Lp4/m;

    invoke-direct {p1, p2, v0, p0}, Lp4/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object p1
.end method

.method public static r([BII)Li7/u;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII)",
            "Li7/u<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    array-length v0, p0

    const-string v1, ""

    if-lt p2, v0, :cond_0

    invoke-static {v1}, Li7/u;->v(Ljava/lang/Object;)Li7/u;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {}, Li7/u;->n()Li7/u$a;

    move-result-object v0

    :goto_0
    invoke-static {p0, p2, p1}, Lp4/h;->y([BII)I

    move-result v2

    if-ge p2, v2, :cond_1

    new-instance v3, Ljava/lang/String;

    sub-int v4, v2, p2

    invoke-static {p1}, Lp4/h;->w(I)Ljava/nio/charset/Charset;

    move-result-object v5

    invoke-direct {v3, p0, p2, v4, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v0, v3}, Li7/u$a;->h(Ljava/lang/Object;)Li7/u$a;

    invoke-static {p1}, Lp4/h;->v(I)I

    move-result p2

    add-int/2addr p2, v2

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Li7/u$a;->k()Li7/u;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {v1}, Li7/u;->v(Ljava/lang/Object;)Li7/u;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method public static s(Lp5/a0;I)Lp4/m;
    .locals 4

    const/4 v0, 0x1

    if-ge p1, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result v1

    sub-int/2addr p1, v0

    new-array v0, p1, [B

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, p1}, Lp5/a0;->l([BII)V

    invoke-static {v0, v2, v1}, Lp4/h;->y([BII)I

    move-result p0

    new-instance p1, Ljava/lang/String;

    invoke-static {v1}, Lp4/h;->w(I)Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-direct {p1, v0, v2, p0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-static {v1}, Lp4/h;->v(I)I

    move-result v2

    add-int/2addr p0, v2

    invoke-static {v0, v1, p0}, Lp4/h;->r([BII)Li7/u;

    move-result-object p0

    new-instance v0, Lp4/m;

    const-string v1, "TXXX"

    invoke-direct {v0, v1, p1, p0}, Lp4/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public static t(Lp5/a0;ILjava/lang/String;)Lp4/n;
    .locals 3

    new-array v0, p1, [B

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p1}, Lp5/a0;->l([BII)V

    invoke-static {v0, v1}, Lp4/h;->z([BI)I

    move-result p0

    new-instance p1, Ljava/lang/String;

    sget-object v2, Lh7/e;->b:Ljava/nio/charset/Charset;

    invoke-direct {p1, v0, v1, p0, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    new-instance p0, Lp4/n;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0, p1}, Lp4/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public static u(Lp5/a0;I)Lp4/n;
    .locals 4

    const/4 v0, 0x1

    if-ge p1, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result v1

    sub-int/2addr p1, v0

    new-array v0, p1, [B

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, p1}, Lp5/a0;->l([BII)V

    invoke-static {v0, v2, v1}, Lp4/h;->y([BII)I

    move-result p0

    new-instance p1, Ljava/lang/String;

    invoke-static {v1}, Lp4/h;->w(I)Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-direct {p1, v0, v2, p0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-static {v1}, Lp4/h;->v(I)I

    move-result v1

    add-int/2addr p0, v1

    invoke-static {v0, p0}, Lp4/h;->z([BI)I

    move-result v1

    sget-object v2, Lh7/e;->b:Ljava/nio/charset/Charset;

    invoke-static {v0, p0, v1, v2}, Lp4/h;->p([BIILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lp4/n;

    const-string v1, "WXXX"

    invoke-direct {v0, v1, p1, p0}, Lp4/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static v(I)I
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static w(I)Ljava/nio/charset/Charset;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    sget-object p0, Lh7/e;->b:Ljava/nio/charset/Charset;

    return-object p0

    :cond_0
    sget-object p0, Lh7/e;->c:Ljava/nio/charset/Charset;

    return-object p0

    :cond_1
    sget-object p0, Lh7/e;->d:Ljava/nio/charset/Charset;

    return-object p0

    :cond_2
    sget-object p0, Lh7/e;->f:Ljava/nio/charset/Charset;

    return-object p0
.end method

.method public static x(IIIII)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ne p0, v3, :cond_0

    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array p4, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p4, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p4, v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p4, v3

    const-string p1, "%c%c%c"

    invoke-static {p0, p1, p4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v4, v0

    const-string p1, "%c%c%c%c"

    invoke-static {p0, p1, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static y([BII)I
    .locals 2

    invoke-static {p0, p1}, Lp4/h;->z([BI)I

    move-result v0

    if-eqz p2, :cond_3

    const/4 v1, 0x3

    if-ne p2, v1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    array-length p2, p0

    add-int/lit8 p2, p2, -0x1

    if-ge v0, p2, :cond_2

    sub-int p2, v0, p1

    rem-int/lit8 p2, p2, 0x2

    if-nez p2, :cond_1

    add-int/lit8 p2, v0, 0x1

    aget-byte p2, p0, p2

    if-nez p2, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, Lp4/h;->z([BI)I

    move-result v0

    goto :goto_0

    :cond_2
    array-length p0, p0

    return p0

    :cond_3
    :goto_1
    return v0
.end method

.method public static z([BI)I
    .locals 1

    :goto_0
    array-length v0, p0

    if-ge p1, v0, :cond_1

    aget-byte v0, p0, p1

    if-nez v0, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    array-length p0, p0

    return p0
.end method


# virtual methods
.method public b(Lk4/d;Ljava/nio/ByteBuffer;)Lk4/a;
    .locals 0

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lp4/h;->e([BI)Lk4/a;

    move-result-object p1

    return-object p1
.end method

.method public e([BI)Lk4/a;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lp5/a0;

    invoke-direct {v1, p1, p2}, Lp5/a0;-><init>([BI)V

    invoke-static {v1}, Lp4/h;->m(Lp5/a0;)Lp4/h$b;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    invoke-virtual {v1}, Lp5/a0;->f()I

    move-result v2

    invoke-static {p1}, Lp4/h$b;->a(Lp4/h$b;)I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    const/4 v3, 0x6

    goto :goto_0

    :cond_1
    const/16 v3, 0xa

    :goto_0
    invoke-static {p1}, Lp4/h$b;->b(Lp4/h$b;)I

    move-result v4

    invoke-static {p1}, Lp4/h$b;->c(Lp4/h$b;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {p1}, Lp4/h$b;->b(Lp4/h$b;)I

    move-result v4

    invoke-static {v1, v4}, Lp4/h;->B(Lp5/a0;I)I

    move-result v4

    :cond_2
    add-int/2addr v2, v4

    invoke-virtual {v1, v2}, Lp5/a0;->S(I)V

    invoke-static {p1}, Lp4/h$b;->a(Lp4/h$b;)I

    move-result v2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lp4/h;->C(Lp5/a0;IIZ)Z

    move-result v2

    const/4 v5, 0x1

    if-nez v2, :cond_4

    invoke-static {p1}, Lp4/h$b;->a(Lp4/h$b;)I

    move-result v2

    const/4 v4, 0x4

    if-ne v2, v4, :cond_3

    invoke-static {v1, v4, v3, v5}, Lp4/h;->C(Lp5/a0;IIZ)Z

    move-result v2

    if-eqz v2, :cond_3

    move v4, v5

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to validate ID3 tag with majorVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lp4/h$b;->a(Lp4/h$b;)I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Id3Decoder"

    invoke-static {v0, p1}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2

    :cond_4
    :goto_1
    invoke-virtual {v1}, Lp5/a0;->a()I

    move-result p2

    if-lt p2, v3, :cond_5

    invoke-static {p1}, Lp4/h$b;->a(Lp4/h$b;)I

    move-result p2

    iget-object v2, p0, Lp4/h;->a:Lp4/h$a;

    invoke-static {p2, v1, v4, v3, v2}, Lp4/h;->k(ILp5/a0;ZILp4/h$a;)Lp4/i;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    new-instance p1, Lk4/a;

    invoke-direct {p1, v0}, Lk4/a;-><init>(Ljava/util/List;)V

    return-object p1
.end method
