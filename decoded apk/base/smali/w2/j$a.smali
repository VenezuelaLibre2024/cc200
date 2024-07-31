.class public Lw2/j$a;
.super Lw6/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw2/j;-><init>(Landroid/content/Context;Lw2/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lw2/j;


# direct methods
.method public constructor <init>(Lw2/j;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lw2/j$a;->b:Lw2/j;

    iput-object p2, p0, Lw2/j$a;->a:Landroid/content/Context;

    invoke-direct {p0}, Lw6/m;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized onLocationAvailability(Lcom/google/android/gms/location/LocationAvailability;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/location/LocationAvailability;->I()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lw2/j$a;->b:Lw2/j;

    iget-object v0, p0, Lw2/j$a;->a:Landroid/content/Context;

    invoke-interface {p1, v0}, Lw2/o;->a(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lw2/j$a;->b:Lw2/j;

    invoke-static {p1}, Lw2/j;->n(Lw2/j;)Lv2/a;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lw2/j$a;->b:Lw2/j;

    invoke-static {p1}, Lw2/j;->n(Lw2/j;)Lv2/a;

    move-result-object p1

    sget-object v0, Lv2/b;->j:Lv2/b;

    invoke-interface {p1, v0}, Lv2/a;->a(Lv2/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized onLocationResult(Lcom/google/android/gms/location/LocationResult;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lw2/j$a;->b:Lw2/j;

    invoke-static {v0}, Lw2/j;->k(Lw2/j;)Lw2/w;

    move-result-object v0

    if-nez v0, :cond_1

    const-string p1, "FlutterGeolocator"

    const-string v0, "LocationCallback was called with empty locationResult or no positionChangedCallback was registered."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lw2/j$a;->b:Lw2/j;

    invoke-static {p1}, Lw2/j;->m(Lw2/j;)Lw6/g;

    move-result-object p1

    iget-object v0, p0, Lw2/j$a;->b:Lw2/j;

    invoke-static {v0}, Lw2/j;->l(Lw2/j;)Lw6/m;

    move-result-object v0

    invoke-interface {p1, v0}, Lw6/g;->removeLocationUpdates(Lw6/m;)Lcom/google/android/gms/tasks/Task;

    iget-object p1, p0, Lw2/j$a;->b:Lw2/j;

    invoke-static {p1}, Lw2/j;->n(Lw2/j;)Lv2/a;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lw2/j$a;->b:Lw2/j;

    invoke-static {p1}, Lw2/j;->n(Lw2/j;)Lv2/a;

    move-result-object p1

    sget-object v0, Lv2/b;->i:Lv2/b;

    invoke-interface {p1, v0}, Lv2/a;->a(Lv2/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/android/gms/location/LocationResult;->I()Landroid/location/Location;

    move-result-object p1

    iget-object v0, p0, Lw2/j$a;->b:Lw2/j;

    invoke-static {v0}, Lw2/j;->o(Lw2/j;)Lw2/v;

    move-result-object v0

    invoke-virtual {v0, p1}, Lw2/v;->b(Landroid/location/Location;)V

    iget-object v0, p0, Lw2/j$a;->b:Lw2/j;

    invoke-static {v0}, Lw2/j;->k(Lw2/j;)Lw2/w;

    move-result-object v0

    invoke-interface {v0, p1}, Lw2/w;->a(Landroid/location/Location;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
