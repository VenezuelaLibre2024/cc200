.class public final enum Lkd/a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkd/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lkd/a;

.field public static final enum i:Lkd/a;

.field public static final enum j:Lkd/a;

.field public static final synthetic k:[Lkd/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkd/a;

    const-string v1, "COROUTINE_SUSPENDED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkd/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkd/a;->h:Lkd/a;

    new-instance v0, Lkd/a;

    const-string v1, "UNDECIDED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkd/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkd/a;->i:Lkd/a;

    new-instance v0, Lkd/a;

    const-string v1, "RESUMED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkd/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkd/a;->j:Lkd/a;

    invoke-static {}, Lkd/a;->b()[Lkd/a;

    move-result-object v0

    sput-object v0, Lkd/a;->k:[Lkd/a;

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

.method public static final synthetic b()[Lkd/a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lkd/a;

    sget-object v1, Lkd/a;->h:Lkd/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lkd/a;->i:Lkd/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lkd/a;->j:Lkd/a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkd/a;
    .locals 1

    const-class v0, Lkd/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkd/a;

    return-object p0
.end method

.method public static values()[Lkd/a;
    .locals 1

    sget-object v0, Lkd/a;->k:[Lkd/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkd/a;

    return-object v0
.end method
