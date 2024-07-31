.class public final enum Lvb/c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvb/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lvb/c;

.field public static final enum i:Lvb/c;

.field public static final enum j:Lvb/c;

.field public static final enum k:Lvb/c;

.field public static final synthetic l:[Lvb/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lvb/c;

    const-string v1, "ABSENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lvb/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvb/c;->h:Lvb/c;

    new-instance v1, Lvb/c;

    const-string v3, "REMOVING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lvb/c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lvb/c;->i:Lvb/c;

    new-instance v3, Lvb/c;

    const-string v5, "PASS_THROUGH"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lvb/c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lvb/c;->j:Lvb/c;

    new-instance v5, Lvb/c;

    const-string v7, "COMPRESSING"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lvb/c;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lvb/c;->k:Lvb/c;

    const/4 v7, 0x4

    new-array v7, v7, [Lvb/c;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lvb/c;->l:[Lvb/c;

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

.method public static valueOf(Ljava/lang/String;)Lvb/c;
    .locals 1

    const-class v0, Lvb/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvb/c;

    return-object p0
.end method

.method public static values()[Lvb/c;
    .locals 1

    sget-object v0, Lvb/c;->l:[Lvb/c;

    invoke-virtual {v0}, [Lvb/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvb/c;

    return-object v0
.end method


# virtual methods
.method public b()Z
    .locals 3

    sget-object v0, Lvb/c$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected track status: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return v2

    :cond_2
    return v1
.end method
