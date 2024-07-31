.class public abstract Li7/p0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/Comparator;)Li7/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Li7/p0<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Li7/p0;

    if-eqz v0, :cond_0

    check-cast p0, Li7/p0;

    goto :goto_0

    :cond_0
    new-instance v0, Li7/m;

    invoke-direct {v0, p0}, Li7/m;-><init>(Ljava/util/Comparator;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static c()Li7/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Ljava/lang/Comparable;",
            ">()",
            "Li7/p0<",
            "TC;>;"
        }
    .end annotation

    sget-object v0, Li7/m0;->h:Li7/m0;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Iterable;)Li7/u;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:TT;>(",
            "Ljava/lang/Iterable<",
            "TE;>;)",
            "Li7/u<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Li7/u;->C(Ljava/util/Comparator;Ljava/lang/Iterable;)Li7/u;

    move-result-object p1

    return-object p1
.end method

.method public abstract compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation
.end method

.method public d()Li7/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T2:TT;>()",
            "Li7/p0<",
            "Ljava/util/Map$Entry<",
            "TT2;*>;>;"
        }
    .end annotation

    invoke-static {}, Li7/g0;->e()Lh7/g;

    move-result-object v0

    invoke-virtual {p0, v0}, Li7/p0;->e(Lh7/g;)Li7/p0;

    move-result-object v0

    return-object v0
.end method

.method public e(Lh7/g;)Li7/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Ljava/lang/Object;",
            ">(",
            "Lh7/g<",
            "TF;+TT;>;)",
            "Li7/p0<",
            "TF;>;"
        }
    .end annotation

    new-instance v0, Li7/h;

    invoke-direct {v0, p1, p0}, Li7/h;-><init>(Lh7/g;Li7/p0;)V

    return-object v0
.end method

.method public f()Li7/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:TT;>()",
            "Li7/p0<",
            "TS;>;"
        }
    .end annotation

    new-instance v0, Li7/w0;

    invoke-direct {v0, p0}, Li7/w0;-><init>(Li7/p0;)V

    return-object v0
.end method
