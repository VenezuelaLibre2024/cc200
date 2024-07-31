package p289u3;

import java.nio.ByteBuffer;
import p222p5.C4015a0;
import p222p5.C4054z;
import p264s3.C4463m1;
import p317w3.C5247m;

/* renamed from: u3.c */
/* loaded from: classes.dex */
public final class C4809c {

    /* renamed from: a */
    public static final int[] f17987a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: u3.c$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f17988a;

        /* renamed from: b */
        public final int f17989b;

        /* renamed from: c */
        public final int f17990c;

        /* renamed from: d */
        public final int f17991d;

        /* renamed from: e */
        public final int f17992e;

        public b(int i10, int i11, int i12, int i13, int i14) {
            this.f17988a = i10;
            this.f17990c = i11;
            this.f17989b = i12;
            this.f17991d = i13;
            this.f17992e = i14;
        }
    }

    /* renamed from: a */
    public static void m18995a(int i10, C4015a0 c4015a0) {
        c4015a0.m15219P(7);
        byte[] m15230e = c4015a0.m15230e();
        m15230e[0] = -84;
        m15230e[1] = 64;
        m15230e[2] = -1;
        m15230e[3] = -1;
        m15230e[4] = (byte) ((i10 >> 16) & 255);
        m15230e[5] = (byte) ((i10 >> 8) & 255);
        m15230e[6] = (byte) (i10 & 255);
    }

    /* renamed from: b */
    public static C4463m1 m18996b(C4015a0 c4015a0, String str, String str2, C5247m c5247m) {
        c4015a0.m15224U(1);
        return new C4463m1.b().m17462U(str).m17474g0("audio/ac4").m17451J(2).m17475h0(((c4015a0.m15210G() & 32) >> 5) == 1 ? 48000 : 44100).m17456O(c5247m).m17465X(str2).m17448G();
    }

    /* renamed from: c */
    public static int m18997c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return m18998d(new C4054z(bArr)).f17992e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        if (r10 != 11) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
    
        if (r10 != 11) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        if (r10 != 8) goto L46;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p289u3.C4809c.b m18998d(p222p5.C4054z r10) {
        /*
            r0 = 16
            int r1 = r10.m15601h(r0)
            int r0 = r10.m15601h(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r10.m15601h(r0)
            r3 = 7
            goto L19
        L18:
            r3 = r2
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r7 = r0
            r0 = 2
            int r1 = r10.m15601h(r0)
            r3 = 3
            if (r1 != r3) goto L2f
            int r4 = m19000f(r10, r0)
            int r1 = r1 + r4
        L2f:
            r4 = r1
            r1 = 10
            int r1 = r10.m15601h(r1)
            boolean r5 = r10.m15600g()
            if (r5 == 0) goto L45
            int r5 = r10.m15601h(r3)
            if (r5 <= 0) goto L45
            r10.m15611r(r0)
        L45:
            boolean r5 = r10.m15600g()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L53
            r9 = r6
            goto L54
        L53:
            r9 = r8
        L54:
            int r10 = r10.m15601h(r2)
            r5 = 0
            if (r9 != r8) goto L65
            r8 = 13
            if (r10 != r8) goto L65
            int[] r0 = p289u3.C4809c.f17987a
            r10 = r0[r10]
            r8 = r10
            goto L91
        L65:
            if (r9 != r6) goto L90
            int[] r6 = p289u3.C4809c.f17987a
            int r8 = r6.length
            if (r10 >= r8) goto L90
            r5 = r6[r10]
            int r1 = r1 % 5
            r6 = 8
            r8 = 1
            if (r1 == r8) goto L8a
            r8 = 11
            if (r1 == r0) goto L85
            if (r1 == r3) goto L8a
            if (r1 == r2) goto L7e
            goto L90
        L7e:
            if (r10 == r3) goto L8e
            if (r10 == r6) goto L8e
            if (r10 != r8) goto L90
            goto L89
        L85:
            if (r10 == r6) goto L8e
            if (r10 != r8) goto L90
        L89:
            goto L8e
        L8a:
            if (r10 == r3) goto L8e
            if (r10 != r6) goto L90
        L8e:
            int r5 = r5 + 1
        L90:
            r8 = r5
        L91:
            u3.c$b r10 = new u3.c$b
            r5 = 2
            r0 = 0
            r3 = r10
            r6 = r9
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p289u3.C4809c.m18998d(p5.z):u3.c$b");
    }

    /* renamed from: e */
    public static int m18999e(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i12 == 65535) {
            i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    /* renamed from: f */
    public static int m19000f(C4054z c4054z, int i10) {
        int i11 = 0;
        while (true) {
            int m15601h = i11 + c4054z.m15601h(i10);
            if (!c4054z.m15600g()) {
                return m15601h;
            }
            i11 = (m15601h + 1) << i10;
        }
    }
}
