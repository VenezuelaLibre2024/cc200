.class public abstract Ls3/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/b3;


# instance fields
.field public final a:Ls3/u3$d;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls3/u3$d;

    invoke-direct {v0}, Ls3/u3$d;-><init>()V

    iput-object v0, p0, Ls3/e;->a:Ls3/u3$d;

    return-void
.end method


# virtual methods
.method public final C()Z
    .locals 3

    invoke-interface {p0}, Ls3/b3;->F()Ls3/u3;

    move-result-object v0

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Ls3/b3;->A()I

    move-result v1

    iget-object v2, p0, Ls3/e;->a:Ls3/u3$d;

    invoke-virtual {v0, v1, v2}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object v0

    iget-boolean v0, v0, Ls3/u3$d;->p:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final I()Z
    .locals 3

    invoke-interface {p0}, Ls3/b3;->F()Ls3/u3;

    move-result-object v0

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Ls3/b3;->A()I

    move-result v1

    iget-object v2, p0, Ls3/e;->a:Ls3/u3$d;

    invoke-virtual {v0, v1, v2}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object v0

    invoke-virtual {v0}, Ls3/u3$d;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final J()J
    .locals 3

    invoke-interface {p0}, Ls3/b3;->F()Ls3/u3;

    move-result-object v0

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ls3/b3;->A()I

    move-result v1

    iget-object v2, p0, Ls3/e;->a:Ls3/u3$d;

    invoke-virtual {v0, v1, v2}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object v0

    invoke-virtual {v0}, Ls3/u3$d;->f()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final K()I
    .locals 4

    invoke-interface {p0}, Ls3/b3;->F()Ls3/u3;

    move-result-object v0

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ls3/b3;->A()I

    move-result v1

    invoke-virtual {p0}, Ls3/e;->M()I

    move-result v2

    invoke-interface {p0}, Ls3/b3;->G()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Ls3/u3;->i(IIZ)I

    move-result v0

    :goto_0
    return v0
.end method

.method public final L()I
    .locals 4

    invoke-interface {p0}, Ls3/b3;->F()Ls3/u3;

    move-result-object v0

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ls3/b3;->A()I

    move-result v1

    invoke-virtual {p0}, Ls3/e;->M()I

    move-result v2

    invoke-interface {p0}, Ls3/b3;->G()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Ls3/u3;->p(IIZ)I

    move-result v0

    :goto_0
    return v0
.end method

.method public final M()I
    .locals 2

    invoke-interface {p0}, Ls3/b3;->E()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method

.method public abstract N(IJIZ)V
.end method

.method public final O(JI)V
    .locals 6

    invoke-interface {p0}, Ls3/b3;->A()I

    move-result v1

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v2, p1

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Ls3/e;->N(IJIZ)V

    return-void
.end method

.method public final P(II)V
    .locals 6

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move v4, p2

    invoke-virtual/range {v0 .. v5}, Ls3/e;->N(IJIZ)V

    return-void
.end method

.method public final b(J)V
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, p1, p2, v0}, Ls3/e;->O(JI)V

    return-void
.end method

.method public final m()V
    .locals 2

    invoke-interface {p0}, Ls3/b3;->A()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Ls3/e;->P(II)V

    return-void
.end method

.method public final n()Z
    .locals 2

    invoke-virtual {p0}, Ls3/e;->L()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final u()Z
    .locals 3

    invoke-interface {p0}, Ls3/b3;->F()Ls3/u3;

    move-result-object v0

    invoke-virtual {v0}, Ls3/u3;->u()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Ls3/b3;->A()I

    move-result v1

    iget-object v2, p0, Ls3/e;->a:Ls3/u3$d;

    invoke-virtual {v0, v1, v2}, Ls3/u3;->r(ILs3/u3$d;)Ls3/u3$d;

    move-result-object v0

    iget-boolean v0, v0, Ls3/u3$d;->o:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final y()Z
    .locals 2

    invoke-virtual {p0}, Ls3/e;->K()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
