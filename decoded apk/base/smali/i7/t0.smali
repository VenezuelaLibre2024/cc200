.class public final Li7/t0;
.super Li7/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Li7/x<",
        "TE;>;"
    }
.end annotation


# static fields
.field public static final o:[Ljava/lang/Object;

.field public static final p:Li7/t0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/t0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final transient j:[Ljava/lang/Object;

.field public final transient k:I

.field public final transient l:[Ljava/lang/Object;

.field public final transient m:I

.field public final transient n:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const/4 v0, 0x0

    new-array v4, v0, [Ljava/lang/Object;

    sput-object v4, Li7/t0;->o:[Ljava/lang/Object;

    new-instance v0, Li7/t0;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, v4

    invoke-direct/range {v1 .. v6}, Li7/t0;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    sput-object v0, Li7/t0;->p:Li7/t0;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Li7/x;-><init>()V

    iput-object p1, p0, Li7/t0;->j:[Ljava/lang/Object;

    iput p2, p0, Li7/t0;->k:I

    iput-object p3, p0, Li7/t0;->l:[Ljava/lang/Object;

    iput p4, p0, Li7/t0;->m:I

    iput p5, p0, Li7/t0;->n:I

    return-void
.end method


# virtual methods
.method public b([Ljava/lang/Object;I)I
    .locals 3

    iget-object v0, p0, Li7/t0;->j:[Ljava/lang/Object;

    iget v1, p0, Li7/t0;->n:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Li7/t0;->n:I

    add-int/2addr p2, p1

    return p2
.end method

.method public c()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Li7/t0;->j:[Ljava/lang/Object;

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 4

    iget-object v0, p0, Li7/t0;->l:[Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    array-length v2, v0

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1}, Li7/r;->c(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    iget v3, p0, Li7/t0;->m:I

    and-int/2addr v2, v3

    aget-object v3, v0, v2

    if-nez v3, :cond_1

    return v1

    :cond_1
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v1
.end method

.method public d()I
    .locals 1

    iget v0, p0, Li7/t0;->n:I

    return v0
.end method

.method public e()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Li7/t0;->k:I

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Li7/t0;->j()Li7/d1;

    move-result-object v0

    return-object v0
.end method

.method public j()Li7/d1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/d1<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, Li7/x;->a()Li7/u;

    move-result-object v0

    invoke-virtual {v0}, Li7/u;->j()Li7/d1;

    move-result-object v0

    return-object v0
.end method

.method public p()Li7/u;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/u<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Li7/t0;->j:[Ljava/lang/Object;

    iget v1, p0, Li7/t0;->n:I

    invoke-static {v0, v1}, Li7/u;->m([Ljava/lang/Object;I)Li7/u;

    move-result-object v0

    return-object v0
.end method

.method public q()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Li7/t0;->n:I

    return v0
.end method
