.class public final Lu4/f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu4/a0;
.implements Lw3/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu4/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public b:Lu4/a0$a;

.field public c:Lw3/u$a;

.field public final synthetic d:Lu4/f;


# direct methods
.method public constructor <init>(Lu4/f;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iput-object p1, p0, Lu4/f$a;->d:Lu4/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lu4/a;->w(Lu4/t$b;)Lu4/a0$a;

    move-result-object v1

    iput-object v1, p0, Lu4/f$a;->b:Lu4/a0$a;

    invoke-virtual {p1, v0}, Lu4/a;->u(Lu4/t$b;)Lw3/u$a;

    move-result-object p1

    iput-object p1, p0, Lu4/f$a;->c:Lw3/u$a;

    iput-object p2, p0, Lu4/f$a;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public A(ILu4/t$b;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu4/f$a;->v(ILu4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu4/f$a;->c:Lw3/u$a;

    invoke-virtual {p1}, Lw3/u$a;->i()V

    :cond_0
    return-void
.end method

.method public E(ILu4/t$b;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu4/f$a;->v(ILu4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu4/f$a;->c:Lw3/u$a;

    invoke-virtual {p1}, Lw3/u$a;->j()V

    :cond_0
    return-void
.end method

.method public F(ILu4/t$b;Ljava/lang/Exception;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu4/f$a;->v(ILu4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu4/f$a;->c:Lw3/u$a;

    invoke-virtual {p1, p3}, Lw3/u$a;->l(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public G(ILu4/t$b;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu4/f$a;->v(ILu4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu4/f$a;->c:Lw3/u$a;

    invoke-virtual {p1, p3}, Lw3/u$a;->k(I)V

    :cond_0
    return-void
.end method

.method public H(ILu4/t$b;Lu4/q;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu4/f$a;->v(ILu4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu4/f$a;->b:Lu4/a0$a;

    invoke-virtual {p0, p3}, Lu4/f$a;->K(Lu4/q;)Lu4/q;

    move-result-object p2

    invoke-virtual {p1, p2}, Lu4/a0$a;->j(Lu4/q;)V

    :cond_0
    return-void
.end method

.method public I(ILu4/t$b;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu4/f$a;->v(ILu4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu4/f$a;->b:Lu4/a0$a;

    invoke-virtual {p0, p4}, Lu4/f$a;->K(Lu4/q;)Lu4/q;

    move-result-object p2

    invoke-virtual {p1, p3, p2, p5, p6}, Lu4/a0$a;->y(Lu4/n;Lu4/q;Ljava/io/IOException;Z)V

    :cond_0
    return-void
.end method

.method public J(ILu4/t$b;Lu4/n;Lu4/q;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu4/f$a;->v(ILu4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu4/f$a;->b:Lu4/a0$a;

    invoke-virtual {p0, p4}, Lu4/f$a;->K(Lu4/q;)Lu4/q;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lu4/a0$a;->s(Lu4/n;Lu4/q;)V

    :cond_0
    return-void
.end method

.method public final K(Lu4/q;)Lu4/q;
    .locals 14

    iget-object v0, p0, Lu4/f$a;->d:Lu4/f;

    iget-object v1, p0, Lu4/f$a;->a:Ljava/lang/Object;

    iget-wide v2, p1, Lu4/q;->f:J

    invoke-virtual {v0, v1, v2, v3}, Lu4/f;->H(Ljava/lang/Object;J)J

    move-result-wide v10

    iget-object v0, p0, Lu4/f$a;->d:Lu4/f;

    iget-object v1, p0, Lu4/f$a;->a:Ljava/lang/Object;

    iget-wide v2, p1, Lu4/q;->g:J

    invoke-virtual {v0, v1, v2, v3}, Lu4/f;->H(Ljava/lang/Object;J)J

    move-result-wide v12

    iget-wide v0, p1, Lu4/q;->f:J

    cmp-long v0, v10, v0

    if-nez v0, :cond_0

    iget-wide v0, p1, Lu4/q;->g:J

    cmp-long v0, v12, v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Lu4/q;

    iget v5, p1, Lu4/q;->a:I

    iget v6, p1, Lu4/q;->b:I

    iget-object v7, p1, Lu4/q;->c:Ls3/m1;

    iget v8, p1, Lu4/q;->d:I

    iget-object v9, p1, Lu4/q;->e:Ljava/lang/Object;

    move-object v4, v0

    invoke-direct/range {v4 .. v13}, Lu4/q;-><init>(IILs3/m1;ILjava/lang/Object;JJ)V

    return-object v0
.end method

.method public s(ILu4/t$b;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu4/f$a;->v(ILu4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu4/f$a;->c:Lw3/u$a;

    invoke-virtual {p1}, Lw3/u$a;->h()V

    :cond_0
    return-void
.end method

.method public t(ILu4/t$b;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu4/f$a;->v(ILu4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu4/f$a;->c:Lw3/u$a;

    invoke-virtual {p1}, Lw3/u$a;->m()V

    :cond_0
    return-void
.end method

.method public u(ILu4/t$b;Lu4/n;Lu4/q;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu4/f$a;->v(ILu4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu4/f$a;->b:Lu4/a0$a;

    invoke-virtual {p0, p4}, Lu4/f$a;->K(Lu4/q;)Lu4/q;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lu4/a0$a;->v(Lu4/n;Lu4/q;)V

    :cond_0
    return-void
.end method

.method public final v(ILu4/t$b;)Z
    .locals 3

    if-eqz p2, :cond_0

    iget-object v0, p0, Lu4/f$a;->d:Lu4/f;

    iget-object v1, p0, Lu4/f$a;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, p2}, Lu4/f;->G(Ljava/lang/Object;Lu4/t$b;)Lu4/t$b;

    move-result-object p2

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p2, 0x0

    :cond_1
    iget-object v0, p0, Lu4/f$a;->d:Lu4/f;

    iget-object v1, p0, Lu4/f$a;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Lu4/f;->I(Ljava/lang/Object;I)I

    move-result p1

    iget-object v0, p0, Lu4/f$a;->b:Lu4/a0$a;

    iget v1, v0, Lu4/a0$a;->a:I

    if-ne v1, p1, :cond_2

    iget-object v0, v0, Lu4/a0$a;->b:Lu4/t$b;

    invoke-static {v0, p2}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    iget-object v0, p0, Lu4/f$a;->d:Lu4/f;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, p1, p2, v1, v2}, Lu4/a;->v(ILu4/t$b;J)Lu4/a0$a;

    move-result-object v0

    iput-object v0, p0, Lu4/f$a;->b:Lu4/a0$a;

    :cond_3
    iget-object v0, p0, Lu4/f$a;->c:Lw3/u$a;

    iget v1, v0, Lw3/u$a;->a:I

    if-ne v1, p1, :cond_4

    iget-object v0, v0, Lw3/u$a;->b:Lu4/t$b;

    invoke-static {v0, p2}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    iget-object v0, p0, Lu4/f$a;->d:Lu4/f;

    invoke-virtual {v0, p1, p2}, Lu4/a;->t(ILu4/t$b;)Lw3/u$a;

    move-result-object p1

    iput-object p1, p0, Lu4/f$a;->c:Lw3/u$a;

    :cond_5
    const/4 p1, 0x1

    return p1
.end method

.method public y(ILu4/t$b;Lu4/n;Lu4/q;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu4/f$a;->v(ILu4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu4/f$a;->b:Lu4/a0$a;

    invoke-virtual {p0, p4}, Lu4/f$a;->K(Lu4/q;)Lu4/q;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lu4/a0$a;->B(Lu4/n;Lu4/q;)V

    :cond_0
    return-void
.end method

.method public z(ILu4/t$b;Lu4/q;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu4/f$a;->v(ILu4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu4/f$a;->b:Lu4/a0$a;

    invoke-virtual {p0, p3}, Lu4/f$a;->K(Lu4/q;)Lu4/q;

    move-result-object p2

    invoke-virtual {p1, p2}, Lu4/a0$a;->E(Lu4/q;)V

    :cond_0
    return-void
.end method
