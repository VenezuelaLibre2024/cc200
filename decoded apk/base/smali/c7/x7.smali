.class public final synthetic Lc7/x7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic h:Lc7/w7;

.field public synthetic i:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(Lc7/w7;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/x7;->h:Lc7/w7;

    iput-object p2, p0, Lc7/x7;->i:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc7/x7;->h:Lc7/w7;

    iget-object v1, p0, Lc7/x7;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v2

    iget-object v2, v2, Lc7/i5;->p:Lc7/k5;

    invoke-virtual {v2}, Lc7/k5;->a()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0}, Lc7/f4;->o()Lc7/y9;

    move-result-object v0

    if-nez v2, :cond_0

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    :cond_0
    invoke-virtual {v0, v1, v2}, Lc7/y9;->M(Ljava/util/concurrent/atomic/AtomicReference;Landroid/os/Bundle;)V

    return-void
.end method
