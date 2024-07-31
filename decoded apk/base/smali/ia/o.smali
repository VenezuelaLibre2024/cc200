.class public final enum Lia/o;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lia/o;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lia/o;

.field public static final enum i:Lia/o;

.field public static final enum j:Lia/o;

.field public static final enum k:Lia/o;

.field public static final enum l:Lia/o;

.field public static final enum m:Lia/o;

.field public static final enum n:Lia/o;

.field public static final enum o:Lia/o;

.field public static final enum p:Lia/o;

.field public static final enum q:Lia/o;

.field public static final enum r:Lia/o;

.field public static final enum s:Lia/o;

.field public static final synthetic t:[Lia/o;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lia/o;

    const-string v1, "OTHER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lia/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lia/o;->h:Lia/o;

    new-instance v1, Lia/o;

    const-string v3, "ORIENTATION"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lia/o;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lia/o;->i:Lia/o;

    new-instance v3, Lia/o;

    const-string v5, "BYTE_SEGMENTS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lia/o;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lia/o;->j:Lia/o;

    new-instance v5, Lia/o;

    const-string v7, "ERROR_CORRECTION_LEVEL"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lia/o;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lia/o;->k:Lia/o;

    new-instance v7, Lia/o;

    const-string v9, "ISSUE_NUMBER"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lia/o;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lia/o;->l:Lia/o;

    new-instance v9, Lia/o;

    const-string v11, "SUGGESTED_PRICE"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lia/o;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lia/o;->m:Lia/o;

    new-instance v11, Lia/o;

    const-string v13, "POSSIBLE_COUNTRY"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lia/o;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lia/o;->n:Lia/o;

    new-instance v13, Lia/o;

    const-string v15, "UPC_EAN_EXTENSION"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Lia/o;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lia/o;->o:Lia/o;

    new-instance v15, Lia/o;

    const-string v14, "PDF417_EXTRA_METADATA"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Lia/o;-><init>(Ljava/lang/String;I)V

    sput-object v15, Lia/o;->p:Lia/o;

    new-instance v14, Lia/o;

    const-string v12, "STRUCTURED_APPEND_SEQUENCE"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10}, Lia/o;-><init>(Ljava/lang/String;I)V

    sput-object v14, Lia/o;->q:Lia/o;

    new-instance v12, Lia/o;

    const-string v10, "STRUCTURED_APPEND_PARITY"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8}, Lia/o;-><init>(Ljava/lang/String;I)V

    sput-object v12, Lia/o;->r:Lia/o;

    new-instance v10, Lia/o;

    const-string v8, "SYMBOLOGY_IDENTIFIER"

    const/16 v6, 0xb

    invoke-direct {v10, v8, v6}, Lia/o;-><init>(Ljava/lang/String;I)V

    sput-object v10, Lia/o;->s:Lia/o;

    const/16 v8, 0xc

    new-array v8, v8, [Lia/o;

    aput-object v0, v8, v2

    aput-object v1, v8, v4

    const/4 v0, 0x2

    aput-object v3, v8, v0

    const/4 v0, 0x3

    aput-object v5, v8, v0

    const/4 v0, 0x4

    aput-object v7, v8, v0

    const/4 v0, 0x5

    aput-object v9, v8, v0

    const/4 v0, 0x6

    aput-object v11, v8, v0

    const/4 v0, 0x7

    aput-object v13, v8, v0

    const/16 v0, 0x8

    aput-object v15, v8, v0

    const/16 v0, 0x9

    aput-object v14, v8, v0

    const/16 v0, 0xa

    aput-object v12, v8, v0

    aput-object v10, v8, v6

    sput-object v8, Lia/o;->t:[Lia/o;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lia/o;
    .locals 1

    const-class v0, Lia/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lia/o;

    return-object p0
.end method

.method public static values()[Lia/o;
    .locals 1

    sget-object v0, Lia/o;->t:[Lia/o;

    invoke-virtual {v0}, [Lia/o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lia/o;

    return-object v0
.end method
