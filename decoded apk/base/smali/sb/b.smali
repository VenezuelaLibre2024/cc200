.class public Lsb/b;
.super Lsb/a;
.source ""


# instance fields
.field public g:Landroid/view/Surface;

.field public h:Z


# direct methods
.method public constructor <init>(Lob/b;Landroid/view/Surface;Z)V
    .locals 1

    const-string v0, "eglCore"

    invoke-static {p1, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "surface"

    invoke-static {p2, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lob/b;->a(Ljava/lang/Object;)Landroid/opengl/EGLSurface;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lsb/a;-><init>(Lob/b;Landroid/opengl/EGLSurface;)V

    iput-object p2, p0, Lsb/b;->g:Landroid/view/Surface;

    iput-boolean p3, p0, Lsb/b;->h:Z

    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    invoke-super {p0}, Lsb/a;->d()V

    iget-boolean v0, p0, Lsb/b;->h:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lsb/b;->g:Landroid/view/Surface;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lsb/b;->g:Landroid/view/Surface;

    :cond_1
    return-void
.end method

.method public final f()Z
    .locals 2

    invoke-virtual {p0}, Lsb/a;->a()Lob/b;

    move-result-object v0

    invoke-virtual {p0}, Lsb/a;->b()Landroid/opengl/EGLSurface;

    move-result-object v1

    invoke-virtual {v0, v1}, Lob/b;->f(Landroid/opengl/EGLSurface;)Z

    move-result v0

    return v0
.end method
