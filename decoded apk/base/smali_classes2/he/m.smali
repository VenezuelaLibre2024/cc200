.class public final Lhe/m;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lhe/l0;

.field public static final b:Lhe/l0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhe/l0;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lhe/m;->a:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lhe/m;->b:Lhe/l0;

    return-void
.end method

.method public static final synthetic a()Lhe/l0;
    .locals 1

    sget-object v0, Lhe/m;->a:Lhe/l0;

    return-object v0
.end method

.method public static final b(Ljd/d;Ljava/lang/Object;Lsd/l;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljd/d<",
            "-TT;>;",
            "Ljava/lang/Object;",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p0, Lhe/l;

    if-eqz v0, :cond_8

    check-cast p0, Lhe/l;

    invoke-static {p1, p2}, Lce/g0;->c(Ljava/lang/Object;Lsd/l;)Ljava/lang/Object;

    move-result-object p2

    iget-object v0, p0, Lhe/l;->k:Lce/k0;

    invoke-virtual {p0}, Lhe/l;->getContext()Ljd/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lce/k0;->I0(Ljd/g;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-object p2, p0, Lhe/l;->m:Ljava/lang/Object;

    iput v1, p0, Lce/d1;->j:I

    iget-object p1, p0, Lhe/l;->k:Lce/k0;

    invoke-virtual {p0}, Lhe/l;->getContext()Ljd/g;

    move-result-object p2

    invoke-virtual {p1, p2, p0}, Lce/k0;->H0(Ljd/g;Ljava/lang/Runnable;)V

    goto/16 :goto_4

    :cond_0
    invoke-static {}, Lce/t0;->a()Z

    move-result v0

    sget-object v0, Lce/y2;->a:Lce/y2;

    invoke-virtual {v0}, Lce/y2;->b()Lce/m1;

    move-result-object v0

    invoke-virtual {v0}, Lce/m1;->R0()Z

    move-result v2

    if-eqz v2, :cond_1

    iput-object p2, p0, Lhe/l;->m:Ljava/lang/Object;

    iput v1, p0, Lce/d1;->j:I

    invoke-virtual {v0, p0}, Lce/m1;->N0(Lce/d1;)V

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v0, v1}, Lce/m1;->P0(Z)V

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0}, Lhe/l;->getContext()Ljd/g;

    move-result-object v3

    sget-object v4, Lce/c2;->c:Lce/c2$b;

    invoke-interface {v3, v4}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object v3

    check-cast v3, Lce/c2;

    if-eqz v3, :cond_2

    invoke-interface {v3}, Lce/c2;->a()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-interface {v3}, Lce/c2;->K()Ljava/util/concurrent/CancellationException;

    move-result-object v3

    invoke-virtual {p0, p2, v3}, Lhe/l;->a(Ljava/lang/Object;Ljava/lang/Throwable;)V

    sget-object p2, Lgd/k;->i:Lgd/k$a;

    invoke-static {v3}, Lgd/l;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p0, p2}, Ljd/d;->resumeWith(Ljava/lang/Object;)V

    move p2, v1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_7

    iget-object p2, p0, Lhe/l;->l:Ljd/d;

    iget-object v3, p0, Lhe/l;->n:Ljava/lang/Object;

    invoke-interface {p2}, Ljd/d;->getContext()Ljd/g;

    move-result-object v4

    invoke-static {v4, v3}, Lhe/p0;->c(Ljd/g;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lhe/p0;->a:Lhe/l0;

    if-eq v3, v5, :cond_3

    invoke-static {p2, v4, v3}, Lce/j0;->g(Ljd/d;Ljd/g;Ljava/lang/Object;)Lce/h3;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_1

    :cond_3
    move-object p2, v2

    :goto_1
    :try_start_1
    iget-object v5, p0, Lhe/l;->l:Ljd/d;

    invoke-interface {v5, p1}, Ljd/d;->resumeWith(Ljava/lang/Object;)V

    sget-object p1, Lgd/s;->a:Lgd/s;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_4

    :try_start_2
    invoke-virtual {p2}, Lce/h3;->S0()Z

    move-result p1

    if-eqz p1, :cond_7

    :cond_4
    invoke-static {v4, v3}, Lhe/p0;->a(Ljd/g;Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lce/h3;->S0()Z

    move-result p2

    if-eqz p2, :cond_6

    :cond_5
    invoke-static {v4, v3}, Lhe/p0;->a(Ljd/g;Ljava/lang/Object;)V

    :cond_6
    throw p1

    :cond_7
    :goto_2
    invoke-virtual {v0}, Lce/m1;->U0()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-nez p1, :cond_7

    goto :goto_3

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-virtual {p0, p1, v2}, Lce/d1;->l(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_3
    invoke-virtual {v0, v1}, Lce/m1;->K0(Z)V

    goto :goto_4

    :catchall_2
    move-exception p0

    invoke-virtual {v0, v1}, Lce/m1;->K0(Z)V

    throw p0

    :cond_8
    invoke-interface {p0, p1}, Ljd/d;->resumeWith(Ljava/lang/Object;)V

    :goto_4
    return-void
.end method

.method public static synthetic c(Ljd/d;Ljava/lang/Object;Lsd/l;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lhe/m;->b(Ljd/d;Ljava/lang/Object;Lsd/l;)V

    return-void
.end method
