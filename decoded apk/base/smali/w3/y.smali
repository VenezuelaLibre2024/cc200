.class public final Lw3/y;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw3/y$c;,
        Lw3/y$b;,
        Lw3/y$a;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/Exception;I)I
    .locals 5

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lw3/y$b;->a(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Lw3/y$b;->b(Ljava/lang/Throwable;)I

    move-result p0

    return p0

    :cond_0
    const/16 v1, 0x17

    const/16 v2, 0x1776

    if-lt v0, v1, :cond_1

    invoke-static {p0}, Lw3/y$c;->a(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    const/16 v1, 0x1772

    const/16 v3, 0x12

    if-lt v0, v3, :cond_2

    invoke-static {p0}, Lw3/y$a;->b(Ljava/lang/Throwable;)Z

    move-result v4

    if-eqz v4, :cond_2

    return v1

    :cond_2
    if-lt v0, v3, :cond_3

    invoke-static {p0}, Lw3/y$a;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 p0, 0x1777

    return p0

    :cond_3
    instance-of v0, p0, Lw3/k0;

    if-eqz v0, :cond_4

    const/16 p0, 0x1771

    return p0

    :cond_4
    instance-of v0, p0, Lw3/h$e;

    if-eqz v0, :cond_5

    const/16 p0, 0x1773

    return p0

    :cond_5
    instance-of p0, p0, Lw3/h0;

    if-eqz p0, :cond_6

    const/16 p0, 0x1778

    return p0

    :cond_6
    const/4 p0, 0x1

    if-ne p1, p0, :cond_7

    return v2

    :cond_7
    const/4 p0, 0x2

    if-ne p1, p0, :cond_8

    const/16 p0, 0x1774

    return p0

    :cond_8
    const/4 p0, 0x3

    if-ne p1, p0, :cond_9

    return v1

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method
