.class public final Lb0/f;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source ""


# instance fields
.field public a:I

.field public b:Landroid/graphics/drawable/Drawable$ConstantState;

.field public c:Landroid/content/res/ColorStateList;

.field public d:Landroid/graphics/PorterDuff$Mode;


# direct methods
.method public constructor <init>(Lb0/f;)V
    .locals 1

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lb0/f;->c:Landroid/content/res/ColorStateList;

    sget-object v0, Lb0/d;->n:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lb0/f;->d:Landroid/graphics/PorterDuff$Mode;

    if-eqz p1, :cond_0

    iget v0, p1, Lb0/f;->a:I

    iput v0, p0, Lb0/f;->a:I

    iget-object v0, p1, Lb0/f;->b:Landroid/graphics/drawable/Drawable$ConstantState;

    iput-object v0, p0, Lb0/f;->b:Landroid/graphics/drawable/Drawable$ConstantState;

    iget-object v0, p1, Lb0/f;->c:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lb0/f;->c:Landroid/content/res/ColorStateList;

    iget-object p1, p1, Lb0/f;->d:Landroid/graphics/PorterDuff$Mode;

    iput-object p1, p0, Lb0/f;->d:Landroid/graphics/PorterDuff$Mode;

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lb0/f;->b:Landroid/graphics/drawable/Drawable$ConstantState;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getChangingConfigurations()I
    .locals 2

    iget v0, p0, Lb0/f;->a:I

    iget-object v1, p0, Lb0/f;->b:Landroid/graphics/drawable/Drawable$ConstantState;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable$ConstantState;->getChangingConfigurations()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lb0/f;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    new-instance v0, Lb0/e;

    invoke-direct {v0, p0, p1}, Lb0/e;-><init>(Lb0/f;Landroid/content/res/Resources;)V

    return-object v0

    :cond_0
    new-instance v0, Lb0/d;

    invoke-direct {v0, p0, p1}, Lb0/d;-><init>(Lb0/f;Landroid/content/res/Resources;)V

    return-object v0
.end method
