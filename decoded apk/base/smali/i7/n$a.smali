.class public Li7/n$a;
.super Li7/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li7/n;-><init>(Li7/n$a;)V

    return-void
.end method


# virtual methods
.method public d(II)Li7/n;
    .locals 0

    invoke-static {p1, p2}, Lk7/e;->e(II)I

    move-result p1

    invoke-virtual {p0, p1}, Li7/n$a;->k(I)Li7/n;

    move-result-object p1

    return-object p1
.end method

.method public e(JJ)Li7/n;
    .locals 0

    invoke-static {p1, p2, p3, p4}, Lk7/g;->a(JJ)I

    move-result p1

    invoke-virtual {p0, p1}, Li7/n$a;->k(I)Li7/n;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Li7/n;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Li7/n;"
        }
    .end annotation

    invoke-interface {p3, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0, p1}, Li7/n$a;->k(I)Li7/n;

    move-result-object p1

    return-object p1
.end method

.method public g(ZZ)Li7/n;
    .locals 0

    invoke-static {p1, p2}, Lk7/a;->a(ZZ)I

    move-result p1

    invoke-virtual {p0, p1}, Li7/n$a;->k(I)Li7/n;

    move-result-object p1

    return-object p1
.end method

.method public h(ZZ)Li7/n;
    .locals 0

    invoke-static {p2, p1}, Lk7/a;->a(ZZ)I

    move-result p1

    invoke-virtual {p0, p1}, Li7/n$a;->k(I)Li7/n;

    move-result-object p1

    return-object p1
.end method

.method public i()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public k(I)Li7/n;
    .locals 0

    if-gez p1, :cond_0

    invoke-static {}, Li7/n;->a()Li7/n;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-lez p1, :cond_1

    invoke-static {}, Li7/n;->b()Li7/n;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {}, Li7/n;->c()Li7/n;

    move-result-object p1

    :goto_0
    return-object p1
.end method
