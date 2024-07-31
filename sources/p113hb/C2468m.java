package p113hb;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import p129ia.C2677i;
import p129ia.EnumC2669a;
import p129ia.EnumC2673e;

/* renamed from: hb.m */
/* loaded from: classes.dex */
public class C2468m implements InterfaceC2465j {

    /* renamed from: a */
    public Collection<EnumC2669a> f9884a;

    /* renamed from: b */
    public Map<EnumC2673e, ?> f9885b;

    /* renamed from: c */
    public String f9886c;

    /* renamed from: d */
    public int f9887d;

    public C2468m() {
    }

    public C2468m(Collection<EnumC2669a> collection, Map<EnumC2673e, ?> map, String str, int i10) {
        this.f9884a = collection;
        this.f9885b = map;
        this.f9886c = str;
        this.f9887d = i10;
    }

    @Override // p113hb.InterfaceC2465j
    /* renamed from: a */
    public C2464i mo9833a(Map<EnumC2673e, ?> map) {
        EnumMap enumMap = new EnumMap(EnumC2673e.class);
        enumMap.putAll(map);
        Map<EnumC2673e, ?> map2 = this.f9885b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection<EnumC2669a> collection = this.f9884a;
        if (collection != null) {
            enumMap.put((EnumMap) EnumC2673e.POSSIBLE_FORMATS, (EnumC2673e) collection);
        }
        String str = this.f9886c;
        if (str != null) {
            enumMap.put((EnumMap) EnumC2673e.CHARACTER_SET, (EnumC2673e) str);
        }
        C2677i c2677i = new C2677i();
        c2677i.m10894e(enumMap);
        int i10 = this.f9887d;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? new C2464i(c2677i) : new C2470o(c2677i) : new C2469n(c2677i) : new C2464i(c2677i);
    }
}
