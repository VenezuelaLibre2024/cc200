.class final Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FlutterState"
.end annotation


# instance fields
.field public final applicationContext:Landroid/content/Context;

.field public final binaryMessenger:Lio/flutter/plugin/common/BinaryMessenger;

.field public final keyForAsset:Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$KeyForAssetFn;

.field public final keyForAssetAndPackageName:Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$KeyForAssetAndPackageName;

.field public final textureRegistry:Lio/flutter/view/TextureRegistry;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$KeyForAssetFn;Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$KeyForAssetAndPackageName;Lio/flutter/view/TextureRegistry;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;->applicationContext:Landroid/content/Context;

    iput-object p2, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;->binaryMessenger:Lio/flutter/plugin/common/BinaryMessenger;

    iput-object p3, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;->keyForAsset:Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$KeyForAssetFn;

    iput-object p4, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;->keyForAssetAndPackageName:Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$KeyForAssetAndPackageName;

    iput-object p5, p0, Lio/flutter/plugins/videoplayer/VideoPlayerPlugin$FlutterState;->textureRegistry:Lio/flutter/view/TextureRegistry;

    return-void
.end method


# virtual methods
.method public startListening(Lio/flutter/plugins/videoplayer/VideoPlayerPlugin;Lio/flutter/plugin/common/BinaryMessenger;)V
    .locals 0

    invoke-static {p2, p1}, Lio/flutter/plugins/videoplayer/Messages$AndroidVideoPlayerApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/videoplayer/Messages$AndroidVideoPlayerApi;)V

    return-void
.end method

.method public stopListening(Lio/flutter/plugin/common/BinaryMessenger;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lio/flutter/plugins/videoplayer/Messages$AndroidVideoPlayerApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/videoplayer/Messages$AndroidVideoPlayerApi;)V

    return-void
.end method
