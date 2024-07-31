.class public final Lce/s2;
.super Lce/i2;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lce/i2;"
    }
.end annotation


# instance fields
.field public final l:Lce/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lce/p<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lce/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/p<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lce/i2;-><init>()V

    iput-object p1, p0, Lce/s2;->l:Lce/p;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lce/s2;->u(Ljava/lang/Throwable;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public u(Ljava/lang/Throwable;)V
    .locals 2

    invoke-virtual {p0}, Lce/i2;->v()Lce/j2;

    move-result-object p1

    invoke-virtual {p1}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lce/t0;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p1, Lce/x1;

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_1
    :goto_0
    instance-of v0, p1, Lce/c0;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lce/s2;->l:Lce/p;

    sget-object v1, Lgd/k;->i:Lgd/k$a;

    check-cast p1, Lce/c0;

    iget-object p1, p1, Lce/c0;->a:Ljava/lang/Throwable;

    invoke-static {p1}, Lgd/l;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lce/s2;->l:Lce/p;

    sget-object v1, Lgd/k;->i:Lgd/k$a;

    invoke-static {p1}, Lce/k2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    invoke-static {p1}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljd/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
