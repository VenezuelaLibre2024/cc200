.class public Ln/k0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln/k0$c;,
        Ln/k0$d;,
        Ln/k0$g;,
        Ln/k0$h;,
        Ln/k0$i;,
        Ln/k0$e;,
        Ln/k0$f;
    }
.end annotation


# static fields
.field public static N:Ljava/lang/reflect/Method;

.field public static O:Ljava/lang/reflect/Method;

.field public static P:Ljava/lang/reflect/Method;


# instance fields
.field public A:Landroid/graphics/drawable/Drawable;

.field public B:Landroid/widget/AdapterView$OnItemClickListener;

.field public C:Landroid/widget/AdapterView$OnItemSelectedListener;

.field public final D:Ln/k0$i;

.field public final E:Ln/k0$h;

.field public final F:Ln/k0$g;

.field public final G:Ln/k0$e;

.field public H:Ljava/lang/Runnable;

.field public final I:Landroid/os/Handler;

.field public final J:Landroid/graphics/Rect;

.field public K:Landroid/graphics/Rect;

.field public L:Z

.field public M:Landroid/widget/PopupWindow;

.field public h:Landroid/content/Context;

.field public i:Landroid/widget/ListAdapter;

.field public j:Ln/i0;

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:I

.field public t:Z

.field public u:Z

.field public v:I

.field public w:Landroid/view/View;

.field public x:I

.field public y:Landroid/database/DataSetObserver;

