.class public final Lr5/f;
.super Landroid/opengl/GLSurfaceView;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr5/f$a;
    }
.end annotation


# instance fields
.field public final h:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lr5/f$a;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Landroid/hardware/SensorManager;

.field public final j:Landroid/hardware/Sensor;

.field public final k:Lr5/c;

.field public final l:Landroid/os/Handler;

.field public final m:Lr5/d;

.field public n:Landroid/graphics/SurfaceTexture;

.field public o:Landroid/view/Surface;

.field public p:Z

.field public q:Z

.field public r:Z


# direct methods
.method public static synthetic a(Lr5/f;)V
    .locals 0

    invoke-direct {p0}, Lr5/f;->b()V

    return-void
.end method

.method private synthetic b()V
    .locals 3

    iget-object v0, p0, Lr5/f;->o:Landroid/view/Surface;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lr5/f;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr5/f$a;

    invoke-interface {v2, v0}, Lr5/f$a;->y(Landroid/view/Surface;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lr5/f;->n:Landroid/graphics/SurfaceTexture;

    invoke-static {v1, v0}, Lr5/f;->c(Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lr5/f;->n:Landroid/graphics/SurfaceTexture;

    iput-object v0, p0, Lr5/f;->o:Landroid/view/Surface;

    return-void
.end method

.method public static c(Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/SurfaceTexture;->release()V

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/Surface;->release()V

    :cond_1
    return-void
.end method


# virtual methods
.method public d(Lr5/f$a;)V
    .locals 1

    iget-object v0, p0, Lr5/f;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final e()V
    .locals 5

    iget-boolean v0, p0, Lr5/f;->p:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lr5/f;->q:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Lr5/f;->j:Landroid/hardware/Sensor;

    if-eqz v2, :cond_3

    iget-boolean v3, p0, Lr5/f;->r:Z

    if-ne v0, v3, :cond_1

    goto :goto_2

    :cond_1
    if-eqz v0, :cond_2

    iget-object v3, p0, Lr5/f;->i:Landroid/hardware/SensorManager;

    iget-object v4, p0, Lr5/f;->k:Lr5/c;

    invoke-virtual {v3, v4, v2, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lr5/f;->i:Landroid/hardware/SensorManager;

    iget-object v2, p0, Lr5/f;->k:Lr5/c;

    invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    :goto_1
    iput-boolean v0, p0, Lr5/f;->r:Z

    :cond_3
    :goto_2
    return-void
.end method

.method public getCameraMotionListener()Lr5/a;
    .locals 1

    iget-object v0, p0, Lr5/f;->m:Lr5/d;

    return-object v0
.end method

.method public getVideoFrameMetadataListener()Lq5/j;
    .locals 1

    iget-object v0, p0, Lr5/f;->m:Lr5/d;

    return-object v0
.end method

.method public getVideoSurface()Landroid/view/Surface;
    .locals 1

    iget-object v0, p0, Lr5/f;->o:Landroid/view/Surface;

    return-object v0
.end method

.method public onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onDetachedFromWindow()V

    iget-object v0, p0, Lr5/f;->l:Landroid/os/Handler;

    new-instance v1, Lr5/e;

    invoke-direct {v1, p0}, Lr5/e;-><init>(Lr5/f;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onPause()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lr5/f;->q:Z

    invoke-virtual {p0}, Lr5/f;->e()V

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onResume()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lr5/f;->q:Z

    invoke-virtual {p0}, Lr5/f;->e()V

    return-void
.end method

.method public setDefaultStereoMode(I)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public setUseSensorRotation(Z)V
    .locals 0

    iput-boolean p1, p0, Lr5/f;->p:Z

    invoke-virtual {p0}, Lr5/f;->e()V

    return-void
.end method
