.class public final Lx4/g;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ly4/j;Ljava/lang/String;Ly4/i;I)Lo5/n;
    .locals 2

    new-instance v0, Lo5/n$b;

    invoke-direct {v0}, Lo5/n$b;-><init>()V

    invoke-virtual {p2, p1}, Ly4/i;->b(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo5/n$b;->i(Landroid/net/Uri;)Lo5/n$b;

    move-result-object p1

    iget-wide v0, p2, Ly4/i;->a:J

    invoke-virtual {p1, v0, v1}, Lo5/n$b;->h(J)Lo5/n$b;

    move-result-object p1

    iget-wide v0, p2, Ly4/i;->b:J

    invoke-virtual {p1, v0, v1}, Lo5/n$b;->g(J)Lo5/n$b;

    move-result-object p1

    invoke-static {p0, p2}, Lx4/g;->b(Ly4/j;Ly4/i;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lo5/n$b;->f(Ljava/lang/String;)Lo5/n$b;

    move-result-object p0

    invoke-virtual {p0, p3}, Lo5/n$b;->b(I)Lo5/n$b;

    move-result-object p0

    invoke-virtual {p0}, Lo5/n$b;->a()Lo5/n;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ly4/j;Ly4/i;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ly4/j;->k()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p0, Ly4/j;->c:Li7/u;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly4/b;

    iget-object p0, p0, Ly4/b;->a:Ljava/lang/String;

    invoke-virtual {p1, p0}, Ly4/i;->b(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
