package p301v0;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p079f6.C1841a;
import p301v0.C5031b0;
import p301v0.C5058k0;
import p301v0.C5086t1;

/* renamed from: v0.e */
/* loaded from: classes.dex */
public abstract class AbstractC5039e implements InterfaceC5044f1 {

    /* renamed from: v0.e$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18898a;

        static {
            int[] iArr = new int[C5086t1.b.values().length];
            f18898a = iArr;
            try {
                iArr[C5086t1.b.f19093q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18898a[C5086t1.b.f19097u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18898a[C5086t1.b.f19086j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18898a[C5086t1.b.f19099w.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18898a[C5086t1.b.f19092p.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18898a[C5086t1.b.f19091o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18898a[C5086t1.b.f19087k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18898a[C5086t1.b.f19090n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18898a[C5086t1.b.f19088l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18898a[C5086t1.b.f19096t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18898a[C5086t1.b.f19100x.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f18898a[C5086t1.b.f19101y.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f18898a[C5086t1.b.f19102z.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f18898a[C5086t1.b.f19084A.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f18898a[C5086t1.b.f19094r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f18898a[C5086t1.b.f19098v.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f18898a[C5086t1.b.f19089m.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* renamed from: v0.e$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC5039e {

        /* renamed from: a */
        public final boolean f18899a;

        /* renamed from: b */
        public final byte[] f18900b;

        /* renamed from: c */
        public int f18901c;

        /* renamed from: d */
        public final int f18902d;

        /* renamed from: e */
        public int f18903e;

        /* renamed from: f */
        public int f18904f;

        /* renamed from: g */
        public int f18905g;

