.class public final enum Lc7/m7;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc7/m7;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum i:Lc7/m7;

.field public static final enum j:Lc7/m7;

.field public static final synthetic k:[Lc7/m7;


# instance fields
.field public final h:[Lc7/n7$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lc7/m7;

    const/4 v1, 0x2

    new-array v2, v1, [Lc7/n7$a;

    sget-object v3, Lc7/n7$a;->i:Lc7/n7$a;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Lc7/n7$a;->j:Lc7/n7$a;

    const/4 v5, 0x1

    aput-object v3, v2, v5

    const-string v3, "STORAGE"

    invoke-direct {v0, v3, v4, v2}, Lc7/m7;-><init>(Ljava/lang/String;I[Lc7/n7$a;)V

    sput-object v0, Lc7/m7;->i:Lc7/m7;

    new-instance v2, Lc7/m7;

    new-array v3, v5, [Lc7/n7$a;

    sget-object v6, Lc7/n7$a;->k:Lc7/n7$a;

    aput-object v6, v3, v4

    const-string v6, "DMA"

    invoke-direct {v2, v6, v5, v3}, Lc7/m7;-><init>(Ljava/lang/String;I[Lc7/n7$a;)V

    sput-object v2, Lc7/m7;->j:Lc7/m7;

    new-array v1, v1, [Lc7/m7;

    aput-object v0, v1, v4

    aput-object v2, v1, v5

    sput-object v1, Lc7/m7;->k:[Lc7/m7;

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;I[Lc7/n7$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lc7/n7$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lc7/m7;->h:[Lc7/n7$a;

    return-void
.end method

.method public static bridge synthetic c(Lc7/m7;)[Lc7/n7$a;
    .locals 0

    iget-object p0, p0, Lc7/m7;->h:[Lc7/n7$a;

    return-object p0
.end method

.method public static values()[Lc7/m7;
    .locals 1

    sget-object v0, Lc7/m7;->k:[Lc7/m7;

    invoke-virtual {v0}, [Lc7/m7;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc7/m7;

    return-object v0
.end method


# virtual methods
.method public final b()[Lc7/n7$a;
    .locals 1

    iget-object v0, p0, Lc7/m7;->h:[Lc7/n7$a;

    return-object v0
.end method
