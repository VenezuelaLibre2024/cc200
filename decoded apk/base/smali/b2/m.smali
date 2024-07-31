.class public Lb2/m;
.super La2/c;
.source ""


# instance fields
.field public a:Landroid/webkit/ServiceWorkerController;

.field public b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

.field public final c:La2/d;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, La2/c;-><init>()V

    sget-object v0, Lb2/s;->k:Lb2/a$c;

    invoke-virtual {v0}, Lb2/a$c;->c()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, Lb2/c;->g()Landroid/webkit/ServiceWorkerController;

    move-result-object v0

    iput-object v0, p0, Lb2/m;->a:Landroid/webkit/ServiceWorkerController;

    iput-object v2, p0, Lb2/m;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    invoke-virtual {p0}, Lb2/m;->e()Landroid/webkit/ServiceWorkerController;

    move-result-object v0

    invoke-static {v0}, Lb2/c;->i(Landroid/webkit/ServiceWorkerController;)Lb2/n;

    move-result-object v0

    iput-object v0, p0, Lb2/m;->c:La2/d;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object v2, p0, Lb2/m;->a:Landroid/webkit/ServiceWorkerController;

    invoke-static {}, Lb2/t;->d()Lb2/v;

    move-result-object v0

    invoke-interface {v0}, Lb2/v;->getServiceWorkerController()Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    move-result-object v0

    iput-object v0, p0, Lb2/m;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    new-instance v1, Lb2/n;

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;->getServiceWorkerWebSettings()Ljava/lang/reflect/InvocationHandler;

    move-result-object v0

    invoke-direct {v1, v0}, Lb2/n;-><init>(Ljava/lang/reflect/InvocationHandler;)V

    iput-object v1, p0, Lb2/m;->c:La2/d;

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public b()La2/d;
    .locals 1

    iget-object v0, p0, Lb2/m;->c:La2/d;

    return-object v0
.end method

.method public c(La2/b;)V
    .locals 3

    sget-object v0, Lb2/s;->k:Lb2/a$c;

    invoke-virtual {v0}, Lb2/a$c;->c()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lb2/m;->e()Landroid/webkit/ServiceWorkerController;

    move-result-object p1

    invoke-static {p1, v2}, Lb2/c;->p(Landroid/webkit/ServiceWorkerController;Landroid/webkit/ServiceWorkerClient;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lb2/m;->e()Landroid/webkit/ServiceWorkerController;

    move-result-object v0

    invoke-static {v0, p1}, Lb2/c;->q(Landroid/webkit/ServiceWorkerController;La2/b;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lb2/m;->d()Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    move-result-object p1

    invoke-interface {p1, v2}, Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;->setServiceWorkerClient(Ljava/lang/reflect/InvocationHandler;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lb2/m;->d()Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    move-result-object v0

    new-instance v1, Lb2/l;

    invoke-direct {v1, p1}, Lb2/l;-><init>(La2/b;)V

    invoke-static {v1}, Lcf/a;->c(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;->setServiceWorkerClient(Ljava/lang/reflect/InvocationHandler;)V

    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method

.method public final d()Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;
    .locals 1

    iget-object v0, p0, Lb2/m;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    if-nez v0, :cond_0

    invoke-static {}, Lb2/t;->d()Lb2/v;

    move-result-object v0

    invoke-interface {v0}, Lb2/v;->getServiceWorkerController()Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    move-result-object v0

    iput-object v0, p0, Lb2/m;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    :cond_0
    iget-object v0, p0, Lb2/m;->b:Lorg/chromium/support_lib_boundary/ServiceWorkerControllerBoundaryInterface;

    return-object v0
.end method

.method public final e()Landroid/webkit/ServiceWorkerController;
    .locals 1

    iget-object v0, p0, Lb2/m;->a:Landroid/webkit/ServiceWorkerController;

    if-nez v0, :cond_0

    invoke-static {}, Lb2/c;->g()Landroid/webkit/ServiceWorkerController;

    move-result-object v0

    iput-object v0, p0, Lb2/m;->a:Landroid/webkit/ServiceWorkerController;

    :cond_0
    iget-object v0, p0, Lb2/m;->a:Landroid/webkit/ServiceWorkerController;

    return-object v0
.end method
