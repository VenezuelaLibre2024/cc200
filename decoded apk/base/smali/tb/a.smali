.class public final Ltb/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lob/d;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ltb/a;-><init>(IILjava/lang/Integer;ILtd/g;)V

    return-void
.end method

.method public constructor <init>(IILjava/lang/Integer;)V
    .locals 7

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, Ltb/a;-><init>(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/Integer;ILtd/g;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const p1, 0x84c0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const p2, 0x8d65

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Ltb/a;-><init>(IILjava/lang/Integer;)V

    return-void
.end method

.method public constructor <init>(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ltb/a;->b:I

    iput p2, p0, Ltb/a;->c:I

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    new-array p2, p1, [I

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    const-string p1, "glGenTextures"

    invoke-static {p1}, Lob/c;->b(Ljava/lang/String;)V

    aget p1, p2, v0

    :goto_0
    iput p1, p0, Ltb/a;->a:I

    if-nez p3, :cond_1

    new-instance p1, Ltb/a$a;

    invoke-direct {p1, p0, p4, p5, p6}, Ltb/a$a;-><init>(Ltb/a;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-static {p0, p1}, Lob/e;->a(Lob/d;Lsd/a;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget v0, p0, Ltb/a;->c:I

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    const v0, 0x84c0

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    const-string v0, "unbind"

    invoke-static {v0}, Lob/c;->b(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget v0, p0, Ltb/a;->b:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    iget v0, p0, Ltb/a;->c:I

    iget v1, p0, Ltb/a;->a:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    const-string v0, "bind"

    invoke-static {v0}, Lob/c;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Ltb/a;->a:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Ltb/a;->c:I

    return v0
.end method

.method public final e()V
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [I

    iget v2, p0, Ltb/a;->a:I

    const/4 v3, 0x0

    aput v2, v1, v3

    invoke-static {v0, v1, v3}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    return-void
.end method
