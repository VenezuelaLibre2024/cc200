.class public Ln/z$i$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln/z$i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Ln/z$i;",
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
.method public a(Landroid/os/Parcel;)Ln/z$i;
    .locals 1

    new-instance v0, Ln/z$i;

    invoke-direct {v0, p1}, Ln/z$i;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public b(I)[Ln/z$i;
    .locals 0

    new-array p1, p1, [Ln/z$i;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ln/z$i$a;->a(Landroid/os/Parcel;)Ln/z$i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ln/z$i$a;->b(I)[Ln/z$i;

    move-result-object p1

    return-object p1
.end method
