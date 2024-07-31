package p202o1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p262s1.InterfaceC4390d;
import p262s1.InterfaceC4391e;

/* renamed from: o1.h */
/* loaded from: classes.dex */
public class C3835h implements InterfaceC4391e, InterfaceC4390d {

    /* renamed from: p */
    public static final TreeMap<Integer, C3835h> f13830p = new TreeMap<>();

    /* renamed from: h */
    public volatile String f13831h;

    /* renamed from: i */
    public final long[] f13832i;

    /* renamed from: j */
    public final double[] f13833j;

    /* renamed from: k */
    public final String[] f13834k;

    /* renamed from: l */
    public final byte[][] f13835l;

    /* renamed from: m */
    public final int[] f13836m;

    /* renamed from: n */
    public final int f13837n;

    /* renamed from: o */
    public int f13838o;

    public C3835h(int i10) {
        this.f13837n = i10;
        int i11 = i10 + 1;
        this.f13836m = new int[i11];
        this.f13832i = new long[i11];
        this.f13833j = new double[i11];
        this.f13834k = new String[i11];
        this.f13835l = new byte[i11];
    }

    /* renamed from: f */
    public static C3835h m14589f(String str, int i10) {
        TreeMap<Integer, C3835h> treeMap = f13830p;
        synchronized (treeMap) {
            Map.Entry<Integer, C3835h> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry == null) {
                C3835h c3835h = new C3835h(i10);
                c3835h.m14595j(str, i10);
                return c3835h;
            }
            treeMap.remove(ceilingEntry.getKey());
            C3835h value = ceilingEntry.getValue();
            value.m14595j(str, i10);
            return value;
        }
    }

    /* renamed from: l */
    public static void m14590l() {
        TreeMap<Integer, C3835h> treeMap = f13830p;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i10 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i10;
        }
    }

    @Override // p262s1.InterfaceC4390d
    /* renamed from: M */
    public void mo14591M(int i10, long j10) {
        this.f13836m[i10] = 2;
        this.f13832i[i10] = j10;
    }

    @Override // p262s1.InterfaceC4390d
    /* renamed from: Q */
    public void mo14592Q(int i10, byte[] bArr) {
        this.f13836m[i10] = 5;
        this.f13835l[i10] = bArr;
    }

    @Override // p262s1.InterfaceC4391e
    /* renamed from: a */
    public String mo14593a() {
        return this.f13831h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p262s1.InterfaceC4391e
    /* renamed from: d */
    public void mo14594d(InterfaceC4390d interfaceC4390d) {
        for (int i10 = 1; i10 <= this.f13838o; i10++) {
            int i11 = this.f13836m[i10];
            if (i11 == 1) {
                interfaceC4390d.mo14596j0(i10);
            } else if (i11 == 2) {
                interfaceC4390d.mo14591M(i10, this.f13832i[i10]);
            } else if (i11 == 3) {
                interfaceC4390d.mo14599y(i10, this.f13833j[i10]);
            } else if (i11 == 4) {
                interfaceC4390d.mo14598q(i10, this.f13834k[i10]);
            } else if (i11 == 5) {
                interfaceC4390d.mo14592Q(i10, this.f13835l[i10]);
            }
        }
    }

    /* renamed from: j */
    public void m14595j(String str, int i10) {
        this.f13831h = str;
        this.f13838o = i10;
    }

    @Override // p262s1.InterfaceC4390d
    /* renamed from: j0 */
    public void mo14596j0(int i10) {
        this.f13836m[i10] = 1;
    }

    /* renamed from: n */
    public void m14597n() {
        TreeMap<Integer, C3835h> treeMap = f13830p;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f13837n), this);
            m14590l();
        }
    }

    @Override // p262s1.InterfaceC4390d
    /* renamed from: q */
    public void mo14598q(int i10, String str) {
        this.f13836m[i10] = 4;
        this.f13834k[i10] = str;
    }

    @Override // p262s1.InterfaceC4390d
    /* renamed from: y */
    public void mo14599y(int i10, double d10) {
        this.f13836m[i10] = 3;
        this.f13833j[i10] = d10;
    }
}