        public b(ByteBuffer byteBuffer, boolean z10) {
            super(null);
            this.f18899a = z10;
            this.f18900b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f18901c = arrayOffset;
            this.f18902d = arrayOffset;
            this.f18903e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: A */
        public void mo19840A(List<Boolean> list) {
            int i10;
            int m19870c0;
            int i11;
            if (!(list instanceof C5042f)) {
                int m20576b = C5086t1.m20576b(this.f18904f);
                if (m20576b != 0) {
                    if (m20576b != 2) {
                        throw C5031b0.m19813d();
                    }
                    m19870c0 = this.f18901c + m19870c0();
                    while (this.f18901c < m19870c0) {
                        list.add(Boolean.valueOf(m19870c0() != 0));
                    }
                }
                do {
                    list.add(Boolean.valueOf(mo19879h()));
                    if (m19856R()) {
                        return;
                    } else {
                        i10 = this.f18901c;
                    }
                } while (m19870c0() == this.f18904f);
                this.f18901c = i10;
                return;
            }
            C5042f c5042f = (C5042f) list;
            int m20576b2 = C5086t1.m20576b(this.f18904f);
            if (m20576b2 != 0) {
                if (m20576b2 != 2) {
                    throw C5031b0.m19813d();
                }
                m19870c0 = this.f18901c + m19870c0();
                while (this.f18901c < m19870c0) {
                    c5042f.m19918e(m19870c0() != 0);
                }
            }
            do {
                c5042f.m19918e(mo19879h());
                if (m19856R()) {
                    return;
                } else {
                    i11 = this.f18901c;
                }
            } while (m19870c0() == this.f18904f);
            this.f18901c = i11;
            return;
            m19878g0(m19870c0);
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: B */
        public String mo19841B() {
            return m19866a0(false);
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: C */
        public int mo19842C() {
            if (m19856R()) {
                return C1841a.e.API_PRIORITY_OTHER;
            }
            int m19870c0 = m19870c0();
            this.f18904f = m19870c0;
            return m19870c0 == this.f18905g ? C1841a.e.API_PRIORITY_OTHER : C5086t1.m20575a(m19870c0);
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: D */
        public void mo19843D(List<String> list) {
            m19868b0(list, false);
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: E */
        public void mo19844E(List<String> list) {
            m19868b0(list, true);
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: F */
        public AbstractC5048h mo19845F() {
            m19880h0(2);
            int m19870c0 = m19870c0();
            if (m19870c0 == 0) {
                return AbstractC5048h.f18921i;
            }
            m19876f0(m19870c0);
            AbstractC5048h m19948C = this.f18899a ? AbstractC5048h.m19948C(this.f18900b, this.f18901c, m19870c0) : AbstractC5048h.m19953h(this.f18900b, this.f18901c, m19870c0);
            this.f18901c += m19870c0;
            return m19948C;
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: G */
        public void mo19846G(List<Float> list) {
            int i10;
            int i11;
            if (!(list instanceof C5092w)) {
                int m20576b = C5086t1.m20576b(this.f18904f);
                if (m20576b == 2) {
                    int m19870c0 = m19870c0();
                    m19890m0(m19870c0);
                    int i12 = this.f18901c + m19870c0;
                    while (this.f18901c < i12) {
                        list.add(Float.valueOf(Float.intBitsToFloat(m19861W())));
                    }
                    return;
                }
                if (m20576b != 5) {
                    throw C5031b0.m19813d();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (m19856R()) {
                        return;
                    } else {
                        i10 = this.f18901c;
                    }
                } while (m19870c0() == this.f18904f);
                this.f18901c = i10;
                return;
            }
            C5092w c5092w = (C5092w) list;
            int m20576b2 = C5086t1.m20576b(this.f18904f);
            if (m20576b2 == 2) {
                int m19870c02 = m19870c0();
                m19890m0(m19870c02);
                int i13 = this.f18901c + m19870c02;
                while (this.f18901c < i13) {
                    c5092w.m20679d(Float.intBitsToFloat(m19861W()));
                }
                return;
            }
            if (m20576b2 != 5) {
                throw C5031b0.m19813d();
            }
            do {
                c5092w.m20679d(readFloat());
                if (m19856R()) {
                    return;
                } else {
                    i11 = this.f18901c;
                }
            } while (m19870c0() == this.f18904f);
            this.f18901c = i11;
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: H */
        public int mo19847H() {
            m19880h0(0);
            return m19870c0();
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: I */
        public boolean mo19848I() {
            int i10;
            int i11;
            if (m19856R() || (i10 = this.f18904f) == this.f18905g) {
                return false;
            }
            int m20576b = C5086t1.m20576b(i10);
            if (m20576b == 0) {
                m19886k0();
                return true;
            }
            if (m20576b == 1) {
                i11 = 8;
            } else if (m20576b == 2) {
                i11 = m19870c0();
            } else {
                if (m20576b == 3) {
                    m19884j0();
                    return true;
                }
                if (m20576b != 5) {
                    throw C5031b0.m19813d();
                }
                i11 = 4;
            }
            m19882i0(i11);
            return true;
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: J */
        public int mo19849J() {
            m19880h0(5);
            return m19860V();
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: K */
        public void mo19850K(List<AbstractC5048h> list) {
            int i10;
            if (C5086t1.m20576b(this.f18904f) != 2) {
                throw C5031b0.m19813d();
            }
            do {
                list.add(mo19845F());
                if (m19856R()) {
                    return;
                } else {
                    i10 = this.f18901c;
                }
            } while (m19870c0() == this.f18904f);
            this.f18901c = i10;
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: L */
        public void mo19851L(List<Double> list) {
            int i10;
            int i11;
            if (!(list instanceof C5063m)) {
                int m20576b = C5086t1.m20576b(this.f18904f);
                if (m20576b != 1) {
                    if (m20576b != 2) {
                        throw C5031b0.m19813d();
                    }
                    int m19870c0 = m19870c0();
                    m19892n0(m19870c0);
                    int i12 = this.f18901c + m19870c0;
                    while (this.f18901c < i12) {
                        list.add(Double.valueOf(Double.longBitsToDouble(m19863Y())));
                    }
                    return;
                }
                do {
                    list.add(Double.valueOf(readDouble()));
                    if (m19856R()) {
                        return;
                    } else {
                        i10 = this.f18901c;
                    }
                } while (m19870c0() == this.f18904f);
                this.f18901c = i10;
                return;
            }
            C5063m c5063m = (C5063m) list;
            int m20576b2 = C5086t1.m20576b(this.f18904f);
            if (m20576b2 != 1) {
                if (m20576b2 != 2) {
                    throw C5031b0.m19813d();
                }
                int m19870c02 = m19870c0();
                m19892n0(m19870c02);
                int i13 = this.f18901c + m19870c02;
                while (this.f18901c < i13) {
                    c5063m.m20355d(Double.longBitsToDouble(m19863Y()));
                }
                return;
            }
            do {
                c5063m.m20355d(readDouble());
                if (m19856R()) {
                    return;
                } else {
                    i11 = this.f18901c;
                }
            } while (m19870c0() == this.f18904f);
            this.f18901c = i11;
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: M */
        public long mo19852M() {
            m19880h0(0);
            return m19872d0();
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: N */
        public String mo19853N() {
            return m19866a0(true);
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: O */
        public void mo19854O(List<Long> list) {
            int i10;
            int i11;
            if (!(list instanceof C5052i0)) {
                int m20576b = C5086t1.m20576b(this.f18904f);
                if (m20576b != 1) {
                    if (m20576b != 2) {
                        throw C5031b0.m19813d();
                    }
                    int m19870c0 = m19870c0();
                    m19892n0(m19870c0);
                    int i12 = this.f18901c + m19870c0;
                    while (this.f18901c < i12) {
                        list.add(Long.valueOf(m19863Y()));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(mo19869c()));
                    if (m19856R()) {
                        return;
                    } else {
                        i10 = this.f18901c;
                    }
                } while (m19870c0() == this.f18904f);
                this.f18901c = i10;
                return;
            }
            C5052i0 c5052i0 = (C5052i0) list;
            int m20576b2 = C5086t1.m20576b(this.f18904f);
            if (m20576b2 != 1) {
                if (m20576b2 != 2) {
                    throw C5031b0.m19813d();
                }
                int m19870c02 = m19870c0();
                m19892n0(m19870c02);
                int i13 = this.f18901c + m19870c02;
                while (this.f18901c < i13) {
                    c5052i0.m20055e(m19863Y());
                }
                return;
            }
            do {
                c5052i0.m20055e(mo19869c());
                if (m19856R()) {
                    return;
                } else {
                    i11 = this.f18901c;
                }
            } while (m19870c0() == this.f18904f);
            this.f18901c = i11;
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: P */
        public <T> T mo19855P(InterfaceC5047g1<T> interfaceC5047g1, C5072p c5072p) {
            m19880h0(2);
            return (T) m19864Z(interfaceC5047g1, c5072p);
        }

        /* renamed from: R */
        public final boolean m19856R() {
            return this.f18901c == this.f18903e;
        }

        /* renamed from: S */
        public final byte m19857S() {
            int i10 = this.f18901c;
            if (i10 == this.f18903e) {
                throw C5031b0.m19819k();
            }
            byte[] bArr = this.f18900b;
            this.f18901c = i10 + 1;
            return bArr[i10];
        }

        /* renamed from: T */
        public final Object m19858T(C5086t1.b bVar, Class<?> cls, C5072p c5072p) {
            switch (a.f18898a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(mo19879h());
                case 2:
                    return mo19845F();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(mo19899u());
                case 5:
                    return Integer.valueOf(mo19877g());
                case 6:
                    return Long.valueOf(mo19869c());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(mo19847H());
                case 9:
                    return Long.valueOf(mo19852M());
                case 10:
                    return mo19894p(cls, c5072p);
                case 11:
                    return Integer.valueOf(mo19849J());
                case 12:
                    return Long.valueOf(mo19881i());
                case 13:
                    return Integer.valueOf(mo19903y());
                case 14:
                    return Long.valueOf(mo19904z());
                case 15:
                    return mo19853N();
                case 16:
                    return Integer.valueOf(mo19887l());
                case 17:
                    return Long.valueOf(mo19867b());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        /* renamed from: U */
        public final <T> T m19859U(InterfaceC5047g1<T> interfaceC5047g1, C5072p c5072p) {
            int i10 = this.f18905g;
            this.f18905g = C5086t1.m20577c(C5086t1.m20575a(this.f18904f), 4);
            try {
                T mo19945h = interfaceC5047g1.mo19945h();
                interfaceC5047g1.mo19942e(mo19945h, this, c5072p);
                interfaceC5047g1.mo19939b(mo19945h);
                if (this.f18904f == this.f18905g) {
                    return mo19945h;
                }
                throw C5031b0.m19816g();
            } finally {
                this.f18905g = i10;
            }
        }

        /* renamed from: V */
        public final int m19860V() {
            m19876f0(4);
            return m19861W();
        }

        /* renamed from: W */
        public final int m19861W() {
            int i10 = this.f18901c;
            byte[] bArr = this.f18900b;
            this.f18901c = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        /* renamed from: X */
        public final long m19862X() {
            m19876f0(8);
            return m19863Y();
        }

        /* renamed from: Y */
        public final long m19863Y() {
            int i10 = this.f18901c;
            byte[] bArr = this.f18900b;
            this.f18901c = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        /* renamed from: Z */
        public final <T> T m19864Z(InterfaceC5047g1<T> interfaceC5047g1, C5072p c5072p) {
            int m19870c0 = m19870c0();
            m19876f0(m19870c0);
            int i10 = this.f18903e;
            int i11 = this.f18901c + m19870c0;
            this.f18903e = i11;
            try {
                T mo19945h = interfaceC5047g1.mo19945h();
                interfaceC5047g1.mo19942e(mo19945h, this, c5072p);
                interfaceC5047g1.mo19939b(mo19945h);
                if (this.f18901c == i11) {
                    return mo19945h;
                }
                throw C5031b0.m19816g();
            } finally {
                this.f18903e = i10;
            }
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: a */
        public void mo19865a(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof C5098z)) {
                int m20576b = C5086t1.m20576b(this.f18904f);
                if (m20576b != 0) {
                    if (m20576b != 2) {
                        throw C5031b0.m19813d();
                    }
                    int m19870c0 = this.f18901c + m19870c0();
                    while (this.f18901c < m19870c0) {
                        list.add(Integer.valueOf(AbstractC5051i.m19988b(m19870c0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo19903y()));
                    if (m19856R()) {
                        return;
                    } else {
                        i10 = this.f18901c;
                    }
                } while (m19870c0() == this.f18904f);
                this.f18901c = i10;
                return;
            }
            C5098z c5098z = (C5098z) list;
            int m20576b2 = C5086t1.m20576b(this.f18904f);
            if (m20576b2 != 0) {
                if (m20576b2 != 2) {
                    throw C5031b0.m19813d();
                }
                int m19870c02 = this.f18901c + m19870c0();
                while (this.f18901c < m19870c02) {
                    c5098z.m20731d(AbstractC5051i.m19988b(m19870c0()));
                }
                return;
            }
            do {
                c5098z.m20731d(mo19903y());
                if (m19856R()) {
                    return;
                } else {
                    i11 = this.f18901c;
                }
            } while (m19870c0() == this.f18904f);
            this.f18901c = i11;
        }

        /* renamed from: a0 */
        public String m19866a0(boolean z10) {
            m19880h0(2);
            int m19870c0 = m19870c0();
            if (m19870c0 == 0) {
                return "";
            }
            m19876f0(m19870c0);
            if (z10) {
                byte[] bArr = this.f18900b;
                int i10 = this.f18901c;
                if (!C5083s1.m20541n(bArr, i10, i10 + m19870c0)) {
                    throw C5031b0.m19812c();
                }
            }
            String str = new String(this.f18900b, this.f18901c, m19870c0, C5028a0.f18862a);
            this.f18901c += m19870c0;
            return str;
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: b */
        public long mo19867b() {
            m19880h0(0);
            return m19872d0();
        }

        /* renamed from: b0 */
        public void m19868b0(List<String> list, boolean z10) {
            int i10;
            int i11;
            if (C5086t1.m20576b(this.f18904f) != 2) {
                throw C5031b0.m19813d();
            }
            if (!(list instanceof InterfaceC5046g0) || z10) {
                do {
                    list.add(m19866a0(z10));
                    if (m19856R()) {
                        return;
                    } else {
                        i10 = this.f18901c;
                    }
                } while (m19870c0() == this.f18904f);
                this.f18901c = i10;
                return;
            }
            InterfaceC5046g0 interfaceC5046g0 = (InterfaceC5046g0) list;
            do {
                interfaceC5046g0.mo19935l(mo19845F());
                if (m19856R()) {
                    return;
                } else {
                    i11 = this.f18901c;
                }
            } while (m19870c0() == this.f18904f);
            this.f18901c = i11;
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: c */
        public long mo19869c() {
            m19880h0(1);
            return m19862X();
        }

        /* renamed from: c0 */
        public final int m19870c0() {
            int i10;
            int i11 = this.f18901c;
            int i12 = this.f18903e;
            if (i12 == i11) {
                throw C5031b0.m19819k();
            }
            byte[] bArr = this.f18900b;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f18901c = i13;
                return b10;
            }
            if (i12 - i13 < 9) {
                return (int) m19874e0();
            }
            int i14 = i13 + 1;
            int i15 = b10 ^ (bArr[i13] << 7);
            if (i15 < 0) {
                i10 = i15 ^ (-128);
            } else {
                int i16 = i14 + 1;
                int i17 = i15 ^ (bArr[i14] << 14);
                if (i17 >= 0) {
                    i10 = i17 ^ 16256;
                } else {
                    i14 = i16 + 1;
                    int i18 = i17 ^ (bArr[i16] << 21);
                    if (i18 < 0) {
                        i10 = i18 ^ (-2080896);
                    } else {
                        i16 = i14 + 1;
                        byte b11 = bArr[i14];
                        i10 = (i18 ^ (b11 << 28)) ^ 266354560;
                        if (b11 < 0) {
                            i14 = i16 + 1;
                            if (bArr[i16] < 0) {
                                i16 = i14 + 1;
                                if (bArr[i14] < 0) {
                                    i14 = i16 + 1;
                                    if (bArr[i16] < 0) {
                                        i16 = i14 + 1;
                                        if (bArr[i14] < 0) {
                                            i14 = i16 + 1;
                                            if (bArr[i16] < 0) {
                                                throw C5031b0.m19814e();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i14 = i16;
            }
            this.f18901c = i14;
            return i10;
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: d */
        public void mo19871d(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof C5098z)) {
                int m20576b = C5086t1.m20576b(this.f18904f);
                if (m20576b == 2) {
                    int m19870c0 = m19870c0();
                    m19890m0(m19870c0);
                    int i12 = this.f18901c + m19870c0;
                    while (this.f18901c < i12) {
                        list.add(Integer.valueOf(m19861W()));
                    }
                    return;
                }
                if (m20576b != 5) {
                    throw C5031b0.m19813d();
                }
                do {
                    list.add(Integer.valueOf(mo19849J()));
                    if (m19856R()) {
                        return;
                    } else {
                        i10 = this.f18901c;
                    }
                } while (m19870c0() == this.f18904f);
                this.f18901c = i10;
                return;
            }
            C5098z c5098z = (C5098z) list;
            int m20576b2 = C5086t1.m20576b(this.f18904f);
            if (m20576b2 == 2) {
                int m19870c02 = m19870c0();
                m19890m0(m19870c02);
                int i13 = this.f18901c + m19870c02;
                while (this.f18901c < i13) {
                    c5098z.m20731d(m19861W());
                }
                return;
            }
            if (m20576b2 != 5) {
                throw C5031b0.m19813d();
            }
            do {
                c5098z.m20731d(mo19849J());
                if (m19856R()) {
                    return;
                } else {
                    i11 = this.f18901c;
                }
            } while (m19870c0() == this.f18904f);
            this.f18901c = i11;
        }

        /* renamed from: d0 */
        public long m19872d0() {
            long j10;
            long j11;
            long j12;
            int i10;
            int i11 = this.f18901c;
            int i12 = this.f18903e;
            if (i12 == i11) {
                throw C5031b0.m19819k();
            }
            byte[] bArr = this.f18900b;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f18901c = i13;
                return b10;
            }
            if (i12 - i13 < 9) {
                return m19874e0();
            }
            int i14 = i13 + 1;
            int i15 = b10 ^ (bArr[i13] << 7);
            if (i15 >= 0) {
                int i16 = i14 + 1;
                int i17 = i15 ^ (bArr[i14] << 14);
                if (i17 >= 0) {
                    i14 = i16;
                    j10 = i17 ^ 16256;
                } else {
                    i14 = i16 + 1;
                    int i18 = i17 ^ (bArr[i16] << 21);
                    if (i18 < 0) {
                        i10 = i18 ^ (-2080896);
                    } else {
                        long j13 = i18;
                        int i19 = i14 + 1;
                        long j14 = j13 ^ (bArr[i14] << 28);
                        if (j14 >= 0) {
                            j12 = 266354560;
                        } else {
                            i14 = i19 + 1;
                            long j15 = j14 ^ (bArr[i19] << 35);
                            if (j15 < 0) {
                                j11 = -34093383808L;
                            } else {
                                i19 = i14 + 1;
                                j14 = j15 ^ (bArr[i14] << 42);
                                if (j14 >= 0) {
                                    j12 = 4363953127296L;
                                } else {
                                    i14 = i19 + 1;
                                    j15 = j14 ^ (bArr[i19] << 49);
                                    if (j15 < 0) {
                                        j11 = -558586000294016L;
                                    } else {
                                        int i20 = i14 + 1;
                                        long j16 = (j15 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                        if (j16 < 0) {
                                            i14 = i20 + 1;
                                            if (bArr[i20] < 0) {
                                                throw C5031b0.m19814e();
                                            }
                                        } else {
                                            i14 = i20;
                                        }
                                        j10 = j16;
                                    }
                                }
                            }
                            j10 = j15 ^ j11;
                        }
                        j10 = j14 ^ j12;
                        i14 = i19;
                    }
                }
                this.f18901c = i14;
                return j10;
            }
            i10 = i15 ^ (-128);
            j10 = i10;
            this.f18901c = i14;
            return j10;
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: e */
        public void mo19873e(List<Long> list) {
            int i10;
            int i11;
            if (!(list instanceof C5052i0)) {
                int m20576b = C5086t1.m20576b(this.f18904f);
                if (m20576b != 0) {
                    if (m20576b != 2) {
                        throw C5031b0.m19813d();
                    }
                    int m19870c0 = this.f18901c + m19870c0();
                    while (this.f18901c < m19870c0) {
                        list.add(Long.valueOf(AbstractC5051i.m19989c(m19872d0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(mo19904z()));
                    if (m19856R()) {
                        return;
                    } else {
                        i10 = this.f18901c;
                    }
                } while (m19870c0() == this.f18904f);
                this.f18901c = i10;
                return;
            }
            C5052i0 c5052i0 = (C5052i0) list;
            int m20576b2 = C5086t1.m20576b(this.f18904f);
            if (m20576b2 != 0) {
                if (m20576b2 != 2) {
                    throw C5031b0.m19813d();
                }
                int m19870c02 = this.f18901c + m19870c0();
                while (this.f18901c < m19870c02) {
                    c5052i0.m20055e(AbstractC5051i.m19989c(m19872d0()));
                }
                return;
            }
            do {
                c5052i0.m20055e(mo19904z());
                if (m19856R()) {
                    return;
                } else {
                    i11 = this.f18901c;
                }
            } while (m19870c0() == this.f18904f);
            this.f18901c = i11;
        }

        /* renamed from: e0 */
        public final long m19874e0() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                j10 |= (r3 & Byte.MAX_VALUE) << i10;
                if ((m19857S() & 128) == 0) {
                    return j10;
                }
            }
            throw C5031b0.m19814e();
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: f */
        public void mo19875f(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof C5098z)) {
                int m20576b = C5086t1.m20576b(this.f18904f);
                if (m20576b != 0) {
                    if (m20576b != 2) {
                        throw C5031b0.m19813d();
                    }
                    int m19870c0 = this.f18901c + m19870c0();
                    while (this.f18901c < m19870c0) {
                        list.add(Integer.valueOf(m19870c0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo19887l()));
                    if (m19856R()) {
                        return;
                    } else {
                        i10 = this.f18901c;
                    }
                } while (m19870c0() == this.f18904f);
                this.f18901c = i10;
                return;
            }
            C5098z c5098z = (C5098z) list;
            int m20576b2 = C5086t1.m20576b(this.f18904f);
            if (m20576b2 != 0) {
                if (m20576b2 != 2) {
                    throw C5031b0.m19813d();
                }
                int m19870c02 = this.f18901c + m19870c0();
                while (this.f18901c < m19870c02) {
                    c5098z.m20731d(m19870c0());
                }
                return;
            }
            do {
                c5098z.m20731d(mo19887l());
                if (m19856R()) {
                    return;
                } else {
                    i11 = this.f18901c;
                }
            } while (m19870c0() == this.f18904f);
            this.f18901c = i11;
        }

        /* renamed from: f0 */
        public final void m19876f0(int i10) {
            if (i10 < 0 || i10 > this.f18903e - this.f18901c) {
                throw C5031b0.m19819k();
            }
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: g */
        public int mo19877g() {
            m19880h0(5);
            return m19860V();
        }

        /* renamed from: g0 */
        public final void m19878g0(int i10) {
            if (this.f18901c != i10) {
                throw C5031b0.m19819k();
            }
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: h */
        public boolean mo19879h() {
            m19880h0(0);
            return m19870c0() != 0;
        }

        /* renamed from: h0 */
        public final void m19880h0(int i10) {
            if (C5086t1.m20576b(this.f18904f) != i10) {
                throw C5031b0.m19813d();
            }
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: i */
        public long mo19881i() {
            m19880h0(1);
            return m19862X();
        }

        /* renamed from: i0 */
        public final void m19882i0(int i10) {
            m19876f0(i10);
            this.f18901c += i10;
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: j */
        public void mo19883j(List<Long> list) {
            int i10;
            int m19870c0;
            int i11;
            if (!(list instanceof C5052i0)) {
                int m20576b = C5086t1.m20576b(this.f18904f);
                if (m20576b != 0) {
                    if (m20576b != 2) {
                        throw C5031b0.m19813d();
                    }
                    m19870c0 = this.f18901c + m19870c0();
                    while (this.f18901c < m19870c0) {
                        list.add(Long.valueOf(m19872d0()));
                    }
                }
                do {
                    list.add(Long.valueOf(mo19867b()));
                    if (m19856R()) {
                        return;
                    } else {
                        i10 = this.f18901c;
                    }
                } while (m19870c0() == this.f18904f);
                this.f18901c = i10;
                return;
            }
            C5052i0 c5052i0 = (C5052i0) list;
            int m20576b2 = C5086t1.m20576b(this.f18904f);
            if (m20576b2 != 0) {
                if (m20576b2 != 2) {
                    throw C5031b0.m19813d();
                }
                m19870c0 = this.f18901c + m19870c0();
                while (this.f18901c < m19870c0) {
                    c5052i0.m20055e(m19872d0());
                }
            }
            do {
                c5052i0.m20055e(mo19867b());
                if (m19856R()) {
                    return;
                } else {
                    i11 = this.f18901c;
                }
            } while (m19870c0() == this.f18904f);
            this.f18901c = i11;
            return;
            m19878g0(m19870c0);
        }

        /* renamed from: j0 */
        public final void m19884j0() {
            int i10 = this.f18905g;
            this.f18905g = C5086t1.m20577c(C5086t1.m20575a(this.f18904f), 4);
            while (mo19842C() != Integer.MAX_VALUE && mo19848I()) {
            }
            if (this.f18904f != this.f18905g) {
                throw C5031b0.m19816g();
            }
            this.f18905g = i10;
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: k */
        public <T> T mo19885k(Class<T> cls, C5072p c5072p) {
            m19880h0(3);
            return (T) m19859U(C5035c1.m19823a().m19826d(cls), c5072p);
        }

        /* renamed from: k0 */
        public final void m19886k0() {
            int i10 = this.f18903e;
            int i11 = this.f18901c;
            if (i10 - i11 >= 10) {
                byte[] bArr = this.f18900b;
                int i12 = 0;
                while (i12 < 10) {
                    int i13 = i11 + 1;
                    if (bArr[i11] >= 0) {
                        this.f18901c = i13;
                        return;
                    } else {
                        i12++;
                        i11 = i13;
                    }
                }
            }
            m19888l0();
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: l */
        public int mo19887l() {
            m19880h0(0);
            return m19870c0();
        }

        /* renamed from: l0 */
        public final void m19888l0() {
            for (int i10 = 0; i10 < 10; i10++) {
                if (m19857S() >= 0) {
                    return;
                }
            }
            throw C5031b0.m19814e();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p301v0.InterfaceC5044f1
        /* renamed from: m */
        public <K, V> void mo19889m(Map<K, V> map, C5058k0.a<K, V> aVar, C5072p c5072p) {
            m19880h0(2);
            int m19870c0 = m19870c0();
            m19876f0(m19870c0);
            int i10 = this.f18903e;
            this.f18903e = this.f18901c + m19870c0;
            try {
                Object obj = aVar.f19012b;
                Object obj2 = aVar.f19014d;
                while (true) {
                    int mo19842C = mo19842C();
                    if (mo19842C == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    }
                    if (mo19842C == 1) {
                        obj = m19858T(aVar.f19011a, null, null);
                    } else if (mo19842C != 2) {
                        try {
                            if (!mo19848I()) {
                                throw new C5031b0("Unable to parse map entry.");
                                break;
                            }
                        } catch (C5031b0.a unused) {
                            if (!mo19848I()) {
                                throw new C5031b0("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = m19858T(aVar.f19013c, aVar.f19014d.getClass(), c5072p);
                    }
                }
            } finally {
                this.f18903e = i10;
            }
        }

        /* renamed from: m0 */
        public final void m19890m0(int i10) {
            m19876f0(i10);
            if ((i10 & 3) != 0) {
                throw C5031b0.m19816g();
            }
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: n */
        public void mo19891n(List<Long> list) {
            int i10;
            int m19870c0;
            int i11;
            if (!(list instanceof C5052i0)) {
                int m20576b = C5086t1.m20576b(this.f18904f);
                if (m20576b != 0) {
                    if (m20576b != 2) {
                        throw C5031b0.m19813d();
                    }
                    m19870c0 = this.f18901c + m19870c0();
                    while (this.f18901c < m19870c0) {
                        list.add(Long.valueOf(m19872d0()));
                    }
                }
                do {
                    list.add(Long.valueOf(mo19852M()));
                    if (m19856R()) {
                        return;
                    } else {
                        i10 = this.f18901c;
                    }
                } while (m19870c0() == this.f18904f);
                this.f18901c = i10;
                return;
            }
            C5052i0 c5052i0 = (C5052i0) list;
            int m20576b2 = C5086t1.m20576b(this.f18904f);
            if (m20576b2 != 0) {
                if (m20576b2 != 2) {
                    throw C5031b0.m19813d();
                }
                m19870c0 = this.f18901c + m19870c0();
                while (this.f18901c < m19870c0) {
                    c5052i0.m20055e(m19872d0());
                }
            }
            do {
                c5052i0.m20055e(mo19852M());
                if (m19856R()) {
                    return;
                } else {
                    i11 = this.f18901c;
                }
            } while (m19870c0() == this.f18904f);
            this.f18901c = i11;
            return;
            m19878g0(m19870c0);
        }

        /* renamed from: n0 */
        public final void m19892n0(int i10) {
            m19876f0(i10);
            if ((i10 & 7) != 0) {
                throw C5031b0.m19816g();
            }
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: o */
        public void mo19893o(List<Long> list) {
            int i10;
            int i11;
            if (!(list instanceof C5052i0)) {
                int m20576b = C5086t1.m20576b(this.f18904f);
                if (m20576b != 1) {
                    if (m20576b != 2) {
                        throw C5031b0.m19813d();
                    }
                    int m19870c0 = m19870c0();
                    m19892n0(m19870c0);
                    int i12 = this.f18901c + m19870c0;
                    while (this.f18901c < i12) {
                        list.add(Long.valueOf(m19863Y()));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(mo19881i()));
                    if (m19856R()) {
                        return;
                    } else {
                        i10 = this.f18901c;
                    }
                } while (m19870c0() == this.f18904f);
                this.f18901c = i10;
                return;
            }
            C5052i0 c5052i0 = (C5052i0) list;
            int m20576b2 = C5086t1.m20576b(this.f18904f);
            if (m20576b2 != 1) {
                if (m20576b2 != 2) {
                    throw C5031b0.m19813d();
                }
                int m19870c02 = m19870c0();
                m19892n0(m19870c02);
                int i13 = this.f18901c + m19870c02;
                while (this.f18901c < i13) {
                    c5052i0.m20055e(m19863Y());
                }
                return;
            }
            do {
                c5052i0.m20055e(mo19881i());
                if (m19856R()) {
                    return;
                } else {
                    i11 = this.f18901c;
                }
            } while (m19870c0() == this.f18904f);
            this.f18901c = i11;
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: p */
        public <T> T mo19894p(Class<T> cls, C5072p c5072p) {
            m19880h0(2);
            return (T) m19864Z(C5035c1.m19823a().m19826d(cls), c5072p);
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: q */
        public <T> T mo19895q(InterfaceC5047g1<T> interfaceC5047g1, C5072p c5072p) {
            m19880h0(3);
            return (T) m19859U(interfaceC5047g1, c5072p);
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: r */
        public void mo19896r(List<Integer> list) {
            int i10;
            int m19870c0;
            int i11;
            if (!(list instanceof C5098z)) {
                int m20576b = C5086t1.m20576b(this.f18904f);
                if (m20576b != 0) {
                    if (m20576b != 2) {
                        throw C5031b0.m19813d();
                    }
                    m19870c0 = this.f18901c + m19870c0();
                    while (this.f18901c < m19870c0) {
                        list.add(Integer.valueOf(m19870c0()));
                    }
                }
                do {
                    list.add(Integer.valueOf(mo19847H()));
                    if (m19856R()) {
                        return;
                    } else {
                        i10 = this.f18901c;
                    }
                } while (m19870c0() == this.f18904f);
                this.f18901c = i10;
                return;
            }
            C5098z c5098z = (C5098z) list;
            int m20576b2 = C5086t1.m20576b(this.f18904f);
            if (m20576b2 != 0) {
                if (m20576b2 != 2) {
                    throw C5031b0.m19813d();
                }
                m19870c0 = this.f18901c + m19870c0();
                while (this.f18901c < m19870c0) {
                    c5098z.m20731d(m19870c0());
                }
            }
            do {
                c5098z.m20731d(mo19847H());
                if (m19856R()) {
                    return;
                } else {
                    i11 = this.f18901c;
                }
            } while (m19870c0() == this.f18904f);
            this.f18901c = i11;
            return;
            m19878g0(m19870c0);
        }

        @Override // p301v0.InterfaceC5044f1
        public double readDouble() {
            m19880h0(1);
            return Double.longBitsToDouble(m19862X());
        }

        @Override // p301v0.InterfaceC5044f1
        public float readFloat() {
            m19880h0(5);
            return Float.intBitsToFloat(m19860V());
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: s */
        public void mo19897s(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof C5098z)) {
                int m20576b = C5086t1.m20576b(this.f18904f);
                if (m20576b != 0) {
                    if (m20576b != 2) {
                        throw C5031b0.m19813d();
                    }
                    int m19870c0 = this.f18901c + m19870c0();
                    while (this.f18901c < m19870c0) {
                        list.add(Integer.valueOf(m19870c0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(mo19899u()));
                    if (m19856R()) {
                        return;
                    } else {
                        i10 = this.f18901c;
                    }
                } while (m19870c0() == this.f18904f);
                this.f18901c = i10;
                return;
            }
            C5098z c5098z = (C5098z) list;
            int m20576b2 = C5086t1.m20576b(this.f18904f);
            if (m20576b2 != 0) {
                if (m20576b2 != 2) {
                    throw C5031b0.m19813d();
                }
                int m19870c02 = this.f18901c + m19870c0();
                while (this.f18901c < m19870c02) {
                    c5098z.m20731d(m19870c0());
                }
                return;
            }
            do {
                c5098z.m20731d(mo19899u());
                if (m19856R()) {
                    return;
                } else {
                    i11 = this.f18901c;
                }
            } while (m19870c0() == this.f18904f);
            this.f18901c = i11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p301v0.InterfaceC5044f1
        /* renamed from: t */
        public <T> void mo19898t(List<T> list, InterfaceC5047g1<T> interfaceC5047g1, C5072p c5072p) {
            int i10;
            if (C5086t1.m20576b(this.f18904f) != 2) {
                throw C5031b0.m19813d();
            }
            int i11 = this.f18904f;
            do {
                list.add(m19864Z(interfaceC5047g1, c5072p));
                if (m19856R()) {
                    return;
                } else {
                    i10 = this.f18901c;
                }
            } while (m19870c0() == i11);
            this.f18901c = i10;
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: u */
        public int mo19899u() {
            m19880h0(0);
            return m19870c0();
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: v */
        public int mo19900v() {
            return this.f18904f;
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: w */
        public void mo19901w(List<Integer> list) {
            int i10;
            int i11;
            if (!(list instanceof C5098z)) {
                int m20576b = C5086t1.m20576b(this.f18904f);
                if (m20576b == 2) {
                    int m19870c0 = m19870c0();
                    m19890m0(m19870c0);
                    int i12 = this.f18901c + m19870c0;
                    while (this.f18901c < i12) {
                        list.add(Integer.valueOf(m19861W()));
                    }
                    return;
                }
                if (m20576b != 5) {
                    throw C5031b0.m19813d();
                }
                do {
                    list.add(Integer.valueOf(mo19877g()));
                    if (m19856R()) {
                        return;
                    } else {
                        i10 = this.f18901c;
                    }
                } while (m19870c0() == this.f18904f);
                this.f18901c = i10;
                return;
            }
            C5098z c5098z = (C5098z) list;
            int m20576b2 = C5086t1.m20576b(this.f18904f);
            if (m20576b2 == 2) {
                int m19870c02 = m19870c0();
                m19890m0(m19870c02);
                int i13 = this.f18901c + m19870c02;
                while (this.f18901c < i13) {
                    c5098z.m20731d(m19861W());
                }
                return;
            }
            if (m20576b2 != 5) {
                throw C5031b0.m19813d();
            }
            do {
                c5098z.m20731d(mo19877g());
                if (m19856R()) {
                    return;
                } else {
                    i11 = this.f18901c;
                }
            } while (m19870c0() == this.f18904f);
            this.f18901c = i11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p301v0.InterfaceC5044f1
        /* renamed from: x */
        public <T> void mo19902x(List<T> list, InterfaceC5047g1<T> interfaceC5047g1, C5072p c5072p) {
            int i10;
            if (C5086t1.m20576b(this.f18904f) != 3) {
                throw C5031b0.m19813d();
            }
            int i11 = this.f18904f;
            do {
                list.add(m19859U(interfaceC5047g1, c5072p));
                if (m19856R()) {
                    return;
                } else {
                    i10 = this.f18901c;
                }
            } while (m19870c0() == i11);
            this.f18901c = i10;
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: y */
        public int mo19903y() {
            m19880h0(0);
            return AbstractC5051i.m19988b(m19870c0());
        }

        @Override // p301v0.InterfaceC5044f1
        /* renamed from: z */
        public long mo19904z() {
            m19880h0(0);
            return AbstractC5051i.m19989c(m19872d0());
        }
    }

    public AbstractC5039e() {
    }

    public /* synthetic */ AbstractC5039e(a aVar) {
        this();
    }

    /* renamed from: Q */
    public static AbstractC5039e m19839Q(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z10);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
