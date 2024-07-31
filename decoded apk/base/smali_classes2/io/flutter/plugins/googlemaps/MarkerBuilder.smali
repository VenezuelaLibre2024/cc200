.class Lio/flutter/plugins/googlemaps/MarkerBuilder;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/googlemaps/MarkerOptionsSink;
.implements Laa/b;


# instance fields
.field private clusterManagerId:Ljava/lang/String;

.field private consumeTapEvents:Z

.field private markerId:Ljava/lang/String;

.field private final markerOptions:Lz6/n;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz6/n;

    invoke-direct {v0}, Lz6/n;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerId:Ljava/lang/String;

    iput-object p2, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->clusterManagerId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public build()Lz6/n;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    return-object v0
.end method

.method public clusterManagerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->clusterManagerId:Ljava/lang/String;

    return-object v0
.end method

.method public consumeTapEvents()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->consumeTapEvents:Z

    return v0
.end method

.method public getPosition()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0}, Lz6/n;->S()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    return-object v0
.end method

.method public getSnippet()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0}, Lz6/n;->U()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0}, Lz6/n;->V()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getZIndex()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0}, Lz6/n;->W()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public markerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerId:Ljava/lang/String;

    return-object v0
.end method

.method public setAlpha(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0, p1}, Lz6/n;->I(F)Lz6/n;

    return-void
.end method

.method public setAnchor(FF)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0, p1, p2}, Lz6/n;->J(FF)Lz6/n;

    return-void
.end method

.method public setConsumeTapEvents(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->consumeTapEvents:Z

    return-void
.end method

.method public setDraggable(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0, p1}, Lz6/n;->K(Z)Lz6/n;

    return-void
.end method

.method public setFlat(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0, p1}, Lz6/n;->L(Z)Lz6/n;

    return-void
.end method

.method public setIcon(Lz6/b;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0, p1}, Lz6/n;->X(Lz6/b;)Lz6/n;

    return-void
.end method

.method public setInfoWindowAnchor(FF)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0, p1, p2}, Lz6/n;->Y(FF)Lz6/n;

    return-void
.end method

.method public setInfoWindowText(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0, p1}, Lz6/n;->f0(Ljava/lang/String;)Lz6/n;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {p1, p2}, Lz6/n;->e0(Ljava/lang/String;)Lz6/n;

    return-void
.end method

.method public setPosition(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0, p1}, Lz6/n;->c0(Lcom/google/android/gms/maps/model/LatLng;)Lz6/n;

    return-void
.end method

.method public setRotation(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0, p1}, Lz6/n;->d0(F)Lz6/n;

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0, p1}, Lz6/n;->g0(Z)Lz6/n;

    return-void
.end method

.method public setZIndex(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0, p1}, Lz6/n;->h0(F)Lz6/n;

    return-void
.end method

.method public update(Lz6/n;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0}, Lz6/n;->M()F

    move-result v0

    invoke-virtual {p1, v0}, Lz6/n;->I(F)Lz6/n;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0}, Lz6/n;->N()F

    move-result v0

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v1}, Lz6/n;->O()F

    move-result v1

    invoke-virtual {p1, v0, v1}, Lz6/n;->J(FF)Lz6/n;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0}, Lz6/n;->Z()Z

    move-result v0

    invoke-virtual {p1, v0}, Lz6/n;->K(Z)Lz6/n;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0}, Lz6/n;->a0()Z

    move-result v0

    invoke-virtual {p1, v0}, Lz6/n;->L(Z)Lz6/n;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0}, Lz6/n;->P()Lz6/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lz6/n;->X(Lz6/b;)Lz6/n;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0}, Lz6/n;->Q()F

    move-result v0

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v1}, Lz6/n;->R()F

    move-result v1

    invoke-virtual {p1, v0, v1}, Lz6/n;->Y(FF)Lz6/n;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0}, Lz6/n;->V()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lz6/n;->f0(Ljava/lang/String;)Lz6/n;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0}, Lz6/n;->U()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lz6/n;->e0(Ljava/lang/String;)Lz6/n;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0}, Lz6/n;->S()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-virtual {p1, v0}, Lz6/n;->c0(Lcom/google/android/gms/maps/model/LatLng;)Lz6/n;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0}, Lz6/n;->T()F

    move-result v0

    invoke-virtual {p1, v0}, Lz6/n;->d0(F)Lz6/n;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0}, Lz6/n;->b0()Z

    move-result v0

    invoke-virtual {p1, v0}, Lz6/n;->g0(Z)Lz6/n;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lz6/n;

    invoke-virtual {v0}, Lz6/n;->W()F

    move-result v0

    invoke-virtual {p1, v0}, Lz6/n;->h0(F)Lz6/n;

    return-void
.end method
