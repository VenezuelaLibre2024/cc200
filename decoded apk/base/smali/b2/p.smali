.class public Lb2/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/chromium/support_lib_boundary/WebMessageCallbackBoundaryInterface;


# instance fields
.field public final a:La2/g$a;


# direct methods
.method public constructor <init>(La2/g$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/p;->a:La2/g$a;

    return-void
.end method


# virtual methods
.method public getSupportedFeatures()[Ljava/lang/String;
    .locals 1

    const-string v0, "WEB_MESSAGE_CALLBACK_ON_MESSAGE"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public onMessage(Ljava/lang/reflect/InvocationHandler;Ljava/lang/reflect/InvocationHandler;)V
    .locals 2

    iget-object v0, p0, Lb2/p;->a:La2/g$a;

    new-instance v1, Lb2/r;

    invoke-direct {v1, p1}, Lb2/r;-><init>(Ljava/lang/reflect/InvocationHandler;)V

    const-class p1, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    invoke-static {p1, p2}, Lcf/a;->a(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;

    invoke-static {p1}, Lb2/o;->b(Lorg/chromium/support_lib_boundary/WebMessageBoundaryInterface;)La2/f;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, La2/g$a;->onMessage(La2/g;La2/f;)V

    return-void
.end method
