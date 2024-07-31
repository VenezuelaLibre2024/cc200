.class public Lx3/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/l;


# instance fields
.field public final a:Lx3/l;


# direct methods
.method public constructor <init>(Lx3/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/u;->a:Lx3/l;

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1

    iget-object v0, p0, Lx3/u;->a:Lx3/l;

    invoke-interface {v0, p1}, Lx3/l;->a(I)I

    move-result p1

    return p1
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Lx3/u;->a:Lx3/l;

    invoke-interface {v0}, Lx3/l;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public c([BII)I
    .locals 1

    iget-object v0, p0, Lx3/u;->a:Lx3/l;

    invoke-interface {v0, p1, p2, p3}, Lx3/l;->c([BII)I

    move-result p1

    return p1
.end method

.method public d([BIIZ)Z
    .locals 1

    iget-object v0, p0, Lx3/u;->a:Lx3/l;

    invoke-interface {v0, p1, p2, p3, p4}, Lx3/l;->d([BIIZ)Z

    move-result p1

    return p1
.end method

.method public e([BIIZ)Z
    .locals 1

    iget-object v0, p0, Lx3/u;->a:Lx3/l;

    invoke-interface {v0, p1, p2, p3, p4}, Lx3/l;->e([BIIZ)Z

    move-result p1

    return p1
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lx3/u;->a:Lx3/l;

    invoke-interface {v0}, Lx3/l;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public getPosition()J
    .locals 2

    iget-object v0, p0, Lx3/u;->a:Lx3/l;

    invoke-interface {v0}, Lx3/l;->getPosition()J

    move-result-wide v0

    return-wide v0
.end method

.method public h(I)V
    .locals 1

    iget-object v0, p0, Lx3/u;->a:Lx3/l;

    invoke-interface {v0, p1}, Lx3/l;->h(I)V

    return-void
.end method

.method public i([BII)I
    .locals 1

    iget-object v0, p0, Lx3/u;->a:Lx3/l;

    invoke-interface {v0, p1, p2, p3}, Lx3/l;->i([BII)I

    move-result p1

    return p1
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Lx3/u;->a:Lx3/l;

    invoke-interface {v0}, Lx3/l;->l()V

    return-void
.end method

.method public m(I)V
    .locals 1

    iget-object v0, p0, Lx3/u;->a:Lx3/l;

    invoke-interface {v0, p1}, Lx3/l;->m(I)V

    return-void
.end method

.method public n(IZ)Z
    .locals 1

    iget-object v0, p0, Lx3/u;->a:Lx3/l;

    invoke-interface {v0, p1, p2}, Lx3/l;->n(IZ)Z

    move-result p1

    return p1
.end method

.method public p([BII)V
    .locals 1

    iget-object v0, p0, Lx3/u;->a:Lx3/l;

    invoke-interface {v0, p1, p2, p3}, Lx3/l;->p([BII)V

    return-void
.end method

.method public readFully([BII)V
    .locals 1

    iget-object v0, p0, Lx3/u;->a:Lx3/l;

    invoke-interface {v0, p1, p2, p3}, Lx3/l;->readFully([BII)V

    return-void
.end method
