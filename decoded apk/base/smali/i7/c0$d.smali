.class public final enum Li7/c0$d;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li7/c0$d;",
        ">;",
        "Ljava/util/Iterator<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Li7/c0$d;

.field public static final synthetic i:[Li7/c0$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Li7/c0$d;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li7/c0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li7/c0$d;->h:Li7/c0$d;

    invoke-static {}, Li7/c0$d;->c()[Li7/c0$d;

    move-result-object v0

    sput-object v0, Li7/c0$d;->i:[Li7/c0$d;

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

.method public static synthetic c()[Li7/c0$d;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Li7/c0$d;

    sget-object v1, Li7/c0$d;->h:Li7/c0$d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Li7/c0$d;
    .locals 1

    const-class v0, Li7/c0$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li7/c0$d;

    return-object p0
.end method

.method public static values()[Li7/c0$d;
    .locals 1

    sget-object v0, Li7/c0$d;->i:[Li7/c0$d;

    invoke-virtual {v0}, [Li7/c0$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li7/c0$d;

    return-object v0
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Li7/i;->c(Z)V

    return-void
.end method
