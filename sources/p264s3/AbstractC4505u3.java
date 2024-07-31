package p264s3;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import p126i7.AbstractC2651u;
import p222p5.C4014a;
import p222p5.C4016b;
import p222p5.C4041n0;
import p264s3.AbstractC4505u3;
import p264s3.C4503u1;
import p264s3.InterfaceC4436h;
import p305v4.C5116c;

/* renamed from: s3.u3 */
/* loaded from: classes.dex */
public abstract class AbstractC4505u3 implements InterfaceC4436h {

    /* renamed from: h */
    public static final AbstractC4505u3 f16821h = new a();

    /* renamed from: i */
    public static final String f16822i = C4041n0.m15478q0(0);

    /* renamed from: j */
    public static final String f16823j = C4041n0.m15478q0(1);

    /* renamed from: k */
    public static final String f16824k = C4041n0.m15478q0(2);

    /* renamed from: l */
    public static final InterfaceC4436h.a<AbstractC4505u3> f16825l = new InterfaceC4436h.a() { // from class: s3.t3
        @Override // p264s3.InterfaceC4436h.a
        /* renamed from: a */
        public final InterfaceC4436h mo6314a(Bundle bundle) {
            AbstractC4505u3 m17668b;
            m17668b = AbstractC4505u3.m17668b(bundle);
            return m17668b;
        }
    };

