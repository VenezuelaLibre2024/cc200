.class public Lio/flutter/plugins/deviceinfo/DeviceInfoPlugin;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;


# static fields
.field public static final TAG:Ljava/lang/String; = "DeviceInfoPlugin"


# instance fields
.field public channel:Lio/flutter/plugin/common/MethodChannel;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static registerWith(Lio/flutter/plugin/common/PluginRegistry$Registrar;)V
    .locals 2

    new-instance v0, Lio/flutter/plugins/deviceinfo/DeviceInfoPlugin;

    invoke-direct {v0}, Lio/flutter/plugins/deviceinfo/DeviceInfoPlugin;-><init>()V

    invoke-interface {p0}, Lio/flutter/plugin/common/PluginRegistry$Registrar;->messenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v1

    invoke-interface {p0}, Lio/flutter/plugin/common/PluginRegistry$Registrar;->context()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lio/flutter/plugins/deviceinfo/DeviceInfoPlugin;->setupMethodChannel(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;)V

    return-void
.end method

.method private setupMethodChannel(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;)V
    .locals 11

    const-string v0, "DeviceInfoPlugin"

    const-string v1, "plugins.flutter.io/device_info"

    :try_start_0
    const-class v2, Lio/flutter/plugin/common/MethodChannel;

    const-class v3, Lio/flutter/plugin/common/BinaryMessenger$TaskQueue;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-string v5, "makeBackgroundTaskQueue"

    const/4 v6, 0x0

    new-array v7, v6, [Ljava/lang/Class;

    invoke-virtual {v4, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    new-array v5, v6, [Ljava/lang/Object;

    invoke-virtual {v4, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x4

    new-array v7, v5, [Ljava/lang/Class;

    const-class v8, Lio/flutter/plugin/common/BinaryMessenger;

    aput-object v8, v7, v6

    const-class v8, Ljava/lang/String;

    const/4 v9, 0x1

    aput-object v8, v7, v9

    const-class v8, Lio/flutter/plugin/common/MethodCodec;

    const/4 v10, 0x2

    aput-object v8, v7, v10

    const/4 v8, 0x3

    aput-object v3, v7, v8

    invoke-virtual {v2, v7}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v3, v5, [Ljava/lang/Object;

    aput-object p1, v3, v6

    aput-object v1, v3, v9

    sget-object v5, Lio/flutter/plugin/common/StandardMethodCodec;->INSTANCE:Lio/flutter/plugin/common/StandardMethodCodec;

    aput-object v5, v3, v10

    aput-object v4, v3, v8

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/flutter/plugin/common/MethodChannel;

    iput-object v2, p0, Lio/flutter/plugins/deviceinfo/DeviceInfoPlugin;->channel:Lio/flutter/plugin/common/MethodChannel;

    const-string v2, "Use TaskQueues."

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v2, Lio/flutter/plugin/common/MethodChannel;

    invoke-direct {v2, p1, v1}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v2, p0, Lio/flutter/plugins/deviceinfo/DeviceInfoPlugin;->channel:Lio/flutter/plugin/common/MethodChannel;

    const-string p1, "Don\'t use TaskQueues."

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    new-instance p1, Lio/flutter/plugins/deviceinfo/MethodCallHandlerImpl;

    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    invoke-direct {p1, v0, p2}, Lio/flutter/plugins/deviceinfo/MethodCallHandlerImpl;-><init>(Landroid/content/ContentResolver;Landroid/content/pm/PackageManager;)V

    iget-object p2, p0, Lio/flutter/plugins/deviceinfo/DeviceInfoPlugin;->channel:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p2, p1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    return-void
.end method

.method private tearDownChannel()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/deviceinfo/DeviceInfoPlugin;->channel:Lio/flutter/plugin/common/MethodChannel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    iput-object v1, p0, Lio/flutter/plugins/deviceinfo/DeviceInfoPlugin;->channel:Lio/flutter/plugin/common/MethodChannel;

    return-void
.end method


# virtual methods
.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lio/flutter/plugins/deviceinfo/DeviceInfoPlugin;->setupMethodChannel(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;)V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugins/deviceinfo/DeviceInfoPlugin;->tearDownChannel()V

    return-void
.end method
