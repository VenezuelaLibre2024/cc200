.class Lio/flutter/plugins/videoplayer/VideoPlayer$2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/b3$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/videoplayer/VideoPlayer;->setUpVideoPlayer(Ls3/r;Lio/flutter/plugins/videoplayer/QueuingEventSink;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private isBuffering:Z

.field public final synthetic this$0:Lio/flutter/plugins/videoplayer/VideoPlayer;

.field public final synthetic val$eventSink:Lio/flutter/plugins/videoplayer/QueuingEventSink;

.field public final synthetic val$exoPlayer:Ls3/r;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/videoplayer/VideoPlayer;Lio/flutter/plugins/videoplayer/QueuingEventSink;Ls3/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->this$0:Lio/flutter/plugins/videoplayer/VideoPlayer;

    iput-object p2, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->val$eventSink:Lio/flutter/plugins/videoplayer/QueuingEventSink;

    iput-object p3, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->val$exoPlayer:Ls3/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->isBuffering:Z

    return-void
.end method


# virtual methods
.method public bridge synthetic onAudioAttributesChanged(Lu3/e;)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onAudioAttributesChanged(Lu3/e;)V

    return-void
.end method

.method public bridge synthetic onAudioSessionIdChanged(I)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onAudioSessionIdChanged(I)V

    return-void
.end method

.method public bridge synthetic onAvailableCommandsChanged(Ls3/b3$b;)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onAvailableCommandsChanged(Ls3/b3$b;)V

    return-void
.end method

.method public bridge synthetic onCues(Ld5/e;)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onCues(Ld5/e;)V

    return-void
.end method

.method public bridge synthetic onCues(Ljava/util/List;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1}, Ls3/b3$d;->onCues(Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic onDeviceInfoChanged(Ls3/o;)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onDeviceInfoChanged(Ls3/o;)V

    return-void
.end method

.method public bridge synthetic onDeviceVolumeChanged(IZ)V
    .locals 0

    invoke-super {p0, p1, p2}, Ls3/b3$d;->onDeviceVolumeChanged(IZ)V

    return-void
.end method

.method public bridge synthetic onEvents(Ls3/b3;Ls3/b3$c;)V
    .locals 0

    invoke-super {p0, p1, p2}, Ls3/b3$d;->onEvents(Ls3/b3;Ls3/b3$c;)V

    return-void
.end method

.method public bridge synthetic onIsLoadingChanged(Z)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onIsLoadingChanged(Z)V

    return-void
.end method

.method public onIsPlayingChanged(Z)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->val$eventSink:Lio/flutter/plugins/videoplayer/QueuingEventSink;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "event"

    const-string v2, "isPlayingStateUpdate"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v1, "isPlaying"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->val$eventSink:Lio/flutter/plugins/videoplayer/QueuingEventSink;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/videoplayer/QueuingEventSink;->success(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onLoadingChanged(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1}, Ls3/b3$d;->onLoadingChanged(Z)V

    return-void
.end method

.method public bridge synthetic onMaxSeekToPreviousPositionChanged(J)V
    .locals 0

    invoke-super {p0, p1, p2}, Ls3/b3$d;->onMaxSeekToPreviousPositionChanged(J)V

    return-void
.end method

.method public bridge synthetic onMediaItemTransition(Ls3/u1;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Ls3/b3$d;->onMediaItemTransition(Ls3/u1;I)V

    return-void
.end method

.method public bridge synthetic onMediaMetadataChanged(Ls3/z1;)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onMediaMetadataChanged(Ls3/z1;)V

    return-void
.end method

.method public bridge synthetic onMetadata(Lk4/a;)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onMetadata(Lk4/a;)V

    return-void
.end method

.method public bridge synthetic onPlayWhenReadyChanged(ZI)V
    .locals 0

    invoke-super {p0, p1, p2}, Ls3/b3$d;->onPlayWhenReadyChanged(ZI)V

    return-void
.end method

.method public bridge synthetic onPlaybackParametersChanged(Ls3/a3;)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onPlaybackParametersChanged(Ls3/a3;)V

    return-void
.end method

.method public onPlaybackStateChanged(I)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    invoke-virtual {p0, v0}, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->setBuffering(Z)V

    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->this$0:Lio/flutter/plugins/videoplayer/VideoPlayer;

    invoke-virtual {v0}, Lio/flutter/plugins/videoplayer/VideoPlayer;->sendBufferingUpdate()V

    goto :goto_0

    :cond_0
    const/4 v2, 0x3

    if-ne p1, v2, :cond_1

    iget-object v2, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->this$0:Lio/flutter/plugins/videoplayer/VideoPlayer;

    iget-boolean v3, v2, Lio/flutter/plugins/videoplayer/VideoPlayer;->isInitialized:Z

    if-nez v3, :cond_2

    iput-boolean v0, v2, Lio/flutter/plugins/videoplayer/VideoPlayer;->isInitialized:Z

    invoke-virtual {v2}, Lio/flutter/plugins/videoplayer/VideoPlayer;->sendInitialized()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v2, "event"

    const-string v3, "completed"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->val$eventSink:Lio/flutter/plugins/videoplayer/QueuingEventSink;

    invoke-virtual {v2, v0}, Lio/flutter/plugins/videoplayer/QueuingEventSink;->success(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    if-eq p1, v1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->setBuffering(Z)V

    :cond_3
    return-void
.end method

.method public bridge synthetic onPlaybackSuppressionReasonChanged(I)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onPlaybackSuppressionReasonChanged(I)V

    return-void
.end method

.method public onPlayerError(Ls3/x2;)V
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->setBuffering(Z)V

    iget v0, p1, Ls3/x2;->h:I

    const/16 v1, 0x3ea

    if-ne v0, v1, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->val$exoPlayer:Ls3/r;

    invoke-interface {p1}, Ls3/b3;->m()V

    iget-object p1, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->val$exoPlayer:Ls3/r;

    invoke-interface {p1}, Ls3/b3;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->val$eventSink:Lio/flutter/plugins/videoplayer/QueuingEventSink;

    if-eqz v0, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Video player had error "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    const-string v2, "VideoError"

    invoke-virtual {v0, v2, p1, v1}, Lio/flutter/plugins/videoplayer/QueuingEventSink;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic onPlayerErrorChanged(Ls3/x2;)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onPlayerErrorChanged(Ls3/x2;)V

    return-void
.end method

.method public bridge synthetic onPlayerStateChanged(ZI)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1, p2}, Ls3/b3$d;->onPlayerStateChanged(ZI)V

    return-void
.end method

.method public bridge synthetic onPlaylistMetadataChanged(Ls3/z1;)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onPlaylistMetadataChanged(Ls3/z1;)V

    return-void
.end method

.method public bridge synthetic onPositionDiscontinuity(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1}, Ls3/b3$d;->onPositionDiscontinuity(I)V

    return-void
.end method

.method public bridge synthetic onPositionDiscontinuity(Ls3/b3$e;Ls3/b3$e;I)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Ls3/b3$d;->onPositionDiscontinuity(Ls3/b3$e;Ls3/b3$e;I)V

    return-void
.end method

.method public bridge synthetic onRenderedFirstFrame()V
    .locals 0

    invoke-super {p0}, Ls3/b3$d;->onRenderedFirstFrame()V

    return-void
.end method

.method public bridge synthetic onRepeatModeChanged(I)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onRepeatModeChanged(I)V

    return-void
.end method

.method public bridge synthetic onSeekBackIncrementChanged(J)V
    .locals 0

    invoke-super {p0, p1, p2}, Ls3/b3$d;->onSeekBackIncrementChanged(J)V

    return-void
.end method

.method public bridge synthetic onSeekForwardIncrementChanged(J)V
    .locals 0

    invoke-super {p0, p1, p2}, Ls3/b3$d;->onSeekForwardIncrementChanged(J)V

    return-void
.end method

.method public bridge synthetic onSeekProcessed()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0}, Ls3/b3$d;->onSeekProcessed()V

    return-void
.end method

.method public bridge synthetic onShuffleModeEnabledChanged(Z)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onShuffleModeEnabledChanged(Z)V

    return-void
.end method

.method public bridge synthetic onSkipSilenceEnabledChanged(Z)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onSkipSilenceEnabledChanged(Z)V

    return-void
.end method

.method public bridge synthetic onSurfaceSizeChanged(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Ls3/b3$d;->onSurfaceSizeChanged(II)V

    return-void
.end method

.method public bridge synthetic onTimelineChanged(Ls3/u3;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Ls3/b3$d;->onTimelineChanged(Ls3/u3;I)V

    return-void
.end method

.method public bridge synthetic onTrackSelectionParametersChanged(Ln5/z;)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onTrackSelectionParametersChanged(Ln5/z;)V

    return-void
.end method

.method public bridge synthetic onTracksChanged(Ls3/z3;)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onTracksChanged(Ls3/z3;)V

    return-void
.end method

.method public bridge synthetic onVideoSizeChanged(Lq5/y;)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onVideoSizeChanged(Lq5/y;)V

    return-void
.end method

.method public bridge synthetic onVolumeChanged(F)V
    .locals 0

    invoke-super {p0, p1}, Ls3/b3$d;->onVolumeChanged(F)V

    return-void
.end method

.method public setBuffering(Z)V
    .locals 2

    iget-boolean v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->isBuffering:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->isBuffering:Z

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iget-boolean v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->isBuffering:Z

    if-eqz v0, :cond_0

    const-string v0, "bufferingStart"

    goto :goto_0

    :cond_0
    const-string v0, "bufferingEnd"

    :goto_0
    const-string v1, "event"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer$2;->val$eventSink:Lio/flutter/plugins/videoplayer/QueuingEventSink;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/videoplayer/QueuingEventSink;->success(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
