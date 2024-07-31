.class public Lga/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lga/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lga/a$a;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lea/a;

.field public final b:I

.field public c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation
.end field

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lga/a<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(DDDD)V
    .locals 10

    new-instance v9, Lea/a;

    move-object v0, v9

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    move-wide/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lea/a;-><init>(DDDD)V

    move-object v0, p0

    invoke-direct {p0, v9}, Lga/a;-><init>(Lea/a;)V

    return-void
.end method

.method public constructor <init>(DDDDI)V
    .locals 10

    new-instance v9, Lea/a;

    move-object v0, v9

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    move-wide/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lea/a;-><init>(DDDD)V

    move-object v0, p0

    move/from16 v1, p9

    invoke-direct {p0, v9, v1}, Lga/a;-><init>(Lea/a;I)V

    return-void
.end method

.method public constructor <init>(Lea/a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lga/a;-><init>(Lea/a;I)V

    return-void
.end method

.method public constructor <init>(Lea/a;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lga/a;->d:Ljava/util/List;

    iput-object p1, p0, Lga/a;->a:Lea/a;

    iput p2, p0, Lga/a;->b:I

    return-void
.end method


# virtual methods
.method public a(Lga/a$a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-interface {p1}, Lga/a$a;->a()Lea/b;

    move-result-object v0

    iget-object v1, p0, Lga/a;->a:Lea/a;

    iget-wide v2, v0, Lea/b;->a:D

    iget-wide v4, v0, Lea/b;->b:D

    invoke-virtual {v1, v2, v3, v4, v5}, Lea/a;->a(DD)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-wide v3, v0, Lea/b;->a:D

    iget-wide v5, v0, Lea/b;->b:D

    move-object v2, p0

    move-object v7, p1

    invoke-virtual/range {v2 .. v7}, Lga/a;->c(DDLga/a$a;)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lga/a;->d:Ljava/util/List;

    iget-object v0, p0, Lga/a;->c:Ljava/util/Set;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    :cond_0
    return-void
.end method

.method public final c(DDLga/a$a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDTT;)V"
        }
    .end annotation

    iget-object v0, p0, Lga/a;->d:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lga/a;->a:Lea/a;

    iget-wide v2, v1, Lea/a;->f:D

    cmpg-double v2, p3, v2

    if-gez v2, :cond_1

    iget-wide v1, v1, Lea/a;->e:D

    cmpg-double v1, p1, v1

    if-gez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    iget-wide v1, v1, Lea/a;->e:D

    cmpg-double v1, p1, v1

    if-gez v1, :cond_2

    const/4 v1, 0x2

    goto :goto_0

    :cond_2
    const/4 v1, 0x3

    :goto_0
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lga/a;

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lga/a;->c(DDLga/a$a;)V

    return-void

    :cond_3
    iget-object p1, p0, Lga/a;->c:Ljava/util/Set;

    if-nez p1, :cond_4

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lga/a;->c:Ljava/util/Set;

    :cond_4
    iget-object p1, p0, Lga/a;->c:Ljava/util/Set;

    invoke-interface {p1, p5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lga/a;->c:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    const/16 p2, 0x32

    if-le p1, p2, :cond_5

    iget p1, p0, Lga/a;->b:I

    const/16 p2, 0x28

    if-ge p1, p2, :cond_5

    invoke-virtual {p0}, Lga/a;->h()V

    :cond_5
    return-void
.end method

.method public final d(DDLga/a$a;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDTT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lga/a;->d:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v2, p0, Lga/a;->a:Lea/a;

    iget-wide v3, v2, Lea/a;->f:D

    cmpg-double v3, p3, v3

    if-gez v3, :cond_1

    iget-wide v2, v2, Lea/a;->e:D

    cmpg-double v2, p1, v2

    if-gez v2, :cond_0

    :goto_0
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lga/a;

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lga/a;->d(DDLga/a$a;)Z

    move-result p1

    return p1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    iget-wide v1, v2, Lea/a;->e:D

    cmpg-double v1, p1, v1

    if-gez v1, :cond_2

    const/4 v1, 0x2

    goto :goto_0

    :cond_2
    const/4 v1, 0x3

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lga/a;->c:Ljava/util/Set;

    if-nez p1, :cond_4

    return v1

    :cond_4
    invoke-interface {p1, p5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public e(Lga/a$a;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    invoke-interface {p1}, Lga/a$a;->a()Lea/b;

    move-result-object v0

    iget-object v1, p0, Lga/a;->a:Lea/a;

    iget-wide v2, v0, Lea/b;->a:D

    iget-wide v4, v0, Lea/b;->b:D

    invoke-virtual {v1, v2, v3, v4, v5}, Lea/a;->a(DD)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-wide v3, v0, Lea/b;->a:D

    iget-wide v5, v0, Lea/b;->b:D

    move-object v2, p0

    move-object v7, p1

    invoke-virtual/range {v2 .. v7}, Lga/a;->d(DDLga/a$a;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public f(Lea/a;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lea/a;",
            ")",
            "Ljava/util/Collection<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1, v0}, Lga/a;->g(Lea/a;Ljava/util/Collection;)V

    return-object v0
.end method

.method public final g(Lea/a;Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lea/a;",
            "Ljava/util/Collection<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lga/a;->a:Lea/a;

    invoke-virtual {v0, p1}, Lea/a;->e(Lea/a;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lga/a;->d:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lga/a;

    invoke-virtual {v1, p1, p2}, Lga/a;->g(Lea/a;Ljava/util/Collection;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lga/a;->c:Ljava/util/Set;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lga/a;->a:Lea/a;

    invoke-virtual {p1, v0}, Lea/a;->b(Lea/a;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Lga/a;->c:Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lga/a;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lga/a$a;

    invoke-interface {v1}, Lga/a$a;->a()Lea/b;

    move-result-object v2

    invoke-virtual {p1, v2}, Lea/a;->c(Lea/b;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    :goto_2
    return-void
.end method

.method public final h()V
    .locals 12

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lga/a;->d:Ljava/util/List;

    new-instance v1, Lga/a;

    iget-object v2, p0, Lga/a;->a:Lea/a;

    iget-wide v3, v2, Lea/a;->a:D

    iget-wide v5, v2, Lea/a;->e:D

    iget-wide v7, v2, Lea/a;->b:D

    iget-wide v9, v2, Lea/a;->f:D

    iget v2, p0, Lga/a;->b:I

    add-int/lit8 v11, v2, 0x1

    move-object v2, v1

    invoke-direct/range {v2 .. v11}, Lga/a;-><init>(DDDDI)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lga/a;->d:Ljava/util/List;

    new-instance v11, Lga/a;

    iget-object v1, p0, Lga/a;->a:Lea/a;

    iget-wide v2, v1, Lea/a;->e:D

    iget-wide v4, v1, Lea/a;->c:D

    iget-wide v6, v1, Lea/a;->b:D

    iget-wide v8, v1, Lea/a;->f:D

    iget v1, p0, Lga/a;->b:I

    add-int/lit8 v10, v1, 0x1

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Lga/a;-><init>(DDDDI)V

    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lga/a;->d:Ljava/util/List;

    new-instance v11, Lga/a;

    iget-object v1, p0, Lga/a;->a:Lea/a;

    iget-wide v2, v1, Lea/a;->a:D

    iget-wide v4, v1, Lea/a;->e:D

    iget-wide v6, v1, Lea/a;->f:D

    iget-wide v8, v1, Lea/a;->d:D

    iget v1, p0, Lga/a;->b:I

    add-int/lit8 v10, v1, 0x1

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Lga/a;-><init>(DDDDI)V

    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lga/a;->d:Ljava/util/List;

    new-instance v11, Lga/a;

    iget-object v1, p0, Lga/a;->a:Lea/a;

    iget-wide v2, v1, Lea/a;->e:D

    iget-wide v4, v1, Lea/a;->c:D

    iget-wide v6, v1, Lea/a;->f:D

    iget-wide v8, v1, Lea/a;->d:D

    iget v1, p0, Lga/a;->b:I

    add-int/lit8 v10, v1, 0x1

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Lga/a;-><init>(DDDDI)V

    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lga/a;->c:Ljava/util/Set;

    const/4 v1, 0x0

    iput-object v1, p0, Lga/a;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lga/a$a;

    invoke-interface {v7}, Lga/a$a;->a()Lea/b;

    move-result-object v1

    iget-wide v3, v1, Lea/b;->a:D

    invoke-interface {v7}, Lga/a$a;->a()Lea/b;

    move-result-object v1

    iget-wide v5, v1, Lea/b;->b:D

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, Lga/a;->c(DDLga/a$a;)V

    goto :goto_0

    :cond_0
    return-void
.end method
