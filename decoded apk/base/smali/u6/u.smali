.class public Lu6/u;
.super Lu6/c0;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lu6/u;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Lu6/y;

.field public final i:Lu6/a0;

.field public final j:[B

.field public final k:Ljava/util/List;

.field public final l:Ljava/lang/Double;

.field public final m:Ljava/util/List;

.field public final n:Lu6/k;

.field public final o:Ljava/lang/Integer;

.field public final p:Lu6/e0;

.field public final q:Lu6/c;

.field public final r:Lu6/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu6/t0;

    invoke-direct {v0}, Lu6/t0;-><init>()V

    sput-object v0, Lu6/u;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lu6/y;Lu6/a0;[BLjava/util/List;Ljava/lang/Double;Ljava/util/List;Lu6/k;Ljava/lang/Integer;Lu6/e0;Ljava/lang/String;Lu6/d;)V
    .locals 0

    invoke-direct {p0}, Lu6/c0;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu6/y;

    iput-object p1, p0, Lu6/u;->h:Lu6/y;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu6/a0;

    iput-object p1, p0, Lu6/u;->i:Lu6/a0;

    invoke-static {p3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lu6/u;->j:[B

    invoke-static {p4}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lu6/u;->k:Ljava/util/List;

    iput-object p5, p0, Lu6/u;->l:Ljava/lang/Double;

    iput-object p6, p0, Lu6/u;->m:Ljava/util/List;

    iput-object p7, p0, Lu6/u;->n:Lu6/k;

    iput-object p8, p0, Lu6/u;->o:Ljava/lang/Integer;

    iput-object p9, p0, Lu6/u;->p:Lu6/e0;

    if-eqz p10, :cond_0

    :try_start_0
    invoke-static {p10}, Lu6/c;->b(Ljava/lang/String;)Lu6/c;

    move-result-object p1

    iput-object p1, p0, Lu6/u;->q:Lu6/c;
    :try_end_0
    .catch Lu6/c$a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lu6/u;->q:Lu6/c;

    :goto_0
    iput-object p11, p0, Lu6/u;->r:Lu6/d;

    return-void
.end method


# virtual methods
.method public I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu6/u;->q:Lu6/c;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lu6/c;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public J()Lu6/d;
    .locals 1

    iget-object v0, p0, Lu6/u;->r:Lu6/d;

    return-object v0
.end method

.method public K()Lu6/k;
    .locals 1

    iget-object v0, p0, Lu6/u;->n:Lu6/k;

    return-object v0
.end method

.method public L()[B
    .locals 1

    iget-object v0, p0, Lu6/u;->j:[B

    return-object v0
.end method

.method public M()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lu6/v;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lu6/u;->m:Ljava/util/List;

    return-object v0
.end method

.method public N()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lu6/w;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lu6/u;->k:Ljava/util/List;

    return-object v0
.end method

.method public O()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lu6/u;->o:Ljava/lang/Integer;

    return-object v0
.end method

.method public P()Lu6/y;
    .locals 1

    iget-object v0, p0, Lu6/u;->h:Lu6/y;

    return-object v0
.end method

.method public Q()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lu6/u;->l:Ljava/lang/Double;

    return-object v0
.end method

.method public R()Lu6/e0;
    .locals 1

    iget-object v0, p0, Lu6/u;->p:Lu6/e0;

    return-object v0
.end method

.method public S()Lu6/a0;
    .locals 1

    iget-object v0, p0, Lu6/u;->i:Lu6/a0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lu6/u;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lu6/u;

    iget-object v0, p0, Lu6/u;->h:Lu6/y;

    iget-object v2, p1, Lu6/u;->h:Lu6/y;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu6/u;->i:Lu6/a0;

    iget-object v2, p1, Lu6/u;->i:Lu6/a0;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu6/u;->j:[B

    iget-object v2, p1, Lu6/u;->j:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu6/u;->l:Ljava/lang/Double;

    iget-object v2, p1, Lu6/u;->l:Ljava/lang/Double;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu6/u;->k:Ljava/util/List;

    iget-object v2, p1, Lu6/u;->k:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p1, Lu6/u;->k:Ljava/util/List;

    iget-object v2, p0, Lu6/u;->k:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu6/u;->m:Ljava/util/List;

    if-nez v0, :cond_1

    iget-object v2, p1, Lu6/u;->m:Ljava/util/List;

    if-eqz v2, :cond_2

    :cond_1
    if-eqz v0, :cond_3

    iget-object v2, p1, Lu6/u;->m:Ljava/util/List;

    if-eqz v2, :cond_3

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p1, Lu6/u;->m:Ljava/util/List;

    iget-object v2, p0, Lu6/u;->m:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lu6/u;->n:Lu6/k;

    iget-object v2, p1, Lu6/u;->n:Lu6/k;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu6/u;->o:Ljava/lang/Integer;

    iget-object v2, p1, Lu6/u;->o:Ljava/lang/Integer;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu6/u;->p:Lu6/e0;

    iget-object v2, p1, Lu6/u;->p:Lu6/e0;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu6/u;->q:Lu6/c;

    iget-object v2, p1, Lu6/u;->q:Lu6/c;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu6/u;->r:Lu6/d;

    iget-object p1, p1, Lu6/u;->r:Lu6/d;

    invoke-static {v0, p1}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/16 v0, 0xb

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lu6/u;->h:Lu6/y;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/u;->i:Lu6/a0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/u;->j:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/u;->k:Ljava/util/List;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/u;->l:Ljava/lang/Double;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/u;->m:Ljava/util/List;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/u;->n:Lu6/k;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/u;->o:Ljava/lang/Integer;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/u;->p:Lu6/e0;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/u;->q:Lu6/c;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/u;->r:Lu6/d;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    invoke-static {v0}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lu6/u;->P()Lu6/y;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lu6/u;->S()Lu6/a0;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lu6/u;->L()[B

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, v3}, Li6/c;->l(Landroid/os/Parcel;I[BZ)V

    invoke-virtual {p0}, Lu6/u;->N()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x5

    invoke-static {p1, v2, v1, v3}, Li6/c;->J(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-virtual {p0}, Lu6/u;->Q()Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {p1, v2, v1, v3}, Li6/c;->p(Landroid/os/Parcel;ILjava/lang/Double;Z)V

    invoke-virtual {p0}, Lu6/u;->M()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {p1, v2, v1, v3}, Li6/c;->J(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-virtual {p0}, Lu6/u;->K()Lu6/k;

    move-result-object v1

    const/16 v2, 0x8

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lu6/u;->O()Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x9

    invoke-static {p1, v2, v1, v3}, Li6/c;->w(Landroid/os/Parcel;ILjava/lang/Integer;Z)V

    invoke-virtual {p0}, Lu6/u;->R()Lu6/e0;

    move-result-object v1

    const/16 v2, 0xa

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lu6/u;->I()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lu6/u;->J()Lu6/d;

    move-result-object v1

    const/16 v2, 0xc

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
