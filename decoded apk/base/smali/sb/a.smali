.class public abstract Lsb/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsb/a$a;
    }
.end annotation


# static fields
.field public static final e:Ljava/lang/String;

.field public static final f:Lsb/a$a;


# instance fields
.field public a:I

.field public b:I

.field public c:Lob/b;

.field public d:Landroid/opengl/EGLSurface;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsb/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsb/a$a;-><init>(Ltd/g;)V

    sput-object v0, Lsb/a;->f:Lsb/a$a;

    const-class v0, Lsb/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lsb/a;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lob/b;Landroid/opengl/EGLSurface;)V
    .locals 1

    const-string v0, "eglCore"

    invoke-static {p1, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eglSurface"

    invoke-static {p2, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsb/a;->c:Lob/b;

    iput-object p2, p0, Lsb/a;->d:Landroid/opengl/EGLSurface;

    const/4 p1, -0x1

    iput p1, p0, Lsb/a;->a:I

    iput p1, p0, Lsb/a;->b:I

    return-void
.end method


# virtual methods
.method public final a()Lob/b;
    .locals 1

    iget-object v0, p0, Lsb/a;->c:Lob/b;

    return-object v0
.end method

.method public final b()Landroid/opengl/EGLSurface;
    .locals 1

    iget-object v0, p0, Lsb/a;->d:Landroid/opengl/EGLSurface;

    return-object v0
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lsb/a;->c:Lob/b;

    iget-object v1, p0, Lsb/a;->d:Landroid/opengl/EGLSurface;

    invoke-virtual {v0, v1}, Lob/b;->b(Landroid/opengl/EGLSurface;)V

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lsb/a;->c:Lob/b;

    iget-object v1, p0, Lsb/a;->d:Landroid/opengl/EGLSurface;

    invoke-virtual {v0, v1}, Lob/b;->d(Landroid/opengl/EGLSurface;)V

    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    const-string v1, "EGL14.EGL_NO_SURFACE"

    invoke-static {v0, v1}, Ltd/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lsb/a;->d:Landroid/opengl/EGLSurface;

    const/4 v0, -0x1

    iput v0, p0, Lsb/a;->b:I

    iput v0, p0, Lsb/a;->a:I

    return-void
.end method

.method public final e(J)V
    .locals 2

    iget-object v0, p0, Lsb/a;->c:Lob/b;

    iget-object v1, p0, Lsb/a;->d:Landroid/opengl/EGLSurface;

    invoke-virtual {v0, v1, p1, p2}, Lob/b;->e(Landroid/opengl/EGLSurface;J)V

    return-void
.end method
