.class public final Lw6/x0;
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
    .locals 41

    move-object/from16 v0, p1

    invoke-static/range {p1 .. p1}, Li6/b;->N(Landroid/os/Parcel;)I

    move-result v1

    new-instance v2, Landroid/os/WorkSource;

    invoke-direct {v2}, Landroid/os/WorkSource;-><init>()V

    const/4 v3, 0x0

    const-wide v4, 0x7fffffffffffffffL

    const/4 v6, 0x0

    const/16 v7, 0x66

    const-wide/32 v8, 0x36ee80

    const-wide/32 v10, 0x927c0

    const-wide/16 v12, 0x0

    const v14, 0x7fffffff

    const/4 v15, 0x0

    const-wide/16 v16, -0x1

    move-object/from16 v39, v2

    move-object/from16 v37, v3

    move-object/from16 v40, v37

    move-wide/from16 v26, v4

    move-wide/from16 v28, v26

    move/from16 v32, v6

    move/from16 v35, v32

    move/from16 v36, v35

    move/from16 v38, v36

    move/from16 v19, v7

    move-wide/from16 v20, v8

    move-wide/from16 v22, v10

    move-wide/from16 v24, v12

    move/from16 v30, v14

    move/from16 v31, v15

    move-wide/from16 v33, v16

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
    sget-object v3, Lcom/google/android/gms/internal/location/zzd;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Li6/b;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/location/zzd;

    move-object/from16 v40, v2

    goto :goto_0

    :pswitch_2
    sget-object v3, Landroid/os/WorkSource;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0, v2, v3}, Li6/b;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/os/WorkSource;

    move-object/from16 v39, v2

    goto :goto_0

    :pswitch_3
    invoke-static {v0, v2}, Li6/b;->w(Landroid/os/Parcel;I)Z

    move-result v2

    move/from16 v38, v2

    goto :goto_0

    :pswitch_4
    invoke-static {v0, v2}, Li6/b;->p(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v37, v2

    goto :goto_0

    :pswitch_5
    invoke-static {v0, v2}, Li6/b;->F(Landroid/os/Parcel;I)I

    move-result v2

    move/from16 v36, v2

    goto :goto_0

    :pswitch_6
    invoke-static {v0, v2}, Li6/b;->F(Landroid/os/Parcel;I)I

    move-result v2

    move/from16 v35, v2

    goto :goto_0

    :pswitch_7
    invoke-static {v0, v2}, Li6/b;->I(Landroid/os/Parcel;I)J

    move-result-wide v2

    move-wide/from16 v33, v2

    goto :goto_0

    :pswitch_8
    invoke-static {v0, v2}, Li6/b;->I(Landroid/os/Parcel;I)J

    move-result-wide v2

    move-wide/from16 v28, v2

    goto :goto_0

    :pswitch_9
    invoke-static {v0, v2}, Li6/b;->w(Landroid/os/Parcel;I)Z

    move-result v2

    move/from16 v32, v2

    goto :goto_0

    :pswitch_a
    invoke-static {v0, v2}, Li6/b;->I(Landroid/os/Parcel;I)J

    move-result-wide v2

    move-wide/from16 v24, v2

    goto :goto_0

    :pswitch_b
    invoke-static {v0, v2}, Li6/b;->B(Landroid/os/Parcel;I)F

    move-result v2

    move/from16 v31, v2

    goto :goto_0

    :pswitch_c
    invoke-static {v0, v2}, Li6/b;->F(Landroid/os/Parcel;I)I

    move-result v2

    move/from16 v30, v2

    goto :goto_0

    :pswitch_d
    invoke-static {v0, v2}, Li6/b;->I(Landroid/os/Parcel;I)J

    move-result-wide v2

    move-wide/from16 v26, v2

    goto :goto_0

    :pswitch_e
    invoke-static {v0, v2}, Li6/b;->I(Landroid/os/Parcel;I)J

    move-result-wide v2

    move-wide/from16 v22, v2

    goto :goto_0

    :pswitch_f
    invoke-static {v0, v2}, Li6/b;->I(Landroid/os/Parcel;I)J

    move-result-wide v2

    move-wide/from16 v20, v2

    goto/16 :goto_0

    :pswitch_10
    invoke-static {v0, v2}, Li6/b;->F(Landroid/os/Parcel;I)I

    move-result v2

    move/from16 v19, v2

    goto/16 :goto_0

    :cond_0
    invoke-static {v0, v1}, Li6/b;->u(Landroid/os/Parcel;I)V

    new-instance v0, Lcom/google/android/gms/location/LocationRequest;

    move-object/from16 v18, v0

    invoke-direct/range {v18 .. v40}, Lcom/google/android/gms/location/LocationRequest;-><init>(IJJJJJIFZJIILjava/lang/String;ZLandroid/os/WorkSource;Lcom/google/android/gms/internal/location/zzd;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_0
        :pswitch_d
        :pswitch_c
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
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/location/LocationRequest;

    return-object p1
.end method
