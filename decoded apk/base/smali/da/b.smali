.class public Lda/b;
.super Lda/a;
.source ""

# interfaces
.implements Lx6/c$f;
.implements Lx6/c$j;
.implements Lx6/c$k;
.implements Lx6/c$a;
.implements Lx6/c$g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lda/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lda/a<",
        "Lz6/m;",
        "Lda/b$a;",
        ">;",
        "Lx6/c$f;",
        "Lx6/c$j;",
        "Lx6/c$k;",
        "Lx6/c$a;",
        "Lx6/c$g;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lx6/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lda/a;-><init>(Lx6/c;)V

    return-void
.end method


# virtual methods
.method public a(Lz6/m;)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lda/a;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lda/b$a;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lda/b$a;->d(Lda/b$a;)Lx6/c$a;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lda/b$a;->d(Lda/b$a;)Lx6/c$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lx6/c$a;->a(Lz6/m;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public b(Lz6/m;)V
    .locals 2

    iget-object v0, p0, Lda/a;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lda/b$a;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lda/b$a;->f(Lda/b$a;)Lx6/c$g;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lda/b$a;->f(Lda/b$a;)Lx6/c$g;

    move-result-object v0

    invoke-interface {v0, p1}, Lx6/c$g;->b(Lz6/m;)V

    :cond_0
    return-void
.end method

.method public c(Lz6/m;)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lda/a;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lda/b$a;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lda/b$a;->d(Lda/b$a;)Lx6/c$a;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lda/b$a;->d(Lda/b$a;)Lx6/c$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lx6/c$a;->c(Lz6/m;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Lda/a;->d(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic e(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lz6/m;

    invoke-virtual {p0, p1}, Lda/b;->h(Lz6/m;)V

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lda/a;->h:Lx6/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lx6/c;->C(Lx6/c$f;)V

    iget-object v0, p0, Lda/a;->h:Lx6/c;

    invoke-virtual {v0, p0}, Lx6/c;->D(Lx6/c$g;)V

    iget-object v0, p0, Lda/a;->h:Lx6/c;

    invoke-virtual {v0, p0}, Lx6/c;->G(Lx6/c$j;)V

    iget-object v0, p0, Lda/a;->h:Lx6/c;

    invoke-virtual {v0, p0}, Lx6/c;->H(Lx6/c$k;)V

    iget-object v0, p0, Lda/a;->h:Lx6/c;

    invoke-virtual {v0, p0}, Lx6/c;->r(Lx6/c$a;)V

    :cond_0
    return-void
.end method

.method public g()Lda/b$a;
    .locals 1

    new-instance v0, Lda/b$a;

    invoke-direct {v0, p0}, Lda/b$a;-><init>(Lda/b;)V

    return-object v0
.end method

.method public h(Lz6/m;)V
    .locals 0

    invoke-virtual {p1}, Lz6/m;->g()V

    return-void
.end method

.method public onInfoWindowClick(Lz6/m;)V
    .locals 2

    iget-object v0, p0, Lda/a;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lda/b$a;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lda/b$a;->e(Lda/b$a;)Lx6/c$f;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lda/b$a;->e(Lda/b$a;)Lx6/c$f;

    move-result-object v0

    invoke-interface {v0, p1}, Lx6/c$f;->onInfoWindowClick(Lz6/m;)V

    :cond_0
    return-void
.end method

.method public onMarkerClick(Lz6/m;)Z
    .locals 2

    iget-object v0, p0, Lda/a;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lda/b$a;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lda/b$a;->g(Lda/b$a;)Lx6/c$j;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lda/b$a;->g(Lda/b$a;)Lx6/c$j;

    move-result-object v0

    invoke-interface {v0, p1}, Lx6/c$j;->onMarkerClick(Lz6/m;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onMarkerDrag(Lz6/m;)V
    .locals 2

    iget-object v0, p0, Lda/a;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lda/b$a;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lda/b$a;->h(Lda/b$a;)Lx6/c$k;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lda/b$a;->h(Lda/b$a;)Lx6/c$k;

    move-result-object v0

    invoke-interface {v0, p1}, Lx6/c$k;->onMarkerDrag(Lz6/m;)V

    :cond_0
    return-void
.end method

.method public onMarkerDragEnd(Lz6/m;)V
    .locals 2

    iget-object v0, p0, Lda/a;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lda/b$a;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lda/b$a;->h(Lda/b$a;)Lx6/c$k;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lda/b$a;->h(Lda/b$a;)Lx6/c$k;

    move-result-object v0

    invoke-interface {v0, p1}, Lx6/c$k;->onMarkerDragEnd(Lz6/m;)V

    :cond_0
    return-void
.end method

.method public onMarkerDragStart(Lz6/m;)V
    .locals 2

    iget-object v0, p0, Lda/a;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lda/b$a;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lda/b$a;->h(Lda/b$a;)Lx6/c$k;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lda/b$a;->h(Lda/b$a;)Lx6/c$k;

    move-result-object v0

    invoke-interface {v0, p1}, Lx6/c$k;->onMarkerDragStart(Lz6/m;)V

    :cond_0
    return-void
.end method
