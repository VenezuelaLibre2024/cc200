.class public Li7/d$b$a;
.super Li7/g0$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/d$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li7/g0$c<",
        "TK;",
        "Ljava/util/Collection<",
        "TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic h:Li7/d$b;


# direct methods
.method public constructor <init>(Li7/d$b;)V
    .locals 0

    iput-object p1, p0, Li7/d$b$a;->h:Li7/d$b;

    invoke-direct {p0}, Li7/g0$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, Li7/d$b$a;->h:Li7/d$b;

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Li7/d$b$a;->h:Li7/d$b;

    iget-object v0, v0, Li7/d$b;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, p1}, Li7/j;->c(Ljava/util/Collection;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;>;"
        }
    .end annotation

    new-instance v0, Li7/d$b$b;

    iget-object v1, p0, Li7/d$b$a;->h:Li7/d$b;

    invoke-direct {v0, v1}, Li7/d$b$b;-><init>(Li7/d$b;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0, p1}, Li7/d$b$a;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, Li7/d$b$a;->h:Li7/d$b;

    iget-object v0, v0, Li7/d$b;->k:Li7/d;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Li7/d;->n(Li7/d;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
