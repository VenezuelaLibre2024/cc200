package p046d4;

import java.util.ArrayDeque;
import p222p5.C4014a;
import p264s3.C4499t2;
import p333x3.InterfaceC5572l;

/* renamed from: d4.a */
/* loaded from: classes.dex */
public final class C1539a implements InterfaceC1541c {

    /* renamed from: a */
    public final byte[] f5632a = new byte[8];

    /* renamed from: b */
    public final ArrayDeque<b> f5633b = new ArrayDeque<>();

    /* renamed from: c */
    public final C1545g f5634c = new C1545g();

    /* renamed from: d */
    public InterfaceC1540b f5635d;

    /* renamed from: e */
    public int f5636e;

    /* renamed from: f */
    public int f5637f;

    /* renamed from: g */
    public long f5638g;

    /* renamed from: d4.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f5639a;

        /* renamed from: b */
        public final long f5640b;

        public b(int i10, long j10) {
            this.f5639a = i10;
            this.f5640b = j10;
        }
    }

    /* renamed from: f */
    public static String m6242f(InterfaceC5572l interfaceC5572l, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        interfaceC5572l.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // p046d4.InterfaceC1541c
    /* renamed from: a */
    public boolean mo6243a(InterfaceC5572l interfaceC5572l) {
        C4014a.m15202h(this.f5635d);
        while (true) {
            b peek = this.f5633b.peek();
            if (peek != null && interfaceC5572l.getPosition() >= peek.f5640b) {
                this.f5635d.mo6250a(this.f5633b.pop().f5639a);
                return true;
            }
            if (this.f5636e == 0) {
                long m6312d = this.f5634c.m6312d(interfaceC5572l, true, false, 4);
                if (m6312d == -2) {
                    m6312d = m6245c(interfaceC5572l);
                }
                if (m6312d == -1) {
                    return false;
                }
                this.f5637f = (int) m6312d;
                this.f5636e = 1;
            }
            if (this.f5636e == 1) {
                this.f5638g = this.f5634c.m6312d(interfaceC5572l, false, true, 8);
                this.f5636e = 2;
            }
            int mo6251b = this.f5635d.mo6251b(this.f5637f);
            if (mo6251b != 0) {
                if (mo6251b == 1) {
                    long position = interfaceC5572l.getPosition();
                    this.f5633b.push(new b(this.f5637f, this.f5638g + position));
                    this.f5635d.mo6256g(this.f5637f, position, this.f5638g);
                    this.f5636e = 0;
                    return true;
                }
                if (mo6251b == 2) {
                    long j10 = this.f5638g;
                    if (j10 <= 8) {
                        this.f5635d.mo6257h(this.f5637f, m6247e(interfaceC5572l, (int) j10));
                        this.f5636e = 0;
                        return true;
                    }
                    throw C4499t2.m17594a("Invalid integer size: " + this.f5638g, null);
                }
                if (mo6251b == 3) {
                    long j11 = this.f5638g;
                    if (j11 <= 2147483647L) {
                        this.f5635d.mo6253d(this.f5637f, m6242f(interfaceC5572l, (int) j11));
                        this.f5636e = 0;
                        return true;
                    }
                    throw C4499t2.m17594a("String element size: " + this.f5638g, null);
                }
                if (mo6251b == 4) {
                    this.f5635d.mo6255f(this.f5637f, (int) this.f5638g, interfaceC5572l);
                    this.f5636e = 0;
                    return true;
                }
                if (mo6251b != 5) {
                    throw C4499t2.m17594a("Invalid element type " + mo6251b, null);
                }
                long j12 = this.f5638g;
                if (j12 == 4 || j12 == 8) {
                    this.f5635d.mo6254e(this.f5637f, m6246d(interfaceC5572l, (int) j12));
                    this.f5636e = 0;
                    return true;
                }
                throw C4499t2.m17594a("Invalid float size: " + this.f5638g, null);
            }
            interfaceC5572l.mo22428m((int) this.f5638g);
            this.f5636e = 0;
        }
    }

    @Override // p046d4.InterfaceC1541c
    /* renamed from: b */
    public void mo6244b(InterfaceC1540b interfaceC1540b) {
        this.f5635d = interfaceC1540b;
    }

    /* renamed from: c */
    public final long m6245c(InterfaceC5572l interfaceC5572l) {
        interfaceC5572l.mo22427l();
        while (true) {
            interfaceC5572l.mo22430p(this.f5632a, 0, 4);
            int m6310c = C1545g.m6310c(this.f5632a[0]);
            if (m6310c != -1 && m6310c <= 4) {
                int m6309a = (int) C1545g.m6309a(this.f5632a, m6310c, false);
                if (this.f5635d.mo6252c(m6309a)) {
                    interfaceC5572l.mo22428m(m6310c);
                    return m6309a;
                }
            }
            interfaceC5572l.mo22428m(1);
        }
    }

    /* renamed from: d */
    public final double m6246d(InterfaceC5572l interfaceC5572l, int i10) {
        return i10 == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(m6247e(interfaceC5572l, i10));
    }

    /* renamed from: e */
    public final long m6247e(InterfaceC5572l interfaceC5572l, int i10) {
        interfaceC5572l.readFully(this.f5632a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f5632a[i11] & 255);
        }
        return j10;
    }

    @Override // p046d4.InterfaceC1541c
    public void reset() {
        this.f5636e = 0;
        this.f5633b.clear();
        this.f5634c.m6313e();
    }
}
