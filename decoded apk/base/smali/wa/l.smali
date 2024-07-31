.class public final Lwa/l;
.super Lwa/p;
.source ""


# instance fields
.field public final i:Lwa/p;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lwa/p;-><init>()V

    new-instance v0, Lwa/e;

    invoke-direct {v0}, Lwa/e;-><init>()V

    iput-object v0, p0, Lwa/l;->i:Lwa/p;

    return-void
.end method

.method public static s(Lia/n;)Lia/n;
    .locals 5

    invoke-virtual {p0}, Lia/n;->f()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x30

    if-ne v1, v2, :cond_1

    new-instance v1, Lia/n;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0}, Lia/n;->e()[Lia/p;

    move-result-object v3

    sget-object v4, Lia/a;->v:Lia/a;

    invoke-direct {v1, v0, v2, v3, v4}, Lia/n;-><init>(Ljava/lang/String;[B[Lia/p;Lia/a;)V

    invoke-virtual {p0}, Lia/n;->d()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lia/n;->d()Ljava/util/Map;

    move-result-object p0

    invoke-virtual {v1, p0}, Lia/n;->g(Ljava/util/Map;)V

    :cond_0
    return-object v1

    :cond_1
    invoke-static {}, Lia/f;->a()Lia/f;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public a(Lia/c;)Lia/n;
    .locals 1

    iget-object v0, p0, Lwa/l;->i:Lwa/p;

    invoke-virtual {v0, p1}, Lwa/k;->a(Lia/c;)Lia/n;

    move-result-object p1

    invoke-static {p1}, Lwa/l;->s(Lia/n;)Lia/n;

    move-result-object p1

    return-object p1
.end method

.method public b(Lia/c;Ljava/util/Map;)Lia/n;
    .locals 1
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

    iget-object v0, p0, Lwa/l;->i:Lwa/p;

    invoke-virtual {v0, p1, p2}, Lwa/k;->b(Lia/c;Ljava/util/Map;)Lia/n;

    move-result-object p1

    invoke-static {p1}, Lwa/l;->s(Lia/n;)Lia/n;

    move-result-object p1

    return-object p1
.end method

.method public c(ILoa/a;Ljava/util/Map;)Lia/n;
    .locals 1
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

    iget-object v0, p0, Lwa/l;->i:Lwa/p;

    invoke-virtual {v0, p1, p2, p3}, Lwa/p;->c(ILoa/a;Ljava/util/Map;)Lia/n;

    move-result-object p1

    invoke-static {p1}, Lwa/l;->s(Lia/n;)Lia/n;

    move-result-object p1

    return-object p1
.end method

.method public l(Loa/a;[ILjava/lang/StringBuilder;)I
    .locals 1

    iget-object v0, p0, Lwa/l;->i:Lwa/p;

    invoke-virtual {v0, p1, p2, p3}, Lwa/p;->l(Loa/a;[ILjava/lang/StringBuilder;)I

    move-result p1

    return p1
.end method

.method public m(ILoa/a;[ILjava/util/Map;)Lia/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Loa/a;",
            "[I",
            "Ljava/util/Map<",
            "Lia/e;",
            "*>;)",
            "Lia/n;"
        }
    .end annotation

    iget-object v0, p0, Lwa/l;->i:Lwa/p;

    invoke-virtual {v0, p1, p2, p3, p4}, Lwa/p;->m(ILoa/a;[ILjava/util/Map;)Lia/n;

    move-result-object p1

    invoke-static {p1}, Lwa/l;->s(Lia/n;)Lia/n;

    move-result-object p1

    return-object p1
.end method

.method public q()Lia/a;
    .locals 1

    sget-object v0, Lia/a;->v:Lia/a;

    return-object v0
.end method
