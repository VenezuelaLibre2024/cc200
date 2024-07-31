package p318w4;

import android.util.SparseArray;
import java.util.List;
import p046d4.C1543e;
import p077f4.C1826g;
import p206o5.InterfaceC3906h;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4050v;
import p264s3.C4463m1;
import p275t3.C4674s1;
import p318w4.InterfaceC5267g;
import p333x3.C5560c;
import p333x3.C5570j;
import p333x3.C5585y;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5586z;

/* renamed from: w4.e */
/* loaded from: classes.dex */
public final class C5265e implements InterfaceC5573m, InterfaceC5267g {

    /* renamed from: q */
    public static final InterfaceC5267g.a f19948q = new InterfaceC5267g.a() { // from class: w4.d
        @Override // p318w4.InterfaceC5267g.a
        /* renamed from: a */
        public final InterfaceC5267g mo21310a(int i10, C4463m1 c4463m1, boolean z10, List list, InterfaceC5559b0 interfaceC5559b0, C4674s1 c4674s1) {
            InterfaceC5267g m21312g;
            m21312g = C5265e.m21312g(i10, c4463m1, z10, list, interfaceC5559b0, c4674s1);
            return m21312g;
        }
    };

    /* renamed from: r */
    public static final C5585y f19949r = new C5585y();

    /* renamed from: h */
    public final InterfaceC5571k f19950h;

    /* renamed from: i */
    public final int f19951i;

    /* renamed from: j */
    public final C4463m1 f19952j;

    /* renamed from: k */
    public final SparseArray<a> f19953k = new SparseArray<>();

    /* renamed from: l */
    public boolean f19954l;

    /* renamed from: m */
    public InterfaceC5267g.b f19955m;

    /* renamed from: n */
    public long f19956n;

    /* renamed from: o */
    public InterfaceC5586z f19957o;

    /* renamed from: p */
    public C4463m1[] f19958p;

    /* renamed from: w4.e$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC5559b0 {

        /* renamed from: a */
        public final int f19959a;

        /* renamed from: b */
        public final int f19960b;

        /* renamed from: c */
        public final C4463m1 f19961c;

        /* renamed from: d */
        public final C5570j f19962d = new C5570j();

        /* renamed from: e */
        public C4463m1 f19963e;

        /* renamed from: f */
        public InterfaceC5559b0 f19964f;

        /* renamed from: g */
        public long f19965g;

        public a(int i10, int i11, C4463m1 c4463m1) {
            this.f19959a = i10;
            this.f19960b = i11;
            this.f19961c = c4463m1;
        }

