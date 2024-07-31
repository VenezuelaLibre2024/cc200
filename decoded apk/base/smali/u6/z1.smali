.class public final Lu6/z1;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lu6/z1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:J

.field public final i:[B

.field public final j:[B

.field public final k:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu6/a2;

    invoke-direct {v0}, Lu6/a2;-><init>()V

    sput-object v0, Lu6/z1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(J[B[B[B)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-wide p1, p0, Lu6/z1;->h:J

    invoke-static {p3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lu6/z1;->i:[B

    invoke-static {p4}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lu6/z1;->j:[B

    invoke-static {p5}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lu6/z1;->k:[B

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, Lu6/z1;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lu6/z1;

    iget-wide v2, p0, Lu6/z1;->h:J

    iget-wide v4, p1, Lu6/z1;->h:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget-object v0, p0, Lu6/z1;->i:[B

    iget-object v2, p1, Lu6/z1;->i:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/z1;->j:[B

    iget-object v2, p1, Lu6/z1;->j:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/z1;->k:[B

    iget-object p1, p1, Lu6/z1;->k:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    iget-wide v1, p0, Lu6/z1;->h:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/z1;->i:[B

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/z1;->j:[B

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/z1;->k:[B

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-static {v0}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-wide v0, p0, Lu6/z1;->h:J

    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1}, Li6/c;->y(Landroid/os/Parcel;IJ)V

    iget-object v0, p0, Lu6/z1;->i:[B

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Li6/c;->l(Landroid/os/Parcel;I[BZ)V

    iget-object v0, p0, Lu6/z1;->j:[B

    const/4 v1, 0x3

    invoke-static {p1, v1, v0, v2}, Li6/c;->l(Landroid/os/Parcel;I[BZ)V

    iget-object v0, p0, Lu6/z1;->k:[B

    const/4 v1, 0x4

    invoke-static {p1, v1, v0, v2}, Li6/c;->l(Landroid/os/Parcel;I[BZ)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
