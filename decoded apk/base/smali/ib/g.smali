.class public Lib/g;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final n:Ljava/lang/String; = "g"


# instance fields
.field public a:Lib/k;

.field public b:Lib/j;

.field public c:Lib/h;

.field public d:Landroid/os/Handler;

.field public e:Lib/m;

.field public f:Z

.field public g:Z

.field public h:Landroid/os/Handler;

.field public i:Lib/i;

.field public j:Ljava/lang/Runnable;

.field public k:Ljava/lang/Runnable;

.field public l:Ljava/lang/Runnable;

.field public m:Ljava/lang/Runnable;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lib/g;->f:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lib/g;->g:Z

    new-instance v0, Lib/i;

    invoke-direct {v0}, Lib/i;-><init>()V

    iput-object v0, p0, Lib/g;->i:Lib/i;

    new-instance v0, Lib/g$a;

    invoke-direct {v0, p0}, Lib/g$a;-><init>(Lib/g;)V

    iput-object v0, p0, Lib/g;->j:Ljava/lang/Runnable;

    new-instance v0, Lib/g$b;

    invoke-direct {v0, p0}, Lib/g$b;-><init>(Lib/g;)V

    iput-object v0, p0, Lib/g;->k:Ljava/lang/Runnable;

    new-instance v0, Lib/g$c;

    invoke-direct {v0, p0}, Lib/g$c;-><init>(Lib/g;)V

    iput-object v0, p0, Lib/g;->l:Ljava/lang/Runnable;

    new-instance v0, Lib/g$d;

    invoke-direct {v0, p0}, Lib/g$d;-><init>(Lib/g;)V

    iput-object v0, p0, Lib/g;->m:Ljava/lang/Runnable;

    invoke-static {}, Lhb/u;->a()V

    invoke-static {}, Lib/k;->d()Lib/k;

    move-result-object v0

    iput-object v0, p0, Lib/g;->a:Lib/k;

    new-instance v0, Lib/h;

    invoke-direct {v0, p1}, Lib/h;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lib/g;->c:Lib/h;

    iget-object p1, p0, Lib/g;->i:Lib/i;

    invoke-virtual {v0, p1}, Lib/h;->o(Lib/i;)V

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lib/g;->h:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic a(Lib/g;Lib/p;)V
    .locals 0

    invoke-direct {p0, p1}, Lib/g;->q(Lib/p;)V

    return-void
.end method

