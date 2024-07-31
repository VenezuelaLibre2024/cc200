.class Lio/flutter/plugins/googlemaps/CircleBuilder;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/googlemaps/CircleOptionsSink;


# instance fields
.field private final circleOptions:Lz6/g;

.field private consumeTapEvents:Z

.field private final density:F


# direct methods
.method public constructor <init>(F)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz6/g;

    invoke-direct {v0}, Lz6/g;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lz6/g;

    iput p1, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->density:F

    return-void
.end method


# virtual methods
.method public build()Lz6/g;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lz6/g;

    return-object v0
.end method

.method public consumeTapEvents()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->consumeTapEvents:Z

    return v0
.end method

.method public setCenter(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lz6/g;

    invoke-virtual {v0, p1}, Lz6/g;->I(Lcom/google/android/gms/maps/model/LatLng;)Lz6/g;

    return-void
.end method

.method public setConsumeTapEvents(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->consumeTapEvents:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lz6/g;

    invoke-virtual {v0, p1}, Lz6/g;->J(Z)Lz6/g;

    return-void
.end method

.method public setFillColor(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lz6/g;

    invoke-virtual {v0, p1}, Lz6/g;->K(I)Lz6/g;

    return-void
.end method

.method public setRadius(D)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lz6/g;

    invoke-virtual {v0, p1, p2}, Lz6/g;->U(D)Lz6/g;

    return-void
.end method

.method public setStrokeColor(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lz6/g;

    invoke-virtual {v0, p1}, Lz6/g;->V(I)Lz6/g;

    return-void
.end method

.method public setStrokeWidth(F)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lz6/g;

    iget v1, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->density:F

    mul-float/2addr p1, v1

    invoke-virtual {v0, p1}, Lz6/g;->W(F)Lz6/g;

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lz6/g;

    invoke-virtual {v0, p1}, Lz6/g;->X(Z)Lz6/g;

    return-void
.end method

.method public setZIndex(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lz6/g;

    invoke-virtual {v0, p1}, Lz6/g;->Y(F)Lz6/g;

    return-void
.end method
