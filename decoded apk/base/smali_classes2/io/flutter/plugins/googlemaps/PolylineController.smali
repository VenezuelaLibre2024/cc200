.class Lio/flutter/plugins/googlemaps/PolylineController;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/googlemaps/PolylineOptionsSink;


# instance fields
.field private consumeTapEvents:Z

.field private final density:F

.field private final googleMapsPolylineId:Ljava/lang/String;

.field private final polyline:Lz6/s;


# direct methods
.method public constructor <init>(Lz6/s;ZF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lz6/s;

    iput-boolean p2, p0, Lio/flutter/plugins/googlemaps/PolylineController;->consumeTapEvents:Z

    iput p3, p0, Lio/flutter/plugins/googlemaps/PolylineController;->density:F

    invoke-virtual {p1}, Lz6/s;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/PolylineController;->googleMapsPolylineId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public consumeTapEvents()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->consumeTapEvents:Z

    return v0
.end method

.method public getGoogleMapsPolylineId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->googleMapsPolylineId:Ljava/lang/String;

    return-object v0
.end method

.method public remove()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lz6/s;

    invoke-virtual {v0}, Lz6/s;->b()V

    return-void
.end method

.method public setColor(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lz6/s;

    invoke-virtual {v0, p1}, Lz6/s;->d(I)V

    return-void
.end method

.method public setConsumeTapEvents(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/PolylineController;->consumeTapEvents:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lz6/s;

    invoke-virtual {v0, p1}, Lz6/s;->c(Z)V

    return-void
.end method

.method public setEndCap(Lz6/e;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lz6/s;

    invoke-virtual {v0, p1}, Lz6/s;->e(Lz6/e;)V

    return-void
.end method

.method public setGeodesic(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lz6/s;

    invoke-virtual {v0, p1}, Lz6/s;->f(Z)V

    return-void
.end method

.method public setJointType(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lz6/s;

    invoke-virtual {v0, p1}, Lz6/s;->g(I)V

    return-void
.end method

.method public setPattern(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lz6/o;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lz6/s;

    invoke-virtual {v0, p1}, Lz6/s;->h(Ljava/util/List;)V

    return-void
.end method

.method public setPoints(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lz6/s;

    invoke-virtual {v0, p1}, Lz6/s;->i(Ljava/util/List;)V

    return-void
.end method

.method public setStartCap(Lz6/e;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lz6/s;

    invoke-virtual {v0, p1}, Lz6/s;->j(Lz6/e;)V

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lz6/s;

    invoke-virtual {v0, p1}, Lz6/s;->k(Z)V

    return-void
.end method

.method public setWidth(F)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lz6/s;

    iget v1, p0, Lio/flutter/plugins/googlemaps/PolylineController;->density:F

    mul-float/2addr p1, v1

    invoke-virtual {v0, p1}, Lz6/s;->l(F)V

    return-void
.end method

.method public setZIndex(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lz6/s;

    invoke-virtual {v0, p1}, Lz6/s;->m(F)V

    return-void
.end method
