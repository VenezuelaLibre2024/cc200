.class Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/embedding/engine/plugins/PluginRegistry;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityControlSurface;
.implements Lio/flutter/embedding/engine/plugins/service/ServiceControlSurface;
.implements Lio/flutter/embedding/engine/plugins/broadcastreceiver/BroadcastReceiverControlSurface;
.implements Lio/flutter/embedding/engine/plugins/contentprovider/ContentProviderControlSurface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineContentProviderPluginBinding;,
        Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineBroadcastReceiverPluginBinding;,
        Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding;,
        Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;,
        Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$DefaultFlutterAssets;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "FlutterEngineCxnRegstry"


# instance fields
.field private final activityAwarePlugins:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lio/flutter/embedding/engine/plugins/FlutterPlugin;",
            ">;",
            "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;",
            ">;"
        }
    .end annotation
.end field

.field private activityPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;

.field private broadcastReceiver:Landroid/content/BroadcastReceiver;

.field private final broadcastReceiverAwarePlugins:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lio/flutter/embedding/engine/plugins/FlutterPlugin;",
            ">;",
            "Lio/flutter/embedding/engine/plugins/broadcastreceiver/BroadcastReceiverAware;",
            ">;"
        }
    .end annotation
.end field

.field private broadcastReceiverPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineBroadcastReceiverPluginBinding;

.field private contentProvider:Landroid/content/ContentProvider;

.field private final contentProviderAwarePlugins:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lio/flutter/embedding/engine/plugins/FlutterPlugin;",
            ">;",
            "Lio/flutter/embedding/engine/plugins/contentprovider/ContentProviderAware;",
            ">;"
        }
    .end annotation
.end field

.field private contentProviderPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineContentProviderPluginBinding;

.field private exclusiveActivity:Lio/flutter/embedding/android/ExclusiveAppComponent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/flutter/embedding/android/ExclusiveAppComponent<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final flutterEngine:Lio/flutter/embedding/engine/FlutterEngine;

.field private isWaitingForActivityReattachment:Z

.field private final pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

.field private final plugins:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lio/flutter/embedding/engine/plugins/FlutterPlugin;",
            ">;",
            "Lio/flutter/embedding/engine/plugins/FlutterPlugin;",
            ">;"
        }
    .end annotation
.end field

.field private service:Landroid/app/Service;

.field private final serviceAwarePlugins:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lio/flutter/embedding/engine/plugins/FlutterPlugin;",
            ">;",
            "Lio/flutter/embedding/engine/plugins/service/ServiceAware;",
            ">;"
        }
    .end annotation
.end field

