.class final Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/view/FlutterView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "SurfaceTextureRegistryEntry"
.end annotation


# instance fields
.field private final id:J

.field private onFrameListener:Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;

.field private released:Z

.field private final textureWrapper:Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

.field public final synthetic this$0:Lio/flutter/view/FlutterView;


# direct methods
.method public constructor <init>(Lio/flutter/view/FlutterView;JLandroid/graphics/SurfaceTexture;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->this$0:Lio/flutter/view/FlutterView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry$1;

    invoke-direct {p1, p0}, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry$1;-><init>(Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;)V

    iput-object p1, p0, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->onFrameListener:Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;

    iput-wide p2, p0, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->id:J

    new-instance p1, Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

    invoke-direct {p1, p4}, Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object p1, p0, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->textureWrapper:Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x15

    if-lt p1, p2, :cond_0

    invoke-virtual {p0}, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object p1

    iget-object p2, p0, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->onFrameListener:Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;

    new-instance p3, Landroid/os/Handler;

    invoke-direct {p3}, Landroid/os/Handler;-><init>()V

    invoke-virtual {p1, p2, p3}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;Landroid/os/Handler;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object p1

    iget-object p2, p0, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->onFrameListener:Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;

    invoke-virtual {p1, p2}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    :goto_0
    return-void
.end method

.method public static synthetic access$200(Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;)Z
    .locals 0

    iget-boolean p0, p0, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->released:Z

    return p0
.end method

.method public static synthetic access$300(Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;)J
    .locals 2

    iget-wide v0, p0, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->id:J

    return-wide v0
.end method


# virtual methods
.method public id()J
    .locals 2

    iget-wide v0, p0, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->id:J

    return-wide v0
.end method

.method public release()V
    .locals 3

    iget-boolean v0, p0, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->released:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->released:Z

    invoke-virtual {p0}, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    iget-object v0, p0, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->textureWrapper:Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;->release()V

    iget-object v0, p0, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->this$0:Lio/flutter/view/FlutterView;

    invoke-static {v0}, Lio/flutter/view/FlutterView;->access$100(Lio/flutter/view/FlutterView;)Lio/flutter/view/FlutterNativeView;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/view/FlutterNativeView;->getFlutterJNI()Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v0

    iget-wide v1, p0, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->id:J

    invoke-virtual {v0, v1, v2}, Lio/flutter/embedding/engine/FlutterJNI;->unregisterTexture(J)V

    return-void
.end method

.method public surfaceTexture()Landroid/graphics/SurfaceTexture;
    .locals 1

    iget-object v0, p0, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->textureWrapper:Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    return-object v0
.end method

.method public textureWrapper()Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;
    .locals 1

    iget-object v0, p0, Lio/flutter/view/FlutterView$SurfaceTextureRegistryEntry;->textureWrapper:Lio/flutter/embedding/engine/renderer/SurfaceTextureWrapper;

    return-object v0
.end method
