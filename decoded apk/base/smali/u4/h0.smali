.class public final Lu4/h0;
.super Lu4/a;
.source ""

# interfaces
.implements Lu4/g0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu4/h0$b;
    }
.end annotation


# instance fields
.field public final o:Ls3/u1;

.field public final p:Ls3/u1$h;

.field public final q:Lo5/j$a;

.field public final r:Lu4/b0$a;

.field public final s:Lw3/v;

.field public final t:Lo5/d0;

.field public final u:I

.field public v:Z

.field public w:J

.field public x:Z

.field public y:Z

.field public z:Lo5/m0;


# direct methods
.method public constructor <init>(Ls3/u1;Lo5/j$a;Lu4/b0$a;Lw3/v;Lo5/d0;I)V
    .locals 1

    invoke-direct {p0}, Lu4/a;-><init>()V

    iget-object v0, p1, Ls3/u1;->i:Ls3/u1$h;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/u1$h;

    iput-object v0, p0, Lu4/h0;->p:Ls3/u1$h;

    iput-object p1, p0, Lu4/h0;->o:Ls3/u1;

    iput-object p2, p0, Lu4/h0;->q:Lo5/j$a;

    iput-object p3, p0, Lu4/h0;->r:Lu4/b0$a;

    iput-object p4, p0, Lu4/h0;->s:Lw3/v;

    iput-object p5, p0, Lu4/h0;->t:Lo5/d0;

    iput p6, p0, Lu4/h0;->u:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu4/h0;->v:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lu4/h0;->w:J

    return-void
.end method

.method public synthetic constructor <init>(Ls3/u1;Lo5/j$a;Lu4/b0$a;Lw3/v;Lo5/d0;ILu4/h0$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lu4/h0;-><init>(Ls3/u1;Lo5/j$a;Lu4/b0$a;Lw3/v;Lo5/d0;I)V

    return-void
.end method


# virtual methods
.method public C(Lo5/m0;)V
    .locals 2

    iput-object p1, p0, Lu4/h0;->z:Lo5/m0;

    iget-object p1, p0, Lu4/h0;->s:Lw3/v;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Looper;

    invoke-virtual {p0}, Lu4/a;->A()Lt3/s1;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lw3/v;->d(Landroid/os/Looper;Lt3/s1;)V

    iget-object p1, p0, Lu4/h0;->s:Lw3/v;

    invoke-interface {p1}, Lw3/v;->a()V

    invoke-virtual {p0}, Lu4/h0;->F()V

    return-void
.end method

.method public E()V
    .locals 1

    iget-object v0, p0, Lu4/h0;->s:Lw3/v;

    invoke-interface {v0}, Lw3/v;->release()V

    return-void
.end method

.method public final F()V
    .locals 9

    new-instance v8, Lu4/p0;

    iget-wide v1, p0, Lu4/h0;->w:J

    iget-boolean v3, p0, Lu4/h0;->x:Z

    iget-boolean v5, p0, Lu4/h0;->y:Z

    iget-object v7, p0, Lu4/h0;->o:Ls3/u1;

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lu4/p0;-><init>(JZZZLjava/lang/Object;Ls3/u1;)V

    iget-boolean v0, p0, Lu4/h0;->v:Z

    if-eqz v0, :cond_0

    new-instance v0, Lu4/h0$a;

    invoke-direct {v0, p0, v8}, Lu4/h0$a;-><init>(Lu4/h0;Ls3/u3;)V

    move-object v8, v0

    :cond_0
    invoke-virtual {p0, v8}, Lu4/a;->D(Ls3/u3;)V

    return-void
.end method

.method public a(Lu4/r;)V
    .locals 0

    check-cast p1, Lu4/g0;

    invoke-virtual {p1}, Lu4/g0;->e0()V

    return-void
.end method

.method public b(Lu4/t$b;Lo5/b;J)Lu4/r;
    .locals 14

    move-object v12, p0

    iget-object v0, v12, Lu4/h0;->q:Lo5/j$a;

    invoke-interface {v0}, Lo5/j$a;->a()Lo5/j;

    move-result-object v2

    iget-object v0, v12, Lu4/h0;->z:Lo5/m0;

    if-eqz v0, :cond_0

    invoke-interface {v2, v0}, Lo5/j;->g(Lo5/m0;)V

    :cond_0
    new-instance v13, Lu4/g0;

    iget-object v0, v12, Lu4/h0;->p:Ls3/u1$h;

    iget-object v1, v0, Ls3/u1$h;->a:Landroid/net/Uri;

    iget-object v0, v12, Lu4/h0;->r:Lu4/b0$a;

    invoke-virtual {p0}, Lu4/a;->A()Lt3/s1;

    move-result-object v3

    invoke-interface {v0, v3}, Lu4/b0$a;->a(Lt3/s1;)Lu4/b0;

    move-result-object v3

    iget-object v4, v12, Lu4/h0;->s:Lw3/v;

    invoke-virtual {p0, p1}, Lu4/a;->u(Lu4/t$b;)Lw3/u$a;

    move-result-object v5

    iget-object v6, v12, Lu4/h0;->t:Lo5/d0;

    invoke-virtual {p0, p1}, Lu4/a;->w(Lu4/t$b;)Lu4/a0$a;

    move-result-object v7

    iget-object v0, v12, Lu4/h0;->p:Ls3/u1$h;

    iget-object v10, v0, Ls3/u1$h;->f:Ljava/lang/String;

    iget v11, v12, Lu4/h0;->u:I

    move-object v0, v13

    move-object v8, p0

    move-object/from16 v9, p2

    invoke-direct/range {v0 .. v11}, Lu4/g0;-><init>(Landroid/net/Uri;Lo5/j;Lu4/b0;Lw3/v;Lw3/u$a;Lo5/d0;Lu4/a0$a;Lu4/g0$b;Lo5/b;Ljava/lang/String;I)V

    return-object v13
.end method

.method public f(JZZ)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    iget-wide p1, p0, Lu4/h0;->w:J

    :cond_0
    iget-boolean v0, p0, Lu4/h0;->v:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Lu4/h0;->w:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lu4/h0;->x:Z

    if-ne v0, p3, :cond_1

    iget-boolean v0, p0, Lu4/h0;->y:Z

    if-ne v0, p4, :cond_1

    return-void

    :cond_1
    iput-wide p1, p0, Lu4/h0;->w:J

    iput-boolean p3, p0, Lu4/h0;->x:Z

    iput-boolean p4, p0, Lu4/h0;->y:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lu4/h0;->v:Z

    invoke-virtual {p0}, Lu4/h0;->F()V

    return-void
.end method

.method public g()Ls3/u1;
    .locals 1

    iget-object v0, p0, Lu4/h0;->o:Ls3/u1;

    return-object v0
.end method

.method public h()V
    .locals 0

    return-void
.end method
