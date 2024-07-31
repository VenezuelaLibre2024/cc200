package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import p367z6.C6004e;
import p367z6.C6024o;
import p367z6.C6032s;

/* loaded from: classes2.dex */
class PolylineController implements PolylineOptionsSink {
    private boolean consumeTapEvents;
    private final float density;
    private final String googleMapsPolylineId;
    private final C6032s polyline;

    public PolylineController(C6032s c6032s, boolean z10, float f10) {
        this.polyline = c6032s;
        this.consumeTapEvents = z10;
        this.density = f10;
        this.googleMapsPolylineId = c6032s.m24205a();
    }

    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    public String getGoogleMapsPolylineId() {
        return this.googleMapsPolylineId;
    }

    public void remove() {
        this.polyline.m24206b();
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setColor(int i10) {
        this.polyline.m24208d(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
        this.polyline.m24207c(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setEndCap(C6004e c6004e) {
        this.polyline.m24209e(c6004e);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setGeodesic(boolean z10) {
        this.polyline.m24210f(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setJointType(int i10) {
        this.polyline.m24211g(i10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setPattern(List<C6024o> list) {
        this.polyline.m24212h(list);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setPoints(List<LatLng> list) {
        this.polyline.m24213i(list);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setStartCap(C6004e c6004e) {
        this.polyline.m24214j(c6004e);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setVisible(boolean z10) {
        this.polyline.m24215k(z10);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setWidth(float f10) {
        this.polyline.m24216l(f10 * this.density);
    }

    @Override // io.flutter.plugins.googlemaps.PolylineOptionsSink
    public void setZIndex(float f10) {
        this.polyline.m24217m(f10);
    }
}
