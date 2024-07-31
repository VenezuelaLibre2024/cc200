.class public abstract Lld/d;
.super Lld/a;
.source ""


# instance fields
.field private final _context:Ljd/g;

.field private transient intercepted:Ljd/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljd/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljd/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljd/d;->getContext()Ljd/g;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Lld/d;-><init>(Ljd/d;Ljd/g;)V

    return-void
.end method

.method public constructor <init>(Ljd/d;Ljd/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "Ljava/lang/Object;",
            ">;",
            "Ljd/g;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lld/a;-><init>(Ljd/d;)V

    iput-object p2, p0, Lld/d;->_context:Ljd/g;

    return-void
.end method


# virtual methods
.method public getContext()Ljd/g;
    .locals 1

    iget-object v0, p0, Lld/d;->_context:Ljd/g;

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final intercepted()Ljd/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljd/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lld/d;->intercepted:Ljd/d;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lld/d;->getContext()Ljd/g;

    move-result-object v0

    sget-object v1, Ljd/e;->e:Ljd/e$b;

    invoke-interface {v0, v1}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object v0

    check-cast v0, Ljd/e;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Ljd/e;->s0(Ljd/d;)Ljd/d;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p0

    :cond_1
    iput-object v0, p0, Lld/d;->intercepted:Ljd/d;

    :cond_2
    return-object v0
.end method

.method public releaseIntercepted()V
    .locals 3

    iget-object v0, p0, Lld/d;->intercepted:Ljd/d;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Lld/d;->getContext()Ljd/g;

    move-result-object v1

    sget-object v2, Ljd/e;->e:Ljd/e$b;

    invoke-interface {v1, v2}, Ljd/g;->d(Ljd/g$c;)Ljd/g$b;

    move-result-object v1

    invoke-static {v1}, Ltd/m;->c(Ljava/lang/Object;)V

    check-cast v1, Ljd/e;

    invoke-interface {v1, v0}, Ljd/e;->c0(Ljd/d;)V

    :cond_0
    sget-object v0, Lld/c;->h:Lld/c;

    iput-object v0, p0, Lld/d;->intercepted:Ljd/d;

    return-void
.end method
