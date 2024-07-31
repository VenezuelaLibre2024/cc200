.class public Lb2/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/chromium/support_lib_boundary/WebMessageListenerBoundaryInterface;


# instance fields
.field public a:La2/h$b;


# direct methods
.method public constructor <init>(La2/h$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/q;->a:La2/h$b;

    return-void
.end method


# virtual methods
.method public getSupportedFeatures()[Ljava/lang/String;
    .locals 1

    const-string v0, "WEB_MESSAGE_LISTENER"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public onPostMessage(Landroid/webkit/WebView;Ljava/lang/reflect/InvocationHandler;Landroid/net/Uri;ZLjava/lang/reflect/InvocationHandler;)V
    .locals 6

    const-class v0, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    invoke-static {v0, p2}, Lcf/a;->a(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    invoke-static {p2}, Lb2/o;->b(Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;)La2/f;

    move-result-object v2

    invoke-static {p5}, Lb2/k;->b(Ljava/lang/reflect/InvocationHandler;)Lb2/k;

    move-result-object v5

    iget-object v0, p0, Lb2/q;->a:La2/h$b;

    move-object v1, p1

    move-object v3, p3

    move v4, p4

    invoke-interface/range {v0 .. v5}, La2/h$b;->onPostMessage(Landroid/webkit/WebView;La2/f;Landroid/net/Uri;ZLa2/a;)V

    return-void
.end method
