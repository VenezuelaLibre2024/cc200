.class public final Le7/l;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Le7/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:I

.field public final i:Le6/b;

.field public final j:Lh6/t0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le7/m;

    invoke-direct {v0}, Le7/m;-><init>()V

    sput-object v0, Le7/l;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILe6/b;Lh6/t0;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput p1, p0, Le7/l;->h:I

    iput-object p2, p0, Le7/l;->i:Le6/b;

    iput-object p3, p0, Le7/l;->j:Lh6/t0;

    return-void
.end method


# virtual methods
.method public final I()Le6/b;
    .locals 1

    iget-object v0, p0, Le7/l;->i:Le6/b;

    return-object v0
.end method

.method public final J()Lh6/t0;
    .locals 1

    iget-object v0, p0, Le7/l;->j:Lh6/t0;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Le7/l;->h:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget-object v1, p0, Le7/l;->i:Le6/b;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Le7/l;->j:Lh6/t0;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
