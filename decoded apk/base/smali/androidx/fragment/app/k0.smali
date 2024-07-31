.class public Landroidx/fragment/app/k0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/lifecycle/e;
.implements Lr1/d;
.implements Landroidx/lifecycle/i0;


# instance fields
.field public final h:Landroidx/fragment/app/Fragment;

.field public final i:Landroidx/lifecycle/h0;

.field public j:Landroidx/lifecycle/l;

.field public k:Lr1/c;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/h0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/k0;->j:Landroidx/lifecycle/l;

    iput-object v0, p0, Landroidx/fragment/app/k0;->k:Lr1/c;

    iput-object p1, p0, Landroidx/fragment/app/k0;->h:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Landroidx/fragment/app/k0;->i:Landroidx/lifecycle/h0;

    return-void
.end method


# virtual methods
.method public a(Landroidx/lifecycle/f$a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/k0;->j:Landroidx/lifecycle/l;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/l;->h(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/k0;->j:Landroidx/lifecycle/l;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/l;

    invoke-direct {v0, p0}, Landroidx/lifecycle/l;-><init>(Landroidx/lifecycle/k;)V

    iput-object v0, p0, Landroidx/fragment/app/k0;->j:Landroidx/lifecycle/l;

    invoke-static {p0}, Lr1/c;->a(Lr1/d;)Lr1/c;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/k0;->k:Lr1/c;

    invoke-virtual {v0}, Lr1/c;->c()V

    :cond_0
    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/k0;->j:Landroidx/lifecycle/l;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/k0;->k:Lr1/c;

    invoke-virtual {v0, p1}, Lr1/c;->d(Landroid/os/Bundle;)V

    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/k0;->k:Lr1/c;

    invoke-virtual {v0, p1}, Lr1/c;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public f(Landroidx/lifecycle/f$b;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/k0;->j:Landroidx/lifecycle/l;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/l;->n(Landroidx/lifecycle/f$b;)V

    return-void
.end method

.method public getDefaultViewModelCreationExtras()Le1/a;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/k0;->h:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Application;

    goto :goto_1

    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    new-instance v1, Le1/d;

    invoke-direct {v1}, Le1/d;-><init>()V

    if-eqz v0, :cond_2

    sget-object v2, Landroidx/lifecycle/f0$a;->h:Le1/a$b;

    invoke-virtual {v1, v2, v0}, Le1/d;->c(Le1/a$b;Ljava/lang/Object;)V

    :cond_2
    sget-object v0, Landroidx/lifecycle/y;->a:Le1/a$b;

    iget-object v2, p0, Landroidx/fragment/app/k0;->h:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, v0, v2}, Le1/d;->c(Le1/a$b;Ljava/lang/Object;)V

    sget-object v0, Landroidx/lifecycle/y;->b:Le1/a$b;

    invoke-virtual {v1, v0, p0}, Le1/d;->c(Le1/a$b;Ljava/lang/Object;)V

    iget-object v0, p0, Landroidx/fragment/app/k0;->h:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v0, Landroidx/lifecycle/y;->c:Le1/a$b;

    iget-object v2, p0, Landroidx/fragment/app/k0;->h:Landroidx/fragment/app/Fragment;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Le1/d;->c(Le1/a$b;Ljava/lang/Object;)V

    :cond_3
    return-object v1
.end method

.method public getLifecycle()Landroidx/lifecycle/f;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/k0;->b()V

    iget-object v0, p0, Landroidx/fragment/app/k0;->j:Landroidx/lifecycle/l;

    return-object v0
.end method

.method public getSavedStateRegistry()Landroidx/savedstate/a;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/k0;->b()V

    iget-object v0, p0, Landroidx/fragment/app/k0;->k:Lr1/c;

    invoke-virtual {v0}, Lr1/c;->b()Landroidx/savedstate/a;

    move-result-object v0

    return-object v0
.end method

.method public getViewModelStore()Landroidx/lifecycle/h0;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/k0;->b()V

    iget-object v0, p0, Landroidx/fragment/app/k0;->i:Landroidx/lifecycle/h0;

    return-object v0
.end method
