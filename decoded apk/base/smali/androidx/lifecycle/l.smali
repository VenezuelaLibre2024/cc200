.class public Landroidx/lifecycle/l;
.super Landroidx/lifecycle/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/l$a;,
        Landroidx/lifecycle/l$b;
    }
.end annotation


# static fields
.field public static final j:Landroidx/lifecycle/l$a;


# instance fields
.field public final b:Z

.field public c:Lp/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp/a<",
            "Landroidx/lifecycle/j;",
            "Landroidx/lifecycle/l$b;",
            ">;"
        }
    .end annotation
.end field

.field public d:Landroidx/lifecycle/f$b;

.field public final e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/lifecycle/k;",
            ">;"
        }
    .end annotation
.end field

.field public f:I

.field public g:Z

.field public h:Z

.field public i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/lifecycle/f$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/lifecycle/l$a;-><init>(Ltd/g;)V

    sput-object v0, Landroidx/lifecycle/l;->j:Landroidx/lifecycle/l$a;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/k;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Landroidx/lifecycle/l;-><init>(Landroidx/lifecycle/k;Z)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/k;Z)V
    .locals 0

    invoke-direct {p0}, Landroidx/lifecycle/f;-><init>()V

    iput-boolean p2, p0, Landroidx/lifecycle/l;->b:Z

    new-instance p2, Lp/a;

    invoke-direct {p2}, Lp/a;-><init>()V

    iput-object p2, p0, Landroidx/lifecycle/l;->c:Lp/a;

    sget-object p2, Landroidx/lifecycle/f$b;->i:Landroidx/lifecycle/f$b;

    iput-object p2, p0, Landroidx/lifecycle/l;->d:Landroidx/lifecycle/f$b;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Landroidx/lifecycle/l;->i:Ljava/util/ArrayList;

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Landroidx/lifecycle/l;->e:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public a(Landroidx/lifecycle/j;)V
    .locals 6

    const-string v0, "observer"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addObserver"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/l;->f(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/l;->d:Landroidx/lifecycle/f$b;

    sget-object v1, Landroidx/lifecycle/f$b;->h:Landroidx/lifecycle/f$b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Landroidx/lifecycle/f$b;->i:Landroidx/lifecycle/f$b;

    :goto_0
    new-instance v0, Landroidx/lifecycle/l$b;

    invoke-direct {v0, p1, v1}, Landroidx/lifecycle/l$b;-><init>(Landroidx/lifecycle/j;Landroidx/lifecycle/f$b;)V

    iget-object v1, p0, Landroidx/lifecycle/l;->c:Lp/a;

    invoke-virtual {v1, p1, v0}, Lp/a;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/l$b;

    if-eqz v1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Landroidx/lifecycle/l;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/k;

    if-nez v1, :cond_2

    return-void

    :cond_2
    iget v2, p0, Landroidx/lifecycle/l;->f:I

    const/4 v3, 0x1

    if-nez v2, :cond_4

    iget-boolean v2, p0, Landroidx/lifecycle/l;->g:Z

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    move v2, v3

    :goto_2
    invoke-virtual {p0, p1}, Landroidx/lifecycle/l;->e(Landroidx/lifecycle/j;)Landroidx/lifecycle/f$b;

    move-result-object v4

    iget v5, p0, Landroidx/lifecycle/l;->f:I

    add-int/2addr v5, v3

    iput v5, p0, Landroidx/lifecycle/l;->f:I

    :goto_3
    invoke-virtual {v0}, Landroidx/lifecycle/l$b;->b()Landroidx/lifecycle/f$b;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-gez v3, :cond_6

    iget-object v3, p0, Landroidx/lifecycle/l;->c:Lp/a;

    invoke-virtual {v3, p1}, Lp/a;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v0}, Landroidx/lifecycle/l$b;->b()Landroidx/lifecycle/f$b;

    move-result-object v3

    invoke-virtual {p0, v3}, Landroidx/lifecycle/l;->m(Landroidx/lifecycle/f$b;)V

    sget-object v3, Landroidx/lifecycle/f$a;->Companion:Landroidx/lifecycle/f$a$a;

    invoke-virtual {v0}, Landroidx/lifecycle/l$b;->b()Landroidx/lifecycle/f$b;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/lifecycle/f$a$a;->b(Landroidx/lifecycle/f$b;)Landroidx/lifecycle/f$a;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/l$b;->a(Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V

    invoke-virtual {p0}, Landroidx/lifecycle/l;->l()V

    invoke-virtual {p0, p1}, Landroidx/lifecycle/l;->e(Landroidx/lifecycle/j;)Landroidx/lifecycle/f$b;

    move-result-object v4

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "no event up from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroidx/lifecycle/l$b;->b()Landroidx/lifecycle/f$b;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    if-nez v2, :cond_7

    invoke-virtual {p0}, Landroidx/lifecycle/l;->o()V

    :cond_7
    iget p1, p0, Landroidx/lifecycle/l;->f:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Landroidx/lifecycle/l;->f:I

    return-void
.end method

.method public b()Landroidx/lifecycle/f$b;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/l;->d:Landroidx/lifecycle/f$b;

    return-object v0
.end method

.method public c(Landroidx/lifecycle/j;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removeObserver"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/l;->f(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/l;->c:Lp/a;

    invoke-virtual {v0, p1}, Lp/a;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final d(Landroidx/lifecycle/k;)V
    .locals 5

    iget-object v0, p0, Landroidx/lifecycle/l;->c:Lp/a;

    invoke-virtual {v0}, Lp/b;->descendingIterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "observerMap.descendingIterator()"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Landroidx/lifecycle/l;->h:Z

    if-nez v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    const-string v2, "next()"

    invoke-static {v1, v2}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/j;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/l$b;

    :goto_0
    invoke-virtual {v1}, Landroidx/lifecycle/l$b;->b()Landroidx/lifecycle/f$b;

    move-result-object v3

    iget-object v4, p0, Landroidx/lifecycle/l;->d:Landroidx/lifecycle/f$b;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-lez v3, :cond_0

    iget-boolean v3, p0, Landroidx/lifecycle/l;->h:Z

    if-nez v3, :cond_0

    iget-object v3, p0, Landroidx/lifecycle/l;->c:Lp/a;

    invoke-virtual {v3, v2}, Lp/a;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Landroidx/lifecycle/f$a;->Companion:Landroidx/lifecycle/f$a$a;

    invoke-virtual {v1}, Landroidx/lifecycle/l$b;->b()Landroidx/lifecycle/f$b;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/lifecycle/f$a$a;->a(Landroidx/lifecycle/f$b;)Landroidx/lifecycle/f$a;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroidx/lifecycle/f$a;->f()Landroidx/lifecycle/f$b;

    move-result-object v4

    invoke-virtual {p0, v4}, Landroidx/lifecycle/l;->m(Landroidx/lifecycle/f$b;)V

    invoke-virtual {v1, p1, v3}, Landroidx/lifecycle/l$b;->a(Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V

    invoke-virtual {p0}, Landroidx/lifecycle/l;->l()V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "no event down from "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroidx/lifecycle/l$b;->b()Landroidx/lifecycle/f$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method public final e(Landroidx/lifecycle/j;)Landroidx/lifecycle/f$b;
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/l;->c:Lp/a;

    invoke-virtual {v0, p1}, Lp/a;->k(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/l$b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/lifecycle/l$b;->b()Landroidx/lifecycle/f$b;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iget-object v1, p0, Landroidx/lifecycle/l;->i:Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    iget-object v0, p0, Landroidx/lifecycle/l;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/f$b;

    :cond_1
    sget-object v1, Landroidx/lifecycle/l;->j:Landroidx/lifecycle/l$a;

    iget-object v2, p0, Landroidx/lifecycle/l;->d:Landroidx/lifecycle/f$b;

    invoke-virtual {v1, v2, p1}, Landroidx/lifecycle/l$a;->a(Landroidx/lifecycle/f$b;Landroidx/lifecycle/f$b;)Landroidx/lifecycle/f$b;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Landroidx/lifecycle/l$a;->a(Landroidx/lifecycle/f$b;Landroidx/lifecycle/f$b;)Landroidx/lifecycle/f$b;

    move-result-object p1

    return-object p1
.end method

.method public final f(Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    iget-boolean v0, p0, Landroidx/lifecycle/l;->b:Z

    if-eqz v0, :cond_1

    invoke-static {}, Lo/c;->g()Lo/c;

    move-result-object v0

    invoke-virtual {v0}, Lo/c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Method "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must be called on the main thread"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final g(Landroidx/lifecycle/k;)V
    .locals 5

    iget-object v0, p0, Landroidx/lifecycle/l;->c:Lp/a;

    invoke-virtual {v0}, Lp/b;->c()Lp/b$d;

    move-result-object v0

    const-string v1, "observerMap.iteratorWithAdditions()"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Landroidx/lifecycle/l;->h:Z

    if-nez v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/j;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/l$b;

    :goto_0
    invoke-virtual {v1}, Landroidx/lifecycle/l$b;->b()Landroidx/lifecycle/f$b;

    move-result-object v3

    iget-object v4, p0, Landroidx/lifecycle/l;->d:Landroidx/lifecycle/f$b;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-gez v3, :cond_0

    iget-boolean v3, p0, Landroidx/lifecycle/l;->h:Z

    if-nez v3, :cond_0

    iget-object v3, p0, Landroidx/lifecycle/l;->c:Lp/a;

    invoke-virtual {v3, v2}, Lp/a;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Landroidx/lifecycle/l$b;->b()Landroidx/lifecycle/f$b;

    move-result-object v3

    invoke-virtual {p0, v3}, Landroidx/lifecycle/l;->m(Landroidx/lifecycle/f$b;)V

    sget-object v3, Landroidx/lifecycle/f$a;->Companion:Landroidx/lifecycle/f$a$a;

    invoke-virtual {v1}, Landroidx/lifecycle/l$b;->b()Landroidx/lifecycle/f$b;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/lifecycle/f$a$a;->b(Landroidx/lifecycle/f$b;)Landroidx/lifecycle/f$a;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v1, p1, v3}, Landroidx/lifecycle/l$b;->a(Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V

    invoke-virtual {p0}, Landroidx/lifecycle/l;->l()V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "no event up from "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroidx/lifecycle/l$b;->b()Landroidx/lifecycle/f$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method public h(Landroidx/lifecycle/f$a;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handleLifecycleEvent"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/l;->f(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/lifecycle/f$a;->f()Landroidx/lifecycle/f$b;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/lifecycle/l;->k(Landroidx/lifecycle/f$b;)V

    return-void
.end method

.method public final i()Z
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/l;->c:Lp/a;

    invoke-virtual {v0}, Lp/b;->size()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/l;->c:Lp/a;

    invoke-virtual {v0}, Lp/b;->a()Ljava/util/Map$Entry;

    move-result-object v0

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/l$b;

    invoke-virtual {v0}, Landroidx/lifecycle/l$b;->b()Landroidx/lifecycle/f$b;

    move-result-object v0

    iget-object v2, p0, Landroidx/lifecycle/l;->c:Lp/a;

    invoke-virtual {v2}, Lp/b;->d()Ljava/util/Map$Entry;

    move-result-object v2

    invoke-static {v2}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/l$b;

    invoke-virtual {v2}, Landroidx/lifecycle/l$b;->b()Landroidx/lifecycle/f$b;

    move-result-object v2

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Landroidx/lifecycle/l;->d:Landroidx/lifecycle/f$b;

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public j(Landroidx/lifecycle/f$b;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markState"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/l;->f(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroidx/lifecycle/l;->n(Landroidx/lifecycle/f$b;)V

    return-void
.end method

.method public final k(Landroidx/lifecycle/f$b;)V
    .locals 4

    iget-object v0, p0, Landroidx/lifecycle/l;->d:Landroidx/lifecycle/f$b;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    sget-object v1, Landroidx/lifecycle/f$b;->i:Landroidx/lifecycle/f$b;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_2

    sget-object v0, Landroidx/lifecycle/f$b;->h:Landroidx/lifecycle/f$b;

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v3

    :goto_1
    if-eqz v0, :cond_6

    iput-object p1, p0, Landroidx/lifecycle/l;->d:Landroidx/lifecycle/f$b;

    iget-boolean p1, p0, Landroidx/lifecycle/l;->g:Z

    if-nez p1, :cond_5

    iget p1, p0, Landroidx/lifecycle/l;->f:I

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    iput-boolean v3, p0, Landroidx/lifecycle/l;->g:Z

    invoke-virtual {p0}, Landroidx/lifecycle/l;->o()V

    iput-boolean v2, p0, Landroidx/lifecycle/l;->g:Z

    iget-object p1, p0, Landroidx/lifecycle/l;->d:Landroidx/lifecycle/f$b;

    sget-object v0, Landroidx/lifecycle/f$b;->h:Landroidx/lifecycle/f$b;

    if-ne p1, v0, :cond_4

    new-instance p1, Lp/a;

    invoke-direct {p1}, Lp/a;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/l;->c:Lp/a;

    :cond_4
    return-void

    :cond_5
    :goto_2
    iput-boolean v3, p0, Landroidx/lifecycle/l;->h:Z

    return-void

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "no event down from "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/lifecycle/l;->d:Landroidx/lifecycle/f$b;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " in component "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/lifecycle/l;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/l;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method public final m(Landroidx/lifecycle/f$b;)V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/l;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public n(Landroidx/lifecycle/f$b;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setCurrentState"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/l;->f(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroidx/lifecycle/l;->k(Landroidx/lifecycle/f$b;)V

    return-void
.end method

.method public final o()V
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/l;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/k;

    if-eqz v0, :cond_3

    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroidx/lifecycle/l;->i()Z

    move-result v1

    const/4 v2, 0x0

    iput-boolean v2, p0, Landroidx/lifecycle/l;->h:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/lifecycle/l;->d:Landroidx/lifecycle/f$b;

    iget-object v2, p0, Landroidx/lifecycle/l;->c:Lp/a;

    invoke-virtual {v2}, Lp/b;->a()Ljava/util/Map$Entry;

    move-result-object v2

    invoke-static {v2}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/l$b;

    invoke-virtual {v2}, Landroidx/lifecycle/l$b;->b()Landroidx/lifecycle/f$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-gez v1, :cond_1

    invoke-virtual {p0, v0}, Landroidx/lifecycle/l;->d(Landroidx/lifecycle/k;)V

    :cond_1
    iget-object v1, p0, Landroidx/lifecycle/l;->c:Lp/a;

    invoke-virtual {v1}, Lp/b;->d()Ljava/util/Map$Entry;

    move-result-object v1

    iget-boolean v2, p0, Landroidx/lifecycle/l;->h:Z

    if-nez v2, :cond_0

    if-eqz v1, :cond_0

    iget-object v2, p0, Landroidx/lifecycle/l;->d:Landroidx/lifecycle/f$b;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/l$b;

    invoke-virtual {v1}, Landroidx/lifecycle/l$b;->b()Landroidx/lifecycle/f$b;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {p0, v0}, Landroidx/lifecycle/l;->g(Landroidx/lifecycle/k;)V

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
