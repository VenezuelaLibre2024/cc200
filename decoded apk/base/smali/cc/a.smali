.class public Lcc/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcc/e;


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcc/a;->a:I

    const p1, 0x7fffffff

    iput p1, p0, Lcc/a;->b:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcc/a;->a:I

    iput p2, p0, Lcc/a;->b:I

    return-void
.end method


# virtual methods
.method public a(Lcc/f;)Lcc/f;
    .locals 3

    invoke-virtual {p1}, Lcc/f;->b()I

    move-result v0

    iget v1, p0, Lcc/a;->a:I

    if-gt v0, v1, :cond_0

    invoke-virtual {p1}, Lcc/f;->a()I

    move-result v0

    iget v1, p0, Lcc/a;->b:I

    if-gt v0, v1, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcc/f;->b()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcc/a;->a:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-virtual {p1}, Lcc/f;->a()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcc/a;->b:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {p1}, Lcc/f;->b()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, Lcc/f;->a()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v2, p1

    cmpl-float p1, v1, v0

    if-ltz p1, :cond_1

    iget p1, p0, Lcc/a;->b:I

    int-to-float v0, p1

    mul-float/2addr v0, v2

    float-to-int v0, v0

    goto :goto_0

    :cond_1
    iget v0, p0, Lcc/a;->a:I

    int-to-float p1, v0

    div-float/2addr p1, v2

    float-to-int p1, p1

    :goto_0
    rem-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_2

    add-int/lit8 v0, v0, -0x1

    :cond_2
    rem-int/lit8 v1, p1, 0x2

    if-eqz v1, :cond_3

    add-int/lit8 p1, p1, -0x1

    :cond_3
    new-instance v1, Lcc/f;

    invoke-direct {v1, v0, p1}, Lcc/f;-><init>(II)V

    return-object v1
.end method
