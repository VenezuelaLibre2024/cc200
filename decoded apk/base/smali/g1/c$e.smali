.class public final enum Lg1/c$e;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lg1/c$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lg1/c$e;

.field public static final enum i:Lg1/c$e;

.field public static final enum j:Lg1/c$e;

.field public static final synthetic k:[Lg1/c$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lg1/c$e;

    const-string v1, "PENDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg1/c$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/c$e;->h:Lg1/c$e;

    new-instance v1, Lg1/c$e;

    const-string v3, "RUNNING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lg1/c$e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lg1/c$e;->i:Lg1/c$e;

    new-instance v3, Lg1/c$e;

    const-string v5, "FINISHED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lg1/c$e;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lg1/c$e;->j:Lg1/c$e;

    const/4 v5, 0x3

    new-array v5, v5, [Lg1/c$e;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lg1/c$e;->k:[Lg1/c$e;

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

.method public static valueOf(Ljava/lang/String;)Lg1/c$e;
    .locals 1

    const-class v0, Lg1/c$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg1/c$e;

    return-object p0
.end method

.method public static values()[Lg1/c$e;
    .locals 1

    sget-object v0, Lg1/c$e;->k:[Lg1/c$e;

    invoke-virtual {v0}, [Lg1/c$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg1/c$e;

    return-object v0
.end method
