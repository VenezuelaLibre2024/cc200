.class public final enum Lc7/l;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc7/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum i:Lc7/l;

.field public static final enum j:Lc7/l;

.field public static final enum k:Lc7/l;

.field public static final enum l:Lc7/l;

.field public static final enum m:Lc7/l;

.field public static final enum n:Lc7/l;

.field public static final enum o:Lc7/l;

.field public static final enum p:Lc7/l;

.field public static final enum q:Lc7/l;

.field public static final synthetic r:[Lc7/l;


# instance fields
.field public final h:C


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lc7/l;

    const-string v1, "UNSET"

    const/4 v2, 0x0

    const/16 v3, 0x30

    invoke-direct {v0, v1, v2, v3}, Lc7/l;-><init>(Ljava/lang/String;IC)V

    sput-object v0, Lc7/l;->i:Lc7/l;

    new-instance v1, Lc7/l;

    const-string v3, "REMOTE_DEFAULT"

    const/4 v4, 0x1

    const/16 v5, 0x31

    invoke-direct {v1, v3, v4, v5}, Lc7/l;-><init>(Ljava/lang/String;IC)V

    sput-object v1, Lc7/l;->j:Lc7/l;

    new-instance v3, Lc7/l;

    const-string v5, "REMOTE_DELEGATION"

    const/4 v6, 0x2

    const/16 v7, 0x32

    invoke-direct {v3, v5, v6, v7}, Lc7/l;-><init>(Ljava/lang/String;IC)V

    sput-object v3, Lc7/l;->k:Lc7/l;

    new-instance v5, Lc7/l;

    const-string v7, "MANIFEST"

    const/4 v8, 0x3

    const/16 v9, 0x33

    invoke-direct {v5, v7, v8, v9}, Lc7/l;-><init>(Ljava/lang/String;IC)V

    sput-object v5, Lc7/l;->l:Lc7/l;

    new-instance v7, Lc7/l;

    const-string v9, "INITIALIZATION"

    const/4 v10, 0x4

    const/16 v11, 0x34

    invoke-direct {v7, v9, v10, v11}, Lc7/l;-><init>(Ljava/lang/String;IC)V

    sput-object v7, Lc7/l;->m:Lc7/l;

    new-instance v9, Lc7/l;

    const-string v11, "API"

    const/4 v12, 0x5

    const/16 v13, 0x35

    invoke-direct {v9, v11, v12, v13}, Lc7/l;-><init>(Ljava/lang/String;IC)V

    sput-object v9, Lc7/l;->n:Lc7/l;

    new-instance v11, Lc7/l;

    const-string v13, "CHILD_ACCOUNT"

    const/4 v14, 0x6

    const/16 v15, 0x36

    invoke-direct {v11, v13, v14, v15}, Lc7/l;-><init>(Ljava/lang/String;IC)V

    sput-object v11, Lc7/l;->o:Lc7/l;

    new-instance v13, Lc7/l;

    const-string v15, "TCF"

    const/4 v14, 0x7

    const/16 v12, 0x37

    invoke-direct {v13, v15, v14, v12}, Lc7/l;-><init>(Ljava/lang/String;IC)V

    sput-object v13, Lc7/l;->p:Lc7/l;

    new-instance v12, Lc7/l;

    const-string v15, "FAILSAFE"

    const/16 v14, 0x8

    const/16 v10, 0x39

    invoke-direct {v12, v15, v14, v10}, Lc7/l;-><init>(Ljava/lang/String;IC)V

    sput-object v12, Lc7/l;->q:Lc7/l;

    const/16 v10, 0x9

    new-array v10, v10, [Lc7/l;

    aput-object v0, v10, v2

    aput-object v1, v10, v4

    aput-object v3, v10, v6

    aput-object v5, v10, v8

    const/4 v0, 0x4

    aput-object v7, v10, v0

    const/4 v0, 0x5

    aput-object v9, v10, v0

    const/4 v0, 0x6

    aput-object v11, v10, v0

    const/4 v0, 0x7

    aput-object v13, v10, v0

    aput-object v12, v10, v14

    sput-object v10, Lc7/l;->r:[Lc7/l;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IC)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(C)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-char p3, p0, Lc7/l;->h:C

    return-void
.end method

.method public static bridge synthetic b(Lc7/l;)C
    .locals 0

    iget-char p0, p0, Lc7/l;->h:C

    return p0
.end method

.method public static c(C)Lc7/l;
    .locals 5

    invoke-static {}, Lc7/l;->values()[Lc7/l;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-char v4, v3, Lc7/l;->h:C

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object p0, Lc7/l;->i:Lc7/l;

    return-object p0
.end method

.method public static values()[Lc7/l;
    .locals 1

    sget-object v0, Lc7/l;->r:[Lc7/l;

    invoke-virtual {v0}, [Lc7/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc7/l;

    return-object v0
.end method
