.class public final Lja/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lia/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lia/c;)Lia/n;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lja/b;->b(Lia/c;Ljava/util/Map;)Lia/n;

    move-result-object p1

    return-object p1
.end method

.method public b(Lia/c;Ljava/util/Map;)Lia/n;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lia/c;",
            "Ljava/util/Map<",
            "Lia/e;",
            "*>;)",
            "Lia/n;"
        }
    .end annotation

    new-instance v0, Lla/a;

    invoke-virtual {p1}, Lia/c;->a()Loa/b;

    move-result-object p1

    invoke-direct {v0, p1}, Lla/a;-><init>(Loa/b;)V

    const/4 p1, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, p1}, Lla/a;->a(Z)Lja/a;

    move-result-object v2

    invoke-virtual {v2}, Loa/g;->b()[Lia/p;

    move-result-object v3
    :try_end_0
    .catch Lia/j; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lia/f; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    new-instance v4, Lka/a;

    invoke-direct {v4}, Lka/a;-><init>()V

    invoke-virtual {v4, v2}, Lka/a;->c(Lja/a;)Loa/e;

    move-result-object v2
    :try_end_1
    .catch Lia/j; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lia/f; {:try_start_1 .. :try_end_1} :catch_0

    move-object v4, v3

    move-object v3, v1

    move-object v1, v2

    move-object v2, v3

    goto :goto_2

    :catch_0
    move-exception v2

    goto :goto_0

    :catch_1
    move-exception v2

    goto :goto_1

    :catch_2
    move-exception v2

    move-object v3, v1

    :goto_0
    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    goto :goto_2

    :catch_3
    move-exception v2

    move-object v3, v1

    :goto_1
    move-object v4, v3

    move-object v3, v1

    :goto_2
    if-nez v1, :cond_2

    const/4 v1, 0x1

    :try_start_2
    invoke-virtual {v0, v1}, Lla/a;->a(Z)Lja/a;

    move-result-object v0

    invoke-virtual {v0}, Loa/g;->b()[Lia/p;

    move-result-object v4

    new-instance v1, Lka/a;

    invoke-direct {v1}, Lka/a;-><init>()V

    invoke-virtual {v1, v0}, Lka/a;->c(Lja/a;)Loa/e;

    move-result-object v1
    :try_end_2
    .catch Lia/j; {:try_start_2 .. :try_end_2} :catch_5
    .catch Lia/f; {:try_start_2 .. :try_end_2} :catch_4

    goto :goto_4

    :catch_4
    move-exception p1

    goto :goto_3

    :catch_5
    move-exception p1

    :goto_3
    if-nez v2, :cond_1

    if-eqz v3, :cond_0

    throw v3

    :cond_0
    throw p1

    :cond_1
    throw v2

    :cond_2
    :goto_4
    move-object v6, v4

    if-eqz p2, :cond_3

    sget-object v0, Lia/e;->r:Lia/e;

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lia/q;

    if-eqz p2, :cond_3

    array-length v0, v6

    :goto_5
    if-ge p1, v0, :cond_3

    aget-object v2, v6, p1

    invoke-interface {p2, v2}, Lia/q;->a(Lia/p;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_5

    :cond_3
    new-instance p1, Lia/n;

    invoke-virtual {v1}, Loa/e;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Loa/e;->e()[B

    move-result-object v4

    invoke-virtual {v1}, Loa/e;->c()I

    move-result v5

    sget-object v7, Lia/a;->h:Lia/a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, Lia/n;-><init>(Ljava/lang/String;[BI[Lia/p;Lia/a;J)V

    invoke-virtual {v1}, Loa/e;->a()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_4

    sget-object v0, Lia/o;->j:Lia/o;

    invoke-virtual {p1, v0, p2}, Lia/n;->h(Lia/o;Ljava/lang/Object;)V

    :cond_4
    invoke-virtual {v1}, Loa/e;->b()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_5

    sget-object v0, Lia/o;->k:Lia/o;

    invoke-virtual {p1, v0, p2}, Lia/n;->h(Lia/o;Ljava/lang/Object;)V

    :cond_5
    sget-object p2, Lia/o;->s:Lia/o;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "]z"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Loa/e;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lia/n;->h(Lia/o;Ljava/lang/Object;)V

    return-object p1
.end method

.method public reset()V
    .locals 0

    return-void
.end method
