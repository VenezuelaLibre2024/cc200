.class public Landroidx/versionedparcelable/ParcelImpl;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "BanParcelableUsage"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/versionedparcelable/ParcelImpl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Lz1/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/versionedparcelable/ParcelImpl$a;

    invoke-direct {v0}, Landroidx/versionedparcelable/ParcelImpl$a;-><init>()V

    sput-object v0, Landroidx/versionedparcelable/ParcelImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz1/c;

    invoke-direct {v0, p1}, Lz1/c;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {v0}, Lz1/b;->u()Lz1/d;

    move-result-object p1

    iput-object p1, p0, Landroidx/versionedparcelable/ParcelImpl;->h:Lz1/d;

    return-void
.end method


# virtual methods
.method public a()Lz1/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lz1/d;",
            ">()TT;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/versionedparcelable/ParcelImpl;->h:Lz1/d;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    new-instance p2, Lz1/c;

    invoke-direct {p2, p1}, Lz1/c;-><init>(Landroid/os/Parcel;)V

    iget-object p1, p0, Landroidx/versionedparcelable/ParcelImpl;->h:Lz1/d;

    invoke-virtual {p2, p1}, Lz1/b;->L(Lz1/d;)V

    return-void
.end method
