.class public final Lc2/l;
.super Lc2/u;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc2/l$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Lc2/l$a;)V
    .locals 2

    iget-object v0, p1, Lc2/u$a;->b:Ljava/util/UUID;

    iget-object v1, p1, Lc2/u$a;->c:Ll2/p;

    iget-object p1, p1, Lc2/u$a;->d:Ljava/util/Set;

    invoke-direct {p0, v0, v1, p1}, Lc2/u;-><init>(Ljava/util/UUID;Ll2/p;Ljava/util/Set;)V

    return-void
.end method

.method public static e(Ljava/lang/Class;)Lc2/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/ListenableWorker;",
            ">;)",
            "Lc2/l;"
        }
    .end annotation

    new-instance v0, Lc2/l$a;

    invoke-direct {v0, p0}, Lc2/l$a;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0}, Lc2/u$a;->b()Lc2/u;

    move-result-object p0

    check-cast p0, Lc2/l;

    return-object p0
.end method
