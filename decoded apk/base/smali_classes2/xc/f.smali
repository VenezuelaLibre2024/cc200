.class public Lxc/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;


# instance fields
.field public h:Lio/flutter/plugin/common/MethodChannel;

.field public i:Lio/flutter/plugin/common/EventChannel;

.field public j:Lxc/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;)V
    .locals 2

    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    const-string v1, "dev.fluttercommunity.plus/connectivity"

    invoke-direct {v0, p1, v1}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lxc/f;->h:Lio/flutter/plugin/common/MethodChannel;

    new-instance v0, Lio/flutter/plugin/common/EventChannel;

    const-string v1, "dev.fluttercommunity.plus/connectivity_status"

    invoke-direct {v0, p1, v1}, Lio/flutter/plugin/common/EventChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lxc/f;->i:Lio/flutter/plugin/common/EventChannel;

    const-string p1, "connectivity"

    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    new-instance v0, Lxc/a;

    invoke-direct {v0, p1}, Lxc/a;-><init>(Landroid/net/ConnectivityManager;)V

    new-instance p1, Lxc/e;

    invoke-direct {p1, v0}, Lxc/e;-><init>(Lxc/a;)V

    new-instance v1, Lxc/d;

    invoke-direct {v1, p2, v0}, Lxc/d;-><init>(Landroid/content/Context;Lxc/a;)V

    iput-object v1, p0, Lxc/f;->j:Lxc/d;

    iget-object p2, p0, Lxc/f;->h:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p2, p1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    iget-object p1, p0, Lxc/f;->i:Lio/flutter/plugin/common/EventChannel;

    iget-object p2, p0, Lxc/f;->j:Lxc/d;

    invoke-virtual {p1, p2}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lxc/f;->h:Lio/flutter/plugin/common/MethodChannel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    iget-object v0, p0, Lxc/f;->i:Lio/flutter/plugin/common/EventChannel;

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    iget-object v0, p0, Lxc/f;->j:Lxc/d;

    invoke-virtual {v0, v1}, Lxc/d;->onCancel(Ljava/lang/Object;)V

    iput-object v1, p0, Lxc/f;->h:Lio/flutter/plugin/common/MethodChannel;

    iput-object v1, p0, Lxc/f;->i:Lio/flutter/plugin/common/EventChannel;

    iput-object v1, p0, Lxc/f;->j:Lxc/d;

    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lxc/f;->a(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;)V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 0

    invoke-virtual {p0}, Lxc/f;->b()V

    return-void
.end method
