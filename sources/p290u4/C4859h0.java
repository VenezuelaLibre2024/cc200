package p290u4;

import android.os.Looper;
import p206o5.C3927v;
import p206o5.InterfaceC3894b;
import p206o5.InterfaceC3899d0;
import p206o5.InterfaceC3910j;
import p206o5.InterfaceC3917m0;
import p222p5.C4014a;
import p264s3.AbstractC4505u3;
import p264s3.C4503u1;
import p275t3.C4674s1;
import p290u4.C4857g0;
import p290u4.C4859h0;
import p290u4.InterfaceC4847b0;
import p290u4.InterfaceC4882t;
import p317w3.C5245l;
import p317w3.InterfaceC5256v;
import p317w3.InterfaceC5258x;
import p333x3.C5568h;
import p333x3.InterfaceC5576p;

/* renamed from: u4.h0 */
/* loaded from: classes.dex */
public final class C4859h0 extends AbstractC4844a implements C4857g0.b {

    /* renamed from: o */
    public final C4503u1 f18311o;

    /* renamed from: p */
    public final C4503u1.h f18312p;

    /* renamed from: q */
    public final InterfaceC3910j.a f18313q;

    /* renamed from: r */
    public final InterfaceC4847b0.a f18314r;

    /* renamed from: s */
    public final InterfaceC5256v f18315s;

    /* renamed from: t */
    public final InterfaceC3899d0 f18316t;

    /* renamed from: u */
    public final int f18317u;

    /* renamed from: v */
    public boolean f18318v;

    /* renamed from: w */
    public long f18319w;

    /* renamed from: x */
    public boolean f18320x;

    /* renamed from: y */
    public boolean f18321y;

    /* renamed from: z */
    public InterfaceC3917m0 f18322z;

    /* renamed from: u4.h0$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC4866l {
        public a(C4859h0 c4859h0, AbstractC4505u3 abstractC4505u3) {
            super(abstractC4505u3);
        }

        @Override // p290u4.AbstractC4866l, p264s3.AbstractC4505u3
        /* renamed from: k */
        public AbstractC4505u3.b mo4744k(int i10, AbstractC4505u3.b bVar, boolean z10) {
            super.mo4744k(i10, bVar, z10);
            bVar.f16837m = true;
            return bVar;
        }

