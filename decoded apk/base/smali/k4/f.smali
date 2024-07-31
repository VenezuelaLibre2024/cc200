.class public final Lk4/f;
.super Ls3/f;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public A:Z

.field public B:Z

.field public C:J

.field public D:Lk4/a;

.field public E:J

.field public final u:Lk4/c;

.field public final v:Lk4/e;

.field public final w:Landroid/os/Handler;

.field public final x:Lk4/d;

.field public final y:Z

.field public z:Lk4/b;


# direct methods
.method public constructor <init>(Lk4/e;Landroid/os/Looper;)V
    .locals 1

    sget-object v0, Lk4/c;->a:Lk4/c;

    invoke-direct {p0, p1, p2, v0}, Lk4/f;-><init>(Lk4/e;Landroid/os/Looper;Lk4/c;)V

    return-void
.end method

.method public constructor <init>(Lk4/e;Landroid/os/Looper;Lk4/c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lk4/f;-><init>(Lk4/e;Landroid/os/Looper;Lk4/c;Z)V

    return-void
.end method

.method public constructor <init>(Lk4/e;Landroid/os/Looper;Lk4/c;Z)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Ls3/f;-><init>(I)V

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk4/e;

    iput-object p1, p0, Lk4/f;->v:Lk4/e;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p2, p0}, Lp5/n0;->v(Landroid/os/Looper;Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lk4/f;->w:Landroid/os/Handler;

    invoke-static {p3}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk4/c;

    iput-object p1, p0, Lk4/f;->u:Lk4/c;

    iput-boolean p4, p0, Lk4/f;->y:Z

    new-instance p1, Lk4/d;

    invoke-direct {p1}, Lk4/d;-><init>()V

    iput-object p1, p0, Lk4/f;->x:Lk4/d;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lk4/f;->E:J

    return-void
.end method


# virtual methods
.method public P()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lk4/f;->D:Lk4/a;

    iput-object v0, p0, Lk4/f;->z:Lk4/b;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lk4/f;->E:J

    return-void
.end method

.method public R(JZ)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lk4/f;->D:Lk4/a;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lk4/f;->A:Z

    iput-boolean p1, p0, Lk4/f;->B:Z

    return-void
.end method

.method public V([Ls3/m1;JJ)V
    .locals 2

    iget-object p2, p0, Lk4/f;->u:Lk4/c;

    const/4 p3, 0x0

    aget-object p1, p1, p3

    invoke-interface {p2, p1}, Lk4/c;->b(Ls3/m1;)Lk4/b;

    move-result-object p1

    iput-object p1, p0, Lk4/f;->z:Lk4/b;

    iget-object p1, p0, Lk4/f;->D:Lk4/a;

    if-eqz p1, :cond_0

    iget-wide p2, p1, Lk4/a;->i:J

    iget-wide v0, p0, Lk4/f;->E:J

    add-long/2addr p2, v0

    sub-long/2addr p2, p4

    invoke-virtual {p1, p2, p3}, Lk4/a;->d(J)Lk4/a;

    move-result-object p1

    iput-object p1, p0, Lk4/f;->D:Lk4/a;

    :cond_0
    iput-wide p4, p0, Lk4/f;->E:J

    return-void
.end method

.method public final Z(Lk4/a;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk4/a;",
            "Ljava/util/List<",
            "Lk4/a$b;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lk4/a;->f()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p1, v0}, Lk4/a;->e(I)Lk4/a$b;

    move-result-object v1

    invoke-interface {v1}, Lk4/a$b;->n()Ls3/m1;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lk4/f;->u:Lk4/c;

    invoke-interface {v2, v1}, Lk4/c;->a(Ls3/m1;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lk4/f;->u:Lk4/c;

    invoke-interface {v2, v1}, Lk4/c;->b(Ls3/m1;)Lk4/b;

    move-result-object v1

    invoke-virtual {p1, v0}, Lk4/a;->e(I)Lk4/a$b;

    move-result-object v2

    invoke-interface {v2}, Lk4/a$b;->G()[B

    move-result-object v2

    invoke-static {v2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    iget-object v3, p0, Lk4/f;->x:Lk4/d;

    invoke-virtual {v3}, Lv3/g;->l()V

    iget-object v3, p0, Lk4/f;->x:Lk4/d;

    array-length v4, v2

    invoke-virtual {v3, v4}, Lv3/g;->w(I)V

    iget-object v3, p0, Lk4/f;->x:Lk4/d;

    iget-object v3, v3, Lv3/g;->j:Ljava/nio/ByteBuffer;

    invoke-static {v3}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lk4/f;->x:Lk4/d;

    invoke-virtual {v2}, Lv3/g;->x()V

    iget-object v2, p0, Lk4/f;->x:Lk4/d;

    invoke-interface {v1, v2}, Lk4/b;->a(Lk4/d;)Lk4/a;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v1, p2}, Lk4/f;->Z(Lk4/a;Ljava/util/List;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v0}, Lk4/a;->e(I)Lk4/a$b;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public a(Ls3/m1;)I
    .locals 1

    iget-object v0, p0, Lk4/f;->u:Lk4/c;

    invoke-interface {v0, p1}, Lk4/c;->a(Ls3/m1;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget p1, p1, Ls3/m1;->N:I

    if-nez p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    invoke-static {p1}, Ls3/j3;->v(I)I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    invoke-static {p1}, Ls3/j3;->v(I)I

    move-result p1

    return p1
.end method

.method public final a0(J)J
    .locals 7

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    invoke-static {v2}, Lp5/a;->f(Z)V

    iget-wide v5, p0, Lk4/f;->E:J

    cmp-long v0, v5, v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    invoke-static {v3}, Lp5/a;->f(Z)V

    iget-wide v0, p0, Lk4/f;->E:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "MetadataRenderer"

    return-object v0
.end method

.method public final b0(Lk4/a;)V
    .locals 2

    iget-object v0, p0, Lk4/f;->w:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lk4/f;->c0(Lk4/a;)V

    :goto_0
    return-void
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lk4/f;->B:Z

    return v0
.end method

.method public final c0(Lk4/a;)V
    .locals 1

    iget-object v0, p0, Lk4/f;->v:Lk4/e;

    invoke-interface {v0, p1}, Lk4/e;->onMetadata(Lk4/a;)V

    return-void
.end method

.method public final d0(J)Z
    .locals 4

    iget-object v0, p0, Lk4/f;->D:Lk4/a;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-boolean v2, p0, Lk4/f;->y:Z

    if-nez v2, :cond_0

    iget-wide v2, v0, Lk4/a;->i:J

    invoke-virtual {p0, p1, p2}, Lk4/f;->a0(J)J

    move-result-wide p1

    cmp-long p1, v2, p1

    if-gtz p1, :cond_1

    :cond_0
    iget-object p1, p0, Lk4/f;->D:Lk4/a;

    invoke-virtual {p0, p1}, Lk4/f;->b0(Lk4/a;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lk4/f;->D:Lk4/a;

    move p1, v1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iget-boolean p2, p0, Lk4/f;->A:Z

    if-eqz p2, :cond_2

    iget-object p2, p0, Lk4/f;->D:Lk4/a;

    if-nez p2, :cond_2

    iput-boolean v1, p0, Lk4/f;->B:Z

    :cond_2
    return p1
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final e0()V
    .locals 4

    iget-boolean v0, p0, Lk4/f;->A:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lk4/f;->D:Lk4/a;

    if-nez v0, :cond_2

    iget-object v0, p0, Lk4/f;->x:Lk4/d;

    invoke-virtual {v0}, Lv3/g;->l()V

    invoke-virtual {p0}, Ls3/f;->K()Ls3/n1;

    move-result-object v0

    iget-object v1, p0, Lk4/f;->x:Lk4/d;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Ls3/f;->W(Ls3/n1;Lv3/g;I)I

    move-result v1

    const/4 v2, -0x4

    if-ne v1, v2, :cond_1

    iget-object v0, p0, Lk4/f;->x:Lk4/d;

    invoke-virtual {v0}, Lv3/a;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk4/f;->A:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk4/f;->x:Lk4/d;

    iget-wide v1, p0, Lk4/f;->C:J

    iput-wide v1, v0, Lk4/d;->p:J

    invoke-virtual {v0}, Lv3/g;->x()V

    iget-object v0, p0, Lk4/f;->z:Lk4/b;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk4/b;

    iget-object v1, p0, Lk4/f;->x:Lk4/d;

    invoke-interface {v0, v1}, Lk4/b;->a(Lk4/d;)Lk4/a;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lk4/a;->f()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0, v0, v1}, Lk4/f;->Z(Lk4/a;Ljava/util/List;)V

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lk4/a;

    iget-object v2, p0, Lk4/f;->x:Lk4/d;

    iget-wide v2, v2, Lv3/g;->l:J

    invoke-virtual {p0, v2, v3}, Lk4/f;->a0(J)J

    move-result-wide v2

    invoke-direct {v0, v2, v3, v1}, Lk4/a;-><init>(JLjava/util/List;)V

    iput-object v0, p0, Lk4/f;->D:Lk4/a;

    goto :goto_0

    :cond_1
    const/4 v2, -0x5

    if-ne v1, v2, :cond_2

    iget-object v0, v0, Ls3/n1;->b:Ls3/m1;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/m1;

    iget-wide v0, v0, Ls3/m1;->w:J

    iput-wide v0, p0, Lk4/f;->C:J

    :cond_2
    :goto_0
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lk4/a;

    invoke-virtual {p0, p1}, Lk4/f;->c0(Lk4/a;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public x(JJ)V
    .locals 0

    const/4 p3, 0x1

    :goto_0
    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lk4/f;->e0()V

    invoke-virtual {p0, p1, p2}, Lk4/f;->d0(J)Z

    move-result p3

    goto :goto_0

    :cond_0
    return-void
.end method
