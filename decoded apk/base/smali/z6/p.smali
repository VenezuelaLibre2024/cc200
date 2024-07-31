.class public Lz6/p;
.super Li6/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz6/p$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz6/p;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:I

.field public final i:I

.field public final j:Lz6/p$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz6/w0;

    invoke-direct {v0}, Lz6/w0;-><init>()V

    sput-object v0, Lz6/p;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IILz6/p$a;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput p1, p0, Lz6/p;->h:I

    iput p2, p0, Lz6/p;->i:I

    iput-object p3, p0, Lz6/p;->j:Lz6/p$a;

    return-void
.end method


# virtual methods
.method public I()I
    .locals 1

    iget v0, p0, Lz6/p;->h:I

    return v0
.end method

.method public J()I
    .locals 1

    iget v0, p0, Lz6/p;->i:I

    return v0
.end method

.method public K()Lz6/p$a;
    .locals 1

    iget-object v0, p0, Lz6/p;->j:Lz6/p$a;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lz6/p;->I()I

    move-result v1

    const/4 v2, 0x2

    invoke-static {p1, v2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lz6/p;->J()I

    move-result v1

    const/4 v2, 0x3

    invoke-static {p1, v2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lz6/p;->K()Lz6/p$a;

    move-result-object v1

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
