.class public final Lcom/google/android/gms/maps/model/LatLngBounds;
.super Li6/a;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/maps/model/LatLngBounds$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/maps/model/LatLngBounds;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Lcom/google/android/gms/maps/model/LatLng;

.field public final i:Lcom/google/android/gms/maps/model/LatLng;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz6/q0;

    invoke-direct {v0}, Lz6/q0;-><init>()V

    sput-object v0, Lcom/google/android/gms/maps/model/LatLngBounds;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 9

    invoke-direct {p0}, Li6/a;-><init>()V

    const-string v0, "southwest must not be null."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "northeast must not be null."

    invoke-static {p2, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v0, p2, Lcom/google/android/gms/maps/model/LatLng;->h:D

    iget-wide v2, p1, Lcom/google/android/gms/maps/model/LatLng;->h:D

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    iget-wide v7, p2, Lcom/google/android/gms/maps/model/LatLng;->h:D

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    const/4 v7, 0x1

    aput-object v5, v4, v7

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_0

    move v6, v7

    :cond_0
    const-string v0, "southern latitude exceeds northern latitude (%s > %s)"

    invoke-static {v6, v0, v4}, Lh6/s;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->h:Lcom/google/android/gms/maps/model/LatLng;

    iput-object p2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->i:Lcom/google/android/gms/maps/model/LatLng;

    return-void
.end method

.method public static I()Lcom/google/android/gms/maps/model/LatLngBounds$a;
    .locals 1

    new-instance v0, Lcom/google/android/gms/maps/model/LatLngBounds$a;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/LatLngBounds$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public J(Lcom/google/android/gms/maps/model/LatLng;)Z
    .locals 4

    const-string v0, "point must not be null."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v0, p1, Lcom/google/android/gms/maps/model/LatLng;->h:D

    iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->h:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->h:D

    cmpg-double v2, v2, v0

    if-gtz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->i:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->h:D

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    iget-wide v0, p1, Lcom/google/android/gms/maps/model/LatLng;->i:D

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/maps/model/LatLngBounds;->K(D)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final K(D)Z
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->i:Lcom/google/android/gms/maps/model/LatLng;

    iget-object v1, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->h:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v1, v1, Lcom/google/android/gms/maps/model/LatLng;->i:D

    iget-wide v3, v0, Lcom/google/android/gms/maps/model/LatLng;->i:D

    cmpg-double v0, v1, v3

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-gtz v0, :cond_1

    cmpg-double v0, v1, p1

    if-gtz v0, :cond_0

    cmpg-double p1, p1, v3

    if-gtz p1, :cond_0

    return v6

    :cond_0
    return v5

    :cond_1
    cmpg-double v0, v1, p1

    if-lez v0, :cond_3

    cmpg-double p1, p1, v3

    if-gtz p1, :cond_2

    goto :goto_0

    :cond_2
    return v5

    :cond_3
    :goto_0
    return v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/maps/model/LatLngBounds;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object v1, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->h:Lcom/google/android/gms/maps/model/LatLng;

    iget-object v3, p1, Lcom/google/android/gms/maps/model/LatLngBounds;->h:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/maps/model/LatLng;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->i:Lcom/google/android/gms/maps/model/LatLng;

    iget-object p1, p1, Lcom/google/android/gms/maps/model/LatLngBounds;->i:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/LatLng;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->h:Lcom/google/android/gms/maps/model/LatLng;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    iget-object v0, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->i:Lcom/google/android/gms/maps/model/LatLng;

    const/4 v2, 0x1

    aput-object v0, v1, v2

    invoke-static {v1}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lh6/q;->d(Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->h:Lcom/google/android/gms/maps/model/LatLng;

    const-string v2, "southwest"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->i:Lcom/google/android/gms/maps/model/LatLng;

    const-string v2, "northeast"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    invoke-virtual {v0}, Lh6/q$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->h:Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v0, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->i:Lcom/google/android/gms/maps/model/LatLng;

    const/4 v2, 0x3

    invoke-static {p1, v2, v0, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v1}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
