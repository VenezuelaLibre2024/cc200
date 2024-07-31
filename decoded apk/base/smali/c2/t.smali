.class public abstract Lc2/t;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "AddedAbstractMethod"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Landroid/content/Context;)Lc2/t;
    .locals 0

    invoke-static {p0}, Ld2/i;->k(Landroid/content/Context;)Ld2/i;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;Landroidx/work/a;)V
    .locals 0

    invoke-static {p0, p1}, Ld2/i;->f(Landroid/content/Context;Landroidx/work/a;)V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Lc2/m;
.end method

.method public abstract b(Ljava/util/UUID;)Lc2/m;
.end method

.method public final c(Lc2/u;)Lc2/m;
    .locals 0

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc2/t;->d(Ljava/util/List;)Lc2/m;

    move-result-object p1

    return-object p1
.end method

.method public abstract d(Ljava/util/List;)Lc2/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lc2/u;",
            ">;)",
            "Lc2/m;"
        }
    .end annotation
.end method
