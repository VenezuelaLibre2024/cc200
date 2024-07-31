package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import p367z6.C6004e;
import p367z6.C6024o;
import p367z6.C6034t;

/* loaded from: classes2.dex */
class PolylineBuilder implements PolylineOptionsSink {
    private boolean consumeTapEvents;
    private final float density;
    private final C6034t polylineOptions = new C6034t();

    public PolylineBuilder(float f10) {
        this.density = f10;
    }

    public C6034t build() {
        return this.polylineOptions;
    }

    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setColor(int i10) {
        this.polylineOptions.m24220K(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
        this.polylineOptions.m24219J(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setEndCap(C6004e c6004e) {
        this.polylineOptions.m24221L(c6004e);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setGeodesic(boolean z10) {
        this.polylineOptions.m24222M(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setJointType(int i10) {
        this.polylineOptions.m24234Y(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setPattern(List<C6024o> list) {
        this.polylineOptions.m24235Z(list);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setPoints(List<LatLng> list) {
        this.polylineOptions.m24218I(list);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setStartCap(C6004e c6004e) {
        this.polylineOptions.m24236a0(c6004e);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setVisible(boolean z10) {
        this.polylineOptions.m24237b0(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setWidth(float f10) {
        this.polylineOptions.m24238c0(f10 * this.density);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setZIndex(float f10) {
        this.polylineOptions.m24239d0(f10);
    }
}
