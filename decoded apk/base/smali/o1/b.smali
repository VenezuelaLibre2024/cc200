.class public abstract Lo1/b;
.super Lo1/k;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lo1/k;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo1/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lo1/k;-><init>(Lo1/e;)V

    return-void
.end method


# virtual methods
.method public abstract g(Ls1/f;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls1/f;",
            "TT;)V"
        }
    .end annotation
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lo1/k;->a()Ls1/f;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0, v0, p1}, Lo1/b;->g(Ls1/f;Ljava/lang/Object;)V

    invoke-interface {v0}, Ls1/f;->D0()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lo1/k;->f(Ls1/f;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0, v0}, Lo1/k;->f(Ls1/f;)V

    throw p1
.end method
