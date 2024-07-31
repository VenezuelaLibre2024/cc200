.class public final Lz6/t;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz6/t;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Ljava/util/List;

.field public i:F

.field public j:I

.field public k:F

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Lz6/e;

.field public p:Lz6/e;

.field public q:I

.field public r:Ljava/util/List;

.field public s:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz6/y0;

    invoke-direct {v0}, Lz6/y0;-><init>()V

    sput-object v0, Lz6/t;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Li6/a;-><init>()V

    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lz6/t;->i:F

    const/high16 v0, -0x1000000

    iput v0, p0, Lz6/t;->j:I

    const/4 v0, 0x0

    iput v0, p0, Lz6/t;->k:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz6/t;->l:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz6/t;->m:Z

    iput-boolean v0, p0, Lz6/t;->n:Z

    new-instance v1, Lz6/d;

    invoke-direct {v1}, Lz6/d;-><init>()V

    iput-object v1, p0, Lz6/t;->o:Lz6/e;

    new-instance v1, Lz6/d;

    invoke-direct {v1}, Lz6/d;-><init>()V

    iput-object v1, p0, Lz6/t;->p:Lz6/e;

    iput v0, p0, Lz6/t;->q:I

    const/4 v0, 0x0

    iput-object v0, p0, Lz6/t;->r:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz6/t;->s:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz6/t;->h:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;FIFZZZLz6/e;Lz6/e;ILjava/util/List;Ljava/util/List;)V
    .locals 2

    invoke-direct {p0}, Li6/a;-><init>()V

    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lz6/t;->i:F

    const/high16 v0, -0x1000000

    iput v0, p0, Lz6/t;->j:I

    const/4 v0, 0x0

    iput v0, p0, Lz6/t;->k:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz6/t;->l:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz6/t;->m:Z

    iput-boolean v0, p0, Lz6/t;->n:Z

    new-instance v1, Lz6/d;

    invoke-direct {v1}, Lz6/d;-><init>()V

    iput-object v1, p0, Lz6/t;->o:Lz6/e;

    new-instance v1, Lz6/d;

    invoke-direct {v1}, Lz6/d;-><init>()V

    iput-object v1, p0, Lz6/t;->p:Lz6/e;

    iput v0, p0, Lz6/t;->q:I

    const/4 v0, 0x0

    iput-object v0, p0, Lz6/t;->r:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz6/t;->s:Ljava/util/List;

    iput-object p1, p0, Lz6/t;->h:Ljava/util/List;

    iput p2, p0, Lz6/t;->i:F

    iput p3, p0, Lz6/t;->j:I

    iput p4, p0, Lz6/t;->k:F

    iput-boolean p5, p0, Lz6/t;->l:Z

    iput-boolean p6, p0, Lz6/t;->m:Z

    iput-boolean p7, p0, Lz6/t;->n:Z

    if-eqz p8, :cond_0

    iput-object p8, p0, Lz6/t;->o:Lz6/e;

    :cond_0
    if-eqz p9, :cond_1

    iput-object p9, p0, Lz6/t;->p:Lz6/e;

    :cond_1
    iput p10, p0, Lz6/t;->q:I

    iput-object p11, p0, Lz6/t;->r:Ljava/util/List;

    if-eqz p12, :cond_2

    iput-object p12, p0, Lz6/t;->s:Ljava/util/List;

    :cond_2
    return-void
.end method


# virtual methods
.method public I(Ljava/lang/Iterable;)Lz6/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)",
            "Lz6/t;"
        }
    .end annotation

    const-string v0, "points must not be null."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v1, p0, Lz6/t;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public J(Z)Lz6/t;
    .locals 0

    iput-boolean p1, p0, Lz6/t;->n:Z

    return-object p0
.end method

.method public K(I)Lz6/t;
    .locals 0

    iput p1, p0, Lz6/t;->j:I

    return-object p0
.end method

.method public L(Lz6/e;)Lz6/t;
    .locals 1

    const-string v0, "endCap must not be null"

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz6/e;

    iput-object p1, p0, Lz6/t;->p:Lz6/e;

    return-object p0
.end method

.method public M(Z)Lz6/t;
    .locals 0

    iput-boolean p1, p0, Lz6/t;->m:Z

    return-object p0
.end method

.method public N()I
    .locals 1

    iget v0, p0, Lz6/t;->j:I

    return v0
.end method

.method public O()Lz6/e;
    .locals 1

    iget-object v0, p0, Lz6/t;->p:Lz6/e;

    invoke-virtual {v0}, Lz6/e;->I()Lz6/e;

    move-result-object v0

    return-object v0
.end method

.method public P()I
    .locals 1

    iget v0, p0, Lz6/t;->q:I

    return v0
.end method

.method public Q()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lz6/o;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz6/t;->r:Ljava/util/List;

    return-object v0