    /* renamed from: s3.u3$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC4505u3 {
        @Override // p264s3.AbstractC4505u3
        /* renamed from: f */
        public int mo4743f(Object obj) {
            return -1;
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: k */
        public b mo4744k(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: m */
        public int mo4745m() {
            return 0;
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: q */
        public Object mo4746q(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: s */
        public d mo4747s(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: t */
        public int mo4748t() {
            return 0;
        }
    }

    /* renamed from: s3.u3$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC4436h {

        /* renamed from: o */
        public static final String f16826o = C4041n0.m15478q0(0);

        /* renamed from: p */
        public static final String f16827p = C4041n0.m15478q0(1);

        /* renamed from: q */
        public static final String f16828q = C4041n0.m15478q0(2);

        /* renamed from: r */
        public static final String f16829r = C4041n0.m15478q0(3);

        /* renamed from: s */
        public static final String f16830s = C4041n0.m15478q0(4);

        /* renamed from: t */
        public static final InterfaceC4436h.a<b> f16831t = new InterfaceC4436h.a() { // from class: s3.v3
            @Override // p264s3.InterfaceC4436h.a
            /* renamed from: a */
            public final InterfaceC4436h mo6314a(Bundle bundle) {
                AbstractC4505u3.b m17680c;
                m17680c = AbstractC4505u3.b.m17680c(bundle);
                return m17680c;
            }
        };

        /* renamed from: h */
        public Object f16832h;

        /* renamed from: i */
        public Object f16833i;

        /* renamed from: j */
        public int f16834j;

        /* renamed from: k */
        public long f16835k;

        /* renamed from: l */
        public long f16836l;

        /* renamed from: m */
        public boolean f16837m;

        /* renamed from: n */
        public C5116c f16838n = C5116c.f19315n;

        /* renamed from: c */
        public static b m17680c(Bundle bundle) {
            int i10 = bundle.getInt(f16826o, 0);
            long j10 = bundle.getLong(f16827p, -9223372036854775807L);
            long j11 = bundle.getLong(f16828q, 0L);
            boolean z10 = bundle.getBoolean(f16829r, false);
            Bundle bundle2 = bundle.getBundle(f16830s);
            C5116c mo6314a = bundle2 != null ? C5116c.f19321t.mo6314a(bundle2) : C5116c.f19315n;
            b bVar = new b();
            bVar.m17699v(null, null, i10, j10, j11, mo6314a, z10);
            return bVar;
        }

        /* renamed from: d */
        public int m17681d(int i10) {
            return this.f16838n.m20782c(i10).f19338i;
        }

        /* renamed from: e */
        public long m17682e(int i10, int i11) {
            C5116c.a m20782c = this.f16838n.m20782c(i10);
            if (m20782c.f19338i != -1) {
                return m20782c.f19342m[i11];
            }
            return -9223372036854775807L;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return C4041n0.m15449c(this.f16832h, bVar.f16832h) && C4041n0.m15449c(this.f16833i, bVar.f16833i) && this.f16834j == bVar.f16834j && this.f16835k == bVar.f16835k && this.f16836l == bVar.f16836l && this.f16837m == bVar.f16837m && C4041n0.m15449c(this.f16838n, bVar.f16838n);
        }

        /* renamed from: f */
        public int m17683f() {
            return this.f16838n.f19323i;
        }

        /* renamed from: g */
        public int m17684g(long j10) {
            return this.f16838n.m20783d(j10, this.f16835k);
        }

        /* renamed from: h */
        public int m17685h(long j10) {
            return this.f16838n.m20784e(j10, this.f16835k);
        }

        public int hashCode() {
            Object obj = this.f16832h;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f16833i;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f16834j) * 31;
            long j10 = this.f16835k;
            int i10 = (hashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f16836l;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f16837m ? 1 : 0)) * 31) + this.f16838n.hashCode();
        }

        /* renamed from: i */
        public long m17686i(int i10) {
            return this.f16838n.m20782c(i10).f19337h;
        }

        /* renamed from: j */
        public long m17687j() {
            return this.f16838n.f19324j;
        }

        /* renamed from: k */
        public int m17688k(int i10, int i11) {
            C5116c.a m20782c = this.f16838n.m20782c(i10);
            if (m20782c.f19338i != -1) {
                return m20782c.f19341l[i11];
            }
            return 0;
        }

        /* renamed from: l */
        public long m17689l(int i10) {
            return this.f16838n.m20782c(i10).f19343n;
        }

        /* renamed from: m */
        public long m17690m() {
            return this.f16835k;
        }

        /* renamed from: n */
        public int m17691n(int i10) {
            return this.f16838n.m20782c(i10).m20790e();
        }

        /* renamed from: o */
        public int m17692o(int i10, int i11) {
            return this.f16838n.m20782c(i10).m20791f(i11);
        }

        /* renamed from: p */
        public long m17693p() {
            return C4041n0.m15442Y0(this.f16836l);
        }

        /* renamed from: q */
        public long m17694q() {
            return this.f16836l;
        }

        /* renamed from: r */
        public int m17695r() {
            return this.f16838n.f19326l;
        }

        /* renamed from: s */
        public boolean m17696s(int i10) {
            return !this.f16838n.m20782c(i10).m20792g();
        }

        /* renamed from: t */
        public boolean m17697t(int i10) {
            return this.f16838n.m20782c(i10).f19344o;
        }

        /* renamed from: u */
        public b m17698u(Object obj, Object obj2, int i10, long j10, long j11) {
            return m17699v(obj, obj2, i10, j10, j11, C5116c.f19315n, false);
        }

        /* renamed from: v */
        public b m17699v(Object obj, Object obj2, int i10, long j10, long j11, C5116c c5116c, boolean z10) {
            this.f16832h = obj;
            this.f16833i = obj2;
            this.f16834j = i10;
            this.f16835k = j10;
            this.f16836l = j11;
            this.f16838n = c5116c;
            this.f16837m = z10;
            return this;
        }
    }

    /* renamed from: s3.u3$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC4505u3 {

        /* renamed from: m */
        public final AbstractC2651u<d> f16839m;

        /* renamed from: n */
        public final AbstractC2651u<b> f16840n;

        /* renamed from: o */
        public final int[] f16841o;

        /* renamed from: p */
        public final int[] f16842p;

