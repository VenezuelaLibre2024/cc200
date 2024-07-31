.class public Lcom/baseflow/geolocator/GeolocatorLocationService;
.super Landroid/app/Service;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baseflow/geolocator/GeolocatorLocationService$a;
    }
.end annotation


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Lcom/baseflow/geolocator/GeolocatorLocationService$a;

.field public k:Z

.field public l:I

.field public m:I

.field public n:Landroid/app/Activity;

.field public o:Lw2/k;

.field public p:Lw2/o;

.field public q:Landroid/os/PowerManager$WakeLock;

.field public r:Landroid/net/wifi/WifiManager$WifiLock;

.field public s:Lw2/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const-string v0, "GeolocatorLocationService:Wakelock"

    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->h:Ljava/lang/String;

    const-string v0, "GeolocatorLocationService:WifiLock"

    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->i:Ljava/lang/String;

    new-instance v0, Lcom/baseflow/geolocator/GeolocatorLocationService$a;

    invoke-direct {v0, p0, p0}, Lcom/baseflow/geolocator/GeolocatorLocationService$a;-><init>(Lcom/baseflow/geolocator/GeolocatorLocationService;Lcom/baseflow/geolocator/GeolocatorLocationService;)V

    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->j:Lcom/baseflow/geolocator/GeolocatorLocationService$a;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->k:Z

    iput v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->l:I

    iput v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->m:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->n:Landroid/app/Activity;

    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->o:Lw2/k;

    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->q:Landroid/os/PowerManager$WakeLock;

    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->r:Landroid/net/wifi/WifiManager$WifiLock;

    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->s:Lw2/b;

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugin/common/EventChannel$EventSink;Landroid/location/Location;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/baseflow/geolocator/GeolocatorLocationService;->i(Lio/flutter/plugin/common/EventChannel$EventSink;Landroid/location/Location;)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugin/common/EventChannel$EventSink;Lv2/b;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/baseflow/geolocator/GeolocatorLocationService;->j(Lio/flutter/plugin/common/EventChannel$EventSink;Lv2/b;)V

    return-void
.end method

.method public static synthetic i(Lio/flutter/plugin/common/EventChannel$EventSink;Landroid/location/Location;)V
    .locals 0

    invoke-static {p1}, Lw2/q;->b(Landroid/location/Location;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic j(Lio/flutter/plugin/common/EventChannel$EventSink;Lv2/b;)V
    .locals 2

    invoke-virtual {p1}, Lv2/b;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lv2/b;->c()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p0, v0, p1, v1}, Lio/flutter/plugin/common/EventChannel$EventSink;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public c(Z)Z
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    iget p1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->m:I

    if-ne p1, v1, :cond_0

    move v0, v1

    :cond_0
    return v0

    :cond_1
    iget p1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->l:I

    if-nez p1, :cond_2

    move v0, v1

    :cond_2
    return v0
.end method

.method public d(Lw2/d;)V
    .locals 2

    iget-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->s:Lw2/b;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->k:Z

    invoke-virtual {v0, p1, v1}, Lw2/b;->f(Lw2/d;Z)V

    invoke-virtual {p0, p1}, Lcom/baseflow/geolocator/GeolocatorLocationService;->k(Lw2/d;)V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 3

    iget-boolean v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->k:Z

    if-eqz v0, :cond_1

    const-string v0, "FlutterGeolocator"

    const-string v1, "Stop service in foreground."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    const/4 v2, 0x1

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, v2}, Landroid/app/Service;->stopForeground(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v2}, Landroid/app/Service;->stopForeground(Z)V

    :goto_0
    invoke-virtual {p0}, Lcom/baseflow/geolocator/GeolocatorLocationService;->l()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->k:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->s:Lw2/b;

    :cond_1
    return-void
.end method

.method public f(Lw2/d;)V
    .locals 5

    iget-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->s:Lw2/b;

    const-string v1, "FlutterGeolocator"

    if-eqz v0, :cond_0

    const-string v0, "Service already in foreground mode."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Lcom/baseflow/geolocator/GeolocatorLocationService;->d(Lw2/d;)V

    goto :goto_0

    :cond_0
    const-string v0, "Start service in foreground mode."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lw2/b;

    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x12697

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "geolocator_channel_01"

    invoke-direct {v0, v1, v4, v3, p1}, Lw2/b;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Lw2/d;)V

    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->s:Lw2/b;

    const-string v1, "Background Location"

    invoke-virtual {v0, v1}, Lw2/b;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->s:Lw2/b;

    invoke-virtual {v0}, Lw2/b;->a()Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->k:Z

    :goto_0
    invoke-virtual {p0, p1}, Lcom/baseflow/geolocator/GeolocatorLocationService;->k(Lw2/d;)V

    return-void
