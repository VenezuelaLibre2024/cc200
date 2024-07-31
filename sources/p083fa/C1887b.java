package p083fa;

import com.google.android.gms.maps.model.LatLng;
import p068ea.C1763b;

/* renamed from: fa.b */
/* loaded from: classes.dex */
public class C1887b {

    /* renamed from: a */
    public final double f7128a;

    public C1887b(double d10) {
        this.f7128a = d10;
    }

    /* renamed from: a */
    public LatLng m7717a(C1763b c1763b) {
        double d10 = c1763b.f6519a;
        double d11 = this.f7128a;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (c1763b.f6520b / d11))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d10 / d11) - 0.5d) * 360.0d);
    }

    /* renamed from: b */
    public C1886a m7718b(LatLng latLng) {
        double d10 = (latLng.f4595i / 360.0d) + 0.5d;
        double sin = Math.sin(Math.toRadians(latLng.f4594h));
        double log = ((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d11 = this.f7128a;
        return new C1886a(d10 * d11, log * d11);
    }
}
