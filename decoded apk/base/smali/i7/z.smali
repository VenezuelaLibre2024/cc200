.class public abstract Li7/z;
.super Li7/a0;
.source ""

# interfaces
.implements Ljava/util/NavigableSet;
.implements Li7/a1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Li7/a0<",
        "TE;>;",
        "Ljava/util/NavigableSet<",
        "TE;>;",
        "Li7/a1<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final transient j:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "-TE;>;"
        }
    .end annotation
.end field

.field public transient k:Li7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/z<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-TE;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Li7/a0;-><init>()V

    iput-object p1, p0, Li7/z;->j:Ljava/util/Comparator;

    return-void
.end method

.method public static B(Ljava/util/Comparator;Ljava/lang/Iterable;)Li7/z;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TE;>;",
            "Ljava/lang/Iterable<",
            "+TE;>;)",
            "Li7/z<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0}, Lh7/o;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0, p1}, Li7/b1;->b(Ljava/util/Comparator;Ljava/lang/Iterable;)Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of v0, p1, Li7/z;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Li7/z;

    invoke-virtual {v0}, Li7/s;->h()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {p1}, Li7/b0;->j(Ljava/lang/Iterable;)[Ljava/lang/Object;

    move-result-object p1

    array-length v0, p1

    invoke-static {p0, v0, p1}, Li7/z;->z(Ljava/util/Comparator;I[Ljava/lang/Object;)Li7/z;

    move-result-object p0

    return-object p0
.end method

.method public static C(Ljava/util/Comparator;Ljava/util/Collection;)Li7/z;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TE;>;",
            "Ljava/util/Collection<",
            "+TE;>;)",
            "Li7/z<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Li7/z;->B(Ljava/util/Comparator;Ljava/lang/Iterable;)Li7/z;

    move-result-object p0

    return-object p0
.end method

.method public static I(Ljava/util/Comparator;)Li7/u0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TE;>;)",
            "Li7/u0<",
            "TE;>;"
        }
    .end annotation

    invoke-static {}, Li7/p0;->c()Li7/p0;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Li7/u0;->m:Li7/u0;

    return-object p0

    :cond_0
    new-instance v0, Li7/u0;

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Li7/u0;-><init>(Li7/u;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static T(Ljava/util/Comparator;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")I"
        }
    .end annotation

    invoke-interface {p0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static varargs z(Ljava/util/Comparator;I[Ljava/lang/Object;)Li7/z;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TE;>;I[TE;)",
            "Li7/z<",
            "TE;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    invoke-static {p0}, Li7/z;->I(Ljava/util/Comparator;)Li7/u0;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p2, p1}, Li7/o0;->c([Ljava/lang/Object;I)[Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {p2, v0, p1, p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    if-ge v0, p1, :cond_2

    aget-object v2, p2, v0

    add-int/lit8 v3, v1, -0x1

    aget-object v3, p2, v3

    invoke-interface {p0, v2, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v3, v1, 0x1

    aput-object v2, p2, v1

    move v1, v3

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    invoke-static {p2, v1, p1, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    array-length p1, p2

    div-int/lit8 p1, p1, 0x2

    if-ge v1, p1, :cond_3

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    :cond_3
    new-instance p1, Li7/u0;

    invoke-static {p2, v1}, Li7/u;->m([Ljava/lang/Object;I)Li7/u;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Li7/u0;-><init>(Li7/u;Ljava/util/Comparator;)V

    return-object p1
.end method


# virtual methods
.method public abstract D()Li7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/z<",
            "TE;>;"
        }
    .end annotation
.end method

.method public abstract E()Li7/d1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/d1<",
            "TE;>;"
        }
    .end annotation
.end method

.method public G()Li7/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/z<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Li7/z;->k:Li7/z;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Li7/z;->D()Li7/z;

    move-result-object v0

    iput-object v0, p0, Li7/z;->k:Li7/z;

    iput-object p0, v0, Li7/z;->k:Li7/z;

    :cond_0
    return-object v0
.end method

.method public J(Ljava/lang/Object;)Li7/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Li7/z<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Li7/z;->K(Ljava/lang/Object;Z)Li7/z;

    move-result-object p1

    return-object p1
.end method

.method public K(Ljava/lang/Object;Z)Li7/z;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;Z)",
            "Li7/z<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p1}, Lh7/o;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Li7/z;->L(Ljava/lang/Object;Z)Li7/z;

    move-result-object p1

    return-object p1
.end method

.method public abstract L(Ljava/lang/Object;Z)Li7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;Z)",
            "Li7/z<",
            "TE;>;"
        }
    .end annotation
.end method

.method public M(Ljava/lang/Object;Ljava/lang/Object;)Li7/z;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;TE;)",
            "Li7/z<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, p2, v1}, Li7/z;->N(Ljava/lang/Object;ZLjava/lang/Object;Z)Li7/z;

    move-result-object p1

    return-object p1
