.class public final Lib/h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lib/h$a;
    }
.end annotation


# static fields
.field public static final n:Ljava/lang/String; = "h"


# instance fields
.field public a:Landroid/hardware/Camera;

.field public b:Landroid/hardware/Camera$CameraInfo;

.field public c:Lib/a;

.field public d:Lma/b;

.field public e:Z

.field public f:Ljava/lang/String;

.field public g:Lib/i;

.field public h:Lib/m;

.field public i:Lhb/s;

.field public j:Lhb/s;

.field public k:I

.field public l:Landroid/content/Context;

.field public final m:Lib/h$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lib/i;

    invoke-direct {v0}, Lib/i;-><init>()V

    iput-object v0, p0, Lib/h;->g:Lib/i;

    const/4 v0, -0x1

    iput v0, p0, Lib/h;->k:I

    iput-object p1, p0, Lib/h;->l:Landroid/content/Context;

    new-instance p1, Lib/h$a;

    invoke-direct {p1, p0}, Lib/h$a;-><init>(Lib/h;)V

    iput-object p1, p0, Lib/h;->m:Lib/h$a;

    return-void
.end method

.method public static synthetic a(Lib/h;)Landroid/hardware/Camera$CameraInfo;
    .locals 0

    iget-object p0, p0, Lib/h;->b:Landroid/hardware/Camera$CameraInfo;

    return-object p0
.end method

.method public static synthetic b()Ljava/lang/String;
    .locals 1

    sget-object v0, Lib/h;->n:Ljava/lang/String;

    return-object v0
.end method

.method public static i(Landroid/hardware/Camera$Parameters;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/Camera$Parameters;",
            ")",
            "Ljava/util/List<",
            "Lhb/s;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Lhb/s;

    iget v2, p0, Landroid/hardware/Camera$Size;->width:I

    iget v3, p0, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v0, v2, v3}, Lhb/s;-><init>(II)V

    new-instance v0, Lhb/s;

    iget v2, p0, Landroid/hardware/Camera$Size;->width:I

    iget p0, p0, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v0, v2, p0}, Lhb/s;-><init>(II)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v1

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Camera$Size;

    new-instance v2, Lhb/s;

    iget v3, v0, Landroid/hardware/Camera$Size;->width:I

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v2, v3, v0}, Lhb/s;-><init>(II)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method


# virtual methods
.method public final c()I
    .locals 4

    iget-object v0, p0, Lib/h;->h:Lib/m;

    invoke-virtual {v0}, Lib/m;->c()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    if-eq v0, v1, :cond_2

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 v3, 0x3

    if-eq v0, v3, :cond_0

    goto :goto_0

    :cond_0
    const/16 v2, 0x10e

    goto :goto_0

    :cond_1
    const/16 v2, 0xb4

    goto :goto_0

    :cond_2
    const/16 v2, 0x5a

    :cond_3
    :goto_0
    iget-object v0, p0, Lib/h;->b:Landroid/hardware/Camera$CameraInfo;

    iget v3, v0, Landroid/hardware/Camera$CameraInfo;->facing:I

    iget v0, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    if-ne v3, v1, :cond_4

    add-int/2addr v0, v2

    rem-int/lit16 v0, v0, 0x168

    rsub-int v0, v0, 0x168

    goto :goto_1

    :cond_4
    sub-int/2addr v0, v2

    add-int/lit16 v0, v0, 0x168

    :goto_1
    rem-int/lit16 v0, v0, 0x168

    sget-object v1, Lib/h;->n:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Camera Display Orientation: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return v0
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lib/h;->a:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lib/h;->a:Landroid/hardware/Camera;

    :cond_0
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lib/h;->a:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lib/h;->r()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Camera not open"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lib/h;->k:I

    return v0
.end method

