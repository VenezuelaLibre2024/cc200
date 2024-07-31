.class public final Lxa/e;
.super Lxa/a;
.source ""


# static fields
.field public static final i:[I

.field public static final j:[I

.field public static final k:[I

.field public static final l:[I

.field public static final m:[I

.field public static final n:[I

.field public static final o:[[I


# instance fields
.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lxa/d;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lxa/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x5

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, Lxa/e;->i:[I

    const/4 v1, 0x4

    new-array v2, v1, [I

    fill-array-data v2, :array_1

    sput-object v2, Lxa/e;->j:[I

    new-array v2, v0, [I

    fill-array-data v2, :array_2

    sput-object v2, Lxa/e;->k:[I

    new-array v2, v1, [I

    fill-array-data v2, :array_3

    sput-object v2, Lxa/e;->l:[I

    new-array v2, v0, [I

    fill-array-data v2, :array_4

    sput-object v2, Lxa/e;->m:[I

    new-array v2, v1, [I

    fill-array-data v2, :array_5

    sput-object v2, Lxa/e;->n:[I

    const/16 v2, 0x9

    new-array v2, v2, [[I

    new-array v3, v1, [I

    fill-array-data v3, :array_6

    const/4 v4, 0x0

    aput-object v3, v2, v4

    new-array v3, v1, [I

    fill-array-data v3, :array_7

    const/4 v4, 0x1

    aput-object v3, v2, v4

    new-array v3, v1, [I

    fill-array-data v3, :array_8

    const/4 v4, 0x2

    aput-object v3, v2, v4

    new-array v3, v1, [I

    fill-array-data v3, :array_9

    const/4 v4, 0x3

    aput-object v3, v2, v4

    new-array v3, v1, [I

    fill-array-data v3, :array_a

    aput-object v3, v2, v1

    new-array v3, v1, [I

    fill-array-data v3, :array_b

    aput-object v3, v2, v0

    new-array v0, v1, [I

    fill-array-data v0, :array_c

    const/4 v3, 0x6

    aput-object v0, v2, v3

    new-array v0, v1, [I

    fill-array-data v0, :array_d

    const/4 v3, 0x7

    aput-object v0, v2, v3

    new-array v0, v1, [I

    fill-array-data v0, :array_e

    const/16 v1, 0x8

    aput-object v0, v2, v1

    sput-object v2, Lxa/e;->o:[[I

    return-void

    :array_0
    .array-data 4
        0x1
        0xa
        0x22
        0x46
        0x7e
    .end array-data

    :array_1
    .array-data 4
        0x4
        0x14
        0x30
        0x51
    .end array-data

    :array_2
    .array-data 4
        0x0
        0xa1
        0x3c1
        0x7df
        0xa9b
    .end array-data

    :array_3
    .array-data 4
        0x0
        0x150
        0x40c
        0x5ec
    .end array-data

    :array_4
    .array-data 4
        0x8
        0x6
        0x4
        0x3
        0x1
    .end array-data

    :array_5
    .array-data 4
        0x2
        0x4
        0x6
        0x8
    .end array-data

    :array_6
    .array-data 4
        0x3
        0x8
        0x2
        0x1
    .end array-data

    :array_7
    .array-data 4
        0x3
        0x5
        0x5
        0x1
    .end array-data

    :array_8
    .array-data 4
        0x3
        0x3
        0x7
        0x1
    .end array-data

    :array_9
    .array-data 4
        0x3
        0x1
        0x9
        0x1
    .end array-data

    :array_a
    .array-data 4
        0x2
        0x7
        0x4
        0x1
    .end array-data

    :array_b
    .array-data 4
        0x2
        0x5
        0x6
        0x1
    .end array-data

    :array_c
    .array-data 4
        0x2
        0x3
        0x8
        0x1
    .end array-data

    :array_d
    .array-data 4
        0x1
        0x5
        0x7
        0x1
    .end array-data

    :array_e
    .array-data 4
        0x1
        0x3
        0x9
        0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lxa/a;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxa/e;->g:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxa/e;->h:Ljava/util/List;

    return-void
.end method

.method public static r(Ljava/util/Collection;Lxa/d;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lxa/d;",
            ">;",
            "Lxa/d;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxa/d;

    invoke-virtual {v2}, Lxa/b;->b()I

    move-result v3

    invoke-virtual {p1}, Lxa/b;->b()I

    move-result v4

    if-ne v3, v4, :cond_1

    invoke-virtual {v2}, Lxa/d;->e()V

    const/4 v0, 0x1

    :cond_2
    if-nez v0, :cond_3

    invoke-interface {p0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method

.method public static t(Lxa/d;Lxa/d;)Z
    .locals 2

    invoke-virtual {p0}, Lxa/b;->a()I

    move-result v0

    invoke-virtual {p1}, Lxa/b;->a()I

    move-result v1

    mul-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    rem-int/lit8 v0, v0, 0x4f

    invoke-virtual {p0}, Lxa/d;->d()Lxa/c;

    move-result-object p0

    invoke-virtual {p0}, Lxa/c;->c()I

    move-result p0

    mul-int/lit8 p0, p0, 0x9

    invoke-virtual {p1}, Lxa/d;->d()Lxa/c;

    move-result-object p1

    invoke-virtual {p1}, Lxa/c;->c()I

    move-result p1

    add-int/2addr p0, p1

    const/16 p1, 0x48

    if-le p0, p1, :cond_0

    add-int/lit8 p0, p0, -0x1

    :cond_0
    const/16 p1, 0x8

    if-le p0, p1, :cond_1

    add-int/lit8 p0, p0, -0x1

    :cond_1
    if-ne v0, p0, :cond_2

    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static u(Lxa/d;Lxa/d;)Lia/n;
    .locals 8

    invoke-virtual {p0}, Lxa/b;->b()I

    move-result v0

    int-to-long v0, v0

    const-wide/32 v2, 0x453af5

    mul-long/2addr v0, v2

    invoke-virtual {p1}, Lxa/b;->b()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0xd

    rsub-int/lit8 v2, v2, 0xd

    :goto_0
    const/16 v4, 0x30

    if-lez v2, :cond_0

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    move v2, v0

    move v5, v2

    :goto_1
    if-ge v2, v3, :cond_2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v6

    sub-int/2addr v6, v4

    and-int/lit8 v7, v2, 0x1

    if-nez v7, :cond_1

    mul-int/lit8 v6, v6, 0x3

    :cond_1
    add-int/2addr v5, v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    const/16 v2, 0xa

    rem-int/2addr v5, v2

    rsub-int/lit8 v3, v5, 0xa

    if-ne v3, v2, :cond_3

    move v3, v0

    :cond_3
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lxa/d;->d()Lxa/c;

    move-result-object p0

    invoke-virtual {p0}, Lxa/c;->a()[Lia/p;

    move-result-object p0

    invoke-virtual {p1}, Lxa/d;->d()Lxa/c;

    move-result-object p1

    invoke-virtual {p1}, Lxa/c;->a()[Lia/p;

    move-result-object p1

    new-instance v2, Lia/n;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x4

    new-array v4, v4, [Lia/p;

    aget-object v5, p0, v0

    aput-object v5, v4, v0

    const/4 v5, 0x1

    aget-object p0, p0, v5

    aput-object p0, v4, v5

    const/4 p0, 0x2

    aget-object v0, p1, v0

    aput-object v0, v4, p0

    aget-object p0, p1, v5

    const/4 p1, 0x3

    aput-object p0, v4, p1

    sget-object p0, Lia/a;->t:Lia/a;

    invoke-direct {v2, v1, v3, v4, p0}, Lia/n;-><init>(Ljava/lang/String;[B[Lia/p;Lia/a;)V

    sget-object p0, Lia/o;->s:Lia/o;

    const-string p1, "]e0"

    invoke-virtual {v2, p0, p1}, Lia/n;->h(Lia/o;Ljava/lang/Object;)V

    return-object v2
.end method


# virtual methods
.method public c(ILoa/a;Ljava/util/Map;)Lia/n;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Loa/a;",
            "Ljava/util/Map<",
            "Lia/e;",
            "*>;)",
            "Lia/n;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0, p1, p3}, Lxa/e;->w(Loa/a;ZILjava/util/Map;)Lxa/d;

    move-result-object v0

    iget-object v1, p0, Lxa/e;->g:Ljava/util/List;

    invoke-static {v1, v0}, Lxa/e;->r(Ljava/util/Collection;Lxa/d;)V

    invoke-virtual {p2}, Loa/a;->m()V

    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0, p1, p3}, Lxa/e;->w(Loa/a;ZILjava/util/Map;)Lxa/d;

    move-result-object p1

    iget-object p3, p0, Lxa/e;->h:Ljava/util/List;

    invoke-static {p3, p1}, Lxa/e;->r(Ljava/util/Collection;Lxa/d;)V

    invoke-virtual {p2}, Loa/a;->m()V

    iget-object p1, p0, Lxa/e;->g:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lxa/d;

    invoke-virtual {p2}, Lxa/d;->c()I

    move-result p3

    if-le p3, v0, :cond_0

    iget-object p3, p0, Lxa/e;->h:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxa/d;

    invoke-virtual {v1}, Lxa/d;->c()I

    move-result v2

    if-le v2, v0, :cond_1

    invoke-static {p2, v1}, Lxa/e;->t(Lxa/d;Lxa/d;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p2, v1}, Lxa/e;->u(Lxa/d;Lxa/d;)Lia/n;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {}, Lia/j;->a()Lia/j;

    move-result-object p1

    throw p1
.end method

.method public reset()V
    .locals 1

    iget-object v0, p0, Lxa/e;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lxa/e;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final s(ZI)V
    .locals 9

    invoke-virtual {p0}, Lxa/a;->m()[I

    move-result-object v0

    invoke-static {v0}, Lpa/a;->d([I)I

    move-result v0

    invoke-virtual {p0}, Lxa/a;->k()[I

    move-result-object v1

    invoke-static {v1}, Lpa/a;->d([I)I

    move-result v1

    const/4 v2, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz p1, :cond_3

    const/16 v5, 0xc

    if-le v0, v5, :cond_0

    move v6, v3

    move v7, v4

    goto :goto_0

    :cond_0
    if-ge v0, v2, :cond_1

    move v7, v3

    move v6, v4

    goto :goto_0

    :cond_1
    move v6, v3

    move v7, v6

    :goto_0
    if-le v1, v5, :cond_2

    goto :goto_2

    :cond_2
    if-ge v1, v2, :cond_7

    goto :goto_3

    :cond_3
    const/16 v5, 0xb

    if-le v0, v5, :cond_4

    move v6, v3

    move v7, v4

    goto :goto_1

    :cond_4
    const/4 v5, 0x5

    if-ge v0, v5, :cond_5

    move v7, v3

    move v6, v4

    goto :goto_1

    :cond_5
    move v6, v3

    move v7, v6

    :goto_1
    const/16 v5, 0xa

    if-le v1, v5, :cond_6

    :goto_2
    move v2, v3

    move v5, v4

    goto :goto_4

    :cond_6
    if-ge v1, v2, :cond_7

    :goto_3
    move v5, v3

    move v2, v4

    goto :goto_4

    :cond_7
    move v2, v3

    move v5, v2

    :goto_4
    add-int v8, v0, v1

    sub-int/2addr v8, p2

    and-int/lit8 p2, v0, 0x1

    if-ne p2, p1, :cond_8

    move p1, v4

    goto :goto_5

    :cond_8
    move p1, v3

    :goto_5
    and-int/lit8 p2, v1, 0x1

    if-ne p2, v4, :cond_9

    move v3, v4

    :cond_9
    const/4 p2, -0x1

    if-eq v8, p2, :cond_13

    if-eqz v8, :cond_e

    if-ne v8, v4, :cond_d

    if-eqz p1, :cond_b

    if-nez v3, :cond_a

    move v7, v4

    goto :goto_6

    :cond_a
    invoke-static {}, Lia/j;->a()Lia/j;

    move-result-object p1

    throw p1

    :cond_b
    if-eqz v3, :cond_c

    move v5, v4

    goto :goto_6

    :cond_c
    invoke-static {}, Lia/j;->a()Lia/j;

    move-result-object p1

    throw p1

    :cond_d
    invoke-static {}, Lia/j;->a()Lia/j;

    move-result-object p1

    throw p1

    :cond_e
    if-eqz p1, :cond_11

    if-eqz v3, :cond_10

    if-ge v0, v1, :cond_f

    move v5, v4

    goto :goto_7

    :cond_f
    move v2, v4

    move v7, v2

    goto :goto_6

    :cond_10
    invoke-static {}, Lia/j;->a()Lia/j;

    move-result-object p1

    throw p1

    :cond_11
    if-nez v3, :cond_12

    :goto_6
    move v4, v6

    goto :goto_7

    :cond_12
    invoke-static {}, Lia/j;->a()Lia/j;

    move-result-object p1

    throw p1

    :cond_13
    if-eqz p1, :cond_15

    if-nez v3, :cond_14

    goto :goto_7

    :cond_14
    invoke-static {}, Lia/j;->a()Lia/j;

    move-result-object p1

    throw p1

    :cond_15
    if-eqz v3, :cond_1c

    move v2, v4

    goto :goto_6

    :goto_7
    if-eqz v4, :cond_17

    if-nez v7, :cond_16

    invoke-virtual {p0}, Lxa/a;->m()[I

    move-result-object p1

    invoke-virtual {p0}, Lxa/a;->n()[F

    move-result-object p2

    invoke-static {p1, p2}, Lxa/a;->o([I[F)V

    goto :goto_8

    :cond_16
    invoke-static {}, Lia/j;->a()Lia/j;

    move-result-object p1

    throw p1

    :cond_17
    :goto_8
    if-eqz v7, :cond_18

    invoke-virtual {p0}, Lxa/a;->m()[I

    move-result-object p1

    invoke-virtual {p0}, Lxa/a;->n()[F

    move-result-object p2

    invoke-static {p1, p2}, Lxa/a;->h([I[F)V

    :cond_18
    if-eqz v2, :cond_1a

    if-nez v5, :cond_19

    invoke-virtual {p0}, Lxa/a;->k()[I

    move-result-object p1

    invoke-virtual {p0}, Lxa/a;->n()[F

    move-result-object p2

    invoke-static {p1, p2}, Lxa/a;->o([I[F)V

    goto :goto_9

    :cond_19
    invoke-static {}, Lia/j;->a()Lia/j;

    move-result-object p1

    throw p1

    :cond_1a
    :goto_9
    if-eqz v5, :cond_1b

    invoke-virtual {p0}, Lxa/a;->k()[I

    move-result-object p1

    invoke-virtual {p0}, Lxa/a;->l()[F

    move-result-object p2

    invoke-static {p1, p2}, Lxa/a;->h([I[F)V

    :cond_1b
    return-void

    :cond_1c
    invoke-static {}, Lia/j;->a()Lia/j;

    move-result-object p1

    throw p1
.end method

.method public final v(Loa/a;Lxa/c;Z)Lxa/b;
    .locals 12

    invoke-virtual {p0}, Lxa/a;->i()[I

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    const/4 v2, 0x1

    invoke-virtual {p2}, Lxa/c;->b()[I

    move-result-object p2

    if-eqz p3, :cond_0

    aget p2, p2, v1

    invoke-static {p1, p2, v0}, Lwa/k;->g(Loa/a;I[I)V

    goto :goto_1

    :cond_0
    aget p2, p2, v2

    invoke-static {p1, p2, v0}, Lwa/k;->f(Loa/a;I[I)V

    array-length p1, v0

    sub-int/2addr p1, v2

    move p2, v1

    :goto_0
    if-ge p2, p1, :cond_1

    aget v3, v0, p2

    aget v4, v0, p1

    aput v4, v0, p2

    aput v3, v0, p1

    add-int/lit8 p2, p2, 0x1

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz p3, :cond_2

    const/16 p1, 0x10

    goto :goto_2

    :cond_2
    const/16 p1, 0xf

    :goto_2
    invoke-static {v0}, Lpa/a;->d([I)I

    move-result p2

    int-to-float p2, p2

    int-to-float v3, p1

    div-float/2addr p2, v3

    invoke-virtual {p0}, Lxa/a;->m()[I

    move-result-object v3

    invoke-virtual {p0}, Lxa/a;->k()[I

    move-result-object v4

    invoke-virtual {p0}, Lxa/a;->n()[F

    move-result-object v5

    invoke-virtual {p0}, Lxa/a;->l()[F

    move-result-object v6

    move v7, v1

    :goto_3
    array-length v8, v0

    if-ge v7, v8, :cond_6

    aget v8, v0, v7

    int-to-float v8, v8

    div-float/2addr v8, p2

    const/high16 v9, 0x3f000000    # 0.5f

    add-float/2addr v9, v8

    float-to-int v9, v9

    const/16 v10, 0x8

    if-ge v9, v2, :cond_3

    move v9, v2

    goto :goto_4

    :cond_3
    if-le v9, v10, :cond_4

    move v9, v10

    :cond_4
    :goto_4
    div-int/lit8 v10, v7, 0x2

    and-int/lit8 v11, v7, 0x1

    if-nez v11, :cond_5

    aput v9, v3, v10

    int-to-float v9, v9

    sub-float/2addr v8, v9

    aput v8, v5, v10

    goto :goto_5

    :cond_5
    aput v9, v4, v10

    int-to-float v9, v9

    sub-float/2addr v8, v9

    aput v8, v6, v10

    :goto_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_6
    invoke-virtual {p0, p3, p1}, Lxa/e;->s(ZI)V

    array-length p1, v3

    sub-int/2addr p1, v2

    move p2, v1

    move v0, p2

    :goto_6
    if-ltz p1, :cond_7

    mul-int/lit8 p2, p2, 0x9

    aget v5, v3, p1

    add-int/2addr p2, v5

    aget v5, v3, p1

    add-int/2addr v0, v5

    add-int/lit8 p1, p1, -0x1

    goto :goto_6

    :cond_7
    array-length p1, v4

    sub-int/2addr p1, v2

    move v5, v1

    move v6, v5

    :goto_7
    if-ltz p1, :cond_8

    mul-int/lit8 v5, v5, 0x9

    aget v7, v4, p1

    add-int/2addr v5, v7

    aget v7, v4, p1

    add-int/2addr v6, v7

    add-int/lit8 p1, p1, -0x1

    goto :goto_7

    :cond_8
    mul-int/lit8 v5, v5, 0x3

    add-int/2addr p2, v5

    const/4 p1, 0x4

    if-eqz p3, :cond_a

    and-int/lit8 p3, v0, 0x1

    if-nez p3, :cond_9

    const/16 p3, 0xc

    if-gt v0, p3, :cond_9

    if-lt v0, p1, :cond_9

    sub-int/2addr p3, v0

    div-int/lit8 p3, p3, 0x2

    sget-object p1, Lxa/e;->m:[I

    aget p1, p1, p3

    rsub-int/lit8 v0, p1, 0x9

    invoke-static {v3, p1, v1}, Lxa/f;->b([IIZ)I

    move-result p1

    invoke-static {v4, v0, v2}, Lxa/f;->b([IIZ)I

    move-result v0

    sget-object v1, Lxa/e;->i:[I

    aget v1, v1, p3

    sget-object v2, Lxa/e;->k:[I

    aget p3, v2, p3

    new-instance v2, Lxa/b;

    mul-int/2addr p1, v1

    add-int/2addr p1, v0

    add-int/2addr p1, p3

    invoke-direct {v2, p1, p2}, Lxa/b;-><init>(II)V

    return-object v2

    :cond_9
    invoke-static {}, Lia/j;->a()Lia/j;

    move-result-object p1

    throw p1

    :cond_a
    and-int/lit8 p3, v6, 0x1

    if-nez p3, :cond_b

    const/16 p3, 0xa

    if-gt v6, p3, :cond_b

    if-lt v6, p1, :cond_b

    sub-int/2addr p3, v6

    div-int/lit8 p3, p3, 0x2

    sget-object p1, Lxa/e;->n:[I

    aget p1, p1, p3

    rsub-int/lit8 v0, p1, 0x9

    invoke-static {v3, p1, v2}, Lxa/f;->b([IIZ)I

    move-result p1

    invoke-static {v4, v0, v1}, Lxa/f;->b([IIZ)I

    move-result v0

    sget-object v1, Lxa/e;->j:[I

    aget v1, v1, p3

    sget-object v2, Lxa/e;->l:[I

    aget p3, v2, p3

    new-instance v2, Lxa/b;

    mul-int/2addr v0, v1

    add-int/2addr v0, p1

    add-int/2addr v0, p3

    invoke-direct {v2, v0, p2}, Lxa/b;-><init>(II)V

    return-object v2

    :cond_b
    invoke-static {}, Lia/j;->a()Lia/j;

    move-result-object p1

    throw p1
.end method

.method public final w(Loa/a;ZILjava/util/Map;)Lxa/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loa/a;",
            "ZI",
            "Ljava/util/Map<",
            "Lia/e;",
            "*>;)",
            "Lxa/d;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lxa/e;->x(Loa/a;Z)[I

    move-result-object v1

    invoke-virtual {p0, p1, p3, p2, v1}, Lxa/e;->y(Loa/a;IZ[I)Lxa/c;

    move-result-object v1

    if-nez p4, :cond_0

    move-object p4, v0

    goto :goto_0

    :cond_0
    sget-object v2, Lia/e;->r:Lia/e;

    invoke-interface {p4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lia/q;

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p4, :cond_2

    invoke-virtual {v1}, Lxa/c;->b()[I

    move-result-object v4

    aget v5, v4, v2

    aget v4, v4, v3

    add-int/2addr v5, v4

    sub-int/2addr v5, v3

    int-to-float v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Loa/a;->i()I

    move-result p2

    sub-int/2addr p2, v3

    int-to-float p2, p2

    sub-float v4, p2, v4

    :cond_1
    new-instance p2, Lia/p;

    int-to-float p3, p3

    invoke-direct {p2, v4, p3}, Lia/p;-><init>(FF)V

    invoke-interface {p4, p2}, Lia/q;->a(Lia/p;)V

    :cond_2
    invoke-virtual {p0, p1, v1, v3}, Lxa/e;->v(Loa/a;Lxa/c;Z)Lxa/b;

    move-result-object p2

    invoke-virtual {p0, p1, v1, v2}, Lxa/e;->v(Loa/a;Lxa/c;Z)Lxa/b;

    move-result-object p1

    new-instance p3, Lxa/d;

    invoke-virtual {p2}, Lxa/b;->b()I

    move-result p4

    mul-int/lit16 p4, p4, 0x63d

    invoke-virtual {p1}, Lxa/b;->b()I

    move-result v2

    add-int/2addr p4, v2

    invoke-virtual {p2}, Lxa/b;->a()I

    move-result p2

    invoke-virtual {p1}, Lxa/b;->a()I

    move-result p1

    mul-int/lit8 p1, p1, 0x4

    add-int/2addr p2, p1

    invoke-direct {p3, p4, p2, v1}, Lxa/d;-><init>(IILxa/c;)V
    :try_end_0
    .catch Lia/j; {:try_start_0 .. :try_end_0} :catch_0

    return-object p3

    :catch_0
    return-object v0
.end method

.method public final x(Loa/a;Z)[I
    .locals 11

    invoke-virtual {p0}, Lxa/a;->j()[I

    move-result-object v0

    const/4 v1, 0x0

    aput v1, v0, v1

    const/4 v2, 0x1

    aput v1, v0, v2

    const/4 v3, 0x2

    aput v1, v0, v3

    const/4 v4, 0x3

    aput v1, v0, v4

    invoke-virtual {p1}, Loa/a;->i()I

    move-result v5

    move v6, v1

    move v7, v6

    :goto_0
    if-ge v6, v5, :cond_1

    invoke-virtual {p1, v6}, Loa/a;->e(I)Z

    move-result v7

    xor-int/2addr v7, v2

    if-ne p2, v7, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    move v8, v1

    move p2, v6

    :goto_2
    if-ge v6, v5, :cond_5

    invoke-virtual {p1, v6}, Loa/a;->e(I)Z

    move-result v9

    if-eq v9, v7, :cond_2

    aget v9, v0, v8

    add-int/2addr v9, v2

    aput v9, v0, v8

    goto :goto_4

    :cond_2
    if-ne v8, v4, :cond_4

    invoke-static {v0}, Lxa/a;->p([I)Z

    move-result v9

    if-eqz v9, :cond_3

    new-array p1, v3, [I

    aput p2, p1, v1

    aput v6, p1, v2

    return-object p1

    :cond_3
    aget v9, v0, v1

    aget v10, v0, v2

    add-int/2addr v9, v10

    add-int/2addr p2, v9

    aget v9, v0, v3

    aput v9, v0, v1

    aget v9, v0, v4

    aput v9, v0, v2

    aput v1, v0, v3

    aput v1, v0, v4

    add-int/lit8 v8, v8, -0x1

    goto :goto_3

    :cond_4
    add-int/lit8 v8, v8, 0x1

    :goto_3
    aput v2, v0, v8

    xor-int/lit8 v7, v7, 0x1

    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_5
    invoke-static {}, Lia/j;->a()Lia/j;

    move-result-object p1

    throw p1
.end method

.method public final y(Loa/a;IZ[I)Lxa/c;
    .locals 11

    const/4 v0, 0x0

    aget v1, p4, v0

    invoke-virtual {p1, v1}, Loa/a;->e(I)Z

    move-result v1

    aget v2, p4, v0

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    :goto_0
    if-ltz v2, :cond_0

    invoke-virtual {p1, v2}, Loa/a;->e(I)Z

    move-result v4

    if-eq v1, v4, :cond_0

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    add-int/2addr v2, v3

    aget v1, p4, v0

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Lxa/a;->j()[I

    move-result-object v4

    array-length v5, v4

    sub-int/2addr v5, v3

    invoke-static {v4, v0, v4, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput v1, v4, v0

    sget-object v1, Lxa/e;->o:[[I

    invoke-static {v4, v1}, Lxa/a;->q([I[[I)I

    move-result v6

    aget v1, p4, v3

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Loa/a;->i()I

    move-result p3

    sub-int/2addr p3, v3

    sub-int/2addr p3, v2

    invoke-virtual {p1}, Loa/a;->i()I

    move-result p1

    sub-int/2addr p1, v3

    sub-int/2addr p1, v1

    move v9, p1

    move v8, p3

    goto :goto_1

    :cond_1
    move v9, v1

    move v8, v2

    :goto_1
    new-instance p1, Lxa/c;

    const/4 p3, 0x2

    new-array v7, p3, [I

    aput v2, v7, v0

    aget p3, p4, v3

    aput p3, v7, v3

    move-object v5, p1

    move v10, p2

    invoke-direct/range {v5 .. v10}, Lxa/c;-><init>(I[IIII)V

    return-object p1
.end method
