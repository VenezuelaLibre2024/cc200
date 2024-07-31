package p333x3;

import java.util.Collections;
import java.util.List;
import p152k4.C3348a;
import p192n4.C3729a;
import p222p5.C4041n0;
import p222p5.C4054z;
import p264s3.C4463m1;

/* renamed from: x3.t */
/* loaded from: classes.dex */
public final class C5580t {

    /* renamed from: a */
    public final int f20939a;

    /* renamed from: b */
    public final int f20940b;

    /* renamed from: c */
    public final int f20941c;

    /* renamed from: d */
    public final int f20942d;

    /* renamed from: e */
    public final int f20943e;

    /* renamed from: f */
    public final int f20944f;

    /* renamed from: g */
    public final int f20945g;

    /* renamed from: h */
    public final int f20946h;

    /* renamed from: i */
    public final int f20947i;

    /* renamed from: j */
    public final long f20948j;

    /* renamed from: k */
    public final a f20949k;

    /* renamed from: l */
    public final C3348a f20950l;

    /* renamed from: x3.t$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final long[] f20951a;

        /* renamed from: b */
        public final long[] f20952b;

        public a(long[] jArr, long[] jArr2) {
            this.f20951a = jArr;
            this.f20952b = jArr2;
        }
    }

    public C5580t(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, C3348a c3348a) {
        this.f20939a = i10;
        this.f20940b = i11;
        this.f20941c = i12;
        this.f20942d = i13;
        this.f20943e = i14;
        this.f20944f = m22489j(i14);
        this.f20945g = i15;
        this.f20946h = i16;
        this.f20947i = m22488e(i16);
        this.f20948j = j10;
        this.f20949k = aVar;
        this.f20950l = c3348a;
    }

    public C5580t(byte[] bArr, int i10) {
        C4054z c4054z = new C4054z(bArr);
        c4054z.m15609p(i10 * 8);
        this.f20939a = c4054z.m15601h(16);
        this.f20940b = c4054z.m15601h(16);
        this.f20941c = c4054z.m15601h(24);
        this.f20942d = c4054z.m15601h(24);
        int m15601h = c4054z.m15601h(20);
        this.f20943e = m15601h;
        this.f20944f = m22489j(m15601h);
        this.f20945g = c4054z.m15601h(3) + 1;
        int m15601h2 = c4054z.m15601h(5) + 1;
        this.f20946h = m15601h2;
        this.f20947i = m22488e(m15601h2);
        this.f20948j = c4054z.m15603j(36);
        this.f20949k = null;
        this.f20950l = null;
    }

    /* renamed from: e */
    public static int m22488e(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: j */
    public static int m22489j(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public C5580t m22490a(List<C3729a> list) {
        return new C5580t(this.f20939a, this.f20940b, this.f20941c, this.f20942d, this.f20943e, this.f20945g, this.f20946h, this.f20948j, this.f20949k, m22496h(new C3348a(list)));
    }

    /* renamed from: b */
    public C5580t m22491b(a aVar) {
        return new C5580t(this.f20939a, this.f20940b, this.f20941c, this.f20942d, this.f20943e, this.f20945g, this.f20946h, this.f20948j, aVar, this.f20950l);
    }

    /* renamed from: c */
    public C5580t m22492c(List<String> list) {
        return new C5580t(this.f20939a, this.f20940b, this.f20941c, this.f20942d, this.f20943e, this.f20945g, this.f20946h, this.f20948j, this.f20949k, m22496h(C5565e0.m22440c(list)));
    }

    /* renamed from: d */
    public long m22493d() {
        long j10;
        long j11;
        int i10 = this.f20942d;
        if (i10 > 0) {
            j10 = (i10 + this.f20941c) / 2;
            j11 = 1;
        } else {
            int i11 = this.f20939a;
            j10 = ((((i11 != this.f20940b || i11 <= 0) ? 4096L : i11) * this.f20945g) * this.f20946h) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    /* renamed from: f */
    public long m22494f() {
        long j10 = this.f20948j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.f20943e;
    }

    /* renamed from: g */
    public C4463m1 m22495g(byte[] bArr, C3348a c3348a) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f20942d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new C4463m1.b().m17474g0("audio/flac").m17466Y(i10).m17451J(this.f20945g).m17475h0(this.f20943e).m17463V(Collections.singletonList(bArr)).m17467Z(m22496h(c3348a)).m17448G();
    }

    /* renamed from: h */
    public C3348a m22496h(C3348a c3348a) {
        C3348a c3348a2 = this.f20950l;
        return c3348a2 == null ? c3348a : c3348a2.m12411b(c3348a);
    }

    /* renamed from: i */
    public long m22497i(long j10) {
        return C4041n0.m15479r((j10 * this.f20943e) / 1000000, 0L, this.f20948j - 1);
    }
}
