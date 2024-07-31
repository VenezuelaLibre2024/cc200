.class public final enum Lm9/s;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Ls8/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm9/s;",
        ">;",
        "Ls8/f;"
    }
.end annotation


# static fields
.field public static final enum i:Lm9/s;

.field public static final enum j:Lm9/s;

.field public static final enum k:Lm9/s;

.field public static final enum l:Lm9/s;

.field public static final synthetic m:[Lm9/s;


# instance fields
.field public final h:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lm9/s;

    const-string v1, "LOG_ENVIRONMENT_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lm9/s;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm9/s;->i:Lm9/s;

    new-instance v0, Lm9/s;

    const-string v1, "LOG_ENVIRONMENT_AUTOPUSH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lm9/s;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm9/s;->j:Lm9/s;

    new-instance v0, Lm9/s;

    const-string v1, "LOG_ENVIRONMENT_STAGING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lm9/s;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm9/s;->k:Lm9/s;

    new-instance v0, Lm9/s;

    const-string v1, "LOG_ENVIRONMENT_PROD"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lm9/s;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm9/s;->l:Lm9/s;

    invoke-static {}, Lm9/s;->b()[Lm9/s;

    move-result-object v0

    sput-object v0, Lm9/s;->m:[Lm9/s;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lm9/s;->h:I

    return-void
.end method

.method public static final synthetic b()[Lm9/s;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lm9/s;

    sget-object v1, Lm9/s;->i:Lm9/s;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lm9/s;->j:Lm9/s;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lm9/s;->k:Lm9/s;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lm9/s;->l:Lm9/s;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lm9/s;
    .locals 1

    const-class v0, Lm9/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm9/s;

    return-object p0
.end method

.method public static values()[Lm9/s;
    .locals 1

    sget-object v0, Lm9/s;->m:[Lm9/s;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm9/s;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lm9/s;->h:I

    return v0
.end method
