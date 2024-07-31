.class public final enum Lq2/z;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lq2/z;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum i:Lq2/z;

.field public static final enum j:Lq2/z;

.field public static final enum k:Lq2/z;

.field public static final enum l:Lq2/z;

.field public static final enum m:Lq2/z;

.field public static final synthetic n:[Lq2/z;


# instance fields
.field public final h:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lq2/z;

    const-string v1, "SIGINT"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lq2/z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lq2/z;->i:Lq2/z;

    new-instance v0, Lq2/z;

    const-string v1, "SIGQUIT"

    const/4 v2, 0x1

    const/4 v4, 0x3

    invoke-direct {v0, v1, v2, v4}, Lq2/z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lq2/z;->j:Lq2/z;

    new-instance v0, Lq2/z;

    const-string v1, "SIGPIPE"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v3, v2}, Lq2/z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lq2/z;->k:Lq2/z;

    new-instance v0, Lq2/z;

    const-string v1, "SIGTERM"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v4, v2}, Lq2/z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lq2/z;->l:Lq2/z;

    new-instance v0, Lq2/z;

    const-string v1, "SIGXCPU"

    const/4 v2, 0x4

    const/16 v3, 0x18

    invoke-direct {v0, v1, v2, v3}, Lq2/z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lq2/z;->m:Lq2/z;

    invoke-static {}, Lq2/z;->b()[Lq2/z;

    move-result-object v0

    sput-object v0, Lq2/z;->n:[Lq2/z;

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

    iput p3, p0, Lq2/z;->h:I

    return-void
.end method

.method public static synthetic b()[Lq2/z;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lq2/z;

    sget-object v1, Lq2/z;->i:Lq2/z;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lq2/z;->j:Lq2/z;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lq2/z;->k:Lq2/z;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lq2/z;->l:Lq2/z;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lq2/z;->m:Lq2/z;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lq2/z;
    .locals 1

    const-class v0, Lq2/z;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq2/z;

    return-object p0
.end method

.method public static values()[Lq2/z;
    .locals 1

    sget-object v0, Lq2/z;->n:[Lq2/z;

    invoke-virtual {v0}, [Lq2/z;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq2/z;

    return-object v0
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, Lq2/z;->h:I

    return v0
.end method
