.class public final enum La3/a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La3/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:La3/a;

.field public static final enum k:La3/a;

.field public static final synthetic l:[La3/a;


# instance fields
.field public h:I

.field public i:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, La3/a;

    const-string v1, "PCM_8BIT"

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x3

    invoke-direct {v0, v1, v2, v3, v4}, La3/a;-><init>(Ljava/lang/String;III)V

    sput-object v0, La3/a;->j:La3/a;

    new-instance v1, La3/a;

    const-string v4, "PCM_16BIT"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5, v5}, La3/a;-><init>(Ljava/lang/String;III)V

    sput-object v1, La3/a;->k:La3/a;

    new-array v4, v5, [La3/a;

    aput-object v0, v4, v2

    aput-object v1, v4, v3

    sput-object v4, La3/a;->l:[La3/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, La3/a;->h:I

    iput p4, p0, La3/a;->i:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La3/a;
    .locals 1

    const-class v0, La3/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La3/a;

    return-object p0
.end method

.method public static values()[La3/a;
    .locals 1

    sget-object v0, La3/a;->l:[La3/a;

    invoke-virtual {v0}, [La3/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La3/a;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, La3/a;->i:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, La3/a;->h:I

    return v0
.end method
