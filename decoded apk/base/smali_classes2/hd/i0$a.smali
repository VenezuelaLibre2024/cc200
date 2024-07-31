.class public final Lhd/i0$a;
.super Lld/k;
.source ""

# interfaces
.implements Lsd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhd/i0;->b(Ljava/util/Iterator;IIZZ)Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld/k;",
        "Lsd/p<",
        "Lzd/d<",
        "-",
        "Ljava/util/List<",
        "+TT;>;>;",
        "Ljd/d<",
        "-",
        "Lgd/s;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lld/f;
    c = "kotlin.collections.SlidingWindowKt$windowedIterator$1"
    f = "SlidingWindow.kt"
    l = {
        0x22,
        0x28,
        0x31,
        0x37,
        0x3a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:I

.field public l:I

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic q:Z

.field public final synthetic r:Z


# direct methods
.method public constructor <init>(IILjava/util/Iterator;ZZLjd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Iterator<",
            "+TT;>;ZZ",
            "Ljd/d<",
            "-",
            "Lhd/i0$a;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lhd/i0$a;->n:I

    iput p2, p0, Lhd/i0$a;->o:I

    iput-object p3, p0, Lhd/i0$a;->p:Ljava/util/Iterator;

    iput-boolean p4, p0, Lhd/i0$a;->q:Z

    iput-boolean p5, p0, Lhd/i0$a;->r:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lld/k;-><init>(ILjd/d;)V

    return-void
.end method


# virtual methods
.method public final a(Lzd/d;Ljd/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzd/d<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lhd/i0$a;->create(Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p1

    check-cast p1, Lhd/i0$a;

    sget-object p2, Lgd/s;->a:Lgd/s;

    invoke-virtual {p1, p2}, Lhd/i0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Ljd/d;)Ljd/d;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljd/d<",
            "*>;)",
            "Ljd/d<",
            "Lgd/s;",
            ">;"
        }
    .end annotation

    new-instance v7, Lhd/i0$a;

    iget v1, p0, Lhd/i0$a;->n:I

    iget v2, p0, Lhd/i0$a;->o:I

    iget-object v3, p0, Lhd/i0$a;->p:Ljava/util/Iterator;

    iget-boolean v4, p0, Lhd/i0$a;->q:Z

    iget-boolean v5, p0, Lhd/i0$a;->r:Z

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lhd/i0$a;-><init>(IILjava/util/Iterator;ZZLjd/d;)V

    iput-object p1, v7, Lhd/i0$a;->m:Ljava/lang/Object;

    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzd/d;

    check-cast p2, Ljd/d;

    invoke-virtual {p0, p1, p2}, Lhd/i0$a;->a(Lzd/d;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lhd/i0$a;->l:I

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v1, :cond_5

    if-eq v1, v6, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lhd/i0$a;->i:Ljava/lang/Object;

    check-cast v1, Lhd/f0;

    iget-object v4, p0, Lhd/i0$a;->m:Ljava/lang/Object;

    check-cast v4, Lzd/d;

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    move-object p1, p0

    goto/16 :goto_9

    :cond_2
    iget-object v1, p0, Lhd/i0$a;->j:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    iget-object v5, p0, Lhd/i0$a;->i:Ljava/lang/Object;

    check-cast v5, Lhd/f0;

    iget-object v8, p0, Lhd/i0$a;->m:Ljava/lang/Object;

    check-cast v8, Lzd/d;

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    move-object p1, p0

    goto/16 :goto_6

    :cond_3
    :goto_0
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_4
    iget v1, p0, Lhd/i0$a;->k:I

    iget-object v2, p0, Lhd/i0$a;->j:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v3, p0, Lhd/i0$a;->i:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    iget-object v4, p0, Lhd/i0$a;->m:Ljava/lang/Object;

    check-cast v4, Lzd/d;

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    move-object p1, p0

    move v8, v1

    goto :goto_2

    :cond_5
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lhd/i0$a;->m:Ljava/lang/Object;

    check-cast p1, Lzd/d;

    iget v1, p0, Lhd/i0$a;->n:I

    const/16 v8, 0x400

    invoke-static {v1, v8}, Lxd/k;->c(II)I

    move-result v1

    iget v8, p0, Lhd/i0$a;->o:I

    iget v9, p0, Lhd/i0$a;->n:I

    sub-int/2addr v8, v9

    if-ltz v8, :cond_c

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    iget-object v3, p0, Lhd/i0$a;->p:Ljava/util/Iterator;

    move-object v4, p1

    move-object p1, p0

    move-object v11, v3

    move-object v3, v2

    move-object v2, v11

    :cond_6
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    if-lez v1, :cond_7

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_7
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v9

    iget v10, p1, Lhd/i0$a;->n:I

    if-ne v9, v10, :cond_6

    iput-object v4, p1, Lhd/i0$a;->m:Ljava/lang/Object;

    iput-object v3, p1, Lhd/i0$a;->i:Ljava/lang/Object;

    iput-object v2, p1, Lhd/i0$a;->j:Ljava/lang/Object;

    iput v8, p1, Lhd/i0$a;->k:I

    iput v6, p1, Lhd/i0$a;->l:I

    invoke-virtual {v4, v3, p1}, Lzd/d;->a(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_2
    iget-boolean v1, p1, Lhd/i0$a;->q:Z

    if-eqz v1, :cond_9

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    goto :goto_3

    :cond_9
    new-instance v1, Ljava/util/ArrayList;

    iget v3, p1, Lhd/i0$a;->n:I

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    move-object v3, v1

    :goto_3
    move v1, v8

    goto :goto_1

    :cond_a
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v6

    if-eqz v1, :cond_15

    iget-boolean v1, p1, Lhd/i0$a;->r:Z

    if-nez v1, :cond_b

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget v2, p1, Lhd/i0$a;->n:I

    if-ne v1, v2, :cond_15

    :cond_b
    iput-object v7, p1, Lhd/i0$a;->m:Ljava/lang/Object;

    iput-object v7, p1, Lhd/i0$a;->i:Ljava/lang/Object;

    iput-object v7, p1, Lhd/i0$a;->j:Ljava/lang/Object;

    iput v5, p1, Lhd/i0$a;->l:I

    invoke-virtual {v4, v3, p1}, Lzd/d;->a(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_15

    return-object v0

    :cond_c
    new-instance v5, Lhd/f0;

    invoke-direct {v5, v1}, Lhd/f0;-><init>(I)V

    iget-object v1, p0, Lhd/i0$a;->p:Ljava/util/Iterator;

    move-object v8, p1

    move-object p1, p0

    :cond_d
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v5, v9}, Lhd/f0;->e(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lhd/f0;->j()Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-virtual {v5}, Lhd/a;->size()I

    move-result v9

    iget v10, p1, Lhd/i0$a;->n:I

    if-ge v9, v10, :cond_e

    invoke-virtual {v5, v10}, Lhd/f0;->h(I)Lhd/f0;

    move-result-object v5

    goto :goto_4

    :cond_e
    iget-boolean v9, p1, Lhd/i0$a;->q:Z

    if-eqz v9, :cond_f

    move-object v9, v5

    goto :goto_5

    :cond_f
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_5
    iput-object v8, p1, Lhd/i0$a;->m:Ljava/lang/Object;

    iput-object v5, p1, Lhd/i0$a;->i:Ljava/lang/Object;

    iput-object v1, p1, Lhd/i0$a;->j:Ljava/lang/Object;

    iput v4, p1, Lhd/i0$a;->l:I

    invoke-virtual {v8, v9, p1}, Lzd/d;->a(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v0, :cond_10

    return-object v0

    :cond_10
    :goto_6
    iget v9, p1, Lhd/i0$a;->o:I

    invoke-virtual {v5, v9}, Lhd/f0;->k(I)V

    goto :goto_4

    :cond_11
    iget-boolean v1, p1, Lhd/i0$a;->r:Z

    if-eqz v1, :cond_15

    move-object v1, v5

    move-object v4, v8

    :goto_7
    invoke-virtual {v1}, Lhd/a;->size()I

    move-result v5

    iget v8, p1, Lhd/i0$a;->o:I

    if-le v5, v8, :cond_14

    iget-boolean v5, p1, Lhd/i0$a;->q:Z

    if-eqz v5, :cond_12

    move-object v5, v1

    goto :goto_8

    :cond_12
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_8
    iput-object v4, p1, Lhd/i0$a;->m:Ljava/lang/Object;

    iput-object v1, p1, Lhd/i0$a;->i:Ljava/lang/Object;

    iput-object v7, p1, Lhd/i0$a;->j:Ljava/lang/Object;

    iput v3, p1, Lhd/i0$a;->l:I

    invoke-virtual {v4, v5, p1}, Lzd/d;->a(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_13

    return-object v0

    :cond_13
    :goto_9
    iget v5, p1, Lhd/i0$a;->o:I

    invoke-virtual {v1, v5}, Lhd/f0;->k(I)V

    goto :goto_7

    :cond_14
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v6

    if-eqz v3, :cond_15

    iput-object v7, p1, Lhd/i0$a;->m:Ljava/lang/Object;

    iput-object v7, p1, Lhd/i0$a;->i:Ljava/lang/Object;

    iput-object v7, p1, Lhd/i0$a;->j:Ljava/lang/Object;

    iput v2, p1, Lhd/i0$a;->l:I

    invoke-virtual {v4, v1, p1}, Lzd/d;->a(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_15

    return-object v0

    :cond_15
    :goto_a
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
