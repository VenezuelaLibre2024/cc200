.class public final Lk0/h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk0/h$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/view/ViewGroup$MarginLayoutParams;)I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lk0/h$a;->b(Landroid/view/ViewGroup$MarginLayoutParams;)I

    move-result p0

    return p0

    :cond_0
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    return p0
.end method

.method public static b(Landroid/view/ViewGroup$MarginLayoutParams;)I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lk0/h$a;->c(Landroid/view/ViewGroup$MarginLayoutParams;)I

    move-result p0

    return p0

    :cond_0
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    return p0
.end method
