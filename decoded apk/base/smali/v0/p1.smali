.class public Lv0/p1;
.super Lv0/n1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv0/n1<",
        "Lv0/o1;",
        "Lv0/o1;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lv0/n1;-><init>()V

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Object;)Lv0/o1;
    .locals 0

    check-cast p1, Lv0/y;

    iget-object p1, p1, Lv0/y;->unknownFields:Lv0/o1;

    return-object p1
.end method

.method public B(Lv0/o1;)I
    .locals 0

    invoke-virtual {p1}, Lv0/o1;->f()I

    move-result p1

    return p1
.end method

.method public C(Lv0/o1;)I
    .locals 0

    invoke-virtual {p1}, Lv0/o1;->g()I

    move-result p1

    return p1
.end method

.method public D(Lv0/o1;Lv0/o1;)Lv0/o1;
    .locals 1

    invoke-static {}, Lv0/o1;->e()Lv0/o1;

    move-result-object v0

    invoke-virtual {p2, v0}, Lv0/o1;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lv0/o1;->k(Lv0/o1;Lv0/o1;)Lv0/o1;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public E()Lv0/o1;
    .locals 1

    invoke-static {}, Lv0/o1;->l()Lv0/o1;

    move-result-object v0

    return-object v0
.end method

.method public F(Ljava/lang/Object;Lv0/o1;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lv0/p1;->G(Ljava/lang/Object;Lv0/o1;)V

    return-void
.end method

.method public G(Ljava/lang/Object;Lv0/o1;)V
    .locals 0

    check-cast p1, Lv0/y;

    iput-object p2, p1, Lv0/y;->unknownFields:Lv0/o1;

    return-void
.end method

.method public H(Lv0/o1;)Lv0/o1;
    .locals 0

    invoke-virtual {p1}, Lv0/o1;->j()V

    return-object p1
.end method

.method public I(Lv0/o1;Lv0/u1;)V
    .locals 0

    invoke-virtual {p1, p2}, Lv0/o1;->o(Lv0/u1;)V

    return-void
.end method

.method public J(Lv0/o1;Lv0/u1;)V
    .locals 0

    invoke-virtual {p1, p2}, Lv0/o1;->q(Lv0/u1;)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;II)V
    .locals 0

    check-cast p1, Lv0/o1;

    invoke-virtual {p0, p1, p2, p3}, Lv0/p1;->u(Lv0/o1;II)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;IJ)V
    .locals 0

    check-cast p1, Lv0/o1;

    invoke-virtual {p0, p1, p2, p3, p4}, Lv0/p1;->v(Lv0/o1;IJ)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    check-cast p1, Lv0/o1;

    check-cast p3, Lv0/o1;

    invoke-virtual {p0, p1, p2, p3}, Lv0/p1;->w(Lv0/o1;ILv0/o1;)V

    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;ILv0/h;)V
    .locals 0

    check-cast p1, Lv0/o1;

    invoke-virtual {p0, p1, p2, p3}, Lv0/p1;->x(Lv0/o1;ILv0/h;)V

    return-void
.end method

.method public bridge synthetic e(Ljava/lang/Object;IJ)V
    .locals 0

    check-cast p1, Lv0/o1;

    invoke-virtual {p0, p1, p2, p3, p4}, Lv0/p1;->y(Lv0/o1;IJ)V

    return-void
.end method

.method public bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lv0/p1;->z(Ljava/lang/Object;)Lv0/o1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lv0/p1;->A(Ljava/lang/Object;)Lv0/o1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic h(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lv0/o1;

    invoke-virtual {p0, p1}, Lv0/p1;->B(Lv0/o1;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic i(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lv0/o1;

    invoke-virtual {p0, p1}, Lv0/p1;->C(Lv0/o1;)I

    move-result p1

    return p1
.end method

.method public j(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lv0/p1;->A(Ljava/lang/Object;)Lv0/o1;

    move-result-object p1

    invoke-virtual {p1}, Lv0/o1;->j()V

    return-void
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv0/o1;

    check-cast p2, Lv0/o1;

    invoke-virtual {p0, p1, p2}, Lv0/p1;->D(Lv0/o1;Lv0/o1;)Lv0/o1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic n()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lv0/p1;->E()Lv0/o1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lv0/o1;

    invoke-virtual {p0, p1, p2}, Lv0/p1;->F(Ljava/lang/Object;Lv0/o1;)V

    return-void
.end method

.method public bridge synthetic p(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lv0/o1;

    invoke-virtual {p0, p1, p2}, Lv0/p1;->G(Ljava/lang/Object;Lv0/o1;)V

    return-void
.end method

.method public q(Lv0/f1;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv0/o1;

    invoke-virtual {p0, p1}, Lv0/p1;->H(Lv0/o1;)Lv0/o1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Lv0/u1;)V
    .locals 0

    check-cast p1, Lv0/o1;

    invoke-virtual {p0, p1, p2}, Lv0/p1;->I(Lv0/o1;Lv0/u1;)V

    return-void
.end method

.method public bridge synthetic t(Ljava/lang/Object;Lv0/u1;)V
    .locals 0

    check-cast p1, Lv0/o1;

    invoke-virtual {p0, p1, p2}, Lv0/p1;->J(Lv0/o1;Lv0/u1;)V

    return-void
.end method

.method public u(Lv0/o1;II)V
    .locals 1

    const/4 v0, 0x5

    invoke-static {p2, v0}, Lv0/t1;->c(II)I

    move-result p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lv0/o1;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public v(Lv0/o1;IJ)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p2, v0}, Lv0/t1;->c(II)I

    move-result p2

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lv0/o1;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public w(Lv0/o1;ILv0/o1;)V
    .locals 1

    const/4 v0, 0x3

    invoke-static {p2, v0}, Lv0/t1;->c(II)I

    move-result p2

    invoke-virtual {p1, p2, p3}, Lv0/o1;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public x(Lv0/o1;ILv0/h;)V
    .locals 1

    const/4 v0, 0x2

    invoke-static {p2, v0}, Lv0/t1;->c(II)I

    move-result p2

    invoke-virtual {p1, p2, p3}, Lv0/o1;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public y(Lv0/o1;IJ)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lv0/t1;->c(II)I

    move-result p2

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lv0/o1;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public z(Ljava/lang/Object;)Lv0/o1;
    .locals 2

    invoke-virtual {p0, p1}, Lv0/p1;->A(Ljava/lang/Object;)Lv0/o1;

    move-result-object v0

    invoke-static {}, Lv0/o1;->e()Lv0/o1;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lv0/o1;->l()Lv0/o1;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lv0/p1;->G(Ljava/lang/Object;Lv0/o1;)V

    :cond_0
    return-object v0
.end method
