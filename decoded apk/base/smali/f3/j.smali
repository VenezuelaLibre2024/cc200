.class public abstract Lf3/j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;)Lf3/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lf3/m;",
            ">;)",
            "Lf3/j;"
        }
    .end annotation

    new-instance v0, Lf3/d;

    invoke-direct {v0, p0}, Lf3/d;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static b()Lq8/a;
    .locals 2

    new-instance v0, Ls8/d;

    invoke-direct {v0}, Ls8/d;-><init>()V

    sget-object v1, Lf3/b;->a:Lr8/a;

    invoke-virtual {v0, v1}, Ls8/d;->j(Lr8/a;)Ls8/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ls8/d;->k(Z)Ls8/d;

    move-result-object v0

    invoke-virtual {v0}, Ls8/d;->i()Lq8/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lf3/m;",
            ">;"
        }
    .end annotation
.end method
