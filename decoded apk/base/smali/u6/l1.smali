.class public final Lu6/l1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 8

    invoke-static {p1}, Li6/b;->N(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    move-object v2, v1

    move-object v3, v2

    move-object v4, v3

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v0, :cond_4

    invoke-static {p1}, Li6/b;->D(Landroid/os/Parcel;)I

    move-result v5

    invoke-static {v5}, Li6/b;->v(I)I

    move-result v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_3

    const/4 v7, 0x2

    if-eq v6, v7, :cond_2

    const/4 v7, 0x3

    if-eq v6, v7, :cond_1

    const/4 v7, 0x4

    if-eq v6, v7, :cond_0

    invoke-static {p1, v5}, Li6/b;->M(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    sget-object v4, Lu6/q1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v5, v4}, Li6/b;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lu6/q1;

    goto :goto_0

    :cond_1
    sget-object v3, Lu6/f;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v5, v3}, Li6/b;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lu6/f;

    goto :goto_0

    :cond_2
    sget-object v2, Lu6/o1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v5, v2}, Li6/b;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lu6/o1;

    goto :goto_0

    :cond_3
    sget-object v1, Lu6/g0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v5, v1}, Li6/b;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lu6/g0;

    goto :goto_0

    :cond_4
    invoke-static {p1, v0}, Li6/b;->u(Landroid/os/Parcel;I)V

    new-instance p1, Lu6/e;

    invoke-direct {p1, v1, v2, v3, v4}, Lu6/e;-><init>(Lu6/g0;Lu6/o1;Lu6/f;Lu6/q1;)V

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lu6/e;

    return-object p1
.end method