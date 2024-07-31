.class public Lu6/e;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lu6/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Lu6/g0;

.field public final i:Lu6/o1;

.field public final j:Lu6/f;

.field public final k:Lu6/q1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu6/l1;

    invoke-direct {v0}, Lu6/l1;-><init>()V

    sput-object v0, Lu6/e;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lu6/g0;Lu6/o1;Lu6/f;Lu6/q1;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-object p1, p0, Lu6/e;->h:Lu6/g0;

    iput-object p2, p0, Lu6/e;->i:Lu6/o1;

    iput-object p3, p0, Lu6/e;->j:Lu6/f;

    iput-object p4, p0, Lu6/e;->k:Lu6/q1;

    return-void
.end method


# virtual methods
.method public I()Lu6/f;
    .locals 1

    iget-object v0, p0, Lu6/e;->j:Lu6/f;

    return-object v0
.end method

.method public J()Lu6/g0;
    .locals 1

    iget-object v0, p0, Lu6/e;->h:Lu6/g0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lu6/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lu6/e;

    iget-object v0, p0, Lu6/e;->h:Lu6/g0;

    iget-object v2, p1, Lu6/e;->h:Lu6/g0;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/e;->i:Lu6/o1;

    iget-object v2, p1, Lu6/e;->i:Lu6/o1;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/e;->j:Lu6/f;

    iget-object v2, p1, Lu6/e;->j:Lu6/f;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/e;->k:Lu6/q1;

    iget-object p1, p1, Lu6/e;->k:Lu6/q1;

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

    iget-object v1, p0, Lu6/e;->h:Lu6/g0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/e;->i:Lu6/o1;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/e;->j:Lu6/f;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lu6/e;->k:Lu6/q1;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-static {v0}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lu6/e;->J()Lu6/g0;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lu6/e;->i:Lu6/o1;

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lu6/e;->I()Lu6/f;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lu6/e;->k:Lu6/q1;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
