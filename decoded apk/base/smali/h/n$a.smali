.class public Lh/n$a;
.super Lk0/j0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lh/n;


# direct methods
.method public constructor <init>(Lh/n;)V
    .locals 0

    iput-object p1, p0, Lh/n$a;->a:Lh/n;

    invoke-direct {p0}, Lk0/j0;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lh/n$a;->a:Lh/n;

    iget-boolean v0, p1, Lh/n;->t:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Lh/n;->h:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object p1, p0, Lh/n$a;->a:Lh/n;

    iget-object p1, p1, Lh/n;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    :cond_0
    iget-object p1, p0, Lh/n$a;->a:Lh/n;

    iget-object p1, p1, Lh/n;->e:Landroidx/appcompat/widget/ActionBarContainer;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget-object p1, p0, Lh/n$a;->a:Lh/n;

    iget-object p1, p1, Lh/n;->e:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    iget-object p1, p0, Lh/n$a;->a:Lh/n;

    const/4 v0, 0x0

    iput-object v0, p1, Lh/n;->y:Ll/h;

    invoke-virtual {p1}, Lh/n;->D()V

    iget-object p1, p0, Lh/n$a;->a:Lh/n;

    iget-object p1, p1, Lh/n;->d:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_1

    invoke-static {p1}, Lk0/b0;->T(Landroid/view/View;)V

    :cond_1
    return-void
.end method
