.class public Lh/e$k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "k"
.end annotation


# instance fields
.field public a:Ll/b$a;

.field public final synthetic b:Lh/e;


# direct methods
.method public constructor <init>(Lh/e;Ll/b$a;)V
    .locals 0

    iput-object p1, p0, Lh/e$k;->b:Lh/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lh/e$k;->a:Ll/b$a;

    return-void
.end method


# virtual methods
.method public a(Ll/b;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lh/e$k;->a:Ll/b$a;

    invoke-interface {v0, p1, p2}, Ll/b$a;->a(Ll/b;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public b(Ll/b;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lh/e$k;->b:Lh/e;

    iget-object v0, v0, Lh/e;->C:Landroid/view/ViewGroup;

    invoke-static {v0}, Lk0/b0;->T(Landroid/view/View;)V

    iget-object v0, p0, Lh/e$k;->a:Ll/b$a;

    invoke-interface {v0, p1, p2}, Ll/b$a;->b(Ll/b;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public c(Ll/b;)V
    .locals 2

    iget-object v0, p0, Lh/e$k;->a:Ll/b$a;

    invoke-interface {v0, p1}, Ll/b$a;->c(Ll/b;)V

    iget-object p1, p0, Lh/e$k;->b:Lh/e;

    iget-object v0, p1, Lh/e;->x:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lh/e$k;->b:Lh/e;

    iget-object v0, v0, Lh/e;->y:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, Lh/e$k;->b:Lh/e;

    iget-object v0, p1, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lh/e;->Z()V

    iget-object p1, p0, Lh/e$k;->b:Lh/e;

    iget-object v0, p1, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Lk0/b0;->c(Landroid/view/View;)Lk0/h0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lk0/h0;->b(F)Lk0/h0;

    move-result-object v0

    iput-object v0, p1, Lh/e;->z:Lk0/h0;

    iget-object p1, p0, Lh/e$k;->b:Lh/e;

    iget-object p1, p1, Lh/e;->z:Lk0/h0;

    new-instance v0, Lh/e$k$a;

    invoke-direct {v0, p0}, Lh/e$k$a;-><init>(Lh/e$k;)V

    invoke-virtual {p1, v0}, Lk0/h0;->h(Lk0/i0;)Lk0/h0;

    :cond_1
    iget-object p1, p0, Lh/e$k;->b:Lh/e;

    iget-object v0, p1, Lh/e;->o:Lh/c;

    if-eqz v0, :cond_2

    iget-object p1, p1, Lh/e;->v:Ll/b;

    invoke-interface {v0, p1}, Lh/c;->onSupportActionModeFinished(Ll/b;)V

    :cond_2
    iget-object p1, p0, Lh/e$k;->b:Lh/e;

    const/4 v0, 0x0

    iput-object v0, p1, Lh/e;->v:Ll/b;

    iget-object p1, p1, Lh/e;->C:Landroid/view/ViewGroup;

    invoke-static {p1}, Lk0/b0;->T(Landroid/view/View;)V

    return-void
.end method

.method public d(Ll/b;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lh/e$k;->a:Ll/b$a;

    invoke-interface {v0, p1, p2}, Ll/b$a;->d(Ll/b;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
