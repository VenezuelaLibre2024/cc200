.class public final Lf4/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf4/b$f;,
        Lf4/b$e;,
        Lf4/b$c;,
        Lf4/b$b;,
        Lf4/b$d;,
        Lf4/b$g;,
        Lf4/b$a;
    }
.end annotation


# static fields
.field public static final a:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "OpusHead"

    invoke-static {v0}, Lp5/n0;->l0(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lf4/b;->a:[B

    return-void
.end method

.method public static A(Lf4/a$a;Lx3/v;JLw3/m;ZZLh7/g;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf4/a$a;",
            "Lx3/v;",
            "J",
            "Lw3/m;",
            "ZZ",
            "Lh7/g<",
            "Lf4/o;",
            "Lf4/o;",
            ">;)",
            "Ljava/util/List<",
            "Lf4/r;",
            ">;"
        }
    .end annotation

    move-object v0, p0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :goto_0
    iget-object v3, v0, Lf4/a$a;->d:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    iget-object v3, v0, Lf4/a$a;->d:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf4/a$a;

    iget v4, v3, Lf4/a;->a:I

    const v5, 0x7472616b

    if-eq v4, v5, :cond_0

    move-object v6, p1

    move-object/from16 v5, p7

    goto :goto_1

    :cond_0
    const v4, 0x6d766864

    invoke-virtual {p0, v4}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object v4

    invoke-static {v4}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lf4/a$b;

    move-object v4, v3

    move-wide v6, p2

    move-object v8, p4

    move/from16 v9, p5

    move/from16 v10, p6

    invoke-static/range {v4 .. v10}, Lf4/b;->z(Lf4/a$a;Lf4/a$b;JLw3/m;ZZ)Lf4/o;

    move-result-object v4

    move-object/from16 v5, p7

    invoke-interface {v5, v4}, Lh7/g;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf4/o;

    if-nez v4, :cond_1

    move-object v6, p1

    goto :goto_1

    :cond_1
    const v6, 0x6d646961

    invoke-virtual {v3, v6}, Lf4/a$a;->f(I)Lf4/a$a;

    move-result-object v3

    invoke-static {v3}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf4/a$a;

    const v6, 0x6d696e66

    invoke-virtual {v3, v6}, Lf4/a$a;->f(I)Lf4/a$a;

    move-result-object v3

    invoke-static {v3}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf4/a$a;

    const v6, 0x7374626c

    invoke-virtual {v3, v6}, Lf4/a$a;->f(I)Lf4/a$a;

    move-result-object v3

    invoke-static {v3}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf4/a$a;

    move-object v6, p1

    invoke-static {v4, v3, p1}, Lf4/b;->v(Lf4/o;Lf4/a$a;Lx3/v;)Lf4/r;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public static B(Lf4/a$b;)Landroid/util/Pair;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf4/a$b;",
            ")",
            "Landroid/util/Pair<",
            "Lk4/a;",
            "Lk4/a;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lf4/a$b;->b:Lp5/a0;

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    invoke-virtual {p0}, Lp5/a0;->a()I

    move-result v3

    if-lt v3, v0, :cond_2

    invoke-virtual {p0}, Lp5/a0;->f()I

    move-result v3

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v4

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v5

    const v6, 0x6d657461

    if-ne v5, v6, :cond_0

    invoke-virtual {p0, v3}, Lp5/a0;->T(I)V

    add-int v1, v3, v4

    invoke-static {p0, v1}, Lf4/b;->C(Lp5/a0;I)Lk4/a;

    move-result-object v1

    goto :goto_1

    :cond_0
    const v6, 0x736d7461

    if-ne v5, v6, :cond_1

    invoke-virtual {p0, v3}, Lp5/a0;->T(I)V

    add-int v2, v3, v4

    invoke-static {p0, v2}, Lf4/b;->u(Lp5/a0;I)Lk4/a;

    move-result-object v2

    :cond_1
    :goto_1
    add-int/2addr v3, v4

    invoke-virtual {p0, v3}, Lp5/a0;->T(I)V

    goto :goto_0

    :cond_2
    invoke-static {v1, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static C(Lp5/a0;I)Lk4/a;
    .locals 4

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lp5/a0;->U(I)V

    invoke-static {p0}, Lf4/b;->e(Lp5/a0;)V

    :goto_0
    invoke-virtual {p0}, Lp5/a0;->f()I

    move-result v0

    if-ge v0, p1, :cond_1

    invoke-virtual {p0}, Lp5/a0;->f()I

    move-result v0

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v1

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v2

    const v3, 0x696c7374

    if-ne v2, v3, :cond_0

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    add-int/2addr v0, v1

    invoke-static {p0, v0}, Lf4/b;->l(Lp5/a0;I)Lk4/a;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static D(Lp5/a0;IIIIILw3/m;Lf4/b$d;I)V
    .locals 34

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    add-int/lit8 v5, v1, 0x8

    add-int/lit8 v5, v5, 0x8

    invoke-virtual {v0, v5}, Lp5/a0;->T(I)V

    const/16 v5, 0x10

    invoke-virtual {v0, v5}, Lp5/a0;->U(I)V

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->M()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->M()I

    move-result v6

    const/16 v7, 0x32

    invoke-virtual {v0, v7}, Lp5/a0;->U(I)V

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->f()I

    move-result v7

    const v9, 0x656e6376

    move/from16 v10, p1

    if-ne v10, v9, :cond_2

    invoke-static {v0, v1, v2}, Lf4/b;->s(Lp5/a0;II)Landroid/util/Pair;

    move-result-object v9

    if-eqz v9, :cond_1

    iget-object v10, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-nez v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    iget-object v11, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v11, Lf4/p;

    iget-object v11, v11, Lf4/p;->b:Ljava/lang/String;

    invoke-virtual {v3, v11}, Lw3/m;->d(Ljava/lang/String;)Lw3/m;

    move-result-object v3

    :goto_0
    iget-object v11, v4, Lf4/b$d;->a:[Lf4/p;

    iget-object v9, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v9, Lf4/p;

    aput-object v9, v11, p8

    :cond_1
    invoke-virtual {v0, v7}, Lp5/a0;->T(I)V

    :cond_2
    const v9, 0x6d317620

    const-string v11, "video/3gpp"

    if-ne v10, v9, :cond_3

    const-string v9, "video/mpeg"

    goto :goto_1

    :cond_3
    const v9, 0x48323633

    if-ne v10, v9, :cond_4

    move-object v9, v11

    goto :goto_1

    :cond_4
    const/4 v9, 0x0

    :goto_1
    const/high16 v14, 0x3f800000    # 1.0f

    const/4 v12, -0x1

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, -0x1

    const/16 v18, -0x1

    const/16 v19, -0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    :goto_2
    sub-int v8, v7, v1

    if-ge v8, v2, :cond_2e

    invoke-virtual {v0, v7}, Lp5/a0;->T(I)V

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->f()I

    move-result v8

    move-object/from16 p8, v11

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->p()I

    move-result v11

    if-nez v11, :cond_5

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->f()I

    move-result v23

    move-object/from16 v24, v3

    sub-int v3, v23, v1

    if-ne v3, v2, :cond_6

    goto/16 :goto_1c

    :cond_5
    move-object/from16 v24, v3

    :cond_6
    if-lez v11, :cond_7

    const/4 v3, 0x1

    goto :goto_3

    :cond_7
    const/4 v3, 0x0

    :goto_3
    const-string v1, "childAtomSize must be positive"

    invoke-static {v3, v1}, Lx3/n;->a(ZLjava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->p()I

    move-result v1

    const v3, 0x61766343

    if-ne v1, v3, :cond_a

    const/4 v1, 0x0

    if-nez v9, :cond_8

    const/4 v3, 0x1

    goto :goto_4

    :cond_8
    const/4 v3, 0x0

    :goto_4
    invoke-static {v3, v1}, Lx3/n;->a(ZLjava/lang/String;)V

    add-int/lit8 v8, v8, 0x8

    invoke-virtual {v0, v8}, Lp5/a0;->T(I)V

    invoke-static/range {p0 .. p0}, Lq5/a;->b(Lp5/a0;)Lq5/a;

    move-result-object v1

    iget-object v15, v1, Lq5/a;->a:Ljava/util/List;

    iget v3, v1, Lq5/a;->b:I

    iput v3, v4, Lf4/b$d;->c:I

    if-nez v22, :cond_9

    iget v14, v1, Lq5/a;->e:F

    :cond_9
    iget-object v13, v1, Lq5/a;->f:Ljava/lang/String;

    const-string v1, "video/avc"

    :goto_5
    move-object v9, v1

    :goto_6
    move/from16 v33, v5

    move/from16 v28, v6

    :goto_7
    move/from16 v25, v10

    :goto_8
    const/4 v4, 0x0

    goto/16 :goto_1b

    :cond_a
    const v3, 0x68766343

    if-ne v1, v3, :cond_d

    const/4 v1, 0x0

    if-nez v9, :cond_b

    const/4 v3, 0x1

    goto :goto_9

    :cond_b
    const/4 v3, 0x0

    :goto_9
    invoke-static {v3, v1}, Lx3/n;->a(ZLjava/lang/String;)V

    add-int/lit8 v8, v8, 0x8

    invoke-virtual {v0, v8}, Lp5/a0;->T(I)V

    invoke-static/range {p0 .. p0}, Lq5/f;->a(Lp5/a0;)Lq5/f;

    move-result-object v1

    iget-object v15, v1, Lq5/f;->a:Ljava/util/List;

    iget v3, v1, Lq5/f;->b:I

    iput v3, v4, Lf4/b$d;->c:I

    if-nez v22, :cond_c

    iget v14, v1, Lq5/f;->e:F

    :cond_c
    iget-object v13, v1, Lq5/f;->i:Ljava/lang/String;

    iget v12, v1, Lq5/f;->f:I

    iget v3, v1, Lq5/f;->g:I

    iget v1, v1, Lq5/f;->h:I

    const-string v8, "video/hevc"

    move/from16 v19, v1

    move/from16 v18, v3

    move/from16 v33, v5

    move/from16 v28, v6

    move-object v9, v8

    goto :goto_7

    :cond_d
    const v3, 0x64766343

    if-eq v1, v3, :cond_2b

    const v3, 0x64767643

    if-ne v1, v3, :cond_e

    goto/16 :goto_17

    :cond_e
    const v3, 0x76706343

    const/4 v2, 0x2

    if-ne v1, v3, :cond_13

    if-nez v9, :cond_f

    const/4 v1, 0x1

    goto :goto_a

    :cond_f
    const/4 v1, 0x0

    :goto_a
    const/4 v3, 0x0

    invoke-static {v1, v3}, Lx3/n;->a(ZLjava/lang/String;)V

    const v1, 0x76703038

    if-ne v10, v1, :cond_10

    const-string v1, "video/x-vnd.on2.vp8"

    goto :goto_b

    :cond_10
    const-string v1, "video/x-vnd.on2.vp9"

    :goto_b
    add-int/lit8 v8, v8, 0xc

    invoke-virtual {v0, v8}, Lp5/a0;->T(I)V

    invoke-virtual {v0, v2}, Lp5/a0;->U(I)V

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->G()I

    move-result v3

    const/4 v8, 0x1

    and-int/2addr v3, v8

    if-eqz v3, :cond_11

    const/4 v3, 0x1

    goto :goto_c

    :cond_11
    const/4 v3, 0x0

    :goto_c
    invoke-virtual/range {p0 .. p0}, Lp5/a0;->G()I

    move-result v8

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->G()I

    move-result v9

    invoke-static {v8}, Lq5/c;->b(I)I

    move-result v12

    if-eqz v3, :cond_12

    const/16 v18, 0x1

    goto :goto_d

    :cond_12
    move/from16 v18, v2

    :goto_d
    invoke-static {v9}, Lq5/c;->c(I)I

    move-result v19

    goto/16 :goto_5

    :cond_13
    const v3, 0x61763143

    if-ne v1, v3, :cond_15

    const/4 v1, 0x0

    if-nez v9, :cond_14

    const/4 v3, 0x1

    goto :goto_e

    :cond_14
    const/4 v3, 0x0

    :goto_e
    invoke-static {v3, v1}, Lx3/n;->a(ZLjava/lang/String;)V

    const-string v1, "video/av01"

    goto/16 :goto_5

    :cond_15
    const v3, 0x636c6c69

    if-ne v1, v3, :cond_17

    if-nez v20, :cond_16

    invoke-static {}, Lf4/b;->a()Ljava/nio/ByteBuffer;

    move-result-object v1

    goto :goto_f

    :cond_16
    move-object/from16 v1, v20

    :goto_f
    const/16 v2, 0x15

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->C()S

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->C()S

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v20, v1

    goto/16 :goto_6

    :cond_17
    const v3, 0x6d646376

    if-ne v1, v3, :cond_19

    if-nez v20, :cond_18

    invoke-static {}, Lf4/b;->a()Ljava/nio/ByteBuffer;

    move-result-object v1

    goto :goto_10

    :cond_18
    move-object/from16 v1, v20

    :goto_10
    invoke-virtual/range {p0 .. p0}, Lp5/a0;->C()S

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->C()S

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->C()S

    move-result v8

    move/from16 v25, v10

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->C()S

    move-result v10

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->C()S

    move-result v4

    move-object/from16 v26, v15

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->C()S

    move-result v15

    move/from16 v27, v14

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->C()S

    move-result v14

    move/from16 v28, v6

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->C()S

    move-result v6

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->I()J

    move-result-wide v29

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->I()J

    move-result-wide v31

    move/from16 v33, v5

    const/4 v5, 0x1

    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v15}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v10}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v14}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v6}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const-wide/16 v2, 0x2710

    div-long v4, v29, v2

    long-to-int v4, v4

    int-to-short v4, v4

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    div-long v2, v31, v2

    long-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-object/from16 v20, v1

    move-object/from16 v15, v26

    move/from16 v14, v27

    goto/16 :goto_8

    :cond_19
    move/from16 v33, v5

    move/from16 v28, v6

    move/from16 v25, v10

    move/from16 v27, v14

    move-object/from16 v26, v15

    const v3, 0x64323633

    if-ne v1, v3, :cond_1b

    if-nez v9, :cond_1a

    const/4 v3, 0x1

    goto :goto_11

    :cond_1a
    const/4 v3, 0x0

    :goto_11
    const/4 v4, 0x0

    invoke-static {v3, v4}, Lx3/n;->a(ZLjava/lang/String;)V

    move-object/from16 v9, p8

    goto/16 :goto_19

    :cond_1b
    const/4 v4, 0x0

    const v3, 0x65736473

    if-ne v1, v3, :cond_1e

    if-nez v9, :cond_1c

    const/4 v3, 0x1

    goto :goto_12

    :cond_1c
    const/4 v3, 0x0

    :goto_12
    invoke-static {v3, v4}, Lx3/n;->a(ZLjava/lang/String;)V

    invoke-static {v0, v8}, Lf4/b;->i(Lp5/a0;I)Lf4/b$b;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lf4/b$b;->a(Lf4/b$b;)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {v21 .. v21}, Lf4/b$b;->b(Lf4/b$b;)[B

    move-result-object v2

    if-eqz v2, :cond_1d

    invoke-static {v2}, Li7/u;->v(Ljava/lang/Object;)Li7/u;

    move-result-object v15

    goto :goto_13

    :cond_1d
    move-object/from16 v15, v26

    :goto_13
    move-object v9, v1

    goto/16 :goto_1a

    :cond_1e
    const v3, 0x70617370

    if-ne v1, v3, :cond_1f

    invoke-static {v0, v8}, Lf4/b;->q(Lp5/a0;I)F

    move-result v1

    move v14, v1

    move-object/from16 v15, v26

    const/16 v22, 0x1

    goto/16 :goto_1b

    :cond_1f
    const v3, 0x73763364

    if-ne v1, v3, :cond_20

    invoke-static {v0, v8, v11}, Lf4/b;->r(Lp5/a0;II)[B

    move-result-object v16

    goto/16 :goto_19

    :cond_20
    const v3, 0x73743364

    if-ne v1, v3, :cond_25

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->G()I

    move-result v1

    const/4 v3, 0x3

    invoke-virtual {v0, v3}, Lp5/a0;->U(I)V

    if-nez v1, :cond_2d

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->G()I

    move-result v1

    if-eqz v1, :cond_24

    const/4 v8, 0x1

    if-eq v1, v8, :cond_23

    if-eq v1, v2, :cond_22

    if-eq v1, v3, :cond_21

    goto/16 :goto_19

    :cond_21
    move/from16 v17, v3

    goto/16 :goto_19

    :cond_22
    move/from16 v17, v2

    goto/16 :goto_19

    :cond_23
    move/from16 v17, v8

    goto/16 :goto_19

    :cond_24
    const/16 v17, 0x0

    goto/16 :goto_19

    :cond_25
    const/4 v8, 0x1

    const v3, 0x636f6c72

    if-ne v1, v3, :cond_2a

    const/4 v1, -0x1

    if-ne v12, v1, :cond_2a

    move/from16 v3, v18

    move/from16 v5, v19

    if-ne v3, v1, :cond_2c

    if-ne v5, v1, :cond_2c

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->p()I

    move-result v1

    const v6, 0x6e636c78

    if-eq v1, v6, :cond_27

    const v6, 0x6e636c63

    if-ne v1, v6, :cond_26

    goto :goto_14

    :cond_26
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Unsupported color type: "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lf4/a;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AtomParsers"

    invoke-static {v2, v1}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_18

    :cond_27
    :goto_14
    invoke-virtual/range {p0 .. p0}, Lp5/a0;->M()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->M()I

    move-result v3

    invoke-virtual {v0, v2}, Lp5/a0;->U(I)V

    const/16 v5, 0x13

    if-ne v11, v5, :cond_28

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->G()I

    move-result v5

    and-int/lit16 v5, v5, 0x80

    if-eqz v5, :cond_28

    move v5, v8

    goto :goto_15

    :cond_28
    const/4 v5, 0x0

    :goto_15
    invoke-static {v1}, Lq5/c;->b(I)I

    move-result v12

    if-eqz v5, :cond_29

    move/from16 v18, v8

    goto :goto_16

    :cond_29
    move/from16 v18, v2

    :goto_16
    invoke-static {v3}, Lq5/c;->c(I)I

    move-result v19

    goto :goto_19

    :cond_2a
    move/from16 v3, v18

    move/from16 v5, v19

    goto :goto_18

    :cond_2b
    :goto_17
    move/from16 v33, v5

    move/from16 v28, v6

    move/from16 v25, v10

    move/from16 v27, v14

    move-object/from16 v26, v15

    move/from16 v3, v18

    move/from16 v5, v19

    const/4 v4, 0x0

    invoke-static/range {p0 .. p0}, Lq5/d;->a(Lp5/a0;)Lq5/d;

    move-result-object v1

    if-eqz v1, :cond_2c

    iget-object v13, v1, Lq5/d;->c:Ljava/lang/String;

    const-string v9, "video/dolby-vision"

    :cond_2c
    :goto_18
    move/from16 v18, v3

    move/from16 v19, v5

    :cond_2d
    :goto_19
    move-object/from16 v15, v26

    :goto_1a
    move/from16 v14, v27

    :goto_1b
    add-int/2addr v7, v11

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v4, p7

    move-object/from16 v11, p8

    move-object/from16 v3, v24

    move/from16 v10, v25

    move/from16 v6, v28

    move/from16 v5, v33

    goto/16 :goto_2

    :cond_2e
    move-object/from16 v24, v3

    :goto_1c
    move/from16 v33, v5

    move/from16 v28, v6

    move/from16 v27, v14

    move-object/from16 v26, v15

    move/from16 v3, v18

    move/from16 v5, v19

    const/4 v4, 0x0

    if-nez v9, :cond_2f

    return-void

    :cond_2f
    new-instance v0, Ls3/m1$b;

    invoke-direct {v0}, Ls3/m1$b;-><init>()V

    move/from16 v1, p4

    invoke-virtual {v0, v1}, Ls3/m1$b;->T(I)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0, v9}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0, v13}, Ls3/m1$b;->K(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v0

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Ls3/m1$b;->n0(I)Ls3/m1$b;

    move-result-object v0

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Ls3/m1$b;->S(I)Ls3/m1$b;

    move-result-object v0

    move/from16 v14, v27

    invoke-virtual {v0, v14}, Ls3/m1$b;->c0(F)Ls3/m1$b;

    move-result-object v0

    move/from16 v1, p5

    invoke-virtual {v0, v1}, Ls3/m1$b;->f0(I)Ls3/m1$b;

    move-result-object v0

    move-object/from16 v8, v16

    invoke-virtual {v0, v8}, Ls3/m1$b;->d0([B)Ls3/m1$b;

    move-result-object v0

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ls3/m1$b;->j0(I)Ls3/m1$b;

    move-result-object v0

    move-object/from16 v8, v26

    invoke-virtual {v0, v8}, Ls3/m1$b;->V(Ljava/util/List;)Ls3/m1$b;

    move-result-object v0

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ls3/m1$b;->O(Lw3/m;)Ls3/m1$b;

    move-result-object v0

    const/4 v1, -0x1

    if-ne v12, v1, :cond_30

    if-ne v3, v1, :cond_30

    if-ne v5, v1, :cond_30

    if-eqz v20, :cond_32

    :cond_30
    new-instance v1, Lq5/c;

    if-eqz v20, :cond_31

    invoke-virtual/range {v20 .. v20}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v8

    goto :goto_1d

    :cond_31
    move-object v8, v4

    :goto_1d
    invoke-direct {v1, v12, v3, v5, v8}, Lq5/c;-><init>(III[B)V

    invoke-virtual {v0, v1}, Ls3/m1$b;->L(Lq5/c;)Ls3/m1$b;

    :cond_32
    if-eqz v21, :cond_33

    invoke-static/range {v21 .. v21}, Lf4/b$b;->d(Lf4/b$b;)J

    move-result-wide v1

    invoke-static {v1, v2}, Lk7/e;->k(J)I

    move-result v1

    invoke-virtual {v0, v1}, Ls3/m1$b;->I(I)Ls3/m1$b;

    move-result-object v1

    invoke-static/range {v21 .. v21}, Lf4/b$b;->c(Lf4/b$b;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lk7/e;->k(J)I

    move-result v2

    invoke-virtual {v1, v2}, Ls3/m1$b;->b0(I)Ls3/m1$b;

    :cond_33
    invoke-virtual {v0}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v0

    move-object/from16 v1, p7

    iput-object v0, v1, Lf4/b$d;->b:Ls3/m1;

    return-void
.end method

.method public static a()Ljava/nio/ByteBuffer;
    .locals 2

    const/16 v0, 0x19

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public static b([JJJJ)Z
    .locals 7

    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {v2, v3, v0}, Lp5/n0;->q(III)I

    move-result v4

    array-length v5, p0

    sub-int/2addr v5, v2

    invoke-static {v5, v3, v0}, Lp5/n0;->q(III)I

    move-result v0

    aget-wide v5, p0, v3

    cmp-long v2, v5, p3

    if-gtz v2, :cond_0

    aget-wide v4, p0, v4

    cmp-long p3, p3, v4

    if-gez p3, :cond_0

    aget-wide p3, p0, v0

    cmp-long p0, p3, p5

    if-gez p0, :cond_0

    cmp-long p0, p5, p1

    if-gtz p0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    return v1
.end method

.method public static c(Lp5/a0;III)I
    .locals 6

    invoke-virtual {p0}, Lp5/a0;->f()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lt v0, p2, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    const/4 v4, 0x0

    invoke-static {v3, v4}, Lx3/n;->a(ZLjava/lang/String;)V

    :goto_1
    sub-int v3, v0, p2

    if-ge v3, p3, :cond_3

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v3

    if-lez v3, :cond_1

    move v4, v1

    goto :goto_2

    :cond_1
    move v4, v2

    :goto_2
    const-string v5, "childAtomSize must be positive"

    invoke-static {v4, v5}, Lx3/n;->a(ZLjava/lang/String;)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v4

    if-ne v4, p1, :cond_2

    return v0

    :cond_2
    add-int/2addr v0, v3

    goto :goto_1

    :cond_3
    const/4 p0, -0x1

    return p0
.end method

.method public static d(I)I
    .locals 1

    const v0, 0x736f756e

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const v0, 0x76696465

    if-ne p0, v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const v0, 0x74657874

    if-eq p0, v0, :cond_4

    const v0, 0x7362746c

    if-eq p0, v0, :cond_4

    const v0, 0x73756274

    if-eq p0, v0, :cond_4

    const v0, 0x636c6370

    if-ne p0, v0, :cond_2

    goto :goto_0

    :cond_2
    const v0, 0x6d657461

    if-ne p0, v0, :cond_3

    const/4 p0, 0x5

    return p0

    :cond_3
    const/4 p0, -0x1

    return p0

    :cond_4
    :goto_0
    const/4 p0, 0x3

    return p0
.end method

.method public static e(Lp5/a0;)V
    .locals 3

    invoke-virtual {p0}, Lp5/a0;->f()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p0, v1}, Lp5/a0;->U(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v1

    const v2, 0x68646c72    # 4.3148E24f

    if-eq v1, v2, :cond_0

    add-int/lit8 v0, v0, 0x4

    :cond_0
    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    return-void
.end method

.method public static f(Lp5/a0;IIIILjava/lang/String;ZLw3/m;Lf4/b$d;I)V
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    add-int/lit8 v7, v1, 0x8

    const/16 v8, 0x8

    add-int/2addr v7, v8

    invoke-virtual {v0, v7}, Lp5/a0;->T(I)V

    const/4 v7, 0x6

    if-eqz p6, :cond_0

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->M()I

    move-result v8

    invoke-virtual {v0, v7}, Lp5/a0;->U(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v8}, Lp5/a0;->U(I)V

    const/4 v8, 0x0

    :goto_0
    const/16 v10, 0x10

    const/4 v11, 0x4

    const/4 v12, 0x2

    const/4 v13, 0x1

    if-eqz v8, :cond_3

    if-ne v8, v13, :cond_1

    goto :goto_1

    :cond_1
    if-ne v8, v12, :cond_2

    invoke-virtual {v0, v10}, Lp5/a0;->U(I)V

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->o()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->round(D)J

    move-result-wide v7

    long-to-int v7, v7

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->K()I

    move-result v8

    const/16 v10, 0x14

    invoke-virtual {v0, v10}, Lp5/a0;->U(I)V

    const/4 v15, 0x0

    goto :goto_2

    :cond_2
    return-void

    :cond_3
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lp5/a0;->M()I

    move-result v14

    invoke-virtual {v0, v7}, Lp5/a0;->U(I)V

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->H()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->f()I

    move-result v15

    sub-int/2addr v15, v11

    invoke-virtual {v0, v15}, Lp5/a0;->T(I)V

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->p()I

    move-result v15

    if-ne v8, v13, :cond_4

    invoke-virtual {v0, v10}, Lp5/a0;->U(I)V

    :cond_4
    move v8, v14

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lp5/a0;->f()I

    move-result v10

    const v14, 0x656e6361

    move/from16 v12, p1

    if-ne v12, v14, :cond_7

    invoke-static {v0, v1, v2}, Lf4/b;->s(Lp5/a0;II)Landroid/util/Pair;

    move-result-object v14

    if-eqz v14, :cond_6

    iget-object v12, v14, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    if-nez v5, :cond_5

    const/4 v5, 0x0

    goto :goto_3

    :cond_5
    iget-object v13, v14, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v13, Lf4/p;

    iget-object v13, v13, Lf4/p;->b:Ljava/lang/String;

    invoke-virtual {v5, v13}, Lw3/m;->d(Ljava/lang/String;)Lw3/m;

    move-result-object v5

    :goto_3
    iget-object v13, v6, Lf4/b$d;->a:[Lf4/p;

    iget-object v14, v14, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v14, Lf4/p;

    aput-object v14, v13, p9

    :cond_6
    invoke-virtual {v0, v10}, Lp5/a0;->T(I)V

    :cond_7
    const v13, 0x61632d33

    const v14, 0x616c6163

    const-string v19, "audio/raw"

    if-ne v12, v13, :cond_8

    const-string v19, "audio/ac3"

    :goto_4
    const/4 v12, -0x1

    goto/16 :goto_8

    :cond_8
    const v13, 0x65632d33

    if-ne v12, v13, :cond_9

    const-string v19, "audio/eac3"

    goto :goto_4

    :cond_9
    const v13, 0x61632d34

    if-ne v12, v13, :cond_a

    const-string v19, "audio/ac4"

    goto :goto_4

    :cond_a
    const v13, 0x64747363

    if-ne v12, v13, :cond_b

    const-string v19, "audio/vnd.dts"

    goto :goto_4

    :cond_b
    const v13, 0x64747368

    if-eq v12, v13, :cond_1e

    const v13, 0x6474736c

    if-ne v12, v13, :cond_c

    goto/16 :goto_7

    :cond_c
    const v13, 0x64747365

    if-ne v12, v13, :cond_d

    const-string v19, "audio/vnd.dts.hd;profile=lbr"

    goto :goto_4

    :cond_d
    const v13, 0x64747378

    if-ne v12, v13, :cond_e

    const-string v19, "audio/vnd.dts.uhd;profile=p2"

    goto :goto_4

    :cond_e
    const v13, 0x73616d72

    if-ne v12, v13, :cond_f

    const-string v19, "audio/3gpp"

    goto :goto_4

    :cond_f
    const v13, 0x73617762

    if-ne v12, v13, :cond_10

    const-string v19, "audio/amr-wb"

    goto :goto_4

    :cond_10
    const v13, 0x6c70636d

    if-eq v12, v13, :cond_1d

    const v13, 0x736f7774

    if-ne v12, v13, :cond_11

    goto :goto_6

    :cond_11
    const v13, 0x74776f73

    if-ne v12, v13, :cond_12

    const/high16 v12, 0x10000000

    goto :goto_8

    :cond_12
    const v13, 0x2e6d7032

    if-eq v12, v13, :cond_1c

    const v13, 0x2e6d7033

    if-ne v12, v13, :cond_13

    goto :goto_5

    :cond_13
    const v13, 0x6d686131

    if-ne v12, v13, :cond_14

    const-string v19, "audio/mha1"

    goto :goto_4

    :cond_14
    const v13, 0x6d686d31

    if-ne v12, v13, :cond_15

    const-string v19, "audio/mhm1"

    goto :goto_4

    :cond_15
    if-ne v12, v14, :cond_16

    const-string v19, "audio/alac"

    goto :goto_4

    :cond_16
    const v13, 0x616c6177

    if-ne v12, v13, :cond_17

    const-string v19, "audio/g711-alaw"

    goto/16 :goto_4

    :cond_17
    const v13, 0x756c6177

    if-ne v12, v13, :cond_18

    const-string v19, "audio/g711-mlaw"

    goto/16 :goto_4

    :cond_18
    const v13, 0x4f707573

    if-ne v12, v13, :cond_19

    const-string v19, "audio/opus"

    goto/16 :goto_4

    :cond_19
    const v13, 0x664c6143

    if-ne v12, v13, :cond_1a

    const-string v19, "audio/flac"

    goto/16 :goto_4

    :cond_1a
    const v13, 0x6d6c7061

    if-ne v12, v13, :cond_1b

    const-string v19, "audio/true-hd"

    goto/16 :goto_4

    :cond_1b
    const/4 v12, -0x1

    const/16 v19, 0x0

    goto :goto_8

    :cond_1c
    :goto_5
    const-string v19, "audio/mpeg"

    goto/16 :goto_4

    :cond_1d
    :goto_6
    const/4 v12, 0x2

    goto :goto_8

    :cond_1e
    :goto_7
    const-string v19, "audio/vnd.dts.hd"

    goto/16 :goto_4

    :goto_8
    move-object/from16 v13, v19

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    :goto_9
    sub-int v11, v10, v1

    if-ge v11, v2, :cond_30

    invoke-virtual {v0, v10}, Lp5/a0;->T(I)V

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->p()I

    move-result v11

    if-lez v11, :cond_1f

    const/4 v14, 0x1

    goto :goto_a

    :cond_1f
    const/4 v14, 0x0

    :goto_a
    const-string v9, "childAtomSize must be positive"

    invoke-static {v14, v9}, Lx3/n;->a(ZLjava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->p()I

    move-result v9

    const v14, 0x6d686143

    if-ne v9, v14, :cond_20

    add-int/lit8 v9, v11, -0xd

    new-array v14, v9, [B

    add-int/lit8 v1, v10, 0xd

    invoke-virtual {v0, v1}, Lp5/a0;->T(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v14, v1, v9}, Lp5/a0;->l([BII)V

    invoke-static {v14}, Li7/u;->v(Ljava/lang/Object;)Li7/u;

    move-result-object v21

    :goto_b
    const/4 v9, -0x1

    const/4 v14, 0x1

    const/16 v16, 0x4

    const/16 v17, 0x2

    :goto_c
    const/16 v18, 0x0

    goto/16 :goto_12

    :cond_20
    const v1, 0x65736473

    if-eq v9, v1, :cond_2c

    if-eqz p6, :cond_21

    const v14, 0x77617665

    if-ne v9, v14, :cond_21

    goto/16 :goto_10

    :cond_21
    const v1, 0x64616333

    if-ne v9, v1, :cond_22

    add-int/lit8 v1, v10, 0x8

    invoke-virtual {v0, v1}, Lp5/a0;->T(I)V

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4, v5}, Lu3/b;->d(Lp5/a0;Ljava/lang/String;Ljava/lang/String;Lw3/m;)Ls3/m1;

    move-result-object v1

    :goto_d
    iput-object v1, v6, Lf4/b$d;->b:Ls3/m1;

    const v2, 0x616c6163

    const/4 v9, 0x0

    const/4 v14, 0x1

    const/16 v16, 0x4

    const/16 v17, 0x2

    goto/16 :goto_f

    :cond_22
    const v1, 0x64656333

    if-ne v9, v1, :cond_23

    add-int/lit8 v1, v10, 0x8

    invoke-virtual {v0, v1}, Lp5/a0;->T(I)V

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4, v5}, Lu3/b;->h(Lp5/a0;Ljava/lang/String;Ljava/lang/String;Lw3/m;)Ls3/m1;

    move-result-object v1

    goto :goto_d

    :cond_23
    const v1, 0x64616334

    if-ne v9, v1, :cond_24

    add-int/lit8 v1, v10, 0x8

    invoke-virtual {v0, v1}, Lp5/a0;->T(I)V

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4, v5}, Lu3/c;->b(Lp5/a0;Ljava/lang/String;Ljava/lang/String;Lw3/m;)Ls3/m1;

    move-result-object v1

    goto :goto_d

    :cond_24
    const v1, 0x646d6c70

    if-ne v9, v1, :cond_26

    if-lez v15, :cond_25

    move v7, v15

    const/4 v8, 0x2

    goto :goto_b

    :cond_25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid sample rate for Dolby TrueHD MLP stream: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v14, 0x0

    invoke-static {v0, v14}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object v0

    throw v0

    :cond_26
    const/4 v14, 0x0

    const v1, 0x64647473

    if-eq v9, v1, :cond_2b

    const v1, 0x75647473

    if-ne v9, v1, :cond_27

    goto/16 :goto_e

    :cond_27
    const v1, 0x644f7073

    if-ne v9, v1, :cond_28

    add-int/lit8 v1, v11, -0x8

    sget-object v9, Lf4/b;->a:[B

    array-length v14, v9

    add-int/2addr v14, v1

    invoke-static {v9, v14}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v14

    add-int/lit8 v2, v10, 0x8

    invoke-virtual {v0, v2}, Lp5/a0;->T(I)V

    array-length v2, v9

    invoke-virtual {v0, v14, v2, v1}, Lp5/a0;->l([BII)V

    invoke-static {v14}, Lu3/g0;->a([B)Ljava/util/List;

    move-result-object v21

    goto/16 :goto_b

    :cond_28
    const v1, 0x64664c61

    if-ne v9, v1, :cond_29

    add-int/lit8 v1, v11, -0xc

    add-int/lit8 v2, v1, 0x4

    new-array v2, v2, [B

    const/16 v9, 0x66

    const/4 v14, 0x0

    aput-byte v9, v2, v14

    const/16 v9, 0x4c

    const/4 v14, 0x1

    aput-byte v9, v2, v14

    const/16 v9, 0x61

    const/16 v17, 0x2

    aput-byte v9, v2, v17

    const/4 v9, 0x3

    const/16 v18, 0x43

    aput-byte v18, v2, v9

    add-int/lit8 v9, v10, 0xc

    invoke-virtual {v0, v9}, Lp5/a0;->T(I)V

    const/4 v9, 0x4

    invoke-virtual {v0, v2, v9, v1}, Lp5/a0;->l([BII)V

    invoke-static {v2}, Li7/u;->v(Ljava/lang/Object;)Li7/u;

    move-result-object v21

    move/from16 v16, v9

    const/4 v9, -0x1

    goto/16 :goto_c

    :cond_29
    const v2, 0x616c6163

    const/4 v14, 0x1

    const/16 v16, 0x4

    const/16 v17, 0x2

    if-ne v9, v2, :cond_2a

    add-int/lit8 v1, v11, -0xc

    new-array v7, v1, [B

    add-int/lit8 v8, v10, 0xc

    invoke-virtual {v0, v8}, Lp5/a0;->T(I)V

    const/4 v9, 0x0

    invoke-virtual {v0, v7, v9, v1}, Lp5/a0;->l([BII)V

    invoke-static {v7}, Lp5/e;->g([B)Landroid/util/Pair;

    move-result-object v1

    iget-object v8, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v7}, Li7/u;->v(Ljava/lang/Object;)Li7/u;

    move-result-object v21

    move v7, v8

    move/from16 v18, v9

    const/4 v9, -0x1

    move v8, v1

    goto :goto_12

    :cond_2a
    const/4 v9, 0x0

    goto :goto_f

    :cond_2b
    :goto_e
    const v2, 0x616c6163

    const/4 v9, 0x0

    const/4 v14, 0x1

    const/16 v16, 0x4

    const/16 v17, 0x2

    new-instance v1, Ls3/m1$b;

    invoke-direct {v1}, Ls3/m1$b;-><init>()V

    invoke-virtual {v1, v3}, Ls3/m1$b;->T(I)Ls3/m1$b;

    move-result-object v1

    invoke-virtual {v1, v13}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v1

    invoke-virtual {v1, v8}, Ls3/m1$b;->J(I)Ls3/m1$b;

    move-result-object v1

    invoke-virtual {v1, v7}, Ls3/m1$b;->h0(I)Ls3/m1$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Ls3/m1$b;->O(Lw3/m;)Ls3/m1$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Ls3/m1$b;->X(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v1

    invoke-virtual {v1}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v1

    iput-object v1, v6, Lf4/b$d;->b:Ls3/m1;

    :goto_f
    move/from16 v18, v9

    const/4 v9, -0x1

    goto :goto_12

    :cond_2c
    :goto_10
    const v2, 0x616c6163

    const/4 v14, 0x1

    const/16 v16, 0x4

    const/16 v17, 0x2

    const/16 v18, 0x0

    if-ne v9, v1, :cond_2d

    move v1, v10

    goto :goto_11

    :cond_2d
    invoke-static {v0, v1, v10, v11}, Lf4/b;->c(Lp5/a0;III)I

    move-result v1

    :goto_11
    const/4 v9, -0x1

    if-eq v1, v9, :cond_2f

    invoke-static {v0, v1}, Lf4/b;->i(Lp5/a0;I)Lf4/b$b;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Lf4/b$b;->a(Lf4/b$b;)Ljava/lang/String;

    move-result-object v13

    invoke-static/range {v19 .. v19}, Lf4/b$b;->b(Lf4/b$b;)[B

    move-result-object v1

    if-eqz v1, :cond_2f

    const-string v2, "audio/mp4a-latm"

    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2e

    invoke-static {v1}, Lu3/a;->f([B)Lu3/a$b;

    move-result-object v2

    iget v7, v2, Lu3/a$b;->a:I

    iget v8, v2, Lu3/a$b;->b:I

    iget-object v2, v2, Lu3/a$b;->c:Ljava/lang/String;

    move-object/from16 v20, v2

    :cond_2e
    invoke-static {v1}, Li7/u;->v(Ljava/lang/Object;)Li7/u;

    move-result-object v21

    :cond_2f
    :goto_12
    add-int/2addr v10, v11

    move/from16 v1, p2

    move/from16 v2, p3

    const v14, 0x616c6163

    goto/16 :goto_9

    :cond_30
    iget-object v0, v6, Lf4/b$d;->b:Ls3/m1;

    if-nez v0, :cond_32

    if-eqz v13, :cond_32

    new-instance v0, Ls3/m1$b;

    invoke-direct {v0}, Ls3/m1$b;-><init>()V

    invoke-virtual {v0, v3}, Ls3/m1$b;->T(I)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0, v13}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ls3/m1$b;->K(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0, v8}, Ls3/m1$b;->J(I)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0, v7}, Ls3/m1$b;->h0(I)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0, v12}, Ls3/m1$b;->a0(I)Ls3/m1$b;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ls3/m1$b;->V(Ljava/util/List;)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0, v5}, Ls3/m1$b;->O(Lw3/m;)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0, v4}, Ls3/m1$b;->X(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v0

    if-eqz v19, :cond_31

    invoke-static/range {v19 .. v19}, Lf4/b$b;->d(Lf4/b$b;)J

    move-result-wide v1

    invoke-static {v1, v2}, Lk7/e;->k(J)I

    move-result v1

    invoke-virtual {v0, v1}, Ls3/m1$b;->I(I)Ls3/m1$b;

    move-result-object v1

    invoke-static/range {v19 .. v19}, Lf4/b$b;->c(Lf4/b$b;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lk7/e;->k(J)I

    move-result v2

    invoke-virtual {v1, v2}, Ls3/m1$b;->b0(I)Ls3/m1$b;

    :cond_31
    invoke-virtual {v0}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v0

    iput-object v0, v6, Lf4/b$d;->b:Ls3/m1;

    :cond_32
    return-void
.end method

.method public static g(Lp5/a0;II)Landroid/util/Pair;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp5/a0;",
            "II)",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Lf4/p;",
            ">;"
        }
    .end annotation

    add-int/lit8 v0, p1, 0x8

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v5, v1

    move-object v4, v2

    move-object v6, v4

    move v7, v3

    :goto_0
    sub-int v8, v0, p1

    if-ge v8, p2, :cond_3

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v8

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v9

    const v10, 0x66726d61

    if-ne v9, v10, :cond_0

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto :goto_1

    :cond_0
    const v10, 0x7363686d

    if-ne v9, v10, :cond_1

    const/4 v4, 0x4

    invoke-virtual {p0, v4}, Lp5/a0;->U(I)V

    invoke-virtual {p0, v4}, Lp5/a0;->D(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    const v10, 0x73636869

    if-ne v9, v10, :cond_2

    move v5, v0

    move v7, v8

    :cond_2
    :goto_1
    add-int/2addr v0, v8

    goto :goto_0

    :cond_3
    const-string p1, "cenc"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "cbc1"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "cens"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "cbcs"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    return-object v2

    :cond_5
    :goto_2
    const/4 p1, 0x1

    if-eqz v6, :cond_6

    move p2, p1

    goto :goto_3

    :cond_6
    move p2, v3

    :goto_3
    const-string v0, "frma atom is mandatory"

    invoke-static {p2, v0}, Lx3/n;->a(ZLjava/lang/String;)V

    if-eq v5, v1, :cond_7

    move p2, p1

    goto :goto_4

    :cond_7
    move p2, v3

    :goto_4
    const-string v0, "schi atom is mandatory"

    invoke-static {p2, v0}, Lx3/n;->a(ZLjava/lang/String;)V

    invoke-static {p0, v5, v7, v4}, Lf4/b;->t(Lp5/a0;IILjava/lang/String;)Lf4/p;

    move-result-object p0

    if-eqz p0, :cond_8

    move v3, p1

    :cond_8
    const-string p1, "tenc atom is mandatory"

    invoke-static {v3, p1}, Lx3/n;->a(ZLjava/lang/String;)V

    invoke-static {p0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lf4/p;

    invoke-static {v6, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lf4/a$a;)Landroid/util/Pair;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf4/a$a;",
            ")",
            "Landroid/util/Pair<",
            "[J[J>;"
        }
    .end annotation

    const v0, 0x656c7374

    invoke-virtual {p0, v0}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    iget-object p0, p0, Lf4/a$b;->b:Lp5/a0;

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v0

    invoke-static {v0}, Lf4/a;->c(I)I

    move-result v0

    invoke-virtual {p0}, Lp5/a0;->K()I

    move-result v1

    new-array v2, v1, [J

    new-array v3, v1, [J

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_4

    const/4 v5, 0x1

    if-ne v0, v5, :cond_1

    invoke-virtual {p0}, Lp5/a0;->L()J

    move-result-wide v6

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp5/a0;->I()J

    move-result-wide v6

    :goto_1
    aput-wide v6, v2, v4

    if-ne v0, v5, :cond_2

    invoke-virtual {p0}, Lp5/a0;->z()J

    move-result-wide v6

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v6

    int-to-long v6, v6

    :goto_2
    aput-wide v6, v3, v4

    invoke-virtual {p0}, Lp5/a0;->C()S

    move-result v6

    if-ne v6, v5, :cond_3

    const/4 v5, 0x2

    invoke-virtual {p0, v5}, Lp5/a0;->U(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported media rate."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static i(Lp5/a0;I)Lf4/b$b;
    .locals 13

    add-int/lit8 p1, p1, 0x8

    const/4 v0, 0x4

    add-int/2addr p1, v0

    invoke-virtual {p0, p1}, Lp5/a0;->T(I)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lp5/a0;->U(I)V

    invoke-static {p0}, Lf4/b;->j(Lp5/a0;)I

    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Lp5/a0;->U(I)V

    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result v2

    and-int/lit16 v3, v2, 0x80

    if-eqz v3, :cond_0

    invoke-virtual {p0, v1}, Lp5/a0;->U(I)V

    :cond_0
    and-int/lit8 v3, v2, 0x40

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result v3

    invoke-virtual {p0, v3}, Lp5/a0;->U(I)V

    :cond_1
    and-int/lit8 v2, v2, 0x20

    if-eqz v2, :cond_2

    invoke-virtual {p0, v1}, Lp5/a0;->U(I)V

    :cond_2
    invoke-virtual {p0, p1}, Lp5/a0;->U(I)V

    invoke-static {p0}, Lf4/b;->j(Lp5/a0;)I

    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result v1

    invoke-static {v1}, Lp5/v;->h(I)Ljava/lang/String;

    move-result-object v3

    const-string v1, "audio/mpeg"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    const-string v1, "audio/vnd.dts"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    const-string v1, "audio/vnd.dts.hd"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p0, v0}, Lp5/a0;->U(I)V

    invoke-virtual {p0}, Lp5/a0;->I()J

    move-result-wide v0

    invoke-virtual {p0}, Lp5/a0;->I()J

    move-result-wide v4

    invoke-virtual {p0, p1}, Lp5/a0;->U(I)V

    invoke-static {p0}, Lf4/b;->j(Lp5/a0;)I

    move-result p1

    new-array v6, p1, [B

    const/4 v2, 0x0

    invoke-virtual {p0, v6, v2, p1}, Lp5/a0;->l([BII)V

    new-instance p0, Lf4/b$b;

    const-wide/16 v7, 0x0

    cmp-long p1, v4, v7

    const-wide/16 v9, -0x1

    if-lez p1, :cond_4

    move-wide v11, v4

    goto :goto_0

    :cond_4
    move-wide v11, v9

    :goto_0
    cmp-long p1, v0, v7

    if-lez p1, :cond_5

    move-wide v7, v0

    goto :goto_1

    :cond_5
    move-wide v7, v9

    :goto_1
    move-object v2, p0

    move-object v4, v6

    move-wide v5, v11

    invoke-direct/range {v2 .. v8}, Lf4/b$b;-><init>(Ljava/lang/String;[BJJ)V

    return-object p0

    :cond_6
    :goto_2
    new-instance p0, Lf4/b$b;

    const/4 v4, 0x0

    const-wide/16 v5, -0x1

    const-wide/16 v7, -0x1

    move-object v2, p0

    invoke-direct/range {v2 .. v8}, Lf4/b$b;-><init>(Ljava/lang/String;[BJJ)V

    return-object p0
.end method

.method public static j(Lp5/a0;)I
    .locals 3

    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result v0

    and-int/lit8 v1, v0, 0x7f

    :goto_0
    const/16 v2, 0x80

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result v0

    shl-int/lit8 v1, v1, 0x7

    and-int/lit8 v2, v0, 0x7f

    or-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public static k(Lp5/a0;)I
    .locals 1

    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result p0

    return p0
.end method

.method public static l(Lp5/a0;I)Lk4/a;
    .locals 2

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lp5/a0;->U(I)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lp5/a0;->f()I

    move-result v1

    if-ge v1, p1, :cond_1

    invoke-static {p0}, Lf4/h;->c(Lp5/a0;)Lk4/a$b;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    new-instance p0, Lk4/a;

    invoke-direct {p0, v0}, Lk4/a;-><init>(Ljava/util/List;)V

    :goto_1
    return-object p0
.end method

.method public static m(Lp5/a0;)Landroid/util/Pair;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp5/a0;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v1

    invoke-static {v1}, Lf4/a;->c(I)I

    move-result v1

    if-nez v1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    const/16 v2, 0x10

    :goto_0
    invoke-virtual {p0, v2}, Lp5/a0;->U(I)V

    invoke-virtual {p0}, Lp5/a0;->I()J

    move-result-wide v2

    if-nez v1, :cond_1

    const/4 v0, 0x4

    :cond_1
    invoke-virtual {p0, v0}, Lp5/a0;->U(I)V

    invoke-virtual {p0}, Lp5/a0;->M()I

    move-result p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    shr-int/lit8 v1, p0, 0xa

    and-int/lit8 v1, v1, 0x1f

    add-int/lit8 v1, v1, 0x60

    int-to-char v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 v1, p0, 0x5

    and-int/lit8 v1, v1, 0x1f

    add-int/lit8 v1, v1, 0x60

    int-to-char v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 p0, p0, 0x1f

    add-int/lit8 p0, p0, 0x60

    int-to-char p0, p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static n(Lf4/a$a;)Lk4/a;
    .locals 10

    const v0, 0x68646c72    # 4.3148E24f

    invoke-virtual {p0, v0}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object v0

    const v1, 0x6b657973

    invoke-virtual {p0, v1}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object v1

    const v2, 0x696c7374

    invoke-virtual {p0, v2}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object p0

    const/4 v2, 0x0

    if-eqz v0, :cond_6

    if-eqz v1, :cond_6

    if-eqz p0, :cond_6

    iget-object v0, v0, Lf4/a$b;->b:Lp5/a0;

    invoke-static {v0}, Lf4/b;->k(Lp5/a0;)I

    move-result v0

    const v3, 0x6d647461

    if-eq v0, v3, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, v1, Lf4/a$b;->b:Lp5/a0;

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Lp5/a0;->T(I)V

    invoke-virtual {v0}, Lp5/a0;->p()I

    move-result v1

    new-array v3, v1, [Ljava/lang/String;

    const/4 v4, 0x0

    :goto_0
    const/16 v5, 0x8

    if-ge v4, v1, :cond_1

    invoke-virtual {v0}, Lp5/a0;->p()I

    move-result v6

    const/4 v7, 0x4

    invoke-virtual {v0, v7}, Lp5/a0;->U(I)V

    sub-int/2addr v6, v5

    invoke-virtual {v0, v6}, Lp5/a0;->D(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object p0, p0, Lf4/a$b;->b:Lp5/a0;

    invoke-virtual {p0, v5}, Lp5/a0;->T(I)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-virtual {p0}, Lp5/a0;->a()I

    move-result v4

    if-le v4, v5, :cond_4

    invoke-virtual {p0}, Lp5/a0;->f()I

    move-result v4

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v6

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    if-ltz v7, :cond_2

    if-ge v7, v1, :cond_2

    aget-object v7, v3, v7

    add-int v8, v4, v6

    invoke-static {p0, v8, v7}, Lf4/h;->f(Lp5/a0;ILjava/lang/String;)Lq4/a;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Skipped metadata with unknown key index: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "AtomParsers"

    invoke-static {v8, v7}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_2
    add-int/2addr v4, v6

    invoke-virtual {p0, v4}, Lp5/a0;->T(I)V

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_5

    goto :goto_3

    :cond_5
    new-instance v2, Lk4/a;

    invoke-direct {v2, v0}, Lk4/a;-><init>(Ljava/util/List;)V

    :cond_6
    :goto_3
    return-object v2
.end method

.method public static o(Lp5/a0;IIILf4/b$d;)V
    .locals 0

    add-int/lit8 p2, p2, 0x8

    add-int/lit8 p2, p2, 0x8

    invoke-virtual {p0, p2}, Lp5/a0;->T(I)V

    const p2, 0x6d657474

    if-ne p1, p2, :cond_0

    invoke-virtual {p0}, Lp5/a0;->A()Ljava/lang/String;

    invoke-virtual {p0}, Lp5/a0;->A()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance p1, Ls3/m1$b;

    invoke-direct {p1}, Ls3/m1$b;-><init>()V

    invoke-virtual {p1, p3}, Ls3/m1$b;->T(I)Ls3/m1$b;

    move-result-object p1

    invoke-virtual {p1, p0}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object p0

    invoke-virtual {p0}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object p0

    iput-object p0, p4, Lf4/b$d;->b:Ls3/m1;

    :cond_0
    return-void
.end method

.method public static p(Lp5/a0;)J
    .locals 2

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v1

    invoke-static {v1}, Lf4/a;->c(I)I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    invoke-virtual {p0, v0}, Lp5/a0;->U(I)V

    invoke-virtual {p0}, Lp5/a0;->I()J

    move-result-wide v0

    return-wide v0
.end method

.method public static q(Lp5/a0;I)F
    .locals 0

    add-int/lit8 p1, p1, 0x8

    invoke-virtual {p0, p1}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->K()I

    move-result p1

    invoke-virtual {p0}, Lp5/a0;->K()I

    move-result p0

    int-to-float p1, p1

    int-to-float p0, p0

    div-float/2addr p1, p0

    return p1
.end method

.method public static r(Lp5/a0;II)[B
    .locals 4

    add-int/lit8 v0, p1, 0x8

    :goto_0
    sub-int v1, v0, p1

    if-ge v1, p2, :cond_1

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v1

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v2

    const v3, 0x70726f6a

    if-ne v2, v3, :cond_0

    invoke-virtual {p0}, Lp5/a0;->e()[B

    move-result-object p0

    add-int/2addr v1, v0

    invoke-static {p0, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    return-object p0

    :cond_0
    add-int/2addr v0, v1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static s(Lp5/a0;II)Landroid/util/Pair;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp5/a0;",
            "II)",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Lf4/p;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lp5/a0;->f()I

    move-result v0

    :goto_0
    sub-int v1, v0, p1

    if-ge v1, p2, :cond_2

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    const-string v3, "childAtomSize must be positive"

    invoke-static {v2, v3}, Lx3/n;->a(ZLjava/lang/String;)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v2

    const v3, 0x73696e66

    if-ne v2, v3, :cond_1

    invoke-static {p0, v0, v1}, Lf4/b;->g(Lp5/a0;II)Landroid/util/Pair;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_1
    add-int/2addr v0, v1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static t(Lp5/a0;IILjava/lang/String;)Lf4/p;
    .locals 11

    add-int/lit8 v0, p1, 0x8

    :goto_0
    sub-int v1, v0, p1

    const/4 v2, 0x0

    if-ge v1, p2, :cond_4

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v1

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v3

    const v4, 0x74656e63

    if-ne v3, v4, :cond_3

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result p1

    invoke-static {p1}, Lf4/a;->c(I)I

    move-result p1

    const/4 p2, 0x1

    invoke-virtual {p0, p2}, Lp5/a0;->U(I)V

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-virtual {p0, p2}, Lp5/a0;->U(I)V

    move v8, v0

    move v9, v8

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result p1

    and-int/lit16 v1, p1, 0xf0

    shr-int/lit8 v1, v1, 0x4

    and-int/lit8 p1, p1, 0xf

    move v9, p1

    move v8, v1

    :goto_1
    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result p1

    if-ne p1, p2, :cond_1

    move v4, p2

    goto :goto_2

    :cond_1
    move v4, v0

    :goto_2
    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result v6

    const/16 p1, 0x10

    new-array v7, p1, [B

    invoke-virtual {p0, v7, v0, p1}, Lp5/a0;->l([BII)V

    if-eqz v4, :cond_2

    if-nez v6, :cond_2

    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result p1

    new-array v2, p1, [B

    invoke-virtual {p0, v2, v0, p1}, Lp5/a0;->l([BII)V

    :cond_2
    move-object v10, v2

    new-instance p0, Lf4/p;

    move-object v3, p0

    move-object v5, p3

    invoke-direct/range {v3 .. v10}, Lf4/p;-><init>(ZLjava/lang/String;I[BII[B)V

    return-object p0

    :cond_3
    add-int/2addr v0, v1

    goto :goto_0

    :cond_4
    return-object v2
.end method

.method public static u(Lp5/a0;I)Lk4/a;
    .locals 6

    const/16 v0, 0xc

    invoke-virtual {p0, v0}, Lp5/a0;->U(I)V

    :goto_0
    invoke-virtual {p0}, Lp5/a0;->f()I

    move-result v1

    const/4 v2, 0x0

    if-ge v1, p1, :cond_4

    invoke-virtual {p0}, Lp5/a0;->f()I

    move-result v1

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v3

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v4

    const v5, 0x73617574

    if-ne v4, v5, :cond_3

    const/16 p1, 0xe

    if-ge v3, p1, :cond_0

    return-object v2

    :cond_0
    const/4 p1, 0x5

    invoke-virtual {p0, p1}, Lp5/a0;->U(I)V

    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result p1

    if-eq p1, v0, :cond_1

    const/16 v1, 0xd

    if-eq p1, v1, :cond_1

    return-object v2

    :cond_1
    if-ne p1, v0, :cond_2

    const/high16 p1, 0x43700000    # 240.0f

    goto :goto_1

    :cond_2
    const/high16 p1, 0x42f00000    # 120.0f

    :goto_1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lp5/a0;->U(I)V

    invoke-virtual {p0}, Lp5/a0;->G()I

    move-result p0

    new-instance v1, Lk4/a;

    new-array v0, v0, [Lk4/a$b;

    const/4 v2, 0x0

    new-instance v3, Lq4/e;

    invoke-direct {v3, p1, p0}, Lq4/e;-><init>(FI)V

    aput-object v3, v0, v2

    invoke-direct {v1, v0}, Lk4/a;-><init>([Lk4/a$b;)V

    return-object v1

    :cond_3
    add-int/2addr v1, v3

    invoke-virtual {p0, v1}, Lp5/a0;->T(I)V

    goto :goto_0

    :cond_4
    return-object v2
.end method

.method public static v(Lf4/o;Lf4/a$a;Lx3/v;)Lf4/r;
    .locals 38

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const v3, 0x7374737a

    invoke-virtual {v0, v3}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance v5, Lf4/b$e;

    iget-object v6, v1, Lf4/o;->f:Ls3/m1;

    invoke-direct {v5, v3, v6}, Lf4/b$e;-><init>(Lf4/a$b;Ls3/m1;)V

    goto :goto_0

    :cond_0
    const v3, 0x73747a32

    invoke-virtual {v0, v3}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object v3

    if-eqz v3, :cond_31

    new-instance v5, Lf4/b$f;

    invoke-direct {v5, v3}, Lf4/b$f;-><init>(Lf4/a$b;)V

    :goto_0
    invoke-interface {v5}, Lf4/b$c;->b()I

    move-result v3

    const/4 v6, 0x0

    if-nez v3, :cond_1

    new-instance v9, Lf4/r;

    new-array v2, v6, [J

    new-array v3, v6, [I

    const/4 v4, 0x0

    new-array v5, v6, [J

    new-array v6, v6, [I

    const-wide/16 v7, 0x0

    move-object v0, v9

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v8}, Lf4/r;-><init>(Lf4/o;[J[II[J[IJ)V

    return-object v9

    :cond_1
    const v7, 0x7374636f

    invoke-virtual {v0, v7}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object v7

    const/4 v8, 0x1

    if-nez v7, :cond_2

    const v7, 0x636f3634

    invoke-virtual {v0, v7}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object v7

    invoke-static {v7}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lf4/a$b;

    move v9, v8

    goto :goto_1

    :cond_2
    move v9, v6

    :goto_1
    iget-object v7, v7, Lf4/a$b;->b:Lp5/a0;

    const v10, 0x73747363

    invoke-virtual {v0, v10}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object v10

    invoke-static {v10}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lf4/a$b;

    iget-object v10, v10, Lf4/a$b;->b:Lp5/a0;

    const v11, 0x73747473

    invoke-virtual {v0, v11}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object v11

    invoke-static {v11}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lf4/a$b;

    iget-object v11, v11, Lf4/a$b;->b:Lp5/a0;

    const v12, 0x73747373

    invoke-virtual {v0, v12}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object v12

    if-eqz v12, :cond_3

    iget-object v12, v12, Lf4/a$b;->b:Lp5/a0;

    goto :goto_2

    :cond_3
    const/4 v12, 0x0

    :goto_2
    const v13, 0x63747473

    invoke-virtual {v0, v13}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, v0, Lf4/a$b;->b:Lp5/a0;

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    new-instance v13, Lf4/b$a;

    invoke-direct {v13, v10, v7, v9}, Lf4/b$a;-><init>(Lp5/a0;Lp5/a0;Z)V

    const/16 v7, 0xc

    invoke-virtual {v11, v7}, Lp5/a0;->T(I)V

    invoke-virtual {v11}, Lp5/a0;->K()I

    move-result v9

    sub-int/2addr v9, v8

    invoke-virtual {v11}, Lp5/a0;->K()I

    move-result v10

    invoke-virtual {v11}, Lp5/a0;->K()I

    move-result v14

    if-eqz v0, :cond_5

    invoke-virtual {v0, v7}, Lp5/a0;->T(I)V

    invoke-virtual {v0}, Lp5/a0;->K()I

    move-result v15

    goto :goto_4

    :cond_5
    move v15, v6

    :goto_4
    const/4 v4, -0x1

    if-eqz v12, :cond_7

    invoke-virtual {v12, v7}, Lp5/a0;->T(I)V

    invoke-virtual {v12}, Lp5/a0;->K()I

    move-result v7

    if-lez v7, :cond_6

    invoke-virtual {v12}, Lp5/a0;->K()I

    move-result v16

    add-int/lit8 v16, v16, -0x1

    goto :goto_5

    :cond_6
    move/from16 v16, v4

    const/4 v12, 0x0

    goto :goto_5

    :cond_7
    move/from16 v16, v4

    move v7, v6

    :goto_5
    invoke-interface {v5}, Lf4/b$c;->a()I

    move-result v6

    iget-object v8, v1, Lf4/o;->f:Ls3/m1;

    iget-object v8, v8, Ls3/m1;->s:Ljava/lang/String;

    if-eq v6, v4, :cond_9

    const-string v4, "audio/raw"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    const-string v4, "audio/g711-mlaw"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    const-string v4, "audio/g711-alaw"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    :cond_8
    if-nez v9, :cond_9

    if-nez v15, :cond_9

    if-nez v7, :cond_9

    move/from16 p1, v7

    const/4 v4, 0x1

    goto :goto_6

    :cond_9
    move/from16 p1, v7

    const/4 v4, 0x0

    :goto_6
    if-eqz v4, :cond_b

    iget v0, v13, Lf4/b$a;->a:I

    new-array v4, v0, [J

    new-array v0, v0, [I

    :goto_7
    invoke-virtual {v13}, Lf4/b$a;->a()Z

    move-result v5

    if-eqz v5, :cond_a

    iget v5, v13, Lf4/b$a;->b:I

    iget-wide v9, v13, Lf4/b$a;->d:J

    aput-wide v9, v4, v5

    iget v9, v13, Lf4/b$a;->c:I

    aput v9, v0, v5

    goto :goto_7

    :cond_a
    int-to-long v9, v14

    invoke-static {v6, v4, v0, v9, v10}, Lf4/d;->a(I[J[IJ)Lf4/d$b;

    move-result-object v0

    iget-object v4, v0, Lf4/d$b;->a:[J

    iget-object v5, v0, Lf4/d$b;->b:[I

    iget v6, v0, Lf4/d$b;->c:I

    iget-object v9, v0, Lf4/d$b;->d:[J

    iget-object v10, v0, Lf4/d$b;->e:[I

    iget-wide v11, v0, Lf4/d$b;->f:J

    move-object v14, v1

    move v0, v3

    move-object v2, v4

    move-object v3, v5

    move v4, v6

    move-object v13, v10

    move-wide v15, v11

    move-object v12, v9

    goto/16 :goto_13

    :cond_b
    new-array v4, v3, [J

    new-array v6, v3, [I

    new-array v7, v3, [J

    new-array v8, v3, [I

    move-object/from16 v24, v11

    move/from16 v2, v16

    const/4 v1, 0x0

    const/4 v11, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    move/from16 v16, v15

    move v15, v14

    move v14, v10

    move/from16 v37, v9

    move/from16 v9, p1

    :goto_8
    move/from16 p1, v37

    const-string v10, "AtomParsers"

    if-ge v1, v3, :cond_14

    move-wide/from16 v28, v27

    move/from16 v27, v22

    const/16 v22, 0x1

    :goto_9
    if-nez v27, :cond_c

    invoke-virtual {v13}, Lf4/b$a;->a()Z

    move-result v22

    if-eqz v22, :cond_c

    move/from16 v30, v14

    move/from16 v31, v15

    iget-wide v14, v13, Lf4/b$a;->d:J

    move/from16 v32, v3

    iget v3, v13, Lf4/b$a;->c:I

    move/from16 v27, v3

    move-wide/from16 v28, v14

    move/from16 v14, v30

    move/from16 v15, v31

    move/from16 v3, v32

    goto :goto_9

    :cond_c
    move/from16 v32, v3

    move/from16 v30, v14

    move/from16 v31, v15

    if-nez v22, :cond_d

    const-string v2, "Unexpected end of chunk data"

    invoke-static {v10, v2}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v4

    invoke-static {v6, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v6

    invoke-static {v7, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v7

    invoke-static {v8, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v8

    move v3, v1

    move/from16 v2, v21

    move/from16 v1, v27

    goto/16 :goto_d

    :cond_d
    if-eqz v0, :cond_f

    :goto_a
    if-nez v23, :cond_e

    if-lez v16, :cond_e

    invoke-virtual {v0}, Lp5/a0;->K()I

    move-result v23

    invoke-virtual {v0}, Lp5/a0;->p()I

    move-result v21

    add-int/lit8 v16, v16, -0x1

    goto :goto_a

    :cond_e
    add-int/lit8 v23, v23, -0x1

    :cond_f
    move/from16 v3, v21

    aput-wide v28, v4, v1

    invoke-interface {v5}, Lf4/b$c;->c()I

    move-result v10

    aput v10, v6, v1

    aget v10, v6, v1

    if-le v10, v11, :cond_10

    aget v10, v6, v1

    move v11, v10

    :cond_10
    int-to-long v14, v3

    add-long v14, v25, v14

    aput-wide v14, v7, v1

    if-nez v12, :cond_11

    const/4 v10, 0x1

    goto :goto_b

    :cond_11
    const/4 v10, 0x0

    :goto_b
    aput v10, v8, v1

    if-ne v1, v2, :cond_12

    const/4 v10, 0x1

    aput v10, v8, v1

    add-int/lit8 v9, v9, -0x1

    if-lez v9, :cond_12

    invoke-static {v12}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp5/a0;

    invoke-virtual {v2}, Lp5/a0;->K()I

    move-result v2

    sub-int/2addr v2, v10

    :cond_12
    move v15, v2

    move v10, v3

    move/from16 v14, v31

    int-to-long v2, v14

    add-long v25, v25, v2

    add-int/lit8 v2, v30, -0x1

    if-nez v2, :cond_13

    if-lez p1, :cond_13

    invoke-virtual/range {v24 .. v24}, Lp5/a0;->K()I

    move-result v2

    invoke-virtual/range {v24 .. v24}, Lp5/a0;->p()I

    move-result v3

    add-int/lit8 v14, p1, -0x1

    goto :goto_c

    :cond_13
    move v3, v14

    move/from16 v14, p1

    :goto_c
    move/from16 p1, v2

    aget v2, v6, v1

    move/from16 v21, v3

    int-to-long v2, v2

    add-long v2, v28, v2

    add-int/lit8 v22, v27, -0x1

    add-int/lit8 v1, v1, 0x1

    move-wide/from16 v27, v2

    move v2, v15

    move/from16 v15, v21

    move/from16 v3, v32

    move/from16 v21, v10

    move/from16 v37, v14

    move/from16 v14, p1

    goto/16 :goto_8

    :cond_14
    move/from16 v32, v3

    move/from16 v30, v14

    move/from16 v2, v21

    move/from16 v1, v22

    :goto_d
    int-to-long v12, v2

    add-long v12, v25, v12

    if-eqz v0, :cond_16

    :goto_e
    if-lez v16, :cond_16

    invoke-virtual {v0}, Lp5/a0;->K()I

    move-result v2

    if-eqz v2, :cond_15

    const/4 v0, 0x0

    goto :goto_f

    :cond_15
    invoke-virtual {v0}, Lp5/a0;->p()I

    add-int/lit8 v16, v16, -0x1

    goto :goto_e

    :cond_16
    const/4 v0, 0x1

    :goto_f
    if-nez v9, :cond_18

    if-nez v30, :cond_18

    if-nez v1, :cond_18

    if-nez p1, :cond_18

    move/from16 v2, v23

    if-nez v2, :cond_19

    if-nez v0, :cond_17

    goto :goto_10

    :cond_17
    move-object/from16 v14, p0

    goto :goto_12

    :cond_18
    move/from16 v2, v23

    :cond_19
    :goto_10
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Inconsistent stbl box for track "

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v14, p0

    iget v15, v14, Lf4/o;->a:I

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v15, ": remainingSynchronizationSamples "

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ", remainingSamplesAtTimestampDelta "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v9, v30

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ", remainingSamplesInChunk "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", remainingTimestampDeltaChanges "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v9, p1

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", remainingSamplesAtTimestampOffset "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-nez v0, :cond_1a

    const-string v0, ", ctts invalid"

    goto :goto_11

    :cond_1a
    const-string v0, ""

    :goto_11
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    :goto_12
    move v0, v3

    move-object v2, v4

    move-object v3, v6

    move v4, v11

    move-wide v15, v12

    move-object v12, v7

    move-object v13, v8

    :goto_13
    const-wide/32 v7, 0xf4240

    iget-wide v9, v14, Lf4/o;->c:J

    move-wide v5, v15

    invoke-static/range {v5 .. v10}, Lp5/n0;->N0(JJJ)J

    move-result-wide v7

    iget-object v1, v14, Lf4/o;->h:[J

    const-wide/32 v10, 0xf4240

    if-nez v1, :cond_1b

    iget-wide v0, v14, Lf4/o;->c:J

    invoke-static {v12, v10, v11, v0, v1}, Lp5/n0;->P0([JJJ)V

    new-instance v9, Lf4/r;

    move-object v0, v9

    move-object/from16 v1, p0

    move-object v5, v12

    move-object v6, v13

    invoke-direct/range {v0 .. v8}, Lf4/r;-><init>(Lf4/o;[J[II[J[IJ)V

    return-object v9

    :cond_1b
    array-length v1, v1

    const/4 v5, 0x1

    if-ne v1, v5, :cond_1d

    iget v1, v14, Lf4/o;->b:I

    if-ne v1, v5, :cond_1d

    array-length v1, v12

    const/4 v5, 0x2

    if-lt v1, v5, :cond_1d

    iget-object v1, v14, Lf4/o;->i:[J

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [J

    const/4 v5, 0x0

    aget-wide v21, v1, v5

    iget-object v1, v14, Lf4/o;->h:[J

    aget-wide v23, v1, v5

    iget-wide v5, v14, Lf4/o;->c:J

    iget-wide v7, v14, Lf4/o;->d:J

    move-wide/from16 v25, v5

    move-wide/from16 v27, v7

    invoke-static/range {v23 .. v28}, Lp5/n0;->N0(JJJ)J

    move-result-wide v5

    add-long v23, v21, v5

    move-object v5, v12

    move-wide v6, v15

    move-wide/from16 v8, v21

    move/from16 v25, v0

    move-wide v0, v10

    move-wide/from16 v10, v23

    invoke-static/range {v5 .. v11}, Lf4/b;->b([JJJJ)Z

    move-result v5

    if-eqz v5, :cond_1e

    sub-long v6, v15, v23

    const/4 v5, 0x0

    aget-wide v8, v12, v5

    sub-long v26, v21, v8

    iget-object v5, v14, Lf4/o;->f:Ls3/m1;

    iget v5, v5, Ls3/m1;->G:I

    int-to-long v8, v5

    iget-wide v10, v14, Lf4/o;->c:J

    move-wide/from16 v28, v8

    move-wide/from16 v30, v10

    invoke-static/range {v26 .. v31}, Lp5/n0;->N0(JJJ)J

    move-result-wide v10

    iget-object v5, v14, Lf4/o;->f:Ls3/m1;

    iget v5, v5, Ls3/m1;->G:I

    int-to-long v8, v5

    iget-wide v0, v14, Lf4/o;->c:J

    move/from16 p1, v4

    move-wide v4, v10

    move-wide v10, v0

    invoke-static/range {v6 .. v11}, Lp5/n0;->N0(JJJ)J

    move-result-wide v0

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-nez v8, :cond_1c

    cmp-long v8, v0, v6

    if-eqz v8, :cond_1f

    :cond_1c
    const-wide/32 v6, 0x7fffffff

    cmp-long v8, v4, v6

    if-gtz v8, :cond_1f

    cmp-long v6, v0, v6

    if-gtz v6, :cond_1f

    long-to-int v4, v4

    move-object/from16 v5, p2

    iput v4, v5, Lx3/v;->a:I

    long-to-int v0, v0

    iput v0, v5, Lx3/v;->b:I

    iget-wide v0, v14, Lf4/o;->c:J

    const-wide/32 v4, 0xf4240

    invoke-static {v12, v4, v5, v0, v1}, Lp5/n0;->P0([JJJ)V

    iget-object v0, v14, Lf4/o;->h:[J

    const/4 v1, 0x0

    aget-wide v4, v0, v1

    const-wide/32 v6, 0xf4240

    iget-wide v8, v14, Lf4/o;->d:J

    invoke-static/range {v4 .. v9}, Lp5/n0;->N0(JJJ)J

    move-result-wide v7

    new-instance v9, Lf4/r;

    move-object v0, v9

    move-object/from16 v1, p0

    move/from16 v4, p1

    move-object v5, v12

    move-object v6, v13

    invoke-direct/range {v0 .. v8}, Lf4/r;-><init>(Lf4/o;[J[II[J[IJ)V

    return-object v9

    :cond_1d
    move/from16 v25, v0

    :cond_1e
    move/from16 p1, v4

    :cond_1f
    iget-object v0, v14, Lf4/o;->h:[J

    array-length v1, v0

    const/4 v4, 0x1

    if-ne v1, v4, :cond_21

    const/4 v1, 0x0

    aget-wide v4, v0, v1

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-nez v4, :cond_21

    iget-object v0, v14, Lf4/o;->i:[J

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    aget-wide v4, v0, v1

    const/4 v6, 0x0

    :goto_14
    array-length v0, v12

    if-ge v6, v0, :cond_20

    aget-wide v0, v12, v6

    sub-long v17, v0, v4

    const-wide/32 v19, 0xf4240

    iget-wide v0, v14, Lf4/o;->c:J

    move-wide/from16 v21, v0

    invoke-static/range {v17 .. v22}, Lp5/n0;->N0(JJJ)J

    move-result-wide v0

    aput-wide v0, v12, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_14

    :cond_20
    sub-long v17, v15, v4

    const-wide/32 v19, 0xf4240

    iget-wide v0, v14, Lf4/o;->c:J

    move-wide/from16 v21, v0

    invoke-static/range {v17 .. v22}, Lp5/n0;->N0(JJJ)J

    move-result-wide v7

    new-instance v9, Lf4/r;

    move-object v0, v9

    move-object/from16 v1, p0

    move/from16 v4, p1

    move-object v5, v12

    move-object v6, v13

    invoke-direct/range {v0 .. v8}, Lf4/r;-><init>(Lf4/o;[J[II[J[IJ)V

    return-object v9

    :cond_21
    iget v1, v14, Lf4/o;->b:I

    const/4 v4, 0x1

    if-ne v1, v4, :cond_22

    const/4 v10, 0x1

    goto :goto_15

    :cond_22
    const/4 v10, 0x0

    :goto_15
    array-length v1, v0

    new-array v1, v1, [I

    array-length v0, v0

    new-array v0, v0, [I

    iget-object v4, v14, Lf4/o;->i:[J

    invoke-static {v4}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [J

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_16
    iget-object v9, v14, Lf4/o;->h:[J

    array-length v11, v9

    if-ge v5, v11, :cond_26

    move-object v11, v2

    move-object v15, v3

    aget-wide v2, v4, v5

    const-wide/16 v21, -0x1

    cmp-long v16, v2, v21

    if-eqz v16, :cond_25

    aget-wide v26, v9, v5

    move/from16 v16, v8

    iget-wide v8, v14, Lf4/o;->c:J

    move/from16 p2, v6

    move/from16 v21, v7

    iget-wide v6, v14, Lf4/o;->d:J

    move-wide/from16 v28, v8

    move-wide/from16 v30, v6

    invoke-static/range {v26 .. v31}, Lp5/n0;->N0(JJJ)J

    move-result-wide v6

    const/4 v8, 0x1

    invoke-static {v12, v2, v3, v8, v8}, Lp5/n0;->i([JJZZ)I

    move-result v9

    aput v9, v1, v5

    add-long/2addr v2, v6

    const/4 v6, 0x0

    invoke-static {v12, v2, v3, v10, v6}, Lp5/n0;->e([JJZZ)I

    move-result v2

    aput v2, v0, v5

    :goto_17
    aget v2, v1, v5

    aget v3, v0, v5

    if-ge v2, v3, :cond_23

    aget v2, v1, v5

    aget v2, v13, v2

    and-int/2addr v2, v8

    if-nez v2, :cond_23

    aget v2, v1, v5

    add-int/2addr v2, v8

    aput v2, v1, v5

    goto :goto_17

    :cond_23
    aget v2, v0, v5

    aget v3, v1, v5

    sub-int/2addr v2, v3

    add-int v7, v21, v2

    aget v2, v1, v5

    move/from16 v3, v16

    if-eq v3, v2, :cond_24

    move v2, v8

    goto :goto_18

    :cond_24
    move v2, v6

    :goto_18
    or-int v2, p2, v2

    aget v3, v0, v5

    goto :goto_19

    :cond_25
    move/from16 p2, v6

    move/from16 v21, v7

    move v3, v8

    const/4 v6, 0x0

    const/4 v8, 0x1

    move/from16 v2, p2

    :goto_19
    add-int/lit8 v5, v5, 0x1

    move v6, v2

    move v8, v3

    move-object v2, v11

    move-object v3, v15

    goto :goto_16

    :cond_26
    move-object v11, v2

    move-object v15, v3

    move/from16 p2, v6

    move/from16 v3, v25

    const/4 v6, 0x0

    const/4 v8, 0x1

    if-eq v7, v3, :cond_27

    goto :goto_1a

    :cond_27
    move v8, v6

    :goto_1a
    or-int v2, p2, v8

    if-eqz v2, :cond_28

    new-array v3, v7, [J

    goto :goto_1b

    :cond_28
    move-object v3, v11

    :goto_1b
    if-eqz v2, :cond_29

    new-array v4, v7, [I

    goto :goto_1c

    :cond_29
    move-object v4, v15

    :goto_1c
    if-eqz v2, :cond_2a

    move v5, v6

    goto :goto_1d

    :cond_2a
    move/from16 v5, p1

    :goto_1d
    if-eqz v2, :cond_2b

    new-array v8, v7, [I

    goto :goto_1e

    :cond_2b
    move-object v8, v13

    :goto_1e
    new-array v7, v7, [J

    move/from16 p2, v5

    move-object/from16 p1, v15

    const-wide/16 v9, 0x0

    move v15, v6

    :goto_1f
    iget-object v5, v14, Lf4/o;->h:[J

    array-length v5, v5

    if-ge v6, v5, :cond_30

    iget-object v5, v14, Lf4/o;->i:[J

    aget-wide v16, v5, v6

    aget v5, v1, v6

    move-object/from16 v18, v1

    aget v1, v0, v6

    move-object/from16 v27, v0

    if-eqz v2, :cond_2c

    sub-int v0, v1, v5

    invoke-static {v11, v5, v3, v15, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object/from16 v28, v11

    move-object/from16 v11, p1

    invoke-static {v11, v5, v4, v15, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v13, v5, v8, v15, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_20

    :cond_2c
    move-object/from16 v28, v11

    move-object/from16 v11, p1

    :goto_20
    move/from16 v0, p2

    :goto_21
    if-ge v5, v1, :cond_2f

    const-wide/32 v23, 0xf4240

    move/from16 v29, v0

    move/from16 p1, v1

    iget-wide v0, v14, Lf4/o;->d:J

    move-wide/from16 v21, v9

    move-wide/from16 v25, v0

    invoke-static/range {v21 .. v26}, Lp5/n0;->N0(JJJ)J

    move-result-wide v0

    aget-wide v21, v12, v5

    move-object/from16 v23, v12

    move-object/from16 v24, v13

    sub-long v12, v21, v16

    move-object/from16 v30, v8

    move-wide/from16 v21, v9

    const-wide/16 v8, 0x0

    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v31

    const-wide/32 v33, 0xf4240

    iget-wide v12, v14, Lf4/o;->c:J

    move-wide/from16 v35, v12

    invoke-static/range {v31 .. v36}, Lp5/n0;->N0(JJJ)J

    move-result-wide v12

    add-long/2addr v0, v12

    aput-wide v0, v7, v15

    if-eqz v2, :cond_2d

    aget v0, v4, v15

    move/from16 v1, v29

    if-le v0, v1, :cond_2e

    aget v0, v11, v5

    goto :goto_22

    :cond_2d
    move/from16 v1, v29

    :cond_2e
    move v0, v1

    :goto_22
    add-int/lit8 v15, v15, 0x1

    add-int/lit8 v5, v5, 0x1

    move/from16 v1, p1

    move-wide/from16 v9, v21

    move-object/from16 v12, v23

    move-object/from16 v13, v24

    move-object/from16 v8, v30

    goto :goto_21

    :cond_2f
    move v1, v0

    move-object/from16 v30, v8

    move-wide/from16 v21, v9

    move-object/from16 v23, v12

    move-object/from16 v24, v13

    const-wide/16 v8, 0x0

    iget-object v0, v14, Lf4/o;->h:[J

    aget-wide v12, v0, v6

    add-long v12, v21, v12

    add-int/lit8 v6, v6, 0x1

    move/from16 p2, v1

    move-object/from16 p1, v11

    move-wide v9, v12

    move-object/from16 v1, v18

    move-object/from16 v12, v23

    move-object/from16 v13, v24

    move-object/from16 v0, v27

    move-object/from16 v11, v28

    move-object/from16 v8, v30

    goto/16 :goto_1f

    :cond_30
    move-object/from16 v30, v8

    move-wide/from16 v21, v9

    const-wide/32 v23, 0xf4240

    iget-wide v0, v14, Lf4/o;->d:J

    move-wide/from16 v25, v0

    invoke-static/range {v21 .. v26}, Lp5/n0;->N0(JJJ)J

    move-result-wide v8

    new-instance v10, Lf4/r;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object v2, v3

    move-object v3, v4

    move/from16 v4, p2

    move-object v5, v7

    move-object/from16 v6, v30

    move-wide v7, v8

    invoke-direct/range {v0 .. v8}, Lf4/r;-><init>(Lf4/o;[J[II[J[IJ)V

    return-object v10

    :cond_31
    const-string v0, "Track has no sample table size information"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object v0

    throw v0
.end method

.method public static w(Lp5/a0;IILjava/lang/String;Lw3/m;Z)Lf4/b$d;
    .locals 18

    move-object/from16 v10, p0

    move/from16 v11, p1

    const/16 v0, 0xc

    invoke-virtual {v10, v0}, Lp5/a0;->T(I)V

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->p()I

    move-result v12

    new-instance v13, Lf4/b$d;

    invoke-direct {v13, v12}, Lf4/b$d;-><init>(I)V

    const/4 v14, 0x0

    move v15, v14

    :goto_0
    if-ge v15, v12, :cond_9

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->f()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->p()I

    move-result v16

    if-lez v16, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    move v0, v14

    :goto_1
    const-string v1, "childAtomSize must be positive"

    invoke-static {v0, v1}, Lx3/n;->a(ZLjava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lp5/a0;->p()I

    move-result v1

    const v0, 0x61766331

    if-eq v1, v0, :cond_8

    const v0, 0x61766333

    if-eq v1, v0, :cond_8

    const v0, 0x656e6376

    if-eq v1, v0, :cond_8

    const v0, 0x6d317620

    if-eq v1, v0, :cond_8

    const v0, 0x6d703476

    if-eq v1, v0, :cond_8

    const v0, 0x68766331

    if-eq v1, v0, :cond_8

    const v0, 0x68657631

    if-eq v1, v0, :cond_8

    const v0, 0x73323633

    if-eq v1, v0, :cond_8

    const v0, 0x48323633

    if-eq v1, v0, :cond_8

    const v0, 0x76703038

    if-eq v1, v0, :cond_8

    const v0, 0x76703039

    if-eq v1, v0, :cond_8

    const v0, 0x61763031

    if-eq v1, v0, :cond_8

    const v0, 0x64766176

    if-eq v1, v0, :cond_8

    const v0, 0x64766131

    if-eq v1, v0, :cond_8

    const v0, 0x64766865

    if-eq v1, v0, :cond_8

    const v0, 0x64766831

    if-ne v1, v0, :cond_1

    goto/16 :goto_5

    :cond_1
    const v0, 0x6d703461

    if-eq v1, v0, :cond_7

    const v0, 0x656e6361

    if-eq v1, v0, :cond_7

    const v0, 0x61632d33

    if-eq v1, v0, :cond_7

    const v0, 0x65632d33

    if-eq v1, v0, :cond_7

    const v0, 0x61632d34

    if-eq v1, v0, :cond_7

    const v0, 0x6d6c7061

    if-eq v1, v0, :cond_7

    const v0, 0x64747363

    if-eq v1, v0, :cond_7

    const v0, 0x64747365

    if-eq v1, v0, :cond_7

    const v0, 0x64747368

    if-eq v1, v0, :cond_7

    const v0, 0x6474736c

    if-eq v1, v0, :cond_7

    const v0, 0x64747378

    if-eq v1, v0, :cond_7

    const v0, 0x73616d72

    if-eq v1, v0, :cond_7

    const v0, 0x73617762

    if-eq v1, v0, :cond_7

    const v0, 0x6c70636d

    if-eq v1, v0, :cond_7

    const v0, 0x736f7774

    if-eq v1, v0, :cond_7

    const v0, 0x74776f73

    if-eq v1, v0, :cond_7

    const v0, 0x2e6d7032

    if-eq v1, v0, :cond_7

    const v0, 0x2e6d7033

    if-eq v1, v0, :cond_7

    const v0, 0x6d686131

    if-eq v1, v0, :cond_7

    const v0, 0x6d686d31

    if-eq v1, v0, :cond_7

    const v0, 0x616c6163

    if-eq v1, v0, :cond_7

    const v0, 0x616c6177

    if-eq v1, v0, :cond_7

    const v0, 0x756c6177

    if-eq v1, v0, :cond_7

    const v0, 0x4f707573

    if-eq v1, v0, :cond_7

    const v0, 0x664c6143

    if-ne v1, v0, :cond_2

    goto :goto_4

    :cond_2
    const v0, 0x54544d4c

    if-eq v1, v0, :cond_5

    const v0, 0x74783367

    if-eq v1, v0, :cond_5

    const v0, 0x77767474

    if-eq v1, v0, :cond_5

    const v0, 0x73747070

    if-eq v1, v0, :cond_5

    const v0, 0x63363038

    if-ne v1, v0, :cond_3

    goto :goto_2

    :cond_3
    const v0, 0x6d657474

    if-ne v1, v0, :cond_4

    invoke-static {v10, v1, v9, v11, v13}, Lf4/b;->o(Lp5/a0;IIILf4/b$d;)V

    goto :goto_3

    :cond_4
    const v0, 0x63616d6d

    if-ne v1, v0, :cond_6

    new-instance v0, Ls3/m1$b;

    invoke-direct {v0}, Ls3/m1$b;-><init>()V

    invoke-virtual {v0, v11}, Ls3/m1$b;->T(I)Ls3/m1$b;

    move-result-object v0

    const-string v1, "application/x-camera-motion"

    invoke-virtual {v0, v1}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v0

    iput-object v0, v13, Lf4/b$d;->b:Ls3/m1;

    goto :goto_3

    :cond_5
    :goto_2
    move-object/from16 v0, p0

    move v2, v9

    move/from16 v3, v16

    move/from16 v4, p1

    move-object/from16 v5, p3

    move-object v6, v13

    invoke-static/range {v0 .. v6}, Lf4/b;->x(Lp5/a0;IIIILjava/lang/String;Lf4/b$d;)V

    :cond_6
    :goto_3
    move/from16 v17, v9

    goto :goto_6

    :cond_7
    :goto_4
    move-object/from16 v0, p0

    move v2, v9

    move/from16 v3, v16

    move/from16 v4, p1

    move-object/from16 v5, p3

    move/from16 v6, p5

    move-object/from16 v7, p4

    move-object v8, v13

    move/from16 v17, v9

    move v9, v15

    invoke-static/range {v0 .. v9}, Lf4/b;->f(Lp5/a0;IIIILjava/lang/String;ZLw3/m;Lf4/b$d;I)V

    goto :goto_6

    :cond_8
    :goto_5
    move/from16 v17, v9

    move-object/from16 v0, p0

    move/from16 v2, v17

    move/from16 v3, v16

    move/from16 v4, p1

    move/from16 v5, p2

    move-object/from16 v6, p4

    move-object v7, v13

    move v8, v15

    invoke-static/range {v0 .. v8}, Lf4/b;->D(Lp5/a0;IIIIILw3/m;Lf4/b$d;I)V

    :goto_6
    add-int v9, v17, v16

    invoke-virtual {v10, v9}, Lp5/a0;->T(I)V

    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_0

    :cond_9
    return-object v13
.end method

.method public static x(Lp5/a0;IIIILjava/lang/String;Lf4/b$d;)V
    .locals 4

    add-int/lit8 p2, p2, 0x8

    add-int/lit8 p2, p2, 0x8

    invoke-virtual {p0, p2}, Lp5/a0;->T(I)V

    const-string p2, "application/ttml+xml"

    const/4 v0, 0x0

    const-wide v1, 0x7fffffffffffffffL

    const v3, 0x54544d4c

    if-ne p1, v3, :cond_0

    goto :goto_0

    :cond_0
    const v3, 0x74783367

    if-ne p1, v3, :cond_1

    add-int/lit8 p3, p3, -0x8

    add-int/lit8 p3, p3, -0x8

    new-array p1, p3, [B

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p3}, Lp5/a0;->l([BII)V

    invoke-static {p1}, Li7/u;->v(Ljava/lang/Object;)Li7/u;

    move-result-object v0

    const-string p2, "application/x-quicktime-tx3g"

    goto :goto_0

    :cond_1
    const p0, 0x77767474

    if-ne p1, p0, :cond_2

    const-string p2, "application/x-mp4-vtt"

    goto :goto_0

    :cond_2
    const p0, 0x73747070

    if-ne p1, p0, :cond_3

    const-wide/16 v1, 0x0

    goto :goto_0

    :cond_3
    const p0, 0x63363038

    if-ne p1, p0, :cond_4

    const/4 p0, 0x1

    iput p0, p6, Lf4/b$d;->d:I

    const-string p2, "application/x-mp4-cea-608"

    :goto_0
    new-instance p0, Ls3/m1$b;

    invoke-direct {p0}, Ls3/m1$b;-><init>()V

    invoke-virtual {p0, p4}, Ls3/m1$b;->T(I)Ls3/m1$b;

    move-result-object p0

    invoke-virtual {p0, p2}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object p0

    invoke-virtual {p0, p5}, Ls3/m1$b;->X(Ljava/lang/String;)Ls3/m1$b;

    move-result-object p0

    invoke-virtual {p0, v1, v2}, Ls3/m1$b;->k0(J)Ls3/m1$b;

    move-result-object p0

    invoke-virtual {p0, v0}, Ls3/m1$b;->V(Ljava/util/List;)Ls3/m1$b;

    move-result-object p0

    invoke-virtual {p0}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object p0

    iput-object p0, p6, Lf4/b$d;->b:Ls3/m1;

    return-void

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
.end method

.method public static y(Lp5/a0;)Lf4/b$g;
    .locals 11

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lp5/a0;->T(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v1

    invoke-static {v1}, Lf4/a;->c(I)I

    move-result v1

    const/16 v2, 0x10

    if-nez v1, :cond_0

    move v3, v0

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    invoke-virtual {p0, v3}, Lp5/a0;->U(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v3

    const/4 v4, 0x4

    invoke-virtual {p0, v4}, Lp5/a0;->U(I)V

    invoke-virtual {p0}, Lp5/a0;->f()I

    move-result v5

    if-nez v1, :cond_1

    move v0, v4

    :cond_1
    const/4 v6, 0x0

    move v7, v6

    :goto_1
    if-ge v7, v0, :cond_3

    invoke-virtual {p0}, Lp5/a0;->e()[B

    move-result-object v8

    add-int v9, v5, v7

    aget-byte v8, v8, v9

    const/4 v9, -0x1

    if-eq v8, v9, :cond_2

    move v5, v6

    goto :goto_2

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x1

    :goto_2
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v5, :cond_4

    invoke-virtual {p0, v0}, Lp5/a0;->U(I)V

    goto :goto_4

    :cond_4
    if-nez v1, :cond_5

    invoke-virtual {p0}, Lp5/a0;->I()J

    move-result-wide v0

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Lp5/a0;->L()J

    move-result-wide v0

    :goto_3
    const-wide/16 v9, 0x0

    cmp-long v5, v0, v9

    if-nez v5, :cond_6

    goto :goto_4

    :cond_6
    move-wide v7, v0

    :goto_4
    invoke-virtual {p0, v2}, Lp5/a0;->U(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v0

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v1

    invoke-virtual {p0, v4}, Lp5/a0;->U(I)V

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result v2

    invoke-virtual {p0}, Lp5/a0;->p()I

    move-result p0

    const/high16 v4, 0x10000

    const/high16 v5, -0x10000

    if-nez v0, :cond_7

    if-ne v1, v4, :cond_7

    if-ne v2, v5, :cond_7

    if-nez p0, :cond_7

    const/16 v6, 0x5a

    goto :goto_5

    :cond_7
    if-nez v0, :cond_8

    if-ne v1, v5, :cond_8

    if-ne v2, v4, :cond_8

    if-nez p0, :cond_8

    const/16 v6, 0x10e

    goto :goto_5

    :cond_8
    if-ne v0, v5, :cond_9

    if-nez v1, :cond_9

    if-nez v2, :cond_9

    if-ne p0, v5, :cond_9

    const/16 v6, 0xb4

    :cond_9
    :goto_5
    new-instance p0, Lf4/b$g;

    invoke-direct {p0, v3, v7, v8, v6}, Lf4/b$g;-><init>(IJI)V

    return-object p0
.end method

.method public static z(Lf4/a$a;Lf4/a$b;JLw3/m;ZZ)Lf4/o;
    .locals 18

    move-object/from16 v0, p0

    const v1, 0x6d646961

    invoke-virtual {v0, v1}, Lf4/a$a;->f(I)Lf4/a$a;

    move-result-object v1

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf4/a$a;

    const v2, 0x68646c72    # 4.3148E24f

    invoke-virtual {v1, v2}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object v2

    invoke-static {v2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf4/a$b;

    iget-object v2, v2, Lf4/a$b;->b:Lp5/a0;

    invoke-static {v2}, Lf4/b;->k(Lp5/a0;)I

    move-result v2

    invoke-static {v2}, Lf4/b;->d(I)I

    move-result v5

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne v5, v3, :cond_0

    return-object v2

    :cond_0
    const v3, 0x746b6864

    invoke-virtual {v0, v3}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object v3

    invoke-static {v3}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf4/a$b;

    iget-object v3, v3, Lf4/a$b;->b:Lp5/a0;

    invoke-static {v3}, Lf4/b;->y(Lp5/a0;)Lf4/b$g;

    move-result-object v3

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, p2, v6

    if-nez v4, :cond_1

    invoke-static {v3}, Lf4/b$g;->a(Lf4/b$g;)J

    move-result-wide v8

    move-object/from16 v4, p1

    move-wide v10, v8

    goto :goto_0

    :cond_1
    move-object/from16 v4, p1

    move-wide/from16 v10, p2

    :goto_0
    iget-object v4, v4, Lf4/a$b;->b:Lp5/a0;

    invoke-static {v4}, Lf4/b;->p(Lp5/a0;)J

    move-result-wide v8

    cmp-long v4, v10, v6

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    const-wide/32 v12, 0xf4240

    move-wide v14, v8

    invoke-static/range {v10 .. v15}, Lp5/n0;->N0(JJJ)J

    move-result-wide v6

    :goto_1
    move-wide v10, v6

    const v4, 0x6d696e66

    invoke-virtual {v1, v4}, Lf4/a$a;->f(I)Lf4/a$a;

    move-result-object v4

    invoke-static {v4}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf4/a$a;

    const v6, 0x7374626c

    invoke-virtual {v4, v6}, Lf4/a$a;->f(I)Lf4/a$a;

    move-result-object v4

    invoke-static {v4}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf4/a$a;

    const v6, 0x6d646864

    invoke-virtual {v1, v6}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object v1

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf4/a$b;

    iget-object v1, v1, Lf4/a$b;->b:Lp5/a0;

    invoke-static {v1}, Lf4/b;->m(Lp5/a0;)Landroid/util/Pair;

    move-result-object v1

    const v6, 0x73747364

    invoke-virtual {v4, v6}, Lf4/a$a;->g(I)Lf4/a$b;

    move-result-object v4

    if-eqz v4, :cond_5

    iget-object v12, v4, Lf4/a$b;->b:Lp5/a0;

    invoke-static {v3}, Lf4/b$g;->b(Lf4/b$g;)I

    move-result v13

    invoke-static {v3}, Lf4/b$g;->c(Lf4/b$g;)I

    move-result v14

    iget-object v4, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object v15, v4

    check-cast v15, Ljava/lang/String;

    move-object/from16 v16, p4

    move/from16 v17, p6

    invoke-static/range {v12 .. v17}, Lf4/b;->w(Lp5/a0;IILjava/lang/String;Lw3/m;Z)Lf4/b$d;

    move-result-object v4

    if-nez p5, :cond_3

    const v6, 0x65647473

    invoke-virtual {v0, v6}, Lf4/a$a;->f(I)Lf4/a$a;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lf4/b;->h(Lf4/a$a;)Landroid/util/Pair;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v6, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, [J

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, [J

    move-object/from16 v17, v0

    move-object/from16 v16, v6

    goto :goto_2

    :cond_3
    move-object/from16 v16, v2

    move-object/from16 v17, v16

    :goto_2
    iget-object v0, v4, Lf4/b$d;->b:Ls3/m1;

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    new-instance v2, Lf4/o;

    invoke-static {v3}, Lf4/b$g;->b(Lf4/b$g;)I

    move-result v0

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v12, v4, Lf4/b$d;->b:Ls3/m1;

    iget v13, v4, Lf4/b$d;->d:I

    iget-object v14, v4, Lf4/b$d;->a:[Lf4/p;

    iget v15, v4, Lf4/b$d;->c:I

    move-object v3, v2

    move v4, v0

    invoke-direct/range {v3 .. v17}, Lf4/o;-><init>(IIJJJLs3/m1;I[Lf4/p;I[J[J)V

    :goto_3
    return-object v2

    :cond_5
    const-string v0, "Malformed sample table (stbl) missing sample description (stsd)"

    invoke-static {v0, v2}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object v0

    throw v0
.end method
