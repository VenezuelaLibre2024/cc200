.class public final enum Lv0/v;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv0/v$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lv0/v;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum A:Lv0/v;

.field public static final enum B:Lv0/v;

.field public static final enum C:Lv0/v;

.field public static final enum D:Lv0/v;

.field public static final enum E:Lv0/v;

.field public static final enum F:Lv0/v;

.field public static final enum G:Lv0/v;

.field public static final enum H:Lv0/v;

.field public static final enum I:Lv0/v;

.field public static final enum J:Lv0/v;

.field public static final enum K:Lv0/v;

.field public static final enum L:Lv0/v;

.field public static final enum M:Lv0/v;

.field public static final enum N:Lv0/v;

.field public static final enum O:Lv0/v;

.field public static final enum P:Lv0/v;

.field public static final enum Q:Lv0/v;

.field public static final enum R:Lv0/v;

.field public static final enum S:Lv0/v;

.field public static final enum T:Lv0/v;

.field public static final enum U:Lv0/v;

.field public static final enum V:Lv0/v;

.field public static final enum W:Lv0/v;

.field public static final enum X:Lv0/v;

.field public static final enum Y:Lv0/v;

.field public static final enum Z:Lv0/v;

.field public static final enum a0:Lv0/v;

.field public static final enum b0:Lv0/v;

.field public static final enum c0:Lv0/v;

.field public static final enum d0:Lv0/v;

.field public static final enum e0:Lv0/v;

.field public static final enum f0:Lv0/v;

.field public static final enum g0:Lv0/v;

.field public static final enum h0:Lv0/v;

.field public static final enum i0:Lv0/v;

.field public static final enum j0:Lv0/v;

.field public static final enum k0:Lv0/v;

