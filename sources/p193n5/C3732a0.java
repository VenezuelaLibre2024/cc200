package p193n5;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import p126i7.AbstractC2651u;
import p193n5.AbstractC3754u;
import p206o5.InterfaceC3899d0;
import p264s3.C4530z3;
import p290u4.C4881s0;
import p290u4.C4885u0;

/* renamed from: n5.a0 */
/* loaded from: classes.dex */
public final class C3732a0 {
    /* renamed from: a */
    public static C4530z3 m14071a(AbstractC3754u.a aVar, List<? extends InterfaceC3755v>[] listArr) {
        boolean z10;
        AbstractC2651u.a aVar2 = new AbstractC2651u.a();
        for (int i10 = 0; i10 < aVar.m14247d(); i10++) {
            C4885u0 m14249f = aVar.m14249f(i10);
            List<? extends InterfaceC3755v> list = listArr[i10];
            for (int i11 = 0; i11 < m14249f.f18478h; i11++) {
                C4881s0 m19452b = m14249f.m19452b(i11);
                boolean z11 = aVar.m14244a(i10, i11, false) != 0;
                int i12 = m19452b.f18465h;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < m19452b.f18465h; i13++) {
                    iArr[i13] = aVar.m14250g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        InterfaceC3755v interfaceC3755v = list.get(i14);
                        if (interfaceC3755v.mo14086b().equals(m19452b) && interfaceC3755v.mo14089e(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                aVar2.mo10749a(new C4530z3.a(m19452b, z11, iArr, zArr));
            }
        }
        C4885u0 m14251h = aVar.m14251h();
        for (int i15 = 0; i15 < m14251h.f18478h; i15++) {
            C4881s0 m19452b2 = m14251h.m19452b(i15);
            int[] iArr2 = new int[m19452b2.f18465h];
            Arrays.fill(iArr2, 0);
            aVar2.mo10749a(new C4530z3.a(m19452b2, false, iArr2, new boolean[m19452b2.f18465h]));
        }
        return new C4530z3(aVar2.m10784k());
    }

    /* renamed from: b */
    public static C4530z3 m14072b(AbstractC3754u.a aVar, InterfaceC3755v[] interfaceC3755vArr) {
        List[] listArr = new List[interfaceC3755vArr.length];
        for (int i10 = 0; i10 < interfaceC3755vArr.length; i10++) {
            InterfaceC3755v interfaceC3755v = interfaceC3755vArr[i10];
            listArr[i10] = interfaceC3755v != null ? AbstractC2651u.m10771v(interfaceC3755v) : AbstractC2651u.m10770u();
        }
        return m14071a(aVar, listArr);
    }

    /* renamed from: c */
    public static InterfaceC3899d0.a m14073c(InterfaceC3752s interfaceC3752s) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC3752s.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (interfaceC3752s.mo14091i(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new InterfaceC3899d0.a(1, 0, length, i10);
    }
}
