.class public final enum Ll8/e;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ll8/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Ll8/e;

.field public static final enum i:Ll8/e;

.field public static final enum j:Ll8/e;

.field public static final synthetic k:[Ll8/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Ll8/e;

    const-string v1, "USE_CACHE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll8/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll8/e;->h:Ll8/e;

    new-instance v1, Ll8/e;

    const-string v3, "SKIP_CACHE_LOOKUP"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ll8/e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ll8/e;->i:Ll8/e;

    new-instance v3, Ll8/e;

    const-string v5, "IGNORE_CACHE_EXPIRATION"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ll8/e;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ll8/e;->j:Ll8/e;

    const/4 v5, 0x3

    new-array v5, v5, [Ll8/e;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Ll8/e;->k:[Ll8/e;

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

.method public static valueOf(Ljava/lang/String;)Ll8/e;
    .locals 1

    const-class v0, Ll8/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll8/e;

    return-object p0
.end method

.method public static values()[Ll8/e;
    .locals 1

    sget-object v0, Ll8/e;->k:[Ll8/e;

    invoke-virtual {v0}, [Ll8/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll8/e;

    return-object v0
.end method
