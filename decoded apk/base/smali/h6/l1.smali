.class public final Lh6/l1;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lh6/l1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public h:Landroid/os/Bundle;

.field public i:[Le6/d;

.field public j:I

.field public k:Lh6/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh6/m1;

    invoke-direct {v0}, Lh6/m1;-><init>()V

    sput-object v0, Lh6/l1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;[Le6/d;ILh6/f;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-object p1, p0, Lh6/l1;->h:Landroid/os/Bundle;

    iput-object p2, p0, Lh6/l1;->i:[Le6/d;

    iput p3, p0, Lh6/l1;->j:I

    iput-object p4, p0, Lh6/l1;->k:Lh6/f;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lh6/l1;->h:Landroid/os/Bundle;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Li6/c;->j(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    iget-object v1, p0, Lh6/l1;->i:[Le6/d;

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->I(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget v1, p0, Lh6/l1;->j:I

    const/4 v2, 0x3

    invoke-static {p1, v2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lh6/l1;->k:Lh6/f;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