.field public static final l0:[Lv0/v;

.field public static final enum m:Lv0/v;

.field public static final m0:[Ljava/lang/reflect/Type;

.field public static final enum n:Lv0/v;

.field public static final synthetic n0:[Lv0/v;

.field public static final enum o:Lv0/v;

.field public static final enum p:Lv0/v;

.field public static final enum q:Lv0/v;

.field public static final enum r:Lv0/v;

.field public static final enum s:Lv0/v;

.field public static final enum t:Lv0/v;

.field public static final enum u:Lv0/v;

.field public static final enum v:Lv0/v;

.field public static final enum w:Lv0/v;

.field public static final enum x:Lv0/v;

.field public static final enum y:Lv0/v;

.field public static final enum z:Lv0/v;


# instance fields
.field public final h:Lv0/c0;

.field public final i:I

.field public final j:Lv0/v$b;

.field public final k:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final l:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 65

    new-instance v6, Lv0/v;

    sget-object v7, Lv0/v$b;->i:Lv0/v$b;

    sget-object v8, Lv0/c0;->o:Lv0/c0;

    const-string v1, "DOUBLE"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v4, v7

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v6, Lv0/v;->m:Lv0/v;

    new-instance v9, Lv0/v;

    sget-object v10, Lv0/c0;->n:Lv0/c0;

    const-string v1, "FLOAT"

    const/4 v2, 0x1

    const/4 v3, 0x1

    move-object v0, v9

    move-object v5, v10

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v9, Lv0/v;->n:Lv0/v;

    new-instance v11, Lv0/v;

    sget-object v12, Lv0/c0;->m:Lv0/c0;

    const-string v1, "INT64"

    const/4 v2, 0x2

    const/4 v3, 0x2

    move-object v0, v11

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v11, Lv0/v;->o:Lv0/v;

    new-instance v13, Lv0/v;

    const-string v1, "UINT64"

    const/4 v2, 0x3

    const/4 v3, 0x3

    move-object v0, v13

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v13, Lv0/v;->p:Lv0/v;

    new-instance v14, Lv0/v;

    sget-object v15, Lv0/c0;->l:Lv0/c0;

    const-string v1, "INT32"

    const/4 v2, 0x4

    const/4 v3, 0x4

    move-object v0, v14

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v14, Lv0/v;->q:Lv0/v;

    new-instance v16, Lv0/v;

    const-string v1, "FIXED64"

    const/4 v2, 0x5

    const/4 v3, 0x5

    move-object/from16 v0, v16

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v16, Lv0/v;->r:Lv0/v;

    new-instance v17, Lv0/v;

    const-string v1, "FIXED32"

    const/4 v2, 0x6

    const/4 v3, 0x6

    move-object/from16 v0, v17

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v17, Lv0/v;->s:Lv0/v;

    new-instance v18, Lv0/v;

    sget-object v19, Lv0/c0;->p:Lv0/c0;

    const-string v1, "BOOL"

    const/4 v2, 0x7

    const/4 v3, 0x7

    move-object/from16 v0, v18

    move-object/from16 v5, v19

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v18, Lv0/v;->t:Lv0/v;

    new-instance v20, Lv0/v;

    sget-object v21, Lv0/c0;->q:Lv0/c0;

    const-string v1, "STRING"

    const/16 v2, 0x8

    const/16 v3, 0x8

    move-object/from16 v0, v20

    move-object/from16 v5, v21

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v20, Lv0/v;->u:Lv0/v;

    new-instance v22, Lv0/v;

    sget-object v23, Lv0/c0;->t:Lv0/c0;

    const-string v1, "MESSAGE"

    const/16 v2, 0x9

    const/16 v3, 0x9

    move-object/from16 v0, v22

    move-object/from16 v5, v23

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v22, Lv0/v;->v:Lv0/v;

    new-instance v24, Lv0/v;

    sget-object v25, Lv0/c0;->r:Lv0/c0;

    const-string v1, "BYTES"

    const/16 v2, 0xa

    const/16 v3, 0xa

    move-object/from16 v0, v24

    move-object/from16 v5, v25

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v24, Lv0/v;->w:Lv0/v;

    new-instance v26, Lv0/v;

    const-string v1, "UINT32"

    const/16 v2, 0xb

    const/16 v3, 0xb

    move-object/from16 v0, v26

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v26, Lv0/v;->x:Lv0/v;

    new-instance v27, Lv0/v;

    sget-object v28, Lv0/c0;->s:Lv0/c0;

    const-string v1, "ENUM"

    const/16 v2, 0xc

    const/16 v3, 0xc

    move-object/from16 v0, v27

    move-object/from16 v5, v28

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v27, Lv0/v;->y:Lv0/v;

    new-instance v29, Lv0/v;

    const-string v1, "SFIXED32"

    const/16 v2, 0xd

    const/16 v3, 0xd

    move-object/from16 v0, v29

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v29, Lv0/v;->z:Lv0/v;

    new-instance v30, Lv0/v;

    const-string v1, "SFIXED64"

    const/16 v2, 0xe

    const/16 v3, 0xe

    move-object/from16 v0, v30

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v30, Lv0/v;->A:Lv0/v;

    new-instance v31, Lv0/v;

    const-string v1, "SINT32"

    const/16 v2, 0xf

    const/16 v3, 0xf

    move-object/from16 v0, v31

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v31, Lv0/v;->B:Lv0/v;

    new-instance v32, Lv0/v;

    const-string v1, "SINT64"

    const/16 v2, 0x10

    const/16 v3, 0x10

    move-object/from16 v0, v32

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v32, Lv0/v;->C:Lv0/v;

    new-instance v33, Lv0/v;

    const-string v1, "GROUP"

    const/16 v2, 0x11

    const/16 v3, 0x11

    move-object/from16 v0, v33

    move-object/from16 v5, v23

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v33, Lv0/v;->D:Lv0/v;

    new-instance v7, Lv0/v;

    sget-object v34, Lv0/v$b;->j:Lv0/v$b;

    const-string v1, "DOUBLE_LIST"

    const/16 v2, 0x12

    const/16 v3, 0x12

    move-object v0, v7

    move-object/from16 v4, v34

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v7, Lv0/v;->E:Lv0/v;

    new-instance v35, Lv0/v;

    const-string v1, "FLOAT_LIST"

    const/16 v2, 0x13

    const/16 v3, 0x13

    move-object/from16 v0, v35

    move-object v5, v10

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v35, Lv0/v;->F:Lv0/v;

    new-instance v36, Lv0/v;

    const-string v1, "INT64_LIST"

    const/16 v2, 0x14

    const/16 v3, 0x14

    move-object/from16 v0, v36

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v36, Lv0/v;->G:Lv0/v;

    new-instance v37, Lv0/v;

    const-string v1, "UINT64_LIST"

    const/16 v2, 0x15

    const/16 v3, 0x15

    move-object/from16 v0, v37

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v37, Lv0/v;->H:Lv0/v;

    new-instance v38, Lv0/v;

    const-string v1, "INT32_LIST"

    const/16 v2, 0x16

    const/16 v3, 0x16

    move-object/from16 v0, v38

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v38, Lv0/v;->I:Lv0/v;

    new-instance v39, Lv0/v;

    const-string v1, "FIXED64_LIST"

    const/16 v2, 0x17

    const/16 v3, 0x17

    move-object/from16 v0, v39

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v39, Lv0/v;->J:Lv0/v;

    new-instance v40, Lv0/v;

    const-string v1, "FIXED32_LIST"

    const/16 v2, 0x18

    const/16 v3, 0x18

    move-object/from16 v0, v40

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v40, Lv0/v;->K:Lv0/v;

    new-instance v41, Lv0/v;

    const-string v1, "BOOL_LIST"

    const/16 v2, 0x19

    const/16 v3, 0x19

    move-object/from16 v0, v41

    move-object/from16 v5, v19

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v41, Lv0/v;->L:Lv0/v;

    new-instance v42, Lv0/v;

    const-string v1, "STRING_LIST"

    const/16 v2, 0x1a

    const/16 v3, 0x1a

    move-object/from16 v0, v42

    move-object/from16 v5, v21

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v42, Lv0/v;->M:Lv0/v;

    new-instance v21, Lv0/v;

    const-string v1, "MESSAGE_LIST"

    const/16 v2, 0x1b

    const/16 v3, 0x1b

    move-object/from16 v0, v21

    move-object/from16 v5, v23

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v21, Lv0/v;->N:Lv0/v;

    new-instance v43, Lv0/v;

    const-string v1, "BYTES_LIST"

    const/16 v2, 0x1c

    const/16 v3, 0x1c

    move-object/from16 v0, v43

    move-object/from16 v5, v25

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v43, Lv0/v;->O:Lv0/v;

    new-instance v25, Lv0/v;

    const-string v1, "UINT32_LIST"

    const/16 v2, 0x1d

    const/16 v3, 0x1d

    move-object/from16 v0, v25

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v25, Lv0/v;->P:Lv0/v;

    new-instance v44, Lv0/v;

    const-string v1, "ENUM_LIST"

    const/16 v2, 0x1e

    const/16 v3, 0x1e

    move-object/from16 v0, v44

    move-object/from16 v5, v28

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v44, Lv0/v;->Q:Lv0/v;

    new-instance v45, Lv0/v;

    const-string v1, "SFIXED32_LIST"

    const/16 v2, 0x1f

    const/16 v3, 0x1f

    move-object/from16 v0, v45

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v45, Lv0/v;->R:Lv0/v;

    new-instance v46, Lv0/v;

    const-string v1, "SFIXED64_LIST"

    const/16 v2, 0x20

    const/16 v3, 0x20

    move-object/from16 v0, v46

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v46, Lv0/v;->S:Lv0/v;

    new-instance v47, Lv0/v;

    const-string v1, "SINT32_LIST"

    const/16 v2, 0x21

    const/16 v3, 0x21

    move-object/from16 v0, v47

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v47, Lv0/v;->T:Lv0/v;

    new-instance v48, Lv0/v;

    const-string v1, "SINT64_LIST"

    const/16 v2, 0x22

    const/16 v3, 0x22

    move-object/from16 v0, v48

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v48, Lv0/v;->U:Lv0/v;

    new-instance v49, Lv0/v;

    sget-object v50, Lv0/v$b;->k:Lv0/v$b;

    const-string v1, "DOUBLE_LIST_PACKED"

    const/16 v2, 0x23

    const/16 v3, 0x23

    move-object/from16 v0, v49

    move-object/from16 v4, v50

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v49, Lv0/v;->V:Lv0/v;

    new-instance v8, Lv0/v;

    const-string v1, "FLOAT_LIST_PACKED"

    const/16 v2, 0x24

    const/16 v3, 0x24

    move-object v0, v8

    move-object v5, v10

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v8, Lv0/v;->W:Lv0/v;

    new-instance v10, Lv0/v;

    const-string v1, "INT64_LIST_PACKED"

    const/16 v2, 0x25

    const/16 v3, 0x25

    move-object v0, v10

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v10, Lv0/v;->X:Lv0/v;

    new-instance v51, Lv0/v;

    const-string v1, "UINT64_LIST_PACKED"

    const/16 v2, 0x26

    const/16 v3, 0x26

    move-object/from16 v0, v51

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v51, Lv0/v;->Y:Lv0/v;

    new-instance v52, Lv0/v;

    const-string v1, "INT32_LIST_PACKED"

    const/16 v2, 0x27

    const/16 v3, 0x27

    move-object/from16 v0, v52

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v52, Lv0/v;->Z:Lv0/v;

    new-instance v53, Lv0/v;

    const-string v1, "FIXED64_LIST_PACKED"

    const/16 v2, 0x28

    const/16 v3, 0x28

    move-object/from16 v0, v53

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v53, Lv0/v;->a0:Lv0/v;

    new-instance v54, Lv0/v;

    const-string v1, "FIXED32_LIST_PACKED"

    const/16 v2, 0x29

    const/16 v3, 0x29

    move-object/from16 v0, v54

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v54, Lv0/v;->b0:Lv0/v;

    new-instance v55, Lv0/v;

    const-string v1, "BOOL_LIST_PACKED"

    const/16 v2, 0x2a

    const/16 v3, 0x2a

    move-object/from16 v0, v55

    move-object/from16 v5, v19

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v55, Lv0/v;->c0:Lv0/v;

    new-instance v19, Lv0/v;

    const-string v1, "UINT32_LIST_PACKED"

    const/16 v2, 0x2b

    const/16 v3, 0x2b

    move-object/from16 v0, v19

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v19, Lv0/v;->d0:Lv0/v;

    new-instance v56, Lv0/v;

    const-string v1, "ENUM_LIST_PACKED"

    const/16 v2, 0x2c

    const/16 v3, 0x2c

    move-object/from16 v0, v56

    move-object/from16 v5, v28

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v56, Lv0/v;->e0:Lv0/v;

    new-instance v28, Lv0/v;

    const-string v1, "SFIXED32_LIST_PACKED"

    const/16 v2, 0x2d

    const/16 v3, 0x2d

    move-object/from16 v0, v28

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v28, Lv0/v;->f0:Lv0/v;

    new-instance v57, Lv0/v;

    const-string v1, "SFIXED64_LIST_PACKED"

    const/16 v2, 0x2e

    const/16 v3, 0x2e

    move-object/from16 v0, v57

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v57, Lv0/v;->g0:Lv0/v;

    new-instance v58, Lv0/v;

    const-string v1, "SINT32_LIST_PACKED"

    const/16 v2, 0x2f

    const/16 v3, 0x2f

    move-object/from16 v0, v58

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v58, Lv0/v;->h0:Lv0/v;

    new-instance v15, Lv0/v;

    const-string v1, "SINT64_LIST_PACKED"

    const/16 v2, 0x30

    const/16 v3, 0x30

    move-object v0, v15

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v15, Lv0/v;->i0:Lv0/v;

    new-instance v12, Lv0/v;

    const-string v1, "GROUP_LIST"

    const/16 v2, 0x31

    const/16 v3, 0x31

    move-object v0, v12

    move-object/from16 v4, v34

    move-object/from16 v5, v23

    invoke-direct/range {v0 .. v5}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v12, Lv0/v;->j0:Lv0/v;

    new-instance v0, Lv0/v;

    sget-object v63, Lv0/v$b;->l:Lv0/v$b;

    sget-object v64, Lv0/c0;->k:Lv0/c0;

    const-string v60, "MAP"

    const/16 v61, 0x32

    const/16 v62, 0x32

    move-object/from16 v59, v0

    invoke-direct/range {v59 .. v64}, Lv0/v;-><init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V

    sput-object v0, Lv0/v;->k0:Lv0/v;

    const/16 v1, 0x33

    new-array v1, v1, [Lv0/v;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    const/4 v3, 0x1

    aput-object v9, v1, v3

    const/4 v3, 0x2

    aput-object v11, v1, v3

    const/4 v3, 0x3

    aput-object v13, v1, v3

    const/4 v3, 0x4

    aput-object v14, v1, v3

    const/4 v3, 0x5

    aput-object v16, v1, v3

    const/4 v3, 0x6

    aput-object v17, v1, v3

    const/4 v3, 0x7

    aput-object v18, v1, v3

    const/16 v3, 0x8

    aput-object v20, v1, v3

    const/16 v3, 0x9

    aput-object v22, v1, v3

    const/16 v3, 0xa

    aput-object v24, v1, v3

    const/16 v3, 0xb

    aput-object v26, v1, v3

    const/16 v3, 0xc

    aput-object v27, v1, v3

    const/16 v3, 0xd

    aput-object v29, v1, v3

    const/16 v3, 0xe

    aput-object v30, v1, v3

    const/16 v3, 0xf

    aput-object v31, v1, v3

    const/16 v3, 0x10

    aput-object v32, v1, v3

    const/16 v3, 0x11

    aput-object v33, v1, v3

    const/16 v3, 0x12

    aput-object v7, v1, v3

    const/16 v3, 0x13

    aput-object v35, v1, v3

    const/16 v3, 0x14

    aput-object v36, v1, v3

    const/16 v3, 0x15

    aput-object v37, v1, v3

    const/16 v3, 0x16

    aput-object v38, v1, v3

    const/16 v3, 0x17

    aput-object v39, v1, v3

    const/16 v3, 0x18

    aput-object v40, v1, v3

    const/16 v3, 0x19

    aput-object v41, v1, v3

    const/16 v3, 0x1a

    aput-object v42, v1, v3

    const/16 v3, 0x1b

    aput-object v21, v1, v3

    const/16 v3, 0x1c

    aput-object v43, v1, v3

    const/16 v3, 0x1d

    aput-object v25, v1, v3

    const/16 v3, 0x1e

    aput-object v44, v1, v3

    const/16 v3, 0x1f

    aput-object v45, v1, v3

    const/16 v3, 0x20

    aput-object v46, v1, v3

    const/16 v3, 0x21

    aput-object v47, v1, v3

    const/16 v3, 0x22

    aput-object v48, v1, v3

    const/16 v3, 0x23

    aput-object v49, v1, v3

    const/16 v3, 0x24

    aput-object v8, v1, v3

    const/16 v3, 0x25

    aput-object v10, v1, v3

    const/16 v3, 0x26

    aput-object v51, v1, v3

    const/16 v3, 0x27

    aput-object v52, v1, v3

    const/16 v3, 0x28

    aput-object v53, v1, v3

    const/16 v3, 0x29

    aput-object v54, v1, v3

    const/16 v3, 0x2a

    aput-object v55, v1, v3

    const/16 v3, 0x2b

    aput-object v19, v1, v3

    const/16 v3, 0x2c

    aput-object v56, v1, v3

    const/16 v3, 0x2d

    aput-object v28, v1, v3

    const/16 v3, 0x2e

    aput-object v57, v1, v3

    const/16 v3, 0x2f

    aput-object v58, v1, v3

    const/16 v3, 0x30

    aput-object v15, v1, v3

    const/16 v3, 0x31

    aput-object v12, v1, v3

    const/16 v3, 0x32

    aput-object v0, v1, v3

    sput-object v1, Lv0/v;->n0:[Lv0/v;

    new-array v0, v2, [Ljava/lang/reflect/Type;

    sput-object v0, Lv0/v;->m0:[Ljava/lang/reflect/Type;

    invoke-static {}, Lv0/v;->values()[Lv0/v;

    move-result-object v0

    array-length v1, v0

    new-array v1, v1, [Lv0/v;

    sput-object v1, Lv0/v;->l0:[Lv0/v;

    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    sget-object v4, Lv0/v;->l0:[Lv0/v;

    iget v5, v3, Lv0/v;->i:I

    aput-object v3, v4, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILv0/v$b;Lv0/c0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lv0/v$b;",
            "Lv0/c0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lv0/v;->i:I

    iput-object p4, p0, Lv0/v;->j:Lv0/v$b;

    iput-object p5, p0, Lv0/v;->h:Lv0/c0;

    sget-object p1, Lv0/v$a;->a:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x2

    const/4 p3, 0x1

    if-eq p1, p3, :cond_0

    if-eq p1, p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, Lv0/c0;->b()Ljava/lang/Class;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lv0/v;->k:Ljava/lang/Class;

    const/4 p1, 0x0

    sget-object v0, Lv0/v$b;->i:Lv0/v$b;

    if-ne p4, v0, :cond_1

    sget-object p4, Lv0/v$a;->b:[I

    invoke-virtual {p5}, Ljava/lang/Enum;->ordinal()I

    move-result p5

    aget p4, p4, p5

    if-eq p4, p3, :cond_1

    if-eq p4, p2, :cond_1

    const/4 p2, 0x3

    if-eq p4, p2, :cond_1

    goto :goto_1

    :cond_1
    move p3, p1

    :goto_1
    iput-boolean p3, p0, Lv0/v;->l:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lv0/v;
    .locals 1

    const-class v0, Lv0/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lv0/v;

    return-object p0
.end method

.method public static values()[Lv0/v;
    .locals 1

    sget-object v0, Lv0/v;->n0:[Lv0/v;

    invoke-virtual {v0}, [Lv0/v;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv0/v;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lv0/v;->i:I

    return v0
.end method
