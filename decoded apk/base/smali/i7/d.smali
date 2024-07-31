.class public abstract Li7/d;
.super Li7/f;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/d$e;,
        Li7/d$h;,
        Li7/d$b;,
        Li7/d$c;,
        Li7/d$f;,
        Li7/d$i;,
        Li7/d$d;,
        Li7/d$g;,
        Li7/d$k;,
        Li7/d$j;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Li7/f<",
        "TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field public transient k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;"
        }
    .end annotation
.end field

.field public transient l:I


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Li7/f;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    invoke-static {v0}, Lh7/o;->d(Z)V

    iput-object p1, p0, Li7/d;->k:Ljava/util/Map;

    return-void
.end method

.method public static synthetic h(Li7/d;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Li7/d;->k:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic i(Ljava/util/Collection;)Ljava/util/Iterator;
    .locals 0

    invoke-static {p0}, Li7/d;->s(Ljava/util/Collection;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Li7/d;)I
    .locals 2

    iget v0, p0, Li7/d;->l:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Li7/d;->l:I

    return v0
.end method

.method public static synthetic k(Li7/d;)I
    .locals 2

    iget v0, p0, Li7/d;->l:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Li7/d;->l:I

    return v0
.end method

.method public static synthetic l(Li7/d;I)I
    .locals 1

    iget v0, p0, Li7/d;->l:I

    add-int/2addr v0, p1

    iput v0, p0, Li7/d;->l:I

    return v0
.end method

.method public static synthetic m(Li7/d;I)I
    .locals 1

    iget v0, p0, Li7/d;->l:I

    sub-int/2addr v0, p1

    iput v0, p0, Li7/d;->l:I

    return v0
.end method

.method public static synthetic n(Li7/d;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Li7/d;->t(Ljava/lang/Object;)V

    return-void
.end method

.method public static s(Ljava/util/Collection;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "TE;>;)",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public clear()V
    .locals 2

    iget-object v0, p0, Li7/d;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Li7/d;->k:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const/4 v0, 0x0

    iput v0, p0, Li7/d;->l:I

    return-void
.end method

.method public e()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Li7/f$a;

    invoke-direct {v0, p0}, Li7/f$a;-><init>(Li7/f;)V

    return-object v0
.end method

.method public g()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Li7/d$a;

    invoke-direct {v0, p0}, Li7/d$a;-><init>(Li7/d;)V

    return-object v0
.end method

.method public abstract o()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation
.end method

.method public p(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Li7/d;->o()Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)Z"
        }
    .end annotation

    iget-object v0, p0, Li7/d;->k:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Li7/d;->p(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget p2, p0, Li7/d;->l:I

    add-int/2addr p2, v1

    iput p2, p0, Li7/d;->l:I

    iget-object p2, p0, Li7/d;->k:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v1

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "New Collection violated the Collection spec"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    invoke-interface {v0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget p1, p0, Li7/d;->l:I

    add-int/2addr p1, v1

    iput p1, p0, Li7/d;->l:I

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final q()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, Li7/d;->k:Ljava/util/Map;

    instance-of v1, v0, Ljava/util/NavigableMap;

    if-eqz v1, :cond_0

    new-instance v0, Li7/d$e;

    iget-object v1, p0, Li7/d;->k:Ljava/util/Map;

    check-cast v1, Ljava/util/NavigableMap;

    invoke-direct {v0, p0, v1}, Li7/d$e;-><init>(Li7/d;Ljava/util/NavigableMap;)V

    return-object v0

    :cond_0
    instance-of v0, v0, Ljava/util/SortedMap;

    if-eqz v0, :cond_1

    new-instance v0, Li7/d$h;

    iget-object v1, p0, Li7/d;->k:Ljava/util/Map;

    check-cast v1, Ljava/util/SortedMap;

    invoke-direct {v0, p0, v1}, Li7/d$h;-><init>(Li7/d;Ljava/util/SortedMap;)V

    return-object v0

    :cond_1
    new-instance v0, Li7/d$b;

    iget-object v1, p0, Li7/d;->k:Ljava/util/Map;

    invoke-direct {v0, p0, v1}, Li7/d$b;-><init>(Li7/d;Ljava/util/Map;)V

    return-object v0
.end method

.method public final r()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, Li7/d;->k:Ljava/util/Map;

    instance-of v1, v0, Ljava/util/NavigableMap;

    if-eqz v1, :cond_0

    new-instance v0, Li7/d$f;

    iget-object v1, p0, Li7/d;->k:Ljava/util/Map;

    check-cast v1, Ljava/util/NavigableMap;

    invoke-direct {v0, p0, v1}, Li7/d$f;-><init>(Li7/d;Ljava/util/NavigableMap;)V

    return-object v0

    :cond_0
    instance-of v0, v0, Ljava/util/SortedMap;

    if-eqz v0, :cond_1

    new-instance v0, Li7/d$i;

    iget-object v1, p0, Li7/d;->k:Ljava/util/Map;

    check-cast v1, Ljava/util/SortedMap;

    invoke-direct {v0, p0, v1}, Li7/d$i;-><init>(Li7/d;Ljava/util/SortedMap;)V

    return-object v0

    :cond_1
    new-instance v0, Li7/d$d;

    iget-object v1, p0, Li7/d;->k:Ljava/util/Map;

    invoke-direct {v0, p0, v1}, Li7/d$d;-><init>(Li7/d;Ljava/util/Map;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Li7/d;->l:I

    return v0
.end method

.method public final t(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Li7/d;->k:Ljava/util/Map;

    invoke-static {v0, p1}, Li7/g0;->i(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    iget p1, p0, Li7/d;->l:I

    sub-int/2addr p1, v0

    iput p1, p0, Li7/d;->l:I

    :cond_0
    return-void
.end method

.method public abstract u(Ljava/util/Collection;)Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "TE;>;)",
            "Ljava/util/Collection<",
            "TE;>;"
        }
    .end annotation
.end method

.method public abstract v(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/Collection<",
            "TV;>;)",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation
.end method

.method public values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    invoke-super {p0}, Li7/f;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final w(Ljava/lang/Object;Ljava/util/List;Li7/d$j;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/List<",
            "TV;>;",
            "Li7/d<",
            "TK;TV;>.j;)",
            "Ljava/util/List<",
            "TV;>;"
        }
    .end annotation

    instance-of v0, p2, Ljava/util/RandomAccess;

    if-eqz v0, :cond_0

    new-instance v0, Li7/d$g;

    invoke-direct {v0, p0, p1, p2, p3}, Li7/d$g;-><init>(Li7/d;Ljava/lang/Object;Ljava/util/List;Li7/d$j;)V

    goto :goto_0

    :cond_0
    new-instance v0, Li7/d$k;

    invoke-direct {v0, p0, p1, p2, p3}, Li7/d$k;-><init>(Li7/d;Ljava/lang/Object;Ljava/util/List;Li7/d$j;)V

    :goto_0
    return-object v0
.end method
