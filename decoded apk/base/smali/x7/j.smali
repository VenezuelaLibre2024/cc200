.class public final Lx7/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lx7/k;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 8

    invoke-static {p1}, Li6/b;->N(Landroid/os/Parcel;)I

    move-result v0

    const-wide/16 v1, 0x0

    move-wide v3, v1

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v5

    if-ge v5, v0, :cond_2

    invoke-static {p1}, Li6/b;->D(Landroid/os/Parcel;)I

    move-result v5

    invoke-static {v5}, Li6/b;->v(I)I

    move-result v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_1

    const/4 v7, 0x2

    if-eq v6, v7, :cond_0

    invoke-static {p1, v5}, Li6/b;->M(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v5}, Li6/b;->I(Landroid/os/Parcel;I)J

    move-result-wide v3

    goto :goto_0

    :cond_1
    invoke-static {p1, v5}, Li6/b;->I(Landroid/os/Parcel;I)J

    move-result-wide v1

    goto :goto_0

    :cond_2
    invoke-static {p1, v0}, Li6/b;->u(Landroid/os/Parcel;I)V

    new-instance p1, Lx7/k;

    invoke-direct {p1, v1, v2, v3, v4}, Lx7/k;-><init>(JJ)V

    return-object p1
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lx7/k;

    return-object p1
.end method
