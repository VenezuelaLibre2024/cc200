package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.Iterator;
import java.util.List;
import p367z6.C6030r;

/* loaded from: classes2.dex */
class PolygonBuilder implements PolygonOptionsSink {
    private boolean consumeTapEvents;
    private final float density;
    private final C6030r polygonOptions = new C6030r();

    public PolygonBuilder(float f10) {
        this.density = f10;
    }

    public C6030r build() {
        return this.polygonOptions;
    }

    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
        this.polygonOptions.m24188K(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setFillColor(int i10) {
        this.polygonOptions.m24189L(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setGeodesic(boolean z10) {
        this.polygonOptions.m24190M(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setHoles(List<List<LatLng>> list) {
        Iterator<List<LatLng>> it = list.iterator();
        while (it.hasNext()) {
            this.polygonOptions.m24187J(it.next());
        }
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setPoints(List<LatLng> list) {
        this.polygonOptions.m24186I(list);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setStrokeColor(int i10) {
        this.polygonOptions.m24201X(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setStrokeWidth(float f10) {
        this.polygonOptions.m24202Y(f10 * this.density);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setVisible(boolean z10) {
        this.polygonOptions.m24203Z(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setZIndex(float f10) {
        this.polygonOptions.m24204a0(f10);
    }
}
