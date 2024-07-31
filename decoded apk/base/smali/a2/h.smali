.class public La2/h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La2/h$b;,
        La2/h$a;
    }
.end annotation


# static fields
.field public static final a:Landroid/net/Uri;

.field public static final b:Landroid/net/Uri;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "*"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, La2/h;->a:Landroid/net/Uri;

    const-string v0, ""

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, La2/h;->b:Landroid/net/Uri;

    return-void
.end method

.method public static a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/util/Set;La2/h$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebView;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "La2/h$b;",
            ")V"
        }
    .end annotation

    sget-object v0, Lb2/s;->S:Lb2/a$d;

    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, La2/h;->h(Landroid/webkit/WebView;)Lb2/u;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lb2/u;->a(Ljava/lang/String;[Ljava/lang/String;La2/h$b;)V

    return-void

    :cond_0
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static b(Landroid/webkit/WebView;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;
    .locals 1

    invoke-static {}, La2/h;->e()Lb2/v;

    move-result-object v0

    invoke-interface {v0, p0}, Lb2/v;->createWebView(Landroid/webkit/WebView;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/webkit/WebView;)[La2/g;
    .locals 2

    sget-object v0, Lb2/s;->D:Lb2/a$b;

    invoke-virtual {v0}, Lb2/a$b;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Lb2/b;->c(Landroid/webkit/WebView;)[Landroid/webkit/WebMessagePort;

    move-result-object p0

    invoke-static {p0}, Lb2/r;->k([Landroid/webkit/WebMessagePort;)[La2/g;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, La2/h;->h(Landroid/webkit/WebView;)Lb2/u;

    move-result-object p0

    invoke-virtual {p0}, Lb2/u;->b()[La2/g;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static d(Landroid/content/Context;)Landroid/content/pm/PackageInfo;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-ge v0, v2, :cond_0

    return-object v1

    :cond_0
    const/16 v2, 0x1a

    if-lt v0, v2, :cond_1

    invoke-static {}, Lb2/d;->a()Landroid/content/pm/PackageInfo;

    move-result-object p0

    return-object p0

    :cond_1
    :try_start_0
    invoke-static {}, La2/h;->f()Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    invoke-static {p0}, La2/h;->g(Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object p0

    return-object p0

    :catch_0
    return-object v1
.end method

.method public static e()Lb2/v;
    .locals 1

    invoke-static {}, Lb2/t;->d()Lb2/v;

    move-result-object v0

    return-object v0
.end method

.method public static f()Landroid/content/pm/PackageInfo;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "PrivateApi"
        }
    .end annotation

    const-string v0, "android.webkit.WebViewFactory"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    const-string v3, "getLoadedPackageInfo"

    invoke-virtual {v0, v3, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    return-object v0
.end method

.method public static g(Landroid/content/Context;)Landroid/content/pm/PackageInfo;
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "PrivateApi"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    const/4 v3, 0x0

    if-lt v1, v2, :cond_0

    const/16 v2, 0x17

    if-gt v1, v2, :cond_0

    const-string v1, "android.webkit.WebViewFactory"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getWebViewPackageName"

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_0
    const-string v1, "android.webkit.WebViewUpdateService"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getCurrentWebViewPackageName"

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_1
    if-nez v1, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    :try_start_1
    invoke-virtual {p0, v1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method

.method public static h(Landroid/webkit/WebView;)Lb2/u;
    .locals 1

    new-instance v0, Lb2/u;

    invoke-static {p0}, La2/h;->b(Landroid/webkit/WebView;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    move-result-object p0

    invoke-direct {v0, p0}, Lb2/u;-><init>(Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;)V

    return-object v0
.end method

.method public static i()Landroid/net/Uri;
    .locals 2

    sget-object v0, Lb2/s;->j:Lb2/a$f;

    invoke-virtual {v0}, Lb2/a$f;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lb2/e;->b()Landroid/net/Uri;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, La2/h;->e()Lb2/v;

    move-result-object v0

    invoke-interface {v0}, Lb2/v;->getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;->getSafeBrowsingPrivacyPolicyUrl()Landroid/net/Uri;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public static j(Landroid/webkit/WebView;La2/f;Landroid/net/Uri;)V
    .locals 2

    sget-object v0, La2/h;->a:Landroid/net/Uri;

    invoke-virtual {v0, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, La2/h;->b:Landroid/net/Uri;

    :cond_0
    sget-object v0, Lb2/s;->E:Lb2/a$b;

    invoke-virtual {v0}, Lb2/a$b;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Lb2/r;->f(La2/f;)Landroid/webkit/WebMessage;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lb2/b;->j(Landroid/webkit/WebView;Landroid/webkit/WebMessage;Landroid/net/Uri;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0}, La2/h;->h(Landroid/webkit/WebView;)Lb2/u;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lb2/u;->c(La2/f;Landroid/net/Uri;)V

    :goto_0
    return-void

    :cond_2
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static k(Ljava/util/Set;Landroid/webkit/ValueCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/webkit/ValueCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lb2/s;->i:Lb2/a$f;

    sget-object v1, Lb2/s;->h:Lb2/a$f;

    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, La2/h;->e()Lb2/v;

    move-result-object v0

    invoke-interface {v0}, Lb2/v;->getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;->setSafeBrowsingAllowlist(Ljava/util/Set;Landroid/webkit/ValueCallback;)V

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Lb2/a$f;->c()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {v0, p1}, Lb2/e;->d(Ljava/util/List;Landroid/webkit/ValueCallback;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lb2/a;->d()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {}, La2/h;->e()Lb2/v;

    move-result-object p0

    invoke-interface {p0}, Lb2/v;->getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    move-result-object p0

    invoke-interface {p0, v0, p1}, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;->setSafeBrowsingWhitelist(Ljava/util/List;Landroid/webkit/ValueCallback;)V

    :goto_0
    return-void

    :cond_2
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static l(Ljava/util/List;Landroid/webkit/ValueCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/webkit/ValueCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0, p1}, La2/h;->k(Ljava/util/Set;Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public static m(Landroid/webkit/WebView;La2/k;)V
    .locals 2

    sget-object v0, Lb2/s;->L:Lb2/a$h;

    invoke-virtual {v0}, Lb2/a$h;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, p1}, Lb2/g;->e(Landroid/webkit/WebView;La2/k;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, La2/h;->h(Landroid/webkit/WebView;)Lb2/u;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lb2/u;->d(Ljava/util/concurrent/Executor;La2/k;)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method

.method public static n(Landroid/content/Context;Landroid/webkit/ValueCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/webkit/ValueCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lb2/s;->e:Lb2/a$f;

    invoke-virtual {v0}, Lb2/a$f;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, p1}, Lb2/e;->f(Landroid/content/Context;Landroid/webkit/ValueCallback;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, La2/h;->e()Lb2/v;

    move-result-object v0

    invoke-interface {v0}, Lb2/v;->getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;->initSafeBrowsing(Landroid/content/Context;Landroid/webkit/ValueCallback;)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p0

    throw p0
.end method
