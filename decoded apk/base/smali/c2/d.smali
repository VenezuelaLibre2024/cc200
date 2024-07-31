.class public final enum Lc2/d;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc2/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lc2/d;

.field public static final enum i:Lc2/d;

.field public static final enum j:Lc2/d;

.field public static final enum k:Lc2/d;

.field public static final synthetic l:[Lc2/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lc2/d;

    const-string v1, "REPLACE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc2/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc2/d;->h:Lc2/d;

    new-instance v1, Lc2/d;

    const-string v3, "KEEP"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lc2/d;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lc2/d;->i:Lc2/d;

    new-instance v3, Lc2/d;

    const-string v5, "APPEND"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lc2/d;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lc2/d;->j:Lc2/d;

    new-instance v5, Lc2/d;

    const-string v7, "APPEND_OR_REPLACE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lc2/d;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lc2/d;->k:Lc2/d;

    const/4 v7, 0x4

    new-array v7, v7, [Lc2/d;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lc2/d;->l:[Lc2/d;

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

.method public static valueOf(Ljava/lang/String;)Lc2/d;
    .locals 1

    const-class v0, Lc2/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc2/d;

    return-object p0
.end method

.method public static values()[Lc2/d;
    .locals 1

    sget-object v0, Lc2/d;->l:[Lc2/d;

    invoke-virtual {v0}, [Lc2/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc2/d;

    return-object v0
.end method
