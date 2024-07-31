.class Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel$2;
.super La2/g$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->setWebMessageCallbackForInAppWebView(Ljava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;

.field public final synthetic val$index:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel$2;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;

    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel$2;->val$index:Ljava/lang/Integer;

    invoke-direct {p0}, La2/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public onMessage(La2/g;La2/f;)V
    .locals 2

    invoke-super {p0, p1, p2}, La2/g$a;->onMessage(La2/g;La2/f;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel$2;->val$index:Ljava/lang/Integer;

    const-string v1, "index"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, La2/f;->a()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const-string v0, "message"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel$2;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;

    iget-object p2, p2, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessageChannel;->channel:Lio/flutter/plugin/common/MethodChannel;

    const-string v0, "onMessage"

    invoke-virtual {p2, v0, p1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
