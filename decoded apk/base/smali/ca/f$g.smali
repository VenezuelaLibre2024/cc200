.class public Lca/f$g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lca/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# instance fields
.field public final a:Lz6/m;

.field public b:Lcom/google/android/gms/maps/model/LatLng;


# direct methods
.method public constructor <init>(Lz6/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lca/f$g;->a:Lz6/m;

    invoke-virtual {p1}, Lz6/m;->b()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    iput-object p1, p0, Lca/f$g;->b:Lcom/google/android/gms/maps/model/LatLng;

    return-void
.end method

.method public synthetic constructor <init>(Lz6/m;Lca/f$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lca/f$g;-><init>(Lz6/m;)V

    return-void
.end method

.method public static synthetic a(Lca/f$g;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 0

    iget-object p0, p0, Lca/f$g;->b:Lcom/google/android/gms/maps/model/LatLng;

    return-object p0
.end method

.method public static synthetic b(Lca/f$g;Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 0

    iput-object p1, p0, Lca/f$g;->b:Lcom/google/android/gms/maps/model/LatLng;

    return-object p1
.end method

.method public static synthetic c(Lca/f$g;)Lz6/m;
    .locals 0

    iget-object p0, p0, Lca/f$g;->a:Lz6/m;

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lca/f$g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lca/f$g;->a:Lz6/m;

    check-cast p1, Lca/f$g;

    iget-object p1, p1, Lca/f$g;->a:Lz6/m;

    invoke-virtual {v0, p1}, Lz6/m;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lca/f$g;->a:Lz6/m;

    invoke-virtual {v0}, Lz6/m;->hashCode()I

    move-result v0

    return v0
.end method
