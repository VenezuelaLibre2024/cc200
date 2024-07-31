.class public final Lu4/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu4/b0;


# instance fields
.field public final a:Lx3/p;

.field public b:Lx3/k;

.field public c:Lx3/l;


# direct methods
.method public constructor <init>(Lx3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/c;->a:Lx3/p;

    return-void
.end method


# virtual methods
.method public c(JJ)V
    .locals 1

    iget-object v0, p0, Lu4/c;->b:Lx3/k;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx3/k;

    invoke-interface {v0, p1, p2, p3, p4}, Lx3/k;->c(JJ)V

    return-void
.end method

.method public d(Lx3/y;)I
    .locals 2

    iget-object v0, p0, Lu4/c;->b:Lx3/k;

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx3/k;

    iget-object v1, p0, Lu4/c;->c:Lx3/l;

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx3/l;

    invoke-interface {v0, v1, p1}, Lx3/k;->g(Lx3/l;Lx3/y;)I

    move-result p1

    return p1
.end method

.method public e(Lo5/h;Landroid/net/Uri;Ljava/util/Map;JJLx3/m;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo5/h;",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;JJ",
            "Lx3/m;",
            ")V"
        }
    .end annotation

    new-instance v6, Lx3/e;

    move-object v0, v6

    move-object v1, p1

    move-wide v2, p4

    move-wide v4, p6

    invoke-direct/range {v0 .. v5}, Lx3/e;-><init>(Lo5/h;JJ)V

    iput-object v6, p0, Lu4/c;->c:Lx3/l;

    iget-object p1, p0, Lu4/c;->b:Lx3/k;

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lu4/c;->a:Lx3/p;

    invoke-interface {p1, p2, p3}, Lx3/p;->c(Landroid/net/Uri;Ljava/util/Map;)[Lx3/k;

    move-result-object p1

    array-length p3, p1

    const/4 p6, 0x0

    const/4 p7, 0x1

    if-ne p3, p7, :cond_1

    aget-object p1, p1, p6

    iput-object p1, p0, Lu4/c;->b:Lx3/k;

    goto :goto_4

    :cond_1
    array-length p3, p1

    move v0, p6

    :goto_0
    if-ge v0, p3, :cond_7

    aget-object v1, p1, v0

    :try_start_0
    invoke-interface {v1, v6}, Lx3/k;->h(Lx3/l;)Z

    move-result v2

    if-eqz v2, :cond_2

    iput-object v1, p0, Lu4/c;->b:Lx3/k;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p7}, Lp5/a;->f(Z)V

    invoke-interface {v6}, Lx3/l;->l()V

    goto :goto_3

    :cond_2
    iget-object v1, p0, Lu4/c;->b:Lx3/k;

    if-nez v1, :cond_6

    invoke-interface {v6}, Lx3/l;->getPosition()J

    move-result-wide v1

    cmp-long v1, v1, p4

    if-nez v1, :cond_5

    goto :goto_1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lu4/c;->b:Lx3/k;

    if-nez p2, :cond_3

    invoke-interface {v6}, Lx3/l;->getPosition()J

    move-result-wide p2

    cmp-long p2, p2, p4

    if-nez p2, :cond_4

    :cond_3
    move p6, p7

    :cond_4
    invoke-static {p6}, Lp5/a;->f(Z)V

    invoke-interface {v6}, Lx3/l;->l()V

    throw p1

    :catch_0
    iget-object v1, p0, Lu4/c;->b:Lx3/k;

    if-nez v1, :cond_6

    invoke-interface {v6}, Lx3/l;->getPosition()J

    move-result-wide v1

    cmp-long v1, v1, p4

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    move v1, p6

    goto :goto_2

    :cond_6
    :goto_1
    move v1, p7

    :goto_2
    invoke-static {v1}, Lp5/a;->f(Z)V

    invoke-interface {v6}, Lx3/l;->l()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_7
    :goto_3
    iget-object p3, p0, Lu4/c;->b:Lx3/k;

    if-eqz p3, :cond_8

    :goto_4
    iget-object p1, p0, Lu4/c;->b:Lx3/k;

    invoke-interface {p1, p8}, Lx3/k;->b(Lx3/m;)V

    return-void

    :cond_8
    new-instance p3, Lu4/v0;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "None of the available extractors ("

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lp5/n0;->M([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ") could read the stream."

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/net/Uri;

    invoke-direct {p3, p1, p2}, Lu4/v0;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    throw p3
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lu4/c;->c:Lx3/l;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lx3/l;->getPosition()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, -0x1

    :goto_0
    return-wide v0
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Lu4/c;->b:Lx3/k;

    instance-of v1, v0, Le4/f;

    if-eqz v1, :cond_0

    check-cast v0, Le4/f;

    invoke-virtual {v0}, Le4/f;->j()V

    :cond_0
    return-void
.end method

.method public release()V
    .locals 2

    iget-object v0, p0, Lu4/c;->b:Lx3/k;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lx3/k;->release()V

    iput-object v1, p0, Lu4/c;->b:Lx3/k;

    :cond_0
    iput-object v1, p0, Lu4/c;->c:Lx3/l;

    return-void
.end method
