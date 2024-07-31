package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import p012aa.InterfaceC0081b;
import p367z6.C5998b;
import p367z6.C6022n;

/* loaded from: classes2.dex */
class MarkerBuilder implements MarkerOptionsSink, InterfaceC0081b {
    private String clusterManagerId;
    private boolean consumeTapEvents;
    private String markerId;
    private final C6022n markerOptions = new C6022n();

    public MarkerBuilder(String str, String str2) {
        this.markerId = str;
        this.clusterManagerId = str2;
    }

    public C6022n build() {
        return this.markerOptions;
    }

    public String clusterManagerId() {
        return this.clusterManagerId;
    }

    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    @Override // p012aa.InterfaceC0081b
    public LatLng getPosition() {
        return this.markerOptions.m24152S();
    }

    @Override // p012aa.InterfaceC0081b
    public String getSnippet() {
        return this.markerOptions.m24154U();
    }

    @Override // p012aa.InterfaceC0081b
    public String getTitle() {
        return this.markerOptions.m24155V();
    }

    @Override // p012aa.InterfaceC0081b
    public Float getZIndex() {
        return Float.valueOf(this.markerOptions.m24156W());
    }

    public String markerId() {
        return this.markerId;
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setAlpha(float f10) {
        this.markerOptions.m24142I(f10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setAnchor(float f10, float f11) {
        this.markerOptions.m24143J(f10, f11);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setDraggable(boolean z10) {
        this.markerOptions.m24144K(z10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setFlat(boolean z10) {
        this.markerOptions.m24145L(z10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setIcon(C5998b c5998b) {
        this.markerOptions.m24157X(c5998b);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setInfoWindowAnchor(float f10, float f11) {
        this.markerOptions.m24158Y(f10, f11);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setInfoWindowText(String str, String str2) {
        this.markerOptions.m24165f0(str);
        this.markerOptions.m24164e0(str2);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setPosition(LatLng latLng) {
        this.markerOptions.m24162c0(latLng);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setRotation(float f10) {
        this.markerOptions.m24163d0(f10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setVisible(boolean z10) {
        this.markerOptions.m24166g0(z10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setZIndex(float f10) {
        this.markerOptions.m24167h0(f10);
    }

    public void update(C6022n c6022n) {
        c6022n.m24142I(this.markerOptions.m24146M());
        c6022n.m24143J(this.markerOptions.m24147N(), this.markerOptions.m24148O());
        c6022n.m24144K(this.markerOptions.m24159Z());
        c6022n.m24145L(this.markerOptions.m24160a0());
        c6022n.m24157X(this.markerOptions.m24149P());
        c6022n.m24158Y(this.markerOptions.m24150Q(), this.markerOptions.m24151R());
        c6022n.m24165f0(this.markerOptions.m24155V());
        c6022n.m24164e0(this.markerOptions.m24154U());
        c6022n.m24162c0(this.markerOptions.m24152S());
        c6022n.m24163d0(this.markerOptions.m24153T());
        c6022n.m24166g0(this.markerOptions.m24161b0());
        c6022n.m24167h0(this.markerOptions.m24156W());
    }
}
