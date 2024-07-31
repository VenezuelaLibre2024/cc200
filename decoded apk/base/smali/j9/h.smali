.class public Lj9/h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj9/h$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/String;Lj9/h$a;Ly7/d;)Lj9/f;
    .locals 0

    invoke-static {p0, p1, p2}, Lj9/h;->d(Ljava/lang/String;Lj9/h$a;Ly7/d;)Lj9/f;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Ly7/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ly7/c<",
            "*>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lj9/f;->a(Ljava/lang/String;Ljava/lang/String;)Lj9/f;

    move-result-object p0

    const-class p1, Lj9/f;

    invoke-static {p0, p1}, Ly7/c;->l(Ljava/lang/Object;Ljava/lang/Class;)Ly7/c;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;Lj9/h$a;)Ly7/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lj9/h$a<",
            "Landroid/content/Context;",
            ">;)",
            "Ly7/c<",
            "*>;"
        }
    .end annotation

    const-class v0, Lj9/f;

    invoke-static {v0}, Ly7/c;->m(Ljava/lang/Class;)Ly7/c$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-static {v1}, Ly7/q;->j(Ljava/lang/Class;)Ly7/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v0

    new-instance v1, Lj9/g;

    invoke-direct {v1, p0, p1}, Lj9/g;-><init>(Ljava/lang/String;Lj9/h$a;)V

    invoke-virtual {v0, v1}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object p0

    invoke-virtual {p0}, Ly7/c$b;->d()Ly7/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Lj9/h$a;Ly7/d;)Lj9/f;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p2, v0}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    invoke-interface {p1, p2}, Lj9/h$a;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lj9/f;->a(Ljava/lang/String;Ljava/lang/String;)Lj9/f;

    move-result-object p0

    return-object p0
.end method
