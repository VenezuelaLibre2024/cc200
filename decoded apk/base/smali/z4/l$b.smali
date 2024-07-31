.class public Lz4/l$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz4/q$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz4/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic h:Lz4/l;


# direct methods
.method public constructor <init>(Lz4/l;)V
    .locals 0

    iput-object p1, p0, Lz4/l$b;->h:Lz4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lz4/l;Lz4/l$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lz4/l$b;-><init>(Lz4/l;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 11

    iget-object v0, p0, Lz4/l$b;->h:Lz4/l;

    invoke-static {v0}, Lz4/l;->h(Lz4/l;)I

    move-result v0

    if-lez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lz4/l$b;->h:Lz4/l;

    invoke-static {v0}, Lz4/l;->j(Lz4/l;)[Lz4/q;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v5, v0, v3

    invoke-virtual {v5}, Lz4/q;->s()Lu4/u0;

    move-result-object v5

    iget v5, v5, Lu4/u0;->h:I

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-array v0, v4, [Lu4/s0;

    iget-object v1, p0, Lz4/l$b;->h:Lz4/l;

    invoke-static {v1}, Lz4/l;->j(Lz4/l;)[Lz4/q;

    move-result-object v1

    array-length v3, v1

    move v4, v2

    move v5, v4

    :goto_1
    if-ge v4, v3, :cond_3

    aget-object v6, v1, v4

    invoke-virtual {v6}, Lz4/q;->s()Lu4/u0;

    move-result-object v7

    iget v7, v7, Lu4/u0;->h:I

    move v8, v2

    :goto_2
    if-ge v8, v7, :cond_2

    add-int/lit8 v9, v5, 0x1

    invoke-virtual {v6}, Lz4/q;->s()Lu4/u0;

    move-result-object v10

    invoke-virtual {v10, v8}, Lu4/u0;->b(I)Lu4/s0;

    move-result-object v10

    aput-object v10, v0, v5

    add-int/lit8 v8, v8, 0x1

    move v5, v9

    goto :goto_2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lz4/l$b;->h:Lz4/l;

    new-instance v2, Lu4/u0;

    invoke-direct {v2, v0}, Lu4/u0;-><init>([Lu4/s0;)V

    invoke-static {v1, v2}, Lz4/l;->k(Lz4/l;Lu4/u0;)Lu4/u0;

    iget-object v0, p0, Lz4/l$b;->h:Lz4/l;

    invoke-static {v0}, Lz4/l;->n(Lz4/l;)Lu4/r$a;

    move-result-object v0

    iget-object v1, p0, Lz4/l$b;->h:Lz4/l;

    invoke-interface {v0, v1}, Lu4/r$a;->k(Lu4/r;)V

    return-void
.end method

.method public b(Lz4/q;)V
    .locals 1

    iget-object p1, p0, Lz4/l$b;->h:Lz4/l;

    invoke-static {p1}, Lz4/l;->n(Lz4/l;)Lu4/r$a;

    move-result-object p1

    iget-object v0, p0, Lz4/l$b;->h:Lz4/l;

    invoke-interface {p1, v0}, Lu4/n0$a;->e(Lu4/n0;)V

    return-void
.end method

.method public bridge synthetic e(Lu4/n0;)V
    .locals 0

    check-cast p1, Lz4/q;

    invoke-virtual {p0, p1}, Lz4/l$b;->b(Lz4/q;)V

    return-void
.end method

.method public j(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, Lz4/l$b;->h:Lz4/l;

    invoke-static {v0}, Lz4/l;->o(Lz4/l;)La5/l;

    move-result-object v0

    invoke-interface {v0, p1}, La5/l;->j(Landroid/net/Uri;)V

    return-void
.end method
