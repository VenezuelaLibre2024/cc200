.class public final Ls3/s2;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/s2$a;,
        Ls3/s2$b;,
        Ls3/s2$c;,
        Ls3/s2$d;
    }
.end annotation


# instance fields
.field public final a:Lt3/s1;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls3/s2$c;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Lu4/r;",
            "Ls3/s2$c;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ls3/s2$c;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ls3/s2$d;

.field public final f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ls3/s2$c;",
            "Ls3/s2$b;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ls3/s2$c;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lt3/a;

.field public final i:Lp5/n;

.field public j:Lu4/o0;

.field public k:Z

.field public l:Lo5/m0;


# direct methods
.method public constructor <init>(Ls3/s2$d;Lt3/a;Lp5/n;Lt3/s1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Ls3/s2;->a:Lt3/s1;

    iput-object p1, p0, Ls3/s2;->e:Ls3/s2$d;

    new-instance p1, Lu4/o0$a;

    const/4 p4, 0x0

    invoke-direct {p1, p4}, Lu4/o0$a;-><init>(I)V

    iput-object p1, p0, Ls3/s2;->j:Lu4/o0;

    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Ls3/s2;->c:Ljava/util/IdentityHashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ls3/s2;->d:Ljava/util/Map;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ls3/s2;->b:Ljava/util/List;

    iput-object p2, p0, Ls3/s2;->h:Lt3/a;

    iput-object p3, p0, Ls3/s2;->i:Lp5/n;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ls3/s2;->f:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ls3/s2;->g:Ljava/util/Set;

    return-void
.end method

.method public static synthetic a(Ls3/s2;Lu4/t;Ls3/u3;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls3/s2;->t(Lu4/t;Ls3/u3;)V

    return-void
.end method

.method public static synthetic b(Ls3/s2;)Lp5/n;
    .locals 0

    iget-object p0, p0, Ls3/s2;->i:Lp5/n;

    return-object p0
.end method

.method public static synthetic c(Ls3/s2$c;Lu4/t$b;)Lu4/t$b;
    .locals 0

    invoke-static {p0, p1}, Ls3/s2;->n(Ls3/s2$c;Lu4/t$b;)Lu4/t$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ls3/s2$c;I)I
    .locals 0

    invoke-static {p0, p1}, Ls3/s2;->r(Ls3/s2$c;I)I

    move-result p0

    return p0
.end method

.method public static synthetic e(Ls3/s2;)Lt3/a;
    .locals 0

    iget-object p0, p0, Ls3/s2;->h:Lt3/a;

    return-object p0
.end method

.method public static m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Ls3/a;->z(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static n(Ls3/s2$c;Lu4/t$b;)Lu4/t$b;
    .locals 5

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ls3/s2$c;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Ls3/s2$c;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu4/t$b;

    iget-wide v1, v1, Lu4/s;->d:J

    iget-wide v3, p1, Lu4/s;->d:J

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    iget-object v0, p1, Lu4/s;->a:Ljava/lang/Object;

    invoke-static {p0, v0}, Ls3/s2;->p(Ls3/s2$c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Lu4/t$b;->c(Ljava/lang/Object;)Lu4/t$b;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Ls3/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static p(Ls3/s2$c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Ls3/s2$c;->b:Ljava/lang/Object;

    invoke-static {p0, p1}, Ls3/a;->C(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static r(Ls3/s2$c;I)I
    .locals 0

    iget p0, p0, Ls3/s2$c;->d:I

    add-int/2addr p1, p0

    return p1
.end method

.method private synthetic t(Lu4/t;Ls3/u3;)V
    .locals 0

    iget-object p1, p0, Ls3/s2;->e:Ls3/s2$d;

    invoke-interface {p1}, Ls3/s2$d;->d()V

    return-void
.end method


# virtual methods
.method public A(IILu4/o0;)Ls3/u3;
    .locals 1

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    invoke-virtual {p0}, Ls3/s2;->q()I

    move-result v0

    if-gt p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp5/a;->a(Z)V

    iput-object p3, p0, Ls3/s2;->j:Lu4/o0;

    invoke-virtual {p0, p1, p2}, Ls3/s2;->B(II)V

    invoke-virtual {p0}, Ls3/s2;->i()Ls3/u3;

    move-result-object p1

    return-object p1
.end method

.method public final B(II)V
    .locals 4

    const/4 v0, 0x1

    sub-int/2addr p2, v0

    :goto_0
    if-lt p2, p1, :cond_1

    iget-object v1, p0, Ls3/s2;->b:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls3/s2$c;

    iget-object v2, p0, Ls3/s2;->d:Ljava/util/Map;

    iget-object v3, v1, Ls3/s2$c;->b:Ljava/lang/Object;

    invoke-interface {v2, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Ls3/s2$c;->a:Lu4/p;

    invoke-virtual {v2}, Lu4/p;->Z()Ls3/u3;

    move-result-object v2

    invoke-virtual {v2}, Ls3/u3;->t()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, p2, v2}, Ls3/s2;->g(II)V

    iput-boolean v0, v1, Ls3/s2$c;->e:Z

    iget-boolean v2, p0, Ls3/s2;->k:Z

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Ls3/s2;->u(Ls3/s2$c;)V

    :cond_0
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public C(Ljava/util/List;Lu4/o0;)Ls3/u3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ls3/s2$c;",
            ">;",
            "Lu4/o0;",
            ")",
            "Ls3/u3;"
        }
    .end annotation

    iget-object v0, p0, Ls3/s2;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ls3/s2;->B(II)V

    iget-object v0, p0, Ls3/s2;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0, v0, p1, p2}, Ls3/s2;->f(ILjava/util/List;Lu4/o0;)Ls3/u3;

    move-result-object p1

    return-object p1
.end method

.method public D(Lu4/o0;)Ls3/u3;
    .locals 2

    invoke-virtual {p0}, Ls3/s2;->q()I

    move-result v0

    invoke-interface {p1}, Lu4/o0;->b()I

    move-result v1

    if-eq v1, v0, :cond_0

    invoke-interface {p1}, Lu4/o0;->i()Lu4/o0;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lu4/o0;->g(II)Lu4/o0;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Ls3/s2;->j:Lu4/o0;

    invoke-virtual {p0}, Ls3/s2;->i()Ls3/u3;

    move-result-object p1

    return-object p1
.end method

.method public f(ILjava/util/List;Lu4/o0;)Ls3/u3;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ls3/s2$c;",
            ">;",
            "Lu4/o0;",
            ")",
            "Ls3/u3;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iput-object p3, p0, Ls3/s2;->j:Lu4/o0;

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, p1

    if-ge p3, v0, :cond_3

    sub-int v0, p3, p1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/s2$c;

    if-lez p3, :cond_0

    iget-object v1, p0, Ls3/s2;->b:Ljava/util/List;

    add-int/lit8 v2, p3, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls3/s2$c;

    iget-object v2, v1, Ls3/s2$c;->a:Lu4/p;

    invoke-virtual {v2}, Lu4/p;->Z()Ls3/u3;

    move-result-object v2

    iget v1, v1, Ls3/s2$c;->d:I

    invoke-virtual {v2}, Ls3/u3;->t()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Ls3/s2$c;->a(I)V

    iget-object v1, v0, Ls3/s2$c;->a:Lu4/p;

    invoke-virtual {v1}, Lu4/p;->Z()Ls3/u3;

    move-result-object v1

    invoke-virtual {v1}, Ls3/u3;->t()I

    move-result v1

    invoke-virtual {p0, p3, v1}, Ls3/s2;->g(II)V

    iget-object v1, p0, Ls3/s2;->b:Ljava/util/List;

    invoke-interface {v1, p3, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget-object v1, p0, Ls3/s2;->d:Ljava/util/Map;

    iget-object v2, v0, Ls3/s2$c;->b:Ljava/lang/Object;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, p0, Ls3/s2;->k:Z

    if-eqz v1, :cond_2

    invoke-virtual {p0, v0}, Ls3/s2;->x(Ls3/s2$c;)V

    iget-object v1, p0, Ls3/s2;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls3/s2;->g:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    invoke-virtual {p0, v0}, Ls3/s2;->j(Ls3/s2$c;)V

    :cond_2
    :goto_2
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Ls3/s2;->i()Ls3/u3;

    move-result-object p1

    return-object p1
.end method

.method public final g(II)V
    .locals 2

    :goto_0
    iget-object v0, p0, Ls3/s2;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Ls3/s2;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/s2$c;

    iget v1, v0, Ls3/s2$c;->d:I

    add-int/2addr v1, p2

    iput v1, v0, Ls3/s2$c;->d:I

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h(Lu4/t$b;Lo5/b;J)Lu4/r;
    .locals 2

    iget-object v0, p1, Lu4/s;->a:Ljava/lang/Object;

    invoke-static {v0}, Ls3/s2;->o(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p1, Lu4/s;->a:Ljava/lang/Object;

    invoke-static {v1}, Ls3/s2;->m(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Lu4/t$b;->c(Ljava/lang/Object;)Lu4/t$b;

    move-result-object p1

    iget-object v1, p0, Ls3/s2;->d:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/s2$c;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/s2$c;

    invoke-virtual {p0, v0}, Ls3/s2;->l(Ls3/s2$c;)V

    iget-object v1, v0, Ls3/s2$c;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Ls3/s2$c;->a:Lu4/p;

    invoke-virtual {v1, p1, p2, p3, p4}, Lu4/p;->W(Lu4/t$b;Lo5/b;J)Lu4/o;

    move-result-object p1

    iget-object p2, p0, Ls3/s2;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ls3/s2;->k()V

    return-object p1
.end method

.method public i()Ls3/u3;
    .locals 3

    iget-object v0, p0, Ls3/s2;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ls3/u3;->h:Ls3/u3;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Ls3/s2;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Ls3/s2;->b:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls3/s2$c;

    iput v1, v2, Ls3/s2$c;->d:I

    iget-object v2, v2, Ls3/s2$c;->a:Lu4/p;

    invoke-virtual {v2}, Lu4/p;->Z()Ls3/u3;

    move-result-object v2

    invoke-virtual {v2}, Ls3/u3;->t()I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ls3/f3;

    iget-object v1, p0, Ls3/s2;->b:Ljava/util/List;

    iget-object v2, p0, Ls3/s2;->j:Lu4/o0;

    invoke-direct {v0, v1, v2}, Ls3/f3;-><init>(Ljava/util/Collection;Lu4/o0;)V

    return-object v0
.end method

.method public final j(Ls3/s2$c;)V
    .locals 1

    iget-object v0, p0, Ls3/s2;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls3/s2$b;

    if-eqz p1, :cond_0

    iget-object v0, p1, Ls3/s2$b;->a:Lu4/t;

    iget-object p1, p1, Ls3/s2$b;->b:Lu4/t$c;

    invoke-interface {v0, p1}, Lu4/t;->s(Lu4/t$c;)V

    :cond_0
    return-void
.end method

.method public final k()V
    .locals 3

    iget-object v0, p0, Ls3/s2;->g:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls3/s2$c;

    iget-object v2, v1, Ls3/s2$c;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Ls3/s2;->j(Ls3/s2$c;)V

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final l(Ls3/s2$c;)V
    .locals 1

    iget-object v0, p0, Ls3/s2;->g:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ls3/s2;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls3/s2$b;

    if-eqz p1, :cond_0

    iget-object v0, p1, Ls3/s2$b;->a:Lu4/t;

    iget-object p1, p1, Ls3/s2$b;->b:Lu4/t$c;

    invoke-interface {v0, p1}, Lu4/t;->e(Lu4/t$c;)V

    :cond_0
    return-void
.end method

.method public q()I
    .locals 1

    iget-object v0, p0, Ls3/s2;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public s()Z
    .locals 1

    iget-boolean v0, p0, Ls3/s2;->k:Z

    return v0
.end method

.method public final u(Ls3/s2$c;)V
    .locals 3

    iget-boolean v0, p1, Ls3/s2$c;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Ls3/s2$c;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls3/s2;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/s2$b;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/s2$b;

    iget-object v1, v0, Ls3/s2$b;->a:Lu4/t;

    iget-object v2, v0, Ls3/s2$b;->b:Lu4/t$c;

    invoke-interface {v1, v2}, Lu4/t;->q(Lu4/t$c;)V

    iget-object v1, v0, Ls3/s2$b;->a:Lu4/t;

    iget-object v2, v0, Ls3/s2$b;->c:Ls3/s2$a;

    invoke-interface {v1, v2}, Lu4/t;->m(Lu4/a0;)V

    iget-object v1, v0, Ls3/s2$b;->a:Lu4/t;

    iget-object v0, v0, Ls3/s2$b;->c:Ls3/s2$a;

    invoke-interface {v1, v0}, Lu4/t;->n(Lw3/u;)V

    iget-object v0, p0, Ls3/s2;->g:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public v(IIILu4/o0;)Ls3/u3;
    .locals 3

    const/4 v0, 0x1

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    invoke-virtual {p0}, Ls3/s2;->q()I

    move-result v1

    if-gt p2, v1, :cond_0

    if-ltz p3, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lp5/a;->a(Z)V

    iput-object p4, p0, Ls3/s2;->j:Lu4/o0;

    if-eq p1, p2, :cond_3

    if-ne p1, p3, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    move-result p4

    sub-int v1, p2, p1

    add-int/2addr v1, p3

    sub-int/2addr v1, v0

    add-int/lit8 v0, p2, -0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget-object v1, p0, Ls3/s2;->b:Ljava/util/List;

    invoke-interface {v1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls3/s2$c;

    iget v1, v1, Ls3/s2$c;->d:I

    iget-object v2, p0, Ls3/s2;->b:Ljava/util/List;

    invoke-static {v2, p1, p2, p3}, Lp5/n0;->A0(Ljava/util/List;III)V

    :goto_1
    if-gt p4, v0, :cond_2

    iget-object p1, p0, Ls3/s2;->b:Ljava/util/List;

    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls3/s2$c;

    iput v1, p1, Ls3/s2$c;->d:I

    iget-object p1, p1, Ls3/s2$c;->a:Lu4/p;

    invoke-virtual {p1}, Lu4/p;->Z()Ls3/u3;

    move-result-object p1

    invoke-virtual {p1}, Ls3/u3;->t()I

    move-result p1

    add-int/2addr v1, p1

    add-int/lit8 p4, p4, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Ls3/s2;->i()Ls3/u3;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_2
    invoke-virtual {p0}, Ls3/s2;->i()Ls3/u3;

    move-result-object p1

    return-object p1
.end method

.method public w(Lo5/m0;)V
    .locals 3

    iget-boolean v0, p0, Ls3/s2;->k:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lp5/a;->f(Z)V

    iput-object p1, p0, Ls3/s2;->l:Lo5/m0;

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Ls3/s2;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Ls3/s2;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/s2$c;

    invoke-virtual {p0, v0}, Ls3/s2;->x(Ls3/s2$c;)V

    iget-object v2, p0, Ls3/s2;->g:Ljava/util/Set;

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Ls3/s2;->k:Z

    return-void
.end method

.method public final x(Ls3/s2$c;)V
    .locals 5

    iget-object v0, p1, Ls3/s2$c;->a:Lu4/p;

    new-instance v1, Ls3/f2;

    invoke-direct {v1, p0}, Ls3/f2;-><init>(Ls3/s2;)V

    new-instance v2, Ls3/s2$a;

    invoke-direct {v2, p0, p1}, Ls3/s2$a;-><init>(Ls3/s2;Ls3/s2$c;)V

    iget-object v3, p0, Ls3/s2;->f:Ljava/util/HashMap;

    new-instance v4, Ls3/s2$b;

    invoke-direct {v4, v0, v1, v2}, Ls3/s2$b;-><init>(Lu4/t;Lu4/t$c;Ls3/s2$a;)V

    invoke-virtual {v3, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lp5/n0;->y()Landroid/os/Handler;

    move-result-object p1

    invoke-interface {v0, p1, v2}, Lu4/t;->i(Landroid/os/Handler;Lu4/a0;)V

    invoke-static {}, Lp5/n0;->y()Landroid/os/Handler;

    move-result-object p1

    invoke-interface {v0, p1, v2}, Lu4/t;->c(Landroid/os/Handler;Lw3/u;)V

    iget-object p1, p0, Ls3/s2;->l:Lo5/m0;

    iget-object v2, p0, Ls3/s2;->a:Lt3/s1;

    invoke-interface {v0, v1, p1, v2}, Lu4/t;->d(Lu4/t$c;Lo5/m0;Lt3/s1;)V

    return-void
.end method

.method public y()V
    .locals 5

    iget-object v0, p0, Ls3/s2;->f:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls3/s2$b;

    :try_start_0
    iget-object v2, v1, Ls3/s2$b;->a:Lu4/t;

    iget-object v3, v1, Ls3/s2$b;->b:Lu4/t$c;

    invoke-interface {v2, v3}, Lu4/t;->q(Lu4/t$c;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    const-string v3, "MediaSourceList"

    const-string v4, "Failed to release child source."

    invoke-static {v3, v4, v2}, Lp5/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    iget-object v2, v1, Ls3/s2$b;->a:Lu4/t;

    iget-object v3, v1, Ls3/s2$b;->c:Ls3/s2$a;

    invoke-interface {v2, v3}, Lu4/t;->m(Lu4/a0;)V

    iget-object v2, v1, Ls3/s2$b;->a:Lu4/t;

    iget-object v1, v1, Ls3/s2$b;->c:Ls3/s2$a;

    invoke-interface {v2, v1}, Lu4/t;->n(Lw3/u;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls3/s2;->f:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Ls3/s2;->g:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls3/s2;->k:Z

    return-void
.end method

.method public z(Lu4/r;)V
    .locals 2

    iget-object v0, p0, Ls3/s2;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/s2$c;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/s2$c;

    iget-object v1, v0, Ls3/s2$c;->a:Lu4/p;

    invoke-virtual {v1, p1}, Lu4/p;->a(Lu4/r;)V

    iget-object v1, v0, Ls3/s2$c;->c:Ljava/util/List;

    check-cast p1, Lu4/o;

    iget-object p1, p1, Lu4/o;->h:Lu4/t$b;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Ls3/s2;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {p1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ls3/s2;->k()V

    :cond_0
    invoke-virtual {p0, v0}, Ls3/s2;->u(Ls3/s2$c;)V

    return-void
.end method
