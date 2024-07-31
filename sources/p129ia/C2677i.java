package p129ia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p013ab.C0084b;
import p069eb.C1764a;
import p143ja.C3273b;
import p256ra.C4335a;
import p324wa.C5459i;
import ua.C4999a;

/* renamed from: ia.i */
/* loaded from: classes.dex */
public final class C2677i implements InterfaceC2680l {

    /* renamed from: c */
    public static final InterfaceC2680l[] f10457c = new InterfaceC2680l[0];

    /* renamed from: a */
    public Map<EnumC2673e, ?> f10458a;

    /* renamed from: b */
    public InterfaceC2680l[] f10459b;

    @Override // p129ia.InterfaceC2680l
    /* renamed from: a */
    public C2682n mo363a(C2671c c2671c) {
        m10894e(null);
        return m10892c(c2671c);
    }

    @Override // p129ia.InterfaceC2680l
    /* renamed from: b */
    public C2682n mo364b(C2671c c2671c, Map<EnumC2673e, ?> map) {
        m10894e(map);
        return m10892c(c2671c);
    }

    /* renamed from: c */
    public final C2682n m10892c(C2671c c2671c) {
        InterfaceC2680l[] interfaceC2680lArr = this.f10459b;
        if (interfaceC2680lArr != null) {
            for (InterfaceC2680l interfaceC2680l : interfaceC2680lArr) {
                try {
                    return interfaceC2680l.mo364b(c2671c, this.f10458a);
                } catch (AbstractC2681m unused) {
                }
            }
            Map<EnumC2673e, ?> map = this.f10458a;
            if (map != null && map.containsKey(EnumC2673e.ALSO_INVERTED)) {
                c2671c.m10875a().m15033e();
                for (InterfaceC2680l interfaceC2680l2 : this.f10459b) {
                    try {
                        return interfaceC2680l2.mo364b(c2671c, this.f10458a);
                    } catch (AbstractC2681m unused2) {
                    }
                }
            }
        }
        throw C2678j.m10895a();
    }

    /* renamed from: d */
    public C2682n m10893d(C2671c c2671c) {
        if (this.f10459b == null) {
            m10894e(null);
        }
        return m10892c(c2671c);
    }

    /* renamed from: e */
    public void m10894e(Map<EnumC2673e, ?> map) {
        this.f10458a = map;
        boolean z10 = true;
        boolean z11 = map != null && map.containsKey(EnumC2673e.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(EnumC2673e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(EnumC2669a.UPC_A) && !collection.contains(EnumC2669a.UPC_E) && !collection.contains(EnumC2669a.EAN_13) && !collection.contains(EnumC2669a.EAN_8) && !collection.contains(EnumC2669a.CODABAR) && !collection.contains(EnumC2669a.CODE_39) && !collection.contains(EnumC2669a.CODE_93) && !collection.contains(EnumC2669a.CODE_128) && !collection.contains(EnumC2669a.ITF) && !collection.contains(EnumC2669a.RSS_14) && !collection.contains(EnumC2669a.RSS_EXPANDED)) {
                z10 = false;
            }
            if (z10 && !z11) {
                arrayList.add(new C5459i(map));
            }
            if (collection.contains(EnumC2669a.QR_CODE)) {
                arrayList.add(new C1764a());
            }
            if (collection.contains(EnumC2669a.DATA_MATRIX)) {
                arrayList.add(new C4335a());
            }
            if (collection.contains(EnumC2669a.AZTEC)) {
                arrayList.add(new C3273b());
            }
            if (collection.contains(EnumC2669a.PDF_417)) {
                arrayList.add(new C0084b());
            }
            if (collection.contains(EnumC2669a.MAXICODE)) {
                arrayList.add(new C4999a());
            }
            if (z10 && z11) {
                arrayList.add(new C5459i(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z11) {
                arrayList.add(new C5459i(map));
            }
            arrayList.add(new C1764a());
            arrayList.add(new C4335a());
            arrayList.add(new C3273b());
            arrayList.add(new C0084b());
            arrayList.add(new C4999a());
            if (z11) {
                arrayList.add(new C5459i(map));
            }
        }
        this.f10459b = (InterfaceC2680l[]) arrayList.toArray(f10457c);
    }

    @Override // p129ia.InterfaceC2680l
    public void reset() {
        InterfaceC2680l[] interfaceC2680lArr = this.f10459b;
        if (interfaceC2680lArr != null) {
            for (InterfaceC2680l interfaceC2680l : interfaceC2680lArr) {
                interfaceC2680l.reset();
            }
        }
    }
}
