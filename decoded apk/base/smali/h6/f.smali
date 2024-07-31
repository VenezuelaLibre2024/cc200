.class public Lh6/f;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lh6/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Lh6/u;

.field public final i:Z

.field public final j:Z

.field public final k:[I

.field public final l:I

.field public final m:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh6/n1;

    invoke-direct {v0}, Lh6/n1;-><init>()V

    sput-object v0, Lh6/f;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lh6/u;ZZ[II[I)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-object p1, p0, Lh6/f;->h:Lh6/u;

    iput-boolean p2, p0, Lh6/f;->i:Z

    iput-boolean p3, p0, Lh6/f;->j:Z

    iput-object p4, p0, Lh6/f;->k:[I

    iput p5, p0, Lh6/f;->l:I

    iput-object p6, p0, Lh6/f;->m:[I

    return-void
.end method


# virtual methods
.method public I()I
    .locals 1

    iget v0, p0, Lh6/f;->l:I

    return v0
.end method

.method public J()[I
    .locals 1

    iget-object v0, p0, Lh6/f;->k:[I

    return-object v0
.end method

.method public K()[I
    .locals 1

    iget-object v0, p0, Lh6/f;->m:[I

    return-object v0
.end method

.method public L()Z
    .locals 1

    iget-boolean v0, p0, Lh6/f;->i:Z

    return v0
.end method

.method public M()Z
    .locals 1

    iget-boolean v0, p0, Lh6/f;->j:Z

    return v0
.end method

.method public final N()Lh6/u;
    .locals 1

    iget-object v0, p0, Lh6/f;->h:Lh6/u;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lh6/f;->h:Lh6/u;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lh6/f;->L()Z

    move-result p2

    const/4 v1, 0x2

    invoke-static {p1, v1, p2}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lh6/f;->M()Z

    move-result p2

    const/4 v1, 0x3

    invoke-static {p1, v1, p2}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lh6/f;->J()[I

    move-result-object p2

    const/4 v1, 0x4

    invoke-static {p1, v1, p2, v3}, Li6/c;->v(Landroid/os/Parcel;I[IZ)V

    invoke-virtual {p0}, Lh6/f;->I()I

    move-result p2

    const/4 v1, 0x5

    invoke-static {p1, v1, p2}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lh6/f;->K()[I

    move-result-object p2

    const/4 v1, 0x6

    invoke-static {p1, v1, p2, v3}, Li6/c;->v(Landroid/os/Parcel;I[IZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
