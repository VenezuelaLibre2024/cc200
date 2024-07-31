.class public final enum Lff/a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lff/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lff/a;

.field public static final enum i:Lff/a;

.field public static final enum j:Lff/a;

.field public static final enum k:Lff/a;

.field public static final enum l:Lff/a;

.field public static final enum m:Lff/a;

.field public static final enum n:Lff/a;

.field public static final synthetic o:[Lff/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lff/a;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lff/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lff/a;->h:Lff/a;

    new-instance v0, Lff/a;

    const-string v1, "ENQUEUED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lff/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lff/a;->i:Lff/a;

    new-instance v0, Lff/a;

    const-string v1, "RUNNING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lff/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lff/a;->j:Lff/a;

    new-instance v0, Lff/a;

    const-string v1, "COMPLETE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lff/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lff/a;->k:Lff/a;

    new-instance v0, Lff/a;

    const-string v1, "FAILED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lff/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lff/a;->l:Lff/a;

    new-instance v0, Lff/a;

    const-string v1, "CANCELED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lff/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lff/a;->m:Lff/a;

    new-instance v0, Lff/a;

    const-string v1, "PAUSED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lff/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lff/a;->n:Lff/a;

    invoke-static {}, Lff/a;->b()[Lff/a;

    move-result-object v0

    sput-object v0, Lff/a;->o:[Lff/a;

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

.method public static final synthetic b()[Lff/a;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lff/a;

    sget-object v1, Lff/a;->h:Lff/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lff/a;->i:Lff/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lff/a;->j:Lff/a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lff/a;->k:Lff/a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lff/a;->l:Lff/a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lff/a;->m:Lff/a;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lff/a;->n:Lff/a;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lff/a;
    .locals 1

    const-class v0, Lff/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lff/a;

    return-object p0
.end method

.method public static values()[Lff/a;
    .locals 1

    sget-object v0, Lff/a;->o:[Lff/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lff/a;

    return-object v0
.end method
