.class public final enum Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

.field public static final enum Daily:Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

.field public static final enum EveryMinute:Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

.field public static final enum Hourly:Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

.field public static final enum Weekly:Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;


# direct methods
.method private static synthetic $values()[Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    sget-object v1, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;->EveryMinute:Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;->Hourly:Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;->Daily:Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;->Weekly:Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    const-string v1, "EveryMinute"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;->EveryMinute:Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    new-instance v0, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    const-string v1, "Hourly"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;->Hourly:Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    new-instance v0, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    const-string v1, "Daily"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;->Daily:Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    new-instance v0, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    const-string v1, "Weekly"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;->Weekly:Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    invoke-static {}, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;->$values()[Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    move-result-object v0

    sput-object v0, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;->$VALUES:[Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;
    .locals 1

    const-class v0, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    return-object p0
.end method

.method public static values()[Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;
    .locals 1

    sget-object v0, Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;->$VALUES:[Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    invoke-virtual {v0}, [Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/dexterous/flutterlocalnotifications/models/RepeatInterval;

    return-object v0
.end method
