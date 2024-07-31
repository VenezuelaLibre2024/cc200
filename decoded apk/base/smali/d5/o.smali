.class public final Ld5/o;
.super Ls3/f;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public A:Z

.field public B:I

.field public C:Ls3/m1;

.field public D:Ld5/i;

.field public E:Ld5/l;

.field public F:Ld5/m;

.field public G:Ld5/m;

.field public H:I

.field public I:J

.field public J:J

.field public K:J

.field public final u:Landroid/os/Handler;

.field public final v:Ld5/n;

.field public final w:Ld5/k;

.field public final x:Ls3/n1;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Ld5/n;Landroid/os/Looper;)V
    .locals 1

    sget-object v0, Ld5/k;->a:Ld5/k;

    invoke-direct {p0, p1, p2, v0}, Ld5/o;-><init>(Ld5/n;Landroid/os/Looper;Ld5/k;)V

    return-void
.end method

.method public constructor <init>(Ld5/n;Landroid/os/Looper;Ld5/k;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Ls3/f;-><init>(I)V

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld5/n;

    iput-object p1, p0, Ld5/o;->v:Ld5/n;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p2, p0}, Lp5/n0;->v(Landroid/os/Looper;Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ld5/o;->u:Landroid/os/Handler;

    iput-object p3, p0, Ld5/o;->w:Ld5/k;

    new-instance p1, Ls3/n1;

    invoke-direct {p1}, Ls3/n1;-><init>()V

    iput-object p1, p0, Ld5/o;->x:Ls3/n1;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Ld5/o;->I:J

    iput-wide p1, p0, Ld5/o;->J:J

    iput-wide p1, p0, Ld5/o;->K:J

    return-void
.end method


# virtual methods
.method public P()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Ld5/o;->C:Ls3/m1;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Ld5/o;->I:J

    invoke-virtual {p0}, Ld5/o;->Z()V

    iput-wide v0, p0, Ld5/o;->J:J

    iput-wide v0, p0, Ld5/o;->K:J

    invoke-virtual {p0}, Ld5/o;->h0()V

    return-void
.end method

.method public R(JZ)V
    .locals 0

    iput-wide p1, p0, Ld5/o;->K:J

    invoke-virtual {p0}, Ld5/o;->Z()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Ld5/o;->y:Z

    iput-boolean p1, p0, Ld5/o;->z:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Ld5/o;->I:J

    iget p1, p0, Ld5/o;->B:I

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ld5/o;->i0()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ld5/o;->g0()V

    iget-object p1, p0, Ld5/o;->D:Ld5/i;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld5/i;

    invoke-interface {p1}, Lv3/d;->flush()V

    :goto_0
    return-void
.end method

.method public V([Ls3/m1;JJ)V
    .locals 0

    iput-wide p4, p0, Ld5/o;->J:J

    const/4 p2, 0x0

    aget-object p1, p1, p2

    iput-object p1, p0, Ld5/o;->C:Ls3/m1;

    iget-object p1, p0, Ld5/o;->D:Ld5/i;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Ld5/o;->B:I

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ld5/o;->e0()V

    :goto_0
    return-void
.end method

.method public final Z()V
    .locals 4

    new-instance v0, Ld5/e;

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v1

    iget-wide v2, p0, Ld5/o;->K:J

    invoke-virtual {p0, v2, v3}, Ld5/o;->c0(J)J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Ld5/e;-><init>(Ljava/util/List;J)V

    invoke-virtual {p0, v0}, Ld5/o;->k0(Ld5/e;)V

    return-void
.end method

.method public a(Ls3/m1;)I
    .locals 1

    iget-object v0, p0, Ld5/o;->w:Ld5/k;

    invoke-interface {v0, p1}, Ld5/k;->a(Ls3/m1;)Z

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
    iget-object p1, p1, Ls3/m1;->s:Ljava/lang/String;

    invoke-static {p1}, Lp5/v;->r(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ls3/j3;->v(I)I

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    goto :goto_1
.end method

.method public final a0(J)J
    .locals 1

    iget-object v0, p0, Ld5/o;->F:Ld5/m;

    invoke-virtual {v0, p1, p2}, Ld5/m;->b(J)I

    move-result p1

    if-eqz p1, :cond_2

    iget-object p2, p0, Ld5/o;->F:Ld5/m;

    invoke-virtual {p2}, Ld5/m;->h()I

    move-result p2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Ld5/o;->F:Ld5/m;

    invoke-virtual {p1}, Ld5/m;->h()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p2}, Ld5/m;->c(I)J

    move-result-wide p1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Ld5/o;->F:Ld5/m;

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p2, p1}, Ld5/m;->c(I)J

    move-result-wide p1

    :goto_0
    return-wide p1

    :cond_2
    :goto_1
    iget-object p1, p0, Ld5/o;->F:Ld5/m;

    iget-wide p1, p1, Lv3/h;->i:J

    return-wide p1
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "TextRenderer"

    return-object v0
.end method

.method public final b0()J
    .locals 4

    iget v0, p0, Ld5/o;->H:I

    const-wide v1, 0x7fffffffffffffffL

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return-wide v1

    :cond_0
    iget-object v0, p0, Ld5/o;->F:Ld5/m;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Ld5/o;->H:I

    iget-object v3, p0, Ld5/o;->F:Ld5/m;

    invoke-virtual {v3}, Ld5/m;->h()I

    move-result v3

    if-lt v0, v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ld5/o;->F:Ld5/m;

    iget v1, p0, Ld5/o;->H:I

    invoke-virtual {v0, v1}, Ld5/m;->c(I)J

    move-result-wide v1

    :goto_0
    return-wide v1
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Ld5/o;->z:Z

    return v0
.end method

.method public final c0(J)J
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

    iget-wide v5, p0, Ld5/o;->J:J

    cmp-long v0, v5, v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    invoke-static {v3}, Lp5/a;->f(Z)V

    iget-wide v0, p0, Ld5/o;->J:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public final d0(Ld5/j;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Subtitle decoding failed. streamFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld5/o;->C:Ls3/m1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TextRenderer"

    invoke-static {v1, v0, p1}, Lp5/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Ld5/o;->Z()V

    invoke-virtual {p0}, Ld5/o;->i0()V

    return-void
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final e0()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld5/o;->A:Z

    iget-object v0, p0, Ld5/o;->w:Ld5/k;

    iget-object v1, p0, Ld5/o;->C:Ls3/m1;

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls3/m1;

    invoke-interface {v0, v1}, Ld5/k;->b(Ls3/m1;)Ld5/i;

    move-result-object v0

    iput-object v0, p0, Ld5/o;->D:Ld5/i;

    return-void
.end method

.method public final f0(Ld5/e;)V
    .locals 2

    iget-object v0, p0, Ld5/o;->v:Ld5/n;

    iget-object v1, p1, Ld5/e;->h:Li7/u;

    invoke-interface {v0, v1}, Ld5/n;->onCues(Ljava/util/List;)V

    iget-object v0, p0, Ld5/o;->v:Ld5/n;

    invoke-interface {v0, p1}, Ld5/n;->onCues(Ld5/e;)V

    return-void
.end method

.method public final g0()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Ld5/o;->E:Ld5/l;

    const/4 v1, -0x1

    iput v1, p0, Ld5/o;->H:I

    iget-object v1, p0, Ld5/o;->F:Ld5/m;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lv3/h;->v()V

    iput-object v0, p0, Ld5/o;->F:Ld5/m;

    :cond_0
    iget-object v1, p0, Ld5/o;->G:Ld5/m;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lv3/h;->v()V

    iput-object v0, p0, Ld5/o;->G:Ld5/m;

    :cond_1
    return-void
.end method

.method public final h0()V
    .locals 1

    invoke-virtual {p0}, Ld5/o;->g0()V

    iget-object v0, p0, Ld5/o;->D:Ld5/i;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld5/i;

    invoke-interface {v0}, Lv3/d;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Ld5/o;->D:Ld5/i;

    const/4 v0, 0x0

    iput v0, p0, Ld5/o;->B:I

    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ld5/e;

    invoke-virtual {p0, p1}, Ld5/o;->f0(Ld5/e;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final i0()V
    .locals 0

    invoke-virtual {p0}, Ld5/o;->h0()V

    invoke-virtual {p0}, Ld5/o;->e0()V

    return-void
.end method

.method public j0(J)V
    .locals 1

    invoke-virtual {p0}, Ls3/f;->D()Z

    move-result v0

    invoke-static {v0}, Lp5/a;->f(Z)V

    iput-wide p1, p0, Ld5/o;->I:J

    return-void
.end method

.method public final k0(Ld5/e;)V
    .locals 2

    iget-object v0, p0, Ld5/o;->u:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Ld5/o;->f0(Ld5/e;)V

    :goto_0
    return-void
.end method

.method public x(JJ)V
    .locals 8

    iput-wide p1, p0, Ld5/o;->K:J

    invoke-virtual {p0}, Ls3/f;->D()Z

    move-result p3

    const/4 p4, 0x1

    if-eqz p3, :cond_0

    iget-wide v0, p0, Ld5/o;->I:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, v0, v2

    if-eqz p3, :cond_0

    cmp-long p3, p1, v0

    if-ltz p3, :cond_0

    invoke-virtual {p0}, Ld5/o;->g0()V

    iput-boolean p4, p0, Ld5/o;->z:Z

    :cond_0
    iget-boolean p3, p0, Ld5/o;->z:Z

    if-eqz p3, :cond_1

    return-void

    :cond_1
    iget-object p3, p0, Ld5/o;->G:Ld5/m;

    if-nez p3, :cond_2

    iget-object p3, p0, Ld5/o;->D:Ld5/i;

    invoke-static {p3}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ld5/i;

    invoke-interface {p3, p1, p2}, Ld5/i;->a(J)V

    :try_start_0
    iget-object p3, p0, Ld5/o;->D:Ld5/i;

    invoke-static {p3}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ld5/i;

    invoke-interface {p3}, Lv3/d;->b()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ld5/m;

    iput-object p3, p0, Ld5/o;->G:Ld5/m;
    :try_end_0
    .catch Ld5/j; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Ld5/o;->d0(Ld5/j;)V

    return-void

    :cond_2
    :goto_0
    invoke-virtual {p0}, Ls3/f;->getState()I

    move-result p3

    const/4 v0, 0x2

    if-eq p3, v0, :cond_3

    return-void

    :cond_3
    iget-object p3, p0, Ld5/o;->F:Ld5/m;

    const/4 v1, 0x0

    if-eqz p3, :cond_4

    invoke-virtual {p0}, Ld5/o;->b0()J

    move-result-wide v2

    move p3, v1

    :goto_1
    cmp-long v2, v2, p1

    if-gtz v2, :cond_5

    iget p3, p0, Ld5/o;->H:I

    add-int/2addr p3, p4

    iput p3, p0, Ld5/o;->H:I

    invoke-virtual {p0}, Ld5/o;->b0()J

    move-result-wide v2

    move p3, p4

    goto :goto_1

    :cond_4
    move p3, v1

    :cond_5
    iget-object v2, p0, Ld5/o;->G:Ld5/m;

    const/4 v3, 0x0

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lv3/a;->q()Z

    move-result v4

    if-eqz v4, :cond_7

    if-nez p3, :cond_9

    invoke-virtual {p0}, Ld5/o;->b0()J

    move-result-wide v4

    const-wide v6, 0x7fffffffffffffffL

    cmp-long v2, v4, v6

    if-nez v2, :cond_9

    iget v2, p0, Ld5/o;->B:I

    if-ne v2, v0, :cond_6

    invoke-virtual {p0}, Ld5/o;->i0()V

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, Ld5/o;->g0()V

    iput-boolean p4, p0, Ld5/o;->z:Z

    goto :goto_2

    :cond_7
    iget-wide v4, v2, Lv3/h;->i:J

    cmp-long v4, v4, p1

    if-gtz v4, :cond_9

    iget-object p3, p0, Ld5/o;->F:Ld5/m;

    if-eqz p3, :cond_8

    invoke-virtual {p3}, Lv3/h;->v()V

    :cond_8
    invoke-virtual {v2, p1, p2}, Ld5/m;->b(J)I

    move-result p3

    iput p3, p0, Ld5/o;->H:I

    iput-object v2, p0, Ld5/o;->F:Ld5/m;

    iput-object v3, p0, Ld5/o;->G:Ld5/m;

    move p3, p4

    :cond_9
    :goto_2
    if-eqz p3, :cond_a

    iget-object p3, p0, Ld5/o;->F:Ld5/m;

    invoke-static {p3}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1, p2}, Ld5/o;->a0(J)J

    move-result-wide v4

    invoke-virtual {p0, v4, v5}, Ld5/o;->c0(J)J

    move-result-wide v4

    new-instance p3, Ld5/e;

    iget-object v2, p0, Ld5/o;->F:Ld5/m;

    invoke-virtual {v2, p1, p2}, Ld5/m;->f(J)Ljava/util/List;

    move-result-object p1

    invoke-direct {p3, p1, v4, v5}, Ld5/e;-><init>(Ljava/util/List;J)V

    invoke-virtual {p0, p3}, Ld5/o;->k0(Ld5/e;)V

    :cond_a
    iget p1, p0, Ld5/o;->B:I

    if-ne p1, v0, :cond_b

    return-void

    :cond_b
    :goto_3
    :try_start_1
    iget-boolean p1, p0, Ld5/o;->y:Z

    if-nez p1, :cond_13

    iget-object p1, p0, Ld5/o;->E:Ld5/l;

    if-nez p1, :cond_d

    iget-object p1, p0, Ld5/o;->D:Ld5/i;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld5/i;

    invoke-interface {p1}, Lv3/d;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld5/l;

    if-nez p1, :cond_c

    return-void

    :cond_c
    iput-object p1, p0, Ld5/o;->E:Ld5/l;

    :cond_d
    iget p2, p0, Ld5/o;->B:I

    if-ne p2, p4, :cond_e

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Lv3/a;->u(I)V

    iget-object p2, p0, Ld5/o;->D:Ld5/i;

    invoke-static {p2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ld5/i;

    invoke-interface {p2, p1}, Lv3/d;->d(Ljava/lang/Object;)V

    iput-object v3, p0, Ld5/o;->E:Ld5/l;

    iput v0, p0, Ld5/o;->B:I

    return-void

    :cond_e
    iget-object p2, p0, Ld5/o;->x:Ls3/n1;

    invoke-virtual {p0, p2, p1, v1}, Ls3/f;->W(Ls3/n1;Lv3/g;I)I

    move-result p2

    const/4 p3, -0x4

    if-ne p2, p3, :cond_12

    invoke-virtual {p1}, Lv3/a;->q()Z

    move-result p2

    if-eqz p2, :cond_f

    iput-boolean p4, p0, Ld5/o;->y:Z

    iput-boolean v1, p0, Ld5/o;->A:Z

    goto :goto_5

    :cond_f
    iget-object p2, p0, Ld5/o;->x:Ls3/n1;

    iget-object p2, p2, Ls3/n1;->b:Ls3/m1;

    if-nez p2, :cond_10

    return-void

    :cond_10
    iget-wide p2, p2, Ls3/m1;->w:J

    iput-wide p2, p1, Ld5/l;->p:J

    invoke-virtual {p1}, Lv3/g;->x()V

    iget-boolean p2, p0, Ld5/o;->A:Z

    invoke-virtual {p1}, Lv3/a;->s()Z

    move-result p3

    if-nez p3, :cond_11

    move p3, p4

    goto :goto_4

    :cond_11
    move p3, v1

    :goto_4
    and-int/2addr p2, p3

    iput-boolean p2, p0, Ld5/o;->A:Z

    :goto_5
    iget-boolean p2, p0, Ld5/o;->A:Z

    if-nez p2, :cond_b

    iget-object p2, p0, Ld5/o;->D:Ld5/i;

    invoke-static {p2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ld5/i;

    invoke-interface {p2, p1}, Lv3/d;->d(Ljava/lang/Object;)V

    iput-object v3, p0, Ld5/o;->E:Ld5/l;
    :try_end_1
    .catch Ld5/j; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :cond_12
    const/4 p1, -0x3

    if-ne p2, p1, :cond_b

    return-void

    :catch_1
    move-exception p1

    invoke-virtual {p0, p1}, Ld5/o;->d0(Ld5/j;)V

    :cond_13
    return-void
.end method
