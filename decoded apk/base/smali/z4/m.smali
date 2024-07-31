.class public final Lz4/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu4/m0;


# instance fields
.field public final h:I

.field public final i:Lz4/q;

.field public j:I


# direct methods
.method public constructor <init>(Lz4/q;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/m;->i:Lz4/q;

    iput p2, p0, Lz4/m;->h:I

    const/4 p1, -0x1

    iput p1, p0, Lz4/m;->j:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget v0, p0, Lz4/m;->j:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_2

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lz4/m;->i:Lz4/q;

    invoke-virtual {v0}, Lz4/q;->T()V

    goto :goto_0

    :cond_0
    const/4 v1, -0x3

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Lz4/m;->i:Lz4/q;

    invoke-virtual {v1, v0}, Lz4/q;->U(I)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance v0, Lz4/s;

    iget-object v1, p0, Lz4/m;->i:Lz4/q;

    invoke-virtual {v1}, Lz4/q;->s()Lu4/u0;

    move-result-object v1

    iget v2, p0, Lz4/m;->h:I

    invoke-virtual {v1, v2}, Lu4/u0;->b(I)Lu4/s0;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lu4/s0;->b(I)Ls3/m1;

    move-result-object v1

    iget-object v1, v1, Ls3/m1;->s:Ljava/lang/String;

    invoke-direct {v0, v1}, Lz4/s;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()V
    .locals 2

    iget v0, p0, Lz4/m;->j:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp5/a;->a(Z)V

    iget-object v0, p0, Lz4/m;->i:Lz4/q;

    iget v1, p0, Lz4/m;->h:I

    invoke-virtual {v0, v1}, Lz4/q;->x(I)I

    move-result v0

    iput v0, p0, Lz4/m;->j:I

    return-void
.end method

.method public final c()Z
    .locals 2

    iget v0, p0, Lz4/m;->j:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v1, -0x3

    if-eq v0, v1, :cond_0

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()V
    .locals 3

    iget v0, p0, Lz4/m;->j:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lz4/m;->i:Lz4/q;

    iget v2, p0, Lz4/m;->h:I

    invoke-virtual {v0, v2}, Lz4/q;->o0(I)V

    iput v1, p0, Lz4/m;->j:I

    :cond_0
    return-void
.end method

.method public e()Z
    .locals 2

    iget v0, p0, Lz4/m;->j:I

    const/4 v1, -0x3

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lz4/m;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz4/m;->i:Lz4/q;

    iget v1, p0, Lz4/m;->j:I

    invoke-virtual {v0, v1}, Lz4/q;->P(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public j(Ls3/n1;Lv3/g;I)I
    .locals 2

    iget v0, p0, Lz4/m;->j:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_0

    const/4 p1, 0x4

    invoke-virtual {p2, p1}, Lv3/a;->i(I)V

    const/4 p1, -0x4

    return p1

    :cond_0
    invoke-virtual {p0}, Lz4/m;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lz4/m;->i:Lz4/q;

    iget v1, p0, Lz4/m;->j:I

    invoke-virtual {v0, v1, p1, p2, p3}, Lz4/q;->d0(ILs3/n1;Lv3/g;I)I

    move-result v1

    :cond_1
    return v1
.end method

.method public n(J)I
    .locals 2

    invoke-virtual {p0}, Lz4/m;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz4/m;->i:Lz4/q;

    iget v1, p0, Lz4/m;->j:I

    invoke-virtual {v0, v1, p1, p2}, Lz4/q;->n0(IJ)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
