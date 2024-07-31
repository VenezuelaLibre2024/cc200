.class public final Lz6/x0;
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
    .locals 14

    invoke-static {p1}, Li6/b;->N(Landroid/os/Parcel;)I

    move-result v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move v7, v1

    move-object v12, v2

    move v5, v4

    move v6, v5

    move v8, v6

    move v9, v8

    move v10, v9

    move v11, v10

    move v4, v7

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v1

    if-ge v1, v0, :cond_0

    invoke-static {p1}, Li6/b;->D(Landroid/os/Parcel;)I

    move-result v1

    invoke-static {v1}, Li6/b;->v(I)I

    move-result v13

    packed-switch v13, :pswitch_data_0

    invoke-static {p1, v1}, Li6/b;->M(Landroid/os/Parcel;I)V

    goto :goto_0

    :pswitch_0
    sget-object v12, Lz6/o;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v1, v12}, Li6/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v12

    goto :goto_0

    :pswitch_1
    invoke-static {p1, v1}, Li6/b;->F(Landroid/os/Parcel;I)I

    move-result v11

    goto :goto_0

    :pswitch_2
    invoke-static {p1, v1}, Li6/b;->w(Landroid/os/Parcel;I)Z

    move-result v10

    goto :goto_0

    :pswitch_3
    invoke-static {p1, v1}, Li6/b;->w(Landroid/os/Parcel;I)Z

    move-result v9

    goto :goto_0

    :pswitch_4
    invoke-static {p1, v1}, Li6/b;->w(Landroid/os/Parcel;I)Z

    move-result v8

    goto :goto_0

    :pswitch_5
    invoke-static {p1, v1}, Li6/b;->B(Landroid/os/Parcel;I)F

    move-result v7

    goto :goto_0

    :pswitch_6
    invoke-static {p1, v1}, Li6/b;->F(Landroid/os/Parcel;I)I

    move-result v6

    goto :goto_0

    :pswitch_7
    invoke-static {p1, v1}, Li6/b;->F(Landroid/os/Parcel;I)I

    move-result v5

    goto :goto_0

    :pswitch_8
    invoke-static {p1, v1}, Li6/b;->B(Landroid/os/Parcel;I)F

    move-result v4

    goto :goto_0

    :pswitch_9
    const-class v13, Lz6/x0;

    invoke-virtual {v13}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v13

    invoke-static {p1, v1, v3, v13}, Li6/b;->H(Landroid/os/Parcel;ILjava/util/List;Ljava/lang/ClassLoader;)V

    goto :goto_0

    :pswitch_a
    sget-object v2, Lcom/google/android/gms/maps/model/LatLng;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v1, v2}, Li6/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, Li6/b;->u(Landroid/os/Parcel;I)V

    new-instance p1, Lz6/r;

    move-object v1, p1

    invoke-direct/range {v1 .. v12}, Lz6/r;-><init>(Ljava/util/List;Ljava/util/List;FIIFZZZILjava/util/List;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x2
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

    new-array p1, p1, [Lz6/r;

    return-object p1
.end method
