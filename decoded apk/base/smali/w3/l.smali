.class public final Lw3/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw3/x;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Ls3/u1$f;

.field public c:Lw3/v;

.field public d:Lo5/j$a;

.field public e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lw3/l;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ls3/u1;)Lw3/v;
    .locals 2

    iget-object v0, p1, Ls3/u1;->i:Ls3/u1$h;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, Ls3/u1;->i:Ls3/u1$h;

    iget-object p1, p1, Ls3/u1$h;->c:Ls3/u1$f;

    if-eqz p1, :cond_2

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x12

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lw3/l;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lw3/l;->b:Ls3/u1$f;

    invoke-static {p1, v1}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iput-object p1, p0, Lw3/l;->b:Ls3/u1$f;

    invoke-virtual {p0, p1}, Lw3/l;->b(Ls3/u1$f;)Lw3/v;

    move-result-object p1

    iput-object p1, p0, Lw3/l;->c:Lw3/v;

    :cond_1
    iget-object p1, p0, Lw3/l;->c:Lw3/v;

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw3/v;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_0
    sget-object p1, Lw3/v;->a:Lw3/v;

    return-object p1
.end method

.method public final b(Ls3/u1$f;)Lw3/v;
    .locals 4

    iget-object v0, p0, Lw3/l;->d:Lo5/j$a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lo5/s$b;

    invoke-direct {v0}, Lo5/s$b;-><init>()V

    iget-object v1, p0, Lw3/l;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo5/s$b;->e(Ljava/lang/String;)Lo5/s$b;

    move-result-object v0

    :goto_0
    new-instance v1, Lw3/g0;

    iget-object v2, p1, Ls3/u1$f;->c:Landroid/net/Uri;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1
    iget-boolean v3, p1, Ls3/u1$f;->h:Z

    invoke-direct {v1, v2, v3, v0}, Lw3/g0;-><init>(Ljava/lang/String;ZLo5/j$a;)V

    iget-object v0, p1, Ls3/u1$f;->e:Li7/v;

    invoke-virtual {v0}, Li7/v;->g()Li7/x;

    move-result-object v0

    invoke-virtual {v0}, Li7/x;->j()Li7/d1;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v3, v2}, Lw3/g0;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    new-instance v0, Lw3/h$b;

    invoke-direct {v0}, Lw3/h$b;-><init>()V

    iget-object v2, p1, Ls3/u1$f;->a:Ljava/util/UUID;

    sget-object v3, Lw3/f0;->d:Lw3/b0$c;

    invoke-virtual {v0, v2, v3}, Lw3/h$b;->e(Ljava/util/UUID;Lw3/b0$c;)Lw3/h$b;

    move-result-object v0

    iget-boolean v2, p1, Ls3/u1$f;->f:Z

    invoke-virtual {v0, v2}, Lw3/h$b;->b(Z)Lw3/h$b;

    move-result-object v0

    iget-boolean v2, p1, Ls3/u1$f;->g:Z

    invoke-virtual {v0, v2}, Lw3/h$b;->c(Z)Lw3/h$b;

    move-result-object v0

    iget-object v2, p1, Ls3/u1$f;->j:Li7/u;

    invoke-static {v2}, Lk7/e;->l(Ljava/util/Collection;)[I

    move-result-object v2

    invoke-virtual {v0, v2}, Lw3/h$b;->d([I)Lw3/h$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lw3/h$b;->a(Lw3/i0;)Lw3/h;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1}, Ls3/u1$f;->c()[B

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lw3/h;->F(I[B)V

    return-object v0
.end method
