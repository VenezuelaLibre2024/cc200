.class public Lo6/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo6/d;


# static fields
.field public static final a:Lo6/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo6/g;

    invoke-direct {v0}, Lo6/g;-><init>()V

    sput-object v0, Lo6/g;->a:Lo6/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()Lo6/d;
    .locals 1

    sget-object v0, Lo6/g;->a:Lo6/g;

    return-object v0
.end method


# virtual methods
.method public final a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b()J
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method
