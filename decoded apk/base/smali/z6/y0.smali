.class public final Lz6/y0;
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
    .locals 18

    move-object/from16 v0, p1

    invoke-static/range {p1 .. p1}, Li6/b;->N(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v7, v2

    move v9, v7

    move v8, v3

    move v10, v8

    move v11, v10

    move v12, v11

    move v15, v12

    move-object v6, v4

    move-object v13, v6

    move-object v14, v13

    move-object/from16 v16, v14

    move-object/from16 v17, v16

    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v1, :cond_0

    invoke-static/range {p1 .. p1}, Li6/b;->D(Landroid/os/Parcel;)I

    move-result v2

    invoke-static {v2}, Li6/b;->v(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    invoke-static {v0, v2}, Li6/b;->M(Landroid/os/Parcel;I)V

    goto :goto_0

    :pswitch_0
    sget-object v3, Lz6/z;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Li6/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v17

    goto :goto_0

    :pswitch_1
    sget-object v3, Lz6/o;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Li6/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v16

    goto :goto_0

    :pswitch_2
    invoke-static {v0, v2}, Li6/b;->F(Landroid/os/Parcel;I)I

    move-result v15

    goto :goto_0

    :pswitch_3
    sget-object v3, Lz6/e;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Li6/b;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lz6/e;

    goto :goto_0

    :pswitch_4
    sget-object v3, Lz6/e;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Li6/b;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lz6/e;

    goto :goto_0

    :pswitch_5
    invoke-static {v0, v2}, Li6/b;->w(Landroid/os/Parcel;I)Z

    move-result v12

    goto :goto_0

    :pswitch_6
    invoke-static {v0, v2}, Li6/b;->w(Landroid/os/Parcel;I)Z

    move-result v11

    goto :goto_0

    :pswitch_7
    invoke-static {v0, v2}, Li6/b;->w(Landroid/os/Parcel;I)Z

    move-result v10

    goto :goto_0

    :pswitch_8
    invoke-static {v0, v2}, Li6/b;->B(Landroid/os/Parcel;I)F

    move-result v9

    goto :goto_0

    :pswitch_9
    invoke-static {v0, v2}, Li6/b;->F(Landroid/os/Parcel;I)I

    move-result v8

    goto :goto_0

    :pswitch_a
    invoke-static {v0, v2}, Li6/b;->B(Landroid/os/Parcel;I)F

    move-result v7

    goto :goto_0

    :pswitch_b
    sget-object v3, Lcom/google/android/gms/maps/model/LatLng;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Li6/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v6

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Li6/b;->u(Landroid/os/Parcel;I)V

    new-instance v0, Lz6/t;

    move-object v5, v0

    invoke-direct/range {v5 .. v17}, Lz6/t;-><init>(Ljava/util/List;FIFZZZLz6/e;Lz6/e;ILjava/util/List;Ljava/util/List;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_b
        :pswitch_a
        :pswitch_9
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

    new-array p1, p1, [Lz6/t;

    return-object p1
.end method
