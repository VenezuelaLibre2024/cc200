.class Lio/flutter/plugins/googlemaps/PolylinesController;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final density:F

.field private googleMap:Lx6/c;

.field private final googleMapsPolylineIdToDartPolylineId:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final methodChannel:Lio/flutter/plugin/common/MethodChannel;

.field private final polylineIdToController:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlemaps/PolylineController;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/flutter/plugin/common/MethodChannel;F)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/PolylinesController;->polylineIdToController:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/PolylinesController;->googleMapsPolylineIdToDartPolylineId:Ljava/util/Map;

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/PolylinesController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    iput p2, p0, Lio/flutter/plugins/googlemaps/PolylinesController;->density:F

    return-void
.end method

.method private addPolyline(Ljava/lang/Object;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lio/flutter/plugins/googlemaps/PolylineBuilder;

    iget v1, p0, Lio/flutter/plugins/googlemaps/PolylinesController;->density:F

    invoke-direct {v0, v1}, Lio/flutter/plugins/googlemaps/PolylineBuilder;-><init>(F)V

    invoke-static {p1, v0}, Lio/flutter/plugins/googlemaps/Convert;->interpretPolylineOptions(Ljava/lang/Object;Lio/flutter/plugins/googlemaps/PolylineOptionsSink;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lio/flutter/plugins/googlemaps/PolylineBuilder;->build()Lz6/t;

    move-result-object v1

    invoke-virtual {v0}, Lio/flutter/plugins/googlemaps/PolylineBuilder;->consumeTapEvents()Z

    move-result v0

    invoke-direct {p0, p1, v1, v0}, Lio/flutter/plugins/googlemaps/PolylinesController;->addPolyline(Ljava/lang/String;Lz6/t;Z)V

    return-void
.end method

.method private addPolyline(Ljava/lang/String;Lz6/t;Z)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylinesController;->googleMap:Lx6/c;

    invoke-virtual {v0, p2}, Lx6/c;->d(Lz6/t;)Lz6/s;

    move-result-object p2

    new-instance v0, Lio/flutter/plugins/googlemaps/PolylineController;

    iget v1, p0, Lio/flutter/plugins/googlemaps/PolylinesController;->density:F

    invoke-direct {v0, p2, p3, v1}, Lio/flutter/plugins/googlemaps/PolylineController;-><init>(Lz6/s;ZF)V

    iget-object p3, p0, Lio/flutter/plugins/googlemaps/PolylinesController;->polylineIdToController:Ljava/util/Map;

    invoke-interface {p3, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p3, p0, Lio/flutter/plugins/googlemaps/PolylinesController;->googleMapsPolylineIdToDartPolylineId:Ljava/util/Map;

    invoke-virtual {p2}, Lz6/s;->a()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private changePolyline(Ljava/lang/Object;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lio/flutter/plugins/googlemaps/PolylinesController;->getPolylineId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/PolylinesController;->polylineIdToController:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/googlemaps/PolylineController;

    if-eqz v0, :cond_1

    invoke-static {p1, v0}, Lio/flutter/plugins/googlemaps/Convert;->interpretPolylineOptions(Ljava/lang/Object;Lio/flutter/plugins/googlemaps/PolylineOptionsSink;)Ljava/lang/String;

    :cond_1
    return-void
.end method

.method private static getPolylineId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    check-cast p0, Ljava/util/Map;

    const-string v0, "polylineId"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public addPolylines(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/flutter/plugins/googlemaps/PolylinesController;->addPolyline(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public changePolylines(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/flutter/plugins/googlemaps/PolylinesController;->changePolyline(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onPolylineTap(Ljava/lang/String;)Z
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylinesController;->googleMapsPolylineIdToDartPolylineId:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lio/flutter/plugins/googlemaps/PolylinesController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/Convert;->polylineIdToJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "polyline#onTap"

    invoke-virtual {v1, v3, v2}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/PolylinesController;->polylineIdToController:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugins/googlemaps/PolylineController;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lio/flutter/plugins/googlemaps/PolylineController;->consumeTapEvents()Z

    move-result p1

    return p1

    :cond_1
    return v0
.end method

.method public removePolylines(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/PolylinesController;->polylineIdToController:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/googlemaps/PolylineController;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/flutter/plugins/googlemaps/PolylineController;->remove()V

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/PolylinesController;->googleMapsPolylineIdToDartPolylineId:Ljava/util/Map;

    invoke-virtual {v0}, Lio/flutter/plugins/googlemaps/PolylineController;->getGoogleMapsPolylineId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-void
.end method

.method public setGoogleMap(Lx6/c;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/PolylinesController;->googleMap:Lx6/c;

    return-void
.end method
