.class public final Li7/w$c;
.super Li7/s;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Li7/s<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final transient i:Li7/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/w<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Li7/w;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li7/w<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Li7/s;-><init>()V

    iput-object p1, p0, Li7/w$c;->i:Li7/w;

    return-void
.end method


# virtual methods
.method public b([Ljava/lang/Object;I)I
    .locals 2

    iget-object v0, p0, Li7/w$c;->i:Li7/w;

    iget-object v0, v0, Li7/w;->k:Li7/v;

    invoke-virtual {v0}, Li7/v;->k()Li7/s;

    move-result-object v0

    invoke-virtual {v0}, Li7/s;->j()Li7/d1;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li7/s;

    invoke-virtual {v1, p1, p2}, Li7/s;->b([Ljava/lang/Object;I)I

    move-result p2

    goto :goto_0

    :cond_0
    return p2
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Li7/w$c;->i:Li7/w;

    invoke-virtual {v0, p1}, Li7/w;->b(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Li7/w$c;->j()Li7/d1;

    move-result-object v0

    return-object v0
.end method

.method public j()Li7/d1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/d1<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, Li7/w$c;->i:Li7/w;

    invoke-virtual {v0}, Li7/w;->j()Li7/d1;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Li7/w$c;->i:Li7/w;

    invoke-virtual {v0}, Li7/w;->size()I

    move-result v0

    return v0
.end method
