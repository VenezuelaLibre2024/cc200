.class public Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;
.super Ln/c0;
.source ""


# instance fields
.field public final n:F

.field public final o:Landroid/graphics/Rect;

.field public p:Landroid/graphics/Paint;

.field public q:I

.field public r:F

.field public s:Ljava/lang/String;

.field public t:F

.field public u:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ln/c0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p3, 0x3fc00000    # 1.5f

    iput p3, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->n:F

    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->o:Landroid/graphics/Rect;

    sget-object p3, Lqc/i;->U:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->h(Landroid/content/res/TypedArray;)V

    return-void
.end method


# virtual methods
.method public final f(I)V
    .locals 7

    iget-object v0, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->p:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    new-instance v0, Landroid/content/res/ColorStateList;

    const/4 v1, 0x2

    new-array v2, v1, [[I

    const/4 v3, 0x1

    new-array v4, v3, [I

    const v5, 0x10100a1

    const/4 v6, 0x0

    aput v5, v4, v6

    aput-object v4, v2, v6

    new-array v4, v3, [I

    aput v6, v4, v6

    aput-object v4, v2, v3

    new-array v1, v1, [I

    aput p1, v1, v6

    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v4, Lqc/b;->k:I

    invoke-static {p1, v4}, Ly/a;->getColor(Landroid/content/Context;I)I

    move-result p1

    aput p1, v1, v3

    invoke-direct {v0, v2, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public g(Z)F
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->j()V

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->i()V

    :cond_0
    iget p1, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->r:F

    return p1
.end method

.method public final h(Landroid/content/res/TypedArray;)V
    .locals 5

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setGravity(I)V

    sget v1, Lqc/i;->V:I

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->s:Ljava/lang/String;

    sget v1, Lqc/i;->W:I

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->t:F

    sget v1, Lqc/i;->X:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->u:F

    iget v3, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->t:F

    cmpl-float v4, v3, v2

    if-eqz v4, :cond_1

    cmpl-float v4, v1, v2

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    div-float/2addr v3, v1

    iput v3, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->r:F

    goto :goto_1

    :cond_1
    :goto_0
    iput v2, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->r:F

    :goto_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lqc/c;->h:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->q:I

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->p:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->i()V

    invoke-virtual {p0}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lqc/b;->l:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->f(I)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public final i()V
    .locals 4

    iget-object v0, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->s:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->s:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->t:F

    float-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget v3, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->u:F

    float-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "%d:%d"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final j()V
    .locals 2

    iget v0, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->r:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->t:F

    iget v1, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->u:F

    iput v1, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->t:F

    iput v0, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->u:F

    div-float/2addr v1, v0

    iput v1, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->r:F

    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    invoke-super {p0, p1}, Landroid/widget/TextView;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/widget/TextView;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->o:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    iget-object v0, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->o:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->right:I

    iget v2, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    int-to-float v3, v3

    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    div-float/2addr v0, v2

    sub-float/2addr v3, v0

    iget v0, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->q:I

    int-to-float v4, v0

    const/high16 v5, 0x3fc00000    # 1.5f

    mul-float/2addr v4, v5

    sub-float/2addr v3, v4

    int-to-float v0, v0

    div-float/2addr v0, v2

    iget-object v2, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->p:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v3, v0, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public setActiveColor(I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->f(I)V

    invoke-virtual {p0}, Landroid/widget/TextView;->invalidate()V

    return-void
.end method

.method public setAspectRatio(Lsc/a;)V
    .locals 3

    invoke-virtual {p1}, Lsc/a;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->s:Ljava/lang/String;

    invoke-virtual {p1}, Lsc/a;->b()F

    move-result v0

    iput v0, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->t:F

    invoke-virtual {p1}, Lsc/a;->d()F

    move-result p1

    iput p1, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->u:F

    iget v0, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->t:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-eqz v2, :cond_1

    cmpl-float v2, p1, v1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    div-float/2addr v0, p1

    iput v0, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->r:F

    goto :goto_1

    :cond_1
    :goto_0
    iput v1, p0, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->r:F

    :goto_1
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/widget/AspectRatioTextView;->i()V

    return-void
.end method
