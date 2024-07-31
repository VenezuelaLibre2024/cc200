.class public Lgc/b;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(III)J
    .locals 4

    mul-int/lit8 p1, p1, 0x2

    mul-int/2addr p1, p2

    int-to-long v0, p0

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    int-to-long p0, p1

    div-long/2addr v0, p0

    return-wide v0
.end method

.method public static b(III)J
    .locals 0

    mul-int/lit8 p0, p0, 0x2

    invoke-static {p0, p1, p2}, Lgc/b;->a(III)J

    move-result-wide p0

    return-wide p0
.end method
