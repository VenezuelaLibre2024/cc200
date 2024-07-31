.class public Lu6/f;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lu6/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu6/n1;

    invoke-direct {v0}, Lu6/n1;-><init>()V

    sput-object v0, Lu6/f;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-boolean p1, p0, Lu6/f;->h:Z

    return-void
.end method


# virtual methods
.method public I()Z
    .locals 1

    iget-boolean v0, p0, Lu6/f;->h:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lu6/f;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lu6/f;

    iget-boolean v0, p0, Lu6/f;->h:Z

    iget-boolean p1, p1, Lu6/f;->h:Z

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-boolean v1, p0, Lu6/f;->h:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lu6/f;->I()Z

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
