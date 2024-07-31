package p019b4;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p222p5.C4015a0;
import p333x3.C5570j;

/* renamed from: b4.d */
/* loaded from: classes.dex */
public final class C0477d extends AbstractC0478e {

    /* renamed from: b */
    public long f2262b;

    /* renamed from: c */
    public long[] f2263c;

    /* renamed from: d */
    public long[] f2264d;

    public C0477d() {
        super(new C5570j());
        this.f2262b = -9223372036854775807L;
        this.f2263c = new long[0];
        this.f2264d = new long[0];
    }

    /* renamed from: g */
    public static Boolean m2399g(C4015a0 c4015a0) {
        return Boolean.valueOf(c4015a0.m15210G() == 1);
    }

    /* renamed from: h */
    public static Object m2400h(C4015a0 c4015a0, int i10) {
        if (i10 == 0) {
            return m2402j(c4015a0);
        }
        if (i10 == 1) {
            return m2399g(c4015a0);
        }
        if (i10 == 2) {
            return m2406n(c4015a0);
        }
        if (i10 == 3) {
            return m2404l(c4015a0);
        }
        if (i10 == 8) {
            return m2403k(c4015a0);
        }
        if (i10 == 10) {
            return m2405m(c4015a0);
        }
        if (i10 != 11) {
            return null;
        }
        return m2401i(c4015a0);
    }

    /* renamed from: i */
    public static Date m2401i(C4015a0 c4015a0) {
        Date date = new Date((long) m2402j(c4015a0).doubleValue());
        c4015a0.m15224U(2);
        return date;
    }

    /* renamed from: j */
    public static Double m2402j(C4015a0 c4015a0) {
        return Double.valueOf(Double.longBitsToDouble(c4015a0.m15251z()));
    }

    /* renamed from: k */
    public static HashMap<String, Object> m2403k(C4015a0 c4015a0) {
        int m15214K = c4015a0.m15214K();
        HashMap<String, Object> hashMap = new HashMap<>(m15214K);
        for (int i10 = 0; i10 < m15214K; i10++) {
            String m2406n = m2406n(c4015a0);
            Object m2400h = m2400h(c4015a0, m2407o(c4015a0));
            if (m2400h != null) {
                hashMap.put(m2406n, m2400h);
            }
        }
        return hashMap;
    }

    /* renamed from: l */
    public static HashMap<String, Object> m2404l(C4015a0 c4015a0) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String m2406n = m2406n(c4015a0);
            int m2407o = m2407o(c4015a0);
            if (m2407o == 9) {
                return hashMap;
            }
            Object m2400h = m2400h(c4015a0, m2407o);
            if (m2400h != null) {
                hashMap.put(m2406n, m2400h);
            }
        }
    }

    /* renamed from: m */
    public static ArrayList<Object> m2405m(C4015a0 c4015a0) {
        int m15214K = c4015a0.m15214K();
        ArrayList<Object> arrayList = new ArrayList<>(m15214K);
        for (int i10 = 0; i10 < m15214K; i10++) {
            Object m2400h = m2400h(c4015a0, m2407o(c4015a0));
            if (m2400h != null) {
                arrayList.add(m2400h);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public static String m2406n(C4015a0 c4015a0) {
        int m15216M = c4015a0.m15216M();
        int m15231f = c4015a0.m15231f();
        c4015a0.m15224U(m15216M);
        return new String(c4015a0.m15230e(), m15231f, m15216M);
    }

    /* renamed from: o */
    public static int m2407o(C4015a0 c4015a0) {
        return c4015a0.m15210G();
    }

    @Override // p019b4.AbstractC0478e
    /* renamed from: b */
    public boolean mo2388b(C4015a0 c4015a0) {
        return true;
    }

    @Override // p019b4.AbstractC0478e
    /* renamed from: c */
    public boolean mo2389c(C4015a0 c4015a0, long j10) {
        if (m2407o(c4015a0) != 2 || !"onMetaData".equals(m2406n(c4015a0)) || c4015a0.m15226a() == 0 || m2407o(c4015a0) != 8) {
            return false;
        }
        HashMap<String, Object> m2403k = m2403k(c4015a0);
        Object obj = m2403k.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f2262b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = m2403k.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f2263c = new long[size];
                this.f2264d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f2263c = new long[0];
                        this.f2264d = new long[0];
                        break;
                    }
                    this.f2263c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f2264d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public long m2408d() {
        return this.f2262b;
    }

    /* renamed from: e */
    public long[] m2409e() {
        return this.f2264d;
    }

    /* renamed from: f */
    public long[] m2410f() {
        return this.f2263c;
    }
}
