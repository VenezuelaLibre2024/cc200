.class public Landroidx/lifecycle/d0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/d0$a;
    }
.end annotation


# instance fields
.field public final a:Landroidx/lifecycle/l;

.field public final b:Landroid/os/Handler;

.field public c:Landroidx/lifecycle/d0$a;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/k;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/lifecycle/l;

    invoke-direct {v0, p1}, Landroidx/lifecycle/l;-><init>(Landroidx/lifecycle/k;)V

    iput-object v0, p0, Landroidx/lifecycle/d0;->a:Landroidx/lifecycle/l;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/d0;->b:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/f;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/d0;->a:Landroidx/lifecycle/l;

    return-object v0
.end method

.method public b()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/f$a;->ON_START:Landroidx/lifecycle/f$a;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/d0;->f(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public c()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/f$a;->ON_CREATE:Landroidx/lifecycle/f$a;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/d0;->f(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public d()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/f$a;->ON_STOP:Landroidx/lifecycle/f$a;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/d0;->f(Landroidx/lifecycle/f$a;)V

    sget-object v0, Landroidx/lifecycle/f$a;->ON_DESTROY:Landroidx/lifecycle/f$a;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/d0;->f(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public e()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/f$a;->ON_START:Landroidx/lifecycle/f$a;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/d0;->f(Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public final f(Landroidx/lifecycle/f$a;)V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/d0;->c:Landroidx/lifecycle/d0$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/lifecycle/d0$a;->run()V

    :cond_0
    new-instance v0, Landroidx/lifecycle/d0$a;

    iget-object v1, p0, Landroidx/lifecycle/d0;->a:Landroidx/lifecycle/l;

    invoke-direct {v0, v1, p1}, Landroidx/lifecycle/d0$a;-><init>(Landroidx/lifecycle/l;Landroidx/lifecycle/f$a;)V

    iput-object v0, p0, Landroidx/lifecycle/d0;->c:Landroidx/lifecycle/d0$a;

    iget-object p1, p0, Landroidx/lifecycle/d0;->b:Landroid/os/Handler;

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void
.end method
