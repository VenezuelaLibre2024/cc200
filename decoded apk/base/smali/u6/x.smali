.class public Lu6/x;
.super Lu6/c0;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lu6/x;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:[B

.field public final i:Ljava/lang/Double;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/util/List;

.field public final l:Ljava/lang/Integer;

.field public final m:Lu6/e0;

.field public final n:Lu6/h1;

.field public final o:Lu6/d;

.field public final p:Ljava/lang/Long;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu6/x0;

    invoke-direct {v0}, Lu6/x0;-><init>()V

    sput-object v0, Lu6/x;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>([BLjava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lu6/e0;Ljava/lang/String;Lu6/d;Ljava/lang/Long;)V
    .locals 0

    invoke-direct {p0}, Lu6/c0;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lu6/x;->h:[B

    iput-object p2, p0, Lu6/x;->i:Ljava/lang/Double;

    invoke-static {p3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lu6/x;->j:Ljava/lang/String;

    iput-object p4, p0, Lu6/x;->k:Ljava/util/List;

    iput-object p5, p0, Lu6/x;->l:Ljava/lang/Integer;

    iput-object p6, p0, Lu6/x;->m:Lu6/e0;

    iput-object p9, p0, Lu6/x;->p:Ljava/lang/Long;

    if-eqz p7, :cond_0

    :try_start_0
    invoke-static {p7}, Lu6/h1;->b(Ljava/lang/String;)Lu6/h1;

    move-result-object p1

    iput-object p1, p0, Lu6/x;->n:Lu6/h1;
    :try_end_0
    .catch Lu6/g1; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lu6/x;->n:Lu6/h1;

    :goto_0
    iput-object p8, p0, Lu6/x;->o:Lu6/d;

    return-void
.end method


# virtual methods
.method public I()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lu6/v;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lu6/x;->k:Ljava/util/List;

    return-object v0
.end method

.method public J()Lu6/d;
    .locals 1

    iget-object v0, p0, Lu6/x;->o:Lu6/d;

    return-object v0
.end method

.method public K()[B
    .locals 1

    iget-object v0, p0, Lu6/x;->h:[B

    return-object v0
.end method

.method public L()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lu6/x;->l:Ljava/lang/Integer;

    return-object v0
.end method

.method public M()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu6/x;->j:Ljava/lang/String;

    return-object v0
.end method

.method public N()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lu6/x;->i:Ljava/lang/Double;

    return-object v0
.end method

.method public O()Lu6/e0;
    .locals 1

    iget-object v0, p0, Lu6/x;->m:Lu6/e0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lu6/x;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lu6/x;

    iget-object v0, p0, Lu6/x;->h:[B

    iget-object v2, p1, Lu6/x;->h:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu6/x;->i:Ljava/lang/Double;

    iget-object v2, p1, Lu6/x;->i:Ljava/lang/Double;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu6/x;->j:Ljava/lang/String;

    iget-object v2, p1, Lu6/x;->j:Ljava/lang/String;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu6/x;->k:Ljava/util/List;

    if-nez v0, :cond_1

    iget-object v2, p1, Lu6/x;->k:Ljava/util/List;

    if-eqz v2, :cond_2

    :cond_1
    if-eqz v0, :cond_3

    iget-object v2, p1, Lu6/x;->k:Ljava/util/List;

    if-eqz v2, :cond_3

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p1, Lu6/x;->k:Ljava/util/List;

    iget-object v2, p0, Lu6/x;->k:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lu6/x;->l:Ljava/lang/Integer;

    iget-object v2, p1, Lu6/x;->l:Ljava/lang/Integer;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu6/x;->m:Lu6/e0;

    iget-object v2, p1, Lu6/x;->m:Lu6/e0;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu6/x;->n:Lu6/h1;

    iget-object v2, p1, Lu6/x;->n:Lu6/h1;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu6/x;->o:Lu6/d;

    iget-object v2, p1, Lu6/x;->o:Lu6/d;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu6/x;->p:Ljava/lang/Long;

    iget-object p1, p1, Lu6/x;->p:Ljava/lang/Long;

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

    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lu6/x;->h:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/x;->i:Ljava/lang/Double;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/x;->j:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/x;->k:Ljava/util/List;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/x;->l:Ljava/lang/Integer;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/x;->m:Lu6/e0;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/x;->n:Lu6/h1;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/x;->o:Lu6/d;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/x;->p:Ljava/lang/Long;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    invoke-static {v0}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lu6/x;->K()[B

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Li6/c;->l(Landroid/os/Parcel;I[BZ)V

    invoke-virtual {p0}, Lu6/x;->N()Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, v3}, Li6/c;->p(Landroid/os/Parcel;ILjava/lang/Double;Z)V

    invoke-virtual {p0}, Lu6/x;->M()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lu6/x;->I()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x5

    invoke-static {p1, v2, v1, v3}, Li6/c;->J(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-virtual {p0}, Lu6/x;->L()Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {p1, v2, v1, v3}, Li6/c;->w(Landroid/os/Parcel;ILjava/lang/Integer;Z)V

    invoke-virtual {p0}, Lu6/x;->O()Lu6/e0;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lu6/x;->n:Lu6/h1;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lu6/h1;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const/16 v2, 0x8

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0x9

    invoke-virtual {p0}, Lu6/x;->J()Lu6/d;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 p2, 0xa

    iget-object v1, p0, Lu6/x;->p:Ljava/lang/Long;

    invoke-static {p1, p2, v1, v3}, Li6/c;->A(Landroid/os/Parcel;ILjava/lang/Long;Z)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
