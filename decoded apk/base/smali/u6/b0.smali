.class public final enum Lu6/b0;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lu6/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lu6/b0;",
        ">;",
        "Lu6/a;"
    }
.end annotation


# static fields
.field public static final enum i:Lu6/b0;

.field public static final enum j:Lu6/b0;

.field public static final enum k:Lu6/b0;

.field public static final enum l:Lu6/b0;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum m:Lu6/b0;

.field public static final enum n:Lu6/b0;

.field public static final enum o:Lu6/b0;

.field public static final enum p:Lu6/b0;

.field public static final synthetic q:[Lu6/b0;


# instance fields
.field public final h:I


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lu6/b0;

    const-string v1, "RS256"

    const/4 v2, 0x0

    const/16 v3, -0x101

    invoke-direct {v0, v1, v2, v3}, Lu6/b0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lu6/b0;->i:Lu6/b0;

    new-instance v1, Lu6/b0;

    const-string v3, "RS384"

    const/4 v4, 0x1

    const/16 v5, -0x102

    invoke-direct {v1, v3, v4, v5}, Lu6/b0;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lu6/b0;->j:Lu6/b0;

    new-instance v3, Lu6/b0;

    const-string v5, "RS512"

    const/4 v6, 0x2

    const/16 v7, -0x103

    invoke-direct {v3, v5, v6, v7}, Lu6/b0;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lu6/b0;->k:Lu6/b0;

    new-instance v5, Lu6/b0;

    const-string v7, "LEGACY_RS1"

    const/4 v8, 0x3

    const/16 v9, -0x106

    invoke-direct {v5, v7, v8, v9}, Lu6/b0;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lu6/b0;->l:Lu6/b0;

    new-instance v7, Lu6/b0;

    const-string v9, "PS256"

    const/4 v10, 0x4

    const/16 v11, -0x25

    invoke-direct {v7, v9, v10, v11}, Lu6/b0;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lu6/b0;->m:Lu6/b0;

    new-instance v9, Lu6/b0;

    const-string v11, "PS384"

    const/4 v12, 0x5

    const/16 v13, -0x26

    invoke-direct {v9, v11, v12, v13}, Lu6/b0;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lu6/b0;->n:Lu6/b0;

    new-instance v11, Lu6/b0;

    const-string v13, "PS512"

    const/4 v14, 0x6

    const/16 v15, -0x27

    invoke-direct {v11, v13, v14, v15}, Lu6/b0;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lu6/b0;->o:Lu6/b0;

    new-instance v13, Lu6/b0;

    const-string v15, "RS1"

    const/4 v14, 0x7

    const v12, -0xffff

    invoke-direct {v13, v15, v14, v12}, Lu6/b0;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lu6/b0;->p:Lu6/b0;

    const/16 v12, 0x8

    new-array v12, v12, [Lu6/b0;

    aput-object v0, v12, v2

    aput-object v1, v12, v4

    aput-object v3, v12, v6

    aput-object v5, v12, v8

    aput-object v7, v12, v10

    const/4 v0, 0x5

    aput-object v9, v12, v0

    const/4 v0, 0x6

    aput-object v11, v12, v0

    aput-object v13, v12, v14

    sput-object v12, Lu6/b0;->q:[Lu6/b0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lu6/b0;->h:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lu6/b0;
    .locals 1

    const-class v0, Lu6/b0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lu6/b0;

    return-object p0
.end method

.method public static values()[Lu6/b0;
    .locals 1

    sget-object v0, Lu6/b0;->q:[Lu6/b0;

    invoke-virtual {v0}, [Lu6/b0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu6/b0;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lu6/b0;->h:I

    return v0
.end method
