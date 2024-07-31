package p275t3;

import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import p047d5.C1547b;
import p047d5.C1550e;
import p109h7.C2428k;
import p152k4.C3348a;
import p222p5.C4014a;
import p222p5.C4036l;
import p236q5.C4192y;
import p264s3.AbstractC4505u3;
import p264s3.C4403a3;
import p264s3.C4463m1;
import p264s3.C4471o;
import p264s3.C4503u1;
import p264s3.C4519x2;
import p264s3.C4528z1;
import p264s3.C4530z3;
import p264s3.InterfaceC4409b3;
import p289u3.C4813e;
import p290u4.C4870n;
import p290u4.C4876q;
import p290u4.InterfaceC4882t;
import p304v3.C5108e;
import p304v3.C5112i;

/* renamed from: t3.b */
/* loaded from: classes.dex */
public interface InterfaceC4621b {

    /* renamed from: t3.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final long f17303a;

        /* renamed from: b */
        public final AbstractC4505u3 f17304b;

        /* renamed from: c */
        public final int f17305c;

        /* renamed from: d */
        public final InterfaceC4882t.b f17306d;

        /* renamed from: e */
        public final long f17307e;

        /* renamed from: f */
        public final AbstractC4505u3 f17308f;

        /* renamed from: g */
        public final int f17309g;

        /* renamed from: h */
        public final InterfaceC4882t.b f17310h;

        /* renamed from: i */
        public final long f17311i;

        /* renamed from: j */
        public final long f17312j;

        public a(long j10, AbstractC4505u3 abstractC4505u3, int i10, InterfaceC4882t.b bVar, long j11, AbstractC4505u3 abstractC4505u32, int i11, InterfaceC4882t.b bVar2, long j12, long j13) {
            this.f17303a = j10;
            this.f17304b = abstractC4505u3;
            this.f17305c = i10;
            this.f17306d = bVar;
            this.f17307e = j11;
            this.f17308f = abstractC4505u32;
            this.f17309g = i11;
            this.f17310h = bVar2;
            this.f17311i = j12;
            this.f17312j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f17303a == aVar.f17303a && this.f17305c == aVar.f17305c && this.f17307e == aVar.f17307e && this.f17309g == aVar.f17309g && this.f17311i == aVar.f17311i && this.f17312j == aVar.f17312j && C2428k.m9688a(this.f17304b, aVar.f17304b) && C2428k.m9688a(this.f17306d, aVar.f17306d) && C2428k.m9688a(this.f17308f, aVar.f17308f) && C2428k.m9688a(this.f17310h, aVar.f17310h);
        }

