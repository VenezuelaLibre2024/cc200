.class public final Lh4/v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh4/b0;


# instance fields
.field public a:Ls3/m1;

.field public b:Lp5/j0;

.field public c:Lx3/b0;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls3/m1$b;

    invoke-direct {v0}, Ls3/m1$b;-><init>()V

    invoke-virtual {v0, p1}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object p1

    invoke-virtual {p1}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object p1

    iput-object p1, p0, Lh4/v;->a:Ls3/m1;

    return-void
.end method


# virtual methods
.method public a(Lp5/a0;)V
    .locals 8

    invoke-virtual {p0}, Lh4/v;->c()V

    iget-object v0, p0, Lh4/v;->b:Lp5/j0;

    invoke-virtual {v0}, Lp5/j0;->d()J

    move-result-wide v2

    iget-object v0, p0, Lh4/v;->b:Lp5/j0;

    invoke-virtual {v0}, Lp5/j0;->e()J

    move-result-wide v0

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    cmp-long v4, v0, v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lh4/v;->a:Ls3/m1;

    iget-wide v5, v4, Ls3/m1;->w:J

    cmp-long v5, v0, v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Ls3/m1;->b()Ls3/m1$b;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Ls3/m1$b;->k0(J)Ls3/m1$b;

    move-result-object v0

    invoke-virtual {v0}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v0

    iput-object v0, p0, Lh4/v;->a:Ls3/m1;

    iget-object v1, p0, Lh4/v;->c:Lx3/b0;

    invoke-interface {v1, v0}, Lx3/b0;->b(Ls3/m1;)V

    :cond_1
    invoke-virtual {p1}, Lp5/a0;->a()I

    move-result v5

    iget-object v0, p0, Lh4/v;->c:Lx3/b0;

    invoke-interface {v0, p1, v5}, Lx3/b0;->e(Lp5/a0;I)V

    iget-object v1, p0, Lh4/v;->c:Lx3/b0;

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v1 .. v7}, Lx3/b0;->a(JIIILx3/b0$a;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public b(Lp5/j0;Lx3/m;Lh4/i0$d;)V
    .locals 0

    iput-object p1, p0, Lh4/v;->b:Lp5/j0;

    invoke-virtual {p3}, Lh4/i0$d;->a()V

    invoke-virtual {p3}, Lh4/i0$d;->c()I

    move-result p1

    const/4 p3, 0x5

    invoke-interface {p2, p1, p3}, Lx3/m;->e(II)Lx3/b0;

    move-result-object p1

    iput-object p1, p0, Lh4/v;->c:Lx3/b0;

    iget-object p2, p0, Lh4/v;->a:Ls3/m1;

    invoke-interface {p1, p2}, Lx3/b0;->b(Ls3/m1;)V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lh4/v;->b:Lp5/j0;

    invoke-static {v0}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lh4/v;->c:Lx3/b0;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
