.class Lio/flutter/plugins/googlemaps/PolygonBuilder;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/googlemaps/PolygonOptionsSink;


# instance fields
.field private consumeTapEvents:Z

.field private final density:F

.field private final polygonOptions:Lz6/r;


# direct methods
.method public constructor <init>(F)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz6/r;

    invoke-direct {v0}, Lz6/r;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lz6/r;

    iput p1, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->density:F

    return-void
.end method


# virtual methods
.method public build()Lz6/r;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lz6/r;

    return-object v0
.end method

.method public consumeTapEvents()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->consumeTapEvents:Z

    return v0
.end method

.method public setConsumeTapEvents(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->consumeTapEvents:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lz6/r;

    invoke-virtual {v0, p1}, Lz6/r;->K(Z)Lz6/r;

    return-void
.end method

.method public setFillColor(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lz6/r;

    invoke-virtual {v0, p1}, Lz6/r;->L(I)Lz6/r;

    return-void
.end method

.method public setGeodesic(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lz6/r;

    invoke-virtual {v0, p1}, Lz6/r;->M(Z)Lz6/r;

    return-void
.end method

.method public setHoles(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;>;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lz6/r;

    invoke-virtual {v1, v0}, Lz6/r;->J(Ljava/lang/Iterable;)Lz6/r;

    goto :goto_0

    :cond_0
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

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lz6/r;

    invoke-virtual {v0, p1}, Lz6/r;->I(Ljava/lang/Iterable;)Lz6/r;

    return-void
.end method

.method public setStrokeColor(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lz6/r;

    invoke-virtual {v0, p1}, Lz6/r;->X(I)Lz6/r;

    return-void
.end method

.method public setStrokeWidth(F)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lz6/r;

    iget v1, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->density:F

    mul-float/2addr p1, v1

    invoke-virtual {v0, p1}, Lz6/r;->Y(F)Lz6/r;

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lz6/r;

    invoke-virtual {v0, p1}, Lz6/r;->Z(Z)Lz6/r;

    return-void
.end method

.method public setZIndex(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lz6/r;

    invoke-virtual {v0, p1}, Lz6/r;->a0(F)Lz6/r;

    return-void
.end method