.field private servicePluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/flutter/embedding/engine/FlutterEngine;Lio/flutter/embedding/engine/loader/FlutterLoader;Lio/flutter/embedding/engine/FlutterEngineGroup;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->plugins:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->activityAwarePlugins:Ljava/util/Map;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isWaitingForActivityReattachment:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->serviceAwarePlugins:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->broadcastReceiverAwarePlugins:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->contentProviderAwarePlugins:Ljava/util/Map;

    iput-object p2, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->flutterEngine:Lio/flutter/embedding/engine/FlutterEngine;

    new-instance v0, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterEngine;->getDartExecutor()Lio/flutter/embedding/engine/dart/DartExecutor;

    move-result-object v4

    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterEngine;->getRenderer()Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    move-result-object v5

    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterEngine;->getPlatformViewsController()Lio/flutter/plugin/platform/PlatformViewsController;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/plugin/platform/PlatformViewsController;->getRegistry()Lio/flutter/plugin/platform/PlatformViewRegistry;

    move-result-object v6

    new-instance v7, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$DefaultFlutterAssets;

    const/4 v1, 0x0

    invoke-direct {v7, p3, v1}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$DefaultFlutterAssets;-><init>(Lio/flutter/embedding/engine/loader/FlutterLoader;Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$1;)V

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v8, p4

    invoke-direct/range {v1 .. v8}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;-><init>(Landroid/content/Context;Lio/flutter/embedding/engine/FlutterEngine;Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/view/TextureRegistry;Lio/flutter/plugin/platform/PlatformViewRegistry;Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterAssets;Lio/flutter/embedding/engine/FlutterEngineGroup;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    return-void
.end method

.method private attachToActivityInternal(Landroid/app/Activity;Landroidx/lifecycle/f;)V
    .locals 3

    new-instance v0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;

    invoke-direct {v0, p1, p2}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;-><init>(Landroid/app/Activity;Landroidx/lifecycle/f;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->activityPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p2

    const-string v1, "enable-software-rendering"

    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p2

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    iget-object v1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->flutterEngine:Lio/flutter/embedding/engine/FlutterEngine;

    invoke-virtual {v1}, Lio/flutter/embedding/engine/FlutterEngine;->getPlatformViewsController()Lio/flutter/plugin/platform/PlatformViewsController;

    move-result-object v1

    invoke-virtual {v1, p2}, Lio/flutter/plugin/platform/PlatformViewsController;->setSoftwareRendering(Z)V

    iget-object p2, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->flutterEngine:Lio/flutter/embedding/engine/FlutterEngine;

    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterEngine;->getPlatformViewsController()Lio/flutter/plugin/platform/PlatformViewsController;

    move-result-object p2

    iget-object v1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->flutterEngine:Lio/flutter/embedding/engine/FlutterEngine;

    invoke-virtual {v1}, Lio/flutter/embedding/engine/FlutterEngine;->getRenderer()Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    move-result-object v1

    iget-object v2, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->flutterEngine:Lio/flutter/embedding/engine/FlutterEngine;

    invoke-virtual {v2}, Lio/flutter/embedding/engine/FlutterEngine;->getDartExecutor()Lio/flutter/embedding/engine/dart/DartExecutor;

    move-result-object v2

    invoke-virtual {p2, p1, v1, v2}, Lio/flutter/plugin/platform/PlatformViewsController;->attach(Landroid/content/Context;Lio/flutter/view/TextureRegistry;Lio/flutter/embedding/engine/dart/DartExecutor;)V

    iget-object p1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->activityAwarePlugins:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/flutter/embedding/engine/plugins/activity/ActivityAware;

    iget-boolean v1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isWaitingForActivityReattachment:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->activityPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;

    invoke-interface {p2, v1}, Lio/flutter/embedding/engine/plugins/activity/ActivityAware;->onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->activityPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;

    invoke-interface {p2, v1}, Lio/flutter/embedding/engine/plugins/activity/ActivityAware;->onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    goto :goto_1

    :cond_2
    iput-boolean v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isWaitingForActivityReattachment:Z

    return-void
.end method

.method private attachedActivity()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->exclusiveActivity:Lio/flutter/embedding/android/ExclusiveAppComponent;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/flutter/embedding/android/ExclusiveAppComponent;->getAppComponent()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private detachFromActivityInternal()V
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->flutterEngine:Lio/flutter/embedding/engine/FlutterEngine;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterEngine;->getPlatformViewsController()Lio/flutter/plugin/platform/PlatformViewsController;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/plugin/platform/PlatformViewsController;->detach()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->exclusiveActivity:Lio/flutter/embedding/android/ExclusiveAppComponent;

    iput-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->activityPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;

    return-void
.end method

.method private detachFromAppComponent()V
    .locals 1

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToActivity()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->detachFromActivity()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToService()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->detachFromService()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToBroadcastReceiver()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->detachFromBroadcastReceiver()V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToContentProvider()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->detachFromContentProvider()V

    :cond_3
    :goto_0
    return-void
.end method

.method private isAttachedToActivity()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->exclusiveActivity:Lio/flutter/embedding/android/ExclusiveAppComponent;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isAttachedToBroadcastReceiver()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->broadcastReceiver:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isAttachedToContentProvider()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->contentProvider:Landroid/content/ContentProvider;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isAttachedToService()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->service:Landroid/app/Service;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public add(Lio/flutter/embedding/engine/plugins/FlutterPlugin;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FlutterEngineConnectionRegistry#add "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->has(Ljava/lang/Class;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v1, "FlutterEngineCxnRegstry"

    if-eqz v0, :cond_0

    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Attempted to register plugin ("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ") but it was already registered with this FlutterEngine ("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->flutterEngine:Lio/flutter/embedding/engine/FlutterEngine;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lio/flutter/Log;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    return-void

    :cond_0
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Adding plugin: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lio/flutter/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->plugins:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    invoke-interface {p1, v0}, Lio/flutter/embedding/engine/plugins/FlutterPlugin;->onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V

    instance-of v0, p1, Lio/flutter/embedding/engine/plugins/activity/ActivityAware;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lio/flutter/embedding/engine/plugins/activity/ActivityAware;

    iget-object v1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->activityAwarePlugins:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToActivity()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->activityPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;

    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/plugins/activity/ActivityAware;->onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    :cond_1
    instance-of v0, p1, Lio/flutter/embedding/engine/plugins/service/ServiceAware;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lio/flutter/embedding/engine/plugins/service/ServiceAware;

    iget-object v1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->serviceAwarePlugins:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToService()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->servicePluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding;

    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/plugins/service/ServiceAware;->onAttachedToService(Lio/flutter/embedding/engine/plugins/service/ServicePluginBinding;)V

    :cond_2
    instance-of v0, p1, Lio/flutter/embedding/engine/plugins/broadcastreceiver/BroadcastReceiverAware;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lio/flutter/embedding/engine/plugins/broadcastreceiver/BroadcastReceiverAware;

    iget-object v1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->broadcastReceiverAwarePlugins:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToBroadcastReceiver()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->broadcastReceiverPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineBroadcastReceiverPluginBinding;

    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/plugins/broadcastreceiver/BroadcastReceiverAware;->onAttachedToBroadcastReceiver(Lio/flutter/embedding/engine/plugins/broadcastreceiver/BroadcastReceiverPluginBinding;)V

    :cond_3
    instance-of v0, p1, Lio/flutter/embedding/engine/plugins/contentprovider/ContentProviderAware;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lio/flutter/embedding/engine/plugins/contentprovider/ContentProviderAware;

    iget-object v1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->contentProviderAwarePlugins:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToContentProvider()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->contentProviderPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineContentProviderPluginBinding;

    invoke-interface {v0, p1}, Lio/flutter/embedding/engine/plugins/contentprovider/ContentProviderAware;->onAttachedToContentProvider(Lio/flutter/embedding/engine/plugins/contentprovider/ContentProviderPluginBinding;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_4
    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw p1
.end method

.method public add(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lio/flutter/embedding/engine/plugins/FlutterPlugin;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/embedding/engine/plugins/FlutterPlugin;

    invoke-virtual {p0, v0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->add(Lio/flutter/embedding/engine/plugins/FlutterPlugin;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public attachToActivity(Lio/flutter/embedding/android/ExclusiveAppComponent;Landroidx/lifecycle/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/embedding/android/ExclusiveAppComponent<",
            "Landroid/app/Activity;",
            ">;",
            "Landroidx/lifecycle/f;",
            ")V"
        }
    .end annotation

    const-string v0, "FlutterEngineConnectionRegistry#attachToActivity"

    invoke-static {v0}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->exclusiveActivity:Lio/flutter/embedding/android/ExclusiveAppComponent;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/flutter/embedding/android/ExclusiveAppComponent;->detachFromFlutterEngine()V

    :cond_0
    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->detachFromAppComponent()V

    iput-object p1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->exclusiveActivity:Lio/flutter/embedding/android/ExclusiveAppComponent;

    invoke-interface {p1}, Lio/flutter/embedding/android/ExclusiveAppComponent;->getAppComponent()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-direct {p0, p1, p2}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->attachToActivityInternal(Landroid/app/Activity;Landroidx/lifecycle/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw p1
.end method

.method public attachToBroadcastReceiver(Landroid/content/BroadcastReceiver;Landroidx/lifecycle/f;)V
    .locals 1

    const-string p2, "FlutterEngineConnectionRegistry#attachToBroadcastReceiver"

    invoke-static {p2}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->detachFromAppComponent()V

    iput-object p1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->broadcastReceiver:Landroid/content/BroadcastReceiver;

    new-instance p2, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineBroadcastReceiverPluginBinding;

    invoke-direct {p2, p1}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineBroadcastReceiverPluginBinding;-><init>(Landroid/content/BroadcastReceiver;)V

    iput-object p2, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->broadcastReceiverPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineBroadcastReceiverPluginBinding;

    iget-object p1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->broadcastReceiverAwarePlugins:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/flutter/embedding/engine/plugins/broadcastreceiver/BroadcastReceiverAware;

    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->broadcastReceiverPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineBroadcastReceiverPluginBinding;

    invoke-interface {p2, v0}, Lio/flutter/embedding/engine/plugins/broadcastreceiver/BroadcastReceiverAware;->onAttachedToBroadcastReceiver(Lio/flutter/embedding/engine/plugins/broadcastreceiver/BroadcastReceiverPluginBinding;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw p1
.end method

.method public attachToContentProvider(Landroid/content/ContentProvider;Landroidx/lifecycle/f;)V
    .locals 1

    const-string p2, "FlutterEngineConnectionRegistry#attachToContentProvider"

    invoke-static {p2}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->detachFromAppComponent()V

    iput-object p1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->contentProvider:Landroid/content/ContentProvider;

    new-instance p2, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineContentProviderPluginBinding;

    invoke-direct {p2, p1}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineContentProviderPluginBinding;-><init>(Landroid/content/ContentProvider;)V

    iput-object p2, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->contentProviderPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineContentProviderPluginBinding;

    iget-object p1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->contentProviderAwarePlugins:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/flutter/embedding/engine/plugins/contentprovider/ContentProviderAware;

    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->contentProviderPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineContentProviderPluginBinding;

    invoke-interface {p2, v0}, Lio/flutter/embedding/engine/plugins/contentprovider/ContentProviderAware;->onAttachedToContentProvider(Lio/flutter/embedding/engine/plugins/contentprovider/ContentProviderPluginBinding;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw p1
.end method

.method public attachToService(Landroid/app/Service;Landroidx/lifecycle/f;Z)V
    .locals 0

    const-string p3, "FlutterEngineConnectionRegistry#attachToService"

    invoke-static {p3}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->detachFromAppComponent()V

    iput-object p1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->service:Landroid/app/Service;

    new-instance p3, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding;

    invoke-direct {p3, p1, p2}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding;-><init>(Landroid/app/Service;Landroidx/lifecycle/f;)V

    iput-object p3, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->servicePluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding;

    iget-object p1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->serviceAwarePlugins:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/flutter/embedding/engine/plugins/service/ServiceAware;

    iget-object p3, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->servicePluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding;

    invoke-interface {p2, p3}, Lio/flutter/embedding/engine/plugins/service/ServiceAware;->onAttachedToService(Lio/flutter/embedding/engine/plugins/service/ServicePluginBinding;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw p1
.end method

.method public destroy()V
    .locals 2

    const-string v0, "FlutterEngineCxnRegstry"

    const-string v1, "Destroying."

    invoke-static {v0, v1}, Lio/flutter/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->detachFromAppComponent()V

    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->removeAll()V

    return-void
.end method

.method public detachFromActivity()V
    .locals 2

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToActivity()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "FlutterEngineConnectionRegistry#detachFromActivity"

    invoke-static {v0}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->activityAwarePlugins:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/embedding/engine/plugins/activity/ActivityAware;

    invoke-interface {v1}, Lio/flutter/embedding/engine/plugins/activity/ActivityAware;->onDetachedFromActivity()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->detachFromActivityInternal()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw v0

    :cond_1
    const-string v0, "FlutterEngineCxnRegstry"

    const-string v1, "Attempted to detach plugins from an Activity when no Activity was attached."

    invoke-static {v0, v1}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public detachFromActivityForConfigChanges()V
    .locals 2

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToActivity()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges"

    invoke-static {v0}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isWaitingForActivityReattachment:Z

    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->activityAwarePlugins:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/embedding/engine/plugins/activity/ActivityAware;

    invoke-interface {v1}, Lio/flutter/embedding/engine/plugins/activity/ActivityAware;->onDetachedFromActivityForConfigChanges()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->detachFromActivityInternal()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw v0

    :cond_1
    const-string v0, "FlutterEngineCxnRegstry"

    const-string v1, "Attempted to detach plugins from an Activity when no Activity was attached."

    invoke-static {v0, v1}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public detachFromBroadcastReceiver()V
    .locals 2

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToBroadcastReceiver()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "FlutterEngineConnectionRegistry#detachFromBroadcastReceiver"

    invoke-static {v0}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->broadcastReceiverAwarePlugins:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/embedding/engine/plugins/broadcastreceiver/BroadcastReceiverAware;

    invoke-interface {v1}, Lio/flutter/embedding/engine/plugins/broadcastreceiver/BroadcastReceiverAware;->onDetachedFromBroadcastReceiver()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw v0

    :cond_1
    const-string v0, "FlutterEngineCxnRegstry"

    const-string v1, "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached."

    invoke-static {v0, v1}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public detachFromContentProvider()V
    .locals 2

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToContentProvider()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "FlutterEngineConnectionRegistry#detachFromContentProvider"

    invoke-static {v0}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->contentProviderAwarePlugins:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/embedding/engine/plugins/contentprovider/ContentProviderAware;

    invoke-interface {v1}, Lio/flutter/embedding/engine/plugins/contentprovider/ContentProviderAware;->onDetachedFromContentProvider()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw v0

    :cond_1
    const-string v0, "FlutterEngineCxnRegstry"

    const-string v1, "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached."

    invoke-static {v0, v1}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public detachFromService()V
    .locals 2

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToService()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "FlutterEngineConnectionRegistry#detachFromService"

    invoke-static {v0}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->serviceAwarePlugins:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/embedding/engine/plugins/service/ServiceAware;

    invoke-interface {v1}, Lio/flutter/embedding/engine/plugins/service/ServiceAware;->onDetachedFromService()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->service:Landroid/app/Service;

    iput-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->servicePluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw v0

    :cond_1
    const-string v0, "FlutterEngineCxnRegstry"

    const-string v1, "Attempted to detach plugins from a Service when no Service was attached."

    invoke-static {v0, v1}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public get(Ljava/lang/Class;)Lio/flutter/embedding/engine/plugins/FlutterPlugin;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lio/flutter/embedding/engine/plugins/FlutterPlugin;",
            ">;)",
            "Lio/flutter/embedding/engine/plugins/FlutterPlugin;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->plugins:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/embedding/engine/plugins/FlutterPlugin;

    return-object p1
.end method

.method public has(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lio/flutter/embedding/engine/plugins/FlutterPlugin;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->plugins:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 1

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToActivity()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "FlutterEngineConnectionRegistry#onActivityResult"

    invoke-static {v0}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->activityPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;

    invoke-virtual {v0, p1, p2, p3}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;->onActivityResult(IILandroid/content/Intent;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    return p1

    :catchall_0
    move-exception p1

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw p1

    :cond_0
    const-string p1, "FlutterEngineCxnRegstry"

    const-string p2, "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached."

    invoke-static {p1, p2}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public onMoveToBackground()V
    .locals 1

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToService()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "FlutterEngineConnectionRegistry#onMoveToBackground"

    invoke-static {v0}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->servicePluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding;->onMoveToBackground()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public onMoveToForeground()V
    .locals 1

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToService()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "FlutterEngineConnectionRegistry#onMoveToForeground"

    invoke-static {v0}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->servicePluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding;->onMoveToForeground()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToActivity()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "FlutterEngineConnectionRegistry#onNewIntent"

    invoke-static {v0}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->activityPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;

    invoke-virtual {v0, p1}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;->onNewIntent(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw p1

    :cond_0
    const-string p1, "FlutterEngineCxnRegstry"

    const-string v0, "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached."

    invoke-static {p1, v0}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 1

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToActivity()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "FlutterEngineConnectionRegistry#onRequestPermissionsResult"

    invoke-static {v0}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->activityPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;

    invoke-virtual {v0, p1, p2, p3}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;->onRequestPermissionsResult(I[Ljava/lang/String;[I)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    return p1

    :catchall_0
    move-exception p1

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw p1

    :cond_0
    const-string p1, "FlutterEngineCxnRegstry"

    const-string p2, "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached."

    invoke-static {p1, p2}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 1

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToActivity()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "FlutterEngineConnectionRegistry#onRestoreInstanceState"

    invoke-static {v0}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->activityPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;

    invoke-virtual {v0, p1}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;->onRestoreInstanceState(Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw p1

    :cond_0
    const-string p1, "FlutterEngineCxnRegstry"

    const-string v0, "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached."

    invoke-static {p1, v0}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToActivity()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "FlutterEngineConnectionRegistry#onSaveInstanceState"

    invoke-static {v0}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->activityPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;

    invoke-virtual {v0, p1}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;->onSaveInstanceState(Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw p1

    :cond_0
    const-string p1, "FlutterEngineCxnRegstry"

    const-string v0, "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached."

    invoke-static {p1, v0}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onUserLeaveHint()V
    .locals 2

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToActivity()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "FlutterEngineConnectionRegistry#onUserLeaveHint"

    invoke-static {v0}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->activityPluginBinding:Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;->onUserLeaveHint()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw v0

    :cond_0
    const-string v0, "FlutterEngineCxnRegstry"

    const-string v1, "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached."

    invoke-static {v0, v1}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public remove(Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lio/flutter/embedding/engine/plugins/FlutterPlugin;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->plugins:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/embedding/engine/plugins/FlutterPlugin;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FlutterEngineConnectionRegistry#remove "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lio/flutter/util/TraceSection;->begin(Ljava/lang/String;)V

    :try_start_0
    instance-of v1, v0, Lio/flutter/embedding/engine/plugins/activity/ActivityAware;

    if-eqz v1, :cond_2

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToActivity()Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lio/flutter/embedding/engine/plugins/activity/ActivityAware;

    invoke-interface {v1}, Lio/flutter/embedding/engine/plugins/activity/ActivityAware;->onDetachedFromActivity()V

    :cond_1
    iget-object v1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->activityAwarePlugins:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    instance-of v1, v0, Lio/flutter/embedding/engine/plugins/service/ServiceAware;

    if-eqz v1, :cond_4

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToService()Z

    move-result v1

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, Lio/flutter/embedding/engine/plugins/service/ServiceAware;

    invoke-interface {v1}, Lio/flutter/embedding/engine/plugins/service/ServiceAware;->onDetachedFromService()V

    :cond_3
    iget-object v1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->serviceAwarePlugins:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    instance-of v1, v0, Lio/flutter/embedding/engine/plugins/broadcastreceiver/BroadcastReceiverAware;

    if-eqz v1, :cond_6

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToBroadcastReceiver()Z

    move-result v1

    if-eqz v1, :cond_5

    move-object v1, v0

    check-cast v1, Lio/flutter/embedding/engine/plugins/broadcastreceiver/BroadcastReceiverAware;

    invoke-interface {v1}, Lio/flutter/embedding/engine/plugins/broadcastreceiver/BroadcastReceiverAware;->onDetachedFromBroadcastReceiver()V

    :cond_5
    iget-object v1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->broadcastReceiverAwarePlugins:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    instance-of v1, v0, Lio/flutter/embedding/engine/plugins/contentprovider/ContentProviderAware;

    if-eqz v1, :cond_8

    invoke-direct {p0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->isAttachedToContentProvider()Z

    move-result v1

    if-eqz v1, :cond_7

    move-object v1, v0

    check-cast v1, Lio/flutter/embedding/engine/plugins/contentprovider/ContentProviderAware;

    invoke-interface {v1}, Lio/flutter/embedding/engine/plugins/contentprovider/ContentProviderAware;->onDetachedFromContentProvider()V

    :cond_7
    iget-object v1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->contentProviderAwarePlugins:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    iget-object v1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin;->onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->plugins:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Lio/flutter/util/TraceSection;->end()V

    throw p1
.end method

.method public remove(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lio/flutter/embedding/engine/plugins/FlutterPlugin;",
            ">;>;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {p0, v0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->remove(Ljava/lang/Class;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public removeAll()V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->plugins:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->remove(Ljava/util/Set;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry;->plugins:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method
