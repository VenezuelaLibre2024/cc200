.class public final Lg7/k0;
.super Lg7/d0;
.source ""


# instance fields
.field public final synthetic h:Landroid/os/IBinder;

.field public final synthetic i:Lg7/c;


# direct methods
.method public constructor <init>(Lg7/c;Landroid/os/IBinder;)V
    .locals 0

    iput-object p1, p0, Lg7/k0;->i:Lg7/c;

    iput-object p2, p0, Lg7/k0;->h:Landroid/os/IBinder;

    invoke-direct {p0}, Lg7/d0;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, Lg7/k0;->i:Lg7/c;

    iget-object v0, v0, Lg7/c;->h:Lg7/d;

    invoke-static {v0}, Lg7/d;->g(Lg7/d;)Lg7/j0;

    move-result-object v1

    iget-object v2, p0, Lg7/k0;->h:Landroid/os/IBinder;

    invoke-interface {v1, v2}, Lg7/j0;->a(Landroid/os/IBinder;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/IInterface;

    invoke-static {v0, v1}, Lg7/d;->n(Lg7/d;Landroid/os/IInterface;)V

    iget-object v0, p0, Lg7/k0;->i:Lg7/c;

    iget-object v0, v0, Lg7/c;->h:Lg7/d;

    invoke-static {v0}, Lg7/d;->r(Lg7/d;)V

    iget-object v0, p0, Lg7/k0;->i:Lg7/c;

    iget-object v0, v0, Lg7/c;->h:Lg7/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lg7/d;->m(Lg7/d;Z)V

    iget-object v0, p0, Lg7/k0;->i:Lg7/c;

    iget-object v0, v0, Lg7/c;->h:Lg7/d;

    invoke-static {v0}, Lg7/d;->i(Lg7/d;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg7/k0;->i:Lg7/c;

    iget-object v0, v0, Lg7/c;->h:Lg7/d;

    invoke-static {v0}, Lg7/d;->i(Lg7/d;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