        @Override // p333x3.InterfaceC5559b0
        /* renamed from: a */
        public void mo4851a(long j10, int i10, int i11, int i12, InterfaceC5559b0.a aVar) {
            long j11 = this.f19965g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f19964f = this.f19962d;
            }
            ((InterfaceC5559b0) C4041n0.m15463j(this.f19964f)).mo4851a(j10, i10, i11, i12, aVar);
        }

        @Override // p333x3.InterfaceC5559b0
        /* renamed from: b */
        public void mo4852b(C4463m1 c4463m1) {
            C4463m1 c4463m12 = this.f19961c;
            if (c4463m12 != null) {
                c4463m1 = c4463m1.m17415j(c4463m12);
            }
            this.f19963e = c4463m1;
            ((InterfaceC5559b0) C4041n0.m15463j(this.f19964f)).mo4852b(this.f19963e);
        }

        @Override // p333x3.InterfaceC5559b0
        /* renamed from: d */
        public void mo4853d(C4015a0 c4015a0, int i10, int i11) {
            ((InterfaceC5559b0) C4041n0.m15463j(this.f19964f)).m22408e(c4015a0, i10);
        }

        @Override // p333x3.InterfaceC5559b0
        /* renamed from: f */
        public int mo4854f(InterfaceC3906h interfaceC3906h, int i10, boolean z10, int i11) {
            return ((InterfaceC5559b0) C4041n0.m15463j(this.f19964f)).m22407c(interfaceC3906h, i10, z10);
        }

        /* renamed from: g */
        public void m21317g(InterfaceC5267g.b bVar, long j10) {
            if (bVar == null) {
                this.f19964f = this.f19962d;
                return;
            }
            this.f19965g = j10;
            InterfaceC5559b0 mo21309e = bVar.mo21309e(this.f19959a, this.f19960b);
            this.f19964f = mo21309e;
            C4463m1 c4463m1 = this.f19963e;
            if (c4463m1 != null) {
                mo21309e.mo4852b(c4463m1);
            }
        }
    }

    public C5265e(InterfaceC5571k interfaceC5571k, int i10, C4463m1 c4463m1) {
        this.f19950h = interfaceC5571k;
        this.f19951i = i10;
        this.f19952j = c4463m1;
    }

    /* renamed from: g */
    public static /* synthetic */ InterfaceC5267g m21312g(int i10, C4463m1 c4463m1, boolean z10, List list, InterfaceC5559b0 interfaceC5559b0, C4674s1 c4674s1) {
        InterfaceC5571k c1826g;
        String str = c4463m1.f16505r;
        if (C4050v.m15561r(str)) {
            return null;
        }
        if (C4050v.m15560q(str)) {
            c1826g = new C1543e(1);
        } else {
            c1826g = new C1826g(z10 ? 4 : 0, null, null, list, interfaceC5559b0);
        }
        return new C5265e(c1826g, i10, c4463m1);
    }

    @Override // p318w4.InterfaceC5267g
    /* renamed from: a */
    public boolean mo21313a(InterfaceC5572l interfaceC5572l) {
        int mo169g = this.f19950h.mo169g(interfaceC5572l, f19949r);
        C4014a.m15200f(mo169g != 1);
        return mo169g == 0;
    }

    @Override // p318w4.InterfaceC5267g
    /* renamed from: b */
    public void mo21314b(InterfaceC5267g.b bVar, long j10, long j11) {
        this.f19955m = bVar;
        this.f19956n = j11;
        if (!this.f19954l) {
            this.f19950h.mo164b(this);
            if (j10 != -9223372036854775807L) {
                this.f19950h.mo165c(0L, j10);
            }
            this.f19954l = true;
            return;
        }
        InterfaceC5571k interfaceC5571k = this.f19950h;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        interfaceC5571k.mo165c(0L, j10);
        for (int i10 = 0; i10 < this.f19953k.size(); i10++) {
            this.f19953k.valueAt(i10).m21317g(bVar, j11);
        }
    }

    @Override // p318w4.InterfaceC5267g
    /* renamed from: c */
    public C4463m1[] mo21315c() {
        return this.f19958p;
    }

    @Override // p318w4.InterfaceC5267g
    /* renamed from: d */
    public C5560c mo21316d() {
        InterfaceC5586z interfaceC5586z = this.f19957o;
        if (interfaceC5586z instanceof C5560c) {
            return (C5560c) interfaceC5586z;
        }
        return null;
    }

    @Override // p333x3.InterfaceC5573m
    /* renamed from: e */
    public InterfaceC5559b0 mo3032e(int i10, int i11) {
        a aVar = this.f19953k.get(i10);
        if (aVar == null) {
            C4014a.m15200f(this.f19958p == null);
            aVar = new a(i10, i11, i11 == this.f19951i ? this.f19952j : null);
            aVar.m21317g(this.f19955m, this.f19956n);
            this.f19953k.put(i10, aVar);
        }
        return aVar;
    }

    @Override // p333x3.InterfaceC5573m
    /* renamed from: j */
    public void mo3033j(InterfaceC5586z interfaceC5586z) {
        this.f19957o = interfaceC5586z;
    }

    @Override // p333x3.InterfaceC5573m
    /* renamed from: n */
    public void mo3034n() {
        C4463m1[] c4463m1Arr = new C4463m1[this.f19953k.size()];
        for (int i10 = 0; i10 < this.f19953k.size(); i10++) {
            c4463m1Arr[i10] = (C4463m1) C4014a.m15202h(this.f19953k.valueAt(i10).f19963e);
        }
        this.f19958p = c4463m1Arr;
    }

    @Override // p318w4.InterfaceC5267g
    public void release() {
        this.f19950h.release();
    }
}
