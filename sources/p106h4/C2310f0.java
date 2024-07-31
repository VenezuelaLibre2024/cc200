package p106h4;

import p222p5.C4015a0;
import p222p5.C4033j0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p333x3.C5585y;
import p333x3.InterfaceC5572l;

/* renamed from: h4.f0 */
/* loaded from: classes.dex */
public final class C2310f0 {

    /* renamed from: a */
    public final int f9278a;

    /* renamed from: d */
    public boolean f9281d;

    /* renamed from: e */
    public boolean f9282e;

    /* renamed from: f */
    public boolean f9283f;

    /* renamed from: b */
    public final C4033j0 f9279b = new C4033j0(0);

    /* renamed from: g */
    public long f9284g = -9223372036854775807L;

    /* renamed from: h */
    public long f9285h = -9223372036854775807L;

    /* renamed from: i */
    public long f9286i = -9223372036854775807L;

    /* renamed from: c */
    public final C4015a0 f9280c = new C4015a0();

    public C2310f0(int i10) {
        this.f9278a = i10;
    }

    /* renamed from: a */
    public final int m9353a(InterfaceC5572l interfaceC5572l) {
        this.f9280c.m15220Q(C4041n0.f14518f);
        this.f9281d = true;
        interfaceC5572l.mo22427l();
        return 0;
    }

    /* renamed from: b */
    public long m9354b() {
        return this.f9286i;
    }

    /* renamed from: c */
    public C4033j0 m9355c() {
        return this.f9279b;
    }

    /* renamed from: d */
    public boolean m9356d() {
        return this.f9281d;
    }

    /* renamed from: e */
    public int m9357e(InterfaceC5572l interfaceC5572l, C5585y c5585y, int i10) {
        if (i10 <= 0) {
            return m9353a(interfaceC5572l);
        }
        if (!this.f9283f) {
            return m9360h(interfaceC5572l, c5585y, i10);
        }
        if (this.f9285h == -9223372036854775807L) {
            return m9353a(interfaceC5572l);
        }
        if (!this.f9282e) {
            return m9358f(interfaceC5572l, c5585y, i10);
        }
        long j10 = this.f9284g;
        if (j10 == -9223372036854775807L) {
            return m9353a(interfaceC5572l);
        }
        long m15363b = this.f9279b.m15363b(this.f9285h) - this.f9279b.m15363b(j10);
        this.f9286i = m15363b;
        if (m15363b < 0) {
            C4046r.m15529i("TsDurationReader", "Invalid duration: " + this.f9286i + ". Using TIME_UNSET instead.");
            this.f9286i = -9223372036854775807L;
        }
        return m9353a(interfaceC5572l);
    }

    /* renamed from: f */
    public final int m9358f(InterfaceC5572l interfaceC5572l, C5585y c5585y, int i10) {
        int min = (int) Math.min(this.f9278a, interfaceC5572l.mo3029b());
        long j10 = 0;
        if (interfaceC5572l.getPosition() != j10) {
            c5585y.f20962a = j10;
            return 1;
        }
        this.f9280c.m15219P(min);
        interfaceC5572l.mo22427l();
        interfaceC5572l.mo22430p(this.f9280c.m15230e(), 0, min);
        this.f9284g = m9359g(this.f9280c, i10);
        this.f9282e = true;
        return 0;
    }

    /* renamed from: g */
    public final long m9359g(C4015a0 c4015a0, int i10) {
        int m15232g = c4015a0.m15232g();
        for (int m15231f = c4015a0.m15231f(); m15231f < m15232g; m15231f++) {
            if (c4015a0.m15230e()[m15231f] == 71) {
                long m9422c = C2318j0.m9422c(c4015a0, m15231f, i10);
                if (m9422c != -9223372036854775807L) {
                    return m9422c;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: h */
    public final int m9360h(InterfaceC5572l interfaceC5572l, C5585y c5585y, int i10) {
        long mo3029b = interfaceC5572l.mo3029b();
        int min = (int) Math.min(this.f9278a, mo3029b);
        long j10 = mo3029b - min;
        if (interfaceC5572l.getPosition() != j10) {
            c5585y.f20962a = j10;
            return 1;
        }
        this.f9280c.m15219P(min);
        interfaceC5572l.mo22427l();
        interfaceC5572l.mo22430p(this.f9280c.m15230e(), 0, min);
        this.f9285h = m9361i(this.f9280c, i10);
        this.f9283f = true;
        return 0;
    }

    /* renamed from: i */
    public final long m9361i(C4015a0 c4015a0, int i10) {
        int m15231f = c4015a0.m15231f();
        int m15232g = c4015a0.m15232g();
        for (int i11 = m15232g - 188; i11 >= m15231f; i11--) {
            if (C2318j0.m9421b(c4015a0.m15230e(), m15231f, m15232g, i11)) {
                long m9422c = C2318j0.m9422c(c4015a0, i11, i10);
                if (m9422c != -9223372036854775807L) {
                    return m9422c;
                }
            }
        }
        return -9223372036854775807L;
    }
}
