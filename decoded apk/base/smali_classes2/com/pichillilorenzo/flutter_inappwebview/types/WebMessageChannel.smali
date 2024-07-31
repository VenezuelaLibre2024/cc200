.class public Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# static fields
.field public static final LOG_TAG:Ljava/lang/String; = "WebMessageChannel"


# instance fields
.field public channel:Lio/flutter/plugin/common/MethodChannel;

.field public final compatPorts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "La2/g;",
            ">;"
        }
    .end annotation
.end field

.field public id:Ljava/lang/String;

.field public final ports:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessagePort;",
            ">;"
        }
    .end annotation
.end field

.field public webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->id:Ljava/lang/String;

    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    invoke-interface {p2}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getPlugin()Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    move-result-object v1

    iget-object v1, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->messenger:Lio/flutter/plugin/common/BinaryMessenger;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "com.pichillilorenzo/flutter_inappwebview_web_message_channel_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->channel:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    instance-of p1, p2, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz p1, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    move-object v0, p2

    check-cast v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-static {v0}, La2/h;->c(Landroid/webkit/WebView;)[La2/g;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->compatPorts:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->ports:Ljava/util/List;

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    new-array p1, p1, [Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessagePort;

    const/4 v0, 0x0

    new-instance v1, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessagePort;

    const-string v2, "port1"

    invoke-direct {v1, v2, p0}, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessagePort;-><init>(Ljava/lang/String;Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;)V

    aput-object v1, p1, v0

    const/4 v0, 0x1

    new-instance v1, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessagePort;

    const-string v2, "port2"

    invoke-direct {v1, v2, p0}, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessagePort;-><init>(Ljava/lang/String;Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;)V

    aput-object v1, p1, v0

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->ports:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->compatPorts:Ljava/util/List;

    :goto_0
    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    return-void
.end method

.method private closeForInAppWebView(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->compatPorts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "WEB_MESSAGE_PORT_CLOSE"

    invoke-static {v0}, La2/i;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->compatPorts:Ljava/util/List;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La2/g;

    :try_start_0
    invoke-virtual {p1}, La2/g;->a()V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "WebMessageChannel"

    invoke-interface {p2, v1, p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private postMessageForInAppWebView(Ljava/lang/Integer;Ljava/util/Map;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->compatPorts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    const-string v0, "WEB_MESSAGE_PORT_POST_MESSAGE"

    invoke-static {v0}, La2/i;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->compatPorts:Ljava/util/List;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La2/g;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "ports"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    const-string v3, "webMessageChannelId"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "index"

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    iget-object v4, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    invoke-interface {v4}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->getWebMessageChannels()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;

    if-eqz v3, :cond_0

    iget-object v3, v3, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->compatPorts:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La2/g;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v1, La2/f;

    const-string v2, "data"

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const/4 v2, 0x0

    new-array v2, v2, [La2/g;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La2/g;

    invoke-direct {v1, p2, v0}, La2/f;-><init>(Ljava/lang/String;[La2/g;)V

    :try_start_0
    invoke-virtual {p1, v1}, La2/g;->d(La2/f;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p3, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    const-string v0, "WebMessageChannel"

    invoke-interface {p3, v0, p1, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p3, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private setWebMessageCallbackForInAppWebView(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->compatPorts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK"

    invoke-static {v0}, La2/i;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->compatPorts:Ljava/util/List;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La2/g;

    :try_start_0
    new-instance v1, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel$2;

    invoke-direct {v1, p0, p1}, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel$2;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;Ljava/lang/Integer;)V

    invoke-virtual {v0, v1}, La2/g;->e(La2/g$a;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const-string v1, "WebMessageChannel"

    invoke-interface {p2, v1, p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    const-string v0, "WEB_MESSAGE_PORT_CLOSE"

    invoke-static {v0}, La2/i;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->compatPorts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La2/g;

    :try_start_0
    invoke-virtual {v1}, La2/g;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->channel:Lio/flutter/plugin/common/MethodChannel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->compatPorts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    return-void
.end method

.method public initJsInstance(Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;Landroid/webkit/ValueCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;",
            "Landroid/webkit/ValueCallback<",
            "Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(function() {window.flutter_inappwebview._webMessageChannels[\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'] = new MessageChannel();})();"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-instance v2, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel$1;

    invoke-direct {v2, p0, p2, p0}, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel$1;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;Landroid/webkit/ValueCallback;Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;->evaluateJavascript(Ljava/lang/String;Lcom/pichillilorenzo/flutter_inappwebview/types/ContentWorld;Landroid/webkit/ValueCallback;)V

    goto :goto_0

    :cond_0
    invoke-interface {p2, p0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public onMessage(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "index"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "message"

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->channel:Lio/flutter/plugin/common/MethodChannel;

    const-string p2, "onMessage"

    invoke-virtual {p1, p2, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    iget-object v0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "postMessage"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_1
    const-string v1, "setWebMessageCallback"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "close"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    const-string v0, "index"

    packed-switch v2, :pswitch_data_0

    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    goto :goto_1

    :pswitch_0
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    instance-of v1, v1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v1, :cond_3

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const-string v1, "message"

    invoke-virtual {p1, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, v0, p1, p2}, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->postMessageForInAppWebView(Ljava/lang/Integer;Ljava/util/Map;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :pswitch_1
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    instance-of v1, v1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v1, :cond_3

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-direct {p0, p1, p2}, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->setWebMessageCallbackForInAppWebView(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :cond_3
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_2
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->webView:Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;

    instance-of v1, v1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    if-eqz v1, :cond_3

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-direct {p0, p1, p2}, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->closeForInAppWebView(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V

    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x5a5ddf8 -> :sswitch_2
        0x2126cb7a -> :sswitch_1
        0x58d00b47 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toMap()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->id:Ljava/lang/String;

    const-string v2, "id"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
