.class public Lqd/l;
.super Lqd/k;
.source ""


# direct methods
.method public static final c(Ljava/io/File;Lqd/i;)Lqd/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "direction"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqd/h;

    invoke-direct {v0, p0, p1}, Lqd/h;-><init>(Ljava/io/File;Lqd/i;)V

    return-object v0
.end method

.method public static final d(Ljava/io/File;)Lqd/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lqd/i;->i:Lqd/i;

    invoke-static {p0, v0}, Lqd/l;->c(Ljava/io/File;Lqd/i;)Lqd/h;

    move-result-object p0

    return-object p0
.end method
