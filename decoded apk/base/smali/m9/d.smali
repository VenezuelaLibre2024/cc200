.class public final enum Lm9/d;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Ls8/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm9/d;",
        ">;",
        "Ls8/f;"
    }
.end annotation


# static fields
.field public static final enum i:Lm9/d;

.field public static final enum j:Lm9/d;

.field public static final enum k:Lm9/d;

.field public static final enum l:Lm9/d;

.field public static final enum m:Lm9/d;

.field public static final enum n:Lm9/d;

.field public static final synthetic o:[Lm9/d;


# instance fields
.field public final h:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lm9/d;

    const-string v1, "COLLECTION_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lm9/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm9/d;->i:Lm9/d;

    new-instance v0, Lm9/d;

    const-string v1, "COLLECTION_SDK_NOT_INSTALLED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lm9/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm9/d;->j:Lm9/d;

    new-instance v0, Lm9/d;

    const-string v1, "COLLECTION_ENABLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lm9/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm9/d;->k:Lm9/d;

    new-instance v0, Lm9/d;

    const-string v1, "COLLECTION_DISABLED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lm9/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm9/d;->l:Lm9/d;

    new-instance v0, Lm9/d;

    const-string v1, "COLLECTION_DISABLED_REMOTE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lm9/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm9/d;->m:Lm9/d;

    new-instance v0, Lm9/d;

    const-string v1, "COLLECTION_SAMPLED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Lm9/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm9/d;->n:Lm9/d;

    invoke-static {}, Lm9/d;->b()[Lm9/d;

    move-result-object v0

    sput-object v0, Lm9/d;->o:[Lm9/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lm9/d;->h:I

    return-void
.end method

.method public static final synthetic b()[Lm9/d;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lm9/d;

    sget-object v1, Lm9/d;->i:Lm9/d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lm9/d;->j:Lm9/d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lm9/d;->k:Lm9/d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lm9/d;->l:Lm9/d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lm9/d;->m:Lm9/d;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lm9/d;->n:Lm9/d;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lm9/d;
    .locals 1

    const-class v0, Lm9/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm9/d;

    return-object p0
.end method

.method public static values()[Lm9/d;
    .locals 1

    sget-object v0, Lm9/d;->o:[Lm9/d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm9/d;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lm9/d;->h:I

    return v0
.end method
