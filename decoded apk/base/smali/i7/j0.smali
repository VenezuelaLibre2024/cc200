.class public abstract Li7/j0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/j0$c;,
        Li7/j0$d;,
        Li7/j0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K0:",
        "Ljava/lang/Object;",
        "V0:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Li7/i0;)V
    .locals 0

    invoke-direct {p0}, Li7/j0;-><init>()V

    return-void
.end method

.method public static a()Li7/j0$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/j0$d<",
            "Ljava/lang/Comparable;",
            ">;"
        }
    .end annotation

    invoke-static {}, Li7/p0;->c()Li7/p0;

    move-result-object v0

    invoke-static {v0}, Li7/j0;->b(Ljava/util/Comparator;)Li7/j0$d;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/util/Comparator;)Li7/j0$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K0:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "TK0;>;)",
            "Li7/j0$d<",
            "TK0;>;"
        }
    .end annotation

    invoke-static {p0}, Lh7/o;->j(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Li7/j0$a;

    invoke-direct {v0, p0}, Li7/j0$a;-><init>(Ljava/util/Comparator;)V

    return-object v0
.end method
