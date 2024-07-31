.class public abstract Lpb/a;
.super Lpb/b;
.source ""


# instance fields
.field public final f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lpb/b;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lpb/a;->f:I

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, Lpb/a;->f:I

    return v0
.end method

.method public final h(Landroid/graphics/RectF;)V
    .locals 7

    const-string v0, "rect"

    invoke-static {p1, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ltd/h;->a:Ltd/h;

    invoke-virtual {v0}, Ltd/h;->a()F

    move-result v1

    neg-float v1, v1

    invoke-virtual {v0}, Ltd/h;->a()F

    move-result v2

    invoke-virtual {v0}, Ltd/h;->a()F

    move-result v3

    invoke-virtual {v0}, Ltd/h;->a()F

    move-result v0

    neg-float v0, v0

    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p0}, Lpb/b;->d()Ljava/nio/FloatBuffer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/nio/FloatBuffer;->hasRemaining()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {p0}, Lpb/b;->d()Ljava/nio/FloatBuffer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/nio/FloatBuffer;->get()F

    move-result v5

    rem-int/lit8 v6, v4, 0x2

    if-nez v6, :cond_0

    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-static {v0, v5}, Ljava/lang/Math;->max(FF)F

    move-result v0

    goto :goto_1

    :cond_0
    invoke-static {v1, v5}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    move-result v2

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lpb/b;->d()Ljava/nio/FloatBuffer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/nio/FloatBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {p1, v3, v1, v0, v2}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method
