.class public final Lu6/x0;
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
    .locals 12

    invoke-static {p1}, Li6/b;->N(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    move-object v3, v1

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    if-ge v1, v0, :cond_0

    invoke-static {p1}, Li6/b;->D(Landroid/os/Parcel;)I

    move-result v1

    invoke-static {v1}, Li6/b;->v(I)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    invoke-static {p1, v1}, Li6/b;->M(Landroid/os/Parcel;I)V

    goto :goto_0

    :pswitch_0
    invoke-static {p1, v1}, Li6/b;->J(Landroid/os/Parcel;I)Ljava/lang/Long;

    move-result-object v11

    goto :goto_0

    :pswitch_1
    sget-object v2, Lu6/d;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v1, v2}, Li6/b;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lu6/d;

    goto :goto_0

    :pswitch_2
    invoke-static {p1, v1}, Li6/b;->p(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v9

    goto :goto_0

    :pswitch_3
    sget-object v2, Lu6/e0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v1, v2}, Li6/b;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lu6/e0;

    goto :goto_0

    :pswitch_4
    invoke-static {p1, v1}, Li6/b;->G(Landroid/os/Parcel;I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_0

    :pswitch_5
    sget-object v2, Lu6/v;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v1, v2}, Li6/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v6

    goto :goto_0

    :pswitch_6
    invoke-static {p1, v1}, Li6/b;->p(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :pswitch_7
    invoke-static {p1, v1}, Li6/b;->A(Landroid/os/Parcel;I)Ljava/lang/Double;

    move-result-object v4

    goto :goto_0

    :pswitch_8
    invoke-static {p1, v1}, Li6/b;->g(Landroid/os/Parcel;I)[B

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, Li6/b;->u(Landroid/os/Parcel;I)V

    new-instance p1, Lu6/x;

    move-object v2, p1

    invoke-direct/range {v2 .. v11}, Lu6/x;-><init>([BLjava/lang/Double;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lu6/e0;Ljava/lang/String;Lu6/d;Ljava/lang/Long;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lu6/x;

    return-object p1
.end method
