.class public Lu6/a0;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lu6/a0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:[B

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu6/a1;

    invoke-direct {v0}, Lu6/a1;-><init>()V

    sput-object v0, Lu6/a0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    iput-object p1, p0, Lu6/a0;->h:[B

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lu6/a0;->i:Ljava/lang/String;

    iput-object p3, p0, Lu6/a0;->j:Ljava/lang/String;

    invoke-static {p4}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lu6/a0;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu6/a0;->j:Ljava/lang/String;

    return-object v0
.end method

.method public J()[B
    .locals 1

    iget-object v0, p0, Lu6/a0;->h:[B

    return-object v0
.end method

.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu6/a0;->i:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lu6/a0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lu6/a0;

    iget-object v0, p0, Lu6/a0;->h:[B

    iget-object v2, p1, Lu6/a0;->h:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/a0;->i:Ljava/lang/String;

    iget-object v2, p1, Lu6/a0;->i:Ljava/lang/String;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/a0;->j:Ljava/lang/String;

    iget-object v2, p1, Lu6/a0;->j:Ljava/lang/String;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/a0;->k:Ljava/lang/String;

    iget-object p1, p1, Lu6/a0;->k:Ljava/lang/String;

    invoke-static {v0, p1}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lu6/a0;->h:[B

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/a0;->i:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/a0;->j:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/a0;->k:Ljava/lang/String;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-static {v0}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu6/a0;->k:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lu6/a0;->J()[B

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Li6/c;->l(Landroid/os/Parcel;I[BZ)V

    invoke-virtual {p0}, Lu6/a0;->K()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lu6/a0;->I()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lu6/a0;->s()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method