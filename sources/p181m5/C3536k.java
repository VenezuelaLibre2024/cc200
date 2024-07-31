package p181m5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p047d5.C1547b;
import p047d5.InterfaceC1553h;
import p222p5.C4014a;
import p222p5.C4041n0;

/* renamed from: m5.k */
/* loaded from: classes.dex */
public final class C3536k implements InterfaceC1553h {

    /* renamed from: h */
    public final List<C3530e> f12416h;

    /* renamed from: i */
    public final long[] f12417i;

    /* renamed from: j */
    public final long[] f12418j;

    public C3536k(List<C3530e> list) {
        this.f12416h = Collections.unmodifiableList(new ArrayList(list));
        this.f12417i = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            C3530e c3530e = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f12417i;
            jArr[i11] = c3530e.f12385b;
            jArr[i11 + 1] = c3530e.f12386c;
        }
        long[] jArr2 = this.f12417i;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f12418j = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: d */
    public static /* synthetic */ int m13172d(C3530e c3530e, C3530e c3530e2) {
        return Long.compare(c3530e.f12385b, c3530e2.f12385b);
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: b */
    public int mo6350b(long j10) {
        int m15453e = C4041n0.m15453e(this.f12418j, j10, false, false);
        if (m15453e < this.f12418j.length) {
            return m15453e;
        }
        return -1;
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: c */
    public long mo6351c(int i10) {
        C4014a.m15195a(i10 >= 0);
        C4014a.m15195a(i10 < this.f12418j.length);
        return this.f12418j[i10];
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: f */
    public List<C1547b> mo6352f(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f12416h.size(); i10++) {
            long[] jArr = this.f12417i;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                C3530e c3530e = this.f12416h.get(i10);
                C1547b c1547b = c3530e.f12384a;
                if (c1547b.f5785l == -3.4028235E38f) {
                    arrayList2.add(c3530e);
                } else {
                    arrayList.add(c1547b);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: m5.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m13172d;
                m13172d = C3536k.m13172d((C3530e) obj, (C3530e) obj2);
                return m13172d;
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((C3530e) arrayList2.get(i12)).f12384a.m6317b().m6325h((-1) - i12, 1).m6318a());
        }
        return arrayList;
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: h */
    public int mo6353h() {
        return this.f12418j.length;
    }
}
