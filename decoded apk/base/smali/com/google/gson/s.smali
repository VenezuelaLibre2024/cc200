.class public abstract enum Lcom/google/gson/s;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/gson/s;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lcom/google/gson/s;

.field public static final enum i:Lcom/google/gson/s;

.field public static final synthetic j:[Lcom/google/gson/s;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/gson/s$a;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/gson/s$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/gson/s;->h:Lcom/google/gson/s;

    new-instance v1, Lcom/google/gson/s$b;

    const-string v3, "STRING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/google/gson/s$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/gson/s;->i:Lcom/google/gson/s;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/gson/s;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/google/gson/s;->j:[Lcom/google/gson/s;

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

.method public synthetic constructor <init>(Ljava/lang/String;ILcom/google/gson/s$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/gson/s;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/gson/s;
    .locals 1

    const-class v0, Lcom/google/gson/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/gson/s;

    return-object p0
.end method

.method public static values()[Lcom/google/gson/s;
    .locals 1

    sget-object v0, Lcom/google/gson/s;->j:[Lcom/google/gson/s;

    invoke-virtual {v0}, [Lcom/google/gson/s;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/gson/s;

    return-object v0
.end method