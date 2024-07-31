package p324wa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p129ia.AbstractC2681m;
import p129ia.C2678j;
import p129ia.C2682n;
import p129ia.EnumC2669a;
import p129ia.EnumC2673e;
import p211oa.C3964a;
import p340xa.C5745e;
import p356ya.C5904d;

/* renamed from: wa.i */
/* loaded from: classes.dex */
public final class C5459i extends AbstractC5461k {

    /* renamed from: b */
    public static final AbstractC5461k[] f20333b = new AbstractC5461k[0];

    /* renamed from: a */
    public final AbstractC5461k[] f20334a;

    public C5459i(Map<EnumC2673e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(EnumC2673e.POSSIBLE_FORMATS);
        boolean z10 = (map == null || map.get(EnumC2673e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC2669a.EAN_13) || collection.contains(EnumC2669a.UPC_A) || collection.contains(EnumC2669a.EAN_8) || collection.contains(EnumC2669a.UPC_E)) {
                arrayList.add(new C5460j(map));
            }
            if (collection.contains(EnumC2669a.CODE_39)) {
                arrayList.add(new C5453c(z10));
            }
            if (collection.contains(EnumC2669a.CODE_93)) {
                arrayList.add(new C5454d());
            }
            if (collection.contains(EnumC2669a.CODE_128)) {
                arrayList.add(new C5452b());
            }
            if (collection.contains(EnumC2669a.ITF)) {
                arrayList.add(new C5458h());
            }
            if (collection.contains(EnumC2669a.CODABAR)) {
                arrayList.add(new C5451a());
            }
            if (collection.contains(EnumC2669a.RSS_14)) {
                arrayList.add(new C5745e());
            }
            if (collection.contains(EnumC2669a.RSS_EXPANDED)) {
                arrayList.add(new C5904d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C5460j(map));
            arrayList.add(new C5453c());
            arrayList.add(new C5451a());
            arrayList.add(new C5454d());
            arrayList.add(new C5452b());
            arrayList.add(new C5458h());
            arrayList.add(new C5745e());
            arrayList.add(new C5904d());
        }
        this.f20334a = (AbstractC5461k[]) arrayList.toArray(f20333b);
    }

    @Override // p324wa.AbstractC5461k
    /* renamed from: c */
    public C2682n mo21616c(int i10, C3964a c3964a, Map<EnumC2673e, ?> map) {
        for (AbstractC5461k abstractC5461k : this.f20334a) {
            try {
                return abstractC5461k.mo21616c(i10, c3964a, map);
            } catch (AbstractC2681m unused) {
            }
        }
        throw C2678j.m10895a();
    }

    @Override // p324wa.AbstractC5461k, p129ia.InterfaceC2680l
    public void reset() {
        for (AbstractC5461k abstractC5461k : this.f20334a) {
            abstractC5461k.reset();
        }
    }
}
