.class final Lio/flutter/plugins/videoplayer/VideoPlayer;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final FORMAT_DASH:Ljava/lang/String; = "dash"

.field private static final FORMAT_HLS:Ljava/lang/String; = "hls"

.field private static final FORMAT_OTHER:Ljava/lang/String; = "other"

.field private static final FORMAT_SS:Ljava/lang/String; = "ss"

.field private static final USER_AGENT:Ljava/lang/String; = "User-Agent"


# instance fields
.field private final eventChannel:Lio/flutter/plugin/common/EventChannel;

.field private eventSink:Lio/flutter/plugins/videoplayer/QueuingEventSink;

.field private exoPlayer:Ls3/r;

.field private httpDataSourceFactory:Lo5/s$b;

.field public isInitialized:Z

.field private final options:Lio/flutter/plugins/videoplayer/VideoPlayerOptions;

.field private surface:Landroid/view/Surface;

.field private final textureEntry:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/flutter/plugin/common/EventChannel;Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio/flutter/plugins/videoplayer/VideoPlayerOptions;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lio/flutter/plugin/common/EventChannel;",
            "Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lio/flutter/plugins/videoplayer/VideoPlayerOptions;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->isInitialized:Z

    new-instance v0, Lo5/s$b;

    invoke-direct {v0}, Lo5/s$b;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->httpDataSourceFactory:Lo5/s$b;

    iput-object p2, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->eventChannel:Lio/flutter/plugin/common/EventChannel;

    iput-object p3, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->textureEntry:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    iput-object p7, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->options:Lio/flutter/plugins/videoplayer/VideoPlayerOptions;

    new-instance p2, Ls3/r$b;

    invoke-direct {p2, p1}, Ls3/r$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Ls3/r$b;->e()Ls3/r;

    move-result-object p2

    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p3

    invoke-virtual {p0, p6}, Lio/flutter/plugins/videoplayer/VideoPlayer;->buildHttpDataSourceFactory(Ljava/util/Map;)V

    new-instance p4, Lo5/r$a;

    iget-object p6, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->httpDataSourceFactory:Lo5/s$b;

    invoke-direct {p4, p1, p6}, Lo5/r$a;-><init>(Landroid/content/Context;Lo5/j$a;)V

    invoke-direct {p0, p3, p4, p5}, Lio/flutter/plugins/videoplayer/VideoPlayer;->buildMediaSource(Landroid/net/Uri;Lo5/j$a;Ljava/lang/String;)Lu4/t;

    move-result-object p1

    invoke-interface {p2, p1}, Ls3/r;->l(Lu4/t;)V

    invoke-interface {p2}, Ls3/b3;->a()V

    new-instance p1, Lio/flutter/plugins/videoplayer/QueuingEventSink;

    invoke-direct {p1}, Lio/flutter/plugins/videoplayer/QueuingEventSink;-><init>()V

    invoke-direct {p0, p2, p1}, Lio/flutter/plugins/videoplayer/VideoPlayer;->setUpVideoPlayer(Ls3/r;Lio/flutter/plugins/videoplayer/QueuingEventSink;)V

    return-void
.end method

