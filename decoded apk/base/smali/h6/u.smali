.class public Lh6/u;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lh6/u;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:I

.field public final i:Z

.field public final j:Z

.field public final k:I

.field public final l:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh6/e1;

    invoke-direct {v0}, Lh6/e1;-><init>()V

    sput-object v0, Lh6/u;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZZII)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput p1, p0, Lh6/u;->h:I

    iput-boolean p2, p0, Lh6/u;->i:Z

    iput-boolean p3, p0, Lh6/u;->j:Z

    iput p4, p0, Lh6/u;->k:I

    iput p5, p0, Lh6/u;->l:I

    return-void
.end method


# virtual methods
.method public I()I
    .locals 1

    iget v0, p0, Lh6/u;->k:I

    return v0
.end method

.method public J()I
    .locals 1

    iget v0, p0, Lh6/u;->l:I

    return v0
.end method

.method public K()Z
    .locals 1

    iget-boolean v0, p0, Lh6/u;->i:Z

    return v0
.end method

.method public L()Z
    .locals 1

    iget-boolean v0, p0, Lh6/u;->j:Z

    return v0
.end method

.method public M()I
    .locals 1

    iget v0, p0, Lh6/u;->h:I

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lh6/u;->M()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lh6/u;->K()Z

    move-result v0

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lh6/u;->L()Z

    move-result v0

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lh6/u;->I()I

    move-result v0

    const/4 v1, 0x4

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lh6/u;->J()I

    move-result v0

    const/4 v1, 0x5

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
