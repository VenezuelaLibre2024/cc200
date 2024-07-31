package p062e4;

import android.util.Pair;
import p221p4.C4010k;
import p222p5.C4041n0;
import p333x3.C5557a0;
import p333x3.InterfaceC5586z;

/* renamed from: e4.c */
/* loaded from: classes.dex */
public final class C1652c implements InterfaceC1656g {

    /* renamed from: a */
    public final long[] f6089a;

    /* renamed from: b */
    public final long[] f6090b;

    /* renamed from: c */
    public final long f6091c;

    public C1652c(long[] jArr, long[] jArr2, long j10) {
        this.f6089a = jArr;
        this.f6090b = jArr2;
        this.f6091c = j10 == -9223372036854775807L ? C4041n0.m15396B0(jArr2[jArr2.length - 1]) : j10;
    }

    /* renamed from: b */
    public static C1652c m6555b(long j10, C4010k c4010k, long j11) {
        int length = c4010k.f14435l.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += c4010k.f14433j + c4010k.f14435l[i12];
            j12 += c4010k.f14434k + c4010k.f14436m[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new C1652c(jArr, jArr2, j11);
    }

    /* renamed from: c */
    public static Pair<Long, Long> m6556c(long j10, long[] jArr, long[] jArr2) {
        Long valueOf;
        Long valueOf2;
        int m15461i = C4041n0.m15461i(jArr, j10, true, true);
        long j11 = jArr[m15461i];
        long j12 = jArr2[m15461i];
        int i10 = m15461i + 1;
        if (i10 == jArr.length) {
            valueOf = Long.valueOf(j11);
            valueOf2 = Long.valueOf(j12);
        } else {
            long j13 = jArr[i10];
            long j14 = jArr2[i10];
            double d10 = j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11);
            valueOf = Long.valueOf(j10);
            valueOf2 = Long.valueOf(((long) (d10 * (j14 - j12))) + j12);
        }
        return Pair.create(valueOf, valueOf2);
    }

    @Override // p062e4.InterfaceC1656g
    /* renamed from: a */
    public long mo6550a(long j10) {
        return C4041n0.m15396B0(((Long) m6556c(j10, this.f6089a, this.f6090b).second).longValue());
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: d */
    public long mo3035d() {
        return this.f6091c;
    }

    @Override // p062e4.InterfaceC1656g
    /* renamed from: e */
    public long mo6551e() {
        return -1L;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: f */
    public boolean mo3036f() {
        return true;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: i */
    public InterfaceC5586z.a mo3037i(long j10) {
        Pair<Long, Long> m6556c = m6556c(C4041n0.m15442Y0(C4041n0.m15479r(j10, 0L, this.f6091c)), this.f6090b, this.f6089a);
        return new InterfaceC5586z.a(new C5557a0(C4041n0.m15396B0(((Long) m6556c.first).longValue()), ((Long) m6556c.second).longValue()));
    }
}