.method public constructor <init>(Ls3/r;Lio/flutter/plugin/common/EventChannel;Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;Lio/flutter/plugins/videoplayer/VideoPlayerOptions;Lio/flutter/plugins/videoplayer/QueuingEventSink;Lo5/s$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->isInitialized:Z

    new-instance v0, Lo5/s$b;

    invoke-direct {v0}, Lo5/s$b;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->httpDataSourceFactory:Lo5/s$b;

    iput-object p2, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->eventChannel:Lio/flutter/plugin/common/EventChannel;

    iput-object p3, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->textureEntry:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    iput-object p4, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->options:Lio/flutter/plugins/videoplayer/VideoPlayerOptions;

    iput-object p6, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->httpDataSourceFactory:Lo5/s$b;

    invoke-direct {p0, p1, p5}, Lio/flutter/plugins/videoplayer/VideoPlayer;->setUpVideoPlayer(Ls3/r;Lio/flutter/plugins/videoplayer/QueuingEventSink;)V

    return-void
.end method

.method private buildMediaSource(Landroid/net/Uri;Lo5/j$a;Ljava/lang/String;)Lu4/t;
    .locals 6

    const/4 v0, 0x4

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-nez p3, :cond_0

    invoke-static {p1}, Lp5/n0;->m0(Landroid/net/Uri;)I

    move-result v1

    goto :goto_2

    :cond_0
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    :goto_0
    move p3, v2

    goto :goto_1

    :sswitch_0
    const-string v5, "other"

    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 p3, 0x3

    goto :goto_1

    :sswitch_1
    const-string v5, "dash"

    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    goto :goto_0

    :cond_2
    move p3, v3

    goto :goto_1

    :sswitch_2
    const-string v5, "hls"

    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_3

    goto :goto_0

    :cond_3
    move p3, v4

    goto :goto_1

    :sswitch_3
    const-string v5, "ss"

    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_4

    goto :goto_0

    :cond_4
    move p3, v1

    :goto_1
    packed-switch p3, :pswitch_data_0

    move v1, v2

    goto :goto_2

    :pswitch_0
    move v1, v0

    goto :goto_2

    :pswitch_1
    move v1, v3

    goto :goto_2

    :pswitch_2
    move v1, v4

    :goto_2
    :pswitch_3
    if-eqz v1, :cond_8

    if-eq v1, v4, :cond_7

    if-eq v1, v3, :cond_6

    if-ne v1, v0, :cond_5

    new-instance p3, Lu4/h0$b;

    invoke-direct {p3, p2}, Lu4/h0$b;-><init>(Lo5/j$a;)V

    invoke-static {p1}, Ls3/u1;->d(Landroid/net/Uri;)Ls3/u1;

    move-result-object p1

    invoke-virtual {p3, p1}, Lu4/h0$b;->b(Ls3/u1;)Lu4/h0;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unsupported type: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p3, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    invoke-direct {p3, p2}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;-><init>(Lo5/j$a;)V

    invoke-static {p1}, Ls3/u1;->d(Landroid/net/Uri;)Ls3/u1;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->a(Ls3/u1;)Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p3, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;

    new-instance v0, Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;

    invoke-direct {v0, p2}, Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;-><init>(Lo5/j$a;)V

    invoke-direct {p3, v0, p2}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Lo5/j$a;)V

    invoke-static {p1}, Ls3/u1;->d(Landroid/net/Uri;)Ls3/u1;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->a(Ls3/u1;)Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p3, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;

    new-instance v0, Lcom/google/android/exoplayer2/source/dash/c$a;

    invoke-direct {v0, p2}, Lcom/google/android/exoplayer2/source/dash/c$a;-><init>(Lo5/j$a;)V

    invoke-direct {p3, v0, p2}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/source/dash/a$a;Lo5/j$a;)V

    invoke-static {p1}, Ls3/u1;->d(Landroid/net/Uri;)Ls3/u1;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->a(Ls3/u1;)Lcom/google/android/exoplayer2/source/dash/DashMediaSource;

    move-result-object p1

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe60 -> :sswitch_3
        0x193ef -> :sswitch_2
        0x2eef92 -> :sswitch_1
        0x6527f10 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method private static setAudioAttributes(Ls3/r;Z)V
    .locals 2

    new-instance v0, Lu3/e$e;

    invoke-direct {v0}, Lu3/e$e;-><init>()V

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lu3/e$e;->c(I)Lu3/e$e;

    move-result-object v0

    invoke-virtual {v0}, Lu3/e$e;->a()Lu3/e;

    move-result-object v0

    xor-int/lit8 p1, p1, 0x1

    invoke-interface {p0, v0, p1}, Ls3/r;->h(Lu3/e;Z)V

    return-void
.end method

.method private setUpVideoPlayer(Ls3/r;Lio/flutter/plugins/videoplayer/QueuingEventSink;)V
    .locals 2

    iput-object p1, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->exoPlayer:Ls3/r;

    iput-object p2, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->eventSink:Lio/flutter/plugins/videoplayer/QueuingEventSink;

    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->eventChannel:Lio/flutter/plugin/common/EventChannel;

    new-instance v1, Lio/flutter/plugins/videoplayer/VideoPlayer$1;

    invoke-direct {v1, p0, p2}, Lio/flutter/plugins/videoplayer/VideoPlayer$1;-><init>(Lio/flutter/plugins/videoplayer/VideoPlayer;Lio/flutter/plugins/videoplayer/QueuingEventSink;)V

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    new-instance v0, Landroid/view/Surface;

    iget-object v1, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->textureEntry:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    invoke-interface {v1}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->surface:Landroid/view/Surface;

    invoke-interface {p1, v0}, Ls3/b3;->f(Landroid/view/Surface;)V

    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->options:Lio/flutter/plugins/videoplayer/VideoPlayerOptions;

    iget-boolean v0, v0, Lio/flutter/plugins/videoplayer/VideoPlayerOptions;->mixWithOthers:Z

    invoke-static {p1, v0}, Lio/flutter/plugins/videoplayer/VideoPlayer;->setAudioAttributes(Ls3/r;Z)V

    new-instance v0, Lio/flutter/plugins/videoplayer/VideoPlayer$2;

    invoke-direct {v0, p0, p2, p1}, Lio/flutter/plugins/videoplayer/VideoPlayer$2;-><init>(Lio/flutter/plugins/videoplayer/VideoPlayer;Lio/flutter/plugins/videoplayer/QueuingEventSink;Ls3/r;)V

    invoke-interface {p1, v0}, Ls3/b3;->o(Ls3/b3$d;)V

    return-void
