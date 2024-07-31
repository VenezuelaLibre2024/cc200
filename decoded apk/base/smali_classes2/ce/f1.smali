.class public final Lce/f1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final h:Lce/k0;


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lce/f1;->h:Lce/k0;

    sget-object v1, Ljd/h;->h:Ljd/h;

    invoke-virtual {v0, v1}, Lce/k0;->I0(Ljd/g;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lce/f1;->h:Lce/k0;

    invoke-virtual {v0, v1, p1}, Lce/k0;->H0(Ljd/g;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lce/f1;->h:Lce/k0;

    invoke-virtual {v0}, Lce/k0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
