.class public Lw3/h$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw3/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw3/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lw3/g;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lw3/g;


# direct methods
.method public constructor <init>(Lw3/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lw3/h$g;->a:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public a(Lw3/g;)V
    .locals 1

    iget-object v0, p0, Lw3/h$g;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lw3/h$g;->b:Lw3/g;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lw3/h$g;->b:Lw3/g;

    invoke-virtual {p1}, Lw3/g;->I()V

    return-void
.end method

.method public b(Ljava/lang/Exception;Z)V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lw3/h$g;->b:Lw3/g;

    iget-object v0, p0, Lw3/h$g;->a:Ljava/util/Set;

    invoke-static {v0}, Li7/u;->p(Ljava/util/Collection;)Li7/u;

    move-result-object v0

    iget-object v1, p0, Lw3/h$g;->a:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    invoke-virtual {v0}, Li7/u;->j()Li7/d1;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw3/g;

    invoke-virtual {v1, p1, p2}, Lw3/g;->E(Ljava/lang/Exception;Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lw3/h$g;->b:Lw3/g;

    iget-object v0, p0, Lw3/h$g;->a:Ljava/util/Set;

    invoke-static {v0}, Li7/u;->p(Ljava/util/Collection;)Li7/u;

    move-result-object v0

    iget-object v1, p0, Lw3/h$g;->a:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    invoke-virtual {v0}, Li7/u;->j()Li7/d1;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw3/g;

    invoke-virtual {v1}, Lw3/g;->D()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d(Lw3/g;)V
    .locals 1

    iget-object v0, p0, Lw3/h$g;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lw3/h$g;->b:Lw3/g;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lw3/h$g;->b:Lw3/g;

    iget-object p1, p0, Lw3/h$g;->a:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lw3/h$g;->a:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw3/g;

    iput-object p1, p0, Lw3/h$g;->b:Lw3/g;

    invoke-virtual {p1}, Lw3/g;->I()V

    :cond_0
    return-void
.end method
