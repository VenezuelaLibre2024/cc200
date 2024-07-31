.class public final La5/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La5/k;


# instance fields
.field public final a:La5/k;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lt4/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La5/k;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La5/k;",
            "Ljava/util/List<",
            "Lt4/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/e;->a:La5/k;

    iput-object p2, p0, La5/e;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(La5/h;La5/g;)Lo5/g0$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La5/h;",
            "La5/g;",
            ")",
            "Lo5/g0$a<",
            "La5/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lt4/b;

    iget-object v1, p0, La5/e;->a:La5/k;

    invoke-interface {v1, p1, p2}, La5/k;->a(La5/h;La5/g;)Lo5/g0$a;

    move-result-object p1

    iget-object p2, p0, La5/e;->b:Ljava/util/List;

    invoke-direct {v0, p1, p2}, Lt4/b;-><init>(Lo5/g0$a;Ljava/util/List;)V

    return-object v0
.end method

.method public b()Lo5/g0$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo5/g0$a<",
            "La5/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lt4/b;

    iget-object v1, p0, La5/e;->a:La5/k;

    invoke-interface {v1}, La5/k;->b()Lo5/g0$a;

    move-result-object v1

    iget-object v2, p0, La5/e;->b:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lt4/b;-><init>(Lo5/g0$a;Ljava/util/List;)V

    return-object v0
.end method
