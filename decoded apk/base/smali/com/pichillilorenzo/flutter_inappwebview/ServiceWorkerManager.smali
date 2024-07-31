.class public Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager$DummyServiceWorkerClientCompat;
    }
.end annotation


# static fields
.field public static final LOG_TAG:Ljava/lang/String; = "ServiceWorkerManager"

.field public static serviceWorkerController:La2/c;


# instance fields
.field public channel:Lio/flutter/plugin/common/MethodChannel;

.field public plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;


# direct methods
.method public constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    iget-object p1, p1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->messenger:Lio/flutter/plugin/common/BinaryMessenger;

    const-string v1, "com.pichillilorenzo/flutter_inappwebview_android_serviceworkercontroller"

    invoke-direct {v0, p1, v1}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->channel:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    return-void
.end method

.method private dummyServiceWorkerClientCompat()La2/b;
    .locals 1

    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager$DummyServiceWorkerClientCompat;->INSTANCE:La2/b;

    return-object v0
.end method

.method public static init()V
    .locals 1

    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->serviceWorkerController:La2/c;

    if-nez v0, :cond_0

    const-string v0, "SERVICE_WORKER_BASIC_USAGE"

    invoke-static {v0}, La2/i;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, La2/c;->a()La2/c;

    move-result-object v0

    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->serviceWorkerController:La2/c;

    :cond_0
    return-void
.end method

.method private setServiceWorkerClient(Ljava/lang/Boolean;)V
    .locals 1

    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->serviceWorkerController:La2/c;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->dummyServiceWorkerClientCompat()La2/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager$1;

    invoke-direct {p1, p0}, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager$1;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;)V

    :goto_0
    invoke-virtual {v0, p1}, La2/c;->c(La2/b;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 3

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->channel:Lio/flutter/plugin/common/MethodChannel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->serviceWorkerController:La2/c;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->dummyServiceWorkerClientCompat()La2/b;

    move-result-object v2

    invoke-virtual {v0, v2}, La2/c;->c(La2/b;)V

    sput-object v1, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->serviceWorkerController:La2/c;

    :cond_0
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 8

    invoke-static {}, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->init()V

    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->serviceWorkerController:La2/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La2/c;->b()La2/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    const/4 v3, -0x1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v4, "getBlockNetworkLoads"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_1

    :cond_1
    const/16 v3, 0x8

    goto/16 :goto_1

    :sswitch_1
    const-string v4, "setAllowFileAccess"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x7

    goto :goto_1

    :sswitch_2
    const-string v4, "setAllowContentAccess"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v3, 0x6

    goto :goto_1

    :sswitch_3
    const-string v4, "setBlockNetworkLoads"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    const/4 v3, 0x5

    goto :goto_1

    :sswitch_4
    const-string v4, "setCacheMode"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_5
    const/4 v3, 0x4

    goto :goto_1

    :sswitch_5
    const-string v4, "getAllowFileAccess"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_1

    :cond_6
    const/4 v3, 0x3

    goto :goto_1

    :sswitch_6
    const-string v4, "getCacheMode"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_1

    :cond_7
    const/4 v3, 0x2

    goto :goto_1

    :sswitch_7
    const-string v4, "setServiceWorkerClient"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_1

    :cond_8
    const/4 v3, 0x1

    goto :goto_1

    :sswitch_8
    const-string v4, "getAllowContentAccess"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_1

    :cond_9
    const/4 v3, 0x0

    :goto_1
    const-string v2, "allow"

    const-string v4, "SERVICE_WORKER_CACHE_MODE"

    const-string v5, "SERVICE_WORKER_BLOCK_NETWORK_LOADS"

    const-string v6, "SERVICE_WORKER_FILE_ACCESS"

    const-string v7, "SERVICE_WORKER_CONTENT_ACCESS"

    packed-switch v3, :pswitch_data_0

    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    goto/16 :goto_5

    :pswitch_0
    if-eqz v0, :cond_c

    invoke-static {v5}, La2/i;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {v0}, La2/d;->c()Z

    move-result p1

    goto/16 :goto_4

    :pswitch_1
    if-eqz v0, :cond_b

    invoke-static {v6}, La2/i;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {p1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, La2/d;->f(Z)V

    goto/16 :goto_2

    :pswitch_2
    if-eqz v0, :cond_b

    invoke-static {v7}, La2/i;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {p1, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, La2/d;->e(Z)V

    goto :goto_2

    :pswitch_3
    if-eqz v0, :cond_b

    invoke-static {v5}, La2/i;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    const-string v1, "flag"

    invoke-virtual {p1, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, La2/d;->g(Z)V

    goto :goto_2

    :pswitch_4
    if-eqz v0, :cond_b

    invoke-static {v4}, La2/i;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    const-string v1, "mode"

    invoke-virtual {p1, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, La2/d;->h(I)V

    goto :goto_2

    :pswitch_5
    if-eqz v0, :cond_c

    invoke-static {v6}, La2/i;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {v0}, La2/d;->b()Z

    move-result p1

    goto :goto_4

    :pswitch_6
    if-eqz v0, :cond_a

    invoke-static {v4}, La2/i;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-virtual {v0}, La2/d;->d()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_3

    :cond_a
    invoke-interface {p2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_5

    :pswitch_7
    const-string v0, "isNull"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-direct {p0, p1}, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;->setServiceWorkerClient(Ljava/lang/Boolean;)V

    :cond_b
    :goto_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_3
    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_5

    :pswitch_8
    if-eqz v0, :cond_c

    invoke-static {v7}, La2/i;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {v0}, La2/d;->a()Z

    move-result p1

    :goto_4
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_3

    :cond_c
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_3

    :goto_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4f6fdb96 -> :sswitch_8
        -0x45709384 -> :sswitch_7
        -0x2194c271 -> :sswitch_6
        0x283a13f3 -> :sswitch_5
        0x3abefe03 -> :sswitch_4
        0x409afbaa -> :sswitch_3
        0x47bba676 -> :sswitch_2
        0x5f10ad67 -> :sswitch_1
        0x6504ef36 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
