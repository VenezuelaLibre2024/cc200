.class public Lb2/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/chromium/support_lib_boundary/WebViewRendererClientBoundaryInterface;


# static fields
.field public static final c:[Ljava/lang/String;


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:La2/k;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lb2/x;->c:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;La2/k;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/x;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lb2/x;->b:La2/k;

    return-void
.end method


# virtual methods
.method public final getSupportedFeatures()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lb2/x;->c:[Ljava/lang/String;

    return-object v0
.end method

.method public final onRendererResponsive(Landroid/webkit/WebView;Ljava/lang/reflect/InvocationHandler;)V
    .locals 3

    invoke-static {p2}, Lb2/z;->c(Ljava/lang/reflect/InvocationHandler;)Lb2/z;

    move-result-object p2

    iget-object v0, p0, Lb2/x;->b:La2/k;

    iget-object v1, p0, Lb2/x;->a:Ljava/util/concurrent/Executor;

    if-nez v1, :cond_0

    invoke-virtual {v0, p1, p2}, La2/k;->onRenderProcessResponsive(Landroid/webkit/WebView;La2/j;)V

    goto :goto_0

    :cond_0
    new-instance v2, Lb2/x$b;

    invoke-direct {v2, p0, v0, p1, p2}, Lb2/x$b;-><init>(Lb2/x;La2/k;Landroid/webkit/WebView;La2/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final onRendererUnresponsive(Landroid/webkit/WebView;Ljava/lang/reflect/InvocationHandler;)V
    .locals 3

    invoke-static {p2}, Lb2/z;->c(Ljava/lang/reflect/InvocationHandler;)Lb2/z;

    move-result-object p2

    iget-object v0, p0, Lb2/x;->b:La2/k;

    iget-object v1, p0, Lb2/x;->a:Ljava/util/concurrent/Executor;

    if-nez v1, :cond_0

    invoke-virtual {v0, p1, p2}, La2/k;->onRenderProcessUnresponsive(Landroid/webkit/WebView;La2/j;)V

    goto :goto_0

    :cond_0
    new-instance v2, Lb2/x$a;

    invoke-direct {v2, p0, v0, p1, p2}, Lb2/x$a;-><init>(Lb2/x;La2/k;Landroid/webkit/WebView;La2/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method
