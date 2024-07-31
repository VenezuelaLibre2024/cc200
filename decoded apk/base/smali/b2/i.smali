.class public Lb2/i;
.super Landroid/webkit/ServiceWorkerClient;
.source ""


# instance fields
.field public final a:La2/b;


# direct methods
.method public constructor <init>(La2/b;)V
    .locals 0

    invoke-direct {p0}, Landroid/webkit/ServiceWorkerClient;-><init>()V

    iput-object p1, p0, Lb2/i;->a:La2/b;

    return-void
.end method


# virtual methods
.method public shouldInterceptRequest(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 1

    iget-object v0, p0, Lb2/i;->a:La2/b;

    invoke-virtual {v0, p1}, La2/b;->shouldInterceptRequest(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method
