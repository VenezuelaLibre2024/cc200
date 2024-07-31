.class public final Lz6/e0;
.super Li6/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz6/e0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Lcom/google/android/gms/maps/model/LatLng;

.field public final i:Lcom/google/android/gms/maps/model/LatLng;

.field public final j:Lcom/google/android/gms/maps/model/LatLng;

.field public final k:Lcom/google/android/gms/maps/model/LatLng;

.field public final l:Lcom/google/android/gms/maps/model/LatLngBounds;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz6/m0;

    invoke-direct {v0}, Lz6/m0;-><init>()V

    sput-object v0, Lz6/e0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLngBounds;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-object p1, p0, Lz6/e0;->h:Lcom/google/android/gms/maps/model/LatLng;

    iput-object p2, p0, Lz6/e0;->i:Lcom/google/android/gms/maps/model/LatLng;

    iput-object p3, p0, Lz6/e0;->j:Lcom/google/android/gms/maps/model/LatLng;

    iput-object p4, p0, Lz6/e0;->k:Lcom/google/android/gms/maps/model/LatLng;

    iput-object p5, p0, Lz6/e0;->l:Lcom/google/android/gms/maps/model/LatLngBounds;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lz6/e0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lz6/e0;

    iget-object v1, p0, Lz6/e0;->h:Lcom/google/android/gms/maps/model/LatLng;

    iget-object v3, p1, Lz6/e0;->h:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/maps/model/LatLng;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lz6/e0;->i:Lcom/google/android/gms/maps/model/LatLng;

    iget-object v3, p1, Lz6/e0;->i:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/maps/model/LatLng;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lz6/e0;->j:Lcom/google/android/gms/maps/model/LatLng;

    iget-object v3, p1, Lz6/e0;->j:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/maps/model/LatLng;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lz6/e0;->k:Lcom/google/android/gms/maps/model/LatLng;

    iget-object v3, p1, Lz6/e0;->k:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/maps/model/LatLng;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lz6/e0;->l:Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object p1, p1, Lz6/e0;->l:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/LatLngBounds;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lz6/e0;->h:Lcom/google/android/gms/maps/model/LatLng;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    iget-object v0, p0, Lz6/e0;->i:Lcom/google/android/gms/maps/model/LatLng;

    const/4 v2, 0x1

    aput-object v0, v1, v2

    iget-object v0, p0, Lz6/e0;->j:Lcom/google/android/gms/maps/model/LatLng;

    const/4 v2, 0x2

    aput-object v0, v1, v2

    iget-object v0, p0, Lz6/e0;->k:Lcom/google/android/gms/maps/model/LatLng;

    const/4 v2, 0x3

    aput-object v0, v1, v2

    iget-object v0, p0, Lz6/e0;->l:Lcom/google/android/gms/maps/model/LatLngBounds;

    const/4 v2, 0x4

    aput-object v0, v1, v2

    invoke-static {v1}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lh6/q;->d(Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget-object v1, p0, Lz6/e0;->h:Lcom/google/android/gms/maps/model/LatLng;

    const-string v2, "nearLeft"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget-object v1, p0, Lz6/e0;->i:Lcom/google/android/gms/maps/model/LatLng;

    const-string v2, "nearRight"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget-object v1, p0, Lz6/e0;->j:Lcom/google/android/gms/maps/model/LatLng;

    const-string v2, "farLeft"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget-object v1, p0, Lz6/e0;->k:Lcom/google/android/gms/maps/model/LatLng;

    const-string v2, "farRight"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget-object v1, p0, Lz6/e0;->l:Lcom/google/android/gms/maps/model/LatLngBounds;

    const-string v2, "latLngBounds"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    invoke-virtual {v0}, Lh6/q$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    iget-object v0, p0, Lz6/e0;->h:Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v0, p0, Lz6/e0;->i:Lcom/google/android/gms/maps/model/LatLng;

    const/4 v2, 0x3

    invoke-static {p1, v2, v0, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v0, p0, Lz6/e0;->j:Lcom/google/android/gms/maps/model/LatLng;

    const/4 v2, 0x4

    invoke-static {p1, v2, v0, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v0, p0, Lz6/e0;->k:Lcom/google/android/gms/maps/model/LatLng;

    const/4 v2, 0x5

    invoke-static {p1, v2, v0, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v0, p0, Lz6/e0;->l:Lcom/google/android/gms/maps/model/LatLngBounds;

    const/4 v2, 0x6

    invoke-static {p1, v2, v0, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v1}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
