.class public Lbe/e;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(JLbe/d;Lbe/d;)J
    .locals 1

    const-string v0, "sourceUnit"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetUnit"

    invoke-static {p3, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Lbe/d;->c()Ljava/util/concurrent/TimeUnit;

    move-result-object p3

    invoke-virtual {p2}, Lbe/d;->c()Ljava/util/concurrent/TimeUnit;

    move-result-object p2

    invoke-virtual {p3, p0, p1, p2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final b(JLbe/d;Lbe/d;)J
    .locals 1

    const-string v0, "sourceUnit"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetUnit"

    invoke-static {p3, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Lbe/d;->c()Ljava/util/concurrent/TimeUnit;

    move-result-object p3

    invoke-virtual {p2}, Lbe/d;->c()Ljava/util/concurrent/TimeUnit;

    move-result-object p2

    invoke-virtual {p3, p0, p1, p2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide p0

    return-wide p0
.end method
