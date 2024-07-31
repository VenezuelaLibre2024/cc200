.class public final Lt0/h$a;
.super Lv0/y$a;
.source ""

# interfaces
.implements Lv0/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv0/y$a<",
        "Lt0/h;",
        "Lt0/h$a;",
        ">;",
        "Lv0/s0;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lt0/h;->P()Lt0/h;

    move-result-object v0

    invoke-direct {p0, v0}, Lv0/y$a;-><init>(Lv0/y;)V

    return-void
.end method

.method public synthetic constructor <init>(Lt0/e;)V
    .locals 0

    invoke-direct {p0}, Lt0/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public A(F)Lt0/h$a;
    .locals 1

    invoke-virtual {p0}, Lv0/y$a;->t()V

    iget-object v0, p0, Lv0/y$a;->i:Lv0/y;

    check-cast v0, Lt0/h;

    invoke-static {v0, p1}, Lt0/h;->R(Lt0/h;F)V

    return-object p0
.end method

.method public B(I)Lt0/h$a;
    .locals 1

    invoke-virtual {p0}, Lv0/y$a;->t()V

    iget-object v0, p0, Lv0/y$a;->i:Lv0/y;

    check-cast v0, Lt0/h;

    invoke-static {v0, p1}, Lt0/h;->S(Lt0/h;I)V

    return-object p0
.end method

.method public C(J)Lt0/h$a;
    .locals 1

    invoke-virtual {p0}, Lv0/y$a;->t()V

    iget-object v0, p0, Lv0/y$a;->i:Lv0/y;

    check-cast v0, Lt0/h;

    invoke-static {v0, p1, p2}, Lt0/h;->L(Lt0/h;J)V

    return-object p0
.end method

.method public D(Ljava/lang/String;)Lt0/h$a;
    .locals 1

    invoke-virtual {p0}, Lv0/y$a;->t()V

    iget-object v0, p0, Lv0/y$a;->i:Lv0/y;

    check-cast v0, Lt0/h;

    invoke-static {v0, p1}, Lt0/h;->M(Lt0/h;Ljava/lang/String;)V

    return-object p0
.end method

.method public F(Lt0/g$a;)Lt0/h$a;
    .locals 1

    invoke-virtual {p0}, Lv0/y$a;->t()V

    iget-object v0, p0, Lv0/y$a;->i:Lv0/y;

    check-cast v0, Lt0/h;

    invoke-static {v0, p1}, Lt0/h;->N(Lt0/h;Lt0/g$a;)V

    return-object p0
.end method

.method public y(Z)Lt0/h$a;
    .locals 1

    invoke-virtual {p0}, Lv0/y$a;->t()V

    iget-object v0, p0, Lv0/y$a;->i:Lv0/y;

    check-cast v0, Lt0/h;

    invoke-static {v0, p1}, Lt0/h;->Q(Lt0/h;Z)V

    return-object p0
.end method

.method public z(D)Lt0/h$a;
    .locals 1

    invoke-virtual {p0}, Lv0/y$a;->t()V

    iget-object v0, p0, Lv0/y$a;->i:Lv0/y;

    check-cast v0, Lt0/h;

    invoke-static {v0, p1, p2}, Lt0/h;->O(Lt0/h;D)V

    return-object p0
.end method
