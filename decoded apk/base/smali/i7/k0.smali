.class public final Li7/k0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/k0$a;
    }
.end annotation


# direct methods
.method public static a(Li7/h0;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li7/h0<",
            "**>;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    instance-of v0, p1, Li7/h0;

    if-eqz v0, :cond_1

    check-cast p1, Li7/h0;

    invoke-interface {p0}, Li7/h0;->a()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1}, Li7/h0;->a()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static b(Ljava/util/Map;Lh7/u;)Li7/d0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;",
            "Lh7/u<",
            "+",
            "Ljava/util/List<",
            "TV;>;>;)",
            "Li7/d0<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, Li7/k0$a;

    invoke-direct {v0, p0, p1}, Li7/k0$a;-><init>(Ljava/util/Map;Lh7/u;)V

    return-object v0
.end method
