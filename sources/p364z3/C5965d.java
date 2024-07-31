package p364z3;

import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4046r;

/* renamed from: z3.d */
/* loaded from: classes.dex */
public final class C5965d implements InterfaceC5962a {

    /* renamed from: a */
    public final int f22152a;

    /* renamed from: b */
    public final int f22153b;

    /* renamed from: c */
    public final int f22154c;

    /* renamed from: d */
    public final int f22155d;

    /* renamed from: e */
    public final int f22156e;

    /* renamed from: f */
    public final int f22157f;

    public C5965d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f22152a = i10;
        this.f22153b = i11;
        this.f22154c = i12;
        this.f22155d = i13;
        this.f22156e = i14;
        this.f22157f = i15;
    }

    /* renamed from: c */
    public static C5965d m23895c(C4015a0 c4015a0) {
        int m15245t = c4015a0.m15245t();
        c4015a0.m15224U(12);
        int m15245t2 = c4015a0.m15245t();
        int m15245t3 = c4015a0.m15245t();
        int m15245t4 = c4015a0.m15245t();
        c4015a0.m15224U(4);
        int m15245t5 = c4015a0.m15245t();
        int m15245t6 = c4015a0.m15245t();
        c4015a0.m15224U(8);
        return new C5965d(m15245t, m15245t2, m15245t3, m15245t4, m15245t5, m15245t6);
    }

    /* renamed from: a */
    public long m23896a() {
        return C4041n0.m15420N0(this.f22156e, this.f22154c * 1000000, this.f22155d);
    }

    /* renamed from: b */
    public int m23897b() {
        int i10 = this.f22152a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        C4046r.m15529i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f22152a));
        return -1;
    }

    @Override // p364z3.InterfaceC5962a
    public int getType() {
        return 1752331379;
    }
}
