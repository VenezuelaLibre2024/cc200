.class public Li7/s0$a;
.super Li7/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Li7/x<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final transient j:Li7/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/v<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public final transient k:[Ljava/lang/Object;

.field public final transient l:I

.field public final transient m:I


# direct methods
.method public constructor <init>(Li7/v;[Ljava/lang/Object;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li7/v<",
            "TK;TV;>;[",
            "Ljava/lang/Object;",
            "II)V"
        }
    .end annotation

    invoke-direct {p0}, Li7/x;-><init>()V

    iput-object p1, p0, Li7/s0$a;->j:Li7/v;

    iput-object p2, p0, Li7/s0$a;->k:[Ljava/lang/Object;

    iput p3, p0, Li7/s0$a;->l:I

    iput p4, p0, Li7/s0$a;->m:I

    return-void
.end method

.method public static synthetic B(Li7/s0$a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Li7/s0$a;->k:[Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic C(Li7/s0$a;)I
    .locals 0

    iget p0, p0, Li7/s0$a;->l:I

    return p0
.end method

.method public static synthetic z(Li7/s0$a;)I
    .locals 0

    iget p0, p0, Li7/s0$a;->m:I

    return p0
.end method


# virtual methods
.method public b([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Li7/x;->a()Li7/u;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Li7/u;->b([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Li7/s0$a;->j:Li7/v;

    invoke-virtual {v2, v0}, Li7/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Li7/s0$a;->j()Li7/d1;

    move-result-object v0

    return-object v0
.end method

.method public j()Li7/d1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/d1<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    invoke-virtual {p0}, Li7/x;->a()Li7/u;

    move-result-object v0

    invoke-virtual {v0}, Li7/u;->j()Li7/d1;

    move-result-object v0

    return-object v0
.end method

.method public p()Li7/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/u<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Li7/s0$a$a;

    invoke-direct {v0, p0}, Li7/s0$a$a;-><init>(Li7/s0$a;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Li7/s0$a;->m:I

    return v0
.end method
