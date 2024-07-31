.class Lio/flutter/plugins/googlemaps/TileOverlayBuilder;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/googlemaps/TileOverlaySink;


# instance fields
.field private final tileOverlayOptions:Lz6/c0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz6/c0;

    invoke-direct {v0}, Lz6/c0;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayBuilder;->tileOverlayOptions:Lz6/c0;

    return-void
.end method


# virtual methods
.method public build()Lz6/c0;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayBuilder;->tileOverlayOptions:Lz6/c0;

    return-object v0
.end method

.method public setFadeIn(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayBuilder;->tileOverlayOptions:Lz6/c0;

    invoke-virtual {v0, p1}, Lz6/c0;->I(Z)Lz6/c0;

    return-void
.end method

.method public setTileProvider(Lz6/d0;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayBuilder;->tileOverlayOptions:Lz6/c0;

    invoke-virtual {v0, p1}, Lz6/c0;->N(Lz6/d0;)Lz6/c0;

    return-void
.end method

.method public setTransparency(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayBuilder;->tileOverlayOptions:Lz6/c0;

    invoke-virtual {v0, p1}, Lz6/c0;->O(F)Lz6/c0;

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayBuilder;->tileOverlayOptions:Lz6/c0;

    invoke-virtual {v0, p1}, Lz6/c0;->P(Z)Lz6/c0;

    return-void
.end method

.method public setZIndex(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayBuilder;->tileOverlayOptions:Lz6/c0;

    invoke-virtual {v0, p1}, Lz6/c0;->Q(F)Lz6/c0;

    return-void
.end method
