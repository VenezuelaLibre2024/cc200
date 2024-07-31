package p352y6;

import android.os.Bundle;
import android.os.Parcelable;
import p108h6.C2394s;

/* renamed from: y6.d0 */
/* loaded from: classes.dex */
public final class C5825d0 {
    /* renamed from: a */
    public static Parcelable m23437a(Bundle bundle, String str) {
        ClassLoader m23440d = m23440d();
        bundle.setClassLoader(m23440d);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(m23440d);
        return bundle2.getParcelable(str);
    }

    /* renamed from: b */
    public static void m23438b(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Parcelable m23437a = m23437a(bundle, "MapOptions");
        if (m23437a != null) {
            m23439c(bundle2, "MapOptions", m23437a);
        }
        Parcelable m23437a2 = m23437a(bundle, "StreetViewPanoramaOptions");
        if (m23437a2 != null) {
            m23439c(bundle2, "StreetViewPanoramaOptions", m23437a2);
        }
        Parcelable m23437a3 = m23437a(bundle, "camera");
        if (m23437a3 != null) {
            m23439c(bundle2, "camera", m23437a3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    /* renamed from: c */
    public static void m23439c(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader m23440d = m23440d();
        bundle.setClassLoader(m23440d);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(m23440d);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    /* renamed from: d */
    public static ClassLoader m23440d() {
        return (ClassLoader) C2394s.m9619l(C5825d0.class.getClassLoader());
    }
}
