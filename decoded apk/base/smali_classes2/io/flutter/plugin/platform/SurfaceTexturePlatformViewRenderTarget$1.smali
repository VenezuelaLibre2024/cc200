.class Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/view/TextureRegistry$OnFrameConsumedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;


# direct methods
.method public constructor <init>(Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget$1;->this$0:Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFrameConsumed()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget$1;->this$0:Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;

    invoke-static {v0}, Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;->access$000(Lio/flutter/plugin/platform/SurfaceTexturePlatformViewRenderTarget;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->decrementAndGet()J

    :cond_0
    return-void
.end method
