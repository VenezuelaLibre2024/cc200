.class public abstract enum Lcom/google/gson/t;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/google/gson/u;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/gson/t;",
        ">;",
        "Lcom/google/gson/u;"
    }
.end annotation


# static fields
.field public static final enum h:Lcom/google/gson/t;

.field public static final enum i:Lcom/google/gson/t;

.field public static final enum j:Lcom/google/gson/t;

.field public static final enum k:Lcom/google/gson/t;

.field public static final synthetic l:[Lcom/google/gson/t;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/google/gson/t$a;

    const-string v1, "DOUBLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/gson/t$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/gson/t;->h:Lcom/google/gson/t;

    new-instance v1, Lcom/google/gson/t$b;

    const-string v3, "LAZILY_PARSED_NUMBER"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/google/gson/t$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/gson/t;->i:Lcom/google/gson/t;

    new-instance v3, Lcom/google/gson/t$c;

    const-string v5, "LONG_OR_DOUBLE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/google/gson/t$c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/google/gson/t;->j:Lcom/google/gson/t;

    new-instance v5, Lcom/google/gson/t$d;

    const-string v7, "BIG_DECIMAL"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/google/gson/t$d;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/google/gson/t;->k:Lcom/google/gson/t;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/google/gson/t;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lcom/google/gson/t;->l:[Lcom/google/gson/t;

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

.method public synthetic constructor <init>(Ljava/lang/String;ILcom/google/gson/t$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/gson/t;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/gson/t;
    .locals 1

    const-class v0, Lcom/google/gson/t;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/gson/t;

    return-object p0
.end method

.method public static values()[Lcom/google/gson/t;
    .locals 1

    sget-object v0, Lcom/google/gson/t;->l:[Lcom/google/gson/t;

    invoke-virtual {v0}, [Lcom/google/gson/t;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/gson/t;

    return-object v0
.end method
