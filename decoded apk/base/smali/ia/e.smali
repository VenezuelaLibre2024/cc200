.class public final enum Lia/e;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lia/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum i:Lia/e;

.field public static final enum j:Lia/e;

.field public static final enum k:Lia/e;

.field public static final enum l:Lia/e;

.field public static final enum m:Lia/e;

.field public static final enum n:Lia/e;

.field public static final enum o:Lia/e;

.field public static final enum p:Lia/e;

.field public static final enum q:Lia/e;

.field public static final enum r:Lia/e;

.field public static final enum s:Lia/e;

.field public static final enum t:Lia/e;

.field public static final synthetic u:[Lia/e;


# instance fields
.field public final h:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    const-class v0, [I

    new-instance v1, Lia/e;

    const-class v2, Ljava/lang/Object;

    const-string v3, "OTHER"

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4, v2}, Lia/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v1, Lia/e;->i:Lia/e;

    new-instance v2, Lia/e;

    const-class v3, Ljava/lang/Void;

    const-string v5, "PURE_BARCODE"

    const/4 v6, 0x1

    invoke-direct {v2, v5, v6, v3}, Lia/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v2, Lia/e;->j:Lia/e;

    new-instance v3, Lia/e;

    const-class v5, Ljava/util/List;

    const-string v7, "POSSIBLE_FORMATS"

    const/4 v8, 0x2

    invoke-direct {v3, v7, v8, v5}, Lia/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v3, Lia/e;->k:Lia/e;

    new-instance v5, Lia/e;

    const-class v7, Ljava/lang/Void;

    const-string v9, "TRY_HARDER"

    const/4 v10, 0x3

    invoke-direct {v5, v9, v10, v7}, Lia/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v5, Lia/e;->l:Lia/e;

    new-instance v7, Lia/e;

    const-class v9, Ljava/lang/String;

    const-string v11, "CHARACTER_SET"

    const/4 v12, 0x4

    invoke-direct {v7, v11, v12, v9}, Lia/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v7, Lia/e;->m:Lia/e;

    new-instance v9, Lia/e;

    const-string v11, "ALLOWED_LENGTHS"

    const/4 v13, 0x5

    invoke-direct {v9, v11, v13, v0}, Lia/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v9, Lia/e;->n:Lia/e;

    new-instance v11, Lia/e;

    const-class v14, Ljava/lang/Void;

    const-string v15, "ASSUME_CODE_39_CHECK_DIGIT"

    const/4 v13, 0x6

    invoke-direct {v11, v15, v13, v14}, Lia/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v11, Lia/e;->o:Lia/e;

    new-instance v14, Lia/e;

    const-class v15, Ljava/lang/Void;

    const-string v13, "ASSUME_GS1"

    const/4 v12, 0x7

    invoke-direct {v14, v13, v12, v15}, Lia/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v14, Lia/e;->p:Lia/e;

    new-instance v13, Lia/e;

    const-class v15, Ljava/lang/Void;

    const-string v12, "RETURN_CODABAR_START_END"

    const/16 v10, 0x8

    invoke-direct {v13, v12, v10, v15}, Lia/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v13, Lia/e;->q:Lia/e;

    new-instance v12, Lia/e;

    const-class v15, Lia/q;

    const-string v10, "NEED_RESULT_POINT_CALLBACK"

    const/16 v8, 0x9

    invoke-direct {v12, v10, v8, v15}, Lia/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v12, Lia/e;->r:Lia/e;

    new-instance v10, Lia/e;

    const-string v15, "ALLOWED_EAN_EXTENSIONS"

    const/16 v8, 0xa

    invoke-direct {v10, v15, v8, v0}, Lia/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v10, Lia/e;->s:Lia/e;

    new-instance v0, Lia/e;

    const-class v15, Ljava/lang/Void;

    const-string v8, "ALSO_INVERTED"

    const/16 v6, 0xb

    invoke-direct {v0, v8, v6, v15}, Lia/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lia/e;->t:Lia/e;

    const/16 v8, 0xc

    new-array v8, v8, [Lia/e;

    aput-object v1, v8, v4

    const/4 v1, 0x1

    aput-object v2, v8, v1

    const/4 v1, 0x2

    aput-object v3, v8, v1

    const/4 v1, 0x3

    aput-object v5, v8, v1

    const/4 v1, 0x4

    aput-object v7, v8, v1

    const/4 v1, 0x5

    aput-object v9, v8, v1

    const/4 v1, 0x6

    aput-object v11, v8, v1

    const/4 v1, 0x7

    aput-object v14, v8, v1

    const/16 v1, 0x8

    aput-object v13, v8, v1

    const/16 v1, 0x9

    aput-object v12, v8, v1

    const/16 v1, 0xa

    aput-object v10, v8, v1

    aput-object v0, v8, v6

    sput-object v8, Lia/e;->u:[Lia/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lia/e;->h:Ljava/lang/Class;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lia/e;
    .locals 1

    const-class v0, Lia/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lia/e;

    return-object p0
.end method

.method public static values()[Lia/e;
    .locals 1

    sget-object v0, Lia/e;->u:[Lia/e;

    invoke-virtual {v0}, [Lia/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lia/e;

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lia/e;->h:Ljava/lang/Class;

    return-object v0
.end method
