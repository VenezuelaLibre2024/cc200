.class public Lvc/a;
.super Lvc/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvc/a$b;,
        Lvc/a$a;
    }
.end annotation


# instance fields
.field public final B:Landroid/graphics/RectF;

.field public final C:Landroid/graphics/Matrix;

.field public D:F

.field public E:F

.field public F:Lrc/c;

.field public G:Ljava/lang/Runnable;

.field public H:Ljava/lang/Runnable;

.field public I:F

.field public J:F

.field public K:I

.field public L:I

.field public M:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lvc/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lvc/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lvc/a;->B:Landroid/graphics/RectF;

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lvc/a;->C:Landroid/graphics/Matrix;

    const/high16 p1, 0x41200000    # 10.0f

    iput p1, p0, Lvc/a;->E:F

    const/4 p1, 0x0

    iput-object p1, p0, Lvc/a;->H:Ljava/lang/Runnable;

    const/4 p1, 0x0

    iput p1, p0, Lvc/a;->K:I

    iput p1, p0, Lvc/a;->L:I

    const-wide/16 p1, 0x1f4

    iput-wide p1, p0, Lvc/a;->M:J

    return-void
.end method

.method public static synthetic r(Lvc/a;)Landroid/graphics/RectF;
    .locals 0

    iget-object p0, p0, Lvc/a;->B:Landroid/graphics/RectF;

    return-object p0
.end method


# virtual methods
.method public A(Landroid/content/res/TypedArray;)V
    .locals 3

    sget v0, Lqc/i;->Z:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    sget v2, Lqc/i;->a0:I

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpl-float v2, v0, v1

    if-eqz v2, :cond_1

    cmpl-float v2, p1, v1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    div-float/2addr v0, p1

    iput v0, p0, Lvc/a;->D:F

    goto :goto_1

    :cond_1
    :goto_0
    iput v1, p0, Lvc/a;->D:F

    :goto_1
    return-void
.end method

.method public B()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lvc/a;->setImageToWrapCropBounds(Z)V

    return-void
.end method

