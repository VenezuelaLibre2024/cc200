.class public final Lqe/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityAware;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqe/b$a;
    }
.end annotation


# static fields
.field public static final h:Lqe/b$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqe/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqe/b$a;-><init>(Ltd/g;)V

    sput-object v0, Lqe/b;->h:Lqe/b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 2

    const-string v0, "activityPluginBinding"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lqe/f;->a:Lqe/f;

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqe/f;->c(Landroid/app/Activity;)V

    invoke-virtual {v0, p1}, Lqe/f;->d(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 3

    const-string v0, "flutterPluginBinding"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getPlatformViewRegistry()Lio/flutter/plugin/platform/PlatformViewRegistry;

    move-result-object v0

    new-instance v1, Lqe/d;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object p1

    const-string v2, "flutterPluginBinding.binaryMessenger"

    invoke-static {p1, v2}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1}, Lqe/d;-><init>(Lio/flutter/plugin/common/BinaryMessenger;)V

    const-string p1, "net.touchcapture.qr.flutterqr/qrview"

    invoke-interface {v0, p1, v1}, Lio/flutter/plugin/platform/PlatformViewRegistry;->registerViewFactory(Ljava/lang/String;Lio/flutter/plugin/platform/PlatformViewFactory;)Z

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 2

    sget-object v0, Lqe/f;->a:Lqe/f;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lqe/f;->c(Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Lqe/f;->d(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 2

    sget-object v0, Lqe/f;->a:Lqe/f;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lqe/f;->c(Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Lqe/f;->d(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 2

    const-string v0, "activityPluginBinding"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lqe/f;->a:Lqe/f;

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqe/f;->c(Landroid/app/Activity;)V

    invoke-virtual {v0, p1}, Lqe/f;->d(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    return-void
.end method
