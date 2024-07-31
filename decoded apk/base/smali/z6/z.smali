.class public final Lz6/z;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz6/z;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Lz6/y;

.field public final i:D


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz6/h0;

    invoke-direct {v0}, Lz6/h0;-><init>()V

    sput-object v0, Lz6/z;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lz6/y;D)V
    .locals 2

    invoke-direct {p0}, Li6/a;-><init>()V

    const-wide/16 v0, 0x0

    cmpg-double v0, p2, v0

    if-lez v0, :cond_0

    iput-object p1, p0, Lz6/z;->h:Lz6/y;

    iput-wide p2, p0, Lz6/z;->i:D

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "A style must be applied to some segments on a polyline."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public I()D
    .locals 2

    iget-wide v0, p0, Lz6/z;->i:D

    return-wide v0
.end method

.method public J()Lz6/y;
    .locals 1

    iget-object v0, p0, Lz6/z;->h:Lz6/y;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lz6/z;->J()Lz6/y;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lz6/z;->I()D

    move-result-wide v1

    const/4 p2, 0x3

    invoke-static {p1, p2, v1, v2}, Li6/c;->n(Landroid/os/Parcel;ID)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
