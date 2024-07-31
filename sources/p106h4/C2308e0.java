package p106h4;

import p222p5.C4015a0;
import p222p5.C4033j0;
import p222p5.C4041n0;
import p333x3.AbstractC5556a;
import p333x3.InterfaceC5572l;

/* renamed from: h4.e0 */
/* loaded from: classes.dex */
public final class C2308e0 extends AbstractC5556a {

    /* renamed from: h4.e0$a */
    /* loaded from: classes.dex */
    public static final class a implements AbstractC5556a.f {

        /* renamed from: a */
        public final C4033j0 f9261a;

        /* renamed from: b */
        public final C4015a0 f9262b = new C4015a0();

        /* renamed from: c */
        public final int f9263c;

        /* renamed from: d */
        public final int f9264d;

        public a(int i10, C4033j0 c4033j0, int i11) {
            this.f9263c = i10;
            this.f9261a = c4033j0;
            this.f9264d = i11;
        }

        @Override // p333x3.AbstractC5556a.f
        /* renamed from: a */
        public AbstractC5556a.e mo159a(InterfaceC5572l interfaceC5572l, long j10) {
            long position = interfaceC5572l.getPosition();
            int min = (int) Math.min(this.f9264d, interfaceC5572l.mo3029b() - position);
            this.f9262b.m15219P(min);
            interfaceC5572l.mo22430p(this.f9262b.m15230e(), 0, min);
            return m9349c(this.f9262b, j10, position);
        }

        @Override // p333x3.AbstractC5556a.f
        /* renamed from: b */
        public void mo9348b() {
            this.f9262b.m15220Q(C4041n0.f14518f);
        }

        /* renamed from: c */
        public final AbstractC5556a.e m9349c(C4015a0 c4015a0, long j10, long j11) {
            int m9420a;
            int m9420a2;
            int m15232g = c4015a0.m15232g();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (c4015a0.m15226a() >= 188 && (m9420a2 = (m9420a = C2318j0.m9420a(c4015a0.m15230e(), c4015a0.m15231f(), m15232g)) + 188) <= m15232g) {
                long m9422c = C2318j0.m9422c(c4015a0, m9420a, this.f9263c);
                if (m9422c != -9223372036854775807L) {
                    long m15363b = this.f9261a.m15363b(m9422c);
                    if (m15363b > j10) {
                        return j14 == -9223372036854775807L ? AbstractC5556a.e.m22401d(m15363b, j11) : AbstractC5556a.e.m22402e(j11 + j13);
                    }
                    if (100000 + m15363b > j10) {
                        return AbstractC5556a.e.m22402e(j11 + m9420a);
                    }
                    j13 = m9420a;
                    j14 = m15363b;
                }
                c4015a0.m15223T(m9420a2);
                j12 = m9420a2;
            }
            return j14 != -9223372036854775807L ? AbstractC5556a.e.m22403f(j14, j11 + j12) : AbstractC5556a.e.f20846d;
        }
    }

    public C2308e0(C4033j0 c4033j0, long j10, long j11, int i10, int i11) {
        super(new AbstractC5556a.b(), new a(i10, c4033j0, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