.method public final g()Landroid/hardware/Camera$Parameters;
    .locals 2

    iget-object v0, p0, Lib/h;->a:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    iget-object v1, p0, Lib/h;->f:Ljava/lang/String;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->flatten()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lib/h;->f:Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->unflatten(Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method public h()Lhb/s;
    .locals 1

    iget-object v0, p0, Lib/h;->j:Lhb/s;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lib/h;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lib/h;->j:Lhb/s;

    invoke-virtual {v0}, Lhb/s;->c()Lhb/s;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lib/h;->j:Lhb/s;

    return-object v0
.end method

.method public j()Z
    .locals 2

    iget v0, p0, Lib/h;->k:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    rem-int/lit16 v0, v0, 0xb4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Rotation not calculated yet. Call configure() first."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public k()Z
    .locals 3

    iget-object v0, p0, Lib/h;->a:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v2, "on"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "torch"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public l()V
    .locals 2

    iget-object v0, p0, Lib/h;->g:Lib/i;

    invoke-virtual {v0}, Lib/i;->b()I

    move-result v0

    invoke-static {v0}, Lna/a;->b(I)Landroid/hardware/Camera;

    move-result-object v0

    iput-object v0, p0, Lib/h;->a:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lib/h;->g:Lib/i;

    invoke-virtual {v0}, Lib/i;->b()I

    move-result v0

    invoke-static {v0}, Lna/a;->a(I)I

    move-result v0

    new-instance v1, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v1}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    iput-object v1, p0, Lib/h;->b:Landroid/hardware/Camera$CameraInfo;

    invoke-static {v0, v1}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Failed to open camera"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public m(Lib/p;)V
    .locals 2

    iget-object v0, p0, Lib/h;->a:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lib/h;->e:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lib/h;->m:Lib/h$a;

    invoke-virtual {v1, p1}, Lib/h$a;->a(Lib/p;)V

    iget-object p1, p0, Lib/h;->m:Lib/h$a;

    invoke-virtual {v0, p1}, Landroid/hardware/Camera;->setOneShotPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    :cond_0
    return-void
.end method

.method public final n(I)V
    .locals 1

    iget-object v0, p0, Lib/h;->a:Landroid/hardware/Camera;

    invoke-virtual {v0, p1}, Landroid/hardware/Camera;->setDisplayOrientation(I)V

    return-void
.end method

.method public o(Lib/i;)V
    .locals 0

    iput-object p1, p0, Lib/h;->g:Lib/i;

    return-void
.end method

