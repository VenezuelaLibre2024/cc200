.class public final enum Lt7/m$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt7/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lt7/m$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lt7/m$b;

.field public static final enum i:Lt7/m$b;

.field public static final synthetic j:[Lt7/m$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lt7/m$b;

    const-string v1, "DEFAULT_APP_CHECK_TOKEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lt7/m$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lt7/m$b;->h:Lt7/m$b;

    new-instance v1, Lt7/m$b;

    const-string v3, "UNKNOWN_APP_CHECK_TOKEN"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lt7/m$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lt7/m$b;->i:Lt7/m$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lt7/m$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lt7/m$b;->j:[Lt7/m$b;

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

.method public static valueOf(Ljava/lang/String;)Lt7/m$b;
    .locals 1

    const-class v0, Lt7/m$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lt7/m$b;

    return-object p0
.end method

.method public static values()[Lt7/m$b;
    .locals 1

    sget-object v0, Lt7/m$b;->j:[Lt7/m$b;

    invoke-virtual {v0}, [Lt7/m$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt7/m$b;

    return-object v0
.end method
