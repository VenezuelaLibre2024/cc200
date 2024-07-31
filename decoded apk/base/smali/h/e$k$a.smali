.class public Lh/e$k$a;
.super Lk0/j0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/e$k;->c(Ll/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lh/e$k;


# direct methods
.method public constructor <init>(Lh/e$k;)V
    .locals 0

    iput-object p1, p0, Lh/e$k$a;->a:Lh/e$k;

    invoke-direct {p0}, Lk0/j0;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lh/e$k$a;->a:Lh/e$k;

    iget-object p1, p1, Lh/e$k;->b:Lh/e;

    iget-object p1, p1, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, Lh/e$k$a;->a:Lh/e$k;

    iget-object p1, p1, Lh/e$k;->b:Lh/e;

    iget-object v0, p1, Lh/e;->x:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lh/e$k$a;->a:Lh/e$k;

    iget-object p1, p1, Lh/e$k;->b:Lh/e;

    iget-object p1, p1, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Lk0/b0;->T(Landroid/view/View;)V

    :cond_1
    :goto_0
    iget-object p1, p0, Lh/e$k$a;->a:Lh/e$k;

    iget-object p1, p1, Lh/e$k;->b:Lh/e;

    iget-object p1, p1, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContextView;->k()V

    iget-object p1, p0, Lh/e$k$a;->a:Lh/e$k;

    iget-object p1, p1, Lh/e$k;->b:Lh/e;

    iget-object p1, p1, Lh/e;->z:Lk0/h0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lk0/h0;->h(Lk0/i0;)Lk0/h0;

    iget-object p1, p0, Lh/e$k$a;->a:Lh/e$k;

    iget-object p1, p1, Lh/e$k;->b:Lh/e;

    iput-object v0, p1, Lh/e;->z:Lk0/h0;

    iget-object p1, p1, Lh/e;->C:Landroid/view/ViewGroup;

    invoke-static {p1}, Lk0/b0;->T(Landroid/view/View;)V

    return-void
.end method
