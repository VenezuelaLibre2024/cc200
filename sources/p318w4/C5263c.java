package p318w4;

import p222p5.C4046r;
import p290u4.C4867l0;
import p318w4.InterfaceC5267g;
import p333x3.C5570j;
import p333x3.InterfaceC5559b0;

/* renamed from: w4.c */
/* loaded from: classes.dex */
public final class C5263c implements InterfaceC5267g.b {

    /* renamed from: a */
    public final int[] f19945a;

    /* renamed from: b */
    public final C4867l0[] f19946b;

    public C5263c(int[] iArr, C4867l0[] c4867l0Arr) {
        this.f19945a = iArr;
        this.f19946b = c4867l0Arr;
    }

    /* renamed from: a */
    public int[] m21307a() {
        int[] iArr = new int[this.f19946b.length];
        int i10 = 0;
        while (true) {
            C4867l0[] c4867l0Arr = this.f19946b;
            if (i10 >= c4867l0Arr.length) {
                return iArr;
            }
            iArr[i10] = c4867l0Arr[i10].m19354G();
            i10++;
        }
    }

    /* renamed from: b */
    public void m21308b(long j10) {
        for (C4867l0 c4867l0 : this.f19946b) {
            c4867l0.m19373a0(j10);
        }
    }

    @Override // p318w4.InterfaceC5267g.b
    /* renamed from: e */
    public InterfaceC5559b0 mo21309e(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f19945a;
            if (i12 >= iArr.length) {
                C4046r.m15523c("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new C5570j();
            }
            if (i11 == iArr[i12]) {
                return this.f19946b[i12];
            }
            i12++;
        }
    }
}
