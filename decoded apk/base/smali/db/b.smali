.class public final Ldb/b;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Loa/b;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[",
            "Lia/p;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Loa/b;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loa/b;",
            "Ljava/util/List<",
            "[",
            "Lia/p;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldb/b;->a:Loa/b;

    iput-object p2, p0, Ldb/b;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Loa/b;
    .locals 1

    iget-object v0, p0, Ldb/b;->a:Loa/b;

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "[",
            "Lia/p;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldb/b;->b:Ljava/util/List;

    return-object v0
.end method
