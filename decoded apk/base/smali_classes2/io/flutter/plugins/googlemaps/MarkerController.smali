.class Lio/flutter/plugins/googlemaps/MarkerController;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/googlemaps/MarkerOptionsSink;


# instance fields
.field private consumeTapEvents:Z

.field private final googleMapsMarkerId:Ljava/lang/String;

.field private final weakMarker:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lz6/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lz6/m;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->weakMarker:Ljava/lang/ref/WeakReference;

    iput-boolean p2, p0, Lio/flutter/plugins/googlemaps/MarkerController;->consumeTapEvents:Z

    invoke-virtual {p1}, Lz6/m;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/MarkerController;->googleMapsMarkerId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public consumeTapEvents()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->consumeTapEvents:Z

    return v0
.end method

.method public getGoogleMapsMarkerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->googleMapsMarkerId:Ljava/lang/String;

    return-object v0
.end method

.method public hideInfoWindow()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->weakMarker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/m;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lz6/m;->e()V

    return-void
.end method

.method public isInfoWindowShown()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->weakMarker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/m;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lz6/m;->f()Z

    move-result v0

    return v0
.end method

.method public removeFromCollection(Lda/b$a;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->weakMarker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/m;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, v0}, Lda/b$a;->j(Lz6/m;)Z

    return-void
.end method

.method public setAlpha(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->weakMarker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/m;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lz6/m;->h(F)V

    return-void
.end method

.method public setAnchor(FF)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->weakMarker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/m;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1, p2}, Lz6/m;->i(FF)V

    return-void
.end method

.method public setConsumeTapEvents(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->weakMarker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/m;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/MarkerController;->consumeTapEvents:Z

    return-void
.end method

.method public setDraggable(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->weakMarker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/m;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lz6/m;->j(Z)V

    return-void
.end method

.method public setFlat(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->weakMarker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/m;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lz6/m;->k(Z)V

    return-void
.end method

.method public setIcon(Lz6/b;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->weakMarker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/m;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lz6/m;->l(Lz6/b;)V

    return-void
.end method

.method public setInfoWindowAnchor(FF)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->weakMarker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/m;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1, p2}, Lz6/m;->m(FF)V

    return-void
.end method

.method public setInfoWindowText(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->weakMarker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/m;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lz6/m;->q(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Lz6/m;->p(Ljava/lang/String;)V

    return-void
.end method

.method public setPosition(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->weakMarker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/m;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lz6/m;->n(Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public setRotation(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->weakMarker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/m;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lz6/m;->o(F)V

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->weakMarker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/m;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lz6/m;->r(Z)V

    return-void
.end method

.method public setZIndex(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->weakMarker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/m;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lz6/m;->s(F)V

    return-void
.end method

.method public showInfoWindow()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->weakMarker:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz6/m;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lz6/m;->t()V

    return-void
.end method
