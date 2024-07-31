.class public final Li7/y$a;
.super Li7/w$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Li7/w$b<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Li7/w$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Li7/y;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/y<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Li7/w$b;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Li7/w$b;->b:Ljava/util/Comparator;

    if-eqz v1, :cond_0

    invoke-static {v1}, Li7/p0;->a(Ljava/util/Comparator;)Li7/p0;

    move-result-object v1

    invoke-virtual {v1}, Li7/p0;->d()Li7/p0;

    move-result-object v1

    invoke-virtual {v1, v0}, Li7/p0;->b(Ljava/lang/Iterable;)Li7/u;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Li7/w$b;->c:Ljava/util/Comparator;

    invoke-static {v0, v1}, Li7/y;->m(Ljava/util/Collection;Ljava/util/Comparator;)Li7/y;

    move-result-object v0

    return-object v0
.end method
