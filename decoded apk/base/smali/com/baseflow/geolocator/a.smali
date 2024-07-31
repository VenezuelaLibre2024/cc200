.class public Lcom/baseflow/geolocator/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityAware;


# instance fields
.field public final h:Lx2/b;

.field public final i:Lw2/k;

.field public final j:Lw2/m;

.field public k:Lcom/baseflow/geolocator/GeolocatorLocationService;

.field public l:Lu2/k;

.field public m:Lu2/n;

.field public final n:Landroid/content/ServiceConnection;

.field public o:Lu2/c;

.field public p:Lio/flutter/plugin/common/PluginRegistry$Registrar;

.field public q:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/baseflow/geolocator/a$a;

    invoke-direct {v0, p0}, Lcom/baseflow/geolocator/a$a;-><init>(Lcom/baseflow/geolocator/a;)V

    iput-object v0, p0, Lcom/baseflow/geolocator/a;->n:Landroid/content/ServiceConnection;

    new-instance v0, Lx2/b;

    invoke-direct {v0}, Lx2/b;-><init>()V

    iput-object v0, p0, Lcom/baseflow/geolocator/a;->h:Lx2/b;

    new-instance v0, Lw2/k;

    invoke-direct {v0}, Lw2/k;-><init>()V

    iput-object v0, p0, Lcom/baseflow/geolocator/a;->i:Lw2/k;

    new-instance v0, Lw2/m;

    invoke-direct {v0}, Lw2/m;-><init>()V

    iput-object v0, p0, Lcom/baseflow/geolocator/a;->j:Lw2/m;

    return-void
.end method

