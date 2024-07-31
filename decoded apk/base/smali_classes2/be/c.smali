.class public final Lbe/c;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final synthetic a(JI)J
    .locals 0

    invoke-static {p0, p1, p2}, Lbe/c;->d(JI)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic b(J)J
    .locals 0

    invoke-static {p0, p1}, Lbe/c;->e(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic c(J)J
    .locals 0

    invoke-static {p0, p1}, Lbe/c;->g(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final d(JI)J
    .locals 2

    const/4 v0, 0x1

    shl-long/2addr p0, v0

    int-to-long v0, p2

    add-long/2addr p0, v0

    invoke-static {p0, p1}, Lbe/a;->i(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final e(J)J
    .locals 2

    const/4 v0, 0x1

    shl-long/2addr p0, v0

    const-wide/16 v0, 0x1

    add-long/2addr p0, v0

    invoke-static {p0, p1}, Lbe/a;->i(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final f(J)J
    .locals 1

    const/4 v0, 0x1

    shl-long/2addr p0, v0

    invoke-static {p0, p1}, Lbe/a;->i(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final g(J)J
    .locals 2

    const v0, 0xf4240

    int-to-long v0, v0

    mul-long/2addr p0, v0

    return-wide p0
.end method

.method public static final h(ILbe/d;)J
    .locals 2

    const-string v0, "unit"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbe/d;->l:Lbe/d;

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gtz v0, :cond_0

    int-to-long v0, p0

    sget-object p0, Lbe/d;->i:Lbe/d;

    invoke-static {v0, v1, p1, p0}, Lbe/e;->b(JLbe/d;Lbe/d;)J

    move-result-wide p0

    invoke-static {p0, p1}, Lbe/c;->f(J)J

    move-result-wide p0

    goto :goto_0

    :cond_0
    int-to-long v0, p0

    invoke-static {v0, v1, p1}, Lbe/c;->i(JLbe/d;)J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method

.method public static final i(JLbe/d;)J
    .locals 7

    const-string v0, "unit"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbe/d;->i:Lbe/d;

    const-wide v1, 0x3ffffffffffa14bfL    # 1.9999999999138678

    invoke-static {v1, v2, v0, p2}, Lbe/e;->b(JLbe/d;Lbe/d;)J

    move-result-wide v1

    new-instance v3, Lxd/i;

    neg-long v4, v1

    invoke-direct {v3, v4, v5, v1, v2}, Lxd/i;-><init>(JJ)V

    invoke-virtual {v3, p0, p1}, Lxd/i;->d(J)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, p1, p2, v0}, Lbe/e;->b(JLbe/d;Lbe/d;)J

    move-result-wide p0

    invoke-static {p0, p1}, Lbe/c;->f(J)J

    move-result-wide p0

    return-wide p0

    :cond_0
    sget-object v0, Lbe/d;->k:Lbe/d;

    invoke-static {p0, p1, p2, v0}, Lbe/e;->a(JLbe/d;Lbe/d;)J

    move-result-wide v1

    const-wide v3, -0x3fffffffffffffffL    # -2.0000000000000004

    const-wide v5, 0x3fffffffffffffffL    # 1.9999999999999998

    invoke-static/range {v1 .. v6}, Lxd/k;->f(JJJ)J

    move-result-wide p0

    invoke-static {p0, p1}, Lbe/c;->e(J)J

    move-result-wide p0

    return-wide p0
.end method
