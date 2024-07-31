.class public Lx1/q;
.super Lx1/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/q$b;
    }
.end annotation


# instance fields
.field public Q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lx1/m;",
            ">;"
        }
    .end annotation
.end field

.field public R:Z

.field public S:I

.field public T:Z

.field public U:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lx1/m;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx1/q;->R:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx1/q;->T:Z

    iput v0, p0, Lx1/q;->U:I

    return-void
.end method


# virtual methods
.method public R(Landroid/view/View;)V
    .locals 3

    invoke-super {p0, p1}, Lx1/m;->R(Landroid/view/View;)V

    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx1/m;

    invoke-virtual {v2, p1}, Lx1/m;->R(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic T(Lx1/m$f;)Lx1/m;
    .locals 0

    invoke-virtual {p0, p1}, Lx1/q;->m0(Lx1/m$f;)Lx1/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic U(Landroid/view/View;)Lx1/m;
    .locals 0

    invoke-virtual {p0, p1}, Lx1/q;->n0(Landroid/view/View;)Lx1/q;

    move-result-object p1

    return-object p1
.end method

.method public V(Landroid/view/View;)V
    .locals 3

    invoke-super {p0, p1}, Lx1/m;->V(Landroid/view/View;)V

    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx1/m;

    invoke-virtual {v2, p1}, Lx1/m;->V(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public X()V
    .locals 4

    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lx1/m;->e0()V

    invoke-virtual {p0}, Lx1/m;->s()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lx1/q;->s0()V

    iget-boolean v0, p0, Lx1/q;->R:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/m;

    iget-object v2, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx1/m;

    new-instance v3, Lx1/q$a;

    invoke-direct {v3, p0, v2}, Lx1/q$a;-><init>(Lx1/q;Lx1/m;)V

    invoke-virtual {v1, v3}, Lx1/m;->b(Lx1/m$f;)Lx1/m;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx1/m;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lx1/m;->X()V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/m;

    invoke-virtual {v1}, Lx1/m;->X()V

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public bridge synthetic Y(J)Lx1/m;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx1/q;->o0(J)Lx1/q;

    move-result-object p1

    return-object p1
.end method

.method public Z(Lx1/m$e;)V
    .locals 3

    invoke-super {p0, p1}, Lx1/m;->Z(Lx1/m$e;)V

    iget v0, p0, Lx1/q;->U:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lx1/q;->U:I

    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx1/m;

    invoke-virtual {v2, p1}, Lx1/m;->Z(Lx1/m$e;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic a0(Landroid/animation/TimeInterpolator;)Lx1/m;
    .locals 0

    invoke-virtual {p0, p1}, Lx1/q;->p0(Landroid/animation/TimeInterpolator;)Lx1/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lx1/m$f;)Lx1/m;
    .locals 0

    invoke-virtual {p0, p1}, Lx1/q;->g0(Lx1/m$f;)Lx1/q;

    move-result-object p1

    return-object p1
.end method

.method public b0(Lx1/g;)V
    .locals 2

    invoke-super {p0, p1}, Lx1/m;->b0(Lx1/g;)V

    iget v0, p0, Lx1/q;->U:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lx1/q;->U:I

    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/m;

    invoke-virtual {v1, p1}, Lx1/m;->b0(Lx1/g;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic c(Landroid/view/View;)Lx1/m;
    .locals 0

    invoke-virtual {p0, p1}, Lx1/q;->h0(Landroid/view/View;)Lx1/q;

    move-result-object p1

    return-object p1
.end method

.method public c0(Lx1/p;)V
    .locals 3

    invoke-super {p0, p1}, Lx1/m;->c0(Lx1/p;)V

    iget v0, p0, Lx1/q;->U:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lx1/q;->U:I

    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx1/m;

    invoke-virtual {v2, p1}, Lx1/m;->c0(Lx1/p;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lx1/q;->p()Lx1/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d0(J)Lx1/m;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx1/q;->r0(J)Lx1/q;

    move-result-object p1

    return-object p1
.end method

.method public f0(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-super {p0, p1}, Lx1/m;->f0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx1/m;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lx1/m;->f0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public g0(Lx1/m$f;)Lx1/q;
    .locals 0

    invoke-super {p0, p1}, Lx1/m;->b(Lx1/m$f;)Lx1/m;

    move-result-object p1

    check-cast p1, Lx1/q;

    return-object p1
.end method

.method public h()V
    .locals 3

    invoke-super {p0}, Lx1/m;->h()V

    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx1/m;

    invoke-virtual {v2}, Lx1/m;->h()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h0(Landroid/view/View;)Lx1/q;
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/m;

    invoke-virtual {v1, p1}, Lx1/m;->c(Landroid/view/View;)Lx1/m;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lx1/m;->c(Landroid/view/View;)Lx1/m;

    move-result-object p1

    check-cast p1, Lx1/q;

    return-object p1
.end method

.method public i(Lx1/s;)V
    .locals 3

    iget-object v0, p1, Lx1/s;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, Lx1/m;->K(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/m;

    iget-object v2, p1, Lx1/s;->b:Landroid/view/View;

    invoke-virtual {v1, v2}, Lx1/m;->K(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1}, Lx1/m;->i(Lx1/s;)V

    iget-object v2, p1, Lx1/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public i0(Lx1/m;)Lx1/q;
    .locals 4

    invoke-virtual {p0, p1}, Lx1/q;->j0(Lx1/m;)V

    iget-wide v0, p0, Lx1/m;->j:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    invoke-virtual {p1, v0, v1}, Lx1/m;->Y(J)Lx1/m;

    :cond_0
    iget v0, p0, Lx1/q;->U:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lx1/m;->v()Landroid/animation/TimeInterpolator;

    move-result-object v0

    invoke-virtual {p1, v0}, Lx1/m;->a0(Landroid/animation/TimeInterpolator;)Lx1/m;

    :cond_1
    iget v0, p0, Lx1/q;->U:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lx1/m;->z()Lx1/p;

    move-result-object v0

    invoke-virtual {p1, v0}, Lx1/m;->c0(Lx1/p;)V

    :cond_2
    iget v0, p0, Lx1/q;->U:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lx1/m;->y()Lx1/g;

    move-result-object v0

    invoke-virtual {p1, v0}, Lx1/m;->b0(Lx1/g;)V

    :cond_3
    iget v0, p0, Lx1/q;->U:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lx1/m;->u()Lx1/m$e;

    move-result-object v0

    invoke-virtual {p1, v0}, Lx1/m;->Z(Lx1/m$e;)V

    :cond_4
    return-object p0
.end method

.method public final j0(Lx1/m;)V
    .locals 1

    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p0, p1, Lx1/m;->y:Lx1/q;

    return-void
.end method

.method public k0(I)Lx1/m;
    .locals 1

    if-ltz p1, :cond_1

    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx1/m;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public l(Lx1/s;)V
    .locals 3

    invoke-super {p0, p1}, Lx1/m;->l(Lx1/s;)V

    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx1/m;

    invoke-virtual {v2, p1}, Lx1/m;->l(Lx1/s;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public l0()I
    .locals 1

    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public m(Lx1/s;)V
    .locals 3

    iget-object v0, p1, Lx1/s;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, Lx1/m;->K(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/m;

    iget-object v2, p1, Lx1/s;->b:Landroid/view/View;

    invoke-virtual {v1, v2}, Lx1/m;->K(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1}, Lx1/m;->m(Lx1/s;)V

    iget-object v2, p1, Lx1/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public m0(Lx1/m$f;)Lx1/q;
    .locals 0

    invoke-super {p0, p1}, Lx1/m;->T(Lx1/m$f;)Lx1/m;

    move-result-object p1

    check-cast p1, Lx1/q;

    return-object p1
.end method

.method public n0(Landroid/view/View;)Lx1/q;
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/m;

    invoke-virtual {v1, p1}, Lx1/m;->U(Landroid/view/View;)Lx1/m;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lx1/m;->U(Landroid/view/View;)Lx1/m;

    move-result-object p1

    check-cast p1, Lx1/q;

    return-object p1
.end method

.method public o0(J)Lx1/q;
    .locals 4

    invoke-super {p0, p1, p2}, Lx1/m;->Y(J)Lx1/m;

    iget-wide v0, p0, Lx1/m;->j:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx1/m;

    invoke-virtual {v2, p1, p2}, Lx1/m;->Y(J)Lx1/m;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public p()Lx1/m;
    .locals 4

    invoke-super {p0}, Lx1/m;->p()Lx1/m;

    move-result-object v0

    check-cast v0, Lx1/q;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lx1/q;->Q:Ljava/util/ArrayList;

    iget-object v1, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    iget-object v3, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx1/m;

    invoke-virtual {v3}, Lx1/m;->p()Lx1/m;

    move-result-object v3

    invoke-virtual {v0, v3}, Lx1/q;->j0(Lx1/m;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public p0(Landroid/animation/TimeInterpolator;)Lx1/q;
    .locals 3

    iget v0, p0, Lx1/q;->U:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lx1/q;->U:I

    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx1/m;

    invoke-virtual {v2, p1}, Lx1/m;->a0(Landroid/animation/TimeInterpolator;)Lx1/m;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lx1/m;->a0(Landroid/animation/TimeInterpolator;)Lx1/m;

    move-result-object p1

    check-cast p1, Lx1/q;

    return-object p1
.end method

.method public q0(I)Lx1/q;
    .locals 3

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lx1/q;->R:Z

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid parameter for TransitionSet ordering: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-boolean v0, p0, Lx1/q;->R:Z

    :goto_0
    return-object p0
.end method

.method public r(Landroid/view/ViewGroup;Lx1/t;Lx1/t;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Lx1/t;",
            "Lx1/t;",
            "Ljava/util/ArrayList<",
            "Lx1/s;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lx1/s;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    invoke-virtual {p0}, Lx1/m;->B()J

    move-result-wide v1

    iget-object v3, v0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    iget-object v5, v0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lx1/m;

    const-wide/16 v7, 0x0

    cmp-long v5, v1, v7

    if-lez v5, :cond_2

    iget-boolean v5, v0, Lx1/q;->R:Z

    if-nez v5, :cond_0

    if-nez v4, :cond_2

    :cond_0
    invoke-virtual {v6}, Lx1/m;->B()J

    move-result-wide v9

    cmp-long v5, v9, v7

    if-lez v5, :cond_1

    add-long/2addr v9, v1

    invoke-virtual {v6, v9, v10}, Lx1/m;->d0(J)Lx1/m;

    goto :goto_1

    :cond_1
    invoke-virtual {v6, v1, v2}, Lx1/m;->d0(J)Lx1/m;

    :cond_2
    :goto_1
    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    invoke-virtual/range {v6 .. v11}, Lx1/m;->r(Landroid/view/ViewGroup;Lx1/t;Lx1/t;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public r0(J)Lx1/q;
    .locals 0

    invoke-super {p0, p1, p2}, Lx1/m;->d0(J)Lx1/m;

    move-result-object p1

    check-cast p1, Lx1/q;

    return-object p1
.end method

.method public final s0()V
    .locals 3

    new-instance v0, Lx1/q$b;

    invoke-direct {v0, p0}, Lx1/q$b;-><init>(Lx1/q;)V

    iget-object v1, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx1/m;

    invoke-virtual {v2, v0}, Lx1/m;->b(Lx1/m$f;)Lx1/m;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx1/q;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lx1/q;->S:I

    return-void
.end method