.method public final p(Z)V
    .locals 4

    invoke-virtual {p0}, Lib/h;->g()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object p1, Lib/h;->n:Ljava/lang/String;

    const-string v0, "Device error: no camera parameters are available. Proceeding without configuration."

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    sget-object v1, Lib/h;->n:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Initial camera parameters: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->flatten()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_1

    const-string v2, "In camera config safe mode -- most settings will not be honored"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v2, p0, Lib/h;->g:Lib/i;

    invoke-virtual {v2}, Lib/i;->a()Lib/i$a;

    move-result-object v2

    invoke-static {v0, v2, p1}, Lib/c;->g(Landroid/hardware/Camera$Parameters;Lib/i$a;Z)V

    if-nez p1, :cond_4

    const/4 p1, 0x0

    invoke-static {v0, p1}, Lib/c;->k(Landroid/hardware/Camera$Parameters;Z)V

    iget-object p1, p0, Lib/h;->g:Lib/i;

    invoke-virtual {p1}, Lib/i;->h()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {v0}, Lib/c;->i(Landroid/hardware/Camera$Parameters;)V

    :cond_2
    iget-object p1, p0, Lib/h;->g:Lib/i;

    invoke-virtual {p1}, Lib/i;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {v0}, Lib/c;->c(Landroid/hardware/Camera$Parameters;)V

    :cond_3
    iget-object p1, p0, Lib/h;->g:Lib/i;

    invoke-virtual {p1}, Lib/i;->g()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {v0}, Lib/c;->l(Landroid/hardware/Camera$Parameters;)V

    invoke-static {v0}, Lib/c;->h(Landroid/hardware/Camera$Parameters;)V

    invoke-static {v0}, Lib/c;->j(Landroid/hardware/Camera$Parameters;)V

    :cond_4
    invoke-static {v0}, Lib/h;->i(Landroid/hardware/Camera$Parameters;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_5

    const/4 p1, 0x0

    iput-object p1, p0, Lib/h;->i:Lhb/s;

    goto :goto_0

    :cond_5
    iget-object v2, p0, Lib/h;->h:Lib/m;

    invoke-virtual {p0}, Lib/h;->j()Z

    move-result v3

    invoke-virtual {v2, p1, v3}, Lib/m;->a(Ljava/util/List;Z)Lhb/s;

    move-result-object p1

    iput-object p1, p0, Lib/h;->i:Lhb/s;

    iget v2, p1, Lhb/s;->h:I

    iget p1, p1, Lhb/s;->i:I

    invoke-virtual {v0, v2, p1}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    :goto_0
    sget-object p1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v2, "glass-1"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {v0}, Lib/c;->e(Landroid/hardware/Camera$Parameters;)V

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Final camera parameters: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->flatten()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lib/h;->a:Landroid/hardware/Camera;

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    return-void
.end method

.method public q(Lib/m;)V
    .locals 0

    iput-object p1, p0, Lib/h;->h:Lib/m;

    return-void
.end method

.method public final r()V
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Lib/h;->c()I

    move-result v0

    iput v0, p0, Lib/h;->k:I

    invoke-virtual {p0, v0}, Lib/h;->n(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Lib/h;->n:Ljava/lang/String;

    const-string v1, "Failed to set rotation."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {p0, v0}, Lib/h;->p(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    const/4 v0, 0x1

    :try_start_2
    invoke-virtual {p0, v0}, Lib/h;->p(Z)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    sget-object v0, Lib/h;->n:Ljava/lang/String;

    const-string v1, "Camera rejected even safe-mode parameters! No configuration"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    iget-object v0, p0, Lib/h;->a:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lib/h;->i:Lhb/s;

    iput-object v0, p0, Lib/h;->j:Lhb/s;

    goto :goto_2

    :cond_0
    new-instance v1, Lhb/s;

    iget v2, v0, Landroid/hardware/Camera$Size;->width:I

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v1, v2, v0}, Lhb/s;-><init>(II)V

    iput-object v1, p0, Lib/h;->j:Lhb/s;

    :goto_2
    iget-object v0, p0, Lib/h;->m:Lib/h$a;

    iget-object v1, p0, Lib/h;->j:Lhb/s;

    invoke-virtual {v0, v1}, Lib/h$a;->b(Lhb/s;)V

    return-void
.end method

.method public s(Lib/j;)V
    .locals 1

    iget-object v0, p0, Lib/h;->a:Landroid/hardware/Camera;

    invoke-virtual {p1, v0}, Lib/j;->a(Landroid/hardware/Camera;)V

    return-void
.end method

.method public t(Z)V
    .locals 2

    iget-object v0, p0, Lib/h;->a:Landroid/hardware/Camera;

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {p0}, Lib/h;->k()Z

    move-result v0

    if-eq p1, v0, :cond_2

    iget-object v0, p0, Lib/h;->c:Lib/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lib/a;->j()V

    :cond_0
    iget-object v0, p0, Lib/h;->a:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-static {v0, p1}, Lib/c;->k(Landroid/hardware/Camera$Parameters;Z)V

    iget-object v1, p0, Lib/h;->g:Lib/i;

    invoke-virtual {v1}, Lib/i;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0, p1}, Lib/c;->d(Landroid/hardware/Camera$Parameters;Z)V

    :cond_1
    iget-object p1, p0, Lib/h;->a:Landroid/hardware/Camera;

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    iget-object p1, p0, Lib/h;->c:Lib/a;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lib/a;->i()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lib/h;->n:Ljava/lang/String;

    const-string v1, "Failed to set torch"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    :goto_0
    return-void
.end method

.method public u()V
    .locals 3

    iget-object v0, p0, Lib/h;->a:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lib/h;->e:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lib/h;->e:Z

    new-instance v0, Lib/a;

    iget-object v1, p0, Lib/h;->a:Landroid/hardware/Camera;

    iget-object v2, p0, Lib/h;->g:Lib/i;

    invoke-direct {v0, v1, v2}, Lib/a;-><init>(Landroid/hardware/Camera;Lib/i;)V

    iput-object v0, p0, Lib/h;->c:Lib/a;

    new-instance v0, Lma/b;

    iget-object v1, p0, Lib/h;->l:Landroid/content/Context;

    iget-object v2, p0, Lib/h;->g:Lib/i;

    invoke-direct {v0, v1, p0, v2}, Lma/b;-><init>(Landroid/content/Context;Lib/h;Lib/i;)V

    iput-object v0, p0, Lib/h;->d:Lma/b;

    invoke-virtual {v0}, Lma/b;->d()V

    :cond_0
    return-void
.end method

.method public v()V
    .locals 3

    iget-object v0, p0, Lib/h;->c:Lib/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lib/a;->j()V

    iput-object v1, p0, Lib/h;->c:Lib/a;

    :cond_0
    iget-object v0, p0, Lib/h;->d:Lma/b;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lma/b;->e()V

    iput-object v1, p0, Lib/h;->d:Lma/b;

    :cond_1
    iget-object v0, p0, Lib/h;->a:Landroid/hardware/Camera;

    if-eqz v0, :cond_2

    iget-boolean v2, p0, Lib/h;->e:Z

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    iget-object v0, p0, Lib/h;->m:Lib/h$a;

    invoke-virtual {v0, v1}, Lib/h$a;->a(Lib/p;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lib/h;->e:Z

    :cond_2
    return-void
.end method
