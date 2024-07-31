.class public Ld0/b$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public volatile a:Ld0/b$c;

.field public final b:Ljava/util/concurrent/Executor;


# direct methods
.method public static synthetic a(Ld0/b$d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ld0/b$d;->l(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Ld0/b$d;Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ld0/b$d;->m(Ljava/lang/String;ILandroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic c(Ld0/b$d;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Ld0/b$d;->j(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic d(Ld0/b$d;I)V
    .locals 0

    invoke-direct {p0, p1}, Ld0/b$d;->h(I)V

    return-void
.end method

.method public static synthetic e(Ld0/b$d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ld0/b$d;->k(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic f(Ld0/b$d;Landroid/location/Location;)V
    .locals 0

    invoke-direct {p0, p1}, Ld0/b$d;->i(Landroid/location/Location;)V

    return-void
.end method

.method private synthetic h(I)V
    .locals 1

    iget-object v0, p0, Ld0/b$d;->a:Ld0/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Ld0/b$c;->b:Ld0/a;

    invoke-interface {v0, p1}, Ld0/a;->onFlushComplete(I)V

    return-void
.end method

.method private synthetic i(Landroid/location/Location;)V
    .locals 1

    iget-object v0, p0, Ld0/b$d;->a:Ld0/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Ld0/b$c;->b:Ld0/a;

    invoke-interface {v0, p1}, Landroid/location/LocationListener;->onLocationChanged(Landroid/location/Location;)V

    return-void
.end method

.method private synthetic j(Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, Ld0/b$d;->a:Ld0/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Ld0/b$c;->b:Ld0/a;

    invoke-interface {v0, p1}, Ld0/a;->onLocationChanged(Ljava/util/List;)V

    return-void
.end method

.method private synthetic k(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ld0/b$d;->a:Ld0/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Ld0/b$c;->b:Ld0/a;

    invoke-interface {v0, p1}, Ld0/a;->onProviderDisabled(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic l(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ld0/b$d;->a:Ld0/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Ld0/b$c;->b:Ld0/a;

    invoke-interface {v0, p1}, Ld0/a;->onProviderEnabled(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic m(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Ld0/b$d;->a:Ld0/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Ld0/b$c;->b:Ld0/a;

    invoke-interface {v0, p1, p2, p3}, Ld0/a;->onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public g()Ld0/b$c;
    .locals 1

    iget-object v0, p0, Ld0/b$d;->a:Ld0/b$c;

    invoke-static {v0}, Lj0/b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld0/b$c;

    return-object v0
.end method

.method public n()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ld0/b$d;->a:Ld0/b$c;

    return-void
.end method

.method public onFlushComplete(I)V
    .locals 2

    iget-object v0, p0, Ld0/b$d;->a:Ld0/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ld0/b$d;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Ld0/c;

    invoke-direct {v1, p0, p1}, Ld0/c;-><init>(Ld0/b$d;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 2

    iget-object v0, p0, Ld0/b$d;->a:Ld0/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ld0/b$d;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Ld0/d;

    invoke-direct {v1, p0, p1}, Ld0/d;-><init>(Ld0/b$d;Landroid/location/Location;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onLocationChanged(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/location/Location;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ld0/b$d;->a:Ld0/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ld0/b$d;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Ld0/h;

    invoke-direct {v1, p0, p1}, Ld0/h;-><init>(Ld0/b$d;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Ld0/b$d;->a:Ld0/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ld0/b$d;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Ld0/f;

    invoke-direct {v1, p0, p1}, Ld0/f;-><init>(Ld0/b$d;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Ld0/b$d;->a:Ld0/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ld0/b$d;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Ld0/e;

    invoke-direct {v1, p0, p1}, Ld0/e;-><init>(Ld0/b$d;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Ld0/b$d;->a:Ld0/b$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ld0/b$d;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Ld0/g;

    invoke-direct {v1, p0, p1, p2, p3}, Ld0/g;-><init>(Ld0/b$d;Ljava/lang/String;ILandroid/os/Bundle;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
