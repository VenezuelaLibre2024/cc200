.class public final enum Lee/a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lee/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lee/a;

.field public static final enum i:Lee/a;

.field public static final enum j:Lee/a;

.field public static final synthetic k:[Lee/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lee/a;

    const-string v1, "SUSPEND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lee/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lee/a;->h:Lee/a;

    new-instance v0, Lee/a;

    const-string v1, "DROP_OLDEST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lee/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lee/a;->i:Lee/a;

    new-instance v0, Lee/a;

    const-string v1, "DROP_LATEST"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lee/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lee/a;->j:Lee/a;

    invoke-static {}, Lee/a;->b()[Lee/a;

    move-result-object v0

    sput-object v0, Lee/a;->k:[Lee/a;

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

.method public static final synthetic b()[Lee/a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lee/a;

    sget-object v1, Lee/a;->h:Lee/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lee/a;->i:Lee/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lee/a;->j:Lee/a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lee/a;
    .locals 1

    const-class v0, Lee/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lee/a;

    return-object p0
.end method

.method public static values()[Lee/a;
    .locals 1

    sget-object v0, Lee/a;->k:[Lee/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lee/a;

    return-object v0
.end method
