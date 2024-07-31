.class public final Lt0/a;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Ljava/lang/String;Ls0/b;Lsd/l;Lce/p0;)Lud/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ls0/b<",
            "Lu0/d;",
            ">;",
            "Lsd/l<",
            "-",
            "Landroid/content/Context;",
            "+",
            "Ljava/util/List<",
            "+",
            "Lr0/d<",
            "Lu0/d;",
            ">;>;>;",
            "Lce/p0;",
            ")",
            "Lud/a<",
            "Landroid/content/Context;",
            "Lr0/f<",
            "Lu0/d;",
            ">;>;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "produceMigrations"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt0/c;

    invoke-direct {v0, p0, p1, p2, p3}, Lt0/c;-><init>(Ljava/lang/String;Ls0/b;Lsd/l;Lce/p0;)V

    return-object v0
.end method

.method public static synthetic b(Ljava/lang/String;Ls0/b;Lsd/l;Lce/p0;ILjava/lang/Object;)Lud/a;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_1

    sget-object p2, Lt0/a$a;->h:Lt0/a$a;

    :cond_1
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_2

    sget-object p3, Lce/g1;->a:Lce/g1;

    invoke-static {}, Lce/g1;->b()Lce/k0;

    move-result-object p3

    const/4 p4, 0x1

    invoke-static {v0, p4, v0}, Lce/w2;->b(Lce/c2;ILjava/lang/Object;)Lce/a0;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljd/a;->e0(Ljd/g;)Ljd/g;

    move-result-object p3

    invoke-static {p3}, Lce/q0;->a(Ljd/g;)Lce/p0;

    move-result-object p3

    :cond_2
    invoke-static {p0, p1, p2, p3}, Lt0/a;->a(Ljava/lang/String;Ls0/b;Lsd/l;Lce/p0;)Lud/a;

    move-result-object p0

    return-object p0
.end method