.end method

.method public N(Ljava/lang/Object;ZLjava/lang/Object;Z)Li7/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;ZTE;Z)",
            "Li7/z<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p1}, Lh7/o;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lh7/o;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Li7/z;->j:Ljava/util/Comparator;

    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lh7/o;->d(Z)V

    invoke-virtual {p0, p1, p2, p3, p4}, Li7/z;->O(Ljava/lang/Object;ZLjava/lang/Object;Z)Li7/z;

    move-result-object p1

    return-object p1
.end method

.method public abstract O(Ljava/lang/Object;ZLjava/lang/Object;Z)Li7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;ZTE;Z)",
            "Li7/z<",
            "TE;>;"
        }
    .end annotation
.end method

.method public P(Ljava/lang/Object;)Li7/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Li7/z<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Li7/z;->Q(Ljava/lang/Object;Z)Li7/z;

    move-result-object p1

    return-object p1
.end method

.method public Q(Ljava/lang/Object;Z)Li7/z;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;Z)",
            "Li7/z<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p1}, Lh7/o;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Li7/z;->R(Ljava/lang/Object;Z)Li7/z;

    move-result-object p1

    return-object p1
.end method

.method public abstract R(Ljava/lang/Object;Z)Li7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;Z)",
            "Li7/z<",
            "TE;>;"
        }
    .end annotation
.end method

.method public S(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Li7/z;->j:Ljava/util/Comparator;

    invoke-static {v0, p1, p2}, Li7/z;->T(Ljava/util/Comparator;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public ceiling(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)TE;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Li7/z;->Q(Ljava/lang/Object;Z)Li7/z;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Li7/b0;->c(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public comparator()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "-TE;>;"
        }
    .end annotation

    iget-object v0, p0, Li7/z;->j:Ljava/util/Comparator;

    return-object v0
.end method

.method public bridge synthetic descendingIterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Li7/z;->E()Li7/d1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic descendingSet()Ljava/util/NavigableSet;
    .locals 1

    invoke-virtual {p0}, Li7/z;->G()Li7/z;

    move-result-object v0

    return-object v0
.end method

.method public first()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    invoke-virtual {p0}, Li7/z;->j()Li7/d1;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public floor(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)TE;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Li7/z;->K(Ljava/lang/Object;Z)Li7/z;

    move-result-object p1

    invoke-virtual {p1}, Li7/z;->E()Li7/d1;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Li7/c0;->m(Ljava/util/Iterator;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic headSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li7/z;->K(Ljava/lang/Object;Z)Li7/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    invoke-virtual {p0, p1}, Li7/z;->J(Ljava/lang/Object;)Li7/z;

    move-result-object p1

    return-object p1
.end method

.method public higher(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)TE;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Li7/z;->Q(Ljava/lang/Object;Z)Li7/z;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Li7/b0;->c(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Li7/z;->j()Li7/d1;

    move-result-object v0

    return-object v0
.end method

.method public abstract j()Li7/d1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/d1<",
            "TE;>;"
        }
    .end annotation
.end method

.method public last()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    invoke-virtual {p0}, Li7/z;->E()Li7/d1;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public lower(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)TE;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Li7/z;->K(Ljava/lang/Object;Z)Li7/z;

    move-result-object p1

    invoke-virtual {p1}, Li7/z;->E()Li7/d1;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Li7/c0;->m(Ljava/util/Iterator;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final pollFirst()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final pollLast()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public bridge synthetic subSet(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Li7/z;->N(Ljava/lang/Object;ZLjava/lang/Object;Z)Li7/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li7/z;->M(Ljava/lang/Object;Ljava/lang/Object;)Li7/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic tailSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li7/z;->Q(Ljava/lang/Object;Z)Li7/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    invoke-virtual {p0, p1}, Li7/z;->P(Ljava/lang/Object;)Li7/z;

    move-result-object p1

    return-object p1
.end method
