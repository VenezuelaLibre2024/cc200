.class public abstract Lu0/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu0/d$a;,
        Lu0/d$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lu0/d$a<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Lu0/d$a;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lu0/d$a<",
            "TT;>;)TT;"
        }
    .end annotation
.end method

.method public final c()Lu0/a;
    .locals 3

    new-instance v0, Lu0/a;

    invoke-virtual {p0}, Lu0/d;->a()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Lhd/e0;->n(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lu0/a;-><init>(Ljava/util/Map;Z)V

    return-object v0
.end method

.method public final d()Lu0/d;
    .locals 3

    new-instance v0, Lu0/a;

    invoke-virtual {p0}, Lu0/d;->a()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Lhd/e0;->n(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lu0/a;-><init>(Ljava/util/Map;Z)V

    return-object v0
.end method
