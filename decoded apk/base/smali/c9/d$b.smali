.class public final enum Lc9/d$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc9/d$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lc9/d$b;

.field public static final enum i:Lc9/d$b;

.field public static final synthetic j:[Lc9/d$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lc9/d$b;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc9/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc9/d$b;->h:Lc9/d$b;

    new-instance v1, Lc9/d$b;

    const-string v3, "BAD_CONFIG"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lc9/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lc9/d$b;->i:Lc9/d$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lc9/d$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lc9/d$b;->j:[Lc9/d$b;

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

.method public static valueOf(Ljava/lang/String;)Lc9/d$b;
    .locals 1

    const-class v0, Lc9/d$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc9/d$b;

    return-object p0
.end method

.method public static values()[Lc9/d$b;
    .locals 1

    sget-object v0, Lc9/d$b;->j:[Lc9/d$b;

    invoke-virtual {v0}, [Lc9/d$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc9/d$b;

    return-object v0
.end method
