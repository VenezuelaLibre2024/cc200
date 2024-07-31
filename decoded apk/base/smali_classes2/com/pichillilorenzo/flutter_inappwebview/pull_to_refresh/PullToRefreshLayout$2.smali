.class Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout$2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/swiperefreshlayout/widget/c$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->prepare()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;

.field public final synthetic val$self:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;


# direct methods
.method public constructor <init>(Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout$2;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;

    iput-object p2, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout$2;->val$self:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 3

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout$2;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;

    iget-object v0, v0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->channel:Lio/flutter/plugin/common/MethodChannel;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout$2;->val$self:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/c;->setRefreshing(Z)V

    return-void

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout$2;->this$0:Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;

    iget-object v1, v1, Lcom/pichillilorenzo/flutter_inappwebview/pull_to_refresh/PullToRefreshLayout;->channel:Lio/flutter/plugin/common/MethodChannel;

    const-string v2, "onRefresh"

    invoke-virtual {v1, v2, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
