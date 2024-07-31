.class public final Lcom/google/android/exoplayer2/source/dash/d$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/dash/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final a:Lu4/l0;

.field public final b:Ls3/n1;

.field public final c:Lk4/d;

.field public d:J

.field public final synthetic e:Lcom/google/android/exoplayer2/source/dash/d;


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/source/dash/d;Lo5/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->e:Lcom/google/android/exoplayer2/source/dash/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lu4/l0;->l(Lo5/b;)Lu4/l0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->a:Lu4/l0;

    new-instance p1, Ls3/n1;

    invoke-direct {p1}, Ls3/n1;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->b:Ls3/n1;

    new-instance p1, Lk4/d;

    invoke-direct {p1}, Lk4/d;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->c:Lk4/d;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->d:J

    return-void
.end method


# virtual methods
.method public a(JIIILx3/b0$a;)V
    .locals 7

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->a:Lu4/l0;

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lu4/l0;->a(JIIILx3/b0$a;)V

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/source/dash/d$c;->l()V

    return-void
.end method

.method public b(Ls3/m1;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->a:Lu4/l0;

    invoke-virtual {v0, p1}, Lu4/l0;->b(Ls3/m1;)V

    return-void
.end method

.method public d(Lp5/a0;II)V
    .locals 0

    iget-object p3, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->a:Lu4/l0;

    invoke-interface {p3, p1, p2}, Lx3/b0;->e(Lp5/a0;I)V

    return-void
.end method

.method public f(Lo5/h;IZI)I
    .locals 0

    iget-object p4, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->a:Lu4/l0;

    invoke-interface {p4, p1, p2, p3}, Lx3/b0;->c(Lo5/h;IZ)I

    move-result p1

    return p1
.end method

.method public final g()Lk4/d;
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->c:Lk4/d;

    invoke-virtual {v0}, Lv3/g;->l()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->a:Lu4/l0;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->b:Ls3/n1;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->c:Lk4/d;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, v3}, Lu4/l0;->S(Ls3/n1;Lv3/g;IZ)I

    move-result v0

    const/4 v1, -0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->c:Lk4/d;

    invoke-virtual {v0}, Lv3/g;->x()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->c:Lk4/d;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public h(J)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->e:Lcom/google/android/exoplayer2/source/dash/d;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/exoplayer2/source/dash/d;->j(J)Z

    move-result p1

    return p1
.end method

.method public i(Lw4/f;)V
    .locals 4

    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->d:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    iget-wide v2, p1, Lw4/f;->h:J

    cmp-long v0, v2, v0

    if-lez v0, :cond_1

    :cond_0
    iget-wide v0, p1, Lw4/f;->h:J

    iput-wide v0, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->d:J

    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->e:Lcom/google/android/exoplayer2/source/dash/d;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/source/dash/d;->m(Lw4/f;)V

    return-void
.end method

.method public j(Lw4/f;)Z
    .locals 4

    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->d:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    iget-wide v2, p1, Lw4/f;->g:J

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->e:Lcom/google/android/exoplayer2/source/dash/d;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/source/dash/d;->n(Z)Z

    move-result p1

    return p1
.end method

.method public final k(JJ)V
    .locals 1

    new-instance v0, Lcom/google/android/exoplayer2/source/dash/d$a;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/exoplayer2/source/dash/d$a;-><init>(JJ)V

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->e:Lcom/google/android/exoplayer2/source/dash/d;

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/dash/d;->d(Lcom/google/android/exoplayer2/source/dash/d;)Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->e:Lcom/google/android/exoplayer2/source/dash/d;

    invoke-static {p2}, Lcom/google/android/exoplayer2/source/dash/d;->d(Lcom/google/android/exoplayer2/source/dash/d;)Landroid/os/Handler;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final l()V
    .locals 5

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->a:Lu4/l0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lu4/l0;->K(Z)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/source/dash/d$c;->g()Lk4/d;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-wide v2, v0, Lv3/g;->l:J

    iget-object v4, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->e:Lcom/google/android/exoplayer2/source/dash/d;

    invoke-static {v4}, Lcom/google/android/exoplayer2/source/dash/d;->a(Lcom/google/android/exoplayer2/source/dash/d;)Lm4/b;

    move-result-object v4

    invoke-virtual {v4, v0}, Lk4/g;->a(Lk4/d;)Lk4/a;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v1}, Lk4/a;->e(I)Lk4/a$b;

    move-result-object v0

    check-cast v0, Lm4/a;

    iget-object v1, v0, Lm4/a;->h:Ljava/lang/String;

    iget-object v4, v0, Lm4/a;->i:Ljava/lang/String;

    invoke-static {v1, v4}, Lcom/google/android/exoplayer2/source/dash/d;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v2, v3, v0}, Lcom/google/android/exoplayer2/source/dash/d$c;->m(JLm4/a;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->a:Lu4/l0;

    invoke-virtual {v0}, Lu4/l0;->s()V

    return-void
.end method

.method public final m(JLm4/a;)V
    .locals 4

    invoke-static {p3}, Lcom/google/android/exoplayer2/source/dash/d;->c(Lm4/a;)J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, v0, v2

    if-nez p3, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/google/android/exoplayer2/source/dash/d$c;->k(JJ)V

    return-void
.end method

.method public n()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/d$c;->a:Lu4/l0;

    invoke-virtual {v0}, Lu4/l0;->T()V

    return-void
.end method
