.class public Lh/g;
.super Landroidx/activity/h;
.source ""

# interfaces
.implements Lh/c;


# instance fields
.field public k:Lh/d;

.field public final l:Lk0/f$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    invoke-static {p1, p2}, Lh/g;->f(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Landroidx/activity/h;-><init>(Landroid/content/Context;I)V

    new-instance v0, Lh/f;

    invoke-direct {v0, p0}, Lh/f;-><init>(Lh/g;)V

    iput-object v0, p0, Lh/g;->l:Lk0/f$a;

    invoke-virtual {p0}, Lh/g;->e()Lh/d;

    move-result-object v0

    invoke-static {p1, p2}, Lh/g;->f(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Lh/d;->G(I)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lh/d;->r(Landroid/os/Bundle;)V

    return-void
.end method

.method public static f(Landroid/content/Context;I)I
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    sget v0, Lg/a;->z:I

    const/4 v1, 0x1

    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p1, p1, Landroid/util/TypedValue;->resourceId:I

    :cond_0
    return p1
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Lh/g;->e()Lh/d;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lh/d;->d(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public dismiss()V
    .locals 1

    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    invoke-virtual {p0}, Lh/g;->e()Lh/d;

    move-result-object v0

    invoke-virtual {v0}, Lh/d;->s()V

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lh/g;->l:Lk0/f$a;

    invoke-static {v1, v0, p0, p1}, Lk0/f;->e(Lk0/f$a;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public e()Lh/d;
    .locals 1

    iget-object v0, p0, Lh/g;->k:Lh/d;

    if-nez v0, :cond_0

    invoke-static {p0, p0}, Lh/d;->h(Landroid/app/Dialog;Lh/c;)Lh/d;

    move-result-object v0

    iput-object v0, p0, Lh/g;->k:Lh/d;

    :cond_0
    iget-object v0, p0, Lh/g;->k:Lh/d;

    return-object v0
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lh/g;->e()Lh/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh/d;->i(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public g(Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public h(I)Z
    .locals 1

    invoke-virtual {p0}, Lh/g;->e()Lh/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh/d;->A(I)Z

    move-result p1

    return p1
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Lh/g;->e()Lh/d;

    move-result-object v0

    invoke-virtual {v0}, Lh/d;->p()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lh/g;->e()Lh/d;

    move-result-object v0

    invoke-virtual {v0}, Lh/d;->o()V

    invoke-super {p0, p1}, Landroidx/activity/h;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lh/g;->e()Lh/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh/d;->r(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Landroidx/activity/h;->onStop()V

    invoke-virtual {p0}, Lh/g;->e()Lh/d;

    move-result-object v0

    invoke-virtual {v0}, Lh/d;->x()V

    return-void
.end method

.method public onSupportActionModeFinished(Ll/b;)V
    .locals 0

    return-void
.end method

.method public onSupportActionModeStarted(Ll/b;)V
    .locals 0

    return-void
.end method

.method public onWindowStartingSupportActionMode(Ll/b$a;)Ll/b;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public setContentView(I)V
    .locals 1

    invoke-virtual {p0}, Lh/g;->e()Lh/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh/d;->C(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Lh/g;->e()Lh/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh/d;->D(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Lh/g;->e()Lh/d;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lh/d;->E(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTitle(I)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    invoke-virtual {p0}, Lh/g;->e()Lh/d;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lh/d;->H(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lh/g;->e()Lh/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh/d;->H(Ljava/lang/CharSequence;)V

    return-void
.end method
