package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import p367z6.C6006f;

/* loaded from: classes2.dex */
class CircleController implements CircleOptionsSink {
    private final C6006f circle;
    private boolean consumeTapEvents;
    private final float density;
    private final String googleMapsCircleId;

    public CircleController(C6006f c6006f, boolean z10, float f10) {
        this.circle = c6006f;
        this.consumeTapEvents = z10;
        this.density = f10;
        this.googleMapsCircleId = c6006f.m24095a();
    }

    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    public String getGoogleMapsCircleId() {
        return this.googleMapsCircleId;
    }

    public void remove() {
        this.circle.m24096b();
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setCenter(LatLng latLng) {
        this.circle.m24097c(latLng);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
        this.circle.m24098d(z10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setFillColor(int i10) {
        this.circle.m24099e(i10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setRadius(double d10) {
        this.circle.m24100f(d10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setStrokeColor(int i10) {
        this.circle.m24101g(i10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setStrokeWidth(float f10) {
        this.circle.m24102h(f10 * this.density);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setVisible(boolean z10) {
        this.circle.m24103i(z10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setZIndex(float f10) {
        this.circle.m24104j(f10);
    }
}
