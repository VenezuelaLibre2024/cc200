.class public final Lz6/g;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz6/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public h:Lcom/google/android/gms/maps/model/LatLng;

.field public i:D

.field public j:F

.field public k:I

.field public l:I

.field public m:F

.field public n:Z

.field public o:Z

.field public p:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz6/o0;

    invoke-direct {v0}, Lz6/o0;-><init>()V

    sput-object v0, Lz6/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Li6/a;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lz6/g;->h:Lcom/google/android/gms/maps/model/LatLng;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lz6/g;->i:D

    const/high16 v1, 0x41200000    # 10.0f

    iput v1, p0, Lz6/g;->j:F

    const/high16 v1, -0x1000000

    iput v1, p0, Lz6/g;->k:I

    const/4 v1, 0x0

    iput v1, p0, Lz6/g;->l:I

    const/4 v2, 0x0

    iput v2, p0, Lz6/g;->m:F

    const/4 v2, 0x1

    iput-boolean v2, p0, Lz6/g;->n:Z

    iput-boolean v1, p0, Lz6/g;->o:Z

    iput-object v0, p0, Lz6/g;->p:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/maps/model/LatLng;DFIIFZZLjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-object p1, p0, Lz6/g;->h:Lcom/google/android/gms/maps/model/LatLng;

    iput-wide p2, p0, Lz6/g;->i:D

    iput p4, p0, Lz6/g;->j:F

    iput p5, p0, Lz6/g;->k:I

    iput p6, p0, Lz6/g;->l:I

    iput p7, p0, Lz6/g;->m:F

    iput-boolean p8, p0, Lz6/g;->n:Z

    iput-boolean p9, p0, Lz6/g;->o:Z

    iput-object p10, p0, Lz6/g;->p:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public I(Lcom/google/android/gms/maps/model/LatLng;)Lz6/g;
    .locals 1

    const-string v0, "center must not be null."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lz6/g;->h:Lcom/google/android/gms/maps/model/LatLng;

    return-object p0
.end method

.method public J(Z)Lz6/g;
    .locals 0

    iput-boolean p1, p0, Lz6/g;->o:Z

    return-object p0
.end method

.method public K(I)Lz6/g;
    .locals 0

    iput p1, p0, Lz6/g;->l:I

    return-object p0
.end method

.method public L()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    iget-object v0, p0, Lz6/g;->h:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method public M()I
    .locals 1

    iget v0, p0, Lz6/g;->l:I

    return v0
.end method

.method public N()D
    .locals 2

    iget-wide v0, p0, Lz6/g;->i:D

    return-wide v0
.end method

.method public O()I
    .locals 1

    iget v0, p0, Lz6/g;->k:I

    return v0
.end method

.method public P()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lz6/o;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz6/g;->p:Ljava/util/List;

    return-object v0
.end method

.method public Q()F
    .locals 1

    iget v0, p0, Lz6/g;->j:F

    return v0
.end method

.method public R()F
    .locals 1

    iget v0, p0, Lz6/g;->m:F

    return v0
.end method

.method public S()Z
    .locals 1

    iget-boolean v0, p0, Lz6/g;->o:Z

    return v0
.end method

.method public T()Z
    .locals 1

    iget-boolean v0, p0, Lz6/g;->n:Z

    return v0
.end method

.method public U(D)Lz6/g;
    .locals 0

    iput-wide p1, p0, Lz6/g;->i:D

    return-object p0
.end method

.method public V(I)Lz6/g;
    .locals 0

    iput p1, p0, Lz6/g;->k:I

    return-object p0
.end method

.method public W(F)Lz6/g;
    .locals 0

    iput p1, p0, Lz6/g;->j:F

    return-object p0
.end method

.method public X(Z)Lz6/g;
    .locals 0

    iput-boolean p1, p0, Lz6/g;->n:Z

    return-object p0
.end method

.method public Y(F)Lz6/g;
    .locals 0

    iput p1, p0, Lz6/g;->m:F

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lz6/g;->L()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lz6/g;->N()D

    move-result-wide v1

    const/4 p2, 0x3

    invoke-static {p1, p2, v1, v2}, Li6/c;->n(Landroid/os/Parcel;ID)V

    invoke-virtual {p0}, Lz6/g;->Q()F

    move-result p2

    const/4 v1, 0x4

    invoke-static {p1, v1, p2}, Li6/c;->q(Landroid/os/Parcel;IF)V

    invoke-virtual {p0}, Lz6/g;->O()I

    move-result p2

    const/4 v1, 0x5

    invoke-static {p1, v1, p2}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lz6/g;->M()I

    move-result p2

    const/4 v1, 0x6

    invoke-static {p1, v1, p2}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lz6/g;->R()F

    move-result p2

    const/4 v1, 0x7

    invoke-static {p1, v1, p2}, Li6/c;->q(Landroid/os/Parcel;IF)V

    invoke-virtual {p0}, Lz6/g;->T()Z

    move-result p2

    const/16 v1, 0x8

    invoke-static {p1, v1, p2}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lz6/g;->S()Z

    move-result p2

    const/16 v1, 0x9

    invoke-static {p1, v1, p2}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lz6/g;->P()Ljava/util/List;

    move-result-object p2

    const/16 v1, 0xa

    invoke-static {p1, v1, p2, v3}, Li6/c;->J(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