.end method

.method public g()V
    .locals 2

    iget v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->l:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->l:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Flutter engine connected. Connected engine count "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->l:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FlutterGeolocator"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public h()V
    .locals 2

    iget v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->l:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->l:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Flutter engine disconnected. Connected engine count "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->l:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FlutterGeolocator"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final k(Lw2/d;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WakelockTimeout"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/baseflow/geolocator/GeolocatorLocationService;->l()V

    invoke-virtual {p1}, Lw2/d;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "power"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    const-string v3, "GeolocatorLocationService:Wakelock"

    invoke-virtual {v0, v2, v3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->q:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0, v1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    iget-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->q:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    :cond_0
    invoke-virtual {p1}, Lw2/d;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "wifi"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/wifi/WifiManager;

    if-eqz p1, :cond_1

    const/4 v0, 0x3

    const-string v2, "GeolocatorLocationService:WifiLock"

    invoke-virtual {p1, v0, v2}, Landroid/net/wifi/WifiManager;->createWifiLock(ILjava/lang/String;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object p1

    iput-object p1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->r:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-virtual {p1, v1}, Landroid/net/wifi/WifiManager$WifiLock;->setReferenceCounted(Z)V

    iget-object p1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->r:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-virtual {p1}, Landroid/net/wifi/WifiManager$WifiLock;->acquire()V

    :cond_1
    return-void
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->q:Landroid/os/PowerManager$WakeLock;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->q:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    iput-object v1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->q:Landroid/os/PowerManager$WakeLock;

    :cond_0
    iget-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->r:Landroid/net/wifi/WifiManager$WifiLock;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->r:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->release()V

    iput-object v1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->r:Landroid/net/wifi/WifiManager$WifiLock;

    :cond_1
    return-void
.end method

.method public m(Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->n:Landroid/app/Activity;

    return-void
.end method

.method public n(ZLw2/r;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 3

    iget v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->m:I

    iget-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->o:Lw2/k;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v0, v1, p1, p2}, Lw2/k;->a(Landroid/content/Context;ZLw2/r;)Lw2/o;

    move-result-object p1

    iput-object p1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->p:Lw2/o;

    iget-object p2, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->o:Lw2/k;

    iget-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->n:Landroid/app/Activity;

    new-instance v1, Lu2/b;

    invoke-direct {v1, p3}, Lu2/b;-><init>(Lio/flutter/plugin/common/EventChannel$EventSink;)V

    new-instance v2, Lu2/a;

    invoke-direct {v2, p3}, Lu2/a;-><init>(Lio/flutter/plugin/common/EventChannel$EventSink;)V

    invoke-virtual {p2, p1, v0, v1, v2}, Lw2/k;->e(Lw2/o;Landroid/app/Activity;Lw2/w;Lv2/a;)V

    :cond_0
    return-void
.end method

.method public o()V
    .locals 2

    iget v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->m:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->m:I

    const-string v0, "FlutterGeolocator"

    const-string v1, "Stopping location service."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->p:Lw2/o;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->o:Lw2/k;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lw2/k;->f(Lw2/o;)V

    :cond_0
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const-string p1, "FlutterGeolocator"

    const-string v0, "Binding to location service."

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->j:Lcom/baseflow/geolocator/GeolocatorLocationService$a;

    return-object p1
.end method

.method public onCreate()V
    .locals 2

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    const-string v0, "FlutterGeolocator"

    const-string v1, "Creating service."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lw2/k;

    invoke-direct {v0}, Lw2/k;-><init>()V

    iput-object v0, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->o:Lw2/k;

    return-void
.end method

.method public onDestroy()V
    .locals 2

    const-string v0, "FlutterGeolocator"

    const-string v1, "Destroying location service."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/baseflow/geolocator/GeolocatorLocationService;->o()V

    invoke-virtual {p0}, Lcom/baseflow/geolocator/GeolocatorLocationService;->e()V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->o:Lw2/k;

    iput-object v1, p0, Lcom/baseflow/geolocator/GeolocatorLocationService;->s:Lw2/b;

    const-string v1, "Destroyed location service."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 2

    const-string v0, "FlutterGeolocator"

    const-string v1, "Unbinding from location service."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    move-result p1

    return p1
.end method
