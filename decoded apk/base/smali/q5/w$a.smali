.class public final Lq5/w$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq5/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Lq5/w;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lq5/w;)V
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
    iput-object p1, p0, Lq5/w$a;->a:Landroid/os/Handler;

    iput-object p2, p0, Lq5/w$a;->b:Lq5/w;

    return-void
.end method

.method public static synthetic a(Lq5/w$a;Lv3/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lq5/w$a;->s(Lv3/e;)V

    return-void
.end method

.method public static synthetic b(Lq5/w$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lq5/w$a;->r(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Lq5/w$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lq5/w$a;->y(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic d(Lq5/w$a;Lv3/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lq5/w$a;->u(Lv3/e;)V

    return-void
.end method

.method public static synthetic e(Lq5/w$a;Ljava/lang/Object;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lq5/w$a;->w(Ljava/lang/Object;J)V

    return-void
.end method

.method public static synthetic f(Lq5/w$a;IJ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lq5/w$a;->t(IJ)V

    return-void
.end method

.method public static synthetic g(Lq5/w$a;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lq5/w$a;->q(Ljava/lang/String;JJ)V

    return-void
.end method

.method public static synthetic h(Lq5/w$a;Lq5/y;)V
    .locals 0

    invoke-direct {p0, p1}, Lq5/w$a;->z(Lq5/y;)V

    return-void
.end method

.method public static synthetic i(Lq5/w$a;Ls3/m1;Lv3/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lq5/w$a;->v(Ls3/m1;Lv3/i;)V

    return-void
.end method

.method public static synthetic j(Lq5/w$a;JI)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lq5/w$a;->x(JI)V

    return-void
.end method

.method private synthetic q(Ljava/lang/String;JJ)V
    .locals 7

    iget-object v0, p0, Lq5/w$a;->b:Lq5/w;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lq5/w;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lq5/w;->d(Ljava/lang/String;JJ)V

    return-void
.end method

.method private synthetic r(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lq5/w$a;->b:Lq5/w;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq5/w;

    invoke-interface {v0, p1}, Lq5/w;->b(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic s(Lv3/e;)V
    .locals 1

    invoke-virtual {p1}, Lv3/e;->c()V

    iget-object v0, p0, Lq5/w$a;->b:Lq5/w;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq5/w;

    invoke-interface {v0, p1}, Lq5/w;->p(Lv3/e;)V

    return-void
.end method

.method private synthetic t(IJ)V
    .locals 1

    iget-object v0, p0, Lq5/w$a;->b:Lq5/w;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq5/w;

    invoke-interface {v0, p1, p2, p3}, Lq5/w;->i(IJ)V

    return-void
.end method

.method private synthetic u(Lv3/e;)V
    .locals 1

    iget-object v0, p0, Lq5/w$a;->b:Lq5/w;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq5/w;

    invoke-interface {v0, p1}, Lq5/w;->f(Lv3/e;)V

    return-void
.end method

.method private synthetic v(Ls3/m1;Lv3/i;)V
    .locals 1

    iget-object v0, p0, Lq5/w$a;->b:Lq5/w;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq5/w;

    invoke-interface {v0, p1}, Lq5/w;->A(Ls3/m1;)V

    iget-object v0, p0, Lq5/w$a;->b:Lq5/w;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq5/w;

    invoke-interface {v0, p1, p2}, Lq5/w;->c(Ls3/m1;Lv3/i;)V

    return-void
.end method

.method private synthetic w(Ljava/lang/Object;J)V
    .locals 1

    iget-object v0, p0, Lq5/w$a;->b:Lq5/w;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq5/w;

    invoke-interface {v0, p1, p2, p3}, Lq5/w;->k(Ljava/lang/Object;J)V

    return-void
.end method

.method private synthetic x(JI)V
    .locals 1

    iget-object v0, p0, Lq5/w$a;->b:Lq5/w;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq5/w;

    invoke-interface {v0, p1, p2, p3}, Lq5/w;->r(JI)V

    return-void
.end method

.method private synthetic y(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lq5/w$a;->b:Lq5/w;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq5/w;

    invoke-interface {v0, p1}, Lq5/w;->o(Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic z(Lq5/y;)V
    .locals 1

    iget-object v0, p0, Lq5/w$a;->b:Lq5/w;

    invoke-static {v0}, Lp5/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq5/w;

    invoke-interface {v0, p1}, Lq5/w;->onVideoSizeChanged(Lq5/y;)V

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lq5/w$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, Lq5/w$a;->a:Landroid/os/Handler;

    new-instance v3, Lq5/p;

    invoke-direct {v3, p0, p1, v0, v1}, Lq5/p;-><init>(Lq5/w$a;Ljava/lang/Object;J)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public B(JI)V
    .locals 2

    iget-object v0, p0, Lq5/w$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lq5/n;

    invoke-direct {v1, p0, p1, p2, p3}, Lq5/n;-><init>(Lq5/w$a;JI)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public C(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lq5/w$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lq5/o;

    invoke-direct {v1, p0, p1}, Lq5/o;-><init>(Lq5/w$a;Ljava/lang/Exception;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public D(Lq5/y;)V
    .locals 2

    iget-object v0, p0, Lq5/w$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lq5/s;

    invoke-direct {v1, p0, p1}, Lq5/s;-><init>(Lq5/w$a;Lq5/y;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public k(Ljava/lang/String;JJ)V
    .locals 9

    iget-object v0, p0, Lq5/w$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v8, Lq5/r;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lq5/r;-><init>(Lq5/w$a;Ljava/lang/String;JJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lq5/w$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lq5/q;

    invoke-direct {v1, p0, p1}, Lq5/q;-><init>(Lq5/w$a;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public m(Lv3/e;)V
    .locals 2

    invoke-virtual {p1}, Lv3/e;->c()V

    iget-object v0, p0, Lq5/w$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lq5/u;

    invoke-direct {v1, p0, p1}, Lq5/u;-><init>(Lq5/w$a;Lv3/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public n(IJ)V
    .locals 2

    iget-object v0, p0, Lq5/w$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lq5/m;

    invoke-direct {v1, p0, p1, p2, p3}, Lq5/m;-><init>(Lq5/w$a;IJ)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public o(Lv3/e;)V
    .locals 2

    iget-object v0, p0, Lq5/w$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lq5/v;

    invoke-direct {v1, p0, p1}, Lq5/v;-><init>(Lq5/w$a;Lv3/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public p(Ls3/m1;Lv3/i;)V
    .locals 2

    iget-object v0, p0, Lq5/w$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lq5/t;

    invoke-direct {v1, p0, p1, p2}, Lq5/t;-><init>(Lq5/w$a;Ls3/m1;Lv3/i;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
