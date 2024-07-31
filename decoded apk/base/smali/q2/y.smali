.class public final enum Lq2/y;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lq2/y;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lq2/y;

.field public static final enum i:Lq2/y;

.field public static final enum j:Lq2/y;

.field public static final enum k:Lq2/y;

.field public static final synthetic l:[Lq2/y;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq2/y;

    const-string v1, "CREATED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lq2/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq2/y;->h:Lq2/y;

    new-instance v0, Lq2/y;

    const-string v1, "RUNNING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lq2/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq2/y;->i:Lq2/y;

    new-instance v0, Lq2/y;

    const-string v1, "FAILED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lq2/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq2/y;->j:Lq2/y;

    new-instance v0, Lq2/y;

    const-string v1, "COMPLETED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lq2/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq2/y;->k:Lq2/y;

    invoke-static {}, Lq2/y;->b()[Lq2/y;

    move-result-object v0

    sput-object v0, Lq2/y;->l:[Lq2/y;

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

.method public static synthetic b()[Lq2/y;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lq2/y;

    sget-object v1, Lq2/y;->h:Lq2/y;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lq2/y;->i:Lq2/y;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lq2/y;->j:Lq2/y;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lq2/y;->k:Lq2/y;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lq2/y;
    .locals 1

    const-class v0, Lq2/y;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq2/y;

    return-object p0
.end method

.method public static values()[Lq2/y;
    .locals 1

    sget-object v0, Lq2/y;->l:[Lq2/y;

    invoke-virtual {v0}, [Lq2/y;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq2/y;

    return-object v0
.end method
