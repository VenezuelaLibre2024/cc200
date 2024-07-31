.class public Lx5/g;
.super Li6/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx5/g$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lx5/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Lx5/j;

.field public final i:Ljava/lang/String;

.field public final j:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx5/z;

    invoke-direct {v0}, Lx5/z;-><init>()V

    sput-object v0, Lx5/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lx5/j;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx5/j;

    iput-object p1, p0, Lx5/g;->h:Lx5/j;

    iput-object p2, p0, Lx5/g;->i:Ljava/lang/String;

    iput p3, p0, Lx5/g;->j:I

    return-void
.end method

.method public static I()Lx5/g$a;
    .locals 1

    new-instance v0, Lx5/g$a;

    invoke-direct {v0}, Lx5/g$a;-><init>()V

    return-object v0
.end method

.method public static K(Lx5/g;)Lx5/g$a;
    .locals 2

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lx5/g;->I()Lx5/g$a;

    move-result-object v0

    invoke-virtual {p0}, Lx5/g;->J()Lx5/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx5/g$a;->b(Lx5/j;)Lx5/g$a;

    iget v1, p0, Lx5/g;->j:I

    invoke-virtual {v0, v1}, Lx5/g$a;->d(I)Lx5/g$a;

    iget-object p0, p0, Lx5/g;->i:Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-virtual {v0, p0}, Lx5/g$a;->c(Ljava/lang/String;)Lx5/g$a;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public J()Lx5/j;
    .locals 1

    iget-object v0, p0, Lx5/g;->h:Lx5/j;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lx5/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lx5/g;

    iget-object v0, p0, Lx5/g;->h:Lx5/j;

    iget-object v2, p1, Lx5/g;->h:Lx5/j;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx5/g;->i:Ljava/lang/String;

    iget-object v2, p1, Lx5/g;->i:Ljava/lang/String;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lx5/g;->j:I

    iget p1, p1, Lx5/g;->j:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lx5/g;->h:Lx5/j;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    iget-object v0, p0, Lx5/g;->i:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v0, v1, v2

    invoke-static {v1}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lx5/g;->J()Lx5/j;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, Lx5/g;->i:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-static {p1, v1, p2, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget p2, p0, Lx5/g;->j:I

    const/4 v1, 0x3

    invoke-static {p1, v1, p2}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
