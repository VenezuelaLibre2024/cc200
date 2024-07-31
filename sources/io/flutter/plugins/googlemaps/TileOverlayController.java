package io.flutter.plugins.googlemaps;

import java.util.HashMap;
import java.util.Map;
import p367z6.C5999b0;
import p367z6.InterfaceC6003d0;

/* loaded from: classes2.dex */
class TileOverlayController implements TileOverlaySink {
    private final C5999b0 tileOverlay;

    public TileOverlayController(C5999b0 c5999b0) {
        this.tileOverlay = c5999b0;
    }

    public void clearTileCache() {
        this.tileOverlay.m24067a();
    }

    public Map<String, Object> getTileOverlayInfo() {
        HashMap hashMap = new HashMap();
        hashMap.put("fadeIn", Boolean.valueOf(this.tileOverlay.m24068b()));
        hashMap.put("transparency", Float.valueOf(this.tileOverlay.m24070d()));
        hashMap.put("id", this.tileOverlay.m24069c());
        hashMap.put("zIndex", Float.valueOf(this.tileOverlay.m24071e()));
        hashMap.put("visible", Boolean.valueOf(this.tileOverlay.m24072f()));
        return hashMap;
    }

    public void remove() {
        this.tileOverlay.m24073g();
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setFadeIn(boolean z10) {
        this.tileOverlay.m24074h(z10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setTileProvider(InterfaceC6003d0 interfaceC6003d0) {
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setTransparency(float f10) {
        this.tileOverlay.m24075i(f10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setVisible(boolean z10) {
        this.tileOverlay.m24076j(z10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setZIndex(float f10) {
        this.tileOverlay.m24077k(f10);
    }
}
