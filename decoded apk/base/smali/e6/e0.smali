.class public final Le6/e0;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Le6/e0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Z

.field public final i:Ljava/lang/String;

.field public final j:I

.field public final k:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le6/f0;

    invoke-direct {v0}, Le6/f0;-><init>()V

    sput-object v0, Le6/e0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-boolean p1, p0, Le6/e0;->h:Z

    iput-object p2, p0, Le6/e0;->i:Ljava/lang/String;

    invoke-static {p3}, Le6/m0;->a(I)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Le6/e0;->j:I

    invoke-static {p4}, Le6/r;->a(I)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Le6/e0;->k:I

    return-void
.end method


# virtual methods
.method public final I()Z
    .locals 1

    iget-boolean v0, p0, Le6/e0;->h:Z

    return v0
.end method

.method public final J()I
    .locals 1

    iget v0, p0, Le6/e0;->k:I

    invoke-static {v0}, Le6/r;->a(I)I

    move-result v0

    return v0
.end method

.method public final K()I
    .locals 1

    iget v0, p0, Le6/e0;->j:I

    invoke-static {v0}, Le6/m0;->a(I)I

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-boolean v0, p0, Le6/e0;->h:Z

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Le6/e0;->i:Ljava/lang/String;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget v0, p0, Le6/e0;->j:I

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget v0, p0, Le6/e0;->k:I

    const/4 v1, 0x4

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le6/e0;->i:Ljava/lang/String;

    return-object v0
.end method