        public c(AbstractC2651u<d> abstractC2651u, AbstractC2651u<b> abstractC2651u2, int[] iArr) {
            C4014a.m15195a(abstractC2651u.size() == iArr.length);
            this.f16839m = abstractC2651u;
            this.f16840n = abstractC2651u2;
            this.f16841o = iArr;
            this.f16842p = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f16842p[iArr[i10]] = i10;
            }
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: e */
        public int mo17025e(boolean z10) {
            if (m17676u()) {
                return -1;
            }
            if (z10) {
                return this.f16841o[0];
            }
            return 0;
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: f */
        public int mo4743f(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: g */
        public int mo17026g(boolean z10) {
            if (m17676u()) {
                return -1;
            }
            return z10 ? this.f16841o[mo4748t() - 1] : mo4748t() - 1;
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: i */
        public int mo17027i(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != mo17026g(z10)) {
                return z10 ? this.f16841o[this.f16842p[i10] + 1] : i10 + 1;
            }
            if (i11 == 2) {
                return mo17025e(z10);
            }
            return -1;
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: k */
        public b mo4744k(int i10, b bVar, boolean z10) {
            b bVar2 = this.f16840n.get(i10);
            bVar.m17699v(bVar2.f16832h, bVar2.f16833i, bVar2.f16834j, bVar2.f16835k, bVar2.f16836l, bVar2.f16838n, bVar2.f16837m);
            return bVar;
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: m */
        public int mo4745m() {
            return this.f16840n.size();
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: p */
        public int mo17029p(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != mo17025e(z10)) {
                return z10 ? this.f16841o[this.f16842p[i10] - 1] : i10 - 1;
            }
            if (i11 == 2) {
                return mo17026g(z10);
            }
            return -1;
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: q */
        public Object mo4746q(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: s */
        public d mo4747s(int i10, d dVar, long j10) {
            d dVar2 = this.f16839m.get(i10);
            dVar.m17707h(dVar2.f16860h, dVar2.f16862j, dVar2.f16863k, dVar2.f16864l, dVar2.f16865m, dVar2.f16866n, dVar2.f16867o, dVar2.f16868p, dVar2.f16870r, dVar2.f16872t, dVar2.f16873u, dVar2.f16874v, dVar2.f16875w, dVar2.f16876x);
            dVar.f16871s = dVar2.f16871s;
            return dVar;
        }

        @Override // p264s3.AbstractC4505u3
        /* renamed from: t */
        public int mo4748t() {
            return this.f16839m.size();
        }
    }

    /* renamed from: s3.u3$d */
    /* loaded from: classes.dex */
    public static final class d implements InterfaceC4436h {

        /* renamed from: i */
        @Deprecated
        public Object f16861i;

        /* renamed from: k */
        public Object f16863k;

        /* renamed from: l */
        public long f16864l;

        /* renamed from: m */
        public long f16865m;

        /* renamed from: n */
        public long f16866n;

        /* renamed from: o */
        public boolean f16867o;

        /* renamed from: p */
        public boolean f16868p;

        /* renamed from: q */
        @Deprecated
        public boolean f16869q;

        /* renamed from: r */
        public C4503u1.g f16870r;

        /* renamed from: s */
        public boolean f16871s;

        /* renamed from: t */
        public long f16872t;

        /* renamed from: u */
        public long f16873u;

        /* renamed from: v */
        public int f16874v;

        /* renamed from: w */
        public int f16875w;

        /* renamed from: x */
        public long f16876x;

        /* renamed from: y */
        public static final Object f16858y = new Object();

        /* renamed from: z */
        public static final Object f16859z = new Object();

        /* renamed from: A */
        public static final C4503u1 f16843A = new C4503u1.c().m17604c("com.google.android.exoplayer2.Timeline").m17606e(Uri.EMPTY).m17602a();

        /* renamed from: B */
        public static final String f16844B = C4041n0.m15478q0(1);

        /* renamed from: C */
        public static final String f16845C = C4041n0.m15478q0(2);

        /* renamed from: D */
        public static final String f16846D = C4041n0.m15478q0(3);

        /* renamed from: E */
        public static final String f16847E = C4041n0.m15478q0(4);

        /* renamed from: F */
        public static final String f16848F = C4041n0.m15478q0(5);

        /* renamed from: G */
        public static final String f16849G = C4041n0.m15478q0(6);

        /* renamed from: H */
        public static final String f16850H = C4041n0.m15478q0(7);

        /* renamed from: I */
        public static final String f16851I = C4041n0.m15478q0(8);

        /* renamed from: J */
        public static final String f16852J = C4041n0.m15478q0(9);

        /* renamed from: K */
        public static final String f16853K = C4041n0.m15478q0(10);

        /* renamed from: L */
        public static final String f16854L = C4041n0.m15478q0(11);

        /* renamed from: M */
        public static final String f16855M = C4041n0.m15478q0(12);

        /* renamed from: N */
        public static final String f16856N = C4041n0.m15478q0(13);

        /* renamed from: O */
        public static final InterfaceC4436h.a<d> f16857O = new InterfaceC4436h.a() { // from class: s3.w3
            @Override // p264s3.InterfaceC4436h.a
            /* renamed from: a */
            public final InterfaceC4436h mo6314a(Bundle bundle) {
                AbstractC4505u3.d m17701b;
                m17701b = AbstractC4505u3.d.m17701b(bundle);
                return m17701b;
            }
        };

        /* renamed from: h */
        public Object f16860h = f16858y;

        /* renamed from: j */
        public C4503u1 f16862j = f16843A;

        /* renamed from: b */
        public static d m17701b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f16844B);
            C4503u1 mo6314a = bundle2 != null ? C4503u1.f16710v.mo6314a(bundle2) : C4503u1.f16704p;
            long j10 = bundle.getLong(f16845C, -9223372036854775807L);
            long j11 = bundle.getLong(f16846D, -9223372036854775807L);
            long j12 = bundle.getLong(f16847E, -9223372036854775807L);
            boolean z10 = bundle.getBoolean(f16848F, false);
            boolean z11 = bundle.getBoolean(f16849G, false);
            Bundle bundle3 = bundle.getBundle(f16850H);
            C4503u1.g mo6314a2 = bundle3 != null ? C4503u1.g.f16775s.mo6314a(bundle3) : null;
            boolean z12 = bundle.getBoolean(f16851I, false);
            long j13 = bundle.getLong(f16852J, 0L);
            long j14 = bundle.getLong(f16853K, -9223372036854775807L);
            int i10 = bundle.getInt(f16854L, 0);
            int i11 = bundle.getInt(f16855M, 0);
            long j15 = bundle.getLong(f16856N, 0L);
            d dVar = new d();
            dVar.m17707h(f16859z, mo6314a, null, j10, j11, j12, z10, z11, mo6314a2, j13, j14, i10, i11, j15);
            dVar.f16871s = z12;
            return dVar;
        }

        /* renamed from: c */
        public long m17702c() {
            return C4041n0.m15446a0(this.f16866n);
        }

        /* renamed from: d */
        public long m17703d() {
            return C4041n0.m15442Y0(this.f16872t);
        }

        /* renamed from: e */
        public long m17704e() {
            return this.f16872t;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            return C4041n0.m15449c(this.f16860h, dVar.f16860h) && C4041n0.m15449c(this.f16862j, dVar.f16862j) && C4041n0.m15449c(this.f16863k, dVar.f16863k) && C4041n0.m15449c(this.f16870r, dVar.f16870r) && this.f16864l == dVar.f16864l && this.f16865m == dVar.f16865m && this.f16866n == dVar.f16866n && this.f16867o == dVar.f16867o && this.f16868p == dVar.f16868p && this.f16871s == dVar.f16871s && this.f16872t == dVar.f16872t && this.f16873u == dVar.f16873u && this.f16874v == dVar.f16874v && this.f16875w == dVar.f16875w && this.f16876x == dVar.f16876x;
        }

        /* renamed from: f */
        public long m17705f() {
            return C4041n0.m15442Y0(this.f16873u);
        }

        /* renamed from: g */
        public boolean m17706g() {
            C4014a.m15200f(this.f16869q == (this.f16870r != null));
            return this.f16870r != null;
        }

        /* renamed from: h */
        public d m17707h(Object obj, C4503u1 c4503u1, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, C4503u1.g gVar, long j13, long j14, int i10, int i11, long j15) {
            C4503u1.h hVar;
            this.f16860h = obj;
            this.f16862j = c4503u1 != null ? c4503u1 : f16843A;
            this.f16861i = (c4503u1 == null || (hVar = c4503u1.f16712i) == null) ? null : hVar.f16794i;
            this.f16863k = obj2;
            this.f16864l = j10;
            this.f16865m = j11;
            this.f16866n = j12;
            this.f16867o = z10;
            this.f16868p = z11;
            this.f16869q = gVar != null;
            this.f16870r = gVar;
            this.f16872t = j13;
            this.f16873u = j14;
            this.f16874v = i10;
            this.f16875w = i11;
            this.f16876x = j15;
            this.f16871s = false;
            return this;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f16860h.hashCode()) * 31) + this.f16862j.hashCode()) * 31;
            Object obj = this.f16863k;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            C4503u1.g gVar = this.f16870r;
            int hashCode3 = (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f16864l;
            int i10 = (hashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f16865m;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f16866n;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f16867o ? 1 : 0)) * 31) + (this.f16868p ? 1 : 0)) * 31) + (this.f16871s ? 1 : 0)) * 31;
            long j13 = this.f16872t;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f16873u;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f16874v) * 31) + this.f16875w) * 31;
            long j15 = this.f16876x;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    /* renamed from: b */
    public static AbstractC4505u3 m17668b(Bundle bundle) {
        AbstractC2651u m17669c = m17669c(d.f16857O, C4016b.m15252a(bundle, f16822i));
        AbstractC2651u m17669c2 = m17669c(b.f16831t, C4016b.m15252a(bundle, f16823j));
        int[] intArray = bundle.getIntArray(f16824k);
        if (intArray == null) {
            intArray = m17670d(m17669c.size());
        }
        return new c(m17669c, m17669c2, intArray);
    }

    /* renamed from: c */
    public static <T extends InterfaceC4436h> AbstractC2651u<T> m17669c(InterfaceC4436h.a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return AbstractC2651u.m10770u();
        }
        AbstractC2651u.a aVar2 = new AbstractC2651u.a();
        AbstractC2651u<Bundle> m17223a = BinderC4431g.m17223a(iBinder);
        for (int i10 = 0; i10 < m17223a.size(); i10++) {
            aVar2.mo10749a(aVar.mo6314a(m17223a.get(i10)));
        }
        return aVar2.m10784k();
    }

    /* renamed from: d */
    public static int[] m17670d(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    /* renamed from: e */
    public int mo17025e(boolean z10) {
        return m17676u() ? -1 : 0;
    }

    public boolean equals(Object obj) {
        int mo17026g;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4505u3)) {
            return false;
        }
        AbstractC4505u3 abstractC4505u3 = (AbstractC4505u3) obj;
        if (abstractC4505u3.mo4748t() != mo4748t() || abstractC4505u3.mo4745m() != mo4745m()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i10 = 0; i10 < mo4748t(); i10++) {
            if (!m17675r(i10, dVar).equals(abstractC4505u3.m17675r(i10, dVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < mo4745m(); i11++) {
            if (!mo4744k(i11, bVar, true).equals(abstractC4505u3.mo4744k(i11, bVar2, true))) {
                return false;
            }
        }
        int mo17025e = mo17025e(true);
        if (mo17025e != abstractC4505u3.mo17025e(true) || (mo17026g = mo17026g(true)) != abstractC4505u3.mo17026g(true)) {
            return false;
        }
        while (mo17025e != mo17026g) {
            int mo17027i = mo17027i(mo17025e, 0, true);
            if (mo17027i != abstractC4505u3.mo17027i(mo17025e, 0, true)) {
                return false;
            }
            mo17025e = mo17027i;
        }
        return true;
    }

    /* renamed from: f */
    public abstract int mo4743f(Object obj);

    /* renamed from: g */
    public int mo17026g(boolean z10) {
        if (m17676u()) {
            return -1;
        }
        return mo4748t() - 1;
    }

    /* renamed from: h */
    public final int m17671h(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = m17672j(i10, bVar).f16834j;
        if (m17675r(i12, dVar).f16875w != i10) {
            return i10 + 1;
        }
        int mo17027i = mo17027i(i12, i11, z10);
        if (mo17027i == -1) {
            return -1;
        }
        return m17675r(mo17027i, dVar).f16874v;
    }

    public int hashCode() {
        int i10;
        d dVar = new d();
        b bVar = new b();
        int mo4748t = 217 + mo4748t();
        int i11 = 0;
        while (true) {
            i10 = mo4748t * 31;
            if (i11 >= mo4748t()) {
                break;
            }
            mo4748t = i10 + m17675r(i11, dVar).hashCode();
            i11++;
        }
        int mo4745m = i10 + mo4745m();
        for (int i12 = 0; i12 < mo4745m(); i12++) {
            mo4745m = (mo4745m * 31) + mo4744k(i12, bVar, true).hashCode();
        }
        int mo17025e = mo17025e(true);
        while (mo17025e != -1) {
            mo4745m = (mo4745m * 31) + mo17025e;
            mo17025e = mo17027i(mo17025e, 0, true);
        }
        return mo4745m;
    }

    /* renamed from: i */
    public int mo17027i(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == mo17026g(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == mo17026g(z10) ? mo17025e(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: j */
    public final b m17672j(int i10, b bVar) {
        return mo4744k(i10, bVar, false);
    }

    /* renamed from: k */
    public abstract b mo4744k(int i10, b bVar, boolean z10);

    /* renamed from: l */
    public b mo17028l(Object obj, b bVar) {
        return mo4744k(mo4743f(obj), bVar, true);
    }

    /* renamed from: m */
    public abstract int mo4745m();

    /* renamed from: n */
    public final Pair<Object, Long> m17673n(d dVar, b bVar, int i10, long j10) {
        return (Pair) C4014a.m15199e(m17674o(dVar, bVar, i10, j10, 0L));
    }

    /* renamed from: o */
    public final Pair<Object, Long> m17674o(d dVar, b bVar, int i10, long j10, long j11) {
        C4014a.m15197c(i10, 0, mo4748t());
        mo4747s(i10, dVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = dVar.m17704e();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = dVar.f16874v;
        m17672j(i11, bVar);
        while (i11 < dVar.f16875w && bVar.f16836l != j10) {
            int i12 = i11 + 1;
            if (m17672j(i12, bVar).f16836l > j10) {
                break;
            }
            i11 = i12;
        }
        mo4744k(i11, bVar, true);
        long j12 = j10 - bVar.f16836l;
        long j13 = bVar.f16835k;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        return Pair.create(C4014a.m15199e(bVar.f16833i), Long.valueOf(Math.max(0L, j12)));
    }

    /* renamed from: p */
    public int mo17029p(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == mo17025e(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == mo17025e(z10) ? mo17026g(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: q */
    public abstract Object mo4746q(int i10);

    /* renamed from: r */
    public final d m17675r(int i10, d dVar) {
        return mo4747s(i10, dVar, 0L);
    }

    /* renamed from: s */
    public abstract d mo4747s(int i10, d dVar, long j10);

    /* renamed from: t */
    public abstract int mo4748t();

    /* renamed from: u */
    public final boolean m17676u() {
        return mo4748t() == 0;
    }

    /* renamed from: v */
    public final boolean m17677v(int i10, b bVar, d dVar, int i11, boolean z10) {
        return m17671h(i10, bVar, dVar, i11, z10) == -1;
    }
}
