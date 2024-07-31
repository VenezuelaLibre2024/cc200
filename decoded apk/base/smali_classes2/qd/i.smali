.class public final enum Lqd/i;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqd/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lqd/i;

.field public static final enum i:Lqd/i;

.field public static final synthetic j:[Lqd/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lqd/i;

    const-string v1, "TOP_DOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lqd/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqd/i;->h:Lqd/i;

    new-instance v0, Lqd/i;

    const-string v1, "BOTTOM_UP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lqd/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqd/i;->i:Lqd/i;

    invoke-static {}, Lqd/i;->b()[Lqd/i;

    move-result-object v0

    sput-object v0, Lqd/i;->j:[Lqd/i;

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

.method public static final synthetic b()[Lqd/i;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lqd/i;

    sget-object v1, Lqd/i;->h:Lqd/i;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lqd/i;->i:Lqd/i;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lqd/i;
    .locals 1

    const-class v0, Lqd/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqd/i;

    return-object p0
.end method

.method public static values()[Lqd/i;
    .locals 1

    sget-object v0, Lqd/i;->j:[Lqd/i;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqd/i;

    return-object v0
.end method
