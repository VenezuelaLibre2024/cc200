.class public final Lz6/y;
.super Li6/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz6/y$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz6/y;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:F

.field public final i:I

.field public final j:I

.field public final k:Z

.field public final l:Lz6/x;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz6/g0;

    invoke-direct {v0}, Lz6/g0;-><init>()V

    sput-object v0, Lz6/y;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(FIIZLz6/x;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput p1, p0, Lz6/y;->h:F

    iput p2, p0, Lz6/y;->i:I

    iput p3, p0, Lz6/y;->j:I

    iput-boolean p4, p0, Lz6/y;->k:Z

    iput-object p5, p0, Lz6/y;->l:Lz6/x;

    return-void
.end method


# virtual methods
.method public I()Lz6/x;
    .locals 1

    iget-object v0, p0, Lz6/y;->l:Lz6/x;

    return-object v0
.end method

.method public J()Z
    .locals 1

    iget-boolean v0, p0, Lz6/y;->k:Z

    return v0
.end method

.method public final K()F
    .locals 1

    iget v0, p0, Lz6/y;->h:F

    return v0
.end method

.method public final L()Landroid/util/Pair;
    .locals 3

    iget v0, p0, Lz6/y;->j:I

    iget v1, p0, Lz6/y;->i:I

    new-instance v2, Landroid/util/Pair;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v2, v1, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lz6/y;->h:F

    const/4 v2, 0x2

    invoke-static {p1, v2, v1}, Li6/c;->q(Landroid/os/Parcel;IF)V

    iget v1, p0, Lz6/y;->i:I

    const/4 v2, 0x3

    invoke-static {p1, v2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget v1, p0, Lz6/y;->j:I

    const/4 v2, 0x4

    invoke-static {p1, v2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lz6/y;->J()Z

    move-result v1

    const/4 v2, 0x5

    invoke-static {p1, v2, v1}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lz6/y;->I()Lz6/x;

    move-result-object v1

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
