.class public Lw3/h$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw3/v$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw3/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final b:Lw3/u$a;

.field public c:Lw3/n;

.field public d:Z

.field public final synthetic e:Lw3/h;


# direct methods
.method public constructor <init>(Lw3/h;Lw3/u$a;)V
    .locals 0

    iput-object p1, p0, Lw3/h$f;->e:Lw3/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lw3/h$f;->b:Lw3/u$a;

    return-void
.end method

.method public static synthetic c(Lw3/h$f;)V
    .locals 0

    invoke-direct {p0}, Lw3/h$f;->g()V

    return-void
.end method

.method public static synthetic d(Lw3/h$f;Ls3/m1;)V
    .locals 0

    invoke-direct {p0, p1}, Lw3/h$f;->f(Ls3/m1;)V

    return-void
.end method

.method private synthetic f(Ls3/m1;)V
    .locals 4

    iget-object v0, p0, Lw3/h$f;->e:Lw3/h;

    invoke-static {v0}, Lw3/h;->q(Lw3/h;)I

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lw3/h$f;->d:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lw3/h$f;->e:Lw3/h;

    invoke-static {v0}, Lw3/h;->k(Lw3/h;)Landroid/os/Looper;

    move-result-object v1

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Looper;

    iget-object v2, p0, Lw3/h$f;->b:Lw3/u$a;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, p1, v3}, Lw3/h;->l(Lw3/h;Landroid/os/Looper;Lw3/u$a;Ls3/m1;Z)Lw3/n;

    move-result-object p1

    iput-object p1, p0, Lw3/h$f;->c:Lw3/n;

    iget-object p1, p0, Lw3/h$f;->e:Lw3/h;

    invoke-static {p1}, Lw3/h;->j(Lw3/h;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method private synthetic g()V
    .locals 2

    iget-boolean v0, p0, Lw3/h$f;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lw3/h$f;->c:Lw3/n;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lw3/h$f;->b:Lw3/u$a;

    invoke-interface {v0, v1}, Lw3/n;->d(Lw3/u$a;)V

    :cond_1
    iget-object v0, p0, Lw3/h$f;->e:Lw3/h;

    invoke-static {v0}, Lw3/h;->j(Lw3/h;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw3/h$f;->d:Z

    return-void
.end method


# virtual methods
.method public e(Ls3/m1;)V
    .locals 2

    iget-object v0, p0, Lw3/h$f;->e:Lw3/h;

    invoke-static {v0}, Lw3/h;->p(Lw3/h;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    new-instance v1, Lw3/j;

    invoke-direct {v1, p0, p1}, Lw3/j;-><init>(Lw3/h$f;Ls3/m1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public release()V
    .locals 2

    iget-object v0, p0, Lw3/h$f;->e:Lw3/h;

    invoke-static {v0}, Lw3/h;->p(Lw3/h;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    new-instance v1, Lw3/i;

    invoke-direct {v1, p0}, Lw3/i;-><init>(Lw3/h$f;)V

    invoke-static {v0, v1}, Lp5/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    return-void
.end method
