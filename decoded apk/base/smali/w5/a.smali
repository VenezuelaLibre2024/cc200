.class public Lw5/a;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw5/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:I

.field public final i:Z

.field public final j:J

.field public final k:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw5/k;

    invoke-direct {v0}, Lw5/k;-><init>()V

    sput-object v0, Lw5/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZJZ)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput p1, p0, Lw5/a;->h:I

    iput-boolean p2, p0, Lw5/a;->i:Z

    iput-wide p3, p0, Lw5/a;->j:J

    iput-boolean p5, p0, Lw5/a;->k:Z

    return-void
.end method


# virtual methods
.method public I()J
    .locals 2

    iget-wide v0, p0, Lw5/a;->j:J

    return-wide v0
.end method

.method public J()Z
    .locals 1

    iget-boolean v0, p0, Lw5/a;->k:Z

    return v0
.end method

.method public K()Z
    .locals 1

    iget-boolean v0, p0, Lw5/a;->i:Z

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget v0, p0, Lw5/a;->h:I

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lw5/a;->K()Z

    move-result v0

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw5/a;->I()J

    move-result-wide v0

    const/4 v2, 0x3

    invoke-static {p1, v2, v0, v1}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    invoke-virtual {p0}, Lw5/a;->J()Z

    move-result v0

    const/4 v1, 0x4

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
