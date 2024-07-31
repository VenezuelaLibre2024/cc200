.class public final Lx6/b;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:Ly6/a;


# direct methods
.method public static a(Lcom/google/android/gms/maps/model/CameraPosition;)Lx6/a;
    .locals 2

    const-string v0, "cameraPosition must not be null"

    invoke-static {p0, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lx6/a;

    invoke-static {}, Lx6/b;->l()Ly6/a;

    move-result-object v1

    invoke-interface {v1, p0}, Ly6/a;->Q0(Lcom/google/android/gms/maps/model/CameraPosition;)Lr6/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lx6/a;-><init>(Lr6/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lz6/v;

    invoke-direct {v0, p0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static b(Lcom/google/android/gms/maps/model/LatLng;)Lx6/a;
    .locals 2

    const-string v0, "latLng must not be null"

    invoke-static {p0, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lx6/a;

    invoke-static {}, Lx6/b;->l()Ly6/a;

    move-result-object v1

    invoke-interface {v1, p0}, Ly6/a;->O(Lcom/google/android/gms/maps/model/LatLng;)Lr6/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lx6/a;-><init>(Lr6/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lz6/v;

    invoke-direct {v0, p0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static c(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lx6/a;
    .locals 2

    const-string v0, "bounds must not be null"

    invoke-static {p0, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lx6/a;

    invoke-static {}, Lx6/b;->l()Ly6/a;

    move-result-object v1

    invoke-interface {v1, p0, p1}, Ly6/a;->h(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lr6/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lx6/a;-><init>(Lr6/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lz6/v;

    invoke-direct {p1, p0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw p1
.end method

.method public static d(Lcom/google/android/gms/maps/model/LatLng;F)Lx6/a;
    .locals 2

    const-string v0, "latLng must not be null"

    invoke-static {p0, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lx6/a;

    invoke-static {}, Lx6/b;->l()Ly6/a;

    move-result-object v1

    invoke-interface {v1, p0, p1}, Ly6/a;->s1(Lcom/google/android/gms/maps/model/LatLng;F)Lr6/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lx6/a;-><init>(Lr6/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lz6/v;

    invoke-direct {p1, p0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw p1
.end method

.method public static e(FF)Lx6/a;
    .locals 2

    :try_start_0
    new-instance v0, Lx6/a;

    invoke-static {}, Lx6/b;->l()Ly6/a;

    move-result-object v1

    invoke-interface {v1, p0, p1}, Ly6/a;->u1(FF)Lr6/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lx6/a;-><init>(Lr6/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lz6/v;

    invoke-direct {p1, p0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw p1
.end method

.method public static f(F)Lx6/a;
    .locals 2

    :try_start_0
    new-instance v0, Lx6/a;

    invoke-static {}, Lx6/b;->l()Ly6/a;

    move-result-object v1

    invoke-interface {v1, p0}, Ly6/a;->zoomBy(F)Lr6/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lx6/a;-><init>(Lr6/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lz6/v;

    invoke-direct {v0, p0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static g(FLandroid/graphics/Point;)Lx6/a;
    .locals 3

    const-string v0, "focus must not be null"

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Lx6/a;

    invoke-static {}, Lx6/b;->l()Ly6/a;

    move-result-object v1

    iget v2, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    invoke-interface {v1, p0, v2, p1}, Ly6/a;->r0(FII)Lr6/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lx6/a;-><init>(Lr6/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lz6/v;

    invoke-direct {p1, p0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw p1
.end method

.method public static h()Lx6/a;
    .locals 2

    :try_start_0
    new-instance v0, Lx6/a;

    invoke-static {}, Lx6/b;->l()Ly6/a;

    move-result-object v1

    invoke-interface {v1}, Ly6/a;->zoomIn()Lr6/b;

    move-result-object v1

    invoke-direct {v0, v1}, Lx6/a;-><init>(Lr6/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public static i()Lx6/a;
    .locals 2

    :try_start_0
    new-instance v0, Lx6/a;

    invoke-static {}, Lx6/b;->l()Ly6/a;

    move-result-object v1

    invoke-interface {v1}, Ly6/a;->zoomOut()Lr6/b;

    move-result-object v1

    invoke-direct {v0, v1}, Lx6/a;-><init>(Lr6/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public static j(F)Lx6/a;
    .locals 2

    :try_start_0
    new-instance v0, Lx6/a;

    invoke-static {}, Lx6/b;->l()Ly6/a;

    move-result-object v1

    invoke-interface {v1, p0}, Ly6/a;->n1(F)Lr6/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lx6/a;-><init>(Lr6/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance v0, Lz6/v;

    invoke-direct {v0, p0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public static k(Ly6/a;)V
    .locals 0

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly6/a;

    sput-object p0, Lx6/b;->a:Ly6/a;

    return-void
.end method

.method public static l()Ly6/a;
    .locals 2

    sget-object v0, Lx6/b;->a:Ly6/a;

    const-string v1, "CameraUpdateFactory is not initialized"

    invoke-static {v0, v1}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly6/a;

    return-object v0
.end method
