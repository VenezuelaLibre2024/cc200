.class Lio/flutter/plugins/videoplayer/VideoPlayer$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/videoplayer/VideoPlayer;->setUpVideoPlayer(Ls3/r;Lio/flutter/plugins/videoplayer/QueuingEventSink;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/flutter/plugins/videoplayer/VideoPlayer;

.field public final synthetic val$eventSink:Lio/flutter/plugins/videoplayer/QueuingEventSink;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/videoplayer/VideoPlayer;Lio/flutter/plugins/videoplayer/QueuingEventSink;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$1;->this$0:Lio/flutter/plugins/videoplayer/VideoPlayer;

    iput-object p2, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$1;->val$eventSink:Lio/flutter/plugins/videoplayer/QueuingEventSink;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Ljava/lang/Object;)V
    .locals 1

    iget-object p1, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$1;->val$eventSink:Lio/flutter/plugins/videoplayer/QueuingEventSink;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lio/flutter/plugins/videoplayer/QueuingEventSink;->setDelegate(Lio/flutter/plugin/common/EventChannel$EventSink;)V

    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 0

    iget-object p1, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$1;->val$eventSink:Lio/flutter/plugins/videoplayer/QueuingEventSink;

    invoke-virtual {p1, p2}, Lio/flutter/plugins/videoplayer/QueuingEventSink;->setDelegate(Lio/flutter/plugin/common/EventChannel$EventSink;)V

    return-void
.end method
