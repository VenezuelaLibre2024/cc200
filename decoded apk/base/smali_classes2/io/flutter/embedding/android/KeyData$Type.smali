.class public final enum Lio/flutter/embedding/android/KeyData$Type;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/android/KeyData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/embedding/android/KeyData$Type;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/flutter/embedding/android/KeyData$Type;

.field public static final enum kDown:Lio/flutter/embedding/android/KeyData$Type;

.field public static final enum kRepeat:Lio/flutter/embedding/android/KeyData$Type;

.field public static final enum kUp:Lio/flutter/embedding/android/KeyData$Type;


# instance fields
.field private value:J


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lio/flutter/embedding/android/KeyData$Type;

    const-string v1, "kDown"

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lio/flutter/embedding/android/KeyData$Type;-><init>(Ljava/lang/String;IJ)V

    sput-object v0, Lio/flutter/embedding/android/KeyData$Type;->kDown:Lio/flutter/embedding/android/KeyData$Type;

    new-instance v1, Lio/flutter/embedding/android/KeyData$Type;

    const-string v3, "kUp"

    const/4 v4, 0x1

    const-wide/16 v5, 0x1

    invoke-direct {v1, v3, v4, v5, v6}, Lio/flutter/embedding/android/KeyData$Type;-><init>(Ljava/lang/String;IJ)V

    sput-object v1, Lio/flutter/embedding/android/KeyData$Type;->kUp:Lio/flutter/embedding/android/KeyData$Type;

    new-instance v3, Lio/flutter/embedding/android/KeyData$Type;

    const-string v5, "kRepeat"

    const/4 v6, 0x2

    const-wide/16 v7, 0x2

    invoke-direct {v3, v5, v6, v7, v8}, Lio/flutter/embedding/android/KeyData$Type;-><init>(Ljava/lang/String;IJ)V

    sput-object v3, Lio/flutter/embedding/android/KeyData$Type;->kRepeat:Lio/flutter/embedding/android/KeyData$Type;

    const/4 v5, 0x3

    new-array v5, v5, [Lio/flutter/embedding/android/KeyData$Type;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lio/flutter/embedding/android/KeyData$Type;->$VALUES:[Lio/flutter/embedding/android/KeyData$Type;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, Lio/flutter/embedding/android/KeyData$Type;->value:J

    return-void
.end method

.method public static fromLong(J)Lio/flutter/embedding/android/KeyData$Type;
    .locals 0

    long-to-int p0, p0

    if-eqz p0, :cond_2

    const/4 p1, 0x1

    if-eq p0, p1, :cond_1

    const/4 p1, 0x2

    if-ne p0, p1, :cond_0

    sget-object p0, Lio/flutter/embedding/android/KeyData$Type;->kRepeat:Lio/flutter/embedding/android/KeyData$Type;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "Unexpected Type value"

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_1
    sget-object p0, Lio/flutter/embedding/android/KeyData$Type;->kUp:Lio/flutter/embedding/android/KeyData$Type;

    return-object p0

    :cond_2
    sget-object p0, Lio/flutter/embedding/android/KeyData$Type;->kDown:Lio/flutter/embedding/android/KeyData$Type;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/embedding/android/KeyData$Type;
    .locals 1

    const-class v0, Lio/flutter/embedding/android/KeyData$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/embedding/android/KeyData$Type;

    return-object p0
.end method

.method public static values()[Lio/flutter/embedding/android/KeyData$Type;
    .locals 1

    sget-object v0, Lio/flutter/embedding/android/KeyData$Type;->$VALUES:[Lio/flutter/embedding/android/KeyData$Type;

    invoke-virtual {v0}, [Lio/flutter/embedding/android/KeyData$Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/embedding/android/KeyData$Type;

    return-object v0
.end method


# virtual methods
.method public getValue()J
    .locals 2

    iget-wide v0, p0, Lio/flutter/embedding/android/KeyData$Type;->value:J

    return-wide v0
.end method
