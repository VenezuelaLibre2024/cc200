.class public Lv6/b;
.super Li6/a;
.source ""


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lv6/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:I

.field public final i:[B

.field public final j:Lv6/c;

.field public final k:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv6/h;

    invoke-direct {v0}, Lv6/h;-><init>()V

    sput-object v0, Lv6/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I[BLjava/lang/String;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput p1, p0, Lv6/b;->h:I

    iput-object p2, p0, Lv6/b;->i:[B

    :try_start_0
    invoke-static {p3}, Lv6/c;->b(Ljava/lang/String;)Lv6/c;

    move-result-object p1

    iput-object p1, p0, Lv6/b;->j:Lv6/c;
    :try_end_0
    .catch Lv6/c$a; {:try_start_0 .. :try_end_0} :catch_0

    iput-object p4, p0, Lv6/b;->k:Ljava/util/List;

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public I()[B
    .locals 1

    iget-object v0, p0, Lv6/b;->i:[B

    return-object v0
.end method

.method public J()Lv6/c;
    .locals 1

    iget-object v0, p0, Lv6/b;->j:Lv6/c;

    return-object v0
.end method

.method public K()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/fido/common/Transport;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv6/b;->k:Ljava/util/List;

    return-object v0
.end method

.method public L()I
    .locals 1

    iget v0, p0, Lv6/b;->h:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv6/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv6/b;

    iget-object v1, p0, Lv6/b;->i:[B

    iget-object v3, p1, Lv6/b;->i:[B

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lv6/b;->j:Lv6/c;

    iget-object v3, p1, Lv6/b;->j:Lv6/c;

    invoke-virtual {v1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lv6/b;->k:Ljava/util/List;

    if-nez v1, :cond_5

    iget-object v3, p1, Lv6/b;->k:Ljava/util/List;

    if-eqz v3, :cond_4

    goto :goto_0

    :cond_4
    return v0

    :cond_5
    :goto_0
    if-eqz v1, :cond_7

    iget-object v3, p1, Lv6/b;->k:Ljava/util/List;

    if-nez v3, :cond_6

    goto :goto_1

    :cond_6
    invoke-interface {v1, v3}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object p1, p1, Lv6/b;->k:Ljava/util/List;

    iget-object v1, p0, Lv6/b;->k:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_7

    return v0

    :cond_7
    :goto_1
    return v2
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lv6/b;->i:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lv6/b;->j:Lv6/c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lv6/b;->k:Ljava/util/List;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lv6/b;->k:Ljava/util/List;

    if-nez v0, :cond_0

    const-string v0, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lv6/b;->i:[B

    invoke-static {v3}, Lo6/c;->c([B)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lv6/b;->j:Lv6/c;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aput-object v0, v1, v2

    const-string v0, "{keyHandle: %s, version: %s, transports: %s}"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lv6/b;->L()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lv6/b;->I()[B

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Li6/c;->l(Landroid/os/Parcel;I[BZ)V

    iget-object v0, p0, Lv6/b;->j:Lv6/c;

    invoke-virtual {v0}, Lv6/c;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lv6/b;->K()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {p1, v1, v0, v2}, Li6/c;->J(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
