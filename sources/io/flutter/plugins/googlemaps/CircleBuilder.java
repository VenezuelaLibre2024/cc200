package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import p367z6.C6008g;

/* loaded from: classes2.dex */
class CircleBuilder implements CircleOptionsSink {
    private final C6008g circleOptions = new C6008g();
    private boolean consumeTapEvents;
    private final float density;

    public CircleBuilder(float f10) {
        this.density = f10;
    }

    public C6008g build() {
        return this.circleOptions;
    }

    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setCenter(LatLng latLng) {
        this.circleOptions.m24105I(latLng);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        this.consumeTapEvents = z10;
        this.circleOptions.m24106J(z10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setFillColor(int i10) {
        this.circleOptions.m24107K(i10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setRadius(double d10) {
        this.circleOptions.m24117U(d10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setStrokeColor(int i10) {
        this.circleOptions.m24118V(i10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setStrokeWidth(float f10) {
        this.circleOptions.m24119W(f10 * this.density);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setVisible(boolean z10) {
        this.circleOptions.m24120X(z10);
    }

    @Override // io.flutter.plugins.googlemaps.CircleOptionsSink
    public void setZIndex(float f10) {
        this.circleOptions.m24121Y(f10);
    }
}
