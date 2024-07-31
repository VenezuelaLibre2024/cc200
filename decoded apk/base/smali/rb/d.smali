.class public Lrb/d;
.super Lrb/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrb/d$a;
    }
.end annotation


# static fields
.field public static final p:Ljava/lang/String;

.field public static final q:Lrb/d$a;


# instance fields
.field public f:[F

.field public final g:Lrb/b;

.field public h:Ljava/nio/FloatBuffer;

.field public final i:Lrb/b;

.field public final j:Lrb/b;

.field public final k:Lrb/b;

.field public final l:Landroid/graphics/RectF;

.field public m:I

.field public n:Lpb/a;

.field public o:Ltb/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrb/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrb/d$a;-><init>(Ltd/g;)V

    sput-object v0, Lrb/d;->q:Lrb/d$a;

    const-class v0, Lrb/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lrb/d;->p:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lrb/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILtd/g;)V

    return-void
.end method

.method public constructor <init>(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "vertexPositionName"

    invoke-static {p3, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vertexMvpMatrixName"

    invoke-static {p4, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lrb/a;-><init>(IZ)V

    sget-object p1, Lob/c;->a:[F

    invoke-virtual {p1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [F

    iput-object p1, p0, Lrb/d;->f:[F

    const/4 p1, 0x0

    if-eqz p6, :cond_0

    invoke-virtual {p0, p6}, Lrb/a;->e(Ljava/lang/String;)Lrb/b;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p0, Lrb/d;->g:Lrb/b;

    const/16 p2, 0x8

    invoke-static {p2}, Lqb/a;->a(I)Ljava/nio/FloatBuffer;

    move-result-object p2

    iput-object p2, p0, Lrb/d;->h:Ljava/nio/FloatBuffer;

    if-eqz p5, :cond_1

    invoke-virtual {p0, p5}, Lrb/a;->d(Ljava/lang/String;)Lrb/b;

    move-result-object p1

    :cond_1
    iput-object p1, p0, Lrb/d;->i:Lrb/b;

    invoke-virtual {p0, p3}, Lrb/a;->d(Ljava/lang/String;)Lrb/b;

    move-result-object p1

    iput-object p1, p0, Lrb/d;->j:Lrb/b;

    invoke-virtual {p0, p4}, Lrb/a;->e(Ljava/lang/String;)Lrb/b;

    move-result-object p1

    iput-object p1, p0, Lrb/d;->k:Lrb/b;

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lrb/d;->l:Landroid/graphics/RectF;

    const/4 p1, -0x1

    iput p1, p0, Lrb/d;->m:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    const-string v0, "vertexShader"

    invoke-static {p1, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentShader"

    invoke-static {p2, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vertexPositionName"

    invoke-static {p3, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vertexMvpMatrixName"

    invoke-static {p4, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lrb/a;->e:Lrb/a$a;

    invoke-virtual {v0, p1, p2}, Lrb/a$a;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    move-object v1, p0

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lrb/d;-><init>(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILtd/g;)V
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const-string p1, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n"

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    const-string p2, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    const-string p3, "aPosition"

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    const-string p4, "uMVPMatrix"

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    const-string p5, "aTextureCoord"

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    const-string p6, "uTexMatrix"

    :cond_5
    move-object v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move-object p8, v3

    invoke-direct/range {p2 .. p8}, Lrb/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public g(Lpb/b;)V
    .locals 1

    const-string v0, "drawable"

    invoke-static {p1, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lrb/a;->g(Lpb/b;)V

    iget-object p1, p0, Lrb/d;->j:Lrb/b;

    invoke-virtual {p1}, Lrb/b;->a()I

    move-result p1

    invoke-static {p1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    iget-object p1, p0, Lrb/d;->i:Lrb/b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lrb/b;->a()I

    move-result p1

    invoke-static {p1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    :cond_0
    iget-object p1, p0, Lrb/d;->o:Ltb/a;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ltb/a;->a()V

    :cond_1
    const-string p1, "onPostDraw end"

    invoke-static {p1}, Lob/c;->b(Ljava/lang/String;)V

    return-void
.end method

.method public h(Lpb/b;[F)V
    .locals 17

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v0, p2

    const-string v1, "drawable"

    invoke-static {v8, v1}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "modelViewProjectionMatrix"

    invoke-static {v0, v1}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p2}, Lrb/a;->h(Lpb/b;[F)V

    instance-of v1, v8, Lpb/a;

    if-eqz v1, :cond_a

    iget-object v1, v7, Lrb/d;->o:Ltb/a;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ltb/a;->b()V

    :cond_0
    iget-object v1, v7, Lrb/d;->k:Lrb/b;

    invoke-virtual {v1}, Lrb/b;->a()I

    move-result v1

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-static {v1, v9, v10, v0, v10}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    const-string v0, "glUniformMatrix4fv"

    invoke-static {v0}, Lob/c;->b(Ljava/lang/String;)V

    iget-object v1, v7, Lrb/d;->g:Lrb/b;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lrb/b;->a()I

    move-result v1

    iget-object v2, v7, Lrb/d;->f:[F

    invoke-static {v1, v9, v10, v2, v10}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    invoke-static {v0}, Lob/c;->b(Ljava/lang/String;)V

    :cond_1
    iget-object v0, v7, Lrb/d;->j:Lrb/b;

    invoke-virtual {v0}, Lrb/b;->a()I

    move-result v1

    invoke-static {v1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    const-string v11, "glEnableVertexAttribArray"

    invoke-static {v11}, Lob/c;->b(Ljava/lang/String;)V

    invoke-virtual {v0}, Lrb/b;->a()I

    move-result v1

    const/4 v2, 0x2

    const/16 v3, 0x1406

    const/4 v4, 0x0

    invoke-virtual/range {p1 .. p1}, Lpb/b;->g()I

    move-result v5

    invoke-virtual/range {p1 .. p1}, Lpb/b;->d()Ljava/nio/FloatBuffer;

    move-result-object v6

    invoke-static/range {v1 .. v6}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    const-string v12, "glVertexAttribPointer"

    invoke-static {v12}, Lob/c;->b(Ljava/lang/String;)V

    iget-object v13, v7, Lrb/d;->i:Lrb/b;

    if-eqz v13, :cond_9

    iget-object v0, v7, Lrb/d;->n:Lpb/a;

    invoke-static {v8, v0}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v9

    if-nez v0, :cond_3

    invoke-virtual/range {p1 .. p1}, Lpb/b;->e()I

    move-result v0

    iget v1, v7, Lrb/d;->m:I

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, v7, Lrb/d;->h:Ljava/nio/FloatBuffer;

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->rewind()Ljava/nio/Buffer;

    goto/16 :goto_5

    :cond_3
    :goto_0
    move-object v14, v8

    check-cast v14, Lpb/a;

    iput-object v14, v7, Lrb/d;->n:Lpb/a;

    invoke-virtual/range {p1 .. p1}, Lpb/b;->e()I

    move-result v0

    iput v0, v7, Lrb/d;->m:I

    iget-object v0, v7, Lrb/d;->l:Landroid/graphics/RectF;

    invoke-virtual {v14, v0}, Lpb/a;->h(Landroid/graphics/RectF;)V

    invoke-virtual/range {p1 .. p1}, Lpb/b;->f()I

    move-result v0

    mul-int/lit8 v15, v0, 0x2

    iget-object v0, v7, Lrb/d;->h:Ljava/nio/FloatBuffer;

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->capacity()I

    move-result v0

    if-ge v0, v15, :cond_4

    invoke-static {v15}, Lqb/a;->a(I)Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, v7, Lrb/d;->h:Ljava/nio/FloatBuffer;

    :cond_4
    iget-object v0, v7, Lrb/d;->h:Ljava/nio/FloatBuffer;

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->clear()Ljava/nio/Buffer;

    iget-object v0, v7, Lrb/d;->h:Ljava/nio/FloatBuffer;

    invoke-virtual {v0, v15}, Ljava/nio/FloatBuffer;->limit(I)Ljava/nio/Buffer;

    move v6, v10

    :goto_1
    if-ge v6, v15, :cond_8

    rem-int/lit8 v0, v6, 0x2

    if-nez v0, :cond_5

    move/from16 v16, v9

    goto :goto_2

    :cond_5
    move/from16 v16, v10

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lpb/b;->d()Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/nio/FloatBuffer;->get(I)F

    move-result v3

    iget-object v0, v7, Lrb/d;->l:Landroid/graphics/RectF;

    if-eqz v16, :cond_6

    iget v0, v0, Landroid/graphics/RectF;->left:F

    goto :goto_3

    :cond_6
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    :goto_3
    move v4, v0

    iget-object v0, v7, Lrb/d;->l:Landroid/graphics/RectF;

    if-eqz v16, :cond_7

    iget v0, v0, Landroid/graphics/RectF;->right:F

    goto :goto_4

    :cond_7
    iget v0, v0, Landroid/graphics/RectF;->top:F

    :goto_4
    move v5, v0

    div-int/lit8 v1, v6, 0x2

    move-object/from16 v0, p0

    move-object v2, v14

    move v9, v6

    move/from16 v6, v16

    invoke-virtual/range {v0 .. v6}, Lrb/d;->j(ILpb/a;FFFZ)F

    move-result v0

    iget-object v1, v7, Lrb/d;->h:Ljava/nio/FloatBuffer;

    invoke-virtual {v1, v9, v0}, Ljava/nio/FloatBuffer;->put(IF)Ljava/nio/FloatBuffer;

    add-int/lit8 v6, v9, 0x1

    const/4 v9, 0x1

    goto :goto_1

    :cond_8
    :goto_5
    invoke-virtual {v13}, Lrb/b;->a()I

    move-result v0

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    invoke-static {v11}, Lob/c;->b(Ljava/lang/String;)V

    invoke-virtual {v13}, Lrb/b;->a()I

    move-result v1

    const/4 v2, 0x2

    const/16 v3, 0x1406

    const/4 v4, 0x0

    invoke-virtual/range {p1 .. p1}, Lpb/b;->g()I

    move-result v5

    iget-object v6, v7, Lrb/d;->h:Ljava/nio/FloatBuffer;

    invoke-static/range {v1 .. v6}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    invoke-static {v12}, Lob/c;->b(Ljava/lang/String;)V

    :cond_9
    return-void

    :cond_a
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "GlTextureProgram only supports 2D drawables."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i()V
    .locals 1

    invoke-super {p0}, Lrb/a;->i()V

    iget-object v0, p0, Lrb/d;->o:Ltb/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ltb/a;->e()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lrb/d;->o:Ltb/a;

    return-void
.end method

.method public j(ILpb/a;FFFZ)F
    .locals 0

    const-string p1, "drawable"

    invoke-static {p2, p1}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sub-float/2addr p3, p4

    sub-float/2addr p5, p4

    div-float/2addr p3, p5

    const/high16 p1, 0x3f800000    # 1.0f

    mul-float/2addr p3, p1

    const/4 p1, 0x0

    add-float/2addr p3, p1

    return p3
.end method

.method public final k()[F
    .locals 1

    iget-object v0, p0, Lrb/d;->f:[F

    return-object v0
.end method

.method public final l(Ltb/a;)V
    .locals 0

    iput-object p1, p0, Lrb/d;->o:Ltb/a;

    return-void
.end method
