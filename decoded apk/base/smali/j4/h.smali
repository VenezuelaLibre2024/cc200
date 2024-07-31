.class public final Lj4/h;
.super Lv3/g;
.source ""


# instance fields
.field public p:J

.field public q:I

.field public r:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lv3/g;-><init>(I)V

    const/16 v0, 0x20

    iput v0, p0, Lj4/h;->r:I

    return-void
.end method


# virtual methods
.method public B(Lv3/g;)Z
    .locals 4

    invoke-virtual {p1}, Lv3/g;->y()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lp5/a;->a(Z)V

    invoke-virtual {p1}, Lv3/a;->o()Z

    move-result v0

    xor-int/2addr v0, v1

    invoke-static {v0}, Lp5/a;->a(Z)V

    invoke-virtual {p1}, Lv3/a;->q()Z

    move-result v0

    xor-int/2addr v0, v1

    invoke-static {v0}, Lp5/a;->a(Z)V

    invoke-virtual {p0, p1}, Lj4/h;->C(Lv3/g;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget v0, p0, Lj4/h;->q:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lj4/h;->q:I

    if-nez v0, :cond_1

    iget-wide v2, p1, Lv3/g;->l:J

    iput-wide v2, p0, Lv3/g;->l:J

    invoke-virtual {p1}, Lv3/a;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1}, Lv3/a;->u(I)V

    :cond_1
    invoke-virtual {p1}, Lv3/a;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    const/high16 v0, -0x80000000

    invoke-virtual {p0, v0}, Lv3/a;->u(I)V

    :cond_2
    iget-object v0, p1, Lv3/g;->j:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    invoke-virtual {p0, v2}, Lv3/g;->w(I)V

    iget-object v2, p0, Lv3/g;->j:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    :cond_3
    iget-wide v2, p1, Lv3/g;->l:J

    iput-wide v2, p0, Lj4/h;->p:J

    return v1
.end method

.method public final C(Lv3/g;)Z
    .locals 4

    invoke-virtual {p0}, Lj4/h;->G()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Lj4/h;->q:I

    iget v2, p0, Lj4/h;->r:I

    const/4 v3, 0x0

    if-lt v0, v2, :cond_1

    return v3

    :cond_1
    invoke-virtual {p1}, Lv3/a;->p()Z

    move-result v0

    invoke-virtual {p0}, Lv3/a;->p()Z

    move-result v2

    if-eq v0, v2, :cond_2

    return v3

    :cond_2
    iget-object p1, p1, Lv3/g;->j:Ljava/nio/ByteBuffer;

    if-eqz p1, :cond_3

    iget-object v0, p0, Lv3/g;->j:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result p1

    add-int/2addr v0, p1

    const p1, 0x2ee000

    if-le v0, p1, :cond_3

    return v3

    :cond_3
    return v1
.end method

.method public D()J
    .locals 2

    iget-wide v0, p0, Lv3/g;->l:J

    return-wide v0
.end method

.method public E()J
    .locals 2

    iget-wide v0, p0, Lj4/h;->p:J

    return-wide v0
.end method

.method public F()I
    .locals 1

    iget v0, p0, Lj4/h;->q:I

    return v0
.end method

.method public G()Z
    .locals 1

    iget v0, p0, Lj4/h;->q:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public H(I)V
    .locals 1

    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp5/a;->a(Z)V

    iput p1, p0, Lj4/h;->r:I

    return-void
.end method

.method public l()V
    .locals 1

    invoke-super {p0}, Lv3/g;->l()V

    const/4 v0, 0x0

    iput v0, p0, Lj4/h;->q:I

    return-void
.end method
