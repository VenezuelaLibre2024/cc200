.class final Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;
.implements Lio/flutter/view/TextureRegistry$OnTrimMemoryListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/renderer/FlutterRenderer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "SurfaceTextureRegistryEntry"
.end annotation


# instance fields
.field private frameConsumedListener:Lio/flutter/view/TextureRegistry$OnFrameConsumedListener;

.field private final id:J

.field private final onFrameConsumed:Ljava/lang/Runnable;

.field private onFrameListener:Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;

.field private released:Z

.field private final textureWrapper:Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

.field public final synthetic this$0:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

.field private trimMemoryListener:Lio/flutter/view/TextureRegistry$OnTrimMemoryListener;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/renderer/FlutterRenderer;JLandroid/graphics/SurfaceTexture;)V
    .locals 1

    iput-object p1, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->this$0:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry$1;

    invoke-direct {p1, p0}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry$1;-><init>(Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;)V

    iput-object p1, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->onFrameConsumed:Ljava/lang/Runnable;

    new-instance v0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry$2;

    invoke-direct {v0, p0}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry$2;-><init>(Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->onFrameListener:Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;

    iput-wide p2, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->id:J

    new-instance p2, Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

    invoke-direct {p2, p4, p1}, Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;-><init>(Landroid/graphics/SurfaceTexture;Ljava/lang/Runnable;)V

    iput-object p2, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->textureWrapper:Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x15

    if-lt p1, p2, :cond_0

    invoke-virtual {p0}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object p1

    iget-object p2, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->onFrameListener:Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;

    new-instance p3, Landroid/os/Handler;

    invoke-direct {p3}, Landroid/os/Handler;-><init>()V

    invoke-virtual {p1, p2, p3}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;Landroid/os/Handler;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object p1

    iget-object p2, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->onFrameListener:Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;

    invoke-virtual {p1, p2}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    :goto_0
    return-void
.end method

.method public static synthetic access$100(Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;)Lio/flutter/view/TextureRegistry$OnFrameConsumedListener;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->frameConsumedListener:Lio/flutter/view/TextureRegistry$OnFrameConsumedListener;

    return-object p0
.end method

.method public static synthetic access$200(Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;)Z
    .locals 0

    iget-boolean p0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->released:Z

    return p0
.end method

.method public static synthetic access$400(Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;)J
    .locals 2

    iget-wide v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->id:J

    return-wide v0
.end method

.method private removeListener()V
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->this$0:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    invoke-virtual {v0, p0}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->removeOnTrimMemoryListener(Lio/flutter/view/TextureRegistry$OnTrimMemoryListener;)V

    return-void
.end method


# virtual methods
.method public finalize()V
    .locals 5

    :try_start_0
    iget-boolean v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->released:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->this$0:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    invoke-static {v0}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->access$700(Lio/flutter/embedding/engine/renderer/FlutterRenderer;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$TextureFinalizerRunnable;

    iget-wide v2, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->id:J

    iget-object v4, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->this$0:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    invoke-static {v4}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->access$300(Lio/flutter/embedding/engine/renderer/FlutterRenderer;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$TextureFinalizerRunnable;-><init>(JLio/flutter/embedding/engine/FlutterJNI;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void

    :catchall_0
    move-exception v0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    throw v0
.end method

.method public id()J
    .locals 2

    iget-wide v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->id:J

    return-wide v0
.end method

.method public onTrimMemory(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->trimMemoryListener:Lio/flutter/view/TextureRegistry$OnTrimMemoryListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lio/flutter/view/TextureRegistry$OnTrimMemoryListener;->onTrimMemory(I)V

    :cond_0
    return-void
.end method

.method public release()V
    .locals 3

    iget-boolean v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->released:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Releasing a SurfaceTexture ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->id:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FlutterRenderer"

    invoke-static {v1, v0}, Lio/flutter/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->textureWrapper:Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;->release()V

    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->this$0:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    iget-wide v1, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->id:J

    invoke-static {v0, v1, v2}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;->access$600(Lio/flutter/embedding/engine/renderer/FlutterRenderer;J)V

    invoke-direct {p0}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->removeListener()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->released:Z

    return-void
.end method

.method public setOnFrameConsumedListener(Lio/flutter/view/TextureRegistry$OnFrameConsumedListener;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->frameConsumedListener:Lio/flutter/view/TextureRegistry$OnFrameConsumedListener;

    return-void
.end method

.method public setOnTrimMemoryListener(Lio/flutter/view/TextureRegistry$OnTrimMemoryListener;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->trimMemoryListener:Lio/flutter/view/TextureRegistry$OnTrimMemoryListener;

    return-void
.end method

.method public surfaceTexture()Landroid/graphics/SurfaceTexture;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->textureWrapper:Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    return-object v0
.end method

.method public textureWrapper()Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$SurfaceTextureRegistryEntry;->textureWrapper:Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

    return-object v0
.end method
