.class public final enum Lke/d;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lke/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lke/d;

.field public static final enum i:Lke/d;

.field public static final enum j:Lke/d;

.field public static final enum k:Lke/d;

.field public static final synthetic l:[Lke/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lke/d;

    const-string v1, "SUCCESSFUL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lke/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lke/d;->h:Lke/d;

    new-instance v0, Lke/d;

    const-string v1, "REREGISTER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lke/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lke/d;->i:Lke/d;

    new-instance v0, Lke/d;

    const-string v1, "CANCELLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lke/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lke/d;->j:Lke/d;

    new-instance v0, Lke/d;

    const-string v1, "ALREADY_SELECTED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lke/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lke/d;->k:Lke/d;

    invoke-static {}, Lke/d;->b()[Lke/d;

    move-result-object v0

    sput-object v0, Lke/d;->l:[Lke/d;

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

.method public static final synthetic b()[Lke/d;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lke/d;

    sget-object v1, Lke/d;->h:Lke/d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lke/d;->i:Lke/d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lke/d;->j:Lke/d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lke/d;->k:Lke/d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lke/d;
    .locals 1

    const-class v0, Lke/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lke/d;

    return-object p0
.end method

.method public static values()[Lke/d;
    .locals 1

    sget-object v0, Lke/d;->l:[Lke/d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lke/d;

    return-object v0
.end method