        public int hashCode() {
            return C2428k.m9689b(Long.valueOf(this.f17303a), this.f17304b, Integer.valueOf(this.f17305c), this.f17306d, Long.valueOf(this.f17307e), this.f17308f, Integer.valueOf(this.f17309g), this.f17310h, Long.valueOf(this.f17311i), Long.valueOf(this.f17312j));
        }
    }

    /* renamed from: t3.b$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final C4036l f17313a;

        /* renamed from: b */
        public final SparseArray<a> f17314b;

        public b(C4036l c4036l, SparseArray<a> sparseArray) {
            this.f17313a = c4036l;
            SparseArray<a> sparseArray2 = new SparseArray<>(c4036l.m15378c());
            for (int i10 = 0; i10 < c4036l.m15378c(); i10++) {
                int m15377b = c4036l.m15377b(i10);
                sparseArray2.append(m15377b, (a) C4014a.m15199e(sparseArray.get(m15377b)));
            }
            this.f17314b = sparseArray2;
        }

        /* renamed from: a */
        public boolean m18291a(int i10) {
            return this.f17313a.m15376a(i10);
        }

        /* renamed from: b */
        public int m18292b(int i10) {
            return this.f17313a.m15377b(i10);
        }

        /* renamed from: c */
        public a m18293c(int i10) {
            return (a) C4014a.m15199e(this.f17314b.get(i10));
        }

        /* renamed from: d */
        public int m18294d() {
            return this.f17313a.m15378c();
        }
    }

    /* renamed from: A */
    default void m18218A(a aVar, C3348a c3348a) {
    }

    @Deprecated
    /* renamed from: B */
    default void m18219B(a aVar, int i10, C4463m1 c4463m1) {
    }

    /* renamed from: C */
    default void m18220C(a aVar, C4463m1 c4463m1, C5112i c5112i) {
    }

    /* renamed from: D */
    default void m18221D(a aVar, C4813e c4813e) {
    }

    /* renamed from: E */
    default void m18222E(a aVar, C4870n c4870n, C4876q c4876q) {
    }

    /* renamed from: F */
    default void m18223F(a aVar) {
    }

    /* renamed from: G */
    default void m18224G(a aVar, C4463m1 c4463m1, C5112i c5112i) {
    }

    @Deprecated
    /* renamed from: H */
    default void m18225H(a aVar, int i10, C5108e c5108e) {
    }

    /* renamed from: I */
    default void m18226I(a aVar, int i10) {
    }

    /* renamed from: J */
    default void m18227J(a aVar, C4503u1 c4503u1, int i10) {
    }

    /* renamed from: K */
    default void m18228K(a aVar, Object obj, long j10) {
    }

    /* renamed from: L */
    default void m18229L(a aVar, boolean z10) {
    }

    @Deprecated
    /* renamed from: M */
    default void m18230M(a aVar, int i10, String str, long j10) {
    }

    /* renamed from: N */
    default void mo18231N(a aVar, C4870n c4870n, C4876q c4876q, IOException iOException, boolean z10) {
    }

    /* renamed from: O */
    default void m18232O(a aVar, int i10, int i11) {
    }

    @Deprecated
    /* renamed from: P */
    default void m18233P(a aVar) {
    }

    @Deprecated
    /* renamed from: Q */
    default void m18234Q(a aVar, int i10, int i11, int i12, float f10) {
    }

    /* renamed from: S */
    default void m18235S(a aVar, int i10, long j10, long j11) {
    }

    /* renamed from: T */
    default void m18236T(a aVar, C4471o c4471o) {
    }

    /* renamed from: U */
    default void m18237U(a aVar, InterfaceC4409b3.b bVar) {
    }

    @Deprecated
    /* renamed from: V */
    default void m18238V(a aVar, int i10) {
    }

    /* renamed from: W */
    default void m18239W(a aVar, int i10) {
    }

    /* renamed from: X */
    default void m18240X(a aVar, Exception exc) {
    }

    /* renamed from: Y */
    default void m18241Y(a aVar, boolean z10) {
    }

    /* renamed from: Z */
    default void m18242Z(a aVar, C4530z3 c4530z3) {
    }

    /* renamed from: a */
    default void m18243a(a aVar, String str, long j10, long j11) {
    }

    @Deprecated
    /* renamed from: a0 */
    default void m18244a0(a aVar, List<C1547b> list) {
    }

    /* renamed from: b */
    default void m18245b(a aVar, int i10, boolean z10) {
    }

    /* renamed from: b0 */
    default void m18246b0(a aVar, Exception exc) {
    }

    /* renamed from: c */
    default void m18247c(a aVar, C1550e c1550e) {
    }

    /* renamed from: c0 */
    default void m18248c0(a aVar, C4528z1 c4528z1) {
    }

    /* renamed from: d */
    default void m18249d(a aVar, int i10) {
    }

    /* renamed from: d0 */
    default void m18250d0(a aVar, boolean z10) {
    }

    /* renamed from: e */
    default void m18251e(a aVar) {
    }

    /* renamed from: e0 */
    default void m18252e0(a aVar, C4519x2 c4519x2) {
    }

    /* renamed from: f */
    default void m18253f(a aVar) {
    }

    /* renamed from: f0 */
    default void mo18254f0(a aVar, int i10, long j10, long j11) {
    }

    @Deprecated
    /* renamed from: g */
    default void m18255g(a aVar, C4463m1 c4463m1) {
    }

    /* renamed from: h */
    default void mo18256h(a aVar, C4876q c4876q) {
    }

    /* renamed from: h0 */
    default void mo18257h0(a aVar, C4519x2 c4519x2) {
    }

    /* renamed from: i */
    default void m18258i(a aVar, C4876q c4876q) {
    }

    /* renamed from: i0 */
    default void m18259i0(a aVar, C4403a3 c4403a3) {
    }

    /* renamed from: j */
    default void m18260j(a aVar, C5108e c5108e) {
    }

    @Deprecated
    /* renamed from: j0 */
    default void m18261j0(a aVar, boolean z10) {
    }

    /* renamed from: k */
    default void m18262k(a aVar, long j10) {
    }

    /* renamed from: k0 */
    default void m18263k0(a aVar) {
    }

    /* renamed from: l */
    default void m18264l(a aVar, float f10) {
    }

    /* renamed from: l0 */
    default void m18265l0(a aVar, String str) {
    }

    /* renamed from: m */
    default void m18266m(a aVar, C5108e c5108e) {
    }

    /* renamed from: n */
    default void m18267n(a aVar, long j10, int i10) {
    }

    @Deprecated
    /* renamed from: n0 */
    default void m18268n0(a aVar, String str, long j10) {
    }

    /* renamed from: o */
    default void mo18269o(a aVar, C4192y c4192y) {
    }

    /* renamed from: o0 */
    default void m18270o0(a aVar, C4870n c4870n, C4876q c4876q) {
    }

    @Deprecated
    /* renamed from: p */
    default void m18271p(a aVar, C4463m1 c4463m1) {
    }

    /* renamed from: p0 */
    default void m18272p0(a aVar, int i10) {
    }

    @Deprecated
    /* renamed from: q */
    default void m18273q(a aVar) {
    }

    /* renamed from: q0 */
    default void m18274q0(a aVar, int i10) {
    }

    /* renamed from: r */
    default void mo18275r(InterfaceC4409b3 interfaceC4409b3, b bVar) {
    }

    /* renamed from: r0 */
    default void m18276r0(a aVar, Exception exc) {
    }

    /* renamed from: s */
    default void mo18277s(a aVar, InterfaceC4409b3.e eVar, InterfaceC4409b3.e eVar2, int i10) {
    }

    /* renamed from: s0 */
    default void m18278s0(a aVar, int i10, long j10) {
    }

    /* renamed from: t */
    default void m18279t(a aVar) {
    }

    @Deprecated
    /* renamed from: t0 */
    default void m18280t0(a aVar, boolean z10, int i10) {
    }

    /* renamed from: u */
    default void m18281u(a aVar, C4870n c4870n, C4876q c4876q) {
    }

    @Deprecated
    /* renamed from: u0 */
    default void m18282u0(a aVar, int i10, C5108e c5108e) {
    }

    /* renamed from: v */
    default void m18283v(a aVar, Exception exc) {
    }

    /* renamed from: v0 */
    default void m18284v0(a aVar, String str) {
    }

    /* renamed from: w */
    default void m18285w(a aVar, String str, long j10, long j11) {
    }

    /* renamed from: w0 */
    default void m18286w0(a aVar, C5108e c5108e) {
    }

    @Deprecated
    /* renamed from: x0 */
    default void m18287x0(a aVar, String str, long j10) {
    }

    /* renamed from: y */
    default void mo18288y(a aVar, C5108e c5108e) {
    }

    /* renamed from: y0 */
    default void m18289y0(a aVar, boolean z10, int i10) {
    }

    @Deprecated
    /* renamed from: z */
    default void m18290z(a aVar) {
    }
}
