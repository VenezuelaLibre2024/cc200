.class public abstract Lce/a;
.super Lce/j2;
.source ""

# interfaces
.implements Ljd/d;
.implements Lce/p0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lce/j2;",
        "Ljd/d<",
        "TT;>;",
        "Lce/p0;"
    }
.end annotation


# instance fields
.field public final j:Ljd/g;


# direct methods
.method public constructor <init>(Ljd/g;ZZ)V
    .locals 0

    invoke-direct {p0, p3}, Lce/j2;-><init>(Z)V

    if-eqz p2, :cond_0

    sget-object p2, Lce/c2;->c:Lce/c2$b;

    invoke-interface {p1, p2}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object p2

    check-cast p2, Lce/c2;

    invoke-virtual {p0, p2}, Lce/j2;->X(Lce/c2;)V

    :cond_0
    invoke-interface {p1, p0}, Ljd/g;->e0(Ljd/g;)Ljd/g;

    move-result-object p1

    iput-object p1, p0, Lce/a;->j:Ljd/g;

    return-void
.end method


# virtual methods
.method public B()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lce/u0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " was cancelled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public O0(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lce/j2;->r(Ljava/lang/Object;)V

    return-void
.end method

.method public P0(Ljava/lang/Throwable;Z)V
    .locals 0

    return-void
.end method

.method public Q0(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    return-void
.end method

.method public final R0(Lce/r0;Ljava/lang/Object;Lsd/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lce/r0;",
            "TR;",
            "Lsd/p<",
            "-TR;-",
            "Ljd/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1, p3, p2, p0}, Lce/r0;->c(Lsd/p;Ljava/lang/Object;Ljd/d;)V

    return-void
.end method

.method public final V(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lce/a;->j:Ljd/g;

    invoke-static {v0, p1}, Lce/m0;->a(Ljd/g;Ljava/lang/Throwable;)V

    return-void
.end method

.method public a()Z
    .locals 1

    invoke-super {p0}, Lce/j2;->a()Z

    move-result v0

    return v0
.end method

.method public b()Ljd/g;
    .locals 1

    iget-object v0, p0, Lce/a;->j:Ljd/g;

    return-object v0
.end method

.method public final getContext()Ljd/g;
    .locals 1

    iget-object v0, p0, Lce/a;->j:Ljd/g;

    return-object v0
.end method

.method public m0()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lce/a;->j:Ljd/g;

    invoke-static {v0}, Lce/j0;->b(Ljd/g;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0}, Lce/j2;->m0()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lce/j2;->m0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lce/g0;->d(Ljava/lang/Object;Lsd/l;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lce/j2;->j0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lce/k2;->b:Lhe/l0;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lce/a;->O0(Ljava/lang/Object;)V

    return-void
.end method

.method public final u0(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p1, Lce/c0;

    if-eqz v0, :cond_0

    check-cast p1, Lce/c0;

    iget-object v0, p1, Lce/c0;->a:Ljava/lang/Throwable;

    invoke-virtual {p1}, Lce/c0;->a()Z

    move-result p1

    invoke-virtual {p0, v0, p1}, Lce/a;->P0(Ljava/lang/Throwable;Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lce/a;->Q0(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
