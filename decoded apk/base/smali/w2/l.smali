.class public final enum Lw2/l;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw2/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lw2/l;

.field public static final enum i:Lw2/l;

.field public static final enum j:Lw2/l;

.field public static final enum k:Lw2/l;

.field public static final enum l:Lw2/l;

.field public static final enum m:Lw2/l;

.field public static final synthetic n:[Lw2/l;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lw2/l;

    const-string v1, "lowest"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw2/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw2/l;->h:Lw2/l;

    new-instance v0, Lw2/l;

    const-string v1, "low"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lw2/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw2/l;->i:Lw2/l;

    new-instance v0, Lw2/l;

    const-string v1, "medium"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lw2/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw2/l;->j:Lw2/l;

    new-instance v0, Lw2/l;

    const-string v1, "high"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lw2/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw2/l;->k:Lw2/l;

    new-instance v0, Lw2/l;

    const-string v1, "best"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lw2/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw2/l;->l:Lw2/l;

    new-instance v0, Lw2/l;

    const-string v1, "bestForNavigation"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lw2/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw2/l;->m:Lw2/l;

    invoke-static {}, Lw2/l;->b()[Lw2/l;

    move-result-object v0

    sput-object v0, Lw2/l;->n:[Lw2/l;

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

.method public static synthetic b()[Lw2/l;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lw2/l;

    sget-object v1, Lw2/l;->h:Lw2/l;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lw2/l;->i:Lw2/l;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lw2/l;->j:Lw2/l;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lw2/l;->k:Lw2/l;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lw2/l;->l:Lw2/l;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lw2/l;->m:Lw2/l;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lw2/l;
    .locals 1

    const-class v0, Lw2/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw2/l;

    return-object p0
.end method

.method public static values()[Lw2/l;
    .locals 1

    sget-object v0, Lw2/l;->n:[Lw2/l;

    invoke-virtual {v0}, [Lw2/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw2/l;

    return-object v0
.end method
