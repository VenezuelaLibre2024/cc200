.class public Lcc/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcc/e;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcc/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcc/d;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Lcc/f;)Lcc/f;
    .locals 2

    iget-object v0, p0, Lcc/d;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcc/e;

    invoke-interface {v1, p1}, Lcc/e;->a(Lcc/f;)Lcc/f;

    move-result-object p1

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method public b(Lcc/e;)V
    .locals 1

    iget-object v0, p0, Lcc/d;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
