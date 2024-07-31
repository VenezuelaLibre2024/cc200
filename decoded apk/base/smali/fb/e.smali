.class public final Lfb/e;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lqa/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lqa/c;

    sget-object v1, Lqa/a;->l:Lqa/a;

    invoke-direct {v0, v1}, Lqa/c;-><init>(Lqa/a;)V

    iput-object v0, p0, Lfb/e;->a:Lqa/c;

    return-void
.end method


# virtual methods
.method public final a([BI)V
    .locals 5

    array-length v0, p1

    new-array v1, v0, [I

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    aget-byte v4, p1, v3

    and-int/lit16 v4, v4, 0xff

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lfb/e;->a:Lqa/c;

    array-length v3, p1

    sub-int/2addr v3, p2

    invoke-virtual {v0, v1, v3}, Lqa/c;->a([II)V
    :try_end_0
    .catch Lqa/d; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    if-ge v2, p2, :cond_1

    aget v0, v1, v2

    int-to-byte v0, v0

    aput-byte v0, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    :catch_0
    invoke-static {}, Lia/d;->a()Lia/d;

    move-result-object p1

    throw p1
.end method

.method public final b(Lfb/a;Ljava/util/Map;)Loa/e;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfb/a;",
            "Ljava/util/Map<",
            "Lia/e;",
            "*>;)",
            "Loa/e;"
        }
    .end annotation

    invoke-virtual {p1}, Lfb/a;->e()Lfb/j;

    move-result-object v0

    invoke-virtual {p1}, Lfb/a;->d()Lfb/g;

    move-result-object v1

    invoke-virtual {v1}, Lfb/g;->d()Lfb/f;

    move-result-object v1

    invoke-virtual {p1}, Lfb/a;->c()[B

    move-result-object p1

    invoke-static {p1, v0, v1}, Lfb/b;->b([BLfb/j;Lfb/f;)[Lfb/b;

    move-result-object p1

    array-length v2, p1

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v6, p1, v4

    invoke-virtual {v6}, Lfb/b;->c()I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-array v2, v5, [B

    array-length v4, p1

    move v5, v3

    move v6, v5

    :goto_1
    if-ge v5, v4, :cond_2

    aget-object v7, p1, v5

    invoke-virtual {v7}, Lfb/b;->a()[B

    move-result-object v8

    invoke-virtual {v7}, Lfb/b;->c()I

    move-result v7

    invoke-virtual {p0, v8, v7}, Lfb/e;->a([BI)V

    move v9, v3

    :goto_2
    if-ge v9, v7, :cond_1

    add-int/lit8 v10, v6, 0x1

    aget-byte v11, v8, v9

    aput-byte v11, v2, v6

    add-int/lit8 v9, v9, 0x1

    move v6, v10

    goto :goto_2

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    invoke-static {v2, v0, v1, p2}, Lfb/d;->a([BLfb/j;Lfb/f;Ljava/util/Map;)Loa/e;

    move-result-object p1

    return-object p1
.end method

.method public c(Loa/b;Ljava/util/Map;)Loa/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loa/b;",
            "Ljava/util/Map<",
            "Lia/e;",
            "*>;)",
            "Loa/e;"
        }
    .end annotation

    new-instance v0, Lfb/a;

    invoke-direct {v0, p1}, Lfb/a;-><init>(Loa/b;)V

    const/4 p1, 0x0

    :try_start_0
    invoke-virtual {p0, v0, p2}, Lfb/e;->b(Lfb/a;Ljava/util/Map;)Loa/e;

    move-result-object p1
    :try_end_0
    .catch Lia/f; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lia/d; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    move-object v3, v1

    move-object v1, p1

    move-object p1, v3

    :goto_0
    :try_start_1
    invoke-virtual {v0}, Lfb/a;->f()V

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lfb/a;->g(Z)V

    invoke-virtual {v0}, Lfb/a;->e()Lfb/j;

    invoke-virtual {v0}, Lfb/a;->d()Lfb/g;

    invoke-virtual {v0}, Lfb/a;->b()V

    invoke-virtual {p0, v0, p2}, Lfb/e;->b(Lfb/a;Ljava/util/Map;)Loa/e;

    move-result-object p2

    new-instance v0, Lfb/i;

    invoke-direct {v0, v2}, Lfb/i;-><init>(Z)V

    invoke-virtual {p2, v0}, Loa/e;->n(Ljava/lang/Object;)V
    :try_end_1
    .catch Lia/f; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lia/d; {:try_start_1 .. :try_end_1} :catch_2

    return-object p2

    :catch_2
    if-eqz p1, :cond_0

    throw p1

    :cond_0
    throw v1
.end method
