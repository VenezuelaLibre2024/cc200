.class public Lq4/e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq4/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lq4/e;",
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
.method public a(Landroid/os/Parcel;)Lq4/e;
    .locals 2

    new-instance v0, Lq4/e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lq4/e;-><init>(Landroid/os/Parcel;Lq4/e$a;)V

    return-object v0
.end method

.method public b(I)[Lq4/e;
    .locals 0

    new-array p1, p1, [Lq4/e;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lq4/e$a;->a(Landroid/os/Parcel;)Lq4/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lq4/e$a;->b(I)[Lq4/e;

    move-result-object p1

    return-object p1
.end method
