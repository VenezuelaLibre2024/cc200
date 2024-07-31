.class Lio/flutter/plugins/googlemaps/PolylineBuilder;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/googlemaps/PolylineOptionsSink;


# instance fields
.field private consumeTapEvents:Z

.field private final density:F

.field private final polylineOptions:Lz6/t;


# direct methods
.method public constructor <init>(F)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz6/t;

    invoke-direct {v0}, Lz6/t;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lz6/t;

    iput p1, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->density:F

    return-void
.end method


# virtual methods
.method public build()Lz6/t;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lz6/t;

    return-object v0
.end method

.method public consumeTapEvents()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->consumeTapEvents:Z

    return v0
.end method

.method public setColor(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lz6/t;

    invoke-virtual {v0, p1}, Lz6/t;->K(I)Lz6/t;

    return-void
.end method

.method public setConsumeTapEvents(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->consumeTapEvents:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lz6/t;

    invoke-virtual {v0, p1}, Lz6/t;->J(Z)Lz6/t;

    return-void
.end method

.method public setEndCap(Lz6/e;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lz6/t;

    invoke-virtual {v0, p1}, Lz6/t;->L(Lz6/e;)Lz6/t;

    return-void
.end method

.method public setGeodesic(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lz6/t;

    invoke-virtual {v0, p1}, Lz6/t;->M(Z)Lz6/t;

    return-void
.end method

.method public setJointType(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lz6/t;

    invoke-virtual {v0, p1}, Lz6/t;->Y(I)Lz6/t;

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

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lz6/t;

    invoke-virtual {v0, p1}, Lz6/t;->Z(Ljava/util/List;)Lz6/t;

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

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lz6/t;

    invoke-virtual {v0, p1}, Lz6/t;->I(Ljava/lang/Iterable;)Lz6/t;

    return-void
.end method

.method public setStartCap(Lz6/e;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lz6/t;

    invoke-virtual {v0, p1}, Lz6/t;->a0(Lz6/e;)Lz6/t;

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lz6/t;

    invoke-virtual {v0, p1}, Lz6/t;->b0(Z)Lz6/t;

    return-void
.end method

.method public setWidth(F)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lz6/t;

    iget v1, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->density:F

    mul-float/2addr p1, v1

    invoke-virtual {v0, p1}, Lz6/t;->c0(F)Lz6/t;

    return-void
.end method

.method public setZIndex(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lz6/t;

    invoke-virtual {v0, p1}, Lz6/t;->d0(F)Lz6/t;

    return-void
.end method
