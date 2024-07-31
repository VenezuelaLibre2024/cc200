.class public Lw3/u$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw3/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw3/u$a$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lu4/t$b;

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lw3/u$a$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lw3/u$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILu4/t$b;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILu4/t$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lw3/u$a$a;",
            ">;I",
            "Lu4/t$b;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput p2, p0, Lw3/u$a;->a:I

    iput-object p3, p0, Lw3/u$a;->b:Lu4/t$b;

    return-void
.end method

.method public static synthetic a(Lw3/u$a;Lw3/u;)V
    .locals 0

    invoke-direct {p0, p1}, Lw3/u$a;->s(Lw3/u;)V

    return-void
.end method

.method public static synthetic b(Lw3/u$a;Lw3/u;)V
    .locals 0

    invoke-direct {p0, p1}, Lw3/u$a;->o(Lw3/u;)V

    return-void
.end method

.method public static synthetic c(Lw3/u$a;Lw3/u;)V
    .locals 0

    invoke-direct {p0, p1}, Lw3/u$a;->n(Lw3/u;)V

    return-void
.end method

.method public static synthetic d(Lw3/u$a;Lw3/u;)V
    .locals 0

    invoke-direct {p0, p1}, Lw3/u$a;->p(Lw3/u;)V

    return-void
.end method

.method public static synthetic e(Lw3/u$a;Lw3/u;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lw3/u$a;->r(Lw3/u;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic f(Lw3/u$a;Lw3/u;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lw3/u$a;->q(Lw3/u;I)V

    return-void
.end method

.method private synthetic n(Lw3/u;)V
    .locals 2

    iget v0, p0, Lw3/u$a;->a:I

    iget-object v1, p0, Lw3/u$a;->b:Lu4/t$b;

    invoke-interface {p1, v0, v1}, Lw3/u;->s(ILu4/t$b;)V

    return-void
.end method

.method private synthetic o(Lw3/u;)V
    .locals 2

    iget v0, p0, Lw3/u$a;->a:I

    iget-object v1, p0, Lw3/u$a;->b:Lu4/t$b;

    invoke-interface {p1, v0, v1}, Lw3/u;->A(ILu4/t$b;)V

    return-void
.end method

.method private synthetic p(Lw3/u;)V
    .locals 2

    iget v0, p0, Lw3/u$a;->a:I

    iget-object v1, p0, Lw3/u$a;->b:Lu4/t$b;

    invoke-interface {p1, v0, v1}, Lw3/u;->E(ILu4/t$b;)V

    return-void
.end method

.method private synthetic q(Lw3/u;I)V
    .locals 2

    iget v0, p0, Lw3/u$a;->a:I

    iget-object v1, p0, Lw3/u$a;->b:Lu4/t$b;

    invoke-interface {p1, v0, v1}, Lw3/u;->x(ILu4/t$b;)V

    iget v0, p0, Lw3/u$a;->a:I

    iget-object v1, p0, Lw3/u$a;->b:Lu4/t$b;

    invoke-interface {p1, v0, v1, p2}, Lw3/u;->G(ILu4/t$b;I)V

    return-void
.end method

.method private synthetic r(Lw3/u;Ljava/lang/Exception;)V
    .locals 2

    iget v0, p0, Lw3/u$a;->a:I

    iget-object v1, p0, Lw3/u$a;->b:Lu4/t$b;

    invoke-interface {p1, v0, v1, p2}, Lw3/u;->F(ILu4/t$b;Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic s(Lw3/u;)V
    .locals 2

    iget v0, p0, Lw3/u$a;->a:I

    iget-object v1, p0, Lw3/u$a;->b:Lu4/t$b;

    invoke-interface {p1, v0, v1}, Lw3/u;->t(ILu4/t$b;)V

    return-void
.end method


# virtual methods
.method public g(Landroid/os/Handler;Lw3/u;)V
    .locals 2

    invoke-static {p1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lw3/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Lw3/u$a$a;

    invoke-direct {v1, p1, p2}, Lw3/u$a$a;-><init>(Landroid/os/Handler;Lw3/u;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public h()V
    .locals 4

    iget-object v0, p0, Lw3/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw3/u$a$a;

    iget-object v2, v1, Lw3/u$a$a;->b:Lw3/u;

    iget-object v1, v1, Lw3/u$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lw3/q;

    invoke-direct {v3, p0, v2}, Lw3/q;-><init>(Lw3/u$a;Lw3/u;)V

    invoke-static {v1, v3}, Lp5/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i()V
    .locals 4

    iget-object v0, p0, Lw3/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw3/u$a$a;

    iget-object v2, v1, Lw3/u$a$a;->b:Lw3/u;

    iget-object v1, v1, Lw3/u$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lw3/p;

    invoke-direct {v3, p0, v2}, Lw3/p;-><init>(Lw3/u$a;Lw3/u;)V

    invoke-static {v1, v3}, Lp5/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public j()V
    .locals 4

    iget-object v0, p0, Lw3/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw3/u$a$a;

    iget-object v2, v1, Lw3/u$a$a;->b:Lw3/u;

    iget-object v1, v1, Lw3/u$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lw3/r;

    invoke-direct {v3, p0, v2}, Lw3/r;-><init>(Lw3/u$a;Lw3/u;)V

    invoke-static {v1, v3}, Lp5/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public k(I)V
    .locals 4

    iget-object v0, p0, Lw3/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw3/u$a$a;

    iget-object v2, v1, Lw3/u$a$a;->b:Lw3/u;

    iget-object v1, v1, Lw3/u$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lw3/s;

    invoke-direct {v3, p0, v2, p1}, Lw3/s;-><init>(Lw3/u$a;Lw3/u;I)V

    invoke-static {v1, v3}, Lp5/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public l(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, Lw3/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw3/u$a$a;

    iget-object v2, v1, Lw3/u$a$a;->b:Lw3/u;

    iget-object v1, v1, Lw3/u$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lw3/t;

    invoke-direct {v3, p0, v2, p1}, Lw3/t;-><init>(Lw3/u$a;Lw3/u;Ljava/lang/Exception;)V

    invoke-static {v1, v3}, Lp5/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public m()V
    .locals 4

    iget-object v0, p0, Lw3/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw3/u$a$a;

    iget-object v2, v1, Lw3/u$a$a;->b:Lw3/u;

    iget-object v1, v1, Lw3/u$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lw3/o;

    invoke-direct {v3, p0, v2}, Lw3/o;-><init>(Lw3/u$a;Lw3/u;)V

    invoke-static {v1, v3}, Lp5/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public t(Lw3/u;)V
    .locals 3

    iget-object v0, p0, Lw3/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw3/u$a$a;

    iget-object v2, v1, Lw3/u$a$a;->b:Lw3/u;

    if-ne v2, p1, :cond_0

    iget-object v2, p0, Lw3/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public u(ILu4/t$b;)Lw3/u$a;
    .locals 2

    new-instance v0, Lw3/u$a;

    iget-object v1, p0, Lw3/u$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, v1, p1, p2}, Lw3/u$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILu4/t$b;)V

    return-object v0
.end method
