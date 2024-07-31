.class public Lp4/m$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp4/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lp4/m;",
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
.method public a(Landroid/os/Parcel;)Lp4/m;
    .locals 2

    new-instance v0, Lp4/m;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lp4/m;-><init>(Landroid/os/Parcel;Lp4/m$a;)V

    return-object v0
.end method

.method public b(I)[Lp4/m;
    .locals 0

    new-array p1, p1, [Lp4/m;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lp4/m$a;->a(Landroid/os/Parcel;)Lp4/m;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lp4/m$a;->b(I)[Lp4/m;

    move-result-object p1

    return-object p1
.end method
