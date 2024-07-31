.class public Lgc/e;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lob/b;

.field public b:Lsb/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/Surface;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lob/b;

    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lob/b;-><init>(Landroid/opengl/EGLContext;I)V

    iput-object v0, p0, Lgc/e;->a:Lob/b;

    new-instance v0, Lsb/b;

    iget-object v1, p0, Lgc/e;->a:Lob/b;

    invoke-direct {v0, v1, p1, v2}, Lsb/b;-><init>(Lob/b;Landroid/view/Surface;Z)V

    iput-object v0, p0, Lgc/e;->b:Lsb/b;

    invoke-virtual {v0}, Lsb/a;->c()V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 3

    iget-object v0, p0, Lgc/e;->b:Lsb/b;

    const-wide/16 v1, 0x3e8

    mul-long/2addr p1, v1

    invoke-virtual {v0, p1, p2}, Lsb/a;->e(J)V

    iget-object p1, p0, Lgc/e;->b:Lsb/b;

    invoke-virtual {p1}, Lsb/b;->f()Z

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lgc/e;->b:Lsb/b;

    invoke-virtual {v0}, Lsb/b;->d()V

    iget-object v0, p0, Lgc/e;->a:Lob/b;

    invoke-virtual {v0}, Lob/b;->c()V

    return-void
.end method
