.class public final enum Lib/i$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lib/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lib/i$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lib/i$a;

.field public static final enum i:Lib/i$a;

.field public static final enum j:Lib/i$a;

.field public static final enum k:Lib/i$a;

.field public static final synthetic l:[Lib/i$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lib/i$a;

    const-string v1, "AUTO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lib/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lib/i$a;->h:Lib/i$a;

    new-instance v0, Lib/i$a;

    const-string v1, "CONTINUOUS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lib/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lib/i$a;->i:Lib/i$a;

    new-instance v0, Lib/i$a;

    const-string v1, "INFINITY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lib/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lib/i$a;->j:Lib/i$a;

    new-instance v0, Lib/i$a;

    const-string v1, "MACRO"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lib/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lib/i$a;->k:Lib/i$a;

    invoke-static {}, Lib/i$a;->b()[Lib/i$a;

    move-result-object v0

    sput-object v0, Lib/i$a;->l:[Lib/i$a;

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

.method public static synthetic b()[Lib/i$a;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lib/i$a;

    sget-object v1, Lib/i$a;->h:Lib/i$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lib/i$a;->i:Lib/i$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lib/i$a;->j:Lib/i$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lib/i$a;->k:Lib/i$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lib/i$a;
    .locals 1

    const-class v0, Lib/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lib/i$a;

    return-object p0
.end method

.method public static values()[Lib/i$a;
    .locals 1

    sget-object v0, Lib/i$a;->l:[Lib/i$a;

    invoke-virtual {v0}, [Lib/i$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lib/i$a;

    return-object v0
.end method
