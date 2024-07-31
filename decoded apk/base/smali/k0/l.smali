.class public Lk0/l;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk0/l$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lk0/n;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lk0/n;",
            "Lk0/l$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lk0/l;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lk0/l;->c:Ljava/util/Map;

    iput-object p1, p0, Lk0/l;->a:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic a(Lk0/l;Landroidx/lifecycle/f$b;Lk0/n;Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lk0/l;->g(Landroidx/lifecycle/f$b;Lk0/n;Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public static synthetic b(Lk0/l;Lk0/n;Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lk0/l;->f(Lk0/n;Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method private synthetic f(Lk0/n;Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V
    .locals 0

    sget-object p2, Landroidx/lifecycle/f$a;->ON_DESTROY:Landroidx/lifecycle/f$a;

    if-ne p3, p2, :cond_0

    invoke-virtual {p0, p1}, Lk0/l;->l(Lk0/n;)V

    :cond_0
    return-void
.end method

.method private synthetic g(Landroidx/lifecycle/f$b;Lk0/n;Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V
    .locals 0

    invoke-static {p1}, Landroidx/lifecycle/f$a;->h(Landroidx/lifecycle/f$b;)Landroidx/lifecycle/f$a;

    move-result-object p3

    if-ne p4, p3, :cond_0

    invoke-virtual {p0, p2}, Lk0/l;->c(Lk0/n;)V

    goto :goto_0

    :cond_0
    sget-object p3, Landroidx/lifecycle/f$a;->ON_DESTROY:Landroidx/lifecycle/f$a;

    if-ne p4, p3, :cond_1

    invoke-virtual {p0, p2}, Lk0/l;->l(Lk0/n;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Landroidx/lifecycle/f$a;->c(Landroidx/lifecycle/f$b;)Landroidx/lifecycle/f$a;

    move-result-object p1

    if-ne p4, p1, :cond_2

    iget-object p1, p0, Lk0/l;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lk0/l;->a:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public c(Lk0/n;)V
    .locals 1

    iget-object v0, p0, Lk0/l;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lk0/l;->a:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public d(Lk0/n;Landroidx/lifecycle/k;)V
    .locals 3

    invoke-virtual {p0, p1}, Lk0/l;->c(Lk0/n;)V

    invoke-interface {p2}, Landroidx/lifecycle/k;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p2

    iget-object v0, p0, Lk0/l;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk0/l$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk0/l$a;->a()V

    :cond_0
    new-instance v0, Lk0/k;

    invoke-direct {v0, p0, p1}, Lk0/k;-><init>(Lk0/l;Lk0/n;)V

    iget-object v1, p0, Lk0/l;->c:Ljava/util/Map;

    new-instance v2, Lk0/l$a;

    invoke-direct {v2, p2, v0}, Lk0/l$a;-><init>(Landroidx/lifecycle/f;Landroidx/lifecycle/i;)V

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public e(Lk0/n;Landroidx/lifecycle/k;Landroidx/lifecycle/f$b;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    invoke-interface {p2}, Landroidx/lifecycle/k;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p2

    iget-object v0, p0, Lk0/l;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk0/l$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk0/l$a;->a()V

    :cond_0
    new-instance v0, Lk0/j;

    invoke-direct {v0, p0, p3, p1}, Lk0/j;-><init>(Lk0/l;Landroidx/lifecycle/f$b;Lk0/n;)V

    iget-object p3, p0, Lk0/l;->c:Ljava/util/Map;

    new-instance v1, Lk0/l$a;

    invoke-direct {v1, p2, v0}, Lk0/l$a;-><init>(Landroidx/lifecycle/f;Landroidx/lifecycle/i;)V

    invoke-interface {p3, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public h(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 2

    iget-object v0, p0, Lk0/l;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk0/n;

    invoke-interface {v1, p1, p2}, Lk0/n;->c(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i(Landroid/view/Menu;)V
    .locals 2

    iget-object v0, p0, Lk0/l;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk0/n;

    invoke-interface {v1, p1}, Lk0/n;->b(Landroid/view/Menu;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public j(Landroid/view/MenuItem;)Z
    .locals 2

    iget-object v0, p0, Lk0/l;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk0/n;

    invoke-interface {v1, p1}, Lk0/n;->a(Landroid/view/MenuItem;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public k(Landroid/view/Menu;)V
    .locals 2

    iget-object v0, p0, Lk0/l;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk0/n;

    invoke-interface {v1, p1}, Lk0/n;->d(Landroid/view/Menu;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public l(Lk0/n;)V
    .locals 1

    iget-object v0, p0, Lk0/l;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lk0/l;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk0/l$a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lk0/l$a;->a()V

    :cond_0
    iget-object p1, p0, Lk0/l;->a:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
