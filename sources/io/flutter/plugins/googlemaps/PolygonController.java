package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import p367z6.C6028q;

/* loaded from: classes2.dex */
class PolygonController implements PolygonOptionsSink {
    private boolean consumeTapEvents;
    private final float density;
    private final String googleMapsPolygonId;
    private final C6028q polygon;

    public PolygonController(C6028q c6028q, boolean z10, float f10) {
        this.polygon = c6028q;
        this.density = f10;
        this.consumeTapEvents = z10;
        this.googleMapsPolygonId = c6028q.m24175a();
    }

    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    public String getGoogleMapsPolygonId() {
        return this.googleMapsPolygonId;
    }

    public void remove() {
        this.polygon.m24176b();
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
        this.polygon.m24177c(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setFillColor(int i10) {
        this.polygon.m24178d(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setGeodesic(boolean z10) {
        this.polygon.m24179e(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setHoles(List<List<LatLng>> list) {
        this.polygon.m24180f(list);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setPoints(List<LatLng> list) {
        this.polygon.m24181g(list);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setStrokeColor(int i10) {
        this.polygon.m24182h(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setStrokeWidth(float f10) {
        this.polygon.m24183i(f10 * this.density);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setVisible(boolean z10) {
        this.polygon.m24184j(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolygonOptionsSink
    public void setZIndex(float f10) {
        this.polygon.m24185k(f10);
    }
}
