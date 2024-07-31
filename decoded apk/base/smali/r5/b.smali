.class public final Lr5/b;
.super Ls3/f;
.source ""


# instance fields
.field public final u:Lv3/g;

.field public final v:Lp5/a0;

.field public w:J

.field public x:Lr5/a;

.field public y:J


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x6

    invoke-direct {p0, v0}, Ls3/f;-><init>(I)V

    new-instance v0, Lv3/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lv3/g;-><init>(I)V

    iput-object v0, p0, Lr5/b;->u:Lv3/g;

    new-instance v0, Lp5/a0;

    invoke-direct {v0}, Lp5/a0;-><init>()V

    iput-object v0, p0, Lr5/b;->v:Lp5/a0;

    return-void
.end method


# virtual methods
.method public P()V
    .locals 0

    invoke-virtual {p0}, Lr5/b;->a0()V

    return-void
.end method

.method public R(JZ)V
    .locals 0

    const-wide/high16 p1, -0x8000000000000000L

    iput-wide p1, p0, Lr5/b;->y:J

    invoke-virtual {p0}, Lr5/b;->a0()V

    return-void
.end method

.method public V([Ls3/m1;JJ)V
    .locals 0

    iput-wide p4, p0, Lr5/b;->w:J

    return-void
.end method

.method public final Z(Ljava/nio/ByteBuffer;)[F
    .locals 3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lr5/b;->v:Lp5/a0;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lp5/a0;->R([BI)V

    iget-object v0, p0, Lr5/b;->v:Lp5/a0;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p1

    add-int/lit8 p1, p1, 0x4

    invoke-virtual {v0, p1}, Lp5/a0;->T(I)V

    const/4 p1, 0x3

    new-array v0, p1, [F

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    iget-object v2, p0, Lr5/b;->v:Lp5/a0;

    invoke-virtual {v2}, Lp5/a0;->t()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public a(Ls3/m1;)I
    .locals 1

    iget-object p1, p1, Ls3/m1;->s:Ljava/lang/String;

    const-string v0, "application/x-camera-motion"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ls3/j3;->v(I)I

    move-result p1

    return p1
.end method

.method public final a0()V
    .locals 1

    iget-object v0, p0, Lr5/b;->x:Lr5/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lr5/a;->d()V

    :cond_0
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "CameraMotionRenderer"

    return-object v0
.end method

.method public c()Z
    .locals 1

    invoke-virtual {p0}, Ls3/f;->j()Z

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public x(JJ)V
    .locals 4

    :cond_0
    :goto_0
    invoke-virtual {p0}, Ls3/f;->j()Z

    move-result p3

    if-nez p3, :cond_4

    iget-wide p3, p0, Lr5/b;->y:J

    const-wide/32 v0, 0x186a0

    add-long/2addr v0, p1

    cmp-long p3, p3, v0

    if-gez p3, :cond_4

    iget-object p3, p0, Lr5/b;->u:Lv3/g;

    invoke-virtual {p3}, Lv3/g;->l()V

    invoke-virtual {p0}, Ls3/f;->K()Ls3/n1;

    move-result-object p3

    iget-object p4, p0, Lr5/b;->u:Lv3/g;

    const/4 v0, 0x0

    invoke-virtual {p0, p3, p4, v0}, Ls3/f;->W(Ls3/n1;Lv3/g;I)I

    move-result p3

    const/4 p4, -0x4

    if-ne p3, p4, :cond_4

    iget-object p3, p0, Lr5/b;->u:Lv3/g;

    invoke-virtual {p3}, Lv3/a;->q()Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    iget-object p3, p0, Lr5/b;->u:Lv3/g;

    iget-wide v0, p3, Lv3/g;->l:J

    iput-wide v0, p0, Lr5/b;->y:J

    iget-object p4, p0, Lr5/b;->x:Lr5/a;

    if-eqz p4, :cond_0

    invoke-virtual {p3}, Lv3/a;->p()Z

    move-result p3

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    iget-object p3, p0, Lr5/b;->u:Lv3/g;

    invoke-virtual {p3}, Lv3/g;->x()V

    iget-object p3, p0, Lr5/b;->u:Lv3/g;

    iget-object p3, p3, Lv3/g;->j:Ljava/nio/ByteBuffer;

    invoke-static {p3}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p3}, Lr5/b;->Z(Ljava/nio/ByteBuffer;)[F

    move-result-object p3

    if-nez p3, :cond_3

    goto :goto_0

    :cond_3
    iget-object p4, p0, Lr5/b;->x:Lr5/a;

    invoke-static {p4}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lr5/a;

    iget-wide v0, p0, Lr5/b;->y:J

    iget-wide v2, p0, Lr5/b;->w:J

    sub-long/2addr v0, v2

    invoke-interface {p4, v0, v1, p3}, Lr5/a;->a(J[F)V

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method

.method public y(ILjava/lang/Object;)V
    .locals 1

    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    check-cast p2, Lr5/a;

    iput-object p2, p0, Lr5/b;->x:Lr5/a;

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, Ls3/f;->y(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