.method public static synthetic a(Lcom/baseflow/geolocator/a;Lcom/baseflow/geolocator/GeolocatorLocationService;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/baseflow/geolocator/a;->g(Lcom/baseflow/geolocator/GeolocatorLocationService;)V

    return-void
.end method

.method public static synthetic b(Lcom/baseflow/geolocator/a;)Lcom/baseflow/geolocator/GeolocatorLocationService;
    .locals 0

    iget-object p0, p0, Lcom/baseflow/geolocator/a;->k:Lcom/baseflow/geolocator/GeolocatorLocationService;

    return-object p0
.end method

.method public static synthetic c(Lcom/baseflow/geolocator/a;Lcom/baseflow/geolocator/GeolocatorLocationService;)Lcom/baseflow/geolocator/GeolocatorLocationService;
    .locals 0

    iput-object p1, p0, Lcom/baseflow/geolocator/a;->k:Lcom/baseflow/geolocator/GeolocatorLocationService;

    return-object p1
.end method


# virtual methods
.method public final d(Landroid/content/Context;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/baseflow/geolocator/GeolocatorLocationService;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Lcom/baseflow/geolocator/a;->n:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->q:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baseflow/geolocator/a;->i:Lw2/k;

    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->removeActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->q:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    iget-object v1, p0, Lcom/baseflow/geolocator/a;->h:Lx2/b;

    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->removeRequestPermissionsResultListener(Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)V

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 2

    const-string v0, "FlutterGeolocator"

    const-string v1, "Disposing Geolocator services"

    invoke-static {v0, v1}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->l:Lu2/k;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lu2/k;->x()V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->l:Lu2/k;

    invoke-virtual {v0, v1}, Lu2/k;->v(Landroid/app/Activity;)V

    iput-object v1, p0, Lcom/baseflow/geolocator/a;->l:Lu2/k;

    :cond_0
    iget-object v0, p0, Lcom/baseflow/geolocator/a;->m:Lu2/n;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lu2/n;->i()V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->m:Lu2/n;

    invoke-virtual {v0, v1}, Lu2/n;->g(Lcom/baseflow/geolocator/GeolocatorLocationService;)V

    iput-object v1, p0, Lcom/baseflow/geolocator/a;->m:Lu2/n;

    :cond_1
    iget-object v0, p0, Lcom/baseflow/geolocator/a;->o:Lu2/c;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Lu2/c;->b(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->o:Lu2/c;

    invoke-virtual {v0}, Lu2/c;->d()V

    iput-object v1, p0, Lcom/baseflow/geolocator/a;->o:Lu2/c;

    :cond_2
    iget-object v0, p0, Lcom/baseflow/geolocator/a;->k:Lcom/baseflow/geolocator/GeolocatorLocationService;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v1}, Lcom/baseflow/geolocator/GeolocatorLocationService;->m(Landroid/app/Activity;)V

    :cond_3
    return-void
.end method

.method public final g(Lcom/baseflow/geolocator/GeolocatorLocationService;)V
    .locals 2

    const-string v0, "FlutterGeolocator"

    const-string v1, "Initializing Geolocator services"

    invoke-static {v0, v1}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/baseflow/geolocator/a;->k:Lcom/baseflow/geolocator/GeolocatorLocationService;

    invoke-virtual {p1}, Lcom/baseflow/geolocator/GeolocatorLocationService;->g()V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->m:Lu2/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lu2/n;->g(Lcom/baseflow/geolocator/GeolocatorLocationService;)V

    :cond_0
    return-void
.end method

.method public final h()V
    .locals 2

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->p:Lio/flutter/plugin/common/PluginRegistry$Registrar;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baseflow/geolocator/a;->i:Lw2/k;

    invoke-interface {v0, v1}, Lio/flutter/plugin/common/PluginRegistry$Registrar;->addActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)Lio/flutter/plugin/common/PluginRegistry$Registrar;

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->p:Lio/flutter/plugin/common/PluginRegistry$Registrar;

    iget-object v1, p0, Lcom/baseflow/geolocator/a;->h:Lx2/b;

    invoke-interface {v0, v1}, Lio/flutter/plugin/common/PluginRegistry$Registrar;->addRequestPermissionsResultListener(Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)Lio/flutter/plugin/common/PluginRegistry$Registrar;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/baseflow/geolocator/a;->q:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/baseflow/geolocator/a;->i:Lw2/k;

    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->addActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->q:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    iget-object v1, p0, Lcom/baseflow/geolocator/a;->h:Lx2/b;

    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->addRequestPermissionsResultListener(Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final i(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->k:Lcom/baseflow/geolocator/GeolocatorLocationService;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baseflow/geolocator/GeolocatorLocationService;->h()V

    :cond_0
    iget-object v0, p0, Lcom/baseflow/geolocator/a;->n:Landroid/content/ServiceConnection;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    return-void
.end method

.method public onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 2

    const-string v0, "FlutterGeolocator"

    const-string v1, "Attaching Geolocator to activity"

    invoke-static {v0, v1}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/baseflow/geolocator/a;->q:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    invoke-virtual {p0}, Lcom/baseflow/geolocator/a;->h()V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->l:Lu2/k;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lu2/k;->v(Landroid/app/Activity;)V

    :cond_0
    iget-object v0, p0, Lcom/baseflow/geolocator/a;->m:Lu2/n;

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p1}, Lu2/n;->f(Landroid/app/Activity;)V

    :cond_1
    iget-object p1, p0, Lcom/baseflow/geolocator/a;->k:Lcom/baseflow/geolocator/GeolocatorLocationService;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->q:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    invoke-interface {v0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/baseflow/geolocator/GeolocatorLocationService;->m(Landroid/app/Activity;)V

    :cond_2
    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 4

    new-instance v0, Lu2/k;

    iget-object v1, p0, Lcom/baseflow/geolocator/a;->h:Lx2/b;

    iget-object v2, p0, Lcom/baseflow/geolocator/a;->i:Lw2/k;

    iget-object v3, p0, Lcom/baseflow/geolocator/a;->j:Lw2/m;

    invoke-direct {v0, v1, v2, v3}, Lu2/k;-><init>(Lx2/b;Lw2/k;Lw2/m;)V

    iput-object v0, p0, Lcom/baseflow/geolocator/a;->l:Lu2/k;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lu2/k;->w(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V

    new-instance v0, Lu2/n;

    iget-object v1, p0, Lcom/baseflow/geolocator/a;->h:Lx2/b;

    invoke-direct {v0, v1}, Lu2/n;-><init>(Lx2/b;)V

    iput-object v0, p0, Lcom/baseflow/geolocator/a;->m:Lu2/n;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lu2/n;->h(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V

    new-instance v0, Lu2/c;

    invoke-direct {v0}, Lu2/c;-><init>()V

    iput-object v0, p0, Lcom/baseflow/geolocator/a;->o:Lu2/c;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lu2/c;->b(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->o:Lu2/c;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lu2/c;->c(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/baseflow/geolocator/a;->d(Landroid/content/Context;)V

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 2

    const-string v0, "FlutterGeolocator"

    const-string v1, "Detaching Geolocator from activity"

    invoke-static {v0, v1}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/baseflow/geolocator/a;->e()V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->l:Lu2/k;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lu2/k;->v(Landroid/app/Activity;)V

    :cond_0
    iget-object v0, p0, Lcom/baseflow/geolocator/a;->m:Lu2/n;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Lu2/n;->f(Landroid/app/Activity;)V

    :cond_1
    iget-object v0, p0, Lcom/baseflow/geolocator/a;->k:Lcom/baseflow/geolocator/GeolocatorLocationService;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Lcom/baseflow/geolocator/GeolocatorLocationService;->m(Landroid/app/Activity;)V

    :cond_2
    iget-object v0, p0, Lcom/baseflow/geolocator/a;->q:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    if-eqz v0, :cond_3

    iput-object v1, p0, Lcom/baseflow/geolocator/a;->q:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    :cond_3
    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    invoke-virtual {p0}, Lcom/baseflow/geolocator/a;->onDetachedFromActivity()V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 0

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/baseflow/geolocator/a;->i(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/baseflow/geolocator/a;->f()V

    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/baseflow/geolocator/a;->onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    return-void
.end method
