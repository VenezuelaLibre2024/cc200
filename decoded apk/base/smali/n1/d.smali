.class public final enum Ln1/d;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln1/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum i:Ln1/d;

.field public static final enum j:Ln1/d;

.field public static final enum k:Ln1/d;

.field public static final enum l:Ln1/d;

.field public static final enum m:Ln1/d;

.field public static final synthetic n:[Ln1/d;


# instance fields
.field public final h:J


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Ln1/d;

    const-string v1, "DEX_FILES"

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Ln1/d;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Ln1/d;->i:Ln1/d;

    new-instance v0, Ln1/d;

    const-string v1, "EXTRA_DESCRIPTORS"

    const/4 v2, 0x1

    const-wide/16 v3, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Ln1/d;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Ln1/d;->j:Ln1/d;

    new-instance v0, Ln1/d;

    const-string v1, "CLASSES"

    const/4 v2, 0x2

    const-wide/16 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v4}, Ln1/d;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Ln1/d;->k:Ln1/d;

    new-instance v0, Ln1/d;

    const-string v1, "METHODS"

    const/4 v2, 0x3

    const-wide/16 v3, 0x3

    invoke-direct {v0, v1, v2, v3, v4}, Ln1/d;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Ln1/d;->l:Ln1/d;

    new-instance v0, Ln1/d;

    const-string v1, "AGGREGATION_COUNT"

    const/4 v2, 0x4

    const-wide/16 v3, 0x4

    invoke-direct {v0, v1, v2, v3, v4}, Ln1/d;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Ln1/d;->m:Ln1/d;

    invoke-static {}, Ln1/d;->b()[Ln1/d;

    move-result-object v0

    sput-object v0, Ln1/d;->n:[Ln1/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, Ln1/d;->h:J

    return-void
.end method

.method public static synthetic b()[Ln1/d;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ln1/d;

    sget-object v1, Ln1/d;->i:Ln1/d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ln1/d;->j:Ln1/d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ln1/d;->k:Ln1/d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ln1/d;->l:Ln1/d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ln1/d;->m:Ln1/d;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln1/d;
    .locals 1

    const-class v0, Ln1/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln1/d;

    return-object p0
.end method

.method public static values()[Ln1/d;
    .locals 1

    sget-object v0, Ln1/d;->n:[Ln1/d;

    invoke-virtual {v0}, [Ln1/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln1/d;

    return-object v0
.end method


# virtual methods
.method public c()J
    .locals 2

    iget-wide v0, p0, Ln1/d;->h:J

    return-wide v0
.end method
