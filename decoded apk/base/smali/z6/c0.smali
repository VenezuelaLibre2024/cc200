.class public final Lz6/c0;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz6/c0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public h:Lcom/google/android/gms/internal/maps/zzap;

.field public i:Lz6/d0;

.field public j:Z

.field public k:F

.field public l:Z

.field public m:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz6/l0;

    invoke-direct {v0}, Lz6/l0;-><init>()V

    sput-object v0, Lz6/c0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Li6/a;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz6/c0;->j:Z

    iput-boolean v0, p0, Lz6/c0;->l:Z

    const/4 v0, 0x0

    iput v0, p0, Lz6/c0;->m:F

    return-void
.end method

.method public constructor <init>(Landroid/os/IBinder;ZFZF)V
    .locals 1

    invoke-direct {p0}, Li6/a;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz6/c0;->j:Z

    iput-boolean v0, p0, Lz6/c0;->l:Z

    const/4 v0, 0x0

    iput v0, p0, Lz6/c0;->m:F

    invoke-static {p1}, Lcom/google/android/gms/internal/maps/zzao;->zzc(Landroid/os/IBinder;)Lcom/google/android/gms/internal/maps/zzap;

    move-result-object p1

    iput-object p1, p0, Lz6/c0;->h:Lcom/google/android/gms/internal/maps/zzap;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Lz6/j0;

    invoke-direct {p1, p0}, Lz6/j0;-><init>(Lz6/c0;)V

    :goto_0
    iput-object p1, p0, Lz6/c0;->i:Lz6/d0;

    iput-boolean p2, p0, Lz6/c0;->j:Z

    iput p3, p0, Lz6/c0;->k:F

    iput-boolean p4, p0, Lz6/c0;->l:Z

    iput p5, p0, Lz6/c0;->m:F

    return-void
.end method

.method public static bridge synthetic R(Lz6/c0;)Lcom/google/android/gms/internal/maps/zzap;
    .locals 0

    iget-object p0, p0, Lz6/c0;->h:Lcom/google/android/gms/internal/maps/zzap;

    return-object p0
.end method


# virtual methods
.method public I(Z)Lz6/c0;
    .locals 0

    iput-boolean p1, p0, Lz6/c0;->l:Z

    return-object p0
.end method

.method public J()Z
    .locals 1

    iget-boolean v0, p0, Lz6/c0;->l:Z

    return v0
.end method

.method public K()F
    .locals 1

    iget v0, p0, Lz6/c0;->m:F

    return v0
.end method

.method public L()F
    .locals 1

    iget v0, p0, Lz6/c0;->k:F

    return v0
.end method

.method public M()Z
    .locals 1

    iget-boolean v0, p0, Lz6/c0;->j:Z

    return v0
.end method

.method public N(Lz6/d0;)Lz6/c0;
    .locals 1

    const-string v0, "tileProvider must not be null."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/d0;

    iput-object v0, p0, Lz6/c0;->i:Lz6/d0;

    new-instance v0, Lz6/k0;

    invoke-direct {v0, p0, p1}, Lz6/k0;-><init>(Lz6/c0;Lz6/d0;)V

    iput-object v0, p0, Lz6/c0;->h:Lcom/google/android/gms/internal/maps/zzap;

    return-object p0
.end method

.method public O(F)Lz6/c0;
    .locals 2

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    const-string v0, "Transparency must be in the range [0..1]"

    invoke-static {v1, v0}, Lh6/s;->b(ZLjava/lang/Object;)V

    iput p1, p0, Lz6/c0;->m:F

    return-object p0
.end method

.method public P(Z)Lz6/c0;
    .locals 0

    iput-boolean p1, p0, Lz6/c0;->j:Z

    return-object p0
.end method

.method public Q(F)Lz6/c0;
    .locals 0

    iput p1, p0, Lz6/c0;->k:F

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lz6/c0;->h:Lcom/google/android/gms/internal/maps/zzap;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    :goto_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Li6/c;->t(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 v0, 0x3

    invoke-virtual {p0}, Lz6/c0;->M()Z

    move-result v1

    invoke-static {p1, v0, v1}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x4

    invoke-virtual {p0}, Lz6/c0;->L()F

    move-result v1

    invoke-static {p1, v0, v1}, Li6/c;->q(Landroid/os/Parcel;IF)V

    const/4 v0, 0x5

    invoke-virtual {p0}, Lz6/c0;->J()Z

    move-result v1

    invoke-static {p1, v0, v1}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x6

    invoke-virtual {p0}, Lz6/c0;->K()F

    move-result v1

    invoke-static {p1, v0, v1}, Li6/c;->q(Landroid/os/Parcel;IF)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
