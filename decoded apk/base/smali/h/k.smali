.class public Lh/k;
.super Lh/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh/k$d;,
        Lh/k$c;,
        Lh/k$e;
    }
.end annotation


# instance fields
.field public final a:Ln/g0;

.field public final b:Landroid/view/Window$Callback;

.field public final c:Lh/e$i;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lh/a$b;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/lang/Runnable;

.field public final i:Landroidx/appcompat/widget/Toolbar$f;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V
    .locals 3

    invoke-direct {p0}, Lh/a;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lh/k;->g:Ljava/util/ArrayList;

    new-instance v0, Lh/k$a;

    invoke-direct {v0, p0}, Lh/k$a;-><init>(Lh/k;)V

    iput-object v0, p0, Lh/k;->h:Ljava/lang/Runnable;

    new-instance v0, Lh/k$b;

    invoke-direct {v0, p0}, Lh/k$b;-><init>(Lh/k;)V

    iput-object v0, p0, Lh/k;->i:Landroidx/appcompat/widget/Toolbar$f;

    invoke-static {p1}, Lj0/d;->j(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Landroidx/appcompat/widget/e;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Landroidx/appcompat/widget/e;-><init>(Landroidx/appcompat/widget/Toolbar;Z)V

    iput-object v1, p0, Lh/k;->a:Ln/g0;

    invoke-static {p3}, Lj0/d;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/Window$Callback;

    iput-object v2, p0, Lh/k;->b:Landroid/view/Window$Callback;

    invoke-interface {v1, p3}, Ln/g0;->setWindowCallback(Landroid/view/Window$Callback;)V

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(Landroidx/appcompat/widget/Toolbar$f;)V

    invoke-interface {v1, p2}, Ln/g0;->setWindowTitle(Ljava/lang/CharSequence;)V

    new-instance p1, Lh/k$e;

    invoke-direct {p1, p0}, Lh/k$e;-><init>(Lh/k;)V

    iput-object p1, p0, Lh/k;->c:Lh/e$i;

    return-void
.end method


# virtual methods
.method public final B()Landroid/view/Menu;
    .locals 3

    iget-boolean v0, p0, Lh/k;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lh/k;->a:Ln/g0;

    new-instance v1, Lh/k$c;

    invoke-direct {v1, p0}, Lh/k$c;-><init>(Lh/k;)V

    new-instance v2, Lh/k$d;

    invoke-direct {v2, p0}, Lh/k$d;-><init>(Lh/k;)V

    invoke-interface {v0, v1, v2}, Ln/g0;->q(Landroidx/appcompat/view/menu/i$a;Landroidx/appcompat/view/menu/e$a;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh/k;->e:Z

    :cond_0
    iget-object v0, p0, Lh/k;->a:Ln/g0;

    invoke-interface {v0}, Ln/g0;->m()Landroid/view/Menu;

    move-result-object v0

    return-object v0
.end method

.method public C()V
    .locals 5

    invoke-virtual {p0}, Lh/k;->B()Landroid/view/Menu;

    move-result-object v0

    instance-of v1, v0, Landroidx/appcompat/view/menu/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Landroidx/appcompat/view/menu/e;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/e;->d0()V

    :cond_1
    :try_start_0
    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    iget-object v3, p0, Lh/k;->b:Landroid/view/Window$Callback;

    const/4 v4, 0x0

    invoke-interface {v3, v4, v0}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lh/k;->b:Landroid/view/Window$Callback;

    invoke-interface {v3, v4, v2, v0}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    invoke-interface {v0}, Landroid/view/Menu;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/e;->c0()V

    :cond_4
    return-void

    :catchall_0
    move-exception v0

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/e;->c0()V

    :cond_5
    throw v0
.end method

.method public D(II)V
    .locals 2

    iget-object v0, p0, Lh/k;->a:Ln/g0;

    invoke-interface {v0}, Ln/g0;->u()I

    move-result v0

    iget-object v1, p0, Lh/k;->a:Ln/g0;

    and-int/2addr p1, p2

    not-int p2, p2

    and-int/2addr p2, v0

    or-int/2addr p1, p2

    invoke-interface {v1, p1}, Ln/g0;->l(I)V

    return-void
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Lh/k;->a:Ln/g0;

    invoke-interface {v0}, Ln/g0;->g()Z

    move-result v0

    return v0
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lh/k;->a:Ln/g0;

    invoke-interface {v0}, Ln/g0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh/k;->a:Ln/g0;

    invoke-interface {v0}, Ln/g0;->collapseActionView()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public i(Z)V
    .locals 3

    iget-boolean v0, p0, Lh/k;->f:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lh/k;->f:Z

    iget-object v0, p0, Lh/k;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lh/k;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh/a$b;

    invoke-interface {v2, p1}, Lh/a$b;->a(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, Lh/k;->a:Ln/g0;

    invoke-interface {v0}, Ln/g0;->u()I

    move-result v0

    return v0
.end method

.method public k()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lh/k;->a:Ln/g0;

    invoke-interface {v0}, Ln/g0;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public l()V
    .locals 2

    iget-object v0, p0, Lh/k;->a:Ln/g0;

    const/16 v1, 0x8

    invoke-interface {v0, v1}, Ln/g0;->r(I)V

    return-void
.end method

.method public m()Z
    .locals 2

    iget-object v0, p0, Lh/k;->a:Ln/g0;

    invoke-interface {v0}, Ln/g0;->s()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lh/k;->h:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lh/k;->a:Ln/g0;

    invoke-interface {v0}, Ln/g0;->s()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lh/k;->h:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lk0/b0;->R(Landroid/view/View;Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    return v0
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Lh/k;->a:Ln/g0;

    invoke-interface {v0}, Ln/g0;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o(Landroid/content/res/Configuration;)V
    .locals 0

    invoke-super {p0, p1}, Lh/a;->o(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public p()V
    .locals 2

    iget-object v0, p0, Lh/k;->a:Ln/g0;

    invoke-interface {v0}, Ln/g0;->s()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lh/k;->h:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public q(ILandroid/view/KeyEvent;)Z
    .locals 4

    invoke-virtual {p0}, Lh/k;->B()Landroid/view/Menu;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, -0x1

    :goto_0
    invoke-static {v2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    invoke-interface {v0, v3}, Landroid/view/Menu;->setQwertyMode(Z)V

    invoke-interface {v0, p1, p2, v1}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p1

    return p1

    :cond_2
    return v1
.end method

.method public r(Landroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lh/k;->s()Z

    :cond_0
    return v0
.end method

.method public s()Z
    .locals 1

    iget-object v0, p0, Lh/k;->a:Ln/g0;

    invoke-interface {v0}, Ln/g0;->h()Z

    move-result v0

    return v0
.end method

.method public t(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lh/k;->a:Ln/g0;

    invoke-interface {v0, p1}, Ln/g0;->e(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public u(Z)V
    .locals 0

    return-void
.end method

.method public v(Z)V
    .locals 1

    const/16 v0, 0x8

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Lh/k;->D(II)V

    return-void
.end method

.method public w(Z)V
    .locals 0

    return-void
.end method

.method public x(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lh/k;->a:Ln/g0;

    invoke-interface {v0, p1}, Ln/g0;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public y(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lh/k;->a:Ln/g0;

    invoke-interface {v0, p1}, Ln/g0;->setWindowTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public z()V
    .locals 2

    iget-object v0, p0, Lh/k;->a:Ln/g0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ln/g0;->r(I)V

    return-void
.end method
