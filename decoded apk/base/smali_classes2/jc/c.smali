.class public final enum Ljc/c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljc/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Ljc/c;

.field public static final enum i:Ljc/c;

.field public static final enum j:Ljc/c;

.field public static final enum k:Ljc/c;

.field public static final enum l:Ljc/c;

.field public static final enum m:Ljc/c;

.field public static final enum n:Ljc/c;

.field public static final synthetic o:[Ljc/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljc/c;

    const-string v1, "IDEL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljc/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljc/c;->h:Ljc/c;

    new-instance v0, Ljc/c;

    const-string v1, "START"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljc/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljc/c;->i:Ljc/c;

    new-instance v0, Ljc/c;

    const-string v1, "RESUME"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ljc/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljc/c;->j:Ljc/c;

    new-instance v0, Ljc/c;

    const-string v1, "PAUSE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ljc/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljc/c;->k:Ljc/c;

    new-instance v0, Ljc/c;

    const-string v1, "BREAK"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ljc/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljc/c;->l:Ljc/c;

    new-instance v0, Ljc/c;

    const-string v1, "STOP"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ljc/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljc/c;->m:Ljc/c;

    new-instance v0, Ljc/c;

    const-string v1, "COMPLETE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ljc/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljc/c;->n:Ljc/c;

    invoke-static {}, Ljc/c;->b()[Ljc/c;

    move-result-object v0

    sput-object v0, Ljc/c;->o:[Ljc/c;

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

.method public static synthetic b()[Ljc/c;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Ljc/c;

    sget-object v1, Ljc/c;->h:Ljc/c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ljc/c;->i:Ljc/c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ljc/c;->j:Ljc/c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ljc/c;->k:Ljc/c;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ljc/c;->l:Ljc/c;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ljc/c;->m:Ljc/c;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Ljc/c;->n:Ljc/c;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljc/c;
    .locals 1

    const-class v0, Ljc/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljc/c;

    return-object p0
.end method

.method public static values()[Ljc/c;
    .locals 1

    sget-object v0, Ljc/c;->o:[Ljc/c;

    invoke-virtual {v0}, [Ljc/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljc/c;

    return-object v0
.end method
