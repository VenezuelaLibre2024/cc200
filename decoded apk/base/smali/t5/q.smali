.class public final enum Lt5/q;
.super Ljava/lang/Enum;
.source ""


# static fields
.field public static final enum h:Lt5/q;

.field public static final enum i:Lt5/q;

.field public static final enum j:Lt5/q;

.field public static final synthetic k:[Lt5/q;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lt5/q;

    const-string v1, "LEGACY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lt5/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lt5/q;->h:Lt5/q;

    new-instance v1, Lt5/q;

    const-string v3, "AUTH_INSTANTIATION"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lt5/q;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lt5/q;->i:Lt5/q;

    new-instance v3, Lt5/q;

    const-string v5, "CALLER_INSTANTIATION"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lt5/q;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lt5/q;->j:Lt5/q;

    const/4 v5, 0x3

    new-array v5, v5, [Lt5/q;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lt5/q;->k:[Lt5/q;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lt5/q;
    .locals 1

    sget-object v0, Lt5/q;->k:[Lt5/q;

    invoke-virtual {v0}, [Lt5/q;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt5/q;

    return-object v0
.end method
