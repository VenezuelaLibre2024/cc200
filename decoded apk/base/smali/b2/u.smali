.class public Lb2/u;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;


# direct methods
.method public constructor <init>(Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/u;->a:Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;[Ljava/lang/String;La2/h$b;)V
    .locals 2

    iget-object v0, p0, Lb2/u;->a:Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    new-instance v1, Lb2/q;

    invoke-direct {v1, p3}, Lb2/q;-><init>(La2/h$b;)V

    invoke-static {v1}, Lcf/a;->c(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p3

    invoke-interface {v0, p1, p2, p3}, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;->addWebMessageListener(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/reflect/InvocationHandler;)V

    return-void
.end method

.method public b()[La2/g;
    .locals 5

    iget-object v0, p0, Lb2/u;->a:Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;->createWebMessageChannel()[Ljava/lang/reflect/InvocationHandler;

    move-result-object v0

    array-length v1, v0

    new-array v1, v1, [La2/g;

    const/4 v2, 0x0

    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_0

    new-instance v3, Lb2/r;

    aget-object v4, v0, v2

    invoke-direct {v3, v4}, Lb2/r;-><init>(Ljava/lang/reflect/InvocationHandler;)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public c(La2/f;Landroid/net/Uri;)V
    .locals 2

    iget-object v0, p0, Lb2/u;->a:Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    new-instance v1, Lb2/o;

    invoke-direct {v1, p1}, Lb2/o;-><init>(La2/f;)V

    invoke-static {v1}, Lcf/a;->c(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;->postMessageToMainFrame(Ljava/lang/reflect/InvocationHandler;Landroid/net/Uri;)V

    return-void
.end method

.method public d(Ljava/util/concurrent/Executor;La2/k;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    if-eqz p2, :cond_0

    new-instance v0, Lb2/x;

    invoke-direct {v0, p1, p2}, Lb2/x;-><init>(Ljava/util/concurrent/Executor;La2/k;)V

    invoke-static {v0}, Lcf/a;->c(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object p2, p0, Lb2/u;->a:Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    invoke-interface {p2, p1}, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;->setWebViewRendererClient(Ljava/lang/reflect/InvocationHandler;)V

    return-void
.end method
