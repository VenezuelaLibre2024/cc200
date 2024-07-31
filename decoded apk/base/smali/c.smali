.class public final enum Lc;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum i:Lc;

.field public static final enum j:Lc;

.field public static final enum k:Lc;

.field public static final synthetic l:[Lc;


# instance fields
.field public final h:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc;

    const-string v1, "INFO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lc;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lc;->i:Lc;

    new-instance v0, Lc;

    const-string v1, "ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lc;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lc;->j:Lc;

    new-instance v0, Lc;

    const-string v1, "NONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lc;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lc;->k:Lc;

    invoke-static {}, Lc;->b()[Lc;

    move-result-object v0

    sput-object v0, Lc;->l:[Lc;

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

    iput p3, p0, Lc;->h:I

    return-void
.end method

.method public static final synthetic b()[Lc;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lc;

    sget-object v1, Lc;->i:Lc;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lc;->j:Lc;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lc;->k:Lc;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lc;
    .locals 1

    const-class v0, Lc;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc;

    return-object p0
.end method

.method public static values()[Lc;
    .locals 1

    sget-object v0, Lc;->l:[Lc;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc;

    return-object v0
.end method


# virtual methods
.method public final c()I
    .locals 1

    iget v0, p0, Lc;->h:I

    return v0
.end method
