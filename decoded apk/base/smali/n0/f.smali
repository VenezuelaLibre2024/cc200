.class public Ln0/f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/f$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/widget/ImageView;)Landroid/content/res/ColorStateList;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Ln0/f$a;->a(Landroid/widget/ImageView;)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Ln0/o;

    if-eqz v0, :cond_1

    check-cast p0, Ln0/o;

    invoke-interface {p0}, Ln0/o;->getSupportImageTintList()Landroid/content/res/ColorStateList;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static b(Landroid/widget/ImageView;)Landroid/graphics/PorterDuff$Mode;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Ln0/f$a;->b(Landroid/widget/ImageView;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Ln0/o;

    if-eqz v0, :cond_1

    check-cast p0, Ln0/o;

    invoke-interface {p0}, Ln0/o;->getSupportImageTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static c(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    invoke-static {p0, p1}, Ln0/f$a;->c(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p0}, Ln0/f$a;->a(Landroid/widget/ImageView;)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_0
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_1
    instance-of v0, p0, Ln0/o;

    if-eqz v0, :cond_2

    check-cast p0, Ln0/o;

    invoke-interface {p0, p1}, Ln0/o;->setSupportImageTintList(Landroid/content/res/ColorStateList;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static d(Landroid/widget/ImageView;Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    invoke-static {p0, p1}, Ln0/f$a;->d(Landroid/widget/ImageView;Landroid/graphics/PorterDuff$Mode;)V

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p0}, Ln0/f$a;->a(Landroid/widget/ImageView;)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_0
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_1
    instance-of v0, p0, Ln0/o;

    if-eqz v0, :cond_2

    check-cast p0, Ln0/o;

    invoke-interface {p0, p1}, Ln0/o;->setSupportImageTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_2
    :goto_0
    return-void
.end method
