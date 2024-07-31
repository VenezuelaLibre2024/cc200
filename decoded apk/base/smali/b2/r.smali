.class public Lb2/r;
.super La2/g;
.source ""


# instance fields
.field public a:Landroid/webkit/WebMessagePort;

.field public b:Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;


# direct methods
.method public constructor <init>(Landroid/webkit/WebMessagePort;)V
    .locals 0

    invoke-direct {p0}, La2/g;-><init>()V

    iput-object p1, p0, Lb2/r;->a:Landroid/webkit/WebMessagePort;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/InvocationHandler;)V
    .locals 1

    invoke-direct {p0}, La2/g;-><init>()V

    const-class v0, Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    invoke-static {v0, p1}, Lcf/a;->a(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    iput-object p1, p0, Lb2/r;->b:Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    return-void
.end method

.method public static f(La2/f;)Landroid/webkit/WebMessage;
    .locals 0

    invoke-static {p0}, Lb2/b;->b(La2/f;)Landroid/webkit/WebMessage;

    move-result-object p0

    return-object p0
.end method

.method public static g([La2/g;)[Landroid/webkit/WebMessagePort;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    array-length v0, p0

    new-array v1, v0, [Landroid/webkit/WebMessagePort;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    invoke-virtual {v3}, La2/g;->b()Landroid/webkit/WebMessagePort;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public static h(Landroid/webkit/WebMessage;)La2/f;
    .locals 0

    invoke-static {p0}, Lb2/b;->d(Landroid/webkit/WebMessage;)La2/f;

    move-result-object p0

    return-object p0
.end method

.method public static k([Landroid/webkit/WebMessagePort;)[La2/g;
    .locals 4

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    array-length v0, p0

    new-array v0, v0, [La2/g;

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    new-instance v2, Lb2/r;

    aget-object v3, p0, v1

    invoke-direct {v2, v3}, Lb2/r;-><init>(Landroid/webkit/WebMessagePort;)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    sget-object v0, Lb2/s;->B:Lb2/a$b;

    invoke-virtual {v0}, Lb2/a$b;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lb2/r;->j()Landroid/webkit/WebMessagePort;

    move-result-object v0

    invoke-static {v0}, Lb2/b;->a(Landroid/webkit/WebMessagePort;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lb2/r;->i()Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    move-result-object v0

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;->close()V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object v0

    throw v0
.end method

.method public b()Landroid/webkit/WebMessagePort;
    .locals 1

    invoke-virtual {p0}, Lb2/r;->j()Landroid/webkit/WebMessagePort;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/reflect/InvocationHandler;
    .locals 1

    invoke-virtual {p0}, Lb2/r;->i()Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object v0

    return-object v0
.end method

.method public d(La2/f;)V
    .locals 2

    sget-object v0, Lb2/s;->A:Lb2/a$b;

    invoke-virtual {v0}, Lb2/a$b;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lb2/r;->j()Landroid/webkit/WebMessagePort;

    move-result-object v0

    invoke-static {p1}, Lb2/r;->f(La2/f;)Landroid/webkit/WebMessage;

    move-result-object p1

    invoke-static {v0, p1}, Lb2/b;->h(Landroid/webkit/WebMessagePort;Landroid/webkit/WebMessage;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lb2/r;->i()Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    move-result-object v0

    new-instance v1, Lb2/o;

    invoke-direct {v1, p1}, Lb2/o;-><init>(La2/f;)V

    invoke-static {v1}, Lcf/a;->c(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;->postMessage(Ljava/lang/reflect/InvocationHandler;)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method

.method public e(La2/g$a;)V
    .locals 2

    sget-object v0, Lb2/s;->C:Lb2/a$b;

    invoke-virtual {v0}, Lb2/a$b;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lb2/r;->j()Landroid/webkit/WebMessagePort;

    move-result-object v0

    invoke-static {v0, p1}, Lb2/b;->l(Landroid/webkit/WebMessagePort;La2/g$a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lb2/a;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lb2/r;->i()Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    move-result-object v0

    new-instance v1, Lb2/p;

    invoke-direct {v1, p1}, Lb2/p;-><init>(La2/g$a;)V

    invoke-static {v1}, Lcf/a;->c(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;->setWebMessageCallback(Ljava/lang/reflect/InvocationHandler;)V

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lb2/s;->a()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
.end method

.method public final i()Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;
    .locals 3

    iget-object v0, p0, Lb2/r;->b:Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    if-nez v0, :cond_0

    const-class v0, Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    invoke-static {}, Lb2/t;->c()Lb2/a0;

    move-result-object v1

    iget-object v2, p0, Lb2/r;->a:Landroid/webkit/WebMessagePort;

    invoke-virtual {v1, v2}, Lb2/a0;->d(Landroid/webkit/WebMessagePort;)Ljava/lang/reflect/InvocationHandler;

    move-result-object v1

    invoke-static {v0, v1}, Lcf/a;->a(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    iput-object v0, p0, Lb2/r;->b:Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    :cond_0
    iget-object v0, p0, Lb2/r;->b:Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    return-object v0
.end method

.method public final j()Landroid/webkit/WebMessagePort;
    .locals 2

    iget-object v0, p0, Lb2/r;->a:Landroid/webkit/WebMessagePort;

    if-nez v0, :cond_0

    invoke-static {}, Lb2/t;->c()Lb2/a0;

    move-result-object v0

    iget-object v1, p0, Lb2/r;->b:Lorg/chromium/support_lib_boundary/WebMessagePortBoundaryInterface;

    invoke-static {v1}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb2/a0;->c(Ljava/lang/reflect/InvocationHandler;)Landroid/webkit/WebMessagePort;

    move-result-object v0

    iput-object v0, p0, Lb2/r;->a:Landroid/webkit/WebMessagePort;

    :cond_0
    iget-object v0, p0, Lb2/r;->a:Landroid/webkit/WebMessagePort;

    return-object v0
.end method
