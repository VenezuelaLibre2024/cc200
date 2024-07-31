.class public Lu3/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/a0$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu3/b0$a;
    }
.end annotation


# instance fields
.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I


# direct methods
.method public constructor <init>(Lu3/b0$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lu3/b0$a;->a(Lu3/b0$a;)I

    move-result v0

    iput v0, p0, Lu3/b0;->b:I

    invoke-static {p1}, Lu3/b0$a;->b(Lu3/b0$a;)I

    move-result v0

    iput v0, p0, Lu3/b0;->c:I

    invoke-static {p1}, Lu3/b0$a;->c(Lu3/b0$a;)I

    move-result v0

    iput v0, p0, Lu3/b0;->d:I

    invoke-static {p1}, Lu3/b0$a;->d(Lu3/b0$a;)I

    move-result v0

    iput v0, p0, Lu3/b0;->e:I

    invoke-static {p1}, Lu3/b0$a;->e(Lu3/b0$a;)I

    move-result v0

    iput v0, p0, Lu3/b0;->f:I

    invoke-static {p1}, Lu3/b0$a;->f(Lu3/b0$a;)I

    move-result p1

    iput p1, p0, Lu3/b0;->g:I

    return-void
.end method

.method public static b(III)I
    .locals 2

    int-to-long v0, p0

    int-to-long p0, p1

    mul-long/2addr v0, p0

    int-to-long p0, p2

    mul-long/2addr v0, p0

    const-wide/32 p0, 0xf4240

    div-long/2addr v0, p0

    invoke-static {v0, v1}, Lk7/e;->d(J)I

    move-result p0

    return p0
.end method

.method public static d(I)I
    .locals 0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :pswitch_1
    const p0, 0xf906

    return p0

    :pswitch_2
    const p0, 0x52080

    return p0

    :pswitch_3
    const p0, 0x3e800

    return p0

    :pswitch_4
    const/16 p0, 0x1f40

    return p0

    :pswitch_5
    const p0, 0x2ebae4

    return p0

    :pswitch_6
    const/16 p0, 0x1b58

    return p0

    :pswitch_7
    const/16 p0, 0x3e80

    return p0

    :pswitch_8
    const p0, 0x186a0

    return p0

    :pswitch_9
    const p0, 0x9c40

    return p0

    :pswitch_a
    const p0, 0x225510

    return p0

    :pswitch_b
    const p0, 0x2ee00

    return p0

    :pswitch_c
    const p0, 0xbb800

    return p0

    :pswitch_d
    const p0, 0x13880

    return p0

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_c
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public a(IIIIIID)I
    .locals 0

    invoke-virtual/range {p0 .. p6}, Lu3/b0;->c(IIIIII)I

    move-result p2

    int-to-double p2, p2

    mul-double/2addr p2, p7

    double-to-int p2, p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/2addr p1, p4

    add-int/lit8 p1, p1, -0x1

    div-int/2addr p1, p4

    mul-int/2addr p1, p4

    return p1
.end method

.method public c(IIIIII)I
    .locals 0

    if-eqz p3, :cond_2

    const/4 p1, 0x1

    if-eq p3, p1, :cond_1

    const/4 p1, 0x2

    if-ne p3, p1, :cond_0

    invoke-virtual {p0, p2, p6}, Lu3/b0;->f(II)I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p0, p2}, Lu3/b0;->e(I)I

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p0, p1, p5, p4}, Lu3/b0;->g(III)I

    move-result p1

    return p1
.end method

.method public e(I)I
    .locals 4

    invoke-static {p1}, Lu3/b0;->d(I)I

    move-result p1

    iget v0, p0, Lu3/b0;->f:I

    int-to-long v0, v0

    int-to-long v2, p1

    mul-long/2addr v0, v2

    const-wide/32 v2, 0xf4240

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Lk7/e;->d(J)I

    move-result p1

    return p1
.end method

.method public f(II)I
    .locals 2

    iget v0, p0, Lu3/b0;->e:I

    const/4 v1, 0x5

    if-ne p1, v1, :cond_0

    iget v1, p0, Lu3/b0;->g:I

    mul-int/2addr v0, v1

    :cond_0
    const/4 v1, -0x1

    if-eq p2, v1, :cond_1

    const/16 p1, 0x8

    sget-object v1, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    invoke-static {p2, p1, v1}, Lj7/b;->a(IILjava/math/RoundingMode;)I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lu3/b0;->d(I)I

    move-result p1

    :goto_0
    int-to-long v0, v0

    int-to-long p1, p1

    mul-long/2addr v0, p1

    const-wide/32 p1, 0xf4240

    div-long/2addr v0, p1

    invoke-static {v0, v1}, Lk7/e;->d(J)I

    move-result p1

    return p1
.end method

.method public g(III)I
    .locals 2

    iget v0, p0, Lu3/b0;->d:I

    mul-int/2addr p1, v0

    iget v0, p0, Lu3/b0;->b:I

    invoke-static {v0, p2, p3}, Lu3/b0;->b(III)I

    move-result v0

    iget v1, p0, Lu3/b0;->c:I

    invoke-static {v1, p2, p3}, Lu3/b0;->b(III)I

    move-result p2

    invoke-static {p1, v0, p2}, Lp5/n0;->q(III)I

    move-result p1

    return p1
.end method
