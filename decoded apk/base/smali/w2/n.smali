.class public final enum Lw2/n;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw2/n;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lw2/n;

.field public static final enum i:Lw2/n;

.field public static final synthetic j:[Lw2/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lw2/n;

    const-string v1, "reduced"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw2/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw2/n;->h:Lw2/n;

    new-instance v0, Lw2/n;

    const-string v1, "precise"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lw2/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw2/n;->i:Lw2/n;

    invoke-static {}, Lw2/n;->b()[Lw2/n;

    move-result-object v0

    sput-object v0, Lw2/n;->j:[Lw2/n;

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

.method public static synthetic b()[Lw2/n;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lw2/n;

    sget-object v1, Lw2/n;->h:Lw2/n;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lw2/n;->i:Lw2/n;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lw2/n;
    .locals 1

    const-class v0, Lw2/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw2/n;

    return-object p0
.end method

.method public static values()[Lw2/n;
    .locals 1

    sget-object v0, Lw2/n;->j:[Lw2/n;

    invoke-virtual {v0}, [Lw2/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw2/n;

    return-object v0
.end method
