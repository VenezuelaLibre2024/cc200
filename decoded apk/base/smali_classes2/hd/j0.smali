.class public final enum Lhd/j0;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhd/j0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lhd/j0;

.field public static final enum i:Lhd/j0;

.field public static final enum j:Lhd/j0;

.field public static final enum k:Lhd/j0;

.field public static final synthetic l:[Lhd/j0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhd/j0;

    const-string v1, "Ready"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhd/j0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhd/j0;->h:Lhd/j0;

    new-instance v0, Lhd/j0;

    const-string v1, "NotReady"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lhd/j0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhd/j0;->i:Lhd/j0;

    new-instance v0, Lhd/j0;

    const-string v1, "Done"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lhd/j0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhd/j0;->j:Lhd/j0;

    new-instance v0, Lhd/j0;

    const-string v1, "Failed"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lhd/j0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhd/j0;->k:Lhd/j0;

    invoke-static {}, Lhd/j0;->b()[Lhd/j0;

    move-result-object v0

    sput-object v0, Lhd/j0;->l:[Lhd/j0;

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

.method public static final synthetic b()[Lhd/j0;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lhd/j0;

    sget-object v1, Lhd/j0;->h:Lhd/j0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lhd/j0;->i:Lhd/j0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lhd/j0;->j:Lhd/j0;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lhd/j0;->k:Lhd/j0;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhd/j0;
    .locals 1

    const-class v0, Lhd/j0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhd/j0;

    return-object p0
.end method

.method public static values()[Lhd/j0;
    .locals 1

    sget-object v0, Lhd/j0;->l:[Lhd/j0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhd/j0;

    return-object v0
.end method
