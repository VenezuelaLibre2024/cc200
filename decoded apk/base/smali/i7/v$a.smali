.class public Li7/v$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/v$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "-TV;>;"
        }
    .end annotation
.end field

.field public b:[Ljava/lang/Object;

.field public c:I

.field public d:Z

.field public e:Li7/v$a$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Li7/v$a;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    mul-int/lit8 p1, p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Li7/v$a;->b:[Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Li7/v$a;->c:I

    iput-boolean p1, p0, Li7/v$a;->d:Z

    return-void
.end method

.method public static i([Ljava/lang/Object;ILjava/util/Comparator;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            "I",
            "Ljava/util/Comparator<",
            "-TV;>;)V"
        }
    .end annotation

    new-array v0, p1, [Ljava/util/Map$Entry;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p1, :cond_0

    mul-int/lit8 v3, v2, 0x2

    aget-object v4, p0, v3

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    aget-object v3, p0, v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-direct {v5, v4, v3}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v5, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-static {p2}, Li7/p0;->a(Ljava/util/Comparator;)Li7/p0;

    move-result-object p2

    invoke-static {}, Li7/g0;->k()Lh7/g;

    move-result-object v2

    invoke-virtual {p2, v2}, Li7/p0;->e(Lh7/g;)Li7/p0;

    move-result-object p2

    invoke-static {v0, v1, p1, p2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    :goto_1
    if-ge v1, p1, :cond_1

    mul-int/lit8 p2, v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    aput-object v2, p0, p2

    add-int/lit8 p2, p2, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    aput-object v2, p0, p2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method


# virtual methods
.method public a()Li7/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/v<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Li7/v$a;->c()Li7/v;

    move-result-object v0

    return-object v0
.end method

.method public final b(Z)Li7/v;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Li7/v<",
            "TK;TV;>;"
        }
    .end annotation

    if-eqz p1, :cond_1

    iget-object v0, p0, Li7/v$a;->e:Li7/v$a$a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Li7/v$a$a;->a()Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    iget v0, p0, Li7/v$a;->c:I

    iget-object v1, p0, Li7/v$a;->a:Ljava/util/Comparator;

    const/4 v2, 0x1

    if-nez v1, :cond_2

    iget-object v1, p0, Li7/v$a;->b:[Ljava/lang/Object;

    goto :goto_1

    :cond_2
    iget-boolean v1, p0, Li7/v$a;->d:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Li7/v$a;->b:[Ljava/lang/Object;

    mul-int/lit8 v3, v0, 0x2

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Li7/v$a;->b:[Ljava/lang/Object;

    :cond_3
    iget-object v1, p0, Li7/v$a;->b:[Ljava/lang/Object;

    if-nez p1, :cond_4

    iget v3, p0, Li7/v$a;->c:I

    invoke-virtual {p0, v1, v3}, Li7/v$a;->e([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    array-length v3, v1

    iget-object v4, p0, Li7/v$a;->b:[Ljava/lang/Object;

    array-length v4, v4

    if-ge v3, v4, :cond_4

    array-length v0, v1

    ushr-int/2addr v0, v2

    :cond_4
    iget-object v3, p0, Li7/v$a;->a:Ljava/util/Comparator;

    invoke-static {v1, v0, v3}, Li7/v$a;->i([Ljava/lang/Object;ILjava/util/Comparator;)V

    :goto_1
    iput-boolean v2, p0, Li7/v$a;->d:Z

    invoke-static {v0, v1, p0}, Li7/s0;->l(I[Ljava/lang/Object;Li7/v$a;)Li7/s0;

    move-result-object v0

    if-eqz p1, :cond_6

    iget-object p1, p0, Li7/v$a;->e:Li7/v$a$a;

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p1}, Li7/v$a$a;->a()Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_6
    :goto_2
    return-object v0
.end method

.method public c()Li7/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/v<",
            "TK;TV;>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Li7/v$a;->b(Z)Li7/v;

    move-result-object v0

    return-object v0
.end method

.method public final d(I)V
    .locals 2

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Li7/v$a;->b:[Ljava/lang/Object;

    array-length v1, v0

    if-le p1, v1, :cond_0

    array-length v1, v0

    invoke-static {v1, p1}, Li7/s$b;->c(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Li7/v$a;->b:[Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Li7/v$a;->d:Z

    :cond_0
    return-void
.end method

.method public final e([Ljava/lang/Object;I)[Ljava/lang/Object;
    .locals 6

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    add-int/lit8 v2, p2, -0x1

    :goto_0
    if-ltz v2, :cond_1

    mul-int/lit8 v3, v2, 0x2

    aget-object v3, p1, v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/util/BitSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    return-object p1

    :cond_2
    invoke-virtual {v1}, Ljava/util/BitSet;->cardinality()I

    move-result v0

    sub-int v0, p2, v0

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    move v3, v2

    :goto_1
    mul-int/lit8 v4, p2, 0x2

    if-ge v2, v4, :cond_4

    ushr-int/lit8 v4, v2, 0x1

    invoke-virtual {v1, v4}, Ljava/util/BitSet;->get(I)Z

    move-result v4

    if-eqz v4, :cond_3

    add-int/lit8 v2, v2, 0x2

    goto :goto_1

    :cond_3
    add-int/lit8 v4, v3, 0x1

    add-int/lit8 v5, v2, 0x1

    aget-object v2, p1, v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    aput-object v2, v0, v3

    add-int/lit8 v3, v4, 0x1

    add-int/lit8 v2, v5, 0x1

    aget-object v5, p1, v5

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    aput-object v5, v0, v4

    goto :goto_1

    :cond_4
    return-object v0
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Object;)Li7/v$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "Li7/v$a<",
            "TK;TV;>;"
        }
    .end annotation

    iget v0, p0, Li7/v$a;->c:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Li7/v$a;->d(I)V

    invoke-static {p1, p2}, Li7/i;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Li7/v$a;->b:[Ljava/lang/Object;

    iget v1, p0, Li7/v$a;->c:I

    mul-int/lit8 v2, v1, 0x2

    aput-object p1, v0, v2

    mul-int/lit8 p1, v1, 0x2

    add-int/lit8 p1, p1, 0x1

    aput-object p2, v0, p1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Li7/v$a;->c:I

    return-object p0
.end method

.method public g(Ljava/util/Map$Entry;)Li7/v$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;)",
            "Li7/v$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Li7/v$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Li7/v$a;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/Iterable;)Li7/v$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;>;)",
            "Li7/v$a<",
            "TK;TV;>;"
        }
    .end annotation

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_0

    iget v0, p0, Li7/v$a;->c:I

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Li7/v$a;->d(I)V

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p0, v0}, Li7/v$a;->g(Ljava/util/Map$Entry;)Li7/v$a;

    goto :goto_0

    :cond_1
    return-object p0
.end method
