.class public Li7/k$b;
.super Li7/k$e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li7/k;->y()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li7/k<",
        "TK;TV;>.e<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic l:Li7/k;


# direct methods
.method public constructor <init>(Li7/k;)V
    .locals 1

    iput-object p1, p0, Li7/k$b;->l:Li7/k;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Li7/k$e;-><init>(Li7/k;Li7/k$a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Li7/k$b;->e(I)Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public e(I)Ljava/util/Map$Entry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, Li7/k$g;

    iget-object v1, p0, Li7/k$b;->l:Li7/k;

    invoke-direct {v0, v1, p1}, Li7/k$g;-><init>(Li7/k;I)V

    return-object v0
.end method
