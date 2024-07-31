.class public final synthetic Lfe/g;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lfe/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfe/c<",
            "*>;)V"
        }
    .end annotation

    instance-of v0, p0, Lfe/q;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p0, Lfe/q;

    iget-object p0, p0, Lfe/q;->h:Ljava/lang/Throwable;

    throw p0
.end method
