.class public final Lx6/h;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ly6/d;


# direct methods
.method public constructor <init>(Ly6/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/h;->a:Ly6/d;

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lx6/h;->a:Ly6/d;

    invoke-static {p1}, Lr6/d;->g(Ljava/lang/Object;)Lr6/b;

    move-result-object p1

    invoke-interface {v0, p1}, Ly6/d;->n0(Lr6/b;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public b()Lz6/e0;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/h;->a:Ly6/d;

    invoke-interface {v0}, Ly6/d;->d0()Lz6/e0;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public c(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/Point;
    .locals 1

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lx6/h;->a:Ly6/d;

    invoke-interface {v0, p1}, Ly6/d;->R(Lcom/google/android/gms/maps/model/LatLng;)Lr6/b;

    move-result-object p1

    invoke-static {p1}, Lr6/d;->e(Lr6/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Point;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method
