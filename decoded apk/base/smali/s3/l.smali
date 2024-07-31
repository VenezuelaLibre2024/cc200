.class public final Ls3/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/l$a;
    }
.end annotation


# instance fields
.field public final h:Lp5/f0;

.field public final i:Ls3/l$a;

.field public j:Ls3/i3;

.field public k:Lp5/t;

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>(Ls3/l$a;Lp5/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/l;->i:Ls3/l$a;

    new-instance p1, Lp5/f0;

    invoke-direct {p1, p2}, Lp5/f0;-><init>(Lp5/d;)V

    iput-object p1, p0, Ls3/l;->h:Lp5/f0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls3/l;->l:Z

    return-void
.end method


# virtual methods
.method public a(Ls3/i3;)V
    .locals 1

    iget-object v0, p0, Ls3/l;->j:Ls3/i3;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Ls3/l;->k:Lp5/t;

    iput-object p1, p0, Ls3/l;->j:Ls3/i3;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls3/l;->l:Z

    :cond_0
    return-void
.end method

.method public b(Ls3/i3;)V
    .locals 2

    invoke-interface {p1}, Ls3/i3;->E()Lp5/t;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Ls3/l;->k:Lp5/t;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    iput-object v0, p0, Ls3/l;->k:Lp5/t;

    iput-object p1, p0, Ls3/l;->j:Ls3/i3;

    iget-object p1, p0, Ls3/l;->h:Lp5/f0;

    invoke-virtual {p1}, Lp5/f0;->h()Ls3/a3;

    move-result-object p1

    invoke-interface {v0, p1}, Lp5/t;->d(Ls3/a3;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Multiple renderer media clocks enabled."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ls3/q;->h(Ljava/lang/RuntimeException;)Ls3/q;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public c(J)V
    .locals 1

    iget-object v0, p0, Ls3/l;->h:Lp5/f0;

    invoke-virtual {v0, p1, p2}, Lp5/f0;->a(J)V

    return-void
.end method

.method public d(Ls3/a3;)V
    .locals 1

    iget-object v0, p0, Ls3/l;->k:Lp5/t;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lp5/t;->d(Ls3/a3;)V

    iget-object p1, p0, Ls3/l;->k:Lp5/t;

    invoke-interface {p1}, Lp5/t;->h()Ls3/a3;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Ls3/l;->h:Lp5/f0;

    invoke-virtual {v0, p1}, Lp5/f0;->d(Ls3/a3;)V

    return-void
.end method

.method public final e(Z)Z
    .locals 1

    iget-object v0, p0, Ls3/l;->j:Ls3/i3;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ls3/i3;->c()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ls3/l;->j:Ls3/i3;

    invoke-interface {v0}, Ls3/i3;->e()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_1

    iget-object p1, p0, Ls3/l;->j:Ls3/i3;

    invoke-interface {p1}, Ls3/i3;->j()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls3/l;->m:Z

    iget-object v0, p0, Ls3/l;->h:Lp5/f0;

    invoke-virtual {v0}, Lp5/f0;->b()V

    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls3/l;->m:Z

    iget-object v0, p0, Ls3/l;->h:Lp5/f0;

    invoke-virtual {v0}, Lp5/f0;->c()V

    return-void
.end method

.method public h()Ls3/a3;
    .locals 1

    iget-object v0, p0, Ls3/l;->k:Lp5/t;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp5/t;->h()Ls3/a3;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls3/l;->h:Lp5/f0;

    invoke-virtual {v0}, Lp5/f0;->h()Ls3/a3;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public i(Z)J
    .locals 2

    invoke-virtual {p0, p1}, Ls3/l;->j(Z)V

    invoke-virtual {p0}, Ls3/l;->s()J

    move-result-wide v0

    return-wide v0
.end method

.method public final j(Z)V
    .locals 4

    invoke-virtual {p0, p1}, Ls3/l;->e(Z)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls3/l;->l:Z

    iget-boolean p1, p0, Ls3/l;->m:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls3/l;->h:Lp5/f0;

    invoke-virtual {p1}, Lp5/f0;->b()V

    :cond_0
    return-void

    :cond_1
    iget-object p1, p0, Ls3/l;->k:Lp5/t;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp5/t;

    invoke-interface {p1}, Lp5/t;->s()J

    move-result-wide v0

    iget-boolean v2, p0, Ls3/l;->l:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Ls3/l;->h:Lp5/f0;

    invoke-virtual {v2}, Lp5/f0;->s()J

    move-result-wide v2

    cmp-long v2, v0, v2

    if-gez v2, :cond_2

    iget-object p1, p0, Ls3/l;->h:Lp5/f0;

    invoke-virtual {p1}, Lp5/f0;->c()V

    return-void

    :cond_2
    const/4 v2, 0x0

    iput-boolean v2, p0, Ls3/l;->l:Z

    iget-boolean v2, p0, Ls3/l;->m:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Ls3/l;->h:Lp5/f0;

    invoke-virtual {v2}, Lp5/f0;->b()V

    :cond_3
    iget-object v2, p0, Ls3/l;->h:Lp5/f0;

    invoke-virtual {v2, v0, v1}, Lp5/f0;->a(J)V

    invoke-interface {p1}, Lp5/t;->h()Ls3/a3;

    move-result-object p1

    iget-object v0, p0, Ls3/l;->h:Lp5/f0;

    invoke-virtual {v0}, Lp5/f0;->h()Ls3/a3;

    move-result-object v0

    invoke-virtual {p1, v0}, Ls3/a3;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Ls3/l;->h:Lp5/f0;

    invoke-virtual {v0, p1}, Lp5/f0;->d(Ls3/a3;)V

    iget-object v0, p0, Ls3/l;->i:Ls3/l$a;

    invoke-interface {v0, p1}, Ls3/l$a;->onPlaybackParametersChanged(Ls3/a3;)V

    :cond_4
    return-void
.end method

.method public s()J
    .locals 2

    iget-boolean v0, p0, Ls3/l;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls3/l;->h:Lp5/f0;

    invoke-virtual {v0}, Lp5/f0;->s()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls3/l;->k:Lp5/t;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp5/t;

    invoke-interface {v0}, Lp5/t;->s()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method
