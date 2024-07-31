package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.lang.ref.WeakReference;
import p052da.C1607b;
import p367z6.C5998b;
import p367z6.C6020m;

/* loaded from: classes2.dex */
class MarkerController implements MarkerOptionsSink {
    private boolean consumeTapEvents;
    private final String googleMapsMarkerId;
    private final WeakReference<C6020m> weakMarker;

    public MarkerController(C6020m c6020m, boolean z10) {
        this.weakMarker = new WeakReference<>(c6020m);
        this.consumeTapEvents = z10;
        this.googleMapsMarkerId = c6020m.m24122a();
    }

    public boolean consumeTapEvents() {
        return this.consumeTapEvents;
    }

    public String getGoogleMapsMarkerId() {
        return this.googleMapsMarkerId;
    }

    public void hideInfoWindow() {
        C6020m c6020m = this.weakMarker.get();
        if (c6020m == null) {
            return;
        }
        c6020m.m24126e();
    }

    public boolean isInfoWindowShown() {
        C6020m c6020m = this.weakMarker.get();
        if (c6020m == null) {
            return false;
        }
        return c6020m.m24127f();
    }

    public void removeFromCollection(C1607b.a aVar) {
        C6020m c6020m = this.weakMarker.get();
        if (c6020m == null) {
            return;
        }
        aVar.m6453j(c6020m);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setAlpha(float f10) {
        C6020m c6020m = this.weakMarker.get();
        if (c6020m == null) {
            return;
        }
        c6020m.m24129h(f10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setAnchor(float f10, float f11) {
        C6020m c6020m = this.weakMarker.get();
        if (c6020m == null) {
            return;
        }
        c6020m.m24130i(f10, f11);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setConsumeTapEvents(boolean z10) {
        if (this.weakMarker.get() == null) {
            return;
        }
        this.consumeTapEvents = z10;
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setDraggable(boolean z10) {
        C6020m c6020m = this.weakMarker.get();
        if (c6020m == null) {
            return;
        }
        c6020m.m24131j(z10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setFlat(boolean z10) {
        C6020m c6020m = this.weakMarker.get();
        if (c6020m == null) {
            return;
        }
        c6020m.m24132k(z10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setIcon(C5998b c5998b) {
        C6020m c6020m = this.weakMarker.get();
        if (c6020m == null) {
            return;
        }
        c6020m.m24133l(c5998b);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setInfoWindowAnchor(float f10, float f11) {
        C6020m c6020m = this.weakMarker.get();
        if (c6020m == null) {
            return;
        }
        c6020m.m24134m(f10, f11);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setInfoWindowText(String str, String str2) {
        C6020m c6020m = this.weakMarker.get();
        if (c6020m == null) {
            return;
        }
        c6020m.m24138q(str);
        c6020m.m24137p(str2);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setPosition(LatLng latLng) {
        C6020m c6020m = this.weakMarker.get();
        if (c6020m == null) {
            return;
        }
        c6020m.m24135n(latLng);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setRotation(float f10) {
        C6020m c6020m = this.weakMarker.get();
        if (c6020m == null) {
            return;
        }
        c6020m.m24136o(f10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setVisible(boolean z10) {
        C6020m c6020m = this.weakMarker.get();
        if (c6020m == null) {
            return;
        }
        c6020m.m24139r(z10);
    }

    @Override // io.flutter.plugins.googlemaps.MarkerOptionsSink
    public void setZIndex(float f10) {
        C6020m c6020m = this.weakMarker.get();
        if (c6020m == null) {
            return;
        }
        c6020m.m24140s(f10);
    }

    public void showInfoWindow() {
        C6020m c6020m = this.weakMarker.get();
        if (c6020m == null) {
            return;
        }
        c6020m.m24141t();
    }
}
