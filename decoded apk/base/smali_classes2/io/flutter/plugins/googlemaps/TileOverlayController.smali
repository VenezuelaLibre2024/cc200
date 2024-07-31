.class Lio/flutter/plugins/googlemaps/TileOverlayController;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/googlemaps/TileOverlaySink;


# instance fields
.field private final tileOverlay:Lz6/b0;


# direct methods
.method public constructor <init>(Lz6/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/TileOverlayController;->tileOverlay:Lz6/b0;

    return-void
.end method


# virtual methods
.method public clearTileCache()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayController;->tileOverlay:Lz6/b0;

    invoke-virtual {v0}, Lz6/b0;->a()V

    return-void
.end method

.method public getTileOverlayInfo()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/TileOverlayController;->tileOverlay:Lz6/b0;

    invoke-virtual {v1}, Lz6/b0;->b()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "fadeIn"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/TileOverlayController;->tileOverlay:Lz6/b0;

    invoke-virtual {v1}, Lz6/b0;->d()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "transparency"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/TileOverlayController;->tileOverlay:Lz6/b0;

    invoke-virtual {v1}, Lz6/b0;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "id"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/TileOverlayController;->tileOverlay:Lz6/b0;

    invoke-virtual {v1}, Lz6/b0;->e()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "zIndex"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/TileOverlayController;->tileOverlay:Lz6/b0;

    invoke-virtual {v1}, Lz6/b0;->f()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "visible"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public remove()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayController;->tileOverlay:Lz6/b0;

    invoke-virtual {v0}, Lz6/b0;->g()V

    return-void
.end method

.method public setFadeIn(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayController;->tileOverlay:Lz6/b0;

    invoke-virtual {v0, p1}, Lz6/b0;->h(Z)V

    return-void
.end method

.method public setTileProvider(Lz6/d0;)V
    .locals 0

    return-void
.end method

.method public setTransparency(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayController;->tileOverlay:Lz6/b0;

    invoke-virtual {v0, p1}, Lz6/b0;->i(F)V

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayController;->tileOverlay:Lz6/b0;

    invoke-virtual {v0, p1}, Lz6/b0;->j(Z)V

    return-void
.end method

.method public setZIndex(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayController;->tileOverlay:Lz6/b0;

    invoke-virtual {v0, p1}, Lz6/b0;->k(F)V

    return-void
.end method
