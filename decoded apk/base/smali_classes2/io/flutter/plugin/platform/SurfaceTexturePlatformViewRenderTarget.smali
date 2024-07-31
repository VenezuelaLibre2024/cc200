.class public Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/platform/PlatformViewRenderTarget;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x1a
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "SurfaceTexturePlatformViewRenderTarget"


# instance fields
.field private bufferHeight:I

.field private bufferWidth:I

.field private final frameConsumedListener:Lio/flutter/view/TextureRegistry$OnFrameConsumedListener;

.field private final pendingFramesCount:Ljava/util/concurrent/atomic/AtomicLong;

.field private shouldRecreateSurfaceForLowMemory:Z

.field private surface:Landroid/view/Surface;

.field private surfaceTexture:Landroid/graphics/SurfaceTexture;

.field private final surfaceTextureEntry:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

.field private final trimMemoryListener:Lio/flutter/view/TextureRegistry$OnTrimMemoryListener;


# direct methods
.method public constructor <init>(Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->pendingFramesCount:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v0, 0x0

    iput v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->bufferWidth:I

    iput v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->bufferHeight:I

    new-instance v1, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget$1;

    invoke-direct {v1, p0}, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget$1;-><init>(Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;)V

    iput-object v1, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->frameConsumedListener:Lio/flutter/view/TextureRegistry$OnFrameConsumedListener;

    iput-boolean v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->shouldRecreateSurfaceForLowMemory:Z

    new-instance v0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget$2;

    invoke-direct {v0, p0}, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget$2;-><init>(Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;)V

    iput-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->trimMemoryListener:Lio/flutter/view/TextureRegistry$OnTrimMemoryListener;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_0

    iput-object p1, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surfaceTextureEntry:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    invoke-interface {p1}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v2

    iput-object v2, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surfaceTexture:Landroid/graphics/SurfaceTexture;

    invoke-interface {p1, v1}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->setOnFrameConsumedListener(Lio/flutter/view/TextureRegistry$OnFrameConsumedListener;)V

    invoke-interface {p1, v0}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->setOnTrimMemoryListener(Lio/flutter/view/TextureRegistry$OnTrimMemoryListener;)V

    invoke-direct {p0}, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->init()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Platform views cannot be displayed below API level 23You can prevent this issue by setting `minSdkVersion: 23` in build.gradle."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic access$000(Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;)Ljava/util/concurrent/atomic/AtomicLong;
    .locals 0

    iget-object p0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->pendingFramesCount:Ljava/util/concurrent/atomic/AtomicLong;

    return-object p0
.end method

.method public static synthetic access$102(Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;Z)Z
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->shouldRecreateSurfaceForLowMemory:Z

    return p1
.end method

.method private init()V
    .locals 3

    iget v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->bufferWidth:I

    if-lez v0, :cond_0

    iget v1, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->bufferHeight:I

    if-lez v1, :cond_0

    iget-object v2, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surfaceTexture:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v2, v0, v1}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surface:Landroid/view/Surface;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surface:Landroid/view/Surface;

    :cond_1
    invoke-virtual {p0}, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->createSurface()Landroid/view/Surface;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surface:Landroid/view/Surface;

    invoke-virtual {p0}, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->lockHardwareCanvas()Landroid/graphics/Canvas;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {p0, v0}, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    throw v1
.end method

.method private onFrameProduced()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->pendingFramesCount:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    :cond_0
    return-void
.end method

.method private recreateSurfaceIfNeeded()V
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->shouldRecreateSurfaceForLowMemory:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surface:Landroid/view/Surface;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surface:Landroid/view/Surface;

    :cond_1
    invoke-virtual {p0}, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->createSurface()Landroid/view/Surface;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surface:Landroid/view/Surface;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->shouldRecreateSurfaceForLowMemory:Z

    return-void
.end method


# virtual methods
.method public createSurface()Landroid/view/Surface;
    .locals 2

    new-instance v0, Landroid/view/Surface;

    iget-object v1, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surfaceTexture:Landroid/graphics/SurfaceTexture;

    invoke-direct {v0, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->bufferHeight:I

    return v0
.end method

.method public getId()J
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surfaceTextureEntry:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    invoke-interface {v0}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->id()J

    move-result-wide v0

    return-wide v0
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 1

    invoke-direct {p0}, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->recreateSurfaceIfNeeded()V

    iget-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surface:Landroid/view/Surface;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->bufferWidth:I

    return v0
.end method

.method public isReleased()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surfaceTexture:Landroid/graphics/SurfaceTexture;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public lockHardwareCanvas()Landroid/graphics/Canvas;
    .locals 6

    invoke-direct {p0}, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->recreateSurfaceIfNeeded()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1d

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->pendingFramesCount:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surfaceTexture:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->isReleased()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->onFrameProduced()V

    iget-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surface:Landroid/view/Surface;

    invoke-virtual {v0}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    move-result-object v0

    return-object v0

    :cond_2
    :goto_0
    const-string v0, "SurfaceTexturePlatformViewRenderTarget"

    const-string v2, "Invalid RenderTarget: null or already released SurfaceTexture"

    invoke-static {v0, v2}, Lio/flutter/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public release()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surfaceTexture:Landroid/graphics/SurfaceTexture;

    iget-object v1, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surface:Landroid/view/Surface;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    iput-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surface:Landroid/view/Surface;

    :cond_0
    return-void
.end method

.method public resize(II)V
    .locals 1

    iput p1, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->bufferWidth:I

    iput p2, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->bufferHeight:I

    iget-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surfaceTexture:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    :cond_0
    return-void
.end method

.method public unlockCanvasAndPost(Landroid/graphics/Canvas;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->surface:Landroid/view/Surface;

    invoke-virtual {v0, p1}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    return-void
.end method
