.class public Ltc/a;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Throwable;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public b:Landroid/graphics/Bitmap;

.field public final c:Landroid/graphics/RectF;

.field public final d:Landroid/graphics/RectF;

.field public e:F

.field public f:F

.field public final g:I

.field public final h:I

.field public final i:Landroid/graphics/Bitmap$CompressFormat;

.field public final j:I

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Landroid/net/Uri;

.field public final n:Landroid/net/Uri;

.field public final o:Lsc/c;

.field public final p:Lrc/a;

.field public q:I

.field public r:I

.field public s:I

.field public t:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/graphics/Bitmap;Lsc/d;Lsc/b;Lrc/a;)V
    .locals 1

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ltc/a;->a:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Ltc/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p3}, Lsc/d;->a()Landroid/graphics/RectF;

    move-result-object p1

    iput-object p1, p0, Ltc/a;->c:Landroid/graphics/RectF;

    invoke-virtual {p3}, Lsc/d;->c()Landroid/graphics/RectF;

    move-result-object p1

    iput-object p1, p0, Ltc/a;->d:Landroid/graphics/RectF;

    invoke-virtual {p3}, Lsc/d;->d()F

    move-result p1

    iput p1, p0, Ltc/a;->e:F

    invoke-virtual {p3}, Lsc/d;->b()F

    move-result p1

    iput p1, p0, Ltc/a;->f:F

    invoke-virtual {p4}, Lsc/b;->h()I

    move-result p1

    iput p1, p0, Ltc/a;->g:I

    invoke-virtual {p4}, Lsc/b;->i()I

    move-result p1

    iput p1, p0, Ltc/a;->h:I

    invoke-virtual {p4}, Lsc/b;->a()Landroid/graphics/Bitmap$CompressFormat;

    move-result-object p1

    iput-object p1, p0, Ltc/a;->i:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {p4}, Lsc/b;->b()I

    move-result p1

    iput p1, p0, Ltc/a;->j:I

    invoke-virtual {p4}, Lsc/b;->f()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ltc/a;->k:Ljava/lang/String;

    invoke-virtual {p4}, Lsc/b;->g()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ltc/a;->l:Ljava/lang/String;

    invoke-virtual {p4}, Lsc/b;->c()Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Ltc/a;->m:Landroid/net/Uri;

    invoke-virtual {p4}, Lsc/b;->d()Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Ltc/a;->n:Landroid/net/Uri;

    invoke-virtual {p4}, Lsc/b;->e()Lsc/c;

    move-result-object p1

    iput-object p1, p0, Ltc/a;->o:Lsc/c;

    iput-object p5, p0, Ltc/a;->p:Lrc/a;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 5

    iget-object v0, p0, Ltc/a;->m:Landroid/net/Uri;

    invoke-static {v0}, Luc/a;->h(Landroid/net/Uri;)Z

    move-result v0

    iget-object v1, p0, Ltc/a;->n:Landroid/net/Uri;

    invoke-static {v1}, Luc/a;->h(Landroid/net/Uri;)Z

    move-result v1

    const-string v2, "It is not possible to write exif info into file represented by \"content\" Uri if Android < LOLLIPOP"

    const-string v3, "BitmapCropTask"

    const/16 v4, 0x15

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v4, :cond_0

    iget v0, p0, Ltc/a;->q:I

    iget v1, p0, Ltc/a;->r:I

    iget-object v2, p0, Ltc/a;->m:Landroid/net/Uri;

    iget-object v3, p0, Ltc/a;->n:Landroid/net/Uri;

    invoke-static {p1, v0, v1, v2, v3}, Luc/f;->b(Landroid/content/Context;IILandroid/net/Uri;Landroid/net/Uri;)V

    goto :goto_0

    :cond_0
    invoke-static {v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    iget v0, p0, Ltc/a;->q:I

    iget v1, p0, Ltc/a;->r:I

    iget-object v2, p0, Ltc/a;->m:Landroid/net/Uri;

    iget-object v3, p0, Ltc/a;->l:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2, v3}, Luc/f;->c(Landroid/content/Context;IILandroid/net/Uri;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v4, :cond_0

    new-instance v0, Ly0/a;

    iget-object v1, p0, Ltc/a;->k:Ljava/lang/String;

    invoke-direct {v0, v1}, Ly0/a;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ltc/a;->q:I

    iget v2, p0, Ltc/a;->r:I

    iget-object v3, p0, Ltc/a;->n:Landroid/net/Uri;

    invoke-static {p1, v0, v1, v2, v3}, Luc/f;->d(Landroid/content/Context;Ly0/a;IILandroid/net/Uri;)V

    goto :goto_0

    :cond_3
    new-instance p1, Ly0/a;

    iget-object v0, p0, Ltc/a;->k:Ljava/lang/String;

    invoke-direct {p1, v0}, Ly0/a;-><init>(Ljava/lang/String;)V

    iget v0, p0, Ltc/a;->q:I

    iget v1, p0, Ltc/a;->r:I

    iget-object v2, p0, Ltc/a;->l:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Luc/f;->e(Ly0/a;IILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final b()Z
    .locals 10

    iget-object v0, p0, Ltc/a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v2, p0, Ltc/a;->g:I

    if-lez v2, :cond_3

    iget v2, p0, Ltc/a;->h:I

    if-lez v2, :cond_3

    iget-object v2, p0, Ltc/a;->c:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    iget v3, p0, Ltc/a;->e:F

    div-float/2addr v2, v3

    iget-object v3, p0, Ltc/a;->c:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    iget v4, p0, Ltc/a;->e:F

    div-float/2addr v3, v4

    iget v4, p0, Ltc/a;->g:I

    int-to-float v5, v4

    cmpl-float v5, v2, v5

    if-gtz v5, :cond_1

    iget v5, p0, Ltc/a;->h:I

    int-to-float v5, v5

    cmpl-float v5, v3, v5

    if-lez v5, :cond_3

    :cond_1
    int-to-float v4, v4

    div-float/2addr v4, v2

    iget v2, p0, Ltc/a;->h:I

    int-to-float v2, v2

    div-float/2addr v2, v3

    invoke-static {v4, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    iget-object v3, p0, Ltc/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v4, v2

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    iget-object v5, p0, Ltc/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v5, v2

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    invoke-static {v3, v4, v5, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v3

    iget-object v4, p0, Ltc/a;->b:Landroid/graphics/Bitmap;

    if-eq v4, v3, :cond_2

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    :cond_2
    iput-object v3, p0, Ltc/a;->b:Landroid/graphics/Bitmap;

    iget v3, p0, Ltc/a;->e:F

    div-float/2addr v3, v2

    iput v3, p0, Ltc/a;->e:F

    :cond_3
    iget v2, p0, Ltc/a;->f:F

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_5

    new-instance v8, Landroid/graphics/Matrix;

    invoke-direct {v8}, Landroid/graphics/Matrix;-><init>()V

    iget v2, p0, Ltc/a;->f:F

    iget-object v3, p0, Ltc/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    iget-object v4, p0, Ltc/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    invoke-virtual {v8, v2, v3, v4}, Landroid/graphics/Matrix;->setRotate(FFF)V

    iget-object v3, p0, Ltc/a;->b:Landroid/graphics/Bitmap;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    iget-object v2, p0, Ltc/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    const/4 v9, 0x1

    invoke-static/range {v3 .. v9}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v2

    iget-object v3, p0, Ltc/a;->b:Landroid/graphics/Bitmap;

    if-eq v3, v2, :cond_4

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    :cond_4
    iput-object v2, p0, Ltc/a;->b:Landroid/graphics/Bitmap;

    :cond_5
    iget-object v2, p0, Ltc/a;->c:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    iget-object v3, p0, Ltc/a;->d:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->left:F

    sub-float/2addr v2, v3

    iget v3, p0, Ltc/a;->e:F

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iput v2, p0, Ltc/a;->s:I

    iget-object v2, p0, Ltc/a;->c:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iget-object v3, p0, Ltc/a;->d:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    sub-float/2addr v2, v3

    iget v3, p0, Ltc/a;->e:F

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iput v2, p0, Ltc/a;->t:I

    iget-object v2, p0, Ltc/a;->c:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    iget v3, p0, Ltc/a;->e:F

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iput v2, p0, Ltc/a;->q:I

    iget-object v2, p0, Ltc/a;->c:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    iget v3, p0, Ltc/a;->e:F

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iput v2, p0, Ltc/a;->r:I

    iget v3, p0, Ltc/a;->q:I

    invoke-virtual {p0, v3, v2}, Ltc/a;->f(II)Z

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Should crop: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "BitmapCropTask"

    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v2, :cond_7

    iget-object v1, p0, Ltc/a;->b:Landroid/graphics/Bitmap;

    iget v2, p0, Ltc/a;->s:I

    iget v3, p0, Ltc/a;->t:I

    iget v4, p0, Ltc/a;->q:I

    iget v5, p0, Ltc/a;->r:I

    invoke-static {v1, v2, v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {p0, v1}, Ltc/a;->e(Landroid/graphics/Bitmap;)V

    iget-object v1, p0, Ltc/a;->i:Landroid/graphics/Bitmap$CompressFormat;

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v1, v2}, Landroid/graphics/Bitmap$CompressFormat;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p0, v0}, Ltc/a;->a(Landroid/content/Context;)V

    :cond_6
    const/4 v0, 0x1

    return v0

    :cond_7
    iget-object v2, p0, Ltc/a;->m:Landroid/net/Uri;

    iget-object v3, p0, Ltc/a;->n:Landroid/net/Uri;

    invoke-static {v0, v2, v3}, Luc/e;->a(Landroid/content/Context;Landroid/net/Uri;Landroid/net/Uri;)V

    return v1
.end method

.method public varargs c([Ljava/lang/Void;)Ljava/lang/Throwable;
    .locals 1

    iget-object p1, p0, Ltc/a;->b:Landroid/graphics/Bitmap;

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "ViewBitmap is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "ViewBitmap is recycled"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_1
    iget-object p1, p0, Ltc/a;->d:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "CurrentImageRect is empty"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_2
    iget-object p1, p0, Ltc/a;->n:Landroid/net/Uri;

    if-nez p1, :cond_3

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "ImageOutputUri is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_3
    :try_start_0
    invoke-virtual {p0}, Ltc/a;->b()Z

    const/4 p1, 0x0

    iput-object p1, p0, Ltc/a;->b:Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    return-object p1
.end method

.method public d(Ljava/lang/Throwable;)V
    .locals 6

    iget-object v0, p0, Ltc/a;->p:Lrc/a;

    if-eqz v0, :cond_2

    if-nez p1, :cond_1

    iget-object p1, p0, Ltc/a;->n:Landroid/net/Uri;

    invoke-static {p1}, Luc/a;->h(Landroid/net/Uri;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ltc/a;->n:Landroid/net/Uri;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/File;

    iget-object v0, p0, Ltc/a;->l:Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    :goto_0
    move-object v1, p1

    iget-object v0, p0, Ltc/a;->p:Lrc/a;

    iget v2, p0, Ltc/a;->s:I

    iget v3, p0, Ltc/a;->t:I

    iget v4, p0, Ltc/a;->q:I

    iget v5, p0, Ltc/a;->r:I

    invoke-interface/range {v0 .. v5}, Lrc/a;->a(Landroid/net/Uri;IIII)V

    goto :goto_1

    :cond_1
    invoke-interface {v0, p1}, Lrc/a;->b(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Ltc/a;->c([Ljava/lang/Void;)Ljava/lang/Throwable;

    move-result-object p1

    return-object p1
.end method

.method public final e(Landroid/graphics/Bitmap;)V
    .locals 4

    iget-object v0, p0, Ltc/a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v2, p0, Ltc/a;->n:Landroid/net/Uri;

    invoke-virtual {v0, v2}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v1, p0, Ltc/a;->i:Landroid/graphics/Bitmap$CompressFormat;

    iget v3, p0, Ltc/a;->j:I

    invoke-virtual {p1, v1, v3, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v0}, Luc/a;->c(Ljava/io/Closeable;)V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object v2, v1

    :goto_0
    move-object v1, v0

    goto :goto_4

    :catch_1
    move-exception p1

    move-object v2, v1

    :goto_1
    move-object v1, v0

    goto :goto_2

    :catchall_2
    move-exception p1

    move-object v2, v1

    goto :goto_4

    :catch_2
    move-exception p1

    move-object v2, v1

    :goto_2
    :try_start_3
    const-string v0, "BitmapCropTask"

    invoke-virtual {p1}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    invoke-static {v1}, Luc/a;->c(Ljava/io/Closeable;)V

    :goto_3
    invoke-static {v2}, Luc/a;->c(Ljava/io/Closeable;)V

    return-void

    :catchall_3
    move-exception p1

    :goto_4
    invoke-static {v1}, Luc/a;->c(Ljava/io/Closeable;)V

    invoke-static {v2}, Luc/a;->c(Ljava/io/Closeable;)V

    throw p1
.end method

.method public final f(II)Z
    .locals 2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    int-to-float p1, p1

    const/high16 p2, 0x447a0000    # 1000.0f

    div-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    const/4 p2, 0x1

    add-int/2addr p1, p2

    iget v0, p0, Ltc/a;->g:I

    if-lez v0, :cond_0

    iget v0, p0, Ltc/a;->h:I

    if-gtz v0, :cond_2

    :cond_0
    iget-object v0, p0, Ltc/a;->c:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    iget-object v1, p0, Ltc/a;->d:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    int-to-float p1, p1

    cmpl-float v0, v0, p1

    if-gtz v0, :cond_2

    iget-object v0, p0, Ltc/a;->c:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    iget-object v1, p0, Ltc/a;->d:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->top:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v0, p1

    if-gtz v0, :cond_2

    iget-object v0, p0, Ltc/a;->c:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    iget-object v1, p0, Ltc/a;->d:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v0, p1

    if-gtz v0, :cond_2

    iget-object v0, p0, Ltc/a;->c:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    iget-object v1, p0, Ltc/a;->d:Landroid/graphics/RectF;

    iget v1, v1, Landroid/graphics/RectF;->right:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float p1, v0, p1

    if-gtz p1, :cond_2

    iget p1, p0, Ltc/a;->f:F

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :cond_2
    :goto_0
    return p2
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ltc/a;->d(Ljava/lang/Throwable;)V

    return-void
.end method
