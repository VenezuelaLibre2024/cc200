.class public final enum Loa/d;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Loa/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum A:Loa/d;

.field public static final enum B:Loa/d;

.field public static final enum C:Loa/d;

.field public static final enum D:Loa/d;

.field public static final enum E:Loa/d;

.field public static final F:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Loa/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final G:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Loa/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic H:[Loa/d;

.field public static final enum j:Loa/d;

.field public static final enum k:Loa/d;

.field public static final enum l:Loa/d;

.field public static final enum m:Loa/d;

.field public static final enum n:Loa/d;

.field public static final enum o:Loa/d;

.field public static final enum p:Loa/d;

.field public static final enum q:Loa/d;

.field public static final enum r:Loa/d;

.field public static final enum s:Loa/d;

.field public static final enum t:Loa/d;

.field public static final enum u:Loa/d;

.field public static final enum v:Loa/d;

.field public static final enum w:Loa/d;

.field public static final enum x:Loa/d;

.field public static final enum y:Loa/d;

.field public static final enum z:Loa/d;


# instance fields
.field public final h:[I

.field public final i:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 26

    new-instance v0, Loa/d;

    const/4 v1, 0x2

    new-array v2, v1, [I

    fill-array-data v2, :array_0

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/String;

    const-string v5, "Cp437"

    invoke-direct {v0, v5, v3, v2, v4}, Loa/d;-><init>(Ljava/lang/String;I[I[Ljava/lang/String;)V

    sput-object v0, Loa/d;->j:Loa/d;

    new-instance v2, Loa/d;

    new-array v4, v1, [I

    fill-array-data v4, :array_1

    const-string v5, "ISO-8859-1"

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    const-string v6, "ISO8859_1"

    const/4 v7, 0x1

    invoke-direct {v2, v6, v7, v4, v5}, Loa/d;-><init>(Ljava/lang/String;I[I[Ljava/lang/String;)V

    sput-object v2, Loa/d;->k:Loa/d;

    new-instance v4, Loa/d;

    const-string v5, "ISO-8859-2"

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    const-string v6, "ISO8859_2"

    const/4 v8, 0x4

    invoke-direct {v4, v6, v1, v8, v5}, Loa/d;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v4, Loa/d;->l:Loa/d;

    new-instance v5, Loa/d;

    const-string v6, "ISO-8859-3"

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v6

    const-string v9, "ISO8859_3"

    const/4 v10, 0x3

    const/4 v11, 0x5

    invoke-direct {v5, v9, v10, v11, v6}, Loa/d;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v5, Loa/d;->m:Loa/d;

    new-instance v6, Loa/d;

    const-string v9, "ISO-8859-4"

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v9

    const-string v12, "ISO8859_4"

    const/4 v13, 0x6

    invoke-direct {v6, v12, v8, v13, v9}, Loa/d;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v6, Loa/d;->n:Loa/d;

    new-instance v9, Loa/d;

    const-string v12, "ISO-8859-5"

    filled-new-array {v12}, [Ljava/lang/String;

    move-result-object v12

    const-string v14, "ISO8859_5"

    const/4 v15, 0x7

    invoke-direct {v9, v14, v11, v15, v12}, Loa/d;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v9, Loa/d;->o:Loa/d;

    new-instance v12, Loa/d;

    const-string v14, "ISO-8859-7"

    filled-new-array {v14}, [Ljava/lang/String;

    move-result-object v14

    const-string v11, "ISO8859_7"

    const/16 v8, 0x9

    invoke-direct {v12, v11, v13, v8, v14}, Loa/d;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v12, Loa/d;->p:Loa/d;

    new-instance v11, Loa/d;

    const-string v14, "ISO-8859-9"

    filled-new-array {v14}, [Ljava/lang/String;

    move-result-object v14

    const-string v13, "ISO8859_9"

    const/16 v10, 0xb

    invoke-direct {v11, v13, v15, v10, v14}, Loa/d;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v11, Loa/d;->q:Loa/d;

    new-instance v13, Loa/d;

    const-string v14, "ISO-8859-13"

    filled-new-array {v14}, [Ljava/lang/String;

    move-result-object v14

    const-string v15, "ISO8859_13"

    const/16 v7, 0x8

    const/16 v3, 0xf

    invoke-direct {v13, v15, v7, v3, v14}, Loa/d;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v13, Loa/d;->r:Loa/d;

    new-instance v14, Loa/d;

    const-string v15, "ISO-8859-15"

    filled-new-array {v15}, [Ljava/lang/String;

    move-result-object v15

    const-string v7, "ISO8859_15"

    const/16 v1, 0x11

    invoke-direct {v14, v7, v8, v1, v15}, Loa/d;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v14, Loa/d;->s:Loa/d;

    new-instance v7, Loa/d;

    const-string v15, "ISO-8859-16"

    filled-new-array {v15}, [Ljava/lang/String;

    move-result-object v15

    const-string v8, "ISO8859_16"

    const/16 v1, 0xa

    const/16 v3, 0x12

    invoke-direct {v7, v8, v1, v3, v15}, Loa/d;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v7, Loa/d;->t:Loa/d;

    new-instance v8, Loa/d;

    const-string v15, "Shift_JIS"

    filled-new-array {v15}, [Ljava/lang/String;

    move-result-object v15

    const-string v1, "SJIS"

    const/16 v3, 0x14

    invoke-direct {v8, v1, v10, v3, v15}, Loa/d;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v8, Loa/d;->u:Loa/d;

    new-instance v1, Loa/d;

    const-string v15, "windows-1250"

    filled-new-array {v15}, [Ljava/lang/String;

    move-result-object v15

    const-string v10, "Cp1250"

    const/16 v3, 0xc

    move-object/from16 v16, v8

    const/16 v8, 0x15

    invoke-direct {v1, v10, v3, v8, v15}, Loa/d;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v1, Loa/d;->v:Loa/d;

    new-instance v10, Loa/d;

    const-string v15, "windows-1251"

    filled-new-array {v15}, [Ljava/lang/String;

    move-result-object v15

    const-string v3, "Cp1251"

    const/16 v8, 0xd

    move-object/from16 v17, v1

    const/16 v1, 0x16

    invoke-direct {v10, v3, v8, v1, v15}, Loa/d;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v10, Loa/d;->w:Loa/d;

    new-instance v3, Loa/d;

    const-string v15, "windows-1252"

    filled-new-array {v15}, [Ljava/lang/String;

    move-result-object v15

    const-string v8, "Cp1252"

    const/16 v1, 0xe

    move-object/from16 v18, v10

    const/16 v10, 0x17

    invoke-direct {v3, v8, v1, v10, v15}, Loa/d;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v3, Loa/d;->x:Loa/d;

    new-instance v8, Loa/d;

    const-string v10, "windows-1256"

    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v10

    const-string v15, "Cp1256"

    const/16 v1, 0x18

    move-object/from16 v19, v3

    const/16 v3, 0xf

    invoke-direct {v8, v15, v3, v1, v10}, Loa/d;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v8, Loa/d;->y:Loa/d;

    new-instance v1, Loa/d;

    const-string v3, "UTF-16BE"

    const-string v10, "UnicodeBig"

    filled-new-array {v3, v10}, [Ljava/lang/String;

    move-result-object v3

    const-string v10, "UnicodeBigUnmarked"

    const/16 v15, 0x10

    move-object/from16 v20, v8

    const/16 v8, 0x19

    invoke-direct {v1, v10, v15, v8, v3}, Loa/d;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v1, Loa/d;->z:Loa/d;

    new-instance v3, Loa/d;

    const-string v8, "UTF-8"

    filled-new-array {v8}, [Ljava/lang/String;

    move-result-object v8

    const-string v10, "UTF8"

    const/16 v15, 0x1a

    move-object/from16 v21, v1

    const/16 v1, 0x11

    invoke-direct {v3, v10, v1, v15, v8}, Loa/d;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v3, Loa/d;->A:Loa/d;

    new-instance v1, Loa/d;

    const/4 v8, 0x2

    new-array v10, v8, [I

    fill-array-data v10, :array_2

    const-string v8, "US-ASCII"

    filled-new-array {v8}, [Ljava/lang/String;

    move-result-object v8

    const-string v15, "ASCII"

    move-object/from16 v22, v3

    const/16 v3, 0x12

    invoke-direct {v1, v15, v3, v10, v8}, Loa/d;-><init>(Ljava/lang/String;I[I[Ljava/lang/String;)V

    sput-object v1, Loa/d;->B:Loa/d;

    new-instance v3, Loa/d;

    const-string v8, "Big5"

    const/16 v10, 0x13

    const/16 v15, 0x1c

    invoke-direct {v3, v8, v10, v15}, Loa/d;-><init>(Ljava/lang/String;II)V

    sput-object v3, Loa/d;->C:Loa/d;

    new-instance v8, Loa/d;

    const-string v10, "GB2312"

    const-string v15, "EUC_CN"

    move-object/from16 v23, v3

    const-string v3, "GBK"

    filled-new-array {v10, v15, v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v10, "GB18030"

    const/16 v15, 0x1d

    move-object/from16 v24, v1

    const/16 v1, 0x14

    invoke-direct {v8, v10, v1, v15, v3}, Loa/d;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v8, Loa/d;->D:Loa/d;

    new-instance v1, Loa/d;

    const-string v3, "EUC-KR"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v10, "EUC_KR"

    const/16 v15, 0x1e

    move-object/from16 v25, v8

    const/16 v8, 0x15

    invoke-direct {v1, v10, v8, v15, v3}, Loa/d;-><init>(Ljava/lang/String;II[Ljava/lang/String;)V

    sput-object v1, Loa/d;->E:Loa/d;

    const/16 v3, 0x16

    new-array v3, v3, [Loa/d;

    const/4 v8, 0x0

    aput-object v0, v3, v8

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v4, v3, v0

    const/4 v0, 0x3

    aput-object v5, v3, v0

    const/4 v0, 0x4

    aput-object v6, v3, v0

    const/4 v0, 0x5

    aput-object v9, v3, v0

    const/4 v0, 0x6

    aput-object v12, v3, v0

    const/4 v0, 0x7

    aput-object v11, v3, v0

    const/16 v0, 0x8

    aput-object v13, v3, v0

    const/16 v0, 0x9

    aput-object v14, v3, v0

    const/16 v0, 0xa

    aput-object v7, v3, v0

    const/16 v0, 0xb

    aput-object v16, v3, v0

    const/16 v0, 0xc

    aput-object v17, v3, v0

    const/16 v0, 0xd

    aput-object v18, v3, v0

    const/16 v0, 0xe

    aput-object v19, v3, v0

    const/16 v0, 0xf

    aput-object v20, v3, v0

    const/16 v0, 0x10

    aput-object v21, v3, v0

    const/16 v0, 0x11

    aput-object v22, v3, v0

    const/16 v0, 0x12

    aput-object v24, v3, v0

    const/16 v0, 0x13

    aput-object v23, v3, v0

    const/16 v0, 0x14

    aput-object v25, v3, v0

    const/16 v0, 0x15

    aput-object v1, v3, v0

    sput-object v3, Loa/d;->H:[Loa/d;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Loa/d;->F:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Loa/d;->G:Ljava/util/Map;

    invoke-static {}, Loa/d;->values()[Loa/d;

    move-result-object v0

    array-length v1, v0

    move v2, v8

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    iget-object v4, v3, Loa/d;->h:[I

    array-length v5, v4

    move v6, v8

    :goto_1
    if-ge v6, v5, :cond_0

    aget v7, v4, v6

    sget-object v9, Loa/d;->F:Ljava/util/Map;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_0
    sget-object v4, Loa/d;->G:Ljava/util/Map;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v3, Loa/d;->i:[Ljava/lang/String;

    array-length v5, v4

    move v6, v8

    :goto_2
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    sget-object v9, Loa/d;->G:Ljava/util/Map;

    invoke-interface {v9, v7, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x2
    .end array-data

    :array_1
    .array-data 4
        0x1
        0x3
    .end array-data

    :array_2
    .array-data 4
        0x1b
        0xaa
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p3, v0, v1

    new-array p3, v1, [Ljava/lang/String;

    invoke-direct {p0, p1, p2, v0, p3}, Loa/d;-><init>(Ljava/lang/String;I[I[Ljava/lang/String;)V

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;II[Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    const/4 p1, 0x1

    new-array p1, p1, [I

    const/4 p2, 0x0

    aput p3, p1, p2

    iput-object p1, p0, Loa/d;->h:[I

    iput-object p4, p0, Loa/d;->i:[Ljava/lang/String;

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;I[I[Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Loa/d;->h:[I

    iput-object p4, p0, Loa/d;->i:[Ljava/lang/String;

    return-void
.end method

.method public static b(I)Loa/d;
    .locals 1

    if-ltz p0, :cond_0

    const/16 v0, 0x384

    if-ge p0, v0, :cond_0

    sget-object v0, Loa/d;->F:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Loa/d;

    return-object p0

    :cond_0
    invoke-static {}, Lia/f;->a()Lia/f;

    move-result-object p0

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)Loa/d;
    .locals 1

    const-class v0, Loa/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Loa/d;

    return-object p0
.end method

.method public static values()[Loa/d;
    .locals 1

    sget-object v0, Loa/d;->H:[Loa/d;

    invoke-virtual {v0}, [Loa/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Loa/d;

    return-object v0
.end method


# virtual methods
.method public c()Ljava/nio/charset/Charset;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    return-object v0
.end method
