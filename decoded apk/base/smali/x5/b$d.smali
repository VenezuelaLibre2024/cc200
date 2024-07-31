.class public final Lx5/b$d;
.super Li6/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx5/b$d$a;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lx5/b$d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Z

.field public final i:[B

.field public final j:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx5/v;

    invoke-direct {v0}, Lx5/v;-><init>()V

    sput-object v0, Lx5/b$d;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Z[BLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    if-eqz p1, :cond_0

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iput-boolean p1, p0, Lx5/b$d;->h:Z

    iput-object p2, p0, Lx5/b$d;->i:[B

    iput-object p3, p0, Lx5/b$d;->j:Ljava/lang/String;

    return-void
.end method

.method public static I()Lx5/b$d$a;
    .locals 1

    new-instance v0, Lx5/b$d$a;

    invoke-direct {v0}, Lx5/b$d$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public J()[B
    .locals 1

    iget-object v0, p0, Lx5/b$d;->i:[B

    return-object v0
.end method

.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx5/b$d;->j:Ljava/lang/String;

    return-object v0
.end method

.method public L()Z
    .locals 1

    iget-boolean v0, p0, Lx5/b$d;->h:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lx5/b$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lx5/b$d;

    iget-boolean v1, p0, Lx5/b$d;->h:Z

    iget-boolean v3, p1, Lx5/b$d;->h:Z

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Lx5/b$d;->i:[B

    iget-object v3, p1, Lx5/b$d;->i:[B

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lx5/b$d;->j:Ljava/lang/String;

    iget-object p1, p1, Lx5/b$d;->j:Ljava/lang/String;

    if-eq v1, p1, :cond_2

    if-eqz v1, :cond_3

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    return v0

    :cond_3
    return v2
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-boolean v1, p0, Lx5/b$d;->h:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lx5/b$d;->j:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx5/b$d;->i:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lx5/b$d;->L()Z

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lx5/b$d;->J()[B

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Li6/c;->l(Landroid/os/Parcel;I[BZ)V

    invoke-virtual {p0}, Lx5/b$d;->K()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
