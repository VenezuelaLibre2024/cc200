package p333x3;

import p333x3.InterfaceC5586z;

/* renamed from: x3.d */
/* loaded from: classes.dex */
public class C5562d implements InterfaceC5586z {

    /* renamed from: a */
    public final long f20870a;

    /* renamed from: b */
    public final long f20871b;

    /* renamed from: c */
    public final int f20872c;

    /* renamed from: d */
    public final long f20873d;

    /* renamed from: e */
    public final int f20874e;

    /* renamed from: f */
    public final long f20875f;

    /* renamed from: g */
    public final boolean f20876g;

    public C5562d(long j10, long j11, int i10, int i11, boolean z10) {
        long m22414g;
        this.f20870a = j10;
        this.f20871b = j11;
        this.f20872c = i11 == -1 ? 1 : i11;
        this.f20874e = i10;
        this.f20876g = z10;
        if (j10 == -1) {
            this.f20873d = -1L;
            m22414g = -9223372036854775807L;
        } else {
            this.f20873d = j10 - j11;
            m22414g = m22414g(j10, j11, i10);
        }
        this.f20875f = m22414g;
    }

    /* renamed from: g */
    public static long m22414g(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / i10;
    }

    /* renamed from: b */
    public final long m22415b(long j10) {
        int i10 = this.f20872c;
        long j11 = (((j10 * this.f20874e) / 8000000) / i10) * i10;
        long j12 = this.f20873d;
        if (j12 != -1) {
            j11 = Math.min(j11, j12 - i10);
        }
        return this.f20871b + Math.max(j11, 0L);
    }

    /* renamed from: c */
    public long m22416c(long j10) {
        return m22414g(j10, this.f20871b, this.f20874e);
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: d */
    public long mo3035d() {
        return this.f20875f;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: f */
    public boolean mo3036f() {
        return this.f20873d != -1 || this.f20876g;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: i */
    public InterfaceC5586z.a mo3037i(long j10) {
        if (this.f20873d == -1 && !this.f20876g) {
            return new InterfaceC5586z.a(new C5557a0(0L, this.f20871b));
        }
        long m22415b = m22415b(j10);
        long m22416c = m22416c(m22415b);
        C5557a0 c5557a0 = new C5557a0(m22416c, m22415b);
        if (this.f20873d != -1 && m22416c < j10) {
            int i10 = this.f20872c;
            if (i10 + m22415b < this.f20870a) {
                long j11 = m22415b + i10;
                return new InterfaceC5586z.a(c5557a0, new C5557a0(m22416c(j11), j11));
            }
        }
        return new InterfaceC5586z.a(c5557a0);
    }
}
