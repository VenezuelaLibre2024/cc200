.class public Lb2/y;
.super Landroid/webkit/WebViewRenderProcessClient;
.source ""


# instance fields
.field public a:La2/k;


# direct methods
.method public constructor <init>(La2/k;)V
    .locals 0

    invoke-direct {p0}, Landroid/webkit/WebViewRenderProcessClient;-><init>()V

    iput-object p1, p0, Lb2/y;->a:La2/k;

    return-void
.end method


# virtual methods
.method public onRenderProcessResponsive(Landroid/webkit/WebView;Landroid/webkit/WebViewRenderProcess;)V
    .locals 1

    iget-object v0, p0, Lb2/y;->a:La2/k;

    invoke-static {p2}, Lb2/z;->b(Landroid/webkit/WebViewRenderProcess;)Lb2/z;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, La2/k;->onRenderProcessResponsive(Landroid/webkit/WebView;La2/j;)V

    return-void
.end method

.method public onRenderProcessUnresponsive(Landroid/webkit/WebView;Landroid/webkit/WebViewRenderProcess;)V
    .locals 1

    iget-object v0, p0, Lb2/y;->a:La2/k;

    invoke-static {p2}, Lb2/z;->b(Landroid/webkit/WebViewRenderProcess;)Lb2/z;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, La2/k;->onRenderProcessUnresponsive(Landroid/webkit/WebView;La2/j;)V

    return-void
.end method