.field public z:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "ListPopupWindow"

    const/16 v4, 0x1c

    if-gt v0, v4, :cond_0

    :try_start_0
    const-class v0, Landroid/widget/PopupWindow;

    const-string v4, "setClipToScreenEnabled"

    new-array v5, v2, [Ljava/lang/Class;

    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v6, v5, v1

    invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Ln/k0;->N:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well."

    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    :try_start_1
    const-class v0, Landroid/widget/PopupWindow;

    const-string v4, "setEpicenterBounds"

    new-array v5, v2, [Ljava/lang/Class;

    const-class v6, Landroid/graphics/Rect;

    aput-object v6, v5, v1

    invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Ln/k0;->P:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    const-string v0, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well."

    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    if-gt v0, v4, :cond_1

    :try_start_2
    const-class v0, Landroid/widget/PopupWindow;

    const-string v4, "getMaxAvailableHeight"

    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/Class;

    const-class v6, Landroid/view/View;

    aput-object v6, v5, v1

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v1, v5, v2

    const/4 v1, 0x2

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v2, v5, v1

    invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Ln/k0;->O:Ljava/lang/reflect/Method;
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    const-string v0, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well."

    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_2
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Ln/k0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x2

    iput v0, p0, Ln/k0;->k:I

    iput v0, p0, Ln/k0;->l:I

    const/16 v0, 0x3ea

    iput v0, p0, Ln/k0;->o:I

    const/4 v0, 0x0

    iput v0, p0, Ln/k0;->s:I

    iput-boolean v0, p0, Ln/k0;->t:Z

    iput-boolean v0, p0, Ln/k0;->u:Z

    const v1, 0x7fffffff

    iput v1, p0, Ln/k0;->v:I

    iput v0, p0, Ln/k0;->x:I

    new-instance v1, Ln/k0$i;

    invoke-direct {v1, p0}, Ln/k0$i;-><init>(Ln/k0;)V

    iput-object v1, p0, Ln/k0;->D:Ln/k0$i;

    new-instance v1, Ln/k0$h;

    invoke-direct {v1, p0}, Ln/k0$h;-><init>(Ln/k0;)V

    iput-object v1, p0, Ln/k0;->E:Ln/k0$h;

    new-instance v1, Ln/k0$g;

    invoke-direct {v1, p0}, Ln/k0$g;-><init>(Ln/k0;)V

    iput-object v1, p0, Ln/k0;->F:Ln/k0$g;

    new-instance v1, Ln/k0$e;

    invoke-direct {v1, p0}, Ln/k0$e;-><init>(Ln/k0;)V

    iput-object v1, p0, Ln/k0;->G:Ln/k0$e;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Ln/k0;->J:Landroid/graphics/Rect;

    iput-object p1, p0, Ln/k0;->h:Landroid/content/Context;

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Ln/k0;->I:Landroid/os/Handler;

    sget-object v1, Lg/j;->l1:[I

    invoke-virtual {p1, p2, v1, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    sget v2, Lg/j;->m1:I

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Ln/k0;->m:I

    sget v2, Lg/j;->n1:I

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v0

    iput v0, p0, Ln/k0;->n:I

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iput-boolean v2, p0, Ln/k0;->p:Z

    :cond_0
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v0, Ln/s;

    invoke-direct {v0, p1, p2, p3, p4}, Ln/s;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    return-void
.end method


# virtual methods
.method public A(I)V
    .locals 2

    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Ln/k0;->J:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget-object v0, p0, Ln/k0;->J:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v0, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v1, v0

    add-int/2addr v1, p1

    iput v1, p0, Ln/k0;->l:I

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Ln/k0;->L(I)V

    :goto_0
    return-void
.end method

.method public B(I)V
    .locals 0

    iput p1, p0, Ln/k0;->s:I

    return-void
.end method

.method public C(Landroid/graphics/Rect;)V
    .locals 1

    if-eqz p1, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Ln/k0;->K:Landroid/graphics/Rect;

    return-void
.end method

.method public D(I)V
    .locals 1

    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    return-void
.end method

.method public E(Z)V
    .locals 1

    iput-boolean p1, p0, Ln/k0;->L:Z

    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    return-void
.end method

.method public F(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 1

    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    return-void
.end method

.method public G(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 0

    iput-object p1, p0, Ln/k0;->B:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method

.method public H(Z)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ln/k0;->r:Z

    iput-boolean p1, p0, Ln/k0;->q:Z

    return-void
.end method

.method public final I(Z)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_0

    sget-object v0, Ln/k0;->N:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v1, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "ListPopupWindow"

    const-string v0, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-static {v0, p1}, Ln/k0$d;->b(Landroid/widget/PopupWindow;Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public J(I)V
    .locals 0

    iput p1, p0, Ln/k0;->x:I

    return-void
.end method

.method public K(I)V
    .locals 2

    iget-object v0, p0, Ln/k0;->j:Ln/i0;

    invoke-virtual {p0}, Ln/k0;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ln/i0;->setListSelectionHidden(Z)V

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setSelection(I)V

    invoke-virtual {v0}, Landroid/widget/ListView;->getChoiceMode()I

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/widget/ListView;->setItemChecked(IZ)V

    :cond_0
    return-void
.end method

.method public L(I)V
    .locals 0

    iput p1, p0, Ln/k0;->l:I

    return-void
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    return v0
.end method

.method public final d()I
    .locals 12

    iget-object v0, p0, Ln/k0;->j:Ln/i0;

    const/high16 v1, -0x80000000

    const/4 v2, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v0, :cond_6

    iget-object v0, p0, Ln/k0;->h:Landroid/content/Context;

    new-instance v5, Ln/k0$a;

    invoke-direct {v5, p0}, Ln/k0$a;-><init>(Ln/k0;)V

    iput-object v5, p0, Ln/k0;->H:Ljava/lang/Runnable;

    iget-boolean v5, p0, Ln/k0;->L:Z

    xor-int/2addr v5, v3

    invoke-virtual {p0, v0, v5}, Ln/k0;->r(Landroid/content/Context;Z)Ln/i0;

    move-result-object v5

    iput-object v5, p0, Ln/k0;->j:Ln/i0;

    iget-object v6, p0, Ln/k0;->A:Landroid/graphics/drawable/Drawable;

    if-eqz v6, :cond_0

    invoke-virtual {v5, v6}, Ln/i0;->setSelector(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    iget-object v5, p0, Ln/k0;->j:Ln/i0;

    iget-object v6, p0, Ln/k0;->i:Landroid/widget/ListAdapter;

    invoke-virtual {v5, v6}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v5, p0, Ln/k0;->j:Ln/i0;

    iget-object v6, p0, Ln/k0;->B:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v5, v6}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    iget-object v5, p0, Ln/k0;->j:Ln/i0;

    invoke-virtual {v5, v3}, Landroid/widget/ListView;->setFocusable(Z)V

    iget-object v5, p0, Ln/k0;->j:Ln/i0;

    invoke-virtual {v5, v3}, Landroid/widget/ListView;->setFocusableInTouchMode(Z)V

    iget-object v5, p0, Ln/k0;->j:Ln/i0;

    new-instance v6, Ln/k0$b;

    invoke-direct {v6, p0}, Ln/k0$b;-><init>(Ln/k0;)V

    invoke-virtual {v5, v6}, Landroid/widget/ListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    iget-object v5, p0, Ln/k0;->j:Ln/i0;

    iget-object v6, p0, Ln/k0;->F:Ln/k0$g;

    invoke-virtual {v5, v6}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    iget-object v5, p0, Ln/k0;->C:Landroid/widget/AdapterView$OnItemSelectedListener;

    if-eqz v5, :cond_1

    iget-object v6, p0, Ln/k0;->j:Ln/i0;

    invoke-virtual {v6, v5}, Landroid/widget/ListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    :cond_1
    iget-object v5, p0, Ln/k0;->j:Ln/i0;

    iget-object v6, p0, Ln/k0;->w:Landroid/view/View;

    if-eqz v6, :cond_5

    new-instance v7, Landroid/widget/LinearLayout;

    invoke-direct {v7, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v7, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct {v0, v2, v4, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    iget v8, p0, Ln/k0;->x:I

    if-eqz v8, :cond_3

    if-eq v8, v3, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Invalid hint position "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, p0, Ln/k0;->x:I

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v5, "ListPopupWindow"

    invoke-static {v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    invoke-virtual {v7, v5, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v7, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v7, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    invoke-virtual {v7, v5, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :goto_0
    iget v0, p0, Ln/k0;->l:I

    if-ltz v0, :cond_4

    move v5, v1

    goto :goto_1

    :cond_4
    move v0, v4

    move v5, v0

    :goto_1
    invoke-static {v0, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {v6, v0, v4}, Landroid/view/View;->measure(II)V

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    iget v6, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v5, v6

    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v5, v0

    move v0, v5

    move-object v5, v7

    goto :goto_2

    :cond_5
    move v0, v4

    :goto_2
    iget-object v6, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v6, v5}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    goto :goto_3

    :cond_6
    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v0, p0, Ln/k0;->w:Landroid/view/View;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iget v6, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v0, v6

    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v5

    goto :goto_3

    :cond_7
    move v0, v4

    :goto_3
    iget-object v5, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v5}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_8

    iget-object v6, p0, Ln/k0;->J:Landroid/graphics/Rect;

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget-object v5, p0, Ln/k0;->J:Landroid/graphics/Rect;

    iget v6, v5, Landroid/graphics/Rect;->top:I

    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v5, v6

    iget-boolean v7, p0, Ln/k0;->p:Z

    if-nez v7, :cond_9

    neg-int v6, v6

    iput v6, p0, Ln/k0;->n:I

    goto :goto_4

    :cond_8
    iget-object v5, p0, Ln/k0;->J:Landroid/graphics/Rect;

    invoke-virtual {v5}, Landroid/graphics/Rect;->setEmpty()V

    move v5, v4

    :cond_9
    :goto_4
    iget-object v6, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v6}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result v6

    const/4 v7, 0x2

    if-ne v6, v7, :cond_a

    goto :goto_5

    :cond_a
    move v3, v4

    :goto_5
    invoke-virtual {p0}, Ln/k0;->s()Landroid/view/View;

    move-result-object v4

    iget v6, p0, Ln/k0;->n:I

    invoke-virtual {p0, v4, v6, v3}, Ln/k0;->t(Landroid/view/View;IZ)I

    move-result v3

    iget-boolean v4, p0, Ln/k0;->t:Z

    if-nez v4, :cond_e

    iget v4, p0, Ln/k0;->k:I

    if-ne v4, v2, :cond_b

    goto :goto_7

    :cond_b
    iget v4, p0, Ln/k0;->l:I

    const/4 v6, -0x2

    if-eq v4, v6, :cond_c

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v4, v2, :cond_c

    invoke-static {v4, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    goto :goto_6

    :cond_c
    iget-object v2, p0, Ln/k0;->h:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v4, p0, Ln/k0;->J:Landroid/graphics/Rect;

    iget v6, v4, Landroid/graphics/Rect;->left:I

    iget v4, v4, Landroid/graphics/Rect;->right:I

    add-int/2addr v6, v4

    sub-int/2addr v2, v6

    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    :goto_6
    move v7, v1

    iget-object v6, p0, Ln/k0;->j:Ln/i0;

    const/4 v8, 0x0

    const/4 v9, -0x1

    sub-int v10, v3, v0

    const/4 v11, -0x1

    invoke-virtual/range {v6 .. v11}, Ln/i0;->d(IIIII)I

    move-result v1

    if-lez v1, :cond_d

    iget-object v2, p0, Ln/k0;->j:Ln/i0;

    invoke-virtual {v2}, Landroid/widget/ListView;->getPaddingTop()I

    move-result v2

    iget-object v3, p0, Ln/k0;->j:Ln/i0;

    invoke-virtual {v3}, Landroid/widget/ListView;->getPaddingBottom()I

    move-result v3

    add-int/2addr v2, v3

    add-int/2addr v5, v2

    add-int/2addr v0, v5

    :cond_d
    add-int/2addr v1, v0

    return v1

    :cond_e
    :goto_7
    add-int/2addr v3, v5

    return v3
.end method

.method public dismiss()V
    .locals 2

    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    invoke-virtual {p0}, Ln/k0;->x()V

    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    iput-object v1, p0, Ln/k0;->j:Ln/i0;

    iget-object v0, p0, Ln/k0;->I:Landroid/os/Handler;

    iget-object v1, p0, Ln/k0;->D:Ln/k0$i;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public e(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public f()I
    .locals 1

    iget v0, p0, Ln/k0;->m:I

    return v0
.end method

.method public g(I)V
    .locals 0

    iput p1, p0, Ln/k0;->m:I

    return-void
.end method

.method public i()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public j()Landroid/widget/ListView;
    .locals 1

    iget-object v0, p0, Ln/k0;->j:Ln/i0;

    return-object v0
.end method

.method public l(I)V
    .locals 0

    iput p1, p0, Ln/k0;->n:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Ln/k0;->p:Z

    return-void
.end method

.method public o()I
    .locals 1

    iget-boolean v0, p0, Ln/k0;->p:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Ln/k0;->n:I

    return v0
.end method

.method public p(Landroid/widget/ListAdapter;)V
    .locals 2

    iget-object v0, p0, Ln/k0;->y:Landroid/database/DataSetObserver;

    if-nez v0, :cond_0

    new-instance v0, Ln/k0$f;

    invoke-direct {v0, p0}, Ln/k0$f;-><init>(Ln/k0;)V

    iput-object v0, p0, Ln/k0;->y:Landroid/database/DataSetObserver;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ln/k0;->i:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_1

    invoke-interface {v1, v0}, Landroid/widget/ListAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    :cond_1
    :goto_0
    iput-object p1, p0, Ln/k0;->i:Landroid/widget/ListAdapter;

    if-eqz p1, :cond_2

    iget-object v0, p0, Ln/k0;->y:Landroid/database/DataSetObserver;

    invoke-interface {p1, v0}, Landroid/widget/ListAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    :cond_2
    iget-object p1, p0, Ln/k0;->j:Ln/i0;

    if-eqz p1, :cond_3

    iget-object v0, p0, Ln/k0;->i:Landroid/widget/ListAdapter;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    :cond_3
    return-void
.end method

.method public q()V
    .locals 2

    iget-object v0, p0, Ln/k0;->j:Ln/i0;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ln/i0;->setListSelectionHidden(Z)V

    invoke-virtual {v0}, Landroid/widget/ListView;->requestLayout()V

    :cond_0
    return-void
.end method

.method public r(Landroid/content/Context;Z)Ln/i0;
    .locals 1

    new-instance v0, Ln/i0;

    invoke-direct {v0, p1, p2}, Ln/i0;-><init>(Landroid/content/Context;Z)V

    return-object v0
.end method

.method public s()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Ln/k0;->z:Landroid/view/View;

    return-object v0
.end method

.method public show()V
    .locals 13

    invoke-virtual {p0}, Ln/k0;->d()I

    move-result v0

    invoke-virtual {p0}, Ln/k0;->v()Z

    move-result v1

    iget-object v2, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    iget v3, p0, Ln/k0;->o:I

    invoke-static {v2, v3}, Ln0/i;->b(Landroid/widget/PopupWindow;I)V

    iget-object v2, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v2}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, -0x2

    const/4 v5, 0x0

    const/4 v6, -0x1

    if-eqz v2, :cond_c

    invoke-virtual {p0}, Ln/k0;->s()Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lk0/b0;->F(Landroid/view/View;)Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    iget v2, p0, Ln/k0;->l:I

    if-ne v2, v6, :cond_1

    move v2, v6

    goto :goto_0

    :cond_1
    if-ne v2, v4, :cond_2

    invoke-virtual {p0}, Ln/k0;->s()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    :cond_2
    :goto_0
    iget v7, p0, Ln/k0;->k:I

    if-ne v7, v6, :cond_7

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    move v0, v6

    :goto_1
    if-eqz v1, :cond_5

    iget-object v1, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    iget v4, p0, Ln/k0;->l:I

    if-ne v4, v6, :cond_4

    move v4, v6

    goto :goto_2

    :cond_4
    move v4, v5

    :goto_2
    invoke-virtual {v1, v4}, Landroid/widget/PopupWindow;->setWidth(I)V

    iget-object v1, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v5}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_4

    :cond_5
    iget-object v1, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    iget v4, p0, Ln/k0;->l:I

    if-ne v4, v6, :cond_6

    move v4, v6

    goto :goto_3

    :cond_6
    move v4, v5

    :goto_3
    invoke-virtual {v1, v4}, Landroid/widget/PopupWindow;->setWidth(I)V

    iget-object v1, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v6}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_4

    :cond_7
    if-ne v7, v4, :cond_8

    goto :goto_4

    :cond_8
    move v0, v7

    :goto_4
    iget-object v1, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    iget-boolean v4, p0, Ln/k0;->u:Z

    if-nez v4, :cond_9

    iget-boolean v4, p0, Ln/k0;->t:Z

    if-nez v4, :cond_9

    goto :goto_5

    :cond_9
    move v3, v5

    :goto_5
    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    iget-object v7, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Ln/k0;->s()Landroid/view/View;

    move-result-object v8

    iget v9, p0, Ln/k0;->m:I

    iget v10, p0, Ln/k0;->n:I

    if-gez v2, :cond_a

    move v11, v6

    goto :goto_6

    :cond_a
    move v11, v2

    :goto_6
    if-gez v0, :cond_b

    move v12, v6

    goto :goto_7

    :cond_b
    move v12, v0

    :goto_7
    invoke-virtual/range {v7 .. v12}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    goto/16 :goto_c

    :cond_c
    iget v1, p0, Ln/k0;->l:I

    if-ne v1, v6, :cond_d

    move v1, v6

    goto :goto_8

    :cond_d
    if-ne v1, v4, :cond_e

    invoke-virtual {p0}, Ln/k0;->s()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    :cond_e
    :goto_8
    iget v2, p0, Ln/k0;->k:I

    if-ne v2, v6, :cond_f

    move v0, v6

    goto :goto_9

    :cond_f
    if-ne v2, v4, :cond_10

    goto :goto_9

    :cond_10
    move v0, v2

    :goto_9
    iget-object v2, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    iget-object v1, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    invoke-virtual {p0, v3}, Ln/k0;->I(Z)V

    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    iget-boolean v1, p0, Ln/k0;->u:Z

    if-nez v1, :cond_11

    iget-boolean v1, p0, Ln/k0;->t:Z

    if-nez v1, :cond_11

    move v1, v3

    goto :goto_a

    :cond_11
    move v1, v5

    :goto_a
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    iget-object v1, p0, Ln/k0;->E:Ln/k0$h;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    iget-boolean v0, p0, Ln/k0;->r:Z

    if-eqz v0, :cond_12

    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    iget-boolean v1, p0, Ln/k0;->q:Z

    invoke-static {v0, v1}, Ln0/i;->a(Landroid/widget/PopupWindow;Z)V

    :cond_12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_13

    sget-object v0, Ln/k0;->P:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_14

    :try_start_0
    iget-object v1, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    new-array v2, v3, [Ljava/lang/Object;

    iget-object v3, p0, Ln/k0;->K:Landroid/graphics/Rect;

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_b

    :catch_0
    move-exception v0

    const-string v1, "ListPopupWindow"

    const-string v2, "Could not invoke setEpicenterBounds on PopupWindow"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_b

    :cond_13
    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    iget-object v1, p0, Ln/k0;->K:Landroid/graphics/Rect;

    invoke-static {v0, v1}, Ln/k0$d;->a(Landroid/widget/PopupWindow;Landroid/graphics/Rect;)V

    :cond_14
    :goto_b
    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Ln/k0;->s()Landroid/view/View;

    move-result-object v1

    iget v2, p0, Ln/k0;->m:I

    iget v3, p0, Ln/k0;->n:I

    iget v4, p0, Ln/k0;->s:I

    invoke-static {v0, v1, v2, v3, v4}, Ln0/i;->c(Landroid/widget/PopupWindow;Landroid/view/View;III)V

    iget-object v0, p0, Ln/k0;->j:Ln/i0;

    invoke-virtual {v0, v6}, Landroid/widget/ListView;->setSelection(I)V

    iget-boolean v0, p0, Ln/k0;->L:Z

    if-eqz v0, :cond_15

    iget-object v0, p0, Ln/k0;->j:Ln/i0;

    invoke-virtual {v0}, Ln/i0;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_16

    :cond_15
    invoke-virtual {p0}, Ln/k0;->q()V

    :cond_16
    iget-boolean v0, p0, Ln/k0;->L:Z

    if-nez v0, :cond_17

    iget-object v0, p0, Ln/k0;->I:Landroid/os/Handler;

    iget-object v1, p0, Ln/k0;->G:Ln/k0$e;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_17
    :goto_c
    return-void
.end method

.method public final t(Landroid/view/View;IZ)I
    .locals 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-gt v0, v1, :cond_1

    sget-object v0, Ln/k0;->O:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    aput-object p3, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const-string p3, "ListPopupWindow"

    const-string v0, "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version."

    invoke-static {p3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object p3, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {p3, p1, p2}, Landroid/widget/PopupWindow;->getMaxAvailableHeight(Landroid/view/View;I)I

    move-result p1

    return p1

    :cond_1
    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-static {v0, p1, p2, p3}, Ln/k0$c;->a(Landroid/widget/PopupWindow;Landroid/view/View;IZ)I

    move-result p1

    return p1
.end method

.method public u()I
    .locals 1

    iget v0, p0, Ln/k0;->l:I

    return v0
.end method

.method public v()Z
    .locals 2

    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public w()Z
    .locals 1

    iget-boolean v0, p0, Ln/k0;->L:Z

    return v0
.end method

.method public final x()V
    .locals 2

    iget-object v0, p0, Ln/k0;->w:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Ln/k0;->w:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public y(Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Ln/k0;->z:Landroid/view/View;

    return-void
.end method

.method public z(I)V
    .locals 1

    iget-object v0, p0, Ln/k0;->M:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    return-void
.end method
