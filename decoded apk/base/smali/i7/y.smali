.class public Li7/y;
.super Li7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/y$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Li7/w<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public final transient m:Li7/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/x<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Li7/v;ILjava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li7/v<",
            "TK;",
            "Li7/x<",
            "TV;>;>;I",
            "Ljava/util/Comparator<",
            "-TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Li7/w;-><init>(Li7/v;I)V

    invoke-static {p3}, Li7/y;->l(Ljava/util/Comparator;)Li7/x;

    move-result-object p1

    iput-object p1, p0, Li7/y;->m:Li7/x;

    return-void
.end method

.method public static l(Ljava/util/Comparator;)Li7/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TV;>;)",
            "Li7/x<",
            "TV;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    invoke-static {}, Li7/x;->s()Li7/x;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Li7/z;->I(Ljava/util/Comparator;)Li7/u0;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static m(Ljava/util/Collection;Ljava/util/Comparator;)Li7/y;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/Map$Entry<",
            "+TK;+",
            "Ljava/util/Collection<",
            "+TV;>;>;>;",
            "Ljava/util/Comparator<",
            "-TV;>;)",
            "Li7/y<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Li7/y;->n()Li7/y;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Li7/v$a;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Li7/v$a;-><init>(I)V

    const/4 v1, 0x0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {p1, v2}, Li7/y;->o(Ljava/util/Comparator;Ljava/util/Collection;)Li7/x;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0, v3, v2}, Li7/v$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Li7/v$a;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_2
    new-instance p0, Li7/y;

    invoke-virtual {v0}, Li7/v$a;->c()Li7/v;

    move-result-object v0

    invoke-direct {p0, v0, v1, p1}, Li7/y;-><init>(Li7/v;ILjava/util/Comparator;)V

    return-object p0
.end method

.method public static n()Li7/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Li7/y<",
            "TK;TV;>;"
        }
    .end annotation

    sget-object v0, Li7/o;->n:Li7/o;

    return-object v0
.end method

.method public static o(Ljava/util/Comparator;Ljava/util/Collection;)Li7/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TV;>;",
            "Ljava/util/Collection<",
            "+TV;>;)",
            "Li7/x<",
            "TV;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    invoke-static {p1}, Li7/x;->n(Ljava/util/Collection;)Li7/x;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Li7/z;->C(Ljava/util/Comparator;Ljava/util/Collection;)Li7/z;

    move-result-object p0

    :goto_0
    return-object p0
.end method