.end method

.method public R()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz6/t;->h:Ljava/util/List;

    return-object v0
.end method

.method public S()Lz6/e;
    .locals 1

    iget-object v0, p0, Lz6/t;->o:Lz6/e;

    invoke-virtual {v0}, Lz6/e;->I()Lz6/e;

    move-result-object v0

    return-object v0
.end method

.method public T()F
    .locals 1

    iget v0, p0, Lz6/t;->i:F

    return v0
.end method

.method public U()F
    .locals 1

    iget v0, p0, Lz6/t;->k:F

    return v0
.end method

.method public V()Z
    .locals 1

    iget-boolean v0, p0, Lz6/t;->n:Z

    return v0
.end method

.method public W()Z
    .locals 1

    iget-boolean v0, p0, Lz6/t;->m:Z

    return v0
.end method

.method public X()Z
    .locals 1

    iget-boolean v0, p0, Lz6/t;->l:Z

    return v0
.end method

.method public Y(I)Lz6/t;
    .locals 0

    iput p1, p0, Lz6/t;->q:I

    return-object p0
.end method

.method public Z(Ljava/util/List;)Lz6/t;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lz6/o;",
            ">;)",
            "Lz6/t;"
        }
    .end annotation

    iput-object p1, p0, Lz6/t;->r:Ljava/util/List;

    return-object p0
.end method

.method public a0(Lz6/e;)Lz6/t;
    .locals 1

    const-string v0, "startCap must not be null"

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz6/e;

    iput-object p1, p0, Lz6/t;->o:Lz6/e;

    return-object p0
.end method

.method public b0(Z)Lz6/t;
    .locals 0

    iput-boolean p1, p0, Lz6/t;->l:Z

    return-object p0
.end method

.method public c0(F)Lz6/t;
    .locals 0

    iput p1, p0, Lz6/t;->i:F

    return-object p0
.end method

.method public d0(F)Lz6/t;
    .locals 0

    iput p1, p0, Lz6/t;->k:F

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 8

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lz6/t;->R()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Li6/c;->J(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-virtual {p0}, Lz6/t;->T()F

    move-result v1

    const/4 v2, 0x3

    invoke-static {p1, v2, v1}, Li6/c;->q(Landroid/os/Parcel;IF)V

    invoke-virtual {p0}, Lz6/t;->N()I

    move-result v1

    const/4 v2, 0x4

    invoke-static {p1, v2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lz6/t;->U()F

    move-result v1

    const/4 v2, 0x5

    invoke-static {p1, v2, v1}, Li6/c;->q(Landroid/os/Parcel;IF)V

    invoke-virtual {p0}, Lz6/t;->X()Z

    move-result v1

    const/4 v2, 0x6

    invoke-static {p1, v2, v1}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lz6/t;->W()Z

    move-result v1

    const/4 v2, 0x7

    invoke-static {p1, v2, v1}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lz6/t;->V()Z

    move-result v1

    const/16 v2, 0x8

    invoke-static {p1, v2, v1}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lz6/t;->S()Lz6/e;

    move-result-object v1

    const/16 v2, 0x9

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lz6/t;->O()Lz6/e;

    move-result-object v1

    const/16 v2, 0xa

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lz6/t;->P()I

    move-result p2

    const/16 v1, 0xb

    invoke-static {p1, v1, p2}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lz6/t;->Q()Ljava/util/List;

    move-result-object p2

    const/16 v1, 0xc

    invoke-static {p1, v1, p2, v3}, Li6/c;->J(Landroid/os/Parcel;ILjava/util/List;Z)V

    new-instance p2, Ljava/util/ArrayList;

    iget-object v1, p0, Lz6/t;->s:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Lz6/t;->s:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz6/z;

    new-instance v4, Lz6/z;

    new-instance v5, Lz6/y$a;

    invoke-virtual {v2}, Lz6/z;->J()Lz6/y;

    move-result-object v6

    invoke-direct {v5, v6}, Lz6/y$a;-><init>(Lz6/y;)V

    iget v6, p0, Lz6/t;->i:F

    invoke-virtual {v5, v6}, Lz6/y$a;->c(F)Lz6/y$a;

    iget-boolean v6, p0, Lz6/t;->l:Z

    invoke-virtual {v5, v6}, Lz6/y$a;->b(Z)Lz6/y$a;

    invoke-virtual {v5}, Lz6/y$a;->a()Lz6/y;

    move-result-object v5

    invoke-virtual {v2}, Lz6/z;->I()D

    move-result-wide v6

    invoke-direct {v4, v5, v6, v7}, Lz6/z;-><init>(Lz6/y;D)V

    invoke-interface {p2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/16 v1, 0xd

    invoke-static {p1, v1, p2, v3}, Li6/c;->J(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
