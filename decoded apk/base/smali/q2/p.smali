.class public final enum Lq2/p;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lq2/p;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lq2/p;

.field public static final enum i:Lq2/p;

.field public static final enum j:Lq2/p;

.field public static final enum k:Lq2/p;

.field public static final enum l:Lq2/p;

.field public static final synthetic m:[Lq2/p;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq2/p;

    const-string v1, "ALWAYS_PRINT_LOGS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lq2/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq2/p;->h:Lq2/p;

    new-instance v0, Lq2/p;

    const-string v1, "PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lq2/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq2/p;->i:Lq2/p;

    new-instance v0, Lq2/p;

    const-string v1, "PRINT_LOGS_WHEN_GLOBAL_CALLBACK_NOT_DEFINED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lq2/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq2/p;->j:Lq2/p;

    new-instance v0, Lq2/p;

    const-string v1, "PRINT_LOGS_WHEN_SESSION_CALLBACK_NOT_DEFINED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lq2/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq2/p;->k:Lq2/p;

    new-instance v0, Lq2/p;

    const-string v1, "NEVER_PRINT_LOGS"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lq2/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq2/p;->l:Lq2/p;

    invoke-static {}, Lq2/p;->b()[Lq2/p;

    move-result-object v0

    sput-object v0, Lq2/p;->m:[Lq2/p;

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

.method public static synthetic b()[Lq2/p;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lq2/p;

    sget-object v1, Lq2/p;->h:Lq2/p;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lq2/p;->i:Lq2/p;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lq2/p;->j:Lq2/p;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lq2/p;->k:Lq2/p;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lq2/p;->l:Lq2/p;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lq2/p;
    .locals 1

    const-class v0, Lq2/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq2/p;

    return-object p0
.end method

.method public static values()[Lq2/p;
    .locals 1

    sget-object v0, Lq2/p;->m:[Lq2/p;

    invoke-virtual {v0}, [Lq2/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq2/p;

    return-object v0
.end method
