.class public final Lx6/i;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ly6/e;


# direct methods
.method public constructor <init>(Ly6/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/i;->a:Ly6/e;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/i;->a:Ly6/e;

    invoke-interface {v0}, Ly6/e;->b0()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public b()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/i;->a:Ly6/e;

    invoke-interface {v0}, Ly6/e;->y0()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public c()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/i;->a:Ly6/e;

    invoke-interface {v0}, Ly6/e;->c0()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public d()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/i;->a:Ly6/e;

    invoke-interface {v0}, Ly6/e;->z()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public e()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/i;->a:Ly6/e;

    invoke-interface {v0}, Ly6/e;->m1()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public f()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/i;->a:Ly6/e;

    invoke-interface {v0}, Ly6/e;->M()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public g()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/i;->a:Ly6/e;

    invoke-interface {v0}, Ly6/e;->A1()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public h()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/i;->a:Ly6/e;

    invoke-interface {v0}, Ly6/e;->N()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public i(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lx6/i;->a:Ly6/e;

    invoke-interface {v0, p1}, Ly6/e;->setCompassEnabled(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public j(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lx6/i;->a:Ly6/e;

    invoke-interface {v0, p1}, Ly6/e;->setMapToolbarEnabled(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public k(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lx6/i;->a:Ly6/e;

    invoke-interface {v0, p1}, Ly6/e;->setMyLocationButtonEnabled(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public l(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lx6/i;->a:Ly6/e;

    invoke-interface {v0, p1}, Ly6/e;->setRotateGesturesEnabled(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public m(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lx6/i;->a:Ly6/e;

    invoke-interface {v0, p1}, Ly6/e;->setScrollGesturesEnabled(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public n(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lx6/i;->a:Ly6/e;

    invoke-interface {v0, p1}, Ly6/e;->setTiltGesturesEnabled(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public o(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lx6/i;->a:Ly6/e;

    invoke-interface {v0, p1}, Ly6/e;->setZoomControlsEnabled(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public p(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lx6/i;->a:Ly6/e;

    invoke-interface {v0, p1}, Ly6/e;->setZoomGesturesEnabled(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method
