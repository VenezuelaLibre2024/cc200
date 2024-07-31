package io.flutter.plugins.googlemaps;

import p367z6.C6001c0;
import p367z6.InterfaceC6003d0;

/* loaded from: classes2.dex */
class TileOverlayBuilder implements TileOverlaySink {
    private final C6001c0 tileOverlayOptions = new C6001c0();

    public C6001c0 build() {
        return this.tileOverlayOptions;
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setFadeIn(boolean z10) {
        this.tileOverlayOptions.m24085I(z10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setTileProvider(InterfaceC6003d0 interfaceC6003d0) {
        this.tileOverlayOptions.m24090N(interfaceC6003d0);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setTransparency(float f10) {
        this.tileOverlayOptions.m24091O(f10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setVisible(boolean z10) {
        this.tileOverlayOptions.m24092P(z10);
    }

    @Override // io.flutter.plugins.googlemaps.TileOverlaySink
    public void setZIndex(float f10) {
        this.tileOverlayOptions.m24093Q(f10);
    }
}
