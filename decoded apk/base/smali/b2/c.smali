.class public Lb2/c;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/webkit/ServiceWorkerWebSettings;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/webkit/ServiceWorkerWebSettings;->getAllowContentAccess()Z

    move-result p0

    return p0
.end method

.method public static b(Landroid/webkit/ServiceWorkerWebSettings;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/webkit/ServiceWorkerWebSettings;->getAllowFileAccess()Z

    move-result p0

    return p0
.end method

.method public static c(Landroid/webkit/ServiceWorkerWebSettings;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/webkit/ServiceWorkerWebSettings;->getBlockNetworkLoads()Z

    move-result p0

    return p0
.end method

.method public static d(Landroid/webkit/ServiceWorkerWebSettings;)I
    .locals 0

    invoke-virtual {p0}, Landroid/webkit/ServiceWorkerWebSettings;->getCacheMode()I

    move-result p0

    return p0
.end method

.method public static e(Landroid/content/Context;)Ljava/io/File;
    .locals 0

    invoke-virtual {p0}, Landroid/content/Context;->getDataDir()Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/webkit/WebSettings;)I
    .locals 0

    invoke-virtual {p0}, Landroid/webkit/WebSettings;->getDisabledActionModeMenuItems()I

    move-result p0

    return p0
.end method

.method public static g()Landroid/webkit/ServiceWorkerController;
    .locals 1

    invoke-static {}, Landroid/webkit/ServiceWorkerController;->getInstance()Landroid/webkit/ServiceWorkerController;

    move-result-object v0

    return-object v0
.end method

.method public static h(Landroid/webkit/ServiceWorkerController;)Landroid/webkit/ServiceWorkerWebSettings;
    .locals 0

    invoke-virtual {p0}, Landroid/webkit/ServiceWorkerController;->getServiceWorkerWebSettings()Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object p0

    return-object p0
.end method

.method public static i(Landroid/webkit/ServiceWorkerController;)Lb2/n;
    .locals 1

    new-instance v0, Lb2/n;

    invoke-static {p0}, Lb2/c;->h(Landroid/webkit/ServiceWorkerController;)Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object p0

    invoke-direct {v0, p0}, Lb2/n;-><init>(Landroid/webkit/ServiceWorkerWebSettings;)V

    return-object v0
.end method

.method public static j(Landroid/webkit/WebResourceRequest;)Z
    .locals 0

    invoke-interface {p0}, Landroid/webkit/WebResourceRequest;->isRedirect()Z

    move-result p0

    return p0
.end method

.method public static k(Landroid/webkit/ServiceWorkerWebSettings;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/webkit/ServiceWorkerWebSettings;->setAllowContentAccess(Z)V

    return-void
.end method

.method public static l(Landroid/webkit/ServiceWorkerWebSettings;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/webkit/ServiceWorkerWebSettings;->setAllowFileAccess(Z)V

    return-void
.end method

.method public static m(Landroid/webkit/ServiceWorkerWebSettings;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/webkit/ServiceWorkerWebSettings;->setBlockNetworkLoads(Z)V

    return-void
.end method

.method public static n(Landroid/webkit/ServiceWorkerWebSettings;I)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/webkit/ServiceWorkerWebSettings;->setCacheMode(I)V

    return-void
.end method

.method public static o(Landroid/webkit/WebSettings;I)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/webkit/WebSettings;->setDisabledActionModeMenuItems(I)V

    return-void
.end method

.method public static p(Landroid/webkit/ServiceWorkerController;Landroid/webkit/ServiceWorkerClient;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/webkit/ServiceWorkerController;->setServiceWorkerClient(Landroid/webkit/ServiceWorkerClient;)V

    return-void
.end method

.method public static q(Landroid/webkit/ServiceWorkerController;La2/b;)V
    .locals 1

    new-instance v0, Lb2/i;

    invoke-direct {v0, p1}, Lb2/i;-><init>(La2/b;)V

    invoke-virtual {p0, v0}, Landroid/webkit/ServiceWorkerController;->setServiceWorkerClient(Landroid/webkit/ServiceWorkerClient;)V

    return-void
.end method
