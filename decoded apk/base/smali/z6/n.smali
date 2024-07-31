.class public Lz6/n;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz6/n;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public h:Lcom/google/android/gms/maps/model/LatLng;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Lz6/b;

.field public l:F

.field public m:F

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:F

.field public r:F

.field public s:F

.field public t:F

.field public u:F

.field public v:I

.field public w:Landroid/view/View;

.field public x:I

.field public y:Ljava/lang/String;

.field public z:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz6/t0;

    invoke-direct {v0}, Lz6/t0;-><init>()V

    sput-object v0, Lz6/n;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Li6/a;-><init>()V

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lz6/n;->l:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lz6/n;->m:F

    const/4 v2, 0x1

    iput-boolean v2, p0, Lz6/n;->o:Z

    const/4 v2, 0x0

    iput-boolean v2, p0, Lz6/n;->p:Z

    const/4 v3, 0x0

    iput v3, p0, Lz6/n;->q:F

    iput v0, p0, Lz6/n;->r:F

    iput v3, p0, Lz6/n;->s:F

    iput v1, p0, Lz6/n;->t:F

    iput v2, p0, Lz6/n;->v:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Ljava/lang/String;Landroid/os/IBinder;FFZZZFFFFFILandroid/os/IBinder;ILjava/lang/String;F)V
    .locals 5

    move-object v0, p0

    invoke-direct {p0}, Li6/a;-><init>()V

    const/high16 v1, 0x3f000000    # 0.5f

    iput v1, v0, Lz6/n;->l:F

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v0, Lz6/n;->m:F

    const/4 v3, 0x1

    iput-boolean v3, v0, Lz6/n;->o:Z

    const/4 v3, 0x0

    iput-boolean v3, v0, Lz6/n;->p:Z

    const/4 v4, 0x0

    iput v4, v0, Lz6/n;->q:F

    iput v1, v0, Lz6/n;->r:F

    iput v4, v0, Lz6/n;->s:F

    iput v2, v0, Lz6/n;->t:F

    iput v3, v0, Lz6/n;->v:I

    move-object v1, p1

    iput-object v1, v0, Lz6/n;->h:Lcom/google/android/gms/maps/model/LatLng;

    move-object v1, p2

    iput-object v1, v0, Lz6/n;->i:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, Lz6/n;->j:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez p4, :cond_0

    iput-object v1, v0, Lz6/n;->k:Lz6/b;

    goto :goto_0

    :cond_0
    new-instance v2, Lz6/b;

    invoke-static {p4}, Lr6/b$a;->c(Landroid/os/IBinder;)Lr6/b;

    move-result-object v3

    invoke-direct {v2, v3}, Lz6/b;-><init>(Lr6/b;)V

    iput-object v2, v0, Lz6/n;->k:Lz6/b;

    :goto_0
    move v2, p5

    iput v2, v0, Lz6/n;->l:F

    move v2, p6

    iput v2, v0, Lz6/n;->m:F

    move v2, p7

    iput-boolean v2, v0, Lz6/n;->n:Z

    move v2, p8

    iput-boolean v2, v0, Lz6/n;->o:Z

    move v2, p9

    iput-boolean v2, v0, Lz6/n;->p:Z

    move v2, p10

    iput v2, v0, Lz6/n;->q:F

    move/from16 v2, p11

    iput v2, v0, Lz6/n;->r:F

    move/from16 v2, p12

    iput v2, v0, Lz6/n;->s:F

    move/from16 v2, p13

    iput v2, v0, Lz6/n;->t:F

    move/from16 v2, p14

    iput v2, v0, Lz6/n;->u:F

    move/from16 v2, p17

    iput v2, v0, Lz6/n;->x:I

    move/from16 v2, p15

    iput v2, v0, Lz6/n;->v:I

    invoke-static/range {p16 .. p16}, Lr6/b$a;->c(Landroid/os/IBinder;)Lr6/b;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v2}, Lr6/d;->e(Lr6/b;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    :goto_1
    iput-object v1, v0, Lz6/n;->w:Landroid/view/View;

    move-object/from16 v1, p18

    iput-object v1, v0, Lz6/n;->y:Ljava/lang/String;

    move/from16 v1, p19

    iput v1, v0, Lz6/n;->z:F

    return-void
.end method


# virtual methods
.method public I(F)Lz6/n;
    .locals 0

    iput p1, p0, Lz6/n;->t:F

    return-object p0
.end method

.method public J(FF)Lz6/n;
    .locals 0

    iput p1, p0, Lz6/n;->l:F

    iput p2, p0, Lz6/n;->m:F

    return-object p0
.end method

.method public K(Z)Lz6/n;
    .locals 0

    iput-boolean p1, p0, Lz6/n;->n:Z

    return-object p0
.end method

.method public L(Z)Lz6/n;
    .locals 0

    iput-boolean p1, p0, Lz6/n;->p:Z

    return-object p0
.end method

.method public M()F
    .locals 1

    iget v0, p0, Lz6/n;->t:F

    return v0
.end method

.method public N()F
    .locals 1

    iget v0, p0, Lz6/n;->l:F

    return v0
.end method

.method public O()F
    .locals 1

    iget v0, p0, Lz6/n;->m:F

    return v0
.end method

.method public P()Lz6/b;
    .locals 1

    iget-object v0, p0, Lz6/n;->k:Lz6/b;

    return-object v0
.end method

.method public Q()F
    .locals 1

    iget v0, p0, Lz6/n;->r:F

    return v0
.end method

.method public R()F
    .locals 1

    iget v0, p0, Lz6/n;->s:F

    return v0
.end method

.method public S()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    iget-object v0, p0, Lz6/n;->h:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method public T()F
    .locals 1

    iget v0, p0, Lz6/n;->q:F

    return v0
.end method

.method public U()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz6/n;->j:Ljava/lang/String;

    return-object v0
.end method

.method public V()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz6/n;->i:Ljava/lang/String;

    return-object v0
.end method

.method public W()F
    .locals 1

    iget v0, p0, Lz6/n;->u:F

    return v0
.end method

.method public X(Lz6/b;)Lz6/n;
    .locals 0

    iput-object p1, p0, Lz6/n;->k:Lz6/b;

    return-object p0
.end method

.method public Y(FF)Lz6/n;
    .locals 0

    iput p1, p0, Lz6/n;->r:F

    iput p2, p0, Lz6/n;->s:F

    return-object p0
.end method

.method public Z()Z
    .locals 1

    iget-boolean v0, p0, Lz6/n;->n:Z

    return v0
.end method

.method public a0()Z
    .locals 1

    iget-boolean v0, p0, Lz6/n;->p:Z

    return v0
.end method

.method public b0()Z
    .locals 1

    iget-boolean v0, p0, Lz6/n;->o:Z

    return v0
.end method

.method public c0(Lcom/google/android/gms/maps/model/LatLng;)Lz6/n;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lz6/n;->h:Lcom/google/android/gms/maps/model/LatLng;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "latlng cannot be null - a position is required."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d0(F)Lz6/n;
    .locals 0

    iput p1, p0, Lz6/n;->q:F

    return-object p0
.end method

.method public e0(Ljava/lang/String;)Lz6/n;
    .locals 0

    iput-object p1, p0, Lz6/n;->j:Ljava/lang/String;

    return-object p0
.end method

.method public f0(Ljava/lang/String;)Lz6/n;
    .locals 0

    iput-object p1, p0, Lz6/n;->i:Ljava/lang/String;

    return-object p0
.end method

.method public g0(Z)Lz6/n;
    .locals 0

    iput-boolean p1, p0, Lz6/n;->o:Z

    return-object p0
.end method

.method public h0(F)Lz6/n;
    .locals 0

    iput p1, p0, Lz6/n;->u:F

    return-object p0
.end method

.method public final i0()I
    .locals 1

    iget v0, p0, Lz6/n;->x:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lz6/n;->S()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lz6/n;->V()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x3

    invoke-static {p1, v1, p2, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lz6/n;->U()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x4

    invoke-static {p1, v1, p2, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object p2, p0, Lz6/n;->k:Lz6/b;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lz6/b;->a()Lr6/b;

    move-result-object p2

    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    :goto_0
    const/4 v1, 0x5

    invoke-static {p1, v1, p2, v3}, Li6/c;->t(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 p2, 0x6

    invoke-virtual {p0}, Lz6/n;->N()F

    move-result v1

    invoke-static {p1, p2, v1}, Li6/c;->q(Landroid/os/Parcel;IF)V

    const/4 p2, 0x7

    invoke-virtual {p0}, Lz6/n;->O()F

    move-result v1

    invoke-static {p1, p2, v1}, Li6/c;->q(Landroid/os/Parcel;IF)V

    const/16 p2, 0x8

    invoke-virtual {p0}, Lz6/n;->Z()Z

    move-result v1

    invoke-static {p1, p2, v1}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x9

    invoke-virtual {p0}, Lz6/n;->b0()Z

    move-result v1

    invoke-static {p1, p2, v1}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    const/16 p2, 0xa

    invoke-virtual {p0}, Lz6/n;->a0()Z

    move-result v1

    invoke-static {p1, p2, v1}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    const/16 p2, 0xb

    invoke-virtual {p0}, Lz6/n;->T()F

    move-result v1

    invoke-static {p1, p2, v1}, Li6/c;->q(Landroid/os/Parcel;IF)V

    const/16 p2, 0xc

    invoke-virtual {p0}, Lz6/n;->Q()F

    move-result v1

    invoke-static {p1, p2, v1}, Li6/c;->q(Landroid/os/Parcel;IF)V

    const/16 p2, 0xd

    invoke-virtual {p0}, Lz6/n;->R()F

    move-result v1

    invoke-static {p1, p2, v1}, Li6/c;->q(Landroid/os/Parcel;IF)V

    const/16 p2, 0xe

    invoke-virtual {p0}, Lz6/n;->M()F

    move-result v1

    invoke-static {p1, p2, v1}, Li6/c;->q(Landroid/os/Parcel;IF)V

    const/16 p2, 0xf

    invoke-virtual {p0}, Lz6/n;->W()F

    move-result v1

    invoke-static {p1, p2, v1}, Li6/c;->q(Landroid/os/Parcel;IF)V

    const/16 p2, 0x11

    iget v1, p0, Lz6/n;->v:I

    invoke-static {p1, p2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    const/16 p2, 0x12

    iget-object v1, p0, Lz6/n;->w:Landroid/view/View;

    invoke-static {v1}, Lr6/d;->g(Ljava/lang/Object;)Lr6/b;

    move-result-object v1

    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    invoke-static {p1, p2, v1, v3}, Li6/c;->t(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/16 p2, 0x13

    iget v1, p0, Lz6/n;->x:I

    invoke-static {p1, p2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    const/16 p2, 0x14

    iget-object v1, p0, Lz6/n;->y:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 p2, 0x15

    iget v1, p0, Lz6/n;->z:F

    invoke-static {p1, p2, v1}, Li6/c;->q(Landroid/os/Parcel;IF)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
