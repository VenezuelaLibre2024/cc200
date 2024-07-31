.class public final Lw6/i;
.super Lf6/d;
.source ""


# direct methods
.method public static b(I)I
    .locals 1

    if-eqz p0, :cond_1

    const/16 v0, 0x3e8

    if-lt p0, v0, :cond_0

    const/16 v0, 0x3ee

    if-ge p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 p0, 0xd

    :cond_1
    :goto_0
    return p0
.end method
