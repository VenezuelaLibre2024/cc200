package p123i4;

import android.util.Pair;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p264s3.C4499t2;
import p333x3.InterfaceC5572l;

/* renamed from: i4.d */
/* loaded from: classes.dex */
public final class C2595d {

    /* renamed from: i4.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f10188a;

        /* renamed from: b */
        public final long f10189b;

        public a(int i10, long j10) {
            this.f10188a = i10;
            this.f10189b = j10;
        }

        /* renamed from: a */
        public static a m10379a(InterfaceC5572l interfaceC5572l, C4015a0 c4015a0) {
            interfaceC5572l.mo22430p(c4015a0.m15230e(), 0, 8);
            c4015a0.m15223T(0);
            return new a(c4015a0.m15241p(), c4015a0.m15248w());
        }
    }

    /* renamed from: a */
    public static boolean m10374a(InterfaceC5572l interfaceC5572l) {
        C4015a0 c4015a0 = new C4015a0(8);
        int i10 = a.m10379a(interfaceC5572l, c4015a0).f10188a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        interfaceC5572l.mo22430p(c4015a0.m15230e(), 0, 4);
        c4015a0.m15223T(0);
        int m15241p = c4015a0.m15241p();
        if (m15241p == 1463899717) {
            return true;
        }
        C4046r.m15523c("WavHeaderReader", "Unsupported form type: " + m15241p);
        return false;
    }

    /* renamed from: b */
    public static C2594c m10375b(InterfaceC5572l interfaceC5572l) {
        byte[] bArr;
        C4015a0 c4015a0 = new C4015a0(16);
        a m10377d = m10377d(1718449184, interfaceC5572l, c4015a0);
        C4014a.m15200f(m10377d.f10189b >= 16);
        interfaceC5572l.mo22430p(c4015a0.m15230e(), 0, 16);
        c4015a0.m15223T(0);
        int m15250y = c4015a0.m15250y();
        int m15250y2 = c4015a0.m15250y();
        int m15249x = c4015a0.m15249x();
        int m15249x2 = c4015a0.m15249x();
        int m15250y3 = c4015a0.m15250y();
        int m15250y4 = c4015a0.m15250y();
        int i10 = ((int) m10377d.f10189b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            interfaceC5572l.mo22430p(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = C4041n0.f14518f;
        }
        interfaceC5572l.mo22428m((int) (interfaceC5572l.mo3030f() - interfaceC5572l.getPosition()));
        return new C2594c(m15250y, m15250y2, m15249x, m15249x2, m15250y3, m15250y4, bArr);
    }

    /* renamed from: c */
    public static long m10376c(InterfaceC5572l interfaceC5572l) {
        C4015a0 c4015a0 = new C4015a0(8);
        a m10379a = a.m10379a(interfaceC5572l, c4015a0);
        if (m10379a.f10188a != 1685272116) {
            interfaceC5572l.mo22427l();
            return -1L;
        }
        interfaceC5572l.mo22425h(8);
        c4015a0.m15223T(0);
        interfaceC5572l.mo22430p(c4015a0.m15230e(), 0, 8);
        long m15246u = c4015a0.m15246u();
        interfaceC5572l.mo22428m(((int) m10379a.f10189b) + 8);
        return m15246u;
    }

    /* renamed from: d */
    public static a m10377d(int i10, InterfaceC5572l interfaceC5572l, C4015a0 c4015a0) {
        while (true) {
            a m10379a = a.m10379a(interfaceC5572l, c4015a0);
            if (m10379a.f10188a == i10) {
                return m10379a;
            }
            C4046r.m15529i("WavHeaderReader", "Ignoring unknown WAV chunk: " + m10379a.f10188a);
            long j10 = m10379a.f10189b + 8;
            if (j10 > 2147483647L) {
                throw C4499t2.m17597d("Chunk is too large (~2GB+) to skip; id: " + m10379a.f10188a);
            }
            interfaceC5572l.mo22428m((int) j10);
        }
    }

    /* renamed from: e */
    public static Pair<Long, Long> m10378e(InterfaceC5572l interfaceC5572l) {
        interfaceC5572l.mo22427l();
        a m10377d = m10377d(1684108385, interfaceC5572l, new C4015a0(8));
        interfaceC5572l.mo22428m(8);
        return Pair.create(Long.valueOf(interfaceC5572l.getPosition()), Long.valueOf(m10377d.f10189b));
    }
}
