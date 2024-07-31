.class Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La2/h$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;-><init>(Ljava/lang/String;Lcom/pichillilorenzo/flutter_inappwebview/types/InAppWebViewInterface;Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Ljava/util/Set;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;

.field public final synthetic val$self:Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;


# direct methods
.method public constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener$1;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;

    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener$1;->val$self:Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPostMessage(Landroid/webkit/WebView;La2/f;Landroid/net/Uri;ZLa2/a;)V
    .locals 0

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener$1;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;

    iput-object p5, p1, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;->replyProxy:La2/a;

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener$1;->val$self:Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;

    invoke-virtual {p2}, La2/f;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p3, p4}, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageListener;->onPostMessage(Ljava/lang/String;Landroid/net/Uri;Z)V

    return-void
.end method