        @Override // p290u4.AbstractC4866l, p264s3.AbstractC4505u3
        /* renamed from: s */
        public AbstractC4505u3.d mo4747s(int i10, AbstractC4505u3.d dVar, long j10) {
            super.mo4747s(i10, dVar, j10);
            dVar.f16871s = true;
            return dVar;
        }
    }

    /* renamed from: u4.h0$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC4882t.a {

        /* renamed from: a */
        public final InterfaceC3910j.a f18323a;

        /* renamed from: b */
        public InterfaceC4847b0.a f18324b;

        /* renamed from: c */
        public InterfaceC5258x f18325c;

        /* renamed from: d */
        public InterfaceC3899d0 f18326d;

        /* renamed from: e */
        public int f18327e;

        /* renamed from: f */
        public String f18328f;

        /* renamed from: g */
        public Object f18329g;

        public b(InterfaceC3910j.a aVar) {
            this(aVar, new C5568h());
        }

        public b(InterfaceC3910j.a aVar, InterfaceC4847b0.a aVar2) {
            this(aVar, aVar2, new C5245l(), new C3927v(), 1048576);
        }

        public b(InterfaceC3910j.a aVar, InterfaceC4847b0.a aVar2, InterfaceC5258x interfaceC5258x, InterfaceC3899d0 interfaceC3899d0, int i10) {
            this.f18323a = aVar;
            this.f18324b = aVar2;
            this.f18325c = interfaceC5258x;
            this.f18326d = interfaceC3899d0;
            this.f18327e = i10;
        }

        public b(InterfaceC3910j.a aVar, InterfaceC5576p interfaceC5576p) {
            this(aVar, new InterfaceC4847b0.a() { // from class: u4.i0
                public /* synthetic */ C4861i0() {
                }

                @Override // p290u4.InterfaceC4847b0.a
                /* renamed from: a */
                public final InterfaceC4847b0 mo19244a(C4674s1 c4674s1) {
                    InterfaceC4847b0 m19320c;
                    m19320c = C4859h0.b.m19320c(InterfaceC5576p.this, c4674s1);
                    return m19320c;
                }
            });
        }

        /* renamed from: c */
        public static /* synthetic */ InterfaceC4847b0 m19320c(InterfaceC5576p interfaceC5576p, C4674s1 c4674s1) {
            return new C4848c(interfaceC5576p);
        }

        /* renamed from: b */
        public C4859h0 m19321b(C4503u1 c4503u1) {
            C4503u1.c m17601b;
            C4503u1.c m17605d;
            C4014a.m15199e(c4503u1.f16712i);
            C4503u1.h hVar = c4503u1.f16712i;
            boolean z10 = hVar.f16794i == null && this.f18329g != null;
            boolean z11 = hVar.f16791f == null && this.f18328f != null;
            if (!z10 || !z11) {
                if (z10) {
                    m17605d = c4503u1.m17601b().m17605d(this.f18329g);
                    c4503u1 = m17605d.m17602a();
                    C4503u1 c4503u12 = c4503u1;
                    return new C4859h0(c4503u12, this.f18323a, this.f18324b, this.f18325c.mo21251a(c4503u12), this.f18326d, this.f18327e, null);
                }
                if (z11) {
                    m17601b = c4503u1.m17601b();
                }
                C4503u1 c4503u122 = c4503u1;
                return new C4859h0(c4503u122, this.f18323a, this.f18324b, this.f18325c.mo21251a(c4503u122), this.f18326d, this.f18327e, null);
            }
            m17601b = c4503u1.m17601b().m17605d(this.f18329g);
            m17605d = m17601b.m17603b(this.f18328f);
            c4503u1 = m17605d.m17602a();
            C4503u1 c4503u1222 = c4503u1;
            return new C4859h0(c4503u1222, this.f18323a, this.f18324b, this.f18325c.mo21251a(c4503u1222), this.f18326d, this.f18327e, null);
        }
    }

    public C4859h0(C4503u1 c4503u1, InterfaceC3910j.a aVar, InterfaceC4847b0.a aVar2, InterfaceC5256v interfaceC5256v, InterfaceC3899d0 interfaceC3899d0, int i10) {
        this.f18312p = (C4503u1.h) C4014a.m15199e(c4503u1.f16712i);
        this.f18311o = c4503u1;
        this.f18313q = aVar;
        this.f18314r = aVar2;
        this.f18315s = interfaceC5256v;
        this.f18316t = interfaceC3899d0;
        this.f18317u = i10;
        this.f18318v = true;
        this.f18319w = -9223372036854775807L;
    }

    public /* synthetic */ C4859h0(C4503u1 c4503u1, InterfaceC3910j.a aVar, InterfaceC4847b0.a aVar2, InterfaceC5256v interfaceC5256v, InterfaceC3899d0 interfaceC3899d0, int i10, a aVar3) {
        this(c4503u1, aVar, aVar2, interfaceC5256v, interfaceC3899d0, i10);
    }

    @Override // p290u4.AbstractC4844a
    /* renamed from: C */
    public void mo4714C(InterfaceC3917m0 interfaceC3917m0) {
        this.f18322z = interfaceC3917m0;
        this.f18315s.mo21231d((Looper) C4014a.m15199e(Looper.myLooper()), m19189A());
        this.f18315s.mo21228a();
        m19318F();
    }

    @Override // p290u4.AbstractC4844a
    /* renamed from: E */
    public void mo4715E() {
        this.f18315s.release();
    }

    /* renamed from: F */
    public final void m19318F() {
        AbstractC4505u3 c4875p0 = new C4875p0(this.f18319w, this.f18320x, false, this.f18321y, null, this.f18311o);
        if (this.f18318v) {
            c4875p0 = new a(this, c4875p0);
        }
        m19191D(c4875p0);
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: a */
    public void mo4725a(InterfaceC4878r interfaceC4878r) {
        ((C4857g0) interfaceC4878r).m19301e0();
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: b */
    public InterfaceC4878r mo4727b(InterfaceC4882t.b bVar, InterfaceC3894b interfaceC3894b, long j10) {
        InterfaceC3910j mo14830a = this.f18313q.mo14830a();
        InterfaceC3917m0 interfaceC3917m0 = this.f18322z;
        if (interfaceC3917m0 != null) {
            mo14830a.mo14820g(interfaceC3917m0);
        }
        return new C4857g0(this.f18312p.f16786a, mo14830a, this.f18314r.mo19244a(m19189A()), this.f18315s, m19201u(bVar), this.f18316t, m19203w(bVar), this, interfaceC3894b, this.f18312p.f16791f, this.f18317u);
    }

    @Override // p290u4.C4857g0.b
    /* renamed from: f */
    public void mo19315f(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f18319w;
        }
        if (!this.f18318v && this.f18319w == j10 && this.f18320x == z10 && this.f18321y == z11) {
            return;
        }
        this.f18319w = j10;
        this.f18320x = z10;
        this.f18321y = z11;
        this.f18318v = false;
        m19318F();
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: g */
    public C4503u1 mo4733g() {
        return this.f18311o;
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: h */
    public void mo4735h() {
    }
}
