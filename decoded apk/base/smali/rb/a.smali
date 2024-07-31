.class public abstract Lrb/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrb/a$a;
    }
.end annotation


# static fields
.field public static final d:Ljava/lang/String;

.field public static final e:Lrb/a$a;


# instance fields
.field public a:Z

.field public final b:I

.field public final c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrb/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrb/a$a;-><init>(Ltd/g;)V

    sput-object v0, Lrb/a;->e:Lrb/a$a;

    const-class v0, Lrb/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lrb/a;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lrb/a;->b:I

    iput-boolean p2, p0, Lrb/a;->c:Z

    return-void
.end method

.method public static synthetic c(Lrb/a;Lpb/b;[FILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Lpb/b;->c()[F

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lrb/a;->b(Lpb/b;[F)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: draw"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(Lpb/b;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lrb/a;->c(Lrb/a;Lpb/b;[FILjava/lang/Object;)V

    return-void
.end method

.method public final b(Lpb/b;[F)V
    .locals 1

    const-string v0, "drawable"

    invoke-static {p1, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelViewProjectionMatrix"

    invoke-static {p2, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "draw start"

    invoke-static {v0}, Lob/c;->b(Ljava/lang/String;)V

    iget v0, p0, Lrb/a;->b:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    const-string v0, "glUseProgram"

    invoke-static {v0}, Lob/c;->b(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lrb/a;->h(Lpb/b;[F)V

    invoke-virtual {p0, p1}, Lrb/a;->f(Lpb/b;)V

    invoke-virtual {p0, p1}, Lrb/a;->g(Lpb/b;)V

    const/4 p1, 0x0

    invoke-static {p1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    const-string p1, "draw end"

    invoke-static {p1}, Lob/c;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)Lrb/b;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lrb/b;->c:Lrb/b$a;

    iget v1, p0, Lrb/a;->b:I

    invoke-virtual {v0, v1, p1}, Lrb/b$a;->a(ILjava/lang/String;)Lrb/b;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/String;)Lrb/b;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lrb/b;->c:Lrb/b$a;

    iget v1, p0, Lrb/a;->b:I

    invoke-virtual {v0, v1, p1}, Lrb/b$a;->b(ILjava/lang/String;)Lrb/b;

    move-result-object p1

    return-object p1
.end method

.method public f(Lpb/b;)V
    .locals 1

    const-string v0, "drawable"

    invoke-static {p1, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpb/b;->a()V

    return-void
.end method

.method public g(Lpb/b;)V
    .locals 1

    const-string v0, "drawable"

    invoke-static {p1, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public h(Lpb/b;[F)V
    .locals 1

    const-string v0, "drawable"

    invoke-static {p1, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "modelViewProjectionMatrix"

    invoke-static {p2, p1}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public i()V
    .locals 1

    iget-boolean v0, p0, Lrb/a;->a:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lrb/a;->c:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lrb/a;->b:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lrb/a;->a:Z

    :cond_0
    return-void
.end method
