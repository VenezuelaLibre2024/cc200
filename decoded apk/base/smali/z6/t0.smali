.class public final Lz6/t0;
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
    .locals 27

    move-object/from16 v0, p1

    invoke-static/range {p1 .. p1}, Li6/b;->N(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v6, 0x3f000000    # 0.5f

    move v14, v2

    move v15, v14

    move/from16 v16, v15

    move/from16 v22, v16

    move/from16 v24, v22

    move-object v8, v3

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object/from16 v23, v11

    move-object/from16 v25, v23

    move v12, v4

    move v13, v12

    move/from16 v17, v13

    move/from16 v19, v17

    move/from16 v21, v19

    move/from16 v26, v21

    move/from16 v20, v5

    move/from16 v18, v6

    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v1, :cond_0

    invoke-static/range {p1 .. p1}, Li6/b;->D(Landroid/os/Parcel;)I

    move-result v2

    invoke-static {v2}, Li6/b;->v(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    :pswitch_0
    invoke-static {v0, v2}, Li6/b;->M(Landroid/os/Parcel;I)V

    goto :goto_0

    :pswitch_1
    invoke-static {v0, v2}, Li6/b;->B(Landroid/os/Parcel;I)F

    move-result v26

    goto :goto_0

    :pswitch_2
    invoke-static {v0, v2}, Li6/b;->p(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v25

    goto :goto_0

    :pswitch_3
    invoke-static {v0, v2}, Li6/b;->F(Landroid/os/Parcel;I)I

    move-result v24

    goto :goto_0

    :pswitch_4
    invoke-static {v0, v2}, Li6/b;->E(Landroid/os/Parcel;I)Landroid/os/IBinder;

    move-result-object v23

    goto :goto_0

    :pswitch_5
    invoke-static {v0, v2}, Li6/b;->F(Landroid/os/Parcel;I)I

    move-result v22

    goto :goto_0

    :pswitch_6
    invoke-static {v0, v2}, Li6/b;->B(Landroid/os/Parcel;I)F

    move-result v21

    goto :goto_0

    :pswitch_7
    invoke-static {v0, v2}, Li6/b;->B(Landroid/os/Parcel;I)F

    move-result v20

    goto :goto_0

    :pswitch_8
    invoke-static {v0, v2}, Li6/b;->B(Landroid/os/Parcel;I)F

    move-result v19

    goto :goto_0

    :pswitch_9
    invoke-static {v0, v2}, Li6/b;->B(Landroid/os/Parcel;I)F

    move-result v18

    goto :goto_0

    :pswitch_a
    invoke-static {v0, v2}, Li6/b;->B(Landroid/os/Parcel;I)F

    move-result v17

    goto :goto_0

    :pswitch_b
    invoke-static {v0, v2}, Li6/b;->w(Landroid/os/Parcel;I)Z

    move-result v16

    goto :goto_0

    :pswitch_c
    invoke-static {v0, v2}, Li6/b;->w(Landroid/os/Parcel;I)Z

    move-result v15

    goto :goto_0

    :pswitch_d
    invoke-static {v0, v2}, Li6/b;->w(Landroid/os/Parcel;I)Z

    move-result v14

    goto :goto_0

    :pswitch_e
    invoke-static {v0, v2}, Li6/b;->B(Landroid/os/Parcel;I)F

    move-result v13

    goto :goto_0

    :pswitch_f
    invoke-static {v0, v2}, Li6/b;->B(Landroid/os/Parcel;I)F

    move-result v12

    goto :goto_0

    :pswitch_10
    invoke-static {v0, v2}, Li6/b;->E(Landroid/os/Parcel;I)Landroid/os/IBinder;

    move-result-object v11

    goto :goto_0

    :pswitch_11
    invoke-static {v0, v2}, Li6/b;->p(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v10

    goto :goto_0

    :pswitch_12
    invoke-static {v0, v2}, Li6/b;->p(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v9

    goto :goto_0

    :pswitch_13
    sget-object v3, Lcom/google/android/gms/maps/model/LatLng;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Li6/b;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lcom/google/android/gms/maps/model/LatLng;

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Li6/b;->u(Landroid/os/Parcel;I)V

    new-instance v0, Lz6/n;

    move-object v7, v0

    invoke-direct/range {v7 .. v26}, Lz6/n;-><init>(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Ljava/lang/String;Landroid/os/IBinder;FFZZZFFFFFILandroid/os/IBinder;ILjava/lang/String;F)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lz6/n;

    return-object p1
.end method
