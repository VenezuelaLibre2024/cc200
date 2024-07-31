.class public final Lz6/r;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz6/r;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Ljava/util/List;

.field public final i:Ljava/util/List;

.field public j:F

.field public k:I

.field public l:I

.field public m:F

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:I

.field public r:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz6/x0;

    invoke-direct {v0}, Lz6/x0;-><init>()V

    sput-object v0, Lz6/r;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Li6/a;-><init>()V

    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lz6/r;->j:F

    const/high16 v0, -0x1000000

    iput v0, p0, Lz6/r;->k:I

    const/4 v0, 0x0

    iput v0, p0, Lz6/r;->l:I

    const/4 v1, 0x0

    iput v1, p0, Lz6/r;->m:F

    const/4 v1, 0x1

    iput-boolean v1, p0, Lz6/r;->n:Z

    iput-boolean v0, p0, Lz6/r;->o:Z

    iput-boolean v0, p0, Lz6/r;->p:Z

    iput v0, p0, Lz6/r;->q:I

    const/4 v0, 0x0

    iput-object v0, p0, Lz6/r;->r:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz6/r;->h:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz6/r;->i:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;FIIFZZZILjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-object p1, p0, Lz6/r;->h:Ljava/util/List;

    iput-object p2, p0, Lz6/r;->i:Ljava/util/List;

    iput p3, p0, Lz6/r;->j:F

    iput p4, p0, Lz6/r;->k:I

    iput p5, p0, Lz6/r;->l:I

    iput p6, p0, Lz6/r;->m:F

    iput-boolean p7, p0, Lz6/r;->n:Z

    iput-boolean p8, p0, Lz6/r;->o:Z

    iput-boolean p9, p0, Lz6/r;->p:Z

    iput p10, p0, Lz6/r;->q:I

    iput-object p11, p0, Lz6/r;->r:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public I(Ljava/lang/Iterable;)Lz6/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)",
            "Lz6/r;"
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

    iget-object v1, p0, Lz6/r;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public J(Ljava/lang/Iterable;)Lz6/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)",
            "Lz6/r;"
        }
    .end annotation

    const-string v0, "points must not be null."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lz6/r;->i:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public K(Z)Lz6/r;
    .locals 0

    iput-boolean p1, p0, Lz6/r;->p:Z

    return-object p0
.end method

.method public L(I)Lz6/r;
    .locals 0

    iput p1, p0, Lz6/r;->l:I

    return-object p0
.end method

.method public M(Z)Lz6/r;
    .locals 0

    iput-boolean p1, p0, Lz6/r;->o:Z

    return-object p0
.end method

.method public N()I
    .locals 1

    iget v0, p0, Lz6/r;->l:I

    return v0
.end method

.method public O()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz6/r;->h:Ljava/util/List;

    return-object v0
.end method

.method public P()I
    .locals 1

    iget v0, p0, Lz6/r;->k:I

    return v0
.end method

.method public Q()I
    .locals 1

    iget v0, p0, Lz6/r;->q:I

    return v0
.end method

.method public R()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lz6/o;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz6/r;->r:Ljava/util/List;

    return-object v0
.end method

.method public S()F
    .locals 1

    iget v0, p0, Lz6/r;->j:F

    return v0
.end method

.method public T()F
    .locals 1

    iget v0, p0, Lz6/r;->m:F

    return v0
.end method

.method public U()Z
    .locals 1

    iget-boolean v0, p0, Lz6/r;->p:Z

    return v0
.end method

.method public V()Z
    .locals 1

    iget-boolean v0, p0, Lz6/r;->o:Z

    return v0
.end method

.method public W()Z
    .locals 1

    iget-boolean v0, p0, Lz6/r;->n:Z

    return v0
.end method

.method public X(I)Lz6/r;
    .locals 0

    iput p1, p0, Lz6/r;->k:I

    return-object p0
.end method

.method public Y(F)Lz6/r;
    .locals 0

    iput p1, p0, Lz6/r;->j:F

    return-object p0
.end method

.method public Z(Z)Lz6/r;
    .locals 0

    iput-boolean p1, p0, Lz6/r;->n:Z

    return-object p0
.end method

.method public a0(F)Lz6/r;
    .locals 0

    iput p1, p0, Lz6/r;->m:F

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lz6/r;->O()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Li6/c;->J(Landroid/os/Parcel;ILjava/util/List;Z)V

    iget-object v0, p0, Lz6/r;->i:Ljava/util/List;

    const/4 v1, 0x3

    invoke-static {p1, v1, v0, v2}, Li6/c;->x(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-virtual {p0}, Lz6/r;->S()F

    move-result v0

    const/4 v1, 0x4

    invoke-static {p1, v1, v0}, Li6/c;->q(Landroid/os/Parcel;IF)V

    invoke-virtual {p0}, Lz6/r;->P()I

    move-result v0

    const/4 v1, 0x5

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lz6/r;->N()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lz6/r;->T()F

    move-result v0

    const/4 v1, 0x7

    invoke-static {p1, v1, v0}, Li6/c;->q(Landroid/os/Parcel;IF)V

    invoke-virtual {p0}, Lz6/r;->W()Z

    move-result v0

    const/16 v1, 0x8

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lz6/r;->V()Z

    move-result v0

    const/16 v1, 0x9

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lz6/r;->U()Z

    move-result v0

    const/16 v1, 0xa

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lz6/r;->Q()I

    move-result v0

    const/16 v1, 0xb

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lz6/r;->R()Ljava/util/List;

    move-result-object v0

    const/16 v1, 0xc

    invoke-static {p1, v1, v0, v2}, Li6/c;->J(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
