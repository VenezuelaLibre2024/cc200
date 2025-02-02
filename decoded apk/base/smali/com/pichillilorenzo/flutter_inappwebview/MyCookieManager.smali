.class public Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# static fields
.field public static final LOG_TAG:Ljava/lang/String; = "MyCookieManager"

.field public static cookieManager:Landroid/webkit/CookieManager;


# instance fields
.field public channel:Lio/flutter/plugin/common/MethodChannel;

.field public plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;


# direct methods
.method public constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    iget-object p1, p1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->messenger:Lio/flutter/plugin/common/BinaryMessenger;

    const-string v1, "com.pichillilorenzo/flutter_inappwebview_cookiemanager"

    invoke-direct {v0, p1, v1}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->channel:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    return-void
.end method

.method public static getCookieExpirationDate(Ljava/lang/Long;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "EEE, dd MMM yyyy hh:mm:ss z"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v1, "GMT"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    new-instance v1, Ljava/util/Date;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getCookieManager()Landroid/webkit/CookieManager;
    .locals 4

    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v1

    sput-object v1, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "android.webkit.WebViewFactory.MissingWebViewPackageException"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    :cond_0
    throw v1

    :catch_1
    return-object v0

    :cond_1
    :goto_0
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    return-object v0
.end method

.method public static init()V
    .locals 1

    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->getCookieManager()Landroid/webkit/CookieManager;

    move-result-object v0

    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    :cond_0
    return-void
.end method


# virtual methods
.method public deleteAllCookies(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    invoke-static {}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->getCookieManager()Landroid/webkit/CookieManager;

    move-result-object v0

    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_1

    new-instance v1, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager$3;

    invoke-direct {v1, p0, p1}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager$3;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {v0, v1}, Landroid/webkit/CookieManager;->removeAllCookies(Landroid/webkit/ValueCallback;)V

    sget-object p1, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    invoke-virtual {p1}, Landroid/webkit/CookieManager;->flush()V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    if-eqz v1, :cond_2

    iget-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->applicationContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->startSync()V

    sget-object v1, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    invoke-virtual {v1}, Landroid/webkit/CookieManager;->removeAllCookie()V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->stopSync()V

    invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->sync()V

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Landroid/webkit/CookieManager;->removeAllCookie()V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public deleteCookie(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    invoke-static {}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->getCookieManager()Landroid/webkit/CookieManager;

    move-result-object v0

    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "=; Path="

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "; Max-Age=-1"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    if-eqz p3, :cond_1

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "; Domain="

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_1
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ";"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p4, 0x15

    if-lt p3, p4, :cond_2

    sget-object p3, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    new-instance p4, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager$2;

    invoke-direct {p4, p0, p5}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager$2;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p3, p1, p2, p4}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    sget-object p1, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    invoke-virtual {p1}, Landroid/webkit/CookieManager;->flush()V

    goto :goto_0

    :cond_2
    iget-object p3, p0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    if-eqz p3, :cond_3

    iget-object p3, p3, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->applicationContext:Landroid/content/Context;

    invoke-static {p3}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    move-result-object p3

    invoke-virtual {p3}, Landroid/webkit/CookieSyncManager;->startSync()V

    sget-object p4, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    invoke-virtual {p4, p1, p2}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p5, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    invoke-virtual {p3}, Landroid/webkit/CookieSyncManager;->stopSync()V

    invoke-virtual {p3}, Landroid/webkit/CookieSyncManager;->sync()V

    goto :goto_0

    :cond_3
    sget-object p3, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    invoke-virtual {p3, p1, p2}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p5, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public deleteCookies(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 11

    invoke-static {}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->getCookieManager()Landroid/webkit/CookieManager;

    move-result-object v0

    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v2, 0x0

    const/16 v3, 0x15

    if-ge v1, v3, :cond_1

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    if-eqz v1, :cond_1

    iget-object v1, v1, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->applicationContext:Landroid/content/Context;

    invoke-static {v1}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/webkit/CookieSyncManager;->startSync()V

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    const-string v4, ";"

    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v5, v0

    const/4 v6, 0x0

    move v7, v6

    :goto_1
    if-ge v7, v5, :cond_4

    aget-object v8, v0, v7

    const/4 v9, 0x2

    const-string v10, "="

    invoke-virtual {v8, v10, v9}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v8

    aget-object v8, v8, v6

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "=; Path="

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "; Max-Age=-1"

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    if-eqz p2, :cond_2

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "; Domain="

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    :cond_2
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v9, v3, :cond_3

    sget-object v9, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    invoke-virtual {v9, p1, v8, v2}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    goto :goto_2

    :cond_3
    sget-object v9, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    invoke-virtual {v9, p1, v8}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/webkit/CookieSyncManager;->stopSync()V

    invoke-virtual {v1}, Landroid/webkit/CookieSyncManager;->sync()V

    goto :goto_3

    :cond_5
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v3, :cond_6

    sget-object p1, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    invoke-virtual {p1}, Landroid/webkit/CookieManager;->flush()V

    :cond_6
    :goto_3
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p4, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public dispose()V
    .locals 2

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->channel:Lio/flutter/plugin/common/MethodChannel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    return-void
.end method

.method public getCookies(Ljava/lang/String;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->getCookieManager()Landroid/webkit/CookieManager;

    move-result-object v1

    sput-object v1, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {v1, p1}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string v1, ";"

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, p1, v3

    const/4 v5, 0x2

    const-string v6, "="

    invoke-virtual {v4, v6, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    aget-object v5, v4, v2

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    array-length v6, v4

    const/4 v7, 0x1

    if-le v6, v7, :cond_1

    aget-object v4, v4, v7

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    const-string v4, ""

    :goto_1
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const-string v7, "name"

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "value"

    invoke-interface {v6, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "expiresDate"

    const/4 v5, 0x0

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "isSessionOnly"

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "domain"

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "sameSite"

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "isSecure"

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "isHttpOnly"

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "path"

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 15

    move-object v12, p0

    move-object/from16 v0, p1

    move-object/from16 v11, p2

    invoke-static {}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->init()V

    iget-object v1, v0, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, -0x1

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "getCookies"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_1
    const-string v2, "deleteAllCookies"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_2
    const-string v2, "deleteCookies"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_3
    const-string v2, "setCookie"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_4
    const-string v2, "deleteCookie"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v3, 0x0

    :goto_0
    const-string v1, "name"

    const-string v2, "path"

    const-string v4, "domain"

    const-string v5, "url"

    packed-switch v3, :pswitch_data_0

    invoke-interface/range {p2 .. p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    goto/16 :goto_2

    :pswitch_0
    invoke-virtual {v0, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->getCookies(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v11, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_1
    invoke-virtual {p0, v11}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->deleteAllCookies(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_2

    :pswitch_2
    invoke-virtual {v0, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v1, v3, v0, v11}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->deleteCookies(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_2

    :pswitch_3
    invoke-virtual {v0, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    const-string v1, "value"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    const-string v1, "expiresDate"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_5

    new-instance v2, Ljava/lang/Long;

    invoke-direct {v2, v1}, Ljava/lang/Long;-><init>(Ljava/lang/String;)V

    move-object v8, v2

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    move-object v8, v1

    :goto_1
    const-string v1, "maxAge"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Ljava/lang/Integer;

    const-string v1, "isSecure"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Ljava/lang/Boolean;

    const-string v1, "isHttpOnly"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Ljava/lang/Boolean;

    const-string v1, "sameSite"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljava/lang/String;

    move-object v0, p0

    move-object v1, v3

    move-object v2, v5

    move-object v3, v6

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object v9, v13

    move-object v10, v14

    move-object/from16 v11, p2

    invoke-virtual/range {v0 .. v11}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_2

    :pswitch_4
    invoke-virtual {v0, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    move-object v0, p0

    move-object v1, v3

    move-object v2, v5

    move-object v3, v4

    move-object v4, v6

    move-object/from16 v5, p2

    invoke-virtual/range {v0 .. v5}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->deleteCookie(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V

    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x48e2b011 -> :sswitch_4
        0x78c6166 -> :sswitch_3
        0x2c8cae64 -> :sswitch_2
        0x310501b9 -> :sswitch_1
        0x768e7e59 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setCookie(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    invoke-static {}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->getCookieManager()Landroid/webkit/CookieManager;

    move-result-object v0

    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "="

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "; Path="

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    if-eqz p4, :cond_1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "; Domain="

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_1
    if-eqz p6, :cond_2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "; Expires="

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p6}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->getCookieExpirationDate(Ljava/lang/Long;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_2
    if-eqz p7, :cond_3

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "; Max-Age="

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p7}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_3
    if-eqz p8, :cond_4

    invoke-virtual {p8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_4

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "; Secure"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_4
    if-eqz p9, :cond_5

    invoke-virtual {p9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_5

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "; HttpOnly"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_5
    if-eqz p10, :cond_6

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "; SameSite="

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_6
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ";"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p4, 0x15

    if-lt p3, p4, :cond_7

    sget-object p3, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    new-instance p4, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager$1;

    invoke-direct {p4, p0, p11}, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager$1;-><init>(Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {p3, p1, p2, p4}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    sget-object p1, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    invoke-virtual {p1}, Landroid/webkit/CookieManager;->flush()V

    goto :goto_0

    :cond_7
    iget-object p3, p0, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->plugin:Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;

    if-eqz p3, :cond_8

    iget-object p3, p3, Lcom/pichillilorenzo/flutter_inappwebview/InAppWebViewFlutterPlugin;->applicationContext:Landroid/content/Context;

    invoke-static {p3}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    move-result-object p3

    invoke-virtual {p3}, Landroid/webkit/CookieSyncManager;->startSync()V

    sget-object p4, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    invoke-virtual {p4, p1, p2}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p11, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    invoke-virtual {p3}, Landroid/webkit/CookieSyncManager;->stopSync()V

    invoke-virtual {p3}, Landroid/webkit/CookieSyncManager;->sync()V

    goto :goto_0

    :cond_8
    sget-object p3, Lcom/pichillilorenzo/flutter_inappwebview/MyCookieManager;->cookieManager:Landroid/webkit/CookieManager;

    invoke-virtual {p3, p1, p2}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p11, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
