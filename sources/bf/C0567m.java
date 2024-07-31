package bf;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: bf.m */
/* loaded from: classes2.dex */
public final class C0567m extends AbstractList<C0560f> implements RandomAccess {

    /* renamed from: h */
    public final C0560f[] f2532h;

    /* renamed from: i */
    public final int[] f2533i;

    public C0567m(C0560f[] c0560fArr, int[] iArr) {
        this.f2532h = c0560fArr;
        this.f2533i = iArr;
    }

    /* renamed from: a */
    public static void m2903a(long j10, C0557c c0557c, int i10, List<C0560f> list, int i11, int i12, List<Integer> list2) {
        int i13;
        int i14;
        int i15;
        C0557c c0557c2;
        int i16 = i11;
        if (i16 >= i12) {
            throw new AssertionError();
        }
        for (int i17 = i16; i17 < i12; i17++) {
            if (list.get(i17).mo2871u() < i10) {
                throw new AssertionError();
            }
        }
        C0560f c0560f = list.get(i11);
        C0560f c0560f2 = list.get(i12 - 1);
        int i18 = -1;
        if (i10 == c0560f.mo2871u()) {
            i18 = list2.get(i16).intValue();
            i16++;
            c0560f = list.get(i16);
        }
        int i19 = i16;
        if (c0560f.mo2865n(i10) == c0560f2.mo2865n(i10)) {
            int i20 = 0;
            int min = Math.min(c0560f.mo2871u(), c0560f2.mo2871u());
            for (int i21 = i10; i21 < min && c0560f.mo2865n(i21) == c0560f2.mo2865n(i21); i21++) {
                i20++;
            }
            long m2904c = 1 + j10 + m2904c(c0557c) + 2 + i20;
            c0557c.mo2846u(-i20);
            c0557c.mo2846u(i18);
            int i22 = i10;
            while (true) {
                i13 = i10 + i20;
                if (i22 >= i13) {
                    break;
                }
                c0557c.mo2846u(c0560f.mo2865n(i22) & 255);
                i22++;
            }
            if (i19 + 1 == i12) {
                if (i13 != list.get(i19).mo2871u()) {
                    throw new AssertionError();
                }
                c0557c.mo2846u(list2.get(i19).intValue());
                return;
            } else {
                C0557c c0557c3 = new C0557c();
                c0557c.mo2846u((int) ((m2904c(c0557c3) + m2904c) * (-1)));
                m2903a(m2904c, c0557c3, i13, list, i19, i12, list2);
                c0557c.mo2798C0(c0557c3, c0557c3.m2831g0());
                return;
            }
        }
        int i23 = 1;
        for (int i24 = i19 + 1; i24 < i12; i24++) {
            if (list.get(i24 - 1).mo2865n(i10) != list.get(i24).mo2865n(i10)) {
                i23++;
            }
        }
        long m2904c2 = j10 + m2904c(c0557c) + 2 + (i23 * 2);
        c0557c.mo2846u(i23);
        c0557c.mo2846u(i18);
        for (int i25 = i19; i25 < i12; i25++) {
            byte mo2865n = list.get(i25).mo2865n(i10);
            if (i25 == i19 || mo2865n != list.get(i25 - 1).mo2865n(i10)) {
                c0557c.mo2846u(mo2865n & 255);
            }
        }
        C0557c c0557c4 = new C0557c();
        int i26 = i19;
        while (i26 < i12) {
            byte mo2865n2 = list.get(i26).mo2865n(i10);
            int i27 = i26 + 1;
            int i28 = i27;
            while (true) {
                if (i28 >= i12) {
                    i14 = i12;
                    break;
                } else {
                    if (mo2865n2 != list.get(i28).mo2865n(i10)) {
                        i14 = i28;
                        break;
                    }
                    i28++;
                }
            }
            if (i27 == i14 && i10 + 1 == list.get(i26).mo2871u()) {
                c0557c.mo2846u(list2.get(i26).intValue());
                i15 = i14;
                c0557c2 = c0557c4;
            } else {
                c0557c.mo2846u((int) ((m2904c(c0557c4) + m2904c2) * (-1)));
                i15 = i14;
                c0557c2 = c0557c4;
                m2903a(m2904c2, c0557c4, i10 + 1, list, i26, i14, list2);
            }
            c0557c4 = c0557c2;
            i26 = i15;
        }
        C0557c c0557c5 = c0557c4;
        c0557c.mo2798C0(c0557c5, c0557c5.m2831g0());
    }

    /* renamed from: c */
    public static int m2904c(C0557c c0557c) {
        return (int) (c0557c.m2831g0() / 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        continue;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static bf.C0567m m2905d(bf.C0560f... r10) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.C0567m.m2905d(bf.f[]):bf.m");
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0560f get(int i10) {
        return this.f2532h[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2532h.length;
    }
}
