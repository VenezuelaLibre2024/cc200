.class public final enum Lm9/i;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Ls8/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm9/i;",
        ">;",
        "Ls8/f;"
    }
.end annotation


# static fields
.field public static final enum i:Lm9/i;

.field public static final enum j:Lm9/i;

.field public static final synthetic k:[Lm9/i;


# instance fields
.field public final h:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lm9/i;

    const-string v1, "EVENT_TYPE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lm9/i;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm9/i;->i:Lm9/i;

    new-instance v0, Lm9/i;

    const-string v1, "SESSION_START"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lm9/i;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lm9/i;->j:Lm9/i;

    invoke-static {}, Lm9/i;->b()[Lm9/i;

    move-result-object v0

    sput-object v0, Lm9/i;->k:[Lm9/i;

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

    iput p3, p0, Lm9/i;->h:I

    return-void
.end method

.method public static final synthetic b()[Lm9/i;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lm9/i;

    sget-object v1, Lm9/i;->i:Lm9/i;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lm9/i;->j:Lm9/i;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lm9/i;
    .locals 1

    const-class v0, Lm9/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm9/i;

    return-object p0
.end method

.method public static values()[Lm9/i;
    .locals 1

    sget-object v0, Lm9/i;->k:[Lm9/i;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm9/i;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lm9/i;->h:I

    return v0
.end method
