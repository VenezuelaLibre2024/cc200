.class Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewChromeClient$6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewChromeClient;->createConfirmDialog(Landroid/webkit/WebView;Ljava/lang/String;Landroid/webkit/JsResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewChromeClient;

.field public final synthetic val$result:Landroid/webkit/JsResult;


# direct methods
.method public constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewChromeClient;Landroid/webkit/JsResult;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewChromeClient$6;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewChromeClient;

    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewChromeClient$6;->val$result:Landroid/webkit/JsResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/in_app_webview/InAppWebViewChromeClient$6;->val$result:Landroid/webkit/JsResult;

    invoke-virtual {p2}, Landroid/webkit/JsResult;->cancel()V

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method