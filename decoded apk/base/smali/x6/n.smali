.class public final Lx6/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr6/c;


# instance fields
.field public final a:Landroid/view/ViewGroup;

.field public final b:Ly6/c;

.field public c:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Ly6/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly6/c;

    iput-object p2, p0, Lx6/n;->b:Ly6/c;

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lx6/n;->a:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public final a(Lx6/f;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/n;->b:Ly6/c;

    new-instance v1, Lx6/m;

    invoke-direct {v1, p0, p1}, Lx6/m;-><init>(Lx6/n;Lx6/f;)V

    invoke-interface {v0, v1}, Ly6/c;->h1(Ly6/p;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    :try_start_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-static {p1, v0}, Ly6/d0;->b(Landroid/os/Bundle;Landroid/os/Bundle;)V

    iget-object v1, p0, Lx6/n;->b:Ly6/c;

    invoke-interface {v1, v0}, Ly6/c;->onCreate(Landroid/os/Bundle;)V

    invoke-static {v0, p1}, Ly6/d0;->b(Landroid/os/Bundle;Landroid/os/Bundle;)V

    iget-object p1, p0, Lx6/n;->b:Ly6/c;

    invoke-interface {p1}, Ly6/c;->getView()Lr6/b;

    move-result-object p1

    invoke-static {p1}, Lr6/d;->e(Lr6/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    iput-object p1, p0, Lx6/n;->c:Landroid/view/View;

    iget-object p1, p0, Lx6/n;->a:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object p1, p0, Lx6/n;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, Lx6/n;->c:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final onDestroy()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/n;->b:Ly6/c;

    invoke-interface {v0}, Ly6/c;->onDestroy()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final onResume()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/n;->b:Ly6/c;

    invoke-interface {v0}, Ly6/c;->onResume()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    :try_start_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-static {p1, v0}, Ly6/d0;->b(Landroid/os/Bundle;Landroid/os/Bundle;)V

    iget-object v1, p0, Lx6/n;->b:Ly6/c;

    invoke-interface {v1, v0}, Ly6/c;->onSaveInstanceState(Landroid/os/Bundle;)V

    invoke-static {v0, p1}, Ly6/d0;->b(Landroid/os/Bundle;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final onStart()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/n;->b:Ly6/c;

    invoke-interface {v0}, Ly6/c;->onStart()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final onStop()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/n;->b:Ly6/c;

    invoke-interface {v0}, Ly6/c;->onStop()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method
