.class public Landroidx/appcompat/widget/d$d;
.super Landroid/widget/LinearLayout;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final h:[I

.field public i:Lh/a$c;

.field public j:Landroid/widget/TextView;

.field public k:Landroid/widget/ImageView;

.field public l:Landroid/view/View;

.field public final synthetic m:Landroidx/appcompat/widget/d;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/d;Landroid/content/Context;Lh/a$c;Z)V
    .locals 4

    iput-object p1, p0, Landroidx/appcompat/widget/d$d;->m:Landroidx/appcompat/widget/d;

    sget p1, Lg/a;->d:I

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v1, 0x1

    new-array v1, v1, [I

    const v2, 0x10100d4

    const/4 v3, 0x0

    aput v2, v1, v3

    iput-object v1, p0, Landroidx/appcompat/widget/d$d;->h:[I

    iput-object p3, p0, Landroidx/appcompat/widget/d$d;->i:Lh/a$c;

    invoke-static {p2, v0, v1, p1, v3}, Ln/w0;->u(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ln/w0;

    move-result-object p1

    invoke-virtual {p1, v3}, Ln/w0;->r(I)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1, v3}, Ln/w0;->f(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    invoke-virtual {p1}, Ln/w0;->v()V

    if-eqz p4, :cond_1

    const p1, 0x800013

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setGravity(I)V

    :cond_1
    invoke-virtual {p0}, Landroidx/appcompat/widget/d$d;->c()V

    return-void
.end method


# virtual methods
.method public a(Lh/a$c;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/d$d;->i:Lh/a$c;

    invoke-virtual {p0}, Landroidx/appcompat/widget/d$d;->c()V

    return-void
.end method

.method public b()Lh/a$c;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/d$d;->i:Lh/a$c;

    return-object v0
.end method

.method public c()V
    .locals 10

    iget-object v0, p0, Landroidx/appcompat/widget/d$d;->i:Lh/a$c;

    invoke-virtual {v0}, Lh/a$c;->b()Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p0, :cond_1

    if-eqz v0, :cond_0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    :cond_1
    iput-object v1, p0, Landroidx/appcompat/widget/d$d;->l:Landroid/view/View;

    iget-object v0, p0, Landroidx/appcompat/widget/d$d;->j:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_2
    iget-object v0, p0, Landroidx/appcompat/widget/d$d;->k:Landroid/widget/ImageView;

    if-eqz v0, :cond_d

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/d$d;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_3

    :cond_3
    iget-object v1, p0, Landroidx/appcompat/widget/d$d;->l:Landroid/view/View;

    if-eqz v1, :cond_4

    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    iput-object v3, p0, Landroidx/appcompat/widget/d$d;->l:Landroid/view/View;

    :cond_4
    invoke-virtual {v0}, Lh/a$c;->c()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0}, Lh/a$c;->d()Ljava/lang/CharSequence;

    move-result-object v4

    const/16 v5, 0x10

    const/4 v6, 0x0

    const/4 v7, -0x2

    if-eqz v1, :cond_6

    iget-object v8, p0, Landroidx/appcompat/widget/d$d;->k:Landroid/widget/ImageView;

    if-nez v8, :cond_5

    new-instance v8, Ln/q;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-direct {v8, v9}, Ln/q;-><init>(Landroid/content/Context;)V

    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v9, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v5, v9, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-virtual {v8, v9}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0, v8, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    iput-object v8, p0, Landroidx/appcompat/widget/d$d;->k:Landroid/widget/ImageView;

    :cond_5
    iget-object v8, p0, Landroidx/appcompat/widget/d$d;->k:Landroid/widget/ImageView;

    invoke-virtual {v8, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Landroidx/appcompat/widget/d$d;->k:Landroid/widget/ImageView;

    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :cond_6
    iget-object v1, p0, Landroidx/appcompat/widget/d$d;->k:Landroid/widget/ImageView;

    if-eqz v1, :cond_7

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, p0, Landroidx/appcompat/widget/d$d;->k:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_7
    :goto_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_9

    iget-object v2, p0, Landroidx/appcompat/widget/d$d;->j:Landroid/widget/TextView;

    if-nez v2, :cond_8

    new-instance v2, Ln/c0;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v8

    sget v9, Lg/a;->e:I

    invoke-direct {v2, v8, v3, v9}, Ln/c0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sget-object v8, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v8, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v5, v8, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    iput-object v2, p0, Landroidx/appcompat/widget/d$d;->j:Landroid/widget/TextView;

    :cond_8
    iget-object v2, p0, Landroidx/appcompat/widget/d$d;->j:Landroid/widget/TextView;

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Landroidx/appcompat/widget/d$d;->j:Landroid/widget/TextView;

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    :cond_9
    iget-object v4, p0, Landroidx/appcompat/widget/d$d;->j:Landroid/widget/TextView;

    if-eqz v4, :cond_a

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v2, p0, Landroidx/appcompat/widget/d$d;->j:Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_a
    :goto_1
    iget-object v2, p0, Landroidx/appcompat/widget/d$d;->k:Landroid/widget/ImageView;

    if-eqz v2, :cond_b

    invoke-virtual {v0}, Lh/a$c;->a()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_b
    if-eqz v1, :cond_c

    goto :goto_2

    :cond_c
    invoke-virtual {v0}, Lh/a$c;->a()Ljava/lang/CharSequence;

    move-result-object v3

    :goto_2
    invoke-static {p0, v3}, Ln/y0;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    :cond_d
    :goto_3
    return-void
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const-string v0, "androidx.appcompat.app.ActionBar$Tab"

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const-string v0, "androidx.appcompat.app.ActionBar$Tab"

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    iget-object p1, p0, Landroidx/appcompat/widget/d$d;->m:Landroidx/appcompat/widget/d;

    iget p1, p1, Landroidx/appcompat/widget/d;->m:I

    if-lez p1, :cond_0

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result p1

    iget-object v0, p0, Landroidx/appcompat/widget/d$d;->m:Landroidx/appcompat/widget/d;

    iget v0, v0, Landroidx/appcompat/widget/d;->m:I

    if-le p1, v0, :cond_0

    const/high16 p1, 0x40000000    # 2.0f

    invoke-static {v0, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    :cond_0
    return-void
.end method

.method public setSelected(Z)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->isSelected()Z

    move-result v0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setSelected(Z)V

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    const/4 p1, 0x4

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->sendAccessibilityEvent(I)V

    :cond_1
    return-void
.end method
