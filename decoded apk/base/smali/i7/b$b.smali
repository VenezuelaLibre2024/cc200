.class public final enum Li7/b$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li7/b$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Li7/b$b;

.field public static final enum i:Li7/b$b;

.field public static final enum j:Li7/b$b;

.field public static final enum k:Li7/b$b;

.field public static final synthetic l:[Li7/b$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Li7/b$b;

    const-string v1, "READY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li7/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li7/b$b;->h:Li7/b$b;

    new-instance v0, Li7/b$b;

    const-string v1, "NOT_READY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Li7/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li7/b$b;->i:Li7/b$b;

    new-instance v0, Li7/b$b;

    const-string v1, "DONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Li7/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li7/b$b;->j:Li7/b$b;

    new-instance v0, Li7/b$b;

    const-string v1, "FAILED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Li7/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li7/b$b;->k:Li7/b$b;

    invoke-static {}, Li7/b$b;->b()[Li7/b$b;

    move-result-object v0

    sput-object v0, Li7/b$b;->l:[Li7/b$b;

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

.method public static synthetic b()[Li7/b$b;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Li7/b$b;

    sget-object v1, Li7/b$b;->h:Li7/b$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Li7/b$b;->i:Li7/b$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Li7/b$b;->j:Li7/b$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Li7/b$b;->k:Li7/b$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Li7/b$b;
    .locals 1

    const-class v0, Li7/b$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li7/b$b;

    return-object p0
.end method

.method public static values()[Li7/b$b;
    .locals 1

    sget-object v0, Li7/b$b;->l:[Li7/b$b;

    invoke-virtual {v0}, [Li7/b$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li7/b$b;

    return-object v0
.end method
