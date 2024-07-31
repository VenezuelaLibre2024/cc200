.class public Li7/w$a;
.super Li7/d1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li7/w;->j()Li7/d1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li7/d1<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public h:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "+",
            "Li7/s<",
            "TV;>;>;"
        }
    .end annotation
.end field

.field public i:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final synthetic j:Li7/w;


# direct methods
.method public constructor <init>(Li7/w;)V
    .locals 0

    iput-object p1, p0, Li7/w$a;->j:Li7/w;

    invoke-direct {p0}, Li7/d1;-><init>()V

    iget-object p1, p1, Li7/w;->k:Li7/v;

    invoke-virtual {p1}, Li7/v;->k()Li7/s;

    move-result-object p1

    invoke-virtual {p1}, Li7/s;->j()Li7/d1;

    move-result-object p1

    iput-object p1, p0, Li7/w$a;->h:Ljava/util/Iterator;

    invoke-static {}, Li7/c0;->f()Li7/d1;

    move-result-object p1

    iput-object p1, p0, Li7/w$a;->i:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Li7/w$a;->i:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Li7/w$a;->h:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, Li7/w$a;->i:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Li7/w$a;->h:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li7/s;

    invoke-virtual {v0}, Li7/s;->j()Li7/d1;

    move-result-object v0

    iput-object v0, p0, Li7/w$a;->i:Ljava/util/Iterator;

    :cond_0
    iget-object v0, p0, Li7/w$a;->i:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
