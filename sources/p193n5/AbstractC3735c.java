package p193n5;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.C4463m1;
import p290u4.C4881s0;
import p318w4.AbstractC5274n;

/* renamed from: n5.c */
/* loaded from: classes.dex */
public abstract class AbstractC3735c implements InterfaceC3752s {

    /* renamed from: a */
    public final C4881s0 f13317a;

    /* renamed from: b */
    public final int f13318b;

    /* renamed from: c */
    public final int[] f13319c;

    /* renamed from: d */
    public final int f13320d;

    /* renamed from: e */
    public final C4463m1[] f13321e;

    /* renamed from: f */
    public final long[] f13322f;

    /* renamed from: g */
    public int f13323g;

    public AbstractC3735c(C4881s0 c4881s0, int... iArr) {
        this(c4881s0, iArr, 0);
    }

    public AbstractC3735c(C4881s0 c4881s0, int[] iArr, int i10) {
        int i11 = 0;
        C4014a.m15200f(iArr.length > 0);
        this.f13320d = i10;
        this.f13317a = (C4881s0) C4014a.m15199e(c4881s0);
        int length = iArr.length;
        this.f13318b = length;
        this.f13321e = new C4463m1[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f13321e[i12] = c4881s0.m19444b(iArr[i12]);
        }
        Arrays.sort(this.f13321e, new Comparator() { // from class: n5.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m14084w;
                m14084w = AbstractC3735c.m14084w((C4463m1) obj, (C4463m1) obj2);
                return m14084w;
            }
        });
        this.f13319c = new int[this.f13318b];
        while (true) {
            int i13 = this.f13318b;
            if (i11 >= i13) {
                this.f13322f = new long[i13];
                return;
            } else {
                this.f13319c[i11] = c4881s0.m19445c(this.f13321e[i11]);
                i11++;
            }
        }
    }

    /* renamed from: w */
    public static /* synthetic */ int m14084w(C4463m1 c4463m1, C4463m1 c4463m12) {
        return c4463m12.f16502o - c4463m1.f16502o;
    }

    @Override // p193n5.InterfaceC3755v
    /* renamed from: a */
    public final int mo14085a(C4463m1 c4463m1) {
        for (int i10 = 0; i10 < this.f13318b; i10++) {
            if (this.f13321e[i10] == c4463m1) {
                return i10;
            }
        }
        return -1;
    }

    @Override // p193n5.InterfaceC3755v
    /* renamed from: b */
    public final C4881s0 mo14086b() {
        return this.f13317a;
    }

    @Override // p193n5.InterfaceC3755v
    /* renamed from: c */
    public final C4463m1 mo14087c(int i10) {
        return this.f13321e[i10];
    }

    @Override // p193n5.InterfaceC3755v
    /* renamed from: d */
    public final int mo14088d(int i10) {
        return this.f13319c[i10];
    }

    @Override // p193n5.InterfaceC3755v
    /* renamed from: e */
    public final int mo14089e(int i10) {
        for (int i11 = 0; i11 < this.f13318b; i11++) {
            if (this.f13319c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC3735c abstractC3735c = (AbstractC3735c) obj;
        return this.f13317a == abstractC3735c.f13317a && Arrays.equals(this.f13319c, abstractC3735c.f13319c);
    }

    @Override // p193n5.InterfaceC3752s
    /* renamed from: f */
    public void mo14060f() {
    }

    @Override // p193n5.InterfaceC3752s
    /* renamed from: h */
    public boolean mo14090h(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean mo14091i = mo14091i(i10, elapsedRealtime);
        int i11 = 0;
        while (i11 < this.f13318b && !mo14091i) {
            mo14091i = (i11 == i10 || mo14091i(i11, elapsedRealtime)) ? false : true;
            i11++;
        }
        if (!mo14091i) {
            return false;
        }
        long[] jArr = this.f13322f;
        jArr[i10] = Math.max(jArr[i10], C4041n0.m15447b(elapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    public int hashCode() {
        if (this.f13323g == 0) {
            this.f13323g = (System.identityHashCode(this.f13317a) * 31) + Arrays.hashCode(this.f13319c);
        }
        return this.f13323g;
    }

    @Override // p193n5.InterfaceC3752s
    /* renamed from: i */
    public boolean mo14091i(int i10, long j10) {
        return this.f13322f[i10] > j10;
    }

    @Override // p193n5.InterfaceC3752s
    /* renamed from: l */
    public void mo14063l() {
    }

    @Override // p193n5.InterfaceC3755v
    public final int length() {
        return this.f13319c.length;
    }

    @Override // p193n5.InterfaceC3752s
    /* renamed from: m */
    public int mo14064m(long j10, List<? extends AbstractC5274n> list) {
        return list.size();
    }

    @Override // p193n5.InterfaceC3752s
    /* renamed from: n */
    public final int mo14092n() {
        return this.f13319c[mo14061g()];
    }

    @Override // p193n5.InterfaceC3752s
    /* renamed from: o */
    public final C4463m1 mo14093o() {
        return this.f13321e[mo14061g()];
    }

    @Override // p193n5.InterfaceC3752s
    /* renamed from: q */
    public void mo14066q(float f10) {
    }
}
