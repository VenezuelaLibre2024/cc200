.class public final enum Lvb/d;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvb/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lvb/d;

.field public static final enum i:Lvb/d;

.field public static final synthetic j:[Lvb/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lvb/d;

    const-string v1, "VIDEO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lvb/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvb/d;->h:Lvb/d;

    new-instance v1, Lvb/d;

    const-string v3, "AUDIO"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lvb/d;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lvb/d;->i:Lvb/d;

    const/4 v3, 0x2

    new-array v3, v3, [Lvb/d;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lvb/d;->j:[Lvb/d;

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

.method public static valueOf(Ljava/lang/String;)Lvb/d;
    .locals 1

    const-class v0, Lvb/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvb/d;

    return-object p0
.end method

.method public static values()[Lvb/d;
    .locals 1

    sget-object v0, Lvb/d;->j:[Lvb/d;

    invoke-virtual {v0}, [Lvb/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvb/d;

    return-object v0
.end method
