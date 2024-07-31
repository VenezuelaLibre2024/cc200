.class public final Lib/h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/hardware/Camera$PreviewCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lib/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public a:Lib/p;

.field public b:Lhb/s;

.field public final synthetic c:Lib/h;


# direct methods
.method public constructor <init>(Lib/h;)V
    .locals 0

    iput-object p1, p0, Lib/h$a;->c:Lib/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lib/p;)V
    .locals 0

    iput-object p1, p0, Lib/h$a;->a:Lib/p;

    return-void
.end method

.method public b(Lhb/s;)V
    .locals 0

    iput-object p1, p0, Lib/h$a;->b:Lhb/s;

    return-void
.end method

.method public onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 8

    iget-object v0, p0, Lib/h$a;->b:Lhb/s;

    iget-object v1, p0, Lib/h$a;->a:Lib/p;

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p2

    invoke-virtual {p2}, Landroid/hardware/Camera$Parameters;->getPreviewFormat()I

    move-result v6

    new-instance p2, Lhb/t;

    iget v4, v0, Lhb/s;->h:I

    iget v5, v0, Lhb/s;->i:I

    iget-object v0, p0, Lib/h$a;->c:Lib/h;

    invoke-virtual {v0}, Lib/h;->f()I

    move-result v7

    move-object v2, p2

    move-object v3, p1

    invoke-direct/range {v2 .. v7}, Lhb/t;-><init>([BIIII)V

    iget-object p1, p0, Lib/h$a;->c:Lib/h;

    invoke-static {p1}, Lib/h;->a(Lib/h;)Landroid/hardware/Camera$CameraInfo;

    move-result-object p1

    iget p1, p1, Landroid/hardware/Camera$CameraInfo;->facing:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-virtual {p2, v0}, Lhb/t;->e(Z)V

    :cond_0
    invoke-interface {v1, p2}, Lib/p;->a(Lhb/t;)V

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "No preview data received"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-static {}, Lib/h;->b()Ljava/lang/String;

    move-result-object p2

    const-string v0, "Camera preview failed"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :cond_2
    invoke-static {}, Lib/h;->b()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Got preview callback, but no handler or resolution available"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v1, :cond_3

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "No resolution available"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-interface {v1, p1}, Lib/p;->b(Ljava/lang/Exception;)V

    :cond_3
    :goto_2
    return-void
.end method
