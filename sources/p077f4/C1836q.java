package p077f4;

import p222p5.C4015a0;
import p333x3.InterfaceC5572l;

/* renamed from: f4.q */
/* loaded from: classes.dex */
public final class C1836q {

    /* renamed from: a */
    public C1822c f6944a;

    /* renamed from: b */
    public long f6945b;

    /* renamed from: c */
    public long f6946c;

    /* renamed from: d */
    public long f6947d;

    /* renamed from: e */
    public int f6948e;

    /* renamed from: f */
    public int f6949f;

    /* renamed from: l */
    public boolean f6955l;

    /* renamed from: n */
    public C1835p f6957n;

    /* renamed from: p */
    public boolean f6959p;

    /* renamed from: q */
    public long f6960q;

    /* renamed from: r */
    public boolean f6961r;

    /* renamed from: g */
    public long[] f6950g = new long[0];

    /* renamed from: h */
    public int[] f6951h = new int[0];

    /* renamed from: i */
    public int[] f6952i = new int[0];

    /* renamed from: j */
    public long[] f6953j = new long[0];

    /* renamed from: k */
    public boolean[] f6954k = new boolean[0];

    /* renamed from: m */
    public boolean[] f6956m = new boolean[0];

    /* renamed from: o */
    public final C4015a0 f6958o = new C4015a0();

    /* renamed from: a */
    public void m7549a(C4015a0 c4015a0) {
        c4015a0.m15237l(this.f6958o.m15230e(), 0, this.f6958o.m15232g());
        this.f6958o.m15223T(0);
        this.f6959p = false;
    }

    /* renamed from: b */
    public void m7550b(InterfaceC5572l interfaceC5572l) {
        interfaceC5572l.readFully(this.f6958o.m15230e(), 0, this.f6958o.m15232g());
        this.f6958o.m15223T(0);
        this.f6959p = false;
    }

    /* renamed from: c */
    public long m7551c(int i10) {
        return this.f6953j[i10];
    }

    /* renamed from: d */
    public void m7552d(int i10) {
        this.f6958o.m15219P(i10);
        this.f6955l = true;
        this.f6959p = true;
    }

    /* renamed from: e */
    public void m7553e(int i10, int i11) {
        this.f6948e = i10;
        this.f6949f = i11;
        if (this.f6951h.length < i10) {
            this.f6950g = new long[i10];
            this.f6951h = new int[i10];
        }
        if (this.f6952i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f6952i = new int[i12];
            this.f6953j = new long[i12];
            this.f6954k = new boolean[i12];
            this.f6956m = new boolean[i12];
        }
    }

    /* renamed from: f */
    public void m7554f() {
        this.f6948e = 0;
        this.f6960q = 0L;
        this.f6961r = false;
        this.f6955l = false;
        this.f6959p = false;
        this.f6957n = null;
    }

    /* renamed from: g */
    public boolean m7555g(int i10) {
        return this.f6955l && this.f6956m[i10];
    }
}
