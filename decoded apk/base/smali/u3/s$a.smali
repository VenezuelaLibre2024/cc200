.class public final Lu3/s$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu3/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Lu3/s;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lu3/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lu3/s$a;->a:Landroid/os/Handler;

    iput-object p2, p0, Lu3/s$a;->b:Lu3/s;

    return-void
.end method

.method private synthetic A(IJJ)V
    .locals 7

    iget-object v0, p0, Lu3/s$a;->b:Lu3/s;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lu3/s;

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lu3/s;->q(IJJ)V

    return-void
.end method

.method public static synthetic a(Lu3/s$a;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lu3/s$a;->z(Z)V

    return-void
.end method

.method public static synthetic b(Lu3/s$a;Lv3/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lu3/s$a;->v(Lv3/e;)V

    return-void
.end method

.method public static synthetic c(Lu3/s$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lu3/s$a;->r(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic d(Lu3/s$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lu3/s$a;->s(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic e(Lu3/s$a;Ls3/m1;Lv3/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu3/s$a;->x(Ls3/m1;Lv3/i;)V

    return-void
.end method

.method public static synthetic f(Lu3/s$a;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lu3/s$a;->t(Ljava/lang/String;JJ)V

    return-void
.end method

.method public static synthetic g(Lu3/s$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lu3/s$a;->u(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic h(Lu3/s$a;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu3/s$a;->y(J)V

    return-void
.end method

.method public static synthetic i(Lu3/s$a;IJJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lu3/s$a;->A(IJJ)V

    return-void
.end method

.method public static synthetic j(Lu3/s$a;Lv3/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lu3/s$a;->w(Lv3/e;)V

    return-void
.end method

.method private synthetic r(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lu3/s$a;->b:Lu3/s;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/s;

    invoke-interface {v0, p1}, Lu3/s;->n(Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic s(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lu3/s$a;->b:Lu3/s;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/s;

    invoke-interface {v0, p1}, Lu3/s;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic t(Ljava/lang/String;JJ)V
    .locals 7

    iget-object v0, p0, Lu3/s$a;->b:Lu3/s;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lu3/s;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lu3/s;->h(Ljava/lang/String;JJ)V

    return-void
.end method

.method private synthetic u(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lu3/s$a;->b:Lu3/s;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/s;

    invoke-interface {v0, p1}, Lu3/s;->g(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic v(Lv3/e;)V
    .locals 1

    invoke-virtual {p1}, Lv3/e;->c()V

    iget-object v0, p0, Lu3/s$a;->b:Lu3/s;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/s;

    invoke-interface {v0, p1}, Lu3/s;->j(Lv3/e;)V

    return-void
.end method

.method private synthetic w(Lv3/e;)V
    .locals 1

    iget-object v0, p0, Lu3/s$a;->b:Lu3/s;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/s;

    invoke-interface {v0, p1}, Lu3/s;->m(Lv3/e;)V

    return-void
.end method

.method private synthetic x(Ls3/m1;Lv3/i;)V
    .locals 1

    iget-object v0, p0, Lu3/s$a;->b:Lu3/s;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/s;

    invoke-interface {v0, p1}, Lu3/s;->t(Ls3/m1;)V

    iget-object v0, p0, Lu3/s$a;->b:Lu3/s;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/s;

    invoke-interface {v0, p1, p2}, Lu3/s;->e(Ls3/m1;Lv3/i;)V

    return-void
.end method

.method private synthetic y(J)V
    .locals 1

    iget-object v0, p0, Lu3/s$a;->b:Lu3/s;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/s;

    invoke-interface {v0, p1, p2}, Lu3/s;->l(J)V

    return-void
.end method

.method private synthetic z(Z)V
    .locals 1

    iget-object v0, p0, Lu3/s$a;->b:Lu3/s;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/s;

    invoke-interface {v0, p1}, Lu3/s;->onSkipSilenceEnabledChanged(Z)V

    return-void
.end method


# virtual methods
.method public B(J)V
    .locals 2

    iget-object v0, p0, Lu3/s$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lu3/j;

    invoke-direct {v1, p0, p1, p2}, Lu3/j;-><init>(Lu3/s$a;J)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public C(Z)V
    .locals 2

    iget-object v0, p0, Lu3/s$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lu3/r;

    invoke-direct {v1, p0, p1}, Lu3/r;-><init>(Lu3/s$a;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public D(IJJ)V
    .locals 9

    iget-object v0, p0, Lu3/s$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v8, Lu3/i;

    move-object v1, v8

    move-object v2, p0

    move v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lu3/i;-><init>(Lu3/s$a;IJJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public k(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lu3/s$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lu3/k;

    invoke-direct {v1, p0, p1}, Lu3/k;-><init>(Lu3/s$a;Ljava/lang/Exception;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public l(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lu3/s$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lu3/l;

    invoke-direct {v1, p0, p1}, Lu3/l;-><init>(Lu3/s$a;Ljava/lang/Exception;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public m(Ljava/lang/String;JJ)V
    .locals 9

    iget-object v0, p0, Lu3/s$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v8, Lu3/n;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lu3/n;-><init>(Lu3/s$a;Ljava/lang/String;JJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lu3/s$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lu3/m;

    invoke-direct {v1, p0, p1}, Lu3/m;-><init>(Lu3/s$a;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public o(Lv3/e;)V
    .locals 2

    invoke-virtual {p1}, Lv3/e;->c()V

    iget-object v0, p0, Lu3/s$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lu3/p;

    invoke-direct {v1, p0, p1}, Lu3/p;-><init>(Lu3/s$a;Lv3/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public p(Lv3/e;)V
    .locals 2

    iget-object v0, p0, Lu3/s$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lu3/q;

    invoke-direct {v1, p0, p1}, Lu3/q;-><init>(Lu3/s$a;Lv3/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public q(Ls3/m1;Lv3/i;)V
    .locals 2

    iget-object v0, p0, Lu3/s$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lu3/o;

    invoke-direct {v1, p0, p1, p2}, Lu3/o;-><init>(Lu3/s$a;Ls3/m1;Lv3/i;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
