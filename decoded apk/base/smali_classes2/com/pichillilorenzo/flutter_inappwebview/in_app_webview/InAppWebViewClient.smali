.class public Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;
.super Landroid/webkit/WebViewClient;
.source ""


# static fields
.field public static final LOG_TAG:Ljava/lang/String; = "IAWebViewClient"

.field private static credentialsProposed:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/pichillilorenzo/flutter_inappwebview/types/URLCredential;",
            ">;"
        }
    .end annotation
.end field

.field private static previousAuthRequestFailureCount:I


# instance fields
.field private final channel:Lio/flutter/plugin/common/MethodChannel;

.field private inAppBrowserDelegate:Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lio/flutter/plugin/common/MethodChannel;Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;)V
    .locals 0

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->channel:Lio/flutter/plugin/common/MethodChannel;

    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->inAppBrowserDelegate:Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    return-void
.end method

.method public static synthetic access$000(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Map;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->allowShouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Map;Z)V

    return-void
.end method

.method public static synthetic access$100()Ljava/util/List;
    .locals 1

    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->credentialsProposed:Ljava/util/List;

    return-object v0
.end method

.method public static synthetic access$1001(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;ILandroid/webkit/SafeBrowsingResponse;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onSafeBrowsingHit(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;ILandroid/webkit/SafeBrowsingResponse;)V

    return-void
.end method

.method public static synthetic access$102(Ljava/util/List;)Ljava/util/List;
    .locals 0

    sput-object p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->credentialsProposed:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic access$1101(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onFormResubmission(Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V

    return-void
.end method

.method public static synthetic access$1201(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onFormResubmission(Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V

    return-void
.end method

.method public static synthetic access$202(I)I
    .locals 0

    sput p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->previousAuthRequestFailureCount:I

    return p0
.end method

.method public static synthetic access$301(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedHttpAuthRequest(Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$401(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedHttpAuthRequest(Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$501(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    return-void
.end method

.method public static synthetic access$601(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V

    return-void
.end method

.method public static synthetic access$701(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onReceivedClientCertRequest(Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;)V

    return-void
.end method

.method public static synthetic access$801(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onReceivedClientCertRequest(Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;)V

    return-void
.end method

.method public static synthetic access$901(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;ILandroid/webkit/SafeBrowsingResponse;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onSafeBrowsingHit(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;ILandroid/webkit/SafeBrowsingResponse;)V

    return-void
.end method

.method private allowShouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Map;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebView;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    if-eqz p4, :cond_1

    sget p4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x15

    if-lt p4, v0, :cond_0

    invoke-virtual {p1, p2, p3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->inAppBrowserDelegate:Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->inAppBrowserDelegate:Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    :cond_0
    return-void
.end method

.method public doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->inAppBrowserDelegate:Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;->didUpdateVisitedHistory(Ljava/lang/String;)V

    :cond_0
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "url"

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string p3, "androidIsReload"

    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->channel:Lio/flutter/plugin/common/MethodChannel;

    const-string p3, "onUpdateVisitedHistory"

    invoke-virtual {p1, p3, p2}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public loadCustomJavaScriptOnPageFinished(Landroid/webkit/WebView;)V
    .locals 4

    check-cast p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    iget-object v0, p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->userContentController:Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;->generateWrappedCodeForDocumentEnd()Ljava/lang/String;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-lt v1, v2, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "[\r\n]+"

    const-string v3, ""

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public loadCustomJavaScriptOnPageStarted(Landroid/webkit/WebView;)V
    .locals 4

    check-cast p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    iget-object v0, p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->userContentController:Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;->generateWrappedCodeForDocumentStart()Ljava/lang/String;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-lt v1, v2, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "[\r\n]+"

    const-string v3, ""

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onFormResubmission(Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;)V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v1

    const-string v2, "url"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->channel:Lio/flutter/plugin/common/MethodChannel;

    new-instance v2, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient$6;

    invoke-direct {v2, p0, p3, p2, p1}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient$6;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;Landroid/os/Message;Landroid/os/Message;Landroid/webkit/WebView;)V

    const-string p1, "onFormResubmission"

    invoke-virtual {v1, p1, v0, v2}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "url"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->channel:Lio/flutter/plugin/common/MethodChannel;

    const-string v0, "onPageCommitVisible"

    invoke-virtual {p2, v0, p1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 4

    move-object v0, p1

    check-cast v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->isLoading:Z

    invoke-virtual {p0, v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->loadCustomJavaScriptOnPageFinished(Landroid/webkit/WebView;)V

    sput v1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->previousAuthRequestFailureCount:I

    const/4 v1, 0x0

    sput-object v1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->credentialsProposed:Ljava/util/List;

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->inAppBrowserDelegate:Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;->didFinishNavigation(Ljava/lang/String;)V

    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt p1, v2, :cond_1

    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v2

    invoke-virtual {v2}, Landroid/webkit/CookieManager;->flush()V

    goto :goto_0

    :cond_1
    invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;

    move-result-object v2

    invoke-virtual {v2}, Landroid/webkit/CookieSyncManager;->sync()V

    :goto_0
    const-string v2, "(function() {  if ((window.top == null || window.top === window) && window.flutter_inappwebview != null && window.flutter_inappwebview._platformReady == null) {    window.dispatchEvent(new Event(\'flutterInAppWebViewPlatformReady\'));    window.flutter_inappwebview._platformReady = true;  }})();"

    const/16 v3, 0x13

    if-lt p1, v3, :cond_2

    invoke-virtual {v0, v2, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "javascript:"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[\r\n]+"

    const-string v3, ""

    invoke-virtual {v2, v1, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :goto_1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "url"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->channel:Lio/flutter/plugin/common/MethodChannel;

    const-string v0, "onLoadStop"

    invoke-virtual {p2, v0, p1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->isLoading:Z

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->disposeWebMessageChannels()V

    iget-object v1, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->userContentController:Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;

    invoke-virtual {v1}, Lcom/pichillilorenzo/flutter_inappwebview/types/UserContentController;->resetContentWorlds()V

    invoke-virtual {p0, v0}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->loadCustomJavaScriptOnPageStarted(Landroid/webkit/WebView;)V

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->inAppBrowserDelegate:Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;->didStartNavigation(Ljava/lang/String;)V

    :cond_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string p3, "url"

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->channel:Lio/flutter/plugin/common/MethodChannel;

    const-string p3, "onLoadStart"

    invoke-virtual {p2, p3, p1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onReceivedClientCertRequest(Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;)V
    .locals 8

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Landroid/webkit/ClientCertRequest;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Landroid/webkit/ClientCertRequest;->getPort()I

    move-result v5

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v1, Ljava/net/URI;

    invoke-direct {v1, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/net/URISyntaxException;->printStackTrace()V

    :cond_0
    const-string v0, "https"

    :goto_0
    move-object v3, v0

    new-instance v0, Lcom/pichillilorenzo/flutter_inappwebview/types/URLProtectionSpace;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getCertificate()Landroid/net/http/SslCertificate;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/pichillilorenzo/flutter_inappwebview/types/URLProtectionSpace;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/net/http/SslCertificate;Landroid/net/http/SslError;)V

    new-instance v1, Lcom/pichillilorenzo/flutter_inappwebview/types/ClientCertChallenge;

    invoke-virtual {p2}, Landroid/webkit/ClientCertRequest;->getPrincipals()[Ljava/security/Principal;

    move-result-object v2

    invoke-virtual {p2}, Landroid/webkit/ClientCertRequest;->getKeyTypes()[Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3}, Lcom/pichillilorenzo/flutter_inappwebview/types/ClientCertChallenge;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/types/URLProtectionSpace;[Ljava/security/Principal;[Ljava/lang/String;)V

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->channel:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {v1}, Lcom/pichillilorenzo/flutter_inappwebview/types/ClientCertChallenge;->toMap()Ljava/util/Map;

    move-result-object v1

    new-instance v2, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient$4;

    invoke-direct {v2, p0, p1, p2}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient$4;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;)V

    const-string p1, "onReceivedClientCertRequest"

    invoke-virtual {v0, p1, v1, v2}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    move-object v0, p1

    check-cast v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    iget-object v1, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->options:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;

    iget-object v1, v1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;->disableDefaultErrorPage:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    const-string v1, "about:blank"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_0
    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->isLoading:Z

    sput v1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->previousAuthRequestFailureCount:I

    const/4 v0, 0x0

    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->credentialsProposed:Ljava/util/List;

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->inAppBrowserDelegate:Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;

    if-eqz v0, :cond_1

    invoke-interface {v0, p4, p2, p3}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_browser/InAppBrowserDelegate;->didFailNavigation(Ljava/lang/String;ILjava/lang/String;)V

    :cond_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "url"

    invoke-interface {v0, v1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "code"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "message"

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->channel:Lio/flutter/plugin/common/MethodChannel;

    const-string v2, "onLoadError"

    invoke-virtual {v1, v2, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    return-void
.end method

.method public onReceivedHttpAuthRequest(Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 15

    invoke-virtual/range {p1 .. p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "https"

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v3, Ljava/net/URI;

    invoke-direct {v3, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Ljava/net/URI;->getPort()I

    move-result v0
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/net/URISyntaxException;->printStackTrace()V

    :cond_0
    move v0, v1

    :goto_0
    sget v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->previousAuthRequestFailureCount:I

    add-int/lit8 v3, v3, 0x1

    sput v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->previousAuthRequestFailureCount:I

    sget-object v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->credentialsProposed:Ljava/util/List;

    if-nez v3, :cond_1

    invoke-virtual/range {p1 .. p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/pichillilorenzo/flutter_inappwebview/credential_database/CredentialDatabase;->getInstance(Landroid/content/Context;)Lcom/pichillilorenzo/flutter_inappwebview/credential_database/CredentialDatabase;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    invoke-virtual {v3, v10, v2, v11, v4}, Lcom/pichillilorenzo/flutter_inappwebview/credential_database/CredentialDatabase;->getHttpAuthCredentials(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ljava/util/List;

    move-result-object v3

    sput-object v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->credentialsProposed:Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object/from16 v10, p3

    move-object/from16 v11, p4

    :goto_1
    const/4 v3, 0x0

    sget-object v4, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->credentialsProposed:Ljava/util/List;

    if-eqz v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_2

    sget-object v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->credentialsProposed:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/pichillilorenzo/flutter_inappwebview/types/URLCredential;

    :cond_2
    move-object v1, v3

    new-instance v12, Lcom/pichillilorenzo/flutter_inappwebview/types/URLProtectionSpace;

    invoke-virtual/range {p1 .. p1}, Landroid/webkit/WebView;->getCertificate()Landroid/net/http/SslCertificate;

    move-result-object v8

    const/4 v9, 0x0

    move-object v3, v12

    move-object/from16 v4, p3

    move-object v5, v2

    move-object/from16 v6, p4

    move v7, v0

    invoke-direct/range {v3 .. v9}, Lcom/pichillilorenzo/flutter_inappwebview/types/URLProtectionSpace;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/net/http/SslCertificate;Landroid/net/http/SslError;)V

    new-instance v3, Lcom/pichillilorenzo/flutter_inappwebview/types/HttpAuthenticationChallenge;

    sget v4, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->previousAuthRequestFailureCount:I

    invoke-direct {v3, v12, v4, v1}, Lcom/pichillilorenzo/flutter_inappwebview/types/HttpAuthenticationChallenge;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/types/URLProtectionSpace;ILcom/pichillilorenzo/flutter_inappwebview/types/URLCredential;)V

    move-object v1, p0

    iget-object v12, v1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->channel:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {v3}, Lcom/pichillilorenzo/flutter_inappwebview/types/HttpAuthenticationChallenge;->toMap()Ljava/util/Map;

    move-result-object v13

    new-instance v14, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient$2;

    move-object v3, v14

    move-object v4, p0

    move-object/from16 v5, p1

    move-object/from16 v6, p3

    move-object v7, v2

    move-object/from16 v8, p4

    move v9, v0

    move-object/from16 v10, p2

    invoke-direct/range {v3 .. v10}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient$2;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/webkit/HttpAuthHandler;)V

    const-string v0, "onReceivedHttpAuthRequest"

    invoke-virtual {v12, v0, v13, v14}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "url"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3}, Landroid/webkit/WebResourceResponse;->getStatusCode()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string v0, "statusCode"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3}, Landroid/webkit/WebResourceResponse;->getReasonPhrase()Ljava/lang/String;

    move-result-object p2

    const-string p3, "description"

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->channel:Lio/flutter/plugin/common/MethodChannel;

    const-string p3, "onLoadHttpError"

    invoke-virtual {p2, p3, p1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onReceivedLoginRequest(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "realm"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "account"

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "args"

    invoke-interface {p1, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->channel:Lio/flutter/plugin/common/MethodChannel;

    const-string p3, "onReceivedLoginRequest"

    invoke-virtual {p2, p3, p1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 10

    invoke-virtual {p3}, Landroid/net/http/SslError;->getUrl()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    const-string v2, "https"

    :try_start_0
    new-instance v3, Ljava/net/URI;

    invoke-direct {v3, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Ljava/net/URI;->getPort()I

    move-result v0
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/net/URISyntaxException;->printStackTrace()V

    const/4 v0, 0x0

    :goto_0
    move v7, v0

    move-object v4, v1

    move-object v5, v2

    new-instance v0, Lcom/pichillilorenzo/flutter_inappwebview/types/URLProtectionSpace;

    invoke-virtual {p3}, Landroid/net/http/SslError;->getCertificate()Landroid/net/http/SslCertificate;

    move-result-object v8

    const/4 v6, 0x0

    move-object v3, v0

    move-object v9, p3

    invoke-direct/range {v3 .. v9}, Lcom/pichillilorenzo/flutter_inappwebview/types/URLProtectionSpace;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/net/http/SslCertificate;Landroid/net/http/SslError;)V

    new-instance v1, Lcom/pichillilorenzo/flutter_inappwebview/types/ServerTrustChallenge;

    invoke-direct {v1, v0}, Lcom/pichillilorenzo/flutter_inappwebview/types/ServerTrustChallenge;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/types/URLProtectionSpace;)V

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->channel:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {v1}, Lcom/pichillilorenzo/flutter_inappwebview/types/URLAuthenticationChallenge;->toMap()Ljava/util/Map;

    move-result-object v1

    new-instance v2, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient$3;

    invoke-direct {v2, p0, p2, p1, p3}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient$3;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;Landroid/webkit/SslErrorHandler;Landroid/webkit/WebView;Landroid/net/http/SslError;)V

    const-string p1, "onReceivedServerTrustAuthRequest"

    invoke-virtual {v0, p1, v1, v2}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public onRenderProcessGone(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->options:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;->useOnRenderProcessGone:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroid/webkit/RenderProcessGoneDetail;->didCrash()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2}, Landroid/webkit/RenderProcessGoneDetail;->rendererPriorityAtExit()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "didCrash"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "rendererPriorityAtExit"

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->channel:Lio/flutter/plugin/common/MethodChannel;

    const-string p2, "onRenderProcessGone"

    invoke-virtual {p1, p2, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onRenderProcessGone(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z

    move-result p1

    return p1
.end method

.method public onSafeBrowsingHit(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;ILandroid/webkit/SafeBrowsingResponse;)V
    .locals 9

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "url"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "threatType"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->channel:Lio/flutter/plugin/common/MethodChannel;

    new-instance v8, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient$5;

    move-object v2, v8

    move-object v3, p0

    move-object v4, p4

    move-object v5, p1

    move-object v6, p2

    move v7, p3

    invoke-direct/range {v2 .. v7}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient$5;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;Landroid/webkit/SafeBrowsingResponse;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;I)V

    const-string p1, "onSafeBrowsingHit"

    invoke-virtual {v1, p1, v0, v8}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public onScaleChanged(Landroid/webkit/WebView;FF)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onScaleChanged(Landroid/webkit/WebView;FF)V

    check-cast p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/pichillilorenzo/flutter_inappwebview/Util;->getPixelDensity(Landroid/content/Context;)F

    move-result v0

    div-float v0, p3, v0

    iput v0, p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->zoomScale:F

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    const-string v0, "oldScale"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    const-string p3, "newScale"

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->channel:Lio/flutter/plugin/common/MethodChannel;

    const-string p3, "onZoomScaleChanged"

    invoke-virtual {p2, p3, p1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onShouldInterceptRequest(Ljava/lang/Object;)Landroid/webkit/WebResourceResponse;
    .locals 12

    instance-of v0, p1, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x1

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    const/4 v5, 0x0

    if-lt v3, v4, :cond_2

    instance-of v6, p1, Landroid/webkit/WebResourceRequest;

    if-eqz v6, :cond_2

    check-cast p1, Landroid/webkit/WebResourceRequest;

    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->hasGesture()Z

    move-result v6

    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result v7

    const/16 v8, 0x18

    if-lt v3, v8, :cond_1

    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->isRedirect()Z

    move-result v5

    :cond_1
    move p1, v5

    move v5, v6

    goto :goto_1

    :cond_2
    move v7, v2

    move p1, v5

    move-object v2, v1

    :goto_1
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const-string v8, "url"

    invoke-interface {v6, v8, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "method"

    const-string v8, "GET"

    invoke-interface {v6, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "headers"

    invoke-interface {v6, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v7, "isForMainFrame"

    invoke-interface {v6, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v5, "hasGesture"

    invoke-interface {v6, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v2, "isRedirect"

    invoke-interface {v6, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->channel:Lio/flutter/plugin/common/MethodChannel;

    const-string v2, "shouldInterceptRequest"

    invoke-static {p1, v2, v6}, Lcom/pichillilorenzo/flutter_inappwebview/Util;->invokeMethodAndWait(Lio/flutter/plugin/common/MethodChannel;Ljava/lang/String;Ljava/lang/Object;)Lcom/pichillilorenzo/flutter_inappwebview/Util$WaitFlutterResult;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, p1, Lcom/pichillilorenzo/flutter_inappwebview/Util$WaitFlutterResult;->error:Ljava/lang/String;

    if-eqz v2, :cond_3

    const-string p1, "IAWebViewClient"

    invoke-static {p1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_3
    iget-object p1, p1, Lcom/pichillilorenzo/flutter_inappwebview/Util$WaitFlutterResult;->result:Ljava/lang/Object;

    if-eqz p1, :cond_8

    check-cast p1, Ljava/util/Map;

    const-string v2, "contentType"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/lang/String;

    const-string v2, "contentEncoding"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    const-string v2, "data"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/Map;

    const-string v0, "statusCode"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const-string v5, "reasonPhrase"

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v9, p1

    check-cast v9, Ljava/lang/String;

    if-eqz v2, :cond_4

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    :cond_4
    move-object v11, v1

    if-nez v10, :cond_5

    if-nez v0, :cond_5

    if-eqz v9, :cond_6

    :cond_5
    if-ge v3, v4, :cond_7

    :cond_6
    new-instance p1, Landroid/webkit/WebResourceResponse;

    invoke-direct {p1, v6, v7, v11}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    return-object p1

    :cond_7
    new-instance p1, Landroid/webkit/WebResourceResponse;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    move-object v5, p1

    invoke-direct/range {v5 .. v11}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V

    return-object p1

    :cond_8
    :goto_2
    return-object v1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/InterruptedException;->printStackTrace()V

    return-object v1
.end method

.method public onShouldOverrideUrlLoading(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZZZ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;ZZZ)V"
        }
    .end annotation

    new-instance v0, Lcom/pichillilorenzo/flutter_inappwebview/types/URLRequest;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p3, v1, p4}, Lcom/pichillilorenzo/flutter_inappwebview/types/URLRequest;-><init>(Ljava/lang/String;Ljava/lang/String;[BLjava/util/Map;)V

    new-instance p3, Lcom/pichillilorenzo/flutter_inappwebview/types/NavigationAction;

    invoke-direct {p3, v0, p5, p6, p7}, Lcom/pichillilorenzo/flutter_inappwebview/types/NavigationAction;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/types/URLRequest;ZZZ)V

    iget-object p6, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->channel:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p3}, Lcom/pichillilorenzo/flutter_inappwebview/types/NavigationAction;->toMap()Ljava/util/Map;

    move-result-object p3

    new-instance p7, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient$1;

    move-object v0, p7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient$1;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;Ljava/lang/String;Ljava/util/Map;Z)V

    const-string p1, "shouldOverrideUrlLoading"

    invoke-virtual {p6, p1, p3, p7}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public onUnhandledKeyEvent(Landroid/webkit/WebView;Landroid/view/KeyEvent;)V
    .locals 0

    return-void
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->options:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;->useShouldInterceptRequest:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->onShouldInterceptRequest(Ljava/lang/Object;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, v1}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 12

    const-string v0, "contentType"

    check-cast p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    iget-object v1, p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->options:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;

    iget-object v1, v1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;->useShouldInterceptRequest:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p2}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->onShouldInterceptRequest(Ljava/lang/Object;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/net/URI;

    invoke-direct {v2, p2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v2, ":"

    invoke-virtual {p2, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aget-object v5, v2, v3

    :try_start_1
    new-instance v2, Ljava/net/URL;

    const-string v3, "https"

    invoke-virtual {p2, v5, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    new-instance v3, Ljava/net/URI;

    invoke-virtual {v2}, Ljava/net/URL;->getUserInfo()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Ljava/net/URL;->getPort()I

    move-result v8

    invoke-virtual {v2}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Ljava/net/URL;->getQuery()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Ljava/net/URL;->getRef()Ljava/lang/String;

    move-result-object v11

    move-object v4, v3

    invoke-direct/range {v4 .. v11}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    move-object v2, v3

    :goto_0
    invoke-virtual {v2}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->options:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;

    iget-object v3, v3, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;->resourceCustomSchemes:Ljava/util/List;

    if-eqz v3, :cond_3

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "url"

    invoke-interface {v2, v3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_2
    iget-object v3, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->channel:Lio/flutter/plugin/common/MethodChannel;

    const-string v4, "onLoadResourceCustomScheme"

    invoke-static {v3, v4, v2}, Lcom/pichillilorenzo/flutter_inappwebview/Util;->invokeMethodAndWait(Lio/flutter/plugin/common/MethodChannel;Ljava/lang/String;Ljava/lang/Object;)Lcom/pichillilorenzo/flutter_inappwebview/Util$WaitFlutterResult;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2

    iget-object v3, v2, Lcom/pichillilorenzo/flutter_inappwebview/Util$WaitFlutterResult;->error:Ljava/lang/String;

    if-eqz v3, :cond_1

    const-string v0, "IAWebViewClient"

    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_1
    iget-object v2, v2, Lcom/pichillilorenzo/flutter_inappwebview/Util$WaitFlutterResult;->result:Ljava/lang/Object;

    if-eqz v2, :cond_3

    check-cast v2, Ljava/util/Map;

    :try_start_3
    iget-object v3, p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->contentBlockerHandler:Lcom/pichillilorenzo/flutter_inappwebview/content_blocker/ContentBlockerHandler;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, p1, p2, v4}, Lcom/pichillilorenzo/flutter_inappwebview/content_blocker/ContentBlockerHandler;->checkUrl(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    const-string p1, "data"

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    new-instance p2, Landroid/webkit/WebResourceResponse;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "contentEncoding"

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-direct {v2, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {p2, v0, v1, v2}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V

    return-object p2

    :catch_2
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/InterruptedException;->printStackTrace()V

    return-object v1

    :cond_3
    :goto_2
    iget-object v0, p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->contentBlockerHandler:Lcom/pichillilorenzo/flutter_inappwebview/content_blocker/ContentBlockerHandler;

    invoke-virtual {v0}, Lcom/pichillilorenzo/flutter_inappwebview/content_blocker/ContentBlockerHandler;->getRuleList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    :try_start_4
    iget-object v0, p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->contentBlockerHandler:Lcom/pichillilorenzo/flutter_inappwebview/content_blocker/ContentBlockerHandler;

    invoke-virtual {v0, p1, p2}, Lcom/pichillilorenzo/flutter_inappwebview/content_blocker/ContentBlockerHandler;->checkUrl(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_3

    :catch_3
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_3
    return-object v1

    :catch_4
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return-object v1
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 8
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    check-cast p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    iget-object v0, p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->options:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;->useShouldOverrideUrlLoading:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v0, v2, :cond_0

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isRedirect()Z

    move-result v0

    move v7, v0

    goto :goto_0

    :cond_0
    move v7, v1

    :goto_0
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getMethod()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    move-result-object v4

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result v5

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->hasGesture()Z

    move-result v6

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v7}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->onShouldOverrideUrlLoading(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZZZ)V

    iget-object v0, p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->regexToCancelSubFramesLoadingCompiled:Ljava/util/regex/Pattern;

    if-eqz v0, :cond_2

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    iget-object p1, p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->regexToCancelSubFramesLoadingCompiled:Ljava/util/regex/Pattern;

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1

    :cond_2
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p1

    return p1

    :cond_3
    return v1
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 8

    move-object v1, p1

    check-cast v1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;

    iget-object p1, v1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;->options:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;

    iget-object p1, p1, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewOptions;->useShouldOverrideUrlLoading:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v3, "GET"

    move-object v0, p0

    move-object v2, p2

    invoke-virtual/range {v0 .. v7}, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewClient;->onShouldOverrideUrlLoading(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebView;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZZZ)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
