.class public final Li7/s0$b;
.super Li7/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Li7/x<",
        "TK;>;"
    }
.end annotation


# instance fields
.field public final transient j:Li7/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/v<",
            "TK;*>;"
        }
    .end annotation
.end field

.field public final transient k:Li7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/u<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Li7/v;Li7/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li7/v<",
            "TK;*>;",
            "Li7/u<",
            "TK;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Li7/x;-><init>()V

    iput-object p1, p0, Li7/s0$b;->j:Li7/v;

    iput-object p2, p0, Li7/s0$b;->k:Li7/u;

    return-void
.end method


# virtual methods
.method public a()Li7/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/u<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, Li7/s0$b;->k:Li7/u;

    return-object v0
.end method

.method public b([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Li7/s0$b;->a()Li7/u;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Li7/u;->b([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Li7/s0$b;->j:Li7/v;

    invoke-virtual {v0, p1}, Li7/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Li7/s0$b;->j()Li7/d1;

    move-result-object v0

    return-object v0
.end method

.method public j()Li7/d1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/d1<",
            "TK;>;"
        }
    .end annotation

    invoke-virtual {p0}, Li7/s0$b;->a()Li7/u;

    move-result-object v0

    invoke-virtual {v0}, Li7/u;->j()Li7/d1;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Li7/s0$b;->j:Li7/v;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