.method public static synthetic b(Lib/g;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lib/g;->s(Z)V

    return-void
.end method

.method public static synthetic c(Lib/g;Lib/p;)V
    .locals 0

    invoke-direct {p0, p1}, Lib/g;->r(Lib/p;)V

    return-void
.end method

.method public static synthetic d()Ljava/lang/String;
    .locals 1

    sget-object v0, Lib/g;->n:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic e(Lib/g;)Lib/h;
    .locals 0

    iget-object p0, p0, Lib/g;->c:Lib/h;

    return-object p0
.end method

.method public static synthetic f(Lib/g;Ljava/lang/Exception;)V
    .locals 0

    invoke-virtual {p0, p1}, Lib/g;->t(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic g(Lib/g;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lib/g;->d:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic h(Lib/g;)Lhb/s;
    .locals 0

    invoke-virtual {p0}, Lib/g;->o()Lhb/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lib/g;)Lib/j;
    .locals 0

    iget-object p0, p0, Lib/g;->b:Lib/j;

    return-object p0
.end method

.method public static synthetic j(Lib/g;Z)Z
    .locals 0

    iput-boolean p1, p0, Lib/g;->g:Z

    return p1
.end method

.method public static synthetic k(Lib/g;)Lib/k;
    .locals 0

    iget-object p0, p0, Lib/g;->a:Lib/k;

    return-object p0
.end method

.method private synthetic q(Lib/p;)V
    .locals 1

    iget-object v0, p0, Lib/g;->c:Lib/h;

    invoke-virtual {v0, p1}, Lib/h;->m(Lib/p;)V

    return-void
.end method

.method private synthetic r(Lib/p;)V
    .locals 2

    iget-boolean v0, p0, Lib/g;->f:Z

    if-nez v0, :cond_0

    sget-object p1, Lib/g;->n:Ljava/lang/String;

    const-string v0, "Camera is closed, not requesting preview"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lib/g;->a:Lib/k;

    new-instance v1, Lib/d;

    invoke-direct {v1, p0, p1}, Lib/d;-><init>(Lib/g;Lib/p;)V

    invoke-virtual {v0, v1}, Lib/k;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic s(Z)V
    .locals 1

    iget-object v0, p0, Lib/g;->c:Lib/h;

    invoke-virtual {v0, p1}, Lib/h;->t(Z)V

    return-void
.end method


# virtual methods
.method public A(Z)V
    .locals 2

    invoke-static {}, Lhb/u;->a()V

    iget-boolean v0, p0, Lib/g;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lib/g;->a:Lib/k;

    new-instance v1, Lib/f;

    invoke-direct {v1, p0, p1}, Lib/f;-><init>(Lib/g;Z)V

    invoke-virtual {v0, v1}, Lib/k;->c(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public B()V
    .locals 2

    invoke-static {}, Lhb/u;->a()V

    invoke-virtual {p0}, Lib/g;->C()V

    iget-object v0, p0, Lib/g;->a:Lib/k;

    iget-object v1, p0, Lib/g;->l:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lib/k;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final C()V
    .locals 2

    iget-boolean v0, p0, Lib/g;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CameraInstance is not open"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l()V
    .locals 2

    invoke-static {}, Lhb/u;->a()V

    iget-boolean v0, p0, Lib/g;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lib/g;->a:Lib/k;

    iget-object v1, p0, Lib/g;->m:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lib/k;->c(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lib/g;->g:Z

    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lib/g;->f:Z

    return-void
.end method

.method public m()V
    .locals 2

    invoke-static {}, Lhb/u;->a()V

    invoke-virtual {p0}, Lib/g;->C()V

    iget-object v0, p0, Lib/g;->a:Lib/k;

    iget-object v1, p0, Lib/g;->k:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lib/k;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method public n()Lib/m;
    .locals 1

    iget-object v0, p0, Lib/g;->e:Lib/m;

    return-object v0
.end method

.method public final o()Lhb/s;
    .locals 1

    iget-object v0, p0, Lib/g;->c:Lib/h;

    invoke-virtual {v0}, Lib/h;->h()Lhb/s;

    move-result-object v0

    return-object v0
.end method

.method public p()Z
    .locals 1

    iget-boolean v0, p0, Lib/g;->g:Z

    return v0
.end method

.method public final t(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lib/g;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    sget v1, Lma/k;->d:I

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_0
    return-void
.end method

.method public u()V
    .locals 2

    invoke-static {}, Lhb/u;->a()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lib/g;->f:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lib/g;->g:Z

    iget-object v0, p0, Lib/g;->a:Lib/k;

    iget-object v1, p0, Lib/g;->j:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lib/k;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public v(Lib/p;)V
    .locals 2

    iget-object v0, p0, Lib/g;->h:Landroid/os/Handler;

    new-instance v1, Lib/e;

    invoke-direct {v1, p0, p1}, Lib/e;-><init>(Lib/g;Lib/p;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public w(Lib/i;)V
    .locals 1

    iget-boolean v0, p0, Lib/g;->f:Z

    if-nez v0, :cond_0

    iput-object p1, p0, Lib/g;->i:Lib/i;

    iget-object v0, p0, Lib/g;->c:Lib/h;

    invoke-virtual {v0, p1}, Lib/h;->o(Lib/i;)V

    :cond_0
    return-void
.end method

.method public x(Lib/m;)V
    .locals 1

    iput-object p1, p0, Lib/g;->e:Lib/m;

    iget-object v0, p0, Lib/g;->c:Lib/h;

    invoke-virtual {v0, p1}, Lib/h;->q(Lib/m;)V

    return-void
.end method

.method public y(Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lib/g;->d:Landroid/os/Handler;

    return-void
.end method

.method public z(Lib/j;)V
    .locals 0

    iput-object p1, p0, Lib/g;->b:Lib/j;

    return-void
.end method
