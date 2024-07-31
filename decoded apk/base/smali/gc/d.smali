.class public Lgc/d;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final j:Lwb/e;


# instance fields
.field public a:Landroid/graphics/SurfaceTexture;

.field public b:Landroid/view/Surface;

.field public c:Lrb/d;

.field public d:Lpb/c;

.field public e:F

.field public f:F

.field public g:I

.field public h:Z

.field public final i:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lgc/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lwb/e;

    invoke-direct {v1, v0}, Lwb/e;-><init>(Ljava/lang/String;)V

    sput-object v1, Lgc/d;->j:Lwb/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lgc/d;->e:F

    iput v0, p0, Lgc/d;->f:F

    const/4 v0, 0x0

    iput v0, p0, Lgc/d;->g:I

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lgc/d;->i:Ljava/lang/Object;

    new-instance v0, Ltb/a;

    invoke-direct {v0}, Ltb/a;-><init>()V

    new-instance v1, Lrb/d;

    invoke-direct {v1}, Lrb/d;-><init>()V

    iput-object v1, p0, Lgc/d;->c:Lrb/d;

    invoke-virtual {v1, v0}, Lrb/d;->l(Ltb/a;)V

    new-instance v1, Lpb/c;

    invoke-direct {v1}, Lpb/c;-><init>()V

    iput-object v1, p0, Lgc/d;->d:Lpb/c;

    new-instance v1, Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0}, Ltb/a;->c()I

    move-result v0

    invoke-direct {v1, v0}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    iput-object v1, p0, Lgc/d;->a:Landroid/graphics/SurfaceTexture;

    new-instance v0, Lgc/d$a;

    invoke-direct {v0, p0}, Lgc/d$a;-><init>(Lgc/d;)V

    invoke-virtual {v1, v0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    new-instance v0, Landroid/view/Surface;

    iget-object v1, p0, Lgc/d;->a:Landroid/graphics/SurfaceTexture;

    invoke-direct {v0, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object v0, p0, Lgc/d;->b:Landroid/view/Surface;

    return-void
.end method

.method public static synthetic a()Lwb/e;
    .locals 1

    sget-object v0, Lgc/d;->j:Lwb/e;

    return-object v0
.end method

.method public static synthetic b(Lgc/d;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lgc/d;->i:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic c(Lgc/d;)Z
    .locals 0

    iget-boolean p0, p0, Lgc/d;->h:Z

    return p0
.end method

.method public static synthetic d(Lgc/d;Z)Z
    .locals 0

    iput-boolean p1, p0, Lgc/d;->h:Z

    return p1
.end method


# virtual methods
.method public final e()V
    .locals 4

    iget-object v0, p0, Lgc/d;->i:Ljava/lang/Object;

    monitor-enter v0

    :goto_0
    :try_start_0
    iget-boolean v1, p0, Lgc/d;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    :try_start_1
    iget-object v1, p0, Lgc/d;->i:Ljava/lang/Object;

    const-wide/16 v2, 0x2710

    invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V

    iget-boolean v1, p0, Lgc/d;->h:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Surface frame wait timed out"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    move-exception v1

    :try_start_2
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :cond_1
    const/4 v1, 0x0

    iput-boolean v1, p0, Lgc/d;->h:Z

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, Lgc/d;->a:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    return-void

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public f()V
    .locals 0

    invoke-virtual {p0}, Lgc/d;->e()V

    invoke-virtual {p0}, Lgc/d;->g()V

    return-void
.end method

.method public final g()V
    .locals 14

    iget-object v0, p0, Lgc/d;->a:Landroid/graphics/SurfaceTexture;

    iget-object v1, p0, Lgc/d;->c:Lrb/d;

    invoke-virtual {v1}, Lrb/d;->k()[F

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/SurfaceTexture;->getTransformMatrix([F)V

    iget v0, p0, Lgc/d;->e:F

    const/high16 v1, 0x3f800000    # 1.0f

    div-float v0, v1, v0

    iget v2, p0, Lgc/d;->f:F

    div-float v2, v1, v2

    sub-float v3, v1, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    sub-float v5, v1, v2

    div-float/2addr v5, v4

    iget-object v4, p0, Lgc/d;->c:Lrb/d;

    invoke-virtual {v4}, Lrb/d;->k()[F

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v4, v6, v3, v5, v7}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    iget-object v3, p0, Lgc/d;->c:Lrb/d;

    invoke-virtual {v3}, Lrb/d;->k()[F

    move-result-object v3

    invoke-static {v3, v6, v0, v2, v1}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    iget-object v0, p0, Lgc/d;->c:Lrb/d;

    invoke-virtual {v0}, Lrb/d;->k()[F

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v0, v6, v1, v1, v7}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    iget-object v0, p0, Lgc/d;->c:Lrb/d;

    invoke-virtual {v0}, Lrb/d;->k()[F

    move-result-object v8

    iget v0, p0, Lgc/d;->g:I

    int-to-float v10, v0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static/range {v8 .. v13}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    iget-object v0, p0, Lgc/d;->c:Lrb/d;

    invoke-virtual {v0}, Lrb/d;->k()[F

    move-result-object v0

    const/high16 v1, -0x41000000    # -0.5f

    invoke-static {v0, v6, v1, v1, v7}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    iget-object v0, p0, Lgc/d;->c:Lrb/d;

    iget-object v1, p0, Lgc/d;->d:Lpb/c;

    invoke-virtual {v0, v1}, Lrb/a;->a(Lpb/b;)V

    return-void
.end method

.method public h()Landroid/view/Surface;
    .locals 1

    iget-object v0, p0, Lgc/d;->b:Landroid/view/Surface;

    return-object v0
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Lgc/d;->c:Lrb/d;

    invoke-virtual {v0}, Lrb/d;->i()V

    iget-object v0, p0, Lgc/d;->b:Landroid/view/Surface;

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lgc/d;->b:Landroid/view/Surface;

    iput-object v0, p0, Lgc/d;->a:Landroid/graphics/SurfaceTexture;

    iput-object v0, p0, Lgc/d;->d:Lpb/c;

    iput-object v0, p0, Lgc/d;->c:Lrb/d;

    return-void
.end method

.method public j(I)V
    .locals 0

    iput p1, p0, Lgc/d;->g:I

    return-void
.end method

.method public k(FF)V
    .locals 0

    iput p1, p0, Lgc/d;->e:F

    iput p2, p0, Lgc/d;->f:F

    return-void
.end method
