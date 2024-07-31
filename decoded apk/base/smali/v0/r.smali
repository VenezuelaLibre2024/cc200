.class public final Lv0/r;
.super Lv0/q;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv0/q<",
        "Lv0/y$d;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lv0/q;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map$Entry;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "**>;)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv0/y$d;

    invoke-virtual {p1}, Lv0/y$d;->a()I

    move-result p1

    return p1
.end method

.method public b(Lv0/p;Lv0/r0;I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1, p2, p3}, Lv0/p;->a(Lv0/r0;I)Lv0/y$e;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Object;)Lv0/u;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lv0/u<",
            "Lv0/y$d;",
            ">;"
        }
    .end annotation

    check-cast p1, Lv0/y$c;

    iget-object p1, p1, Lv0/y$c;->extensions:Lv0/u;

    return-object p1
.end method

.method public d(Ljava/lang/Object;)Lv0/u;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lv0/u<",
            "Lv0/y$d;",
            ">;"
        }
    .end annotation

    check-cast p1, Lv0/y$c;

    invoke-virtual {p1}, Lv0/y$c;->L()Lv0/u;

    move-result-object p1

    return-object p1
.end method

.method public e(Lv0/r0;)Z
    .locals 0

    instance-of p1, p1, Lv0/y$c;

    return p1
.end method