.method public final C(FF)V
    .locals 5

    iget-object v0, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget-object v1, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    iget-object v2, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    div-float/2addr v2, p1

    iget-object v3, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    div-float/2addr v3, p2

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    mul-float/2addr p1, v2

    sub-float/2addr v0, p1

    const/high16 p1, 0x40000000    # 2.0f

    div-float/2addr v0, p1

    iget-object v3, p0, Lvc/a;->B:Landroid/graphics/RectF;

    iget v4, v3, Landroid/graphics/RectF;->left:F

    add-float/2addr v0, v4

    mul-float/2addr p2, v2

    sub-float/2addr v1, p2

    div-float/2addr v1, p1

    iget p1, v3, Landroid/graphics/RectF;->top:F

    add-float/2addr v1, p1

    iget-object p1, p0, Lvc/b;->n:Landroid/graphics/Matrix;

    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    iget-object p1, p0, Lvc/b;->n:Landroid/graphics/Matrix;

    invoke-virtual {p1, v2, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    iget-object p1, p0, Lvc/b;->n:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    iget-object p1, p0, Lvc/b;->n:Landroid/graphics/Matrix;

    invoke-virtual {p0, p1}, Lvc/b;->setImageMatrix(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public D(FFFJ)V
    .locals 8

    invoke-virtual {p0}, Lvc/a;->getMaxScale()F

    move-result v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lvc/a;->getMaxScale()F

    move-result p1

    :cond_0
    invoke-virtual {p0}, Lvc/b;->getCurrentScale()F

    move-result v4

    sub-float v5, p1, v4

    new-instance p1, Lvc/a$b;

    move-object v0, p1

    move-object v1, p0

    move-wide v2, p4

    move v6, p2

    move v7, p3

    invoke-direct/range {v0 .. v7}, Lvc/a$b;-><init>(Lvc/a;JFFFF)V

    iput-object p1, p0, Lvc/a;->H:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public E(F)V
    .locals 2

    iget-object v0, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget-object v1, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lvc/a;->F(FFF)V

    return-void
.end method

.method public F(FFF)V
    .locals 1

    invoke-virtual {p0}, Lvc/a;->getMaxScale()F

    move-result v0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Lvc/b;->getCurrentScale()F

    move-result v0

    div-float/2addr p1, v0

    invoke-virtual {p0, p1, p2, p3}, Lvc/a;->n(FFF)V

    :cond_0
    return-void
.end method

.method public G(F)V
    .locals 2

    iget-object v0, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget-object v1, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lvc/a;->H(FFF)V

    return-void
.end method

.method public H(FFF)V
    .locals 1

    invoke-virtual {p0}, Lvc/a;->getMinScale()F

    move-result v0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lvc/b;->getCurrentScale()F

    move-result v0

    div-float/2addr p1, v0

    invoke-virtual {p0, p1, p2, p3}, Lvc/a;->n(FFF)V

    :cond_0
    return-void
.end method

.method public getCropBoundsChangeListener()Lrc/c;
    .locals 1

    iget-object v0, p0, Lvc/a;->F:Lrc/c;

    return-object v0
.end method

.method public getMaxScale()F
    .locals 1

    iget v0, p0, Lvc/a;->I:F

    return v0
.end method

.method public getMinScale()F
    .locals 1

    iget v0, p0, Lvc/a;->J:F

    return v0
.end method

.method public getTargetAspectRatio()F
    .locals 1

    iget v0, p0, Lvc/a;->D:F

    return v0
.end method

.method public l()V
    .locals 8

    invoke-super {p0}, Lvc/b;->l()V

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    iget v2, p0, Lvc/a;->D:F

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-nez v2, :cond_1

    div-float v2, v1, v0

    iput v2, p0, Lvc/a;->D:F

    :cond_1
    iget v2, p0, Lvc/b;->o:I

    int-to-float v4, v2

    iget v5, p0, Lvc/a;->D:F

    div-float/2addr v4, v5

    float-to-int v4, v4

    iget v6, p0, Lvc/b;->p:I

    if-le v4, v6, :cond_2

    int-to-float v4, v6

    mul-float/2addr v4, v5

    float-to-int v4, v4

    sub-int/2addr v2, v4

    div-int/lit8 v2, v2, 0x2

    iget-object v5, p0, Lvc/a;->B:Landroid/graphics/RectF;

    int-to-float v7, v2

    add-int/2addr v4, v2

    int-to-float v2, v4

    int-to-float v4, v6

    invoke-virtual {v5, v7, v3, v2, v4}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_0

    :cond_2
    sub-int/2addr v6, v4

    div-int/lit8 v6, v6, 0x2

    iget-object v5, p0, Lvc/a;->B:Landroid/graphics/RectF;

    int-to-float v7, v6

    int-to-float v2, v2

    add-int/2addr v4, v6

    int-to-float v4, v4

    invoke-virtual {v5, v3, v7, v2, v4}, Landroid/graphics/RectF;->set(FFFF)V

    :goto_0
    invoke-virtual {p0, v1, v0}, Lvc/a;->u(FF)V

    invoke-virtual {p0, v1, v0}, Lvc/a;->C(FF)V

    iget-object v0, p0, Lvc/a;->F:Lrc/c;

    if-eqz v0, :cond_3

    iget v1, p0, Lvc/a;->D:F

    invoke-interface {v0, v1}, Lrc/c;->a(F)V

    :cond_3
    iget-object v0, p0, Lvc/b;->q:Lvc/b$b;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lvc/b;->getCurrentScale()F

    move-result v1

    invoke-interface {v0, v1}, Lvc/b$b;->d(F)V

    iget-object v0, p0, Lvc/b;->q:Lvc/b$b;

    invoke-virtual {p0}, Lvc/b;->getCurrentAngle()F

    move-result v1

    invoke-interface {v0, v1}, Lvc/b$b;->a(F)V

    :cond_4
    return-void
.end method

.method public n(FFF)V
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    if-lez v1, :cond_0

    invoke-virtual {p0}, Lvc/b;->getCurrentScale()F

    move-result v1

    mul-float/2addr v1, p1

    invoke-virtual {p0}, Lvc/a;->getMaxScale()F

    move-result v2

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_0

    :goto_0
    invoke-super {p0, p1, p2, p3}, Lvc/b;->n(FFF)V

    goto :goto_1

    :cond_0
    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    invoke-virtual {p0}, Lvc/b;->getCurrentScale()F

    move-result v0

    mul-float/2addr v0, p1

    invoke-virtual {p0}, Lvc/a;->getMinScale()F

    move-result v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final s()[F
    .locals 7

    iget-object v0, p0, Lvc/a;->C:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    iget-object v0, p0, Lvc/a;->C:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lvc/b;->getCurrentAngle()F

    move-result v1

    neg-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->setRotate(F)V

    iget-object v0, p0, Lvc/b;->k:[F

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v0

    iget-object v1, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-static {v1}, Luc/g;->b(Landroid/graphics/RectF;)[F

    move-result-object v1

    iget-object v2, p0, Lvc/a;->C:Landroid/graphics/Matrix;

    invoke-virtual {v2, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    iget-object v2, p0, Lvc/a;->C:Landroid/graphics/Matrix;

    invoke-virtual {v2, v1}, Landroid/graphics/Matrix;->mapPoints([F)V

    invoke-static {v0}, Luc/g;->d([F)Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v1}, Luc/g;->d([F)Landroid/graphics/RectF;

    move-result-object v1

    iget v2, v0, Landroid/graphics/RectF;->left:F

    iget v3, v1, Landroid/graphics/RectF;->left:F

    sub-float/2addr v2, v3

    iget v3, v0, Landroid/graphics/RectF;->top:F

    iget v4, v1, Landroid/graphics/RectF;->top:F

    sub-float/2addr v3, v4

    iget v4, v0, Landroid/graphics/RectF;->right:F

    iget v5, v1, Landroid/graphics/RectF;->right:F

    sub-float/2addr v4, v5

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v1

    const/4 v1, 0x4

    new-array v1, v1, [F

    const/4 v5, 0x0

    cmpl-float v6, v2, v5

    if-lez v6, :cond_0

    goto :goto_0

    :cond_0
    move v2, v5

    :goto_0
    const/4 v6, 0x0

    aput v2, v1, v6

    const/4 v2, 0x1

    cmpl-float v6, v3, v5

    if-lez v6, :cond_1

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_1
    aput v3, v1, v2

    const/4 v2, 0x2

    cmpg-float v3, v4, v5

    if-gez v3, :cond_2

    goto :goto_2

    :cond_2
    move v4, v5

    :goto_2
    aput v4, v1, v2

    const/4 v2, 0x3

    cmpg-float v3, v0, v5

    if-gez v3, :cond_3

    goto :goto_3

    :cond_3
    move v0, v5

    :goto_3
    aput v0, v1, v2

    iget-object v0, p0, Lvc/a;->C:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    iget-object v0, p0, Lvc/a;->C:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lvc/b;->getCurrentAngle()F

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->setRotate(F)V

    iget-object v0, p0, Lvc/a;->C:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapPoints([F)V

    return-object v1
.end method

.method public setCropBoundsChangeListener(Lrc/c;)V
    .locals 0

    iput-object p1, p0, Lvc/a;->F:Lrc/c;

    return-void
.end method

.method public setCropRect(Landroid/graphics/RectF;)V
    .locals 5

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v1

    div-float/2addr v0, v1

    iput v0, p0, Lvc/a;->D:F

    iget-object v0, p0, Lvc/a;->B:Landroid/graphics/RectF;

    iget v1, p1, Landroid/graphics/RectF;->left:F

    invoke-virtual {p0}, Landroid/widget/ImageView;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iget v2, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0}, Landroid/widget/ImageView;->getPaddingTop()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget v3, p1, Landroid/graphics/RectF;->right:F

    invoke-virtual {p0}, Landroid/widget/ImageView;->getPaddingRight()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v3, v4

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0}, Landroid/widget/ImageView;->getPaddingBottom()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr p1, v4

    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {p0}, Lvc/a;->t()V

    invoke-virtual {p0}, Lvc/a;->B()V

    return-void
.end method

.method public setImageToWrapCropBounds(Z)V
    .locals 13

    iget-boolean v0, p0, Lvc/b;->u:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lvc/a;->x()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lvc/b;->l:[F

    const/4 v1, 0x0

    aget v6, v0, v1

    const/4 v2, 0x1

    aget v7, v0, v2

    invoke-virtual {p0}, Lvc/b;->getCurrentScale()F

    move-result v10

    iget-object v0, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    sub-float/2addr v0, v6

    iget-object v3, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    sub-float/2addr v3, v7

    const/4 v4, 0x0

    iget-object v5, p0, Lvc/a;->C:Landroid/graphics/Matrix;

    invoke-virtual {v5}, Landroid/graphics/Matrix;->reset()V

    iget-object v5, p0, Lvc/a;->C:Landroid/graphics/Matrix;

    invoke-virtual {v5, v0, v3}, Landroid/graphics/Matrix;->setTranslate(FF)V

    iget-object v5, p0, Lvc/b;->k:[F

    array-length v8, v5

    invoke-static {v5, v8}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v5

    iget-object v8, p0, Lvc/a;->C:Landroid/graphics/Matrix;

    invoke-virtual {v8, v5}, Landroid/graphics/Matrix;->mapPoints([F)V

    invoke-virtual {p0, v5}, Lvc/a;->y([F)Z

    move-result v12

    if-eqz v12, :cond_0

    invoke-virtual {p0}, Lvc/a;->s()[F

    move-result-object v0

    aget v1, v0, v1

    const/4 v3, 0x2

    aget v3, v0, v3

    add-float/2addr v1, v3

    neg-float v1, v1

    aget v2, v0, v2

    const/4 v3, 0x3

    aget v0, v0, v3

    add-float/2addr v2, v0

    neg-float v0, v2

    move v9, v0

    move v8, v1

    move v11, v4

    goto :goto_0

    :cond_0
    new-instance v4, Landroid/graphics/RectF;

    iget-object v5, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-direct {v4, v5}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    iget-object v5, p0, Lvc/a;->C:Landroid/graphics/Matrix;

    invoke-virtual {v5}, Landroid/graphics/Matrix;->reset()V

    iget-object v5, p0, Lvc/a;->C:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lvc/b;->getCurrentAngle()F

    move-result v8

    invoke-virtual {v5, v8}, Landroid/graphics/Matrix;->setRotate(F)V

    iget-object v5, p0, Lvc/a;->C:Landroid/graphics/Matrix;

    invoke-virtual {v5, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget-object v5, p0, Lvc/b;->k:[F

    invoke-static {v5}, Luc/g;->c([F)[F

    move-result-object v5

    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v8

    aget v1, v5, v1

    div-float/2addr v8, v1

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v1

    aget v2, v5, v2

    div-float/2addr v1, v2

    invoke-static {v8, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    mul-float/2addr v1, v10

    sub-float/2addr v1, v10

    move v8, v0

    move v11, v1

    move v9, v3

    :goto_0
    if-eqz p1, :cond_1

    new-instance p1, Lvc/a$a;

    iget-wide v4, p0, Lvc/a;->M:J

    move-object v2, p1

    move-object v3, p0

    invoke-direct/range {v2 .. v12}, Lvc/a$a;-><init>(Lvc/a;JFFFFFFZ)V

    iput-object p1, p0, Lvc/a;->G:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v8, v9}, Lvc/b;->o(FF)V

    if-nez v12, :cond_2

    add-float/2addr v10, v11

    iget-object p1, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    move-result p1

    iget-object v0, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    move-result v0

    invoke-virtual {p0, v10, p1, v0}, Lvc/a;->F(FFF)V

    :cond_2
    :goto_1
    return-void
.end method

.method public setImageToWrapCropBoundsAnimDuration(J)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    iput-wide p1, p0, Lvc/a;->M:J

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Animation duration cannot be negative value."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setMaxResultImageSizeX(I)V
    .locals 0

    iput p1, p0, Lvc/a;->K:I

    return-void
.end method

.method public setMaxResultImageSizeY(I)V
    .locals 0

    iput p1, p0, Lvc/a;->L:I

    return-void
.end method

.method public setMaxScaleMultiplier(F)V
    .locals 0

    iput p1, p0, Lvc/a;->E:F

    return-void
.end method

.method public setTargetAspectRatio(F)V
    .locals 2

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    iput p1, p0, Lvc/a;->D:F

    return-void

    :cond_0
    const/4 v1, 0x0

    cmpl-float v1, p1, v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    :cond_1
    iput p1, p0, Lvc/a;->D:F

    iget-object p1, p0, Lvc/a;->F:Lrc/c;

    if-eqz p1, :cond_2

    iget v0, p0, Lvc/a;->D:F

    invoke-interface {p1, v0}, Lrc/c;->a(F)V

    :cond_2
    return-void
.end method

.method public final t()V
    .locals 2

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v1, v0}, Lvc/a;->u(FF)V

    return-void
.end method

.method public final u(FF)V
    .locals 2

    iget-object v0, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    div-float/2addr v0, p1

    iget-object v1, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    div-float/2addr v1, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iget-object v1, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    div-float/2addr v1, p2

    iget-object p2, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result p2

    div-float/2addr p2, p1

    invoke-static {v1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    iput p1, p0, Lvc/a;->J:F

    iget p2, p0, Lvc/a;->E:F

    mul-float/2addr p1, p2

    iput p1, p0, Lvc/a;->I:F

    return-void
.end method

.method public v()V
    .locals 1

    iget-object v0, p0, Lvc/a;->G:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lvc/a;->H:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public w(Landroid/graphics/Bitmap$CompressFormat;ILrc/a;)V
    .locals 15

    move-object v0, p0

    invoke-virtual {p0}, Lvc/a;->v()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lvc/a;->setImageToWrapCropBounds(Z)V

    new-instance v5, Lsc/d;

    iget-object v2, v0, Lvc/a;->B:Landroid/graphics/RectF;

    iget-object v3, v0, Lvc/b;->k:[F

    invoke-static {v3}, Luc/g;->d([F)Landroid/graphics/RectF;

    move-result-object v3

    invoke-virtual {p0}, Lvc/b;->getCurrentScale()F

    move-result v4

    invoke-virtual {p0}, Lvc/b;->getCurrentAngle()F

    move-result v6

    invoke-direct {v5, v2, v3, v4, v6}, Lsc/d;-><init>(Landroid/graphics/RectF;Landroid/graphics/RectF;FF)V

    new-instance v6, Lsc/b;

    iget v8, v0, Lvc/a;->K:I

    iget v9, v0, Lvc/a;->L:I

    invoke-virtual {p0}, Lvc/b;->getImageInputPath()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {p0}, Lvc/b;->getImageOutputPath()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {p0}, Lvc/b;->getExifInfo()Lsc/c;

    move-result-object v14

    move-object v7, v6

    move-object/from16 v10, p1

    move/from16 v11, p2

    invoke-direct/range {v7 .. v14}, Lsc/b;-><init>(IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;Lsc/c;)V

    invoke-virtual {p0}, Lvc/b;->getImageInputUri()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v6, v2}, Lsc/b;->j(Landroid/net/Uri;)V

    invoke-virtual {p0}, Lvc/b;->getImageOutputUri()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v6, v2}, Lsc/b;->k(Landroid/net/Uri;)V

    new-instance v8, Ltc/a;

    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {p0}, Lvc/b;->getViewBitmap()Landroid/graphics/Bitmap;

    move-result-object v4

    move-object v2, v8

    move-object/from16 v7, p3

    invoke-direct/range {v2 .. v7}, Ltc/a;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;Lsc/d;Lsc/b;Lrc/a;)V

    sget-object v2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v8, v2, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public x()Z
    .locals 1

    iget-object v0, p0, Lvc/b;->k:[F

    invoke-virtual {p0, v0}, Lvc/a;->y([F)Z

    move-result v0

    return v0
.end method

.method public y([F)Z
    .locals 2

    iget-object v0, p0, Lvc/a;->C:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    iget-object v0, p0, Lvc/a;->C:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lvc/b;->getCurrentAngle()F

    move-result v1

    neg-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->setRotate(F)V

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object p1

    iget-object v0, p0, Lvc/a;->C:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->mapPoints([F)V

    iget-object v0, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-static {v0}, Luc/g;->b(Landroid/graphics/RectF;)[F

    move-result-object v0

    iget-object v1, p0, Lvc/a;->C:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    invoke-static {p1}, Luc/g;->d([F)Landroid/graphics/RectF;

    move-result-object p1

    invoke-static {v0}, Luc/g;->d([F)Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/RectF;->contains(Landroid/graphics/RectF;)Z

    move-result p1

    return p1
.end method

.method public z(F)V
    .locals 2

    iget-object v0, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget-object v1, p0, Lvc/a;->B:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lvc/b;->m(FFF)V

    return-void
.end method
