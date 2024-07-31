.class public final Lob/e;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lob/d;Lsd/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lob/d;",
            "Lsd/a<",
            "Lgd/s;",
            ">;)V"
        }
    .end annotation

    const-string v0, "$this$use"

    invoke-static {p0, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Ltd/m;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lob/d;->b()V

    invoke-interface {p1}, Lsd/a;->invoke()Ljava/lang/Object;

    invoke-interface {p0}, Lob/d;->a()V

    return-void
.end method