.method public f(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lv0/r;->c(Ljava/lang/Object;)Lv0/u;

    move-result-object p1

    invoke-virtual {p1}, Lv0/u;->t()V

    return-void
.end method

.method public g(Lv0/f1;Ljava/lang/Object;Lv0/p;Lv0/u;Ljava/lang/Object;Lv0/n1;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Lv0/f1;",
            "Ljava/lang/Object;",
            "Lv0/p;",
            "Lv0/u<",
            "Lv0/y$d;",
            ">;TUB;",
            "Lv0/n1<",
            "TUT;TUB;>;)TUB;"
        }
    .end annotation

    check-cast p2, Lv0/y$e;

    invoke-virtual {p2}, Lv0/y$e;->c()I

    move-result v0

    iget-object v1, p2, Lv0/y$e;->b:Lv0/y$d;

    invoke-virtual {v1}, Lv0/y$d;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p2, Lv0/y$e;->b:Lv0/y$d;

    invoke-virtual {v1}, Lv0/y$d;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p3, Lv0/r$a;->a:[I

    invoke-virtual {p2}, Lv0/y$e;->a()Lv0/t1$b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget p3, p3, v1

    packed-switch p3, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Type cannot be packed: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Lv0/y$e;->b:Lv0/y$d;

    invoke-virtual {p2}, Lv0/y$d;->e()Lv0/t1$b;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lv0/f1;->s(Ljava/util/List;)V

    iget-object p1, p2, Lv0/y$e;->b:Lv0/y$d;

    invoke-virtual {p1}, Lv0/y$d;->c()Lv0/a0$d;

    move-result-object p1

    invoke-static {v0, p3, p1, p5, p6}, Lv0/i1;->z(ILjava/util/List;Lv0/a0$d;Ljava/lang/Object;Lv0/n1;)Ljava/lang/Object;

    move-result-object p5

    goto/16 :goto_0

    :pswitch_1
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lv0/f1;->e(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_2
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lv0/f1;->a(Ljava/util/List;)V

    goto :goto_0

    :pswitch_3
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lv0/f1;->o(Ljava/util/List;)V

    goto :goto_0

    :pswitch_4
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lv0/f1;->d(Ljava/util/List;)V

    goto :goto_0

    :pswitch_5
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lv0/f1;->f(Ljava/util/List;)V

    goto :goto_0

    :pswitch_6
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lv0/f1;->A(Ljava/util/List;)V

    goto :goto_0

    :pswitch_7
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lv0/f1;->w(Ljava/util/List;)V

    goto :goto_0

    :pswitch_8
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lv0/f1;->O(Ljava/util/List;)V

    goto :goto_0

    :pswitch_9
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lv0/f1;->r(Ljava/util/List;)V

    goto :goto_0

    :pswitch_a
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lv0/f1;->j(Ljava/util/List;)V

    goto :goto_0

    :pswitch_b
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lv0/f1;->n(Ljava/util/List;)V

    goto :goto_0

    :pswitch_c
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lv0/f1;->G(Ljava/util/List;)V

    goto :goto_0

    :pswitch_d
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p3}, Lv0/f1;->L(Ljava/util/List;)V

    :goto_0
    iget-object p1, p2, Lv0/y$e;->b:Lv0/y$d;

    invoke-virtual {p4, p1, p3}, Lv0/u;->x(Lv0/u$b;Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p2}, Lv0/y$e;->a()Lv0/t1$b;

    move-result-object v2

    sget-object v3, Lv0/t1$b;->w:Lv0/t1$b;

    if-ne v2, v3, :cond_1

    invoke-interface {p1}, Lv0/f1;->H()I

    move-result p1

    iget-object p3, p2, Lv0/y$e;->b:Lv0/y$d;

    invoke-virtual {p3}, Lv0/y$d;->c()Lv0/a0$d;

    move-result-object p3

    invoke-interface {p3, p1}, Lv0/a0$d;->a(I)Lv0/a0$c;

    move-result-object p3

    if-nez p3, :cond_2

    invoke-static {v0, p1, p5, p6}, Lv0/i1;->L(IILjava/lang/Object;Lv0/n1;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p6, Lv0/r$a;->a:[I

    invoke-virtual {p2}, Lv0/y$e;->a()Lv0/t1$b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p6, p6, v0

    packed-switch p6, :pswitch_data_1

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {p2}, Lv0/y$e;->b()Lv0/r0;

    move-result-object p6

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p6

    invoke-interface {p1, p6, p3}, Lv0/f1;->p(Ljava/lang/Class;Lv0/p;)Ljava/lang/Object;

    move-result-object v1

    goto/16 :goto_3

    :pswitch_f
    invoke-virtual {p2}, Lv0/y$e;->b()Lv0/r0;

    move-result-object p6

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p6

    invoke-interface {p1, p6, p3}, Lv0/f1;->k(Ljava/lang/Class;Lv0/p;)Ljava/lang/Object;

    move-result-object v1

    goto/16 :goto_3

    :pswitch_10
    invoke-interface {p1}, Lv0/f1;->B()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :pswitch_11
    invoke-interface {p1}, Lv0/f1;->F()Lv0/h;

    move-result-object v1

    goto :goto_3

    :pswitch_12
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Shouldn\'t reach here."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_13
    invoke-interface {p1}, Lv0/f1;->z()J

    move-result-wide v0

    goto :goto_2

    :pswitch_14
    invoke-interface {p1}, Lv0/f1;->y()I

    move-result p1

    goto :goto_1

    :pswitch_15
    invoke-interface {p1}, Lv0/f1;->i()J

    move-result-wide v0

    goto :goto_2

    :pswitch_16
    invoke-interface {p1}, Lv0/f1;->J()I

    move-result p1

    goto :goto_1

    :pswitch_17
    invoke-interface {p1}, Lv0/f1;->l()I

    move-result p1

    goto :goto_1

    :pswitch_18
    invoke-interface {p1}, Lv0/f1;->h()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_3

    :pswitch_19
    invoke-interface {p1}, Lv0/f1;->g()I

    move-result p1

    goto :goto_1

    :pswitch_1a
    invoke-interface {p1}, Lv0/f1;->c()J

    move-result-wide v0

    goto :goto_2

    :pswitch_1b
    invoke-interface {p1}, Lv0/f1;->H()I

    move-result p1

    :cond_2
    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_3

    :pswitch_1c
    invoke-interface {p1}, Lv0/f1;->b()J

    move-result-wide v0

    goto :goto_2

    :pswitch_1d
    invoke-interface {p1}, Lv0/f1;->M()J

    move-result-wide v0

    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_3

    :pswitch_1e
    invoke-interface {p1}, Lv0/f1;->readFloat()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    goto :goto_3

    :pswitch_1f
    invoke-interface {p1}, Lv0/f1;->readDouble()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    :goto_3
    invoke-virtual {p2}, Lv0/y$e;->d()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p2, Lv0/y$e;->b:Lv0/y$d;

    invoke-virtual {p4, p1, v1}, Lv0/u;->a(Lv0/u$b;Ljava/lang/Object;)V

    goto :goto_5

    :cond_3
    sget-object p1, Lv0/r$a;->a:[I

    invoke-virtual {p2}, Lv0/y$e;->a()Lv0/t1$b;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p1, p1, p3

    const/16 p3, 0x11

    if-eq p1, p3, :cond_4

    const/16 p3, 0x12

    if-eq p1, p3, :cond_4

    goto :goto_4

    :cond_4
    iget-object p1, p2, Lv0/y$e;->b:Lv0/y$d;

    invoke-virtual {p4, p1}, Lv0/u;->i(Lv0/u$b;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {p1, v1}, Lv0/a0;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :cond_5
    :goto_4
    iget-object p1, p2, Lv0/y$e;->b:Lv0/y$d;

    invoke-virtual {p4, p1, v1}, Lv0/u;->x(Lv0/u$b;Ljava/lang/Object;)V

    :goto_5
    return-object p5

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch
.end method

.method public h(Lv0/f1;Ljava/lang/Object;Lv0/p;Lv0/u;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv0/f1;",
            "Ljava/lang/Object;",
            "Lv0/p;",
            "Lv0/u<",
            "Lv0/y$d;",
            ">;)V"
        }
    .end annotation

    check-cast p2, Lv0/y$e;

    invoke-virtual {p2}, Lv0/y$e;->b()Lv0/r0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p1, v0, p3}, Lv0/f1;->p(Ljava/lang/Class;Lv0/p;)Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p2, Lv0/y$e;->b:Lv0/y$d;

    invoke-virtual {p4, p2, p1}, Lv0/u;->x(Lv0/u$b;Ljava/lang/Object;)V

    return-void
.end method

.method public i(Lv0/h;Ljava/lang/Object;Lv0/p;Lv0/u;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv0/h;",
            "Ljava/lang/Object;",
            "Lv0/p;",
            "Lv0/u<",
            "Lv0/y$d;",
            ">;)V"
        }
    .end annotation

    check-cast p2, Lv0/y$e;

    invoke-virtual {p2}, Lv0/y$e;->b()Lv0/r0;

    move-result-object v0

    invoke-interface {v0}, Lv0/r0;->h()Lv0/r0$a;

    move-result-object v0

    invoke-interface {v0}, Lv0/r0$a;->E()Lv0/r0;

    move-result-object v0

    invoke-virtual {p1}, Lv0/h;->v()[B

    move-result-object p1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v1}, Lv0/e;->Q(Ljava/nio/ByteBuffer;Z)Lv0/e;

    move-result-object p1

    invoke-static {}, Lv0/c1;->a()Lv0/c1;

    move-result-object v1

    invoke-virtual {v1, v0, p1, p3}, Lv0/c1;->b(Ljava/lang/Object;Lv0/f1;Lv0/p;)V

    iget-object p2, p2, Lv0/y$e;->b:Lv0/y$d;

    invoke-virtual {p4, p2, v0}, Lv0/u;->x(Lv0/u$b;Ljava/lang/Object;)V

    invoke-interface {p1}, Lv0/f1;->C()I

    move-result p1

    const p2, 0x7fffffff

    if-ne p1, p2, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lv0/b0;->a()Lv0/b0;

    move-result-object p1

    throw p1
.end method

.method public j(Lv0/u1;Ljava/util/Map$Entry;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv0/u1;",
            "Ljava/util/Map$Entry<",
            "**>;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/y$d;

    invoke-virtual {v0}, Lv0/y$d;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lv0/r$a;->a:[I

    invoke-virtual {v0}, Lv0/y$d;->e()Lv0/t1$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {}, Lv0/c1;->a()Lv0/c1;

    move-result-object v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Lv0/c1;->d(Ljava/lang/Class;)Lv0/g1;

    move-result-object v1

    invoke-static {v0, p2, p1, v1}, Lv0/i1;->X(ILjava/util/List;Lv0/u1;Lv0/g1;)V

    goto/16 :goto_0

    :pswitch_1
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {}, Lv0/c1;->a()Lv0/c1;

    move-result-object v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Lv0/c1;->d(Ljava/lang/Class;)Lv0/g1;

    move-result-object v1

    invoke-static {v0, p2, p1, v1}, Lv0/i1;->U(ILjava/util/List;Lv0/u1;Lv0/g1;)V

    goto/16 :goto_0

    :pswitch_2
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v0, p2, p1}, Lv0/i1;->c0(ILjava/util/List;Lv0/u1;)V

    goto/16 :goto_0

    :pswitch_3
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v0, p2, p1}, Lv0/i1;->O(ILjava/util/List;Lv0/u1;)V

    goto/16 :goto_0

    :pswitch_4
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lv0/y$d;->k()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lv0/i1;->b0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_0

    :pswitch_5
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lv0/y$d;->k()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lv0/i1;->a0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_0

    :pswitch_6
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lv0/y$d;->k()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lv0/i1;->Z(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_0

    :pswitch_7
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lv0/y$d;->k()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lv0/i1;->Y(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_0

    :pswitch_8
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lv0/y$d;->k()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lv0/i1;->d0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_0

    :pswitch_9
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lv0/y$d;->k()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lv0/i1;->N(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_0

    :pswitch_a
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lv0/y$d;->k()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lv0/i1;->R(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_0

    :pswitch_b
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lv0/y$d;->k()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lv0/i1;->S(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_0

    :pswitch_c
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lv0/y$d;->k()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lv0/i1;->V(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_0

    :pswitch_d
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lv0/y$d;->k()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lv0/i1;->e0(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_0

    :pswitch_e
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lv0/y$d;->k()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lv0/i1;->W(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_0

    :pswitch_f
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lv0/y$d;->k()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lv0/i1;->T(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_0

    :pswitch_10
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lv0/y$d;->k()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lv0/i1;->P(ILjava/util/List;Lv0/u1;Z)V

    goto/16 :goto_0

    :cond_0
    sget-object v1, Lv0/r$a;->a:[I

    invoke-virtual {v0}, Lv0/y$d;->e()Lv0/t1$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_1

    goto/16 :goto_0

    :pswitch_11
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lv0/c1;->a()Lv0/c1;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v2, p2}, Lv0/c1;->d(Ljava/lang/Class;)Lv0/g1;

    move-result-object p2

    invoke-interface {p1, v0, v1, p2}, Lv0/u1;->r(ILjava/lang/Object;Lv0/g1;)V

    goto/16 :goto_0

    :pswitch_12
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lv0/c1;->a()Lv0/c1;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v2, p2}, Lv0/c1;->d(Ljava/lang/Class;)Lv0/g1;

    move-result-object p2

    invoke-interface {p1, v0, v1, p2}, Lv0/u1;->l(ILjava/lang/Object;Lv0/g1;)V

    goto/16 :goto_0

    :pswitch_13
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {p1, v0, p2}, Lv0/u1;->m(ILjava/lang/String;)V

    goto/16 :goto_0

    :pswitch_14
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lv0/h;

    invoke-interface {p1, v0, p2}, Lv0/u1;->e(ILv0/h;)V

    goto/16 :goto_0

    :pswitch_15
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lv0/u1;->F(IJ)V

    goto/16 :goto_0

    :pswitch_16
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lv0/u1;->N(II)V

    goto/16 :goto_0

    :pswitch_17
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lv0/u1;->x(IJ)V

    goto/16 :goto_0

    :pswitch_18
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lv0/u1;->s(II)V

    goto/16 :goto_0

    :pswitch_19
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lv0/u1;->b(II)V

    goto/16 :goto_0

    :pswitch_1a
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, v0, p2}, Lv0/u1;->q(IZ)V

    goto/16 :goto_0

    :pswitch_1b
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lv0/u1;->d(II)V

    goto :goto_0

    :pswitch_1c
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lv0/u1;->i(IJ)V

    goto :goto_0

    :pswitch_1d
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lv0/u1;->u(II)V

    goto :goto_0

    :pswitch_1e
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lv0/u1;->n(IJ)V

    goto :goto_0

    :pswitch_1f
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lv0/u1;->p(IJ)V

    goto :goto_0

    :pswitch_20
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p1, v0, p2}, Lv0/u1;->G(IF)V

    goto :goto_0

    :pswitch_21
    invoke-virtual {v0}, Lv0/y$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lv0/u1;->f(ID)V

    :cond_1
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_c
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_1d
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
    .end packed-switch
.end method
