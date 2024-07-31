.class Lio/flutter/plugins/googlemaps/MarkersController;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final clusterManagersController:Lio/flutter/plugins/googlemaps/ClusterManagersController;

.field private final googleMapsMarkerIdToDartMarkerId:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private markerCollection:Lda/b$a;

.field private final markerIdToController:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlemaps/MarkerController;",
            ">;"
        }
    .end annotation
.end field

.field private final markerIdToMarkerBuilder:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlemaps/MarkerBuilder;",
            ">;"
        }
    .end annotation
.end field

.field private final methodChannel:Lio/flutter/plugin/common/MethodChannel;


# direct methods
.method public constructor <init>(Lio/flutter/plugin/common/MethodChannel;Lio/flutter/plugins/googlemaps/ClusterManagersController;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToMarkerBuilder:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToController:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->googleMapsMarkerIdToDartMarkerId:Ljava/util/HashMap;

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    iput-object p2, p0, Lio/flutter/plugins/googlemaps/MarkersController;->clusterManagersController:Lio/flutter/plugins/googlemaps/ClusterManagersController;

    return-void
.end method

.method private addMarker(Lio/flutter/plugins/googlemaps/MarkerBuilder;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerId()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToMarkerBuilder:Ljava/util/HashMap;

    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lio/flutter/plugins/googlemaps/MarkerBuilder;->clusterManagerId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-direct {p0, v0, p1}, Lio/flutter/plugins/googlemaps/MarkersController;->addMarkerToCollection(Ljava/lang/String;Lio/flutter/plugins/googlemaps/MarkerBuilder;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemaps/MarkersController;->addMarkerBuilderForCluster(Lio/flutter/plugins/googlemaps/MarkerBuilder;)V

    :goto_0
    return-void
.end method

.method private addMarker(Ljava/lang/Object;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lio/flutter/plugins/googlemaps/MarkersController;->getMarkerId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/MarkersController;->getClusterManagerId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lio/flutter/plugins/googlemaps/MarkerBuilder;

    invoke-direct {v2, v0, v1}, Lio/flutter/plugins/googlemaps/MarkerBuilder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1, v2}, Lio/flutter/plugins/googlemaps/Convert;->interpretMarkerOptions(Ljava/lang/Object;Lio/flutter/plugins/googlemaps/MarkerOptionsSink;)V

    invoke-direct {p0, v2}, Lio/flutter/plugins/googlemaps/MarkersController;->addMarker(Lio/flutter/plugins/googlemaps/MarkerBuilder;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "markerId was null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private addMarkerBuilderForCluster(Lio/flutter/plugins/googlemaps/MarkerBuilder;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->clusterManagersController:Lio/flutter/plugins/googlemaps/ClusterManagersController;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemaps/ClusterManagersController;->addItem(Lio/flutter/plugins/googlemaps/MarkerBuilder;)V

    return-void
.end method

.method private addMarkerToCollection(Ljava/lang/String;Lio/flutter/plugins/googlemaps/MarkerBuilder;)V
    .locals 2

    invoke-virtual {p2}, Lio/flutter/plugins/googlemaps/MarkerBuilder;->build()Lz6/n;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerCollection:Lda/b$a;

    invoke-virtual {v1, v0}, Lda/b$a;->i(Lz6/n;)Lz6/m;

    move-result-object v0

    invoke-virtual {p2}, Lio/flutter/plugins/googlemaps/MarkerBuilder;->consumeTapEvents()Z

    move-result p2

    invoke-direct {p0, p1, v0, p2}, Lio/flutter/plugins/googlemaps/MarkersController;->createControllerForMarker(Ljava/lang/String;Lz6/m;Z)V

    return-void
.end method

.method private changeMarker(Ljava/lang/Object;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lio/flutter/plugins/googlemaps/MarkersController;->getMarkerId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToMarkerBuilder:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/plugins/googlemaps/MarkerBuilder;

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-static {p1}, Lio/flutter/plugins/googlemaps/MarkersController;->getClusterManagerId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lio/flutter/plugins/googlemaps/MarkerBuilder;->clusterManagerId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-direct {p0, v0}, Lio/flutter/plugins/googlemaps/MarkersController;->removeMarker(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemaps/MarkersController;->addMarker(Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-static {p1, v1}, Lio/flutter/plugins/googlemaps/Convert;->interpretMarkerOptions(Ljava/lang/Object;Lio/flutter/plugins/googlemaps/MarkerOptionsSink;)V

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToController:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/googlemaps/MarkerController;

    if-eqz v0, :cond_3

    invoke-static {p1, v0}, Lio/flutter/plugins/googlemaps/Convert;->interpretMarkerOptions(Ljava/lang/Object;Lio/flutter/plugins/googlemaps/MarkerOptionsSink;)V

    :cond_3
    return-void
.end method

.method private createControllerForMarker(Ljava/lang/String;Lz6/m;Z)V
    .locals 1

    new-instance v0, Lio/flutter/plugins/googlemaps/MarkerController;

    invoke-direct {v0, p2, p3}, Lio/flutter/plugins/googlemaps/MarkerController;-><init>(Lz6/m;Z)V

    iget-object p3, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToController:Ljava/util/HashMap;

    invoke-virtual {p3, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p3, p0, Lio/flutter/plugins/googlemaps/MarkersController;->googleMapsMarkerIdToDartMarkerId:Ljava/util/HashMap;

    invoke-virtual {p2}, Lz6/m;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static getClusterManagerId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    check-cast p0, Ljava/util/Map;

    const-string v0, "clusterManagerId"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static getMarkerId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    check-cast p0, Ljava/util/Map;

    const-string v0, "markerId"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private removeMarker(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToMarkerBuilder:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/googlemaps/MarkerBuilder;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToController:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugins/googlemaps/MarkerController;

    invoke-virtual {v0}, Lio/flutter/plugins/googlemaps/MarkerBuilder;->clusterManagerId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->clusterManagersController:Lio/flutter/plugins/googlemaps/ClusterManagersController;

    invoke-virtual {v1, v0}, Lio/flutter/plugins/googlemaps/ClusterManagersController;->removeItem(Lio/flutter/plugins/googlemaps/MarkerBuilder;)V

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerCollection:Lda/b$a;

    if-eqz v0, :cond_2

    invoke-virtual {p1, v0}, Lio/flutter/plugins/googlemaps/MarkerController;->removeFromCollection(Lda/b$a;)V

    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->googleMapsMarkerIdToDartMarkerId:Ljava/util/HashMap;

    invoke-virtual {p1}, Lio/flutter/plugins/googlemaps/MarkerController;->getGoogleMapsMarkerId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method


# virtual methods
.method public addMarkers(Ljava/util/List;)V
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

    invoke-direct {p0, v0}, Lio/flutter/plugins/googlemaps/MarkersController;->addMarker(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public changeMarkers(Ljava/util/List;)V
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

    invoke-direct {p0, v0}, Lio/flutter/plugins/googlemaps/MarkersController;->changeMarker(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public hideMarkerInfoWindow(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToController:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugins/googlemaps/MarkerController;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/flutter/plugins/googlemaps/MarkerController;->hideInfoWindow()V

    invoke-interface {p2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string p1, "Invalid markerId"

    const-string v1, "hideInfoWindow called with invalid markerId"

    invoke-interface {p2, p1, v1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public isInfoWindowShown(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToController:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugins/googlemaps/MarkerController;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/flutter/plugins/googlemaps/MarkerController;->isInfoWindowShown()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const-string v0, "Invalid markerId"

    const-string v1, "isInfoWindowShown called with invalid markerId"

    invoke-interface {p2, v0, v1, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public onClusterItemRendered(Lio/flutter/plugins/googlemaps/MarkerBuilder;Lz6/m;)V
    .locals 2

    invoke-virtual {p1}, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerId()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToMarkerBuilder:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    invoke-virtual {p1}, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/plugins/googlemaps/MarkerBuilder;->consumeTapEvents()Z

    move-result p1

    invoke-direct {p0, v0, p2, p1}, Lio/flutter/plugins/googlemaps/MarkersController;->createControllerForMarker(Ljava/lang/String;Lz6/m;Z)V

    :cond_0
    return-void
.end method

.method public onInfoWindowTap(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->googleMapsMarkerIdToDartMarkerId:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/Convert;->markerIdToJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "infoWindow#onTap"

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onMapsMarkerTap(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->googleMapsMarkerIdToDartMarkerId:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Lio/flutter/plugins/googlemaps/MarkersController;->onMarkerTap(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public onMarkerDrag(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->googleMapsMarkerIdToDartMarkerId:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "markerId"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lio/flutter/plugins/googlemaps/Convert;->latLngToJson(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "position"

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    const-string p2, "marker#onDrag"

    invoke-virtual {p1, p2, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onMarkerDragEnd(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->googleMapsMarkerIdToDartMarkerId:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "markerId"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lio/flutter/plugins/googlemaps/Convert;->latLngToJson(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "position"

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    const-string p2, "marker#onDragEnd"

    invoke-virtual {p1, p2, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onMarkerDragStart(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->googleMapsMarkerIdToDartMarkerId:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "markerId"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lio/flutter/plugins/googlemaps/Convert;->latLngToJson(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "position"

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    const-string p2, "marker#onDragStart"

    invoke-virtual {p1, p2, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onMarkerTap(Ljava/lang/String;)Z
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/Convert;->markerIdToJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "marker#onTap"

    invoke-virtual {v0, v2, v1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToController:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugins/googlemaps/MarkerController;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/flutter/plugins/googlemaps/MarkerController;->consumeTapEvents()Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public removeMarkers(Ljava/util/List;)V
    .locals 1
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

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lio/flutter/plugins/googlemaps/MarkersController;->removeMarker(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public setCollection(Lda/b$a;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerCollection:Lda/b$a;

    return-void
.end method

.method public showMarkerInfoWindow(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToController:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugins/googlemaps/MarkerController;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/flutter/plugins/googlemaps/MarkerController;->showInfoWindow()V

    invoke-interface {p2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string p1, "Invalid markerId"

    const-string v1, "showInfoWindow called with invalid markerId"

    invoke-interface {p2, p1, v1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
