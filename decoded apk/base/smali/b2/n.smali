.class public Lb2/n;
.super La2/d;
.source ""


# instance fields
.field public a:Landroid/webkit/ServiceWorkerWebSettings;

.field public b:Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;


# direct methods
.method public constructor <init>(Landroid/webkit/ServiceWorkerWebSettings;)V
    .locals 0

    invoke-direct {p0}, La2/d;-><init>()V

    iput-object p1, p0, Lb2/n;->a:Landroid/webkit/ServiceWorkerWebSettings;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/InvocationHandler;)V
    .locals 1

    invoke-direct {p0}, La2/d;-><init>()V

    const-class v0, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    invoke-static {v0, p1}, Lcf/a;->a(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    iput-object p1, p0, Lb2/n;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    sget-object v0, Lb2/s;->m:Lb2/a$c;

    invoke-virtual {v0}, Lb2/a$c;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lb2/n;->j()Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    invoke-static {v0}, Lb2/c;->a(Landroid/webkit/ServiceWorkerWebSettings;)Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lb2/n;->i()Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;->getAllowContentAccess()Z

    move-result v0

    return v0

    :cond_1
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public b()Z
    .locals 2

    sget-object v0, Lb2/s;->n:Lb2/a$c;

    invoke-virtual {v0}, Lb2/a$c;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lb2/n;->j()Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    invoke-static {v0}, Lb2/c;->b(Landroid/webkit/ServiceWorkerWebSettings;)Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lb2/n;->i()Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;->getAllowFileAccess()Z

    move-result v0

    return v0

    :cond_1
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public c()Z
    .locals 2

    sget-object v0, Lb2/s;->o:Lb2/a$c;

    invoke-virtual {v0}, Lb2/a$c;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lb2/n;->j()Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    invoke-static {v0}, Lb2/c;->c(Landroid/webkit/ServiceWorkerWebSettings;)Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lb2/n;->i()Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;->getBlockNetworkLoads()Z

    move-result v0

    return v0

    :cond_1
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public d()I
    .locals 2

    sget-object v0, Lb2/s;->l:Lb2/a$c;

    invoke-virtual {v0}, Lb2/a$c;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lb2/n;->j()Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    invoke-static {v0}, Lb2/c;->d(Landroid/webkit/ServiceWorkerWebSettings;)I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lb2/n;->i()Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;->getCacheMode()I

    move-result v0

    return v0

    :cond_1
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public e(Z)V
    .locals 2

    sget-object v0, Lb2/s;->m:Lb2/a$c;

    invoke-virtual {v0}, Lb2/a$c;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lb2/n;->j()Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    invoke-static {v0, p1}, Lb2/c;->k(Landroid/webkit/ServiceWorkerWebSettings;Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lb2/n;->i()Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;->setAllowContentAccess(Z)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method

.method public f(Z)V
    .locals 2

    sget-object v0, Lb2/s;->n:Lb2/a$c;

    invoke-virtual {v0}, Lb2/a$c;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lb2/n;->j()Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    invoke-static {v0, p1}, Lb2/c;->l(Landroid/webkit/ServiceWorkerWebSettings;Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lb2/n;->i()Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;->setAllowFileAccess(Z)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method

.method public g(Z)V
    .locals 2

    sget-object v0, Lb2/s;->o:Lb2/a$c;

    invoke-virtual {v0}, Lb2/a$c;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lb2/n;->j()Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    invoke-static {v0, p1}, Lb2/c;->m(Landroid/webkit/ServiceWorkerWebSettings;Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lb2/n;->i()Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;->setBlockNetworkLoads(Z)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method

.method public h(I)V
    .locals 2

    sget-object v0, Lb2/s;->l:Lb2/a$c;

    invoke-virtual {v0}, Lb2/a$c;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lb2/n;->j()Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    invoke-static {v0, p1}, Lb2/c;->n(Landroid/webkit/ServiceWorkerWebSettings;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lb2/n;->i()Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    move-result-object v0

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;->setCacheMode(I)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method

.method public final i()Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;
    .locals 3

    iget-object v0, p0, Lb2/n;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    if-nez v0, :cond_0

    const-class v0, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    invoke-static {}, Lb2/t;->c()Lb2/a0;

    move-result-object v1

    iget-object v2, p0, Lb2/n;->a:Landroid/webkit/ServiceWorkerWebSettings;

    invoke-virtual {v1, v2}, Lb2/a0;->b(Landroid/webkit/ServiceWorkerWebSettings;)Ljava/lang/reflect/InvocationHandler;

    move-result-object v1

    invoke-static {v0, v1}, Lcf/a;->a(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    iput-object v0, p0, Lb2/n;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    :cond_0
    iget-object v0, p0, Lb2/n;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    return-object v0
.end method

.method public final j()Landroid/webkit/ServiceWorkerWebSettings;
    .locals 2

    iget-object v0, p0, Lb2/n;->a:Landroid/webkit/ServiceWorkerWebSettings;

    if-nez v0, :cond_0

    invoke-static {}, Lb2/t;->c()Lb2/a0;

    move-result-object v0

    iget-object v1, p0, Lb2/n;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerWebSettingsBoundaryInterface;

    invoke-static {v1}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb2/a0;->a(Ljava/lang/reflect/InvocationHandler;)Landroid/webkit/ServiceWorkerWebSettings;

    move-result-object v0

    iput-object v0, p0, Lb2/n;->a:Landroid/webkit/ServiceWorkerWebSettings;

    :cond_0
    iget-object v0, p0, Lb2/n;->a:Landroid/webkit/ServiceWorkerWebSettings;

    return-object v0
.end method
