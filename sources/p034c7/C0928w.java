package p034c7;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p034c7.C0810n7;

/* renamed from: c7.w */
/* loaded from: classes.dex */
public final class C0928w {

    /* renamed from: f */
    public static final C0928w f3681f = new C0928w((Boolean) null, 100);

    /* renamed from: a */
    public final int f3682a;

    /* renamed from: b */
    public final String f3683b;

    /* renamed from: c */
    public final Boolean f3684c;

    /* renamed from: d */
    public final String f3685d;

    /* renamed from: e */
    public final EnumMap<C0810n7.a, Boolean> f3686e;

    public C0928w(Boolean bool, int i10) {
        this(bool, i10, (Boolean) null, (String) null);
    }

    public C0928w(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap<C0810n7.a, Boolean> enumMap = new EnumMap<>((Class<C0810n7.a>) C0810n7.a.class);
        this.f3686e = enumMap;
        enumMap.put((EnumMap<C0810n7.a, Boolean>) C0810n7.a.AD_USER_DATA, (C0810n7.a) bool);
        this.f3682a = i10;
        this.f3683b = m3937k();
        this.f3684c = bool2;
        this.f3685d = str;
    }

    public C0928w(EnumMap<C0810n7.a, Boolean> enumMap, int i10) {
        this(enumMap, i10, (Boolean) null, (String) null);
    }

    public C0928w(EnumMap<C0810n7.a, Boolean> enumMap, int i10, Boolean bool, String str) {
        EnumMap<C0810n7.a, Boolean> enumMap2 = new EnumMap<>((Class<C0810n7.a>) C0810n7.a.class);
        this.f3686e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f3682a = i10;
        this.f3683b = m3937k();
        this.f3684c = bool;
        this.f3685d = str;
    }

    /* renamed from: b */
    public static C0928w m3927b(Bundle bundle, int i10) {
        if (bundle == null) {
            return new C0928w((Boolean) null, i10);
        }
        EnumMap enumMap = new EnumMap(C0810n7.a.class);
        for (C0810n7.a aVar : EnumC0796m7.DMA.m3614b()) {
            enumMap.put((EnumMap) aVar, (C0810n7.a) C0810n7.m3630q(bundle.getString(aVar.f3361h)));
        }
        return new C0928w((EnumMap<C0810n7.a, Boolean>) enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    /* renamed from: c */
    public static C0928w m3928c(String str) {
        if (str == null || str.length() <= 0) {
            return f3681f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(C0810n7.a.class);
        C0810n7.a[] m3614b = EnumC0796m7.DMA.m3614b();
        int length = m3614b.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            enumMap.put((EnumMap) m3614b[i11], (C0810n7.a) C0810n7.m3624g(split[i10].charAt(0)));
            i11++;
            i10++;
        }
        return new C0928w((EnumMap<C0810n7.a, Boolean>) enumMap, parseInt);
    }

    /* renamed from: d */
    public static Boolean m3929d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return C0810n7.m3630q(bundle.getString("ad_personalization"));
    }

    /* renamed from: a */
    public final int m3930a() {
        return this.f3682a;
    }

    /* renamed from: e */
    public final Bundle m3931e() {
        Bundle bundle = new Bundle();
        for (Map.Entry<C0810n7.a, Boolean> entry : this.f3686e.entrySet()) {
            Boolean value = entry.getValue();
            if (value != null) {
                bundle.putString(entry.getKey().f3361h, C0810n7.m3627j(value.booleanValue()));
            }
        }
        Boolean bool = this.f3684c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f3685d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0928w)) {
            return false;
        }
        C0928w c0928w = (C0928w) obj;
        if (this.f3683b.equalsIgnoreCase(c0928w.f3683b) && Objects.equals(this.f3684c, c0928w.f3684c)) {
            return Objects.equals(this.f3685d, c0928w.f3685d);
        }
        return false;
    }

    /* renamed from: f */
    public final Boolean m3932f() {
        return this.f3686e.get(C0810n7.a.AD_USER_DATA);
    }

    /* renamed from: g */
    public final Boolean m3933g() {
        return this.f3684c;
    }

    /* renamed from: h */
    public final String m3934h() {
        return this.f3685d;
    }

    public final int hashCode() {
        Boolean bool = this.f3684c;
        int i10 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f3685d;
        return this.f3683b.hashCode() + (i10 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    /* renamed from: i */
    public final String m3935i() {
        return this.f3683b;
    }

    /* renamed from: j */
    public final boolean m3936j() {
        Iterator<Boolean> it = this.f3686e.values().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final String m3937k() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f3682a);
        for (C0810n7.a aVar : EnumC0796m7.DMA.m3614b()) {
            sb2.append(":");
            sb2.append(C0810n7.m3620a(this.f3686e.get(aVar)));
        }
        return sb2.toString();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(C0810n7.m3625h(this.f3682a));
        for (C0810n7.a aVar : EnumC0796m7.DMA.m3614b()) {
            sb2.append(",");
            sb2.append(aVar.f3361h);
            sb2.append("=");
            Boolean bool = this.f3686e.get(aVar);
            sb2.append(bool == null ? "uninitialized" : bool.booleanValue() ? "granted" : "denied");
        }
        if (this.f3684c != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(this.f3684c);
        }
        if (this.f3685d != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(this.f3685d);
        }
        return sb2.toString();
    }
}