.end method


# virtual methods
.method public buildHttpDataSourceFactory(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    const-string v2, "User-Agent"

    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v2, "ExoPlayer"

    :goto_0
    iget-object v3, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->httpDataSourceFactory:Lo5/s$b;

    invoke-virtual {v3, v2}, Lo5/s$b;->e(Ljava/lang/String;)Lo5/s$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lo5/s$b;->c(Z)Lo5/s$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->httpDataSourceFactory:Lo5/s$b;

    invoke-virtual {v0, p1}, Lo5/s$b;->d(Ljava/util/Map;)Lo5/s$b;

    :cond_1
    return-void
.end method

.method public dispose()V
    .locals 2

    iget-boolean v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->isInitialized:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->exoPlayer:Ls3/r;

    invoke-interface {v0}, Ls3/b3;->stop()V

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->textureEntry:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    invoke-interface {v0}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->release()V

    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->eventChannel:Lio/flutter/plugin/common/EventChannel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->surface:Landroid/view/Surface;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    :cond_1
    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->exoPlayer:Ls3/r;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ls3/b3;->release()V

    :cond_2
    return-void
.end method

.method public getPosition()J
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->exoPlayer:Ls3/r;

    invoke-interface {v0}, Ls3/b3;->H()J

    move-result-wide v0

    return-wide v0
.end method

.method public pause()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->exoPlayer:Ls3/r;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ls3/b3;->r(Z)V

    return-void
.end method

.method public play()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->exoPlayer:Ls3/r;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ls3/b3;->r(Z)V

    return-void
.end method

.method public seekTo(I)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->exoPlayer:Ls3/r;

    int-to-long v1, p1

    invoke-interface {v0, v1, v2}, Ls3/b3;->b(J)V

    return-void
.end method

.method public sendBufferingUpdate()V
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "event"

    const-string v2, "bufferingUpdate"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Number;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    iget-object v2, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->exoPlayer:Ls3/r;

    invoke-interface {v2}, Ls3/b3;->t()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "values"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->eventSink:Lio/flutter/plugins/videoplayer/QueuingEventSink;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/videoplayer/QueuingEventSink;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public sendInitialized()V
    .locals 5

    iget-boolean v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->isInitialized:Z

    if-eqz v0, :cond_3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "event"

    const-string v2, "initialized"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->exoPlayer:Ls3/r;

    invoke-interface {v1}, Ls3/b3;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "duration"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->exoPlayer:Ls3/r;

    invoke-interface {v1}, Ls3/r;->w()Ls3/m1;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->exoPlayer:Ls3/r;

    invoke-interface {v1}, Ls3/r;->w()Ls3/m1;

    move-result-object v1

    iget v2, v1, Ls3/m1;->x:I

    iget v3, v1, Ls3/m1;->y:I

    iget v1, v1, Ls3/m1;->A:I

    const/16 v4, 0x5a

    if-eq v1, v4, :cond_0

    const/16 v4, 0x10e

    if-ne v1, v4, :cond_1

    :cond_0
    iget-object v2, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->exoPlayer:Ls3/r;

    invoke-interface {v2}, Ls3/r;->w()Ls3/m1;

    move-result-object v2

    iget v2, v2, Ls3/m1;->y:I

    iget-object v3, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->exoPlayer:Ls3/r;

    invoke-interface {v3}, Ls3/r;->w()Ls3/m1;

    move-result-object v3

    iget v3, v3, Ls3/m1;->x:I

    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v4, "width"

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "height"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0xb4

    if-ne v1, v2, :cond_2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "rotationCorrection"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v1, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->eventSink:Lio/flutter/plugins/videoplayer/QueuingEventSink;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/videoplayer/QueuingEventSink;->success(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public setLooping(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->exoPlayer:Ls3/r;

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {v0, p1}, Ls3/b3;->B(I)V

    return-void
.end method

.method public setPlaybackSpeed(D)V
    .locals 1

    new-instance v0, Ls3/a3;

    double-to-float p1, p1

    invoke-direct {v0, p1}, Ls3/a3;-><init>(F)V

    iget-object p1, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->exoPlayer:Ls3/r;

    invoke-interface {p1, v0}, Ls3/b3;->d(Ls3/a3;)V

    return-void
.end method

.method public setVolume(D)V
    .locals 2

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(DD)D

    move-result-wide p1

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(DD)D

    move-result-wide p1

    double-to-float p1, p1

    iget-object p2, p0, Lio/flutter/plugins/videoplayer/VideoPlayer;->exoPlayer:Ls3/r;

    invoke-interface {p2, p1}, Ls3/b3;->e(F)V

    return-void
.end method
