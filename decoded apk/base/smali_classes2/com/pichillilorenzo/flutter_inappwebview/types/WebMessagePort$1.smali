.class Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessagePort$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessagePort;->setWebMessageCallback(Landroid/webkit/ValueCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/webkit/ValueCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessagePort;

.field public final synthetic val$callback:Landroid/webkit/ValueCallback;


# direct methods
.method public constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessagePort;Landroid/webkit/ValueCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessagePort$1;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessagePort;

    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessagePort$1;->val$callback:Landroid/webkit/ValueCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessagePort$1;->onReceiveValue(Ljava/lang/String;)V

    return-void
.end method

.method public onReceiveValue(Ljava/lang/String;)V
    .locals 1

    iget-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/types/WebMessagePort$1;->val$callback:Landroid/webkit/ValueCallback;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
