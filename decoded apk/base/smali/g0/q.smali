.class public Lg0/q;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/q$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lg0/q$a;->a(Landroid/content/Context;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method