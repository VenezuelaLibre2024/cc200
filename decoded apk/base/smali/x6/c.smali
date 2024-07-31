.class public Lx6/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx6/c$d;,
        Lx6/c$c;,
        Lx6/c$b;,
        Lx6/c$h;,
        Lx6/c$i;,
        Lx6/c$j;,
        Lx6/c$k;,
        Lx6/c$f;,
        Lx6/c$g;,
        Lx6/c$a;,
        Lx6/c$e;,
        Lx6/c$l;,
        Lx6/c$m;,
        Lx6/c$n;
    }
.end annotation


# instance fields
.field public final a:Ly6/b;

.field public final b:Ljava/util/Map;

.field public final c:Ljava/util/Map;

.field public d:Lx6/i;


# direct methods
.method public constructor <init>(Ly6/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lx6/c;->b:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lx6/c;->c:Ljava/util/Map;

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly6/b;

    iput-object p1, p0, Lx6/c;->a:Ly6/b;

    return-void
.end method


# virtual methods
.method public final A(Lx6/c$d;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lx6/c;->a:Ly6/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ly6/b;->j1(Ly6/q0;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    new-instance v1, Lx6/x;

    invoke-direct {v1, p0, p1}, Lx6/x;-><init>(Lx6/c;Lx6/c$d;)V

    invoke-interface {v0, v1}, Ly6/b;->j1(Ly6/q0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final B(Lx6/c$e;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lx6/c;->a:Ly6/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ly6/b;->o(Ly6/s0;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    new-instance v1, Lx6/t;

    invoke-direct {v1, p0, p1}, Lx6/t;-><init>(Lx6/c;Lx6/c$e;)V

    invoke-interface {v0, v1}, Ly6/b;->o(Ly6/s0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final C(Lx6/c$f;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lx6/c;->a:Ly6/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ly6/b;->p(Ly6/h;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    new-instance v1, Lx6/q;

    invoke-direct {v1, p0, p1}, Lx6/q;-><init>(Lx6/c;Lx6/c$f;)V

    invoke-interface {v0, v1}, Ly6/b;->p(Ly6/h;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final D(Lx6/c$g;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lx6/c;->a:Ly6/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ly6/b;->P0(Ly6/j;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    new-instance v1, Lx6/r;

    invoke-direct {v1, p0, p1}, Lx6/r;-><init>(Lx6/c;Lx6/c$g;)V

    invoke-interface {v0, v1}, Ly6/b;->P0(Ly6/j;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final E(Lx6/c$h;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lx6/c;->a:Ly6/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ly6/b;->d1(Ly6/l;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    new-instance v1, Lx6/a0;

    invoke-direct {v1, p0, p1}, Lx6/a0;-><init>(Lx6/c;Lx6/c$h;)V

    invoke-interface {v0, v1}, Ly6/b;->d1(Ly6/l;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final F(Lx6/c$i;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lx6/c;->a:Ly6/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ly6/b;->D1(Ly6/n;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    new-instance v1, Lx6/k;

    invoke-direct {v1, p0, p1}, Lx6/k;-><init>(Lx6/c;Lx6/c$i;)V

    invoke-interface {v0, v1}, Ly6/b;->D1(Ly6/n;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final G(Lx6/c$j;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lx6/c;->a:Ly6/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ly6/b;->F1(Ly6/r;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    new-instance v1, Lx6/j;

    invoke-direct {v1, p0, p1}, Lx6/j;-><init>(Lx6/c;Lx6/c$j;)V

    invoke-interface {v0, v1}, Ly6/b;->F1(Ly6/r;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final H(Lx6/c$k;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lx6/c;->a:Ly6/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ly6/b;->I1(Ly6/t;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    new-instance v1, Lx6/p;

    invoke-direct {v1, p0, p1}, Lx6/p;-><init>(Lx6/c;Lx6/c$k;)V

    invoke-interface {v0, v1}, Ly6/b;->I1(Ly6/t;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final I(Lx6/c$l;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lx6/c;->a:Ly6/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ly6/b;->J1(Ly6/w;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    new-instance v1, Lx6/u;

    invoke-direct {v1, p0, p1}, Lx6/u;-><init>(Lx6/c;Lx6/c$l;)V

    invoke-interface {v0, v1}, Ly6/b;->J1(Ly6/w;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final J(Lx6/c$m;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lx6/c;->a:Ly6/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ly6/b;->T0(Ly6/y;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    new-instance v1, Lx6/v;

    invoke-direct {v1, p0, p1}, Lx6/v;-><init>(Lx6/c;Lx6/c$m;)V

    invoke-interface {v0, v1}, Ly6/b;->T0(Ly6/y;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final K(IIII)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v0, p1, p2, p3, p4}, Ly6/b;->G(IIII)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lz6/v;

    invoke-direct {p2, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw p2
.end method

.method public final L(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v0, p1}, Ly6/b;->setTrafficEnabled(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final M(Lx6/c$n;)V
    .locals 1

    const-string v0, "Callback must not be null."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lx6/c;->N(Lx6/c$n;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public final N(Lx6/c$n;Landroid/graphics/Bitmap;)V
    .locals 2

    const-string v0, "Callback must not be null."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    invoke-static {p2}, Lr6/d;->g(Ljava/lang/Object;)Lr6/b;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    check-cast p2, Lr6/d;

    :try_start_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    new-instance v1, Lx6/w;

    invoke-direct {v1, p0, p1}, Lx6/w;-><init>(Lx6/c;Lx6/c$n;)V

    invoke-interface {v0, v1, p2}, Ly6/b;->f1(Ly6/b0;Lr6/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lz6/v;

    invoke-direct {p2, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw p2
.end method

.method public final a(Lz6/g;)Lz6/f;
    .locals 2

    :try_start_0
    const-string v0, "CircleOptions must not be null."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lz6/f;

    iget-object v1, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v1, p1}, Ly6/b;->H(Lz6/g;)Lcom/google/android/gms/internal/maps/zzl;

    move-result-object p1

    invoke-direct {v0, p1}, Lz6/f;-><init>(Lcom/google/android/gms/internal/maps/zzl;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final b(Lz6/n;)Lz6/m;
    .locals 2

    :try_start_0
    const-string v0, "MarkerOptions must not be null."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v0, p1}, Ly6/b;->p1(Lz6/n;)Lcom/google/android/gms/internal/maps/zzad;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lz6/n;->i0()I

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    new-instance p1, Lz6/a;

    invoke-direct {p1, v0}, Lz6/a;-><init>(Lcom/google/android/gms/internal/maps/zzad;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lz6/m;

    invoke-direct {p1, v0}, Lz6/m;-><init>(Lcom/google/android/gms/internal/maps/zzad;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final c(Lz6/r;)Lz6/q;
    .locals 2

    :try_start_0
    const-string v0, "PolygonOptions must not be null"

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lz6/q;

    iget-object v1, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v1, p1}, Ly6/b;->G0(Lz6/r;)Lcom/google/android/gms/internal/maps/zzag;

    move-result-object p1

    invoke-direct {v0, p1}, Lz6/q;-><init>(Lcom/google/android/gms/internal/maps/zzag;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final d(Lz6/t;)Lz6/s;
    .locals 2

    :try_start_0
    const-string v0, "PolylineOptions must not be null"

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lz6/s;

    iget-object v1, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v1, p1}, Ly6/b;->X0(Lz6/t;)Lcom/google/android/gms/internal/maps/zzaj;

    move-result-object p1

    invoke-direct {v0, p1}, Lz6/s;-><init>(Lcom/google/android/gms/internal/maps/zzaj;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final e(Lz6/c0;)Lz6/b0;
    .locals 1

    :try_start_0
    const-string v0, "TileOverlayOptions must not be null."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v0, p1}, Ly6/b;->r(Lz6/c0;)Lcom/google/android/gms/internal/maps/zzam;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lz6/b0;

    invoke-direct {v0, p1}, Lz6/b0;-><init>(Lcom/google/android/gms/internal/maps/zzam;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final f(Lx6/a;)V
    .locals 1

    :try_start_0
    const-string v0, "CameraUpdate must not be null."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-virtual {p1}, Lx6/a;->a()Lr6/b;

    move-result-object p1

    invoke-interface {v0, p1}, Ly6/b;->U0(Lr6/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final g()Lcom/google/android/gms/maps/model/CameraPosition;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v0}, Ly6/b;->U()Lcom/google/android/gms/maps/model/CameraPosition;

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

.method public final h()F
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v0}, Ly6/b;->q1()F

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

.method public final i()F
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v0}, Ly6/b;->m()F

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

.method public final j()Lx6/h;
    .locals 2

    :try_start_0
    new-instance v0, Lx6/h;

    iget-object v1, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v1}, Ly6/b;->b1()Ly6/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lx6/h;-><init>(Ly6/d;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final k()Lx6/i;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/c;->d:Lx6/i;

    if-nez v0, :cond_0

    new-instance v0, Lx6/i;

    iget-object v1, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v1}, Ly6/b;->O0()Ly6/e;

    move-result-object v1

    invoke-direct {v0, v1}, Lx6/i;-><init>(Ly6/e;)V

    iput-object v0, p0, Lx6/c;->d:Lx6/i;

    :cond_0
    iget-object v0, p0, Lx6/c;->d:Lx6/i;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final l()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v0}, Ly6/b;->S0()Z

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

.method public final m()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v0}, Ly6/b;->l0()Z

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

.method public final n(Lx6/a;)V
    .locals 1

    :try_start_0
    const-string v0, "CameraUpdate must not be null."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-virtual {p1}, Lx6/a;->a()Lr6/b;

    move-result-object p1

    invoke-interface {v0, p1}, Ly6/b;->C(Lr6/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public o()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v0}, Ly6/b;->F0()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final p(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v0, p1}, Ly6/b;->setBuildingsEnabled(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final q(Z)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v0, p1}, Ly6/b;->setIndoorEnabled(Z)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final r(Lx6/c$a;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lx6/c;->a:Ly6/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ly6/b;->I(Ly6/j0;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    new-instance v1, Lx6/s;

    invoke-direct {v1, p0, p1}, Lx6/s;-><init>(Lx6/c;Lx6/c$a;)V

    invoke-interface {v0, v1}, Ly6/b;->I(Ly6/j0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public s(Lcom/google/android/gms/maps/model/LatLngBounds;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v0, p1}, Ly6/b;->s(Lcom/google/android/gms/maps/model/LatLngBounds;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public t(Lz6/l;)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v0, p1}, Ly6/b;->a0(Lz6/l;)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final u(I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v0, p1}, Ly6/b;->setMapType(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public v(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v0, p1}, Ly6/b;->o0(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public w(F)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v0, p1}, Ly6/b;->v0(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final x(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    invoke-interface {v0, p1}, Ly6/b;->setMyLocationEnabled(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final y(Lx6/c$b;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lx6/c;->a:Ly6/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ly6/b;->A(Ly6/m0;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    new-instance v1, Lx6/z;

    invoke-direct {v1, p0, p1}, Lx6/z;-><init>(Lx6/c;Lx6/c$b;)V

    invoke-interface {v0, v1}, Ly6/b;->A(Ly6/m0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final z(Lx6/c$c;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lx6/c;->a:Ly6/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ly6/b;->v1(Ly6/o0;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx6/c;->a:Ly6/b;

    new-instance v1, Lx6/y;

    invoke-direct {v1, p0, p1}, Lx6/y;-><init>(Lx6/c;Lx6/c$c;)V

    invoke-interface {v0, v1}, Ly6/b;->v1(Ly6/o0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lz6/v;

    invoke-direct {v0, p1}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method
