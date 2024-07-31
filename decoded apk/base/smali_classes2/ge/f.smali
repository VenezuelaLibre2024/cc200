.class public final Lge/f;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lge/a;Lfe/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lge/a;",
            "Lfe/c<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lge/a;->h:Lfe/c;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    throw p0
.end method
