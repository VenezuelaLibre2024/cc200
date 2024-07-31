.class public final Lz6/a0;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz6/a0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:I

.field public final i:I

.field public final j:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz6/i0;

    invoke-direct {v0}, Lz6/i0;-><init>()V

    sput-object v0, Lz6/a0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(II[B)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput p1, p0, Lz6/a0;->h:I

    iput p2, p0, Lz6/a0;->i:I

    iput-object p3, p0, Lz6/a0;->j:[B

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget p2, p0, Lz6/a0;->h:I

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x2

    invoke-static {p1, v1, p2}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget p2, p0, Lz6/a0;->i:I

    const/4 v1, 0x3

    invoke-static {p1, v1, p2}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget-object p2, p0, Lz6/a0;->j:[B

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, Li6/c;->l(Landroid/os/Parcel;I[BZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
