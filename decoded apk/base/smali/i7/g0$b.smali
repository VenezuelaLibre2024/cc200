.class public abstract enum Li7/g0$b;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lh7/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li7/g0$b;",
        ">;",
        "Lh7/g<",
        "Ljava/util/Map$Entry<",
        "**>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Li7/g0$b;

.field public static final enum i:Li7/g0$b;

.field public static final synthetic j:[Li7/g0$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Li7/g0$b$a;

    const-string v1, "KEY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li7/g0$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li7/g0$b;->h:Li7/g0$b;

    new-instance v0, Li7/g0$b$b;

    const-string v1, "VALUE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Li7/g0$b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li7/g0$b;->i:Li7/g0$b;

    invoke-static {}, Li7/g0$b;->b()[Li7/g0$b;

    move-result-object v0

    sput-object v0, Li7/g0$b;->j:[Li7/g0$b;

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

.method public synthetic constructor <init>(Ljava/lang/String;ILi7/f0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li7/g0$b;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic b()[Li7/g0$b;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Li7/g0$b;

    sget-object v1, Li7/g0$b;->h:Li7/g0$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Li7/g0$b;->i:Li7/g0$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Li7/g0$b;
    .locals 1

    const-class v0, Li7/g0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li7/g0$b;

    return-object p0
.end method

.method public static values()[Li7/g0$b;
    .locals 1

    sget-object v0, Li7/g0$b;->j:[Li7/g0$b;

    invoke-virtual {v0}, [Li7/g0$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li7/g0$b;

    return-object v0
.end method
