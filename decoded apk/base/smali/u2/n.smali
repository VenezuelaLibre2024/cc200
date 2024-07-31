.class public Lu2/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# instance fields
.field public final h:Lx2/b;

.field public i:Lio/flutter/plugin/common/EventChannel;

.field public j:Landroid/content/Context;

.field public k:Landroid/app/Activity;

.field public l:Lcom/baseflow/geolocator/GeolocatorLocationService;

.field public m:Lw2/k;

.field public n:Lw2/o;


# direct methods
.method public constructor <init>(Lx2/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/n;->h:Lx2/b;

    new-instance p1, Lw2/k;

    invoke-direct {p1}, Lw2/k;-><init>()V

    iput-object p1, p0, Lu2/n;->m:Lw2/k;

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugin/common/EventChannel$EventSink;Lv2/b;)V
    .locals 0

    invoke-static {p0, p1}, Lu2/n;->e(Lio/flutter/plugin/common/EventChannel$EventSink;Lv2/b;)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugin/common/EventChannel$EventSink;Landroid/location/Location;)V
    .locals 0

    invoke-static {p0, p1}, Lu2/n;->d(Lio/flutter/plugin/common/EventChannel$EventSink;Landroid/location/Location;)V

    return-void
.end method

.method public static synthetic d(Lio/flutter/plugin/common/EventChannel$EventSink;Landroid/location/Location;)V
    .locals 0

    invoke-static {p1}, Lw2/q;->b(Landroid/location/Location;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lio/flutter/plugin/common/EventChannel$EventSink;Lv2/b;)V
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
.method public final c(Z)V
    .locals 2

    const-string v0, "FlutterGeolocator"

    const-string v1, "Geolocator position updates stopped"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lu2/n;->l:Lcom/baseflow/geolocator/GeolocatorLocationService;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lcom/baseflow/geolocator/GeolocatorLocationService;->c(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu2/n;->l:Lcom/baseflow/geolocator/GeolocatorLocationService;

    invoke-virtual {p1}, Lcom/baseflow/geolocator/GeolocatorLocationService;->o()V

    iget-object p1, p0, Lu2/n;->l:Lcom/baseflow/geolocator/GeolocatorLocationService;

    invoke-virtual {p1}, Lcom/baseflow/geolocator/GeolocatorLocationService;->e()V

    goto :goto_0

    :cond_0
    const-string p1, "There is still another flutter engine connected, not stopping location service"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iget-object p1, p0, Lu2/n;->n:Lw2/o;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lu2/n;->m:Lw2/k;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lw2/k;->f(Lw2/o;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lu2/n;->n:Lw2/o;

    :cond_1
    return-void
.end method

.method public f(Landroid/app/Activity;)V
    .locals 1

    if-nez p1, :cond_0

    iget-object v0, p0, Lu2/n;->n:Lw2/o;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu2/n;->i:Lio/flutter/plugin/common/EventChannel;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lu2/n;->i()V

    :cond_0
    iput-object p1, p0, Lu2/n;->k:Landroid/app/Activity;

    return-void
.end method

.method public g(Lcom/baseflow/geolocator/GeolocatorLocationService;)V
    .locals 0

    iput-object p1, p0, Lu2/n;->l:Lcom/baseflow/geolocator/GeolocatorLocationService;

    return-void
.end method

.method public h(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V
    .locals 2

    iget-object v0, p0, Lu2/n;->i:Lio/flutter/plugin/common/EventChannel;

    if-eqz v0, :cond_0

    const-string v0, "FlutterGeolocator"

    const-string v1, "Setting a event call handler before the last was disposed."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lu2/n;->i()V

    :cond_0
    new-instance v0, Lio/flutter/plugin/common/EventChannel;

    const-string v1, "flutter.baseflow.com/geolocator_updates_android"

    invoke-direct {v0, p2, v1}, Lio/flutter/plugin/common/EventChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lu2/n;->i:Lio/flutter/plugin/common/EventChannel;

    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    iput-object p1, p0, Lu2/n;->j:Landroid/content/Context;

    return-void
.end method

.method public i()V
    .locals 2

    iget-object v0, p0, Lu2/n;->i:Lio/flutter/plugin/common/EventChannel;

    if-nez v0, :cond_0

    const-string v0, "FlutterGeolocator"

    const-string v1, "Tried to stop listening when no MethodChannel had been initialized."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lu2/n;->c(Z)V

    iget-object v0, p0, Lu2/n;->i:Lio/flutter/plugin/common/EventChannel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    iput-object v1, p0, Lu2/n;->i:Lio/flutter/plugin/common/EventChannel;

    return-void
.end method

.method public onCancel(Ljava/lang/Object;)V
    .locals 0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lu2/n;->c(Z)V

    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lu2/n;->h:Lx2/b;

    iget-object v2, p0, Lu2/n;->j:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lx2/b;->d(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object p1, Lv2/b;->l:Lv2/b;

    invoke-virtual {p1}, Lv2/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lv2/b;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v1, p1, v0}, Lio/flutter/plugin/common/EventChannel$EventSink;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Lv2/c; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :cond_0
    iget-object v1, p0, Lu2/n;->l:Lcom/baseflow/geolocator/GeolocatorLocationService;

    const-string v2, "FlutterGeolocator"

    if-nez v1, :cond_1

    const-string p1, "Location background service has not started correctly"

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    check-cast p1, Ljava/util/Map;

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-string v3, "forceLocationManager"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_2
    invoke-static {p1}, Lw2/r;->e(Ljava/util/Map;)Lw2/r;

    move-result-object v3

    if-eqz p1, :cond_3

    const-string v0, "foregroundNotificationConfig"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lw2/d;->g(Ljava/util/Map;)Lw2/d;

    move-result-object v0

    :cond_3
    if-eqz v0, :cond_4

    const-string p1, "Geolocator position updates started using Android foreground service"

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lu2/n;->l:Lcom/baseflow/geolocator/GeolocatorLocationService;

    invoke-virtual {p1, v1, v3, p2}, Lcom/baseflow/geolocator/GeolocatorLocationService;->n(ZLw2/r;Lio/flutter/plugin/common/EventChannel$EventSink;)V

    iget-object p1, p0, Lu2/n;->l:Lcom/baseflow/geolocator/GeolocatorLocationService;

    invoke-virtual {p1, v0}, Lcom/baseflow/geolocator/GeolocatorLocationService;->f(Lw2/d;)V

    goto :goto_0

    :cond_4
    const-string p1, "Geolocator position updates started"

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lu2/n;->m:Lw2/k;

    iget-object v0, p0, Lu2/n;->j:Landroid/content/Context;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p1, v0, v1, v3}, Lw2/k;->a(Landroid/content/Context;ZLw2/r;)Lw2/o;

    move-result-object p1

    iput-object p1, p0, Lu2/n;->n:Lw2/o;

    iget-object v0, p0, Lu2/n;->m:Lw2/k;

    iget-object v1, p0, Lu2/n;->k:Landroid/app/Activity;

    new-instance v2, Lu2/m;

    invoke-direct {v2, p2}, Lu2/m;-><init>(Lio/flutter/plugin/common/EventChannel$EventSink;)V

    new-instance v3, Lu2/l;

    invoke-direct {v3, p2}, Lu2/l;-><init>(Lio/flutter/plugin/common/EventChannel$EventSink;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lw2/k;->e(Lw2/o;Landroid/app/Activity;Lw2/w;Lv2/a;)V

    :goto_0
    return-void

    :catch_0
    sget-object p1, Lv2/b;->k:Lv2/b;

    invoke-virtual {p1}, Lv2/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lv2/b;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v1, p1, v0}, Lio/flutter/plugin/common/EventChannel$EventSink;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
